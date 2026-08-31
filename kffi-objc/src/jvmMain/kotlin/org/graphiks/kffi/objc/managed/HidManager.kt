@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.GCController
import org.graphiks.kffi.objc.IOHIDDeviceConformsTo
import org.graphiks.kffi.objc.IOHIDDeviceGetService
import org.graphiks.kffi.objc.IOHIDManagerActivate
import org.graphiks.kffi.objc.IOHIDManagerCancel
import org.graphiks.kffi.objc.IOHIDManagerCreate
import org.graphiks.kffi.objc.IOHIDManagerRegisterDeviceMatchingCallback
import org.graphiks.kffi.objc.IOHIDManagerRegisterDeviceRemovalCallback
import org.graphiks.kffi.objc.IOHIDManagerSetCancelHandler
import org.graphiks.kffi.objc.IOHIDManagerSetDeviceMatching
import org.graphiks.kffi.objc.IOHIDManagerSetDispatchQueue
import org.graphiks.kffi.objc.IORegistryEntryGetRegistryEntryID
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc._IOHIDDevicePointer
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.SymbolLookup
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * Owns asynchronous IOHID discovery for gamepads not already managed by GameController.
 *
 * [close] cancels native delivery before revoking managed callback admission. [isQuiescent]
 * becomes true only after IOKit has delivered its cancel handler, every admitted callback has
 * returned, and the manager plus dispatch queue have been released.
 */
class HidManager private constructor(
    private val callback: ManagedCFunction,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private lateinit var nativeSession: HidManagerNativeSession
    private var attached = false
    private var closed = false
    private var cancellationDelivered = false
    private var callbackQuiescent = false
    private var releaseStarted = false
    private var quiescent = false

    init {
        callback.onQuiescentForManagedAdapter(::managedCallbackQuiescent)
    }

    val isQuiescent: Boolean
        get() = lock.withLock { quiescent }

    override fun close() {
        val session = lock.withLock {
            if (closed) return
            closed = true
            check(attached) { "HidManager native session is not attached" }
            nativeSession
        }

        var failure: Throwable? = null
        try {
            session.cancel()
        } catch (cancelFailure: Throwable) {
            failure = cancelFailure
        }
        try {
            callback.close()
        } catch (closeFailure: Throwable) {
            failure?.addSuppressed(closeFailure) ?: run { failure = closeFailure }
        }
        failure?.let { throw it }
    }

    private fun attach(session: HidManagerNativeSession) {
        lock.withLock {
            check(!attached) { "HidManager native session is already attached" }
            nativeSession = session
            attached = true
        }
    }

    private fun nativeCancellationDelivered() {
        val session = lock.withLock {
            cancellationDelivered = true
            takeReleaseIfReady()
        }
        session?.let(::releaseAndMarkQuiescent)
    }

    private fun managedCallbackQuiescent() {
        val session = lock.withLock {
            callbackQuiescent = true
            takeReleaseIfReady()
        }
        session?.let(::releaseAndMarkQuiescent)
    }

    private fun takeReleaseIfReady(): HidManagerNativeSession? {
        if (!attached || !cancellationDelivered || !callbackQuiescent || releaseStarted) return null
        releaseStarted = true
        return nativeSession
    }

    private fun releaseAndMarkQuiescent(session: HidManagerNativeSession) {
        try {
            session.release()
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        } finally {
            lock.withLock { quiescent = true }
        }
    }

    companion object {
        fun create(handler: HidDeviceLifecycleHandler): HidManager =
            create(IOKitHidManagerNative, handler)

        internal fun create(
            native: HidManagerNative,
            handler: HidDeviceLifecycleHandler,
        ): HidManager {
            val callback = ManagedCFunctions.hidDeviceLifecycle(handler)
            val owner = HidManager(callback)
            try {
                owner.attach(
                    native.create(
                        callback.hidDeviceLifecycleNativeHandles(),
                        owner::nativeCancellationDelivered,
                    ),
                )
                return owner
            } catch (failure: Throwable) {
                try {
                    callback.close()
                } catch (closeFailure: Throwable) {
                    failure.addSuppressed(closeFailure)
                }
                throw failure
            }
        }
    }
}

