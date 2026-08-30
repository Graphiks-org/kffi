@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSString
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding
 */
open class NSString(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSString") }

    }

    open fun characterAtIndex(index: Long): Short {
        val sel = ObjCRuntime.sel("characterAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, ptr, sel, index) as Short
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property length
    open fun length(): Long {
        val sel = ObjCRuntime.sel("length")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSString.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSString.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSString.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSString_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSStringExtensionMethods on NSString ─────────────────────────────────────────

fun NSString.substringFromIndex(from: Long): MemorySegment {
    val sel = ObjCRuntime.sel("substringFromIndex:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, from) as MemorySegment
}

fun NSString.substringToIndex(to: Long): MemorySegment {
    val sel = ObjCRuntime.sel("substringToIndex:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, to) as MemorySegment
}

fun NSString.substringWithRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("substringWithRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

fun NSString.getCharacters_range(buffer: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("getCharacters:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, buffer, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSString.compare(string: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("compare:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string) as Long)
}

fun NSString.compare_options(string: MemorySegment, mask: NSStringCompareOptions): NSComparisonResult {
    val sel = ObjCRuntime.sel("compare:options:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string, mask.rawValue) as Long)
}

fun NSString.compare_options_range(string: MemorySegment, mask: NSStringCompareOptions, rangeOfReceiverToCompare: NSRange): NSComparisonResult {
    val sel = ObjCRuntime.sel("compare:options:range:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string, mask.rawValue, ObjCRuntime.ObjCStructArg(rangeOfReceiverToCompare.segment, NSRange.layout)) as Long)
}

fun NSString.compare_options_range_locale(string: MemorySegment, mask: NSStringCompareOptions, rangeOfReceiverToCompare: NSRange, locale: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("compare:options:range:locale:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string, mask.rawValue, ObjCRuntime.ObjCStructArg(rangeOfReceiverToCompare.segment, NSRange.layout), locale) as Long)
}

fun NSString.caseInsensitiveCompare(string: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("caseInsensitiveCompare:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string) as Long)
}

fun NSString.localizedCompare(string: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("localizedCompare:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string) as Long)
}

fun NSString.localizedCaseInsensitiveCompare(string: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("localizedCaseInsensitiveCompare:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string) as Long)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedStandardCompare(string: MemorySegment): NSComparisonResult {
    val sel = ObjCRuntime.sel("localizedStandardCompare:")
    return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, string) as Long)
}

fun NSString.isEqualToString(aString: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, aString) as Boolean
}

fun NSString.hasPrefix(str: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("hasPrefix:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, str) as Boolean
}

fun NSString.hasSuffix(str: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("hasSuffix:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, str) as Boolean
}

fun NSString.commonPrefixWithString_options(str: MemorySegment, mask: NSStringCompareOptions): MemorySegment {
    val sel = ObjCRuntime.sel("commonPrefixWithString:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, str, mask.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.containsString(str: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("containsString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, str) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedCaseInsensitiveContainsString(str: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("localizedCaseInsensitiveContainsString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, str) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedStandardContainsString(str: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("localizedStandardContainsString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, str) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedStandardRangeOfString(str: MemorySegment): NSRange {
    val sel = ObjCRuntime.sel("localizedStandardRangeOfString:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, str))
}

fun NSString.rangeOfString(searchString: MemorySegment): NSRange {
    val sel = ObjCRuntime.sel("rangeOfString:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchString))
}

fun NSString.rangeOfString_options(searchString: MemorySegment, mask: NSStringCompareOptions): NSRange {
    val sel = ObjCRuntime.sel("rangeOfString:options:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchString, mask.rawValue))
}

fun NSString.rangeOfString_options_range(searchString: MemorySegment, mask: NSStringCompareOptions, rangeOfReceiverToSearch: NSRange): NSRange {
    val sel = ObjCRuntime.sel("rangeOfString:options:range:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchString, mask.rawValue, ObjCRuntime.ObjCStructArg(rangeOfReceiverToSearch.segment, NSRange.layout)))
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.rangeOfString_options_range_locale(searchString: MemorySegment, mask: NSStringCompareOptions, rangeOfReceiverToSearch: NSRange, locale: MemorySegment): NSRange {
    val sel = ObjCRuntime.sel("rangeOfString:options:range:locale:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchString, mask.rawValue, ObjCRuntime.ObjCStructArg(rangeOfReceiverToSearch.segment, NSRange.layout), locale))
}

fun NSString.rangeOfCharacterFromSet(searchSet: MemorySegment): NSRange {
    val sel = ObjCRuntime.sel("rangeOfCharacterFromSet:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchSet))
}

fun NSString.rangeOfCharacterFromSet_options(searchSet: MemorySegment, mask: NSStringCompareOptions): NSRange {
    val sel = ObjCRuntime.sel("rangeOfCharacterFromSet:options:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchSet, mask.rawValue))
}

fun NSString.rangeOfCharacterFromSet_options_range(searchSet: MemorySegment, mask: NSStringCompareOptions, rangeOfReceiverToSearch: NSRange): NSRange {
    val sel = ObjCRuntime.sel("rangeOfCharacterFromSet:options:range:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, searchSet, mask.rawValue, ObjCRuntime.ObjCStructArg(rangeOfReceiverToSearch.segment, NSRange.layout)))
}

fun NSString.rangeOfComposedCharacterSequenceAtIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("rangeOfComposedCharacterSequenceAtIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.rangeOfComposedCharacterSequencesForRange(range: NSRange): NSRange {
    val sel = ObjCRuntime.sel("rangeOfComposedCharacterSequencesForRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

fun NSString.stringByAppendingString(aString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAppendingString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, aString) as MemorySegment
}

fun NSString.stringByAppendingFormat(format: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAppendingFormat:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.uppercaseStringWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("uppercaseStringWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.lowercaseStringWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("lowercaseStringWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.capitalizedStringWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("capitalizedStringWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

fun NSString.getLineStart_end_contentsEnd_forRange(startPtr: MemorySegment, lineEndPtr: MemorySegment, contentsEndPtr: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("getLineStart:end:contentsEnd:forRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, startPtr, lineEndPtr, contentsEndPtr, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSString.lineRangeForRange(range: NSRange): NSRange {
    val sel = ObjCRuntime.sel("lineRangeForRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

fun NSString.getParagraphStart_end_contentsEnd_forRange(startPtr: MemorySegment, parEndPtr: MemorySegment, contentsEndPtr: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("getParagraphStart:end:contentsEnd:forRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, startPtr, parEndPtr, contentsEndPtr, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSString.paragraphRangeForRange(range: NSRange): NSRange {
    val sel = ObjCRuntime.sel("paragraphRangeForRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.enumerateSubstringsInRange_options_usingBlock(range: NSRange, opts: NSStringEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateSubstringsInRange:options:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), opts.rawValue, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.enumerateLinesUsingBlock(block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateLinesUsingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, block)
}

fun NSString.dataUsingEncoding_allowLossyConversion(encoding: Long, lossy: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("dataUsingEncoding:allowLossyConversion:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, encoding, lossy) as MemorySegment
}

fun NSString.dataUsingEncoding(encoding: Long): MemorySegment {
    val sel = ObjCRuntime.sel("dataUsingEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, encoding) as MemorySegment
}

fun NSString.canBeConvertedToEncoding(encoding: Long): Boolean {
    val sel = ObjCRuntime.sel("canBeConvertedToEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, encoding) as Boolean
}

fun NSString.cStringUsingEncoding(encoding: Long): MemorySegment {
    val sel = ObjCRuntime.sel("cStringUsingEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, encoding) as MemorySegment
}

fun NSString.getCString_maxLength_encoding(buffer: MemorySegment, maxBufferCount: Long, encoding: Long): Boolean {
    val sel = ObjCRuntime.sel("getCString:maxLength:encoding:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, buffer, maxBufferCount, encoding) as Boolean
}

fun NSString.getBytes_maxLength_usedLength_encoding_options_range_remainingRange(buffer: MemorySegment, maxBufferCount: Long, usedBufferCount: MemorySegment, encoding: Long, options: NSStringEncodingConversionOptions, range: NSRange, leftover: NSRangePointer): Boolean {
    val sel = ObjCRuntime.sel("getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, buffer, maxBufferCount, usedBufferCount, encoding, options.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), leftover.segment) as Boolean
}

fun NSString.maximumLengthOfBytesUsingEncoding(enc: Long): Long {
    val sel = ObjCRuntime.sel("maximumLengthOfBytesUsingEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, enc) as Long
}

fun NSString.lengthOfBytesUsingEncoding(enc: Long): Long {
    val sel = ObjCRuntime.sel("lengthOfBytesUsingEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, enc) as Long
}

/** @return NSArray<NSString *> * */
fun NSString.componentsSeparatedByString(separator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("componentsSeparatedByString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, separator) as MemorySegment
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.componentsSeparatedByCharactersInSet(separator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("componentsSeparatedByCharactersInSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, separator) as MemorySegment
}

fun NSString.stringByTrimmingCharactersInSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByTrimmingCharactersInSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`) as MemorySegment
}

fun NSString.stringByPaddingToLength_withString_startingAtIndex(newLength: Long, padString: MemorySegment, padIndex: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringByPaddingToLength:withString:startingAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, newLength, padString, padIndex) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByFoldingWithOptions_locale(options: NSStringCompareOptions, locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByFoldingWithOptions:locale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, options.rawValue, locale) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByReplacingOccurrencesOfString_withString_options_range(target: MemorySegment, replacement: MemorySegment, options: NSStringCompareOptions, searchRange: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("stringByReplacingOccurrencesOfString:withString:options:range:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, target, replacement, options.rawValue, ObjCRuntime.ObjCStructArg(searchRange.segment, NSRange.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByReplacingOccurrencesOfString_withString(target: MemorySegment, replacement: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByReplacingOccurrencesOfString:withString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, target, replacement) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByReplacingCharactersInRange_withString(range: NSRange, replacement: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByReplacingCharactersInRange:withString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacement) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByApplyingTransform_reverse(transform: MemorySegment, reverse: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("stringByApplyingTransform:reverse:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, transform, reverse) as MemorySegment
}

fun NSString.writeToURL_atomically_encoding_error(url: MemorySegment, useAuxiliaryFile: Boolean, enc: Long, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:atomically:encoding:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, useAuxiliaryFile, enc, error) as Boolean
}

fun NSString.writeToFile_atomically_encoding_error(path: MemorySegment, useAuxiliaryFile: Boolean, enc: Long, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:atomically:encoding:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, path, useAuxiliaryFile, enc, error) as Boolean
}

fun NSString.initWithCharactersNoCopy_length_freeWhenDone(characters: MemorySegment, length: Long, freeBuffer: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCharactersNoCopy:length:freeWhenDone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, characters, length, freeBuffer) as MemorySegment
}

fun NSString.initWithCharactersNoCopy_length_deallocator(chars: MemorySegment, len: Long, deallocator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCharactersNoCopy:length:deallocator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, chars, len, deallocator) as MemorySegment
}

fun NSString.initWithCharacters_length(characters: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCharacters:length:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, characters, length) as MemorySegment
}

fun NSString.initWithUTF8String(nullTerminatedCString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithUTF8String:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, nullTerminatedCString) as MemorySegment
}

fun NSString.initWithString(aString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, aString) as MemorySegment
}

fun NSString.initWithFormat(format: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format) as MemorySegment
}

fun NSString.initWithFormat_arguments(format: MemorySegment, argList: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:arguments:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, argList) as MemorySegment
}

fun NSString.initWithFormat_locale(format: MemorySegment, locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:locale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, locale) as MemorySegment
}

fun NSString.initWithFormat_locale_arguments(format: MemorySegment, locale: MemorySegment, argList: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:locale:arguments:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, locale, argList) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use string interpolations instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
fun NSString.initWithValidatedFormat_validFormatSpecifiers_error(format: MemorySegment, validFormatSpecifiers: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithValidatedFormat:validFormatSpecifiers:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, validFormatSpecifiers, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use string interpolations instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
fun NSString.initWithValidatedFormat_validFormatSpecifiers_locale_error(format: MemorySegment, validFormatSpecifiers: MemorySegment, locale: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithValidatedFormat:validFormatSpecifiers:locale:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, validFormatSpecifiers, locale, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use string interpolations instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
fun NSString.initWithValidatedFormat_validFormatSpecifiers_arguments_error(format: MemorySegment, validFormatSpecifiers: MemorySegment, argList: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithValidatedFormat:validFormatSpecifiers:arguments:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, validFormatSpecifiers, argList, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use string interpolations instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSString.initWithValidatedFormat_validFormatSpecifiers_locale_arguments_error(format: MemorySegment, validFormatSpecifiers: MemorySegment, locale: MemorySegment, argList: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, validFormatSpecifiers, locale, argList, error) as MemorySegment
}

fun NSString.initWithData_encoding(`data`: MemorySegment, encoding: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithData:encoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, encoding) as MemorySegment
}

fun NSString.initWithBytes_length_encoding(bytes: MemorySegment, len: Long, encoding: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytes:length:encoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, len, encoding) as MemorySegment
}

fun NSString.initWithBytesNoCopy_length_encoding_freeWhenDone(bytes: MemorySegment, len: Long, encoding: Long, freeBuffer: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, len, encoding, freeBuffer) as MemorySegment
}

fun NSString.initWithBytesNoCopy_length_encoding_deallocator(bytes: MemorySegment, len: Long, encoding: Long, deallocator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytesNoCopy:length:encoding:deallocator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, len, encoding, deallocator) as MemorySegment
}

fun NSString.initWithCString_encoding(nullTerminatedCString: MemorySegment, encoding: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCString:encoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, nullTerminatedCString, encoding) as MemorySegment
}

fun NSString.initWithContentsOfURL_encoding_error(url: MemorySegment, enc: Long, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:encoding:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, enc, error) as MemorySegment
}

fun NSString.initWithContentsOfFile_encoding_error(path: MemorySegment, enc: Long, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:encoding:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path, enc, error) as MemorySegment
}

fun NSString.initWithContentsOfURL_usedEncoding_error(url: MemorySegment, enc: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:usedEncoding:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, enc, error) as MemorySegment
}

fun NSString.initWithContentsOfFile_usedEncoding_error(path: MemorySegment, enc: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:usedEncoding:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path, enc, error) as MemorySegment
}

fun NSString.doubleValue(): Double {
    val sel = ObjCRuntime.sel("doubleValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSString.floatValue(): Float {
    val sel = ObjCRuntime.sel("floatValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}

fun NSString.intValue(): Int {
    val sel = ObjCRuntime.sel("intValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel) as Int
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.integerValue(): Long {
    val sel = ObjCRuntime.sel("integerValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.longLongValue(): Long {
    val sel = ObjCRuntime.sel("longLongValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.boolValue(): Boolean {
    val sel = ObjCRuntime.sel("boolValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSString.uppercaseString(): MemorySegment {
    val sel = ObjCRuntime.sel("uppercaseString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.lowercaseString(): MemorySegment {
    val sel = ObjCRuntime.sel("lowercaseString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.capitalizedString(): MemorySegment {
    val sel = ObjCRuntime.sel("capitalizedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedUppercaseString(): MemorySegment {
    val sel = ObjCRuntime.sel("localizedUppercaseString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedLowercaseString(): MemorySegment {
    val sel = ObjCRuntime.sel("localizedLowercaseString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.localizedCapitalizedString(): MemorySegment {
    val sel = ObjCRuntime.sel("localizedCapitalizedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.UTF8String(): MemorySegment {
    val sel = ObjCRuntime.sel("UTF8String")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.fastestEncoding(): Long {
    val sel = ObjCRuntime.sel("fastestEncoding")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSString.smallestEncoding(): Long {
    val sel = ObjCRuntime.sel("smallestEncoding")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSString.decomposedStringWithCanonicalMapping(): MemorySegment {
    val sel = ObjCRuntime.sel("decomposedStringWithCanonicalMapping")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.precomposedStringWithCanonicalMapping(): MemorySegment {
    val sel = ObjCRuntime.sel("precomposedStringWithCanonicalMapping")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.decomposedStringWithCompatibilityMapping(): MemorySegment {
    val sel = ObjCRuntime.sel("decomposedStringWithCompatibilityMapping")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.precomposedStringWithCompatibilityMapping(): MemorySegment {
    val sel = ObjCRuntime.sel("precomposedStringWithCompatibilityMapping")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.hash(): Long {
    val sel = ObjCRuntime.sel("hash")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

// Class method: +[NSString localizedNameOfStringEncoding:]
fun NSString_localizedNameOfStringEncoding(encoding: Long): MemorySegment {
    val sel = ObjCRuntime.sel("localizedNameOfStringEncoding:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, encoding) as MemorySegment
}

// Class method: +[NSString string]
fun NSString_string(): MemorySegment {
    val sel = ObjCRuntime.sel("string")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSString stringWithString:]
fun NSString_stringWithString(string: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithString:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string) as MemorySegment
}

// Class method: +[NSString stringWithCharacters:length:]
fun NSString_stringWithCharacters_length(characters: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithCharacters:length:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, characters, length) as MemorySegment
}

// Class method: +[NSString stringWithUTF8String:]
fun NSString_stringWithUTF8String(nullTerminatedCString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithUTF8String:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, nullTerminatedCString) as MemorySegment
}

// Class method: +[NSString stringWithFormat:]
fun NSString_stringWithFormat(format: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithFormat:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format) as MemorySegment
}

// Class method: +[NSString localizedStringWithFormat:]
fun NSString_localizedStringWithFormat(format: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringWithFormat:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format) as MemorySegment
}

// Class method: +[NSString stringWithValidatedFormat:validFormatSpecifiers:error:]
@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use string interpolations instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSString_stringWithValidatedFormat_validFormatSpecifiers_error(format: MemorySegment, validFormatSpecifiers: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithValidatedFormat:validFormatSpecifiers:error:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format, validFormatSpecifiers, error) as MemorySegment
}

// Class method: +[NSString localizedStringWithValidatedFormat:validFormatSpecifiers:error:]
@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use string interpolations instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSString_localizedStringWithValidatedFormat_validFormatSpecifiers_error(format: MemorySegment, validFormatSpecifiers: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringWithValidatedFormat:validFormatSpecifiers:error:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format, validFormatSpecifiers, error) as MemorySegment
}

// Class method: +[NSString stringWithCString:encoding:]
fun NSString_stringWithCString_encoding(cString: MemorySegment, enc: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithCString:encoding:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, cString, enc) as MemorySegment
}

// Class method: +[NSString stringWithContentsOfURL:encoding:error:]
fun NSString_stringWithContentsOfURL_encoding_error(url: MemorySegment, enc: Long, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithContentsOfURL:encoding:error:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url, enc, error) as MemorySegment
}

// Class method: +[NSString stringWithContentsOfFile:encoding:error:]
fun NSString_stringWithContentsOfFile_encoding_error(path: MemorySegment, enc: Long, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithContentsOfFile:encoding:error:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path, enc, error) as MemorySegment
}

// Class method: +[NSString stringWithContentsOfURL:usedEncoding:error:]
fun NSString_stringWithContentsOfURL_usedEncoding_error(url: MemorySegment, enc: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithContentsOfURL:usedEncoding:error:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url, enc, error) as MemorySegment
}

// Class method: +[NSString stringWithContentsOfFile:usedEncoding:error:]
fun NSString_stringWithContentsOfFile_usedEncoding_error(path: MemorySegment, enc: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithContentsOfFile:usedEncoding:error:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path, enc, error) as MemorySegment
}

// Class method: +[NSString availableStringEncodings]
fun NSString_availableStringEncodings(): MemorySegment {
    val sel = ObjCRuntime.sel("availableStringEncodings")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSString defaultCStringEncoding]
fun NSString_defaultCStringEncoding(): Long {
    val sel = ObjCRuntime.sel("defaultCStringEncoding")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel) as Long
}

// ── Category: NSStringEncodingDetection on NSString ─────────────────────────────────────────

// Class method: +[NSString stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:]
@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString_stringEncodingForData_encodingOptions_convertedString_usedLossyConversion(`data`: MemorySegment, opts: MemorySegment, string: MemorySegment, usedLossyConversion: MemorySegment): Long {
    val sel = ObjCRuntime.sel("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel, `data`, opts, string, usedLossyConversion) as Long
}

// ── Category: NSItemProvider on NSString ─────────────────────────────────────────

// ── Category: NSExtendedStringPropertyListParsing on NSString ─────────────────────────────────────────

fun NSString.propertyList(): MemorySegment {
    val sel = ObjCRuntime.sel("propertyList")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.propertyListFromStringsFileFormat(): MemorySegment {
    val sel = ObjCRuntime.sel("propertyListFromStringsFileFormat")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSStringDeprecated on NSString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
fun NSString.cString(): MemorySegment {
    val sel = ObjCRuntime.sel("cString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -cStringUsingEncoding: instead")
fun NSString.lossyCString(): MemorySegment {
    val sel = ObjCRuntime.sel("lossyCString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -lengthOfBytesUsingEncoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -lengthOfBytesUsingEncoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -lengthOfBytesUsingEncoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -lengthOfBytesUsingEncoding: instead")
fun NSString.cStringLength(): Long {
    val sel = ObjCRuntime.sel("cStringLength")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
fun NSString.getCString(bytes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getCString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, bytes)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
fun NSString.getCString_maxLength(bytes: MemorySegment, maxLength: Long): Unit {
    val sel = ObjCRuntime.sel("getCString:maxLength:")
    ObjCRuntime.msgSend(null, this.ptr, sel, bytes, maxLength)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getCString:maxLength:encoding: instead")
fun NSString.getCString_maxLength_range_remainingRange(bytes: MemorySegment, maxLength: Long, aRange: NSRange, leftoverRange: NSRangePointer): Unit {
    val sel = ObjCRuntime.sel("getCString:maxLength:range:remainingRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, bytes, maxLength, ObjCRuntime.ObjCStructArg(aRange.segment, NSRange.layout), leftoverRange.segment)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -writeToFile:atomically:encoding:error: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -writeToFile:atomically:encoding:error: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -writeToFile:atomically:encoding:error: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -writeToFile:atomically:encoding:error: instead")
fun NSString.writeToFile_atomically(path: MemorySegment, useAuxiliaryFile: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, path, useAuxiliaryFile) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -writeToURL:atomically:encoding:error: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -writeToURL:atomically:encoding:error: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -writeToURL:atomically:encoding:error: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -writeToURL:atomically:encoding:error: instead")
fun NSString.writeToURL_atomically(url: MemorySegment, atomically: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, atomically) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfFile:encoding:error: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -initWithContentsOfFile:encoding:error: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfFile:encoding:error: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfFile:encoding:error: instead")
fun NSString.initWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:encoding:error: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:encoding:error: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:encoding:error: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:encoding:error: instead")
fun NSString.initWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
fun NSString.initWithCStringNoCopy_length_freeWhenDone(bytes: MemorySegment, length: Long, freeBuffer: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCStringNoCopy:length:freeWhenDone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, length, freeBuffer) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
fun NSString.initWithCString_length(bytes: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCString:length:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, length) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithCString:encoding: instead")
fun NSString.initWithCString(bytes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes) as MemorySegment
}

fun NSString.getCharacters(buffer: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, buffer)
}

// Class method: +[NSString stringWithContentsOfFile:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithContentsOfFile:encoding:error: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use +stringWithContentsOfFile:encoding:error: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithContentsOfFile:encoding:error: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithContentsOfFile:encoding:error: instead")
fun NSString_stringWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithContentsOfFile:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}

// Class method: +[NSString stringWithContentsOfURL:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithContentsOfURL:encoding:error: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use +stringWithContentsOfURL:encoding:error: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithContentsOfURL:encoding:error: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithContentsOfURL:encoding:error: instead")
fun NSString_stringWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithContentsOfURL:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url) as MemorySegment
}

// Class method: +[NSString stringWithCString:length:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding:")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding:")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding:")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding:")
fun NSString_stringWithCString_length(bytes: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithCString:length:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, bytes, length) as MemorySegment
}

// Class method: +[NSString stringWithCString:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +stringWithCString:encoding: instead")
fun NSString_stringWithCString(bytes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringWithCString:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, bytes) as MemorySegment
}

// ── Category: NSBundleExtensionMethods on NSString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.variantFittingPresentationWidth(width: Long): MemorySegment {
    val sel = ObjCRuntime.sel("variantFittingPresentationWidth:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, width) as MemorySegment
}

// ── Category: NSStringPathExtensions on NSString ─────────────────────────────────────────

fun NSString.stringByAppendingPathComponent(str: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAppendingPathComponent:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, str) as MemorySegment
}

fun NSString.stringByAppendingPathExtension(str: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAppendingPathExtension:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, str) as MemorySegment
}

/** @return NSArray<NSString *> * */
fun NSString.stringsByAppendingPaths(paths: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringsByAppendingPaths:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, paths) as MemorySegment
}

fun NSString.completePathIntoString_caseSensitive_matchesIntoArray_filterTypes(outputName: MemorySegment, flag: Boolean, outputArray: MemorySegment, filterTypes: MemorySegment): Long {
    val sel = ObjCRuntime.sel("completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, outputName, flag, outputArray, filterTypes) as Long
}

fun NSString.getFileSystemRepresentation_maxLength(cname: MemorySegment, max: Long): Boolean {
    val sel = ObjCRuntime.sel("getFileSystemRepresentation:maxLength:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, cname, max) as Boolean
}

/** @return NSArray<NSString *> * */
fun NSString.pathComponents(): MemorySegment {
    val sel = ObjCRuntime.sel("pathComponents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.isAbsolutePath(): Boolean {
    val sel = ObjCRuntime.sel("isAbsolutePath")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSString.lastPathComponent(): MemorySegment {
    val sel = ObjCRuntime.sel("lastPathComponent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.stringByDeletingLastPathComponent(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByDeletingLastPathComponent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.pathExtension(): MemorySegment {
    val sel = ObjCRuntime.sel("pathExtension")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.stringByDeletingPathExtension(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByDeletingPathExtension")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.stringByAbbreviatingWithTildeInPath(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAbbreviatingWithTildeInPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.stringByExpandingTildeInPath(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByExpandingTildeInPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.stringByStandardizingPath(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByStandardizingPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.stringByResolvingSymlinksInPath(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByResolvingSymlinksInPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSString.fileSystemRepresentation(): MemorySegment {
    val sel = ObjCRuntime.sel("fileSystemRepresentation")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSString pathWithComponents:]
fun NSString_pathWithComponents(components: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("pathWithComponents:")
    val cls = ObjCRuntime.getClass("NSString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, components) as MemorySegment
}

// ── Category: NSURLUtilities on NSString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByAddingPercentEncodingWithAllowedCharacters(allowedCharacters: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAddingPercentEncodingWithAllowedCharacters:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, allowedCharacters) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -stringByAddingPercentEncodingWithAllowedCharacters: instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent since each URL component or subcomponent has different rules for what characters are valid.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -stringByAddingPercentEncodingWithAllowedCharacters: instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent since each URL component or subcomponent has different rules for what characters are valid.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -stringByAddingPercentEncodingWithAllowedCharacters: instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent since each URL component or subcomponent has different rules for what characters are valid.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -stringByAddingPercentEncodingWithAllowedCharacters: instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent since each URL component or subcomponent has different rules for what characters are valid.")
fun NSString.stringByAddingPercentEscapesUsingEncoding(enc: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringByAddingPercentEscapesUsingEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, enc) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -stringByRemovingPercentEncoding instead, which always uses the recommended UTF-8 encoding.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -stringByRemovingPercentEncoding instead, which always uses the recommended UTF-8 encoding.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -stringByRemovingPercentEncoding instead, which always uses the recommended UTF-8 encoding.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -stringByRemovingPercentEncoding instead, which always uses the recommended UTF-8 encoding.")
fun NSString.stringByReplacingPercentEscapesUsingEncoding(enc: Long): MemorySegment {
    val sel = ObjCRuntime.sel("stringByReplacingPercentEscapesUsingEncoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, enc) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSString.stringByRemovingPercentEncoding(): MemorySegment {
    val sel = ObjCRuntime.sel("stringByRemovingPercentEncoding")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSLinguisticAnalysis on NSString ─────────────────────────────────────────

/** @return NSArray<NSLinguisticTag> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
fun NSString.linguisticTagsInRange_scheme_options_orthography_tokenRanges(range: NSRange, scheme: MemorySegment, options: NSLinguisticTaggerOptions, orthography: MemorySegment, tokenRanges: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), scheme, options.rawValue, orthography, tokenRanges) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
fun NSString.enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock(range: NSRange, scheme: MemorySegment, options: NSLinguisticTaggerOptions, orthography: MemorySegment, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), scheme, options.rawValue, orthography, block)
}

// ── Category: NSPasteboardSupport on NSString ─────────────────────────────────────────

// ── Category: NSStringDrawing on NSString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSString.sizeWithAttributes(attrs: MemorySegment): CGSize {
    val sel = ObjCRuntime.sel("sizeWithAttributes:")
    return CGSize(ObjCRuntime.msgSendStruct(CGSize.layout, this.ptr, sel, attrs))
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSString.drawAtPoint_withAttributes(point: CGPoint, attrs: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawAtPoint:withAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout), attrs)
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSString.drawInRect_withAttributes(rect: CGRect, attrs: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawInRect:withAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout), attrs)
}

// ── Category: NSExtendedStringDrawing on NSString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSString.drawWithRect_options_attributes_context(rect: CGRect, options: NSStringDrawingOptions, attributes: MemorySegment, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawWithRect:options:attributes:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout), options.rawValue, attributes, context)
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSString.boundingRectWithSize_options_attributes_context(size: CGSize, options: NSStringDrawingOptions, attributes: MemorySegment, context: MemorySegment): CGRect {
    val sel = ObjCRuntime.sel("boundingRectWithSize:options:attributes:context:")
    return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), options.rawValue, attributes, context))
}

// ── Category: NSStringDrawingDeprecated on NSString ─────────────────────────────────────────

fun NSString.drawWithRect_options_attributes(rect: NSRect, options: NSStringDrawingOptions, attributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawWithRect:options:attributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue, attributes)
}

fun NSString.boundingRectWithSize_options_attributes(size: NSSize, options: NSStringDrawingOptions, attributes: MemorySegment): NSRect {
    val sel = ObjCRuntime.sel("boundingRectWithSize:options:attributes:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), options.rawValue, attributes))
}
