@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSComboButton
 * Superclass: NSControl
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
open class NSComboButton(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSComboButton") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun comboButtonWithTitle_menu_target_action(title: MemorySegment, menu: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("comboButtonWithTitle:menu:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, title, menu, target, action) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun comboButtonWithTitle_menu_target_action(title: String, menu: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment = comboButtonWithTitle_menu_target_action(ObjCRuntime.newNSString(Arena.global(), title), menu, target, action)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun comboButtonWithImage_menu_target_action(image: MemorySegment, menu: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("comboButtonWithImage:menu:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image, menu, target, action) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun comboButtonWithTitle_image_menu_target_action(title: MemorySegment, image: MemorySegment, menu: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("comboButtonWithTitle:image:menu:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, title, image, menu, target, action) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun comboButtonWithTitle_image_menu_target_action(title: String, image: MemorySegment, menu: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment = comboButtonWithTitle_image_menu_target_action(ObjCRuntime.newNSString(Arena.global(), title), image, menu, target, action)

    }

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

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

    // @property imageScaling
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setImageScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property menu
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun menu(): MemorySegment {
        val sel = ObjCRuntime.sel("menu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property style
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun style(): NSComboButtonStyle {
        val sel = ObjCRuntime.sel("style")
        return NSComboButtonStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStyle(value: NSComboButtonStyle) {
        val sel = ObjCRuntime.sel("setStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
