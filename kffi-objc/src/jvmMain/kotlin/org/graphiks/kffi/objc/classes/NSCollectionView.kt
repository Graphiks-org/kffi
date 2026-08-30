@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionView
 * Superclass: NSView
 * Protocols: NSDraggingSource, NSDraggingDestination
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSCollectionView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionView") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun reloadData(): Unit {
        val sel = ObjCRuntime.sel("reloadData")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun layoutAttributesForItemAtIndexPath(indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesForItemAtIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexPath) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun layoutAttributesForSupplementaryElementOfKind_atIndexPath(kind: MemorySegment, indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesForSupplementaryElementOfKind:atIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, kind, indexPath) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun frameForItemAtIndex(index: Long): NSRect {
        val sel = ObjCRuntime.sel("frameForItemAtIndex:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, index))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun frameForItemAtIndex_withNumberOfItems(index: Long, numberOfItems: Long): NSRect {
        val sel = ObjCRuntime.sel("frameForItemAtIndex:withNumberOfItems:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, index, numberOfItems))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun numberOfItemsInSection(section: Long): Long {
        val sel = ObjCRuntime.sel("numberOfItemsInSection:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, section) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun selectItemsAtIndexPaths_scrollPosition(indexPaths: MemorySegment, scrollPosition: NSCollectionViewScrollPosition): Unit {
        val sel = ObjCRuntime.sel("selectItemsAtIndexPaths:scrollPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths, scrollPosition.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun deselectItemsAtIndexPaths(indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deselectItemsAtIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deselectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deselectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun registerClass_forItemWithIdentifier(itemClass: MemorySegment, identifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerClass:forItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, itemClass, identifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun registerNib_forItemWithIdentifier(nib: MemorySegment, identifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerNib:forItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, nib, identifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun registerClass_forSupplementaryViewOfKind_withIdentifier(viewClass: MemorySegment, kind: MemorySegment, identifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerClass:forSupplementaryViewOfKind:withIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, viewClass, kind, identifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun registerNib_forSupplementaryViewOfKind_withIdentifier(nib: MemorySegment, kind: MemorySegment, identifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("registerNib:forSupplementaryViewOfKind:withIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, nib, kind, identifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun makeItemWithIdentifier_forIndexPath(identifier: MemorySegment, indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeItemWithIdentifier:forIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier, indexPath) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun makeSupplementaryViewOfKind_withIdentifier_forIndexPath(elementKind: MemorySegment, identifier: MemorySegment, indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("makeSupplementaryViewOfKind:withIdentifier:forIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, elementKind, identifier, indexPath) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun itemAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun itemAtIndexPath(indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("itemAtIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexPath) as MemorySegment
    }

    /** @return NSArray<NSCollectionViewItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun visibleItems(): MemorySegment {
        val sel = ObjCRuntime.sel("visibleItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun indexPathsForVisibleItems(): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathsForVisibleItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun indexPathForItem(item: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathForItem:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, item) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun indexPathForItemAtPoint(point: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathForItemAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
    }

    /** @return NSView<NSCollectionViewElement> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun supplementaryViewForElementKind_atIndexPath(elementKind: MemorySegment, indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("supplementaryViewForElementKind:atIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, elementKind, indexPath) as MemorySegment
    }

    /** @return NSArray<NSView<NSCollectionViewElement> *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun visibleSupplementaryViewsOfKind(elementKind: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("visibleSupplementaryViewsOfKind:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, elementKind) as MemorySegment
    }

    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun indexPathsForVisibleSupplementaryElementsOfKind(elementKind: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathsForVisibleSupplementaryElementsOfKind:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, elementKind) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun insertSections(sections: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertSections:")
        ObjCRuntime.msgSend(null, ptr, sel, sections)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun deleteSections(sections: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deleteSections:")
        ObjCRuntime.msgSend(null, ptr, sel, sections)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun reloadSections(sections: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadSections:")
        ObjCRuntime.msgSend(null, ptr, sel, sections)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun moveSection_toSection(section: Long, newSection: Long): Unit {
        val sel = ObjCRuntime.sel("moveSection:toSection:")
        ObjCRuntime.msgSend(null, ptr, sel, section, newSection)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun insertItemsAtIndexPaths(indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertItemsAtIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun deleteItemsAtIndexPaths(indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deleteItemsAtIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun reloadItemsAtIndexPaths(indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadItemsAtIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun moveItemAtIndexPath_toIndexPath(indexPath: MemorySegment, newIndexPath: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveItemAtIndexPath:toIndexPath:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPath, newIndexPath)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun performBatchUpdates_completionHandler(updates: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performBatchUpdates:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, updates, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun toggleSectionCollapse(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleSectionCollapse:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun scrollToItemsAtIndexPaths_scrollPosition(indexPaths: MemorySegment, scrollPosition: NSCollectionViewScrollPosition): Unit {
        val sel = ObjCRuntime.sel("scrollToItemsAtIndexPaths:scrollPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths, scrollPosition.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setDraggingSourceOperationMask_forLocal(dragOperationMask: NSDragOperation, localDestination: Boolean): Unit {
        val sel = ObjCRuntime.sel("setDraggingSourceOperationMask:forLocal:")
        ObjCRuntime.msgSend(null, ptr, sel, dragOperationMask.rawValue, localDestination)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun draggingImageForItemsAtIndexPaths_withEvent_offset(indexPaths: MemorySegment, event: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment {
        val sel = ObjCRuntime.sel("draggingImageForItemsAtIndexPaths:withEvent:offset:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexPaths, event, dragImageOffset.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun draggingImageForItemsAtIndexes_withEvent_offset(indexes: MemorySegment, event: MemorySegment, dragImageOffset: NSPointPointer): MemorySegment {
        val sel = ObjCRuntime.sel("draggingImageForItemsAtIndexes:withEvent:offset:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexes, event, dragImageOffset.segment) as MemorySegment
    }

    // @property dataSource
    /** @return id<NSCollectionViewDataSource> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun dataSource(): MemorySegment {
        val sel = ObjCRuntime.sel("dataSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setDataSource(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDataSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property prefetchDataSource
    /** @return id<NSCollectionViewPrefetching> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun prefetchDataSource(): MemorySegment {
        val sel = ObjCRuntime.sel("prefetchDataSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setPrefetchDataSource(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrefetchDataSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property content
    /** @return NSArray<id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun content(): MemorySegment {
        val sel = ObjCRuntime.sel("content")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContent(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSCollectionViewDelegate> */
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

    // @property backgroundView
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun backgroundView(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setBackgroundView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundViewScrollsWithContent
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun backgroundViewScrollsWithContent(): Boolean {
        val sel = ObjCRuntime.sel("backgroundViewScrollsWithContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setBackgroundViewScrollsWithContent(value: Boolean) {
        val sel = ObjCRuntime.sel("setBackgroundViewScrollsWithContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property collectionViewLayout
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun collectionViewLayout(): MemorySegment {
        val sel = ObjCRuntime.sel("collectionViewLayout")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setCollectionViewLayout(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCollectionViewLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColors
    /** @return NSArray<NSColor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColors(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfSections
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun numberOfSections(): Long {
        val sel = ObjCRuntime.sel("numberOfSections")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property firstResponder
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFirstResponder(): Boolean {
        val sel = ObjCRuntime.sel("isFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property selectable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSelectable(): Boolean {
        val sel = ObjCRuntime.sel("isSelectable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectable(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelectable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsEmptySelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun allowsEmptySelection(): Boolean {
        val sel = ObjCRuntime.sel("allowsEmptySelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setAllowsEmptySelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsEmptySelection:")
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

    // @property selectionIndexes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionIndexes(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionIndexes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionIndexes(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionIndexPaths
    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun selectionIndexPaths(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionIndexPaths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setSelectionIndexPaths(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSDraggingSource. */
fun NSCollectionView.draggingSession_sourceOperationMaskForDraggingContext(session: MemorySegment, context: NSDraggingContext): NSDragOperation {
    val sel = ObjCRuntime.sel("draggingSession:sourceOperationMaskForDraggingContext:")
    return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, session, context.rawValue) as Long)
}

// ── Category: NSDeprecated on NSCollectionView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -[NSCollectionViewDataSource collectionView:itemForRepresentedObjectAtIndexPath:] instead")
fun NSCollectionView.newItemForRepresentedObject(`object`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("newItemForRepresentedObject:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `object`) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -registerNib:forItemWithIdentifier: or -registerClass:forItemWithIdentifier: instead.")
fun NSCollectionView.itemPrototype(): MemorySegment {
    val sel = ObjCRuntime.sel("itemPrototype")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -registerNib:forItemWithIdentifier: or -registerClass:forItemWithIdentifier: instead.")
fun NSCollectionView.setItemPrototype(itemPrototype: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setItemPrototype:")
    ObjCRuntime.msgSend(null, this.ptr, sel, itemPrototype)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its maximumNumberOfRows instead")
fun NSCollectionView.maxNumberOfRows(): Long {
    val sel = ObjCRuntime.sel("maxNumberOfRows")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its maximumNumberOfRows instead")
fun NSCollectionView.setMaxNumberOfRows(maxNumberOfRows: Long): Unit {
    val sel = ObjCRuntime.sel("setMaxNumberOfRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, maxNumberOfRows)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its maximumNumberOfColumns instead")
fun NSCollectionView.maxNumberOfColumns(): Long {
    val sel = ObjCRuntime.sel("maxNumberOfColumns")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its maximumNumberOfColumns instead")
fun NSCollectionView.setMaxNumberOfColumns(maxNumberOfColumns: Long): Unit {
    val sel = ObjCRuntime.sel("setMaxNumberOfColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, maxNumberOfColumns)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its minimumItemSize instead")
fun NSCollectionView.minItemSize(): NSSize {
    val sel = ObjCRuntime.sel("minItemSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its minimumItemSize instead")
fun NSCollectionView.setMinItemSize(minItemSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("setMinItemSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(minItemSize.segment, NSSize.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its maximumItemSize instead")
fun NSCollectionView.maxItemSize(): NSSize {
    val sel = ObjCRuntime.sel("maxItemSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use NSCollectionViewGridLayout as the receiver's collectionViewLayout, setting its maximumItemSize instead")
fun NSCollectionView.setMaxItemSize(maxItemSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("setMaxItemSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(maxItemSize.segment, NSSize.layout))
}
