@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCContentFilter
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
open class SCContentFilter(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCContentFilter") } }

    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun initWithDesktopIndependentWindow(window: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDesktopIndependentWindow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, window) as MemorySegment
    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun initWithDisplay_excludingWindows(display: MemorySegment, excluded: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisplay:excludingWindows:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, display, excluded) as MemorySegment
    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun initWithDisplay_includingWindows(display: MemorySegment, includedWindows: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisplay:includingWindows:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, display, includedWindows) as MemorySegment
    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun initWithDisplay_includingApplications_exceptingWindows(display: MemorySegment, applications: MemorySegment, exceptingWindows: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisplay:includingApplications:exceptingWindows:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, display, applications, exceptingWindows) as MemorySegment
    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun initWithDisplay_excludingApplications_exceptingWindows(display: MemorySegment, applications: MemorySegment, exceptingWindows: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDisplay:excludingApplications:exceptingWindows:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, display, applications, exceptingWindows) as MemorySegment
    }

    // @property streamType
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 2, deprecatedSubminor = -1, message = "Use style instead")
    open fun streamType(): SCStreamType {
        val sel = ObjCRuntime.sel("streamType")
        return SCStreamType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property style
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun style(): SCShareableContentStyle {
        val sel = ObjCRuntime.sel("style")
        return SCShareableContentStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property pointPixelScale
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun pointPixelScale(): Float {
        val sel = ObjCRuntime.sel("pointPixelScale")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

    // @property contentRect
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun contentRect(): CGRect {
        val sel = ObjCRuntime.sel("contentRect")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }

    // @property includeMenuBar
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 2, introducedSubminor = -1)
    open fun includeMenuBar(): Boolean {
        val sel = ObjCRuntime.sel("includeMenuBar")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 2, introducedSubminor = -1)
    open fun setIncludeMenuBar(value: Boolean) {
        val sel = ObjCRuntime.sel("setIncludeMenuBar:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property includedDisplays
    /** @return NSArray<SCDisplay *> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun includedDisplays(): MemorySegment {
        val sel = ObjCRuntime.sel("includedDisplays")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property includedApplications
    /** @return NSArray<SCRunningApplication *> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun includedApplications(): MemorySegment {
        val sel = ObjCRuntime.sel("includedApplications")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property includedWindows
    /** @return NSArray<SCWindow *> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun includedWindows(): MemorySegment {
        val sel = ObjCRuntime.sel("includedWindows")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
