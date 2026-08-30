@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionViewDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSCollectionViewDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_canDragItemsAtIndexPaths_withEvent(collectionView: MemorySegment, indexPaths: MemorySegment, event: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:canDragItemsAtIndexPaths:withEvent:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun collectionView_canDragItemsAtIndexes_withEvent(collectionView: MemorySegment, indexes: MemorySegment, event: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:canDragItemsAtIndexes:withEvent:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use -collectionView:pasteboardWriterForItemAtIndexPath: instead")
    // @optional
    fun collectionView_writeItemsAtIndexPaths_toPasteboard(collectionView: MemorySegment, indexPaths: MemorySegment, pasteboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:writeItemsAtIndexPaths:toPasteboard:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use -collectionView:pasteboardWriterForItemAtIndexPath: instead")
    // @optional
    fun collectionView_writeItemsAtIndexes_toPasteboard(collectionView: MemorySegment, indexes: MemorySegment, pasteboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:writeItemsAtIndexes:toPasteboard:' not implemented")

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    // @optional
    fun collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexPaths(collectionView: MemorySegment, dropURL: MemorySegment, indexPaths: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:namesOfPromisedFilesDroppedAtDestination:forDraggedItemsAtIndexPaths:' not implemented")

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    // @optional
    fun collectionView_namesOfPromisedFilesDroppedAtDestination_forDraggedItemsAtIndexes(collectionView: MemorySegment, dropURL: MemorySegment, indexes: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:namesOfPromisedFilesDroppedAtDestination:forDraggedItemsAtIndexes:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_draggingImageForItemsAtIndexPaths_withEvent_offset(collectionView: MemorySegment, indexPaths: MemorySegment, event: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:draggingImageForItemsAtIndexPaths:withEvent:offset:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun collectionView_draggingImageForItemsAtIndexes_withEvent_offset(collectionView: MemorySegment, indexes: MemorySegment, event: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:draggingImageForItemsAtIndexes:withEvent:offset:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_validateDrop_proposedIndexPath_dropOperation(collectionView: MemorySegment, draggingInfo: MemorySegment, proposedDropIndexPath: MemorySegment, proposedDropOperation: MemorySegment): NSDragOperation =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:validateDrop:proposedIndexPath:dropOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun collectionView_validateDrop_proposedIndex_dropOperation(collectionView: MemorySegment, draggingInfo: MemorySegment, proposedDropIndex: MemorySegment, proposedDropOperation: MemorySegment): NSDragOperation =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:validateDrop:proposedIndex:dropOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_acceptDrop_indexPath_dropOperation(collectionView: MemorySegment, draggingInfo: MemorySegment, indexPath: MemorySegment, dropOperation: NSCollectionViewDropOperation): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:acceptDrop:indexPath:dropOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun collectionView_acceptDrop_index_dropOperation(collectionView: MemorySegment, draggingInfo: MemorySegment, index: Long, dropOperation: NSCollectionViewDropOperation): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:acceptDrop:index:dropOperation:' not implemented")

    /** @return id<NSPasteboardWriting> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_pasteboardWriterForItemAtIndexPath(collectionView: MemorySegment, indexPath: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:pasteboardWriterForItemAtIndexPath:' not implemented")

    /** @return id<NSPasteboardWriting> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_pasteboardWriterForItemAtIndex(collectionView: MemorySegment, index: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:pasteboardWriterForItemAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexPaths(collectionView: MemorySegment, session: MemorySegment, screenPoint: NSPoint, indexPaths: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:draggingSession:willBeginAtPoint:forItemsAtIndexPaths:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_draggingSession_willBeginAtPoint_forItemsAtIndexes(collectionView: MemorySegment, session: MemorySegment, screenPoint: NSPoint, indexes: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:draggingSession:willBeginAtPoint:forItemsAtIndexes:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_draggingSession_endedAtPoint_dragOperation(collectionView: MemorySegment, session: MemorySegment, screenPoint: NSPoint, operation: NSDragOperation): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:draggingSession:endedAtPoint:dragOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_updateDraggingItemsForDrag(collectionView: MemorySegment, draggingInfo: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:updateDraggingItemsForDrag:' not implemented")

    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_shouldChangeItemsAtIndexPaths_toHighlightState(collectionView: MemorySegment, indexPaths: MemorySegment, highlightState: NSCollectionViewItemHighlightState): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:shouldChangeItemsAtIndexPaths:toHighlightState:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_didChangeItemsAtIndexPaths_toHighlightState(collectionView: MemorySegment, indexPaths: MemorySegment, highlightState: NSCollectionViewItemHighlightState): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:didChangeItemsAtIndexPaths:toHighlightState:' not implemented")

    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_shouldSelectItemsAtIndexPaths(collectionView: MemorySegment, indexPaths: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:shouldSelectItemsAtIndexPaths:' not implemented")

    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_shouldDeselectItemsAtIndexPaths(collectionView: MemorySegment, indexPaths: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:shouldDeselectItemsAtIndexPaths:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_didSelectItemsAtIndexPaths(collectionView: MemorySegment, indexPaths: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:didSelectItemsAtIndexPaths:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_didDeselectItemsAtIndexPaths(collectionView: MemorySegment, indexPaths: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:didDeselectItemsAtIndexPaths:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_willDisplayItem_forRepresentedObjectAtIndexPath(collectionView: MemorySegment, item: MemorySegment, indexPath: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:willDisplayItem:forRepresentedObjectAtIndexPath:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_willDisplaySupplementaryView_forElementKind_atIndexPath(collectionView: MemorySegment, view: MemorySegment, elementKind: MemorySegment, indexPath: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_didEndDisplayingItem_forRepresentedObjectAtIndexPath(collectionView: MemorySegment, item: MemorySegment, indexPath: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:didEndDisplayingItem:forRepresentedObjectAtIndexPath:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_didEndDisplayingSupplementaryView_forElementOfKind_atIndexPath(collectionView: MemorySegment, view: MemorySegment, elementKind: MemorySegment, indexPath: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun collectionView_transitionLayoutForOldLayout_newLayout(collectionView: MemorySegment, fromLayout: MemorySegment, toLayout: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:transitionLayoutForOldLayout:newLayout:' not implemented")

}
