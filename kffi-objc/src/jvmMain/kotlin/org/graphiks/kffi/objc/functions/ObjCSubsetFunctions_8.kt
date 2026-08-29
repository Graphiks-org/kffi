package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : kCGColorBlack typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorBlack_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorBlack_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGColorBlack").orElseThrow() }
private val kCGColorBlack_VH: VarHandle by lazy { kCGColorBlack_LAYOUT.varHandle() }

var kCGColorBlack: MemorySegment
    get() = kCGColorBlack_VH.get(kCGColorBlack_SEGMENT) as MemorySegment
    set(value) = kCGColorBlack_VH.set(kCGColorBlack_SEGMENT, value)

/**
 * {@snippet lang=c : kCGColorClear typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGColorClear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGColorClear_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGColorClear").orElseThrow() }
private val kCGColorClear_VH: VarHandle by lazy { kCGColorClear_LAYOUT.varHandle() }

var kCGColorClear: MemorySegment
    get() = kCGColorClear_VH.get(kCGColorClear_SEGMENT) as MemorySegment
    set(value) = kCGColorClear_VH.set(kCGColorClear_SEGMENT, value)

/**
 * {@snippet lang=c : CGFontGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGFontGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGFontGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetTypeID").orElseThrow()
private val CGFontGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetTypeID_ADDR, CGFontGetTypeID_DESC)

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
private val CGFontCreateWithPlatformFont_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCreateWithPlatformFont").orElseThrow()
private val CGFontCreateWithPlatformFont_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCreateWithPlatformFont_ADDR, CGFontCreateWithPlatformFont_DESC)

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
private val CGFontCreateWithDataProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCreateWithDataProvider").orElseThrow()
private val CGFontCreateWithDataProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCreateWithDataProvider_ADDR, CGFontCreateWithDataProvider_DESC)

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
private val CGFontCreateWithFontName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCreateWithFontName").orElseThrow()
private val CGFontCreateWithFontName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCreateWithFontName_ADDR, CGFontCreateWithFontName_DESC)

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
private val CGFontCreateCopyWithVariations_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCreateCopyWithVariations").orElseThrow()
private val CGFontCreateCopyWithVariations_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCreateCopyWithVariations_ADDR, CGFontCreateCopyWithVariations_DESC)

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
private val CGFontRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontRetain").orElseThrow()
private val CGFontRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontRetain_ADDR, CGFontRetain_DESC)

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
private val CGFontRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontRelease").orElseThrow()
private val CGFontRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontRelease_ADDR, CGFontRelease_DESC)

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
private val CGFontGetNumberOfGlyphs_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetNumberOfGlyphs").orElseThrow()
private val CGFontGetNumberOfGlyphs_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetNumberOfGlyphs_ADDR, CGFontGetNumberOfGlyphs_DESC)

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
private val CGFontGetUnitsPerEm_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetUnitsPerEm").orElseThrow()
private val CGFontGetUnitsPerEm_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetUnitsPerEm_ADDR, CGFontGetUnitsPerEm_DESC)

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
private val CGFontCopyPostScriptName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyPostScriptName").orElseThrow()
private val CGFontCopyPostScriptName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyPostScriptName_ADDR, CGFontCopyPostScriptName_DESC)

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
private val CGFontCopyFullName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyFullName").orElseThrow()
private val CGFontCopyFullName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyFullName_ADDR, CGFontCopyFullName_DESC)

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
private val CGFontGetAscent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetAscent").orElseThrow()
private val CGFontGetAscent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetAscent_ADDR, CGFontGetAscent_DESC)

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
private val CGFontGetDescent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetDescent").orElseThrow()
private val CGFontGetDescent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetDescent_ADDR, CGFontGetDescent_DESC)

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
private val CGFontGetLeading_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetLeading").orElseThrow()
private val CGFontGetLeading_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetLeading_ADDR, CGFontGetLeading_DESC)

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
private val CGFontGetCapHeight_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetCapHeight").orElseThrow()
private val CGFontGetCapHeight_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetCapHeight_ADDR, CGFontGetCapHeight_DESC)

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
private val CGFontGetXHeight_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetXHeight").orElseThrow()
private val CGFontGetXHeight_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetXHeight_ADDR, CGFontGetXHeight_DESC)

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
private val CGFontGetFontBBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetFontBBox").orElseThrow()
private val CGFontGetFontBBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetFontBBox_ADDR, CGFontGetFontBBox_DESC)

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

fun CGFontGetFontBBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGFontGetFontBBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGFontGetItalicAngle typedef CGFloat = Double(typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGFontGetItalicAngle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGFontGetItalicAngle_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetItalicAngle").orElseThrow()
private val CGFontGetItalicAngle_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetItalicAngle_ADDR, CGFontGetItalicAngle_DESC)

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
private val CGFontGetStemV_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetStemV").orElseThrow()
private val CGFontGetStemV_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetStemV_ADDR, CGFontGetStemV_DESC)

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
private val CGFontCopyVariationAxes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyVariationAxes").orElseThrow()
private val CGFontCopyVariationAxes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyVariationAxes_ADDR, CGFontCopyVariationAxes_DESC)

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
private val CGFontCopyVariations_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyVariations").orElseThrow()
private val CGFontCopyVariations_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyVariations_ADDR, CGFontCopyVariations_DESC)

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
private val CGFontGetGlyphAdvances_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetGlyphAdvances").orElseThrow()
private val CGFontGetGlyphAdvances_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetGlyphAdvances_ADDR, CGFontGetGlyphAdvances_DESC)

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
private val CGFontGetGlyphBBoxes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetGlyphBBoxes").orElseThrow()
private val CGFontGetGlyphBBoxes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetGlyphBBoxes_ADDR, CGFontGetGlyphBBoxes_DESC)

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
private val CGFontGetGlyphWithGlyphName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontGetGlyphWithGlyphName").orElseThrow()
private val CGFontGetGlyphWithGlyphName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontGetGlyphWithGlyphName_ADDR, CGFontGetGlyphWithGlyphName_DESC)

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
private val CGFontCopyGlyphNameForGlyph_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyGlyphNameForGlyph").orElseThrow()
private val CGFontCopyGlyphNameForGlyph_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyGlyphNameForGlyph_ADDR, CGFontCopyGlyphNameForGlyph_DESC)

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
private val CGFontCanCreatePostScriptSubset_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCanCreatePostScriptSubset").orElseThrow()
private val CGFontCanCreatePostScriptSubset_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCanCreatePostScriptSubset_ADDR, CGFontCanCreatePostScriptSubset_DESC)

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
private val CGFontCreatePostScriptSubset_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCreatePostScriptSubset").orElseThrow()
private val CGFontCreatePostScriptSubset_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCreatePostScriptSubset_ADDR, CGFontCreatePostScriptSubset_DESC)

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
private val CGFontCreatePostScriptEncoding_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCreatePostScriptEncoding").orElseThrow()
private val CGFontCreatePostScriptEncoding_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCreatePostScriptEncoding_ADDR, CGFontCreatePostScriptEncoding_DESC)

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
private val CGFontCopyTableTags_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyTableTags").orElseThrow()
private val CGFontCopyTableTags_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyTableTags_ADDR, CGFontCopyTableTags_DESC)

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
private val CGFontCopyTableForTag_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFontCopyTableForTag").orElseThrow()
private val CGFontCopyTableForTag_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFontCopyTableForTag_ADDR, CGFontCopyTableForTag_DESC)

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
private val kCGFontVariationAxisName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGFontVariationAxisName").orElseThrow() }
private val kCGFontVariationAxisName_VH: VarHandle by lazy { kCGFontVariationAxisName_LAYOUT.varHandle() }

var kCGFontVariationAxisName: MemorySegment
    get() = kCGFontVariationAxisName_VH.get(kCGFontVariationAxisName_SEGMENT) as MemorySegment
    set(value) = kCGFontVariationAxisName_VH.set(kCGFontVariationAxisName_SEGMENT, value)

/**
 * {@snippet lang=c : kCGFontVariationAxisMinValue typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisMinValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisMinValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGFontVariationAxisMinValue").orElseThrow() }
private val kCGFontVariationAxisMinValue_VH: VarHandle by lazy { kCGFontVariationAxisMinValue_LAYOUT.varHandle() }

var kCGFontVariationAxisMinValue: MemorySegment
    get() = kCGFontVariationAxisMinValue_VH.get(kCGFontVariationAxisMinValue_SEGMENT) as MemorySegment
    set(value) = kCGFontVariationAxisMinValue_VH.set(kCGFontVariationAxisMinValue_SEGMENT, value)

/**
 * {@snippet lang=c : kCGFontVariationAxisMaxValue typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisMaxValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisMaxValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGFontVariationAxisMaxValue").orElseThrow() }
private val kCGFontVariationAxisMaxValue_VH: VarHandle by lazy { kCGFontVariationAxisMaxValue_LAYOUT.varHandle() }

var kCGFontVariationAxisMaxValue: MemorySegment
    get() = kCGFontVariationAxisMaxValue_VH.get(kCGFontVariationAxisMaxValue_SEGMENT) as MemorySegment
    set(value) = kCGFontVariationAxisMaxValue_VH.set(kCGFontVariationAxisMaxValue_SEGMENT, value)

/**
 * {@snippet lang=c : kCGFontVariationAxisDefaultValue typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGFontVariationAxisDefaultValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGFontVariationAxisDefaultValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGFontVariationAxisDefaultValue").orElseThrow() }
private val kCGFontVariationAxisDefaultValue_VH: VarHandle by lazy { kCGFontVariationAxisDefaultValue_LAYOUT.varHandle() }

var kCGFontVariationAxisDefaultValue: MemorySegment
    get() = kCGFontVariationAxisDefaultValue_VH.get(kCGFontVariationAxisDefaultValue_SEGMENT) as MemorySegment
    set(value) = kCGFontVariationAxisDefaultValue_VH.set(kCGFontVariationAxisDefaultValue_SEGMENT, value)

/**
 * {@snippet lang=c : CGGradientGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGGradientGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGGradientGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientGetTypeID").orElseThrow()
private val CGGradientGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientGetTypeID_ADDR, CGGradientGetTypeID_DESC)

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
private val CGGradientCreateWithColorComponents_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientCreateWithColorComponents").orElseThrow()
private val CGGradientCreateWithColorComponents_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientCreateWithColorComponents_ADDR, CGGradientCreateWithColorComponents_DESC)

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
private val CGGradientCreateWithContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientCreateWithContentHeadroom").orElseThrow()
private val CGGradientCreateWithContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientCreateWithContentHeadroom_ADDR, CGGradientCreateWithContentHeadroom_DESC)

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
private val CGGradientCreateWithColors_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientCreateWithColors").orElseThrow()
private val CGGradientCreateWithColors_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientCreateWithColors_ADDR, CGGradientCreateWithColors_DESC)

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
private val CGGradientRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientRetain").orElseThrow()
private val CGGradientRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientRetain_ADDR, CGGradientRetain_DESC)

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
private val CGGradientRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientRelease").orElseThrow()
private val CGGradientRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientRelease_ADDR, CGGradientRelease_DESC)

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
private val CGGradientGetContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGradientGetContentHeadroom").orElseThrow()
private val CGGradientGetContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGradientGetContentHeadroom_ADDR, CGGradientGetContentHeadroom_DESC)

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
private val CGImageGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetTypeID").orElseThrow()
private val CGImageGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetTypeID_ADDR, CGImageGetTypeID_DESC)

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
private val CGImageCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreate").orElseThrow()
private val CGImageCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreate_ADDR, CGImageCreate_DESC)

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
private val CGImageMaskCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageMaskCreate").orElseThrow()
private val CGImageMaskCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageMaskCreate_ADDR, CGImageMaskCreate_DESC)

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
private val CGImageCreateCopy_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateCopy").orElseThrow()
private val CGImageCreateCopy_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateCopy_ADDR, CGImageCreateCopy_DESC)

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
private val CGImageCreateWithJPEGDataProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateWithJPEGDataProvider").orElseThrow()
private val CGImageCreateWithJPEGDataProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateWithJPEGDataProvider_ADDR, CGImageCreateWithJPEGDataProvider_DESC)

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
private val CGImageCreateWithPNGDataProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateWithPNGDataProvider").orElseThrow()
private val CGImageCreateWithPNGDataProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateWithPNGDataProvider_ADDR, CGImageCreateWithPNGDataProvider_DESC)

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
private val CGImageCreateWithImageInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateWithImageInRect").orElseThrow()
private val CGImageCreateWithImageInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateWithImageInRect_ADDR, CGImageCreateWithImageInRect_DESC)

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

fun CGImageCreateWithImageInRect(arg0: MemorySegment, arg1: CGRect): MemorySegment {
    return CGImageCreateWithImageInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGImageCreateWithMask typedef CGImageRef = (Declared(CGImage))*(typedef CGImageRef = (Declared(CGImage))*,typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageCreateWithMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGImageCreateWithMask_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateWithMask").orElseThrow()
private val CGImageCreateWithMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateWithMask_ADDR, CGImageCreateWithMask_DESC)

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
private val CGImageCreateWithMaskingColors_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateWithMaskingColors").orElseThrow()
private val CGImageCreateWithMaskingColors_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateWithMaskingColors_ADDR, CGImageCreateWithMaskingColors_DESC)

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
private val CGImageCreateCopyWithColorSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateCopyWithColorSpace").orElseThrow()
private val CGImageCreateCopyWithColorSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithColorSpace_ADDR, CGImageCreateCopyWithColorSpace_DESC)

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
private val CGImageCreateWithContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateWithContentHeadroom").orElseThrow()
private val CGImageCreateWithContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateWithContentHeadroom_ADDR, CGImageCreateWithContentHeadroom_DESC)

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
private val CGImageCreateCopyWithContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateCopyWithContentHeadroom").orElseThrow()
private val CGImageCreateCopyWithContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithContentHeadroom_ADDR, CGImageCreateCopyWithContentHeadroom_DESC)

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
private val kCGDefaultHDRImageContentHeadroom_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDefaultHDRImageContentHeadroom").orElseThrow() }
private val kCGDefaultHDRImageContentHeadroom_VH: VarHandle by lazy { kCGDefaultHDRImageContentHeadroom_LAYOUT.varHandle() }

var kCGDefaultHDRImageContentHeadroom: Float
    get() = kCGDefaultHDRImageContentHeadroom_VH.get(kCGDefaultHDRImageContentHeadroom_SEGMENT) as Float
    set(value) = kCGDefaultHDRImageContentHeadroom_VH.set(kCGDefaultHDRImageContentHeadroom_SEGMENT, value)

/**
 * {@snippet lang=c : CGImageGetContentHeadroom Float(typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGImageGetContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGImageGetContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetContentHeadroom").orElseThrow()
private val CGImageGetContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetContentHeadroom_ADDR, CGImageGetContentHeadroom_DESC)

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
private val CGImageCalculateContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCalculateContentHeadroom").orElseThrow()
private val CGImageCalculateContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCalculateContentHeadroom_ADDR, CGImageCalculateContentHeadroom_DESC)

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
private val CGImageGetContentAverageLightLevel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetContentAverageLightLevel").orElseThrow()
private val CGImageGetContentAverageLightLevel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetContentAverageLightLevel_ADDR, CGImageGetContentAverageLightLevel_DESC)

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
private val CGImageCalculateContentAverageLightLevel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCalculateContentAverageLightLevel").orElseThrow()
private val CGImageCalculateContentAverageLightLevel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCalculateContentAverageLightLevel_ADDR, CGImageCalculateContentAverageLightLevel_DESC)

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
private val CGImageCreateCopyWithContentAverageLightLevel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateCopyWithContentAverageLightLevel").orElseThrow()
private val CGImageCreateCopyWithContentAverageLightLevel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithContentAverageLightLevel_ADDR, CGImageCreateCopyWithContentAverageLightLevel_DESC)

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
private val CGImageCreateCopyWithCalculatedHDRStats_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageCreateCopyWithCalculatedHDRStats").orElseThrow()
private val CGImageCreateCopyWithCalculatedHDRStats_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageCreateCopyWithCalculatedHDRStats_ADDR, CGImageCreateCopyWithCalculatedHDRStats_DESC)

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
private val CGImageRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageRetain").orElseThrow()
private val CGImageRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageRetain_ADDR, CGImageRetain_DESC)

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
private val CGImageRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageRelease").orElseThrow()
private val CGImageRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageRelease_ADDR, CGImageRelease_DESC)

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
private val CGImageIsMask_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageIsMask").orElseThrow()
private val CGImageIsMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageIsMask_ADDR, CGImageIsMask_DESC)

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
private val CGImageGetWidth_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetWidth").orElseThrow()
private val CGImageGetWidth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetWidth_ADDR, CGImageGetWidth_DESC)

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
private val CGImageGetHeight_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetHeight").orElseThrow()
private val CGImageGetHeight_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetHeight_ADDR, CGImageGetHeight_DESC)

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
private val CGImageGetBitsPerComponent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetBitsPerComponent").orElseThrow()
private val CGImageGetBitsPerComponent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetBitsPerComponent_ADDR, CGImageGetBitsPerComponent_DESC)

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
private val CGImageGetBitsPerPixel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetBitsPerPixel").orElseThrow()
private val CGImageGetBitsPerPixel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetBitsPerPixel_ADDR, CGImageGetBitsPerPixel_DESC)

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
private val CGImageGetBytesPerRow_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetBytesPerRow").orElseThrow()
private val CGImageGetBytesPerRow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetBytesPerRow_ADDR, CGImageGetBytesPerRow_DESC)

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
private val CGImageGetColorSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetColorSpace").orElseThrow()
private val CGImageGetColorSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetColorSpace_ADDR, CGImageGetColorSpace_DESC)

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
private val CGImageGetAlphaInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetAlphaInfo").orElseThrow()
private val CGImageGetAlphaInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetAlphaInfo_ADDR, CGImageGetAlphaInfo_DESC)

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
private val CGImageGetDataProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetDataProvider").orElseThrow()
private val CGImageGetDataProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetDataProvider_ADDR, CGImageGetDataProvider_DESC)

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
private val CGImageGetDecode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetDecode").orElseThrow()
private val CGImageGetDecode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetDecode_ADDR, CGImageGetDecode_DESC)

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
private val CGImageGetShouldInterpolate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetShouldInterpolate").orElseThrow()
private val CGImageGetShouldInterpolate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetShouldInterpolate_ADDR, CGImageGetShouldInterpolate_DESC)

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
private val CGImageGetRenderingIntent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetRenderingIntent").orElseThrow()
private val CGImageGetRenderingIntent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetRenderingIntent_ADDR, CGImageGetRenderingIntent_DESC)

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
private val CGImageGetBitmapInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetBitmapInfo").orElseThrow()
private val CGImageGetBitmapInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetBitmapInfo_ADDR, CGImageGetBitmapInfo_DESC)

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
private val CGImageGetByteOrderInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetByteOrderInfo").orElseThrow()
private val CGImageGetByteOrderInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetByteOrderInfo_ADDR, CGImageGetByteOrderInfo_DESC)

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
private val CGImageGetPixelFormatInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetPixelFormatInfo").orElseThrow()
private val CGImageGetPixelFormatInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetPixelFormatInfo_ADDR, CGImageGetPixelFormatInfo_DESC)

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
private val CGImageShouldToneMap_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageShouldToneMap").orElseThrow()
private val CGImageShouldToneMap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageShouldToneMap_ADDR, CGImageShouldToneMap_DESC)

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
private val CGImageContainsImageSpecificToneMappingMetadata_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageContainsImageSpecificToneMappingMetadata").orElseThrow()
private val CGImageContainsImageSpecificToneMappingMetadata_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageContainsImageSpecificToneMappingMetadata_ADDR, CGImageContainsImageSpecificToneMappingMetadata_DESC)

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
private val CGImageGetUTType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGImageGetUTType").orElseThrow()
private val CGImageGetUTType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGImageGetUTType_ADDR, CGImageGetUTType_DESC)

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
private val CGPathGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathGetTypeID").orElseThrow()
private val CGPathGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathGetTypeID_ADDR, CGPathGetTypeID_DESC)

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
private val CGPathCreateMutable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateMutable").orElseThrow()
private val CGPathCreateMutable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateMutable_ADDR, CGPathCreateMutable_DESC)

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
private val CGPathCreateCopy_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopy").orElseThrow()
private val CGPathCreateCopy_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopy_ADDR, CGPathCreateCopy_DESC)

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
private val CGPathCreateCopyByTransformingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByTransformingPath").orElseThrow()
private val CGPathCreateCopyByTransformingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByTransformingPath_ADDR, CGPathCreateCopyByTransformingPath_DESC)

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
private val CGPathCreateMutableCopy_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateMutableCopy").orElseThrow()
private val CGPathCreateMutableCopy_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateMutableCopy_ADDR, CGPathCreateMutableCopy_DESC)

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
private val CGPathCreateMutableCopyByTransformingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateMutableCopyByTransformingPath").orElseThrow()
private val CGPathCreateMutableCopyByTransformingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateMutableCopyByTransformingPath_ADDR, CGPathCreateMutableCopyByTransformingPath_DESC)

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
private val CGPathCreateWithRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateWithRect").orElseThrow()
private val CGPathCreateWithRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateWithRect_ADDR, CGPathCreateWithRect_DESC)

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

fun CGPathCreateWithRect(arg0: CGRect, arg1: MemorySegment): MemorySegment {
    return CGPathCreateWithRect(arg0.segment, arg1)
}

/**
 * {@snippet lang=c : CGPathCreateWithEllipseInRect typedef CGPathRef = (Declared(CGPath))*(typedef CGRect = Declared(CGRect),(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateWithEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGPathCreateWithEllipseInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateWithEllipseInRect").orElseThrow()
private val CGPathCreateWithEllipseInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateWithEllipseInRect_ADDR, CGPathCreateWithEllipseInRect_DESC)

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

fun CGPathCreateWithEllipseInRect(arg0: CGRect, arg1: MemorySegment): MemorySegment {
    return CGPathCreateWithEllipseInRect(arg0.segment, arg1)
}

/**
 * {@snippet lang=c : CGPathCreateWithRoundedRect typedef CGPathRef = (Declared(CGPath))*(typedef CGRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double,(typedef CGAffineTransform = Declared(CGAffineTransform))*)
 */
private val CGPathCreateWithRoundedRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGPathCreateWithRoundedRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateWithRoundedRect").orElseThrow()
private val CGPathCreateWithRoundedRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateWithRoundedRect_ADDR, CGPathCreateWithRoundedRect_DESC)

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

fun CGPathCreateWithRoundedRect(arg0: CGRect, arg1: Double, arg2: Double, arg3: MemorySegment): MemorySegment {
    return CGPathCreateWithRoundedRect(arg0.segment, arg1, arg2, arg3)
}

/**
 * {@snippet lang=c : CGPathAddRoundedRect Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGRect = Declared(CGRect),typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddRoundedRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddRoundedRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddRoundedRect").orElseThrow()
private val CGPathAddRoundedRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddRoundedRect_ADDR, CGPathAddRoundedRect_DESC)

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

fun CGPathAddRoundedRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect, arg3: Double, arg4: Double): Unit {
    CGPathAddRoundedRect(arg0, arg1, arg2.segment, arg3, arg4)
}

/**
 * {@snippet lang=c : CGPathCreateCopyByDashingPath typedef CGPathRef = (Declared(CGPath))*(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,(typedef CGFloat = Double)*,typedef size_t = UNSIGNED = Long)
 */
private val CGPathCreateCopyByDashingPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPathCreateCopyByDashingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByDashingPath").orElseThrow()
private val CGPathCreateCopyByDashingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByDashingPath_ADDR, CGPathCreateCopyByDashingPath_DESC)

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
private val CGPathCreateCopyByStrokingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByStrokingPath").orElseThrow()
private val CGPathCreateCopyByStrokingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByStrokingPath_ADDR, CGPathCreateCopyByStrokingPath_DESC)

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
private val CGPathRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathRetain").orElseThrow()
private val CGPathRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathRetain_ADDR, CGPathRetain_DESC)

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
private val CGPathRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathRelease").orElseThrow()
private val CGPathRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathRelease_ADDR, CGPathRelease_DESC)

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
private val CGPathEqualToPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathEqualToPath").orElseThrow()
private val CGPathEqualToPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathEqualToPath_ADDR, CGPathEqualToPath_DESC)

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
private val CGPathMoveToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathMoveToPoint").orElseThrow()
private val CGPathMoveToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathMoveToPoint_ADDR, CGPathMoveToPoint_DESC)

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
private val CGPathAddLineToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddLineToPoint").orElseThrow()
private val CGPathAddLineToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddLineToPoint_ADDR, CGPathAddLineToPoint_DESC)

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
private val CGPathAddQuadCurveToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddQuadCurveToPoint").orElseThrow()
private val CGPathAddQuadCurveToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddQuadCurveToPoint_ADDR, CGPathAddQuadCurveToPoint_DESC)

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
private val CGPathAddCurveToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddCurveToPoint").orElseThrow()
private val CGPathAddCurveToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddCurveToPoint_ADDR, CGPathAddCurveToPoint_DESC)

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
private val CGPathCloseSubpath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCloseSubpath").orElseThrow()
private val CGPathCloseSubpath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCloseSubpath_ADDR, CGPathCloseSubpath_DESC)

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
private val CGPathAddRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddRect").orElseThrow()
private val CGPathAddRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddRect_ADDR, CGPathAddRect_DESC)

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

