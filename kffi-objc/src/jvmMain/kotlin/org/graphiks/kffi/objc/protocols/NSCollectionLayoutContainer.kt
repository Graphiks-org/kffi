@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionLayoutContainer
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
interface NSCollectionLayoutContainer {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun contentSize(): NSSize

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun effectiveContentSize(): NSSize

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun contentInsets(): NSDirectionalEdgeInsets

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun effectiveContentInsets(): NSDirectionalEdgeInsets

}
