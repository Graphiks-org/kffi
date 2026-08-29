package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.CGEventCreateScrollWheelEvent2
import org.graphiks.kffi.objc.CGEventField
import org.graphiks.kffi.objc.CGEventSetDoubleValueField
import org.graphiks.kffi.objc.CGEventSetIntegerValueField
import org.graphiks.kffi.objc.CGMomentumScrollPhase
import org.graphiks.kffi.objc.CGScrollEventUnit
import org.graphiks.kffi.objc.CGScrollPhase
import org.graphiks.kffi.objc.NSApplication
import org.graphiks.kffi.objc.NSEvent
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc._CGEventPointer
import org.graphiks.kffi.objc.postEvent_atStart
import java.lang.foreign.MemorySegment
import kotlin.math.roundToInt

/**
 * A scroll-wheel event that can be posted to an AppKit application queue.
 *
 * [unit], [phase], and [momentumPhase] intentionally use CoreGraphics values:
 * AppKit converts them while the event is created. [isContinuous] selects a
 * precise, pixel-style event when true and a discrete event when false.
 */
data class AppKitScrollWheelEvent(
    val unit: CGScrollEventUnit,
    val deltaX: Double,
    val deltaY: Double,
    val phase: CGScrollPhase,
    val momentumPhase: CGMomentumScrollPhase,
    val isContinuous: Boolean,
) {
    init {
        require(deltaX.isFinite()) { "Scroll-wheel deltaX must be finite" }
        require(deltaY.isFinite()) { "Scroll-wheel deltaY must be finite" }
    }
}

/**
 * Creates and appends [event] to this application's AppKit event queue.
 *
 * Call this on the native main thread that owns the AppKit queue. This function
 * guarantees queue insertion and CoreGraphics-to-AppKit conversion only: the
 * resulting application-routed event has no responder target, so it does not
 * guarantee delivery to a particular window or responder.
 *
 * KFFI owns the temporary CoreGraphics event, converts it to an autoreleased
 * `NSEvent`, posts it, and releases the CoreGraphics ownership before this
 * function returns. No native event or ownership handle escapes this call.
 *
 * @throws IllegalStateException if CoreGraphics or AppKit cannot create the event.
 */
fun NSApplication.postScrollWheelEvent(event: AppKitScrollWheelEvent) {
    CoreGraphicsLibrary.ensureLoaded()
    val wheel1 = event.deltaY.roundToInt()
    val wheel2 = event.deltaX.roundToInt()
    val cgEvent = CGEventCreateScrollWheelEvent2(
        MemorySegment.NULL,
        event.unit,
        2,
        wheel1,
        wheel2,
        0,
    )
    check(cgEvent != MemorySegment.NULL) {
        "CoreGraphics could not create a scroll-wheel event"
    }

    try {
        CGEventSetIntegerValueField(
            cgEvent,
            CGEventField.kCGScrollWheelEventScrollPhase,
            event.phase.value,
        )
        CGEventSetIntegerValueField(
            cgEvent,
            CGEventField.kCGScrollWheelEventMomentumPhase,
            event.momentumPhase.value,
        )
        CGEventSetIntegerValueField(
            cgEvent,
            CGEventField.kCGScrollWheelEventIsContinuous,
            if (event.isContinuous) 1L else 0L,
        )
        CGEventSetDoubleValueField(
            cgEvent,
            CGEventField.kCGScrollWheelEventFixedPtDeltaAxis1,
            event.deltaY,
        )
        CGEventSetDoubleValueField(
            cgEvent,
            CGEventField.kCGScrollWheelEventFixedPtDeltaAxis2,
            event.deltaX,
        )
        if (!event.isContinuous) {
            CGEventSetIntegerValueField(
                cgEvent,
                CGEventField.kCGScrollWheelEventPointDeltaAxis1,
                wheel1.toLong(),
            )
            CGEventSetIntegerValueField(
                cgEvent,
                CGEventField.kCGScrollWheelEventPointDeltaAxis2,
                wheel2.toLong(),
            )
        }
        ObjCRuntime.autoreleasePool {
            val nativeEvent = NSEvent.eventWithCGEvent(_CGEventPointer(cgEvent))
            check(nativeEvent != MemorySegment.NULL) {
                "AppKit could not convert the CoreGraphics scroll-wheel event"
            }
            postEvent_atStart(nativeEvent, false)
        }
    } finally {
        CFRelease(cgEvent)
    }
}

private object CoreGraphicsLibrary {
    private val loaded: Unit by lazy {
        System.load("/System/Library/Frameworks/CoreGraphics.framework/CoreGraphics")
    }

    fun ensureLoaded() {
        loaded
    }
}
