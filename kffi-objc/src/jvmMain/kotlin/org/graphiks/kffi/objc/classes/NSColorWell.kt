@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorWell
 * Superclass: NSControl
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSColorWell(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSColorWell") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun colorWellWithStyle(style: NSColorWellStyle): MemorySegment {
            val sel = ObjCRuntime.sel("colorWellWithStyle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, style.rawValue) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deactivate(): Unit {
        val sel = ObjCRuntime.sel("deactivate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun activate(exclusive: Boolean): Unit {
        val sel = ObjCRuntime.sel("activate:")
        ObjCRuntime.msgSend(null, ptr, sel, exclusive)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawWellInside(insideRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawWellInside:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(insideRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takeColorFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeColorFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property active
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isActive(): Boolean {
        val sel = ObjCRuntime.sel("isActive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property bordered
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This property will be deprecated in a future release.")
    open fun isBordered(): Boolean {
        val sel = ObjCRuntime.sel("isBordered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This property will be deprecated in a future release.")
    open fun setBordered(value: Boolean) {
        val sel = ObjCRuntime.sel("setBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property color
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun color(): MemorySegment {
        val sel = ObjCRuntime.sel("color")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorWellStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun colorWellStyle(): NSColorWellStyle {
        val sel = ObjCRuntime.sel("colorWellStyle")
        return NSColorWellStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setColorWellStyle(value: NSColorWellStyle) {
        val sel = ObjCRuntime.sel("setColorWellStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pulldownTarget
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun pulldownTarget(): MemorySegment {
        val sel = ObjCRuntime.sel("pulldownTarget")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setPulldownTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPulldownTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pulldownAction
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun pulldownAction(): MemorySegment {
        val sel = ObjCRuntime.sel("pulldownAction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setPulldownAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPulldownAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property supportsAlpha
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun supportsAlpha(): Boolean {
        val sel = ObjCRuntime.sel("supportsAlpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setSupportsAlpha(value: Boolean) {
        val sel = ObjCRuntime.sel("setSupportsAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumLinearExposure
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun maximumLinearExposure(): Double {
        val sel = ObjCRuntime.sel("maximumLinearExposure")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setMaximumLinearExposure(value: Double) {
        val sel = ObjCRuntime.sel("setMaximumLinearExposure:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
