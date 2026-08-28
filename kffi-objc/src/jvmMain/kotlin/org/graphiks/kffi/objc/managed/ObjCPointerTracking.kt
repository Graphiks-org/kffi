package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSTrackingArea
import org.graphiks.kffi.objc.NSTrackingAreaOptions
import org.graphiks.kffi.objc.NSView
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.addTrackingArea
import org.graphiks.kffi.objc.acceptsMouseMovedEvents
import org.graphiks.kffi.objc.removeTrackingArea
import org.graphiks.kffi.objc.setAcceptsMouseMovedEvents
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean

/**
 * An idempotent, peer-local AppKit pointer-tracking installation.
 *
 * Closing the owner removes its private `NSTrackingArea`, releases the ownership retained by the
 * managed layer, and releases its window's mouse-moved-events lease. The native area is
 * intentionally not exposed: callers keep using their existing [NSView] and [NSWindow] wrappers.
 */
class ObjCPointerTracking internal constructor(
    private val view: ObjCStrongRef<NSView>,
    private val window: ObjCStrongRef<NSWindow>,
    private val trackingArea: NSTrackingArea,
) : AutoCloseable {
    private val closed = AtomicBoolean()

    override fun close() {
        if (closed.get()) return
        requireAppKitMainThread()
        if (!closed.compareAndSet(false, true)) return

        var failure: Throwable? = null
        fun cleanup(action: () -> Unit) {
            try {
                action()
            } catch (cause: Throwable) {
                if (failure == null) {
                    failure = cause
                } else {
                    requireNotNull(failure).addSuppressed(cause)
                }
            }
        }

        cleanup { view.value.removeTrackingArea(trackingArea.ptr) }
        cleanup { ObjCManagedRuntime.release(trackingArea.ptr) }
        cleanup { MouseMovedEventLeases.release(window.value) }
        cleanup { window.close() }
        cleanup { view.close() }
        failure?.let { throw it }
    }
}

/**
 * Installs the fixed AppKit tracking policy required for pointer input on this view.
 *
 * The policy observes movement and enter/exit notifications inside the visible rect while the
 * window is key, and keeps tracking enabled while dragging. It intentionally omits cursor-update,
 * global, and arbitrary caller-selected options so the managed API remains peer-local and opaque.
 *
 * This function and the returned owner's first [AutoCloseable.close] call must run on AppKit's
 * native main thread. Multiple owners may share [window]; mouse-moved events are enabled once and
 * the exact pre-install value is restored only after the final owner closes.
 */
fun NSView.installPointerTracking(window: NSWindow): ObjCPointerTracking {
    requireAppKitMainThread()
    require(this.window().address() == window.ptr.address()) {
        "AppKit pointer tracking requires the view to belong to the supplied window"
    }
    val retainedView = retainStrong()
    val retainedWindow = try {
        window.retainStrong()
    } catch (failure: Throwable) {
        retainedView.close()
        throw failure
    }
    var area: NSTrackingArea? = null
    var attached = false
    var windowLease = false

    try {
        area = newPointerTrackingArea(this)
        addTrackingArea(area.ptr)
        attached = true
        MouseMovedEventLeases.acquire(window)
        windowLease = true
        return ObjCPointerTracking(retainedView, retainedWindow, area)
    } catch (failure: Throwable) {
        var cleanupFailure: Throwable? = null
        fun rollback(action: () -> Unit) {
            try {
                action()
            } catch (cause: Throwable) {
                cleanupFailure = cleanupFailure?.also { it.addSuppressed(cause) } ?: cause
            }
        }

        if (windowLease) rollback { MouseMovedEventLeases.release(window) }
        if (attached) rollback { removeTrackingArea(requireNotNull(area).ptr) }
        area?.let { rollback { ObjCManagedRuntime.release(it.ptr) } }
        rollback { retainedWindow.close() }
        rollback { retainedView.close() }
        cleanupFailure?.let(failure::addSuppressed)
        throw failure
    }
}

private fun newPointerTrackingArea(view: NSView): NSTrackingArea {
    val allocated = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass("NSTrackingArea"),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment
    check(allocated != MemorySegment.NULL) { "NSTrackingArea allocation failed" }
    val initialized = try {
        NSTrackingArea(allocated).initWithRect_options_owner_userInfo(
            rect = view.bounds(),
            options = pointerTrackingOptions,
            owner = view.ptr,
            userInfo = MemorySegment.NULL,
        )
    } catch (failure: Throwable) {
        ObjCManagedRuntime.release(allocated)
        throw failure
    }
    check(initialized != MemorySegment.NULL) { "NSTrackingArea initialization failed" }
    return NSTrackingArea(initialized)
}

private val pointerTrackingOptions =
    NSTrackingAreaOptions.NSTrackingMouseMoved +
        NSTrackingAreaOptions.NSTrackingMouseEnteredAndExited +
        NSTrackingAreaOptions.NSTrackingActiveInKeyWindow +
        NSTrackingAreaOptions.NSTrackingInVisibleRect +
        NSTrackingAreaOptions.NSTrackingEnabledDuringMouseDrag

private object MouseMovedEventLeases {
    private data class LeaseState(
        val originalValue: Boolean,
        var owners: Int,
    )

    private val states = mutableMapOf<Long, LeaseState>()

    fun acquire(window: NSWindow) {
        val key = window.ptr.address()
        states[key]?.let {
            it.owners += 1
            return
        }

        val originalValue = window.acceptsMouseMovedEvents()
        window.setAcceptsMouseMovedEvents(true)
        states[key] = LeaseState(originalValue = originalValue, owners = 1)
    }

    fun release(window: NSWindow) {
        val key = window.ptr.address()
        val state = requireNotNull(states[key]) {
            "No managed mouse-moved-events lease exists for window $key"
        }
        check(state.owners > 0) { "Managed mouse-moved-events lease count underflow for window $key" }
        state.owners -= 1
        if (state.owners == 0) {
            try {
                window.setAcceptsMouseMovedEvents(state.originalValue)
            } finally {
                states.remove(key, state)
            }
        }
    }
}

private fun requireAppKitMainThread() {
    check(NSThread.isMainThread()) { "AppKit pointer tracking must run on the native main thread" }
}