internal interface HidManagerNative {
    fun create(
        callbacks: HidDeviceLifecycleNativeHandles,
        cancellationHandler: () -> Unit,
    ): HidManagerNativeSession
}

internal interface HidManagerNativeSession {
    fun cancel()

    fun release()
}

/** Pointer-free policy boundary used before immutable HID events enter managed callbacks. */
internal class HidDeviceDeliveryPolicy(
    private val isGamepad: (Long) -> Boolean,
    private val isSupportedByGameController: (Long) -> Boolean,
    private val registryId: (Long) -> Long?,
) {
    private val suppressedRegistryIds = ConcurrentHashMap.newKeySet<Long>()

    fun snapshot(device: Long, connected: Boolean): Long? {
        if (!isGamepad(device)) return null
        val id = registryId(device) ?: return null
        if (connected) {
            if (isSupportedByGameController(device)) {
                suppressedRegistryIds += id
                return null
            }
            suppressedRegistryIds.remove(id)
            return id
        }
        if (suppressedRegistryIds.remove(id)) return null
        return if (isSupportedByGameController(device)) null else id
    }
}

private object IOKitHidManagerNative : HidManagerNative {
    override fun create(
        callbacks: HidDeviceLifecycleNativeHandles,
        cancellationHandler: () -> Unit,
    ): HidManagerNativeSession {
        val manager = IOHIDManagerCreate(MemorySegment.NULL, 0)
        check(manager != MemorySegment.NULL) { "IOHIDManagerCreate returned null" }

        var queue = MemorySegment.NULL
        var callbackRoute: HidDeviceCallbackRoute? = null
        var cancelBlock: HidCancelBlock? = null
        try {
            queue = HidDispatchQueue.create()
            callbackRoute = HidDeviceCallbackRuntime.register(callbacks)
            cancelBlock = HidCancelBlockRuntime.create(cancellationHandler)

            IOHIDManagerSetDeviceMatching(manager, MemorySegment.NULL)
            IOHIDManagerRegisterDeviceMatchingCallback(
                manager,
                HidDeviceCallbackRuntime.connectedCallback,
                callbackRoute.context,
            )
            IOHIDManagerRegisterDeviceRemovalCallback(
                manager,
                HidDeviceCallbackRuntime.disconnectedCallback,
                callbackRoute.context,
            )
            IOHIDManagerSetDispatchQueue(manager, queue)
            IOHIDManagerSetCancelHandler(manager, cancelBlock.block)
            cancelBlock.releaseOwnedCopy()
            IOHIDManagerActivate(manager)

            return IOKitHidManagerSession(manager, queue, callbackRoute, cancelBlock)
        } catch (failure: Throwable) {
            callbackRoute?.close()
            cancelBlock?.close()
            if (queue != MemorySegment.NULL) HidDispatchQueue.release(queue)
            CFRelease(manager)
            throw failure
        }
    }
}

private class IOKitHidManagerSession(
    private val manager: MemorySegment,
    private val queue: MemorySegment,
    private val callbackRoute: HidDeviceCallbackRoute,
    private val cancelBlock: HidCancelBlock,
) : HidManagerNativeSession {
    private val cancelled = AtomicBoolean()
    private val released = AtomicBoolean()

    override fun cancel() {
        if (cancelled.compareAndSet(false, true)) IOHIDManagerCancel(manager)
    }

    override fun release() {
        if (!released.compareAndSet(false, true)) return
        var failure: Throwable? = null
        failure = captureHidFailure(failure, callbackRoute::close)
        failure = captureHidFailure(failure) { CFRelease(manager) }
        failure = captureHidFailure(failure, cancelBlock::close)
        failure = captureHidFailure(failure) { HidDispatchQueue.release(queue) }
        failure?.let { throw it }
    }
}

private class HidDeviceCallbackRoute(
    val context: MemorySegment,
    private val closeAction: () -> Unit,
) : AutoCloseable {
    private val closed = AtomicBoolean()

    override fun close() {
        if (closed.compareAndSet(false, true)) closeAction()
    }
}

