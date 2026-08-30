@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPredicate
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSPredicate(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPredicate") }

        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithFormat_argumentArray(predicateFormat: MemorySegment, arguments: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithFormat:argumentArray:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, predicateFormat, arguments) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithFormat_argumentArray(predicateFormat: String, arguments: MemorySegment): MemorySegment = predicateWithFormat_argumentArray(ObjCRuntime.newNSString(Arena.global(), predicateFormat), arguments)

        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithFormat(predicateFormat: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithFormat:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, predicateFormat) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithFormat(predicateFormat: String): MemorySegment = predicateWithFormat(ObjCRuntime.newNSString(Arena.global(), predicateFormat))

        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithFormat_arguments(predicateFormat: MemorySegment, argList: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithFormat:arguments:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, predicateFormat, argList) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithFormat_arguments(predicateFormat: String, argList: MemorySegment): MemorySegment = predicateWithFormat_arguments(ObjCRuntime.newNSString(Arena.global(), predicateFormat), argList)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun predicateFromMetadataQueryString(queryString: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("predicateFromMetadataQueryString:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, queryString) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun predicateFromMetadataQueryString(queryString: String): MemorySegment = predicateFromMetadataQueryString(ObjCRuntime.newNSString(Arena.global(), queryString))

        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithValue(value: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithValue:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, value) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithBlock(block: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithBlock:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, block) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun predicateWithSubstitutionVariables(variables: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("predicateWithSubstitutionVariables:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, variables) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun evaluateWithObject(`object`: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("evaluateWithObject:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, `object`) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun evaluateWithObject_substitutionVariables(`object`: MemorySegment, bindings: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("evaluateWithObject:substitutionVariables:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, `object`, bindings) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun allowEvaluation(): Unit {
        val sel = ObjCRuntime.sel("allowEvaluation")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    open fun allowEvaluationWithValidator_error(validator: MemorySegment, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("allowEvaluationWithValidator:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, validator, error) as Boolean
    }

    // @property predicateFormat
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun predicateFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("predicateFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun predicateFormatAsString(): String = ObjCRuntime.toJavaString(predicateFormat())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _predicateFlags: MemorySegment
    // ivar: reserved: Int
}

/** Required by Objective-C protocol NSCoding. */
fun NSPredicate.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSPredicate.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSPredicate_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSPredicate")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSPredicate.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
