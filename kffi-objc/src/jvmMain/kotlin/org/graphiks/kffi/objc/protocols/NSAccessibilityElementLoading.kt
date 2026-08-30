@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityElementLoading
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
interface NSAccessibilityElementLoading {
    /** @return id<NSAccessibilityElement> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityElementWithToken(token: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityRangeInTargetElementWithToken(token: MemorySegment): NSRange =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityRangeInTargetElementWithToken:' not implemented")

}
