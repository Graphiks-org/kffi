@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSpringLoadingDestination
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSpringLoadingDestination {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun springLoadingActivated_draggingInfo(activated: Boolean, draggingInfo: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun springLoadingHighlightChanged(draggingInfo: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun springLoadingEntered(draggingInfo: MemorySegment): NSSpringLoadingOptions =
        throw UnsupportedOperationException("Optional ObjC method 'springLoadingEntered:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun springLoadingUpdated(draggingInfo: MemorySegment): NSSpringLoadingOptions =
        throw UnsupportedOperationException("Optional ObjC method 'springLoadingUpdated:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun springLoadingExited(draggingInfo: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'springLoadingExited:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun draggingEnded(draggingInfo: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'draggingEnded:' not implemented")

}
