@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLayoutAnchor
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSLayoutAnchor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLayoutAnchor") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun constraintEqualToAnchor(anchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("constraintEqualToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun constraintGreaterThanOrEqualToAnchor(anchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("constraintGreaterThanOrEqualToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun constraintLessThanOrEqualToAnchor(anchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("constraintLessThanOrEqualToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun constraintEqualToAnchor_constant(anchor: MemorySegment, c: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintEqualToAnchor:constant:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, c) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun constraintGreaterThanOrEqualToAnchor_constant(anchor: MemorySegment, c: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintGreaterThanOrEqualToAnchor:constant:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, c) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun constraintLessThanOrEqualToAnchor_constant(anchor: MemorySegment, c: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintLessThanOrEqualToAnchor:constant:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, c) as MemorySegment
    }

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    // @property item
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun item(): MemorySegment {
        val sel = ObjCRuntime.sel("item")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hasAmbiguousLayout
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun hasAmbiguousLayout(): Boolean {
        val sel = ObjCRuntime.sel("hasAmbiguousLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property constraintsAffectingLayout
    /** @return NSArray<NSLayoutConstraint *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun constraintsAffectingLayout(): MemorySegment {
        val sel = ObjCRuntime.sel("constraintsAffectingLayout")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSLayoutAnchor.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutAnchor.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutAnchor.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
