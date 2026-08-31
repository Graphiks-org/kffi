@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: GCPhysicalInputExtents
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
interface GCPhysicalInputExtents {
    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    fun scaledValue(): Double

    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    fun minimumValue(): Double

    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 2, introducedSubminor = -1)
    fun maximumValue(): Double

}
