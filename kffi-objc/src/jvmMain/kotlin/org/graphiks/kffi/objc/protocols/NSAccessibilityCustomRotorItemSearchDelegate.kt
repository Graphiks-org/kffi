@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityCustomRotorItemSearchDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
interface NSAccessibilityCustomRotorItemSearchDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun rotor_resultForSearchParameters(rotor: MemorySegment, searchParameters: MemorySegment): MemorySegment

}
