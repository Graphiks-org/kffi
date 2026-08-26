package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAlignmentFeedbackFilter
 * Superclass: NSObject
 */
open class NSAlignmentFeedbackFilter(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAlignmentFeedbackFilter") }

        fun inputEventMask(): NSEventMask {
            val sel = ObjCRuntime.sel("inputEventMask")
            return NSEventMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

    }

    open fun updateWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    open fun updateWithPanRecognizer(panRecognizer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateWithPanRecognizer:")
        ObjCRuntime.msgSend(null, ptr, sel, panRecognizer)
    }

    /** @return id<NSAlignmentFeedbackToken> */
    open fun alignmentFeedbackTokenForMovementInView_previousPoint_alignedPoint_defaultPoint(view: MemorySegment, previousPoint: NSPoint, alignedPoint: NSPoint, defaultPoint: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("alignmentFeedbackTokenForMovementInView:previousPoint:alignedPoint:defaultPoint:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, view, ObjCRuntime.ObjCStructArg(previousPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(alignedPoint.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(defaultPoint.segment, NSPoint.layout)) as MemorySegment
    }

    /** @return id<NSAlignmentFeedbackToken> */
    open fun alignmentFeedbackTokenForHorizontalMovementInView_previousX_alignedX_defaultX(view: MemorySegment, previousX: Double, alignedX: Double, defaultX: Double): MemorySegment {
        val sel = ObjCRuntime.sel("alignmentFeedbackTokenForHorizontalMovementInView:previousX:alignedX:defaultX:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, view, previousX, alignedX, defaultX) as MemorySegment
    }

    /** @return id<NSAlignmentFeedbackToken> */
    open fun alignmentFeedbackTokenForVerticalMovementInView_previousY_alignedY_defaultY(view: MemorySegment, previousY: Double, alignedY: Double, defaultY: Double): MemorySegment {
        val sel = ObjCRuntime.sel("alignmentFeedbackTokenForVerticalMovementInView:previousY:alignedY:defaultY:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, view, previousY, alignedY, defaultY) as MemorySegment
    }

    open fun performFeedback_performanceTime(alignmentFeedbackTokens: MemorySegment, performanceTime: NSHapticFeedbackPerformanceTime): Unit {
        val sel = ObjCRuntime.sel("performFeedback:performanceTime:")
        ObjCRuntime.msgSend(null, ptr, sel, alignmentFeedbackTokens, performanceTime.rawValue)
    }

}
