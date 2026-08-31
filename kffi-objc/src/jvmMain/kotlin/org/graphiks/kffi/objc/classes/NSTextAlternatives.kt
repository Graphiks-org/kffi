@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextAlternatives
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
open class NSTextAlternatives(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTextAlternatives") } }

    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun initWithPrimaryString_alternativeStrings(primaryString: MemorySegment, alternativeStrings: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPrimaryString:alternativeStrings:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, primaryString, alternativeStrings) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    fun initWithPrimaryString_alternativeStrings(primaryString: String, alternativeStrings: MemorySegment): MemorySegment = initWithPrimaryString_alternativeStrings(ObjCRuntime.newNSString(Arena.global(), primaryString), alternativeStrings)

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun noteSelectedAlternativeString(alternativeString: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("noteSelectedAlternativeString:")
        ObjCRuntime.msgSend(null, ptr, sel, alternativeString)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    fun noteSelectedAlternativeString(alternativeString: String): Unit = noteSelectedAlternativeString(ObjCRuntime.newNSString(Arena.global(), alternativeString))

    // @property primaryString
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun primaryString(): MemorySegment {
        val sel = ObjCRuntime.sel("primaryString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun primaryStringAsString(): String = ObjCRuntime.toJavaString(primaryString())

    // @property alternativeStrings
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun alternativeStrings(): MemorySegment {
        val sel = ObjCRuntime.sel("alternativeStrings")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSTextAlternatives.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTextAlternatives.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTextAlternatives_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTextAlternatives")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
