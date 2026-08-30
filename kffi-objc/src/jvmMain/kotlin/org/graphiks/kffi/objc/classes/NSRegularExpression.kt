@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSRegularExpression
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSRegularExpression(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSRegularExpression") }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun regularExpressionWithPattern_options_error(pattern: MemorySegment, options: NSRegularExpressionOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("regularExpressionWithPattern:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pattern, options.rawValue, error) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun regularExpressionWithPattern_options_error(pattern: String, options: NSRegularExpressionOptions, error: MemorySegment): MemorySegment = regularExpressionWithPattern_options_error(ObjCRuntime.newNSString(Arena.global(), pattern), options, error)

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun escapedPatternForString(string: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("escapedPatternForString:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, string) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun escapedPatternForStringAsString(string: MemorySegment): String = ObjCRuntime.toJavaString(escapedPatternForString(string))

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun escapedPatternForString(string: String): MemorySegment = escapedPatternForString(ObjCRuntime.newNSString(Arena.global(), string))

        /** Convenience overload — [String] parameters and [String] return type. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun escapedPatternForStringAsString(string: String): String = ObjCRuntime.toJavaString(escapedPatternForString(ObjCRuntime.newNSString(Arena.global(), string)))

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithPattern_options_error(pattern: MemorySegment, options: NSRegularExpressionOptions, error: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithPattern:options:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pattern, options.rawValue, error) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun initWithPattern_options_error(pattern: String, options: NSRegularExpressionOptions, error: MemorySegment): MemorySegment = initWithPattern_options_error(ObjCRuntime.newNSString(Arena.global(), pattern), options, error)

    // @property pattern
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun pattern(): MemorySegment {
        val sel = ObjCRuntime.sel("pattern")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun patternAsString(): String = ObjCRuntime.toJavaString(pattern())

    // @property options
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun options(): NSRegularExpressionOptions {
        val sel = ObjCRuntime.sel("options")
        return NSRegularExpressionOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property numberOfCaptureGroups
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun numberOfCaptureGroups(): Long {
        val sel = ObjCRuntime.sel("numberOfCaptureGroups")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _pattern: MemorySegment
    // ivar: _options: Long
    // ivar: _internal: MemorySegment
    // ivar: _checkout: Int
}

/** Required by Objective-C protocol NSCopying. */
fun NSRegularExpression.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSRegularExpression.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSRegularExpression.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSRegularExpression_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSRegularExpression")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSMatching on NSRegularExpression ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.enumerateMatchesInString_options_range_usingBlock(string: MemorySegment, options: NSMatchingOptions, range: NSRange, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateMatchesInString:options:range:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), block)
}

/** @return NSArray<NSTextCheckingResult *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.matchesInString_options_range(string: MemorySegment, options: NSMatchingOptions, range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("matchesInString:options:range:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.numberOfMatchesInString_options_range(string: MemorySegment, options: NSMatchingOptions, range: NSRange): Long {
    val sel = ObjCRuntime.sel("numberOfMatchesInString:options:range:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.firstMatchInString_options_range(string: MemorySegment, options: NSMatchingOptions, range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("firstMatchInString:options:range:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.rangeOfFirstMatchInString_options_range(string: MemorySegment, options: NSMatchingOptions, range: NSRange): NSRange {
    val sel = ObjCRuntime.sel("rangeOfFirstMatchInString:options:range:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

// ── Category: NSReplacement on NSRegularExpression ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.stringByReplacingMatchesInString_options_range_withTemplate(string: MemorySegment, options: NSMatchingOptions, range: NSRange, templ: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByReplacingMatchesInString:options:range:withTemplate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), templ) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.replaceMatchesInString_options_range_withTemplate(string: MemorySegment, options: NSMatchingOptions, range: NSRange, templ: MemorySegment): Long {
    val sel = ObjCRuntime.sel("replaceMatchesInString:options:range:withTemplate:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), templ) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression.replacementStringForResult_inString_offset_template(result: MemorySegment, string: MemorySegment, offset: Long, templ: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("replacementStringForResult:inString:offset:template:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, result, string, offset, templ) as MemorySegment
}

// Class method: +[NSRegularExpression escapedTemplateForString:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSRegularExpression_escapedTemplateForString(string: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("escapedTemplateForString:")
    val cls = ObjCRuntime.getClass("NSRegularExpression")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string) as MemorySegment
}
