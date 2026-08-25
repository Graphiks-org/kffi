package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableRowView
 * Superclass: NSView
 * Protocols: NSAccessibilityRow
 */
open class NSTableRowView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTableRowView") }

    }

    open fun drawBackgroundInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawBackgroundInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    open fun drawSelectionInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawSelectionInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    open fun drawSeparatorInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawSeparatorInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    open fun drawDraggingDestinationFeedbackInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawDraggingDestinationFeedbackInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    open fun viewAtColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("viewAtColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    // @property selectionHighlightStyle
    open fun selectionHighlightStyle(): NSTableViewSelectionHighlightStyle {
        val sel = ObjCRuntime.sel("selectionHighlightStyle")
        return NSTableViewSelectionHighlightStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setSelectionHighlightStyle(value: NSTableViewSelectionHighlightStyle) {
        val sel = ObjCRuntime.sel("setSelectionHighlightStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property emphasized
    open fun isEmphasized(): Boolean {
        val sel = ObjCRuntime.sel("isEmphasized")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setEmphasized(value: Boolean) {
        val sel = ObjCRuntime.sel("setEmphasized:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property groupRowStyle
    open fun isGroupRowStyle(): Boolean {
        val sel = ObjCRuntime.sel("isGroupRowStyle")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setGroupRowStyle(value: Boolean) {
        val sel = ObjCRuntime.sel("setGroupRowStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selected
    open fun isSelected(): Boolean {
        val sel = ObjCRuntime.sel("isSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property previousRowSelected
    open fun isPreviousRowSelected(): Boolean {
        val sel = ObjCRuntime.sel("isPreviousRowSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setPreviousRowSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setPreviousRowSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property nextRowSelected
    open fun isNextRowSelected(): Boolean {
        val sel = ObjCRuntime.sel("isNextRowSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setNextRowSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setNextRowSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property floating
    open fun isFloating(): Boolean {
        val sel = ObjCRuntime.sel("isFloating")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setFloating(value: Boolean) {
        val sel = ObjCRuntime.sel("setFloating:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property targetForDropOperation
    open fun isTargetForDropOperation(): Boolean {
        val sel = ObjCRuntime.sel("isTargetForDropOperation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setTargetForDropOperation(value: Boolean) {
        val sel = ObjCRuntime.sel("setTargetForDropOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggingDestinationFeedbackStyle
    open fun draggingDestinationFeedbackStyle(): NSTableViewDraggingDestinationFeedbackStyle {
        val sel = ObjCRuntime.sel("draggingDestinationFeedbackStyle")
        return NSTableViewDraggingDestinationFeedbackStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDraggingDestinationFeedbackStyle(value: NSTableViewDraggingDestinationFeedbackStyle) {
        val sel = ObjCRuntime.sel("setDraggingDestinationFeedbackStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property indentationForDropOperation
    open fun indentationForDropOperation(): Double {
        val sel = ObjCRuntime.sel("indentationForDropOperation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setIndentationForDropOperation(value: Double) {
        val sel = ObjCRuntime.sel("setIndentationForDropOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property interiorBackgroundStyle
    open fun interiorBackgroundStyle(): NSBackgroundStyle {
        val sel = ObjCRuntime.sel("interiorBackgroundStyle")
        return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property backgroundColor
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfColumns
    open fun numberOfColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
