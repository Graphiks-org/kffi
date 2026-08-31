@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStatusBarButton
 * Superclass: NSButton
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSStatusBarButton(override val ptr: MemorySegment) : NSButton(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSStatusBarButton") } }

    }

    // @property appearsDisabled
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun appearsDisabled(): Boolean {
        val sel = ObjCRuntime.sel("appearsDisabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAppearsDisabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setAppearsDisabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
