@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewFlowLayout
 * Superclass: NSCollectionViewLayout
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSCollectionViewFlowLayout(override val ptr: MemorySegment) : NSCollectionViewLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewFlowLayout") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun sectionAtIndexIsCollapsed(sectionIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("sectionAtIndexIsCollapsed:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, sectionIndex) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun collapseSectionAtIndex(sectionIndex: Long): Unit {
        val sel = ObjCRuntime.sel("collapseSectionAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun expandSectionAtIndex(sectionIndex: Long): Unit {
        val sel = ObjCRuntime.sel("expandSectionAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIndex)
    }

    // @property minimumLineSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minimumLineSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumLineSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinimumLineSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumLineSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumInteritemSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minimumInteritemSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumInteritemSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinimumInteritemSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumInteritemSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property itemSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemSize(): NSSize {
        val sel = ObjCRuntime.sel("itemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property estimatedItemSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun estimatedItemSize(): NSSize {
        val sel = ObjCRuntime.sel("estimatedItemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEstimatedItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setEstimatedItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property scrollDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollDirection(): NSCollectionViewScrollDirection {
        val sel = ObjCRuntime.sel("scrollDirection")
        return NSCollectionViewScrollDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setScrollDirection(value: NSCollectionViewScrollDirection) {
        val sel = ObjCRuntime.sel("setScrollDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property headerReferenceSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun headerReferenceSize(): NSSize {
        val sel = ObjCRuntime.sel("headerReferenceSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHeaderReferenceSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setHeaderReferenceSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property footerReferenceSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun footerReferenceSize(): NSSize {
        val sel = ObjCRuntime.sel("footerReferenceSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFooterReferenceSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setFooterReferenceSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property sectionInset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sectionInset(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("sectionInset")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSectionInset(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setSectionInset:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property sectionHeadersPinToVisibleBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun sectionHeadersPinToVisibleBounds(): Boolean {
        val sel = ObjCRuntime.sel("sectionHeadersPinToVisibleBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setSectionHeadersPinToVisibleBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setSectionHeadersPinToVisibleBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sectionFootersPinToVisibleBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun sectionFootersPinToVisibleBounds(): Boolean {
        val sel = ObjCRuntime.sel("sectionFootersPinToVisibleBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setSectionFootersPinToVisibleBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setSectionFootersPinToVisibleBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
