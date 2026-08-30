@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableRowView
 * Superclass: NSView
 * Protocols: NSAccessibilityRow
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
open class NSTableRowView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTableRowView") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawBackgroundInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawBackgroundInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawSelectionInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawSelectionInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawSeparatorInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawSeparatorInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawDraggingDestinationFeedbackInRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawDraggingDestinationFeedbackInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewAtColumn(column: Long): MemorySegment {
        val sel = ObjCRuntime.sel("viewAtColumn:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, column) as MemorySegment
    }

    // @property selectionHighlightStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionHighlightStyle(): NSTableViewSelectionHighlightStyle {
        val sel = ObjCRuntime.sel("selectionHighlightStyle")
        return NSTableViewSelectionHighlightStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionHighlightStyle(value: NSTableViewSelectionHighlightStyle) {
        val sel = ObjCRuntime.sel("setSelectionHighlightStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property emphasized
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEmphasized(): Boolean {
        val sel = ObjCRuntime.sel("isEmphasized")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEmphasized(value: Boolean) {
        val sel = ObjCRuntime.sel("setEmphasized:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property groupRowStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isGroupRowStyle(): Boolean {
        val sel = ObjCRuntime.sel("isGroupRowStyle")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setGroupRowStyle(value: Boolean) {
        val sel = ObjCRuntime.sel("setGroupRowStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selected
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSelected(): Boolean {
        val sel = ObjCRuntime.sel("isSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property previousRowSelected
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun isPreviousRowSelected(): Boolean {
        val sel = ObjCRuntime.sel("isPreviousRowSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setPreviousRowSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setPreviousRowSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property nextRowSelected
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun isNextRowSelected(): Boolean {
        val sel = ObjCRuntime.sel("isNextRowSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setNextRowSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setNextRowSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property floating
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFloating(): Boolean {
        val sel = ObjCRuntime.sel("isFloating")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFloating(value: Boolean) {
        val sel = ObjCRuntime.sel("setFloating:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property targetForDropOperation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isTargetForDropOperation(): Boolean {
        val sel = ObjCRuntime.sel("isTargetForDropOperation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTargetForDropOperation(value: Boolean) {
        val sel = ObjCRuntime.sel("setTargetForDropOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggingDestinationFeedbackStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingDestinationFeedbackStyle(): NSTableViewDraggingDestinationFeedbackStyle {
        val sel = ObjCRuntime.sel("draggingDestinationFeedbackStyle")
        return NSTableViewDraggingDestinationFeedbackStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDraggingDestinationFeedbackStyle(value: NSTableViewDraggingDestinationFeedbackStyle) {
        val sel = ObjCRuntime.sel("setDraggingDestinationFeedbackStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property indentationForDropOperation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indentationForDropOperation(): Double {
        val sel = ObjCRuntime.sel("indentationForDropOperation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIndentationForDropOperation(value: Double) {
        val sel = ObjCRuntime.sel("setIndentationForDropOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property interiorBackgroundStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun interiorBackgroundStyle(): NSBackgroundStyle {
        val sel = ObjCRuntime.sel("interiorBackgroundStyle")
        return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
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

    // @property numberOfColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfColumns(): Long {
        val sel = ObjCRuntime.sel("numberOfColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
