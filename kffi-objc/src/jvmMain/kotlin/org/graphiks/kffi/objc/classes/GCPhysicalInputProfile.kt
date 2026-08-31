@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCPhysicalInputProfile
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
open class GCPhysicalInputProfile(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCPhysicalInputProfile") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun objectForKeyedSubscript(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("objectForKeyedSubscript:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    fun objectForKeyedSubscript(key: String): MemorySegment = objectForKeyedSubscript(ObjCRuntime.newNSString(Arena.global(), key))

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun capture(): MemorySegment {
        val sel = ObjCRuntime.sel("capture")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setStateFromPhysicalInput(physicalInput: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setStateFromPhysicalInput:")
        ObjCRuntime.msgSend(null, ptr, sel, physicalInput)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun mappedElementAliasForPhysicalInputName(inputName: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("mappedElementAliasForPhysicalInputName:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, inputName) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    fun mappedElementAliasForPhysicalInputNameAsString(inputName: MemorySegment): String = ObjCRuntime.toJavaString(mappedElementAliasForPhysicalInputName(inputName))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    fun mappedElementAliasForPhysicalInputName(inputName: String): MemorySegment = mappedElementAliasForPhysicalInputName(ObjCRuntime.newNSString(Arena.global(), inputName))

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    fun mappedElementAliasForPhysicalInputNameAsString(inputName: String): String = ObjCRuntime.toJavaString(mappedElementAliasForPhysicalInputName(ObjCRuntime.newNSString(Arena.global(), inputName)))

    /** @return NSSet<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun mappedPhysicalInputNamesForElementAlias(elementAlias: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("mappedPhysicalInputNamesForElementAlias:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, elementAlias) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    fun mappedPhysicalInputNamesForElementAlias(elementAlias: String): MemorySegment = mappedPhysicalInputNamesForElementAlias(ObjCRuntime.newNSString(Arena.global(), elementAlias))

    // @property device
    /** @return id<GCDevice> */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun device(): MemorySegment {
        val sel = ObjCRuntime.sel("device")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property lastEventTimestamp
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun lastEventTimestamp(): Double {
        val sel = ObjCRuntime.sel("lastEventTimestamp")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property hasRemappedElements
    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun hasRemappedElements(): Boolean {
        val sel = ObjCRuntime.sel("hasRemappedElements")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property valueDidChangeHandler
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    open fun valueDidChangeHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("valueDidChangeHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    open fun setValueDidChangeHandler(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setValueDidChangeHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property elements
    /** @return NSDictionary<NSString *,GCControllerElement *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun elements(): MemorySegment {
        val sel = ObjCRuntime.sel("elements")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property buttons
    /** @return NSDictionary<NSString *,GCControllerButtonInput *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun buttons(): MemorySegment {
        val sel = ObjCRuntime.sel("buttons")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property axes
    /** @return NSDictionary<NSString *,GCControllerAxisInput *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun axes(): MemorySegment {
        val sel = ObjCRuntime.sel("axes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property dpads
    /** @return NSDictionary<NSString *,GCControllerDirectionPad *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun dpads(): MemorySegment {
        val sel = ObjCRuntime.sel("dpads")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property touchpads
    /** @return NSDictionary<NSString *,GCControllerTouchpad *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun touchpads(): MemorySegment {
        val sel = ObjCRuntime.sel("touchpads")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allElements
    /** @return NSSet<GCControllerElement *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allElements(): MemorySegment {
        val sel = ObjCRuntime.sel("allElements")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allButtons
    /** @return NSSet<GCControllerButtonInput *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allButtons(): MemorySegment {
        val sel = ObjCRuntime.sel("allButtons")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allAxes
    /** @return NSSet<GCControllerAxisInput *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allAxes(): MemorySegment {
        val sel = ObjCRuntime.sel("allAxes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allDpads
    /** @return NSSet<GCControllerDirectionPad *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allDpads(): MemorySegment {
        val sel = ObjCRuntime.sel("allDpads")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allTouchpads
    /** @return NSSet<GCControllerTouchpad *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allTouchpads(): MemorySegment {
        val sel = ObjCRuntime.sel("allTouchpads")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
