@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutDimension
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutDimension(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionLayoutDimension") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fractionalWidthDimension(fractionalWidth: Double): MemorySegment {
            val sel = ObjCRuntime.sel("fractionalWidthDimension:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fractionalWidth) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fractionalHeightDimension(fractionalHeight: Double): MemorySegment {
            val sel = ObjCRuntime.sel("fractionalHeightDimension:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fractionalHeight) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun absoluteDimension(absoluteDimension: Double): MemorySegment {
            val sel = ObjCRuntime.sel("absoluteDimension:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, absoluteDimension) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun estimatedDimension(estimatedDimension: Double): MemorySegment {
            val sel = ObjCRuntime.sel("estimatedDimension:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, estimatedDimension) as MemorySegment
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

    // @property isFractionalWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFractionalWidth(): Boolean {
        val sel = ObjCRuntime.sel("isFractionalWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property isFractionalHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFractionalHeight(): Boolean {
        val sel = ObjCRuntime.sel("isFractionalHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property isAbsolute
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isAbsolute(): Boolean {
        val sel = ObjCRuntime.sel("isAbsolute")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property isEstimated
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEstimated(): Boolean {
        val sel = ObjCRuntime.sel("isEstimated")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property dimension
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dimension(): Double {
        val sel = ObjCRuntime.sel("dimension")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutDimension.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
