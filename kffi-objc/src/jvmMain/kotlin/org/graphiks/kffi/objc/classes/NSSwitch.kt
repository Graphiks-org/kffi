@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSwitch
 * Superclass: NSControl
 * Protocols: NSAccessibilitySwitch
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSSwitch(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSwitch") }

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

}
