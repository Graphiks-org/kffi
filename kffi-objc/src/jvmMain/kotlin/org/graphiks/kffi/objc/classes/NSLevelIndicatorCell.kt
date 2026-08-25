package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLevelIndicatorCell
 * Superclass: NSActionCell
 */
open class NSLevelIndicatorCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSLevelIndicatorCell") }

    }

    open fun initWithLevelIndicatorStyle(levelIndicatorStyle: NSLevelIndicatorStyle): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLevelIndicatorStyle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, levelIndicatorStyle.rawValue) as MemorySegment
    }

    open fun rectOfTickMarkAtIndex(index: Long): NSRect {
        val sel = ObjCRuntime.sel("rectOfTickMarkAtIndex:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, index))
    }

    open fun tickMarkValueAtIndex(index: Long): Double {
        val sel = ObjCRuntime.sel("tickMarkValueAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, index) as Double
    }

    // @property levelIndicatorStyle
    open fun levelIndicatorStyle(): NSLevelIndicatorStyle {
        val sel = ObjCRuntime.sel("levelIndicatorStyle")
        return NSLevelIndicatorStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLevelIndicatorStyle(value: NSLevelIndicatorStyle) {
        val sel = ObjCRuntime.sel("setLevelIndicatorStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property warningValue
    open fun warningValue(): Double {
        val sel = ObjCRuntime.sel("warningValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setWarningValue(value: Double) {
        val sel = ObjCRuntime.sel("setWarningValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property criticalValue
    open fun criticalValue(): Double {
        val sel = ObjCRuntime.sel("criticalValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setCriticalValue(value: Double) {
        val sel = ObjCRuntime.sel("setCriticalValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tickMarkPosition
    open fun tickMarkPosition(): NSTickMarkPosition {
        val sel = ObjCRuntime.sel("tickMarkPosition")
        return NSTickMarkPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTickMarkPosition(value: NSTickMarkPosition) {
        val sel = ObjCRuntime.sel("setTickMarkPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property numberOfTickMarks
    open fun numberOfTickMarks(): Long {
        val sel = ObjCRuntime.sel("numberOfTickMarks")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setNumberOfTickMarks(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfTickMarks:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfMajorTickMarks
    open fun numberOfMajorTickMarks(): Long {
        val sel = ObjCRuntime.sel("numberOfMajorTickMarks")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setNumberOfMajorTickMarks(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfMajorTickMarks:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
