@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewLayoutInvalidationContext
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSCollectionViewLayoutInvalidationContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionViewLayoutInvalidationContext") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateItemsAtIndexPaths(indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invalidateItemsAtIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, indexPaths)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateSupplementaryElementsOfKind_atIndexPaths(elementKind: MemorySegment, indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invalidateSupplementaryElementsOfKind:atIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, elementKind, indexPaths)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateDecorationElementsOfKind_atIndexPaths(elementKind: MemorySegment, indexPaths: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invalidateDecorationElementsOfKind:atIndexPaths:")
        ObjCRuntime.msgSend(null, ptr, sel, elementKind, indexPaths)
    }

    // @property invalidateEverything
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateEverything(): Boolean {
        val sel = ObjCRuntime.sel("invalidateEverything")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property invalidateDataSourceCounts
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateDataSourceCounts(): Boolean {
        val sel = ObjCRuntime.sel("invalidateDataSourceCounts")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property invalidatedItemIndexPaths
    /** @return NSSet<NSIndexPath *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidatedItemIndexPaths(): MemorySegment {
        val sel = ObjCRuntime.sel("invalidatedItemIndexPaths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property invalidatedSupplementaryIndexPaths
    /** @return NSDictionary<NSCollectionViewSupplementaryElementKind,NSSet<NSIndexPath *> *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidatedSupplementaryIndexPaths(): MemorySegment {
        val sel = ObjCRuntime.sel("invalidatedSupplementaryIndexPaths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property invalidatedDecorationIndexPaths
    /** @return NSDictionary<NSCollectionViewDecorationElementKind,NSSet<NSIndexPath *> *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidatedDecorationIndexPaths(): MemorySegment {
        val sel = ObjCRuntime.sel("invalidatedDecorationIndexPaths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contentOffsetAdjustment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentOffsetAdjustment(): NSPoint {
        val sel = ObjCRuntime.sel("contentOffsetAdjustment")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentOffsetAdjustment(value: NSPoint) {
        val sel = ObjCRuntime.sel("setContentOffsetAdjustment:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
    }

    // @property contentSizeAdjustment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentSizeAdjustment(): NSSize {
        val sel = ObjCRuntime.sel("contentSizeAdjustment")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentSizeAdjustment(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentSizeAdjustment:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

}
