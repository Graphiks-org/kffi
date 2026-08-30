@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPressureConfiguration
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
open class NSPressureConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPressureConfiguration") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithPressureBehavior(pressureBehavior: NSPressureBehavior): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPressureBehavior:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pressureBehavior.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun `set`(): Unit {
        val sel = ObjCRuntime.sel("set")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property pressureBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pressureBehavior(): NSPressureBehavior {
        val sel = ObjCRuntime.sel("pressureBehavior")
        return NSPressureBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}
