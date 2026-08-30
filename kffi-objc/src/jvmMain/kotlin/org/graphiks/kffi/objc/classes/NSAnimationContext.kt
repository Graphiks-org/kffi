@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAnimationContext
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSAnimationContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAnimationContext") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun runAnimationGroup_completionHandler(changes: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("runAnimationGroup:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, changes, completionHandler)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun runAnimationGroup(changes: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("runAnimationGroup:")
            ObjCRuntime.msgSend(null, _class, sel, changes)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun beginGrouping(): Unit {
            val sel = ObjCRuntime.sel("beginGrouping")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun endGrouping(): Unit {
            val sel = ObjCRuntime.sel("endGrouping")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentContext(): MemorySegment {
            val sel = ObjCRuntime.sel("currentContext")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property duration
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun duration(): Double {
        val sel = ObjCRuntime.sel("duration")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDuration(value: Double) {
        val sel = ObjCRuntime.sel("setDuration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property timingFunction
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun timingFunction(): MemorySegment {
        val sel = ObjCRuntime.sel("timingFunction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setTimingFunction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTimingFunction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property completionHandler
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun completionHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("completionHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setCompletionHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsImplicitAnimation
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun allowsImplicitAnimation(): Boolean {
        val sel = ObjCRuntime.sel("allowsImplicitAnimation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setAllowsImplicitAnimation(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsImplicitAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
