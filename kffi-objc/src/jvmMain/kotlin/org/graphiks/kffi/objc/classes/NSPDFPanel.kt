@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPDFPanel
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
open class NSPDFPanel(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPDFPanel") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun panel(): MemorySegment {
            val sel = ObjCRuntime.sel("panel")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun beginSheetWithPDFInfo_modalForWindow_completionHandler(pdfInfo: MemorySegment, docWindow: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginSheetWithPDFInfo:modalForWindow:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, pdfInfo, docWindow, completionHandler)
    }

    // @property accessoryController
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun accessoryController(): MemorySegment {
        val sel = ObjCRuntime.sel("accessoryController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAccessoryController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAccessoryController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property options
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun options(): NSPDFPanelOptions {
        val sel = ObjCRuntime.sel("options")
        return NSPDFPanelOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOptions(value: NSPDFPanelOptions) {
        val sel = ObjCRuntime.sel("setOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property defaultFileName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaultFileName(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultFileName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDefaultFileName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDefaultFileName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaultFileNameAsString(): String = ObjCRuntime.toJavaString(defaultFileName())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDefaultFileName(value: String) = setDefaultFileName(ObjCRuntime.newNSString(Arena.global(), value))

}
