@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSearchToolbarItem
 * Superclass: NSToolbarItem
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
open class NSSearchToolbarItem(override val ptr: MemorySegment) : NSToolbarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSearchToolbarItem") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun beginSearchInteraction(): Unit {
        val sel = ObjCRuntime.sel("beginSearchInteraction")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun endSearchInteraction(): Unit {
        val sel = ObjCRuntime.sel("endSearchInteraction")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property searchField
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun searchField(): MemorySegment {
        val sel = ObjCRuntime.sel("searchField")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setSearchField(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSearchField:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property resignsFirstResponderWithCancel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resignsFirstResponderWithCancel(): Boolean {
        val sel = ObjCRuntime.sel("resignsFirstResponderWithCancel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setResignsFirstResponderWithCancel(value: Boolean) {
        val sel = ObjCRuntime.sel("setResignsFirstResponderWithCancel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredWidthForSearchField
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preferredWidthForSearchField(): Double {
        val sel = ObjCRuntime.sel("preferredWidthForSearchField")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreferredWidthForSearchField(value: Double) {
        val sel = ObjCRuntime.sel("setPreferredWidthForSearchField:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
