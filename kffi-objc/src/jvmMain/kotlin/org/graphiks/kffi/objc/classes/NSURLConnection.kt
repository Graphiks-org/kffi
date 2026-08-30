@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLConnection
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSURLConnection(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSURLConnection") }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun connectionWithRequest_delegate(request: MemorySegment, delegate: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("connectionWithRequest:delegate:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, request, delegate) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun canHandleRequest(request: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canHandleRequest:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, request) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun initWithRequest_delegate_startImmediately(request: MemorySegment, delegate: MemorySegment, startImmediately: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRequest:delegate:startImmediately:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, request, delegate, startImmediately) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLSession (see NSURLSession.h)")
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun initWithRequest_delegate(request: MemorySegment, delegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRequest:delegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, request, delegate) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun start(): Unit {
        val sel = ObjCRuntime.sel("start")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun cancel(): Unit {
        val sel = ObjCRuntime.sel("cancel")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun scheduleInRunLoop_forMode(aRunLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scheduleInRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, aRunLoop, mode)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun unscheduleFromRunLoop_forMode(aRunLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unscheduleFromRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, aRunLoop, mode)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setDelegateQueue(queue: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDelegateQueue:")
        ObjCRuntime.msgSend(null, ptr, sel, queue)
    }

    // @property originalRequest
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun originalRequest(): MemorySegment {
        val sel = ObjCRuntime.sel("originalRequest")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property currentRequest
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun currentRequest(): MemorySegment {
        val sel = ObjCRuntime.sel("currentRequest")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _internal: MemorySegment
}

// ── Category: NSURLConnectionSynchronousLoading on NSURLConnection ─────────────────────────────────────────

// Class method: +[NSURLConnection sendSynchronousRequest:returningResponse:error:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSURLSession dataTaskWithRequest:completionHandler:] (see NSURLSession.h")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use [NSURLSession dataTaskWithRequest:completionHandler:] (see NSURLSession.h")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSURLSession dataTaskWithRequest:completionHandler:] (see NSURLSession.h")
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSURLConnection_sendSynchronousRequest_returningResponse_error(request: MemorySegment, response: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sendSynchronousRequest:returningResponse:error:")
    val cls = ObjCRuntime.getClass("NSURLConnection")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, request, response, error) as MemorySegment
}

// ── Category: NSURLConnectionQueuedLoading on NSURLConnection ─────────────────────────────────────────

// Class method: +[NSURLConnection sendAsynchronousRequest:queue:completionHandler:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSURLSession dataTaskWithRequest:completionHandler:] (see NSURLSession.h")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use [NSURLSession dataTaskWithRequest:completionHandler:] (see NSURLSession.h")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSURLSession dataTaskWithRequest:completionHandler:] (see NSURLSession.h")
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSURLConnection_sendAsynchronousRequest_queue_completionHandler(request: MemorySegment, queue: MemorySegment, handler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sendAsynchronousRequest:queue:completionHandler:")
    val cls = ObjCRuntime.getClass("NSURLConnection")
    ObjCRuntime.msgSend(null, cls, sel, request, queue, handler)
}
