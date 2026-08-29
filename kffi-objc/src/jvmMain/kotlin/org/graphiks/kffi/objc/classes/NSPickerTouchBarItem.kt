@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPickerTouchBarItem
 * Superclass: NSTouchBarItem
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSPickerTouchBarItem(override val ptr: MemorySegment) : NSTouchBarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPickerTouchBarItem") }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun pickerTouchBarItemWithIdentifier_labels_selectionMode_target_action(identifier: MemorySegment, labels: MemorySegment, selectionMode: NSPickerTouchBarItemSelectionMode, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("pickerTouchBarItemWithIdentifier:labels:selectionMode:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier, labels, selectionMode.rawValue, target, action) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun pickerTouchBarItemWithIdentifier_images_selectionMode_target_action(identifier: MemorySegment, images: MemorySegment, selectionMode: NSPickerTouchBarItemSelectionMode, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("pickerTouchBarItemWithIdentifier:images:selectionMode:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier, images, selectionMode.rawValue, target, action) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setImage_atIndex(image: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("setImage:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, image, index)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun imageAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("imageAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setLabel_atIndex(label: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("setLabel:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, label, index)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    fun setLabel_atIndex(label: String, index: Long): Unit = setLabel_atIndex(ObjCRuntime.newNSString(Arena.global(), label), index)

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun labelAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("labelAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    fun labelAtIndexAsString(index: Long): String = ObjCRuntime.toJavaString(labelAtIndex(index))

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setEnabled_atIndex(enabled: Boolean, index: Long): Unit {
        val sel = ObjCRuntime.sel("setEnabled:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, enabled, index)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun isEnabledAtIndex(index: Long): Boolean {
        val sel = ObjCRuntime.sel("isEnabledAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, index) as Boolean
    }

    // @property controlRepresentation
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun controlRepresentation(): NSPickerTouchBarItemControlRepresentation {
        val sel = ObjCRuntime.sel("controlRepresentation")
        return NSPickerTouchBarItemControlRepresentation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setControlRepresentation(value: NSPickerTouchBarItemControlRepresentation) {
        val sel = ObjCRuntime.sel("setControlRepresentation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property collapsedRepresentationLabel
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun collapsedRepresentationLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("collapsedRepresentationLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setCollapsedRepresentationLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCollapsedRepresentationLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun collapsedRepresentationLabelAsString(): String = ObjCRuntime.toJavaString(collapsedRepresentationLabel())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setCollapsedRepresentationLabel(value: String) = setCollapsedRepresentationLabel(ObjCRuntime.newNSString(Arena.global(), value))

    // @property collapsedRepresentationImage
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun collapsedRepresentationImage(): MemorySegment {
        val sel = ObjCRuntime.sel("collapsedRepresentationImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setCollapsedRepresentationImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCollapsedRepresentationImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectedIndex
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun selectedIndex(): Long {
        val sel = ObjCRuntime.sel("selectedIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setSelectedIndex(value: Long) {
        val sel = ObjCRuntime.sel("setSelectedIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionColor
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun selectionColor(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setSelectionColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectionColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionMode
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun selectionMode(): NSPickerTouchBarItemSelectionMode {
        val sel = ObjCRuntime.sel("selectionMode")
        return NSPickerTouchBarItemSelectionMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setSelectionMode(value: NSPickerTouchBarItemSelectionMode) {
        val sel = ObjCRuntime.sel("setSelectionMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property numberOfOptions
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun numberOfOptions(): Long {
        val sel = ObjCRuntime.sel("numberOfOptions")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setNumberOfOptions(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property target
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property action
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun action(): MemorySegment {
        val sel = ObjCRuntime.sel("action")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property enabled
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property customizationLabel
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    override fun customizationLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("customizationLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setCustomizationLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCustomizationLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
