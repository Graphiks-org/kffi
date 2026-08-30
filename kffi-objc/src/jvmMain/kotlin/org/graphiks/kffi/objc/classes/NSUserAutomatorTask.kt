@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUserAutomatorTask
 * Superclass: NSUserScriptTask
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSUserAutomatorTask(override val ptr: MemorySegment) : NSUserScriptTask(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSUserAutomatorTask") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun executeWithInput_completionHandler(input: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("executeWithInput:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, input, handler)
    }

    // @property variables
    /** @return NSDictionary<NSString *,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun variables(): MemorySegment {
        val sel = ObjCRuntime.sel("variables")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setVariables(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVariables:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _variables: MemorySegment
}
