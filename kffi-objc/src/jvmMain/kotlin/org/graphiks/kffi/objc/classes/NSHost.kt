@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSHost
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
open class NSHost(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSHost") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun currentHost(): MemorySegment {
            val sel = ObjCRuntime.sel("currentHost")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun hostWithName(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("hostWithName:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun hostWithName(name: String): MemorySegment = hostWithName(ObjCRuntime.newNSString(Arena.global(), name))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun hostWithAddress(address: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("hostWithAddress:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, address) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun hostWithAddress(address: String): MemorySegment = hostWithAddress(ObjCRuntime.newNSString(Arena.global(), address))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Caching no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun setHostCacheEnabled(flag: Boolean): Unit {
            val sel = ObjCRuntime.sel("setHostCacheEnabled:")
            ObjCRuntime.msgSend(null, _class, sel, flag)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Caching no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun isHostCacheEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isHostCacheEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Caching no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun flushHostCache(): Unit {
            val sel = ObjCRuntime.sel("flushHostCache")
            ObjCRuntime.msgSend(null, _class, sel)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun isEqualToHost(aHost: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isEqualToHost:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, aHost) as Boolean
    }

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    // @property names
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun names(): MemorySegment {
        val sel = ObjCRuntime.sel("names")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property address
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun address(): MemorySegment {
        val sel = ObjCRuntime.sel("address")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun addressAsString(): String = ObjCRuntime.toJavaString(address())

    // @property addresses
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use Network framework instead, see deprecation notice in <Foundation/NSHost.h>")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun addresses(): MemorySegment {
        val sel = ObjCRuntime.sel("addresses")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property localizedName
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun localizedName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun localizedNameAsString(): String = ObjCRuntime.toJavaString(localizedName())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: names: MemorySegment
    // ivar: addresses: MemorySegment
    // ivar: reserved: MemorySegment
}
