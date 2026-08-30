@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOutlineView
 * Superclass: NSTableView
 * Protocols: NSAccessibilityOutline
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSOutlineView(override val ptr: MemorySegment) : NSTableView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSOutlineView") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isExpandable(item: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isExpandable:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, item) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun numberOfChildrenOfItem(item: MemorySegment): Long {
        val sel = ObjCRuntime.sel("numberOfChildrenOfItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, item) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun child_ofItem(index: Long, item: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("child:ofItem:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index, item) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun expandItem_expandChildren(item: MemorySegment, expandChildren: Boolean): Unit {
        val sel = ObjCRuntime.sel("expandItem:expandChildren:")
        ObjCRuntime.msgSend(null, ptr, sel, item, expandChildren)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun expandItem(item: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("expandItem:")
        ObjCRuntime.msgSend(null, ptr, sel, item)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun collapseItem_collapseChildren(item: MemorySegment, collapseChildren: Boolean): Unit {
        val sel = ObjCRuntime.sel("collapseItem:collapseChildren:")
        ObjCRuntime.msgSend(null, ptr, sel, item, collapseChildren)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun collapseItem(item: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("collapseItem:")
        ObjCRuntime.msgSend(null, ptr, sel, item)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadItem_reloadChildren(item: MemorySegment, reloadChildren: Boolean): Unit {
        val sel = ObjCRuntime.sel("reloadItem:reloadChildren:")
        ObjCRuntime.msgSend(null, ptr, sel, item, reloadChildren)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadItem(item: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadItem:")
        ObjCRuntime.msgSend(null, ptr, sel, item)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun parentForItem(item: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("parentForItem:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, item) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun childIndexForItem(item: MemorySegment): Long {
        val sel = ObjCRuntime.sel("childIndexForItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, item) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemAtRow(row: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemAtRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowForItem(item: MemorySegment): Long {
        val sel = ObjCRuntime.sel("rowForItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, item) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun levelForItem(item: MemorySegment): Long {
        val sel = ObjCRuntime.sel("levelForItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, item) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun levelForRow(row: Long): Long {
        val sel = ObjCRuntime.sel("levelForRow:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, row) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isItemExpanded(item: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isItemExpanded:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, item) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun frameOfOutlineCellAtRow(row: Long): NSRect {
        val sel = ObjCRuntime.sel("frameOfOutlineCellAtRow:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, row))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDropItem_dropChildIndex(item: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("setDropItem:dropChildIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, item, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldCollapseAutoExpandedItemsForDeposited(deposited: Boolean): Boolean {
        val sel = ObjCRuntime.sel("shouldCollapseAutoExpandedItemsForDeposited:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, deposited) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun insertItemsAtIndexes_inParent_withAnimation(indexes: MemorySegment, parent: MemorySegment, animationOptions: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("insertItemsAtIndexes:inParent:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, parent, animationOptions.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun removeItemsAtIndexes_inParent_withAnimation(indexes: MemorySegment, parent: MemorySegment, animationOptions: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("removeItemsAtIndexes:inParent:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, parent, animationOptions.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun moveItemAtIndex_inParent_toIndex_inParent(fromIndex: Long, oldParent: MemorySegment, toIndex: Long, newParent: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveItemAtIndex:inParent:toIndex:inParent:")
        ObjCRuntime.msgSend(null, ptr, sel, fromIndex, oldParent, toIndex, newParent)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun insertRowsAtIndexes_withAnimation(indexes: MemorySegment, animationOptions: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("insertRowsAtIndexes:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, animationOptions.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun removeRowsAtIndexes_withAnimation(indexes: MemorySegment, animationOptions: NSTableViewAnimationOptions): Unit {
        val sel = ObjCRuntime.sel("removeRowsAtIndexes:withAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, animationOptions.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun moveRowAtIndex_toIndex(oldIndex: Long, newIndex: Long): Unit {
        val sel = ObjCRuntime.sel("moveRowAtIndex:toIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, oldIndex, newIndex)
    }

    // @property delegate
    /** @return id<NSOutlineViewDelegate> */
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
    /** @return id<NSOutlineViewDataSource> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun dataSource(): MemorySegment {
        val sel = ObjCRuntime.sel("dataSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setDataSource(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDataSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property outlineTableColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun outlineTableColumn(): MemorySegment {
        val sel = ObjCRuntime.sel("outlineTableColumn")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOutlineTableColumn(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setOutlineTableColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property indentationPerLevel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indentationPerLevel(): Double {
        val sel = ObjCRuntime.sel("indentationPerLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIndentationPerLevel(value: Double) {
        val sel = ObjCRuntime.sel("setIndentationPerLevel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property indentationMarkerFollowsCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indentationMarkerFollowsCell(): Boolean {
        val sel = ObjCRuntime.sel("indentationMarkerFollowsCell")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIndentationMarkerFollowsCell(value: Boolean) {
        val sel = ObjCRuntime.sel("setIndentationMarkerFollowsCell:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autoresizesOutlineColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autoresizesOutlineColumn(): Boolean {
        val sel = ObjCRuntime.sel("autoresizesOutlineColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutoresizesOutlineColumn(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutoresizesOutlineColumn:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autosaveExpandedItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autosaveExpandedItems(): Boolean {
        val sel = ObjCRuntime.sel("autosaveExpandedItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutosaveExpandedItems(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutosaveExpandedItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property userInterfaceLayoutDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun userInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection {
        val sel = ObjCRuntime.sel("userInterfaceLayoutDirection")
        return NSUserInterfaceLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun setUserInterfaceLayoutDirection(value: NSUserInterfaceLayoutDirection) {
        val sel = ObjCRuntime.sel("setUserInterfaceLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property stronglyReferencesItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun stronglyReferencesItems(): Boolean {
        val sel = ObjCRuntime.sel("stronglyReferencesItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setStronglyReferencesItems(value: Boolean) {
        val sel = ObjCRuntime.sel("setStronglyReferencesItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