fun CGPathAddRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect): Unit {
    CGPathAddRect(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : CGPathAddRects Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGPathAddRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGPathAddRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddRects").orElseThrow()
private val CGPathAddRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddRects_ADDR, CGPathAddRects_DESC)

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
private val CGPathAddLines_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddLines").orElseThrow()
private val CGPathAddLines_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddLines_ADDR, CGPathAddLines_DESC)

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
private val CGPathAddEllipseInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddEllipseInRect").orElseThrow()
private val CGPathAddEllipseInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddEllipseInRect_ADDR, CGPathAddEllipseInRect_DESC)

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

fun CGPathAddEllipseInRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect): Unit {
    CGPathAddEllipseInRect(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : CGPathAddRelativeArc Void(typedef CGMutablePathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGPathAddRelativeArc_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGPathAddRelativeArc_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddRelativeArc").orElseThrow()
private val CGPathAddRelativeArc_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddRelativeArc_ADDR, CGPathAddRelativeArc_DESC)

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
private val CGPathAddArc_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddArc").orElseThrow()
private val CGPathAddArc_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddArc_ADDR, CGPathAddArc_DESC)

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
private val CGPathAddArcToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddArcToPoint").orElseThrow()
private val CGPathAddArcToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddArcToPoint_ADDR, CGPathAddArcToPoint_DESC)

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
private val CGPathAddPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathAddPath").orElseThrow()
private val CGPathAddPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathAddPath_ADDR, CGPathAddPath_DESC)

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
private val CGPathIsEmpty_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathIsEmpty").orElseThrow()
private val CGPathIsEmpty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathIsEmpty_ADDR, CGPathIsEmpty_DESC)

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
private val CGPathIsRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathIsRect").orElseThrow()
private val CGPathIsRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathIsRect_ADDR, CGPathIsRect_DESC)

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
private val CGPathGetCurrentPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathGetCurrentPoint").orElseThrow()
private val CGPathGetCurrentPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathGetCurrentPoint_ADDR, CGPathGetCurrentPoint_DESC)

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

fun CGPathGetCurrentPointTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGPathGetCurrentPoint(allocator, arg0))
}

/**
 * {@snippet lang=c : CGPathGetBoundingBox typedef CGRect = Declared(CGRect)(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathGetBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGPathGetBoundingBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathGetBoundingBox").orElseThrow()
private val CGPathGetBoundingBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathGetBoundingBox_ADDR, CGPathGetBoundingBox_DESC)

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

fun CGPathGetBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGPathGetBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGPathGetPathBoundingBox typedef CGRect = Declared(CGRect)(typedef CGPathRef = (Declared(CGPath))*)
 */
private val CGPathGetPathBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGPathGetPathBoundingBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathGetPathBoundingBox").orElseThrow()
private val CGPathGetPathBoundingBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathGetPathBoundingBox_ADDR, CGPathGetPathBoundingBox_DESC)

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

fun CGPathGetPathBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGPathGetPathBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGPathContainsPoint Bool(typedef CGPathRef = (Declared(CGPath))*,(typedef CGAffineTransform = Declared(CGAffineTransform))*,typedef CGPoint = Declared(CGPoint),Bool)
 */
private val CGPathContainsPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_BOOLEAN)
private val CGPathContainsPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathContainsPoint").orElseThrow()
private val CGPathContainsPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathContainsPoint_ADDR, CGPathContainsPoint_DESC)

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

fun CGPathContainsPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPoint, arg3: Boolean): Boolean {
    return CGPathContainsPoint(arg0, arg1, arg2.segment, arg3)
}

/**
 * {@snippet lang=c : CGPathApply Void(typedef CGPathRef = (Declared(CGPath))*,(Void)*,typedef CGPathApplierFunction = (Void((Void)*,(Declared(CGPathElement))*))*)
 */
