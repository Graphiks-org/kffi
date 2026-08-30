@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSplitViewDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSplitViewDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitView_canCollapseSubview(splitView: MemorySegment, subview: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:canCollapseSubview:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "NSSplitView no longer supports collapsing sections via double-click. This delegate method is never called.")
    // @optional
    fun splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex(splitView: MemorySegment, subview: MemorySegment, dividerIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:shouldCollapseSubview:forDoubleClickOnDividerAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitView_constrainMinCoordinate_ofSubviewAt(splitView: MemorySegment, proposedMinimumPosition: Double, dividerIndex: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:constrainMinCoordinate:ofSubviewAt:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitView_constrainMaxCoordinate_ofSubviewAt(splitView: MemorySegment, proposedMaximumPosition: Double, dividerIndex: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:constrainMaxCoordinate:ofSubviewAt:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitView_constrainSplitPosition_ofSubviewAt(splitView: MemorySegment, proposedPosition: Double, dividerIndex: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:constrainSplitPosition:ofSubviewAt:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitView_resizeSubviewsWithOldSize(splitView: MemorySegment, oldSize: NSSize): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:resizeSubviewsWithOldSize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun splitView_shouldAdjustSizeOfSubview(splitView: MemorySegment, view: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:shouldAdjustSizeOfSubview:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun splitView_shouldHideDividerAtIndex(splitView: MemorySegment, dividerIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:shouldHideDividerAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun splitView_effectiveRect_forDrawnRect_ofDividerAtIndex(splitView: MemorySegment, proposedEffectiveRect: NSRect, drawnRect: NSRect, dividerIndex: Long): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:effectiveRect:forDrawnRect:ofDividerAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun splitView_additionalEffectiveRectOfDividerAtIndex(splitView: MemorySegment, dividerIndex: Long): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'splitView:additionalEffectiveRectOfDividerAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitViewWillResizeSubviews(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'splitViewWillResizeSubviews:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun splitViewDidResizeSubviews(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'splitViewDidResizeSubviews:' not implemented")

}
