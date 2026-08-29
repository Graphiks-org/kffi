@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSProxy
 * Protocols: NSObject
 */
open class NSProxy(open val ptr: MemorySegment) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSProxy") }

        fun alloc(): MemorySegment {
            val sel = ObjCRuntime.sel("alloc")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
        fun allocWithZone(zone: NSZonePointer): MemorySegment {
            val sel = ObjCRuntime.sel("allocWithZone:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, zone.segment) as MemorySegment
        }

        fun `class`(): MemorySegment {
            val sel = ObjCRuntime.sel("class")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun respondsToSelector(aSelector: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("respondsToSelector:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, aSelector) as Boolean
        }

    }

    open fun forwardInvocation(invocation: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("forwardInvocation:")
        ObjCRuntime.msgSend(null, ptr, sel, invocation)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun methodSignatureForSelector(sel: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("methodSignatureForSelector:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sel) as MemorySegment
    }

    open fun dealloc(): Unit {
        val sel = ObjCRuntime.sel("dealloc")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun finalizeObjC(): Unit {
        val sel = ObjCRuntime.sel("finalize")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", unavailable = true)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun allowsWeakReference(): Boolean {
        val sel = ObjCRuntime.sel("allowsWeakReference")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", unavailable = true)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun retainWeakReference(): Boolean {
        val sel = ObjCRuntime.sel("retainWeakReference")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property description
    open fun description(): MemorySegment {
        val sel = ObjCRuntime.sel("description")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun descriptionAsString(): String = ObjCRuntime.toJavaString(description())

    // @property debugDescription
    open fun debugDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("debugDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun debugDescriptionAsString(): String = ObjCRuntime.toJavaString(debugDescription())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: isa: MemorySegment
}
