@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCWindow
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
open class SCWindow(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCWindow") } }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property windowID
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun windowID(): Int {
        val sel = ObjCRuntime.sel("windowID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

    // @property frame
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun frame(): CGRect {
        val sel = ObjCRuntime.sel("frame")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }

    // @property title
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    // @property windowLayer
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun windowLayer(): Long {
        val sel = ObjCRuntime.sel("windowLayer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property owningApplication
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun owningApplication(): MemorySegment {
        val sel = ObjCRuntime.sel("owningApplication")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property onScreen
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun isOnScreen(): Boolean {
        val sel = ObjCRuntime.sel("isOnScreen")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property active
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1)
    open fun isActive(): Boolean {
        val sel = ObjCRuntime.sel("isActive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
