@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPropertyListSerialization
 * Superclass: NSObject
 */
open class NSPropertyListSerialization(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPropertyListSerialization") } }

        fun propertyList_isValidForFormat(plist: MemorySegment, format: NSPropertyListFormat): Boolean {
            val sel = ObjCRuntime.sel("propertyList:isValidForFormat:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, plist, format.rawValue) as Boolean
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun dataWithPropertyList_format_options_error(plist: MemorySegment, format: NSPropertyListFormat, opt: Long, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dataWithPropertyList:format:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, plist, format.rawValue, opt, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun writePropertyList_toStream_format_options_error(plist: MemorySegment, stream: MemorySegment, format: NSPropertyListFormat, opt: Long, error: MemorySegment): Long {
            val sel = ObjCRuntime.sel("writePropertyList:toStream:format:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel, plist, stream, format.rawValue, opt, error) as Long
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun propertyListWithData_options_format_error(`data`: MemorySegment, opt: NSPropertyListMutabilityOptions, format: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("propertyListWithData:options:format:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, opt.rawValue, format, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun propertyListWithStream_options_format_error(stream: MemorySegment, opt: NSPropertyListMutabilityOptions, format: MemorySegment, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("propertyListWithStream:options:format:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, stream, opt.rawValue, format, error) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        fun dataFromPropertyList_format_errorDescription(plist: MemorySegment, format: NSPropertyListFormat, errorString: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dataFromPropertyList:format:errorDescription:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, plist, format.rawValue, errorString) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use dataWithPropertyList:format:options:error: instead.")
        fun dataFromPropertyList_format_errorDescription(plist: MemorySegment, format: NSPropertyListFormat, errorString: String): MemorySegment = dataFromPropertyList_format_errorDescription(plist, format, ObjCRuntime.newNSString(Arena.global(), errorString))

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        fun propertyListFromData_mutabilityOption_format_errorDescription(`data`: MemorySegment, opt: NSPropertyListMutabilityOptions, format: MemorySegment, errorString: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("propertyListFromData:mutabilityOption:format:errorDescription:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, opt.rawValue, format, errorString) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use propertyListWithData:options:format:error: instead.")
        fun propertyListFromData_mutabilityOption_format_errorDescription(`data`: MemorySegment, opt: NSPropertyListMutabilityOptions, format: MemorySegment, errorString: String): MemorySegment = propertyListFromData_mutabilityOption_format_errorDescription(`data`, opt, format, ObjCRuntime.newNSString(Arena.global(), errorString))

    }

}
