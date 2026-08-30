@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubber
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubber(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSScrubber") } }

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
    open fun reloadData(): Unit {
        val sel = ObjCRuntime.sel("reloadData")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performSequentialBatchUpdates(updateBlock: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performSequentialBatchUpdates:")
        ObjCRuntime.msgSend(null, ptr, sel, updateBlock)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertItemsAtIndexes(indexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertItemsAtIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeItemsAtIndexes(indexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeItemsAtIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadItemsAtIndexes(indexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadItemsAtIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveItemAtIndex_toIndex(oldIndex: Long, newIndex: Long): Unit {
        val sel = ObjCRuntime.sel("moveItemAtIndex:toIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, oldIndex, newIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollItemAtIndex_toAlignment(index: Long, alignment: NSScrubberAlignment): Unit {
        val sel = ObjCRuntime.sel("scrollItemAtIndex:toAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, index, alignment.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemViewForItemAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemViewForItemAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun registerClass_forItemIdentifier(itemViewClass: MemorySegment, itemIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerClass:forItemIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, itemViewClass, itemIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun registerNib_forItemIdentifier(nib: MemorySegment, itemIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerNib:forItemIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, nib, itemIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeItemWithIdentifier_owner(itemIdentifier: MemorySegment, owner: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeItemWithIdentifier:owner:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, itemIdentifier, owner) as MemorySegment
    }

    // @property dataSource
    /** @return id<NSScrubberDataSource> */
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
    /** @return id<NSScrubberDelegate> */
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

    // @property scrubberLayout
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrubberLayout(): MemorySegment {
        val sel = ObjCRuntime.sel("scrubberLayout")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setScrubberLayout(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setScrubberLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfItems(): Long {
        val sel = ObjCRuntime.sel("numberOfItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property highlightedIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightedIndex(): Long {
        val sel = ObjCRuntime.sel("highlightedIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedIndex(): Long {
        val sel = ObjCRuntime.sel("selectedIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectedIndex(value: Long) {
        val sel = ObjCRuntime.sel("setSelectedIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mode(): NSScrubberMode {
        val sel = ObjCRuntime.sel("mode")
        return NSScrubberMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMode(value: NSScrubberMode) {
        val sel = ObjCRuntime.sel("setMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property itemAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemAlignment(): NSScrubberAlignment {
        val sel = ObjCRuntime.sel("itemAlignment")
        return NSScrubberAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemAlignment(value: NSScrubberAlignment) {
        val sel = ObjCRuntime.sel("setItemAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property continuous
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isContinuous(): Boolean {
        val sel = ObjCRuntime.sel("isContinuous")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContinuous(value: Boolean) {
        val sel = ObjCRuntime.sel("setContinuous:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property floatsSelectionViews
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun floatsSelectionViews(): Boolean {
        val sel = ObjCRuntime.sel("floatsSelectionViews")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFloatsSelectionViews(value: Boolean) {
        val sel = ObjCRuntime.sel("setFloatsSelectionViews:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionBackgroundStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionBackgroundStyle(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionBackgroundStyle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionBackgroundStyle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionBackgroundStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionOverlayStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionOverlayStyle(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionOverlayStyle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionOverlayStyle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionOverlayStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsArrowButtons
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsArrowButtons(): Boolean {
        val sel = ObjCRuntime.sel("showsArrowButtons")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsArrowButtons(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsArrowButtons:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsAdditionalContentIndicators
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsAdditionalContentIndicators(): Boolean {
        val sel = ObjCRuntime.sel("showsAdditionalContentIndicators")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsAdditionalContentIndicators(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsAdditionalContentIndicators:")
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

    // @property backgroundView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundView(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
