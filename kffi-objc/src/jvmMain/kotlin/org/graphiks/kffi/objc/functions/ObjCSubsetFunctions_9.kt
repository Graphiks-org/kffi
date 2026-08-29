package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : CGContextSetContentToneMappingInfo Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGContentToneMappingInfo = Declared(CGContentToneMappingInfo))
 */
private val CGContextSetContentToneMappingInfo_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGContentToneMappingInfo.layout)
private val CGContextSetContentToneMappingInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetContentToneMappingInfo").orElseThrow()
private val CGContextSetContentToneMappingInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetContentToneMappingInfo_ADDR, CGContextSetContentToneMappingInfo_DESC)

fun CGContextSetContentToneMappingInfo(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetContentToneMappingInfo_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextGetInterpolationQuality typedef CGInterpolationQuality = Declared(CGInterpolationQuality)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetInterpolationQuality_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGContextGetInterpolationQuality_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetInterpolationQuality").orElseThrow()
private val CGContextGetInterpolationQuality_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetInterpolationQuality_ADDR, CGContextGetInterpolationQuality_DESC)

fun CGContextGetInterpolationQuality(arg0: MemorySegment): CGInterpolationQuality {
    try {
        return CGInterpolationQuality.fromValue((CGContextGetInterpolationQuality_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetInterpolationQuality Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGInterpolationQuality = Declared(CGInterpolationQuality))
 */
private val CGContextSetInterpolationQuality_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextSetInterpolationQuality_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetInterpolationQuality").orElseThrow()
private val CGContextSetInterpolationQuality_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetInterpolationQuality_ADDR, CGContextSetInterpolationQuality_DESC)

fun CGContextSetInterpolationQuality(arg0: MemorySegment, arg1: CGInterpolationQuality): Unit {
    try {
        CGContextSetInterpolationQuality_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetShadowWithColor Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGSize = Declared(CGSize),typedef CGFloat = Double,typedef CGColorRef = (Declared(CGColor))*)
 */
private val CGContextSetShadowWithColor_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGSize.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGContextSetShadowWithColor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetShadowWithColor").orElseThrow()
private val CGContextSetShadowWithColor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetShadowWithColor_ADDR, CGContextSetShadowWithColor_DESC)

fun CGContextSetShadowWithColor(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: MemorySegment): Unit {
    try {
        CGContextSetShadowWithColor_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextSetShadowWithColor(arg0: MemorySegment, arg1: CGSize, arg2: Double, arg3: MemorySegment): Unit {
    CGContextSetShadowWithColor(arg0, arg1.segment, arg2, arg3)
}

/**
 * {@snippet lang=c : CGContextSetShadow Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGSize = Declared(CGSize),typedef CGFloat = Double)
 */
private val CGContextSetShadow_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGSize.layout, ValueLayout.JAVA_DOUBLE)
private val CGContextSetShadow_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetShadow").orElseThrow()
private val CGContextSetShadow_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetShadow_ADDR, CGContextSetShadow_DESC)

fun CGContextSetShadow(arg0: MemorySegment, arg1: MemorySegment, arg2: Double): Unit {
    try {
        CGContextSetShadow_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextSetShadow(arg0: MemorySegment, arg1: CGSize, arg2: Double): Unit {
    CGContextSetShadow(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawLinearGradient Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGGradientRef = (Declared(CGGradient))*,typedef CGPoint = Declared(CGPoint),typedef CGPoint = Declared(CGPoint),typedef CGGradientDrawingOptions = Declared(CGGradientDrawingOptions))
 */
private val CGContextDrawLinearGradient_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, CGPoint.layout, ValueLayout.JAVA_INT)
private val CGContextDrawLinearGradient_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawLinearGradient").orElseThrow()
private val CGContextDrawLinearGradient_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawLinearGradient_ADDR, CGContextDrawLinearGradient_DESC)

fun CGContextDrawLinearGradient(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: CGGradientDrawingOptions): Unit {
    try {
        CGContextDrawLinearGradient_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4.rawValue.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextDrawLinearGradient(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPoint, arg3: CGPoint, arg4: CGGradientDrawingOptions): Unit {
    CGContextDrawLinearGradient(arg0, arg1, arg2.segment, arg3.segment, arg4)
}

/**
 * {@snippet lang=c : CGContextDrawRadialGradient Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGGradientRef = (Declared(CGGradient))*,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double,typedef CGGradientDrawingOptions = Declared(CGGradientDrawingOptions))
 */
private val CGContextDrawRadialGradient_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_DOUBLE, CGPoint.layout, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
private val CGContextDrawRadialGradient_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawRadialGradient").orElseThrow()
private val CGContextDrawRadialGradient_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawRadialGradient_ADDR, CGContextDrawRadialGradient_DESC)

fun CGContextDrawRadialGradient(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double, arg4: MemorySegment, arg5: Double, arg6: CGGradientDrawingOptions): Unit {
    try {
        CGContextDrawRadialGradient_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6.rawValue.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextDrawRadialGradient(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPoint, arg3: Double, arg4: CGPoint, arg5: Double, arg6: CGGradientDrawingOptions): Unit {
    CGContextDrawRadialGradient(arg0, arg1, arg2.segment, arg3, arg4.segment, arg5, arg6)
}

/**
 * {@snippet lang=c : CGContextDrawConicGradient Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGGradientRef = (Declared(CGGradient))*,typedef CGPoint = Declared(CGPoint),typedef CGFloat = Double)
 */
private val CGContextDrawConicGradient_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.JAVA_DOUBLE)
private val CGContextDrawConicGradient_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawConicGradient").orElseThrow()
private val CGContextDrawConicGradient_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawConicGradient_ADDR, CGContextDrawConicGradient_DESC)

fun CGContextDrawConicGradient(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double): Unit {
    try {
        CGContextDrawConicGradient_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextDrawConicGradient(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPoint, arg3: Double): Unit {
    CGContextDrawConicGradient(arg0, arg1, arg2.segment, arg3)
}

/**
 * {@snippet lang=c : CGContextDrawShading Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGShadingRef = (Declared(CGShading))*)
 */
private val CGContextDrawShading_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextDrawShading_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawShading").orElseThrow()
private val CGContextDrawShading_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawShading_ADDR, CGContextDrawShading_DESC)

fun CGContextDrawShading(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextDrawShading_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetCharacterSpacing Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetCharacterSpacing_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetCharacterSpacing_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetCharacterSpacing").orElseThrow()
private val CGContextSetCharacterSpacing_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetCharacterSpacing_ADDR, CGContextSetCharacterSpacing_DESC)

fun CGContextSetCharacterSpacing(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextSetCharacterSpacing_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetTextPosition Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double)
 */
private val CGContextSetTextPosition_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
private val CGContextSetTextPosition_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetTextPosition").orElseThrow()
private val CGContextSetTextPosition_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetTextPosition_ADDR, CGContextSetTextPosition_DESC)

fun CGContextSetTextPosition(arg0: MemorySegment, arg1: Double, arg2: Double): Unit {
    try {
        CGContextSetTextPosition_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextGetTextPosition typedef CGPoint = Declared(CGPoint)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetTextPosition_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS)
private val CGContextGetTextPosition_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetTextPosition").orElseThrow()
private val CGContextGetTextPosition_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetTextPosition_ADDR, CGContextGetTextPosition_DESC)

fun CGContextGetTextPosition(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetTextPosition_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextGetTextPositionTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGContextGetTextPosition(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextSetTextMatrix Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGAffineTransform = Declared(CGAffineTransform))
 */
private val CGContextSetTextMatrix_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGAffineTransform.layout)
private val CGContextSetTextMatrix_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetTextMatrix").orElseThrow()
private val CGContextSetTextMatrix_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetTextMatrix_ADDR, CGContextSetTextMatrix_DESC)

fun CGContextSetTextMatrix(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetTextMatrix_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextSetTextMatrix(arg0: MemorySegment, arg1: CGAffineTransform): Unit {
    CGContextSetTextMatrix(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGContextGetTextMatrix typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetTextMatrix_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.ADDRESS)
private val CGContextGetTextMatrix_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetTextMatrix").orElseThrow()
private val CGContextGetTextMatrix_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetTextMatrix_ADDR, CGContextGetTextMatrix_DESC)

fun CGContextGetTextMatrix(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetTextMatrix_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextGetTextMatrixTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGAffineTransform {
    return CGAffineTransform(CGContextGetTextMatrix(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextSetTextDrawingMode Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGTextDrawingMode = Declared(CGTextDrawingMode))
 */
private val CGContextSetTextDrawingMode_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextSetTextDrawingMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetTextDrawingMode").orElseThrow()
private val CGContextSetTextDrawingMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetTextDrawingMode_ADDR, CGContextSetTextDrawingMode_DESC)

fun CGContextSetTextDrawingMode(arg0: MemorySegment, arg1: CGTextDrawingMode): Unit {
    try {
        CGContextSetTextDrawingMode_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFont Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFontRef = (Declared(CGFont))*)
 */
private val CGContextSetFont_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextSetFont_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFont").orElseThrow()
private val CGContextSetFont_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFont_ADDR, CGContextSetFont_DESC)

fun CGContextSetFont(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextSetFont_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetFontSize Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double)
 */
private val CGContextSetFontSize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGContextSetFontSize_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetFontSize").orElseThrow()
private val CGContextSetFontSize_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetFontSize_ADDR, CGContextSetFontSize_DESC)

fun CGContextSetFontSize(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGContextSetFontSize_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextShowGlyphsAtPositions Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGGlyph = UNSIGNED = Short)*,(typedef CGPoint = Declared(CGPoint))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextShowGlyphsAtPositions_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextShowGlyphsAtPositions_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextShowGlyphsAtPositions").orElseThrow()
private val CGContextShowGlyphsAtPositions_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextShowGlyphsAtPositions_ADDR, CGContextShowGlyphsAtPositions_DESC)

fun CGContextShowGlyphsAtPositions(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): Unit {
    try {
        CGContextShowGlyphsAtPositions_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextDrawPDFPage Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGContextDrawPDFPage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextDrawPDFPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawPDFPage").orElseThrow()
private val CGContextDrawPDFPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawPDFPage_ADDR, CGContextDrawPDFPage_DESC)

fun CGContextDrawPDFPage(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextDrawPDFPage_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextBeginPage Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGRect = Declared(CGRect))*)
 */
private val CGContextBeginPage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextBeginPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextBeginPage").orElseThrow()
private val CGContextBeginPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextBeginPage_ADDR, CGContextBeginPage_DESC)

fun CGContextBeginPage(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextBeginPage_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextEndPage Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextEndPage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextEndPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextEndPage").orElseThrow()
private val CGContextEndPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextEndPage_ADDR, CGContextEndPage_DESC)

fun CGContextEndPage(arg0: MemorySegment): Unit {
    try {
        CGContextEndPage_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextRetain typedef CGContextRef = (Declared(CGContext))*(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextRetain").orElseThrow()
private val CGContextRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextRetain_ADDR, CGContextRetain_DESC)

fun CGContextRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGContextRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextRelease Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextRelease").orElseThrow()
private val CGContextRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextRelease_ADDR, CGContextRelease_DESC)

fun CGContextRelease(arg0: MemorySegment): Unit {
    try {
        CGContextRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextFlush Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextFlush_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextFlush_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextFlush").orElseThrow()
private val CGContextFlush_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextFlush_ADDR, CGContextFlush_DESC)

fun CGContextFlush(arg0: MemorySegment): Unit {
    try {
        CGContextFlush_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSynchronize Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextSynchronize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextSynchronize_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSynchronize").orElseThrow()
private val CGContextSynchronize_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSynchronize_ADDR, CGContextSynchronize_DESC)

fun CGContextSynchronize(arg0: MemorySegment): Unit {
    try {
        CGContextSynchronize_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSynchronizeAttributes Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextSynchronizeAttributes_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextSynchronizeAttributes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSynchronizeAttributes").orElseThrow()
private val CGContextSynchronizeAttributes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSynchronizeAttributes_ADDR, CGContextSynchronizeAttributes_DESC)

fun CGContextSynchronizeAttributes(arg0: MemorySegment): Unit {
    try {
        CGContextSynchronizeAttributes_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetShouldAntialias Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetShouldAntialias_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetShouldAntialias_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetShouldAntialias").orElseThrow()
private val CGContextSetShouldAntialias_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetShouldAntialias_ADDR, CGContextSetShouldAntialias_DESC)

fun CGContextSetShouldAntialias(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetShouldAntialias_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetAllowsAntialiasing Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetAllowsAntialiasing_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetAllowsAntialiasing_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetAllowsAntialiasing").orElseThrow()
private val CGContextSetAllowsAntialiasing_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetAllowsAntialiasing_ADDR, CGContextSetAllowsAntialiasing_DESC)

fun CGContextSetAllowsAntialiasing(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetAllowsAntialiasing_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetShouldSmoothFonts Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetShouldSmoothFonts_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetShouldSmoothFonts_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetShouldSmoothFonts").orElseThrow()
private val CGContextSetShouldSmoothFonts_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetShouldSmoothFonts_ADDR, CGContextSetShouldSmoothFonts_DESC)

fun CGContextSetShouldSmoothFonts(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetShouldSmoothFonts_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetAllowsFontSmoothing Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetAllowsFontSmoothing_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetAllowsFontSmoothing_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetAllowsFontSmoothing").orElseThrow()
private val CGContextSetAllowsFontSmoothing_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetAllowsFontSmoothing_ADDR, CGContextSetAllowsFontSmoothing_DESC)

fun CGContextSetAllowsFontSmoothing(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetAllowsFontSmoothing_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetShouldSubpixelPositionFonts Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetShouldSubpixelPositionFonts_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetShouldSubpixelPositionFonts_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetShouldSubpixelPositionFonts").orElseThrow()
private val CGContextSetShouldSubpixelPositionFonts_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetShouldSubpixelPositionFonts_ADDR, CGContextSetShouldSubpixelPositionFonts_DESC)

fun CGContextSetShouldSubpixelPositionFonts(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetShouldSubpixelPositionFonts_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetAllowsFontSubpixelPositioning Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetAllowsFontSubpixelPositioning_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetAllowsFontSubpixelPositioning_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetAllowsFontSubpixelPositioning").orElseThrow()
private val CGContextSetAllowsFontSubpixelPositioning_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetAllowsFontSubpixelPositioning_ADDR, CGContextSetAllowsFontSubpixelPositioning_DESC)

fun CGContextSetAllowsFontSubpixelPositioning(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetAllowsFontSubpixelPositioning_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetShouldSubpixelQuantizeFonts Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetShouldSubpixelQuantizeFonts_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetShouldSubpixelQuantizeFonts_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetShouldSubpixelQuantizeFonts").orElseThrow()
private val CGContextSetShouldSubpixelQuantizeFonts_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetShouldSubpixelQuantizeFonts_ADDR, CGContextSetShouldSubpixelQuantizeFonts_DESC)

fun CGContextSetShouldSubpixelQuantizeFonts(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetShouldSubpixelQuantizeFonts_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextSetAllowsFontSubpixelQuantization Void(typedef CGContextRef = (Declared(CGContext))*,Bool)
 */
private val CGContextSetAllowsFontSubpixelQuantization_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGContextSetAllowsFontSubpixelQuantization_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSetAllowsFontSubpixelQuantization").orElseThrow()
private val CGContextSetAllowsFontSubpixelQuantization_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSetAllowsFontSubpixelQuantization_ADDR, CGContextSetAllowsFontSubpixelQuantization_DESC)

fun CGContextSetAllowsFontSubpixelQuantization(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGContextSetAllowsFontSubpixelQuantization_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextBeginTransparencyLayer Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGContextBeginTransparencyLayer_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGContextBeginTransparencyLayer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextBeginTransparencyLayer").orElseThrow()
private val CGContextBeginTransparencyLayer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextBeginTransparencyLayer_ADDR, CGContextBeginTransparencyLayer_DESC)

fun CGContextBeginTransparencyLayer(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGContextBeginTransparencyLayer_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextBeginTransparencyLayerWithRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGContextBeginTransparencyLayerWithRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGContextBeginTransparencyLayerWithRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextBeginTransparencyLayerWithRect").orElseThrow()
private val CGContextBeginTransparencyLayerWithRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextBeginTransparencyLayerWithRect_ADDR, CGContextBeginTransparencyLayerWithRect_DESC)

fun CGContextBeginTransparencyLayerWithRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextBeginTransparencyLayerWithRect_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextBeginTransparencyLayerWithRect(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextBeginTransparencyLayerWithRect(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextEndTransparencyLayer Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextEndTransparencyLayer_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGContextEndTransparencyLayer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextEndTransparencyLayer").orElseThrow()
private val CGContextEndTransparencyLayer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextEndTransparencyLayer_ADDR, CGContextEndTransparencyLayer_DESC)

fun CGContextEndTransparencyLayer(arg0: MemorySegment): Unit {
    try {
        CGContextEndTransparencyLayer_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextGetUserSpaceToDeviceSpaceTransform typedef CGAffineTransform = Declared(CGAffineTransform)(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGContextGetUserSpaceToDeviceSpaceTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(CGAffineTransform.layout, ValueLayout.ADDRESS)
private val CGContextGetUserSpaceToDeviceSpaceTransform_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextGetUserSpaceToDeviceSpaceTransform").orElseThrow()
private val CGContextGetUserSpaceToDeviceSpaceTransform_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextGetUserSpaceToDeviceSpaceTransform_ADDR, CGContextGetUserSpaceToDeviceSpaceTransform_DESC)

fun CGContextGetUserSpaceToDeviceSpaceTransform(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGContextGetUserSpaceToDeviceSpaceTransform_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextGetUserSpaceToDeviceSpaceTransformTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGAffineTransform {
    return CGAffineTransform(CGContextGetUserSpaceToDeviceSpaceTransform(allocator, arg0))
}

/**
 * {@snippet lang=c : CGContextConvertPointToDeviceSpace typedef CGPoint = Declared(CGPoint)(typedef CGContextRef = (Declared(CGContext))*,typedef CGPoint = Declared(CGPoint))
 */
private val CGContextConvertPointToDeviceSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS, CGPoint.layout)
private val CGContextConvertPointToDeviceSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConvertPointToDeviceSpace").orElseThrow()
private val CGContextConvertPointToDeviceSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConvertPointToDeviceSpace_ADDR, CGContextConvertPointToDeviceSpace_DESC)

fun CGContextConvertPointToDeviceSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGContextConvertPointToDeviceSpace_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextConvertPointToDeviceSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPoint): CGPoint {
    return CGPoint(CGContextConvertPointToDeviceSpace(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : CGContextConvertPointToUserSpace typedef CGPoint = Declared(CGPoint)(typedef CGContextRef = (Declared(CGContext))*,typedef CGPoint = Declared(CGPoint))
 */
private val CGContextConvertPointToUserSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS, CGPoint.layout)
private val CGContextConvertPointToUserSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConvertPointToUserSpace").orElseThrow()
private val CGContextConvertPointToUserSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConvertPointToUserSpace_ADDR, CGContextConvertPointToUserSpace_DESC)

fun CGContextConvertPointToUserSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGContextConvertPointToUserSpace_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextConvertPointToUserSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGPoint): CGPoint {
    return CGPoint(CGContextConvertPointToUserSpace(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : CGContextConvertSizeToDeviceSpace typedef CGSize = Declared(CGSize)(typedef CGContextRef = (Declared(CGContext))*,typedef CGSize = Declared(CGSize))
 */
private val CGContextConvertSizeToDeviceSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(CGSize.layout, ValueLayout.ADDRESS, CGSize.layout)
private val CGContextConvertSizeToDeviceSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConvertSizeToDeviceSpace").orElseThrow()
private val CGContextConvertSizeToDeviceSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConvertSizeToDeviceSpace_ADDR, CGContextConvertSizeToDeviceSpace_DESC)

fun CGContextConvertSizeToDeviceSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGContextConvertSizeToDeviceSpace_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextConvertSizeToDeviceSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGSize): CGSize {
    return CGSize(CGContextConvertSizeToDeviceSpace(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : CGContextConvertSizeToUserSpace typedef CGSize = Declared(CGSize)(typedef CGContextRef = (Declared(CGContext))*,typedef CGSize = Declared(CGSize))
 */
private val CGContextConvertSizeToUserSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(CGSize.layout, ValueLayout.ADDRESS, CGSize.layout)
private val CGContextConvertSizeToUserSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConvertSizeToUserSpace").orElseThrow()
private val CGContextConvertSizeToUserSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConvertSizeToUserSpace_ADDR, CGContextConvertSizeToUserSpace_DESC)

fun CGContextConvertSizeToUserSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGContextConvertSizeToUserSpace_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextConvertSizeToUserSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGSize): CGSize {
    return CGSize(CGContextConvertSizeToUserSpace(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : CGContextConvertRectToDeviceSpace typedef CGRect = Declared(CGRect)(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextConvertRectToDeviceSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, CGRect.layout)
private val CGContextConvertRectToDeviceSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConvertRectToDeviceSpace").orElseThrow()
private val CGContextConvertRectToDeviceSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConvertRectToDeviceSpace_ADDR, CGContextConvertRectToDeviceSpace_DESC)

fun CGContextConvertRectToDeviceSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGContextConvertRectToDeviceSpace_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextConvertRectToDeviceSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGRect): CGRect {
    return CGRect(CGContextConvertRectToDeviceSpace(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : CGContextConvertRectToUserSpace typedef CGRect = Declared(CGRect)(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect))
 */
private val CGContextConvertRectToUserSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.ADDRESS, CGRect.layout)
private val CGContextConvertRectToUserSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextConvertRectToUserSpace").orElseThrow()
private val CGContextConvertRectToUserSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextConvertRectToUserSpace_ADDR, CGContextConvertRectToUserSpace_DESC)

fun CGContextConvertRectToUserSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGContextConvertRectToUserSpace_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextConvertRectToUserSpace(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CGRect): CGRect {
    return CGRect(CGContextConvertRectToUserSpace(allocator, arg0, arg1.segment))
}

/**
 * {@snippet lang=c : CGContextSelectFont Void(typedef CGContextRef = (Declared(CGContext))*,(Char)*,typedef CGFloat = Double,typedef CGTextEncoding = Declared(CGTextEncoding))
 */
private val CGContextSelectFont_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
private val CGContextSelectFont_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextSelectFont").orElseThrow()
private val CGContextSelectFont_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextSelectFont_ADDR, CGContextSelectFont_DESC)

fun CGContextSelectFont(arg0: MemorySegment, arg1: MemorySegment, arg2: Double, arg3: CGTextEncoding): Unit {
    try {
        CGContextSelectFont_HANDLE.invokeExact(arg0, arg1, arg2, arg3.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextShowText Void(typedef CGContextRef = (Declared(CGContext))*,(Char)*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextShowText_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextShowText_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextShowText").orElseThrow()
private val CGContextShowText_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextShowText_ADDR, CGContextShowText_DESC)

fun CGContextShowText(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextShowText_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextShowTextAtPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,(Char)*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextShowTextAtPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextShowTextAtPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextShowTextAtPoint").orElseThrow()
private val CGContextShowTextAtPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextShowTextAtPoint_ADDR, CGContextShowTextAtPoint_DESC)

fun CGContextShowTextAtPoint(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: MemorySegment, arg4: Long): Unit {
    try {
        CGContextShowTextAtPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextShowGlyphs Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGGlyph = UNSIGNED = Short)*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextShowGlyphs_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextShowGlyphs_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextShowGlyphs").orElseThrow()
private val CGContextShowGlyphs_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextShowGlyphs_ADDR, CGContextShowGlyphs_DESC)

fun CGContextShowGlyphs(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CGContextShowGlyphs_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextShowGlyphsAtPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGFloat = Double,typedef CGFloat = Double,(typedef CGGlyph = UNSIGNED = Short)*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextShowGlyphsAtPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextShowGlyphsAtPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextShowGlyphsAtPoint").orElseThrow()
private val CGContextShowGlyphsAtPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextShowGlyphsAtPoint_ADDR, CGContextShowGlyphsAtPoint_DESC)

fun CGContextShowGlyphsAtPoint(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: MemorySegment, arg4: Long): Unit {
    try {
        CGContextShowGlyphsAtPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextShowGlyphsWithAdvances Void(typedef CGContextRef = (Declared(CGContext))*,(typedef CGGlyph = UNSIGNED = Short)*,(typedef CGSize = Declared(CGSize))*,typedef size_t = UNSIGNED = Long)
 */
private val CGContextShowGlyphsWithAdvances_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGContextShowGlyphsWithAdvances_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextShowGlyphsWithAdvances").orElseThrow()
private val CGContextShowGlyphsWithAdvances_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextShowGlyphsWithAdvances_ADDR, CGContextShowGlyphsWithAdvances_DESC)

fun CGContextShowGlyphsWithAdvances(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): Unit {
    try {
        CGContextShowGlyphsWithAdvances_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGContextDrawPDFDocument Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGPDFDocumentRef = (Declared(CGPDFDocument))*,Int)
 */
private val CGContextDrawPDFDocument_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGContextDrawPDFDocument_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawPDFDocument").orElseThrow()
private val CGContextDrawPDFDocument_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawPDFDocument_ADDR, CGContextDrawPDFDocument_DESC)

fun CGContextDrawPDFDocument(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Int): Unit {
    try {
        CGContextDrawPDFDocument_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun CGContextDrawPDFDocument(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment, arg3: Int): Unit {
    CGContextDrawPDFDocument(arg0, arg1.segment, arg2, arg3)
}

/**
 * {@snippet lang=c : NSGraphicsContextDestinationAttributeName typedef NSGraphicsContextAttributeKey = typedef NSString = (Void)*
 */
private val NSGraphicsContextDestinationAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGraphicsContextDestinationAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGraphicsContextDestinationAttributeName").orElseThrow() }
private val NSGraphicsContextDestinationAttributeName_VH: VarHandle by lazy { NSGraphicsContextDestinationAttributeName_LAYOUT.varHandle() }

var NSGraphicsContextDestinationAttributeName: MemorySegment
    get() = NSGraphicsContextDestinationAttributeName_VH.get(NSGraphicsContextDestinationAttributeName_SEGMENT) as MemorySegment
    set(value) = NSGraphicsContextDestinationAttributeName_VH.set(NSGraphicsContextDestinationAttributeName_SEGMENT, value)

/**
 * {@snippet lang=c : NSGraphicsContextRepresentationFormatAttributeName typedef NSGraphicsContextAttributeKey = typedef NSString = (Void)*
 */
private val NSGraphicsContextRepresentationFormatAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGraphicsContextRepresentationFormatAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGraphicsContextRepresentationFormatAttributeName").orElseThrow() }
private val NSGraphicsContextRepresentationFormatAttributeName_VH: VarHandle by lazy { NSGraphicsContextRepresentationFormatAttributeName_LAYOUT.varHandle() }

var NSGraphicsContextRepresentationFormatAttributeName: MemorySegment
    get() = NSGraphicsContextRepresentationFormatAttributeName_VH.get(NSGraphicsContextRepresentationFormatAttributeName_SEGMENT) as MemorySegment
    set(value) = NSGraphicsContextRepresentationFormatAttributeName_VH.set(NSGraphicsContextRepresentationFormatAttributeName_SEGMENT, value)

/**
 * {@snippet lang=c : NSGraphicsContextPSFormat typedef NSGraphicsContextRepresentationFormatName = typedef NSString = (Void)*
 */
private val NSGraphicsContextPSFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGraphicsContextPSFormat_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGraphicsContextPSFormat").orElseThrow() }
private val NSGraphicsContextPSFormat_VH: VarHandle by lazy { NSGraphicsContextPSFormat_LAYOUT.varHandle() }

var NSGraphicsContextPSFormat: MemorySegment
    get() = NSGraphicsContextPSFormat_VH.get(NSGraphicsContextPSFormat_SEGMENT) as MemorySegment
    set(value) = NSGraphicsContextPSFormat_VH.set(NSGraphicsContextPSFormat_SEGMENT, value)

/**
 * {@snippet lang=c : NSGraphicsContextPDFFormat typedef NSGraphicsContextRepresentationFormatName = typedef NSString = (Void)*
 */
private val NSGraphicsContextPDFFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGraphicsContextPDFFormat_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGraphicsContextPDFFormat").orElseThrow() }
private val NSGraphicsContextPDFFormat_VH: VarHandle by lazy { NSGraphicsContextPDFFormat_LAYOUT.varHandle() }

var NSGraphicsContextPDFFormat: MemorySegment
    get() = NSGraphicsContextPDFFormat_VH.get(NSGraphicsContextPDFFormat_SEGMENT) as MemorySegment
    set(value) = NSGraphicsContextPDFFormat_VH.set(NSGraphicsContextPDFFormat_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextLineTooLongException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSTextLineTooLongException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextLineTooLongException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextLineTooLongException").orElseThrow() }
private val NSTextLineTooLongException_VH: VarHandle by lazy { NSTextLineTooLongException_LAYOUT.varHandle() }

var NSTextLineTooLongException: MemorySegment
    get() = NSTextLineTooLongException_VH.get(NSTextLineTooLongException_SEGMENT) as MemorySegment
    set(value) = NSTextLineTooLongException_VH.set(NSTextLineTooLongException_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextNoSelectionException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSTextNoSelectionException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextNoSelectionException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextNoSelectionException").orElseThrow() }
private val NSTextNoSelectionException_VH: VarHandle by lazy { NSTextNoSelectionException_LAYOUT.varHandle() }

var NSTextNoSelectionException: MemorySegment
    get() = NSTextNoSelectionException_VH.get(NSTextNoSelectionException_SEGMENT) as MemorySegment
    set(value) = NSTextNoSelectionException_VH.set(NSTextNoSelectionException_SEGMENT, value)

/**
 * {@snippet lang=c : NSWordTablesWriteException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSWordTablesWriteException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWordTablesWriteException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWordTablesWriteException").orElseThrow() }
private val NSWordTablesWriteException_VH: VarHandle by lazy { NSWordTablesWriteException_LAYOUT.varHandle() }

var NSWordTablesWriteException: MemorySegment
    get() = NSWordTablesWriteException_VH.get(NSWordTablesWriteException_SEGMENT) as MemorySegment
    set(value) = NSWordTablesWriteException_VH.set(NSWordTablesWriteException_SEGMENT, value)

/**
 * {@snippet lang=c : NSWordTablesReadException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSWordTablesReadException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWordTablesReadException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWordTablesReadException").orElseThrow() }
private val NSWordTablesReadException_VH: VarHandle by lazy { NSWordTablesReadException_LAYOUT.varHandle() }

var NSWordTablesReadException: MemorySegment
    get() = NSWordTablesReadException_VH.get(NSWordTablesReadException_SEGMENT) as MemorySegment
    set(value) = NSWordTablesReadException_VH.set(NSWordTablesReadException_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextReadException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSTextReadException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextReadException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextReadException").orElseThrow() }
private val NSTextReadException_VH: VarHandle by lazy { NSTextReadException_LAYOUT.varHandle() }

var NSTextReadException: MemorySegment
    get() = NSTextReadException_VH.get(NSTextReadException_SEGMENT) as MemorySegment
    set(value) = NSTextReadException_VH.set(NSTextReadException_SEGMENT, value)

/**
 * {@snippet lang=c : NSTextWriteException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSTextWriteException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTextWriteException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTextWriteException").orElseThrow() }
private val NSTextWriteException_VH: VarHandle by lazy { NSTextWriteException_LAYOUT.varHandle() }

var NSTextWriteException: MemorySegment
    get() = NSTextWriteException_VH.get(NSTextWriteException_SEGMENT) as MemorySegment
    set(value) = NSTextWriteException_VH.set(NSTextWriteException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPasteboardCommunicationException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPasteboardCommunicationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardCommunicationException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardCommunicationException").orElseThrow() }
private val NSPasteboardCommunicationException_VH: VarHandle by lazy { NSPasteboardCommunicationException_LAYOUT.varHandle() }

var NSPasteboardCommunicationException: MemorySegment
    get() = NSPasteboardCommunicationException_VH.get(NSPasteboardCommunicationException_SEGMENT) as MemorySegment
    set(value) = NSPasteboardCommunicationException_VH.set(NSPasteboardCommunicationException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintingCommunicationException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPrintingCommunicationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintingCommunicationException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintingCommunicationException").orElseThrow() }
private val NSPrintingCommunicationException_VH: VarHandle by lazy { NSPrintingCommunicationException_LAYOUT.varHandle() }

var NSPrintingCommunicationException: MemorySegment
    get() = NSPrintingCommunicationException_VH.get(NSPrintingCommunicationException_SEGMENT) as MemorySegment
    set(value) = NSPrintingCommunicationException_VH.set(NSPrintingCommunicationException_SEGMENT, value)

/**
 * {@snippet lang=c : NSAbortModalException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSAbortModalException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAbortModalException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAbortModalException").orElseThrow() }
private val NSAbortModalException_VH: VarHandle by lazy { NSAbortModalException_LAYOUT.varHandle() }

var NSAbortModalException: MemorySegment
    get() = NSAbortModalException_VH.get(NSAbortModalException_SEGMENT) as MemorySegment
    set(value) = NSAbortModalException_VH.set(NSAbortModalException_SEGMENT, value)

/**
 * {@snippet lang=c : NSAbortPrintingException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSAbortPrintingException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAbortPrintingException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAbortPrintingException").orElseThrow() }
private val NSAbortPrintingException_VH: VarHandle by lazy { NSAbortPrintingException_LAYOUT.varHandle() }

var NSAbortPrintingException: MemorySegment
    get() = NSAbortPrintingException_VH.get(NSAbortPrintingException_SEGMENT) as MemorySegment
    set(value) = NSAbortPrintingException_VH.set(NSAbortPrintingException_SEGMENT, value)

/**
 * {@snippet lang=c : NSIllegalSelectorException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSIllegalSelectorException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIllegalSelectorException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIllegalSelectorException").orElseThrow() }
private val NSIllegalSelectorException_VH: VarHandle by lazy { NSIllegalSelectorException_LAYOUT.varHandle() }

var NSIllegalSelectorException: MemorySegment
    get() = NSIllegalSelectorException_VH.get(NSIllegalSelectorException_SEGMENT) as MemorySegment
    set(value) = NSIllegalSelectorException_VH.set(NSIllegalSelectorException_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppKitVirtualMemoryException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSAppKitVirtualMemoryException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppKitVirtualMemoryException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppKitVirtualMemoryException").orElseThrow() }
private val NSAppKitVirtualMemoryException_VH: VarHandle by lazy { NSAppKitVirtualMemoryException_LAYOUT.varHandle() }

var NSAppKitVirtualMemoryException: MemorySegment
    get() = NSAppKitVirtualMemoryException_VH.get(NSAppKitVirtualMemoryException_SEGMENT) as MemorySegment
    set(value) = NSAppKitVirtualMemoryException_VH.set(NSAppKitVirtualMemoryException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBadRTFDirectiveException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBadRTFDirectiveException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBadRTFDirectiveException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBadRTFDirectiveException").orElseThrow() }
private val NSBadRTFDirectiveException_VH: VarHandle by lazy { NSBadRTFDirectiveException_LAYOUT.varHandle() }

var NSBadRTFDirectiveException: MemorySegment
    get() = NSBadRTFDirectiveException_VH.get(NSBadRTFDirectiveException_SEGMENT) as MemorySegment
    set(value) = NSBadRTFDirectiveException_VH.set(NSBadRTFDirectiveException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBadRTFFontTableException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBadRTFFontTableException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBadRTFFontTableException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBadRTFFontTableException").orElseThrow() }
private val NSBadRTFFontTableException_VH: VarHandle by lazy { NSBadRTFFontTableException_LAYOUT.varHandle() }

var NSBadRTFFontTableException: MemorySegment
    get() = NSBadRTFFontTableException_VH.get(NSBadRTFFontTableException_SEGMENT) as MemorySegment
    set(value) = NSBadRTFFontTableException_VH.set(NSBadRTFFontTableException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBadRTFStyleSheetException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBadRTFStyleSheetException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBadRTFStyleSheetException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBadRTFStyleSheetException").orElseThrow() }
private val NSBadRTFStyleSheetException_VH: VarHandle by lazy { NSBadRTFStyleSheetException_LAYOUT.varHandle() }

var NSBadRTFStyleSheetException: MemorySegment
    get() = NSBadRTFStyleSheetException_VH.get(NSBadRTFStyleSheetException_SEGMENT) as MemorySegment
    set(value) = NSBadRTFStyleSheetException_VH.set(NSBadRTFStyleSheetException_SEGMENT, value)

/**
 * {@snippet lang=c : NSTypedStreamVersionException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSTypedStreamVersionException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTypedStreamVersionException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTypedStreamVersionException").orElseThrow() }
private val NSTypedStreamVersionException_VH: VarHandle by lazy { NSTypedStreamVersionException_LAYOUT.varHandle() }

var NSTypedStreamVersionException: MemorySegment
    get() = NSTypedStreamVersionException_VH.get(NSTypedStreamVersionException_SEGMENT) as MemorySegment
    set(value) = NSTypedStreamVersionException_VH.set(NSTypedStreamVersionException_SEGMENT, value)

/**
 * {@snippet lang=c : NSTIFFException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSTIFFException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSTIFFException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTIFFException").orElseThrow() }
private val NSTIFFException_VH: VarHandle by lazy { NSTIFFException_LAYOUT.varHandle() }

var NSTIFFException: MemorySegment
    get() = NSTIFFException_VH.get(NSTIFFException_SEGMENT) as MemorySegment
    set(value) = NSTIFFException_VH.set(NSTIFFException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPrintPackageException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPrintPackageException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPrintPackageException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPrintPackageException").orElseThrow() }
private val NSPrintPackageException_VH: VarHandle by lazy { NSPrintPackageException_LAYOUT.varHandle() }

var NSPrintPackageException: MemorySegment
    get() = NSPrintPackageException_VH.get(NSPrintPackageException_SEGMENT) as MemorySegment
    set(value) = NSPrintPackageException_VH.set(NSPrintPackageException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBadRTFColorTableException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBadRTFColorTableException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBadRTFColorTableException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBadRTFColorTableException").orElseThrow() }
private val NSBadRTFColorTableException_VH: VarHandle by lazy { NSBadRTFColorTableException_LAYOUT.varHandle() }

var NSBadRTFColorTableException: MemorySegment
    get() = NSBadRTFColorTableException_VH.get(NSBadRTFColorTableException_SEGMENT) as MemorySegment
    set(value) = NSBadRTFColorTableException_VH.set(NSBadRTFColorTableException_SEGMENT, value)

/**
 * {@snippet lang=c : NSDraggingException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSDraggingException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDraggingException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDraggingException").orElseThrow() }
private val NSDraggingException_VH: VarHandle by lazy { NSDraggingException_LAYOUT.varHandle() }

var NSDraggingException: MemorySegment
    get() = NSDraggingException_VH.get(NSDraggingException_SEGMENT) as MemorySegment
    set(value) = NSDraggingException_VH.set(NSDraggingException_SEGMENT, value)

/**
 * {@snippet lang=c : NSColorListIOException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSColorListIOException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSColorListIOException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSColorListIOException").orElseThrow() }
private val NSColorListIOException_VH: VarHandle by lazy { NSColorListIOException_LAYOUT.varHandle() }

var NSColorListIOException: MemorySegment
    get() = NSColorListIOException_VH.get(NSColorListIOException_SEGMENT) as MemorySegment
    set(value) = NSColorListIOException_VH.set(NSColorListIOException_SEGMENT, value)

/**
 * {@snippet lang=c : NSColorListNotEditableException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSColorListNotEditableException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSColorListNotEditableException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSColorListNotEditableException").orElseThrow() }
private val NSColorListNotEditableException_VH: VarHandle by lazy { NSColorListNotEditableException_LAYOUT.varHandle() }

var NSColorListNotEditableException: MemorySegment
    get() = NSColorListNotEditableException_VH.get(NSColorListNotEditableException_SEGMENT) as MemorySegment
    set(value) = NSColorListNotEditableException_VH.set(NSColorListNotEditableException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBadBitmapParametersException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBadBitmapParametersException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBadBitmapParametersException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBadBitmapParametersException").orElseThrow() }
private val NSBadBitmapParametersException_VH: VarHandle by lazy { NSBadBitmapParametersException_LAYOUT.varHandle() }

var NSBadBitmapParametersException: MemorySegment
    get() = NSBadBitmapParametersException_VH.get(NSBadBitmapParametersException_SEGMENT) as MemorySegment
    set(value) = NSBadBitmapParametersException_VH.set(NSBadBitmapParametersException_SEGMENT, value)

/**
 * {@snippet lang=c : NSWindowServerCommunicationException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSWindowServerCommunicationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSWindowServerCommunicationException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSWindowServerCommunicationException").orElseThrow() }
private val NSWindowServerCommunicationException_VH: VarHandle by lazy { NSWindowServerCommunicationException_LAYOUT.varHandle() }

var NSWindowServerCommunicationException: MemorySegment
    get() = NSWindowServerCommunicationException_VH.get(NSWindowServerCommunicationException_SEGMENT) as MemorySegment
    set(value) = NSWindowServerCommunicationException_VH.set(NSWindowServerCommunicationException_SEGMENT, value)

/**
 * {@snippet lang=c : NSFontUnavailableException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSFontUnavailableException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFontUnavailableException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFontUnavailableException").orElseThrow() }
private val NSFontUnavailableException_VH: VarHandle by lazy { NSFontUnavailableException_LAYOUT.varHandle() }

var NSFontUnavailableException: MemorySegment
    get() = NSFontUnavailableException_VH.get(NSFontUnavailableException_SEGMENT) as MemorySegment
    set(value) = NSFontUnavailableException_VH.set(NSFontUnavailableException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPPDIncludeNotFoundException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPPDIncludeNotFoundException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPPDIncludeNotFoundException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPPDIncludeNotFoundException").orElseThrow() }
private val NSPPDIncludeNotFoundException_VH: VarHandle by lazy { NSPPDIncludeNotFoundException_LAYOUT.varHandle() }

var NSPPDIncludeNotFoundException: MemorySegment
    get() = NSPPDIncludeNotFoundException_VH.get(NSPPDIncludeNotFoundException_SEGMENT) as MemorySegment
    set(value) = NSPPDIncludeNotFoundException_VH.set(NSPPDIncludeNotFoundException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPPDParseException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPPDParseException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPPDParseException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPPDParseException").orElseThrow() }
private val NSPPDParseException_VH: VarHandle by lazy { NSPPDParseException_LAYOUT.varHandle() }

var NSPPDParseException: MemorySegment
    get() = NSPPDParseException_VH.get(NSPPDParseException_SEGMENT) as MemorySegment
    set(value) = NSPPDParseException_VH.set(NSPPDParseException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPPDIncludeStackOverflowException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPPDIncludeStackOverflowException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPPDIncludeStackOverflowException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPPDIncludeStackOverflowException").orElseThrow() }
private val NSPPDIncludeStackOverflowException_VH: VarHandle by lazy { NSPPDIncludeStackOverflowException_LAYOUT.varHandle() }

var NSPPDIncludeStackOverflowException: MemorySegment
    get() = NSPPDIncludeStackOverflowException_VH.get(NSPPDIncludeStackOverflowException_SEGMENT) as MemorySegment
    set(value) = NSPPDIncludeStackOverflowException_VH.set(NSPPDIncludeStackOverflowException_SEGMENT, value)

/**
 * {@snippet lang=c : NSPPDIncludeStackUnderflowException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSPPDIncludeStackUnderflowException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPPDIncludeStackUnderflowException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPPDIncludeStackUnderflowException").orElseThrow() }
private val NSPPDIncludeStackUnderflowException_VH: VarHandle by lazy { NSPPDIncludeStackUnderflowException_LAYOUT.varHandle() }

var NSPPDIncludeStackUnderflowException: MemorySegment
    get() = NSPPDIncludeStackUnderflowException_VH.get(NSPPDIncludeStackUnderflowException_SEGMENT) as MemorySegment
    set(value) = NSPPDIncludeStackUnderflowException_VH.set(NSPPDIncludeStackUnderflowException_SEGMENT, value)

/**
 * {@snippet lang=c : NSRTFPropertyStackOverflowException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSRTFPropertyStackOverflowException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRTFPropertyStackOverflowException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRTFPropertyStackOverflowException").orElseThrow() }
private val NSRTFPropertyStackOverflowException_VH: VarHandle by lazy { NSRTFPropertyStackOverflowException_LAYOUT.varHandle() }

var NSRTFPropertyStackOverflowException: MemorySegment
    get() = NSRTFPropertyStackOverflowException_VH.get(NSRTFPropertyStackOverflowException_SEGMENT) as MemorySegment
    set(value) = NSRTFPropertyStackOverflowException_VH.set(NSRTFPropertyStackOverflowException_SEGMENT, value)

/**
 * {@snippet lang=c : NSAppKitIgnoredException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSAppKitIgnoredException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAppKitIgnoredException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAppKitIgnoredException").orElseThrow() }
private val NSAppKitIgnoredException_VH: VarHandle by lazy { NSAppKitIgnoredException_LAYOUT.varHandle() }

var NSAppKitIgnoredException: MemorySegment
    get() = NSAppKitIgnoredException_VH.get(NSAppKitIgnoredException_SEGMENT) as MemorySegment
    set(value) = NSAppKitIgnoredException_VH.set(NSAppKitIgnoredException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBadComparisonException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBadComparisonException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBadComparisonException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBadComparisonException").orElseThrow() }
private val NSBadComparisonException_VH: VarHandle by lazy { NSBadComparisonException_LAYOUT.varHandle() }

var NSBadComparisonException: MemorySegment
    get() = NSBadComparisonException_VH.get(NSBadComparisonException_SEGMENT) as MemorySegment
    set(value) = NSBadComparisonException_VH.set(NSBadComparisonException_SEGMENT, value)

/**
 * {@snippet lang=c : NSImageCacheException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSImageCacheException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageCacheException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageCacheException").orElseThrow() }
private val NSImageCacheException_VH: VarHandle by lazy { NSImageCacheException_LAYOUT.varHandle() }

var NSImageCacheException: MemorySegment
    get() = NSImageCacheException_VH.get(NSImageCacheException_SEGMENT) as MemorySegment
    set(value) = NSImageCacheException_VH.set(NSImageCacheException_SEGMENT, value)

/**
 * {@snippet lang=c : NSNibLoadingException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSNibLoadingException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSNibLoadingException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSNibLoadingException").orElseThrow() }
private val NSNibLoadingException_VH: VarHandle by lazy { NSNibLoadingException_LAYOUT.varHandle() }

var NSNibLoadingException: MemorySegment
    get() = NSNibLoadingException_VH.get(NSNibLoadingException_SEGMENT) as MemorySegment
    set(value) = NSNibLoadingException_VH.set(NSNibLoadingException_SEGMENT, value)

/**
 * {@snippet lang=c : NSBrowserIllegalDelegateException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSBrowserIllegalDelegateException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBrowserIllegalDelegateException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBrowserIllegalDelegateException").orElseThrow() }
private val NSBrowserIllegalDelegateException_VH: VarHandle by lazy { NSBrowserIllegalDelegateException_LAYOUT.varHandle() }

var NSBrowserIllegalDelegateException: MemorySegment
    get() = NSBrowserIllegalDelegateException_VH.get(NSBrowserIllegalDelegateException_SEGMENT) as MemorySegment
    set(value) = NSBrowserIllegalDelegateException_VH.set(NSBrowserIllegalDelegateException_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityException typedef NSExceptionName = typedef NSString = (Void)*
 */
private val NSAccessibilityException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityException").orElseThrow() }
private val NSAccessibilityException_VH: VarHandle by lazy { NSAccessibilityException_LAYOUT.varHandle() }

var NSAccessibilityException: MemorySegment
    get() = NSAccessibilityException_VH.get(NSAccessibilityException_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityException_VH.set(NSAccessibilityException_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityErrorCodeExceptionInfo (Void)*
 */
private val NSAccessibilityErrorCodeExceptionInfo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityErrorCodeExceptionInfo_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityErrorCodeExceptionInfo").orElseThrow() }
private val NSAccessibilityErrorCodeExceptionInfo_VH: VarHandle by lazy { NSAccessibilityErrorCodeExceptionInfo_LAYOUT.varHandle() }

var NSAccessibilityErrorCodeExceptionInfo: MemorySegment
    get() = NSAccessibilityErrorCodeExceptionInfo_VH.get(NSAccessibilityErrorCodeExceptionInfo_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityErrorCodeExceptionInfo_VH.set(NSAccessibilityErrorCodeExceptionInfo_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRoleAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRoleAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRoleAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRoleAttribute").orElseThrow() }
private val NSAccessibilityRoleAttribute_VH: VarHandle by lazy { NSAccessibilityRoleAttribute_LAYOUT.varHandle() }

var NSAccessibilityRoleAttribute: MemorySegment
    get() = NSAccessibilityRoleAttribute_VH.get(NSAccessibilityRoleAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRoleAttribute_VH.set(NSAccessibilityRoleAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRoleDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRoleDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRoleDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRoleDescriptionAttribute").orElseThrow() }
private val NSAccessibilityRoleDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityRoleDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityRoleDescriptionAttribute: MemorySegment
    get() = NSAccessibilityRoleDescriptionAttribute_VH.get(NSAccessibilityRoleDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRoleDescriptionAttribute_VH.set(NSAccessibilityRoleDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySubroleAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySubroleAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySubroleAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySubroleAttribute").orElseThrow() }
private val NSAccessibilitySubroleAttribute_VH: VarHandle by lazy { NSAccessibilitySubroleAttribute_LAYOUT.varHandle() }

var NSAccessibilitySubroleAttribute: MemorySegment
    get() = NSAccessibilitySubroleAttribute_VH.get(NSAccessibilitySubroleAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySubroleAttribute_VH.set(NSAccessibilitySubroleAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHelpAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHelpAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHelpAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHelpAttribute").orElseThrow() }
private val NSAccessibilityHelpAttribute_VH: VarHandle by lazy { NSAccessibilityHelpAttribute_LAYOUT.varHandle() }

var NSAccessibilityHelpAttribute: MemorySegment
    get() = NSAccessibilityHelpAttribute_VH.get(NSAccessibilityHelpAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHelpAttribute_VH.set(NSAccessibilityHelpAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityValueAttribute").orElseThrow() }
private val NSAccessibilityValueAttribute_VH: VarHandle by lazy { NSAccessibilityValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityValueAttribute: MemorySegment
    get() = NSAccessibilityValueAttribute_VH.get(NSAccessibilityValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityValueAttribute_VH.set(NSAccessibilityValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMinValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMinValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMinValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMinValueAttribute").orElseThrow() }
private val NSAccessibilityMinValueAttribute_VH: VarHandle by lazy { NSAccessibilityMinValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityMinValueAttribute: MemorySegment
    get() = NSAccessibilityMinValueAttribute_VH.get(NSAccessibilityMinValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMinValueAttribute_VH.set(NSAccessibilityMinValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMaxValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMaxValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMaxValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMaxValueAttribute").orElseThrow() }
private val NSAccessibilityMaxValueAttribute_VH: VarHandle by lazy { NSAccessibilityMaxValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityMaxValueAttribute: MemorySegment
    get() = NSAccessibilityMaxValueAttribute_VH.get(NSAccessibilityMaxValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMaxValueAttribute_VH.set(NSAccessibilityMaxValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityEnabledAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityEnabledAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityEnabledAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityEnabledAttribute").orElseThrow() }
private val NSAccessibilityEnabledAttribute_VH: VarHandle by lazy { NSAccessibilityEnabledAttribute_LAYOUT.varHandle() }

var NSAccessibilityEnabledAttribute: MemorySegment
    get() = NSAccessibilityEnabledAttribute_VH.get(NSAccessibilityEnabledAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityEnabledAttribute_VH.set(NSAccessibilityEnabledAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFocusedAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityFocusedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFocusedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFocusedAttribute").orElseThrow() }
private val NSAccessibilityFocusedAttribute_VH: VarHandle by lazy { NSAccessibilityFocusedAttribute_LAYOUT.varHandle() }

var NSAccessibilityFocusedAttribute: MemorySegment
    get() = NSAccessibilityFocusedAttribute_VH.get(NSAccessibilityFocusedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFocusedAttribute_VH.set(NSAccessibilityFocusedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityParentAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityParentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityParentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityParentAttribute").orElseThrow() }
private val NSAccessibilityParentAttribute_VH: VarHandle by lazy { NSAccessibilityParentAttribute_LAYOUT.varHandle() }

var NSAccessibilityParentAttribute: MemorySegment
    get() = NSAccessibilityParentAttribute_VH.get(NSAccessibilityParentAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityParentAttribute_VH.set(NSAccessibilityParentAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityChildrenAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityChildrenAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityChildrenAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityChildrenAttribute").orElseThrow() }
private val NSAccessibilityChildrenAttribute_VH: VarHandle by lazy { NSAccessibilityChildrenAttribute_LAYOUT.varHandle() }

var NSAccessibilityChildrenAttribute: MemorySegment
    get() = NSAccessibilityChildrenAttribute_VH.get(NSAccessibilityChildrenAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityChildrenAttribute_VH.set(NSAccessibilityChildrenAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityWindowAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowAttribute").orElseThrow() }
private val NSAccessibilityWindowAttribute_VH: VarHandle by lazy { NSAccessibilityWindowAttribute_LAYOUT.varHandle() }

var NSAccessibilityWindowAttribute: MemorySegment
    get() = NSAccessibilityWindowAttribute_VH.get(NSAccessibilityWindowAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityWindowAttribute_VH.set(NSAccessibilityWindowAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTopLevelUIElementAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityTopLevelUIElementAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTopLevelUIElementAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTopLevelUIElementAttribute").orElseThrow() }
private val NSAccessibilityTopLevelUIElementAttribute_VH: VarHandle by lazy { NSAccessibilityTopLevelUIElementAttribute_LAYOUT.varHandle() }

var NSAccessibilityTopLevelUIElementAttribute: MemorySegment
    get() = NSAccessibilityTopLevelUIElementAttribute_VH.get(NSAccessibilityTopLevelUIElementAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTopLevelUIElementAttribute_VH.set(NSAccessibilityTopLevelUIElementAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedChildrenAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedChildrenAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedChildrenAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedChildrenAttribute").orElseThrow() }
private val NSAccessibilitySelectedChildrenAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedChildrenAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedChildrenAttribute: MemorySegment
    get() = NSAccessibilitySelectedChildrenAttribute_VH.get(NSAccessibilitySelectedChildrenAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedChildrenAttribute_VH.set(NSAccessibilitySelectedChildrenAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisibleChildrenAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVisibleChildrenAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisibleChildrenAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisibleChildrenAttribute").orElseThrow() }
private val NSAccessibilityVisibleChildrenAttribute_VH: VarHandle by lazy { NSAccessibilityVisibleChildrenAttribute_LAYOUT.varHandle() }

var NSAccessibilityVisibleChildrenAttribute: MemorySegment
    get() = NSAccessibilityVisibleChildrenAttribute_VH.get(NSAccessibilityVisibleChildrenAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisibleChildrenAttribute_VH.set(NSAccessibilityVisibleChildrenAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPositionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityPositionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPositionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPositionAttribute").orElseThrow() }
private val NSAccessibilityPositionAttribute_VH: VarHandle by lazy { NSAccessibilityPositionAttribute_LAYOUT.varHandle() }

var NSAccessibilityPositionAttribute: MemorySegment
    get() = NSAccessibilityPositionAttribute_VH.get(NSAccessibilityPositionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPositionAttribute_VH.set(NSAccessibilityPositionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySizeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySizeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySizeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySizeAttribute").orElseThrow() }
private val NSAccessibilitySizeAttribute_VH: VarHandle by lazy { NSAccessibilitySizeAttribute_LAYOUT.varHandle() }

var NSAccessibilitySizeAttribute: MemorySegment
    get() = NSAccessibilitySizeAttribute_VH.get(NSAccessibilitySizeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySizeAttribute_VH.set(NSAccessibilitySizeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityContentsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityContentsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityContentsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityContentsAttribute").orElseThrow() }
private val NSAccessibilityContentsAttribute_VH: VarHandle by lazy { NSAccessibilityContentsAttribute_LAYOUT.varHandle() }

var NSAccessibilityContentsAttribute: MemorySegment
    get() = NSAccessibilityContentsAttribute_VH.get(NSAccessibilityContentsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityContentsAttribute_VH.set(NSAccessibilityContentsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTitleAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityTitleAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTitleAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTitleAttribute").orElseThrow() }
private val NSAccessibilityTitleAttribute_VH: VarHandle by lazy { NSAccessibilityTitleAttribute_LAYOUT.varHandle() }

var NSAccessibilityTitleAttribute: MemorySegment
    get() = NSAccessibilityTitleAttribute_VH.get(NSAccessibilityTitleAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTitleAttribute_VH.set(NSAccessibilityTitleAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDescriptionAttribute").orElseThrow() }
private val NSAccessibilityDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityDescriptionAttribute: MemorySegment
    get() = NSAccessibilityDescriptionAttribute_VH.get(NSAccessibilityDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDescriptionAttribute_VH.set(NSAccessibilityDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityShownMenuAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityShownMenuAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityShownMenuAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityShownMenuAttribute").orElseThrow() }
private val NSAccessibilityShownMenuAttribute_VH: VarHandle by lazy { NSAccessibilityShownMenuAttribute_LAYOUT.varHandle() }

var NSAccessibilityShownMenuAttribute: MemorySegment
    get() = NSAccessibilityShownMenuAttribute_VH.get(NSAccessibilityShownMenuAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityShownMenuAttribute_VH.set(NSAccessibilityShownMenuAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityValueDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityValueDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityValueDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityValueDescriptionAttribute").orElseThrow() }
private val NSAccessibilityValueDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityValueDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityValueDescriptionAttribute: MemorySegment
    get() = NSAccessibilityValueDescriptionAttribute_VH.get(NSAccessibilityValueDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityValueDescriptionAttribute_VH.set(NSAccessibilityValueDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySharedFocusElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySharedFocusElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySharedFocusElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySharedFocusElementsAttribute").orElseThrow() }
private val NSAccessibilitySharedFocusElementsAttribute_VH: VarHandle by lazy { NSAccessibilitySharedFocusElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilitySharedFocusElementsAttribute: MemorySegment
    get() = NSAccessibilitySharedFocusElementsAttribute_VH.get(NSAccessibilitySharedFocusElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySharedFocusElementsAttribute_VH.set(NSAccessibilitySharedFocusElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPreviousContentsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityPreviousContentsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPreviousContentsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPreviousContentsAttribute").orElseThrow() }
private val NSAccessibilityPreviousContentsAttribute_VH: VarHandle by lazy { NSAccessibilityPreviousContentsAttribute_LAYOUT.varHandle() }

var NSAccessibilityPreviousContentsAttribute: MemorySegment
    get() = NSAccessibilityPreviousContentsAttribute_VH.get(NSAccessibilityPreviousContentsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPreviousContentsAttribute_VH.set(NSAccessibilityPreviousContentsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityNextContentsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityNextContentsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityNextContentsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityNextContentsAttribute").orElseThrow() }
private val NSAccessibilityNextContentsAttribute_VH: VarHandle by lazy { NSAccessibilityNextContentsAttribute_LAYOUT.varHandle() }

var NSAccessibilityNextContentsAttribute: MemorySegment
    get() = NSAccessibilityNextContentsAttribute_VH.get(NSAccessibilityNextContentsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityNextContentsAttribute_VH.set(NSAccessibilityNextContentsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHeaderAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHeaderAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeaderAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeaderAttribute").orElseThrow() }
private val NSAccessibilityHeaderAttribute_VH: VarHandle by lazy { NSAccessibilityHeaderAttribute_LAYOUT.varHandle() }

var NSAccessibilityHeaderAttribute: MemorySegment
    get() = NSAccessibilityHeaderAttribute_VH.get(NSAccessibilityHeaderAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHeaderAttribute_VH.set(NSAccessibilityHeaderAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityEditedAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityEditedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityEditedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityEditedAttribute").orElseThrow() }
private val NSAccessibilityEditedAttribute_VH: VarHandle by lazy { NSAccessibilityEditedAttribute_LAYOUT.varHandle() }

var NSAccessibilityEditedAttribute: MemorySegment
    get() = NSAccessibilityEditedAttribute_VH.get(NSAccessibilityEditedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityEditedAttribute_VH.set(NSAccessibilityEditedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTabsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityTabsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTabsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTabsAttribute").orElseThrow() }
private val NSAccessibilityTabsAttribute_VH: VarHandle by lazy { NSAccessibilityTabsAttribute_LAYOUT.varHandle() }

var NSAccessibilityTabsAttribute: MemorySegment
    get() = NSAccessibilityTabsAttribute_VH.get(NSAccessibilityTabsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTabsAttribute_VH.set(NSAccessibilityTabsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHorizontalScrollBarAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHorizontalScrollBarAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHorizontalScrollBarAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHorizontalScrollBarAttribute").orElseThrow() }
private val NSAccessibilityHorizontalScrollBarAttribute_VH: VarHandle by lazy { NSAccessibilityHorizontalScrollBarAttribute_LAYOUT.varHandle() }

var NSAccessibilityHorizontalScrollBarAttribute: MemorySegment
    get() = NSAccessibilityHorizontalScrollBarAttribute_VH.get(NSAccessibilityHorizontalScrollBarAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHorizontalScrollBarAttribute_VH.set(NSAccessibilityHorizontalScrollBarAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVerticalScrollBarAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVerticalScrollBarAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVerticalScrollBarAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVerticalScrollBarAttribute").orElseThrow() }
private val NSAccessibilityVerticalScrollBarAttribute_VH: VarHandle by lazy { NSAccessibilityVerticalScrollBarAttribute_LAYOUT.varHandle() }

var NSAccessibilityVerticalScrollBarAttribute: MemorySegment
    get() = NSAccessibilityVerticalScrollBarAttribute_VH.get(NSAccessibilityVerticalScrollBarAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVerticalScrollBarAttribute_VH.set(NSAccessibilityVerticalScrollBarAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityOverflowButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityOverflowButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityOverflowButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityOverflowButtonAttribute").orElseThrow() }
private val NSAccessibilityOverflowButtonAttribute_VH: VarHandle by lazy { NSAccessibilityOverflowButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityOverflowButtonAttribute: MemorySegment
    get() = NSAccessibilityOverflowButtonAttribute_VH.get(NSAccessibilityOverflowButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityOverflowButtonAttribute_VH.set(NSAccessibilityOverflowButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityIncrementButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityIncrementButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIncrementButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIncrementButtonAttribute").orElseThrow() }
private val NSAccessibilityIncrementButtonAttribute_VH: VarHandle by lazy { NSAccessibilityIncrementButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityIncrementButtonAttribute: MemorySegment
    get() = NSAccessibilityIncrementButtonAttribute_VH.get(NSAccessibilityIncrementButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityIncrementButtonAttribute_VH.set(NSAccessibilityIncrementButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDecrementButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDecrementButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDecrementButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDecrementButtonAttribute").orElseThrow() }
private val NSAccessibilityDecrementButtonAttribute_VH: VarHandle by lazy { NSAccessibilityDecrementButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityDecrementButtonAttribute: MemorySegment
    get() = NSAccessibilityDecrementButtonAttribute_VH.get(NSAccessibilityDecrementButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDecrementButtonAttribute_VH.set(NSAccessibilityDecrementButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFilenameAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityFilenameAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFilenameAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFilenameAttribute").orElseThrow() }
private val NSAccessibilityFilenameAttribute_VH: VarHandle by lazy { NSAccessibilityFilenameAttribute_LAYOUT.varHandle() }

var NSAccessibilityFilenameAttribute: MemorySegment
    get() = NSAccessibilityFilenameAttribute_VH.get(NSAccessibilityFilenameAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFilenameAttribute_VH.set(NSAccessibilityFilenameAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityExpandedAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityExpandedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityExpandedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityExpandedAttribute").orElseThrow() }
private val NSAccessibilityExpandedAttribute_VH: VarHandle by lazy { NSAccessibilityExpandedAttribute_LAYOUT.varHandle() }

var NSAccessibilityExpandedAttribute: MemorySegment
    get() = NSAccessibilityExpandedAttribute_VH.get(NSAccessibilityExpandedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityExpandedAttribute_VH.set(NSAccessibilityExpandedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedAttribute").orElseThrow() }
private val NSAccessibilitySelectedAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedAttribute: MemorySegment
    get() = NSAccessibilitySelectedAttribute_VH.get(NSAccessibilitySelectedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedAttribute_VH.set(NSAccessibilitySelectedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySplittersAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySplittersAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySplittersAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySplittersAttribute").orElseThrow() }
private val NSAccessibilitySplittersAttribute_VH: VarHandle by lazy { NSAccessibilitySplittersAttribute_LAYOUT.varHandle() }

var NSAccessibilitySplittersAttribute: MemorySegment
    get() = NSAccessibilitySplittersAttribute_VH.get(NSAccessibilitySplittersAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySplittersAttribute_VH.set(NSAccessibilitySplittersAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDocumentAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDocumentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDocumentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDocumentAttribute").orElseThrow() }
private val NSAccessibilityDocumentAttribute_VH: VarHandle by lazy { NSAccessibilityDocumentAttribute_LAYOUT.varHandle() }

var NSAccessibilityDocumentAttribute: MemorySegment
    get() = NSAccessibilityDocumentAttribute_VH.get(NSAccessibilityDocumentAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDocumentAttribute_VH.set(NSAccessibilityDocumentAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityActivationPointAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityActivationPointAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityActivationPointAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityActivationPointAttribute").orElseThrow() }
private val NSAccessibilityActivationPointAttribute_VH: VarHandle by lazy { NSAccessibilityActivationPointAttribute_LAYOUT.varHandle() }

var NSAccessibilityActivationPointAttribute: MemorySegment
    get() = NSAccessibilityActivationPointAttribute_VH.get(NSAccessibilityActivationPointAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityActivationPointAttribute_VH.set(NSAccessibilityActivationPointAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityURLAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityURLAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityURLAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityURLAttribute").orElseThrow() }
private val NSAccessibilityURLAttribute_VH: VarHandle by lazy { NSAccessibilityURLAttribute_LAYOUT.varHandle() }

var NSAccessibilityURLAttribute: MemorySegment
    get() = NSAccessibilityURLAttribute_VH.get(NSAccessibilityURLAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityURLAttribute_VH.set(NSAccessibilityURLAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityIndexAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityIndexAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIndexAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIndexAttribute").orElseThrow() }
private val NSAccessibilityIndexAttribute_VH: VarHandle by lazy { NSAccessibilityIndexAttribute_LAYOUT.varHandle() }

var NSAccessibilityIndexAttribute: MemorySegment
    get() = NSAccessibilityIndexAttribute_VH.get(NSAccessibilityIndexAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityIndexAttribute_VH.set(NSAccessibilityIndexAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRowCountAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRowCountAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowCountAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowCountAttribute").orElseThrow() }
private val NSAccessibilityRowCountAttribute_VH: VarHandle by lazy { NSAccessibilityRowCountAttribute_LAYOUT.varHandle() }

var NSAccessibilityRowCountAttribute: MemorySegment
    get() = NSAccessibilityRowCountAttribute_VH.get(NSAccessibilityRowCountAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRowCountAttribute_VH.set(NSAccessibilityRowCountAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityColumnCountAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityColumnCountAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColumnCountAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColumnCountAttribute").orElseThrow() }
private val NSAccessibilityColumnCountAttribute_VH: VarHandle by lazy { NSAccessibilityColumnCountAttribute_LAYOUT.varHandle() }

var NSAccessibilityColumnCountAttribute: MemorySegment
    get() = NSAccessibilityColumnCountAttribute_VH.get(NSAccessibilityColumnCountAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityColumnCountAttribute_VH.set(NSAccessibilityColumnCountAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityOrderedByRowAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityOrderedByRowAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityOrderedByRowAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityOrderedByRowAttribute").orElseThrow() }
private val NSAccessibilityOrderedByRowAttribute_VH: VarHandle by lazy { NSAccessibilityOrderedByRowAttribute_LAYOUT.varHandle() }

var NSAccessibilityOrderedByRowAttribute: MemorySegment
    get() = NSAccessibilityOrderedByRowAttribute_VH.get(NSAccessibilityOrderedByRowAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityOrderedByRowAttribute_VH.set(NSAccessibilityOrderedByRowAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityWarningValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityWarningValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWarningValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWarningValueAttribute").orElseThrow() }
private val NSAccessibilityWarningValueAttribute_VH: VarHandle by lazy { NSAccessibilityWarningValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityWarningValueAttribute: MemorySegment
    get() = NSAccessibilityWarningValueAttribute_VH.get(NSAccessibilityWarningValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityWarningValueAttribute_VH.set(NSAccessibilityWarningValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCriticalValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityCriticalValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCriticalValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCriticalValueAttribute").orElseThrow() }
private val NSAccessibilityCriticalValueAttribute_VH: VarHandle by lazy { NSAccessibilityCriticalValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityCriticalValueAttribute: MemorySegment
    get() = NSAccessibilityCriticalValueAttribute_VH.get(NSAccessibilityCriticalValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCriticalValueAttribute_VH.set(NSAccessibilityCriticalValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPlaceholderValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityPlaceholderValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPlaceholderValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPlaceholderValueAttribute").orElseThrow() }
private val NSAccessibilityPlaceholderValueAttribute_VH: VarHandle by lazy { NSAccessibilityPlaceholderValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityPlaceholderValueAttribute: MemorySegment
    get() = NSAccessibilityPlaceholderValueAttribute_VH.get(NSAccessibilityPlaceholderValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPlaceholderValueAttribute_VH.set(NSAccessibilityPlaceholderValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityContainsProtectedContentAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityContainsProtectedContentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityContainsProtectedContentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityContainsProtectedContentAttribute").orElseThrow() }
private val NSAccessibilityContainsProtectedContentAttribute_VH: VarHandle by lazy { NSAccessibilityContainsProtectedContentAttribute_LAYOUT.varHandle() }

var NSAccessibilityContainsProtectedContentAttribute: MemorySegment
    get() = NSAccessibilityContainsProtectedContentAttribute_VH.get(NSAccessibilityContainsProtectedContentAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityContainsProtectedContentAttribute_VH.set(NSAccessibilityContainsProtectedContentAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAlternateUIVisibleAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityAlternateUIVisibleAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAlternateUIVisibleAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAlternateUIVisibleAttribute").orElseThrow() }
private val NSAccessibilityAlternateUIVisibleAttribute_VH: VarHandle by lazy { NSAccessibilityAlternateUIVisibleAttribute_LAYOUT.varHandle() }

var NSAccessibilityAlternateUIVisibleAttribute: MemorySegment
    get() = NSAccessibilityAlternateUIVisibleAttribute_VH.get(NSAccessibilityAlternateUIVisibleAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAlternateUIVisibleAttribute_VH.set(NSAccessibilityAlternateUIVisibleAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRequiredAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRequiredAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRequiredAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRequiredAttribute").orElseThrow() }
private val NSAccessibilityRequiredAttribute_VH: VarHandle by lazy { NSAccessibilityRequiredAttribute_LAYOUT.varHandle() }

var NSAccessibilityRequiredAttribute: MemorySegment
    get() = NSAccessibilityRequiredAttribute_VH.get(NSAccessibilityRequiredAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRequiredAttribute_VH.set(NSAccessibilityRequiredAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAutoInteractableAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityAutoInteractableAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAutoInteractableAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAutoInteractableAttribute").orElseThrow() }
private val NSAccessibilityAutoInteractableAttribute_VH: VarHandle by lazy { NSAccessibilityAutoInteractableAttribute_LAYOUT.varHandle() }

var NSAccessibilityAutoInteractableAttribute: MemorySegment
    get() = NSAccessibilityAutoInteractableAttribute_VH.get(NSAccessibilityAutoInteractableAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAutoInteractableAttribute_VH.set(NSAccessibilityAutoInteractableAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDateTimeComponentsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDateTimeComponentsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDateTimeComponentsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDateTimeComponentsAttribute").orElseThrow() }
private val NSAccessibilityDateTimeComponentsAttribute_VH: VarHandle by lazy { NSAccessibilityDateTimeComponentsAttribute_LAYOUT.varHandle() }

var NSAccessibilityDateTimeComponentsAttribute: MemorySegment
    get() = NSAccessibilityDateTimeComponentsAttribute_VH.get(NSAccessibilityDateTimeComponentsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDateTimeComponentsAttribute_VH.set(NSAccessibilityDateTimeComponentsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityEmbeddedImageDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityEmbeddedImageDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityEmbeddedImageDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityEmbeddedImageDescriptionAttribute").orElseThrow() }
private val NSAccessibilityEmbeddedImageDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityEmbeddedImageDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityEmbeddedImageDescriptionAttribute: MemorySegment
    get() = NSAccessibilityEmbeddedImageDescriptionAttribute_VH.get(NSAccessibilityEmbeddedImageDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityEmbeddedImageDescriptionAttribute_VH.set(NSAccessibilityEmbeddedImageDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPathAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityPathAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPathAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPathAttribute").orElseThrow() }
private val NSAccessibilityPathAttribute_VH: VarHandle by lazy { NSAccessibilityPathAttribute_LAYOUT.varHandle() }

var NSAccessibilityPathAttribute: MemorySegment
    get() = NSAccessibilityPathAttribute_VH.get(NSAccessibilityPathAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPathAttribute_VH.set(NSAccessibilityPathAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTextInputMarkedRangeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityTextInputMarkedRangeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextInputMarkedRangeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextInputMarkedRangeAttribute").orElseThrow() }
private val NSAccessibilityTextInputMarkedRangeAttribute_VH: VarHandle by lazy { NSAccessibilityTextInputMarkedRangeAttribute_LAYOUT.varHandle() }

var NSAccessibilityTextInputMarkedRangeAttribute: MemorySegment
    get() = NSAccessibilityTextInputMarkedRangeAttribute_VH.get(NSAccessibilityTextInputMarkedRangeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTextInputMarkedRangeAttribute_VH.set(NSAccessibilityTextInputMarkedRangeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityBlockQuoteLevelAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityBlockQuoteLevelAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBlockQuoteLevelAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBlockQuoteLevelAttribute").orElseThrow() }
private val NSAccessibilityBlockQuoteLevelAttribute_VH: VarHandle by lazy { NSAccessibilityBlockQuoteLevelAttribute_LAYOUT.varHandle() }

var NSAccessibilityBlockQuoteLevelAttribute: MemorySegment
    get() = NSAccessibilityBlockQuoteLevelAttribute_VH.get(NSAccessibilityBlockQuoteLevelAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityBlockQuoteLevelAttribute_VH.set(NSAccessibilityBlockQuoteLevelAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadingLevelAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHeadingLevelAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadingLevelAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadingLevelAttribute").orElseThrow() }
private val NSAccessibilityHeadingLevelAttribute_VH: VarHandle by lazy { NSAccessibilityHeadingLevelAttribute_LAYOUT.varHandle() }

var NSAccessibilityHeadingLevelAttribute: MemorySegment
    get() = NSAccessibilityHeadingLevelAttribute_VH.get(NSAccessibilityHeadingLevelAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHeadingLevelAttribute_VH.set(NSAccessibilityHeadingLevelAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLanguageAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityLanguageAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLanguageAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLanguageAttribute").orElseThrow() }
private val NSAccessibilityLanguageAttribute_VH: VarHandle by lazy { NSAccessibilityLanguageAttribute_LAYOUT.varHandle() }

var NSAccessibilityLanguageAttribute: MemorySegment
    get() = NSAccessibilityLanguageAttribute_VH.get(NSAccessibilityLanguageAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLanguageAttribute_VH.set(NSAccessibilityLanguageAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisitedAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVisitedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisitedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisitedAttribute").orElseThrow() }
private val NSAccessibilityVisitedAttribute_VH: VarHandle by lazy { NSAccessibilityVisitedAttribute_LAYOUT.varHandle() }

var NSAccessibilityVisitedAttribute: MemorySegment
    get() = NSAccessibilityVisitedAttribute_VH.get(NSAccessibilityVisitedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisitedAttribute_VH.set(NSAccessibilityVisitedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTitleUIElementAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityTitleUIElementAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTitleUIElementAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTitleUIElementAttribute").orElseThrow() }
private val NSAccessibilityTitleUIElementAttribute_VH: VarHandle by lazy { NSAccessibilityTitleUIElementAttribute_LAYOUT.varHandle() }

var NSAccessibilityTitleUIElementAttribute: MemorySegment
    get() = NSAccessibilityTitleUIElementAttribute_VH.get(NSAccessibilityTitleUIElementAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTitleUIElementAttribute_VH.set(NSAccessibilityTitleUIElementAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityServesAsTitleForUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityServesAsTitleForUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityServesAsTitleForUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityServesAsTitleForUIElementsAttribute").orElseThrow() }
private val NSAccessibilityServesAsTitleForUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilityServesAsTitleForUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilityServesAsTitleForUIElementsAttribute: MemorySegment
    get() = NSAccessibilityServesAsTitleForUIElementsAttribute_VH.get(NSAccessibilityServesAsTitleForUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityServesAsTitleForUIElementsAttribute_VH.set(NSAccessibilityServesAsTitleForUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLinkedUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityLinkedUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLinkedUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLinkedUIElementsAttribute").orElseThrow() }
private val NSAccessibilityLinkedUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilityLinkedUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilityLinkedUIElementsAttribute: MemorySegment
    get() = NSAccessibilityLinkedUIElementsAttribute_VH.get(NSAccessibilityLinkedUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLinkedUIElementsAttribute_VH.set(NSAccessibilityLinkedUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedTextAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedTextAttribute").orElseThrow() }
private val NSAccessibilitySelectedTextAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedTextAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedTextAttribute: MemorySegment
    get() = NSAccessibilitySelectedTextAttribute_VH.get(NSAccessibilitySelectedTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedTextAttribute_VH.set(NSAccessibilitySelectedTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedTextRangeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedTextRangeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedTextRangeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedTextRangeAttribute").orElseThrow() }
private val NSAccessibilitySelectedTextRangeAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedTextRangeAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedTextRangeAttribute: MemorySegment
    get() = NSAccessibilitySelectedTextRangeAttribute_VH.get(NSAccessibilitySelectedTextRangeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedTextRangeAttribute_VH.set(NSAccessibilitySelectedTextRangeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityNumberOfCharactersAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityNumberOfCharactersAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityNumberOfCharactersAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityNumberOfCharactersAttribute").orElseThrow() }
private val NSAccessibilityNumberOfCharactersAttribute_VH: VarHandle by lazy { NSAccessibilityNumberOfCharactersAttribute_LAYOUT.varHandle() }

var NSAccessibilityNumberOfCharactersAttribute: MemorySegment
    get() = NSAccessibilityNumberOfCharactersAttribute_VH.get(NSAccessibilityNumberOfCharactersAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityNumberOfCharactersAttribute_VH.set(NSAccessibilityNumberOfCharactersAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisibleCharacterRangeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVisibleCharacterRangeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisibleCharacterRangeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisibleCharacterRangeAttribute").orElseThrow() }
private val NSAccessibilityVisibleCharacterRangeAttribute_VH: VarHandle by lazy { NSAccessibilityVisibleCharacterRangeAttribute_LAYOUT.varHandle() }

var NSAccessibilityVisibleCharacterRangeAttribute: MemorySegment
    get() = NSAccessibilityVisibleCharacterRangeAttribute_VH.get(NSAccessibilityVisibleCharacterRangeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisibleCharacterRangeAttribute_VH.set(NSAccessibilityVisibleCharacterRangeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySharedTextUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySharedTextUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySharedTextUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySharedTextUIElementsAttribute").orElseThrow() }
private val NSAccessibilitySharedTextUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilitySharedTextUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilitySharedTextUIElementsAttribute: MemorySegment
    get() = NSAccessibilitySharedTextUIElementsAttribute_VH.get(NSAccessibilitySharedTextUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySharedTextUIElementsAttribute_VH.set(NSAccessibilitySharedTextUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySharedCharacterRangeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySharedCharacterRangeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySharedCharacterRangeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySharedCharacterRangeAttribute").orElseThrow() }
private val NSAccessibilitySharedCharacterRangeAttribute_VH: VarHandle by lazy { NSAccessibilitySharedCharacterRangeAttribute_LAYOUT.varHandle() }

var NSAccessibilitySharedCharacterRangeAttribute: MemorySegment
    get() = NSAccessibilitySharedCharacterRangeAttribute_VH.get(NSAccessibilitySharedCharacterRangeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySharedCharacterRangeAttribute_VH.set(NSAccessibilitySharedCharacterRangeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityInsertionPointLineNumberAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityInsertionPointLineNumberAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityInsertionPointLineNumberAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityInsertionPointLineNumberAttribute").orElseThrow() }
private val NSAccessibilityInsertionPointLineNumberAttribute_VH: VarHandle by lazy { NSAccessibilityInsertionPointLineNumberAttribute_LAYOUT.varHandle() }

var NSAccessibilityInsertionPointLineNumberAttribute: MemorySegment
    get() = NSAccessibilityInsertionPointLineNumberAttribute_VH.get(NSAccessibilityInsertionPointLineNumberAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityInsertionPointLineNumberAttribute_VH.set(NSAccessibilityInsertionPointLineNumberAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedTextRangesAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedTextRangesAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedTextRangesAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedTextRangesAttribute").orElseThrow() }
private val NSAccessibilitySelectedTextRangesAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedTextRangesAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedTextRangesAttribute: MemorySegment
    get() = NSAccessibilitySelectedTextRangesAttribute_VH.get(NSAccessibilitySelectedTextRangesAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedTextRangesAttribute_VH.set(NSAccessibilitySelectedTextRangesAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLineForIndexParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityLineForIndexParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLineForIndexParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLineForIndexParameterizedAttribute").orElseThrow() }
private val NSAccessibilityLineForIndexParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityLineForIndexParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityLineForIndexParameterizedAttribute: MemorySegment
    get() = NSAccessibilityLineForIndexParameterizedAttribute_VH.get(NSAccessibilityLineForIndexParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLineForIndexParameterizedAttribute_VH.set(NSAccessibilityLineForIndexParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRangeForLineParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityRangeForLineParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRangeForLineParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRangeForLineParameterizedAttribute").orElseThrow() }
private val NSAccessibilityRangeForLineParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityRangeForLineParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityRangeForLineParameterizedAttribute: MemorySegment
    get() = NSAccessibilityRangeForLineParameterizedAttribute_VH.get(NSAccessibilityRangeForLineParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRangeForLineParameterizedAttribute_VH.set(NSAccessibilityRangeForLineParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityStringForRangeParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityStringForRangeParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStringForRangeParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStringForRangeParameterizedAttribute").orElseThrow() }
private val NSAccessibilityStringForRangeParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityStringForRangeParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityStringForRangeParameterizedAttribute: MemorySegment
    get() = NSAccessibilityStringForRangeParameterizedAttribute_VH.get(NSAccessibilityStringForRangeParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityStringForRangeParameterizedAttribute_VH.set(NSAccessibilityStringForRangeParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRangeForPositionParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityRangeForPositionParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRangeForPositionParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRangeForPositionParameterizedAttribute").orElseThrow() }
private val NSAccessibilityRangeForPositionParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityRangeForPositionParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityRangeForPositionParameterizedAttribute: MemorySegment
    get() = NSAccessibilityRangeForPositionParameterizedAttribute_VH.get(NSAccessibilityRangeForPositionParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRangeForPositionParameterizedAttribute_VH.set(NSAccessibilityRangeForPositionParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRangeForIndexParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityRangeForIndexParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRangeForIndexParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRangeForIndexParameterizedAttribute").orElseThrow() }
private val NSAccessibilityRangeForIndexParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityRangeForIndexParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityRangeForIndexParameterizedAttribute: MemorySegment
    get() = NSAccessibilityRangeForIndexParameterizedAttribute_VH.get(NSAccessibilityRangeForIndexParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRangeForIndexParameterizedAttribute_VH.set(NSAccessibilityRangeForIndexParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityBoundsForRangeParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityBoundsForRangeParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBoundsForRangeParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBoundsForRangeParameterizedAttribute").orElseThrow() }
private val NSAccessibilityBoundsForRangeParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityBoundsForRangeParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityBoundsForRangeParameterizedAttribute: MemorySegment
    get() = NSAccessibilityBoundsForRangeParameterizedAttribute_VH.get(NSAccessibilityBoundsForRangeParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityBoundsForRangeParameterizedAttribute_VH.set(NSAccessibilityBoundsForRangeParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRTFForRangeParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityRTFForRangeParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRTFForRangeParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRTFForRangeParameterizedAttribute").orElseThrow() }
private val NSAccessibilityRTFForRangeParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityRTFForRangeParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityRTFForRangeParameterizedAttribute: MemorySegment
    get() = NSAccessibilityRTFForRangeParameterizedAttribute_VH.get(NSAccessibilityRTFForRangeParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRTFForRangeParameterizedAttribute_VH.set(NSAccessibilityRTFForRangeParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityStyleRangeForIndexParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityStyleRangeForIndexParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStyleRangeForIndexParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStyleRangeForIndexParameterizedAttribute").orElseThrow() }
private val NSAccessibilityStyleRangeForIndexParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityStyleRangeForIndexParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityStyleRangeForIndexParameterizedAttribute: MemorySegment
    get() = NSAccessibilityStyleRangeForIndexParameterizedAttribute_VH.get(NSAccessibilityStyleRangeForIndexParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityStyleRangeForIndexParameterizedAttribute_VH.set(NSAccessibilityStyleRangeForIndexParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAttributedStringForRangeParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityAttributedStringForRangeParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAttributedStringForRangeParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAttributedStringForRangeParameterizedAttribute").orElseThrow() }
private val NSAccessibilityAttributedStringForRangeParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityAttributedStringForRangeParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityAttributedStringForRangeParameterizedAttribute: MemorySegment
    get() = NSAccessibilityAttributedStringForRangeParameterizedAttribute_VH.get(NSAccessibilityAttributedStringForRangeParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAttributedStringForRangeParameterizedAttribute_VH.set(NSAccessibilityAttributedStringForRangeParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFontTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityFontTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontTextAttribute").orElseThrow() }
private val NSAccessibilityFontTextAttribute_VH: VarHandle by lazy { NSAccessibilityFontTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityFontTextAttribute: MemorySegment
    get() = NSAccessibilityFontTextAttribute_VH.get(NSAccessibilityFontTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFontTextAttribute_VH.set(NSAccessibilityFontTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityForegroundColorTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityForegroundColorTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityForegroundColorTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityForegroundColorTextAttribute").orElseThrow() }
private val NSAccessibilityForegroundColorTextAttribute_VH: VarHandle by lazy { NSAccessibilityForegroundColorTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityForegroundColorTextAttribute: MemorySegment
    get() = NSAccessibilityForegroundColorTextAttribute_VH.get(NSAccessibilityForegroundColorTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityForegroundColorTextAttribute_VH.set(NSAccessibilityForegroundColorTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityBackgroundColorTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityBackgroundColorTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityBackgroundColorTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityBackgroundColorTextAttribute").orElseThrow() }
private val NSAccessibilityBackgroundColorTextAttribute_VH: VarHandle by lazy { NSAccessibilityBackgroundColorTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityBackgroundColorTextAttribute: MemorySegment
    get() = NSAccessibilityBackgroundColorTextAttribute_VH.get(NSAccessibilityBackgroundColorTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityBackgroundColorTextAttribute_VH.set(NSAccessibilityBackgroundColorTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnderlineColorTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityUnderlineColorTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnderlineColorTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnderlineColorTextAttribute").orElseThrow() }
private val NSAccessibilityUnderlineColorTextAttribute_VH: VarHandle by lazy { NSAccessibilityUnderlineColorTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityUnderlineColorTextAttribute: MemorySegment
    get() = NSAccessibilityUnderlineColorTextAttribute_VH.get(NSAccessibilityUnderlineColorTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnderlineColorTextAttribute_VH.set(NSAccessibilityUnderlineColorTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityStrikethroughColorTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityStrikethroughColorTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStrikethroughColorTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStrikethroughColorTextAttribute").orElseThrow() }
private val NSAccessibilityStrikethroughColorTextAttribute_VH: VarHandle by lazy { NSAccessibilityStrikethroughColorTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityStrikethroughColorTextAttribute: MemorySegment
    get() = NSAccessibilityStrikethroughColorTextAttribute_VH.get(NSAccessibilityStrikethroughColorTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityStrikethroughColorTextAttribute_VH.set(NSAccessibilityStrikethroughColorTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnderlineTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityUnderlineTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnderlineTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnderlineTextAttribute").orElseThrow() }
private val NSAccessibilityUnderlineTextAttribute_VH: VarHandle by lazy { NSAccessibilityUnderlineTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityUnderlineTextAttribute: MemorySegment
    get() = NSAccessibilityUnderlineTextAttribute_VH.get(NSAccessibilityUnderlineTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnderlineTextAttribute_VH.set(NSAccessibilityUnderlineTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySuperscriptTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilitySuperscriptTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySuperscriptTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySuperscriptTextAttribute").orElseThrow() }
private val NSAccessibilitySuperscriptTextAttribute_VH: VarHandle by lazy { NSAccessibilitySuperscriptTextAttribute_LAYOUT.varHandle() }

var NSAccessibilitySuperscriptTextAttribute: MemorySegment
    get() = NSAccessibilitySuperscriptTextAttribute_VH.get(NSAccessibilitySuperscriptTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySuperscriptTextAttribute_VH.set(NSAccessibilitySuperscriptTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityStrikethroughTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityStrikethroughTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityStrikethroughTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityStrikethroughTextAttribute").orElseThrow() }
private val NSAccessibilityStrikethroughTextAttribute_VH: VarHandle by lazy { NSAccessibilityStrikethroughTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityStrikethroughTextAttribute: MemorySegment
    get() = NSAccessibilityStrikethroughTextAttribute_VH.get(NSAccessibilityStrikethroughTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityStrikethroughTextAttribute_VH.set(NSAccessibilityStrikethroughTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityShadowTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityShadowTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityShadowTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityShadowTextAttribute").orElseThrow() }
private val NSAccessibilityShadowTextAttribute_VH: VarHandle by lazy { NSAccessibilityShadowTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityShadowTextAttribute: MemorySegment
    get() = NSAccessibilityShadowTextAttribute_VH.get(NSAccessibilityShadowTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityShadowTextAttribute_VH.set(NSAccessibilityShadowTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAttachmentTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityAttachmentTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAttachmentTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAttachmentTextAttribute").orElseThrow() }
private val NSAccessibilityAttachmentTextAttribute_VH: VarHandle by lazy { NSAccessibilityAttachmentTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityAttachmentTextAttribute: MemorySegment
    get() = NSAccessibilityAttachmentTextAttribute_VH.get(NSAccessibilityAttachmentTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAttachmentTextAttribute_VH.set(NSAccessibilityAttachmentTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLinkTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityLinkTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLinkTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLinkTextAttribute").orElseThrow() }
private val NSAccessibilityLinkTextAttribute_VH: VarHandle by lazy { NSAccessibilityLinkTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityLinkTextAttribute: MemorySegment
    get() = NSAccessibilityLinkTextAttribute_VH.get(NSAccessibilityLinkTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLinkTextAttribute_VH.set(NSAccessibilityLinkTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAutocorrectedTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityAutocorrectedTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAutocorrectedTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAutocorrectedTextAttribute").orElseThrow() }
private val NSAccessibilityAutocorrectedTextAttribute_VH: VarHandle by lazy { NSAccessibilityAutocorrectedTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityAutocorrectedTextAttribute: MemorySegment
    get() = NSAccessibilityAutocorrectedTextAttribute_VH.get(NSAccessibilityAutocorrectedTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAutocorrectedTextAttribute_VH.set(NSAccessibilityAutocorrectedTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTextAlignmentAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityTextAlignmentAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextAlignmentAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextAlignmentAttribute").orElseThrow() }
private val NSAccessibilityTextAlignmentAttribute_VH: VarHandle by lazy { NSAccessibilityTextAlignmentAttribute_LAYOUT.varHandle() }

var NSAccessibilityTextAlignmentAttribute: MemorySegment
    get() = NSAccessibilityTextAlignmentAttribute_VH.get(NSAccessibilityTextAlignmentAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTextAlignmentAttribute_VH.set(NSAccessibilityTextAlignmentAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFontBoldAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityFontBoldAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontBoldAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontBoldAttribute").orElseThrow() }
private val NSAccessibilityFontBoldAttribute_VH: VarHandle by lazy { NSAccessibilityFontBoldAttribute_LAYOUT.varHandle() }

var NSAccessibilityFontBoldAttribute: MemorySegment
    get() = NSAccessibilityFontBoldAttribute_VH.get(NSAccessibilityFontBoldAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFontBoldAttribute_VH.set(NSAccessibilityFontBoldAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFontItalicAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityFontItalicAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontItalicAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontItalicAttribute").orElseThrow() }
private val NSAccessibilityFontItalicAttribute_VH: VarHandle by lazy { NSAccessibilityFontItalicAttribute_LAYOUT.varHandle() }

var NSAccessibilityFontItalicAttribute: MemorySegment
    get() = NSAccessibilityFontItalicAttribute_VH.get(NSAccessibilityFontItalicAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFontItalicAttribute_VH.set(NSAccessibilityFontItalicAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityChildrenInNavigationOrderAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityChildrenInNavigationOrderAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityChildrenInNavigationOrderAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityChildrenInNavigationOrderAttribute").orElseThrow() }
private val NSAccessibilityChildrenInNavigationOrderAttribute_VH: VarHandle by lazy { NSAccessibilityChildrenInNavigationOrderAttribute_LAYOUT.varHandle() }

var NSAccessibilityChildrenInNavigationOrderAttribute: MemorySegment
    get() = NSAccessibilityChildrenInNavigationOrderAttribute_VH.get(NSAccessibilityChildrenInNavigationOrderAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityChildrenInNavigationOrderAttribute_VH.set(NSAccessibilityChildrenInNavigationOrderAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityIndexForChildUIElementAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityIndexForChildUIElementAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIndexForChildUIElementAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIndexForChildUIElementAttribute").orElseThrow() }
private val NSAccessibilityIndexForChildUIElementAttribute_VH: VarHandle by lazy { NSAccessibilityIndexForChildUIElementAttribute_LAYOUT.varHandle() }

var NSAccessibilityIndexForChildUIElementAttribute: MemorySegment
    get() = NSAccessibilityIndexForChildUIElementAttribute_VH.get(NSAccessibilityIndexForChildUIElementAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityIndexForChildUIElementAttribute_VH.set(NSAccessibilityIndexForChildUIElementAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute").orElseThrow() }
private val NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_VH: VarHandle by lazy { NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_LAYOUT.varHandle() }

var NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute: MemorySegment
    get() = NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_VH.get(NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_VH.set(NSAccessibilityIndexForChildUIElementInNavigationOrderAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityListItemPrefixTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityListItemPrefixTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityListItemPrefixTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityListItemPrefixTextAttribute").orElseThrow() }
private val NSAccessibilityListItemPrefixTextAttribute_VH: VarHandle by lazy { NSAccessibilityListItemPrefixTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityListItemPrefixTextAttribute: MemorySegment
    get() = NSAccessibilityListItemPrefixTextAttribute_VH.get(NSAccessibilityListItemPrefixTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityListItemPrefixTextAttribute_VH.set(NSAccessibilityListItemPrefixTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityListItemIndexTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityListItemIndexTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityListItemIndexTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityListItemIndexTextAttribute").orElseThrow() }
private val NSAccessibilityListItemIndexTextAttribute_VH: VarHandle by lazy { NSAccessibilityListItemIndexTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityListItemIndexTextAttribute: MemorySegment
    get() = NSAccessibilityListItemIndexTextAttribute_VH.get(NSAccessibilityListItemIndexTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityListItemIndexTextAttribute_VH.set(NSAccessibilityListItemIndexTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityListItemLevelTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityListItemLevelTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityListItemLevelTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityListItemLevelTextAttribute").orElseThrow() }
private val NSAccessibilityListItemLevelTextAttribute_VH: VarHandle by lazy { NSAccessibilityListItemLevelTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityListItemLevelTextAttribute: MemorySegment
    get() = NSAccessibilityListItemLevelTextAttribute_VH.get(NSAccessibilityListItemLevelTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityListItemLevelTextAttribute_VH.set(NSAccessibilityListItemLevelTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMisspelledTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityMisspelledTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMisspelledTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMisspelledTextAttribute").orElseThrow() }
private val NSAccessibilityMisspelledTextAttribute_VH: VarHandle by lazy { NSAccessibilityMisspelledTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityMisspelledTextAttribute: MemorySegment
    get() = NSAccessibilityMisspelledTextAttribute_VH.get(NSAccessibilityMisspelledTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMisspelledTextAttribute_VH.set(NSAccessibilityMisspelledTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMarkedMisspelledTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityMarkedMisspelledTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMarkedMisspelledTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMarkedMisspelledTextAttribute").orElseThrow() }
private val NSAccessibilityMarkedMisspelledTextAttribute_VH: VarHandle by lazy { NSAccessibilityMarkedMisspelledTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityMarkedMisspelledTextAttribute: MemorySegment
    get() = NSAccessibilityMarkedMisspelledTextAttribute_VH.get(NSAccessibilityMarkedMisspelledTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMarkedMisspelledTextAttribute_VH.set(NSAccessibilityMarkedMisspelledTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLanguageTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityLanguageTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLanguageTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLanguageTextAttribute").orElseThrow() }
private val NSAccessibilityLanguageTextAttribute_VH: VarHandle by lazy { NSAccessibilityLanguageTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityLanguageTextAttribute: MemorySegment
    get() = NSAccessibilityLanguageTextAttribute_VH.get(NSAccessibilityLanguageTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLanguageTextAttribute_VH.set(NSAccessibilityLanguageTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCustomTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityCustomTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCustomTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCustomTextAttribute").orElseThrow() }
private val NSAccessibilityCustomTextAttribute_VH: VarHandle by lazy { NSAccessibilityCustomTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityCustomTextAttribute: MemorySegment
    get() = NSAccessibilityCustomTextAttribute_VH.get(NSAccessibilityCustomTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCustomTextAttribute_VH.set(NSAccessibilityCustomTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAnnotationTextAttribute typedef const NSAttributedStringKey = (Void)*
 */
private val NSAccessibilityAnnotationTextAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnnotationTextAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnnotationTextAttribute").orElseThrow() }
private val NSAccessibilityAnnotationTextAttribute_VH: VarHandle by lazy { NSAccessibilityAnnotationTextAttribute_LAYOUT.varHandle() }

var NSAccessibilityAnnotationTextAttribute: MemorySegment
    get() = NSAccessibilityAnnotationTextAttribute_VH.get(NSAccessibilityAnnotationTextAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAnnotationTextAttribute_VH.set(NSAccessibilityAnnotationTextAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTextCompletionAttribute (Void)*
 */
private val NSAccessibilityTextCompletionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTextCompletionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTextCompletionAttribute").orElseThrow() }
private val NSAccessibilityTextCompletionAttribute_VH: VarHandle by lazy { NSAccessibilityTextCompletionAttribute_LAYOUT.varHandle() }

var NSAccessibilityTextCompletionAttribute: MemorySegment
    get() = NSAccessibilityTextCompletionAttribute_VH.get(NSAccessibilityTextCompletionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTextCompletionAttribute_VH.set(NSAccessibilityTextCompletionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAnnotationLabel typedef const NSAccessibilityAnnotationAttributeKey = (Void)*
 */
private val NSAccessibilityAnnotationLabel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnnotationLabel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnnotationLabel").orElseThrow() }
private val NSAccessibilityAnnotationLabel_VH: VarHandle by lazy { NSAccessibilityAnnotationLabel_LAYOUT.varHandle() }

var NSAccessibilityAnnotationLabel: MemorySegment
    get() = NSAccessibilityAnnotationLabel_VH.get(NSAccessibilityAnnotationLabel_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAnnotationLabel_VH.set(NSAccessibilityAnnotationLabel_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAnnotationElement typedef const NSAccessibilityAnnotationAttributeKey = (Void)*
 */
private val NSAccessibilityAnnotationElement_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnnotationElement_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnnotationElement").orElseThrow() }
private val NSAccessibilityAnnotationElement_VH: VarHandle by lazy { NSAccessibilityAnnotationElement_LAYOUT.varHandle() }

var NSAccessibilityAnnotationElement: MemorySegment
    get() = NSAccessibilityAnnotationElement_VH.get(NSAccessibilityAnnotationElement_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAnnotationElement_VH.set(NSAccessibilityAnnotationElement_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAnnotationLocation typedef const NSAccessibilityAnnotationAttributeKey = (Void)*
 */
private val NSAccessibilityAnnotationLocation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAnnotationLocation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAnnotationLocation").orElseThrow() }
private val NSAccessibilityAnnotationLocation_VH: VarHandle by lazy { NSAccessibilityAnnotationLocation_LAYOUT.varHandle() }

var NSAccessibilityAnnotationLocation: MemorySegment
    get() = NSAccessibilityAnnotationLocation_VH.get(NSAccessibilityAnnotationLocation_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAnnotationLocation_VH.set(NSAccessibilityAnnotationLocation_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFontNameKey typedef const NSAccessibilityFontAttributeKey = (Void)*
 */
private val NSAccessibilityFontNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontNameKey").orElseThrow() }
private val NSAccessibilityFontNameKey_VH: VarHandle by lazy { NSAccessibilityFontNameKey_LAYOUT.varHandle() }

var NSAccessibilityFontNameKey: MemorySegment
    get() = NSAccessibilityFontNameKey_VH.get(NSAccessibilityFontNameKey_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFontNameKey_VH.set(NSAccessibilityFontNameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFontFamilyKey typedef const NSAccessibilityFontAttributeKey = (Void)*
 */
private val NSAccessibilityFontFamilyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontFamilyKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontFamilyKey").orElseThrow() }
private val NSAccessibilityFontFamilyKey_VH: VarHandle by lazy { NSAccessibilityFontFamilyKey_LAYOUT.varHandle() }

var NSAccessibilityFontFamilyKey: MemorySegment
    get() = NSAccessibilityFontFamilyKey_VH.get(NSAccessibilityFontFamilyKey_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFontFamilyKey_VH.set(NSAccessibilityFontFamilyKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisibleNameKey typedef const NSAccessibilityFontAttributeKey = (Void)*
 */
private val NSAccessibilityVisibleNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisibleNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisibleNameKey").orElseThrow() }
private val NSAccessibilityVisibleNameKey_VH: VarHandle by lazy { NSAccessibilityVisibleNameKey_LAYOUT.varHandle() }

var NSAccessibilityVisibleNameKey: MemorySegment
    get() = NSAccessibilityVisibleNameKey_VH.get(NSAccessibilityVisibleNameKey_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisibleNameKey_VH.set(NSAccessibilityVisibleNameKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFontSizeKey typedef const NSAccessibilityFontAttributeKey = (Void)*
 */
private val NSAccessibilityFontSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFontSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFontSizeKey").orElseThrow() }
private val NSAccessibilityFontSizeKey_VH: VarHandle by lazy { NSAccessibilityFontSizeKey_LAYOUT.varHandle() }

var NSAccessibilityFontSizeKey: MemorySegment
    get() = NSAccessibilityFontSizeKey_VH.get(NSAccessibilityFontSizeKey_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFontSizeKey_VH.set(NSAccessibilityFontSizeKey_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMainAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMainAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMainAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMainAttribute").orElseThrow() }
private val NSAccessibilityMainAttribute_VH: VarHandle by lazy { NSAccessibilityMainAttribute_LAYOUT.varHandle() }

var NSAccessibilityMainAttribute: MemorySegment
    get() = NSAccessibilityMainAttribute_VH.get(NSAccessibilityMainAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMainAttribute_VH.set(NSAccessibilityMainAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMinimizedAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMinimizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMinimizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMinimizedAttribute").orElseThrow() }
private val NSAccessibilityMinimizedAttribute_VH: VarHandle by lazy { NSAccessibilityMinimizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityMinimizedAttribute: MemorySegment
    get() = NSAccessibilityMinimizedAttribute_VH.get(NSAccessibilityMinimizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMinimizedAttribute_VH.set(NSAccessibilityMinimizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCloseButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityCloseButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCloseButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCloseButtonAttribute").orElseThrow() }
private val NSAccessibilityCloseButtonAttribute_VH: VarHandle by lazy { NSAccessibilityCloseButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityCloseButtonAttribute: MemorySegment
    get() = NSAccessibilityCloseButtonAttribute_VH.get(NSAccessibilityCloseButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCloseButtonAttribute_VH.set(NSAccessibilityCloseButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityZoomButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityZoomButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityZoomButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityZoomButtonAttribute").orElseThrow() }
private val NSAccessibilityZoomButtonAttribute_VH: VarHandle by lazy { NSAccessibilityZoomButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityZoomButtonAttribute: MemorySegment
    get() = NSAccessibilityZoomButtonAttribute_VH.get(NSAccessibilityZoomButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityZoomButtonAttribute_VH.set(NSAccessibilityZoomButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMinimizeButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMinimizeButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMinimizeButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMinimizeButtonAttribute").orElseThrow() }
private val NSAccessibilityMinimizeButtonAttribute_VH: VarHandle by lazy { NSAccessibilityMinimizeButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityMinimizeButtonAttribute: MemorySegment
    get() = NSAccessibilityMinimizeButtonAttribute_VH.get(NSAccessibilityMinimizeButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMinimizeButtonAttribute_VH.set(NSAccessibilityMinimizeButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityToolbarButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityToolbarButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityToolbarButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityToolbarButtonAttribute").orElseThrow() }
private val NSAccessibilityToolbarButtonAttribute_VH: VarHandle by lazy { NSAccessibilityToolbarButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityToolbarButtonAttribute: MemorySegment
    get() = NSAccessibilityToolbarButtonAttribute_VH.get(NSAccessibilityToolbarButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityToolbarButtonAttribute_VH.set(NSAccessibilityToolbarButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityProxyAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityProxyAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityProxyAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityProxyAttribute").orElseThrow() }
private val NSAccessibilityProxyAttribute_VH: VarHandle by lazy { NSAccessibilityProxyAttribute_LAYOUT.varHandle() }

var NSAccessibilityProxyAttribute: MemorySegment
    get() = NSAccessibilityProxyAttribute_VH.get(NSAccessibilityProxyAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityProxyAttribute_VH.set(NSAccessibilityProxyAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityGrowAreaAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityGrowAreaAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityGrowAreaAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityGrowAreaAttribute").orElseThrow() }
private val NSAccessibilityGrowAreaAttribute_VH: VarHandle by lazy { NSAccessibilityGrowAreaAttribute_LAYOUT.varHandle() }

var NSAccessibilityGrowAreaAttribute: MemorySegment
    get() = NSAccessibilityGrowAreaAttribute_VH.get(NSAccessibilityGrowAreaAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityGrowAreaAttribute_VH.set(NSAccessibilityGrowAreaAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityModalAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityModalAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityModalAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityModalAttribute").orElseThrow() }
private val NSAccessibilityModalAttribute_VH: VarHandle by lazy { NSAccessibilityModalAttribute_LAYOUT.varHandle() }

var NSAccessibilityModalAttribute: MemorySegment
    get() = NSAccessibilityModalAttribute_VH.get(NSAccessibilityModalAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityModalAttribute_VH.set(NSAccessibilityModalAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDefaultButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDefaultButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDefaultButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDefaultButtonAttribute").orElseThrow() }
private val NSAccessibilityDefaultButtonAttribute_VH: VarHandle by lazy { NSAccessibilityDefaultButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityDefaultButtonAttribute: MemorySegment
    get() = NSAccessibilityDefaultButtonAttribute_VH.get(NSAccessibilityDefaultButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDefaultButtonAttribute_VH.set(NSAccessibilityDefaultButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCancelButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityCancelButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCancelButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCancelButtonAttribute").orElseThrow() }
private val NSAccessibilityCancelButtonAttribute_VH: VarHandle by lazy { NSAccessibilityCancelButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityCancelButtonAttribute: MemorySegment
    get() = NSAccessibilityCancelButtonAttribute_VH.get(NSAccessibilityCancelButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCancelButtonAttribute_VH.set(NSAccessibilityCancelButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFullScreenButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityFullScreenButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFullScreenButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFullScreenButtonAttribute").orElseThrow() }
private val NSAccessibilityFullScreenButtonAttribute_VH: VarHandle by lazy { NSAccessibilityFullScreenButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityFullScreenButtonAttribute: MemorySegment
    get() = NSAccessibilityFullScreenButtonAttribute_VH.get(NSAccessibilityFullScreenButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFullScreenButtonAttribute_VH.set(NSAccessibilityFullScreenButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMenuBarAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMenuBarAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMenuBarAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMenuBarAttribute").orElseThrow() }
private val NSAccessibilityMenuBarAttribute_VH: VarHandle by lazy { NSAccessibilityMenuBarAttribute_LAYOUT.varHandle() }

var NSAccessibilityMenuBarAttribute: MemorySegment
    get() = NSAccessibilityMenuBarAttribute_VH.get(NSAccessibilityMenuBarAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMenuBarAttribute_VH.set(NSAccessibilityMenuBarAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityWindowsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityWindowsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityWindowsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityWindowsAttribute").orElseThrow() }
private val NSAccessibilityWindowsAttribute_VH: VarHandle by lazy { NSAccessibilityWindowsAttribute_LAYOUT.varHandle() }

var NSAccessibilityWindowsAttribute: MemorySegment
    get() = NSAccessibilityWindowsAttribute_VH.get(NSAccessibilityWindowsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityWindowsAttribute_VH.set(NSAccessibilityWindowsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFrontmostAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityFrontmostAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFrontmostAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFrontmostAttribute").orElseThrow() }
private val NSAccessibilityFrontmostAttribute_VH: VarHandle by lazy { NSAccessibilityFrontmostAttribute_LAYOUT.varHandle() }

var NSAccessibilityFrontmostAttribute: MemorySegment
    get() = NSAccessibilityFrontmostAttribute_VH.get(NSAccessibilityFrontmostAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFrontmostAttribute_VH.set(NSAccessibilityFrontmostAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHiddenAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHiddenAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHiddenAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHiddenAttribute").orElseThrow() }
private val NSAccessibilityHiddenAttribute_VH: VarHandle by lazy { NSAccessibilityHiddenAttribute_LAYOUT.varHandle() }

var NSAccessibilityHiddenAttribute: MemorySegment
    get() = NSAccessibilityHiddenAttribute_VH.get(NSAccessibilityHiddenAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHiddenAttribute_VH.set(NSAccessibilityHiddenAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMainWindowAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMainWindowAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMainWindowAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMainWindowAttribute").orElseThrow() }
private val NSAccessibilityMainWindowAttribute_VH: VarHandle by lazy { NSAccessibilityMainWindowAttribute_LAYOUT.varHandle() }

var NSAccessibilityMainWindowAttribute: MemorySegment
    get() = NSAccessibilityMainWindowAttribute_VH.get(NSAccessibilityMainWindowAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMainWindowAttribute_VH.set(NSAccessibilityMainWindowAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFocusedWindowAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityFocusedWindowAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFocusedWindowAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFocusedWindowAttribute").orElseThrow() }
private val NSAccessibilityFocusedWindowAttribute_VH: VarHandle by lazy { NSAccessibilityFocusedWindowAttribute_LAYOUT.varHandle() }

var NSAccessibilityFocusedWindowAttribute: MemorySegment
    get() = NSAccessibilityFocusedWindowAttribute_VH.get(NSAccessibilityFocusedWindowAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFocusedWindowAttribute_VH.set(NSAccessibilityFocusedWindowAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFocusedUIElementAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityFocusedUIElementAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFocusedUIElementAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFocusedUIElementAttribute").orElseThrow() }
private val NSAccessibilityFocusedUIElementAttribute_VH: VarHandle by lazy { NSAccessibilityFocusedUIElementAttribute_LAYOUT.varHandle() }

var NSAccessibilityFocusedUIElementAttribute: MemorySegment
    get() = NSAccessibilityFocusedUIElementAttribute_VH.get(NSAccessibilityFocusedUIElementAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFocusedUIElementAttribute_VH.set(NSAccessibilityFocusedUIElementAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityExtrasMenuBarAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityExtrasMenuBarAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityExtrasMenuBarAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityExtrasMenuBarAttribute").orElseThrow() }
private val NSAccessibilityExtrasMenuBarAttribute_VH: VarHandle by lazy { NSAccessibilityExtrasMenuBarAttribute_LAYOUT.varHandle() }

var NSAccessibilityExtrasMenuBarAttribute: MemorySegment
    get() = NSAccessibilityExtrasMenuBarAttribute_VH.get(NSAccessibilityExtrasMenuBarAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityExtrasMenuBarAttribute_VH.set(NSAccessibilityExtrasMenuBarAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityOrientationAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityOrientationAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityOrientationAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityOrientationAttribute").orElseThrow() }
private val NSAccessibilityOrientationAttribute_VH: VarHandle by lazy { NSAccessibilityOrientationAttribute_LAYOUT.varHandle() }

var NSAccessibilityOrientationAttribute: MemorySegment
    get() = NSAccessibilityOrientationAttribute_VH.get(NSAccessibilityOrientationAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityOrientationAttribute_VH.set(NSAccessibilityOrientationAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVerticalOrientationValue typedef const NSAccessibilityOrientationValue = (Void)*
 */
private val NSAccessibilityVerticalOrientationValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVerticalOrientationValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVerticalOrientationValue").orElseThrow() }
private val NSAccessibilityVerticalOrientationValue_VH: VarHandle by lazy { NSAccessibilityVerticalOrientationValue_LAYOUT.varHandle() }

var NSAccessibilityVerticalOrientationValue: MemorySegment
    get() = NSAccessibilityVerticalOrientationValue_VH.get(NSAccessibilityVerticalOrientationValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVerticalOrientationValue_VH.set(NSAccessibilityVerticalOrientationValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHorizontalOrientationValue typedef const NSAccessibilityOrientationValue = (Void)*
 */
private val NSAccessibilityHorizontalOrientationValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHorizontalOrientationValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHorizontalOrientationValue").orElseThrow() }
private val NSAccessibilityHorizontalOrientationValue_VH: VarHandle by lazy { NSAccessibilityHorizontalOrientationValue_LAYOUT.varHandle() }

var NSAccessibilityHorizontalOrientationValue: MemorySegment
    get() = NSAccessibilityHorizontalOrientationValue_VH.get(NSAccessibilityHorizontalOrientationValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHorizontalOrientationValue_VH.set(NSAccessibilityHorizontalOrientationValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnknownOrientationValue typedef const NSAccessibilityOrientationValue = (Void)*
 */
private val NSAccessibilityUnknownOrientationValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnknownOrientationValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnknownOrientationValue").orElseThrow() }
private val NSAccessibilityUnknownOrientationValue_VH: VarHandle by lazy { NSAccessibilityUnknownOrientationValue_LAYOUT.varHandle() }

var NSAccessibilityUnknownOrientationValue: MemorySegment
    get() = NSAccessibilityUnknownOrientationValue_VH.get(NSAccessibilityUnknownOrientationValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnknownOrientationValue_VH.set(NSAccessibilityUnknownOrientationValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityColumnTitlesAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityColumnTitlesAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColumnTitlesAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColumnTitlesAttribute").orElseThrow() }
private val NSAccessibilityColumnTitlesAttribute_VH: VarHandle by lazy { NSAccessibilityColumnTitlesAttribute_LAYOUT.varHandle() }

var NSAccessibilityColumnTitlesAttribute: MemorySegment
    get() = NSAccessibilityColumnTitlesAttribute_VH.get(NSAccessibilityColumnTitlesAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityColumnTitlesAttribute_VH.set(NSAccessibilityColumnTitlesAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySearchButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchButtonAttribute").orElseThrow() }
private val NSAccessibilitySearchButtonAttribute_VH: VarHandle by lazy { NSAccessibilitySearchButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilitySearchButtonAttribute: MemorySegment
    get() = NSAccessibilitySearchButtonAttribute_VH.get(NSAccessibilitySearchButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySearchButtonAttribute_VH.set(NSAccessibilitySearchButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySearchMenuAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySearchMenuAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySearchMenuAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySearchMenuAttribute").orElseThrow() }
private val NSAccessibilitySearchMenuAttribute_VH: VarHandle by lazy { NSAccessibilitySearchMenuAttribute_LAYOUT.varHandle() }

var NSAccessibilitySearchMenuAttribute: MemorySegment
    get() = NSAccessibilitySearchMenuAttribute_VH.get(NSAccessibilitySearchMenuAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySearchMenuAttribute_VH.set(NSAccessibilitySearchMenuAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityClearButtonAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityClearButtonAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityClearButtonAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityClearButtonAttribute").orElseThrow() }
private val NSAccessibilityClearButtonAttribute_VH: VarHandle by lazy { NSAccessibilityClearButtonAttribute_LAYOUT.varHandle() }

var NSAccessibilityClearButtonAttribute: MemorySegment
    get() = NSAccessibilityClearButtonAttribute_VH.get(NSAccessibilityClearButtonAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityClearButtonAttribute_VH.set(NSAccessibilityClearButtonAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRowsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRowsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowsAttribute").orElseThrow() }
private val NSAccessibilityRowsAttribute_VH: VarHandle by lazy { NSAccessibilityRowsAttribute_LAYOUT.varHandle() }

var NSAccessibilityRowsAttribute: MemorySegment
    get() = NSAccessibilityRowsAttribute_VH.get(NSAccessibilityRowsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRowsAttribute_VH.set(NSAccessibilityRowsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisibleRowsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVisibleRowsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisibleRowsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisibleRowsAttribute").orElseThrow() }
private val NSAccessibilityVisibleRowsAttribute_VH: VarHandle by lazy { NSAccessibilityVisibleRowsAttribute_LAYOUT.varHandle() }

var NSAccessibilityVisibleRowsAttribute: MemorySegment
    get() = NSAccessibilityVisibleRowsAttribute_VH.get(NSAccessibilityVisibleRowsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisibleRowsAttribute_VH.set(NSAccessibilityVisibleRowsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedRowsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedRowsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedRowsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedRowsAttribute").orElseThrow() }
private val NSAccessibilitySelectedRowsAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedRowsAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedRowsAttribute: MemorySegment
    get() = NSAccessibilitySelectedRowsAttribute_VH.get(NSAccessibilitySelectedRowsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedRowsAttribute_VH.set(NSAccessibilitySelectedRowsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityColumnsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityColumnsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColumnsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColumnsAttribute").orElseThrow() }
private val NSAccessibilityColumnsAttribute_VH: VarHandle by lazy { NSAccessibilityColumnsAttribute_LAYOUT.varHandle() }

var NSAccessibilityColumnsAttribute: MemorySegment
    get() = NSAccessibilityColumnsAttribute_VH.get(NSAccessibilityColumnsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityColumnsAttribute_VH.set(NSAccessibilityColumnsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisibleColumnsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVisibleColumnsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisibleColumnsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisibleColumnsAttribute").orElseThrow() }
private val NSAccessibilityVisibleColumnsAttribute_VH: VarHandle by lazy { NSAccessibilityVisibleColumnsAttribute_LAYOUT.varHandle() }

var NSAccessibilityVisibleColumnsAttribute: MemorySegment
    get() = NSAccessibilityVisibleColumnsAttribute_VH.get(NSAccessibilityVisibleColumnsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisibleColumnsAttribute_VH.set(NSAccessibilityVisibleColumnsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedColumnsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedColumnsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedColumnsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedColumnsAttribute").orElseThrow() }
private val NSAccessibilitySelectedColumnsAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedColumnsAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedColumnsAttribute: MemorySegment
    get() = NSAccessibilitySelectedColumnsAttribute_VH.get(NSAccessibilitySelectedColumnsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedColumnsAttribute_VH.set(NSAccessibilitySelectedColumnsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySortDirectionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySortDirectionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySortDirectionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySortDirectionAttribute").orElseThrow() }
private val NSAccessibilitySortDirectionAttribute_VH: VarHandle by lazy { NSAccessibilitySortDirectionAttribute_LAYOUT.varHandle() }

var NSAccessibilitySortDirectionAttribute: MemorySegment
    get() = NSAccessibilitySortDirectionAttribute_VH.get(NSAccessibilitySortDirectionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySortDirectionAttribute_VH.set(NSAccessibilitySortDirectionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilitySelectedCellsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilitySelectedCellsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilitySelectedCellsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilitySelectedCellsAttribute").orElseThrow() }
private val NSAccessibilitySelectedCellsAttribute_VH: VarHandle by lazy { NSAccessibilitySelectedCellsAttribute_LAYOUT.varHandle() }

var NSAccessibilitySelectedCellsAttribute: MemorySegment
    get() = NSAccessibilitySelectedCellsAttribute_VH.get(NSAccessibilitySelectedCellsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilitySelectedCellsAttribute_VH.set(NSAccessibilitySelectedCellsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVisibleCellsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVisibleCellsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVisibleCellsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVisibleCellsAttribute").orElseThrow() }
private val NSAccessibilityVisibleCellsAttribute_VH: VarHandle by lazy { NSAccessibilityVisibleCellsAttribute_LAYOUT.varHandle() }

var NSAccessibilityVisibleCellsAttribute: MemorySegment
    get() = NSAccessibilityVisibleCellsAttribute_VH.get(NSAccessibilityVisibleCellsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVisibleCellsAttribute_VH.set(NSAccessibilityVisibleCellsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRowHeaderUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRowHeaderUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowHeaderUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowHeaderUIElementsAttribute").orElseThrow() }
private val NSAccessibilityRowHeaderUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilityRowHeaderUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilityRowHeaderUIElementsAttribute: MemorySegment
    get() = NSAccessibilityRowHeaderUIElementsAttribute_VH.get(NSAccessibilityRowHeaderUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRowHeaderUIElementsAttribute_VH.set(NSAccessibilityRowHeaderUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityColumnHeaderUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityColumnHeaderUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColumnHeaderUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColumnHeaderUIElementsAttribute").orElseThrow() }
private val NSAccessibilityColumnHeaderUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilityColumnHeaderUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilityColumnHeaderUIElementsAttribute: MemorySegment
    get() = NSAccessibilityColumnHeaderUIElementsAttribute_VH.get(NSAccessibilityColumnHeaderUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityColumnHeaderUIElementsAttribute_VH.set(NSAccessibilityColumnHeaderUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCellForColumnAndRowParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityCellForColumnAndRowParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCellForColumnAndRowParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCellForColumnAndRowParameterizedAttribute").orElseThrow() }
private val NSAccessibilityCellForColumnAndRowParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityCellForColumnAndRowParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityCellForColumnAndRowParameterizedAttribute: MemorySegment
    get() = NSAccessibilityCellForColumnAndRowParameterizedAttribute_VH.get(NSAccessibilityCellForColumnAndRowParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCellForColumnAndRowParameterizedAttribute_VH.set(NSAccessibilityCellForColumnAndRowParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRowIndexRangeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityRowIndexRangeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRowIndexRangeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRowIndexRangeAttribute").orElseThrow() }
private val NSAccessibilityRowIndexRangeAttribute_VH: VarHandle by lazy { NSAccessibilityRowIndexRangeAttribute_LAYOUT.varHandle() }

var NSAccessibilityRowIndexRangeAttribute: MemorySegment
    get() = NSAccessibilityRowIndexRangeAttribute_VH.get(NSAccessibilityRowIndexRangeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRowIndexRangeAttribute_VH.set(NSAccessibilityRowIndexRangeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityColumnIndexRangeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityColumnIndexRangeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityColumnIndexRangeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityColumnIndexRangeAttribute").orElseThrow() }
private val NSAccessibilityColumnIndexRangeAttribute_VH: VarHandle by lazy { NSAccessibilityColumnIndexRangeAttribute_LAYOUT.varHandle() }

var NSAccessibilityColumnIndexRangeAttribute: MemorySegment
    get() = NSAccessibilityColumnIndexRangeAttribute_VH.get(NSAccessibilityColumnIndexRangeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityColumnIndexRangeAttribute_VH.set(NSAccessibilityColumnIndexRangeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHorizontalUnitsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHorizontalUnitsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHorizontalUnitsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHorizontalUnitsAttribute").orElseThrow() }
private val NSAccessibilityHorizontalUnitsAttribute_VH: VarHandle by lazy { NSAccessibilityHorizontalUnitsAttribute_LAYOUT.varHandle() }

var NSAccessibilityHorizontalUnitsAttribute: MemorySegment
    get() = NSAccessibilityHorizontalUnitsAttribute_VH.get(NSAccessibilityHorizontalUnitsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHorizontalUnitsAttribute_VH.set(NSAccessibilityHorizontalUnitsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVerticalUnitsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVerticalUnitsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVerticalUnitsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVerticalUnitsAttribute").orElseThrow() }
private val NSAccessibilityVerticalUnitsAttribute_VH: VarHandle by lazy { NSAccessibilityVerticalUnitsAttribute_LAYOUT.varHandle() }

var NSAccessibilityVerticalUnitsAttribute: MemorySegment
    get() = NSAccessibilityVerticalUnitsAttribute_VH.get(NSAccessibilityVerticalUnitsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVerticalUnitsAttribute_VH.set(NSAccessibilityVerticalUnitsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHorizontalUnitDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHorizontalUnitDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHorizontalUnitDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHorizontalUnitDescriptionAttribute").orElseThrow() }
private val NSAccessibilityHorizontalUnitDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityHorizontalUnitDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityHorizontalUnitDescriptionAttribute: MemorySegment
    get() = NSAccessibilityHorizontalUnitDescriptionAttribute_VH.get(NSAccessibilityHorizontalUnitDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHorizontalUnitDescriptionAttribute_VH.set(NSAccessibilityHorizontalUnitDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityVerticalUnitDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityVerticalUnitDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityVerticalUnitDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityVerticalUnitDescriptionAttribute").orElseThrow() }
private val NSAccessibilityVerticalUnitDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityVerticalUnitDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityVerticalUnitDescriptionAttribute: MemorySegment
    get() = NSAccessibilityVerticalUnitDescriptionAttribute_VH.get(NSAccessibilityVerticalUnitDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityVerticalUnitDescriptionAttribute_VH.set(NSAccessibilityVerticalUnitDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLayoutPointForScreenPointParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLayoutPointForScreenPointParameterizedAttribute").orElseThrow() }
private val NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityLayoutPointForScreenPointParameterizedAttribute: MemorySegment
    get() = NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_VH.get(NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_VH.set(NSAccessibilityLayoutPointForScreenPointParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute").orElseThrow() }
private val NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute: MemorySegment
    get() = NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_VH.get(NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_VH.set(NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityScreenPointForLayoutPointParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityScreenPointForLayoutPointParameterizedAttribute").orElseThrow() }
private val NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityScreenPointForLayoutPointParameterizedAttribute: MemorySegment
    get() = NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_VH.get(NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_VH.set(NSAccessibilityScreenPointForLayoutPointParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute typedef const NSAccessibilityParameterizedAttributeName = (Void)*
 */
private val NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute").orElseThrow() }
private val NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_VH: VarHandle by lazy { NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_LAYOUT.varHandle() }

var NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute: MemorySegment
    get() = NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_VH.get(NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_VH.set(NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHandlesAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityHandlesAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHandlesAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHandlesAttribute").orElseThrow() }
private val NSAccessibilityHandlesAttribute_VH: VarHandle by lazy { NSAccessibilityHandlesAttribute_LAYOUT.varHandle() }

var NSAccessibilityHandlesAttribute: MemorySegment
    get() = NSAccessibilityHandlesAttribute_VH.get(NSAccessibilityHandlesAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHandlesAttribute_VH.set(NSAccessibilityHandlesAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAscendingSortDirectionValue typedef const NSAccessibilitySortDirectionValue = (Void)*
 */
private val NSAccessibilityAscendingSortDirectionValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAscendingSortDirectionValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAscendingSortDirectionValue").orElseThrow() }
private val NSAccessibilityAscendingSortDirectionValue_VH: VarHandle by lazy { NSAccessibilityAscendingSortDirectionValue_LAYOUT.varHandle() }

var NSAccessibilityAscendingSortDirectionValue: MemorySegment
    get() = NSAccessibilityAscendingSortDirectionValue_VH.get(NSAccessibilityAscendingSortDirectionValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAscendingSortDirectionValue_VH.set(NSAccessibilityAscendingSortDirectionValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDescendingSortDirectionValue typedef const NSAccessibilitySortDirectionValue = (Void)*
 */
private val NSAccessibilityDescendingSortDirectionValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDescendingSortDirectionValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDescendingSortDirectionValue").orElseThrow() }
private val NSAccessibilityDescendingSortDirectionValue_VH: VarHandle by lazy { NSAccessibilityDescendingSortDirectionValue_LAYOUT.varHandle() }

var NSAccessibilityDescendingSortDirectionValue: MemorySegment
    get() = NSAccessibilityDescendingSortDirectionValue_VH.get(NSAccessibilityDescendingSortDirectionValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDescendingSortDirectionValue_VH.set(NSAccessibilityDescendingSortDirectionValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnknownSortDirectionValue typedef const NSAccessibilitySortDirectionValue = (Void)*
 */
private val NSAccessibilityUnknownSortDirectionValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnknownSortDirectionValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnknownSortDirectionValue").orElseThrow() }
private val NSAccessibilityUnknownSortDirectionValue_VH: VarHandle by lazy { NSAccessibilityUnknownSortDirectionValue_LAYOUT.varHandle() }

var NSAccessibilityUnknownSortDirectionValue: MemorySegment
    get() = NSAccessibilityUnknownSortDirectionValue_VH.get(NSAccessibilityUnknownSortDirectionValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnknownSortDirectionValue_VH.set(NSAccessibilityUnknownSortDirectionValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDisclosingAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDisclosingAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDisclosingAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDisclosingAttribute").orElseThrow() }
private val NSAccessibilityDisclosingAttribute_VH: VarHandle by lazy { NSAccessibilityDisclosingAttribute_LAYOUT.varHandle() }

var NSAccessibilityDisclosingAttribute: MemorySegment
    get() = NSAccessibilityDisclosingAttribute_VH.get(NSAccessibilityDisclosingAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDisclosingAttribute_VH.set(NSAccessibilityDisclosingAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDisclosedRowsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDisclosedRowsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDisclosedRowsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDisclosedRowsAttribute").orElseThrow() }
private val NSAccessibilityDisclosedRowsAttribute_VH: VarHandle by lazy { NSAccessibilityDisclosedRowsAttribute_LAYOUT.varHandle() }

var NSAccessibilityDisclosedRowsAttribute: MemorySegment
    get() = NSAccessibilityDisclosedRowsAttribute_VH.get(NSAccessibilityDisclosedRowsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDisclosedRowsAttribute_VH.set(NSAccessibilityDisclosedRowsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDisclosedByRowAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDisclosedByRowAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDisclosedByRowAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDisclosedByRowAttribute").orElseThrow() }
private val NSAccessibilityDisclosedByRowAttribute_VH: VarHandle by lazy { NSAccessibilityDisclosedByRowAttribute_LAYOUT.varHandle() }

var NSAccessibilityDisclosedByRowAttribute: MemorySegment
    get() = NSAccessibilityDisclosedByRowAttribute_VH.get(NSAccessibilityDisclosedByRowAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDisclosedByRowAttribute_VH.set(NSAccessibilityDisclosedByRowAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDisclosureLevelAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityDisclosureLevelAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDisclosureLevelAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDisclosureLevelAttribute").orElseThrow() }
private val NSAccessibilityDisclosureLevelAttribute_VH: VarHandle by lazy { NSAccessibilityDisclosureLevelAttribute_LAYOUT.varHandle() }

var NSAccessibilityDisclosureLevelAttribute: MemorySegment
    get() = NSAccessibilityDisclosureLevelAttribute_VH.get(NSAccessibilityDisclosureLevelAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDisclosureLevelAttribute_VH.set(NSAccessibilityDisclosureLevelAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityAllowedValuesAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityAllowedValuesAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityAllowedValuesAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityAllowedValuesAttribute").orElseThrow() }
private val NSAccessibilityAllowedValuesAttribute_VH: VarHandle by lazy { NSAccessibilityAllowedValuesAttribute_LAYOUT.varHandle() }

var NSAccessibilityAllowedValuesAttribute: MemorySegment
    get() = NSAccessibilityAllowedValuesAttribute_VH.get(NSAccessibilityAllowedValuesAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityAllowedValuesAttribute_VH.set(NSAccessibilityAllowedValuesAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLabelUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityLabelUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLabelUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLabelUIElementsAttribute").orElseThrow() }
private val NSAccessibilityLabelUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilityLabelUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilityLabelUIElementsAttribute: MemorySegment
    get() = NSAccessibilityLabelUIElementsAttribute_VH.get(NSAccessibilityLabelUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLabelUIElementsAttribute_VH.set(NSAccessibilityLabelUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLabelValueAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityLabelValueAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLabelValueAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLabelValueAttribute").orElseThrow() }
private val NSAccessibilityLabelValueAttribute_VH: VarHandle by lazy { NSAccessibilityLabelValueAttribute_LAYOUT.varHandle() }

var NSAccessibilityLabelValueAttribute: MemorySegment
    get() = NSAccessibilityLabelValueAttribute_VH.get(NSAccessibilityLabelValueAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLabelValueAttribute_VH.set(NSAccessibilityLabelValueAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMatteHoleAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMatteHoleAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMatteHoleAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMatteHoleAttribute").orElseThrow() }
private val NSAccessibilityMatteHoleAttribute_VH: VarHandle by lazy { NSAccessibilityMatteHoleAttribute_LAYOUT.varHandle() }

var NSAccessibilityMatteHoleAttribute: MemorySegment
    get() = NSAccessibilityMatteHoleAttribute_VH.get(NSAccessibilityMatteHoleAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMatteHoleAttribute_VH.set(NSAccessibilityMatteHoleAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMatteContentUIElementAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMatteContentUIElementAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMatteContentUIElementAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMatteContentUIElementAttribute").orElseThrow() }
private val NSAccessibilityMatteContentUIElementAttribute_VH: VarHandle by lazy { NSAccessibilityMatteContentUIElementAttribute_LAYOUT.varHandle() }

var NSAccessibilityMatteContentUIElementAttribute: MemorySegment
    get() = NSAccessibilityMatteContentUIElementAttribute_VH.get(NSAccessibilityMatteContentUIElementAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMatteContentUIElementAttribute_VH.set(NSAccessibilityMatteContentUIElementAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMarkerUIElementsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMarkerUIElementsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMarkerUIElementsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMarkerUIElementsAttribute").orElseThrow() }
private val NSAccessibilityMarkerUIElementsAttribute_VH: VarHandle by lazy { NSAccessibilityMarkerUIElementsAttribute_LAYOUT.varHandle() }

var NSAccessibilityMarkerUIElementsAttribute: MemorySegment
    get() = NSAccessibilityMarkerUIElementsAttribute_VH.get(NSAccessibilityMarkerUIElementsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMarkerUIElementsAttribute_VH.set(NSAccessibilityMarkerUIElementsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMarkerValuesAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMarkerValuesAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMarkerValuesAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMarkerValuesAttribute").orElseThrow() }
private val NSAccessibilityMarkerValuesAttribute_VH: VarHandle by lazy { NSAccessibilityMarkerValuesAttribute_LAYOUT.varHandle() }

var NSAccessibilityMarkerValuesAttribute: MemorySegment
    get() = NSAccessibilityMarkerValuesAttribute_VH.get(NSAccessibilityMarkerValuesAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMarkerValuesAttribute_VH.set(NSAccessibilityMarkerValuesAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMarkerGroupUIElementAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMarkerGroupUIElementAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMarkerGroupUIElementAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMarkerGroupUIElementAttribute").orElseThrow() }
private val NSAccessibilityMarkerGroupUIElementAttribute_VH: VarHandle by lazy { NSAccessibilityMarkerGroupUIElementAttribute_LAYOUT.varHandle() }

var NSAccessibilityMarkerGroupUIElementAttribute: MemorySegment
    get() = NSAccessibilityMarkerGroupUIElementAttribute_VH.get(NSAccessibilityMarkerGroupUIElementAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMarkerGroupUIElementAttribute_VH.set(NSAccessibilityMarkerGroupUIElementAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnitsAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityUnitsAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnitsAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnitsAttribute").orElseThrow() }
private val NSAccessibilityUnitsAttribute_VH: VarHandle by lazy { NSAccessibilityUnitsAttribute_LAYOUT.varHandle() }

var NSAccessibilityUnitsAttribute: MemorySegment
    get() = NSAccessibilityUnitsAttribute_VH.get(NSAccessibilityUnitsAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnitsAttribute_VH.set(NSAccessibilityUnitsAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnitDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityUnitDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnitDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnitDescriptionAttribute").orElseThrow() }
private val NSAccessibilityUnitDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityUnitDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityUnitDescriptionAttribute: MemorySegment
    get() = NSAccessibilityUnitDescriptionAttribute_VH.get(NSAccessibilityUnitDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnitDescriptionAttribute_VH.set(NSAccessibilityUnitDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMarkerTypeAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMarkerTypeAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMarkerTypeAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMarkerTypeAttribute").orElseThrow() }
private val NSAccessibilityMarkerTypeAttribute_VH: VarHandle by lazy { NSAccessibilityMarkerTypeAttribute_LAYOUT.varHandle() }

var NSAccessibilityMarkerTypeAttribute: MemorySegment
    get() = NSAccessibilityMarkerTypeAttribute_VH.get(NSAccessibilityMarkerTypeAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMarkerTypeAttribute_VH.set(NSAccessibilityMarkerTypeAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityMarkerTypeDescriptionAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityMarkerTypeDescriptionAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityMarkerTypeDescriptionAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityMarkerTypeDescriptionAttribute").orElseThrow() }
private val NSAccessibilityMarkerTypeDescriptionAttribute_VH: VarHandle by lazy { NSAccessibilityMarkerTypeDescriptionAttribute_LAYOUT.varHandle() }

var NSAccessibilityMarkerTypeDescriptionAttribute: MemorySegment
    get() = NSAccessibilityMarkerTypeDescriptionAttribute_VH.get(NSAccessibilityMarkerTypeDescriptionAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityMarkerTypeDescriptionAttribute_VH.set(NSAccessibilityMarkerTypeDescriptionAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityIdentifierAttribute typedef const NSAccessibilityAttributeName = (Void)*
 */
private val NSAccessibilityIdentifierAttribute_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIdentifierAttribute_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIdentifierAttribute").orElseThrow() }
private val NSAccessibilityIdentifierAttribute_VH: VarHandle by lazy { NSAccessibilityIdentifierAttribute_LAYOUT.varHandle() }

var NSAccessibilityIdentifierAttribute: MemorySegment
    get() = NSAccessibilityIdentifierAttribute_VH.get(NSAccessibilityIdentifierAttribute_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityIdentifierAttribute_VH.set(NSAccessibilityIdentifierAttribute_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityLeftTabStopMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityLeftTabStopMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityLeftTabStopMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityLeftTabStopMarkerTypeValue").orElseThrow() }
private val NSAccessibilityLeftTabStopMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityLeftTabStopMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityLeftTabStopMarkerTypeValue: MemorySegment
    get() = NSAccessibilityLeftTabStopMarkerTypeValue_VH.get(NSAccessibilityLeftTabStopMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityLeftTabStopMarkerTypeValue_VH.set(NSAccessibilityLeftTabStopMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRightTabStopMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityRightTabStopMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRightTabStopMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRightTabStopMarkerTypeValue").orElseThrow() }
private val NSAccessibilityRightTabStopMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityRightTabStopMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityRightTabStopMarkerTypeValue: MemorySegment
    get() = NSAccessibilityRightTabStopMarkerTypeValue_VH.get(NSAccessibilityRightTabStopMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRightTabStopMarkerTypeValue_VH.set(NSAccessibilityRightTabStopMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCenterTabStopMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityCenterTabStopMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCenterTabStopMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCenterTabStopMarkerTypeValue").orElseThrow() }
private val NSAccessibilityCenterTabStopMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityCenterTabStopMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityCenterTabStopMarkerTypeValue: MemorySegment
    get() = NSAccessibilityCenterTabStopMarkerTypeValue_VH.get(NSAccessibilityCenterTabStopMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCenterTabStopMarkerTypeValue_VH.set(NSAccessibilityCenterTabStopMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDecimalTabStopMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityDecimalTabStopMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDecimalTabStopMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDecimalTabStopMarkerTypeValue").orElseThrow() }
private val NSAccessibilityDecimalTabStopMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityDecimalTabStopMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityDecimalTabStopMarkerTypeValue: MemorySegment
    get() = NSAccessibilityDecimalTabStopMarkerTypeValue_VH.get(NSAccessibilityDecimalTabStopMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDecimalTabStopMarkerTypeValue_VH.set(NSAccessibilityDecimalTabStopMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityHeadIndentMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityHeadIndentMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityHeadIndentMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityHeadIndentMarkerTypeValue").orElseThrow() }
private val NSAccessibilityHeadIndentMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityHeadIndentMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityHeadIndentMarkerTypeValue: MemorySegment
    get() = NSAccessibilityHeadIndentMarkerTypeValue_VH.get(NSAccessibilityHeadIndentMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityHeadIndentMarkerTypeValue_VH.set(NSAccessibilityHeadIndentMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityTailIndentMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityTailIndentMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityTailIndentMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityTailIndentMarkerTypeValue").orElseThrow() }
private val NSAccessibilityTailIndentMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityTailIndentMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityTailIndentMarkerTypeValue: MemorySegment
    get() = NSAccessibilityTailIndentMarkerTypeValue_VH.get(NSAccessibilityTailIndentMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityTailIndentMarkerTypeValue_VH.set(NSAccessibilityTailIndentMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityFirstLineIndentMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityFirstLineIndentMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityFirstLineIndentMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityFirstLineIndentMarkerTypeValue").orElseThrow() }
private val NSAccessibilityFirstLineIndentMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityFirstLineIndentMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityFirstLineIndentMarkerTypeValue: MemorySegment
    get() = NSAccessibilityFirstLineIndentMarkerTypeValue_VH.get(NSAccessibilityFirstLineIndentMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityFirstLineIndentMarkerTypeValue_VH.set(NSAccessibilityFirstLineIndentMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnknownMarkerTypeValue typedef const NSAccessibilityRulerMarkerTypeValue = (Void)*
 */
private val NSAccessibilityUnknownMarkerTypeValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnknownMarkerTypeValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnknownMarkerTypeValue").orElseThrow() }
private val NSAccessibilityUnknownMarkerTypeValue_VH: VarHandle by lazy { NSAccessibilityUnknownMarkerTypeValue_LAYOUT.varHandle() }

var NSAccessibilityUnknownMarkerTypeValue: MemorySegment
    get() = NSAccessibilityUnknownMarkerTypeValue_VH.get(NSAccessibilityUnknownMarkerTypeValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnknownMarkerTypeValue_VH.set(NSAccessibilityUnknownMarkerTypeValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityInchesUnitValue typedef const NSAccessibilityRulerUnitValue = (Void)*
 */
private val NSAccessibilityInchesUnitValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityInchesUnitValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityInchesUnitValue").orElseThrow() }
private val NSAccessibilityInchesUnitValue_VH: VarHandle by lazy { NSAccessibilityInchesUnitValue_LAYOUT.varHandle() }

var NSAccessibilityInchesUnitValue: MemorySegment
    get() = NSAccessibilityInchesUnitValue_VH.get(NSAccessibilityInchesUnitValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityInchesUnitValue_VH.set(NSAccessibilityInchesUnitValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCentimetersUnitValue typedef const NSAccessibilityRulerUnitValue = (Void)*
 */
private val NSAccessibilityCentimetersUnitValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCentimetersUnitValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCentimetersUnitValue").orElseThrow() }
private val NSAccessibilityCentimetersUnitValue_VH: VarHandle by lazy { NSAccessibilityCentimetersUnitValue_LAYOUT.varHandle() }

var NSAccessibilityCentimetersUnitValue: MemorySegment
    get() = NSAccessibilityCentimetersUnitValue_VH.get(NSAccessibilityCentimetersUnitValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCentimetersUnitValue_VH.set(NSAccessibilityCentimetersUnitValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPointsUnitValue typedef const NSAccessibilityRulerUnitValue = (Void)*
 */
private val NSAccessibilityPointsUnitValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPointsUnitValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPointsUnitValue").orElseThrow() }
private val NSAccessibilityPointsUnitValue_VH: VarHandle by lazy { NSAccessibilityPointsUnitValue_LAYOUT.varHandle() }

var NSAccessibilityPointsUnitValue: MemorySegment
    get() = NSAccessibilityPointsUnitValue_VH.get(NSAccessibilityPointsUnitValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPointsUnitValue_VH.set(NSAccessibilityPointsUnitValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPicasUnitValue typedef const NSAccessibilityRulerUnitValue = (Void)*
 */
private val NSAccessibilityPicasUnitValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPicasUnitValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPicasUnitValue").orElseThrow() }
private val NSAccessibilityPicasUnitValue_VH: VarHandle by lazy { NSAccessibilityPicasUnitValue_LAYOUT.varHandle() }

var NSAccessibilityPicasUnitValue: MemorySegment
    get() = NSAccessibilityPicasUnitValue_VH.get(NSAccessibilityPicasUnitValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPicasUnitValue_VH.set(NSAccessibilityPicasUnitValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityUnknownUnitValue typedef const NSAccessibilityRulerUnitValue = (Void)*
 */
private val NSAccessibilityUnknownUnitValue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityUnknownUnitValue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityUnknownUnitValue").orElseThrow() }
private val NSAccessibilityUnknownUnitValue_VH: VarHandle by lazy { NSAccessibilityUnknownUnitValue_LAYOUT.varHandle() }

var NSAccessibilityUnknownUnitValue: MemorySegment
    get() = NSAccessibilityUnknownUnitValue_VH.get(NSAccessibilityUnknownUnitValue_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityUnknownUnitValue_VH.set(NSAccessibilityUnknownUnitValue_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPressAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityPressAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPressAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPressAction").orElseThrow() }
private val NSAccessibilityPressAction_VH: VarHandle by lazy { NSAccessibilityPressAction_LAYOUT.varHandle() }

var NSAccessibilityPressAction: MemorySegment
    get() = NSAccessibilityPressAction_VH.get(NSAccessibilityPressAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPressAction_VH.set(NSAccessibilityPressAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityIncrementAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityIncrementAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityIncrementAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityIncrementAction").orElseThrow() }
private val NSAccessibilityIncrementAction_VH: VarHandle by lazy { NSAccessibilityIncrementAction_LAYOUT.varHandle() }

var NSAccessibilityIncrementAction: MemorySegment
    get() = NSAccessibilityIncrementAction_VH.get(NSAccessibilityIncrementAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityIncrementAction_VH.set(NSAccessibilityIncrementAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDecrementAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityDecrementAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDecrementAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDecrementAction").orElseThrow() }
private val NSAccessibilityDecrementAction_VH: VarHandle by lazy { NSAccessibilityDecrementAction_LAYOUT.varHandle() }

var NSAccessibilityDecrementAction: MemorySegment
    get() = NSAccessibilityDecrementAction_VH.get(NSAccessibilityDecrementAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDecrementAction_VH.set(NSAccessibilityDecrementAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityConfirmAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityConfirmAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityConfirmAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityConfirmAction").orElseThrow() }
private val NSAccessibilityConfirmAction_VH: VarHandle by lazy { NSAccessibilityConfirmAction_LAYOUT.varHandle() }

var NSAccessibilityConfirmAction: MemorySegment
    get() = NSAccessibilityConfirmAction_VH.get(NSAccessibilityConfirmAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityConfirmAction_VH.set(NSAccessibilityConfirmAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityPickAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityPickAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityPickAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityPickAction").orElseThrow() }
private val NSAccessibilityPickAction_VH: VarHandle by lazy { NSAccessibilityPickAction_LAYOUT.varHandle() }

var NSAccessibilityPickAction: MemorySegment
    get() = NSAccessibilityPickAction_VH.get(NSAccessibilityPickAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityPickAction_VH.set(NSAccessibilityPickAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityCancelAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityCancelAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityCancelAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityCancelAction").orElseThrow() }
private val NSAccessibilityCancelAction_VH: VarHandle by lazy { NSAccessibilityCancelAction_LAYOUT.varHandle() }

var NSAccessibilityCancelAction: MemorySegment
    get() = NSAccessibilityCancelAction_VH.get(NSAccessibilityCancelAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityCancelAction_VH.set(NSAccessibilityCancelAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityRaiseAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityRaiseAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityRaiseAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityRaiseAction").orElseThrow() }
private val NSAccessibilityRaiseAction_VH: VarHandle by lazy { NSAccessibilityRaiseAction_LAYOUT.varHandle() }

var NSAccessibilityRaiseAction: MemorySegment
    get() = NSAccessibilityRaiseAction_VH.get(NSAccessibilityRaiseAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityRaiseAction_VH.set(NSAccessibilityRaiseAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityShowMenuAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityShowMenuAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityShowMenuAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityShowMenuAction").orElseThrow() }
private val NSAccessibilityShowMenuAction_VH: VarHandle by lazy { NSAccessibilityShowMenuAction_LAYOUT.varHandle() }

var NSAccessibilityShowMenuAction: MemorySegment
    get() = NSAccessibilityShowMenuAction_VH.get(NSAccessibilityShowMenuAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityShowMenuAction_VH.set(NSAccessibilityShowMenuAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityDeleteAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityDeleteAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityDeleteAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityDeleteAction").orElseThrow() }
private val NSAccessibilityDeleteAction_VH: VarHandle by lazy { NSAccessibilityDeleteAction_LAYOUT.varHandle() }

var NSAccessibilityDeleteAction: MemorySegment
    get() = NSAccessibilityDeleteAction_VH.get(NSAccessibilityDeleteAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityDeleteAction_VH.set(NSAccessibilityDeleteAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityScrollToVisibleAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityScrollToVisibleAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityScrollToVisibleAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityScrollToVisibleAction").orElseThrow() }
private val NSAccessibilityScrollToVisibleAction_VH: VarHandle by lazy { NSAccessibilityScrollToVisibleAction_LAYOUT.varHandle() }

var NSAccessibilityScrollToVisibleAction: MemorySegment
    get() = NSAccessibilityScrollToVisibleAction_VH.get(NSAccessibilityScrollToVisibleAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityScrollToVisibleAction_VH.set(NSAccessibilityScrollToVisibleAction_SEGMENT, value)

/**
 * {@snippet lang=c : NSAccessibilityShowAlternateUIAction typedef const NSAccessibilityActionName = (Void)*
 */
private val NSAccessibilityShowAlternateUIAction_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAccessibilityShowAlternateUIAction_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAccessibilityShowAlternateUIAction").orElseThrow() }
private val NSAccessibilityShowAlternateUIAction_VH: VarHandle by lazy { NSAccessibilityShowAlternateUIAction_LAYOUT.varHandle() }

var NSAccessibilityShowAlternateUIAction: MemorySegment
    get() = NSAccessibilityShowAlternateUIAction_VH.get(NSAccessibilityShowAlternateUIAction_SEGMENT) as MemorySegment
    set(value) = NSAccessibilityShowAlternateUIAction_VH.set(NSAccessibilityShowAlternateUIAction_SEGMENT, value)
