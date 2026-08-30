@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTableViewDelegate
 * Inherits protocols: NSControlTextEditingDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTableViewDelegate : NSControlTextEditingDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_viewForTableColumn_row(tableView: MemorySegment, tableColumn: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:viewForTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_rowViewForRow(tableView: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:rowViewForRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_didAddRowView_forRow(tableView: MemorySegment, rowView: MemorySegment, row: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:didAddRowView:forRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun tableView_didRemoveRowView_forRow(tableView: MemorySegment, rowView: MemorySegment, row: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:didRemoveRowView:forRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_willDisplayCell_forTableColumn_row(tableView: MemorySegment, cell: MemorySegment, tableColumn: MemorySegment, row: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:willDisplayCell:forTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_shouldEditTableColumn_row(tableView: MemorySegment, tableColumn: MemorySegment, row: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldEditTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_toolTipForCell_rect_tableColumn_row_mouseLocation(tableView: MemorySegment, cell: MemorySegment, rect: NSRectPointer, tableColumn: MemorySegment, row: Long, mouseLocation: NSPoint): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:toolTipForCell:rect:tableColumn:row:mouseLocation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_shouldShowCellExpansionForTableColumn_row(tableView: MemorySegment, tableColumn: MemorySegment, row: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldShowCellExpansionForTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_shouldTrackCell_forTableColumn_row(tableView: MemorySegment, cell: MemorySegment, tableColumn: MemorySegment, row: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldTrackCell:forTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_dataCellForTableColumn_row(tableView: MemorySegment, tableColumn: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:dataCellForTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectionShouldChangeInTableView(tableView: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'selectionShouldChangeInTableView:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_shouldSelectRow(tableView: MemorySegment, row: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldSelectRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_selectionIndexesForProposedSelection(tableView: MemorySegment, proposedSelectionIndexes: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:selectionIndexesForProposedSelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_shouldSelectTableColumn(tableView: MemorySegment, tableColumn: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldSelectTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_mouseDownInHeaderOfTableColumn(tableView: MemorySegment, tableColumn: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:mouseDownInHeaderOfTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_didClickTableColumn(tableView: MemorySegment, tableColumn: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:didClickTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_didDragTableColumn(tableView: MemorySegment, tableColumn: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:didDragTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableView_heightOfRow(tableView: MemorySegment, row: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:heightOfRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_typeSelectStringForTableColumn_row(tableView: MemorySegment, tableColumn: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:typeSelectStringForTableColumn:row:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_nextTypeSelectMatchFromRow_toRow_forString(tableView: MemorySegment, startRow: Long, endRow: Long, searchString: MemorySegment): Long =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:nextTypeSelectMatchFromRow:toRow:forString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_shouldTypeSelectForEvent_withCurrentSearchString(tableView: MemorySegment, event: MemorySegment, searchString: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldTypeSelectForEvent:withCurrentSearchString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun tableView_isGroupRow(tableView: MemorySegment, row: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:isGroupRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun tableView_sizeToFitWidthOfColumn(tableView: MemorySegment, column: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:sizeToFitWidthOfColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun tableView_shouldReorderColumn_toColumn(tableView: MemorySegment, columnIndex: Long, newColumnIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:shouldReorderColumn:toColumn:' not implemented")

    /** @return NSArray<NSTableViewRowAction *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun tableView_rowActionsForRow_edge(tableView: MemorySegment, row: Long, edge: NSTableRowActionEdge): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:rowActionsForRow:edge:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun tableView_userCanChangeVisibilityOfTableColumn(tableView: MemorySegment, column: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:userCanChangeVisibilityOfTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun tableView_userDidChangeVisibilityOfTableColumns(tableView: MemorySegment, columns: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableView:userDidChangeVisibilityOfTableColumns:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableViewSelectionDidChange(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableViewSelectionDidChange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableViewColumnDidMove(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableViewColumnDidMove:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableViewColumnDidResize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableViewColumnDidResize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun tableViewSelectionIsChanging(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'tableViewSelectionIsChanging:' not implemented")

}
