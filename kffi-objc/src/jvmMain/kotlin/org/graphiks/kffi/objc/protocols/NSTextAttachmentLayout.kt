@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextAttachmentLayout
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
interface NSTextAttachmentLayout {
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    fun imageForBounds_attributes_location_textContainer(bounds: CGRect, attributes: MemorySegment, location: MemorySegment, textContainer: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    fun attachmentBoundsForAttributes_location_textContainer_proposedLineFragment_position(attributes: MemorySegment, location: MemorySegment, textContainer: MemorySegment, proposedLineFragment: CGRect, position: CGPoint): CGRect

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
    fun viewProviderForParentView_location_textContainer(parentView: MemorySegment, location: MemorySegment, textContainer: MemorySegment): MemorySegment

}
