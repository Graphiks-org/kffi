@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStepperCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSStepperCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSStepperCell") }

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

    // @property increment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun increment(): Double {
        val sel = ObjCRuntime.sel("increment")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIncrement(value: Double) {
        val sel = ObjCRuntime.sel("setIncrement:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property valueWraps
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun valueWraps(): Boolean {
        val sel = ObjCRuntime.sel("valueWraps")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setValueWraps(value: Boolean) {
        val sel = ObjCRuntime.sel("setValueWraps:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autorepeat
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autorepeat(): Boolean {
        val sel = ObjCRuntime.sel("autorepeat")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutorepeat(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutorepeat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
