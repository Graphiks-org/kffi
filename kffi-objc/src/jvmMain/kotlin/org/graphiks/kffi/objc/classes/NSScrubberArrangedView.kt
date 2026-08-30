@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberArrangedView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubberArrangedView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScrubberArrangedView") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun applyLayoutAttributes(layoutAttributes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("applyLayoutAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, layoutAttributes)
    }

    // @property selected
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSelected(): Boolean {
        val sel = ObjCRuntime.sel("isSelected")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelected(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelected:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property highlighted
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isHighlighted(): Boolean {
        val sel = ObjCRuntime.sel("isHighlighted")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHighlighted(value: Boolean) {
        val sel = ObjCRuntime.sel("setHighlighted:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
