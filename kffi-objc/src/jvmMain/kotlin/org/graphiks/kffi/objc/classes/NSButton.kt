@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSButton
 * Superclass: NSControl
 * Protocols: NSUserInterfaceValidations, NSAccessibilityButton, NSUserInterfaceCompression
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSButton(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSButton") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun buttonWithTitle_image_target_action(title: MemorySegment, image: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("buttonWithTitle:image:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, title, image, target, action) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun buttonWithTitle_image_target_action(title: String, image: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment = buttonWithTitle_image_target_action(ObjCRuntime.newNSString(Arena.global(), title), image, target, action)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun buttonWithTitle_target_action(title: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("buttonWithTitle:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, title, target, action) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun buttonWithTitle_target_action(title: String, target: MemorySegment, action: MemorySegment): MemorySegment = buttonWithTitle_target_action(ObjCRuntime.newNSString(Arena.global(), title), target, action)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun buttonWithImage_target_action(image: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("buttonWithImage:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image, target, action) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun checkboxWithTitle_target_action(title: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("checkboxWithTitle:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, title, target, action) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun checkboxWithTitle_target_action(title: String, target: MemorySegment, action: MemorySegment): MemorySegment = checkboxWithTitle_target_action(ObjCRuntime.newNSString(Arena.global(), title), target, action)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun radioButtonWithTitle_target_action(title: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("radioButtonWithTitle:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, title, target, action) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun radioButtonWithTitle_target_action(title: String, target: MemorySegment, action: MemorySegment): MemorySegment = radioButtonWithTitle_target_action(ObjCRuntime.newNSString(Arena.global(), title), target, action)

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setButtonType(type: NSButtonType): Unit {
        val sel = ObjCRuntime.sel("setButtonType:")
        ObjCRuntime.msgSend(null, ptr, sel, type.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPeriodicDelay_interval(delay: Float, interval: Float): Unit {
        val sel = ObjCRuntime.sel("setPeriodicDelay:interval:")
        ObjCRuntime.msgSend(null, ptr, sel, delay, interval)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getPeriodicDelay_interval(delay: MemorySegment, interval: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getPeriodicDelay:interval:")
        ObjCRuntime.msgSend(null, ptr, sel, delay, interval)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNextState(): Unit {
        val sel = ObjCRuntime.sel("setNextState")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlight(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("highlight:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun performKeyEquivalent(key: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performKeyEquivalent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, key) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun compressWithPrioritizedCompressionOptions(prioritizedOptions: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("compressWithPrioritizedCompressionOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, prioritizedOptions)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun minimumSizeWithPrioritizedCompressionOptions(prioritizedOptions: MemorySegment): NSSize {
        val sel = ObjCRuntime.sel("minimumSizeWithPrioritizedCompressionOptions:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, prioritizedOptions))
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

    // @property attributedTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributedTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAttributedTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alternateTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("alternateTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAlternateTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateTitleAsString(): String = ObjCRuntime.toJavaString(alternateTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateTitle(value: String) = setAlternateTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property attributedAlternateTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributedAlternateTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedAlternateTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAttributedAlternateTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedAlternateTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasDestructiveAction
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun hasDestructiveAction(): Boolean {
        val sel = ObjCRuntime.sel("hasDestructiveAction")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setHasDestructiveAction(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasDestructiveAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sound
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sound(): MemorySegment {
        val sel = ObjCRuntime.sel("sound")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSound(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSound:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property springLoaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun isSpringLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isSpringLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun setSpringLoaded(value: Boolean) {
        val sel = ObjCRuntime.sel("setSpringLoaded:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxAcceleratorLevel
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun maxAcceleratorLevel(): Long {
        val sel = ObjCRuntime.sel("maxAcceleratorLevel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun setMaxAcceleratorLevel(value: Long) {
        val sel = ObjCRuntime.sel("setMaxAcceleratorLevel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bezelStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bezelStyle(): NSBezelStyle {
        val sel = ObjCRuntime.sel("bezelStyle")
        return NSBezelStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBezelStyle(value: NSBezelStyle) {
        val sel = ObjCRuntime.sel("setBezelStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property bordered
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isBordered(): Boolean {
        val sel = ObjCRuntime.sel("isBordered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBordered(value: Boolean) {
        val sel = ObjCRuntime.sel("setBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property transparent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isTransparent(): Boolean {
        val sel = ObjCRuntime.sel("isTransparent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTransparent(value: Boolean) {
        val sel = ObjCRuntime.sel("setTransparent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsBorderOnlyWhileMouseInside
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsBorderOnlyWhileMouseInside(): Boolean {
        val sel = ObjCRuntime.sel("showsBorderOnlyWhileMouseInside")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsBorderOnlyWhileMouseInside(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsBorderOnlyWhileMouseInside:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bezelColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun bezelColor(): MemorySegment {
        val sel = ObjCRuntime.sel("bezelColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setBezelColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBezelColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentTintColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun contentTintColor(): MemorySegment {
        val sel = ObjCRuntime.sel("contentTintColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun setContentTintColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentTintColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tintProminence
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun tintProminence(): NSTintProminence {
        val sel = ObjCRuntime.sel("tintProminence")
        return NSTintProminence(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setTintProminence(value: NSTintProminence) {
        val sel = ObjCRuntime.sel("setTintProminence:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property alternateImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateImage(): MemorySegment {
        val sel = ObjCRuntime.sel("alternateImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAlternateImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imagePosition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imagePosition(): NSCellImagePosition {
        val sel = ObjCRuntime.sel("imagePosition")
        return NSCellImagePosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImagePosition(value: NSCellImagePosition) {
        val sel = ObjCRuntime.sel("setImagePosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageScaling
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun imageScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setImageScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setImageScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageHugsTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun imageHugsTitle(): Boolean {
        val sel = ObjCRuntime.sel("imageHugsTitle")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setImageHugsTitle(value: Boolean) {
        val sel = ObjCRuntime.sel("setImageHugsTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property symbolConfiguration
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun symbolConfiguration(): MemorySegment {
        val sel = ObjCRuntime.sel("symbolConfiguration")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setSymbolConfiguration(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSymbolConfiguration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property state
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun state(): Long {
        val sel = ObjCRuntime.sel("state")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setState(value: Long) {
        val sel = ObjCRuntime.sel("setState:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsMixedState
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsMixedState(): Boolean {
        val sel = ObjCRuntime.sel("allowsMixedState")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsMixedState(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsMixedState:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property keyEquivalent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyEquivalent(): MemorySegment {
        val sel = ObjCRuntime.sel("keyEquivalent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKeyEquivalent(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setKeyEquivalent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyEquivalentAsString(): String = ObjCRuntime.toJavaString(keyEquivalent())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKeyEquivalent(value: String) = setKeyEquivalent(ObjCRuntime.newNSString(Arena.global(), value))

    // @property keyEquivalentModifierMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyEquivalentModifierMask(): NSEventModifierFlags {
        val sel = ObjCRuntime.sel("keyEquivalentModifierMask")
        return NSEventModifierFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKeyEquivalentModifierMask(value: NSEventModifierFlags) {
        val sel = ObjCRuntime.sel("setKeyEquivalentModifierMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property activeCompressionOptions
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun activeCompressionOptions(): MemorySegment {
        val sel = ObjCRuntime.sel("activeCompressionOptions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property borderShape
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun borderShape(): NSControlBorderShape {
        val sel = ObjCRuntime.sel("borderShape")
        return NSControlBorderShape(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setBorderShape(value: NSControlBorderShape) {
        val sel = ObjCRuntime.sel("setBorderShape:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

/** Required by Objective-C protocol NSUserInterfaceValidations. */
fun NSButton.validateUserInterfaceItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

// ── Category: NSButtonDeprecated on NSButton ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Mnemonics are not used on macOS. Set the title property directly instead.")
fun NSButton.setTitleWithMnemonic(stringWithAmpersand: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleWithMnemonic:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stringWithAmpersand)
}
