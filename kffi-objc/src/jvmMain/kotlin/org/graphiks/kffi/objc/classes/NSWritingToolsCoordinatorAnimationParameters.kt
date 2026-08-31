@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWritingToolsCoordinatorAnimationParameters
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
open class NSWritingToolsCoordinatorAnimationParameters(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSWritingToolsCoordinatorAnimationParameters") } }

    }

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property duration
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun duration(): Double {
        val sel = ObjCRuntime.sel("duration")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property delay
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun delay(): Double {
        val sel = ObjCRuntime.sel("delay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property progressHandler
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun progressHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("progressHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun setProgressHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setProgressHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property completionHandler
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun completionHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("completionHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun setCompletionHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
