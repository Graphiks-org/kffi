@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityColor
 */
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
interface NSAccessibilityColor {
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    fun accessibilityName(): MemorySegment

}
