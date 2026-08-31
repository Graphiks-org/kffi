@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSJSONSerialization
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSJSONSerialization(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSJSONSerialization") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun isValidJSONObject(obj: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("isValidJSONObject:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, obj) as Boolean
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun dataWithJSONObject_options_error(obj: MemorySegment, opt: NSJSONWritingOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dataWithJSONObject:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, obj, opt.rawValue, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun JSONObjectWithData_options_error(`data`: MemorySegment, opt: NSJSONReadingOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("JSONObjectWithData:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, opt.rawValue, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun writeJSONObject_toStream_options_error(obj: MemorySegment, stream: MemorySegment, opt: NSJSONWritingOptions, error: MemorySegment): Long {
            val sel = ObjCRuntime.sel("writeJSONObject:toStream:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel, obj, stream, opt.rawValue, error) as Long
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun JSONObjectWithStream_options_error(stream: MemorySegment, opt: NSJSONReadingOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("JSONObjectWithStream:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, stream, opt.rawValue, error) as MemorySegment
        }

    }

}
