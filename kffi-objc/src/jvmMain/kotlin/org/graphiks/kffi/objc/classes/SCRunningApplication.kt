@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCRunningApplication
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
open class SCRunningApplication(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCRunningApplication") } }

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

    // @property bundleIdentifier
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun bundleIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("bundleIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun bundleIdentifierAsString(): String = ObjCRuntime.toJavaString(bundleIdentifier())

    // @property applicationName
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun applicationName(): MemorySegment {
        val sel = ObjCRuntime.sel("applicationName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun applicationNameAsString(): String = ObjCRuntime.toJavaString(applicationName())

    // @property processID
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun processID(): Int {
        val sel = ObjCRuntime.sel("processID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

}
