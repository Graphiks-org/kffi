@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSharingServicePickerToolbarItem
 * Superclass: NSToolbarItem
 */
@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSSharingServicePickerToolbarItem(override val ptr: MemorySegment) : NSToolbarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSharingServicePickerToolbarItem") }

    }

    // @property delegate
    /** @return id<NSSharingServicePickerToolbarItemDelegate> */
    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
