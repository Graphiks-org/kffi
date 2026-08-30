@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSOutlineViewDelegate
 * Inherits protocols: NSControlTextEditingDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSOutlineViewDelegate : NSControlTextEditingDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun outlineView_viewForTableColumn_item(outlineView: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:viewForTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun outlineView_rowViewForItem(outlineView: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:rowViewForItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun outlineView_didAddRowView_forRow(outlineView: MemorySegment, rowView: MemorySegment, row: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:didAddRowView:forRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun outlineView_didRemoveRowView_forRow(outlineView: MemorySegment, rowView: MemorySegment, row: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:didRemoveRowView:forRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_willDisplayCell_forTableColumn_item(outlineView: MemorySegment, cell: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:willDisplayCell:forTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_shouldEditTableColumn_item(outlineView: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldEditTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectionShouldChangeInOutlineView(outlineView: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'selectionShouldChangeInOutlineView:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_shouldSelectItem(outlineView: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldSelectItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_selectionIndexesForProposedSelection(outlineView: MemorySegment, proposedSelectionIndexes: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:selectionIndexesForProposedSelection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_shouldSelectTableColumn(outlineView: MemorySegment, tableColumn: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldSelectTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_mouseDownInHeaderOfTableColumn(outlineView: MemorySegment, tableColumn: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:mouseDownInHeaderOfTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_didClickTableColumn(outlineView: MemorySegment, tableColumn: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:didClickTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_didDragTableColumn(outlineView: MemorySegment, tableColumn: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:didDragTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_toolTipForCell_rect_tableColumn_item_mouseLocation(outlineView: MemorySegment, cell: MemorySegment, rect: NSRectPointer, tableColumn: MemorySegment, item: MemorySegment, mouseLocation: NSPoint): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:toolTipForCell:rect:tableColumn:item:mouseLocation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_heightOfRowByItem(outlineView: MemorySegment, item: MemorySegment): Double =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:heightOfRowByItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun outlineView_tintConfigurationForItem(outlineView: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:tintConfigurationForItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_typeSelectStringForTableColumn_item(outlineView: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:typeSelectStringForTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_nextTypeSelectMatchFromItem_toItem_forString(outlineView: MemorySegment, startItem: MemorySegment, endItem: MemorySegment, searchString: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:nextTypeSelectMatchFromItem:toItem:forString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_shouldTypeSelectForEvent_withCurrentSearchString(outlineView: MemorySegment, event: MemorySegment, searchString: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldTypeSelectForEvent:withCurrentSearchString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_shouldShowCellExpansionForTableColumn_item(outlineView: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldShowCellExpansionForTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_shouldTrackCell_forTableColumn_item(outlineView: MemorySegment, cell: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldTrackCell:forTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_dataCellForTableColumn_item(outlineView: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:dataCellForTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun outlineView_isGroupItem(outlineView: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:isGroupItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_shouldExpandItem(outlineView: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldExpandItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_shouldCollapseItem(outlineView: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldCollapseItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineView_willDisplayOutlineCell_forTableColumn_item(outlineView: MemorySegment, cell: MemorySegment, tableColumn: MemorySegment, item: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:willDisplayOutlineCell:forTableColumn:item:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun outlineView_sizeToFitWidthOfColumn(outlineView: MemorySegment, column: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:sizeToFitWidthOfColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun outlineView_shouldReorderColumn_toColumn(outlineView: MemorySegment, columnIndex: Long, newColumnIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldReorderColumn:toColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun outlineView_shouldShowOutlineCellForItem(outlineView: MemorySegment, item: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:shouldShowOutlineCellForItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun outlineView_userCanChangeVisibilityOfTableColumn(outlineView: MemorySegment, column: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:userCanChangeVisibilityOfTableColumn:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun outlineView_userDidChangeVisibilityOfTableColumns(outlineView: MemorySegment, columns: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineView:userDidChangeVisibilityOfTableColumns:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewSelectionDidChange(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewSelectionDidChange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewColumnDidMove(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewColumnDidMove:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewColumnDidResize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewColumnDidResize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewSelectionIsChanging(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewSelectionIsChanging:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewItemWillExpand(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewItemWillExpand:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewItemDidExpand(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewItemDidExpand:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewItemWillCollapse(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewItemWillCollapse:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun outlineViewItemDidCollapse(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outlineViewItemDidCollapse:' not implemented")

}
