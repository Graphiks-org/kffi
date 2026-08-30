@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGlassEffectView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
open class NSGlassEffectView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSGlassEffectView") } }

    }

    // @property contentView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cornerRadius
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cornerRadius(): Double {
        val sel = ObjCRuntime.sel("cornerRadius")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCornerRadius(value: Double) {
        val sel = ObjCRuntime.sel("setCornerRadius:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tintColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tintColor(): MemorySegment {
        val sel = ObjCRuntime.sel("tintColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTintColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTintColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property style
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun style(): NSGlassEffectViewStyle {
        val sel = ObjCRuntime.sel("style")
        return NSGlassEffectViewStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStyle(value: NSGlassEffectViewStyle) {
        val sel = ObjCRuntime.sel("setStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
