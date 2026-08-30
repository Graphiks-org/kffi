@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUnitElectricCurrent
 * Superclass: NSDimension
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
open class NSUnitElectricCurrent(override val ptr: MemorySegment) : NSDimension(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUnitElectricCurrent") }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun megaamperes(): MemorySegment {
            val sel = ObjCRuntime.sel("megaamperes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun kiloamperes(): MemorySegment {
            val sel = ObjCRuntime.sel("kiloamperes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun amperes(): MemorySegment {
            val sel = ObjCRuntime.sel("amperes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun milliamperes(): MemorySegment {
            val sel = ObjCRuntime.sel("milliamperes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun microamperes(): MemorySegment {
            val sel = ObjCRuntime.sel("microamperes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSUnitElectricCurrent_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSUnitElectricCurrent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
