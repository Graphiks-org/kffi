@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMethodSignature
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
open class NSMethodSignature(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMethodSignature") }

        @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
        fun signatureWithObjCTypes(types: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("signatureWithObjCTypes:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, types) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun getArgumentTypeAtIndex(idx: Long): MemorySegment {
        val sel = ObjCRuntime.sel("getArgumentTypeAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, idx) as MemorySegment
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun isOneway(): Boolean {
        val sel = ObjCRuntime.sel("isOneway")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property numberOfArguments
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun numberOfArguments(): Long {
        val sel = ObjCRuntime.sel("numberOfArguments")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property frameLength
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun frameLength(): Long {
        val sel = ObjCRuntime.sel("frameLength")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property methodReturnType
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun methodReturnType(): MemorySegment {
        val sel = ObjCRuntime.sel("methodReturnType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property methodReturnLength
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun methodReturnLength(): Long {
        val sel = ObjCRuntime.sel("methodReturnLength")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
