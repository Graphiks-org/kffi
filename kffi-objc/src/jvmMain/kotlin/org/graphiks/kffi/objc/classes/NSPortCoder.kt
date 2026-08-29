@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPortCoder
 * Superclass: NSCoder
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
open class NSPortCoder(override val ptr: MemorySegment) : NSCoder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPortCoder") }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
        fun portCoderWithReceivePort_sendPort_components(rcvPort: MemorySegment, sndPort: MemorySegment, comps: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("portCoderWithReceivePort:sendPort:components:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, rcvPort, sndPort, comps) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    open fun isBycopy(): Boolean {
        val sel = ObjCRuntime.sel("isBycopy")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    open fun isByref(): Boolean {
        val sel = ObjCRuntime.sel("isByref")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    open fun encodePortObject(aport: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("encodePortObject:")
        ObjCRuntime.msgSend(null, ptr, sel, aport)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    open fun decodePortObject(): MemorySegment {
        val sel = ObjCRuntime.sel("decodePortObject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
    open fun connection(): MemorySegment {
        val sel = ObjCRuntime.sel("connection")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
    open fun initWithReceivePort_sendPort_components(rcvPort: MemorySegment, sndPort: MemorySegment, comps: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithReceivePort:sendPort:components:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, rcvPort, sndPort, comps) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
    open fun dispatch(): Unit {
        val sel = ObjCRuntime.sel("dispatch")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

}
