@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionLayoutVisibleItem
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
interface NSCollectionLayoutVisibleItem {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun alpha(): Double

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setAlpha(alpha: Double): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun zIndex(): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setZIndex(zIndex: Long): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun isHidden(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setHidden(hidden: Boolean): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun center(): NSPoint

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setCenter(center: NSPoint): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun name(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun indexPath(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun frame(): NSRect

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun bounds(): NSRect

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun representedElementCategory(): NSCollectionElementCategory

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun representedElementKind(): MemorySegment

}
