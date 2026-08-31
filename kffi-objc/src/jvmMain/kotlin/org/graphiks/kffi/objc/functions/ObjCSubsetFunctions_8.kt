@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : kCGColorBlack typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorBlack_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorBlack_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorBlack").orElseThrow().reinterpret(kCGColorBlack_LAYOUT.byteSize()) }
private val kCGColorBlack_VH: VarHandle by lazy { kCGColorBlack_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGColorBlack: MemorySegment
    get() = kCGColorBlack_VH.get(kCGColorBlack_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorBlack_VH.set(kCGColorBlack_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGColorClear typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorClear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorClear_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGColorClear").orElseThrow().reinterpret(kCGColorClear_LAYOUT.byteSize()) }
private val kCGColorClear_VH: VarHandle by lazy { kCGColorClear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGColorClear: MemorySegment
    get() = kCGColorClear_VH.get(kCGColorClear_SEGMENT, 0L) as MemorySegment
    set(value) = kCGColorClear_VH.set(kCGColorClear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGFontGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGFontGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGFontGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetTypeID").orElseThrow() }
private val CGFontGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetTypeID_ADDR, CGFontGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGFontGetTypeID(): Long {
    try {
        return CGFontGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCreateWithPlatformFont typedef CGFontRef = (Declared(CGFont))*((Void)*)
 */
private val CGFontCreateWithPlatformFont_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCreateWithPlatformFont_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCreateWithPlatformFont").orElseThrow() }
private val CGFontCreateWithPlatformFont_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCreateWithPlatformFont_ADDR, CGFontCreateWithPlatformFont_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGFontCreateWithPlatformFont(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCreateWithPlatformFont_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCreateWithDataProvider typedef CGFontRef = (Declared(CGFont))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGFontCreateWithDataProvider_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCreateWithDataProvider_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCreateWithDataProvider").orElseThrow() }
private val CGFontCreateWithDataProvider_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCreateWithDataProvider_ADDR, CGFontCreateWithDataProvider_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontCreateWithDataProvider(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCreateWithDataProvider_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCreateWithFontName typedef CGFontRef = (Declared(CGFont))*(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CGFontCreateWithFontName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCreateWithFontName_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCreateWithFontName").orElseThrow() }
private val CGFontCreateWithFontName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCreateWithFontName_ADDR, CGFontCreateWithFontName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontCreateWithFontName(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCreateWithFontName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCreateCopyWithVariations typedef CGFontRef = (Declared(CGFont))*(typedef CGFontRef = (Declared(CGFont))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGFontCreateCopyWithVariations_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCreateCopyWithVariations_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCreateCopyWithVariations").orElseThrow() }
private val CGFontCreateCopyWithVariations_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCreateCopyWithVariations_ADDR, CGFontCreateCopyWithVariations_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCreateCopyWithVariations(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGFontCreateCopyWithVariations_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontRetain typedef CGFontRef = (Declared(CGFont))*(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontRetain").orElseThrow() }
private val CGFontRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontRetain_ADDR, CGFontRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGFontRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontRelease Void(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGFontRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontRelease").orElseThrow() }
private val CGFontRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontRelease_ADDR, CGFontRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGFontRelease(arg0: MemorySegment): Unit {
    try {
        CGFontRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetNumberOfGlyphs typedef size_t = UNSIGNED = Long(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetNumberOfGlyphs_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGFontGetNumberOfGlyphs_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetNumberOfGlyphs").orElseThrow() }
private val CGFontGetNumberOfGlyphs_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetNumberOfGlyphs_ADDR, CGFontGetNumberOfGlyphs_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGFontGetNumberOfGlyphs(arg0: MemorySegment): Long {
    try {
        return CGFontGetNumberOfGlyphs_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetUnitsPerEm Int(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetUnitsPerEm_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGFontGetUnitsPerEm_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetUnitsPerEm").orElseThrow() }
private val CGFontGetUnitsPerEm_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetUnitsPerEm_ADDR, CGFontGetUnitsPerEm_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGFontGetUnitsPerEm(arg0: MemorySegment): Int {
    try {
        return CGFontGetUnitsPerEm_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyPostScriptName typedef CFStringRef = (Declared(__CFString))*(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontCopyPostScriptName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCopyPostScriptName_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyPostScriptName").orElseThrow() }
private val CGFontCopyPostScriptName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyPostScriptName_ADDR, CGFontCopyPostScriptName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCopyPostScriptName(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCopyPostScriptName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyFullName typedef CFStringRef = (Declared(__CFString))*(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontCopyFullName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCopyFullName_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyFullName").orElseThrow() }
private val CGFontCopyFullName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyFullName_ADDR, CGFontCopyFullName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontCopyFullName(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCopyFullName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetAscent Int(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetAscent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGFontGetAscent_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetAscent").orElseThrow() }
private val CGFontGetAscent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetAscent_ADDR, CGFontGetAscent_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetAscent(arg0: MemorySegment): Int {
    try {
        return CGFontGetAscent_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetDescent Int(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetDescent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGFontGetDescent_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetDescent").orElseThrow() }
private val CGFontGetDescent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetDescent_ADDR, CGFontGetDescent_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetDescent(arg0: MemorySegment): Int {
    try {
        return CGFontGetDescent_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetLeading Int(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetLeading_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGFontGetLeading_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetLeading").orElseThrow() }
private val CGFontGetLeading_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetLeading_ADDR, CGFontGetLeading_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetLeading(arg0: MemorySegment): Int {
    try {
        return CGFontGetLeading_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetCapHeight Int(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetCapHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGFontGetCapHeight_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetCapHeight").orElseThrow() }
private val CGFontGetCapHeight_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetCapHeight_ADDR, CGFontGetCapHeight_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetCapHeight(arg0: MemorySegment): Int {
    try {
        return CGFontGetCapHeight_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetXHeight Int(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetXHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGFontGetXHeight_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetXHeight").orElseThrow() }
private val CGFontGetXHeight_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetXHeight_ADDR, CGFontGetXHeight_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetXHeight(arg0: MemorySegment): Int {
    try {
        return CGFontGetXHeight_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetFontBBox typedef CGRect = Declared(CGRect)(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetFontBBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGFontGetFontBBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetFontBBox").orElseThrow() }
private val CGFontGetFontBBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetFontBBox_ADDR, CGFontGetFontBBox_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetFontBBox(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGFontGetFontBBox_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetFontBBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGFontGetFontBBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGFontGetItalicAngle typedef CGFloat = Double(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetItalicAngle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGFontGetItalicAngle_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetItalicAngle").orElseThrow() }
private val CGFontGetItalicAngle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetItalicAngle_ADDR, CGFontGetItalicAngle_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetItalicAngle(arg0: MemorySegment): Double {
    try {
        return CGFontGetItalicAngle_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetStemV typedef CGFloat = Double(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetStemV_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGFontGetStemV_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetStemV").orElseThrow() }
private val CGFontGetStemV_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetStemV_ADDR, CGFontGetStemV_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetStemV(arg0: MemorySegment): Double {
    try {
        return CGFontGetStemV_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyVariationAxes typedef CFArrayRef = (Declared(__CFArray))*(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontCopyVariationAxes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCopyVariationAxes_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyVariationAxes").orElseThrow() }
private val CGFontCopyVariationAxes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyVariationAxes_ADDR, CGFontCopyVariationAxes_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCopyVariationAxes(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCopyVariationAxes_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyVariations typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontCopyVariations_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCopyVariations_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyVariations").orElseThrow() }
private val CGFontCopyVariations_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyVariations_ADDR, CGFontCopyVariations_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCopyVariations(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCopyVariations_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetGlyphAdvances Bool(typedef CGFontRef = (Declared(CGFont))*,(typedef CGGlyph = UNSIGNED = Short)*,typedef size_t = UNSIGNED = Long,(Int)*)
 */
private val CGFontGetGlyphAdvances_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGFontGetGlyphAdvances_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetGlyphAdvances").orElseThrow() }
private val CGFontGetGlyphAdvances_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetGlyphAdvances_ADDR, CGFontGetGlyphAdvances_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGFontGetGlyphAdvances(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Boolean {
    try {
        return CGFontGetGlyphAdvances_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetGlyphBBoxes Bool(typedef CGFontRef = (Declared(CGFont))*,(typedef CGGlyph = UNSIGNED = Short)*,typedef size_t = UNSIGNED = Long,(typedef CGRect = Declared(CGRect))*)
 */
private val CGFontGetGlyphBBoxes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGFontGetGlyphBBoxes_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetGlyphBBoxes").orElseThrow() }
private val CGFontGetGlyphBBoxes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetGlyphBBoxes_ADDR, CGFontGetGlyphBBoxes_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetGlyphBBoxes(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Boolean {
    try {
        return CGFontGetGlyphBBoxes_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontGetGlyphWithGlyphName typedef CGGlyph = UNSIGNED = Short(typedef CGFontRef = (Declared(CGFont))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CGFontGetGlyphWithGlyphName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontGetGlyphWithGlyphName_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontGetGlyphWithGlyphName").orElseThrow() }
private val CGFontGetGlyphWithGlyphName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontGetGlyphWithGlyphName_ADDR, CGFontGetGlyphWithGlyphName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontGetGlyphWithGlyphName(arg0: MemorySegment, arg1: MemorySegment): Short {
    try {
        return CGFontGetGlyphWithGlyphName_HANDLE.invokeExact(arg0, arg1) as Short
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyGlyphNameForGlyph typedef CFStringRef = (Declared(__CFString))*(typedef CGFontRef = (Declared(CGFont))*,typedef CGGlyph = UNSIGNED = Short)
 */
private val CGFontCopyGlyphNameForGlyph_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
private val CGFontCopyGlyphNameForGlyph_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyGlyphNameForGlyph").orElseThrow() }
private val CGFontCopyGlyphNameForGlyph_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyGlyphNameForGlyph_ADDR, CGFontCopyGlyphNameForGlyph_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontCopyGlyphNameForGlyph(arg0: MemorySegment, arg1: Short): MemorySegment {
    try {
        return CGFontCopyGlyphNameForGlyph_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCanCreatePostScriptSubset Bool(typedef CGFontRef = (Declared(CGFont))*,typedef CGFontPostScriptFormat = Declared(CGFontPostScriptFormat))
 */
private val CGFontCanCreatePostScriptSubset_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGFontCanCreatePostScriptSubset_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCanCreatePostScriptSubset").orElseThrow() }
private val CGFontCanCreatePostScriptSubset_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCanCreatePostScriptSubset_ADDR, CGFontCanCreatePostScriptSubset_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCanCreatePostScriptSubset(arg0: MemorySegment, arg1: CGFontPostScriptFormat): Boolean {
    try {
        return CGFontCanCreatePostScriptSubset_HANDLE.invokeExact(arg0, arg1.value.toInt()) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCreatePostScriptSubset typedef CFDataRef = (Declared(__CFData))*(typedef CGFontRef = (Declared(CGFont))*,typedef CFStringRef = (Declared(__CFString))*,typedef CGFontPostScriptFormat = Declared(CGFontPostScriptFormat),(typedef CGGlyph = UNSIGNED = Short)*,typedef size_t = UNSIGNED = Long,(typedef CGGlyph = UNSIGNED = Short)*)
 */
private val CGFontCreatePostScriptSubset_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGFontCreatePostScriptSubset_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCreatePostScriptSubset").orElseThrow() }
private val CGFontCreatePostScriptSubset_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCreatePostScriptSubset_ADDR, CGFontCreatePostScriptSubset_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCreatePostScriptSubset(arg0: MemorySegment, arg1: MemorySegment, arg2: CGFontPostScriptFormat, arg3: MemorySegment, arg4: Long, arg5: MemorySegment): MemorySegment {
    try {
        return CGFontCreatePostScriptSubset_HANDLE.invokeExact(arg0, arg1, arg2.value.toInt(), arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCreatePostScriptEncoding typedef CFDataRef = (Declared(__CFData))*(typedef CGFontRef = (Declared(CGFont))*,(typedef CGGlyph = UNSIGNED = Short)*)
 */
private val CGFontCreatePostScriptEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCreatePostScriptEncoding_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCreatePostScriptEncoding").orElseThrow() }
private val CGFontCreatePostScriptEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCreatePostScriptEncoding_ADDR, CGFontCreatePostScriptEncoding_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGFontCreatePostScriptEncoding(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGFontCreatePostScriptEncoding_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyTableTags typedef CFArrayRef = (Declared(__CFArray))*(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontCopyTableTags_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFontCopyTableTags_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyTableTags").orElseThrow() }
private val CGFontCopyTableTags_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyTableTags_ADDR, CGFontCopyTableTags_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontCopyTableTags(arg0: MemorySegment): MemorySegment {
    try {
        return CGFontCopyTableTags_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFontCopyTableForTag typedef CFDataRef = (Declared(__CFData))*(typedef CGFontRef = (Declared(CGFont))*,typedef uint32_t = UNSIGNED = Int)
 */
private val CGFontCopyTableForTag_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGFontCopyTableForTag_ADDR: MemorySegment by lazy { LOOKUP.find("CGFontCopyTableForTag").orElseThrow() }
private val CGFontCopyTableForTag_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFontCopyTableForTag_ADDR, CGFontCopyTableForTag_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGFontCopyTableForTag(arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CGFontCopyTableForTag_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGFontVariationAxisName typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisName_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGFontVariationAxisName").orElseThrow().reinterpret(kCGFontVariationAxisName_LAYOUT.byteSize()) }
private val kCGFontVariationAxisName_VH: VarHandle by lazy { kCGFontVariationAxisName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGFontVariationAxisName: MemorySegment
    get() = kCGFontVariationAxisName_VH.get(kCGFontVariationAxisName_SEGMENT, 0L) as MemorySegment
    set(value) = kCGFontVariationAxisName_VH.set(kCGFontVariationAxisName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGFontVariationAxisMinValue typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisMinValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisMinValue_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGFontVariationAxisMinValue").orElseThrow().reinterpret(kCGFontVariationAxisMinValue_LAYOUT.byteSize()) }
private val kCGFontVariationAxisMinValue_VH: VarHandle by lazy { kCGFontVariationAxisMinValue_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGFontVariationAxisMinValue: MemorySegment
    get() = kCGFontVariationAxisMinValue_VH.get(kCGFontVariationAxisMinValue_SEGMENT, 0L) as MemorySegment
    set(value) = kCGFontVariationAxisMinValue_VH.set(kCGFontVariationAxisMinValue_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGFontVariationAxisMaxValue typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisMaxValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisMaxValue_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGFontVariationAxisMaxValue").orElseThrow().reinterpret(kCGFontVariationAxisMaxValue_LAYOUT.byteSize()) }
private val kCGFontVariationAxisMaxValue_VH: VarHandle by lazy { kCGFontVariationAxisMaxValue_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGFontVariationAxisMaxValue: MemorySegment
    get() = kCGFontVariationAxisMaxValue_VH.get(kCGFontVariationAxisMaxValue_SEGMENT, 0L) as MemorySegment
    set(value) = kCGFontVariationAxisMaxValue_VH.set(kCGFontVariationAxisMaxValue_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGFontVariationAxisDefaultValue typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisDefaultValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisDefaultValue_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGFontVariationAxisDefaultValue").orElseThrow().reinterpret(kCGFontVariationAxisDefaultValue_LAYOUT.byteSize()) }
private val kCGFontVariationAxisDefaultValue_VH: VarHandle by lazy { kCGFontVariationAxisDefaultValue_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGFontVariationAxisDefaultValue: MemorySegment
    get() = kCGFontVariationAxisDefaultValue_VH.get(kCGFontVariationAxisDefaultValue_SEGMENT, 0L) as MemorySegment
    set(value) = kCGFontVariationAxisDefaultValue_VH.set(kCGFontVariationAxisDefaultValue_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGGradientGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGGradientGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGGradientGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientGetTypeID").orElseThrow() }
private val CGGradientGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientGetTypeID_ADDR, CGGradientGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGGradientGetTypeID(): Long {
    try {
        return CGGradientGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGradientCreateWithColorComponents typedef CGGradientRef = (Declared(CGGradient))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,(typedef CGFloat = Double)*,(typedef CGFloat = Double)*,typedef size_t = UNSIGNED = Long)
 */
private val CGGradientCreateWithColorComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGGradientCreateWithColorComponents_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientCreateWithColorComponents").orElseThrow() }
private val CGGradientCreateWithColorComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientCreateWithColorComponents_ADDR, CGGradientCreateWithColorComponents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGGradientCreateWithColorComponents(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): MemorySegment {
    try {
        return CGGradientCreateWithColorComponents_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGradientCreateWithContentHeadroom typedef CGGradientRef = (Declared(CGGradient))*(Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,(typedef CGFloat = Double)*,(typedef CGFloat = Double)*,typedef size_t = UNSIGNED = Long)
 */
private val CGGradientCreateWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGGradientCreateWithContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientCreateWithContentHeadroom").orElseThrow() }
private val CGGradientCreateWithContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientCreateWithContentHeadroom_ADDR, CGGradientCreateWithContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGGradientCreateWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): MemorySegment {
    try {
        return CGGradientCreateWithContentHeadroom_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGradientCreateWithColors typedef CGGradientRef = (Declared(CGGradient))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CFArrayRef = (Declared(__CFArray))*,(typedef CGFloat = Double)*)
 */
private val CGGradientCreateWithColors_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGradientCreateWithColors_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientCreateWithColors").orElseThrow() }
private val CGGradientCreateWithColors_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientCreateWithColors_ADDR, CGGradientCreateWithColors_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGGradientCreateWithColors(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGGradientCreateWithColors_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGradientRetain typedef CGGradientRef = (Declared(CGGradient))*(typedef CGGradientRef = (Declared(CGGradient))*)
 */
private val CGGradientRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGradientRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientRetain").orElseThrow() }
private val CGGradientRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientRetain_ADDR, CGGradientRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGGradientRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGGradientRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGradientRelease Void(typedef CGGradientRef = (Declared(CGGradient))*)
 */
private val CGGradientRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGGradientRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientRelease").orElseThrow() }
private val CGGradientRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientRelease_ADDR, CGGradientRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGGradientRelease(arg0: MemorySegment): Unit {
    try {
        CGGradientRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGradientGetContentHeadroom Float(typedef CGGradientRef = (Declared(CGGradient))*)
 */
private val CGGradientGetContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGGradientGetContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGGradientGetContentHeadroom").orElseThrow() }
private val CGGradientGetContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGGradientGetContentHeadroom_ADDR, CGGradientGetContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGGradientGetContentHeadroom(arg0: MemorySegment): Float {
    try {
        return CGGradientGetContentHeadroom_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGImageGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGImageGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetTypeID").orElseThrow() }
private val CGImageGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetTypeID_ADDR, CGImageGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGImageGetTypeID(): Long {
    try {
        return CGImageGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreate typedef CGImageRef = (Declared(CGImage))*(typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGBitmapInfo = Declared(CGBitmapInfo),typedef CGDataProviderRef = (Declared(CGDataProvider))*,(typedef CGFloat = Double)*,Bool,typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent))
 */
private val CGImageCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT)
private val CGImageCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreate").orElseThrow() }
private val CGImageCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreate_ADDR, CGImageCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCreate(arg0: Long, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: MemorySegment, arg6: CGBitmapInfo, arg7: MemorySegment, arg8: MemorySegment, arg9: Boolean, arg10: CGColorRenderingIntent): MemorySegment {
    try {
        return CGImageCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6.rawValue.toInt(), arg7, arg8, arg9, arg10.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageMaskCreate typedef CGImageRef = (Declared(CGImage))*(typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CGDataProviderRef = (Declared(CGDataProvider))*,(typedef CGFloat = Double)*,Bool)
 */
private val CGImageMaskCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGImageMaskCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageMaskCreate").orElseThrow() }
private val CGImageMaskCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageMaskCreate_ADDR, CGImageMaskCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageMaskCreate(arg0: Long, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: MemorySegment, arg6: MemorySegment, arg7: Boolean): MemorySegment {
    try {
        return CGImageMaskCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateCopy typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateCopy").orElseThrow() }
private val CGImageCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateCopy_ADDR, CGImageCreateCopy_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGImageCreateCopy(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageCreateCopy_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateWithJPEGDataProvider typedef CGImageRef = (Declared(CGImage))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*,(typedef CGFloat = Double)*,Bool,typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent))
 */
private val CGImageCreateWithJPEGDataProvider_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT)
private val CGImageCreateWithJPEGDataProvider_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateWithJPEGDataProvider").orElseThrow() }
private val CGImageCreateWithJPEGDataProvider_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateWithJPEGDataProvider_ADDR, CGImageCreateWithJPEGDataProvider_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1)
fun CGImageCreateWithJPEGDataProvider(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean, arg3: CGColorRenderingIntent): MemorySegment {
    try {
        return CGImageCreateWithJPEGDataProvider_HANDLE.invokeExact(arg0, arg1, arg2, arg3.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateWithPNGDataProvider typedef CGImageRef = (Declared(CGImage))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*,(typedef CGFloat = Double)*,Bool,typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent))
 */
private val CGImageCreateWithPNGDataProvider_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT)
private val CGImageCreateWithPNGDataProvider_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateWithPNGDataProvider").orElseThrow() }
private val CGImageCreateWithPNGDataProvider_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateWithPNGDataProvider_ADDR, CGImageCreateWithPNGDataProvider_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGImageCreateWithPNGDataProvider(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean, arg3: CGColorRenderingIntent): MemorySegment {
    try {
        return CGImageCreateWithPNGDataProvider_HANDLE.invokeExact(arg0, arg1, arg2, arg3.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateWithImageInRect typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*,typedef CGRect = Declared(CGRect))
 */
private val CGImageCreateWithImageInRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout)
private val CGImageCreateWithImageInRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateWithImageInRect").orElseThrow() }
private val CGImageCreateWithImageInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateWithImageInRect_ADDR, CGImageCreateWithImageInRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGImageCreateWithImageInRect(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGImageCreateWithImageInRect_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGImageCreateWithImageInRect(arg0: MemorySegment, arg1: CGRect): MemorySegment {
    return CGImageCreateWithImageInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGImageCreateWithMask typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*,typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCreateWithMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageCreateWithMask_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateWithMask").orElseThrow() }
private val CGImageCreateWithMask_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateWithMask_ADDR, CGImageCreateWithMask_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGImageCreateWithMask(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGImageCreateWithMask_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateWithMaskingColors typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*,(typedef CGFloat = Double)*)
 */
private val CGImageCreateWithMaskingColors_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageCreateWithMaskingColors_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateWithMaskingColors").orElseThrow() }
private val CGImageCreateWithMaskingColors_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateWithMaskingColors_ADDR, CGImageCreateWithMaskingColors_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGImageCreateWithMaskingColors(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGImageCreateWithMaskingColors_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateCopyWithColorSpace typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGImageCreateCopyWithColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageCreateCopyWithColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateCopyWithColorSpace").orElseThrow() }
private val CGImageCreateCopyWithColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithColorSpace_ADDR, CGImageCreateCopyWithColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGImageCreateCopyWithColorSpace(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGImageCreateCopyWithColorSpace_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateWithContentHeadroom typedef CGImageRef = (Declared(CGImage))*(Float,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGBitmapInfo = Declared(CGBitmapInfo),typedef CGDataProviderRef = (Declared(CGDataProvider))*,(typedef CGFloat = Double)*,Bool,typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent))
 */
private val CGImageCreateWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT)
private val CGImageCreateWithContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateWithContentHeadroom").orElseThrow() }
private val CGImageCreateWithContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateWithContentHeadroom_ADDR, CGImageCreateWithContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCreateWithContentHeadroom(arg0: Float, arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long, arg6: MemorySegment, arg7: CGBitmapInfo, arg8: MemorySegment, arg9: MemorySegment, arg10: Boolean, arg11: CGColorRenderingIntent): MemorySegment {
    try {
        return CGImageCreateWithContentHeadroom_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7.rawValue.toInt(), arg8, arg9, arg10, arg11.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateCopyWithContentHeadroom typedef CGImageRef = (Declared(CGImage))*(Float,typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCreateCopyWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGImageCreateCopyWithContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateCopyWithContentHeadroom").orElseThrow() }
private val CGImageCreateCopyWithContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithContentHeadroom_ADDR, CGImageCreateCopyWithContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCreateCopyWithContentHeadroom(arg0: Float, arg1: MemorySegment): MemorySegment {
    try {
        return CGImageCreateCopyWithContentHeadroom_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGDefaultHDRImageContentHeadroom Float
 */
private val kCGDefaultHDRImageContentHeadroom_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_FLOAT }
private val kCGDefaultHDRImageContentHeadroom_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGDefaultHDRImageContentHeadroom").orElseThrow().reinterpret(kCGDefaultHDRImageContentHeadroom_LAYOUT.byteSize()) }
private val kCGDefaultHDRImageContentHeadroom_VH: VarHandle by lazy { kCGDefaultHDRImageContentHeadroom_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGDefaultHDRImageContentHeadroom: Float
    get() = kCGDefaultHDRImageContentHeadroom_VH.get(kCGDefaultHDRImageContentHeadroom_SEGMENT, 0L) as Float
    set(value) = kCGDefaultHDRImageContentHeadroom_VH.set(kCGDefaultHDRImageContentHeadroom_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGImageGetContentHeadroom Float(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGImageGetContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetContentHeadroom").orElseThrow() }
private val CGImageGetContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetContentHeadroom_ADDR, CGImageGetContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetContentHeadroom(arg0: MemorySegment): Float {
    try {
        return CGImageGetContentHeadroom_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCalculateContentHeadroom Float(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCalculateContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGImageCalculateContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCalculateContentHeadroom").orElseThrow() }
private val CGImageCalculateContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCalculateContentHeadroom_ADDR, CGImageCalculateContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCalculateContentHeadroom(arg0: MemorySegment): Float {
    try {
        return CGImageCalculateContentHeadroom_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetContentAverageLightLevel Float(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetContentAverageLightLevel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGImageGetContentAverageLightLevel_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetContentAverageLightLevel").orElseThrow() }
private val CGImageGetContentAverageLightLevel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetContentAverageLightLevel_ADDR, CGImageGetContentAverageLightLevel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetContentAverageLightLevel(arg0: MemorySegment): Float {
    try {
        return CGImageGetContentAverageLightLevel_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCalculateContentAverageLightLevel Float(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCalculateContentAverageLightLevel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGImageCalculateContentAverageLightLevel_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCalculateContentAverageLightLevel").orElseThrow() }
private val CGImageCalculateContentAverageLightLevel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCalculateContentAverageLightLevel_ADDR, CGImageCalculateContentAverageLightLevel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCalculateContentAverageLightLevel(arg0: MemorySegment): Float {
    try {
        return CGImageCalculateContentAverageLightLevel_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateCopyWithContentAverageLightLevel typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*,Float)
 */
private val CGImageCreateCopyWithContentAverageLightLevel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
private val CGImageCreateCopyWithContentAverageLightLevel_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateCopyWithContentAverageLightLevel").orElseThrow() }
private val CGImageCreateCopyWithContentAverageLightLevel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithContentAverageLightLevel_ADDR, CGImageCreateCopyWithContentAverageLightLevel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCreateCopyWithContentAverageLightLevel(arg0: MemorySegment, arg1: Float): MemorySegment {
    try {
        return CGImageCreateCopyWithContentAverageLightLevel_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageCreateCopyWithCalculatedHDRStats typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCreateCopyWithCalculatedHDRStats_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageCreateCopyWithCalculatedHDRStats_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageCreateCopyWithCalculatedHDRStats").orElseThrow() }
private val CGImageCreateCopyWithCalculatedHDRStats_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithCalculatedHDRStats_ADDR, CGImageCreateCopyWithCalculatedHDRStats_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGImageCreateCopyWithCalculatedHDRStats(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageCreateCopyWithCalculatedHDRStats_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageRetain typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageRetain").orElseThrow() }
private val CGImageRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageRetain_ADDR, CGImageRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageRelease Void(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGImageRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageRelease").orElseThrow() }
private val CGImageRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageRelease_ADDR, CGImageRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageRelease(arg0: MemorySegment): Unit {
    try {
        CGImageRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageIsMask Bool(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageIsMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGImageIsMask_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageIsMask").orElseThrow() }
private val CGImageIsMask_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageIsMask_ADDR, CGImageIsMask_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageIsMask(arg0: MemorySegment): Boolean {
    try {
        return CGImageIsMask_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetWidth typedef size_t = UNSIGNED = Long(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetWidth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGImageGetWidth_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetWidth").orElseThrow() }
private val CGImageGetWidth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetWidth_ADDR, CGImageGetWidth_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetWidth(arg0: MemorySegment): Long {
    try {
        return CGImageGetWidth_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetHeight typedef size_t = UNSIGNED = Long(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGImageGetHeight_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetHeight").orElseThrow() }
private val CGImageGetHeight_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetHeight_ADDR, CGImageGetHeight_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetHeight(arg0: MemorySegment): Long {
    try {
        return CGImageGetHeight_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetBitsPerComponent typedef size_t = UNSIGNED = Long(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetBitsPerComponent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGImageGetBitsPerComponent_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetBitsPerComponent").orElseThrow() }
private val CGImageGetBitsPerComponent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetBitsPerComponent_ADDR, CGImageGetBitsPerComponent_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetBitsPerComponent(arg0: MemorySegment): Long {
    try {
        return CGImageGetBitsPerComponent_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetBitsPerPixel typedef size_t = UNSIGNED = Long(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetBitsPerPixel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGImageGetBitsPerPixel_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetBitsPerPixel").orElseThrow() }
private val CGImageGetBitsPerPixel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetBitsPerPixel_ADDR, CGImageGetBitsPerPixel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetBitsPerPixel(arg0: MemorySegment): Long {
    try {
        return CGImageGetBitsPerPixel_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetBytesPerRow typedef size_t = UNSIGNED = Long(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetBytesPerRow_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGImageGetBytesPerRow_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetBytesPerRow").orElseThrow() }
private val CGImageGetBytesPerRow_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetBytesPerRow_ADDR, CGImageGetBytesPerRow_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetBytesPerRow(arg0: MemorySegment): Long {
    try {
        return CGImageGetBytesPerRow_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageGetColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetColorSpace").orElseThrow() }
private val CGImageGetColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetColorSpace_ADDR, CGImageGetColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetColorSpace(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageGetColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetAlphaInfo typedef CGImageAlphaInfo = Declared(CGImageAlphaInfo)(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetAlphaInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGImageGetAlphaInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetAlphaInfo").orElseThrow() }
private val CGImageGetAlphaInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetAlphaInfo_ADDR, CGImageGetAlphaInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetAlphaInfo(arg0: MemorySegment): CGImageAlphaInfo {
    try {
        return CGImageAlphaInfo.fromValue(Integer.toUnsignedLong(CGImageGetAlphaInfo_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetDataProvider typedef CGDataProviderRef = (Declared(CGDataProvider))*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetDataProvider_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageGetDataProvider_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetDataProvider").orElseThrow() }
private val CGImageGetDataProvider_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetDataProvider_ADDR, CGImageGetDataProvider_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetDataProvider(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageGetDataProvider_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetDecode (typedef CGFloat = Double)*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetDecode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageGetDecode_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetDecode").orElseThrow() }
private val CGImageGetDecode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetDecode_ADDR, CGImageGetDecode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetDecode(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageGetDecode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetShouldInterpolate Bool(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetShouldInterpolate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGImageGetShouldInterpolate_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetShouldInterpolate").orElseThrow() }
private val CGImageGetShouldInterpolate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetShouldInterpolate_ADDR, CGImageGetShouldInterpolate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetShouldInterpolate(arg0: MemorySegment): Boolean {
    try {
        return CGImageGetShouldInterpolate_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetRenderingIntent typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent)(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetRenderingIntent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGImageGetRenderingIntent_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetRenderingIntent").orElseThrow() }
private val CGImageGetRenderingIntent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetRenderingIntent_ADDR, CGImageGetRenderingIntent_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGImageGetRenderingIntent(arg0: MemorySegment): CGColorRenderingIntent {
    try {
        return CGColorRenderingIntent.fromValue((CGImageGetRenderingIntent_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetBitmapInfo typedef CGBitmapInfo = Declared(CGBitmapInfo)(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetBitmapInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGImageGetBitmapInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetBitmapInfo").orElseThrow() }
private val CGImageGetBitmapInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetBitmapInfo_ADDR, CGImageGetBitmapInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGImageGetBitmapInfo(arg0: MemorySegment): CGBitmapInfo {
    try {
        return CGBitmapInfo(Integer.toUnsignedLong(CGImageGetBitmapInfo_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetByteOrderInfo typedef CGImageByteOrderInfo = Declared(CGImageByteOrderInfo)(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetByteOrderInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGImageGetByteOrderInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetByteOrderInfo").orElseThrow() }
private val CGImageGetByteOrderInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetByteOrderInfo_ADDR, CGImageGetByteOrderInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CGImageGetByteOrderInfo(arg0: MemorySegment): CGImageByteOrderInfo {
    try {
        return CGImageByteOrderInfo.fromValue(Integer.toUnsignedLong(CGImageGetByteOrderInfo_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetPixelFormatInfo typedef CGImagePixelFormatInfo = Declared(CGImagePixelFormatInfo)(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetPixelFormatInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGImageGetPixelFormatInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetPixelFormatInfo").orElseThrow() }
private val CGImageGetPixelFormatInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetPixelFormatInfo_ADDR, CGImageGetPixelFormatInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CGImageGetPixelFormatInfo(arg0: MemorySegment): CGImagePixelFormatInfo {
    try {
        return CGImagePixelFormatInfo.fromValue(Integer.toUnsignedLong(CGImageGetPixelFormatInfo_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageShouldToneMap Bool(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageShouldToneMap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGImageShouldToneMap_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageShouldToneMap").orElseThrow() }
private val CGImageShouldToneMap_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageShouldToneMap_ADDR, CGImageShouldToneMap_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGImageShouldToneMap(arg0: MemorySegment): Boolean {
    try {
        return CGImageShouldToneMap_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageContainsImageSpecificToneMappingMetadata Bool(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageContainsImageSpecificToneMappingMetadata_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGImageContainsImageSpecificToneMappingMetadata_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageContainsImageSpecificToneMappingMetadata").orElseThrow() }
private val CGImageContainsImageSpecificToneMappingMetadata_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageContainsImageSpecificToneMappingMetadata_ADDR, CGImageContainsImageSpecificToneMappingMetadata_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGImageContainsImageSpecificToneMappingMetadata(arg0: MemorySegment): Boolean {
    try {
        return CGImageContainsImageSpecificToneMappingMetadata_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGImageGetUTType typedef CFStringRef = (Declared(__CFString))*(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetUTType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageGetUTType_ADDR: MemorySegment by lazy { LOOKUP.find("CGImageGetUTType").orElseThrow() }
private val CGImageGetUTType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGImageGetUTType_ADDR, CGImageGetUTType_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun CGImageGetUTType(arg0: MemorySegment): MemorySegment {
    try {
        return CGImageGetUTType_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGPathGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGPathGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathGetTypeID").orElseThrow() }
private val CGPathGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathGetTypeID_ADDR, CGPathGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathGetTypeID(): Long {
    try {
        return CGPathGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateMutable typedef CGMutablePathRef = (Declared(CGPath))*()
 */
private val CGPathCreateMutable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGPathCreateMutable_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateMutable").orElseThrow() }
private val CGPathCreateMutable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateMutable_ADDR, CGPathCreateMutable_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathCreateMutable(): MemorySegment {
    try {
        return CGPathCreateMutable_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopy typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopy").orElseThrow() }
private val CGPathCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopy_ADDR, CGPathCreateCopy_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathCreateCopy(arg0: MemorySegment): MemorySegment {
    try {
        return CGPathCreateCopy_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyByTransformingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateCopyByTransformingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathCreateCopyByTransformingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByTransformingPath").orElseThrow() }
private val CGPathCreateCopyByTransformingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByTransformingPath_ADDR, CGPathCreateCopyByTransformingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathCreateCopyByTransformingPath(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGPathCreateCopyByTransformingPath_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateMutableCopy typedef CGMutablePathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathCreateMutableCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathCreateMutableCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateMutableCopy").orElseThrow() }
private val CGPathCreateMutableCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateMutableCopy_ADDR, CGPathCreateMutableCopy_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathCreateMutableCopy(arg0: MemorySegment): MemorySegment {
    try {
        return CGPathCreateMutableCopy_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateMutableCopyByTransformingPath typedef CGMutablePathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateMutableCopyByTransformingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathCreateMutableCopyByTransformingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateMutableCopyByTransformingPath").orElseThrow() }
private val CGPathCreateMutableCopyByTransformingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateMutableCopyByTransformingPath_ADDR, CGPathCreateMutableCopyByTransformingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathCreateMutableCopyByTransformingPath(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGPathCreateMutableCopyByTransformingPath_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateWithRect typedef CGPathRef = (Declared(CGPath))*(typedef CGRect = Declared(CGRect),(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateWithRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGPathCreateWithRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateWithRect").orElseThrow() }
private val CGPathCreateWithRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateWithRect_ADDR, CGPathCreateWithRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGPathCreateWithRect(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGPathCreateWithRect_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGPathCreateWithRect(arg0: CGRect, arg1: MemorySegment): MemorySegment {
    return CGPathCreateWithRect(arg0.segment, arg1)
}

/**
 * {@snippet lang=c : CGPathCreateWithEllipseInRect typedef CGPathRef = (Declared(CGPath))*(typedef CGRect = Declared(CGRect),(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateWithEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGPathCreateWithEllipseInRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateWithEllipseInRect").orElseThrow() }
private val CGPathCreateWithEllipseInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateWithEllipseInRect_ADDR, CGPathCreateWithEllipseInRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathCreateWithEllipseInRect(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGPathCreateWithEllipseInRect_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathCreateWithEllipseInRect(arg0: CGRect, arg1: MemorySegment): MemorySegment {
    return CGPathCreateWithEllipseInRect(arg0.segment, arg1)
}

/**
 * {@snippet lang=c : CGPathCreateWithRoundedRect typedef CGPathRef = (Declared(CGPath))*(typedef CGRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double,(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateWithRoundedRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGPathCreateWithRoundedRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateWithRoundedRect").orElseThrow() }
private val CGPathCreateWithRoundedRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateWithRoundedRect_ADDR, CGPathCreateWithRoundedRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
fun CGPathCreateWithRoundedRect(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: MemorySegment): MemorySegment {
    try {
        return CGPathCreateWithRoundedRect_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
fun CGPathCreateWithRoundedRect(arg0: CGRect, arg1: Double, arg2: Double, arg3: MemorySegment): MemorySegment {
    return CGPathCreateWithRoundedRect(arg0.segment, arg1, arg2, arg3)
}

/**
 * {@snippet lang=c : CGPathAddRoundedRect Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddRoundedRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddRoundedRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddRoundedRect").orElseThrow() }
private val CGPathAddRoundedRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddRoundedRect_ADDR, CGPathAddRoundedRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
fun CGPathAddRoundedRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: Double): Unit {
    try {
        CGPathAddRoundedRect_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
fun CGPathAddRoundedRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect, arg3: Double, arg4: Double): Unit {
    CGPathAddRoundedRect(arg0, arg1, arg2.segment, arg3, arg4)
}

/**
 * {@snippet lang=c : CGPathCreateCopyByDashingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,(typedef CGFloat = Double)*,typedef size_t = UNSIGNED = Long)
 */
private val CGPathCreateCopyByDashingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPathCreateCopyByDashingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByDashingPath").orElseThrow() }
private val CGPathCreateCopyByDashingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByDashingPath_ADDR, CGPathCreateCopyByDashingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathCreateCopyByDashingPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: MemorySegment, arg4: Long): MemorySegment {
    try {
        return CGPathCreateCopyByDashingPath_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyByStrokingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGLineCap = Declared(CGLineCap),typedef CGLineJoin = Declared(CGLineJoin),typedef CGFloat = Double)
 */
private val CGPathCreateCopyByStrokingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
private val CGPathCreateCopyByStrokingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByStrokingPath").orElseThrow() }
private val CGPathCreateCopyByStrokingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByStrokingPath_ADDR, CGPathCreateCopyByStrokingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathCreateCopyByStrokingPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: CGLineCap, arg4: CGLineJoin, arg5: Double): MemorySegment {
    try {
        return CGPathCreateCopyByStrokingPath_HANDLE.invokeExact(arg0, arg1, arg2, arg3.value.toInt(), arg4.value.toInt(), arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathRetain typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathRetain").orElseThrow() }
private val CGPathRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathRetain_ADDR, CGPathRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPathRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathRelease Void(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPathRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathRelease").orElseThrow() }
private val CGPathRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathRelease_ADDR, CGPathRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathRelease(arg0: MemorySegment): Unit {
    try {
        CGPathRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathEqualToPath Bool(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathEqualToPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathEqualToPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathEqualToPath").orElseThrow() }
private val CGPathEqualToPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathEqualToPath_ADDR, CGPathEqualToPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathEqualToPath(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPathEqualToPath_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathMoveToPoint Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathMoveToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathMoveToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathMoveToPoint").orElseThrow() }
private val CGPathMoveToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathMoveToPoint_ADDR, CGPathMoveToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathMoveToPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double): Unit {
    try {
        CGPathMoveToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddLineToPoint Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddLineToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddLineToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddLineToPoint").orElseThrow() }
private val CGPathAddLineToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddLineToPoint_ADDR, CGPathAddLineToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddLineToPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double): Unit {
    try {
        CGPathAddLineToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddQuadCurveToPoint Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddQuadCurveToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddQuadCurveToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddQuadCurveToPoint").orElseThrow() }
private val CGPathAddQuadCurveToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddQuadCurveToPoint_ADDR, CGPathAddQuadCurveToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddQuadCurveToPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double, arg4: Double, arg5: Double): Unit {
    try {
        CGPathAddQuadCurveToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddCurveToPoint Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddCurveToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddCurveToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddCurveToPoint").orElseThrow() }
private val CGPathAddCurveToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddCurveToPoint_ADDR, CGPathAddCurveToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddCurveToPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double, arg7: Double): Unit {
    try {
        CGPathAddCurveToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCloseSubpath Void(typedef CGMutablePathRef = (Declared(CGPath))*)
 */
private val CGPathCloseSubpath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPathCloseSubpath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCloseSubpath").orElseThrow() }
private val CGPathCloseSubpath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCloseSubpath_ADDR, CGPathCloseSubpath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathCloseSubpath(arg0: MemorySegment): Unit {
    try {
        CGPathCloseSubpath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddRect Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGRect = Declared(CGRect))
 */
private val CGPathAddRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout)
private val CGPathAddRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddRect").orElseThrow() }
private val CGPathAddRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddRect_ADDR, CGPathAddRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPathAddRect_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect): Unit {
    CGPathAddRect(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : CGPathAddRects Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGPathAddRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPathAddRects_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddRects").orElseThrow() }
private val CGPathAddRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddRects_ADDR, CGPathAddRects_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddRects(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): Unit {
    try {
        CGPathAddRects_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddLines Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,(typedef CGPoint = Declared(CGPoint))*,typedef size_t = UNSIGNED = Long)
 */
private val CGPathAddLines_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPathAddLines_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddLines").orElseThrow() }
private val CGPathAddLines_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddLines_ADDR, CGPathAddLines_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddLines(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): Unit {
    try {
        CGPathAddLines_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddEllipseInRect Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGRect = Declared(CGRect))
 */
private val CGPathAddEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout)
private val CGPathAddEllipseInRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddEllipseInRect").orElseThrow() }
private val CGPathAddEllipseInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddEllipseInRect_ADDR, CGPathAddEllipseInRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPathAddEllipseInRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPathAddEllipseInRect_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPathAddEllipseInRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect): Unit {
    CGPathAddEllipseInRect(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : CGPathAddRelativeArc Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddRelativeArc_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddRelativeArc_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddRelativeArc").orElseThrow() }
private val CGPathAddRelativeArc_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddRelativeArc_ADDR, CGPathAddRelativeArc_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPathAddRelativeArc(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double): Unit {
    try {
        CGPathAddRelativeArc_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddArc Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,Bool)
 */
private val CGPathAddArc_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_BOOLEAN)
private val CGPathAddArc_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddArc").orElseThrow() }
private val CGPathAddArc_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddArc_ADDR, CGPathAddArc_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddArc(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double, arg7: Boolean): Unit {
    try {
        CGPathAddArc_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddArcToPoint Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddArcToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddArcToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddArcToPoint").orElseThrow() }
private val CGPathAddArcToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddArcToPoint_ADDR, CGPathAddArcToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddArcToPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double): Unit {
    try {
        CGPathAddArcToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathAddPath Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathAddPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathAddPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathAddPath").orElseThrow() }
private val CGPathAddPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathAddPath_ADDR, CGPathAddPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathAddPath(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPathAddPath_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathIsEmpty Bool(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathIsEmpty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPathIsEmpty_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathIsEmpty").orElseThrow() }
private val CGPathIsEmpty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathIsEmpty_ADDR, CGPathIsEmpty_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathIsEmpty(arg0: MemorySegment): Boolean {
    try {
        return CGPathIsEmpty_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathIsRect Bool(typedef CGPathRef = (Declared(CGPath))*,(typedef CGRect = Declared(CGRect))*)
 */
private val CGPathIsRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathIsRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathIsRect").orElseThrow() }
private val CGPathIsRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathIsRect_ADDR, CGPathIsRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathIsRect(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPathIsRect_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathGetCurrentPoint typedef CGPoint = Declared(CGPoint)(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathGetCurrentPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS)
private val CGPathGetCurrentPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathGetCurrentPoint").orElseThrow() }
private val CGPathGetCurrentPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathGetCurrentPoint_ADDR, CGPathGetCurrentPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathGetCurrentPoint(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGPathGetCurrentPoint_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathGetCurrentPointTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGPathGetCurrentPoint(allocator, arg0))
}

/**
 * {@snippet lang=c : CGPathGetBoundingBox typedef CGRect = Declared(CGRect)(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathGetBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGPathGetBoundingBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathGetBoundingBox").orElseThrow() }
private val CGPathGetBoundingBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathGetBoundingBox_ADDR, CGPathGetBoundingBox_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathGetBoundingBox(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGPathGetBoundingBox_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathGetBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGPathGetBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGPathGetPathBoundingBox typedef CGRect = Declared(CGRect)(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathGetPathBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGPathGetPathBoundingBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathGetPathBoundingBox").orElseThrow() }
private val CGPathGetPathBoundingBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathGetPathBoundingBox_ADDR, CGPathGetPathBoundingBox_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGPathGetPathBoundingBox(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGPathGetPathBoundingBox_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGPathGetPathBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGPathGetPathBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGPathContainsPoint Bool(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGPoint = Declared(CGPoint),Bool)
 */
private val CGPathContainsPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_BOOLEAN)
private val CGPathContainsPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathContainsPoint").orElseThrow() }
private val CGPathContainsPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathContainsPoint_ADDR, CGPathContainsPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPathContainsPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Boolean): Boolean {
    try {
        return CGPathContainsPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPathContainsPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPoint, arg3: Boolean): Boolean {
    return CGPathContainsPoint(arg0, arg1, arg2.segment, arg3)
}

/**
 * {@snippet lang=c : CGPathApply Void(typedef CGPathRef = (Declared(CGPath))*,(Void)*,typedef CGPathApplierFunction = (Void((Void)*,(Declared(CGPathElement))*))*)
 */
private val CGPathApply_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathApply_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathApply").orElseThrow() }
private val CGPathApply_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathApply_ADDR, CGPathApply_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPathApply(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPathApply_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathApplyWithBlock Void(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathApplyBlock = (Void)*)
 */
private val CGPathApplyWithBlock_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathApplyWithBlock_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathApplyWithBlock").orElseThrow() }
private val CGPathApplyWithBlock_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathApplyWithBlock_ADDR, CGPathApplyWithBlock_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGPathApplyWithBlock(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPathApplyWithBlock_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyByNormalizing typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyByNormalizing_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyByNormalizing_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByNormalizing").orElseThrow() }
private val CGPathCreateCopyByNormalizing_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByNormalizing_ADDR, CGPathCreateCopyByNormalizing_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyByNormalizing(arg0: MemorySegment, arg1: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyByNormalizing_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyByUnioningPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyByUnioningPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyByUnioningPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByUnioningPath").orElseThrow() }
private val CGPathCreateCopyByUnioningPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByUnioningPath_ADDR, CGPathCreateCopyByUnioningPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyByUnioningPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyByUnioningPath_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyByIntersectingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyByIntersectingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyByIntersectingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByIntersectingPath").orElseThrow() }
private val CGPathCreateCopyByIntersectingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByIntersectingPath_ADDR, CGPathCreateCopyByIntersectingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyByIntersectingPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyByIntersectingPath_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyBySubtractingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyBySubtractingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyBySubtractingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyBySubtractingPath").orElseThrow() }
private val CGPathCreateCopyBySubtractingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyBySubtractingPath_ADDR, CGPathCreateCopyBySubtractingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyBySubtractingPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyBySubtractingPath_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyBySymmetricDifferenceOfPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyBySymmetricDifferenceOfPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyBySymmetricDifferenceOfPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyBySymmetricDifferenceOfPath").orElseThrow() }
private val CGPathCreateCopyBySymmetricDifferenceOfPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyBySymmetricDifferenceOfPath_ADDR, CGPathCreateCopyBySymmetricDifferenceOfPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyBySymmetricDifferenceOfPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyBySymmetricDifferenceOfPath_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyOfLineBySubtractingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyOfLineBySubtractingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyOfLineBySubtractingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyOfLineBySubtractingPath").orElseThrow() }
private val CGPathCreateCopyOfLineBySubtractingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyOfLineBySubtractingPath_ADDR, CGPathCreateCopyOfLineBySubtractingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyOfLineBySubtractingPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyOfLineBySubtractingPath_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyOfLineByIntersectingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateCopyOfLineByIntersectingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateCopyOfLineByIntersectingPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyOfLineByIntersectingPath").orElseThrow() }
private val CGPathCreateCopyOfLineByIntersectingPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyOfLineByIntersectingPath_ADDR, CGPathCreateCopyOfLineByIntersectingPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyOfLineByIntersectingPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): MemorySegment {
    try {
        return CGPathCreateCopyOfLineByIntersectingPath_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateSeparateComponents typedef CFArrayRef = (Declared(__CFArray))*(typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathCreateSeparateComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathCreateSeparateComponents_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateSeparateComponents").orElseThrow() }
private val CGPathCreateSeparateComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateSeparateComponents_ADDR, CGPathCreateSeparateComponents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateSeparateComponents(arg0: MemorySegment, arg1: Boolean): MemorySegment {
    try {
        return CGPathCreateSeparateComponents_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathCreateCopyByFlattening typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,typedef CGFloat = Double)
 */
private val CGPathCreateCopyByFlattening_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGPathCreateCopyByFlattening_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathCreateCopyByFlattening").orElseThrow() }
private val CGPathCreateCopyByFlattening_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathCreateCopyByFlattening_ADDR, CGPathCreateCopyByFlattening_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathCreateCopyByFlattening(arg0: MemorySegment, arg1: Double): MemorySegment {
    try {
        return CGPathCreateCopyByFlattening_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPathIntersectsPath Bool(typedef CGPathRef = (Declared(CGPath))*,typedef CGPathRef = (Declared(CGPath))*,Bool)
 */
private val CGPathIntersectsPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGPathIntersectsPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGPathIntersectsPath").orElseThrow() }
private val CGPathIntersectsPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPathIntersectsPath_ADDR, CGPathIntersectsPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
fun CGPathIntersectsPath(arg0: MemorySegment, arg1: MemorySegment, arg2: Boolean): Boolean {
    try {
        return CGPathIntersectsPath_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFObjectGetType typedef CGPDFObjectType = Declared(CGPDFObjectType)(typedef CGPDFObjectRef = (Declared(CGPDFObject))*)
 */
private val CGPDFObjectGetType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGPDFObjectGetType_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFObjectGetType").orElseThrow() }
private val CGPDFObjectGetType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFObjectGetType_ADDR, CGPDFObjectGetType_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFObjectGetType(arg0: MemorySegment): CGPDFObjectType {
    try {
        return CGPDFObjectType.fromValue((CGPDFObjectGetType_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFObjectGetValue Bool(typedef CGPDFObjectRef = (Declared(CGPDFObject))*,typedef CGPDFObjectType = Declared(CGPDFObjectType),(Void)*)
 */
private val CGPDFObjectGetValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGPDFObjectGetValue_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFObjectGetValue").orElseThrow() }
private val CGPDFObjectGetValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFObjectGetValue_ADDR, CGPDFObjectGetValue_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFObjectGetValue(arg0: MemorySegment, arg1: CGPDFObjectType, arg2: MemorySegment): Boolean {
    try {
        return CGPDFObjectGetValue_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFStreamGetDictionary typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*(typedef CGPDFStreamRef = (Declared(CGPDFStream))*)
 */
private val CGPDFStreamGetDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFStreamGetDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFStreamGetDictionary").orElseThrow() }
private val CGPDFStreamGetDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFStreamGetDictionary_ADDR, CGPDFStreamGetDictionary_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFStreamGetDictionary(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFStreamGetDictionary_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFStreamCopyData typedef CFDataRef = (Declared(__CFData))*(typedef CGPDFStreamRef = (Declared(CGPDFStream))*,(typedef CGPDFDataFormat = Declared(CGPDFDataFormat))*)
 */
private val CGPDFStreamCopyData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFStreamCopyData_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFStreamCopyData").orElseThrow() }
private val CGPDFStreamCopyData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFStreamCopyData_ADDR, CGPDFStreamCopyData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFStreamCopyData(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGPDFStreamCopyData_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFStringGetLength typedef size_t = UNSIGNED = Long(typedef CGPDFStringRef = (Declared(CGPDFString))*)
 */
private val CGPDFStringGetLength_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFStringGetLength_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFStringGetLength").orElseThrow() }
private val CGPDFStringGetLength_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFStringGetLength_ADDR, CGPDFStringGetLength_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFStringGetLength(arg0: MemorySegment): Long {
    try {
        return CGPDFStringGetLength_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFStringGetBytePtr (UNSIGNED = Char)*(typedef CGPDFStringRef = (Declared(CGPDFString))*)
 */
private val CGPDFStringGetBytePtr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFStringGetBytePtr_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFStringGetBytePtr").orElseThrow() }
private val CGPDFStringGetBytePtr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFStringGetBytePtr_ADDR, CGPDFStringGetBytePtr_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFStringGetBytePtr(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFStringGetBytePtr_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFStringCopyTextString typedef CFStringRef = (Declared(__CFString))*(typedef CGPDFStringRef = (Declared(CGPDFString))*)
 */
private val CGPDFStringCopyTextString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFStringCopyTextString_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFStringCopyTextString").orElseThrow() }
private val CGPDFStringCopyTextString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFStringCopyTextString_ADDR, CGPDFStringCopyTextString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFStringCopyTextString(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFStringCopyTextString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFStringCopyDate typedef CFDateRef = (Declared(__CFDate))*(typedef CGPDFStringRef = (Declared(CGPDFString))*)
 */
private val CGPDFStringCopyDate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFStringCopyDate_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFStringCopyDate").orElseThrow() }
private val CGPDFStringCopyDate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFStringCopyDate_ADDR, CGPDFStringCopyDate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFStringCopyDate(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFStringCopyDate_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetCount typedef size_t = UNSIGNED = Long(typedef CGPDFArrayRef = (Declared(CGPDFArray))*)
 */
private val CGPDFArrayGetCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetCount_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetCount").orElseThrow() }
private val CGPDFArrayGetCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetCount_ADDR, CGPDFArrayGetCount_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetCount(arg0: MemorySegment): Long {
    try {
        return CGPDFArrayGetCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetObject Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFObjectRef = (Declared(CGPDFObject))*)*)
 */
private val CGPDFArrayGetObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetObject_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetObject").orElseThrow() }
private val CGPDFArrayGetObject_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetObject_ADDR, CGPDFArrayGetObject_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetObject(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetObject_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetNull Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long)
 */
private val CGPDFArrayGetNull_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPDFArrayGetNull_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetNull").orElseThrow() }
private val CGPDFArrayGetNull_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetNull_ADDR, CGPDFArrayGetNull_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetNull(arg0: MemorySegment, arg1: Long): Boolean {
    try {
        return CGPDFArrayGetNull_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetBoolean Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFBoolean = UNSIGNED = Char)*)
 */
private val CGPDFArrayGetBoolean_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetBoolean_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetBoolean").orElseThrow() }
private val CGPDFArrayGetBoolean_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetBoolean_ADDR, CGPDFArrayGetBoolean_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetBoolean(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetBoolean_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetInteger Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFInteger = Long)*)
 */
private val CGPDFArrayGetInteger_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetInteger_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetInteger").orElseThrow() }
private val CGPDFArrayGetInteger_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetInteger_ADDR, CGPDFArrayGetInteger_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetInteger(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetInteger_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetNumber Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFReal = Double)*)
 */
private val CGPDFArrayGetNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetNumber_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetNumber").orElseThrow() }
private val CGPDFArrayGetNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetNumber_ADDR, CGPDFArrayGetNumber_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetNumber(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetNumber_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetName Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,((Char)*)*)
 */
private val CGPDFArrayGetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetName_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetName").orElseThrow() }
private val CGPDFArrayGetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetName_ADDR, CGPDFArrayGetName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetName(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetName_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetString Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFStringRef = (Declared(CGPDFString))*)*)
 */
private val CGPDFArrayGetString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetString_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetString").orElseThrow() }
private val CGPDFArrayGetString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetString_ADDR, CGPDFArrayGetString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetString(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetString_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetArray Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFArrayRef = (Declared(CGPDFArray))*)*)
 */
private val CGPDFArrayGetArray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetArray_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetArray").orElseThrow() }
private val CGPDFArrayGetArray_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetArray_ADDR, CGPDFArrayGetArray_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetArray(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetArray_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetDictionary Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*)*)
 */
private val CGPDFArrayGetDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetDictionary").orElseThrow() }
private val CGPDFArrayGetDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetDictionary_ADDR, CGPDFArrayGetDictionary_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetDictionary(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetDictionary_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayGetStream Bool(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef size_t = UNSIGNED = Long,(typedef CGPDFStreamRef = (Declared(CGPDFStream))*)*)
 */
private val CGPDFArrayGetStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFArrayGetStream_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayGetStream").orElseThrow() }
private val CGPDFArrayGetStream_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayGetStream_ADDR, CGPDFArrayGetStream_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFArrayGetStream(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Boolean {
    try {
        return CGPDFArrayGetStream_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFArrayApplyBlock Void(typedef CGPDFArrayRef = (Declared(CGPDFArray))*,typedef CGPDFArrayApplierBlock = (Void)*,(Void)*)
 */
private val CGPDFArrayApplyBlock_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFArrayApplyBlock_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFArrayApplyBlock").orElseThrow() }
private val CGPDFArrayApplyBlock_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFArrayApplyBlock_ADDR, CGPDFArrayApplyBlock_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CGPDFArrayApplyBlock(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFArrayApplyBlock_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetCount typedef size_t = UNSIGNED = Long(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*)
 */
private val CGPDFDictionaryGetCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetCount_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetCount").orElseThrow() }
private val CGPDFDictionaryGetCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetCount_ADDR, CGPDFDictionaryGetCount_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetCount(arg0: MemorySegment): Long {
    try {
        return CGPDFDictionaryGetCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetObject Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFObjectRef = (Declared(CGPDFObject))*)*)
 */
private val CGPDFDictionaryGetObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetObject_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetObject").orElseThrow() }
private val CGPDFDictionaryGetObject_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetObject_ADDR, CGPDFDictionaryGetObject_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetObject(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetObject_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetBoolean Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFBoolean = UNSIGNED = Char)*)
 */
private val CGPDFDictionaryGetBoolean_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetBoolean_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetBoolean").orElseThrow() }
private val CGPDFDictionaryGetBoolean_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetBoolean_ADDR, CGPDFDictionaryGetBoolean_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetBoolean(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetBoolean_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetInteger Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFInteger = Long)*)
 */
private val CGPDFDictionaryGetInteger_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetInteger_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetInteger").orElseThrow() }
private val CGPDFDictionaryGetInteger_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetInteger_ADDR, CGPDFDictionaryGetInteger_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetInteger(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetInteger_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetNumber Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFReal = Double)*)
 */
private val CGPDFDictionaryGetNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetNumber_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetNumber").orElseThrow() }
private val CGPDFDictionaryGetNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetNumber_ADDR, CGPDFDictionaryGetNumber_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetNumber(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetNumber_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetName Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,((Char)*)*)
 */
private val CGPDFDictionaryGetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetName_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetName").orElseThrow() }
private val CGPDFDictionaryGetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetName_ADDR, CGPDFDictionaryGetName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetName(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetName_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetString Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFStringRef = (Declared(CGPDFString))*)*)
 */
private val CGPDFDictionaryGetString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetString_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetString").orElseThrow() }
private val CGPDFDictionaryGetString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetString_ADDR, CGPDFDictionaryGetString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetString_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetArray Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFArrayRef = (Declared(CGPDFArray))*)*)
 */
private val CGPDFDictionaryGetArray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetArray_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetArray").orElseThrow() }
private val CGPDFDictionaryGetArray_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetArray_ADDR, CGPDFDictionaryGetArray_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetArray(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetArray_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetDictionary Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*)*)
 */
private val CGPDFDictionaryGetDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetDictionary").orElseThrow() }
private val CGPDFDictionaryGetDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetDictionary_ADDR, CGPDFDictionaryGetDictionary_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetDictionary(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetDictionary_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryGetStream Bool(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,(Char)*,(typedef CGPDFStreamRef = (Declared(CGPDFStream))*)*)
 */
private val CGPDFDictionaryGetStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryGetStream_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryGetStream").orElseThrow() }
private val CGPDFDictionaryGetStream_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetStream_ADDR, CGPDFDictionaryGetStream_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryGetStream(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Boolean {
    try {
        return CGPDFDictionaryGetStream_HANDLE.invokeExact(arg0, arg1, arg2) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryApplyFunction Void(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,typedef CGPDFDictionaryApplierFunction = (Void((Char)*,(Declared(CGPDFObject))*,(Void)*))*,(Void)*)
 */
private val CGPDFDictionaryApplyFunction_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryApplyFunction_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryApplyFunction").orElseThrow() }
private val CGPDFDictionaryApplyFunction_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryApplyFunction_ADDR, CGPDFDictionaryApplyFunction_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDictionaryApplyFunction(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFDictionaryApplyFunction_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDictionaryApplyBlock Void(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,typedef CGPDFDictionaryApplierBlock = (Void)*,(Void)*)
 */
private val CGPDFDictionaryApplyBlock_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDictionaryApplyBlock_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDictionaryApplyBlock").orElseThrow() }
private val CGPDFDictionaryApplyBlock_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDictionaryApplyBlock_ADDR, CGPDFDictionaryApplyBlock_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun CGPDFDictionaryApplyBlock(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFDictionaryApplyBlock_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageRetain typedef CGPDFPageRef = (Declared(CGPDFPage))*(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFPageRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageRetain").orElseThrow() }
private val CGPDFPageRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageRetain_ADDR, CGPDFPageRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFPageRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageRelease Void(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFPageRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageRelease").orElseThrow() }
private val CGPDFPageRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageRelease_ADDR, CGPDFPageRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageRelease(arg0: MemorySegment): Unit {
    try {
        CGPDFPageRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageGetDocument typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageGetDocument_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFPageGetDocument_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetDocument").orElseThrow() }
private val CGPDFPageGetDocument_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetDocument_ADDR, CGPDFPageGetDocument_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetDocument(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFPageGetDocument_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageGetPageNumber typedef size_t = UNSIGNED = Long(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageGetPageNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFPageGetPageNumber_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetPageNumber").orElseThrow() }
private val CGPDFPageGetPageNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetPageNumber_ADDR, CGPDFPageGetPageNumber_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetPageNumber(arg0: MemorySegment): Long {
    try {
        return CGPDFPageGetPageNumber_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageGetBoxRect typedef CGRect = Declared(CGRect)(typedef CGPDFPageRef = (Declared(CGPDFPage))*,typedef CGPDFBox = Declared(CGPDFBox))
 */
private val CGPDFPageGetBoxRect_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFPageGetBoxRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetBoxRect").orElseThrow() }
private val CGPDFPageGetBoxRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetBoxRect_ADDR, CGPDFPageGetBoxRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetBoxRect(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPDFBox): MemorySegment {
    try {
        return CGPDFPageGetBoxRect_HANDLE.invokeExact(allocator, arg0, arg1.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetBoxRectTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPDFBox): CGRect {
    return CGRect(CGPDFPageGetBoxRect(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFPageGetRotationAngle Int(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageGetRotationAngle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGPDFPageGetRotationAngle_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetRotationAngle").orElseThrow() }
private val CGPDFPageGetRotationAngle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetRotationAngle_ADDR, CGPDFPageGetRotationAngle_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetRotationAngle(arg0: MemorySegment): Int {
    try {
        return CGPDFPageGetRotationAngle_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageGetDrawingTransform typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGPDFPageRef = (Declared(CGPDFPage))*,typedef CGPDFBox = Declared(CGPDFBox),typedef CGRect = Declared(CGRect),Int,Bool)
 */
private val CGPDFPageGetDrawingTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CGRect.layout, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN)
private val CGPDFPageGetDrawingTransform_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetDrawingTransform").orElseThrow() }
private val CGPDFPageGetDrawingTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetDrawingTransform_ADDR, CGPDFPageGetDrawingTransform_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetDrawingTransform(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPDFBox, arg2: MemorySegment, arg3: Int, arg4: Boolean): MemorySegment {
    try {
        return CGPDFPageGetDrawingTransform_HANDLE.invokeExact(allocator, arg0, arg1.value.toInt(), arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetDrawingTransform(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPDFBox, arg2: CGRect, arg3: Int, arg4: Boolean): CGAffineTransform {
    return CGAffineTransform(CGPDFPageGetDrawingTransform(allocator, arg0, arg1, arg2.segment, arg3, arg4))
}

/**
 * {@snippet lang=c : CGPDFPageGetDictionary typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageGetDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFPageGetDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetDictionary").orElseThrow() }
private val CGPDFPageGetDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetDictionary_ADDR, CGPDFPageGetDictionary_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetDictionary(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFPageGetDictionary_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFPageGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGPDFPageGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGPDFPageGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFPageGetTypeID").orElseThrow() }
private val CGPDFPageGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFPageGetTypeID_ADDR, CGPDFPageGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFPageGetTypeID(): Long {
    try {
        return CGPDFPageGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGPDFOutlineTitle typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineTitle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineTitle_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGPDFOutlineTitle").orElseThrow().reinterpret(kCGPDFOutlineTitle_LAYOUT.byteSize()) }
private val kCGPDFOutlineTitle_VH: VarHandle by lazy { kCGPDFOutlineTitle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGPDFOutlineTitle: MemorySegment
    get() = kCGPDFOutlineTitle_VH.get(kCGPDFOutlineTitle_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFOutlineTitle_VH.set(kCGPDFOutlineTitle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFOutlineChildren typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineChildren_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineChildren_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGPDFOutlineChildren").orElseThrow().reinterpret(kCGPDFOutlineChildren_LAYOUT.byteSize()) }
private val kCGPDFOutlineChildren_VH: VarHandle by lazy { kCGPDFOutlineChildren_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGPDFOutlineChildren: MemorySegment
    get() = kCGPDFOutlineChildren_VH.get(kCGPDFOutlineChildren_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFOutlineChildren_VH.set(kCGPDFOutlineChildren_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFOutlineDestination typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineDestination_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineDestination_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGPDFOutlineDestination").orElseThrow().reinterpret(kCGPDFOutlineDestination_LAYOUT.byteSize()) }
private val kCGPDFOutlineDestination_VH: VarHandle by lazy { kCGPDFOutlineDestination_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGPDFOutlineDestination: MemorySegment
    get() = kCGPDFOutlineDestination_VH.get(kCGPDFOutlineDestination_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFOutlineDestination_VH.set(kCGPDFOutlineDestination_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFOutlineDestinationRect typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineDestinationRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineDestinationRect_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGPDFOutlineDestinationRect").orElseThrow().reinterpret(kCGPDFOutlineDestinationRect_LAYOUT.byteSize()) }
private val kCGPDFOutlineDestinationRect_VH: VarHandle by lazy { kCGPDFOutlineDestinationRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGPDFOutlineDestinationRect: MemorySegment
    get() = kCGPDFOutlineDestinationRect_VH.get(kCGPDFOutlineDestinationRect_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFOutlineDestinationRect_VH.set(kCGPDFOutlineDestinationRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGPDFDocumentCreateWithProvider typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGPDFDocumentCreateWithProvider_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentCreateWithProvider_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentCreateWithProvider").orElseThrow() }
private val CGPDFDocumentCreateWithProvider_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentCreateWithProvider_ADDR, CGPDFDocumentCreateWithProvider_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFDocumentCreateWithProvider(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentCreateWithProvider_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentCreateWithURL typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CGPDFDocumentCreateWithURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentCreateWithURL_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentCreateWithURL").orElseThrow() }
private val CGPDFDocumentCreateWithURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentCreateWithURL_ADDR, CGPDFDocumentCreateWithURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFDocumentCreateWithURL(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentCreateWithURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentRetain typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentRetain").orElseThrow() }
private val CGPDFDocumentRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentRetain_ADDR, CGPDFDocumentRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFDocumentRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentRelease Void(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFDocumentRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentRelease").orElseThrow() }
private val CGPDFDocumentRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentRelease_ADDR, CGPDFDocumentRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFDocumentRelease(arg0: MemorySegment): Unit {
    try {
        CGPDFDocumentRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetVersion Void(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,(Int)*,(Int)*)
 */
private val CGPDFDocumentGetVersion_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentGetVersion_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetVersion").orElseThrow() }
private val CGPDFDocumentGetVersion_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetVersion_ADDR, CGPDFDocumentGetVersion_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDocumentGetVersion(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFDocumentGetVersion_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentIsEncrypted Bool(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentIsEncrypted_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPDFDocumentIsEncrypted_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentIsEncrypted").orElseThrow() }
private val CGPDFDocumentIsEncrypted_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentIsEncrypted_ADDR, CGPDFDocumentIsEncrypted_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPDFDocumentIsEncrypted(arg0: MemorySegment): Boolean {
    try {
        return CGPDFDocumentIsEncrypted_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentUnlockWithPassword Bool(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,(Char)*)
 */
private val CGPDFDocumentUnlockWithPassword_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentUnlockWithPassword_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentUnlockWithPassword").orElseThrow() }
private val CGPDFDocumentUnlockWithPassword_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentUnlockWithPassword_ADDR, CGPDFDocumentUnlockWithPassword_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPDFDocumentUnlockWithPassword(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFDocumentUnlockWithPassword_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentIsUnlocked Bool(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentIsUnlocked_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPDFDocumentIsUnlocked_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentIsUnlocked").orElseThrow() }
private val CGPDFDocumentIsUnlocked_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentIsUnlocked_ADDR, CGPDFDocumentIsUnlocked_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPDFDocumentIsUnlocked(arg0: MemorySegment): Boolean {
    try {
        return CGPDFDocumentIsUnlocked_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentAllowsPrinting Bool(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentAllowsPrinting_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPDFDocumentAllowsPrinting_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentAllowsPrinting").orElseThrow() }
private val CGPDFDocumentAllowsPrinting_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentAllowsPrinting_ADDR, CGPDFDocumentAllowsPrinting_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPDFDocumentAllowsPrinting(arg0: MemorySegment): Boolean {
    try {
        return CGPDFDocumentAllowsPrinting_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentAllowsCopying Bool(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentAllowsCopying_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPDFDocumentAllowsCopying_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentAllowsCopying").orElseThrow() }
private val CGPDFDocumentAllowsCopying_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentAllowsCopying_ADDR, CGPDFDocumentAllowsCopying_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPDFDocumentAllowsCopying(arg0: MemorySegment): Boolean {
    try {
        return CGPDFDocumentAllowsCopying_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetNumberOfPages typedef size_t = UNSIGNED = Long(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentGetNumberOfPages_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGPDFDocumentGetNumberOfPages_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetNumberOfPages").orElseThrow() }
private val CGPDFDocumentGetNumberOfPages_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetNumberOfPages_ADDR, CGPDFDocumentGetNumberOfPages_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFDocumentGetNumberOfPages(arg0: MemorySegment): Long {
    try {
        return CGPDFDocumentGetNumberOfPages_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetPage typedef CGPDFPageRef = (Declared(CGPDFPage))*(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,typedef size_t = UNSIGNED = Long)
 */
private val CGPDFDocumentGetPage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPDFDocumentGetPage_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetPage").orElseThrow() }
private val CGPDFDocumentGetPage_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetPage_ADDR, CGPDFDocumentGetPage_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDocumentGetPage(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return CGPDFDocumentGetPage_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetCatalog typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentGetCatalog_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentGetCatalog_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetCatalog").orElseThrow() }
private val CGPDFDocumentGetCatalog_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetCatalog_ADDR, CGPDFDocumentGetCatalog_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPDFDocumentGetCatalog(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentGetCatalog_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetInfo typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentGetInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentGetInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetInfo").orElseThrow() }
private val CGPDFDocumentGetInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetInfo_ADDR, CGPDFDocumentGetInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFDocumentGetInfo(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentGetInfo_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetID typedef CGPDFArrayRef = (Declared(CGPDFArray))*(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentGetID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentGetID_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetID").orElseThrow() }
private val CGPDFDocumentGetID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetID_ADDR, CGPDFDocumentGetID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFDocumentGetID(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentGetID_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGPDFDocumentGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGPDFDocumentGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetTypeID").orElseThrow() }
private val CGPDFDocumentGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetTypeID_ADDR, CGPDFDocumentGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGPDFDocumentGetTypeID(): Long {
    try {
        return CGPDFDocumentGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetOutline typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentGetOutline_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentGetOutline_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetOutline").orElseThrow() }
private val CGPDFDocumentGetOutline_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetOutline_ADDR, CGPDFDocumentGetOutline_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGPDFDocumentGetOutline(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFDocumentGetOutline_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetAccessPermissions typedef CGPDFAccessPermissions = Declared(CGPDFAccessPermissions)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*)
 */
private val CGPDFDocumentGetAccessPermissions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGPDFDocumentGetAccessPermissions_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetAccessPermissions").orElseThrow() }
private val CGPDFDocumentGetAccessPermissions_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetAccessPermissions_ADDR, CGPDFDocumentGetAccessPermissions_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGPDFDocumentGetAccessPermissions(arg0: MemorySegment): CGPDFAccessPermissions {
    try {
        return CGPDFAccessPermissions(Integer.toUnsignedLong(CGPDFDocumentGetAccessPermissions_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFDocumentGetMediaBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetMediaBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetMediaBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetMediaBox").orElseThrow() }
private val CGPDFDocumentGetMediaBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetMediaBox_ADDR, CGPDFDocumentGetMediaBox_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetMediaBox(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CGPDFDocumentGetMediaBox_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetMediaBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetMediaBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetCropBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetCropBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetCropBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetCropBox").orElseThrow() }
private val CGPDFDocumentGetCropBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetCropBox_ADDR, CGPDFDocumentGetCropBox_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetCropBox(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CGPDFDocumentGetCropBox_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetCropBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetCropBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetBleedBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetBleedBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetBleedBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetBleedBox").orElseThrow() }
private val CGPDFDocumentGetBleedBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetBleedBox_ADDR, CGPDFDocumentGetBleedBox_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetBleedBox(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CGPDFDocumentGetBleedBox_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetBleedBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetBleedBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetTrimBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetTrimBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetTrimBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetTrimBox").orElseThrow() }
private val CGPDFDocumentGetTrimBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetTrimBox_ADDR, CGPDFDocumentGetTrimBox_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetTrimBox(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CGPDFDocumentGetTrimBox_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetTrimBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetTrimBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetArtBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetArtBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetArtBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetArtBox").orElseThrow() }
private val CGPDFDocumentGetArtBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetArtBox_ADDR, CGPDFDocumentGetArtBox_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetArtBox(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CGPDFDocumentGetArtBox_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetArtBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetArtBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetRotationAngle Int(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetRotationAngle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetRotationAngle_ADDR: MemorySegment by lazy { LOOKUP.find("CGPDFDocumentGetRotationAngle").orElseThrow() }
private val CGPDFDocumentGetRotationAngle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGPDFDocumentGetRotationAngle_ADDR, CGPDFDocumentGetRotationAngle_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "No longer supported")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CGPDFDocumentGetRotationAngle(arg0: MemorySegment, arg1: Int): Int {
    try {
        return CGPDFDocumentGetRotationAngle_HANDLE.invokeExact(arg0, arg1) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFunctionGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGFunctionGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGFunctionGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGFunctionGetTypeID").orElseThrow() }
private val CGFunctionGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFunctionGetTypeID_ADDR, CGFunctionGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGFunctionGetTypeID(): Long {
    try {
        return CGFunctionGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFunctionCreate typedef CGFunctionRef = (Declared(CGFunction))*((Void)*,typedef size_t = UNSIGNED = Long,(typedef CGFloat = Double)*,typedef size_t = UNSIGNED = Long,(typedef CGFloat = Double)*,(typedef CGFunctionCallbacks = Declared(CGFunctionCallbacks))*)
 */
private val CGFunctionCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFunctionCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CGFunctionCreate").orElseThrow() }
private val CGFunctionCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFunctionCreate_ADDR, CGFunctionCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGFunctionCreate(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CGFunctionCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFunctionRetain typedef CGFunctionRef = (Declared(CGFunction))*(typedef CGFunctionRef = (Declared(CGFunction))*)
 */
private val CGFunctionRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGFunctionRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGFunctionRetain").orElseThrow() }
private val CGFunctionRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFunctionRetain_ADDR, CGFunctionRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGFunctionRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGFunctionRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGFunctionRelease Void(typedef CGFunctionRef = (Declared(CGFunction))*)
 */
private val CGFunctionRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGFunctionRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGFunctionRelease").orElseThrow() }
private val CGFunctionRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGFunctionRelease_ADDR, CGFunctionRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGFunctionRelease(arg0: MemorySegment): Unit {
    try {
        CGFunctionRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGShadingGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGShadingGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGShadingGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingGetTypeID").orElseThrow() }
private val CGShadingGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingGetTypeID_ADDR, CGShadingGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingGetTypeID(): Long {
    try {
        return CGShadingGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGShadingCreateAxial typedef CGShadingRef = (Declared(CGShading))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGPoint = Declared(CGPoint),typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateAxial_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, CGPoint.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateAxial_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingCreateAxial").orElseThrow() }
private val CGShadingCreateAxial_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingCreateAxial_ADDR, CGShadingCreateAxial_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingCreateAxial(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Boolean, arg5: Boolean): MemorySegment {
    try {
        return CGShadingCreateAxial_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingCreateAxial(arg0: MemorySegment, arg1: CGPoint, arg2: CGPoint, arg3: MemorySegment, arg4: Boolean, arg5: Boolean): MemorySegment {
    return CGShadingCreateAxial(arg0, arg1.segment, arg2.segment, arg3, arg4, arg5)
}

/**
 * {@snippet lang=c : CGShadingCreateAxialWithContentHeadroom typedef CGShadingRef = (Declared(CGShading))*(Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGPoint = Declared(CGPoint),typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateAxialWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, CGPoint.layout, CGPoint.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateAxialWithContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingCreateAxialWithContentHeadroom").orElseThrow() }
private val CGShadingCreateAxialWithContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingCreateAxialWithContentHeadroom_ADDR, CGShadingCreateAxialWithContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGShadingCreateAxialWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: Boolean, arg6: Boolean): MemorySegment {
    try {
        return CGShadingCreateAxialWithContentHeadroom_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGShadingCreateAxialWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: CGPoint, arg3: CGPoint, arg4: MemorySegment, arg5: Boolean, arg6: Boolean): MemorySegment {
    return CGShadingCreateAxialWithContentHeadroom(arg0, arg1, arg2.segment, arg3.segment, arg4, arg5, arg6)
}

/**
 * {@snippet lang=c : CGShadingCreateRadial typedef CGShadingRef = (Declared(CGShading))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateRadial_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_DOUBLE, CGPoint.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateRadial_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingCreateRadial").orElseThrow() }
private val CGShadingCreateRadial_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingCreateRadial_ADDR, CGShadingCreateRadial_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingCreateRadial(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: MemorySegment, arg4: Double, arg5: MemorySegment, arg6: Boolean, arg7: Boolean): MemorySegment {
    try {
        return CGShadingCreateRadial_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingCreateRadial(arg0: MemorySegment, arg1: CGPoint, arg2: Double, arg3: CGPoint, arg4: Double, arg5: MemorySegment, arg6: Boolean, arg7: Boolean): MemorySegment {
    return CGShadingCreateRadial(arg0, arg1.segment, arg2, arg3.segment, arg4, arg5, arg6, arg7)
}

/**
 * {@snippet lang=c : CGShadingCreateRadialWithContentHeadroom typedef CGShadingRef = (Declared(CGShading))*(Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateRadialWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_DOUBLE, CGPoint.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateRadialWithContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingCreateRadialWithContentHeadroom").orElseThrow() }
private val CGShadingCreateRadialWithContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingCreateRadialWithContentHeadroom_ADDR, CGShadingCreateRadialWithContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGShadingCreateRadialWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: MemorySegment, arg5: Double, arg6: MemorySegment, arg7: Boolean, arg8: Boolean): MemorySegment {
    try {
        return CGShadingCreateRadialWithContentHeadroom_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGShadingCreateRadialWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: CGPoint, arg3: Double, arg4: CGPoint, arg5: Double, arg6: MemorySegment, arg7: Boolean, arg8: Boolean): MemorySegment {
    return CGShadingCreateRadialWithContentHeadroom(arg0, arg1, arg2.segment, arg3, arg4.segment, arg5, arg6, arg7, arg8)
}

/**
 * {@snippet lang=c : CGShadingRetain typedef CGShadingRef = (Declared(CGShading))*(typedef CGShadingRef = (Declared(CGShading))*)
 */
private val CGShadingRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGShadingRetain_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingRetain").orElseThrow() }
private val CGShadingRetain_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingRetain_ADDR, CGShadingRetain_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGShadingRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGShadingRelease Void(typedef CGShadingRef = (Declared(CGShading))*)
 */
private val CGShadingRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGShadingRelease_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingRelease").orElseThrow() }
private val CGShadingRelease_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingRelease_ADDR, CGShadingRelease_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGShadingRelease(arg0: MemorySegment): Unit {
    try {
        CGShadingRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGShadingGetContentHeadroom Float(typedef CGShadingRef = (Declared(CGShading))*)
 */
private val CGShadingGetContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGShadingGetContentHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGShadingGetContentHeadroom").orElseThrow() }
private val CGShadingGetContentHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGShadingGetContentHeadroom_ADDR, CGShadingGetContentHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGShadingGetContentHeadroom(arg0: MemorySegment): Float {
    try {
        return CGShadingGetContentHeadroom_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaDefog typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaDefog_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaDefog_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGEXRToneMappingGammaDefog").orElseThrow().reinterpret(kCGEXRToneMappingGammaDefog_LAYOUT.byteSize()) }
private val kCGEXRToneMappingGammaDefog_VH: VarHandle by lazy { kCGEXRToneMappingGammaDefog_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGEXRToneMappingGammaDefog: MemorySegment
    get() = kCGEXRToneMappingGammaDefog_VH.get(kCGEXRToneMappingGammaDefog_SEGMENT, 0L) as MemorySegment
    set(value) = kCGEXRToneMappingGammaDefog_VH.set(kCGEXRToneMappingGammaDefog_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaExposure typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaExposure_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaExposure_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGEXRToneMappingGammaExposure").orElseThrow().reinterpret(kCGEXRToneMappingGammaExposure_LAYOUT.byteSize()) }
private val kCGEXRToneMappingGammaExposure_VH: VarHandle by lazy { kCGEXRToneMappingGammaExposure_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGEXRToneMappingGammaExposure: MemorySegment
    get() = kCGEXRToneMappingGammaExposure_VH.get(kCGEXRToneMappingGammaExposure_SEGMENT, 0L) as MemorySegment
    set(value) = kCGEXRToneMappingGammaExposure_VH.set(kCGEXRToneMappingGammaExposure_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaKneeLow typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaKneeLow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaKneeLow_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGEXRToneMappingGammaKneeLow").orElseThrow().reinterpret(kCGEXRToneMappingGammaKneeLow_LAYOUT.byteSize()) }
private val kCGEXRToneMappingGammaKneeLow_VH: VarHandle by lazy { kCGEXRToneMappingGammaKneeLow_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGEXRToneMappingGammaKneeLow: MemorySegment
    get() = kCGEXRToneMappingGammaKneeLow_VH.get(kCGEXRToneMappingGammaKneeLow_SEGMENT, 0L) as MemorySegment
    set(value) = kCGEXRToneMappingGammaKneeLow_VH.set(kCGEXRToneMappingGammaKneeLow_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaKneeHigh typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaKneeHigh_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaKneeHigh_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGEXRToneMappingGammaKneeHigh").orElseThrow().reinterpret(kCGEXRToneMappingGammaKneeHigh_LAYOUT.byteSize()) }
private val kCGEXRToneMappingGammaKneeHigh_VH: VarHandle by lazy { kCGEXRToneMappingGammaKneeHigh_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGEXRToneMappingGammaKneeHigh: MemorySegment
    get() = kCGEXRToneMappingGammaKneeHigh_VH.get(kCGEXRToneMappingGammaKneeHigh_SEGMENT, 0L) as MemorySegment
    set(value) = kCGEXRToneMappingGammaKneeHigh_VH.set(kCGEXRToneMappingGammaKneeHigh_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGEXRToneMappingGammaGetDefaultOptions typedef CFDictionaryRef = (Declared(__CFDictionary))*()
 */
private val CGEXRToneMappingGammaGetDefaultOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGEXRToneMappingGammaGetDefaultOptions_ADDR: MemorySegment by lazy { LOOKUP.find("CGEXRToneMappingGammaGetDefaultOptions").orElseThrow() }
private val CGEXRToneMappingGammaGetDefaultOptions_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGEXRToneMappingGammaGetDefaultOptions_ADDR, CGEXRToneMappingGammaGetDefaultOptions_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGEXRToneMappingGammaGetDefaultOptions(): MemorySegment {
    try {
        return CGEXRToneMappingGammaGetDefaultOptions_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGUse100nitsHLGOOTF typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGUse100nitsHLGOOTF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGUse100nitsHLGOOTF_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGUse100nitsHLGOOTF").orElseThrow().reinterpret(kCGUse100nitsHLGOOTF_LAYOUT.byteSize()) }
private val kCGUse100nitsHLGOOTF_VH: VarHandle by lazy { kCGUse100nitsHLGOOTF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGUse100nitsHLGOOTF: MemorySegment
    get() = kCGUse100nitsHLGOOTF_VH.get(kCGUse100nitsHLGOOTF_SEGMENT, 0L) as MemorySegment
    set(value) = kCGUse100nitsHLGOOTF_VH.set(kCGUse100nitsHLGOOTF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGUseBT1886ForCoreVideoGamma typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGUseBT1886ForCoreVideoGamma_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGUseBT1886ForCoreVideoGamma_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGUseBT1886ForCoreVideoGamma").orElseThrow().reinterpret(kCGUseBT1886ForCoreVideoGamma_LAYOUT.byteSize()) }
private val kCGUseBT1886ForCoreVideoGamma_VH: VarHandle by lazy { kCGUseBT1886ForCoreVideoGamma_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGUseBT1886ForCoreVideoGamma: MemorySegment
    get() = kCGUseBT1886ForCoreVideoGamma_VH.get(kCGUseBT1886ForCoreVideoGamma_SEGMENT, 0L) as MemorySegment
    set(value) = kCGUseBT1886ForCoreVideoGamma_VH.set(kCGUseBT1886ForCoreVideoGamma_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGSkipBoostToHDR typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGSkipBoostToHDR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGSkipBoostToHDR_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGSkipBoostToHDR").orElseThrow().reinterpret(kCGSkipBoostToHDR_LAYOUT.byteSize()) }
private val kCGSkipBoostToHDR_VH: VarHandle by lazy { kCGSkipBoostToHDR_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGSkipBoostToHDR: MemorySegment
    get() = kCGSkipBoostToHDR_VH.get(kCGSkipBoostToHDR_SEGMENT, 0L) as MemorySegment
    set(value) = kCGSkipBoostToHDR_VH.set(kCGSkipBoostToHDR_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGUseLegacyHDREcosystem typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGUseLegacyHDREcosystem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGUseLegacyHDREcosystem_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGUseLegacyHDREcosystem").orElseThrow().reinterpret(kCGUseLegacyHDREcosystem_LAYOUT.byteSize()) }
private val kCGUseLegacyHDREcosystem_VH: VarHandle by lazy { kCGUseLegacyHDREcosystem_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 1, introducedSubminor = -1)
var kCGUseLegacyHDREcosystem: MemorySegment
    get() = kCGUseLegacyHDREcosystem_VH.get(kCGUseLegacyHDREcosystem_SEGMENT, 0L) as MemorySegment
    set(value) = kCGUseLegacyHDREcosystem_VH.set(kCGUseLegacyHDREcosystem_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPreferredDynamicRange typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGPreferredDynamicRange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPreferredDynamicRange_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGPreferredDynamicRange").orElseThrow().reinterpret(kCGPreferredDynamicRange_LAYOUT.byteSize()) }
private val kCGPreferredDynamicRange_VH: VarHandle by lazy { kCGPreferredDynamicRange_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCGPreferredDynamicRange: MemorySegment
    get() = kCGPreferredDynamicRange_VH.get(kCGPreferredDynamicRange_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPreferredDynamicRange_VH.set(kCGPreferredDynamicRange_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDynamicRangeHigh typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGDynamicRangeHigh_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDynamicRangeHigh_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGDynamicRangeHigh").orElseThrow().reinterpret(kCGDynamicRangeHigh_LAYOUT.byteSize()) }
private val kCGDynamicRangeHigh_VH: VarHandle by lazy { kCGDynamicRangeHigh_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCGDynamicRangeHigh: MemorySegment
    get() = kCGDynamicRangeHigh_VH.get(kCGDynamicRangeHigh_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDynamicRangeHigh_VH.set(kCGDynamicRangeHigh_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDynamicRangeConstrained typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGDynamicRangeConstrained_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDynamicRangeConstrained_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGDynamicRangeConstrained").orElseThrow().reinterpret(kCGDynamicRangeConstrained_LAYOUT.byteSize()) }
private val kCGDynamicRangeConstrained_VH: VarHandle by lazy { kCGDynamicRangeConstrained_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCGDynamicRangeConstrained: MemorySegment
    get() = kCGDynamicRangeConstrained_VH.get(kCGDynamicRangeConstrained_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDynamicRangeConstrained_VH.set(kCGDynamicRangeConstrained_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDynamicRangeStandard typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGDynamicRangeStandard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDynamicRangeStandard_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGDynamicRangeStandard").orElseThrow().reinterpret(kCGDynamicRangeStandard_LAYOUT.byteSize()) }
private val kCGDynamicRangeStandard_VH: VarHandle by lazy { kCGDynamicRangeStandard_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCGDynamicRangeStandard: MemorySegment
    get() = kCGDynamicRangeStandard_VH.get(kCGDynamicRangeStandard_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDynamicRangeStandard_VH.set(kCGDynamicRangeStandard_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGContentAverageLightLevel typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGContentAverageLightLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGContentAverageLightLevel_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGContentAverageLightLevel").orElseThrow().reinterpret(kCGContentAverageLightLevel_LAYOUT.byteSize()) }
private val kCGContentAverageLightLevel_VH: VarHandle by lazy { kCGContentAverageLightLevel_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCGContentAverageLightLevel: MemorySegment
    get() = kCGContentAverageLightLevel_VH.get(kCGContentAverageLightLevel_SEGMENT, 0L) as MemorySegment
    set(value) = kCGContentAverageLightLevel_VH.set(kCGContentAverageLightLevel_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGContentAverageLightLevelNits typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGContentAverageLightLevelNits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGContentAverageLightLevelNits_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCGContentAverageLightLevelNits").orElseThrow().reinterpret(kCGContentAverageLightLevelNits_LAYOUT.byteSize()) }
private val kCGContentAverageLightLevelNits_VH: VarHandle by lazy { kCGContentAverageLightLevelNits_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCGContentAverageLightLevelNits: MemorySegment
    get() = kCGContentAverageLightLevelNits_VH.get(kCGContentAverageLightLevelNits_SEGMENT, 0L) as MemorySegment
    set(value) = kCGContentAverageLightLevelNits_VH.set(kCGContentAverageLightLevelNits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGContextGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGContextGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGContextGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetTypeID").orElseThrow() }
private val CGContextGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetTypeID_ADDR, CGContextGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGContextGetTypeID(): Long {
    try {
        return CGContextGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSaveGState Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextSaveGState_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextSaveGState_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSaveGState").orElseThrow() }
private val CGContextSaveGState_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSaveGState_ADDR, CGContextSaveGState_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSaveGState(arg0: MemorySegment): Unit {
    try {
        CGContextSaveGState_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextRestoreGState Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextRestoreGState_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextRestoreGState_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextRestoreGState").orElseThrow() }
private val CGContextRestoreGState_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextRestoreGState_ADDR, CGContextRestoreGState_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextRestoreGState(arg0: MemorySegment): Unit {
    try {
        CGContextRestoreGState_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextScaleCTM Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextScaleCTM_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextScaleCTM_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextScaleCTM").orElseThrow() }
private val CGContextScaleCTM_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextScaleCTM_ADDR, CGContextScaleCTM_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextScaleCTM(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextScaleCTM_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextTranslateCTM Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextTranslateCTM_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextTranslateCTM_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextTranslateCTM").orElseThrow() }
private val CGContextTranslateCTM_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextTranslateCTM_ADDR, CGContextTranslateCTM_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextTranslateCTM(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextTranslateCTM_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextRotateCTM Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextRotateCTM_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextRotateCTM_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextRotateCTM").orElseThrow() }
private val CGContextRotateCTM_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextRotateCTM_ADDR, CGContextRotateCTM_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextRotateCTM(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextRotateCTM_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextConcatCTM Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGContextConcatCTM_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGAffineTransform.layout)
private val CGContextConcatCTM_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextConcatCTM").orElseThrow() }
private val CGContextConcatCTM_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextConcatCTM_ADDR, CGContextConcatCTM_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextConcatCTM(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextConcatCTM_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextConcatCTM(arg0: MemorySegment, arg1: CGAffineTransform): Unit {
    CGContextConcatCTM(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextGetCTM typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetCTM_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.ADDRESS)
private val CGContextGetCTM_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetCTM").orElseThrow() }
private val CGContextGetCTM_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetCTM_ADDR, CGContextGetCTM_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetCTM(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetCTM_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetCTMTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGAffineTransform {
    return CGAffineTransform(CGContextGetCTM(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextSetLineWidth Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetLineWidth_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetLineWidth_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetLineWidth").orElseThrow() }
private val CGContextSetLineWidth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetLineWidth_ADDR, CGContextSetLineWidth_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetLineWidth(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextSetLineWidth_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetLineCap Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGLineCap = Declared(CGLineCap))
 */
private val CGContextSetLineCap_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextSetLineCap_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetLineCap").orElseThrow() }
private val CGContextSetLineCap_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetLineCap_ADDR, CGContextSetLineCap_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetLineCap(arg0: MemorySegment, arg1: CGLineCap): Unit {
    try {
        CGContextSetLineCap_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetLineJoin Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGLineJoin = Declared(CGLineJoin))
 */
private val CGContextSetLineJoin_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextSetLineJoin_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetLineJoin").orElseThrow() }
private val CGContextSetLineJoin_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetLineJoin_ADDR, CGContextSetLineJoin_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetLineJoin(arg0: MemorySegment, arg1: CGLineJoin): Unit {
    try {
        CGContextSetLineJoin_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetMiterLimit Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetMiterLimit_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetMiterLimit_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetMiterLimit").orElseThrow() }
private val CGContextSetMiterLimit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetMiterLimit_ADDR, CGContextSetMiterLimit_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetMiterLimit(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextSetMiterLimit_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetLineDash Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,(typedef CGFloat = Double)*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextSetLineDash_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextSetLineDash_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetLineDash").orElseThrow() }
private val CGContextSetLineDash_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetLineDash_ADDR, CGContextSetLineDash_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetLineDash(arg0: MemorySegment, arg1: Double, arg2: MemorySegment, arg3: Long): Unit {
    try {
        CGContextSetLineDash_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFlatness Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetFlatness_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetFlatness_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetFlatness").orElseThrow() }
private val CGContextSetFlatness_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetFlatness_ADDR, CGContextSetFlatness_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetFlatness(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextSetFlatness_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetAlpha Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetAlpha_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetAlpha_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetAlpha").orElseThrow() }
private val CGContextSetAlpha_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetAlpha_ADDR, CGContextSetAlpha_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetAlpha(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextSetAlpha_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetBlendMode Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGBlendMode = Declared(CGBlendMode))
 */
private val CGContextSetBlendMode_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextSetBlendMode_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetBlendMode").orElseThrow() }
private val CGContextSetBlendMode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetBlendMode_ADDR, CGContextSetBlendMode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextSetBlendMode(arg0: MemorySegment, arg1: CGBlendMode): Unit {
    try {
        CGContextSetBlendMode_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextBeginPath Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextBeginPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextBeginPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextBeginPath").orElseThrow() }
private val CGContextBeginPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextBeginPath_ADDR, CGContextBeginPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextBeginPath(arg0: MemorySegment): Unit {
    try {
        CGContextBeginPath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextMoveToPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextMoveToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextMoveToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextMoveToPoint").orElseThrow() }
private val CGContextMoveToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextMoveToPoint_ADDR, CGContextMoveToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextMoveToPoint(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextMoveToPoint_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddLineToPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextAddLineToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextAddLineToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddLineToPoint").orElseThrow() }
private val CGContextAddLineToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddLineToPoint_ADDR, CGContextAddLineToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddLineToPoint(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextAddLineToPoint_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddCurveToPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextAddCurveToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextAddCurveToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddCurveToPoint").orElseThrow() }
private val CGContextAddCurveToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddCurveToPoint_ADDR, CGContextAddCurveToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddCurveToPoint(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double): Unit {
    try {
        CGContextAddCurveToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddQuadCurveToPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextAddQuadCurveToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextAddQuadCurveToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddQuadCurveToPoint").orElseThrow() }
private val CGContextAddQuadCurveToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddQuadCurveToPoint_ADDR, CGContextAddQuadCurveToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddQuadCurveToPoint(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double): Unit {
    try {
        CGContextAddQuadCurveToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextClosePath Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextClosePath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextClosePath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextClosePath").orElseThrow() }
private val CGContextClosePath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextClosePath_ADDR, CGContextClosePath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClosePath(arg0: MemorySegment): Unit {
    try {
        CGContextClosePath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextAddRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextAddRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddRect").orElseThrow() }
private val CGContextAddRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddRect_ADDR, CGContextAddRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextAddRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextAddRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextAddRects Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextAddRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextAddRects_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddRects").orElseThrow() }
private val CGContextAddRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddRects_ADDR, CGContextAddRects_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddRects(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextAddRects_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddLines Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGPoint = Declared(CGPoint))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextAddLines_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextAddLines_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddLines").orElseThrow() }
private val CGContextAddLines_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddLines_ADDR, CGContextAddLines_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddLines(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextAddLines_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddEllipseInRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextAddEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextAddEllipseInRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddEllipseInRect").orElseThrow() }
private val CGContextAddEllipseInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddEllipseInRect_ADDR, CGContextAddEllipseInRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextAddEllipseInRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextAddEllipseInRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextAddEllipseInRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextAddEllipseInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextAddArc Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,Int)
 */
private val CGContextAddArc_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
private val CGContextAddArc_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddArc").orElseThrow() }
private val CGContextAddArc_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddArc_ADDR, CGContextAddArc_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddArc(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Int): Unit {
    try {
        CGContextAddArc_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddArcToPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextAddArcToPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextAddArcToPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddArcToPoint").orElseThrow() }
private val CGContextAddArcToPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddArcToPoint_ADDR, CGContextAddArcToPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextAddArcToPoint(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double): Unit {
    try {
        CGContextAddArcToPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextAddPath Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGContextAddPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextAddPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextAddPath").orElseThrow() }
private val CGContextAddPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextAddPath_ADDR, CGContextAddPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGContextAddPath(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextAddPath_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextReplacePathWithStrokedPath Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextReplacePathWithStrokedPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextReplacePathWithStrokedPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextReplacePathWithStrokedPath").orElseThrow() }
private val CGContextReplacePathWithStrokedPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextReplacePathWithStrokedPath_ADDR, CGContextReplacePathWithStrokedPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextReplacePathWithStrokedPath(arg0: MemorySegment): Unit {
    try {
        CGContextReplacePathWithStrokedPath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextIsPathEmpty Bool(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextIsPathEmpty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGContextIsPathEmpty_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextIsPathEmpty").orElseThrow() }
private val CGContextIsPathEmpty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextIsPathEmpty_ADDR, CGContextIsPathEmpty_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextIsPathEmpty(arg0: MemorySegment): Boolean {
    try {
        return CGContextIsPathEmpty_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextGetPathCurrentPoint typedef CGPoint = Declared(CGPoint)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetPathCurrentPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS)
private val CGContextGetPathCurrentPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetPathCurrentPoint").orElseThrow() }
private val CGContextGetPathCurrentPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetPathCurrentPoint_ADDR, CGContextGetPathCurrentPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetPathCurrentPoint(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetPathCurrentPoint_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetPathCurrentPointTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGContextGetPathCurrentPoint(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextGetPathBoundingBox typedef CGRect = Declared(CGRect)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetPathBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGContextGetPathBoundingBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetPathBoundingBox").orElseThrow() }
private val CGContextGetPathBoundingBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetPathBoundingBox_ADDR, CGContextGetPathBoundingBox_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetPathBoundingBox(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetPathBoundingBox_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetPathBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGContextGetPathBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextCopyPath typedef CGPathRef = (Declared(CGPath))*(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextCopyPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextCopyPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextCopyPath").orElseThrow() }
private val CGContextCopyPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextCopyPath_ADDR, CGContextCopyPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGContextCopyPath(arg0: MemorySegment): MemorySegment {
    try {
        return CGContextCopyPath_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextPathContainsPoint Bool(typedef CGContextRef = (Declared(CGContext))*,typedef CGPoint = Declared(CGPoint),typedef CGPathDrawingMode = Declared(CGPathDrawingMode))
 */
private val CGContextPathContainsPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_INT)
private val CGContextPathContainsPoint_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextPathContainsPoint").orElseThrow() }
private val CGContextPathContainsPoint_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextPathContainsPoint_ADDR, CGContextPathContainsPoint_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextPathContainsPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPathDrawingMode): Boolean {
    try {
        return CGContextPathContainsPoint_HANDLE.invokeExact(arg0, arg1, arg2.value.toInt()) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextPathContainsPoint(arg0: MemorySegment, arg1: CGPoint, arg2: CGPathDrawingMode): Boolean {
    return CGContextPathContainsPoint(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawPath Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPathDrawingMode = Declared(CGPathDrawingMode))
 */
private val CGContextDrawPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextDrawPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextDrawPath").orElseThrow() }
private val CGContextDrawPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextDrawPath_ADDR, CGContextDrawPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextDrawPath(arg0: MemorySegment, arg1: CGPathDrawingMode): Unit {
    try {
        CGContextDrawPath_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextFillPath Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextFillPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextFillPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextFillPath").orElseThrow() }
private val CGContextFillPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextFillPath_ADDR, CGContextFillPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextFillPath(arg0: MemorySegment): Unit {
    try {
        CGContextFillPath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextEOFillPath Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextEOFillPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextEOFillPath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextEOFillPath").orElseThrow() }
private val CGContextEOFillPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextEOFillPath_ADDR, CGContextEOFillPath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextEOFillPath(arg0: MemorySegment): Unit {
    try {
        CGContextEOFillPath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextStrokePath Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextStrokePath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextStrokePath_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextStrokePath").orElseThrow() }
private val CGContextStrokePath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextStrokePath_ADDR, CGContextStrokePath_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextStrokePath(arg0: MemorySegment): Unit {
    try {
        CGContextStrokePath_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextFillRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextFillRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextFillRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextFillRect").orElseThrow() }
private val CGContextFillRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextFillRect_ADDR, CGContextFillRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextFillRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextFillRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextFillRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextFillRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextFillRects Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextFillRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextFillRects_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextFillRects").orElseThrow() }
private val CGContextFillRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextFillRects_ADDR, CGContextFillRects_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextFillRects(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextFillRects_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextStrokeRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextStrokeRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextStrokeRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextStrokeRect").orElseThrow() }
private val CGContextStrokeRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextStrokeRect_ADDR, CGContextStrokeRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextStrokeRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextStrokeRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextStrokeRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextStrokeRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextStrokeRectWithWidth Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGFloat = Double)
 */
private val CGContextStrokeRectWithWidth_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_DOUBLE)
private val CGContextStrokeRectWithWidth_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextStrokeRectWithWidth").orElseThrow() }
private val CGContextStrokeRectWithWidth_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextStrokeRectWithWidth_ADDR, CGContextStrokeRectWithWidth_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextStrokeRectWithWidth(arg0: MemorySegment, arg1: MemorySegment, arg2: Double): Unit {
    try {
        CGContextStrokeRectWithWidth_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextStrokeRectWithWidth(arg0: MemorySegment, arg1: CGRect, arg2: Double): Unit {
    CGContextStrokeRectWithWidth(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextClearRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextClearRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextClearRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextClearRect").orElseThrow() }
private val CGContextClearRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextClearRect_ADDR, CGContextClearRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClearRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextClearRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClearRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextClearRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextFillEllipseInRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextFillEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextFillEllipseInRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextFillEllipseInRect").orElseThrow() }
private val CGContextFillEllipseInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextFillEllipseInRect_ADDR, CGContextFillEllipseInRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextFillEllipseInRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextFillEllipseInRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextFillEllipseInRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextFillEllipseInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextStrokeEllipseInRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextStrokeEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextStrokeEllipseInRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextStrokeEllipseInRect").orElseThrow() }
private val CGContextStrokeEllipseInRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextStrokeEllipseInRect_ADDR, CGContextStrokeEllipseInRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextStrokeEllipseInRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextStrokeEllipseInRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextStrokeEllipseInRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextStrokeEllipseInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextStrokeLineSegments Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGPoint = Declared(CGPoint))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextStrokeLineSegments_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextStrokeLineSegments_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextStrokeLineSegments").orElseThrow() }
private val CGContextStrokeLineSegments_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextStrokeLineSegments_ADDR, CGContextStrokeLineSegments_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextStrokeLineSegments(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextStrokeLineSegments_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextClip Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextClip_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextClip_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextClip").orElseThrow() }
private val CGContextClip_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextClip_ADDR, CGContextClip_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClip(arg0: MemorySegment): Unit {
    try {
        CGContextClip_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextEOClip Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextEOClip_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextEOClip_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextEOClip").orElseThrow() }
private val CGContextEOClip_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextEOClip_ADDR, CGContextEOClip_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextEOClip(arg0: MemorySegment): Unit {
    try {
        CGContextEOClip_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextResetClip Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextResetClip_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextResetClip_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextResetClip").orElseThrow() }
private val CGContextResetClip_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextResetClip_ADDR, CGContextResetClip_DESC) }

fun CGContextResetClip(arg0: MemorySegment): Unit {
    try {
        CGContextResetClip_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextClipToMask Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGContextClipToMask_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGContextClipToMask_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextClipToMask").orElseThrow() }
private val CGContextClipToMask_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextClipToMask_ADDR, CGContextClipToMask_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextClipToMask(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextClipToMask_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextClipToMask(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextClipToMask(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextGetClipBoundingBox typedef CGRect = Declared(CGRect)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetClipBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGContextGetClipBoundingBox_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetClipBoundingBox").orElseThrow() }
private val CGContextGetClipBoundingBox_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetClipBoundingBox_ADDR, CGContextGetClipBoundingBox_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGContextGetClipBoundingBox(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetClipBoundingBox_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGContextGetClipBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGContextGetClipBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextClipToRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextClipToRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextClipToRect_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextClipToRect").orElseThrow() }
private val CGContextClipToRect_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextClipToRect_ADDR, CGContextClipToRect_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClipToRect(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextClipToRect_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClipToRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextClipToRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextClipToRects Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextClipToRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextClipToRects_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextClipToRects").orElseThrow() }
private val CGContextClipToRects_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextClipToRects_ADDR, CGContextClipToRects_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextClipToRects(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextClipToRects_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFillColorWithColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGContextSetFillColorWithColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetFillColorWithColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetFillColorWithColor").orElseThrow() }
private val CGContextSetFillColorWithColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetFillColorWithColor_ADDR, CGContextSetFillColorWithColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGContextSetFillColorWithColor(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetFillColorWithColor_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetStrokeColorWithColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGContextSetStrokeColorWithColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetStrokeColorWithColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetStrokeColorWithColor").orElseThrow() }
private val CGContextSetStrokeColorWithColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetStrokeColorWithColor_ADDR, CGContextSetStrokeColorWithColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGContextSetStrokeColorWithColor(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetStrokeColorWithColor_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFillColorSpace Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGContextSetFillColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetFillColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetFillColorSpace").orElseThrow() }
private val CGContextSetFillColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetFillColorSpace_ADDR, CGContextSetFillColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetFillColorSpace(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetFillColorSpace_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetStrokeColorSpace Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGColorSpaceRef = (Declared(CGColorSpace))*)
 */
private val CGContextSetStrokeColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetStrokeColorSpace_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetStrokeColorSpace").orElseThrow() }
private val CGContextSetStrokeColorSpace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetStrokeColorSpace_ADDR, CGContextSetStrokeColorSpace_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetStrokeColorSpace(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetStrokeColorSpace_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFillColor Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGFloat = Double)*)
 */
private val CGContextSetFillColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetFillColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetFillColor").orElseThrow() }
private val CGContextSetFillColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetFillColor_ADDR, CGContextSetFillColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetFillColor(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetFillColor_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetStrokeColor Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGFloat = Double)*)
 */
private val CGContextSetStrokeColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetStrokeColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetStrokeColor").orElseThrow() }
private val CGContextSetStrokeColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetStrokeColor_ADDR, CGContextSetStrokeColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetStrokeColor(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetStrokeColor_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFillPattern Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPatternRef = (Declared(CGPattern))*,(typedef CGFloat = Double)*)
 */
private val CGContextSetFillPattern_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetFillPattern_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetFillPattern").orElseThrow() }
private val CGContextSetFillPattern_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetFillPattern_ADDR, CGContextSetFillPattern_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetFillPattern(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextSetFillPattern_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetStrokePattern Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPatternRef = (Declared(CGPattern))*,(typedef CGFloat = Double)*)
 */
private val CGContextSetStrokePattern_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetStrokePattern_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetStrokePattern").orElseThrow() }
private val CGContextSetStrokePattern_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetStrokePattern_ADDR, CGContextSetStrokePattern_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetStrokePattern(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextSetStrokePattern_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetPatternPhase Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGSize = Declared(CGSize))
 */
private val CGContextSetPatternPhase_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGSize.layout)
private val CGContextSetPatternPhase_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetPatternPhase").orElseThrow() }
private val CGContextSetPatternPhase_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetPatternPhase_ADDR, CGContextSetPatternPhase_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetPatternPhase(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetPatternPhase_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetPatternPhase(arg0: MemorySegment, arg1: CGSize): Unit {
    CGContextSetPatternPhase(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextSetGrayFillColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetGrayFillColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetGrayFillColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetGrayFillColor").orElseThrow() }
private val CGContextSetGrayFillColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetGrayFillColor_ADDR, CGContextSetGrayFillColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetGrayFillColor(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextSetGrayFillColor_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetGrayStrokeColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetGrayStrokeColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetGrayStrokeColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetGrayStrokeColor").orElseThrow() }
private val CGContextSetGrayStrokeColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetGrayStrokeColor_ADDR, CGContextSetGrayStrokeColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetGrayStrokeColor(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextSetGrayStrokeColor_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetRGBFillColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetRGBFillColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetRGBFillColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetRGBFillColor").orElseThrow() }
private val CGContextSetRGBFillColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetRGBFillColor_ADDR, CGContextSetRGBFillColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetRGBFillColor(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double): Unit {
    try {
        CGContextSetRGBFillColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetRGBStrokeColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetRGBStrokeColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetRGBStrokeColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetRGBStrokeColor").orElseThrow() }
private val CGContextSetRGBStrokeColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetRGBStrokeColor_ADDR, CGContextSetRGBStrokeColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetRGBStrokeColor(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double): Unit {
    try {
        CGContextSetRGBStrokeColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetCMYKFillColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetCMYKFillColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetCMYKFillColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetCMYKFillColor").orElseThrow() }
private val CGContextSetCMYKFillColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetCMYKFillColor_ADDR, CGContextSetCMYKFillColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetCMYKFillColor(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double): Unit {
    try {
        CGContextSetCMYKFillColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetCMYKStrokeColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetCMYKStrokeColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetCMYKStrokeColor_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetCMYKStrokeColor").orElseThrow() }
private val CGContextSetCMYKStrokeColor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetCMYKStrokeColor_ADDR, CGContextSetCMYKStrokeColor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetCMYKStrokeColor(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double): Unit {
    try {
        CGContextSetCMYKStrokeColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetRenderingIntent Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGColorRenderingIntent = Declared(CGColorRenderingIntent))
 */
private val CGContextSetRenderingIntent_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextSetRenderingIntent_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetRenderingIntent").orElseThrow() }
private val CGContextSetRenderingIntent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetRenderingIntent_ADDR, CGContextSetRenderingIntent_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetRenderingIntent(arg0: MemorySegment, arg1: CGColorRenderingIntent): Unit {
    try {
        CGContextSetRenderingIntent_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetEDRTargetHeadroom Bool(typedef CGContextRef = (Declared(CGContext))*,Float)
 */
private val CGContextSetEDRTargetHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
private val CGContextSetEDRTargetHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextSetEDRTargetHeadroom").orElseThrow() }
private val CGContextSetEDRTargetHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextSetEDRTargetHeadroom_ADDR, CGContextSetEDRTargetHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGContextSetEDRTargetHeadroom(arg0: MemorySegment, arg1: Float): Boolean {
    try {
        return CGContextSetEDRTargetHeadroom_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextGetEDRTargetHeadroom Float(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetEDRTargetHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGContextGetEDRTargetHeadroom_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetEDRTargetHeadroom").orElseThrow() }
private val CGContextGetEDRTargetHeadroom_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetEDRTargetHeadroom_ADDR, CGContextGetEDRTargetHeadroom_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetEDRTargetHeadroom(arg0: MemorySegment): Float {
    try {
        return CGContextGetEDRTargetHeadroom_HANDLE.invokeExact(arg0) as Float
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextDrawImage Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGContextDrawImage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGContextDrawImage_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextDrawImage").orElseThrow() }
private val CGContextDrawImage_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextDrawImage_ADDR, CGContextDrawImage_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextDrawImage(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextDrawImage_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGContextDrawImage(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextDrawImage(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawTiledImage Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGContextDrawTiledImage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGContextDrawTiledImage_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextDrawTiledImage").orElseThrow() }
private val CGContextDrawTiledImage_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextDrawTiledImage_ADDR, CGContextDrawTiledImage_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGContextDrawTiledImage(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextDrawTiledImage_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGContextDrawTiledImage(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextDrawTiledImage(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawImageApplyingToneMapping Bool(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGImageRef = (Declared(CGImage))*,typedef CGToneMapping = Declared(CGToneMapping),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGContextDrawImageApplyingToneMapping_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGContextDrawImageApplyingToneMapping_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextDrawImageApplyingToneMapping").orElseThrow() }
private val CGContextDrawImageApplyingToneMapping_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextDrawImageApplyingToneMapping_ADDR, CGContextDrawImageApplyingToneMapping_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGContextDrawImageApplyingToneMapping(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CGToneMapping, arg4: MemorySegment): Boolean {
    try {
        return CGContextDrawImageApplyingToneMapping_HANDLE.invokeExact(arg0, arg1, arg2, arg3.value.toInt(), arg4) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun CGContextDrawImageApplyingToneMapping(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment, arg3: CGToneMapping, arg4: MemorySegment): Boolean {
    return CGContextDrawImageApplyingToneMapping(arg0, arg1.segment, arg2, arg3, arg4)
}

/**
 * {@snippet lang=c : CGContextGetContentToneMappingInfo typedef CGContentToneMappingInfo = Declared(CGContentToneMappingInfo)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetContentToneMappingInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(CGContentToneMappingInfo.layout, ValueLayout.ADDRESS)
private val CGContextGetContentToneMappingInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CGContextGetContentToneMappingInfo").orElseThrow() }
private val CGContextGetContentToneMappingInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CGContextGetContentToneMappingInfo_ADDR, CGContextGetContentToneMappingInfo_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CGContextGetContentToneMappingInfo(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetContentToneMappingInfo_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
