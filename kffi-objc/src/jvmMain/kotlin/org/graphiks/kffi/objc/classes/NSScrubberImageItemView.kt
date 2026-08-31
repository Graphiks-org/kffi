@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberImageItemView
 * Superclass: NSScrubberItemView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubberImageItemView(override val ptr: MemorySegment) : NSScrubberItemView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSScrubberImageItemView") } }

    }

    // @property imageView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageView(): MemorySegment {
        val sel = ObjCRuntime.sel("imageView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageAlignment(): NSImageAlignment {
        val sel = ObjCRuntime.sel("imageAlignment")
        return NSImageAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageAlignment(value: NSImageAlignment) {
        val sel = ObjCRuntime.sel("setImageAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
