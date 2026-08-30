@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPathComponentCell
 * Superclass: NSTextFieldCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSPathComponentCell(override val ptr: MemorySegment) : NSTextFieldCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPathComponentCell") }

    }

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property URL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun URL(): MemorySegment {
        val sel = ObjCRuntime.sel("URL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
