package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTabView
 * Superclass: NSView
 */
open class NSTabView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTabView") }

    }

    open fun selectTabViewItem(tabViewItem: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, tabViewItem)
    }

    open fun selectTabViewItemAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("selectTabViewItemAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    open fun selectTabViewItemWithIdentifier(identifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectTabViewItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, identifier)
    }

    open fun takeSelectedTabViewItemFromSender(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeSelectedTabViewItemFromSender:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun selectFirstTabViewItem(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectFirstTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun selectLastTabViewItem(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectLastTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun selectNextTabViewItem(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectNextTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun selectPreviousTabViewItem(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectPreviousTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun addTabViewItem(tabViewItem: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, tabViewItem)
    }

    open fun insertTabViewItem_atIndex(tabViewItem: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertTabViewItem:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, tabViewItem, index)
    }

    open fun removeTabViewItem(tabViewItem: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeTabViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, tabViewItem)
    }

    open fun tabViewItemAtPoint(point: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("tabViewItemAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
    }

    open fun indexOfTabViewItem(tabViewItem: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfTabViewItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, tabViewItem) as Long
    }

    open fun tabViewItemAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("tabViewItemAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    open fun indexOfTabViewItemWithIdentifier(identifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfTabViewItemWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, identifier) as Long
    }

    // @property selectedTabViewItem
    open fun selectedTabViewItem(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedTabViewItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property font
    open fun font(): MemorySegment {
        val sel = ObjCRuntime.sel("font")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFont(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFont:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tabViewType
    open fun tabViewType(): NSTabViewType {
        val sel = ObjCRuntime.sel("tabViewType")
        return NSTabViewType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTabViewType(value: NSTabViewType) {
        val sel = ObjCRuntime.sel("setTabViewType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property tabPosition
    open fun tabPosition(): NSTabPosition {
        val sel = ObjCRuntime.sel("tabPosition")
        return NSTabPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTabPosition(value: NSTabPosition) {
        val sel = ObjCRuntime.sel("setTabPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property tabViewBorderType
    open fun tabViewBorderType(): NSTabViewBorderType {
        val sel = ObjCRuntime.sel("tabViewBorderType")
        return NSTabViewBorderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTabViewBorderType(value: NSTabViewBorderType) {
        val sel = ObjCRuntime.sel("setTabViewBorderType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property tabViewItems
    /** @return NSArray<__kindof NSTabViewItem *> * */
    open fun tabViewItems(): MemorySegment {
        val sel = ObjCRuntime.sel("tabViewItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTabViewItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTabViewItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsTruncatedLabels
    open fun allowsTruncatedLabels(): Boolean {
        val sel = ObjCRuntime.sel("allowsTruncatedLabels")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsTruncatedLabels(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsTruncatedLabels:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumSize
    open fun minimumSize(): NSSize {
        val sel = ObjCRuntime.sel("minimumSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

    // @property drawsBackground
    open fun drawsBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setDrawsBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property controlSize
    open fun controlSize(): NSControlSize {
        val sel = ObjCRuntime.sel("controlSize")
        return NSControlSize(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setControlSize(value: NSControlSize) {
        val sel = ObjCRuntime.sel("setControlSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property delegate
    /** @return id<NSTabViewDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentRect
    open fun contentRect(): NSRect {
        val sel = ObjCRuntime.sel("contentRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property numberOfTabViewItems
    open fun numberOfTabViewItems(): Long {
        val sel = ObjCRuntime.sel("numberOfTabViewItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property controlTint
    open fun controlTint(): NSControlTint {
        val sel = ObjCRuntime.sel("controlTint")
        return NSControlTint(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setControlTint(value: NSControlTint) {
        val sel = ObjCRuntime.sel("setControlTint:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
