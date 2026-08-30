@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSToolbarItemGroup
 * Superclass: NSToolbarItem
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSToolbarItemGroup(override val ptr: MemorySegment) : NSToolbarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSToolbarItemGroup") }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun groupWithItemIdentifier_titles_selectionMode_labels_target_action(itemIdentifier: MemorySegment, titles: MemorySegment, selectionMode: NSToolbarItemGroupSelectionMode, labels: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("groupWithItemIdentifier:titles:selectionMode:labels:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, itemIdentifier, titles, selectionMode.rawValue, labels, target, action) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun groupWithItemIdentifier_images_selectionMode_labels_target_action(itemIdentifier: MemorySegment, images: MemorySegment, selectionMode: NSToolbarItemGroupSelectionMode, labels: MemorySegment, target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("groupWithItemIdentifier:images:selectionMode:labels:target:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, itemIdentifier, images, selectionMode.rawValue, labels, target, action) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setSelected_atIndex(selected: Boolean, index: Long): Unit {
        val sel = ObjCRuntime.sel("setSelected:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, selected, index)
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun isSelectedAtIndex(index: Long): Boolean {
        val sel = ObjCRuntime.sel("isSelectedAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, index) as Boolean
    }

    // @property subitems
    /** @return NSArray<__kindof NSToolbarItem *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun subitems(): MemorySegment {
        val sel = ObjCRuntime.sel("subitems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setSubitems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubitems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property controlRepresentation
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun controlRepresentation(): NSToolbarItemGroupControlRepresentation {
        val sel = ObjCRuntime.sel("controlRepresentation")
        return NSToolbarItemGroupControlRepresentation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setControlRepresentation(value: NSToolbarItemGroupControlRepresentation) {
        val sel = ObjCRuntime.sel("setControlRepresentation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property selectionMode
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun selectionMode(): NSToolbarItemGroupSelectionMode {
        val sel = ObjCRuntime.sel("selectionMode")
        return NSToolbarItemGroupSelectionMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setSelectionMode(value: NSToolbarItemGroupSelectionMode) {
        val sel = ObjCRuntime.sel("setSelectionMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property selectedIndex
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun selectedIndex(): Long {
        val sel = ObjCRuntime.sel("selectedIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setSelectedIndex(value: Long) {
        val sel = ObjCRuntime.sel("setSelectedIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
