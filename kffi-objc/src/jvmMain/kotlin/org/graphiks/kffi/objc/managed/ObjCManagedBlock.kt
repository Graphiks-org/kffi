@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.Callback
import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.CallbackPolicy
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackType
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmManagedObjCBlockRoute
import org.graphiks.kffi.engine.JvmManagedObjCBridge
import org.graphiks.kffi.objc.NSError
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Internal bridge used by framework adapters to assign and clear one typed block property. */
internal fun interface ObjCManagedBlockSetter {
    fun set(block: MemorySegment)
}

/**
 * Revocable owner for one Objective-C block installed by a typed framework adapter.
 *
 * The native pointer remains private to the adapter. Closing first assigns `nil`, then revokes
 * callback admission. Native ownership is released only after every admitted delivery returns.
 */
class ObjCManagedBlock<R> internal constructor(
    internal val setter: ObjCManagedBlockSetter,
    private val registration: CallbackRegistration<ManagedObjCBlockCallback>,
) : AutoCloseable {
    private val closeLock = ReentrantLock()

    @Volatile
    private var closeState = ObjCManagedBlockCloseState.OPEN

    val isClosed: Boolean
        get() = closeState == ObjCManagedBlockCloseState.CLOSED

    val isQuiescent: Boolean
        get() = registration.isQuiescent

    override fun close() {
        closeLock.withLock {
            when (closeState) {
                ObjCManagedBlockCloseState.CLOSED -> return@withLock
                ObjCManagedBlockCloseState.CLOSING -> return@withLock // Reentrant closing call.
                ObjCManagedBlockCloseState.OPEN -> closeState = ObjCManagedBlockCloseState.CLOSING
            }

            var failure: Throwable? = null
            try {
                setter.set(MemorySegment.NULL)
            } catch (clearFailure: Throwable) {
                failure = clearFailure
            }
            try {
                registration.close()
            } catch (closeFailure: Throwable) {
                failure?.addSuppressed(closeFailure) ?: run { failure = closeFailure }
            } finally {
                closeState = ObjCManagedBlockCloseState.CLOSED
            }
            failure?.let { throw it }
        }
    }

    internal companion object {
        fun voidError(
            setter: ObjCManagedBlockSetter,
            onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
            handler: (NSError?) -> Unit,
        ): ObjCManagedBlock<Unit> = create(
            setter,
            ObjCBlockSignatures.VoidError,
            onError,
            VoidErrorBinding(handler),
        )

        fun voidObjectObject(
            setter: ObjCManagedBlockSetter,
            onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
            handler: (NSObject?, NSObject?) -> Unit,
        ): ObjCManagedBlock<Unit> = create(
            setter,
            ObjCBlockSignatures.VoidObjectObject,
            onError,
            VoidObjectObjectBinding(handler),
        )

        fun voidObjectObjectObject(
            setter: ObjCManagedBlockSetter,
            onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
            handler: (NSObject?, NSObject?, NSObject?) -> Unit,
        ): ObjCManagedBlock<Unit> = create(
            setter,
            ObjCBlockSignatures.VoidObjectObjectObject,
            onError,
            VoidObjectObjectObjectBinding(handler),
        )

        fun voidObjectFloatBoolean(
            setter: ObjCManagedBlockSetter,
            onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
            handler: (NSObject?, Float, Boolean) -> Unit,
        ): ObjCManagedBlock<Unit> = create(
            setter,
            ObjCBlockSignatures.VoidObjectFloatBoolean,
            onError,
            VoidObjectFloatBooleanBinding(handler),
        )

        fun voidObjectFloat(
            setter: ObjCManagedBlockSetter,
            onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
            handler: (NSObject?, Float) -> Unit,
        ): ObjCManagedBlock<Unit> = create(
            setter,
            ObjCBlockSignatures.VoidObjectFloat,
            onError,
            VoidObjectFloatBinding(handler),
        )

        fun voidObjectFloatFloat(
            setter: ObjCManagedBlockSetter,
            onError: CallbackExceptionHandler = CallbackExceptionHandler.Default,
            handler: (NSObject?, Float, Float) -> Unit,
        ): ObjCManagedBlock<Unit> = create(
            setter,
            ObjCBlockSignatures.VoidObjectFloatFloat,
            onError,
            VoidObjectFloatFloatBinding(handler),
        )

        private fun create(
            setter: ObjCManagedBlockSetter,
            signature: ObjCBlockSignature,
            onError: CallbackExceptionHandler,
            binding: ObjCManagedBlockBinding,
        ): ObjCManagedBlock<Unit> {
            val registration = CallbackRuntime.register(
                type = ObjCManagedBlockDispatch.callbackType,
                trampoline = signature.trampoline,
                policy = CallbackPolicy.REPEATING,
                onError = onError,
                callback = ManagedObjCBlockCallback(),
            )
            val ownedBlock = AtomicReference(MemorySegment.NULL)
            val nativeRoute = AtomicReference<AutoCloseable?>(null)
            registration.onQuiescent {
                nativeRoute.getAndSet(null)?.close()
                val block = ownedBlock.getAndSet(MemorySegment.NULL)
                if (block != MemorySegment.NULL) ObjCManagedBlockNativeLifetime.release(block)
            }

            try {
                val block = ObjCBlockRuntime.create(signature)
                ownedBlock.set(block)
                val token = requireNotNull(registration.userdata) {
                    "Managed Objective-C block registration did not allocate routing userdata"
                }
                nativeRoute.set(
                    JvmManagedObjCBridge.installBlock(
                        block.address(),
                        ObjCManagedBlockDispatch.NativeRoute(token, binding),
                    ),
                )
                return ObjCManagedBlock<Unit>(setter, registration).also { owner ->
                    try {
                        setter.set(block)
                    } catch (failure: Throwable) {
                        try {
                            owner.close()
                        } catch (closeFailure: Throwable) {
                            failure.addSuppressed(closeFailure)
                        }
                        throw failure
                    }
                }
            } catch (failure: Throwable) {
                registration.close()
                throw failure
            }
        }
    }
}

