@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSInputServerMouseTracker
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSInputServerMouseTracker {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    fun mouseDownOnCharacterIndex_atCoordinate_withModifier_client(index: Long, point: NSPoint, flags: Long, sender: MemorySegment): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    fun mouseDraggedOnCharacterIndex_atCoordinate_withModifier_client(index: Long, point: NSPoint, flags: Long, sender: MemorySegment): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    fun mouseUpOnCharacterIndex_atCoordinate_withModifier_client(index: Long, point: NSPoint, flags: Long, sender: MemorySegment): Unit

}
