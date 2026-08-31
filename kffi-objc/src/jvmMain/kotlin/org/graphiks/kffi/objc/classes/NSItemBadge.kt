@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSItemBadge
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
open class NSItemBadge(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSItemBadge") } }

        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun badgeWithCount(count: Long): MemorySegment {
            val sel = ObjCRuntime.sel("badgeWithCount:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, count) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun badgeWithText(text: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("badgeWithText:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, text) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun badgeWithText(text: String): MemorySegment = badgeWithText(ObjCRuntime.newNSString(Arena.global(), text))

        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun indicatorBadge(): MemorySegment {
            val sel = ObjCRuntime.sel("indicatorBadge")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property text
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun text(): MemorySegment {
        val sel = ObjCRuntime.sel("text")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun textAsString(): String = ObjCRuntime.toJavaString(text())

}
