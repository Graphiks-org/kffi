@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMagnificationGestureRecognizer
 * Superclass: NSGestureRecognizer
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSMagnificationGestureRecognizer(override val ptr: MemorySegment) : NSGestureRecognizer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMagnificationGestureRecognizer") }

    }

    // @property magnification
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun magnification(): Double {
        val sel = ObjCRuntime.sel("magnification")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMagnification(value: Double) {
        val sel = ObjCRuntime.sel("setMagnification:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
