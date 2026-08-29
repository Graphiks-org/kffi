@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAccessibilityCustomRotor
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
open class NSAccessibilityCustomRotor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAccessibilityCustomRotor") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithLabel_itemSearchDelegate(label: MemorySegment, itemSearchDelegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLabel:itemSearchDelegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, label, itemSearchDelegate) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithLabel_itemSearchDelegate(label: String, itemSearchDelegate: MemorySegment): MemorySegment = initWithLabel_itemSearchDelegate(ObjCRuntime.newNSString(Arena.global(), label), itemSearchDelegate)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithRotorType_itemSearchDelegate(rotorType: NSAccessibilityCustomRotorType, itemSearchDelegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRotorType:itemSearchDelegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, rotorType.rawValue, itemSearchDelegate) as MemorySegment
    }

    // @property type
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun type(): NSAccessibilityCustomRotorType {
        val sel = ObjCRuntime.sel("type")
        return NSAccessibilityCustomRotorType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setType(value: NSAccessibilityCustomRotorType) {
        val sel = ObjCRuntime.sel("setType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property label
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun label(): MemorySegment {
        val sel = ObjCRuntime.sel("label")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun labelAsString(): String = ObjCRuntime.toJavaString(label())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLabel(value: String) = setLabel(ObjCRuntime.newNSString(Arena.global(), value))

    // @property itemSearchDelegate
    /** @return id<NSAccessibilityCustomRotorItemSearchDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemSearchDelegate(): MemorySegment {
        val sel = ObjCRuntime.sel("itemSearchDelegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemSearchDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setItemSearchDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property itemLoadingDelegate
    /** @return id<NSAccessibilityElementLoading> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemLoadingDelegate(): MemorySegment {
        val sel = ObjCRuntime.sel("itemLoadingDelegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemLoadingDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setItemLoadingDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
