@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSliderCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSliderCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSliderCell") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun prefersTrackingUntilMouseUp(): Boolean {
            val sel = ObjCRuntime.sel("prefersTrackingUntilMouseUp")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun knobRectFlipped(flipped: Boolean): NSRect {
        val sel = ObjCRuntime.sel("knobRectFlipped:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, flipped))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun barRectFlipped(flipped: Boolean): NSRect {
        val sel = ObjCRuntime.sel("barRectFlipped:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, flipped))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawKnob(knobRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawKnob:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(knobRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawKnob(): Unit {
        val sel = ObjCRuntime.sel("drawKnob")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawBarInside_flipped(rect: NSRect, flipped: Boolean): Unit {
        val sel = ObjCRuntime.sel("drawBarInside:flipped:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), flipped)
    }

    // @property minValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minValue(): Double {
        val sel = ObjCRuntime.sel("minValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinValue(value: Double) {
        val sel = ObjCRuntime.sel("setMinValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxValue(): Double {
        val sel = ObjCRuntime.sel("maxValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxValue(value: Double) {
        val sel = ObjCRuntime.sel("setMaxValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property altIncrementValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun altIncrementValue(): Double {
        val sel = ObjCRuntime.sel("altIncrementValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAltIncrementValue(value: Double) {
        val sel = ObjCRuntime.sel("setAltIncrementValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sliderType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sliderType(): NSSliderType {
        val sel = ObjCRuntime.sel("sliderType")
        return NSSliderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSliderType(value: NSSliderType) {
        val sel = ObjCRuntime.sel("setSliderType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property vertical
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun isVertical(): Boolean {
        val sel = ObjCRuntime.sel("isVertical")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setVertical(value: Boolean) {
        val sel = ObjCRuntime.sel("setVertical:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trackRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trackRect(): NSRect {
        val sel = ObjCRuntime.sel("trackRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property knobThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun knobThickness(): Double {
        val sel = ObjCRuntime.sel("knobThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}

// ── Category: NSSliderCellVerticalGetter on NSSliderCell ─────────────────────────────────────────

// ── Category: NSTickMarkSupport on NSSliderCell ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.tickMarkValueAtIndex(index: Long): Double {
    val sel = ObjCRuntime.sel("tickMarkValueAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, index) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.rectOfTickMarkAtIndex(index: Long): NSRect {
    val sel = ObjCRuntime.sel("rectOfTickMarkAtIndex:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, index))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.indexOfTickMarkAtPoint(point: NSPoint): Long {
    val sel = ObjCRuntime.sel("indexOfTickMarkAtPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.closestTickMarkValueToValue(value: Double): Double {
    val sel = ObjCRuntime.sel("closestTickMarkValueToValue:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, value) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
fun NSSliderCell.drawTickMarks(): Unit {
    val sel = ObjCRuntime.sel("drawTickMarks")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.numberOfTickMarks(): Long {
    val sel = ObjCRuntime.sel("numberOfTickMarks")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.setNumberOfTickMarks(numberOfTickMarks: Long): Unit {
    val sel = ObjCRuntime.sel("setNumberOfTickMarks:")
    ObjCRuntime.msgSend(null, this.ptr, sel, numberOfTickMarks)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.tickMarkPosition(): NSTickMarkPosition {
    val sel = ObjCRuntime.sel("tickMarkPosition")
    return NSTickMarkPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.setTickMarkPosition(tickMarkPosition: NSTickMarkPosition): Unit {
    val sel = ObjCRuntime.sel("setTickMarkPosition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, tickMarkPosition.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.allowsTickMarkValuesOnly(): Boolean {
    val sel = ObjCRuntime.sel("allowsTickMarkValuesOnly")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSliderCell.setAllowsTickMarkValuesOnly(allowsTickMarkValuesOnly: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsTickMarkValuesOnly:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsTickMarkValuesOnly)
}

// ── Category: NSDeprecated on NSSliderCell ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitleCell: had no effect since 10.0")
fun NSSliderCell.setTitleCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-titleCell has returned nil since 10.0")
fun NSSliderCell.titleCell(): MemorySegment {
    val sel = ObjCRuntime.sel("titleCell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitleColor: had no effect since 10.0")
fun NSSliderCell.setTitleColor(newColor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newColor)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-titleColor has returned nil since 10.0")
fun NSSliderCell.titleColor(): MemorySegment {
    val sel = ObjCRuntime.sel("titleColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitleFont: had no effect since 10.0")
fun NSSliderCell.setTitleFont(fontObj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fontObj)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-titleFont has returned nil since 10.0")
fun NSSliderCell.titleFont(): MemorySegment {
    val sel = ObjCRuntime.sel("titleFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-knobThickness has returned 0 since 10.0")
fun NSSliderCell.setKnobThickness(thickness: Double): Unit {
    val sel = ObjCRuntime.sel("setKnobThickness:")
    ObjCRuntime.msgSend(null, this.ptr, sel, thickness)
}
