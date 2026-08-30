@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSKeyValueSharedObserversSnapshot
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSKeyValueSharedObserversSnapshot(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSKeyValueSharedObserversSnapshot") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
