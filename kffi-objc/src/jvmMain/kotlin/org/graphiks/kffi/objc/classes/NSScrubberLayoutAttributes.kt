@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberLayoutAttributes
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubberLayoutAttributes(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScrubberLayoutAttributes") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun layoutAttributesForItemAtIndex(index: Long): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesForItemAtIndex:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, index) as MemorySegment
        }

    }

    // @property itemIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemIndex(): Long {
        val sel = ObjCRuntime.sel("itemIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemIndex(value: Long) {
        val sel = ObjCRuntime.sel("setItemIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property frame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrame(value: NSRect) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property alpha
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alpha(): Double {
        val sel = ObjCRuntime.sel("alpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlpha(value: Double) {
        val sel = ObjCRuntime.sel("setAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSScrubberLayoutAttributes.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
