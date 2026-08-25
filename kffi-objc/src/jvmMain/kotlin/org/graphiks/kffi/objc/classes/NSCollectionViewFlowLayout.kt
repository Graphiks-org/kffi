package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewFlowLayout
 * Superclass: NSCollectionViewLayout
 */
open class NSCollectionViewFlowLayout(override val ptr: MemorySegment) : NSCollectionViewLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewFlowLayout") }

    }

    open fun sectionAtIndexIsCollapsed(sectionIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("sectionAtIndexIsCollapsed:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, sectionIndex) as Boolean
    }

    open fun collapseSectionAtIndex(sectionIndex: Long): Unit {
        val sel = ObjCRuntime.sel("collapseSectionAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIndex)
    }

    open fun expandSectionAtIndex(sectionIndex: Long): Unit {
        val sel = ObjCRuntime.sel("expandSectionAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIndex)
    }

    // @property minimumLineSpacing
    open fun minimumLineSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumLineSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMinimumLineSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumLineSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumInteritemSpacing
    open fun minimumInteritemSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumInteritemSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMinimumInteritemSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumInteritemSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property itemSize
    open fun itemSize(): NSSize {
        val sel = ObjCRuntime.sel("itemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property estimatedItemSize
    open fun estimatedItemSize(): NSSize {
        val sel = ObjCRuntime.sel("estimatedItemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setEstimatedItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setEstimatedItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property scrollDirection
    open fun scrollDirection(): NSCollectionViewScrollDirection {
        val sel = ObjCRuntime.sel("scrollDirection")
        return NSCollectionViewScrollDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setScrollDirection(value: NSCollectionViewScrollDirection) {
        val sel = ObjCRuntime.sel("setScrollDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property headerReferenceSize
    open fun headerReferenceSize(): NSSize {
        val sel = ObjCRuntime.sel("headerReferenceSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setHeaderReferenceSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setHeaderReferenceSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property footerReferenceSize
    open fun footerReferenceSize(): NSSize {
        val sel = ObjCRuntime.sel("footerReferenceSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setFooterReferenceSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setFooterReferenceSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property sectionInset
    open fun sectionInset(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("sectionInset")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    open fun setSectionInset(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setSectionInset:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property sectionHeadersPinToVisibleBounds
    open fun sectionHeadersPinToVisibleBounds(): Boolean {
        val sel = ObjCRuntime.sel("sectionHeadersPinToVisibleBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSectionHeadersPinToVisibleBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setSectionHeadersPinToVisibleBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sectionFootersPinToVisibleBounds
    open fun sectionFootersPinToVisibleBounds(): Boolean {
        val sel = ObjCRuntime.sel("sectionFootersPinToVisibleBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSectionFootersPinToVisibleBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setSectionFootersPinToVisibleBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