private object HidDeviceCallbackRuntime {
    private const val GENERIC_DESKTOP_USAGE_PAGE = 0x01
    private const val GAMEPAD_USAGE = 0x05
    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val nextToken = AtomicLong(1L)
    private val registrations = ConcurrentHashMap<Long, Registration>()
    private val callbackDescriptor = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
    )

    val connectedCallback: MemorySegment = callback("connected")
    val disconnectedCallback: MemorySegment = callback("disconnected")

    fun register(callbacks: HidDeviceLifecycleNativeHandles): HidDeviceCallbackRoute {
        val token = nextToken.getAndIncrement()
        check(token != 0L) { "HID device callback token space exhausted" }
        val registration = Registration(callbacks, deliveryPolicy())
        check(registrations.putIfAbsent(token, registration) == null) {
            "HID device callback token collision: $token"
        }
        return HidDeviceCallbackRoute(MemorySegment.ofAddress(token)) {
            registrations.remove(token, registration)
        }
    }

    fun deliver(context: MemorySegment, result: Int, device: MemorySegment, connected: Boolean) {
        if (result != 0 || context == MemorySegment.NULL || device == MemorySegment.NULL) return
        val registration = registrations[context.address()] ?: return
        try {
            val registryId = registration.snapshot(device.address(), connected) ?: return
            registration.deliver(registryId, connected)
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        }
    }

    private fun callback(method: String): MemorySegment = linker.upcallStub(
        MethodHandles.lookup().findStatic(
            HidDeviceCallbacks::class.java,
            method,
            callbackDescriptor.toMethodType(),
        ),
        callbackDescriptor,
        arena,
    )

    private fun deliveryPolicy() = HidDeviceDeliveryPolicy(
        isGamepad = { device ->
            IOHIDDeviceConformsTo(
                MemorySegment.ofAddress(device),
                GENERIC_DESKTOP_USAGE_PAGE,
                GAMEPAD_USAGE,
            ).toInt() != 0
        },
        isSupportedByGameController = ::isSupportedByGameController,
        registryId = ::registryId,
    )

    private fun isSupportedByGameController(device: Long): Boolean {
        val selector = ObjCRuntime.sel("supportsHIDDevice:")
        val controllerClass = ObjCRuntime.getClass("GCController")
        val responds = ObjCRuntime.msgSend(
            ValueLayout.JAVA_BOOLEAN,
            controllerClass,
            ObjCRuntime.sel("respondsToSelector:"),
            selector,
        ) as Boolean
        return responds && GCController.supportsHIDDevice(
            _IOHIDDevicePointer(MemorySegment.ofAddress(device)),
        )
    }

    private fun registryId(device: Long): Long? {
        val service = IOHIDDeviceGetService(MemorySegment.ofAddress(device))
        if (service == 0) return null
        return Arena.ofConfined().use { arena ->
            val outId = arena.allocate(ValueLayout.JAVA_LONG)
            if (IORegistryEntryGetRegistryEntryID(service, outId) != 0) return@use null
            outId.get(ValueLayout.JAVA_LONG, 0L)
        }
    }

    private class Registration(
        callbacks: HidDeviceLifecycleNativeHandles,
        private val deliveryPolicy: HidDeviceDeliveryPolicy,
    ) {
        private val connected = callbackHandle(callbacks.connected)
        private val disconnected = callbackHandle(callbacks.disconnected)

        fun snapshot(device: Long, isConnected: Boolean): Long? =
            deliveryPolicy.snapshot(device, isConnected)

        fun deliver(registryId: Long, isConnected: Boolean) {
            val callback = if (isConnected) connected else disconnected
            callback.handle.invokeExact(registryId, callback.userdata)
        }

        private fun callbackHandle(native: ManagedCFunctionNativeHandle): CallbackHandle =
            CallbackHandle(
                handle = linker.downcallHandle(
                    native.callback,
                    FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                ),
                userdata = native.userdata,
            )
    }

    private data class CallbackHandle(
        val handle: java.lang.invoke.MethodHandle,
        val userdata: MemorySegment,
    )
}

private object HidDeviceCallbacks {
    @JvmStatic
    fun connected(
        context: MemorySegment,
        result: Int,
        @Suppress("UNUSED_PARAMETER") sender: MemorySegment,
        device: MemorySegment,
    ) {
        HidDeviceCallbackRuntime.deliver(context, result, device, connected = true)
    }