private val CGPathApply_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPathApply_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathApply").orElseThrow()
private val CGPathApply_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathApply_ADDR, CGPathApply_DESC)

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
private val CGPathApplyWithBlock_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathApplyWithBlock").orElseThrow()
private val CGPathApplyWithBlock_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathApplyWithBlock_ADDR, CGPathApplyWithBlock_DESC)

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
private val CGPathCreateCopyByNormalizing_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByNormalizing").orElseThrow()
private val CGPathCreateCopyByNormalizing_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByNormalizing_ADDR, CGPathCreateCopyByNormalizing_DESC)

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
private val CGPathCreateCopyByUnioningPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByUnioningPath").orElseThrow()
private val CGPathCreateCopyByUnioningPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByUnioningPath_ADDR, CGPathCreateCopyByUnioningPath_DESC)

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
private val CGPathCreateCopyByIntersectingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByIntersectingPath").orElseThrow()
private val CGPathCreateCopyByIntersectingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByIntersectingPath_ADDR, CGPathCreateCopyByIntersectingPath_DESC)

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
private val CGPathCreateCopyBySubtractingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyBySubtractingPath").orElseThrow()
private val CGPathCreateCopyBySubtractingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyBySubtractingPath_ADDR, CGPathCreateCopyBySubtractingPath_DESC)

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
private val CGPathCreateCopyBySymmetricDifferenceOfPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyBySymmetricDifferenceOfPath").orElseThrow()
private val CGPathCreateCopyBySymmetricDifferenceOfPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyBySymmetricDifferenceOfPath_ADDR, CGPathCreateCopyBySymmetricDifferenceOfPath_DESC)

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
private val CGPathCreateCopyOfLineBySubtractingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyOfLineBySubtractingPath").orElseThrow()
private val CGPathCreateCopyOfLineBySubtractingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyOfLineBySubtractingPath_ADDR, CGPathCreateCopyOfLineBySubtractingPath_DESC)

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
private val CGPathCreateCopyOfLineByIntersectingPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyOfLineByIntersectingPath").orElseThrow()
private val CGPathCreateCopyOfLineByIntersectingPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyOfLineByIntersectingPath_ADDR, CGPathCreateCopyOfLineByIntersectingPath_DESC)

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
private val CGPathCreateSeparateComponents_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateSeparateComponents").orElseThrow()
private val CGPathCreateSeparateComponents_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateSeparateComponents_ADDR, CGPathCreateSeparateComponents_DESC)

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
private val CGPathCreateCopyByFlattening_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathCreateCopyByFlattening").orElseThrow()
private val CGPathCreateCopyByFlattening_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathCreateCopyByFlattening_ADDR, CGPathCreateCopyByFlattening_DESC)

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
private val CGPathIntersectsPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPathIntersectsPath").orElseThrow()
private val CGPathIntersectsPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPathIntersectsPath_ADDR, CGPathIntersectsPath_DESC)

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
private val CGPDFObjectGetType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFObjectGetType").orElseThrow()
private val CGPDFObjectGetType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFObjectGetType_ADDR, CGPDFObjectGetType_DESC)

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
private val CGPDFObjectGetValue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFObjectGetValue").orElseThrow()
private val CGPDFObjectGetValue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFObjectGetValue_ADDR, CGPDFObjectGetValue_DESC)

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
private val CGPDFStreamGetDictionary_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFStreamGetDictionary").orElseThrow()
private val CGPDFStreamGetDictionary_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFStreamGetDictionary_ADDR, CGPDFStreamGetDictionary_DESC)

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
private val CGPDFStreamCopyData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFStreamCopyData").orElseThrow()
private val CGPDFStreamCopyData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFStreamCopyData_ADDR, CGPDFStreamCopyData_DESC)

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
private val CGPDFStringGetLength_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFStringGetLength").orElseThrow()
private val CGPDFStringGetLength_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFStringGetLength_ADDR, CGPDFStringGetLength_DESC)

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
private val CGPDFStringGetBytePtr_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFStringGetBytePtr").orElseThrow()
private val CGPDFStringGetBytePtr_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFStringGetBytePtr_ADDR, CGPDFStringGetBytePtr_DESC)

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
private val CGPDFStringCopyTextString_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFStringCopyTextString").orElseThrow()
private val CGPDFStringCopyTextString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFStringCopyTextString_ADDR, CGPDFStringCopyTextString_DESC)

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
private val CGPDFStringCopyDate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFStringCopyDate").orElseThrow()
private val CGPDFStringCopyDate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFStringCopyDate_ADDR, CGPDFStringCopyDate_DESC)

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
private val CGPDFArrayGetCount_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetCount").orElseThrow()
private val CGPDFArrayGetCount_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetCount_ADDR, CGPDFArrayGetCount_DESC)

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
private val CGPDFArrayGetObject_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetObject").orElseThrow()
private val CGPDFArrayGetObject_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetObject_ADDR, CGPDFArrayGetObject_DESC)

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
private val CGPDFArrayGetNull_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetNull").orElseThrow()
private val CGPDFArrayGetNull_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetNull_ADDR, CGPDFArrayGetNull_DESC)

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
private val CGPDFArrayGetBoolean_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetBoolean").orElseThrow()
private val CGPDFArrayGetBoolean_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetBoolean_ADDR, CGPDFArrayGetBoolean_DESC)

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
private val CGPDFArrayGetInteger_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetInteger").orElseThrow()
private val CGPDFArrayGetInteger_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetInteger_ADDR, CGPDFArrayGetInteger_DESC)

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
private val CGPDFArrayGetNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetNumber").orElseThrow()
private val CGPDFArrayGetNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetNumber_ADDR, CGPDFArrayGetNumber_DESC)

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
private val CGPDFArrayGetName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetName").orElseThrow()
private val CGPDFArrayGetName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetName_ADDR, CGPDFArrayGetName_DESC)

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
private val CGPDFArrayGetString_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetString").orElseThrow()
private val CGPDFArrayGetString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetString_ADDR, CGPDFArrayGetString_DESC)

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
private val CGPDFArrayGetArray_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetArray").orElseThrow()
private val CGPDFArrayGetArray_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetArray_ADDR, CGPDFArrayGetArray_DESC)

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
private val CGPDFArrayGetDictionary_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetDictionary").orElseThrow()
private val CGPDFArrayGetDictionary_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetDictionary_ADDR, CGPDFArrayGetDictionary_DESC)

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
private val CGPDFArrayGetStream_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayGetStream").orElseThrow()
private val CGPDFArrayGetStream_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayGetStream_ADDR, CGPDFArrayGetStream_DESC)

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
private val CGPDFArrayApplyBlock_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFArrayApplyBlock").orElseThrow()
private val CGPDFArrayApplyBlock_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFArrayApplyBlock_ADDR, CGPDFArrayApplyBlock_DESC)

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
private val CGPDFDictionaryGetCount_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetCount").orElseThrow()
private val CGPDFDictionaryGetCount_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetCount_ADDR, CGPDFDictionaryGetCount_DESC)

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
private val CGPDFDictionaryGetObject_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetObject").orElseThrow()
private val CGPDFDictionaryGetObject_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetObject_ADDR, CGPDFDictionaryGetObject_DESC)

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
private val CGPDFDictionaryGetBoolean_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetBoolean").orElseThrow()
private val CGPDFDictionaryGetBoolean_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetBoolean_ADDR, CGPDFDictionaryGetBoolean_DESC)

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
private val CGPDFDictionaryGetInteger_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetInteger").orElseThrow()
private val CGPDFDictionaryGetInteger_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetInteger_ADDR, CGPDFDictionaryGetInteger_DESC)

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
private val CGPDFDictionaryGetNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetNumber").orElseThrow()
private val CGPDFDictionaryGetNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetNumber_ADDR, CGPDFDictionaryGetNumber_DESC)

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
private val CGPDFDictionaryGetName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetName").orElseThrow()
private val CGPDFDictionaryGetName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetName_ADDR, CGPDFDictionaryGetName_DESC)

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
private val CGPDFDictionaryGetString_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetString").orElseThrow()
private val CGPDFDictionaryGetString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetString_ADDR, CGPDFDictionaryGetString_DESC)

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
private val CGPDFDictionaryGetArray_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetArray").orElseThrow()
private val CGPDFDictionaryGetArray_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetArray_ADDR, CGPDFDictionaryGetArray_DESC)

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
private val CGPDFDictionaryGetDictionary_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetDictionary").orElseThrow()
private val CGPDFDictionaryGetDictionary_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetDictionary_ADDR, CGPDFDictionaryGetDictionary_DESC)

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
private val CGPDFDictionaryGetStream_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryGetStream").orElseThrow()
private val CGPDFDictionaryGetStream_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryGetStream_ADDR, CGPDFDictionaryGetStream_DESC)

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
private val CGPDFDictionaryApplyFunction_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryApplyFunction").orElseThrow()
private val CGPDFDictionaryApplyFunction_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryApplyFunction_ADDR, CGPDFDictionaryApplyFunction_DESC)

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
private val CGPDFDictionaryApplyBlock_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDictionaryApplyBlock").orElseThrow()
private val CGPDFDictionaryApplyBlock_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDictionaryApplyBlock_ADDR, CGPDFDictionaryApplyBlock_DESC)

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
private val CGPDFPageRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageRetain").orElseThrow()
private val CGPDFPageRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageRetain_ADDR, CGPDFPageRetain_DESC)

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
private val CGPDFPageRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageRelease").orElseThrow()
private val CGPDFPageRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageRelease_ADDR, CGPDFPageRelease_DESC)

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
private val CGPDFPageGetDocument_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetDocument").orElseThrow()
private val CGPDFPageGetDocument_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetDocument_ADDR, CGPDFPageGetDocument_DESC)

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
private val CGPDFPageGetPageNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetPageNumber").orElseThrow()
private val CGPDFPageGetPageNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetPageNumber_ADDR, CGPDFPageGetPageNumber_DESC)

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
private val CGPDFPageGetBoxRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetBoxRect").orElseThrow()
private val CGPDFPageGetBoxRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetBoxRect_ADDR, CGPDFPageGetBoxRect_DESC)

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

fun CGPDFPageGetBoxRectTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPDFBox): CGRect {
    return CGRect(CGPDFPageGetBoxRect(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFPageGetRotationAngle Int(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageGetRotationAngle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGPDFPageGetRotationAngle_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetRotationAngle").orElseThrow()
private val CGPDFPageGetRotationAngle_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetRotationAngle_ADDR, CGPDFPageGetRotationAngle_DESC)

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
private val CGPDFPageGetDrawingTransform_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetDrawingTransform").orElseThrow()
private val CGPDFPageGetDrawingTransform_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetDrawingTransform_ADDR, CGPDFPageGetDrawingTransform_DESC)

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

fun CGPDFPageGetDrawingTransform(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPDFBox, arg2: CGRect, arg3: Int, arg4: Boolean): CGAffineTransform {
    return CGAffineTransform(CGPDFPageGetDrawingTransform(allocator, arg0, arg1, arg2.segment, arg3, arg4))
}

/**
 * {@snippet lang=c : CGPDFPageGetDictionary typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFPageGetDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFPageGetDictionary_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetDictionary").orElseThrow()
private val CGPDFPageGetDictionary_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetDictionary_ADDR, CGPDFPageGetDictionary_DESC)

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
private val CGPDFPageGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFPageGetTypeID").orElseThrow()
private val CGPDFPageGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFPageGetTypeID_ADDR, CGPDFPageGetTypeID_DESC)

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
private val kCGPDFOutlineTitle_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFOutlineTitle").orElseThrow() }
private val kCGPDFOutlineTitle_VH: VarHandle by lazy { kCGPDFOutlineTitle_LAYOUT.varHandle() }

var kCGPDFOutlineTitle: MemorySegment
    get() = kCGPDFOutlineTitle_VH.get(kCGPDFOutlineTitle_SEGMENT) as MemorySegment
    set(value) = kCGPDFOutlineTitle_VH.set(kCGPDFOutlineTitle_SEGMENT, value)

/**
 * {@snippet lang=c : kCGPDFOutlineChildren typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineChildren_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineChildren_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFOutlineChildren").orElseThrow() }
private val kCGPDFOutlineChildren_VH: VarHandle by lazy { kCGPDFOutlineChildren_LAYOUT.varHandle() }

var kCGPDFOutlineChildren: MemorySegment
    get() = kCGPDFOutlineChildren_VH.get(kCGPDFOutlineChildren_SEGMENT) as MemorySegment
    set(value) = kCGPDFOutlineChildren_VH.set(kCGPDFOutlineChildren_SEGMENT, value)

/**
 * {@snippet lang=c : kCGPDFOutlineDestination typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineDestination_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineDestination_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFOutlineDestination").orElseThrow() }
private val kCGPDFOutlineDestination_VH: VarHandle by lazy { kCGPDFOutlineDestination_LAYOUT.varHandle() }

var kCGPDFOutlineDestination: MemorySegment
    get() = kCGPDFOutlineDestination_VH.get(kCGPDFOutlineDestination_SEGMENT) as MemorySegment
    set(value) = kCGPDFOutlineDestination_VH.set(kCGPDFOutlineDestination_SEGMENT, value)

/**
 * {@snippet lang=c : kCGPDFOutlineDestinationRect typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFOutlineDestinationRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFOutlineDestinationRect_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFOutlineDestinationRect").orElseThrow() }
private val kCGPDFOutlineDestinationRect_VH: VarHandle by lazy { kCGPDFOutlineDestinationRect_LAYOUT.varHandle() }

var kCGPDFOutlineDestinationRect: MemorySegment
    get() = kCGPDFOutlineDestinationRect_VH.get(kCGPDFOutlineDestinationRect_SEGMENT) as MemorySegment
    set(value) = kCGPDFOutlineDestinationRect_VH.set(kCGPDFOutlineDestinationRect_SEGMENT, value)

/**
 * {@snippet lang=c : CGPDFDocumentCreateWithProvider typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*(typedef CGDataProviderRef = (Declared(CGDataProvider))*)
 */
private val CGPDFDocumentCreateWithProvider_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFDocumentCreateWithProvider_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentCreateWithProvider").orElseThrow()
private val CGPDFDocumentCreateWithProvider_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentCreateWithProvider_ADDR, CGPDFDocumentCreateWithProvider_DESC)

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
private val CGPDFDocumentCreateWithURL_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentCreateWithURL").orElseThrow()
private val CGPDFDocumentCreateWithURL_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentCreateWithURL_ADDR, CGPDFDocumentCreateWithURL_DESC)

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
private val CGPDFDocumentRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentRetain").orElseThrow()
private val CGPDFDocumentRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentRetain_ADDR, CGPDFDocumentRetain_DESC)

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
private val CGPDFDocumentRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentRelease").orElseThrow()
private val CGPDFDocumentRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentRelease_ADDR, CGPDFDocumentRelease_DESC)

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
private val CGPDFDocumentGetVersion_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetVersion").orElseThrow()
private val CGPDFDocumentGetVersion_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetVersion_ADDR, CGPDFDocumentGetVersion_DESC)

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
private val CGPDFDocumentIsEncrypted_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentIsEncrypted").orElseThrow()
private val CGPDFDocumentIsEncrypted_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentIsEncrypted_ADDR, CGPDFDocumentIsEncrypted_DESC)

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
private val CGPDFDocumentUnlockWithPassword_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentUnlockWithPassword").orElseThrow()
private val CGPDFDocumentUnlockWithPassword_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentUnlockWithPassword_ADDR, CGPDFDocumentUnlockWithPassword_DESC)

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
private val CGPDFDocumentIsUnlocked_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentIsUnlocked").orElseThrow()
private val CGPDFDocumentIsUnlocked_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentIsUnlocked_ADDR, CGPDFDocumentIsUnlocked_DESC)

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
private val CGPDFDocumentAllowsPrinting_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentAllowsPrinting").orElseThrow()
private val CGPDFDocumentAllowsPrinting_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentAllowsPrinting_ADDR, CGPDFDocumentAllowsPrinting_DESC)

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
private val CGPDFDocumentAllowsCopying_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentAllowsCopying").orElseThrow()
private val CGPDFDocumentAllowsCopying_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentAllowsCopying_ADDR, CGPDFDocumentAllowsCopying_DESC)

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
private val CGPDFDocumentGetNumberOfPages_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetNumberOfPages").orElseThrow()
private val CGPDFDocumentGetNumberOfPages_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetNumberOfPages_ADDR, CGPDFDocumentGetNumberOfPages_DESC)

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
private val CGPDFDocumentGetPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetPage").orElseThrow()
private val CGPDFDocumentGetPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetPage_ADDR, CGPDFDocumentGetPage_DESC)

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
private val CGPDFDocumentGetCatalog_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetCatalog").orElseThrow()
private val CGPDFDocumentGetCatalog_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetCatalog_ADDR, CGPDFDocumentGetCatalog_DESC)

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
private val CGPDFDocumentGetInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetInfo").orElseThrow()
private val CGPDFDocumentGetInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetInfo_ADDR, CGPDFDocumentGetInfo_DESC)

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
private val CGPDFDocumentGetID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetID").orElseThrow()
private val CGPDFDocumentGetID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetID_ADDR, CGPDFDocumentGetID_DESC)

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
private val CGPDFDocumentGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetTypeID").orElseThrow()
private val CGPDFDocumentGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetTypeID_ADDR, CGPDFDocumentGetTypeID_DESC)

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
private val CGPDFDocumentGetOutline_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetOutline").orElseThrow()
private val CGPDFDocumentGetOutline_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetOutline_ADDR, CGPDFDocumentGetOutline_DESC)

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
private val CGPDFDocumentGetAccessPermissions_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetAccessPermissions").orElseThrow()
private val CGPDFDocumentGetAccessPermissions_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetAccessPermissions_ADDR, CGPDFDocumentGetAccessPermissions_DESC)

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
private val CGPDFDocumentGetMediaBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetMediaBox").orElseThrow()
private val CGPDFDocumentGetMediaBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetMediaBox_ADDR, CGPDFDocumentGetMediaBox_DESC)

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

fun CGPDFDocumentGetMediaBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetMediaBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetCropBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetCropBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetCropBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetCropBox").orElseThrow()
private val CGPDFDocumentGetCropBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetCropBox_ADDR, CGPDFDocumentGetCropBox_DESC)

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

fun CGPDFDocumentGetCropBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetCropBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetBleedBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetBleedBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetBleedBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetBleedBox").orElseThrow()
private val CGPDFDocumentGetBleedBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetBleedBox_ADDR, CGPDFDocumentGetBleedBox_DESC)

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

fun CGPDFDocumentGetBleedBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetBleedBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetTrimBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetTrimBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetTrimBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetTrimBox").orElseThrow()
private val CGPDFDocumentGetTrimBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetTrimBox_ADDR, CGPDFDocumentGetTrimBox_DESC)

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

fun CGPDFDocumentGetTrimBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetTrimBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetArtBox typedef CGRect = Declared(CGRect)(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetArtBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetArtBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetArtBox").orElseThrow()
private val CGPDFDocumentGetArtBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetArtBox_ADDR, CGPDFDocumentGetArtBox_DESC)

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

fun CGPDFDocumentGetArtBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Int): CGRect {
    return CGRect(CGPDFDocumentGetArtBox(allocator, arg0, arg1))
}

/**
 * {@snippet lang=c : CGPDFDocumentGetRotationAngle Int(typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGPDFDocumentGetRotationAngle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFDocumentGetRotationAngle_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFDocumentGetRotationAngle").orElseThrow()
private val CGPDFDocumentGetRotationAngle_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFDocumentGetRotationAngle_ADDR, CGPDFDocumentGetRotationAngle_DESC)

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
private val CGFunctionGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFunctionGetTypeID").orElseThrow()
private val CGFunctionGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFunctionGetTypeID_ADDR, CGFunctionGetTypeID_DESC)

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
private val CGFunctionCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFunctionCreate").orElseThrow()
private val CGFunctionCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFunctionCreate_ADDR, CGFunctionCreate_DESC)

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
private val CGFunctionRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFunctionRetain").orElseThrow()
private val CGFunctionRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFunctionRetain_ADDR, CGFunctionRetain_DESC)

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
private val CGFunctionRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGFunctionRelease").orElseThrow()
private val CGFunctionRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGFunctionRelease_ADDR, CGFunctionRelease_DESC)

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
private val CGShadingGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingGetTypeID").orElseThrow()
private val CGShadingGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingGetTypeID_ADDR, CGShadingGetTypeID_DESC)

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
private val CGShadingCreateAxial_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingCreateAxial").orElseThrow()
private val CGShadingCreateAxial_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingCreateAxial_ADDR, CGShadingCreateAxial_DESC)

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

fun CGShadingCreateAxial(arg0: MemorySegment, arg1: CGPoint, arg2: CGPoint, arg3: MemorySegment, arg4: Boolean, arg5: Boolean): MemorySegment {
    return CGShadingCreateAxial(arg0, arg1.segment, arg2.segment, arg3, arg4, arg5)
}

/**
 * {@snippet lang=c : CGShadingCreateAxialWithContentHeadroom typedef CGShadingRef = (Declared(CGShading))*(Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGPoint = Declared(CGPoint),typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateAxialWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, CGPoint.layout, CGPoint.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateAxialWithContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingCreateAxialWithContentHeadroom").orElseThrow()
private val CGShadingCreateAxialWithContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingCreateAxialWithContentHeadroom_ADDR, CGShadingCreateAxialWithContentHeadroom_DESC)

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

fun CGShadingCreateAxialWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: CGPoint, arg3: CGPoint, arg4: MemorySegment, arg5: Boolean, arg6: Boolean): MemorySegment {
    return CGShadingCreateAxialWithContentHeadroom(arg0, arg1, arg2.segment, arg3.segment, arg4, arg5, arg6)
}

/**
 * {@snippet lang=c : CGShadingCreateRadial typedef CGShadingRef = (Declared(CGShading))*(typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateRadial_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_DOUBLE, CGPoint.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateRadial_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingCreateRadial").orElseThrow()
private val CGShadingCreateRadial_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingCreateRadial_ADDR, CGShadingCreateRadial_DESC)

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

fun CGShadingCreateRadial(arg0: MemorySegment, arg1: CGPoint, arg2: Double, arg3: CGPoint, arg4: Double, arg5: MemorySegment, arg6: Boolean, arg7: Boolean): MemorySegment {
    return CGShadingCreateRadial(arg0, arg1.segment, arg2, arg3.segment, arg4, arg5, arg6, arg7)
}

/**
 * {@snippet lang=c : CGShadingCreateRadialWithContentHeadroom typedef CGShadingRef = (Declared(CGShading))*(Float,typedef CGColorSpaceRef = (Declared(CGColorSpace))*,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGFunctionRef = (Declared(CGFunction))*,Bool,Bool)
 */
