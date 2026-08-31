@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CHHapticParameterCurve
 * Superclass: NSObject
 */
open class CHHapticParameterCurve(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("CHHapticParameterCurve") } }

    }

    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithParameterID_controlPoints_relativeTime(parameterID: MemorySegment, controlPoints: MemorySegment, relativeTime: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithParameterID:controlPoints:relativeTime:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, parameterID, controlPoints, relativeTime) as MemorySegment
    }

    // @property parameterID
    open fun parameterID(): MemorySegment {
        val sel = ObjCRuntime.sel("parameterID")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property relativeTime
    open fun relativeTime(): Double {
        val sel = ObjCRuntime.sel("relativeTime")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setRelativeTime(value: Double) {
        val sel = ObjCRuntime.sel("setRelativeTime:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property controlPoints
    /** @return NSArray<CHHapticParameterCurveControlPoint *> * */
    open fun controlPoints(): MemorySegment {
        val sel = ObjCRuntime.sel("controlPoints")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
