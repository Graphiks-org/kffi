@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLayoutXAxisAnchor
 * Superclass: NSLayoutAnchor
 */
@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSLayoutXAxisAnchor(override val ptr: MemorySegment) : NSLayoutAnchor(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLayoutXAxisAnchor") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun anchorWithOffsetToAnchor(otherAnchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("anchorWithOffsetToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, otherAnchor) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun constraintEqualToSystemSpacingAfterAnchor_multiplier(anchor: MemorySegment, multiplier: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintEqualToSystemSpacingAfterAnchor:multiplier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, multiplier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun constraintGreaterThanOrEqualToSystemSpacingAfterAnchor_multiplier(anchor: MemorySegment, multiplier: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintGreaterThanOrEqualToSystemSpacingAfterAnchor:multiplier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, multiplier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun constraintLessThanOrEqualToSystemSpacingAfterAnchor_multiplier(anchor: MemorySegment, multiplier: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintLessThanOrEqualToSystemSpacingAfterAnchor:multiplier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, multiplier) as MemorySegment
    }

}
