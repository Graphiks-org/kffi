@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutGroup
 * Superclass: NSCollectionLayoutItem
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutGroup(override val ptr: MemorySegment) : NSCollectionLayoutItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionLayoutGroup") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun horizontalGroupWithLayoutSize_subitem_count(layoutSize: MemorySegment, subitem: MemorySegment, count: Long): MemorySegment {
            val sel = ObjCRuntime.sel("horizontalGroupWithLayoutSize:subitem:count:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, subitem, count) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun horizontalGroupWithLayoutSize_subitems(layoutSize: MemorySegment, subitems: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("horizontalGroupWithLayoutSize:subitems:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, subitems) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun verticalGroupWithLayoutSize_subitem_count(layoutSize: MemorySegment, subitem: MemorySegment, count: Long): MemorySegment {
            val sel = ObjCRuntime.sel("verticalGroupWithLayoutSize:subitem:count:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, subitem, count) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun verticalGroupWithLayoutSize_subitems(layoutSize: MemorySegment, subitems: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("verticalGroupWithLayoutSize:subitems:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, subitems) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun customGroupWithLayoutSize_itemProvider(layoutSize: MemorySegment, itemProvider: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("customGroupWithLayoutSize:itemProvider:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, itemProvider) as MemorySegment
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
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun visualDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("visualDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun visualDescriptionAsString(): String = ObjCRuntime.toJavaString(visualDescription())

    // @property supplementaryItems
    /** @return NSArray<NSCollectionLayoutSupplementaryItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun supplementaryItems(): MemorySegment {
        val sel = ObjCRuntime.sel("supplementaryItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSupplementaryItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSupplementaryItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property interItemSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun interItemSpacing(): MemorySegment {
        val sel = ObjCRuntime.sel("interItemSpacing")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInterItemSpacing(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInterItemSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property subitems
    /** @return NSArray<NSCollectionLayoutItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun subitems(): MemorySegment {
        val sel = ObjCRuntime.sel("subitems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
