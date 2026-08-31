@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableView
 * Superclass: NSControl
 * Protocols: NSUserInterfaceValidations, NSTextViewDelegate, NSDraggingSource, NSAccessibilityTable
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTableView(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTableView") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun noteHeightOfRowsWithIndexesChanged(indexSet: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("noteHeightOfRowsWithIndexesChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, indexSet)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addTableColumn(tableColumn: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addTableColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, tableColumn)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeTableColumn(tableColumn: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeTableColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, tableColumn)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveColumn_toColumn(oldIndex: Long, newIndex: Long): Unit {
        val sel = ObjCRuntime.sel("moveColumn:toColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, oldIndex, newIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnWithIdentifier(identifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("columnWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, identifier) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tableColumnWithIdentifier(identifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("tableColumnWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tile(): Unit {
        val sel = ObjCRuntime.sel("tile")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeLastColumnToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeLastColumnToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollRowToVisible(row: Long): Unit {
        val sel = ObjCRuntime.sel("scrollRowToVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, row)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollColumnToVisible(column: Long): Unit {
        val sel = ObjCRuntime.sel("scrollColumnToVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadData(): Unit {
        val sel = ObjCRuntime.sel("reloadData")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun noteNumberOfRowsChanged(): Unit {
        val sel = ObjCRuntime.sel("noteNumberOfRowsChanged")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun reloadDataForRowIndexes_columnIndexes(rowIndexes: MemorySegment, columnIndexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadDataForRowIndexes:columnIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, rowIndexes, columnIndexes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIndicatorImage_inTableColumn(image: MemorySegment, tableColumn: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setIndicatorImage:inTableColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, image, tableColumn)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indicatorImageInTableColumn(tableColumn: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("indicatorImageInTableColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, tableColumn) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canDragRowsWithIndexes_atPoint(rowIndexes: MemorySegment, mouseDownPoint: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("canDragRowsWithIndexes:atPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, rowIndexes, ObjCRuntime.ObjCStructArg(mouseDownPoint.segment, NSPoint.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dragImageForRowsWithIndexes_tableColumns_event_offset(dragRows: MemorySegment, tableColumns: MemorySegment, dragEvent: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment {
        val sel = ObjCRuntime.sel("dragImageForRowsWithIndexes:tableColumns:event:offset:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, dragRows, tableColumns, dragEvent, dragImageOffset.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDraggingSourceOperationMask_forLocal(mask: NSDragOperation, isLocal: Boolean): Unit {
        val sel = ObjCRuntime.sel("setDraggingSourceOperationMask:forLocal:")
        ObjCRuntime.msgSend(null, ptr, sel, mask.rawValue, isLocal)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDropRow_dropOperation(row: Long, dropOperation: NSTableViewDropOperation): Unit {
        val sel = ObjCRuntime.sel("setDropRow:dropOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, row, dropOperation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deselectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectColumnIndexes_byExtendingSelection(indexes: MemorySegment, extend: Boolean): Unit {
        val sel = ObjCRuntime.sel("selectColumnIndexes:byExtendingSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, extend)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectRowIndexes_byExtendingSelection(indexes: MemorySegment, extend: Boolean): Unit {
        val sel = ObjCRuntime.sel("selectRowIndexes:byExtendingSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, extend)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectColumn(column: Long): Unit {
        val sel = ObjCRuntime.sel("deselectColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectRow(row: Long): Unit {
        val sel = ObjCRuntime.sel("deselectRow:")
        ObjCRuntime.msgSend(null, ptr, sel, row)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isColumnSelected(column: Long): Boolean {
        val sel = ObjCRuntime.sel("isColumnSelected:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, column) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isRowSelected(row: Long): Boolean {
        val sel = ObjCRuntime.sel("isRowSelected:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, row) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rectOfColumn(column: Long): NSRect {
        val sel = ObjCRuntime.sel("rectOfColumn:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, column))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rectOfRow(row: Long): NSRect {
        val sel = ObjCRuntime.sel("rectOfRow:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, row))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun columnIndexesInRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("columnIndexesInRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowsInRect(rect: NSRect): NSRange {
        val sel = ObjCRuntime.sel("rowsInRect:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnAtPoint(point: NSPoint): Long {
        val sel = ObjCRuntime.sel("columnAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowAtPoint(point: NSPoint): Long {
        val sel = ObjCRuntime.sel("rowAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frameOfCellAtColumn_row(column: Long, row: Long): NSRect {
        val sel = ObjCRuntime.sel("frameOfCellAtColumn:row:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, column, row))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun editColumn_row_withEvent_select(column: Long, row: Long, event: MemorySegment, select: Boolean): Unit {
        val sel = ObjCRuntime.sel("editColumn:row:withEvent:select:")
        ObjCRuntime.msgSend(null, ptr, sel, column, row, event, select)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawRow_clipRect(row: Long, clipRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawRow:clipRect:")
        ObjCRuntime.msgSend(null, ptr, sel, row, ObjCRuntime.ObjCStructArg(clipRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightSelectionInClipRect(clipRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("highlightSelectionInClipRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(clipRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawGridInClipRect(clipRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawGridInClipRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(clipRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawBackgroundInClipRect(clipRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawBackgroundInClipRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(clipRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun viewAtColumn_row_makeIfNecessary(column: Long, row: Long, makeIfNecessary: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("viewAtColumn:row:makeIfNecessary:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column, row, makeIfNecessary) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun rowViewAtRow_makeIfNecessary(row: Long, makeIfNecessary: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("rowViewAtRow:makeIfNecessary:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row, makeIfNecessary) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun rowForView(view: MemorySegment): Long {
        val sel = ObjCRuntime.sel("rowForView:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, view) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun columnForView(view: MemorySegment): Long {
        val sel = ObjCRuntime.sel("columnForView:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, view) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun makeViewWithIdentifier_owner(identifier: MemorySegment, owner: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeViewWithIdentifier:owner:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier, owner) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun enumerateAvailableRowViewsUsingBlock(handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateAvailableRowViewsUsingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, handler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun beginUpdates(): Unit {
        val sel = ObjCRuntime.sel("beginUpdates")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun endUpdates(): Unit {
        val sel = ObjCRuntime.sel("endUpdates")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun insertRowsAtIndexes_withAnimation(indexes: MemorySegment, animationOptions: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("insertRowsAtIndexes:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, animationOptions.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun removeRowsAtIndexes_withAnimation(indexes: MemorySegment, animationOptions: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("removeRowsAtIndexes:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, animationOptions.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun moveRowAtIndex_toIndex(oldIndex: Long, newIndex: Long): Unit {
        val sel = ObjCRuntime.sel("moveRowAtIndex:toIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, oldIndex, newIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun hideRowsAtIndexes_withAnimation(indexes: MemorySegment, rowAnimation: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("hideRowsAtIndexes:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, rowAnimation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun unhideRowsAtIndexes_withAnimation(indexes: MemorySegment, rowAnimation: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("unhideRowsAtIndexes:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, rowAnimation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun registerNib_forIdentifier(nib: MemorySegment, identifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerNib:forIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, nib, identifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun didAddRowView_forRow(rowView: MemorySegment, row: Long): Unit {
        val sel = ObjCRuntime.sel("didAddRowView:forRow:")
        ObjCRuntime.msgSend(null, ptr, sel, rowView, row)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun didRemoveRowView_forRow(rowView: MemorySegment, row: Long): Unit {
        val sel = ObjCRuntime.sel("didRemoveRowView:forRow:")
        ObjCRuntime.msgSend(null, ptr, sel, rowView, row)
    }

    // @property dataSource
    /** @return id<NSTableViewDataSource> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dataSource(): MemorySegment {
        val sel = ObjCRuntime.sel("dataSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDataSource(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDataSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSTableViewDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property headerView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun headerView(): MemorySegment {
        val sel = ObjCRuntime.sel("headerView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHeaderView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHeaderView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cornerView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cornerView(): MemorySegment {
        val sel = ObjCRuntime.sel("cornerView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCornerView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCornerView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsColumnReordering
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsColumnReordering(): Boolean {
        val sel = ObjCRuntime.sel("allowsColumnReordering")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsColumnReordering(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsColumnReordering:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsColumnResizing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsColumnResizing(): Boolean {
        val sel = ObjCRuntime.sel("allowsColumnResizing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsColumnResizing(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsColumnResizing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property columnAutoresizingStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnAutoresizingStyle(): NSTableViewColumnAutoresizingStyle {
        val sel = ObjCRuntime.sel("columnAutoresizingStyle")
        return NSTableViewColumnAutoresizingStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColumnAutoresizingStyle(value: NSTableViewColumnAutoresizingStyle) {
        val sel = ObjCRuntime.sel("setColumnAutoresizingStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property gridStyleMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun gridStyleMask(): NSTableViewGridLineStyle {
        val sel = ObjCRuntime.sel("gridStyleMask")
        return NSTableViewGridLineStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setGridStyleMask(value: NSTableViewGridLineStyle) {
        val sel = ObjCRuntime.sel("setGridStyleMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property intercellSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun intercellSpacing(): NSSize {
        val sel = ObjCRuntime.sel("intercellSpacing")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIntercellSpacing(value: NSSize) {
        val sel = ObjCRuntime.sel("setIntercellSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property usesAlternatingRowBackgroundColors
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usesAlternatingRowBackgroundColors(): Boolean {
        val sel = ObjCRuntime.sel("usesAlternatingRowBackgroundColors")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUsesAlternatingRowBackgroundColors(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesAlternatingRowBackgroundColors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property gridColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun gridColor(): MemorySegment {
        val sel = ObjCRuntime.sel("gridColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setGridColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setGridColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rowSizeStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun rowSizeStyle(): NSTableViewRowSizeStyle {
        val sel = ObjCRuntime.sel("rowSizeStyle")
        return NSTableViewRowSizeStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setRowSizeStyle(value: NSTableViewRowSizeStyle) {
        val sel = ObjCRuntime.sel("setRowSizeStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property effectiveRowSizeStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun effectiveRowSizeStyle(): NSTableViewRowSizeStyle {
        val sel = ObjCRuntime.sel("effectiveRowSizeStyle")
        return NSTableViewRowSizeStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property rowHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowHeight(): Double {
        val sel = ObjCRuntime.sel("rowHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowHeight(value: Double) {
        val sel = ObjCRuntime.sel("setRowHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tableColumns
    /** @return NSArray<NSTableColumn *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tableColumns(): MemorySegment {
        val sel = ObjCRuntime.sel("tableColumns")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfRows(): Long {
        val sel = ObjCRuntime.sel("numberOfRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property editedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun editedColumn(): Long {
        val sel = ObjCRuntime.sel("editedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property editedRow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun editedRow(): Long {
        val sel = ObjCRuntime.sel("editedRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property clickedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clickedColumn(): Long {
        val sel = ObjCRuntime.sel("clickedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property clickedRow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clickedRow(): Long {
        val sel = ObjCRuntime.sel("clickedRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property doubleAction
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun doubleAction(): MemorySegment {
        val sel = ObjCRuntime.sel("doubleAction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDoubleAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDoubleAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sortDescriptors
    /** @return NSArray<NSSortDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sortDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("sortDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSortDescriptors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSortDescriptors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property highlightedTableColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightedTableColumn(): MemorySegment {
        val sel = ObjCRuntime.sel("highlightedTableColumn")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHighlightedTableColumn(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHighlightedTableColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property verticalMotionCanBeginDrag
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun verticalMotionCanBeginDrag(): Boolean {
        val sel = ObjCRuntime.sel("verticalMotionCanBeginDrag")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticalMotionCanBeginDrag(value: Boolean) {
        val sel = ObjCRuntime.sel("setVerticalMotionCanBeginDrag:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsMultipleSelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsMultipleSelection(): Boolean {
        val sel = ObjCRuntime.sel("allowsMultipleSelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsMultipleSelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsMultipleSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsEmptySelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsEmptySelection(): Boolean {
        val sel = ObjCRuntime.sel("allowsEmptySelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsEmptySelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsEmptySelection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsColumnSelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsColumnSelection(): Boolean {
        val sel = ObjCRuntime.sel("allowsColumnSelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsColumnSelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsColumnSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectedColumnIndexes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedColumnIndexes(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedColumnIndexes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedRowIndexes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedRowIndexes(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedRowIndexes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedColumn(): Long {
        val sel = ObjCRuntime.sel("selectedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedRow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedRow(): Long {
        val sel = ObjCRuntime.sel("selectedRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfSelectedColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfSelectedColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfSelectedColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfSelectedRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfSelectedRows(): Long {
        val sel = ObjCRuntime.sel("numberOfSelectedRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property allowsTypeSelect
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun allowsTypeSelect(): Boolean {
        val sel = ObjCRuntime.sel("allowsTypeSelect")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAllowsTypeSelect(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsTypeSelect:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property style
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun style(): NSTableViewStyle {
        val sel = ObjCRuntime.sel("style")
        return NSTableViewStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setStyle(value: NSTableViewStyle) {
        val sel = ObjCRuntime.sel("setStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property effectiveStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun effectiveStyle(): NSTableViewStyle {
        val sel = ObjCRuntime.sel("effectiveStyle")
        return NSTableViewStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property selectionHighlightStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun selectionHighlightStyle(): NSTableViewSelectionHighlightStyle {
        val sel = ObjCRuntime.sel("selectionHighlightStyle")
        return NSTableViewSelectionHighlightStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setSelectionHighlightStyle(value: NSTableViewSelectionHighlightStyle) {
        val sel = ObjCRuntime.sel("setSelectionHighlightStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property draggingDestinationFeedbackStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun draggingDestinationFeedbackStyle(): NSTableViewDraggingDestinationFeedbackStyle {
        val sel = ObjCRuntime.sel("draggingDestinationFeedbackStyle")
        return NSTableViewDraggingDestinationFeedbackStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setDraggingDestinationFeedbackStyle(value: NSTableViewDraggingDestinationFeedbackStyle) {
        val sel = ObjCRuntime.sel("setDraggingDestinationFeedbackStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property autosaveName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("autosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutosaveName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAutosaveName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autosaveTableColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosaveTableColumns(): Boolean {
        val sel = ObjCRuntime.sel("autosaveTableColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutosaveTableColumns(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutosaveTableColumns:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property floatsGroupRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun floatsGroupRows(): Boolean {
        val sel = ObjCRuntime.sel("floatsGroupRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setFloatsGroupRows(value: Boolean) {
        val sel = ObjCRuntime.sel("setFloatsGroupRows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rowActionsVisible
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun rowActionsVisible(): Boolean {
        val sel = ObjCRuntime.sel("rowActionsVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setRowActionsVisible(value: Boolean) {
        val sel = ObjCRuntime.sel("setRowActionsVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hiddenRowIndexes
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun hiddenRowIndexes(): MemorySegment {
        val sel = ObjCRuntime.sel("hiddenRowIndexes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property registeredNibsByIdentifier
    /** @return NSDictionary<NSUserInterfaceItemIdentifier,NSNib *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun registeredNibsByIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("registeredNibsByIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property usesStaticContents
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun usesStaticContents(): Boolean {
        val sel = ObjCRuntime.sel("usesStaticContents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setUsesStaticContents(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesStaticContents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property userInterfaceLayoutDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    override fun userInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection {
        val sel = ObjCRuntime.sel("userInterfaceLayoutDirection")
        return NSUserInterfaceLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    override fun setUserInterfaceLayoutDirection(value: NSUserInterfaceLayoutDirection) {
        val sel = ObjCRuntime.sel("setUserInterfaceLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property usesAutomaticRowHeights
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun usesAutomaticRowHeights(): Boolean {
        val sel = ObjCRuntime.sel("usesAutomaticRowHeights")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setUsesAutomaticRowHeights(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesAutomaticRowHeights:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSUserInterfaceValidations. */
fun NSTableView.validateUserInterfaceItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

/** Required by Objective-C protocol NSDraggingSource. */
fun NSTableView.draggingSession_sourceOperationMaskForDraggingContext(session: MemorySegment, context: NSDraggingContext): NSDragOperation {
    val sel = ObjCRuntime.sel("draggingSession:sourceOperationMaskForDraggingContext:")
    return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, session, context.rawValue) as Long)
}

// ── Category: NSDeprecated on NSTableView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSTableView.setDrawsGrid(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setDrawsGrid:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSTableView.drawsGrid(): Boolean {
    val sel = ObjCRuntime.sel("drawsGrid")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSTableView.selectColumn_byExtendingSelection(column: Long, extend: Boolean): Unit {
    val sel = ObjCRuntime.sel("selectColumn:byExtendingSelection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, column, extend)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSTableView.selectRow_byExtendingSelection(row: Long, extend: Boolean): Unit {
    val sel = ObjCRuntime.sel("selectRow:byExtendingSelection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, row, extend)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSTableView.selectedColumnEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedColumnEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSTableView.selectedRowEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedRowEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSTableView.dragImageForRows_event_dragImageOffset(dragRows: MemorySegment, dragEvent: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment {
    val sel = ObjCRuntime.sel("dragImageForRows:event:dragImageOffset:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, dragRows, dragEvent, dragImageOffset.segment) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSTableView.setAutoresizesAllColumnsToFit(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutoresizesAllColumnsToFit:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSTableView.autoresizesAllColumnsToFit(): Boolean {
    val sel = ObjCRuntime.sel("autoresizesAllColumnsToFit")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSTableView.columnsInRect(rect: NSRect): NSRange {
    val sel = ObjCRuntime.sel("columnsInRect:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use View Based TableView and -viewAtColumn:row:")
fun NSTableView.preparedCellAtColumn_row(column: Long, row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("preparedCellAtColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column, row) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView with an NSTextField")
fun NSTableView.textShouldBeginEditing(textObject: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("textShouldBeginEditing:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, textObject) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView with an NSTextField")
fun NSTableView.textShouldEndEditing(textObject: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("textShouldEndEditing:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, textObject) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView with an NSTextField")
fun NSTableView.textDidBeginEditing(notification: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("textDidBeginEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, notification)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView with an NSTextField")
fun NSTableView.textDidEndEditing(notification: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("textDidEndEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, notification)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView with an NSTextField")
fun NSTableView.textDidChange(notification: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("textDidChange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, notification)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView; observe the window’s firstResponder for focus change notifications")
fun NSTableView.shouldFocusCell_atColumn_row(cell: MemorySegment, column: Long, row: Long): Boolean {
    val sel = ObjCRuntime.sel("shouldFocusCell:atColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, cell, column, row) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView and observe the window.firstResponder")
fun NSTableView.focusedColumn(): Long {
    val sel = ObjCRuntime.sel("focusedColumn")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView; make a particular view the first responder with [window makeFirstResponder:view] to focus it.")
fun NSTableView.setFocusedColumn(focusedColumn: Long): Unit {
    val sel = ObjCRuntime.sel("setFocusedColumn:")
    ObjCRuntime.msgSend(null, this.ptr, sel, focusedColumn)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use a View Based TableView; directly interact with a particular view as required and call -performClick: on it, if necessary")
fun NSTableView.performClickOnCellAtColumn_row(column: Long, row: Long): Unit {
    val sel = ObjCRuntime.sel("performClickOnCellAtColumn:row:")
    ObjCRuntime.msgSend(null, this.ptr, sel, column, row)
}