private val CGShadingCreateRadialWithContentHeadroom_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_DOUBLE, CGPoint.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN)
private val CGShadingCreateRadialWithContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingCreateRadialWithContentHeadroom").orElseThrow()
private val CGShadingCreateRadialWithContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingCreateRadialWithContentHeadroom_ADDR, CGShadingCreateRadialWithContentHeadroom_DESC)

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

fun CGShadingCreateRadialWithContentHeadroom(arg0: Float, arg1: MemorySegment, arg2: CGPoint, arg3: Double, arg4: CGPoint, arg5: Double, arg6: MemorySegment, arg7: Boolean, arg8: Boolean): MemorySegment {
    return CGShadingCreateRadialWithContentHeadroom(arg0, arg1, arg2.segment, arg3, arg4.segment, arg5, arg6, arg7, arg8)
}

/**
 * {@snippet lang=c : CGShadingRetain typedef CGShadingRef = (Declared(CGShading))*(typedef CGShadingRef = (Declared(CGShading))*)
 */
private val CGShadingRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGShadingRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingRetain").orElseThrow()
private val CGShadingRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingRetain_ADDR, CGShadingRetain_DESC)

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
private val CGShadingRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingRelease").orElseThrow()
private val CGShadingRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingRelease_ADDR, CGShadingRelease_DESC)

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
private val CGShadingGetContentHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShadingGetContentHeadroom").orElseThrow()
private val CGShadingGetContentHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShadingGetContentHeadroom_ADDR, CGShadingGetContentHeadroom_DESC)

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
private val kCGEXRToneMappingGammaDefog_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGEXRToneMappingGammaDefog").orElseThrow() }
private val kCGEXRToneMappingGammaDefog_VH: VarHandle by lazy { kCGEXRToneMappingGammaDefog_LAYOUT.varHandle() }

var kCGEXRToneMappingGammaDefog: MemorySegment
    get() = kCGEXRToneMappingGammaDefog_VH.get(kCGEXRToneMappingGammaDefog_SEGMENT) as MemorySegment
    set(value) = kCGEXRToneMappingGammaDefog_VH.set(kCGEXRToneMappingGammaDefog_SEGMENT, value)

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaExposure typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaExposure_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaExposure_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGEXRToneMappingGammaExposure").orElseThrow() }
private val kCGEXRToneMappingGammaExposure_VH: VarHandle by lazy { kCGEXRToneMappingGammaExposure_LAYOUT.varHandle() }

var kCGEXRToneMappingGammaExposure: MemorySegment
    get() = kCGEXRToneMappingGammaExposure_VH.get(kCGEXRToneMappingGammaExposure_SEGMENT) as MemorySegment
    set(value) = kCGEXRToneMappingGammaExposure_VH.set(kCGEXRToneMappingGammaExposure_SEGMENT, value)

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaKneeLow typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaKneeLow_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaKneeLow_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGEXRToneMappingGammaKneeLow").orElseThrow() }
private val kCGEXRToneMappingGammaKneeLow_VH: VarHandle by lazy { kCGEXRToneMappingGammaKneeLow_LAYOUT.varHandle() }

var kCGEXRToneMappingGammaKneeLow: MemorySegment
    get() = kCGEXRToneMappingGammaKneeLow_VH.get(kCGEXRToneMappingGammaKneeLow_SEGMENT) as MemorySegment
    set(value) = kCGEXRToneMappingGammaKneeLow_VH.set(kCGEXRToneMappingGammaKneeLow_SEGMENT, value)

/**
 * {@snippet lang=c : kCGEXRToneMappingGammaKneeHigh typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGEXRToneMappingGammaKneeHigh_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGEXRToneMappingGammaKneeHigh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGEXRToneMappingGammaKneeHigh").orElseThrow() }
private val kCGEXRToneMappingGammaKneeHigh_VH: VarHandle by lazy { kCGEXRToneMappingGammaKneeHigh_LAYOUT.varHandle() }

var kCGEXRToneMappingGammaKneeHigh: MemorySegment
    get() = kCGEXRToneMappingGammaKneeHigh_VH.get(kCGEXRToneMappingGammaKneeHigh_SEGMENT) as MemorySegment
    set(value) = kCGEXRToneMappingGammaKneeHigh_VH.set(kCGEXRToneMappingGammaKneeHigh_SEGMENT, value)

/**
 * {@snippet lang=c : CGEXRToneMappingGammaGetDefaultOptions typedef CFDictionaryRef = (Declared(__CFDictionary))*()
 */
private val CGEXRToneMappingGammaGetDefaultOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGEXRToneMappingGammaGetDefaultOptions_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEXRToneMappingGammaGetDefaultOptions").orElseThrow()
private val CGEXRToneMappingGammaGetDefaultOptions_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEXRToneMappingGammaGetDefaultOptions_ADDR, CGEXRToneMappingGammaGetDefaultOptions_DESC)

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
private val kCGUse100nitsHLGOOTF_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGUse100nitsHLGOOTF").orElseThrow() }
private val kCGUse100nitsHLGOOTF_VH: VarHandle by lazy { kCGUse100nitsHLGOOTF_LAYOUT.varHandle() }

var kCGUse100nitsHLGOOTF: MemorySegment
    get() = kCGUse100nitsHLGOOTF_VH.get(kCGUse100nitsHLGOOTF_SEGMENT) as MemorySegment
    set(value) = kCGUse100nitsHLGOOTF_VH.set(kCGUse100nitsHLGOOTF_SEGMENT, value)

/**
 * {@snippet lang=c : kCGUseBT1886ForCoreVideoGamma typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGUseBT1886ForCoreVideoGamma_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGUseBT1886ForCoreVideoGamma_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGUseBT1886ForCoreVideoGamma").orElseThrow() }
private val kCGUseBT1886ForCoreVideoGamma_VH: VarHandle by lazy { kCGUseBT1886ForCoreVideoGamma_LAYOUT.varHandle() }

var kCGUseBT1886ForCoreVideoGamma: MemorySegment
    get() = kCGUseBT1886ForCoreVideoGamma_VH.get(kCGUseBT1886ForCoreVideoGamma_SEGMENT) as MemorySegment
    set(value) = kCGUseBT1886ForCoreVideoGamma_VH.set(kCGUseBT1886ForCoreVideoGamma_SEGMENT, value)

/**
 * {@snippet lang=c : kCGSkipBoostToHDR typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGSkipBoostToHDR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGSkipBoostToHDR_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGSkipBoostToHDR").orElseThrow() }
private val kCGSkipBoostToHDR_VH: VarHandle by lazy { kCGSkipBoostToHDR_LAYOUT.varHandle() }

var kCGSkipBoostToHDR: MemorySegment
    get() = kCGSkipBoostToHDR_VH.get(kCGSkipBoostToHDR_SEGMENT) as MemorySegment
    set(value) = kCGSkipBoostToHDR_VH.set(kCGSkipBoostToHDR_SEGMENT, value)

/**
 * {@snippet lang=c : kCGUseLegacyHDREcosystem typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGUseLegacyHDREcosystem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGUseLegacyHDREcosystem_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGUseLegacyHDREcosystem").orElseThrow() }
private val kCGUseLegacyHDREcosystem_VH: VarHandle by lazy { kCGUseLegacyHDREcosystem_LAYOUT.varHandle() }

var kCGUseLegacyHDREcosystem: MemorySegment
    get() = kCGUseLegacyHDREcosystem_VH.get(kCGUseLegacyHDREcosystem_SEGMENT) as MemorySegment
    set(value) = kCGUseLegacyHDREcosystem_VH.set(kCGUseLegacyHDREcosystem_SEGMENT, value)

/**
 * {@snippet lang=c : kCGPreferredDynamicRange typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGPreferredDynamicRange_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPreferredDynamicRange_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPreferredDynamicRange").orElseThrow() }
private val kCGPreferredDynamicRange_VH: VarHandle by lazy { kCGPreferredDynamicRange_LAYOUT.varHandle() }

var kCGPreferredDynamicRange: MemorySegment
    get() = kCGPreferredDynamicRange_VH.get(kCGPreferredDynamicRange_SEGMENT) as MemorySegment
    set(value) = kCGPreferredDynamicRange_VH.set(kCGPreferredDynamicRange_SEGMENT, value)

/**
 * {@snippet lang=c : kCGDynamicRangeHigh typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGDynamicRangeHigh_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDynamicRangeHigh_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDynamicRangeHigh").orElseThrow() }
private val kCGDynamicRangeHigh_VH: VarHandle by lazy { kCGDynamicRangeHigh_LAYOUT.varHandle() }

var kCGDynamicRangeHigh: MemorySegment
    get() = kCGDynamicRangeHigh_VH.get(kCGDynamicRangeHigh_SEGMENT) as MemorySegment
    set(value) = kCGDynamicRangeHigh_VH.set(kCGDynamicRangeHigh_SEGMENT, value)

/**
 * {@snippet lang=c : kCGDynamicRangeConstrained typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGDynamicRangeConstrained_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDynamicRangeConstrained_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDynamicRangeConstrained").orElseThrow() }
private val kCGDynamicRangeConstrained_VH: VarHandle by lazy { kCGDynamicRangeConstrained_LAYOUT.varHandle() }

var kCGDynamicRangeConstrained: MemorySegment
    get() = kCGDynamicRangeConstrained_VH.get(kCGDynamicRangeConstrained_SEGMENT) as MemorySegment
    set(value) = kCGDynamicRangeConstrained_VH.set(kCGDynamicRangeConstrained_SEGMENT, value)

/**
 * {@snippet lang=c : kCGDynamicRangeStandard typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGDynamicRangeStandard_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDynamicRangeStandard_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDynamicRangeStandard").orElseThrow() }
private val kCGDynamicRangeStandard_VH: VarHandle by lazy { kCGDynamicRangeStandard_LAYOUT.varHandle() }

var kCGDynamicRangeStandard: MemorySegment
    get() = kCGDynamicRangeStandard_VH.get(kCGDynamicRangeStandard_SEGMENT) as MemorySegment
    set(value) = kCGDynamicRangeStandard_VH.set(kCGDynamicRangeStandard_SEGMENT, value)

/**
 * {@snippet lang=c : kCGContentAverageLightLevel typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGContentAverageLightLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGContentAverageLightLevel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGContentAverageLightLevel").orElseThrow() }
private val kCGContentAverageLightLevel_VH: VarHandle by lazy { kCGContentAverageLightLevel_LAYOUT.varHandle() }

var kCGContentAverageLightLevel: MemorySegment
    get() = kCGContentAverageLightLevel_VH.get(kCGContentAverageLightLevel_SEGMENT) as MemorySegment
    set(value) = kCGContentAverageLightLevel_VH.set(kCGContentAverageLightLevel_SEGMENT, value)

/**
 * {@snippet lang=c : kCGContentAverageLightLevelNits typedef CFStringRef = (Declared(__CFString))*
 */
