@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSViewLayoutRegion
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
open class NSViewLayoutRegion(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSViewLayoutRegion") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun safeAreaLayoutRegionWithCornerAdaptation(adaptivityAxis: NSViewLayoutRegionAdaptivityAxis): MemorySegment {
            val sel = ObjCRuntime.sel("safeAreaLayoutRegionWithCornerAdaptation:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, adaptivityAxis.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun marginsLayoutRegionWithCornerAdaptation(adaptivityAxis: NSViewLayoutRegionAdaptivityAxis): MemorySegment {
            val sel = ObjCRuntime.sel("marginsLayoutRegionWithCornerAdaptation:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, adaptivityAxis.rawValue) as MemorySegment
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

}
