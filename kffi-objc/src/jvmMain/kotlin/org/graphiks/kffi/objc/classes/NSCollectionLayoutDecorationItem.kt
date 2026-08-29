@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutDecorationItem
 * Superclass: NSCollectionLayoutItem
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutDecorationItem(override val ptr: MemorySegment) : NSCollectionLayoutItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutDecorationItem") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun backgroundDecorationItemWithElementKind(elementKind: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("backgroundDecorationItemWithElementKind:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, elementKind) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun backgroundDecorationItemWithElementKind(elementKind: String): MemorySegment = backgroundDecorationItemWithElementKind(ObjCRuntime.newNSString(Arena.global(), elementKind))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property zIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun zIndex(): Long {
        val sel = ObjCRuntime.sel("zIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setZIndex(value: Long) {
        val sel = ObjCRuntime.sel("setZIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property elementKind
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun elementKind(): MemorySegment {
        val sel = ObjCRuntime.sel("elementKind")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun elementKindAsString(): String = ObjCRuntime.toJavaString(elementKind())

}
