@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCMouseInput
 * Superclass: GCPhysicalInputProfile
 */
@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
open class GCMouseInput(override val ptr: MemorySegment) : GCPhysicalInputProfile(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCMouseInput") } }

    }

    // @property mouseMovedHandler
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun mouseMovedHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("mouseMovedHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setMouseMovedHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMouseMovedHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property scroll
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun scroll(): MemorySegment {
        val sel = ObjCRuntime.sel("scroll")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property leftButton
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun leftButton(): MemorySegment {
        val sel = ObjCRuntime.sel("leftButton")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rightButton
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun rightButton(): MemorySegment {
        val sel = ObjCRuntime.sel("rightButton")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property middleButton
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun middleButton(): MemorySegment {
        val sel = ObjCRuntime.sel("middleButton")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property auxiliaryButtons
    /** @return NSArray<GCControllerButtonInput *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun auxiliaryButtons(): MemorySegment {
        val sel = ObjCRuntime.sel("auxiliaryButtons")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
