@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDockTile
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSDockTile(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDockTile") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun display(): Unit {
        val sel = ObjCRuntime.sel("display")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property size
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun size(): NSSize {
        val sel = ObjCRuntime.sel("size")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

    // @property contentView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsApplicationBadge
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsApplicationBadge(): Boolean {
        val sel = ObjCRuntime.sel("showsApplicationBadge")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsApplicationBadge(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsApplicationBadge:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property badgeLabel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun badgeLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("badgeLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBadgeLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBadgeLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun badgeLabelAsString(): String = ObjCRuntime.toJavaString(badgeLabel())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBadgeLabel(value: String) = setBadgeLabel(ObjCRuntime.newNSString(Arena.global(), value))

    // @property owner
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun owner(): MemorySegment {
        val sel = ObjCRuntime.sel("owner")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
