@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSComboBox
 * Superclass: NSTextField
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSComboBox(override val ptr: MemorySegment) : NSTextField(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSComboBox") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadData(): Unit {
        val sel = ObjCRuntime.sel("reloadData")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun noteNumberOfItemsChanged(): Unit {
        val sel = ObjCRuntime.sel("noteNumberOfItemsChanged")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollItemAtIndexToTop(index: Long): Unit {
        val sel = ObjCRuntime.sel("scrollItemAtIndexToTop:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollItemAtIndexToVisible(index: Long): Unit {
        val sel = ObjCRuntime.sel("scrollItemAtIndexToVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectItemAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("selectItemAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectItemAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("deselectItemAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addItemWithObjectValue(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addItemWithObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addItemsWithObjectValues(objects: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addItemsWithObjectValues:")
        ObjCRuntime.msgSend(null, ptr, sel, objects)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertItemWithObjectValue_atIndex(`object`: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertItemWithObjectValue:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeItemWithObjectValue(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeItemWithObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeItemAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeItemAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeAllItems(): Unit {
        val sel = ObjCRuntime.sel("removeAllItems")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectItemWithObjectValue(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectItemWithObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemObjectValueAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemObjectValueAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfItemWithObjectValue(`object`: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfItemWithObjectValue:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, `object`) as Long
    }

    // @property hasVerticalScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasVerticalScroller(): Boolean {
        val sel = ObjCRuntime.sel("hasVerticalScroller")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHasVerticalScroller(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasVerticalScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property itemHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemHeight(): Double {
        val sel = ObjCRuntime.sel("itemHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemHeight(value: Double) {
        val sel = ObjCRuntime.sel("setItemHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfVisibleItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfVisibleItems(): Long {
        val sel = ObjCRuntime.sel("numberOfVisibleItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNumberOfVisibleItems(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfVisibleItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property buttonBordered
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isButtonBordered(): Boolean {
        val sel = ObjCRuntime.sel("isButtonBordered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setButtonBordered(value: Boolean) {
        val sel = ObjCRuntime.sel("setButtonBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesDataSource
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usesDataSource(): Boolean {
        val sel = ObjCRuntime.sel("usesDataSource")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUsesDataSource(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesDataSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property indexOfSelectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfSelectedItem(): Long {
        val sel = ObjCRuntime.sel("indexOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfItems(): Long {
        val sel = ObjCRuntime.sel("numberOfItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property completes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun completes(): Boolean {
        val sel = ObjCRuntime.sel("completes")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCompletes(value: Boolean) {
        val sel = ObjCRuntime.sel("setCompletes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSComboBoxDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property dataSource
    /** @return id<NSComboBoxDataSource> */
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

    // @property objectValueOfSelectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun objectValueOfSelectedItem(): MemorySegment {
        val sel = ObjCRuntime.sel("objectValueOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property objectValues
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun objectValues(): MemorySegment {
        val sel = ObjCRuntime.sel("objectValues")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
