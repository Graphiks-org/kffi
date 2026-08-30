@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAccessibilityCustomRotorSearchParameters
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
open class NSAccessibilityCustomRotorSearchParameters(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAccessibilityCustomRotorSearchParameters") }

    }

    // @property currentItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentItem(): MemorySegment {
        val sel = ObjCRuntime.sel("currentItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCurrentItem(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCurrentItem:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property searchDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun searchDirection(): NSAccessibilityCustomRotorSearchDirection {
        val sel = ObjCRuntime.sel("searchDirection")
        return NSAccessibilityCustomRotorSearchDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSearchDirection(value: NSAccessibilityCustomRotorSearchDirection) {
        val sel = ObjCRuntime.sel("setSearchDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property filterString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun filterString(): MemorySegment {
        val sel = ObjCRuntime.sel("filterString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFilterString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFilterString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun filterStringAsString(): String = ObjCRuntime.toJavaString(filterString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFilterString(value: String) = setFilterString(ObjCRuntime.newNSString(Arena.global(), value))

}
