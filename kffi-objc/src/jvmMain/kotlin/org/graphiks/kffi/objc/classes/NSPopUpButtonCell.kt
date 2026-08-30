@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPopUpButtonCell
 * Superclass: NSMenuItemCell
 * Protocols: NSMenuItemValidation
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPopUpButtonCell(override val ptr: MemorySegment) : NSMenuItemCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPopUpButtonCell") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initTextCell_pullsDown(stringValue: MemorySegment, pullDown: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:pullsDown:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, stringValue, pullDown) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initTextCell_pullsDown(stringValue: String, pullDown: Boolean): MemorySegment = initTextCell_pullsDown(ObjCRuntime.newNSString(Arena.global(), stringValue), pullDown)

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addItemWithTitle(title: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addItemWithTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, title)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun addItemWithTitle(title: String): Unit = addItemWithTitle(ObjCRuntime.newNSString(Arena.global(), title))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addItemsWithTitles(itemTitles: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addItemsWithTitles:")
        ObjCRuntime.msgSend(null, ptr, sel, itemTitles)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertItemWithTitle_atIndex(title: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertItemWithTitle:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, title, index)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun insertItemWithTitle_atIndex(title: String, index: Long): Unit = insertItemWithTitle_atIndex(ObjCRuntime.newNSString(Arena.global(), title), index)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeItemWithTitle(title: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeItemWithTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, title)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun removeItemWithTitle(title: String): Unit = removeItemWithTitle(ObjCRuntime.newNSString(Arena.global(), title))

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
    open fun indexOfItem(item: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, item) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfItemWithTitle(title: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfItemWithTitle:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, title) as Long
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun indexOfItemWithTitle(title: String): Long = indexOfItemWithTitle(ObjCRuntime.newNSString(Arena.global(), title))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfItemWithTag(tag: Long): Long {
        val sel = ObjCRuntime.sel("indexOfItemWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, tag) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfItemWithRepresentedObject(obj: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfItemWithRepresentedObject:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, obj) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfItemWithTarget_andAction(target: MemorySegment, actionSelector: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfItemWithTarget:andAction:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, target, actionSelector) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemWithTitle(title: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("itemWithTitle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, title) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun itemWithTitle(title: String): MemorySegment = itemWithTitle(ObjCRuntime.newNSString(Arena.global(), title))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectItem(item: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectItem:")
        ObjCRuntime.msgSend(null, ptr, sel, item)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectItemAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("selectItemAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectItemWithTitle(title: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectItemWithTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, title)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun selectItemWithTitle(title: String): Unit = selectItemWithTitle(ObjCRuntime.newNSString(Arena.global(), title))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectItemWithTag(tag: Long): Boolean {
        val sel = ObjCRuntime.sel("selectItemWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, tag) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setTitle(string: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, string)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun synchronizeTitleAndSelectedItem(): Unit {
        val sel = ObjCRuntime.sel("synchronizeTitleAndSelectedItem")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemTitleAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemTitleAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun itemTitleAtIndexAsString(index: Long): String = ObjCRuntime.toJavaString(itemTitleAtIndex(index))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attachPopUpWithFrame_inView(cellFrame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("attachPopUpWithFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dismissPopUp(): Unit {
        val sel = ObjCRuntime.sel("dismissPopUp")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performClickWithFrame_inView(frame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performClickWithFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), controlView)
    }

    // @property menu
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun menu(): MemorySegment {
        val sel = ObjCRuntime.sel("menu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pullsDown
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pullsDown(): Boolean {
        val sel = ObjCRuntime.sel("pullsDown")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPullsDown(value: Boolean) {
        val sel = ObjCRuntime.sel("setPullsDown:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autoenablesItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autoenablesItems(): Boolean {
        val sel = ObjCRuntime.sel("autoenablesItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutoenablesItems(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutoenablesItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredEdge
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preferredEdge(): NSRectEdge {
        val sel = ObjCRuntime.sel("preferredEdge")
        return NSRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreferredEdge(value: NSRectEdge) {
        val sel = ObjCRuntime.sel("setPreferredEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property usesItemFromMenu
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usesItemFromMenu(): Boolean {
        val sel = ObjCRuntime.sel("usesItemFromMenu")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUsesItemFromMenu(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesItemFromMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property altersStateOfSelectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun altersStateOfSelectedItem(): Boolean {
        val sel = ObjCRuntime.sel("altersStateOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAltersStateOfSelectedItem(value: Boolean) {
        val sel = ObjCRuntime.sel("setAltersStateOfSelectedItem:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property itemArray
    /** @return NSArray<NSMenuItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemArray(): MemorySegment {
        val sel = ObjCRuntime.sel("itemArray")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfItems(): Long {
        val sel = ObjCRuntime.sel("numberOfItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property lastItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun lastItem(): MemorySegment {
        val sel = ObjCRuntime.sel("lastItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedItem(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property indexOfSelectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfSelectedItem(): Long {
        val sel = ObjCRuntime.sel("indexOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property itemTitles
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemTitles(): MemorySegment {
        val sel = ObjCRuntime.sel("itemTitles")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property titleOfSelectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleOfSelectedItem(): MemorySegment {
        val sel = ObjCRuntime.sel("titleOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleOfSelectedItemAsString(): String = ObjCRuntime.toJavaString(titleOfSelectedItem())

    // @property arrowPosition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun arrowPosition(): NSPopUpArrowPosition {
        val sel = ObjCRuntime.sel("arrowPosition")
        return NSPopUpArrowPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setArrowPosition(value: NSPopUpArrowPosition) {
        val sel = ObjCRuntime.sel("setArrowPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
