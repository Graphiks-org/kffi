@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCScreenshotManager
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
open class SCScreenshotManager(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCScreenshotManager") } }

        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun captureSampleBufferWithFilter_configuration_completionHandler(contentFilter: MemorySegment, config: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("captureSampleBufferWithFilter:configuration:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, contentFilter, config, completionHandler)
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun captureImageWithFilter_configuration_completionHandler(contentFilter: MemorySegment, config: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("captureImageWithFilter:configuration:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, contentFilter, config, completionHandler)
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
        fun captureImageInRect_completionHandler(rect: CGRect, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("captureImageInRect:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout), completionHandler)
        }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun captureScreenshotWithFilter_configuration_completionHandler(contentFilter: MemorySegment, config: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("captureScreenshotWithFilter:configuration:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, contentFilter, config, completionHandler)
        }

        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun captureScreenshotWithRect_configuration_completionHandler(rect: CGRect, config: MemorySegment, completionHandler: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("captureScreenshotWithRect:configuration:completionHandler:")
            ObjCRuntime.msgSend(null, _class, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout), config, completionHandler)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", unavailable = true)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
