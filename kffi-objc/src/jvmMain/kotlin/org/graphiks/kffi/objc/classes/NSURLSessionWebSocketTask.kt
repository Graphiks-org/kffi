@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLSessionWebSocketTask
 * Superclass: NSURLSessionTask
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
open class NSURLSessionWebSocketTask(override val ptr: MemorySegment) : NSURLSessionTask(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSURLSessionWebSocketTask") }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun sendMessage_completionHandler(message: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("sendMessage:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, message, completionHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun receiveMessageWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("receiveMessageWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun sendPingWithPongReceiveHandler(pongReceiveHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("sendPingWithPongReceiveHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, pongReceiveHandler)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun cancelWithCloseCode_reason(closeCode: NSURLSessionWebSocketCloseCode, reason: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("cancelWithCloseCode:reason:")
        ObjCRuntime.msgSend(null, ptr, sel, closeCode.rawValue, reason)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property maximumMessageSize
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun maximumMessageSize(): Long {
        val sel = ObjCRuntime.sel("maximumMessageSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun setMaximumMessageSize(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumMessageSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property closeCode
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun closeCode(): NSURLSessionWebSocketCloseCode {
        val sel = ObjCRuntime.sel("closeCode")
        return NSURLSessionWebSocketCloseCode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property closeReason
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    open fun closeReason(): MemorySegment {
        val sel = ObjCRuntime.sel("closeReason")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
