@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAccessibilityCustomAction
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
open class NSAccessibilityCustomAction(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSAccessibilityCustomAction") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithName_handler(name: MemorySegment, handler: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithName:handler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, name, handler) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithName_handler(name: String, handler: MemorySegment): MemorySegment = initWithName_handler(ObjCRuntime.newNSString(Arena.global(), name), handler)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithName_target_selector(name: MemorySegment, target: MemorySegment, selector: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithName:target:selector:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, name, target, selector) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithName_target_selector(name: String, target: MemorySegment, selector: MemorySegment): MemorySegment = initWithName_target_selector(ObjCRuntime.newNSString(Arena.global(), name), target, selector)

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setName(value: String) = setName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property handler
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun handler(): MemorySegment {
        val sel = ObjCRuntime.sel("handler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property target
    /** @return id<NSObject> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selector
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selector(): MemorySegment {
        val sel = ObjCRuntime.sel("selector")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelector(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelector:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
