@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLSessionStreamTask
 * Superclass: NSURLSessionTask
 */
@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSURLSessionStreamTask(override val ptr: MemorySegment) : NSURLSessionTask(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSURLSessionStreamTask") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun readDataOfMinLength_maxLength_timeout_completionHandler(minBytes: Long, maxBytes: Long, timeout: Double, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("readDataOfMinLength:maxLength:timeout:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, minBytes, maxBytes, timeout, completionHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun writeData_timeout_completionHandler(`data`: MemorySegment, timeout: Double, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("writeData:timeout:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, `data`, timeout, completionHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun captureStreams(): Unit {
        val sel = ObjCRuntime.sel("captureStreams")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun closeWrite(): Unit {
        val sel = ObjCRuntime.sel("closeWrite")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun closeRead(): Unit {
        val sel = ObjCRuntime.sel("closeRead")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun startSecureConnection(): Unit {
        val sel = ObjCRuntime.sel("startSecureConnection")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "TLS cannot be disabled once it is enabled")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "TLS cannot be disabled once it is enabled")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "TLS cannot be disabled once it is enabled")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "TLS cannot be disabled once it is enabled")
    open fun stopSecureConnection(): Unit {
        val sel = ObjCRuntime.sel("stopSecureConnection")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use -[NSURLSession streamTaskWithHostName:port:] or other NSURLSession methods to create instances")
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
