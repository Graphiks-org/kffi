@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorPickerTouchBarItem
 * Superclass: NSTouchBarItem
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSColorPickerTouchBarItem(override val ptr: MemorySegment) : NSTouchBarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSColorPickerTouchBarItem") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun colorPickerWithIdentifier(identifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorPickerWithIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun textColorPickerWithIdentifier(identifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("textColorPickerWithIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun strokeColorPickerWithIdentifier(identifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("strokeColorPickerWithIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun colorPickerWithIdentifier_buttonImage(identifier: MemorySegment, image: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorPickerWithIdentifier:buttonImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier, image) as MemorySegment
        }

    }

    // @property color
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun color(): MemorySegment {
        val sel = ObjCRuntime.sel("color")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsAlpha
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun showsAlpha(): Boolean {
        val sel = ObjCRuntime.sel("showsAlpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setShowsAlpha(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowedColorSpaces
    /** @return NSArray<NSColorSpace *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun allowedColorSpaces(): MemorySegment {
        val sel = ObjCRuntime.sel("allowedColorSpaces")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setAllowedColorSpaces(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAllowedColorSpaces:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorList
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorList(): MemorySegment {
        val sel = ObjCRuntime.sel("colorList")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColorList(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColorList:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property customizationLabel
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    override fun customizationLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("customizationLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setCustomizationLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCustomizationLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property target
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property action
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun action(): MemorySegment {
        val sel = ObjCRuntime.sel("action")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property enabled
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
