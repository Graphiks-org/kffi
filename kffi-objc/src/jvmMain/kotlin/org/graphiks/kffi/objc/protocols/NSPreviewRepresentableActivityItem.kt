@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPreviewRepresentableActivityItem
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
interface NSPreviewRepresentableActivityItem {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun item(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun title(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'title' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun imageProvider(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'imageProvider' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun iconProvider(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'iconProvider' not implemented")

}
