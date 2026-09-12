@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.CFNumberGetValue
import org.graphiks.kffi.objc.CFNumberType
import org.graphiks.kffi.objc.CFSetGetCount
import org.graphiks.kffi.objc.CFSetGetValues
import org.graphiks.kffi.objc.CFStringCreateWithCString
import org.graphiks.kffi.objc.CFStringGetCString
import org.graphiks.kffi.objc.GCController
import org.graphiks.kffi.objc.IOHIDDeviceGetProperty
import org.graphiks.kffi.objc.IOHIDDeviceGetService
import org.graphiks.kffi.objc.IOHIDManagerActivate
import org.graphiks.kffi.objc.IOHIDManagerCancel
import org.graphiks.kffi.objc.IOHIDManagerCopyDevices
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
import java.util.ArrayDeque
import java.util.LinkedHashMap
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Opaque identity allocated by one [HidManager] for the duration of its session. */
@JvmInline
value class HidDeviceId internal constructor(internal val value: Long)

/** A detached classification of an HID input device. */
enum class HidDeviceKind { Keyboard, Mouse, Touchscreen, Touchpad, Pen, Other }

/** Detached, bounded metadata read from a HID device before it enters the managed inventory. */
data class HidDeviceDescriptor(
    val name: String?,
    val kind: HidDeviceKind,
)

/** Pointer-free HID device projection owned by one [HidManager]. */
data class HidDevice(
    val id: HidDeviceId,
    val descriptor: HidDeviceDescriptor,
)

/** Lifecycle event emitted after [HidManager.devices] has been updated. */
sealed interface HidDeviceLifecycleEvent {
    data class Connected(val device: HidDevice) : HidDeviceLifecycleEvent
    data class Disconnected(val id: HidDeviceId) : HidDeviceLifecycleEvent
}

/** Internal native projection, deliberately never exposed by [HidManager]. */
internal data class HidManagerNativeDevice(
    val nativeIdentity: Long,
    val descriptor: HidDeviceDescriptor,
)

/**
 * Owns asynchronous IOHID discovery for input devices not already managed by GameController.
 *
 * Initial enumeration is completed before lifecycle delivery is enabled to consumers. [close]
 * cancels native delivery before revoking managed callback admission. [isQuiescent] becomes true
 * only after IOKit has delivered its cancel handler, every admitted callback has returned, and
 * the manager plus dispatch queue have been released.
 */
