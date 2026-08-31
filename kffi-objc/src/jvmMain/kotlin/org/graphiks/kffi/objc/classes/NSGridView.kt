@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGridView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
open class NSGridView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSGridView") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun gridViewWithNumberOfColumns_rows(columnCount: Long, rowCount: Long): MemorySegment {
            val sel = ObjCRuntime.sel("gridViewWithNumberOfColumns:rows:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, columnCount, rowCount) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun gridViewWithViews(rows: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("gridViewWithViews:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, rows) as MemorySegment
        }

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
    open fun rowAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("rowAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfRow(row: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfRow:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, row) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("columnAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfColumn(column: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfColumn:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, column) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellAtColumnIndex_rowIndex(columnIndex: Long, rowIndex: Long): MemorySegment {
        val sel = ObjCRuntime.sel("cellAtColumnIndex:rowIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, columnIndex, rowIndex) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellForView(view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("cellForView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, view) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addRowWithViews(views: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("addRowWithViews:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, views) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertRowAtIndex_withViews(index: Long, views: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("insertRowAtIndex:withViews:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index, views) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveRowAtIndex_toIndex(fromIndex: Long, toIndex: Long): Unit {
        val sel = ObjCRuntime.sel("moveRowAtIndex:toIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, fromIndex, toIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeRowAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeRowAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addColumnWithViews(views: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("addColumnWithViews:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, views) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertColumnAtIndex_withViews(index: Long, views: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("insertColumnAtIndex:withViews:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index, views) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveColumnAtIndex_toIndex(fromIndex: Long, toIndex: Long): Unit {
        val sel = ObjCRuntime.sel("moveColumnAtIndex:toIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, fromIndex, toIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeColumnAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeColumnAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mergeCellsInHorizontalRange_verticalRange(hRange: NSRange, vRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("mergeCellsInHorizontalRange:verticalRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(hRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(vRange.segment, NSRange.layout))
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

    // @property xPlacement
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun xPlacement(): NSGridCellPlacement {
        val sel = ObjCRuntime.sel("xPlacement")
        return NSGridCellPlacement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setXPlacement(value: NSGridCellPlacement) {
        val sel = ObjCRuntime.sel("setXPlacement:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property yPlacement
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun yPlacement(): NSGridCellPlacement {
        val sel = ObjCRuntime.sel("yPlacement")
        return NSGridCellPlacement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setYPlacement(value: NSGridCellPlacement) {
        val sel = ObjCRuntime.sel("setYPlacement:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property rowAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowAlignment(): NSGridRowAlignment {
        val sel = ObjCRuntime.sel("rowAlignment")
        return NSGridRowAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowAlignment(value: NSGridRowAlignment) {
        val sel = ObjCRuntime.sel("setRowAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property rowSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowSpacing(): Double {
        val sel = ObjCRuntime.sel("rowSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setRowSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property columnSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnSpacing(): Double {
        val sel = ObjCRuntime.sel("columnSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColumnSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setColumnSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
