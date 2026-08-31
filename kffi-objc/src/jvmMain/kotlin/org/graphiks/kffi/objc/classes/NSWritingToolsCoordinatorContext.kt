@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWritingToolsCoordinatorContext
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
open class NSWritingToolsCoordinatorContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSWritingToolsCoordinatorContext") } }

    }

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun initWithAttributedString_range(attributedString: MemorySegment, range: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("initWithAttributedString:range:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributedString, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property attributedString
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun attributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property range
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun range(): NSRange {
        val sel = ObjCRuntime.sel("range")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property identifier
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property resolvedRange
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun resolvedRange(): NSRange {
        val sel = ObjCRuntime.sel("resolvedRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

}