class HidManager private constructor(
    private val callback: ManagedCFunction,
    private val onLifecycle: (HidDeviceLifecycleEvent) -> Unit,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private val managedDevices = LinkedHashMap<Long, HidDevice>()
    private val pending = ArrayDeque<HidDeviceEvent>()
    private val unpublishedInitialNativeIds = mutableSetOf<Long>()
    private val nextId = AtomicLong(1L)
    private lateinit var nativeSession: HidManagerNativeSession
    private var attached = false
    private var initializing = true
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

    /** Immutable snapshot of every currently connected HID input device. */
    val devices: List<HidDevice>
        get() = lock.withLock { managedDevices.values.toList() }

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

    private fun initialize() {
        val initial = nativeSession.initialDevices()
        val lifecycleEvents = lock.withLock {
            initial.forEach(::connectInitial)
            initializing = false
            buildList {
                while (pending.isNotEmpty()) {
                    lifecycle(pending.removeFirst(), suppressUnpublishedInitialDisconnect = true)?.let(::add)
                }
            }
                .also { unpublishedInitialNativeIds.clear() }
        }
        lifecycleEvents.forEach(onLifecycle)
    }

    private fun nativeLifecycle(event: HidDeviceEvent) {
        val lifecycle = lock.withLock {
            if (closed) return
            if (initializing) {
                pending += event
                return
            }
            lifecycle(event)
        }
        lifecycle?.let(onLifecycle)
    }

    private fun deliver(event: HidDeviceEvent) {
        val lifecycle = lock.withLock {
            if (closed) return
            lifecycle(event)
        }
        lifecycle?.let(onLifecycle)
    }

    private fun lifecycle(
        event: HidDeviceEvent,
        suppressUnpublishedInitialDisconnect: Boolean = false,
    ): HidDeviceLifecycleEvent? = when {
        event.connected -> connect(event.registryId)
        else -> disconnect(
            nativeIdentity = event.registryId,
            suppressNotification = suppressUnpublishedInitialDisconnect &&
                unpublishedInitialNativeIds.remove(event.registryId),
        )
    }

    private fun connectInitial(device: HidManagerNativeDevice) {
        if (managedDevices.containsKey(device.nativeIdentity)) return
        managedDevices[device.nativeIdentity] = HidDevice(
            id = nextDeviceId(),
            descriptor = device.descriptor,
        )
        unpublishedInitialNativeIds += device.nativeIdentity
    }

    private fun connect(nativeIdentity: Long): HidDeviceLifecycleEvent? {
        if (managedDevices.containsKey(nativeIdentity)) return null
        val native = nativeSession.device(nativeIdentity) ?: return null
        val device = HidDevice(id = nextDeviceId(), descriptor = native.descriptor)
        managedDevices[nativeIdentity] = device
        return HidDeviceLifecycleEvent.Connected(device)
    }

    private fun disconnect(
        nativeIdentity: Long,
        suppressNotification: Boolean = false,
    ): HidDeviceLifecycleEvent? {
        val device = managedDevices.remove(nativeIdentity) ?: return null
        return HidDeviceLifecycleEvent.Disconnected(device.id).takeUnless { suppressNotification }
    }

    private fun nextDeviceId(): HidDeviceId {
        val value = nextId.getAndIncrement()
        check(value != 0L) { "HID device identity space exhausted" }
        return HidDeviceId(value)
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
        fun create(
            onLifecycle: (HidDeviceLifecycleEvent) -> Unit,
        ): HidManager = create(IOKitHidManagerNative, onLifecycle)

        internal fun create(
            native: HidManagerNative,
            onLifecycle: (HidDeviceLifecycleEvent) -> Unit,
        ): HidManager {
            lateinit var owner: HidManager
            val callback = ManagedCFunctions.hidDeviceLifecycle { event -> owner.nativeLifecycle(event) }
            owner = HidManager(callback, onLifecycle)
            try {
                owner.attach(
                    native.create(
                        callback.hidDeviceLifecycleNativeHandles(),
                        owner::nativeCancellationDelivered,
                    ),
                )
                owner.initialize()
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
    fun initialDevices(): List<HidManagerNativeDevice>

    fun device(nativeIdentity: Long): HidManagerNativeDevice?

    fun cancel()

    fun release()
}

/** Pointer-free policy boundary used before immutable HID events enter managed callbacks. */
internal class HidDeviceDeliveryPolicy(
    private val snapshot: (Long) -> HidManagerNativeDevice?,
    private val isSupportedByGameController: (Long) -> Boolean,
    private val nativeIdentity: (Long) -> Long?,
) {
    private val suppressedRegistryIds = ConcurrentHashMap.newKeySet<Long>()

    fun connected(device: Long): HidManagerNativeDevice? {
        val candidate = snapshot(device) ?: return null
        if (isSupportedByGameController(device)) {
            suppressedRegistryIds += candidate.nativeIdentity
            return null
        }
        suppressedRegistryIds.remove(candidate.nativeIdentity)
        return candidate
    }

    fun disconnected(device: Long): Long? {
        val identity = nativeIdentity(device) ?: return null
        if (suppressedRegistryIds.remove(identity)) return null
        return identity
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

    override fun initialDevices(): List<HidManagerNativeDevice> = HidDispatchQueue.sync(queue) {
        val devices = IOHIDManagerCopyDevices(manager)
        if (devices == MemorySegment.NULL) return@sync emptyList()
        try {
            callbackRoute.initialDevices(devices)
        } finally {
            CFRelease(devices)
        }
    }

    override fun device(nativeIdentity: Long): HidManagerNativeDevice? = callbackRoute.device(nativeIdentity)

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

    fun initialDevices(devices: MemorySegment): List<HidManagerNativeDevice> =
        HidDeviceCallbackRuntime.initialDevices(context, devices)

    fun device(nativeIdentity: Long): HidManagerNativeDevice? =
        HidDeviceCallbackRuntime.device(context, nativeIdentity)
}

private object HidDeviceCallbackRuntime {
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
            val registryId = registration.update(device.address(), connected) ?: return
            registration.deliver(registryId, connected)
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        }
    }

    fun initialDevices(context: MemorySegment, devices: MemorySegment): List<HidManagerNativeDevice> {
        val registration = registrations[context.address()] ?: return emptyList()
        val count = CFSetGetCount(devices)
        if (count <= 0L) return emptyList()
        check(count <= Int.MAX_VALUE) { "HID device inventory exceeds JVM collection capacity" }
        return Arena.ofConfined().use { arena ->
            val values = arena.allocate(ValueLayout.ADDRESS, count)
            CFSetGetValues(devices, values)
            buildList {
                repeat(count.toInt()) { index ->
                    val device = values.get(
                        ValueLayout.ADDRESS,
                        index.toLong() * ValueLayout.ADDRESS.byteSize(),
                    )
                    if (device != MemorySegment.NULL) registration.initial(device.address())?.let(::add)
                }
            }.distinctBy(HidManagerNativeDevice::nativeIdentity)
                .sortedBy(HidManagerNativeDevice::nativeIdentity)
        }
    }

    fun device(context: MemorySegment, nativeIdentity: Long): HidManagerNativeDevice? =
        registrations[context.address()]?.device(nativeIdentity)

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
        snapshot = { device -> HidDeviceMetadata.snapshot(MemorySegment.ofAddress(device), ::registryId) },
        isSupportedByGameController = ::isSupportedByGameController,
        nativeIdentity = ::registryId,
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
        private val devices = ConcurrentHashMap<Long, HidManagerNativeDevice>()

        fun update(device: Long, isConnected: Boolean): Long? = if (isConnected) {
            deliveryPolicy.connected(device)?.also { snapshot ->
                devices[snapshot.nativeIdentity] = snapshot
            }?.nativeIdentity
        } else {
            deliveryPolicy.disconnected(device)?.also(devices::remove)
        }

        fun initial(device: Long): HidManagerNativeDevice? = deliveryPolicy.connected(device)?.also {
            devices[it.nativeIdentity] = it
        }

        fun device(nativeIdentity: Long): HidManagerNativeDevice? = devices[nativeIdentity]

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

private object HidDeviceMetadata {
    private const val GENERIC_DESKTOP_USAGE_PAGE = 0x01
    private const val KEYBOARD_USAGE_PAGE = 0x07
    private const val BUTTON_USAGE_PAGE = 0x09
    private const val CONSUMER_USAGE_PAGE = 0x0C
    private const val DIGITIZER_USAGE_PAGE = 0x0D

    fun snapshot(
        device: MemorySegment,
        nativeIdentity: (Long) -> Long?,
    ): HidManagerNativeDevice? {
        val identity = nativeIdentity(device.address()) ?: return null
        val usagePage = numberProperty(device, "PrimaryUsagePage") ?: return null
        val usage = numberProperty(device, "PrimaryUsage") ?: return null
        val kind = kind(usagePage, usage) ?: return null
        return HidManagerNativeDevice(
            nativeIdentity = identity,
            descriptor = HidDeviceDescriptor(
                name = stringProperty(device, "Product"),
                kind = kind,
            ),
        )
    }

    private fun kind(usagePage: Int, usage: Int): HidDeviceKind? = when (usagePage) {
        GENERIC_DESKTOP_USAGE_PAGE -> when (usage) {
            0x01, 0x02 -> HidDeviceKind.Mouse
            0x04, 0x05 -> HidDeviceKind.Other
            0x06, 0x07 -> HidDeviceKind.Keyboard
            else -> HidDeviceKind.Other
        }

        KEYBOARD_USAGE_PAGE -> HidDeviceKind.Keyboard
        DIGITIZER_USAGE_PAGE -> when (usage) {
            0x02 -> HidDeviceKind.Pen
            0x04 -> HidDeviceKind.Touchscreen
            0x05 -> HidDeviceKind.Touchpad
            else -> HidDeviceKind.Other
        }

        BUTTON_USAGE_PAGE,
        CONSUMER_USAGE_PAGE,
        -> HidDeviceKind.Other

        else -> null
    }

    private fun numberProperty(device: MemorySegment, key: String): Int? = Arena.ofConfined().use { arena ->
        withCfString(arena, key) { propertyKey ->
            val property = IOHIDDeviceGetProperty(device, propertyKey)
            if (property == MemorySegment.NULL) return@withCfString null
            val value = arena.allocate(ValueLayout.JAVA_INT)
            if (CFNumberGetValue(property, CFNumberType.kCFNumberSInt32Type, value).toInt() == 0) {
                null
            } else {
                value.get(ValueLayout.JAVA_INT, 0L)
            }
        }
    }

    private fun stringProperty(device: MemorySegment, key: String): String? = Arena.ofConfined().use { arena ->
        withCfString(arena, key) { propertyKey ->
            val property = IOHIDDeviceGetProperty(device, propertyKey)
            if (property == MemorySegment.NULL) return@withCfString null
            val bytes = arena.allocate(1_024L)
            if (CFStringGetCString(property, bytes, 1_024L, 0x08000100).toInt() == 0) {
                null
            } else {
                bytes.getString(0L)
            }
        }
    }

    private inline fun <T> withCfString(
        arena: Arena,
        value: String,
        action: (MemorySegment) -> T,
    ): T {
        val string = CFStringCreateWithCString(
            MemorySegment.NULL,
            arena.allocateFrom(value),
            0x08000100,
        )
        check(string != MemorySegment.NULL) { "Could not create CoreFoundation string for HID property $value" }
        return try {
            action(string)
        } finally {
            CFRelease(string)
        }
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
    private val sync = linker.downcallHandle(
        symbols.find("dispatch_sync").orElseThrow(),
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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

    fun <T> sync(queue: MemorySegment, action: () -> T): T {
        val result = AtomicReference<Result<T>>()
        val block = HidCancelBlockRuntime.create {
            result.set(runCatching(action))
        }
        try {
            sync.invokeExact(queue, block.block)
            return requireNotNull(result.get()) {
                "dispatch_sync returned without executing the HID inventory block"
            }.getOrThrow()
        } finally {
            block.close()
        }
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
