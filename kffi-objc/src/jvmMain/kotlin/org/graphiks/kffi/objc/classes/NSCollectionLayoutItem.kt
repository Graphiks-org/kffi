@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutItem
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutItem") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun itemWithLayoutSize(layoutSize: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("itemWithLayoutSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun itemWithLayoutSize_supplementaryItems(layoutSize: MemorySegment, supplementaryItems: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("itemWithLayoutSize:supplementaryItems:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, supplementaryItems) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contentInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentInsets(): NSDirectionalEdgeInsets {
        val sel = ObjCRuntime.sel("contentInsets")
        return NSDirectionalEdgeInsets(ObjCRuntime.msgSendStruct(NSDirectionalEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentInsets(value: NSDirectionalEdgeInsets) {
        val sel = ObjCRuntime.sel("setContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSDirectionalEdgeInsets.layout))
    }

    // @property edgeSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun edgeSpacing(): MemorySegment {
        val sel = ObjCRuntime.sel("edgeSpacing")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEdgeSpacing(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setEdgeSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layoutSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun layoutSize(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutSize")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property supplementaryItems
    /** @return NSArray<NSCollectionLayoutSupplementaryItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun supplementaryItems(): MemorySegment {
        val sel = ObjCRuntime.sel("supplementaryItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutItem.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
