@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.Callback
import org.graphiks.kffi.CallbackPolicy
import org.graphiks.kffi.CallbackRegistration
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackType
import org.graphiks.kffi.NativeAddress
import org.graphiks.kffi.engine.JvmManagedCFunctionBridge
import org.graphiks.kffi.engine.JvmManagedCFunctionRoute
import org.graphiks.kffi.objc.CGDirectDisplayID
import org.graphiks.kffi.objc.CGDisplayChangeSummaryFlags
import org.graphiks.kffi.objc.CGEventType
import java.lang.foreign.MemorySegment
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** A CoreGraphics event borrowed for the duration of one event-tap delivery. */
class BorrowedCGEvent internal constructor(internal val native: MemorySegment)

/** Revocable owner for one of the closed managed C callback shapes. */
interface ManagedCFunction : AutoCloseable

/** Immutable HID lifecycle data, detached from the native device reference. */
data class HidDeviceEvent(val registryId: Long, val connected: Boolean)

fun interface HidDeviceLifecycleHandler {
    fun onDeviceLifecycle(event: HidDeviceEvent)
}

/** Closed managed C callback factories used by KFFI's macOS adapters. */
object ManagedCFunctions {
    fun eventTap(
        handler: (CGEventType, BorrowedCGEvent) -> BorrowedCGEvent,
    ): ManagedCFunction = create(
        kind = ManagedCFunctionKind.EVENT_TAP,
        callbackType = ManagedCFunctionDispatch.eventTapType,
        callback = EventTapCallback(handler),
        trampoline = JvmManagedCFunctionBridge.eventTap,
    )

    fun displayReconfiguration(
        handler: (CGDirectDisplayID, CGDisplayChangeSummaryFlags) -> Unit,
    ): ManagedCFunction = create(
        kind = ManagedCFunctionKind.DISPLAY_RECONFIGURATION,
        callbackType = ManagedCFunctionDispatch.displayReconfigurationType,
        callback = DisplayReconfigurationCallback(handler),
        trampoline = JvmManagedCFunctionBridge.displayReconfiguration,
    )

    fun hidDeviceLifecycle(handler: HidDeviceLifecycleHandler): ManagedCFunction =
        create(
            kind = ManagedCFunctionKind.HID_DEVICE_LIFECYCLE,
            callbackType = ManagedCFunctionDispatch.hidDeviceLifecycleType,
            callback = HidDeviceLifecycleCallback(handler),
            trampoline = JvmManagedCFunctionBridge.hidConnected,
            alternateTrampoline = JvmManagedCFunctionBridge.hidDisconnected,
        )

    private fun <C : Callback> create(
        kind: ManagedCFunctionKind,
        callbackType: CallbackType<C>,
        callback: C,
        trampoline: NativeAddress,
        alternateTrampoline: NativeAddress? = null,
    ): ManagedCFunction {
        val registration = CallbackRuntime.register(
            type = callbackType,
            trampoline = trampoline,
            policy = CallbackPolicy.REPEATING,
            callback = callback,
        )
        val token = requireNotNull(registration.userdata) {
            "Managed C function registration did not allocate routing userdata"
        }
        val state = ManagedCFunctionState(registration)
        try {
            state.attach(
                JvmManagedCFunctionBridge.install(
                    token.rawValue,
                    ManagedCFunctionNativeRoute(kind, token),
                ),
            )
            registration.onQuiescent(state::detach)
            return ManagedCFunctionOwner(
                kind = kind,
                state = state,
                primaryHandle = ManagedCFunctionNativeHandle(
                    callback = trampoline.toMemorySegment(),
                    userdata = token.toMemorySegment(),
                ),
                alternateCallback = alternateTrampoline,
            )
        } catch (failure: Throwable) {
            try {
                registration.close()
            } catch (closeFailure: Throwable) {
                failure.addSuppressed(closeFailure)
            }
            try {
                state.detach()
            } catch (detachFailure: Throwable) {
                failure.addSuppressed(detachFailure)
            }
            throw failure
        }
    }
}

/** Callback and routing userdata consumed only by KFFI's native adapters. */
internal data class ManagedCFunctionNativeHandle(
    val callback: MemorySegment,
    val userdata: MemorySegment,
)

/** The two HID entry points share one callback-runtime route and userdata token. */
internal data class HidDeviceLifecycleNativeHandles(
    val connected: ManagedCFunctionNativeHandle,
    val disconnected: ManagedCFunctionNativeHandle,
)

internal fun ManagedCFunction.eventTapNativeHandle(): ManagedCFunctionNativeHandle =
    owner(ManagedCFunctionKind.EVENT_TAP).primaryHandle

internal fun ManagedCFunction.displayReconfigurationNativeHandle(): ManagedCFunctionNativeHandle =
    owner(ManagedCFunctionKind.DISPLAY_RECONFIGURATION).primaryHandle

internal fun ManagedCFunction.hidDeviceLifecycleNativeHandles(): HidDeviceLifecycleNativeHandles {
    val owner = owner(ManagedCFunctionKind.HID_DEVICE_LIFECYCLE)
    return HidDeviceLifecycleNativeHandles(
        connected = owner.primaryHandle,
        disconnected = ManagedCFunctionNativeHandle(
            callback = requireNotNull(owner.alternateCallback).toMemorySegment(),
            userdata = owner.primaryHandle.userdata,
        ),
    )
}

