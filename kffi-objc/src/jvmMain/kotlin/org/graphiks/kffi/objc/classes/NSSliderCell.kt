package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSliderCell
 * Superclass: NSActionCell
 */
open class NSSliderCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSliderCell") }

        fun prefersTrackingUntilMouseUp(): Boolean {
            val sel = ObjCRuntime.sel("prefersTrackingUntilMouseUp")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    open fun knobRectFlipped(flipped: Boolean): NSRect {
        val sel = ObjCRuntime.sel("knobRectFlipped:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, flipped))
    }

    open fun barRectFlipped(flipped: Boolean): NSRect {
        val sel = ObjCRuntime.sel("barRectFlipped:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, flipped))
    }

    open fun drawKnob(knobRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawKnob:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(knobRect.segment, NSRect.layout))
    }

    open fun drawKnob(): Unit {
        val sel = ObjCRuntime.sel("drawKnob")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun drawBarInside_flipped(rect: NSRect, flipped: Boolean): Unit {
        val sel = ObjCRuntime.sel("drawBarInside:flipped:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), flipped)
    }

    // @property minValue
    open fun minValue(): Double {
        val sel = ObjCRuntime.sel("minValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMinValue(value: Double) {
        val sel = ObjCRuntime.sel("setMinValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxValue
    open fun maxValue(): Double {
        val sel = ObjCRuntime.sel("maxValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMaxValue(value: Double) {
        val sel = ObjCRuntime.sel("setMaxValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property altIncrementValue
    open fun altIncrementValue(): Double {
        val sel = ObjCRuntime.sel("altIncrementValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setAltIncrementValue(value: Double) {
        val sel = ObjCRuntime.sel("setAltIncrementValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sliderType
    open fun sliderType(): NSSliderType {
        val sel = ObjCRuntime.sel("sliderType")
        return NSSliderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setSliderType(value: NSSliderType) {
        val sel = ObjCRuntime.sel("setSliderType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property vertical
    open fun isVertical(): Boolean {
        val sel = ObjCRuntime.sel("isVertical")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setVertical(value: Boolean) {
        val sel = ObjCRuntime.sel("setVertical:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trackRect
    open fun trackRect(): NSRect {
        val sel = ObjCRuntime.sel("trackRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property knobThickness
    open fun knobThickness(): Double {
        val sel = ObjCRuntime.sel("knobThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}

// ── Category: NSSliderCellVerticalGetter on NSSliderCell ─────────────────────────────────────────

// ── Category: NSTickMarkSupport on NSSliderCell ─────────────────────────────────────────

fun NSSliderCell.tickMarkValueAtIndex(index: Long): Double {
    val sel = ObjCRuntime.sel("tickMarkValueAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, index) as Double
}

fun NSSliderCell.rectOfTickMarkAtIndex(index: Long): NSRect {
    val sel = ObjCRuntime.sel("rectOfTickMarkAtIndex:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, index))
}

fun NSSliderCell.indexOfTickMarkAtPoint(point: NSPoint): Long {
    val sel = ObjCRuntime.sel("indexOfTickMarkAtPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
}

fun NSSliderCell.closestTickMarkValueToValue(value: Double): Double {
    val sel = ObjCRuntime.sel("closestTickMarkValueToValue:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, value) as Double
}

fun NSSliderCell.drawTickMarks(): Unit {
    val sel = ObjCRuntime.sel("drawTickMarks")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSSliderCell.numberOfTickMarks(): Long {
    val sel = ObjCRuntime.sel("numberOfTickMarks")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSSliderCell.setNumberOfTickMarks(numberOfTickMarks: Long): Unit {
    val sel = ObjCRuntime.sel("setNumberOfTickMarks:")
    ObjCRuntime.msgSend(null, this.ptr, sel, numberOfTickMarks)
}

fun NSSliderCell.tickMarkPosition(): NSTickMarkPosition {
    val sel = ObjCRuntime.sel("tickMarkPosition")
    return NSTickMarkPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSSliderCell.setTickMarkPosition(tickMarkPosition: NSTickMarkPosition): Unit {
    val sel = ObjCRuntime.sel("setTickMarkPosition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, tickMarkPosition.rawValue)
}

fun NSSliderCell.allowsTickMarkValuesOnly(): Boolean {
    val sel = ObjCRuntime.sel("allowsTickMarkValuesOnly")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSSliderCell.setAllowsTickMarkValuesOnly(allowsTickMarkValuesOnly: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsTickMarkValuesOnly:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsTickMarkValuesOnly)
}

// ── Category: NSDeprecated on NSSliderCell ─────────────────────────────────────────

fun NSSliderCell.setTitleCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

fun NSSliderCell.titleCell(): MemorySegment {
    val sel = ObjCRuntime.sel("titleCell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSSliderCell.setTitleColor(newColor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newColor)
}

fun NSSliderCell.titleColor(): MemorySegment {
    val sel = ObjCRuntime.sel("titleColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSSliderCell.setTitleFont(fontObj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fontObj)
}

fun NSSliderCell.titleFont(): MemorySegment {
    val sel = ObjCRuntime.sel("titleFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSSliderCell.setKnobThickness(thickness: Double): Unit {
    val sel = ObjCRuntime.sel("setKnobThickness:")
    ObjCRuntime.msgSend(null, this.ptr, sel, thickness)
}
