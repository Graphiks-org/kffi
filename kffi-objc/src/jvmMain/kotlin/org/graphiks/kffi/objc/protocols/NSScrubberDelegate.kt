@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSScrubberDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSScrubberDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun scrubber_didSelectItemAtIndex(scrubber: MemorySegment, selectedIndex: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrubber:didSelectItemAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun scrubber_didHighlightItemAtIndex(scrubber: MemorySegment, highlightedIndex: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrubber:didHighlightItemAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun scrubber_didChangeVisibleRange(scrubber: MemorySegment, visibleRange: NSRange): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrubber:didChangeVisibleRange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun didBeginInteractingWithScrubber(scrubber: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'didBeginInteractingWithScrubber:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun didFinishInteractingWithScrubber(scrubber: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'didFinishInteractingWithScrubber:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun didCancelInteractingWithScrubber(scrubber: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'didCancelInteractingWithScrubber:' not implemented")

}
