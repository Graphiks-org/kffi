@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableString
 * Superclass: NSString
 */
open class NSMutableString(override val ptr: MemorySegment) : NSString(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMutableString") }

    }

    open fun replaceCharactersInRange_withString(range: NSRange, aString: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceCharactersInRange:withString:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), aString)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun replaceCharactersInRange_withString(range: NSRange, aString: String): Unit = replaceCharactersInRange_withString(range, ObjCRuntime.newNSString(Arena.global(), aString))

}

// ── Category: NSMutableStringExtensionMethods on NSMutableString ─────────────────────────────────────────

fun NSMutableString.insertString_atIndex(aString: MemorySegment, loc: Long): Unit {
    val sel = ObjCRuntime.sel("insertString:atIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aString, loc)
}

fun NSMutableString.deleteCharactersInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("deleteCharactersInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSMutableString.appendString(aString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aString)
}

fun NSMutableString.appendFormat(format: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendFormat:")
    ObjCRuntime.msgSend(null, this.ptr, sel, format)
}

fun NSMutableString.setString(aString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aString)
}

fun NSMutableString.replaceOccurrencesOfString_withString_options_range(target: MemorySegment, replacement: MemorySegment, options: NSStringCompareOptions, searchRange: NSRange): Long {
    val sel = ObjCRuntime.sel("replaceOccurrencesOfString:withString:options:range:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, target, replacement, options.rawValue, ObjCRuntime.ObjCStructArg(searchRange.segment, NSRange.layout)) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableString.applyTransform_reverse_range_updatedRange(transform: MemorySegment, reverse: Boolean, range: NSRange, resultingRange: NSRangePointer): Boolean {
    val sel = ObjCRuntime.sel("applyTransform:reverse:range:updatedRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, transform, reverse, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), resultingRange.segment) as Boolean
}

fun NSMutableString.initWithCapacity(capacity: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCapacity:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, capacity) as MemorySegment
}

// Class method: +[NSMutableString stringWithCapacity:]
fun NSMutableString_stringWithCapacity(capacity: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithCapacity:")
    val cls = ObjCRuntime.getClass("NSMutableString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, capacity) as MemorySegment
}
