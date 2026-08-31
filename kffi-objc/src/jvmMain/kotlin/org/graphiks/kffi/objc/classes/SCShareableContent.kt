@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCShareableContent
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
open class SCShareableContent(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCShareableContent") } }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
        fun getShareableContentWithCompletionHandler(completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getShareableContentWithCompletionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, completionHandler)
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 4, introducedSubminor = -1)
        fun getCurrentProcessShareableContentWithCompletionHandler(completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getCurrentProcessShareableContentWithCompletionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, completionHandler)
        }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
        fun getShareableContentExcludingDesktopWindows_onScreenWindowsOnly_completionHandler(excludeDesktopWindows: Boolean, onScreenWindowsOnly: Boolean, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getShareableContentExcludingDesktopWindows:onScreenWindowsOnly:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, excludeDesktopWindows, onScreenWindowsOnly, completionHandler)
        }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
        fun getShareableContentExcludingDesktopWindows_onScreenWindowsOnlyBelowWindow_completionHandler(excludeDesktopWindows: Boolean, window: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getShareableContentExcludingDesktopWindows:onScreenWindowsOnlyBelowWindow:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, excludeDesktopWindows, window, completionHandler)
        }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
        fun getShareableContentExcludingDesktopWindows_onScreenWindowsOnlyAboveWindow_completionHandler(excludeDesktopWindows: Boolean, window: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getShareableContentExcludingDesktopWindows:onScreenWindowsOnlyAboveWindow:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, excludeDesktopWindows, window, completionHandler)
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun infoForFilter(filter: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("infoForFilter:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, filter) as MemorySegment
        }

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

    // @property windows
    /** @return NSArray<SCWindow *> * */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun windows(): MemorySegment {
        val sel = ObjCRuntime.sel("windows")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property displays
    /** @return NSArray<SCDisplay *> * */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun displays(): MemorySegment {
        val sel = ObjCRuntime.sel("displays")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property applications
    /** @return NSArray<SCRunningApplication *> * */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun applications(): MemorySegment {
        val sel = ObjCRuntime.sel("applications")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
