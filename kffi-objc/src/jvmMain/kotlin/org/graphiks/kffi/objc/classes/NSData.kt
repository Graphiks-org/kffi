@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSData
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding
 */
open class NSData(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSData") } }

    }

    // @property length
    open fun length(): Long {
        val sel = ObjCRuntime.sel("length")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bytes
    open fun bytes(): MemorySegment {
        val sel = ObjCRuntime.sel("bytes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSData.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSData.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSData.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSData.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSData_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSExtendedData on NSData ─────────────────────────────────────────

fun NSData.getBytes_length(buffer: MemorySegment, length: Long): Unit {
    val sel = ObjCRuntime.sel("getBytes:length:")
    ObjCRuntime.msgSend(null, this.ptr, sel, buffer, length)
}

fun NSData.getBytes_range(buffer: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("getBytes:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, buffer, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSData.isEqualToData(other: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToData:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, other) as Boolean
}

fun NSData.subdataWithRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("subdataWithRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

fun NSData.writeToFile_atomically(path: MemorySegment, useAuxiliaryFile: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, path, useAuxiliaryFile) as Boolean
}

fun NSData.writeToURL_atomically(url: MemorySegment, atomically: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, atomically) as Boolean
}

fun NSData.writeToFile_options_error(path: MemorySegment, writeOptionsMask: NSDataWritingOptions, errorPtr: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:options:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, path, writeOptionsMask.rawValue, errorPtr) as Boolean
}

fun NSData.writeToURL_options_error(url: MemorySegment, writeOptionsMask: NSDataWritingOptions, errorPtr: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:options:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, writeOptionsMask.rawValue, errorPtr) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.rangeOfData_options_range(dataToFind: MemorySegment, mask: NSDataSearchOptions, searchRange: NSRange): NSRange {
    val sel = ObjCRuntime.sel("rangeOfData:options:range:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, dataToFind, mask.rawValue, ObjCRuntime.ObjCStructArg(searchRange.segment, NSRange.layout)))
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.enumerateByteRangesUsingBlock(block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateByteRangesUsingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, block)
}

fun NSData.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDataCreation on NSData ─────────────────────────────────────────

fun NSData.initWithBytes_length(bytes: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytes:length:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, length) as MemorySegment
}

fun NSData.initWithBytesNoCopy_length(bytes: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytesNoCopy:length:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, length) as MemorySegment
}

fun NSData.initWithBytesNoCopy_length_freeWhenDone(bytes: MemorySegment, length: Long, b: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytesNoCopy:length:freeWhenDone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, length, b) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.initWithBytesNoCopy_length_deallocator(bytes: MemorySegment, length: Long, deallocator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBytesNoCopy:length:deallocator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, bytes, length, deallocator) as MemorySegment
}

fun NSData.initWithContentsOfFile_options_error(path: MemorySegment, readOptionsMask: NSDataReadingOptions, errorPtr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:options:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path, readOptionsMask.rawValue, errorPtr) as MemorySegment
}

fun NSData.initWithContentsOfURL_options_error(url: MemorySegment, readOptionsMask: NSDataReadingOptions, errorPtr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:options:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, readOptionsMask.rawValue, errorPtr) as MemorySegment
}

fun NSData.initWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path) as MemorySegment
}

fun NSData.initWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url) as MemorySegment
}

