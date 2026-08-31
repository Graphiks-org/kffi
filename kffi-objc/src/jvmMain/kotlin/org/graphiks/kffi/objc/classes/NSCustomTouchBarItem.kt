@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCustomTouchBarItem
 * Superclass: NSTouchBarItem
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSCustomTouchBarItem(override val ptr: MemorySegment) : NSTouchBarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCustomTouchBarItem") } }

    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property viewController
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun viewController(): MemorySegment {
        val sel = ObjCRuntime.sel("viewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setViewController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property customizationLabel
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun customizationLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("customizationLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCustomizationLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCustomizationLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