private enum class ObjCManagedBlockCloseState {
    OPEN,
    CLOSING,
    CLOSED,
}

internal sealed interface ObjCManagedBlockBinding

private class VoidErrorBinding(
    val handler: (NSError?) -> Unit,
) : ObjCManagedBlockBinding

private class VoidObjectObjectBinding(
    val handler: (NSObject?, NSObject?) -> Unit,
) : ObjCManagedBlockBinding

private class VoidObjectObjectObjectBinding(
    val handler: (NSObject?, NSObject?, NSObject?) -> Unit,
) : ObjCManagedBlockBinding

private class VoidObjectFloatBooleanBinding(
    val handler: (NSObject?, Float, Boolean) -> Unit,
) : ObjCManagedBlockBinding

private class VoidObjectFloatBinding(
    val handler: (NSObject?, Float) -> Unit,
) : ObjCManagedBlockBinding

private class VoidObjectFloatFloatBinding(
    val handler: (NSObject?, Float, Float) -> Unit,
) : ObjCManagedBlockBinding

internal class ManagedObjCBlockCallback : Callback

internal object ObjCManagedBlockDispatch {
    private val loaderGeneration = JvmManagedObjCBridge.allocateLoaderGeneration()

    val callbackType = CallbackType<ManagedObjCBlockCallback>(
        canonicalId = "objc-managed-block-$loaderGeneration",
        hasRoutingUserdata = true,
    )

    internal class NativeRoute(
        private val token: NativeAddress,
        private val binding: ObjCManagedBlockBinding,
    ) : JvmManagedObjCBlockRoute {
        override fun dispatchVoidError(block: Long, error: Long) {
            dispatch {
                (binding as VoidErrorBinding).handler(error.toNSErrorOrNull())
            }
        }

        override fun dispatchVoidObjectObject(block: Long, first: Long, second: Long) {
            dispatch {
                (binding as VoidObjectObjectBinding).handler(
                    first.toNSObjectOrNull(),
                    second.toNSObjectOrNull(),
                )
            }
        }

        override fun dispatchVoidObjectObjectObject(
            block: Long,
            first: Long,
            second: Long,
            third: Long,
        ) {
            dispatch {
                (binding as VoidObjectObjectObjectBinding).handler(
                    first.toNSObjectOrNull(),
                    second.toNSObjectOrNull(),
                    third.toNSObjectOrNull(),
                )
            }
        }

        override fun dispatchVoidObjectFloatBoolean(
            block: Long,
            value: Long,
            amount: Float,
            enabled: Boolean,
        ) {
            dispatch {
                (binding as VoidObjectFloatBooleanBinding).handler(
                    value.toNSObjectOrNull(),
                    amount,
                    enabled,
                )
            }
        }

        override fun dispatchVoidObjectFloat(block: Long, value: Long, amount: Float) {
            dispatch {
                (binding as VoidObjectFloatBinding).handler(value.toNSObjectOrNull(), amount)
            }
        }

        override fun dispatchVoidObjectFloatFloat(
            block: Long,
            value: Long,
            first: Float,
            second: Float,
        ) {
            dispatch {
                (binding as VoidObjectFloatFloatBinding).handler(
                    value.toNSObjectOrNull(),
                    first,
                    second,
                )
            }
        }

        private fun dispatch(invoke: () -> Unit) {
            try {
                ObjCRuntime.autoreleasePool {
                    CallbackRuntime.dispatchSafely(callbackType, token) { invoke() }
                }
            } catch (failure: Throwable) {
                CallbackRuntime.reportUnroutedFailure(failure)
            }
        }
    }
}

