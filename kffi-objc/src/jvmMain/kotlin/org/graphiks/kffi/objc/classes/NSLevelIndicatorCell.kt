@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLevelIndicatorCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSLevelIndicatorCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLevelIndicatorCell") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithLevelIndicatorStyle(levelIndicatorStyle: NSLevelIndicatorStyle): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLevelIndicatorStyle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, levelIndicatorStyle.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rectOfTickMarkAtIndex(index: Long): NSRect {
        val sel = ObjCRuntime.sel("rectOfTickMarkAtIndex:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, index))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tickMarkValueAtIndex(index: Long): Double {
        val sel = ObjCRuntime.sel("tickMarkValueAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, index) as Double
    }

    // @property levelIndicatorStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun levelIndicatorStyle(): NSLevelIndicatorStyle {
        val sel = ObjCRuntime.sel("levelIndicatorStyle")
        return NSLevelIndicatorStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLevelIndicatorStyle(value: NSLevelIndicatorStyle) {
        val sel = ObjCRuntime.sel("setLevelIndicatorStyle:")
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

    // @property warningValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun warningValue(): Double {
        val sel = ObjCRuntime.sel("warningValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWarningValue(value: Double) {
        val sel = ObjCRuntime.sel("setWarningValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property criticalValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun criticalValue(): Double {
        val sel = ObjCRuntime.sel("criticalValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCriticalValue(value: Double) {
        val sel = ObjCRuntime.sel("setCriticalValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tickMarkPosition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tickMarkPosition(): NSTickMarkPosition {
        val sel = ObjCRuntime.sel("tickMarkPosition")
        return NSTickMarkPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTickMarkPosition(value: NSTickMarkPosition) {
        val sel = ObjCRuntime.sel("setTickMarkPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property numberOfTickMarks
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfTickMarks(): Long {
        val sel = ObjCRuntime.sel("numberOfTickMarks")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNumberOfTickMarks(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfTickMarks:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfMajorTickMarks
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfMajorTickMarks(): Long {
        val sel = ObjCRuntime.sel("numberOfMajorTickMarks")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNumberOfMajorTickMarks(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfMajorTickMarks:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
