@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBrowser
 * Superclass: NSControl
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSBrowser(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSBrowser") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun removeSavedColumnsWithAutosaveName(name: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("removeSavedColumnsWithAutosaveName:")
            ObjCRuntime.msgSend(null, _class, sel, name)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun cellClass(): MemorySegment {
            val sel = ObjCRuntime.sel("cellClass")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun loadColumnZero(): Unit {
        val sel = ObjCRuntime.sel("loadColumnZero")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCellClass(factoryId: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setCellClass:")
        ObjCRuntime.msgSend(null, ptr, sel, factoryId)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun itemAtIndexPath(indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("itemAtIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexPath) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun itemAtRow_inColumn(row: Long, column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemAtRow:inColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row, column) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun indexPathForColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathForColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun isLeafItem(item: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isLeafItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, item) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun reloadDataForRowIndexes_inColumn(rowIndexes: MemorySegment, column: Long): Unit {
        val sel = ObjCRuntime.sel("reloadDataForRowIndexes:inColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, rowIndexes, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun parentForItemsInColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("parentForItemsInColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun scrollRowToVisible_inColumn(row: Long, column: Long): Unit {
        val sel = ObjCRuntime.sel("scrollRowToVisible:inColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, row, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle_ofColumn(string: MemorySegment, column: Long): Unit {
        val sel = ObjCRuntime.sel("setTitle:ofColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, string, column)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setTitle_ofColumn(string: String, column: Long): Unit = setTitle_ofColumn(ObjCRuntime.newNSString(Arena.global(), string), column)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleOfColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("titleOfColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun titleOfColumnAsString(column: Long): String = ObjCRuntime.toJavaString(titleOfColumn(column))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPath(path: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setPath:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, path) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setPath(path: String): Boolean = setPath(ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun path(): MemorySegment {
        val sel = ObjCRuntime.sel("path")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun pathAsString(): String = ObjCRuntime.toJavaString(path())

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pathToColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("pathToColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun pathToColumnAsString(column: Long): String = ObjCRuntime.toJavaString(pathToColumn(column))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedCellInColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("selectedCellInColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectRow_inColumn(row: Long, column: Long): Unit {
        val sel = ObjCRuntime.sel("selectRow:inColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, row, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedRowInColumn(column: Long): Long {
        val sel = ObjCRuntime.sel("selectedRowInColumn:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, column) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun selectRowIndexes_inColumn(indexes: MemorySegment, column: Long): Unit {
        val sel = ObjCRuntime.sel("selectRowIndexes:inColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun selectedRowIndexesInColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("selectedRowIndexesInColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadColumn(column: Long): Unit {
        val sel = ObjCRuntime.sel("reloadColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun validateVisibleColumns(): Unit {
        val sel = ObjCRuntime.sel("validateVisibleColumns")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollColumnsRightBy(shiftAmount: Long): Unit {
        val sel = ObjCRuntime.sel("scrollColumnsRightBy:")
        ObjCRuntime.msgSend(null, ptr, sel, shiftAmount)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollColumnsLeftBy(shiftAmount: Long): Unit {
        val sel = ObjCRuntime.sel("scrollColumnsLeftBy:")
        ObjCRuntime.msgSend(null, ptr, sel, shiftAmount)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollColumnToVisible(column: Long): Unit {
        val sel = ObjCRuntime.sel("scrollColumnToVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addColumn(): Unit {
        val sel = ObjCRuntime.sel("addColumn")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun loadedCellAtRow_column(row: Long, col: Long): MemorySegment {
        val sel = ObjCRuntime.sel("loadedCellAtRow:column:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row, col) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tile(): Unit {
        val sel = ObjCRuntime.sel("tile")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun doClick(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("doClick:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun doDoubleClick(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("doDoubleClick:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendAction(): Boolean {
        val sel = ObjCRuntime.sel("sendAction")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleFrameOfColumn(column: Long): NSRect {
        val sel = ObjCRuntime.sel("titleFrameOfColumn:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, column))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawTitleOfColumn_inRect(column: Long, rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawTitleOfColumn:inRect:")
        ObjCRuntime.msgSend(null, ptr, sel, column, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frameOfColumn(column: Long): NSRect {
        val sel = ObjCRuntime.sel("frameOfColumn:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, column))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frameOfInsideOfColumn(column: Long): NSRect {
        val sel = ObjCRuntime.sel("frameOfInsideOfColumn:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, column))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun frameOfRow_inColumn(row: Long, column: Long): NSRect {
        val sel = ObjCRuntime.sel("frameOfRow:inColumn:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, row, column))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun getRow_column_forPoint(row: MemorySegment, column: MemorySegment, point: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("getRow:column:forPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, row, column, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnWidthForColumnContentWidth(columnContentWidth: Double): Double {
        val sel = ObjCRuntime.sel("columnWidthForColumnContentWidth:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, columnContentWidth) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnContentWidthForColumnWidth(columnWidth: Double): Double {
        val sel = ObjCRuntime.sel("columnContentWidthForColumnWidth:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, columnWidth) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWidth_ofColumn(columnWidth: Double, columnIndex: Long): Unit {
        val sel = ObjCRuntime.sel("setWidth:ofColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, columnWidth, columnIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun widthOfColumn(column: Long): Double {
        val sel = ObjCRuntime.sel("widthOfColumn:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, column) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun noteHeightOfRowsWithIndexesChanged_inColumn(indexSet: MemorySegment, columnIndex: Long): Unit {
        val sel = ObjCRuntime.sel("noteHeightOfRowsWithIndexesChanged:inColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, indexSet, columnIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setDefaultColumnWidth(columnWidth: Double): Unit {
        val sel = ObjCRuntime.sel("setDefaultColumnWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, columnWidth)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun defaultColumnWidth(): Double {
        val sel = ObjCRuntime.sel("defaultColumnWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun canDragRowsWithIndexes_inColumn_withEvent(rowIndexes: MemorySegment, column: Long, event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("canDragRowsWithIndexes:inColumn:withEvent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, rowIndexes, column, event) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun draggingImageForRowsWithIndexes_inColumn_withEvent_offset(rowIndexes: MemorySegment, column: Long, event: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment {
        val sel = ObjCRuntime.sel("draggingImageForRowsWithIndexes:inColumn:withEvent:offset:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, rowIndexes, column, event, dragImageOffset.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setDraggingSourceOperationMask_forLocal(mask: NSDragOperation, isLocal: Boolean): Unit {
        val sel = ObjCRuntime.sel("setDraggingSourceOperationMask:forLocal:")
        ObjCRuntime.msgSend(null, ptr, sel, mask.rawValue, isLocal)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun editItemAtIndexPath_withEvent_select(indexPath: MemorySegment, event: MemorySegment, select: Boolean): Unit {
        val sel = ObjCRuntime.sel("editItemAtIndexPath:withEvent:select:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPath, event, select)
    }

    // @property loaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
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

    // @property cellPrototype
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellPrototype(): MemorySegment {
        val sel = ObjCRuntime.sel("cellPrototype")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCellPrototype(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCellPrototype:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSBrowserDelegate> */
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

    // @property reusesColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reusesColumns(): Boolean {
        val sel = ObjCRuntime.sel("reusesColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setReusesColumns(value: Boolean) {
        val sel = ObjCRuntime.sel("setReusesColumns:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasHorizontalScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasHorizontalScroller(): Boolean {
        val sel = ObjCRuntime.sel("hasHorizontalScroller")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHasHorizontalScroller(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasHorizontalScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autohidesScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun autohidesScroller(): Boolean {
        val sel = ObjCRuntime.sel("autohidesScroller")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setAutohidesScroller(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutohidesScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property separatesColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun separatesColumns(): Boolean {
        val sel = ObjCRuntime.sel("separatesColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSeparatesColumns(value: Boolean) {
        val sel = ObjCRuntime.sel("setSeparatesColumns:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property titled
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isTitled(): Boolean {
        val sel = ObjCRuntime.sel("isTitled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitled(value: Boolean) {
        val sel = ObjCRuntime.sel("setTitled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minColumnWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minColumnWidth(): Double {
        val sel = ObjCRuntime.sel("minColumnWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinColumnWidth(value: Double) {
        val sel = ObjCRuntime.sel("setMinColumnWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxVisibleColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxVisibleColumns(): Long {
        val sel = ObjCRuntime.sel("maxVisibleColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxVisibleColumns(value: Long) {
        val sel = ObjCRuntime.sel("setMaxVisibleColumns:")
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

    // @property allowsBranchSelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsBranchSelection(): Boolean {
        val sel = ObjCRuntime.sel("allowsBranchSelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsBranchSelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsBranchSelection:")
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

    // @property takesTitleFromPreviousColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takesTitleFromPreviousColumn(): Boolean {
        val sel = ObjCRuntime.sel("takesTitleFromPreviousColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTakesTitleFromPreviousColumn(value: Boolean) {
        val sel = ObjCRuntime.sel("setTakesTitleFromPreviousColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sendsActionOnArrowKeys
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendsActionOnArrowKeys(): Boolean {
        val sel = ObjCRuntime.sel("sendsActionOnArrowKeys")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSendsActionOnArrowKeys(value: Boolean) {
        val sel = ObjCRuntime.sel("setSendsActionOnArrowKeys:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pathSeparator
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pathSeparator(): MemorySegment {
        val sel = ObjCRuntime.sel("pathSeparator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPathSeparator(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPathSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pathSeparatorAsString(): String = ObjCRuntime.toJavaString(pathSeparator())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPathSeparator(value: String) = setPathSeparator(ObjCRuntime.newNSString(Arena.global(), value))

    // @property clickedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun clickedColumn(): Long {
        val sel = ObjCRuntime.sel("clickedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property clickedRow
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun clickedRow(): Long {
        val sel = ObjCRuntime.sel("clickedRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedColumn(): Long {
        val sel = ObjCRuntime.sel("selectedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedCell(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedCells
    /** @return NSArray<NSCell *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedCells(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedCells")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectionIndexPath
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun selectionIndexPath(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionIndexPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setSelectionIndexPath(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionIndexPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionIndexPaths
    /** @return NSArray<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun selectionIndexPaths(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionIndexPaths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setSelectionIndexPaths(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lastColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun lastColumn(): Long {
        val sel = ObjCRuntime.sel("lastColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLastColumn(value: Long) {
        val sel = ObjCRuntime.sel("setLastColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfVisibleColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfVisibleColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfVisibleColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property firstVisibleColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun firstVisibleColumn(): Long {
        val sel = ObjCRuntime.sel("firstVisibleColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property lastVisibleColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun lastVisibleColumn(): Long {
        val sel = ObjCRuntime.sel("lastVisibleColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property titleHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleHeight(): Double {
        val sel = ObjCRuntime.sel("titleHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property columnResizingType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnResizingType(): NSBrowserColumnResizingType {
        val sel = ObjCRuntime.sel("columnResizingType")
        return NSBrowserColumnResizingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColumnResizingType(value: NSBrowserColumnResizingType) {
        val sel = ObjCRuntime.sel("setColumnResizingType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property prefersAllColumnUserResizing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun prefersAllColumnUserResizing(): Boolean {
        val sel = ObjCRuntime.sel("prefersAllColumnUserResizing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrefersAllColumnUserResizing(value: Boolean) {
        val sel = ObjCRuntime.sel("setPrefersAllColumnUserResizing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rowHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun rowHeight(): Double {
        val sel = ObjCRuntime.sel("rowHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setRowHeight(value: Double) {
        val sel = ObjCRuntime.sel("setRowHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property columnsAutosaveName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnsAutosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("columnsAutosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColumnsAutosaveName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColumnsAutosaveName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSBrowser ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSBrowser.setAcceptsArrowKeys(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAcceptsArrowKeys:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSBrowser.acceptsArrowKeys(): Boolean {
    val sel = ObjCRuntime.sel("acceptsArrowKeys")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSBrowser.displayColumn(column: Long): Unit {
    val sel = ObjCRuntime.sel("displayColumn:")
    ObjCRuntime.msgSend(null, this.ptr, sel, column)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSBrowser.displayAllColumns(): Unit {
    val sel = ObjCRuntime.sel("displayAllColumns")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSBrowser.scrollViaScroller(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("scrollViaScroller:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 3, deprecatedSubminor = -1)
fun NSBrowser.updateScroller(): Unit {
    val sel = ObjCRuntime.sel("updateScroller")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the item based NSBrowser instead")
fun NSBrowser.setMatrixClass(factoryId: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setMatrixClass:")
    ObjCRuntime.msgSend(null, this.ptr, sel, factoryId)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the item based NSBrowser instead")
fun NSBrowser.matrixClass(): MemorySegment {
    val sel = ObjCRuntime.sel("matrixClass")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the item based NSBrowser instead")
fun NSBrowser.columnOfMatrix(matrix: MemorySegment): Long {
    val sel = ObjCRuntime.sel("columnOfMatrix:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, matrix) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use the item based NSBrowser instead")
fun NSBrowser.matrixInColumn(column: Long): MemorySegment {
    val sel = ObjCRuntime.sel("matrixInColumn:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column) as MemorySegment
}
