@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSInvocation
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
open class NSInvocation(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSInvocation") }

        @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
        fun invocationWithMethodSignature(sig: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("invocationWithMethodSignature:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, sig) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun retainArguments(): Unit {
        val sel = ObjCRuntime.sel("retainArguments")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun getReturnValue(retLoc: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getReturnValue:")
        ObjCRuntime.msgSend(null, ptr, sel, retLoc)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun setReturnValue(retLoc: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setReturnValue:")
        ObjCRuntime.msgSend(null, ptr, sel, retLoc)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun getArgument_atIndex(argumentLocation: MemorySegment, idx: Long): Unit {
        val sel = ObjCRuntime.sel("getArgument:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, argumentLocation, idx)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun setArgument_atIndex(argumentLocation: MemorySegment, idx: Long): Unit {
        val sel = ObjCRuntime.sel("setArgument:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, argumentLocation, idx)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun invoke(): Unit {
        val sel = ObjCRuntime.sel("invoke")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun invokeWithTarget(target: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invokeWithTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, target)
    }

    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun invokeUsingIMP(imp: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invokeUsingIMP:")
        ObjCRuntime.msgSend(null, ptr, sel, imp)
    }

    // @property methodSignature
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun methodSignature(): MemorySegment {
        val sel = ObjCRuntime.sel("methodSignature")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property argumentsRetained
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun argumentsRetained(): Boolean {
        val sel = ObjCRuntime.sel("argumentsRetained")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property target
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selector
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun selector(): MemorySegment {
        val sel = ObjCRuntime.sel("selector")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "swift", unavailable = true, message = "NSInvocation and related APIs not available")
    open fun setSelector(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelector:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