fun NSData.initWithData(`data`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithData:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`) as MemorySegment
}

// Class method: +[NSData data]
fun NSData_data(): MemorySegment {
    val sel = ObjCRuntime.sel("data")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSData dataWithBytes:length:]
fun NSData_dataWithBytes_length(bytes: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithBytes:length:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, bytes, length) as MemorySegment
}

// Class method: +[NSData dataWithBytesNoCopy:length:]
fun NSData_dataWithBytesNoCopy_length(bytes: MemorySegment, length: Long): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithBytesNoCopy:length:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, bytes, length) as MemorySegment
}

// Class method: +[NSData dataWithBytesNoCopy:length:freeWhenDone:]
fun NSData_dataWithBytesNoCopy_length_freeWhenDone(bytes: MemorySegment, length: Long, b: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithBytesNoCopy:length:freeWhenDone:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, bytes, length, b) as MemorySegment
}

// Class method: +[NSData dataWithContentsOfFile:options:error:]
fun NSData_dataWithContentsOfFile_options_error(path: MemorySegment, readOptionsMask: NSDataReadingOptions, errorPtr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithContentsOfFile:options:error:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path, readOptionsMask.rawValue, errorPtr) as MemorySegment
}

// Class method: +[NSData dataWithContentsOfURL:options:error:]
fun NSData_dataWithContentsOfURL_options_error(url: MemorySegment, readOptionsMask: NSDataReadingOptions, errorPtr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithContentsOfURL:options:error:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url, readOptionsMask.rawValue, errorPtr) as MemorySegment
}

// Class method: +[NSData dataWithContentsOfFile:]
fun NSData_dataWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithContentsOfFile:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}

// Class method: +[NSData dataWithContentsOfURL:]
fun NSData_dataWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithContentsOfURL:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url) as MemorySegment
}

// Class method: +[NSData dataWithData:]
fun NSData_dataWithData(`data`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithData:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `data`) as MemorySegment
}

// ── Category: NSDataBase64Encoding on NSData ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.initWithBase64EncodedString_options(base64String: MemorySegment, options: NSDataBase64DecodingOptions): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBase64EncodedString:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, base64String, options.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.base64EncodedStringWithOptions(options: NSDataBase64EncodingOptions): MemorySegment {
    val sel = ObjCRuntime.sel("base64EncodedStringWithOptions:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, options.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.initWithBase64EncodedData_options(base64Data: MemorySegment, options: NSDataBase64DecodingOptions): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBase64EncodedData:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, base64Data, options.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSData.base64EncodedDataWithOptions(options: NSDataBase64EncodingOptions): MemorySegment {
    val sel = ObjCRuntime.sel("base64EncodedDataWithOptions:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, options.rawValue) as MemorySegment
}

// ── Category: NSDataCompression on NSData ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSData.decompressedDataUsingAlgorithm_error(algorithm: NSDataCompressionAlgorithm, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("decompressedDataUsingAlgorithm:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, algorithm.rawValue, error) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSData.compressedDataUsingAlgorithm_error(algorithm: NSDataCompressionAlgorithm, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("compressedDataUsingAlgorithm:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, algorithm.rawValue, error) as MemorySegment
}

// ── Category: NSDeprecated on NSData ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This method is unsafe because it could potentially cause buffer overruns. Use -getBytes:length: instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "This method is unsafe because it could potentially cause buffer overruns. Use -getBytes:length: instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This method is unsafe because it could potentially cause buffer overruns. Use -getBytes:length: instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This method is unsafe because it could potentially cause buffer overruns. Use -getBytes:length: instead.")
fun NSData.getBytes(buffer: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getBytes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, buffer)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -initWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
fun NSData.initWithContentsOfMappedFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfMappedFile:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use initWithBase64EncodedString:options: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use initWithBase64EncodedString:options: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use initWithBase64EncodedString:options: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use initWithBase64EncodedString:options: instead")
fun NSData.initWithBase64Encoding(base64String: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithBase64Encoding:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, base64String) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use base64EncodedStringWithOptions: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use base64EncodedStringWithOptions: instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use base64EncodedStringWithOptions: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use base64EncodedStringWithOptions: instead")
fun NSData.base64Encoding(): MemorySegment {
    val sel = ObjCRuntime.sel("base64Encoding")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSData dataWithContentsOfMappedFile:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +dataWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +dataWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +dataWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use +dataWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or NSDataReadingMappedAlways instead.")
fun NSData_dataWithContentsOfMappedFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithContentsOfMappedFile:")
    val cls = ObjCRuntime.getClass("NSData")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}
