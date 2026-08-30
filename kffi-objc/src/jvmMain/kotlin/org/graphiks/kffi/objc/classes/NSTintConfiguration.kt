@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTintConfiguration
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
open class NSTintConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTintConfiguration") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun tintConfigurationWithPreferredColor(color: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tintConfigurationWithPreferredColor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, color) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun tintConfigurationWithFixedColor(color: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tintConfigurationWithFixedColor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, color) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun defaultTintConfiguration(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultTintConfiguration")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun monochromeTintConfiguration(): MemorySegment {
            val sel = ObjCRuntime.sel("monochromeTintConfiguration")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property baseTintColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun baseTintColor(): MemorySegment {
        val sel = ObjCRuntime.sel("baseTintColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property equivalentContentTintColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun equivalentContentTintColor(): MemorySegment {
        val sel = ObjCRuntime.sel("equivalentContentTintColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property adaptsToUserAccentColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun adaptsToUserAccentColor(): Boolean {
        val sel = ObjCRuntime.sel("adaptsToUserAccentColor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSTintConfiguration.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSTintConfiguration.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTintConfiguration.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTintConfiguration_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTintConfiguration")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
