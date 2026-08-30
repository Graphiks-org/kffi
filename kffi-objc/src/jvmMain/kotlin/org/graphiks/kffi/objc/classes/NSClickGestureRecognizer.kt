@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSClickGestureRecognizer
 * Superclass: NSGestureRecognizer
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSClickGestureRecognizer(override val ptr: MemorySegment) : NSGestureRecognizer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSClickGestureRecognizer") } }

    }

    // @property buttonMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun buttonMask(): Long {
        val sel = ObjCRuntime.sel("buttonMask")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setButtonMask(value: Long) {
        val sel = ObjCRuntime.sel("setButtonMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfClicksRequired
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfClicksRequired(): Long {
        val sel = ObjCRuntime.sel("numberOfClicksRequired")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNumberOfClicksRequired(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfClicksRequired:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfTouchesRequired
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun numberOfTouchesRequired(): Long {
        val sel = ObjCRuntime.sel("numberOfTouchesRequired")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setNumberOfTouchesRequired(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfTouchesRequired:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
