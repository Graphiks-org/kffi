@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSBrowserDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSBrowserDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_numberOfRowsInColumn(sender: MemorySegment, column: Long): Long =
        throw UnsupportedOperationException("Optional ObjC method 'browser:numberOfRowsInColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_createRowsForColumn_inMatrix(sender: MemorySegment, column: Long, matrix: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browser:createRowsForColumn:inMatrix:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_numberOfChildrenOfItem(browser: MemorySegment, item: MemorySegment): Long =
        throw UnsupportedOperationException("Optional ObjC method 'browser:numberOfChildrenOfItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_child_ofItem(browser: MemorySegment, index: Long, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:child:ofItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_isLeafItem(browser: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:isLeafItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_objectValueForItem(browser: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:objectValueForItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_heightOfRow_inColumn(browser: MemorySegment, row: Long, columnIndex: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'browser:heightOfRow:inColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun rootItemForBrowser(browser: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'rootItemForBrowser:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_setObjectValue_forItem(browser: MemorySegment, `object`: MemorySegment, item: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browser:setObjectValue:forItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_shouldEditItem(browser: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:shouldEditItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_willDisplayCell_atRow_column(sender: MemorySegment, cell: MemorySegment, row: Long, column: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browser:willDisplayCell:atRow:column:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_titleOfColumn(sender: MemorySegment, column: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:titleOfColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_selectCellWithString_inColumn(sender: MemorySegment, title: MemorySegment, column: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:selectCellWithString:inColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_selectRow_inColumn(sender: MemorySegment, row: Long, column: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:selectRow:inColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_isColumnValid(sender: MemorySegment, column: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:isColumnValid:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browserWillScroll(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browserWillScroll:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browserDidScroll(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browserDidScroll:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_shouldSizeColumn_forUserResize_toWidth(browser: MemorySegment, columnIndex: Long, forUserResize: Boolean, suggestedWidth: Double): Double =
        throw UnsupportedOperationException("Optional ObjC method 'browser:shouldSizeColumn:forUserResize:toWidth:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_sizeToFitWidthOfColumn(browser: MemorySegment, columnIndex: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'browser:sizeToFitWidthOfColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browserColumnConfigurationDidChange(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browserColumnConfigurationDidChange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_shouldShowCellExpansionForRow_column(browser: MemorySegment, row: Long, column: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:shouldShowCellExpansionForRow:column:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_writeRowsWithIndexes_inColumn_toPasteboard(browser: MemorySegment, rowIndexes: MemorySegment, column: Long, pasteboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:writeRowsWithIndexes:inColumn:toPasteboard:' not implemented")

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    // @optional
    fun browser_namesOfPromisedFilesDroppedAtDestination_forDraggedRowsWithIndexes_inColumn(browser: MemorySegment, dropDestination: MemorySegment, rowIndexes: MemorySegment, column: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:namesOfPromisedFilesDroppedAtDestination:forDraggedRowsWithIndexes:inColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_canDragRowsWithIndexes_inColumn_withEvent(browser: MemorySegment, rowIndexes: MemorySegment, column: Long, event: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:canDragRowsWithIndexes:inColumn:withEvent:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_draggingImageForRowsWithIndexes_inColumn_withEvent_offset(browser: MemorySegment, rowIndexes: MemorySegment, column: Long, event: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:draggingImageForRowsWithIndexes:inColumn:withEvent:offset:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_validateDrop_proposedRow_column_dropOperation(browser: MemorySegment, info: MemorySegment, row: MemorySegment, column: MemorySegment, dropOperation: MemorySegment): NSDragOperation =
        throw UnsupportedOperationException("Optional ObjC method 'browser:validateDrop:proposedRow:column:dropOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_acceptDrop_atRow_column_dropOperation(browser: MemorySegment, info: MemorySegment, row: Long, column: Long, dropOperation: NSBrowserDropOperation): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:acceptDrop:atRow:column:dropOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_typeSelectStringForRow_inColumn(browser: MemorySegment, row: Long, column: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:typeSelectStringForRow:inColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_shouldTypeSelectForEvent_withCurrentSearchString(browser: MemorySegment, event: MemorySegment, searchString: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'browser:shouldTypeSelectForEvent:withCurrentSearchString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun browser_nextTypeSelectMatchFromRow_toRow_inColumn_forString(browser: MemorySegment, startRow: Long, endRow: Long, column: Long, searchString: MemorySegment): Long =
        throw UnsupportedOperationException("Optional ObjC method 'browser:nextTypeSelectMatchFromRow:toRow:inColumn:forString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_previewViewControllerForLeafItem(browser: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:previewViewControllerForLeafItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_headerViewControllerForItem(browser: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:headerViewControllerForItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun browser_didChangeLastColumn_toColumn(browser: MemorySegment, oldLastColumn: Long, column: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'browser:didChangeLastColumn:toColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun browser_selectionIndexesForProposedSelection_inColumn(browser: MemorySegment, proposedSelectionIndexes: MemorySegment, column: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'browser:selectionIndexesForProposedSelection:inColumn:' not implemented")

}
