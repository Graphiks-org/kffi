@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.CallbackPolicy
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicReference

/** One independently closeable receiver of a shared [ObjCManagedClass]. */
class ObjCManagedInstance private constructor(
    val receiver: NSObject,
    private val registration: CallbackRegistration<ManagedObjCCallback>,
) : AutoCloseable {
    val isClosed: Boolean
        get() = registration.isClosed

    val isQuiescent: Boolean
        get() = registration.isQuiescent

    fun onQuiescent(action: () -> Unit) {
        registration.onQuiescent(action)
    }

    override fun close() {
        registration.close()
    }

    internal companion object {
        fun create(
            nativeClass: MemorySegment,
            router: ObjCMethodRouter,
            onError: CallbackExceptionHandler,
        ): ObjCManagedInstance {
            val registration = CallbackRuntime.register(
                type = ObjCMethodDispatch.callbackType,
                trampoline = requireNotNull(ObjCMethodSignatures.Void.trampoline),
                policy = CallbackPolicy.REPEATING,
                onError = onError,
                callback = ManagedObjCCallback(),
            )
            val ownedReceiver = AtomicReference(MemorySegment.NULL)
            val nativeRoute = AtomicReference<AutoCloseable?>(null)
            registration.onQuiescent {
                nativeRoute.getAndSet(null)?.close()
                val receiver = ownedReceiver.getAndSet(MemorySegment.NULL)
                if (receiver != MemorySegment.NULL) {
                    ObjCManagedInstanceNativeLifetime.release(receiver)
                }
            }

            try {
                val allocated = ObjCRuntime.msgSend(
                    ValueLayout.ADDRESS,
                    nativeClass,
                    ObjCRuntime.sel("alloc"),
                ) as MemorySegment
                check(allocated != MemorySegment.NULL) { "Managed Objective-C receiver allocation failed" }
                ownedReceiver.set(allocated)

                val initialized = ObjCRuntime.msgSend(
                    ValueLayout.ADDRESS,
                    allocated,
                    ObjCRuntime.sel("init"),
                ) as MemorySegment
                ownedReceiver.set(initialized)
                check(initialized != MemorySegment.NULL) { "Managed Objective-C receiver initialization failed" }

                nativeRoute.set(ObjCMethodDispatch.install(initialized, registration, router, onError))
                return ObjCManagedInstance(NSObject(initialized), registration)
            } catch (failure: Throwable) {
                registration.close()
                throw failure
            }
        }
    }
}

internal object ObjCManagedInstanceNativeLifetime {
    private val releaseOverrideForTest = AtomicReference<((MemorySegment) -> Unit)?>(null)

    fun release(receiver: MemorySegment) {
        val override = releaseOverrideForTest.get()
        if (override != null) {
            override(receiver)
        } else {
            ObjCRuntime.msgSend(null, receiver, ObjCRuntime.sel("release"))
        }
    }

    fun installReleaseOverrideForTest(release: (MemorySegment) -> Unit): AutoCloseable {
        check(releaseOverrideForTest.compareAndSet(null, release)) {
            "Managed Objective-C release test override is already installed"
        }
        return AutoCloseable {
            check(releaseOverrideForTest.compareAndSet(release, null)) {
                "Managed Objective-C release test override changed before close"
            }
        }
    }
}
