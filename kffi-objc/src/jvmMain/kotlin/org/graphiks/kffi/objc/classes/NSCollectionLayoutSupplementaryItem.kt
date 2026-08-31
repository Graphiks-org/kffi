@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutSupplementaryItem
 * Superclass: NSCollectionLayoutItem
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutSupplementaryItem(override val ptr: MemorySegment) : NSCollectionLayoutItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionLayoutSupplementaryItem") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun supplementaryItemWithLayoutSize_elementKind_containerAnchor(layoutSize: MemorySegment, elementKind: MemorySegment, containerAnchor: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("supplementaryItemWithLayoutSize:elementKind:containerAnchor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, elementKind, containerAnchor) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun supplementaryItemWithLayoutSize_elementKind_containerAnchor(layoutSize: MemorySegment, elementKind: String, containerAnchor: MemorySegment): MemorySegment = supplementaryItemWithLayoutSize_elementKind_containerAnchor(layoutSize, ObjCRuntime.newNSString(Arena.global(), elementKind), containerAnchor)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun supplementaryItemWithLayoutSize_elementKind_containerAnchor_itemAnchor(layoutSize: MemorySegment, elementKind: MemorySegment, containerAnchor: MemorySegment, itemAnchor: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("supplementaryItemWithLayoutSize:elementKind:containerAnchor:itemAnchor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, elementKind, containerAnchor, itemAnchor) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun supplementaryItemWithLayoutSize_elementKind_containerAnchor_itemAnchor(layoutSize: MemorySegment, elementKind: String, containerAnchor: MemorySegment, itemAnchor: MemorySegment): MemorySegment = supplementaryItemWithLayoutSize_elementKind_containerAnchor_itemAnchor(layoutSize, ObjCRuntime.newNSString(Arena.global(), elementKind), containerAnchor, itemAnchor)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property zIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun zIndex(): Long {
        val sel = ObjCRuntime.sel("zIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setZIndex(value: Long) {
        val sel = ObjCRuntime.sel("setZIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property elementKind
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun elementKind(): MemorySegment {
        val sel = ObjCRuntime.sel("elementKind")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun elementKindAsString(): String = ObjCRuntime.toJavaString(elementKind())

    // @property containerAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun containerAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("containerAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property itemAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("itemAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
