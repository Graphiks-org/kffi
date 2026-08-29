@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFileAccessIntent
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSFileAccessIntent(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFileAccessIntent") }

        @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun readingIntentWithURL_options(url: MemorySegment, options: NSFileCoordinatorReadingOptions): MemorySegment {
            val sel = ObjCRuntime.sel("readingIntentWithURL:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url, options.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun writingIntentWithURL_options(url: MemorySegment, options: NSFileCoordinatorWritingOptions): MemorySegment {
            val sel = ObjCRuntime.sel("writingIntentWithURL:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url, options.rawValue) as MemorySegment
        }

    }

    // @property URL
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
