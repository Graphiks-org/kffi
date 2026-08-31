@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAccessibilityCustomRotorItemResult
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
open class NSAccessibilityCustomRotorItemResult(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSAccessibilityCustomRotorItemResult") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithTargetElement(targetElement: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTargetElement:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, targetElement) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithItemLoadingToken_customLabel(itemLoadingToken: MemorySegment, customLabel: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithItemLoadingToken:customLabel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, itemLoadingToken, customLabel) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithItemLoadingToken_customLabel(itemLoadingToken: MemorySegment, customLabel: String): MemorySegment = initWithItemLoadingToken_customLabel(itemLoadingToken, ObjCRuntime.newNSString(Arena.global(), customLabel))

    // @property targetElement
    /** @return id<NSAccessibilityElement> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun targetElement(): MemorySegment {
        val sel = ObjCRuntime.sel("targetElement")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property itemLoadingToken
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemLoadingToken(): MemorySegment {
        val sel = ObjCRuntime.sel("itemLoadingToken")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property targetRange
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun targetRange(): NSRange {
        val sel = ObjCRuntime.sel("targetRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTargetRange(value: NSRange) {
        val sel = ObjCRuntime.sel("setTargetRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
    }

    // @property customLabel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun customLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("customLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCustomLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCustomLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun customLabelAsString(): String = ObjCRuntime.toJavaString(customLabel())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCustomLabel(value: String) = setCustomLabel(ObjCRuntime.newNSString(Arena.global(), value))

}
