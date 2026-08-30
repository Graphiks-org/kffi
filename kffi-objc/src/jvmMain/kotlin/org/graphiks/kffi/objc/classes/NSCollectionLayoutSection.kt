@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutSection
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutSection(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutSection") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sectionWithGroup(group: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("sectionWithGroup:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, group) as MemorySegment
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

    // @property interGroupSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun interGroupSpacing(): Double {
        val sel = ObjCRuntime.sel("interGroupSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInterGroupSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setInterGroupSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property orthogonalScrollingBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orthogonalScrollingBehavior(): NSCollectionLayoutSectionOrthogonalScrollingBehavior {
        val sel = ObjCRuntime.sel("orthogonalScrollingBehavior")
        return NSCollectionLayoutSectionOrthogonalScrollingBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOrthogonalScrollingBehavior(value: NSCollectionLayoutSectionOrthogonalScrollingBehavior) {
        val sel = ObjCRuntime.sel("setOrthogonalScrollingBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property boundarySupplementaryItems
    /** @return NSArray<NSCollectionLayoutBoundarySupplementaryItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun boundarySupplementaryItems(): MemorySegment {
        val sel = ObjCRuntime.sel("boundarySupplementaryItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBoundarySupplementaryItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBoundarySupplementaryItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property supplementariesFollowContentInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun supplementariesFollowContentInsets(): Boolean {
        val sel = ObjCRuntime.sel("supplementariesFollowContentInsets")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSupplementariesFollowContentInsets(value: Boolean) {
        val sel = ObjCRuntime.sel("setSupplementariesFollowContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property visibleItemsInvalidationHandler
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun visibleItemsInvalidationHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("visibleItemsInvalidationHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVisibleItemsInvalidationHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVisibleItemsInvalidationHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property decorationItems
    /** @return NSArray<NSCollectionLayoutDecorationItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun decorationItems(): MemorySegment {
        val sel = ObjCRuntime.sel("decorationItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDecorationItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDecorationItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutSection.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
