@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorPanel
 * Superclass: NSPanel
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSColorPanel(override val ptr: MemorySegment) : NSPanel(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSColorPanel") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun dragColor_withEvent_fromView(color: MemorySegment, event: MemorySegment, sourceView: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("dragColor:withEvent:fromView:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, color, event, sourceView) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setPickerMask(mask: NSColorPanelOptions): Unit {
            val sel = ObjCRuntime.sel("setPickerMask:")
            ObjCRuntime.msgSend(null, _class, sel, mask.rawValue)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setPickerMode(mode: NSColorPanelMode): Unit {
            val sel = ObjCRuntime.sel("setPickerMode:")
            ObjCRuntime.msgSend(null, _class, sel, mode.rawValue)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedColorPanel(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedColorPanel")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedColorPanelExists(): Boolean {
            val sel = ObjCRuntime.sel("sharedColorPanelExists")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAction(selector: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, selector)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTarget(target: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, target)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attachColorList(colorList: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("attachColorList:")
        ObjCRuntime.msgSend(null, ptr, sel, colorList)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun detachColorList(colorList: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("detachColorList:")
        ObjCRuntime.msgSend(null, ptr, sel, colorList)
    }

    // @property accessoryView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun accessoryView(): MemorySegment {
        val sel = ObjCRuntime.sel("accessoryView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAccessoryView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAccessoryView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property continuous
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isContinuous(): Boolean {
        val sel = ObjCRuntime.sel("isContinuous")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContinuous(value: Boolean) {
        val sel = ObjCRuntime.sel("setContinuous:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsAlpha
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsAlpha(): Boolean {
        val sel = ObjCRuntime.sel("showsAlpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsAlpha(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property mode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mode(): NSColorPanelMode {
        val sel = ObjCRuntime.sel("mode")
        return NSColorPanelMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMode(value: NSColorPanelMode) {
        val sel = ObjCRuntime.sel("setMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property alpha
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alpha(): Double {
        val sel = ObjCRuntime.sel("alpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
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