    @JvmStatic
    fun disconnected(
        context: MemorySegment,
        result: Int,
        @Suppress("UNUSED_PARAMETER") sender: MemorySegment,
        device: MemorySegment,
    ) {
        HidDeviceCallbackRuntime.deliver(context, result, device, connected = false)
    }
}

private class HidCancelBlock(
    val block: MemorySegment,
) : AutoCloseable {
    private val ownedCopy = AtomicBoolean(true)
    private val closed = AtomicBoolean()

    fun releaseOwnedCopy() {
        if (ownedCopy.compareAndSet(true, false)) HidCancelBlockRuntime.release(block)
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        HidCancelBlockRuntime.unregister(block)
        releaseOwnedCopy()
    }
}

private object HidCancelBlockRuntime {
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
    private val trampoline = linker.upcallStub(
        MethodHandles.lookup().findStatic(
            HidCancelBlockCallback::class.java,
            "invoke",
            MethodType.methodType(Void.TYPE, MemorySegment::class.java),
        ),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
        arena,
    )
    private val descriptor = arena.allocate(
        BLOCK_DESCRIPTOR_SIZE,
        ValueLayout.ADDRESS.byteAlignment(),
    ).also { descriptor ->
        descriptor.set(ValueLayout.JAVA_LONG, 0L, 0L)
        descriptor.set(ValueLayout.JAVA_LONG, 8L, BLOCK_LITERAL_SIZE)
        descriptor.set(ValueLayout.ADDRESS, 16L, arena.allocateFrom("v8@?0"))
    }
    private val handlers = ConcurrentHashMap<Long, () -> Unit>()

    fun create(handler: () -> Unit): HidCancelBlock = Arena.ofConfined().use { localArena ->
        val literal = localArena.allocate(BLOCK_LITERAL_SIZE, ValueLayout.ADDRESS.byteAlignment())
        literal.set(ValueLayout.ADDRESS, 0L, concreteStackBlock)
        literal.set(ValueLayout.JAVA_INT, 8L, BLOCK_HAS_SIGNATURE)
        literal.set(ValueLayout.JAVA_INT, 12L, 0)
        literal.set(ValueLayout.ADDRESS, 16L, trampoline)
        literal.set(ValueLayout.ADDRESS, 24L, descriptor)

        val copied = blockCopy.invokeExact(literal) as MemorySegment
        check(copied != MemorySegment.NULL) { "Objective-C Block_copy returned nil" }
        check(handlers.putIfAbsent(copied.address(), handler) == null) {
            "HID cancel block route collision at ${copied.address()}"
        }
        HidCancelBlock(copied)
    }

    fun invoke(block: MemorySegment) {
        val handler = handlers[block.address()] ?: return
        try {
            handler()
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        }
    }

    fun unregister(block: MemorySegment) {
        handlers.remove(block.address())
    }

    fun release(block: MemorySegment) {
        blockRelease.invokeExact(block)
    }
}

private object HidCancelBlockCallback {
    @JvmStatic
    fun invoke(block: MemorySegment) {
        HidCancelBlockRuntime.invoke(block)
    }
}

private object HidDispatchQueue {
    private val arena = Arena.global()
    private val linker = Linker.nativeLinker()
    private val symbols = SymbolLookup.libraryLookup("/usr/lib/libSystem.B.dylib", arena)
    private val create = linker.downcallHandle(
        symbols.find("dispatch_queue_create").orElseThrow(),
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
    )
    private val release = linker.downcallHandle(
        symbols.find("dispatch_release").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
    )
    private val label = arena.allocateFrom("org.graphiks.kffi.hid-manager")

    fun create(): MemorySegment {
        val queue = create.invokeExact(label, MemorySegment.NULL) as MemorySegment
        check(queue != MemorySegment.NULL) { "dispatch_queue_create returned null" }
        return queue
    }

    fun release(queue: MemorySegment) {
        release.invokeExact(queue)
    }
}

private inline fun captureHidFailure(
    current: Throwable?,
    action: () -> Unit,
): Throwable? = try {
    action()
    current
} catch (failure: Throwable) {
    if (current == null) failure else current.also { it.addSuppressed(failure) }
}
