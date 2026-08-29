@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewCompositionalLayoutConfiguration
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionViewCompositionalLayoutConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewCompositionalLayoutConfiguration") }

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

    // @property interSectionSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun interSectionSpacing(): Double {
        val sel = ObjCRuntime.sel("interSectionSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInterSectionSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setInterSectionSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionViewCompositionalLayoutConfiguration.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
