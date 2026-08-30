@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStream
 * Superclass: NSObject
 */
open class NSStream(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSStream") }

    }

    open fun open(): Unit {
        val sel = ObjCRuntime.sel("open")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun close(): Unit {
        val sel = ObjCRuntime.sel("close")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun propertyForKey(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("propertyForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    open fun setProperty_forKey(property: MemorySegment, key: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setProperty:forKey:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, property, key) as Boolean
    }

    open fun scheduleInRunLoop_forMode(aRunLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scheduleInRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, aRunLoop, mode)
    }

    open fun removeFromRunLoop_forMode(aRunLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeFromRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, aRunLoop, mode)
    }

    // @property delegate
    /** @return id<NSStreamDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property streamStatus
    open fun streamStatus(): NSStreamStatus {
        val sel = ObjCRuntime.sel("streamStatus")
        return NSStreamStatus(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property streamError
    open fun streamError(): MemorySegment {
        val sel = ObjCRuntime.sel("streamError")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category: NSSocketStreamCreationExtensions on NSStream ─────────────────────────────────────────

// Class method: +[NSStream getStreamsToHostWithName:port:inputStream:outputStream:]
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSStream_getStreamsToHostWithName_port_inputStream_outputStream(hostname: MemorySegment, port: Long, inputStream: MemorySegment, outputStream: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getStreamsToHostWithName:port:inputStream:outputStream:")
    val cls = ObjCRuntime.getClass("NSStream")
    ObjCRuntime.msgSend(null, cls, sel, hostname, port, inputStream, outputStream)
}

// Class method: +[NSStream getStreamsToHost:port:inputStream:outputStream:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSStream_getStreamsToHost_port_inputStream_outputStream(host: MemorySegment, port: Long, inputStream: MemorySegment, outputStream: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getStreamsToHost:port:inputStream:outputStream:")
    val cls = ObjCRuntime.getClass("NSStream")
    ObjCRuntime.msgSend(null, cls, sel, host, port, inputStream, outputStream)
}

// ── Category: NSStreamBoundPairCreationExtensions on NSStream ─────────────────────────────────────────

// Class method: +[NSStream getBoundStreamsWithBufferSize:inputStream:outputStream:]
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSStream_getBoundStreamsWithBufferSize_inputStream_outputStream(bufferSize: Long, inputStream: MemorySegment, outputStream: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getBoundStreamsWithBufferSize:inputStream:outputStream:")
    val cls = ObjCRuntime.getClass("NSStream")
    ObjCRuntime.msgSend(null, cls, sel, bufferSize, inputStream, outputStream)
}
