@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: CALayoutManager
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
interface CALayoutManager {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    // @optional
    fun preferredSizeOfLayer(layer: MemorySegment): CGSize =
        throw UnsupportedOperationException("Optional ObjC method 'preferredSizeOfLayer:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    // @optional
    fun invalidateLayoutOfLayer(layer: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'invalidateLayoutOfLayer:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    // @optional
    fun layoutSublayersOfLayer(layer: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'layoutSublayersOfLayer:' not implemented")

}
