@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutEdgeSpacing
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutEdgeSpacing(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionLayoutEdgeSpacing") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun spacingForLeading_top_trailing_bottom(leading: MemorySegment, top: MemorySegment, trailing: MemorySegment, bottom: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("spacingForLeading:top:trailing:bottom:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, leading, top, trailing, bottom) as MemorySegment
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

    // @property leading
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leading(): MemorySegment {
        val sel = ObjCRuntime.sel("leading")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property top
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun top(): MemorySegment {
        val sel = ObjCRuntime.sel("top")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property trailing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trailing(): MemorySegment {
        val sel = ObjCRuntime.sel("trailing")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property bottom
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bottom(): MemorySegment {
        val sel = ObjCRuntime.sel("bottom")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutEdgeSpacing.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
