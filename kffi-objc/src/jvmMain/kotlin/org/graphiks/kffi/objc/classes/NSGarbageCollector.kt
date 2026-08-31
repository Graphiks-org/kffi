@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGarbageCollector
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
open class NSGarbageCollector(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSGarbageCollector") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
        @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
        fun defaultCollector(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultCollector")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun isCollecting(): Boolean {
        val sel = ObjCRuntime.sel("isCollecting")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun disable(): Unit {
        val sel = ObjCRuntime.sel("disable")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun enable(): Unit {
        val sel = ObjCRuntime.sel("enable")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun collectIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("collectIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun collectExhaustively(): Unit {
        val sel = ObjCRuntime.sel("collectExhaustively")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun disableCollectorForPointer(ptr: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("disableCollectorForPointer:")
        ObjCRuntime.msgSend(null, ptr, sel, ptr)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun enableCollectorForPointer(ptr: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enableCollectorForPointer:")
        ObjCRuntime.msgSend(null, ptr, sel, ptr)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Building Garbage Collected apps is no longer supported.")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
    open fun zone(): NSZonePointer {
        val sel = ObjCRuntime.sel("zone")
        return NSZonePointer(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

}
