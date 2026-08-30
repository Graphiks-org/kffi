@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScroller
 * Superclass: NSControl
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSScroller(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSScroller") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun scrollerWidthForControlSize_scrollerStyle(controlSize: NSControlSize, scrollerStyle: NSScrollerStyle): Double {
            val sel = ObjCRuntime.sel("scrollerWidthForControlSize:scrollerStyle:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel, controlSize.rawValue, scrollerStyle.rawValue) as Double
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun isCompatibleWithOverlayScrollers(): Boolean {
            val sel = ObjCRuntime.sel("isCompatibleWithOverlayScrollers")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun preferredScrollerStyle(): NSScrollerStyle {
            val sel = ObjCRuntime.sel("preferredScrollerStyle")
            return NSScrollerStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rectForPart(partCode: NSScrollerPart): NSRect {
        val sel = ObjCRuntime.sel("rectForPart:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, partCode.rawValue))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkSpaceForParts(): Unit {
        val sel = ObjCRuntime.sel("checkSpaceForParts")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawKnob(): Unit {
        val sel = ObjCRuntime.sel("drawKnob")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawKnobSlotInRect_highlight(slotRect: NSRect, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("drawKnobSlotInRect:highlight:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(slotRect.segment, NSRect.layout), flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun testPart(point: NSPoint): NSScrollerPart {
        val sel = ObjCRuntime.sel("testPart:")
        return NSScrollerPart(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trackKnob(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("trackKnob:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    // @property scrollerStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun scrollerStyle(): NSScrollerStyle {
        val sel = ObjCRuntime.sel("scrollerStyle")
        return NSScrollerStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setScrollerStyle(value: NSScrollerStyle) {
        val sel = ObjCRuntime.sel("setScrollerStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property knobStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun knobStyle(): NSScrollerKnobStyle {
        val sel = ObjCRuntime.sel("knobStyle")
        return NSScrollerKnobStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setKnobStyle(value: NSScrollerKnobStyle) {
        val sel = ObjCRuntime.sel("setKnobStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property usableParts
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usableParts(): NSUsableScrollerParts {
        val sel = ObjCRuntime.sel("usableParts")
        return NSUsableScrollerParts(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property controlSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun controlSize(): NSControlSize {
        val sel = ObjCRuntime.sel("controlSize")
        return NSControlSize(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setControlSize(value: NSControlSize) {
        val sel = ObjCRuntime.sel("setControlSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property hitPart
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hitPart(): NSScrollerPart {
        val sel = ObjCRuntime.sel("hitPart")
        return NSScrollerPart(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property knobProportion
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun knobProportion(): Double {
        val sel = ObjCRuntime.sel("knobProportion")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKnobProportion(value: Double) {
        val sel = ObjCRuntime.sel("setKnobProportion:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSScroller ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSScroller.setFloatValue_knobProportion(value: Float, proportion: Double): Unit {
    val sel = ObjCRuntime.sel("setFloatValue:knobProportion:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, proportion)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Has had no effect since 10.7")
fun NSScroller.highlight(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("highlight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Not invoked since 10.7")
fun NSScroller.trackScrollButtons(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("trackScrollButtons:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Not invoked on any macOS version")
fun NSScroller.drawParts(): Unit {
    val sel = ObjCRuntime.sel("drawParts")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Scrollers don't have arrows as of 10.7")
fun NSScroller.drawArrow_highlight(whichArrow: NSScrollerArrow, flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("drawArrow:highlight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, whichArrow.rawValue, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Has had no effect since 10.7")
fun NSScroller.arrowsPosition(): NSScrollArrowPosition {
    val sel = ObjCRuntime.sel("arrowsPosition")
    return NSScrollArrowPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Has had no effect since 10.7")
fun NSScroller.setArrowsPosition(arrowsPosition: NSScrollArrowPosition): Unit {
    val sel = ObjCRuntime.sel("setArrowsPosition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, arrowsPosition.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Has had no effect since 10.7")
fun NSScroller.controlTint(): NSControlTint {
    val sel = ObjCRuntime.sel("controlTint")
    return NSControlTint(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Has had no effect since 10.7")
fun NSScroller.setControlTint(controlTint: NSControlTint): Unit {
    val sel = ObjCRuntime.sel("setControlTint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, controlTint.rawValue)
}

// Class method: +[NSScroller scrollerWidthForControlSize:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use +scrollerWidthForControlSize:scrollerStyle: instead")
fun NSScroller_scrollerWidthForControlSize(controlSize: NSControlSize): Double {
    val sel = ObjCRuntime.sel("scrollerWidthForControlSize:")
    val cls = ObjCRuntime.getClass("NSScroller")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, cls, sel, controlSize.rawValue) as Double
}

// Class method: +[NSScroller scrollerWidth]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use +scrollerWidthForControlSize:scrollerStyle: instead")
fun NSScroller_scrollerWidth(): Double {
    val sel = ObjCRuntime.sel("scrollerWidth")
    val cls = ObjCRuntime.getClass("NSScroller")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, cls, sel) as Double
}
