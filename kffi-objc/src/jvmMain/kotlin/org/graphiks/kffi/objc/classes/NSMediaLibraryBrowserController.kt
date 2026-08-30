@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMediaLibraryBrowserController
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
open class NSMediaLibraryBrowserController(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSMediaLibraryBrowserController") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedMediaLibraryBrowserController(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedMediaLibraryBrowserController")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun togglePanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("togglePanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property visible
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isVisible(): Boolean {
        val sel = ObjCRuntime.sel("isVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVisible(value: Boolean) {
        val sel = ObjCRuntime.sel("setVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property frame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrame(value: NSRect) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property mediaLibraries
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mediaLibraries(): NSMediaLibrary {
        val sel = ObjCRuntime.sel("mediaLibraries")
        return NSMediaLibrary(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMediaLibraries(value: NSMediaLibrary) {
        val sel = ObjCRuntime.sel("setMediaLibraries:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
