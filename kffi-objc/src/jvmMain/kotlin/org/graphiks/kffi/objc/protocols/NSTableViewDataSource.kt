@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTableViewDataSource
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTableViewDataSource {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun numberOfRowsInTableView(tableView: MemorySegment): Long =
        throw UnsupportedOperationException("Optional ObjC method 'numberOfRowsInTableView:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_objectValueForTableColumn_row(tableView: MemorySegment, tableColumn: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:objectValueForTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_setObjectValue_forTableColumn_row(tableView: MemorySegment, `object`: MemorySegment, tableColumn: MemorySegment, row: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:setObjectValue:forTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_sortDescriptorsDidChange(tableView: MemorySegment, oldDescriptors: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:sortDescriptorsDidChange:' not implemented")

    /** @return id<NSPasteboardWriting> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_pasteboardWriterForRow(tableView: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:pasteboardWriterForRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_draggingSession_willBeginAtPoint_forRowIndexes(tableView: MemorySegment, session: MemorySegment, screenPoint: NSPoint, rowIndexes: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:draggingSession:willBeginAtPoint:forRowIndexes:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_draggingSession_endedAtPoint_operation(tableView: MemorySegment, session: MemorySegment, screenPoint: NSPoint, operation: NSDragOperation): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:draggingSession:endedAtPoint:operation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_updateDraggingItemsForDrag(tableView: MemorySegment, draggingInfo: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:updateDraggingItemsForDrag:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Use -tableView:pasteboardWriterForRow: instead")
    // @optional
    fun tableView_writeRowsWithIndexes_toPasteboard(tableView: MemorySegment, rowIndexes: MemorySegment, pboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:writeRowsWithIndexes:toPasteboard:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_validateDrop_proposedRow_proposedDropOperation(tableView: MemorySegment, info: MemorySegment, row: Long, dropOperation: NSTableViewDropOperation): NSDragOperation =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:validateDrop:proposedRow:proposedDropOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_acceptDrop_row_dropOperation(tableView: MemorySegment, info: MemorySegment, row: Long, dropOperation: NSTableViewDropOperation): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:acceptDrop:row:dropOperation:' not implemented")

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    // @optional
    fun tableView_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes(tableView: MemorySegment, dropDestination: MemorySegment, indexSet: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:namesOfPromisedFilesDroppedAtDestination:forDraggedRowsWithIndexes:' not implemented")

}