private val kCGContentAverageLightLevelNits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGContentAverageLightLevelNits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGContentAverageLightLevelNits").orElseThrow() }
private val kCGContentAverageLightLevelNits_VH: VarHandle by lazy { kCGContentAverageLightLevelNits_LAYOUT.varHandle() }

var kCGContentAverageLightLevelNits: MemorySegment
    get() = kCGContentAverageLightLevelNits_VH.get(kCGContentAverageLightLevelNits_SEGMENT) as MemorySegment
    set(value) = kCGContentAverageLightLevelNits_VH.set(kCGContentAverageLightLevelNits_SEGMENT, value)

/**
 * {@snippet lang=c : CGContextGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGContextGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGContextGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetTypeID").orElseThrow()
private val CGContextGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetTypeID_ADDR, CGContextGetTypeID_DESC)

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
private val CGContextSaveGState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSaveGState").orElseThrow()
private val CGContextSaveGState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSaveGState_ADDR, CGContextSaveGState_DESC)

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
private val CGContextRestoreGState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextRestoreGState").orElseThrow()
private val CGContextRestoreGState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextRestoreGState_ADDR, CGContextRestoreGState_DESC)

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
private val CGContextScaleCTM_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextScaleCTM").orElseThrow()
private val CGContextScaleCTM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextScaleCTM_ADDR, CGContextScaleCTM_DESC)

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
private val CGContextTranslateCTM_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextTranslateCTM").orElseThrow()
private val CGContextTranslateCTM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextTranslateCTM_ADDR, CGContextTranslateCTM_DESC)

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
private val CGContextRotateCTM_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextRotateCTM").orElseThrow()
private val CGContextRotateCTM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextRotateCTM_ADDR, CGContextRotateCTM_DESC)

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
private val CGContextConcatCTM_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConcatCTM").orElseThrow()
private val CGContextConcatCTM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConcatCTM_ADDR, CGContextConcatCTM_DESC)

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

fun CGContextConcatCTM(arg0: MemorySegment, arg1: CGAffineTransform): Unit {
    CGContextConcatCTM(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextGetCTM typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetCTM_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.ADDRESS)
private val CGContextGetCTM_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetCTM").orElseThrow()
private val CGContextGetCTM_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetCTM_ADDR, CGContextGetCTM_DESC)

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

fun CGContextGetCTMTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGAffineTransform {
    return CGAffineTransform(CGContextGetCTM(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextSetLineWidth Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetLineWidth_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetLineWidth_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetLineWidth").orElseThrow()
private val CGContextSetLineWidth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetLineWidth_ADDR, CGContextSetLineWidth_DESC)

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
private val CGContextSetLineCap_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetLineCap").orElseThrow()
private val CGContextSetLineCap_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetLineCap_ADDR, CGContextSetLineCap_DESC)

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
private val CGContextSetLineJoin_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetLineJoin").orElseThrow()
private val CGContextSetLineJoin_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetLineJoin_ADDR, CGContextSetLineJoin_DESC)

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
private val CGContextSetMiterLimit_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetMiterLimit").orElseThrow()
private val CGContextSetMiterLimit_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetMiterLimit_ADDR, CGContextSetMiterLimit_DESC)

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
private val CGContextSetLineDash_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetLineDash").orElseThrow()
private val CGContextSetLineDash_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetLineDash_ADDR, CGContextSetLineDash_DESC)

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
private val CGContextSetFlatness_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFlatness").orElseThrow()
private val CGContextSetFlatness_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFlatness_ADDR, CGContextSetFlatness_DESC)

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
private val CGContextSetAlpha_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetAlpha").orElseThrow()
private val CGContextSetAlpha_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetAlpha_ADDR, CGContextSetAlpha_DESC)

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
private val CGContextSetBlendMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetBlendMode").orElseThrow()
private val CGContextSetBlendMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetBlendMode_ADDR, CGContextSetBlendMode_DESC)

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
private val CGContextBeginPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextBeginPath").orElseThrow()
private val CGContextBeginPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextBeginPath_ADDR, CGContextBeginPath_DESC)

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
private val CGContextMoveToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextMoveToPoint").orElseThrow()
private val CGContextMoveToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextMoveToPoint_ADDR, CGContextMoveToPoint_DESC)

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
private val CGContextAddLineToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddLineToPoint").orElseThrow()
private val CGContextAddLineToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddLineToPoint_ADDR, CGContextAddLineToPoint_DESC)

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
private val CGContextAddCurveToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddCurveToPoint").orElseThrow()
private val CGContextAddCurveToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddCurveToPoint_ADDR, CGContextAddCurveToPoint_DESC)

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
private val CGContextAddQuadCurveToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddQuadCurveToPoint").orElseThrow()
private val CGContextAddQuadCurveToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddQuadCurveToPoint_ADDR, CGContextAddQuadCurveToPoint_DESC)

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
private val CGContextClosePath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextClosePath").orElseThrow()
private val CGContextClosePath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextClosePath_ADDR, CGContextClosePath_DESC)

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
private val CGContextAddRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddRect").orElseThrow()
private val CGContextAddRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddRect_ADDR, CGContextAddRect_DESC)

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

fun CGContextAddRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextAddRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextAddRects Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextAddRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextAddRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddRects").orElseThrow()
private val CGContextAddRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddRects_ADDR, CGContextAddRects_DESC)

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
private val CGContextAddLines_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddLines").orElseThrow()
private val CGContextAddLines_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddLines_ADDR, CGContextAddLines_DESC)

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
private val CGContextAddEllipseInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddEllipseInRect").orElseThrow()
private val CGContextAddEllipseInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddEllipseInRect_ADDR, CGContextAddEllipseInRect_DESC)

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

fun CGContextAddEllipseInRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextAddEllipseInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextAddArc Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,typedef CGFloat = Double,Int)
 */
private val CGContextAddArc_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
private val CGContextAddArc_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddArc").orElseThrow()
private val CGContextAddArc_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddArc_ADDR, CGContextAddArc_DESC)

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
private val CGContextAddArcToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddArcToPoint").orElseThrow()
private val CGContextAddArcToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddArcToPoint_ADDR, CGContextAddArcToPoint_DESC)

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
private val CGContextAddPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextAddPath").orElseThrow()
private val CGContextAddPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextAddPath_ADDR, CGContextAddPath_DESC)

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
private val CGContextReplacePathWithStrokedPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextReplacePathWithStrokedPath").orElseThrow()
private val CGContextReplacePathWithStrokedPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextReplacePathWithStrokedPath_ADDR, CGContextReplacePathWithStrokedPath_DESC)

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
private val CGContextIsPathEmpty_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextIsPathEmpty").orElseThrow()
private val CGContextIsPathEmpty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextIsPathEmpty_ADDR, CGContextIsPathEmpty_DESC)

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
private val CGContextGetPathCurrentPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetPathCurrentPoint").orElseThrow()
private val CGContextGetPathCurrentPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetPathCurrentPoint_ADDR, CGContextGetPathCurrentPoint_DESC)

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

fun CGContextGetPathCurrentPointTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGContextGetPathCurrentPoint(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextGetPathBoundingBox typedef CGRect = Declared(CGRect)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetPathBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGContextGetPathBoundingBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetPathBoundingBox").orElseThrow()
private val CGContextGetPathBoundingBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetPathBoundingBox_ADDR, CGContextGetPathBoundingBox_DESC)

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

fun CGContextGetPathBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGContextGetPathBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextCopyPath typedef CGPathRef = (Declared(CGPath))*(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextCopyPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextCopyPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextCopyPath").orElseThrow()
private val CGContextCopyPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextCopyPath_ADDR, CGContextCopyPath_DESC)

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
private val CGContextPathContainsPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextPathContainsPoint").orElseThrow()
private val CGContextPathContainsPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextPathContainsPoint_ADDR, CGContextPathContainsPoint_DESC)

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

