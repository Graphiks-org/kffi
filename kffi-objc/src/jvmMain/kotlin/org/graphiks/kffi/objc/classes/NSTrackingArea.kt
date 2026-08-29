@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTrackingArea
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSTrackingArea(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTrackingArea") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithRect_options_owner_userInfo(rect: NSRect, options: NSTrackingAreaOptions, owner: MemorySegment, userInfo: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRect:options:owner:userInfo:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue, owner, userInfo) as MemorySegment
    }

    // @property rect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rect(): NSRect {
        val sel = ObjCRuntime.sel("rect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property options
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun options(): NSTrackingAreaOptions {
        val sel = ObjCRuntime.sel("options")
        return NSTrackingAreaOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property owner
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun owner(): MemorySegment {
        val sel = ObjCRuntime.sel("owner")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property userInfo
    /** @return NSDictionary<id,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun userInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("userInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSTrackingArea.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSTrackingArea.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTrackingArea.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
