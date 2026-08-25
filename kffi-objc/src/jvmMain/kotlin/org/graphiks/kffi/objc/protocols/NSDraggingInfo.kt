package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSDraggingInfo
 * Inherits protocols: NSObject
 */
interface NSDraggingInfo {
    fun slideDraggedImageTo(screenPoint: NSPoint): Unit

    /** @return NSArray<NSString *> * */
    fun namesOfPromisedFilesDroppedAtDestination(dropDestination: MemorySegment): MemorySegment

    fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: NSDraggingItemEnumerationOptions, view: MemorySegment, classArray: MemorySegment, searchOptions: MemorySegment, block: MemorySegment): Unit

    fun resetSpringLoading(): Unit

    fun draggingDestinationWindow(): MemorySegment

    fun draggingSourceOperationMask(): NSDragOperation

    fun draggingLocation(): NSPoint

    fun draggedImageLocation(): NSPoint

    fun draggedImage(): MemorySegment

    fun draggingPasteboard(): MemorySegment

    fun draggingSource(): MemorySegment

    fun draggingSequenceNumber(): Long

    fun draggingFormation(): NSDraggingFormation

    fun setDraggingFormation(draggingFormation: NSDraggingFormation): Unit

    fun animatesToDestination(): Boolean

    fun setAnimatesToDestination(animatesToDestination: Boolean): Unit

    fun numberOfValidItemsForDrop(): Long

    fun setNumberOfValidItemsForDrop(numberOfValidItemsForDrop: Long): Unit

    fun springLoadingHighlight(): NSSpringLoadingHighlight

}