fun CGContextPathContainsPoint(arg0: MemorySegment, arg1: CGPoint, arg2: CGPathDrawingMode): Boolean {
    return CGContextPathContainsPoint(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawPath Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPathDrawingMode = Declared(CGPathDrawingMode))
 */
private val CGContextDrawPath_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextDrawPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawPath").orElseThrow()
private val CGContextDrawPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawPath_ADDR, CGContextDrawPath_DESC)

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
private val CGContextFillPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextFillPath").orElseThrow()
private val CGContextFillPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextFillPath_ADDR, CGContextFillPath_DESC)

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
private val CGContextEOFillPath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextEOFillPath").orElseThrow()
private val CGContextEOFillPath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextEOFillPath_ADDR, CGContextEOFillPath_DESC)

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
private val CGContextStrokePath_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextStrokePath").orElseThrow()
private val CGContextStrokePath_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextStrokePath_ADDR, CGContextStrokePath_DESC)

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
private val CGContextFillRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextFillRect").orElseThrow()
private val CGContextFillRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextFillRect_ADDR, CGContextFillRect_DESC)

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

fun CGContextFillRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextFillRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextFillRects Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextFillRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextFillRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextFillRects").orElseThrow()
private val CGContextFillRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextFillRects_ADDR, CGContextFillRects_DESC)

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
private val CGContextStrokeRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextStrokeRect").orElseThrow()
private val CGContextStrokeRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextStrokeRect_ADDR, CGContextStrokeRect_DESC)

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

fun CGContextStrokeRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextStrokeRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextStrokeRectWithWidth Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGFloat = Double)
 */
private val CGContextStrokeRectWithWidth_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_DOUBLE)
private val CGContextStrokeRectWithWidth_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextStrokeRectWithWidth").orElseThrow()
private val CGContextStrokeRectWithWidth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextStrokeRectWithWidth_ADDR, CGContextStrokeRectWithWidth_DESC)

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

fun CGContextStrokeRectWithWidth(arg0: MemorySegment, arg1: CGRect, arg2: Double): Unit {
    CGContextStrokeRectWithWidth(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextClearRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextClearRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextClearRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextClearRect").orElseThrow()
private val CGContextClearRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextClearRect_ADDR, CGContextClearRect_DESC)

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

fun CGContextClearRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextClearRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextFillEllipseInRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextFillEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextFillEllipseInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextFillEllipseInRect").orElseThrow()
private val CGContextFillEllipseInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextFillEllipseInRect_ADDR, CGContextFillEllipseInRect_DESC)

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

fun CGContextFillEllipseInRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextFillEllipseInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextStrokeEllipseInRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextStrokeEllipseInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextStrokeEllipseInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextStrokeEllipseInRect").orElseThrow()
private val CGContextStrokeEllipseInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextStrokeEllipseInRect_ADDR, CGContextStrokeEllipseInRect_DESC)

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

fun CGContextStrokeEllipseInRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextStrokeEllipseInRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextStrokeLineSegments Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGPoint = Declared(CGPoint))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextStrokeLineSegments_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextStrokeLineSegments_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextStrokeLineSegments").orElseThrow()
private val CGContextStrokeLineSegments_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextStrokeLineSegments_ADDR, CGContextStrokeLineSegments_DESC)

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
private val CGContextClip_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextClip").orElseThrow()
private val CGContextClip_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextClip_ADDR, CGContextClip_DESC)

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
private val CGContextEOClip_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextEOClip").orElseThrow()
private val CGContextEOClip_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextEOClip_ADDR, CGContextEOClip_DESC)

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
private val CGContextResetClip_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextResetClip").orElseThrow()
private val CGContextResetClip_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextResetClip_ADDR, CGContextResetClip_DESC)

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
private val CGContextClipToMask_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextClipToMask").orElseThrow()
private val CGContextClipToMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextClipToMask_ADDR, CGContextClipToMask_DESC)

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

fun CGContextClipToMask(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextClipToMask(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextGetClipBoundingBox typedef CGRect = Declared(CGRect)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetClipBoundingBox_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS)
private val CGContextGetClipBoundingBox_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetClipBoundingBox").orElseThrow()
private val CGContextGetClipBoundingBox_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetClipBoundingBox_ADDR, CGContextGetClipBoundingBox_DESC)

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

fun CGContextGetClipBoundingBoxTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGRect {
    return CGRect(CGContextGetClipBoundingBox(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextClipToRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextClipToRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout)
private val CGContextClipToRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextClipToRect").orElseThrow()
private val CGContextClipToRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextClipToRect_ADDR, CGContextClipToRect_DESC)

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

fun CGContextClipToRect(arg0: MemorySegment, arg1: CGRect): Unit {
    CGContextClipToRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextClipToRects Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextClipToRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextClipToRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextClipToRects").orElseThrow()
private val CGContextClipToRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextClipToRects_ADDR, CGContextClipToRects_DESC)

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
private val CGContextSetFillColorWithColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFillColorWithColor").orElseThrow()
private val CGContextSetFillColorWithColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFillColorWithColor_ADDR, CGContextSetFillColorWithColor_DESC)

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
private val CGContextSetStrokeColorWithColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetStrokeColorWithColor").orElseThrow()
private val CGContextSetStrokeColorWithColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetStrokeColorWithColor_ADDR, CGContextSetStrokeColorWithColor_DESC)

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
private val CGContextSetFillColorSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFillColorSpace").orElseThrow()
private val CGContextSetFillColorSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFillColorSpace_ADDR, CGContextSetFillColorSpace_DESC)

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
private val CGContextSetStrokeColorSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetStrokeColorSpace").orElseThrow()
private val CGContextSetStrokeColorSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetStrokeColorSpace_ADDR, CGContextSetStrokeColorSpace_DESC)

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
private val CGContextSetFillColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFillColor").orElseThrow()
private val CGContextSetFillColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFillColor_ADDR, CGContextSetFillColor_DESC)

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
private val CGContextSetStrokeColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetStrokeColor").orElseThrow()
private val CGContextSetStrokeColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetStrokeColor_ADDR, CGContextSetStrokeColor_DESC)

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
private val CGContextSetFillPattern_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFillPattern").orElseThrow()
private val CGContextSetFillPattern_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFillPattern_ADDR, CGContextSetFillPattern_DESC)

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
private val CGContextSetStrokePattern_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetStrokePattern").orElseThrow()
private val CGContextSetStrokePattern_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetStrokePattern_ADDR, CGContextSetStrokePattern_DESC)

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
private val CGContextSetPatternPhase_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetPatternPhase").orElseThrow()
private val CGContextSetPatternPhase_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetPatternPhase_ADDR, CGContextSetPatternPhase_DESC)

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

fun CGContextSetPatternPhase(arg0: MemorySegment, arg1: CGSize): Unit {
    CGContextSetPatternPhase(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextSetGrayFillColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetGrayFillColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetGrayFillColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetGrayFillColor").orElseThrow()
private val CGContextSetGrayFillColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetGrayFillColor_ADDR, CGContextSetGrayFillColor_DESC)

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
private val CGContextSetGrayStrokeColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetGrayStrokeColor").orElseThrow()
private val CGContextSetGrayStrokeColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetGrayStrokeColor_ADDR, CGContextSetGrayStrokeColor_DESC)

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
private val CGContextSetRGBFillColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetRGBFillColor").orElseThrow()
private val CGContextSetRGBFillColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetRGBFillColor_ADDR, CGContextSetRGBFillColor_DESC)

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
private val CGContextSetRGBStrokeColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetRGBStrokeColor").orElseThrow()
private val CGContextSetRGBStrokeColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetRGBStrokeColor_ADDR, CGContextSetRGBStrokeColor_DESC)

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
private val CGContextSetCMYKFillColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetCMYKFillColor").orElseThrow()
private val CGContextSetCMYKFillColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetCMYKFillColor_ADDR, CGContextSetCMYKFillColor_DESC)

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
private val CGContextSetCMYKStrokeColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetCMYKStrokeColor").orElseThrow()
private val CGContextSetCMYKStrokeColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetCMYKStrokeColor_ADDR, CGContextSetCMYKStrokeColor_DESC)

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
private val CGContextSetRenderingIntent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetRenderingIntent").orElseThrow()
private val CGContextSetRenderingIntent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetRenderingIntent_ADDR, CGContextSetRenderingIntent_DESC)

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
private val CGContextSetEDRTargetHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetEDRTargetHeadroom").orElseThrow()
private val CGContextSetEDRTargetHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetEDRTargetHeadroom_ADDR, CGContextSetEDRTargetHeadroom_DESC)

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
private val CGContextGetEDRTargetHeadroom_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetEDRTargetHeadroom").orElseThrow()
private val CGContextGetEDRTargetHeadroom_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetEDRTargetHeadroom_ADDR, CGContextGetEDRTargetHeadroom_DESC)

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
private val CGContextDrawImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawImage").orElseThrow()
private val CGContextDrawImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawImage_ADDR, CGContextDrawImage_DESC)

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

fun CGContextDrawImage(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextDrawImage(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawTiledImage Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGImageRef = (Declared(CGImage))*)
 */
private val CGContextDrawTiledImage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGContextDrawTiledImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawTiledImage").orElseThrow()
private val CGContextDrawTiledImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawTiledImage_ADDR, CGContextDrawTiledImage_DESC)

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

fun CGContextDrawTiledImage(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextDrawTiledImage(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawImageApplyingToneMapping Bool(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGImageRef = (Declared(CGImage))*,typedef CGToneMapping = Declared(CGToneMapping),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGContextDrawImageApplyingToneMapping_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGContextDrawImageApplyingToneMapping_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawImageApplyingToneMapping").orElseThrow()
private val CGContextDrawImageApplyingToneMapping_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawImageApplyingToneMapping_ADDR, CGContextDrawImageApplyingToneMapping_DESC)

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

fun CGContextDrawImageApplyingToneMapping(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment, arg3: CGToneMapping, arg4: MemorySegment): Boolean {
    return CGContextDrawImageApplyingToneMapping(arg0, arg1.segment, arg2, arg3, arg4)
}

/**
 * {@snippet lang=c : CGContextGetContentToneMappingInfo typedef CGContentToneMappingInfo = Declared(CGContentToneMappingInfo)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetContentToneMappingInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(CGContentToneMappingInfo.layout, ValueLayout.ADDRESS)
private val CGContextGetContentToneMappingInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetContentToneMappingInfo").orElseThrow()
private val CGContextGetContentToneMappingInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetContentToneMappingInfo_ADDR, CGContextGetContentToneMappingInfo_DESC)

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
