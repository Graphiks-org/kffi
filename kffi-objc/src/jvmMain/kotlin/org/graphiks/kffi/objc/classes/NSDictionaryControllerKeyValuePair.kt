@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDictionaryControllerKeyValuePair
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSDictionaryControllerKeyValuePair(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDictionaryControllerKeyValuePair") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property key
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun key(): MemorySegment {
        val sel = ObjCRuntime.sel("key")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKey(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyAsString(): String = ObjCRuntime.toJavaString(key())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKey(value: String) = setKey(ObjCRuntime.newNSString(Arena.global(), value))

    // @property value
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun value(): MemorySegment {
        val sel = ObjCRuntime.sel("value")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property localizedKey
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedKey(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedKey")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLocalizedKey(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLocalizedKey:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedKeyAsString(): String = ObjCRuntime.toJavaString(localizedKey())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLocalizedKey(value: String) = setLocalizedKey(ObjCRuntime.newNSString(Arena.global(), value))

    // @property explicitlyIncluded
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isExplicitlyIncluded(): Boolean {
        val sel = ObjCRuntime.sel("isExplicitlyIncluded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
