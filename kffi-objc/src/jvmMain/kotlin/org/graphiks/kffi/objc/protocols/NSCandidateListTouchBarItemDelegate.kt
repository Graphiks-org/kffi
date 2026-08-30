@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCandidateListTouchBarItemDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
interface NSCandidateListTouchBarItemDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun candidateListTouchBarItem_beginSelectingCandidateAtIndex(anItem: MemorySegment, index: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'candidateListTouchBarItem:beginSelectingCandidateAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun candidateListTouchBarItem_changeSelectionFromCandidateAtIndex_toIndex(anItem: MemorySegment, previousIndex: Long, index: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'candidateListTouchBarItem:changeSelectionFromCandidateAtIndex:toIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun candidateListTouchBarItem_endSelectingCandidateAtIndex(anItem: MemorySegment, index: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'candidateListTouchBarItem:endSelectingCandidateAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun candidateListTouchBarItem_changedCandidateListVisibility(anItem: MemorySegment, isVisible: Boolean): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'candidateListTouchBarItem:changedCandidateListVisibility:' not implemented")

}