internal fun ManagedCFunction.isQuiescentForManagedAdapter(): Boolean =
    owner().state.isQuiescent

internal fun ManagedCFunction.onQuiescentForManagedAdapter(action: () -> Unit) {
    owner().state.onQuiescent(action)
}

private fun ManagedCFunction.owner(
    expectedKind: ManagedCFunctionKind? = null,
): ManagedCFunctionOwner {
    val owner = this as? ManagedCFunctionOwner
        ?: error("Managed C function was not created by ManagedCFunctions")
    check(expectedKind == null || owner.kind == expectedKind) {
        "Managed C function has shape ${owner.kind}, expected $expectedKind"
    }
    return owner
}

private enum class ManagedCFunctionKind {
    EVENT_TAP,
    DISPLAY_RECONFIGURATION,
    HID_DEVICE_LIFECYCLE,
}

private class ManagedCFunctionOwner(
    val kind: ManagedCFunctionKind,
    val state: ManagedCFunctionState,
    val primaryHandle: ManagedCFunctionNativeHandle,
    val alternateCallback: NativeAddress? = null,
) : ManagedCFunction {
    private val closeLock = ReentrantLock()
    private var closed = false

    override fun close() {
        closeLock.withLock {
            if (closed) return
            state.close()
            closed = true
        }
    }
}

private class ManagedCFunctionState(
    registration: CallbackRegistration<out Callback>,
) {
    private val registration = AtomicReference<CallbackRegistration<out Callback>?>(registration)
    private val nativeRoute = AtomicReference<AutoCloseable?>(null)

    @Volatile
    var isQuiescent: Boolean = false
        private set

    fun attach(route: AutoCloseable) {
        check(nativeRoute.compareAndSet(null, route)) {
            "Managed C function route is already attached"
        }
    }

    fun close() {
        registration.get()?.close()
    }

    fun onQuiescent(action: () -> Unit) {
        val activeRegistration = registration.get()
        if (activeRegistration == null) {
            action()
        } else {
            activeRegistration.onQuiescent(action)
        }
    }

    fun detach() {
        try {
            nativeRoute.getAndSet(null)?.close()
        } finally {
            registration.set(null)
            isQuiescent = true
        }
    }
}

private class EventTapCallback(
    val handler: (CGEventType, BorrowedCGEvent) -> BorrowedCGEvent,
) : Callback

private class DisplayReconfigurationCallback(
    val handler: (CGDirectDisplayID, CGDisplayChangeSummaryFlags) -> Unit,
) : Callback

private class HidDeviceLifecycleCallback(
    val handler: HidDeviceLifecycleHandler,
) : Callback

private object ManagedCFunctionDispatch {
    val eventTapType = CallbackType<EventTapCallback>(
        canonicalId = "objc-managed-c-event-tap",
        hasRoutingUserdata = true,
    )
    val displayReconfigurationType = CallbackType<DisplayReconfigurationCallback>(
        canonicalId = "objc-managed-c-display-reconfiguration",
        hasRoutingUserdata = true,
    )
    val hidDeviceLifecycleType = CallbackType<HidDeviceLifecycleCallback>(
        canonicalId = "objc-managed-c-hid-device-lifecycle",
        hasRoutingUserdata = true,
    )
}

private class ManagedCFunctionNativeRoute(
    private val kind: ManagedCFunctionKind,
    private val token: NativeAddress,
) : JvmManagedCFunctionRoute {
    override fun dispatchEventTap(type: Int, event: Long): Long {
        check(kind == ManagedCFunctionKind.EVENT_TAP) { "Managed C function is not an event tap" }
        return CallbackRuntime.dispatchSafely(
            ManagedCFunctionDispatch.eventTapType,
            token,
            0L,
        ) { callback ->
            callback.handler(
                CGEventType.fromValue(type.toLong()),
                BorrowedCGEvent(MemorySegment.ofAddress(event)),
            ).native.address()
        }
    }

    override fun dispatchDisplayReconfiguration(display: Int, flags: Int) {
        check(kind == ManagedCFunctionKind.DISPLAY_RECONFIGURATION) {
            "Managed C function is not a display reconfiguration callback"
        }
        CallbackRuntime.dispatchSafely(
            ManagedCFunctionDispatch.displayReconfigurationType,
            token,
        ) { callback ->
            callback.handler(display, CGDisplayChangeSummaryFlags(flags.toUInt().toLong()))
        }
    }

    override fun dispatchHidDeviceLifecycle(registryId: Long, connected: Boolean) {
        check(kind == ManagedCFunctionKind.HID_DEVICE_LIFECYCLE) {
            "Managed C function is not a HID lifecycle callback"
        }
        CallbackRuntime.dispatchSafely(
            ManagedCFunctionDispatch.hidDeviceLifecycleType,
            token,
        ) { callback ->
            callback.handler.onDeviceLifecycle(HidDeviceEvent(registryId, connected))
        }
    }
}

private fun NativeAddress.toMemorySegment(): MemorySegment = MemorySegment.ofAddress(rawValue)
