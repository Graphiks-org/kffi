@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGroupTouchBarItem
 * Superclass: NSTouchBarItem
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSGroupTouchBarItem(override val ptr: MemorySegment) : NSTouchBarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSGroupTouchBarItem") }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun groupItemWithIdentifier_items(identifier: MemorySegment, items: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("groupItemWithIdentifier:items:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier, items) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        fun groupItemWithIdentifier_items_allowedCompressionOptions(identifier: MemorySegment, items: MemorySegment, allowedCompressionOptions: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("groupItemWithIdentifier:items:allowedCompressionOptions:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier, items, allowedCompressionOptions) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        fun alertStyleGroupItemWithIdentifier(identifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("alertStyleGroupItemWithIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier) as MemorySegment
        }

    }

    // @property groupTouchBar
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun groupTouchBar(): MemorySegment {
        val sel = ObjCRuntime.sel("groupTouchBar")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setGroupTouchBar(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setGroupTouchBar:")
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

    // @property groupUserInterfaceLayoutDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun groupUserInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection {
        val sel = ObjCRuntime.sel("groupUserInterfaceLayoutDirection")
        return NSUserInterfaceLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setGroupUserInterfaceLayoutDirection(value: NSUserInterfaceLayoutDirection) {
        val sel = ObjCRuntime.sel("setGroupUserInterfaceLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property prefersEqualWidths
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun prefersEqualWidths(): Boolean {
        val sel = ObjCRuntime.sel("prefersEqualWidths")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setPrefersEqualWidths(value: Boolean) {
        val sel = ObjCRuntime.sel("setPrefersEqualWidths:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredItemWidth
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun preferredItemWidth(): Double {
        val sel = ObjCRuntime.sel("preferredItemWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setPreferredItemWidth(value: Double) {
        val sel = ObjCRuntime.sel("setPreferredItemWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property effectiveCompressionOptions
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun effectiveCompressionOptions(): MemorySegment {
        val sel = ObjCRuntime.sel("effectiveCompressionOptions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property prioritizedCompressionOptions
    /** @return NSArray<NSUserInterfaceCompressionOptions *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun prioritizedCompressionOptions(): MemorySegment {
        val sel = ObjCRuntime.sel("prioritizedCompressionOptions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setPrioritizedCompressionOptions(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPrioritizedCompressionOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
