@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSUserScriptTask
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSUserScriptTask(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSUserScriptTask") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun initWithURL_error(url: MemorySegment, error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithURL:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, url, error) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun executeWithCompletionHandler(handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("executeWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, handler)
    }

    // @property scriptURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun scriptURL(): MemorySegment {
        val sel = ObjCRuntime.sel("scriptURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _scriptURL: MemorySegment
    // ivar: _connection: MemorySegment
    // ivar: _hasExeced: Boolean
    // ivar: _hasTerminated: Boolean
    // ivar: _stdin: MemorySegment
    // ivar: _stdout: MemorySegment
    // ivar: _stderr: MemorySegment
}
