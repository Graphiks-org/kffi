@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMenuItemBadge
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
open class NSMenuItemBadge(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMenuItemBadge") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun updatesWithCount(itemCount: Long): MemorySegment {
            val sel = ObjCRuntime.sel("updatesWithCount:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, itemCount) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun newItemsWithCount(itemCount: Long): MemorySegment {
            val sel = ObjCRuntime.sel("newItemsWithCount:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, itemCount) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun alertsWithCount(itemCount: Long): MemorySegment {
            val sel = ObjCRuntime.sel("alertsWithCount:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, itemCount) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "swift", unavailable = true, message = "Use updates(count:), newItems(count:), or alerts(count:) instead.")
    open fun initWithCount_type(itemCount: Long, type: NSMenuItemBadgeType): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCount:type:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, itemCount, type.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCount(itemCount: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCount:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, itemCount) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithString(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithString(string: String): MemorySegment = initWithString(ObjCRuntime.newNSString(Arena.global(), string))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property itemCount
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemCount(): Long {
        val sel = ObjCRuntime.sel("itemCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property type
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun type(): NSMenuItemBadgeType {
        val sel = ObjCRuntime.sel("type")
        return NSMenuItemBadgeType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property stringValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringValue(): MemorySegment {
        val sel = ObjCRuntime.sel("stringValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringValueAsString(): String = ObjCRuntime.toJavaString(stringValue())

}

/** Required by Objective-C protocol NSCopying. */
fun NSMenuItemBadge.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
