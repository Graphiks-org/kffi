@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMatrix
 * Superclass: NSControl
 * Protocols: NSUserInterfaceValidations, NSViewToolTipOwner
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSMatrix(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSMatrix") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFrame_mode_prototype_numberOfRows_numberOfColumns(frameRect: NSRect, mode: NSMatrixMode, cell: MemorySegment, rowsHigh: Long, colsWide: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:mode:prototype:numberOfRows:numberOfColumns:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), mode.rawValue, cell, rowsHigh, colsWide) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFrame_mode_cellClass_numberOfRows_numberOfColumns(frameRect: NSRect, mode: NSMatrixMode, factoryId: MemorySegment, rowsHigh: Long, colsWide: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:mode:cellClass:numberOfRows:numberOfColumns:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), mode.rawValue, factoryId, rowsHigh, colsWide) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeCellAtRow_column(row: Long, col: Long): MemorySegment {
        val sel = ObjCRuntime.sel("makeCellAtRow:column:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row, col) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendAction_to_forAllCells(selector: MemorySegment, `object`: MemorySegment, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("sendAction:to:forAllCells:")
        ObjCRuntime.msgSend(null, ptr, sel, selector, `object`, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sortUsingSelector(comparator: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("sortUsingSelector:")
        ObjCRuntime.msgSend(null, ptr, sel, comparator)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sortUsingFunction_context(compare: MemorySegment, context: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("sortUsingFunction:context:")
        ObjCRuntime.msgSend(null, ptr, sel, compare, context)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionFrom_to_anchor_highlight(startPos: Long, endPos: Long, anchorPos: Long, lit: Boolean): Unit {
        val sel = ObjCRuntime.sel("setSelectionFrom:to:anchor:highlight:")
        ObjCRuntime.msgSend(null, ptr, sel, startPos, endPos, anchorPos, lit)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectSelectedCell(): Unit {
        val sel = ObjCRuntime.sel("deselectSelectedCell")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectAllCells(): Unit {
        val sel = ObjCRuntime.sel("deselectAllCells")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectCellAtRow_column(row: Long, col: Long): Unit {
        val sel = ObjCRuntime.sel("selectCellAtRow:column:")
        ObjCRuntime.msgSend(null, ptr, sel, row, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectCellWithTag(tag: Long): Boolean {
        val sel = ObjCRuntime.sel("selectCellWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, tag) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setScrollable(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setScrollable:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setState_atRow_column(value: Long, row: Long, col: Long): Unit {
        val sel = ObjCRuntime.sel("setState:atRow:column:")
        ObjCRuntime.msgSend(null, ptr, sel, value, row, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getNumberOfRows_columns(rowCount: MemorySegment, colCount: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getNumberOfRows:columns:")
        ObjCRuntime.msgSend(null, ptr, sel, rowCount, colCount)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellAtRow_column(row: Long, col: Long): MemorySegment {
        val sel = ObjCRuntime.sel("cellAtRow:column:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row, col) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellFrameAtRow_column(row: Long, col: Long): NSRect {
        val sel = ObjCRuntime.sel("cellFrameAtRow:column:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, row, col))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getRow_column_ofCell(row: MemorySegment, col: MemorySegment, cell: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("getRow:column:ofCell:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, row, col, cell) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getRow_column_forPoint(row: MemorySegment, col: MemorySegment, point: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("getRow:column:forPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, row, col, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun renewRows_columns(newRows: Long, newCols: Long): Unit {
        val sel = ObjCRuntime.sel("renewRows:columns:")
        ObjCRuntime.msgSend(null, ptr, sel, newRows, newCols)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun putCell_atRow_column(newCell: MemorySegment, row: Long, col: Long): Unit {
        val sel = ObjCRuntime.sel("putCell:atRow:column:")
        ObjCRuntime.msgSend(null, ptr, sel, newCell, row, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addRow(): Unit {
        val sel = ObjCRuntime.sel("addRow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addRowWithCells(newCells: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addRowWithCells:")
        ObjCRuntime.msgSend(null, ptr, sel, newCells)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertRow(row: Long): Unit {
        val sel = ObjCRuntime.sel("insertRow:")
        ObjCRuntime.msgSend(null, ptr, sel, row)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertRow_withCells(row: Long, newCells: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertRow:withCells:")
        ObjCRuntime.msgSend(null, ptr, sel, row, newCells)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeRow(row: Long): Unit {
        val sel = ObjCRuntime.sel("removeRow:")
        ObjCRuntime.msgSend(null, ptr, sel, row)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addColumn(): Unit {
        val sel = ObjCRuntime.sel("addColumn")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addColumnWithCells(newCells: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addColumnWithCells:")
        ObjCRuntime.msgSend(null, ptr, sel, newCells)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertColumn(column: Long): Unit {
        val sel = ObjCRuntime.sel("insertColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, column)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertColumn_withCells(column: Long, newCells: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertColumn:withCells:")
        ObjCRuntime.msgSend(null, ptr, sel, column, newCells)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeColumn(col: Long): Unit {
        val sel = ObjCRuntime.sel("removeColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellWithTag(tag: Long): MemorySegment {
        val sel = ObjCRuntime.sel("cellWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, tag) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeToCells(): Unit {
        val sel = ObjCRuntime.sel("sizeToCells")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setValidateSize(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setValidateSize:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawCellAtRow_column(row: Long, col: Long): Unit {
        val sel = ObjCRuntime.sel("drawCellAtRow:column:")
        ObjCRuntime.msgSend(null, ptr, sel, row, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightCell_atRow_column(flag: Boolean, row: Long, col: Long): Unit {
        val sel = ObjCRuntime.sel("highlightCell:atRow:column:")
        ObjCRuntime.msgSend(null, ptr, sel, flag, row, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollCellToVisibleAtRow_column(row: Long, col: Long): Unit {
        val sel = ObjCRuntime.sel("scrollCellToVisibleAtRow:column:")
        ObjCRuntime.msgSend(null, ptr, sel, row, col)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun mouseDown(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseDown:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun performKeyEquivalent(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performKeyEquivalent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendAction(): Boolean {
        val sel = ObjCRuntime.sel("sendAction")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendDoubleAction(): Unit {
        val sel = ObjCRuntime.sel("sendDoubleAction")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textShouldBeginEditing(textObject: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("textShouldBeginEditing:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, textObject) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textShouldEndEditing(textObject: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("textShouldEndEditing:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, textObject) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textDidBeginEditing(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textDidBeginEditing:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textDidEndEditing(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textDidEndEditing:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textDidChange(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textDidChange:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectText(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectText:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectTextAtRow_column(row: Long, col: Long): MemorySegment {
        val sel = ObjCRuntime.sel("selectTextAtRow:column:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row, col) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun acceptsFirstMouse(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("acceptsFirstMouse:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resetCursorRects(): Unit {
        val sel = ObjCRuntime.sel("resetCursorRects")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setToolTip_forCell(toolTipString: MemorySegment, cell: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setToolTip:forCell:")
        ObjCRuntime.msgSend(null, ptr, sel, toolTipString, cell)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setToolTip_forCell(toolTipString: String, cell: MemorySegment): Unit = setToolTip_forCell(ObjCRuntime.newNSString(Arena.global(), toolTipString), cell)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun toolTipForCell(cell: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("toolTipForCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cell) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun toolTipForCellAsString(cell: MemorySegment): String = ObjCRuntime.toJavaString(toolTipForCell(cell))

    // @property cellClass
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellClass(): MemorySegment {
        val sel = ObjCRuntime.sel("cellClass")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCellClass(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCellClass:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property prototype
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun prototype(): MemorySegment {
        val sel = ObjCRuntime.sel("prototype")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPrototype(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrototype:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mode(): NSMatrixMode {
        val sel = ObjCRuntime.sel("mode")
        return NSMatrixMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMode(value: NSMatrixMode) {
        val sel = ObjCRuntime.sel("setMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property cells
    /** @return NSArray<NSCell *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cells(): MemorySegment {
        val sel = ObjCRuntime.sel("cells")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedCell(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedCells
    /** @return NSArray<__kindof NSCell *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedCells(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedCells")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedRow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedRow(): Long {
        val sel = ObjCRuntime.sel("selectedRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedColumn(): Long {
        val sel = ObjCRuntime.sel("selectedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectionByRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSelectionByRect(): Boolean {
        val sel = ObjCRuntime.sel("isSelectionByRect")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionByRect(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelectionByRect:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cellSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellSize(): NSSize {
        val sel = ObjCRuntime.sel("cellSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCellSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setCellSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
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

    // @property cellBackgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellBackgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("cellBackgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCellBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCellBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property drawsCellBackground
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawsCellBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsCellBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDrawsCellBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsCellBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property drawsBackground
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawsBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDrawsBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfRows(): Long {
        val sel = ObjCRuntime.sel("numberOfRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfColumns")
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

    // @property autosizesCells
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosizesCells(): Boolean {
        val sel = ObjCRuntime.sel("autosizesCells")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutosizesCells(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutosizesCells:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autoscroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isAutoscroll(): Boolean {
        val sel = ObjCRuntime.sel("isAutoscroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutoscroll(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutoscroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mouseDownFlags
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mouseDownFlags(): Long {
        val sel = ObjCRuntime.sel("mouseDownFlags")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property delegate
    /** @return id<NSMatrixDelegate> */
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

    // @property autorecalculatesCellSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun autorecalculatesCellSize(): Boolean {
        val sel = ObjCRuntime.sel("autorecalculatesCellSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setAutorecalculatesCellSize(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutorecalculatesCellSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSUserInterfaceValidations. */
fun NSMatrix.validateUserInterfaceItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

// ── Category: NSKeyboardUI on NSMatrix ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSMatrix.tabKeyTraversesCells(): Boolean {
    val sel = ObjCRuntime.sel("tabKeyTraversesCells")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSMatrix.setTabKeyTraversesCells(tabKeyTraversesCells: Boolean): Unit {
    val sel = ObjCRuntime.sel("setTabKeyTraversesCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, tabKeyTraversesCells)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSMatrix.keyCell(): MemorySegment {
    val sel = ObjCRuntime.sel("keyCell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSMatrix.setKeyCell(keyCell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setKeyCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, keyCell)
}
