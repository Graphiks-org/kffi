@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPort
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
open class NSPort(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPort") }

        fun port(): MemorySegment {
            val sel = ObjCRuntime.sel("port")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun invalidate(): Unit {
        val sel = ObjCRuntime.sel("invalidate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setDelegate(anObject: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, anObject)
    }

    /** @return id<NSPortDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun scheduleInRunLoop_forMode(runLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scheduleInRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, runLoop, mode)
    }

    open fun removeFromRunLoop_forMode(runLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeFromRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, runLoop, mode)
    }

    open fun sendBeforeDate_components_from_reserved(limitDate: MemorySegment, components: MemorySegment, receivePort: MemorySegment, headerSpaceReserved: Long): Boolean {
        val sel = ObjCRuntime.sel("sendBeforeDate:components:from:reserved:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, limitDate, components, receivePort, headerSpaceReserved) as Boolean
    }

    open fun sendBeforeDate_msgid_components_from_reserved(limitDate: MemorySegment, msgID: Long, components: MemorySegment, receivePort: MemorySegment, headerSpaceReserved: Long): Boolean {
        val sel = ObjCRuntime.sel("sendBeforeDate:msgid:components:from:reserved:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, limitDate, msgID, components, receivePort, headerSpaceReserved) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    open fun addConnection_toRunLoop_forMode(conn: MemorySegment, runLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addConnection:toRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, conn, runLoop, mode)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSXPCConnection instead")
    open fun removeConnection_fromRunLoop_forMode(conn: MemorySegment, runLoop: MemorySegment, mode: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeConnection:fromRunLoop:forMode:")
        ObjCRuntime.msgSend(null, ptr, sel, conn, runLoop, mode)
    }

    // @property valid
    open fun isValid(): Boolean {
        val sel = ObjCRuntime.sel("isValid")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property reservedSpaceLength
    open fun reservedSpaceLength(): Long {
        val sel = ObjCRuntime.sel("reservedSpaceLength")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSPort.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSPort.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSPort.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
