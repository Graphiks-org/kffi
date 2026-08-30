@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSlider
 * Superclass: NSControl
 * Protocols: NSAccessibilitySlider
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSlider(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSlider") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun acceptsFirstMouse(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("acceptsFirstMouse:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    // @property sliderType
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun sliderType(): NSSliderType {
        val sel = ObjCRuntime.sel("sliderType")
        return NSSliderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setSliderType(value: NSSliderType) {
        val sel = ObjCRuntime.sel("setSliderType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property neutralValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun neutralValue(): Double {
        val sel = ObjCRuntime.sel("neutralValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setNeutralValue(value: Double) {
        val sel = ObjCRuntime.sel("setNeutralValue:")
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

    // @property knobThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun knobThickness(): Double {
        val sel = ObjCRuntime.sel("knobThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property vertical
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun isVertical(): Boolean {
        val sel = ObjCRuntime.sel("isVertical")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setVertical(value: Boolean) {
        val sel = ObjCRuntime.sel("setVertical:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trackFillColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun trackFillColor(): MemorySegment {
        val sel = ObjCRuntime.sel("trackFillColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setTrackFillColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTrackFillColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tintProminence
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun tintProminence(): NSTintProminence {
        val sel = ObjCRuntime.sel("tintProminence")
        return NSTintProminence(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setTintProminence(value: NSTintProminence) {
        val sel = ObjCRuntime.sel("setTintProminence:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

// ── Category: NSSliderVerticalGetter on NSSlider ─────────────────────────────────────────

// ── Category: NSTickMarkSupport on NSSlider ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.tickMarkValueAtIndex(index: Long): Double {
    val sel = ObjCRuntime.sel("tickMarkValueAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, index) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.rectOfTickMarkAtIndex(index: Long): NSRect {
    val sel = ObjCRuntime.sel("rectOfTickMarkAtIndex:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, index))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.indexOfTickMarkAtPoint(point: NSPoint): Long {
    val sel = ObjCRuntime.sel("indexOfTickMarkAtPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.closestTickMarkValueToValue(value: Double): Double {
    val sel = ObjCRuntime.sel("closestTickMarkValueToValue:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, value) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.numberOfTickMarks(): Long {
    val sel = ObjCRuntime.sel("numberOfTickMarks")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.setNumberOfTickMarks(numberOfTickMarks: Long): Unit {
    val sel = ObjCRuntime.sel("setNumberOfTickMarks:")
    ObjCRuntime.msgSend(null, this.ptr, sel, numberOfTickMarks)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.tickMarkPosition(): NSTickMarkPosition {
    val sel = ObjCRuntime.sel("tickMarkPosition")
    return NSTickMarkPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.setTickMarkPosition(tickMarkPosition: NSTickMarkPosition): Unit {
    val sel = ObjCRuntime.sel("setTickMarkPosition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, tickMarkPosition.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.allowsTickMarkValuesOnly(): Boolean {
    val sel = ObjCRuntime.sel("allowsTickMarkValuesOnly")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSSlider.setAllowsTickMarkValuesOnly(allowsTickMarkValuesOnly: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsTickMarkValuesOnly:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsTickMarkValuesOnly)
}

// ── Category: NSSliderConvenience on NSSlider ─────────────────────────────────────────

// Class method: +[NSSlider sliderWithTarget:action:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSSlider_sliderWithTarget_action(target: MemorySegment, action: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sliderWithTarget:action:")
    val cls = ObjCRuntime.getClass("NSSlider")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, target, action) as MemorySegment
}

// Class method: +[NSSlider sliderWithValue:minValue:maxValue:target:action:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSSlider_sliderWithValue_minValue_maxValue_target_action(value: Double, minValue: Double, maxValue: Double, target: MemorySegment, action: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sliderWithValue:minValue:maxValue:target:action:")
    val cls = ObjCRuntime.getClass("NSSlider")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, value, minValue, maxValue, target, action) as MemorySegment
}

// ── Category: NSSliderDeprecated on NSSlider ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitleCell: had no effect since 10.0")
fun NSSlider.setTitleCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-titleCell has returned nil since 10.0")
fun NSSlider.titleCell(): MemorySegment {
    val sel = ObjCRuntime.sel("titleCell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitleColor: had no effect since 10.0")
fun NSSlider.setTitleColor(newColor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newColor)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-titleColor has returned nil since 10.0")
fun NSSlider.titleColor(): MemorySegment {
    val sel = ObjCRuntime.sel("titleColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitleFont: had no effect since 10.0")
fun NSSlider.setTitleFont(fontObj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fontObj)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-titleFont has returned nil since 10.0")
fun NSSlider.titleFont(): MemorySegment {
    val sel = ObjCRuntime.sel("titleFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-title has returned nil since 10.0")
fun NSSlider.title(): MemorySegment {
    val sel = ObjCRuntime.sel("title")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setTitle: had no effect since 10.0")
fun NSSlider.setTitle(string: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-knobThickness has returned 0 since 10.0")
fun NSSlider.setKnobThickness(thickness: Double): Unit {
    val sel = ObjCRuntime.sel("setKnobThickness:")
    ObjCRuntime.msgSend(null, this.ptr, sel, thickness)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-setImage: had no effect since 10.0")
fun NSSlider.setImage(backgroundImage: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setImage:")
    ObjCRuntime.msgSend(null, this.ptr, sel, backgroundImage)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "-image has returned nil since 10.0")
fun NSSlider.image(): MemorySegment {
    val sel = ObjCRuntime.sel("image")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
