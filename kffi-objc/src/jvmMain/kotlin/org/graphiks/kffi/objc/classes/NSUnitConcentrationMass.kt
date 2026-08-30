@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUnitConcentrationMass
 * Superclass: NSDimension
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
open class NSUnitConcentrationMass(override val ptr: MemorySegment) : NSDimension(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUnitConcentrationMass") }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun millimolesPerLiterWithGramsPerMole(gramsPerMole: Double): MemorySegment {
            val sel = ObjCRuntime.sel("millimolesPerLiterWithGramsPerMole:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, gramsPerMole) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun gramsPerLiter(): MemorySegment {
            val sel = ObjCRuntime.sel("gramsPerLiter")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        fun milligramsPerDeciliter(): MemorySegment {
            val sel = ObjCRuntime.sel("milligramsPerDeciliter")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSUnitConcentrationMass_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSUnitConcentrationMass")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