internal object ObjCManagedBlockNativeLifetime {
    private val releaseObserverForTest = AtomicReference<(() -> Unit)?>(null)

    fun release(block: MemorySegment) {
        try {
            ObjCBlockRuntime.release(block)
        } finally {
            releaseObserverForTest.get()?.invoke()
        }
    }

    fun installReleaseObserverForTest(observer: () -> Unit): AutoCloseable {
        check(releaseObserverForTest.compareAndSet(null, observer)) {
            "Managed Objective-C block release test observer is already installed"
        }
        return AutoCloseable {
            check(releaseObserverForTest.compareAndSet(observer, null)) {
                "Managed Objective-C block release test observer changed before close"
            }
        }
    }
}

private object ObjCBlockRuntime {
    private const val BLOCK_HAS_SIGNATURE = 1 shl 30
    private const val BLOCK_LITERAL_SIZE = 32L
    private const val BLOCK_DESCRIPTOR_SIZE = 24L
    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val symbols = SymbolLookup.libraryLookup("/usr/lib/libSystem.B.dylib", arena)
    private val concreteStackBlock = symbols.find("_NSConcreteStackBlock").orElseThrow()
    private val blockCopy = linker.downcallHandle(
        symbols.find("_Block_copy").orElseThrow(),
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val blockRelease = linker.downcallHandle(
        symbols.find("_Block_release").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )
    private val descriptors = mutableMapOf<String, MemorySegment>()

    fun create(signature: ObjCBlockSignature): MemorySegment = Arena.ofConfined().use { localArena ->
        val literal = localArena.allocate(BLOCK_LITERAL_SIZE, ValueLayout.ADDRESS.byteAlignment())
        literal.set(ValueLayout.ADDRESS, 0L, concreteStackBlock)
        literal.set(ValueLayout.JAVA_INT, 8L, BLOCK_HAS_SIGNATURE)
        literal.set(ValueLayout.JAVA_INT, 12L, 0)
        literal.set(ValueLayout.ADDRESS, 16L, MemorySegment.ofAddress(signature.trampoline.rawValue))
        literal.set(ValueLayout.ADDRESS, 24L, descriptor(signature))

        val copied = blockCopy.invokeExact(literal) as MemorySegment
        check(copied != MemorySegment.NULL) { "Objective-C Block_copy returned nil" }
        copied
    }

    fun release(block: MemorySegment) {
        blockRelease.invokeExact(block)
    }

    private fun descriptor(signature: ObjCBlockSignature): MemorySegment = synchronized(descriptors) {
        descriptors.getOrPut(signature.identity) {
            arena.allocate(BLOCK_DESCRIPTOR_SIZE, ValueLayout.ADDRESS.byteAlignment()).also { descriptor ->
                descriptor.set(ValueLayout.JAVA_LONG, 0L, 0L)
                descriptor.set(ValueLayout.JAVA_LONG, 8L, BLOCK_LITERAL_SIZE)
                descriptor.set(ValueLayout.ADDRESS, 16L, arena.allocateFrom(signature.typeEncoding))
            }
        }
    }
}

private fun Long.toNSObjectOrNull(): NSObject? =
    if (this == 0L) null else NSObject(MemorySegment.ofAddress(this))

private fun Long.toNSErrorOrNull(): NSError? =
    if (this == 0L) null else NSError(MemorySegment.ofAddress(this))
