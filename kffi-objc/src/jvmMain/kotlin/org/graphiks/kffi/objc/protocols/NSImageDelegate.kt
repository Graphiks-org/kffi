@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSImageDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSImageDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun imageDidNotDraw_inRect(sender: MemorySegment, rect: NSRect): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'imageDidNotDraw:inRect:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "This method is no longer called on 10.4 or later.")
    // @optional
    fun image_willLoadRepresentation(image: MemorySegment, rep: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'image:willLoadRepresentation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "This method is no longer called on 10.4 or later.")
    // @optional
    fun image_didLoadRepresentationHeader(image: MemorySegment, rep: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'image:didLoadRepresentationHeader:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "This method is no longer called on 10.4 or later.")
    // @optional
    fun image_didLoadPartOfRepresentation_withValidRows(image: MemorySegment, rep: MemorySegment, rows: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'image:didLoadPartOfRepresentation:withValidRows:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "This method is no longer called on 10.4 or later.")
    // @optional
    fun image_didLoadRepresentation_withStatus(image: MemorySegment, rep: MemorySegment, status: NSImageLoadStatus): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'image:didLoadRepresentation:withStatus:' not implemented")

}
