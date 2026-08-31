@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLDownload
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSURLDownload(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSURLDownload") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun canResumeDownloadDecodedWithEncodingMIMEType(MIMEType: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canResumeDownloadDecodedWithEncodingMIMEType:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, MIMEType) as Boolean
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun canResumeDownloadDecodedWithEncodingMIMEType(MIMEType: String): Boolean = canResumeDownloadDecodedWithEncodingMIMEType(ObjCRuntime.newNSString(Arena.global(), MIMEType))

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    open fun initWithRequest_delegate(request: MemorySegment, delegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRequest:delegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, request, delegate) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    open fun initWithResumeData_delegate_path(resumeData: MemorySegment, delegate: MemorySegment, path: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithResumeData:delegate:path:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, resumeData, delegate, path) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession downloadTask (see NSURLSession.h)")
    fun initWithResumeData_delegate_path(resumeData: MemorySegment, delegate: MemorySegment, path: String): MemorySegment = initWithResumeData_delegate_path(resumeData, delegate, ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun cancel(): Unit {
        val sel = ObjCRuntime.sel("cancel")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setDestination_allowOverwrite(path: MemorySegment, allowOverwrite: Boolean): Unit {
        val sel = ObjCRuntime.sel("setDestination:allowOverwrite:")
        ObjCRuntime.msgSend(null, ptr, sel, path, allowOverwrite)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    fun setDestination_allowOverwrite(path: String, allowOverwrite: Boolean): Unit = setDestination_allowOverwrite(ObjCRuntime.newNSString(Arena.global(), path), allowOverwrite)

    // @property request
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun request(): MemorySegment {
        val sel = ObjCRuntime.sel("request")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property resumeData
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun resumeData(): MemorySegment {
        val sel = ObjCRuntime.sel("resumeData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property deletesFileUponFailure
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun deletesFileUponFailure(): Boolean {
        val sel = ObjCRuntime.sel("deletesFileUponFailure")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setDeletesFileUponFailure(value: Boolean) {
        val sel = ObjCRuntime.sel("setDeletesFileUponFailure:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}
