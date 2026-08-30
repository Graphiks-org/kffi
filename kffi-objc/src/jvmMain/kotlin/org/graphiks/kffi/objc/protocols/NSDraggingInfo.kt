@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSDraggingInfo
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSDraggingInfo {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun slideDraggedImageTo(screenPoint: NSPoint): Unit

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    fun namesOfPromisedFilesDroppedAtDestination(dropDestination: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: NSDraggingItemEnumerationOptions, view: MemorySegment, classArray: MemorySegment, searchOptions: MemorySegment, block: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun resetSpringLoading(): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingDestinationWindow(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingSourceOperationMask(): NSDragOperation

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingLocation(): NSPoint

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggedImageLocation(): NSPoint

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDraggingItem objects instead")
    fun draggedImage(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingPasteboard(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingSource(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingSequenceNumber(): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun draggingFormation(): NSDraggingFormation

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun setDraggingFormation(draggingFormation: NSDraggingFormation): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun animatesToDestination(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun setAnimatesToDestination(animatesToDestination: Boolean): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun numberOfValidItemsForDrop(): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun setNumberOfValidItemsForDrop(numberOfValidItemsForDrop: Long): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun springLoadingHighlight(): NSSpringLoadingHighlight

}
