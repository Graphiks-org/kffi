@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : CGContextDrawLayerInRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGRect = Declared(CGRect),typedef CGLayerRef = (Declared(CGLayer))*)
 */
private val CGContextDrawLayerInRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS)
private val CGContextDrawLayerInRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawLayerInRect").orElseThrow()
private val CGContextDrawLayerInRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawLayerInRect_ADDR, CGContextDrawLayerInRect_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextDrawLayerInRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextDrawLayerInRect_HANDLE.invokeExact(arg0, arg1, arg2)
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
fun CGContextDrawLayerInRect(arg0: MemorySegment, arg1: CGRect, arg2: MemorySegment): Unit {
    CGContextDrawLayerInRect(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGContextDrawLayerAtPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPoint = Declared(CGPoint),typedef CGLayerRef = (Declared(CGLayer))*)
 */
private val CGContextDrawLayerAtPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGPoint.layout, ValueLayout.ADDRESS)
private val CGContextDrawLayerAtPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGContextDrawLayerAtPoint").orElseThrow()
private val CGContextDrawLayerAtPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGContextDrawLayerAtPoint_ADDR, CGContextDrawLayerAtPoint_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGContextDrawLayerAtPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGContextDrawLayerAtPoint_HANDLE.invokeExact(arg0, arg1, arg2)
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
fun CGContextDrawLayerAtPoint(arg0: MemorySegment, arg1: CGPoint, arg2: MemorySegment): Unit {
    CGContextDrawLayerAtPoint(arg0, arg1.segment, arg2)
}

/**
 * {@snippet lang=c : CGLayerGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGLayerGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGLayerGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGLayerGetTypeID").orElseThrow()
private val CGLayerGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGLayerGetTypeID_ADDR, CGLayerGetTypeID_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGLayerGetTypeID(): Long {
    try {
        return CGLayerGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContentStreamCreateWithPage typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*(typedef CGPDFPageRef = (Declared(CGPDFPage))*)
 */
private val CGPDFContentStreamCreateWithPage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContentStreamCreateWithPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContentStreamCreateWithPage").orElseThrow()
private val CGPDFContentStreamCreateWithPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContentStreamCreateWithPage_ADDR, CGPDFContentStreamCreateWithPage_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContentStreamCreateWithPage(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFContentStreamCreateWithPage_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContentStreamCreateWithStream typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*(typedef CGPDFStreamRef = (Declared(CGPDFStream))*,typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*,typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*)
 */
private val CGPDFContentStreamCreateWithStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContentStreamCreateWithStream_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContentStreamCreateWithStream").orElseThrow()
private val CGPDFContentStreamCreateWithStream_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContentStreamCreateWithStream_ADDR, CGPDFContentStreamCreateWithStream_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContentStreamCreateWithStream(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGPDFContentStreamCreateWithStream_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContentStreamRetain typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*(typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*)
 */
private val CGPDFContentStreamRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContentStreamRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContentStreamRetain").orElseThrow()
private val CGPDFContentStreamRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContentStreamRetain_ADDR, CGPDFContentStreamRetain_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContentStreamRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFContentStreamRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContentStreamRelease Void(typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*)
 */
private val CGPDFContentStreamRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFContentStreamRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContentStreamRelease").orElseThrow()
private val CGPDFContentStreamRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContentStreamRelease_ADDR, CGPDFContentStreamRelease_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContentStreamRelease(arg0: MemorySegment): Unit {
    try {
        CGPDFContentStreamRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContentStreamGetStreams typedef CFArrayRef = (Declared(__CFArray))*(typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*)
 */
private val CGPDFContentStreamGetStreams_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContentStreamGetStreams_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContentStreamGetStreams").orElseThrow()
private val CGPDFContentStreamGetStreams_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContentStreamGetStreams_ADDR, CGPDFContentStreamGetStreams_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContentStreamGetStreams(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFContentStreamGetStreams_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContentStreamGetResource typedef CGPDFObjectRef = (Declared(CGPDFObject))*(typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*,(Char)*,(Char)*)
 */
private val CGPDFContentStreamGetResource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContentStreamGetResource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContentStreamGetResource").orElseThrow()
private val CGPDFContentStreamGetResource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContentStreamGetResource_ADDR, CGPDFContentStreamGetResource_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContentStreamGetResource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGPDFContentStreamGetResource_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextCreate typedef CGContextRef = (Declared(CGContext))*(typedef CGDataConsumerRef = (Declared(CGDataConsumer))*,(typedef CGRect = Declared(CGRect))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPDFContextCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextCreate").orElseThrow()
private val CGPDFContextCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextCreate_ADDR, CGPDFContextCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFContextCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGPDFContextCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextCreateWithURL typedef CGContextRef = (Declared(CGContext))*(typedef CFURLRef = (Declared(__CFURL))*,(typedef CGRect = Declared(CGRect))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPDFContextCreateWithURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextCreateWithURL_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextCreateWithURL").orElseThrow()
private val CGPDFContextCreateWithURL_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextCreateWithURL_ADDR, CGPDFContextCreateWithURL_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGPDFContextCreateWithURL(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGPDFContextCreateWithURL_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextClose Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGPDFContextClose_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFContextClose_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextClose").orElseThrow()
private val CGPDFContextClose_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextClose_ADDR, CGPDFContextClose_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGPDFContextClose(arg0: MemorySegment): Unit {
    try {
        CGPDFContextClose_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextBeginPage Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPDFContextBeginPage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextBeginPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextBeginPage").orElseThrow()
private val CGPDFContextBeginPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextBeginPage_ADDR, CGPDFContextBeginPage_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContextBeginPage(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPDFContextBeginPage_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextEndPage Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGPDFContextEndPage_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFContextEndPage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextEndPage").orElseThrow()
private val CGPDFContextEndPage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextEndPage_ADDR, CGPDFContextEndPage_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContextEndPage(arg0: MemorySegment): Unit {
    try {
        CGPDFContextEndPage_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextAddDocumentMetadata Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CGPDFContextAddDocumentMetadata_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextAddDocumentMetadata_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextAddDocumentMetadata").orElseThrow()
private val CGPDFContextAddDocumentMetadata_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextAddDocumentMetadata_ADDR, CGPDFContextAddDocumentMetadata_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun CGPDFContextAddDocumentMetadata(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPDFContextAddDocumentMetadata_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextSetParentTree Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*)
 */
private val CGPDFContextSetParentTree_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextSetParentTree_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextSetParentTree").orElseThrow()
private val CGPDFContextSetParentTree_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextSetParentTree_ADDR, CGPDFContextSetParentTree_DESC)

fun CGPDFContextSetParentTree(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPDFContextSetParentTree_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextSetIDTree Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*)
 */
private val CGPDFContextSetIDTree_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextSetIDTree_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextSetIDTree").orElseThrow()
private val CGPDFContextSetIDTree_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextSetIDTree_ADDR, CGPDFContextSetIDTree_DESC)

fun CGPDFContextSetIDTree(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPDFContextSetIDTree_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextSetPageTagStructureTree Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPDFContextSetPageTagStructureTree_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextSetPageTagStructureTree_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextSetPageTagStructureTree").orElseThrow()
private val CGPDFContextSetPageTagStructureTree_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextSetPageTagStructureTree_ADDR, CGPDFContextSetPageTagStructureTree_DESC)

fun CGPDFContextSetPageTagStructureTree(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPDFContextSetPageTagStructureTree_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextSetURLForRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CGRect = Declared(CGRect))
 */
private val CGPDFContextSetURLForRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout)
private val CGPDFContextSetURLForRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextSetURLForRect").orElseThrow()
private val CGPDFContextSetURLForRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextSetURLForRect_ADDR, CGPDFContextSetURLForRect_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContextSetURLForRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFContextSetURLForRect_HANDLE.invokeExact(arg0, arg1, arg2)
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
fun CGPDFContextSetURLForRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect): Unit {
    CGPDFContextSetURLForRect(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : CGPDFContextAddDestinationAtPoint Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFStringRef = (Declared(__CFString))*,typedef CGPoint = Declared(CGPoint))
 */
private val CGPDFContextAddDestinationAtPoint_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGPoint.layout)
private val CGPDFContextAddDestinationAtPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextAddDestinationAtPoint").orElseThrow()
private val CGPDFContextAddDestinationAtPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextAddDestinationAtPoint_ADDR, CGPDFContextAddDestinationAtPoint_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContextAddDestinationAtPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFContextAddDestinationAtPoint_HANDLE.invokeExact(arg0, arg1, arg2)
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
fun CGPDFContextAddDestinationAtPoint(arg0: MemorySegment, arg1: MemorySegment, arg2: CGPoint): Unit {
    CGPDFContextAddDestinationAtPoint(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : CGPDFContextSetDestinationForRect Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFStringRef = (Declared(__CFString))*,typedef CGRect = Declared(CGRect))
 */
private val CGPDFContextSetDestinationForRect_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CGRect.layout)
private val CGPDFContextSetDestinationForRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextSetDestinationForRect").orElseThrow()
private val CGPDFContextSetDestinationForRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextSetDestinationForRect_ADDR, CGPDFContextSetDestinationForRect_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFContextSetDestinationForRect(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFContextSetDestinationForRect_HANDLE.invokeExact(arg0, arg1, arg2)
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
fun CGPDFContextSetDestinationForRect(arg0: MemorySegment, arg1: MemorySegment, arg2: CGRect): Unit {
    CGPDFContextSetDestinationForRect(arg0, arg1, arg2.segment)
}

/**
 * {@snippet lang=c : kCGPDFContextMediaBox typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextMediaBox_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextMediaBox_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextMediaBox").orElseThrow().reinterpret(kCGPDFContextMediaBox_LAYOUT.byteSize()) }
private val kCGPDFContextMediaBox_VH: VarHandle by lazy { kCGPDFContextMediaBox_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextMediaBox: MemorySegment
    get() = kCGPDFContextMediaBox_VH.get(kCGPDFContextMediaBox_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextMediaBox_VH.set(kCGPDFContextMediaBox_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextCropBox typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextCropBox_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextCropBox_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextCropBox").orElseThrow().reinterpret(kCGPDFContextCropBox_LAYOUT.byteSize()) }
private val kCGPDFContextCropBox_VH: VarHandle by lazy { kCGPDFContextCropBox_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextCropBox: MemorySegment
    get() = kCGPDFContextCropBox_VH.get(kCGPDFContextCropBox_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextCropBox_VH.set(kCGPDFContextCropBox_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextBleedBox typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextBleedBox_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextBleedBox_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextBleedBox").orElseThrow().reinterpret(kCGPDFContextBleedBox_LAYOUT.byteSize()) }
private val kCGPDFContextBleedBox_VH: VarHandle by lazy { kCGPDFContextBleedBox_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextBleedBox: MemorySegment
    get() = kCGPDFContextBleedBox_VH.get(kCGPDFContextBleedBox_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextBleedBox_VH.set(kCGPDFContextBleedBox_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextTrimBox typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextTrimBox_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextTrimBox_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextTrimBox").orElseThrow().reinterpret(kCGPDFContextTrimBox_LAYOUT.byteSize()) }
private val kCGPDFContextTrimBox_VH: VarHandle by lazy { kCGPDFContextTrimBox_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextTrimBox: MemorySegment
    get() = kCGPDFContextTrimBox_VH.get(kCGPDFContextTrimBox_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextTrimBox_VH.set(kCGPDFContextTrimBox_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextArtBox typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextArtBox_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextArtBox_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextArtBox").orElseThrow().reinterpret(kCGPDFContextArtBox_LAYOUT.byteSize()) }
private val kCGPDFContextArtBox_VH: VarHandle by lazy { kCGPDFContextArtBox_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextArtBox: MemorySegment
    get() = kCGPDFContextArtBox_VH.get(kCGPDFContextArtBox_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextArtBox_VH.set(kCGPDFContextArtBox_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextTitle typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextTitle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextTitle_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextTitle").orElseThrow().reinterpret(kCGPDFContextTitle_LAYOUT.byteSize()) }
private val kCGPDFContextTitle_VH: VarHandle by lazy { kCGPDFContextTitle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextTitle: MemorySegment
    get() = kCGPDFContextTitle_VH.get(kCGPDFContextTitle_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextTitle_VH.set(kCGPDFContextTitle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextAuthor typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextAuthor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextAuthor_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextAuthor").orElseThrow().reinterpret(kCGPDFContextAuthor_LAYOUT.byteSize()) }
private val kCGPDFContextAuthor_VH: VarHandle by lazy { kCGPDFContextAuthor_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextAuthor: MemorySegment
    get() = kCGPDFContextAuthor_VH.get(kCGPDFContextAuthor_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextAuthor_VH.set(kCGPDFContextAuthor_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextSubject typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextSubject_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextSubject_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextSubject").orElseThrow().reinterpret(kCGPDFContextSubject_LAYOUT.byteSize()) }
private val kCGPDFContextSubject_VH: VarHandle by lazy { kCGPDFContextSubject_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGPDFContextSubject: MemorySegment
    get() = kCGPDFContextSubject_VH.get(kCGPDFContextSubject_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextSubject_VH.set(kCGPDFContextSubject_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextKeywords typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextKeywords_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextKeywords_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextKeywords").orElseThrow().reinterpret(kCGPDFContextKeywords_LAYOUT.byteSize()) }
private val kCGPDFContextKeywords_VH: VarHandle by lazy { kCGPDFContextKeywords_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGPDFContextKeywords: MemorySegment
    get() = kCGPDFContextKeywords_VH.get(kCGPDFContextKeywords_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextKeywords_VH.set(kCGPDFContextKeywords_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextCreator typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextCreator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextCreator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextCreator").orElseThrow().reinterpret(kCGPDFContextCreator_LAYOUT.byteSize()) }
private val kCGPDFContextCreator_VH: VarHandle by lazy { kCGPDFContextCreator_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextCreator: MemorySegment
    get() = kCGPDFContextCreator_VH.get(kCGPDFContextCreator_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextCreator_VH.set(kCGPDFContextCreator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextOwnerPassword typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextOwnerPassword_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextOwnerPassword_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextOwnerPassword").orElseThrow().reinterpret(kCGPDFContextOwnerPassword_LAYOUT.byteSize()) }
private val kCGPDFContextOwnerPassword_VH: VarHandle by lazy { kCGPDFContextOwnerPassword_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextOwnerPassword: MemorySegment
    get() = kCGPDFContextOwnerPassword_VH.get(kCGPDFContextOwnerPassword_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextOwnerPassword_VH.set(kCGPDFContextOwnerPassword_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextUserPassword typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextUserPassword_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextUserPassword_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextUserPassword").orElseThrow().reinterpret(kCGPDFContextUserPassword_LAYOUT.byteSize()) }
private val kCGPDFContextUserPassword_VH: VarHandle by lazy { kCGPDFContextUserPassword_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextUserPassword: MemorySegment
    get() = kCGPDFContextUserPassword_VH.get(kCGPDFContextUserPassword_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextUserPassword_VH.set(kCGPDFContextUserPassword_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextEncryptionKeyLength typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextEncryptionKeyLength_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextEncryptionKeyLength_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextEncryptionKeyLength").orElseThrow().reinterpret(kCGPDFContextEncryptionKeyLength_LAYOUT.byteSize()) }
private val kCGPDFContextEncryptionKeyLength_VH: VarHandle by lazy { kCGPDFContextEncryptionKeyLength_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGPDFContextEncryptionKeyLength: MemorySegment
    get() = kCGPDFContextEncryptionKeyLength_VH.get(kCGPDFContextEncryptionKeyLength_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextEncryptionKeyLength_VH.set(kCGPDFContextEncryptionKeyLength_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextAllowsPrinting typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextAllowsPrinting_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextAllowsPrinting_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextAllowsPrinting").orElseThrow().reinterpret(kCGPDFContextAllowsPrinting_LAYOUT.byteSize()) }
private val kCGPDFContextAllowsPrinting_VH: VarHandle by lazy { kCGPDFContextAllowsPrinting_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextAllowsPrinting: MemorySegment
    get() = kCGPDFContextAllowsPrinting_VH.get(kCGPDFContextAllowsPrinting_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextAllowsPrinting_VH.set(kCGPDFContextAllowsPrinting_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextAllowsCopying typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextAllowsCopying_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextAllowsCopying_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextAllowsCopying").orElseThrow().reinterpret(kCGPDFContextAllowsCopying_LAYOUT.byteSize()) }
private val kCGPDFContextAllowsCopying_VH: VarHandle by lazy { kCGPDFContextAllowsCopying_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextAllowsCopying: MemorySegment
    get() = kCGPDFContextAllowsCopying_VH.get(kCGPDFContextAllowsCopying_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextAllowsCopying_VH.set(kCGPDFContextAllowsCopying_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextOutputIntent typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextOutputIntent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextOutputIntent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextOutputIntent").orElseThrow().reinterpret(kCGPDFContextOutputIntent_LAYOUT.byteSize()) }
private val kCGPDFContextOutputIntent_VH: VarHandle by lazy { kCGPDFContextOutputIntent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextOutputIntent: MemorySegment
    get() = kCGPDFContextOutputIntent_VH.get(kCGPDFContextOutputIntent_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextOutputIntent_VH.set(kCGPDFContextOutputIntent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFXOutputIntentSubtype typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFXOutputIntentSubtype_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFXOutputIntentSubtype_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFXOutputIntentSubtype").orElseThrow().reinterpret(kCGPDFXOutputIntentSubtype_LAYOUT.byteSize()) }
private val kCGPDFXOutputIntentSubtype_VH: VarHandle by lazy { kCGPDFXOutputIntentSubtype_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFXOutputIntentSubtype: MemorySegment
    get() = kCGPDFXOutputIntentSubtype_VH.get(kCGPDFXOutputIntentSubtype_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFXOutputIntentSubtype_VH.set(kCGPDFXOutputIntentSubtype_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFXOutputConditionIdentifier typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFXOutputConditionIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFXOutputConditionIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFXOutputConditionIdentifier").orElseThrow().reinterpret(kCGPDFXOutputConditionIdentifier_LAYOUT.byteSize()) }
private val kCGPDFXOutputConditionIdentifier_VH: VarHandle by lazy { kCGPDFXOutputConditionIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFXOutputConditionIdentifier: MemorySegment
    get() = kCGPDFXOutputConditionIdentifier_VH.get(kCGPDFXOutputConditionIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFXOutputConditionIdentifier_VH.set(kCGPDFXOutputConditionIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFXOutputCondition typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFXOutputCondition_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFXOutputCondition_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFXOutputCondition").orElseThrow().reinterpret(kCGPDFXOutputCondition_LAYOUT.byteSize()) }
private val kCGPDFXOutputCondition_VH: VarHandle by lazy { kCGPDFXOutputCondition_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFXOutputCondition: MemorySegment
    get() = kCGPDFXOutputCondition_VH.get(kCGPDFXOutputCondition_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFXOutputCondition_VH.set(kCGPDFXOutputCondition_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFXRegistryName typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFXRegistryName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFXRegistryName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFXRegistryName").orElseThrow().reinterpret(kCGPDFXRegistryName_LAYOUT.byteSize()) }
private val kCGPDFXRegistryName_VH: VarHandle by lazy { kCGPDFXRegistryName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFXRegistryName: MemorySegment
    get() = kCGPDFXRegistryName_VH.get(kCGPDFXRegistryName_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFXRegistryName_VH.set(kCGPDFXRegistryName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFXInfo typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFXInfo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFXInfo_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFXInfo").orElseThrow().reinterpret(kCGPDFXInfo_LAYOUT.byteSize()) }
private val kCGPDFXInfo_VH: VarHandle by lazy { kCGPDFXInfo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFXInfo: MemorySegment
    get() = kCGPDFXInfo_VH.get(kCGPDFXInfo_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFXInfo_VH.set(kCGPDFXInfo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFXDestinationOutputProfile typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFXDestinationOutputProfile_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFXDestinationOutputProfile_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFXDestinationOutputProfile").orElseThrow().reinterpret(kCGPDFXDestinationOutputProfile_LAYOUT.byteSize()) }
private val kCGPDFXDestinationOutputProfile_VH: VarHandle by lazy { kCGPDFXDestinationOutputProfile_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFXDestinationOutputProfile: MemorySegment
    get() = kCGPDFXDestinationOutputProfile_VH.get(kCGPDFXDestinationOutputProfile_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFXDestinationOutputProfile_VH.set(kCGPDFXDestinationOutputProfile_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextOutputIntents typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextOutputIntents_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextOutputIntents_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextOutputIntents").orElseThrow().reinterpret(kCGPDFContextOutputIntents_LAYOUT.byteSize()) }
private val kCGPDFContextOutputIntents_VH: VarHandle by lazy { kCGPDFContextOutputIntents_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
var kCGPDFContextOutputIntents: MemorySegment
    get() = kCGPDFContextOutputIntents_VH.get(kCGPDFContextOutputIntents_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextOutputIntents_VH.set(kCGPDFContextOutputIntents_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextAccessPermissions typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextAccessPermissions_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextAccessPermissions_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextAccessPermissions").orElseThrow().reinterpret(kCGPDFContextAccessPermissions_LAYOUT.byteSize()) }
private val kCGPDFContextAccessPermissions_VH: VarHandle by lazy { kCGPDFContextAccessPermissions_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
var kCGPDFContextAccessPermissions: MemorySegment
    get() = kCGPDFContextAccessPermissions_VH.get(kCGPDFContextAccessPermissions_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextAccessPermissions_VH.set(kCGPDFContextAccessPermissions_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGPDFContextSetOutline Void(typedef CGContextRef = (Declared(CGContext))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPDFContextSetOutline_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFContextSetOutline_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextSetOutline").orElseThrow()
private val CGPDFContextSetOutline_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextSetOutline_ADDR, CGPDFContextSetOutline_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGPDFContextSetOutline(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGPDFContextSetOutline_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGPDFContextCreateLinearizedPDF typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextCreateLinearizedPDF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextCreateLinearizedPDF_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextCreateLinearizedPDF").orElseThrow().reinterpret(kCGPDFContextCreateLinearizedPDF_LAYOUT.byteSize()) }
private val kCGPDFContextCreateLinearizedPDF_VH: VarHandle by lazy { kCGPDFContextCreateLinearizedPDF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGPDFContextCreateLinearizedPDF: MemorySegment
    get() = kCGPDFContextCreateLinearizedPDF_VH.get(kCGPDFContextCreateLinearizedPDF_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextCreateLinearizedPDF_VH.set(kCGPDFContextCreateLinearizedPDF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFContextCreatePDFA typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGPDFContextCreatePDFA_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFContextCreatePDFA_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFContextCreatePDFA").orElseThrow().reinterpret(kCGPDFContextCreatePDFA_LAYOUT.byteSize()) }
private val kCGPDFContextCreatePDFA_VH: VarHandle by lazy { kCGPDFContextCreatePDFA_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var kCGPDFContextCreatePDFA: MemorySegment
    get() = kCGPDFContextCreatePDFA_VH.get(kCGPDFContextCreatePDFA_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFContextCreatePDFA_VH.set(kCGPDFContextCreatePDFA_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGPDFTagTypeGetName (Char)*(typedef CGPDFTagType = Declared(CGPDFTagType))
 */
private val CGPDFTagTypeGetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGPDFTagTypeGetName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFTagTypeGetName").orElseThrow()
private val CGPDFTagTypeGetName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFTagTypeGetName_ADDR, CGPDFTagTypeGetName_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGPDFTagTypeGetName(arg0: CGPDFTagType): MemorySegment {
    try {
        return CGPDFTagTypeGetName_HANDLE.invokeExact(arg0.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGPDFTagPropertyActualText typedef CGPDFTagProperty = (Declared(__CFString))*
 */
private val kCGPDFTagPropertyActualText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFTagPropertyActualText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFTagPropertyActualText").orElseThrow().reinterpret(kCGPDFTagPropertyActualText_LAYOUT.byteSize()) }
private val kCGPDFTagPropertyActualText_VH: VarHandle by lazy { kCGPDFTagPropertyActualText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
var kCGPDFTagPropertyActualText: MemorySegment
    get() = kCGPDFTagPropertyActualText_VH.get(kCGPDFTagPropertyActualText_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFTagPropertyActualText_VH.set(kCGPDFTagPropertyActualText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFTagPropertyAlternativeText typedef CGPDFTagProperty = (Declared(__CFString))*
 */
private val kCGPDFTagPropertyAlternativeText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFTagPropertyAlternativeText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFTagPropertyAlternativeText").orElseThrow().reinterpret(kCGPDFTagPropertyAlternativeText_LAYOUT.byteSize()) }
private val kCGPDFTagPropertyAlternativeText_VH: VarHandle by lazy { kCGPDFTagPropertyAlternativeText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
var kCGPDFTagPropertyAlternativeText: MemorySegment
    get() = kCGPDFTagPropertyAlternativeText_VH.get(kCGPDFTagPropertyAlternativeText_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFTagPropertyAlternativeText_VH.set(kCGPDFTagPropertyAlternativeText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFTagPropertyTitleText typedef CGPDFTagProperty = (Declared(__CFString))*
 */
private val kCGPDFTagPropertyTitleText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFTagPropertyTitleText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFTagPropertyTitleText").orElseThrow().reinterpret(kCGPDFTagPropertyTitleText_LAYOUT.byteSize()) }
private val kCGPDFTagPropertyTitleText_VH: VarHandle by lazy { kCGPDFTagPropertyTitleText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
var kCGPDFTagPropertyTitleText: MemorySegment
    get() = kCGPDFTagPropertyTitleText_VH.get(kCGPDFTagPropertyTitleText_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFTagPropertyTitleText_VH.set(kCGPDFTagPropertyTitleText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGPDFTagPropertyLanguageText typedef CGPDFTagProperty = (Declared(__CFString))*
 */
private val kCGPDFTagPropertyLanguageText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGPDFTagPropertyLanguageText_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGPDFTagPropertyLanguageText").orElseThrow().reinterpret(kCGPDFTagPropertyLanguageText_LAYOUT.byteSize()) }
private val kCGPDFTagPropertyLanguageText_VH: VarHandle by lazy { kCGPDFTagPropertyLanguageText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
var kCGPDFTagPropertyLanguageText: MemorySegment
    get() = kCGPDFTagPropertyLanguageText_VH.get(kCGPDFTagPropertyLanguageText_SEGMENT, 0L) as MemorySegment
    set(value) = kCGPDFTagPropertyLanguageText_VH.set(kCGPDFTagPropertyLanguageText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGPDFContextBeginTag Void(typedef CGContextRef = (Declared(CGContext))*,typedef CGPDFTagType = Declared(CGPDFTagType),typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPDFContextBeginTag_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGPDFContextBeginTag_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextBeginTag").orElseThrow()
private val CGPDFContextBeginTag_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextBeginTag_ADDR, CGPDFContextBeginTag_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGPDFContextBeginTag(arg0: MemorySegment, arg1: CGPDFTagType, arg2: MemorySegment): Unit {
    try {
        CGPDFContextBeginTag_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFContextEndTag Void(typedef CGContextRef = (Declared(CGContext))*)
 */
private val CGPDFContextEndTag_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFContextEndTag_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFContextEndTag").orElseThrow()
private val CGPDFContextEndTag_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFContextEndTag_ADDR, CGPDFContextEndTag_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGPDFContextEndTag(arg0: MemorySegment): Unit {
    try {
        CGPDFContextEndTag_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerCreate typedef CGPDFScannerRef = (Declared(CGPDFScanner))*(typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*,typedef CGPDFOperatorTableRef = (Declared(CGPDFOperatorTable))*,(Void)*)
 */
private val CGPDFScannerCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerCreate").orElseThrow()
private val CGPDFScannerCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerCreate_ADDR, CGPDFScannerCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGPDFScannerCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerRetain typedef CGPDFScannerRef = (Declared(CGPDFScanner))*(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*)
 */
private val CGPDFScannerRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerRetain").orElseThrow()
private val CGPDFScannerRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerRetain_ADDR, CGPDFScannerRetain_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFScannerRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerRelease Void(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*)
 */
private val CGPDFScannerRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFScannerRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerRelease").orElseThrow()
private val CGPDFScannerRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerRelease_ADDR, CGPDFScannerRelease_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerRelease(arg0: MemorySegment): Unit {
    try {
        CGPDFScannerRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerScan Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*)
 */
private val CGPDFScannerScan_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPDFScannerScan_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerScan").orElseThrow()
private val CGPDFScannerScan_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerScan_ADDR, CGPDFScannerScan_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerScan(arg0: MemorySegment): Boolean {
    try {
        return CGPDFScannerScan_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerGetContentStream typedef CGPDFContentStreamRef = (Declared(CGPDFContentStream))*(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*)
 */
private val CGPDFScannerGetContentStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerGetContentStream_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerGetContentStream").orElseThrow()
private val CGPDFScannerGetContentStream_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerGetContentStream_ADDR, CGPDFScannerGetContentStream_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerGetContentStream(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFScannerGetContentStream_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopObject Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFObjectRef = (Declared(CGPDFObject))*)*)
 */
private val CGPDFScannerPopObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopObject_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopObject").orElseThrow()
private val CGPDFScannerPopObject_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopObject_ADDR, CGPDFScannerPopObject_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopObject(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopObject_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopBoolean Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFBoolean = UNSIGNED = Char)*)
 */
private val CGPDFScannerPopBoolean_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopBoolean_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopBoolean").orElseThrow()
private val CGPDFScannerPopBoolean_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopBoolean_ADDR, CGPDFScannerPopBoolean_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopBoolean(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopBoolean_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopInteger Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFInteger = Long)*)
 */
private val CGPDFScannerPopInteger_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopInteger_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopInteger").orElseThrow()
private val CGPDFScannerPopInteger_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopInteger_ADDR, CGPDFScannerPopInteger_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopInteger(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopInteger_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopNumber Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFReal = Double)*)
 */
private val CGPDFScannerPopNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopNumber").orElseThrow()
private val CGPDFScannerPopNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopNumber_ADDR, CGPDFScannerPopNumber_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopNumber(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopNumber_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopName Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,((Char)*)*)
 */
private val CGPDFScannerPopName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopName_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopName").orElseThrow()
private val CGPDFScannerPopName_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopName_ADDR, CGPDFScannerPopName_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopName(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopName_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopString Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFStringRef = (Declared(CGPDFString))*)*)
 */
private val CGPDFScannerPopString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopString_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopString").orElseThrow()
private val CGPDFScannerPopString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopString_ADDR, CGPDFScannerPopString_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopString(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopString_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopArray Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFArrayRef = (Declared(CGPDFArray))*)*)
 */
private val CGPDFScannerPopArray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopArray_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopArray").orElseThrow()
private val CGPDFScannerPopArray_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopArray_ADDR, CGPDFScannerPopArray_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopArray(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopArray_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopDictionary Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFDictionaryRef = (Declared(CGPDFDictionary))*)*)
 */
private val CGPDFScannerPopDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopDictionary_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopDictionary").orElseThrow()
private val CGPDFScannerPopDictionary_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopDictionary_ADDR, CGPDFScannerPopDictionary_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopDictionary(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopDictionary_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerPopStream Bool(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*,(typedef CGPDFStreamRef = (Declared(CGPDFStream))*)*)
 */
private val CGPDFScannerPopStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFScannerPopStream_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerPopStream").orElseThrow()
private val CGPDFScannerPopStream_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerPopStream_ADDR, CGPDFScannerPopStream_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFScannerPopStream(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return CGPDFScannerPopStream_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFScannerStop Void(typedef CGPDFScannerRef = (Declared(CGPDFScanner))*)
 */
private val CGPDFScannerStop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFScannerStop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFScannerStop").orElseThrow()
private val CGPDFScannerStop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFScannerStop_ADDR, CGPDFScannerStop_DESC)

fun CGPDFScannerStop(arg0: MemorySegment): Unit {
    try {
        CGPDFScannerStop_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFOperatorTableCreate typedef CGPDFOperatorTableRef = (Declared(CGPDFOperatorTable))*()
 */
private val CGPDFOperatorTableCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGPDFOperatorTableCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFOperatorTableCreate").orElseThrow()
private val CGPDFOperatorTableCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFOperatorTableCreate_ADDR, CGPDFOperatorTableCreate_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFOperatorTableCreate(): MemorySegment {
    try {
        return CGPDFOperatorTableCreate_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFOperatorTableRetain typedef CGPDFOperatorTableRef = (Declared(CGPDFOperatorTable))*(typedef CGPDFOperatorTableRef = (Declared(CGPDFOperatorTable))*)
 */
private val CGPDFOperatorTableRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFOperatorTableRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFOperatorTableRetain").orElseThrow()
private val CGPDFOperatorTableRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFOperatorTableRetain_ADDR, CGPDFOperatorTableRetain_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFOperatorTableRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGPDFOperatorTableRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFOperatorTableRelease Void(typedef CGPDFOperatorTableRef = (Declared(CGPDFOperatorTable))*)
 */
private val CGPDFOperatorTableRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGPDFOperatorTableRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFOperatorTableRelease").orElseThrow()
private val CGPDFOperatorTableRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFOperatorTableRelease_ADDR, CGPDFOperatorTableRelease_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFOperatorTableRelease(arg0: MemorySegment): Unit {
    try {
        CGPDFOperatorTableRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPDFOperatorTableSetCallback Void(typedef CGPDFOperatorTableRef = (Declared(CGPDFOperatorTable))*,(Char)*,typedef CGPDFOperatorCallback = (Void((Declared(CGPDFScanner))*,(Void)*))*)
 */
private val CGPDFOperatorTableSetCallback_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPDFOperatorTableSetCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPDFOperatorTableSetCallback").orElseThrow()
private val CGPDFOperatorTableSetCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPDFOperatorTableSetCallback_ADDR, CGPDFOperatorTableSetCallback_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGPDFOperatorTableSetCallback(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGPDFOperatorTableSetCallback_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGWindowNumber typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowNumber").orElseThrow().reinterpret(kCGWindowNumber_LAYOUT.byteSize()) }
private val kCGWindowNumber_VH: VarHandle by lazy { kCGWindowNumber_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowNumber: MemorySegment
    get() = kCGWindowNumber_VH.get(kCGWindowNumber_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowNumber_VH.set(kCGWindowNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowStoreType typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowStoreType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowStoreType_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowStoreType").orElseThrow().reinterpret(kCGWindowStoreType_LAYOUT.byteSize()) }
private val kCGWindowStoreType_VH: VarHandle by lazy { kCGWindowStoreType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowStoreType: MemorySegment
    get() = kCGWindowStoreType_VH.get(kCGWindowStoreType_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowStoreType_VH.set(kCGWindowStoreType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowLayer typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowLayer_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowLayer_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowLayer").orElseThrow().reinterpret(kCGWindowLayer_LAYOUT.byteSize()) }
private val kCGWindowLayer_VH: VarHandle by lazy { kCGWindowLayer_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowLayer: MemorySegment
    get() = kCGWindowLayer_VH.get(kCGWindowLayer_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowLayer_VH.set(kCGWindowLayer_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowBounds typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowBounds_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowBounds_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowBounds").orElseThrow().reinterpret(kCGWindowBounds_LAYOUT.byteSize()) }
private val kCGWindowBounds_VH: VarHandle by lazy { kCGWindowBounds_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowBounds: MemorySegment
    get() = kCGWindowBounds_VH.get(kCGWindowBounds_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowBounds_VH.set(kCGWindowBounds_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowSharingState typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowSharingState_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowSharingState_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowSharingState").orElseThrow().reinterpret(kCGWindowSharingState_LAYOUT.byteSize()) }
private val kCGWindowSharingState_VH: VarHandle by lazy { kCGWindowSharingState_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowSharingState: MemorySegment
    get() = kCGWindowSharingState_VH.get(kCGWindowSharingState_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowSharingState_VH.set(kCGWindowSharingState_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowAlpha typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowAlpha_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowAlpha_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowAlpha").orElseThrow().reinterpret(kCGWindowAlpha_LAYOUT.byteSize()) }
private val kCGWindowAlpha_VH: VarHandle by lazy { kCGWindowAlpha_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowAlpha: MemorySegment
    get() = kCGWindowAlpha_VH.get(kCGWindowAlpha_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowAlpha_VH.set(kCGWindowAlpha_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowOwnerPID typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowOwnerPID_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowOwnerPID_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowOwnerPID").orElseThrow().reinterpret(kCGWindowOwnerPID_LAYOUT.byteSize()) }
private val kCGWindowOwnerPID_VH: VarHandle by lazy { kCGWindowOwnerPID_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowOwnerPID: MemorySegment
    get() = kCGWindowOwnerPID_VH.get(kCGWindowOwnerPID_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowOwnerPID_VH.set(kCGWindowOwnerPID_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowMemoryUsage typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowMemoryUsage_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowMemoryUsage_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowMemoryUsage").orElseThrow().reinterpret(kCGWindowMemoryUsage_LAYOUT.byteSize()) }
private val kCGWindowMemoryUsage_VH: VarHandle by lazy { kCGWindowMemoryUsage_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowMemoryUsage: MemorySegment
    get() = kCGWindowMemoryUsage_VH.get(kCGWindowMemoryUsage_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowMemoryUsage_VH.set(kCGWindowMemoryUsage_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowWorkspace typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowWorkspace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowWorkspace_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowWorkspace").orElseThrow().reinterpret(kCGWindowWorkspace_LAYOUT.byteSize()) }
private val kCGWindowWorkspace_VH: VarHandle by lazy { kCGWindowWorkspace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
var kCGWindowWorkspace: MemorySegment
    get() = kCGWindowWorkspace_VH.get(kCGWindowWorkspace_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowWorkspace_VH.set(kCGWindowWorkspace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowOwnerName typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowOwnerName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowOwnerName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowOwnerName").orElseThrow().reinterpret(kCGWindowOwnerName_LAYOUT.byteSize()) }
private val kCGWindowOwnerName_VH: VarHandle by lazy { kCGWindowOwnerName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowOwnerName: MemorySegment
    get() = kCGWindowOwnerName_VH.get(kCGWindowOwnerName_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowOwnerName_VH.set(kCGWindowOwnerName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowName typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowName").orElseThrow().reinterpret(kCGWindowName_LAYOUT.byteSize()) }
private val kCGWindowName_VH: VarHandle by lazy { kCGWindowName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowName: MemorySegment
    get() = kCGWindowName_VH.get(kCGWindowName_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowName_VH.set(kCGWindowName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowIsOnscreen typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowIsOnscreen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowIsOnscreen_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowIsOnscreen").orElseThrow().reinterpret(kCGWindowIsOnscreen_LAYOUT.byteSize()) }
private val kCGWindowIsOnscreen_VH: VarHandle by lazy { kCGWindowIsOnscreen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowIsOnscreen: MemorySegment
    get() = kCGWindowIsOnscreen_VH.get(kCGWindowIsOnscreen_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowIsOnscreen_VH.set(kCGWindowIsOnscreen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGWindowBackingLocationVideoMemory typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGWindowBackingLocationVideoMemory_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGWindowBackingLocationVideoMemory_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGWindowBackingLocationVideoMemory").orElseThrow().reinterpret(kCGWindowBackingLocationVideoMemory_LAYOUT.byteSize()) }
private val kCGWindowBackingLocationVideoMemory_VH: VarHandle by lazy { kCGWindowBackingLocationVideoMemory_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
var kCGWindowBackingLocationVideoMemory: MemorySegment
    get() = kCGWindowBackingLocationVideoMemory_VH.get(kCGWindowBackingLocationVideoMemory_SEGMENT, 0L) as MemorySegment
    set(value) = kCGWindowBackingLocationVideoMemory_VH.set(kCGWindowBackingLocationVideoMemory_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGWindowListCopyWindowInfo typedef CFArrayRef = (Declared(__CFArray))*(typedef CGWindowListOption = Declared(CGWindowListOption),typedef CGWindowID = UNSIGNED = Int)
 */
private val CGWindowListCopyWindowInfo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGWindowListCopyWindowInfo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowListCopyWindowInfo").orElseThrow()
private val CGWindowListCopyWindowInfo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowListCopyWindowInfo_ADDR, CGWindowListCopyWindowInfo_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGWindowListCopyWindowInfo(arg0: CGWindowListOption, arg1: Int): MemorySegment {
    try {
        return CGWindowListCopyWindowInfo_HANDLE.invokeExact(arg0.rawValue.toInt(), arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWindowListCreate typedef CFArrayRef = (Declared(__CFArray))*(typedef CGWindowListOption = Declared(CGWindowListOption),typedef CGWindowID = UNSIGNED = Int)
 */
private val CGWindowListCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGWindowListCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowListCreate").orElseThrow()
private val CGWindowListCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowListCreate_ADDR, CGWindowListCreate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "No replacement at present")
fun CGWindowListCreate(arg0: CGWindowListOption, arg1: Int): MemorySegment {
    try {
        return CGWindowListCreate_HANDLE.invokeExact(arg0.rawValue.toInt(), arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWindowListCreateDescriptionFromArray typedef CFArrayRef = (Declared(__CFArray))*(typedef CFArrayRef = (Declared(__CFArray))*)
 */
private val CGWindowListCreateDescriptionFromArray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGWindowListCreateDescriptionFromArray_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowListCreateDescriptionFromArray").orElseThrow()
private val CGWindowListCreateDescriptionFromArray_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowListCreateDescriptionFromArray_ADDR, CGWindowListCreateDescriptionFromArray_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGWindowListCreateDescriptionFromArray(arg0: MemorySegment): MemorySegment {
    try {
        return CGWindowListCreateDescriptionFromArray_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWindowListCreateImage typedef CGImageRef = (Declared(CGImage))*(typedef CGRect = Declared(CGRect),typedef CGWindowListOption = Declared(CGWindowListOption),typedef CGWindowID = UNSIGNED = Int,typedef CGWindowImageOption = Declared(CGWindowImageOption))
 */
private val CGWindowListCreateImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGWindowListCreateImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowListCreateImage").orElseThrow()
private val CGWindowListCreateImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowListCreateImage_ADDR, CGWindowListCreateImage_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGWindowListCreateImage(arg0: MemorySegment, arg1: CGWindowListOption, arg2: Int, arg3: CGWindowImageOption): MemorySegment {
    try {
        return CGWindowListCreateImage_HANDLE.invokeExact(arg0, arg1.rawValue.toInt(), arg2, arg3.rawValue.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGWindowListCreateImage(arg0: CGRect, arg1: CGWindowListOption, arg2: Int, arg3: CGWindowImageOption): MemorySegment {
    return CGWindowListCreateImage(arg0.segment, arg1, arg2, arg3)
}

/**
 * {@snippet lang=c : CGWindowListCreateImageFromArray typedef CGImageRef = (Declared(CGImage))*(typedef CGRect = Declared(CGRect),typedef CFArrayRef = (Declared(__CFArray))*,typedef CGWindowImageOption = Declared(CGWindowImageOption))
 */
private val CGWindowListCreateImageFromArray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, CGRect.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGWindowListCreateImageFromArray_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowListCreateImageFromArray").orElseThrow()
private val CGWindowListCreateImageFromArray_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowListCreateImageFromArray_ADDR, CGWindowListCreateImageFromArray_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGWindowListCreateImageFromArray(arg0: MemorySegment, arg1: MemorySegment, arg2: CGWindowImageOption): MemorySegment {
    try {
        return CGWindowListCreateImageFromArray_HANDLE.invokeExact(arg0, arg1, arg2.rawValue.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGWindowListCreateImageFromArray(arg0: CGRect, arg1: MemorySegment, arg2: CGWindowImageOption): MemorySegment {
    return CGWindowListCreateImageFromArray(arg0.segment, arg1, arg2)
}

/**
 * {@snippet lang=c : CGPreflightScreenCaptureAccess Bool()
 */
private val CGPreflightScreenCaptureAccess_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val CGPreflightScreenCaptureAccess_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPreflightScreenCaptureAccess").orElseThrow()
private val CGPreflightScreenCaptureAccess_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPreflightScreenCaptureAccess_ADDR, CGPreflightScreenCaptureAccess_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGPreflightScreenCaptureAccess(): Boolean {
    try {
        return CGPreflightScreenCaptureAccess_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRequestScreenCaptureAccess Bool()
 */
private val CGRequestScreenCaptureAccess_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val CGRequestScreenCaptureAccess_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRequestScreenCaptureAccess").orElseThrow()
private val CGRequestScreenCaptureAccess_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRequestScreenCaptureAccess_ADDR, CGRequestScreenCaptureAccess_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGRequestScreenCaptureAccess(): Boolean {
    try {
        return CGRequestScreenCaptureAccess_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWindowLevelForKey typedef CGWindowLevel = Int(typedef CGWindowLevelKey = Declared(CGWindowLevelKey))
 */
private val CGWindowLevelForKey_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGWindowLevelForKey_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowLevelForKey").orElseThrow()
private val CGWindowLevelForKey_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowLevelForKey_ADDR, CGWindowLevelForKey_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGWindowLevelForKey(arg0: CGWindowLevelKey): Int {
    try {
        return CGWindowLevelForKey_HANDLE.invokeExact(arg0.value.toInt()) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGMainDisplayID typedef CGDirectDisplayID = UNSIGNED = Int()
 */
private val CGMainDisplayID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGMainDisplayID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGMainDisplayID").orElseThrow()
private val CGMainDisplayID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGMainDisplayID_ADDR, CGMainDisplayID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGMainDisplayID(): Int {
    try {
        return CGMainDisplayID_HANDLE.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGetDisplaysWithPoint typedef CGError = Declared(CGError)(typedef CGPoint = Declared(CGPoint),typedef uint32_t = UNSIGNED = Int,(typedef CGDirectDisplayID = UNSIGNED = Int)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetDisplaysWithPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, CGPoint.layout, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetDisplaysWithPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetDisplaysWithPoint").orElseThrow()
private val CGGetDisplaysWithPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetDisplaysWithPoint_ADDR, CGGetDisplaysWithPoint_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplaysWithPoint(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetDisplaysWithPoint_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplaysWithPoint(arg0: CGPoint, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): CGError {
    return CGGetDisplaysWithPoint(arg0.segment, arg1, arg2, arg3)
}

/**
 * {@snippet lang=c : CGGetDisplaysWithRect typedef CGError = Declared(CGError)(typedef CGRect = Declared(CGRect),typedef uint32_t = UNSIGNED = Int,(typedef CGDirectDisplayID = UNSIGNED = Int)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetDisplaysWithRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, CGRect.layout, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetDisplaysWithRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetDisplaysWithRect").orElseThrow()
private val CGGetDisplaysWithRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetDisplaysWithRect_ADDR, CGGetDisplaysWithRect_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplaysWithRect(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetDisplaysWithRect_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplaysWithRect(arg0: CGRect, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): CGError {
    return CGGetDisplaysWithRect(arg0.segment, arg1, arg2, arg3)
}

/**
 * {@snippet lang=c : CGGetDisplaysWithOpenGLDisplayMask typedef CGError = Declared(CGError)(typedef CGOpenGLDisplayMask = UNSIGNED = Int,typedef uint32_t = UNSIGNED = Int,(typedef CGDirectDisplayID = UNSIGNED = Int)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetDisplaysWithOpenGLDisplayMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetDisplaysWithOpenGLDisplayMask_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetDisplaysWithOpenGLDisplayMask").orElseThrow()
private val CGGetDisplaysWithOpenGLDisplayMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetDisplaysWithOpenGLDisplayMask_ADDR, CGGetDisplaysWithOpenGLDisplayMask_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplaysWithOpenGLDisplayMask(arg0: Int, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetDisplaysWithOpenGLDisplayMask_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGetActiveDisplayList typedef CGError = Declared(CGError)(typedef uint32_t = UNSIGNED = Int,(typedef CGDirectDisplayID = UNSIGNED = Int)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetActiveDisplayList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetActiveDisplayList_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetActiveDisplayList").orElseThrow()
private val CGGetActiveDisplayList_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetActiveDisplayList_ADDR, CGGetActiveDisplayList_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetActiveDisplayList(arg0: Int, arg1: MemorySegment, arg2: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetActiveDisplayList_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGetOnlineDisplayList typedef CGError = Declared(CGError)(typedef uint32_t = UNSIGNED = Int,(typedef CGDirectDisplayID = UNSIGNED = Int)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetOnlineDisplayList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetOnlineDisplayList_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetOnlineDisplayList").orElseThrow()
private val CGGetOnlineDisplayList_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetOnlineDisplayList_ADDR, CGGetOnlineDisplayList_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGGetOnlineDisplayList(arg0: Int, arg1: MemorySegment, arg2: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetOnlineDisplayList_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIDToOpenGLDisplayMask typedef CGOpenGLDisplayMask = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIDToOpenGLDisplayMask_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIDToOpenGLDisplayMask_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIDToOpenGLDisplayMask").orElseThrow()
private val CGDisplayIDToOpenGLDisplayMask_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIDToOpenGLDisplayMask_ADDR, CGDisplayIDToOpenGLDisplayMask_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayIDToOpenGLDisplayMask(arg0: Int): Int {
    try {
        return CGDisplayIDToOpenGLDisplayMask_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGOpenGLDisplayMaskToDisplayID typedef CGDirectDisplayID = UNSIGNED = Int(typedef CGOpenGLDisplayMask = UNSIGNED = Int)
 */
private val CGOpenGLDisplayMaskToDisplayID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGOpenGLDisplayMaskToDisplayID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGOpenGLDisplayMaskToDisplayID").orElseThrow()
private val CGOpenGLDisplayMaskToDisplayID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGOpenGLDisplayMaskToDisplayID_ADDR, CGOpenGLDisplayMaskToDisplayID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGOpenGLDisplayMaskToDisplayID(arg0: Int): Int {
    try {
        return CGOpenGLDisplayMaskToDisplayID_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayBounds typedef CGRect = Declared(CGRect)(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayBounds_DESC: FunctionDescriptor = FunctionDescriptor.of(CGRect.layout, ValueLayout.JAVA_INT)
private val CGDisplayBounds_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayBounds").orElseThrow()
private val CGDisplayBounds_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayBounds_ADDR, CGDisplayBounds_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayBounds(allocator: SegmentAllocator, arg0: Int): MemorySegment {
    try {
        return CGDisplayBounds_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayBoundsTyped(allocator: SegmentAllocator, arg0: Int): CGRect {
    return CGRect(CGDisplayBounds(allocator, arg0))
}

/**
 * {@snippet lang=c : CGDisplayPixelsWide typedef size_t = UNSIGNED = Long(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayPixelsWide_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CGDisplayPixelsWide_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayPixelsWide").orElseThrow()
private val CGDisplayPixelsWide_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayPixelsWide_ADDR, CGDisplayPixelsWide_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayPixelsWide(arg0: Int): Long {
    try {
        return CGDisplayPixelsWide_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayPixelsHigh typedef size_t = UNSIGNED = Long(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayPixelsHigh_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CGDisplayPixelsHigh_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayPixelsHigh").orElseThrow()
private val CGDisplayPixelsHigh_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayPixelsHigh_ADDR, CGDisplayPixelsHigh_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayPixelsHigh(arg0: Int): Long {
    try {
        return CGDisplayPixelsHigh_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCopyAllDisplayModes typedef CFArrayRef = (Declared(__CFArray))*(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGDisplayCopyAllDisplayModes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplayCopyAllDisplayModes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCopyAllDisplayModes").orElseThrow()
private val CGDisplayCopyAllDisplayModes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCopyAllDisplayModes_ADDR, CGDisplayCopyAllDisplayModes_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayCopyAllDisplayModes(arg0: Int, arg1: MemorySegment): MemorySegment {
    try {
        return CGDisplayCopyAllDisplayModes_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGDisplayShowDuplicateLowResolutionModes typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayShowDuplicateLowResolutionModes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayShowDuplicateLowResolutionModes_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayShowDuplicateLowResolutionModes").orElseThrow().reinterpret(kCGDisplayShowDuplicateLowResolutionModes_LAYOUT.byteSize()) }
private val kCGDisplayShowDuplicateLowResolutionModes_VH: VarHandle by lazy { kCGDisplayShowDuplicateLowResolutionModes_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
var kCGDisplayShowDuplicateLowResolutionModes: MemorySegment
    get() = kCGDisplayShowDuplicateLowResolutionModes_VH.get(kCGDisplayShowDuplicateLowResolutionModes_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayShowDuplicateLowResolutionModes_VH.set(kCGDisplayShowDuplicateLowResolutionModes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGDisplayCopyDisplayMode typedef CGDisplayModeRef = (Declared(CGDisplayMode))*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayCopyDisplayMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDisplayCopyDisplayMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCopyDisplayMode").orElseThrow()
private val CGDisplayCopyDisplayMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCopyDisplayMode_ADDR, CGDisplayCopyDisplayMode_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayCopyDisplayMode(arg0: Int): MemorySegment {
    try {
        return CGDisplayCopyDisplayMode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplaySetDisplayMode typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGDisplayModeRef = (Declared(CGDisplayMode))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGDisplaySetDisplayMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplaySetDisplayMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplaySetDisplayMode").orElseThrow()
private val CGDisplaySetDisplayMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplaySetDisplayMode_ADDR, CGDisplaySetDisplayMode_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplaySetDisplayMode(arg0: Int, arg1: MemorySegment, arg2: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplaySetDisplayMode_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetWidth typedef size_t = UNSIGNED = Long(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetWidth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDisplayModeGetWidth_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetWidth").orElseThrow()
private val CGDisplayModeGetWidth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetWidth_ADDR, CGDisplayModeGetWidth_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeGetWidth(arg0: MemorySegment): Long {
    try {
        return CGDisplayModeGetWidth_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetHeight typedef size_t = UNSIGNED = Long(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDisplayModeGetHeight_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetHeight").orElseThrow()
private val CGDisplayModeGetHeight_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetHeight_ADDR, CGDisplayModeGetHeight_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeGetHeight(arg0: MemorySegment): Long {
    try {
        return CGDisplayModeGetHeight_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeCopyPixelEncoding typedef CFStringRef = (Declared(__CFString))*(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeCopyPixelEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayModeCopyPixelEncoding_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeCopyPixelEncoding").orElseThrow()
private val CGDisplayModeCopyPixelEncoding_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeCopyPixelEncoding_ADDR, CGDisplayModeCopyPixelEncoding_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayModeCopyPixelEncoding(arg0: MemorySegment): MemorySegment {
    try {
        return CGDisplayModeCopyPixelEncoding_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetRefreshRate Double(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetRefreshRate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGDisplayModeGetRefreshRate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetRefreshRate").orElseThrow()
private val CGDisplayModeGetRefreshRate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetRefreshRate_ADDR, CGDisplayModeGetRefreshRate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeGetRefreshRate(arg0: MemorySegment): Double {
    try {
        return CGDisplayModeGetRefreshRate_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetIOFlags typedef uint32_t = UNSIGNED = Int(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetIOFlags_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplayModeGetIOFlags_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetIOFlags").orElseThrow()
private val CGDisplayModeGetIOFlags_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetIOFlags_ADDR, CGDisplayModeGetIOFlags_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeGetIOFlags(arg0: MemorySegment): Int {
    try {
        return CGDisplayModeGetIOFlags_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetIODisplayModeID typedef int32_t = Int(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetIODisplayModeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplayModeGetIODisplayModeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetIODisplayModeID").orElseThrow()
private val CGDisplayModeGetIODisplayModeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetIODisplayModeID_ADDR, CGDisplayModeGetIODisplayModeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeGetIODisplayModeID(arg0: MemorySegment): Int {
    try {
        return CGDisplayModeGetIODisplayModeID_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeIsUsableForDesktopGUI Bool(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeIsUsableForDesktopGUI_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGDisplayModeIsUsableForDesktopGUI_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeIsUsableForDesktopGUI").orElseThrow()
private val CGDisplayModeIsUsableForDesktopGUI_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeIsUsableForDesktopGUI_ADDR, CGDisplayModeIsUsableForDesktopGUI_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeIsUsableForDesktopGUI(arg0: MemorySegment): Boolean {
    try {
        return CGDisplayModeIsUsableForDesktopGUI_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGDisplayModeGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGDisplayModeGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetTypeID").orElseThrow()
private val CGDisplayModeGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetTypeID_ADDR, CGDisplayModeGetTypeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeGetTypeID(): Long {
    try {
        return CGDisplayModeGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeRetain typedef CGDisplayModeRef = (Declared(CGDisplayMode))*(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeRetain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayModeRetain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeRetain").orElseThrow()
private val CGDisplayModeRetain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeRetain_ADDR, CGDisplayModeRetain_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeRetain(arg0: MemorySegment): MemorySegment {
    try {
        return CGDisplayModeRetain_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeRelease Void(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeRelease_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGDisplayModeRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeRelease").orElseThrow()
private val CGDisplayModeRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeRelease_ADDR, CGDisplayModeRelease_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGDisplayModeRelease(arg0: MemorySegment): Unit {
    try {
        CGDisplayModeRelease_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetPixelWidth typedef size_t = UNSIGNED = Long(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetPixelWidth_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDisplayModeGetPixelWidth_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetPixelWidth").orElseThrow()
private val CGDisplayModeGetPixelWidth_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetPixelWidth_ADDR, CGDisplayModeGetPixelWidth_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
fun CGDisplayModeGetPixelWidth(arg0: MemorySegment): Long {
    try {
        return CGDisplayModeGetPixelWidth_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModeGetPixelHeight typedef size_t = UNSIGNED = Long(typedef CGDisplayModeRef = (Declared(CGDisplayMode))*)
 */
private val CGDisplayModeGetPixelHeight_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDisplayModeGetPixelHeight_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModeGetPixelHeight").orElseThrow()
private val CGDisplayModeGetPixelHeight_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModeGetPixelHeight_ADDR, CGDisplayModeGetPixelHeight_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
fun CGDisplayModeGetPixelHeight(arg0: MemorySegment): Long {
    try {
        return CGDisplayModeGetPixelHeight_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSetDisplayTransferByFormula typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float,typedef CGGammaValue = Float)
 */
private val CGSetDisplayTransferByFormula_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
private val CGSetDisplayTransferByFormula_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGSetDisplayTransferByFormula").orElseThrow()
private val CGSetDisplayTransferByFormula_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGSetDisplayTransferByFormula_ADDR, CGSetDisplayTransferByFormula_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGSetDisplayTransferByFormula(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float, arg6: Float, arg7: Float, arg8: Float, arg9: Float): CGError {
    try {
        return CGError.fromValue((CGSetDisplayTransferByFormula_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGetDisplayTransferByFormula typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*)
 */
private val CGGetDisplayTransferByFormula_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetDisplayTransferByFormula_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetDisplayTransferByFormula").orElseThrow()
private val CGGetDisplayTransferByFormula_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetDisplayTransferByFormula_ADDR, CGGetDisplayTransferByFormula_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplayTransferByFormula(arg0: Int, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetDisplayTransferByFormula_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayGammaTableCapacity typedef uint32_t = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayGammaTableCapacity_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayGammaTableCapacity_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayGammaTableCapacity").orElseThrow()
private val CGDisplayGammaTableCapacity_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayGammaTableCapacity_ADDR, CGDisplayGammaTableCapacity_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayGammaTableCapacity(arg0: Int): Int {
    try {
        return CGDisplayGammaTableCapacity_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSetDisplayTransferByTable typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef uint32_t = UNSIGNED = Int,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*)
 */
private val CGSetDisplayTransferByTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGSetDisplayTransferByTable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGSetDisplayTransferByTable").orElseThrow()
private val CGSetDisplayTransferByTable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGSetDisplayTransferByTable_ADDR, CGSetDisplayTransferByTable_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGSetDisplayTransferByTable(arg0: Int, arg1: Int, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGSetDisplayTransferByTable_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGetDisplayTransferByTable typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef uint32_t = UNSIGNED = Int,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef CGGammaValue = Float)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetDisplayTransferByTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetDisplayTransferByTable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetDisplayTransferByTable").orElseThrow()
private val CGGetDisplayTransferByTable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetDisplayTransferByTable_ADDR, CGGetDisplayTransferByTable_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetDisplayTransferByTable(arg0: Int, arg1: Int, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetDisplayTransferByTable_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSetDisplayTransferByByteTable typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef uint32_t = UNSIGNED = Int,(typedef uint8_t = UNSIGNED = Char)*,(typedef uint8_t = UNSIGNED = Char)*,(typedef uint8_t = UNSIGNED = Char)*)
 */
private val CGSetDisplayTransferByByteTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGSetDisplayTransferByByteTable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGSetDisplayTransferByByteTable").orElseThrow()
private val CGSetDisplayTransferByByteTable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGSetDisplayTransferByByteTable_ADDR, CGSetDisplayTransferByByteTable_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGSetDisplayTransferByByteTable(arg0: Int, arg1: Int, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGSetDisplayTransferByByteTable_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayRestoreColorSyncSettings Void()
 */
private val CGDisplayRestoreColorSyncSettings_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val CGDisplayRestoreColorSyncSettings_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayRestoreColorSyncSettings").orElseThrow()
private val CGDisplayRestoreColorSyncSettings_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayRestoreColorSyncSettings_ADDR, CGDisplayRestoreColorSyncSettings_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayRestoreColorSyncSettings(): Unit {
    try {
        CGDisplayRestoreColorSyncSettings_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsCaptured typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsCaptured_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsCaptured_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsCaptured").orElseThrow()
private val CGDisplayIsCaptured_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsCaptured_ADDR, CGDisplayIsCaptured_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayIsCaptured(arg0: Int): Int {
    try {
        return CGDisplayIsCaptured_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCapture typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayCapture_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayCapture_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCapture").orElseThrow()
private val CGDisplayCapture_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCapture_ADDR, CGDisplayCapture_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayCapture(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGDisplayCapture_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCaptureWithOptions typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGCaptureOptions = Declared(CGCaptureOptions))
 */
private val CGDisplayCaptureWithOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayCaptureWithOptions_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCaptureWithOptions").orElseThrow()
private val CGDisplayCaptureWithOptions_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCaptureWithOptions_ADDR, CGDisplayCaptureWithOptions_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayCaptureWithOptions(arg0: Int, arg1: CGCaptureOptions): CGError {
    try {
        return CGError.fromValue((CGDisplayCaptureWithOptions_HANDLE.invokeExact(arg0, arg1.rawValue.toInt()) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayRelease typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayRelease_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayRelease_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayRelease").orElseThrow()
private val CGDisplayRelease_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayRelease_ADDR, CGDisplayRelease_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayRelease(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGDisplayRelease_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGCaptureAllDisplays typedef CGError = Declared(CGError)()
 */
private val CGCaptureAllDisplays_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGCaptureAllDisplays_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGCaptureAllDisplays").orElseThrow()
private val CGCaptureAllDisplays_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGCaptureAllDisplays_ADDR, CGCaptureAllDisplays_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGCaptureAllDisplays(): CGError {
    try {
        return CGError.fromValue((CGCaptureAllDisplays_HANDLE.invokeExact() as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGCaptureAllDisplaysWithOptions typedef CGError = Declared(CGError)(typedef CGCaptureOptions = Declared(CGCaptureOptions))
 */
private val CGCaptureAllDisplaysWithOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGCaptureAllDisplaysWithOptions_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGCaptureAllDisplaysWithOptions").orElseThrow()
private val CGCaptureAllDisplaysWithOptions_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGCaptureAllDisplaysWithOptions_ADDR, CGCaptureAllDisplaysWithOptions_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGCaptureAllDisplaysWithOptions(arg0: CGCaptureOptions): CGError {
    try {
        return CGError.fromValue((CGCaptureAllDisplaysWithOptions_HANDLE.invokeExact(arg0.rawValue.toInt()) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGReleaseAllDisplays typedef CGError = Declared(CGError)()
 */
private val CGReleaseAllDisplays_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGReleaseAllDisplays_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGReleaseAllDisplays").orElseThrow()
private val CGReleaseAllDisplays_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGReleaseAllDisplays_ADDR, CGReleaseAllDisplays_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGReleaseAllDisplays(): CGError {
    try {
        return CGError.fromValue((CGReleaseAllDisplays_HANDLE.invokeExact() as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGShieldingWindowID typedef CGWindowID = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGShieldingWindowID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGShieldingWindowID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShieldingWindowID").orElseThrow()
private val CGShieldingWindowID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShieldingWindowID_ADDR, CGShieldingWindowID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGShieldingWindowID(arg0: Int): Int {
    try {
        return CGShieldingWindowID_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGShieldingWindowLevel typedef CGWindowLevel = Int()
 */
private val CGShieldingWindowLevel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGShieldingWindowLevel_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGShieldingWindowLevel").orElseThrow()
private val CGShieldingWindowLevel_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGShieldingWindowLevel_ADDR, CGShieldingWindowLevel_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGShieldingWindowLevel(): Int {
    try {
        return CGShieldingWindowLevel_HANDLE.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCreateImage typedef CGImageRef = (Declared(CGImage))*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayCreateImage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDisplayCreateImage_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCreateImage").orElseThrow()
private val CGDisplayCreateImage_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCreateImage_ADDR, CGDisplayCreateImage_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 4, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayCreateImage(arg0: Int): MemorySegment {
    try {
        return CGDisplayCreateImage_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCreateImageForRect typedef CGImageRef = (Declared(CGImage))*(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGRect = Declared(CGRect))
 */
private val CGDisplayCreateImageForRect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CGRect.layout)
private val CGDisplayCreateImageForRect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCreateImageForRect").orElseThrow()
private val CGDisplayCreateImageForRect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCreateImageForRect_ADDR, CGDisplayCreateImageForRect_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 4, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayCreateImageForRect(arg0: Int, arg1: MemorySegment): MemorySegment {
    try {
        return CGDisplayCreateImageForRect_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 4, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayCreateImageForRect(arg0: Int, arg1: CGRect): MemorySegment {
    return CGDisplayCreateImageForRect(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGDisplayHideCursor typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayHideCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayHideCursor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayHideCursor").orElseThrow()
private val CGDisplayHideCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayHideCursor_ADDR, CGDisplayHideCursor_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayHideCursor(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGDisplayHideCursor_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayShowCursor typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayShowCursor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayShowCursor_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayShowCursor").orElseThrow()
private val CGDisplayShowCursor_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayShowCursor_ADDR, CGDisplayShowCursor_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayShowCursor(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGDisplayShowCursor_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayMoveCursorToPoint typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGPoint = Declared(CGPoint))
 */
private val CGDisplayMoveCursorToPoint_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CGPoint.layout)
private val CGDisplayMoveCursorToPoint_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayMoveCursorToPoint").orElseThrow()
private val CGDisplayMoveCursorToPoint_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayMoveCursorToPoint_ADDR, CGDisplayMoveCursorToPoint_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayMoveCursorToPoint(arg0: Int, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplayMoveCursorToPoint_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGDisplayMoveCursorToPoint(arg0: Int, arg1: CGPoint): CGError {
    return CGDisplayMoveCursorToPoint(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGGetLastMouseDelta Void((typedef int32_t = Int)*,(typedef int32_t = Int)*)
 */
private val CGGetLastMouseDelta_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetLastMouseDelta_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetLastMouseDelta").orElseThrow()
private val CGGetLastMouseDelta_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetLastMouseDelta_ADDR, CGGetLastMouseDelta_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGGetLastMouseDelta(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGGetLastMouseDelta_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayGetDrawingContext typedef CGContextRef = (Declared(CGContext))*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayGetDrawingContext_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDisplayGetDrawingContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayGetDrawingContext").orElseThrow()
private val CGDisplayGetDrawingContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayGetDrawingContext_ADDR, CGDisplayGetDrawingContext_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayGetDrawingContext(arg0: Int): MemorySegment {
    try {
        return CGDisplayGetDrawingContext_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayAvailableModes typedef CFArrayRef = (Declared(__CFArray))*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayAvailableModes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDisplayAvailableModes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayAvailableModes").orElseThrow()
private val CGDisplayAvailableModes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayAvailableModes_ADDR, CGDisplayAvailableModes_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayAvailableModes(arg0: Int): MemorySegment {
    try {
        return CGDisplayAvailableModes_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayBestModeForParameters typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGDirectDisplayID = UNSIGNED = Int,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,(typedef boolean_t = Int)*)
 */
private val CGDisplayBestModeForParameters_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDisplayBestModeForParameters_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayBestModeForParameters").orElseThrow()
private val CGDisplayBestModeForParameters_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayBestModeForParameters_ADDR, CGDisplayBestModeForParameters_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayBestModeForParameters(arg0: Int, arg1: Long, arg2: Long, arg3: Long, arg4: MemorySegment): MemorySegment {
    try {
        return CGDisplayBestModeForParameters_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayBestModeForParametersAndRefreshRate typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGDirectDisplayID = UNSIGNED = Int,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef CGRefreshRate = Double,(typedef boolean_t = Int)*)
 */
private val CGDisplayBestModeForParametersAndRefreshRate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGDisplayBestModeForParametersAndRefreshRate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayBestModeForParametersAndRefreshRate").orElseThrow()
private val CGDisplayBestModeForParametersAndRefreshRate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayBestModeForParametersAndRefreshRate_ADDR, CGDisplayBestModeForParametersAndRefreshRate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayBestModeForParametersAndRefreshRate(arg0: Int, arg1: Long, arg2: Long, arg3: Long, arg4: Double, arg5: MemorySegment): MemorySegment {
    try {
        return CGDisplayBestModeForParametersAndRefreshRate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCurrentMode typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayCurrentMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDisplayCurrentMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCurrentMode").orElseThrow()
private val CGDisplayCurrentMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCurrentMode_ADDR, CGDisplayCurrentMode_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayCurrentMode(arg0: Int): MemorySegment {
    try {
        return CGDisplayCurrentMode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplaySwitchToMode typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGDisplaySwitchToMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplaySwitchToMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplaySwitchToMode").orElseThrow()
private val CGDisplaySwitchToMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplaySwitchToMode_ADDR, CGDisplaySwitchToMode_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplaySwitchToMode(arg0: Int, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplaySwitchToMode_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGBeginDisplayConfiguration typedef CGError = Declared(CGError)((typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*)*)
 */
private val CGBeginDisplayConfiguration_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGBeginDisplayConfiguration_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGBeginDisplayConfiguration").orElseThrow()
private val CGBeginDisplayConfiguration_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGBeginDisplayConfiguration_ADDR, CGBeginDisplayConfiguration_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGBeginDisplayConfiguration(arg0: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGBeginDisplayConfiguration_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGConfigureDisplayOrigin typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGDirectDisplayID = UNSIGNED = Int,typedef int32_t = Int,typedef int32_t = Int)
 */
private val CGConfigureDisplayOrigin_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGConfigureDisplayOrigin_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConfigureDisplayOrigin").orElseThrow()
private val CGConfigureDisplayOrigin_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConfigureDisplayOrigin_ADDR, CGConfigureDisplayOrigin_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGConfigureDisplayOrigin(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int): CGError {
    try {
        return CGError.fromValue((CGConfigureDisplayOrigin_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGConfigureDisplayWithDisplayMode typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGDisplayModeRef = (Declared(CGDisplayMode))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGConfigureDisplayWithDisplayMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGConfigureDisplayWithDisplayMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConfigureDisplayWithDisplayMode").orElseThrow()
private val CGConfigureDisplayWithDisplayMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConfigureDisplayWithDisplayMode_ADDR, CGConfigureDisplayWithDisplayMode_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun CGConfigureDisplayWithDisplayMode(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGConfigureDisplayWithDisplayMode_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGConfigureDisplayStereoOperation typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGDirectDisplayID = UNSIGNED = Int,typedef boolean_t = Int,typedef boolean_t = Int)
 */
private val CGConfigureDisplayStereoOperation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGConfigureDisplayStereoOperation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConfigureDisplayStereoOperation").orElseThrow()
private val CGConfigureDisplayStereoOperation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConfigureDisplayStereoOperation_ADDR, CGConfigureDisplayStereoOperation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGConfigureDisplayStereoOperation(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int): CGError {
    try {
        return CGError.fromValue((CGConfigureDisplayStereoOperation_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGConfigureDisplayMirrorOfDisplay typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGDirectDisplayID = UNSIGNED = Int,typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGConfigureDisplayMirrorOfDisplay_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGConfigureDisplayMirrorOfDisplay_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConfigureDisplayMirrorOfDisplay").orElseThrow()
private val CGConfigureDisplayMirrorOfDisplay_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConfigureDisplayMirrorOfDisplay_ADDR, CGConfigureDisplayMirrorOfDisplay_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGConfigureDisplayMirrorOfDisplay(arg0: MemorySegment, arg1: Int, arg2: Int): CGError {
    try {
        return CGError.fromValue((CGConfigureDisplayMirrorOfDisplay_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGCancelDisplayConfiguration typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*)
 */
private val CGCancelDisplayConfiguration_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGCancelDisplayConfiguration_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGCancelDisplayConfiguration").orElseThrow()
private val CGCancelDisplayConfiguration_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGCancelDisplayConfiguration_ADDR, CGCancelDisplayConfiguration_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGCancelDisplayConfiguration(arg0: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGCancelDisplayConfiguration_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGCompleteDisplayConfiguration typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGConfigureOption = Declared(CGConfigureOption))
 */
private val CGCompleteDisplayConfiguration_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGCompleteDisplayConfiguration_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGCompleteDisplayConfiguration").orElseThrow()
private val CGCompleteDisplayConfiguration_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGCompleteDisplayConfiguration_ADDR, CGCompleteDisplayConfiguration_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGCompleteDisplayConfiguration(arg0: MemorySegment, arg1: CGConfigureOption): CGError {
    try {
        return CGError.fromValue((CGCompleteDisplayConfiguration_HANDLE.invokeExact(arg0, arg1.rawValue.toInt()) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRestorePermanentDisplayConfiguration Void()
 */
private val CGRestorePermanentDisplayConfiguration_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val CGRestorePermanentDisplayConfiguration_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRestorePermanentDisplayConfiguration").orElseThrow()
private val CGRestorePermanentDisplayConfiguration_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRestorePermanentDisplayConfiguration_ADDR, CGRestorePermanentDisplayConfiguration_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGRestorePermanentDisplayConfiguration(): Unit {
    try {
        CGRestorePermanentDisplayConfiguration_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayRegisterReconfigurationCallback typedef CGError = Declared(CGError)(typedef CGDisplayReconfigurationCallBack = (Void(UNSIGNED = Int,Declared(CGDisplayChangeSummaryFlags),(Void)*))*,(Void)*)
 */
private val CGDisplayRegisterReconfigurationCallback_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayRegisterReconfigurationCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayRegisterReconfigurationCallback").orElseThrow()
private val CGDisplayRegisterReconfigurationCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayRegisterReconfigurationCallback_ADDR, CGDisplayRegisterReconfigurationCallback_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayRegisterReconfigurationCallback(arg0: MemorySegment, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplayRegisterReconfigurationCallback_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayRemoveReconfigurationCallback typedef CGError = Declared(CGError)(typedef CGDisplayReconfigurationCallBack = (Void(UNSIGNED = Int,Declared(CGDisplayChangeSummaryFlags),(Void)*))*,(Void)*)
 */
private val CGDisplayRemoveReconfigurationCallback_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayRemoveReconfigurationCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayRemoveReconfigurationCallback").orElseThrow()
private val CGDisplayRemoveReconfigurationCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayRemoveReconfigurationCallback_ADDR, CGDisplayRemoveReconfigurationCallback_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayRemoveReconfigurationCallback(arg0: MemorySegment, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplayRemoveReconfigurationCallback_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplaySetStereoOperation typedef CGError = Declared(CGError)(typedef CGDirectDisplayID = UNSIGNED = Int,typedef boolean_t = Int,typedef boolean_t = Int,typedef CGConfigureOption = Declared(CGConfigureOption))
 */
private val CGDisplaySetStereoOperation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplaySetStereoOperation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplaySetStereoOperation").orElseThrow()
private val CGDisplaySetStereoOperation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplaySetStereoOperation_ADDR, CGDisplaySetStereoOperation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGDisplaySetStereoOperation(arg0: Int, arg1: Int, arg2: Int, arg3: CGConfigureOption): CGError {
    try {
        return CGError.fromValue((CGDisplaySetStereoOperation_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue.toInt()) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsActive typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsActive_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsActive_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsActive").orElseThrow()
private val CGDisplayIsActive_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsActive_ADDR, CGDisplayIsActive_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsActive(arg0: Int): Int {
    try {
        return CGDisplayIsActive_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsAsleep typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsAsleep_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsAsleep_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsAsleep").orElseThrow()
private val CGDisplayIsAsleep_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsAsleep_ADDR, CGDisplayIsAsleep_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsAsleep(arg0: Int): Int {
    try {
        return CGDisplayIsAsleep_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsOnline typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsOnline_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsOnline_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsOnline").orElseThrow()
private val CGDisplayIsOnline_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsOnline_ADDR, CGDisplayIsOnline_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsOnline(arg0: Int): Int {
    try {
        return CGDisplayIsOnline_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsMain typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsMain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsMain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsMain").orElseThrow()
private val CGDisplayIsMain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsMain_ADDR, CGDisplayIsMain_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsMain(arg0: Int): Int {
    try {
        return CGDisplayIsMain_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsBuiltin typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsBuiltin_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsBuiltin_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsBuiltin").orElseThrow()
private val CGDisplayIsBuiltin_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsBuiltin_ADDR, CGDisplayIsBuiltin_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsBuiltin(arg0: Int): Int {
    try {
        return CGDisplayIsBuiltin_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsInMirrorSet typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsInMirrorSet_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsInMirrorSet_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsInMirrorSet").orElseThrow()
private val CGDisplayIsInMirrorSet_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsInMirrorSet_ADDR, CGDisplayIsInMirrorSet_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsInMirrorSet(arg0: Int): Int {
    try {
        return CGDisplayIsInMirrorSet_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsAlwaysInMirrorSet typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsAlwaysInMirrorSet_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsAlwaysInMirrorSet_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsAlwaysInMirrorSet").orElseThrow()
private val CGDisplayIsAlwaysInMirrorSet_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsAlwaysInMirrorSet_ADDR, CGDisplayIsAlwaysInMirrorSet_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsAlwaysInMirrorSet(arg0: Int): Int {
    try {
        return CGDisplayIsAlwaysInMirrorSet_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsInHWMirrorSet typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsInHWMirrorSet_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsInHWMirrorSet_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsInHWMirrorSet").orElseThrow()
private val CGDisplayIsInHWMirrorSet_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsInHWMirrorSet_ADDR, CGDisplayIsInHWMirrorSet_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayIsInHWMirrorSet(arg0: Int): Int {
    try {
        return CGDisplayIsInHWMirrorSet_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayMirrorsDisplay typedef CGDirectDisplayID = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayMirrorsDisplay_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayMirrorsDisplay_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayMirrorsDisplay").orElseThrow()
private val CGDisplayMirrorsDisplay_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayMirrorsDisplay_ADDR, CGDisplayMirrorsDisplay_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayMirrorsDisplay(arg0: Int): Int {
    try {
        return CGDisplayMirrorsDisplay_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayUsesOpenGLAcceleration typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayUsesOpenGLAcceleration_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayUsesOpenGLAcceleration_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayUsesOpenGLAcceleration").orElseThrow()
private val CGDisplayUsesOpenGLAcceleration_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayUsesOpenGLAcceleration_ADDR, CGDisplayUsesOpenGLAcceleration_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayUsesOpenGLAcceleration(arg0: Int): Int {
    try {
        return CGDisplayUsesOpenGLAcceleration_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIsStereo typedef boolean_t = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIsStereo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIsStereo_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIsStereo").orElseThrow()
private val CGDisplayIsStereo_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIsStereo_ADDR, CGDisplayIsStereo_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGDisplayIsStereo(arg0: Int): Int {
    try {
        return CGDisplayIsStereo_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayPrimaryDisplay typedef CGDirectDisplayID = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayPrimaryDisplay_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayPrimaryDisplay_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayPrimaryDisplay").orElseThrow()
private val CGDisplayPrimaryDisplay_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayPrimaryDisplay_ADDR, CGDisplayPrimaryDisplay_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayPrimaryDisplay(arg0: Int): Int {
    try {
        return CGDisplayPrimaryDisplay_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayUnitNumber typedef uint32_t = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayUnitNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayUnitNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayUnitNumber").orElseThrow()
private val CGDisplayUnitNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayUnitNumber_ADDR, CGDisplayUnitNumber_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayUnitNumber(arg0: Int): Int {
    try {
        return CGDisplayUnitNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayVendorNumber typedef uint32_t = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayVendorNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayVendorNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayVendorNumber").orElseThrow()
private val CGDisplayVendorNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayVendorNumber_ADDR, CGDisplayVendorNumber_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayVendorNumber(arg0: Int): Int {
    try {
        return CGDisplayVendorNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayModelNumber typedef uint32_t = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayModelNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayModelNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayModelNumber").orElseThrow()
private val CGDisplayModelNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayModelNumber_ADDR, CGDisplayModelNumber_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayModelNumber(arg0: Int): Int {
    try {
        return CGDisplayModelNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplaySerialNumber typedef uint32_t = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplaySerialNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplaySerialNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplaySerialNumber").orElseThrow()
private val CGDisplaySerialNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplaySerialNumber_ADDR, CGDisplaySerialNumber_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplaySerialNumber(arg0: Int): Int {
    try {
        return CGDisplaySerialNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayIOServicePort typedef io_service_t = UNSIGNED = Int(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayIOServicePort_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGDisplayIOServicePort_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayIOServicePort").orElseThrow()
private val CGDisplayIOServicePort_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayIOServicePort_ADDR, CGDisplayIOServicePort_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayIOServicePort(arg0: Int): Int {
    try {
        return CGDisplayIOServicePort_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayScreenSize typedef CGSize = Declared(CGSize)(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayScreenSize_DESC: FunctionDescriptor = FunctionDescriptor.of(CGSize.layout, ValueLayout.JAVA_INT)
private val CGDisplayScreenSize_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayScreenSize").orElseThrow()
private val CGDisplayScreenSize_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayScreenSize_ADDR, CGDisplayScreenSize_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayScreenSize(allocator: SegmentAllocator, arg0: Int): MemorySegment {
    try {
        return CGDisplayScreenSize_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGDisplayScreenSizeTyped(allocator: SegmentAllocator, arg0: Int): CGSize {
    return CGSize(CGDisplayScreenSize(allocator, arg0))
}

/**
 * {@snippet lang=c : CGDisplayRotation Double(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayRotation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
private val CGDisplayRotation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayRotation").orElseThrow()
private val CGDisplayRotation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayRotation_ADDR, CGDisplayRotation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGDisplayRotation(arg0: Int): Double {
    try {
        return CGDisplayRotation_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayCopyColorSpace typedef CGColorSpaceRef = (Declared(CGColorSpace))*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDisplayCopyColorSpace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDisplayCopyColorSpace_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayCopyColorSpace").orElseThrow()
private val CGDisplayCopyColorSpace_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayCopyColorSpace_ADDR, CGDisplayCopyColorSpace_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGDisplayCopyColorSpace(arg0: Int): MemorySegment {
    try {
        return CGDisplayCopyColorSpace_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGConfigureDisplayMode typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGDirectDisplayID = UNSIGNED = Int,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGConfigureDisplayMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGConfigureDisplayMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConfigureDisplayMode").orElseThrow()
private val CGConfigureDisplayMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConfigureDisplayMode_ADDR, CGConfigureDisplayMode_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGConfigureDisplayMode(arg0: MemorySegment, arg1: Int, arg2: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGConfigureDisplayMode_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGConfigureDisplayFadeEffect typedef CGError = Declared(CGError)(typedef CGDisplayConfigRef = (Declared(_CGDisplayConfigRef))*,typedef CGDisplayFadeInterval = Float,typedef CGDisplayFadeInterval = Float,Float,Float,Float)
 */
private val CGConfigureDisplayFadeEffect_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
private val CGConfigureDisplayFadeEffect_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGConfigureDisplayFadeEffect").orElseThrow()
private val CGConfigureDisplayFadeEffect_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGConfigureDisplayFadeEffect_ADDR, CGConfigureDisplayFadeEffect_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGConfigureDisplayFadeEffect(arg0: MemorySegment, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float): CGError {
    try {
        return CGError.fromValue((CGConfigureDisplayFadeEffect_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGAcquireDisplayFadeReservation typedef CGError = Declared(CGError)(typedef CGDisplayReservationInterval = Float,(typedef CGDisplayFadeReservationToken = UNSIGNED = Int)*)
 */
private val CGAcquireDisplayFadeReservation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
private val CGAcquireDisplayFadeReservation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGAcquireDisplayFadeReservation").orElseThrow()
private val CGAcquireDisplayFadeReservation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGAcquireDisplayFadeReservation_ADDR, CGAcquireDisplayFadeReservation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGAcquireDisplayFadeReservation(arg0: Float, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGAcquireDisplayFadeReservation_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGReleaseDisplayFadeReservation typedef CGError = Declared(CGError)(typedef CGDisplayFadeReservationToken = UNSIGNED = Int)
 */
private val CGReleaseDisplayFadeReservation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGReleaseDisplayFadeReservation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGReleaseDisplayFadeReservation").orElseThrow()
private val CGReleaseDisplayFadeReservation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGReleaseDisplayFadeReservation_ADDR, CGReleaseDisplayFadeReservation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGReleaseDisplayFadeReservation(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGReleaseDisplayFadeReservation_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayFade typedef CGError = Declared(CGError)(typedef CGDisplayFadeReservationToken = UNSIGNED = Int,typedef CGDisplayFadeInterval = Float,typedef CGDisplayBlendFraction = Float,typedef CGDisplayBlendFraction = Float,Float,Float,Float,typedef boolean_t = Int)
 */
private val CGDisplayFade_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
private val CGDisplayFade_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayFade").orElseThrow()
private val CGDisplayFade_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayFade_ADDR, CGDisplayFade_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
fun CGDisplayFade(arg0: Int, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float, arg6: Float, arg7: Int): CGError {
    try {
        return CGError.fromValue((CGDisplayFade_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayFadeOperationInProgress typedef boolean_t = Int()
 */
private val CGDisplayFadeOperationInProgress_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGDisplayFadeOperationInProgress_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayFadeOperationInProgress").orElseThrow()
private val CGDisplayFadeOperationInProgress_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayFadeOperationInProgress_ADDR, CGDisplayFadeOperationInProgress_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "No longer supported")
fun CGDisplayFadeOperationInProgress(): Int {
    try {
        return CGDisplayFadeOperationInProgress_HANDLE.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamUpdateGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGDisplayStreamUpdateGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGDisplayStreamUpdateGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamUpdateGetTypeID").orElseThrow()
private val CGDisplayStreamUpdateGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamUpdateGetTypeID_ADDR, CGDisplayStreamUpdateGetTypeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamUpdateGetTypeID(): Long {
    try {
        return CGDisplayStreamUpdateGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamUpdateGetRects (typedef CGRect = Declared(CGRect))*(typedef CGDisplayStreamUpdateRef = (Declared(CGDisplayStreamUpdate))*,typedef CGDisplayStreamUpdateRectType = Declared(CGDisplayStreamUpdateRectType),(typedef size_t = UNSIGNED = Long)*)
 */
private val CGDisplayStreamUpdateGetRects_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplayStreamUpdateGetRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamUpdateGetRects").orElseThrow()
private val CGDisplayStreamUpdateGetRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamUpdateGetRects_ADDR, CGDisplayStreamUpdateGetRects_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamUpdateGetRects(arg0: MemorySegment, arg1: CGDisplayStreamUpdateRectType, arg2: MemorySegment): MemorySegment {
    try {
        return CGDisplayStreamUpdateGetRects_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamUpdateCreateMergedUpdate typedef CGDisplayStreamUpdateRef = (Declared(CGDisplayStreamUpdate))*(typedef CGDisplayStreamUpdateRef = (Declared(CGDisplayStreamUpdate))*,typedef CGDisplayStreamUpdateRef = (Declared(CGDisplayStreamUpdate))*)
 */
private val CGDisplayStreamUpdateCreateMergedUpdate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayStreamUpdateCreateMergedUpdate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamUpdateCreateMergedUpdate").orElseThrow()
private val CGDisplayStreamUpdateCreateMergedUpdate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamUpdateCreateMergedUpdate_ADDR, CGDisplayStreamUpdateCreateMergedUpdate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamUpdateCreateMergedUpdate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGDisplayStreamUpdateCreateMergedUpdate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamUpdateGetMovedRectsDelta Void(typedef CGDisplayStreamUpdateRef = (Declared(CGDisplayStreamUpdate))*,(typedef CGFloat = Double)*,(typedef CGFloat = Double)*)
 */
private val CGDisplayStreamUpdateGetMovedRectsDelta_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayStreamUpdateGetMovedRectsDelta_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamUpdateGetMovedRectsDelta").orElseThrow()
private val CGDisplayStreamUpdateGetMovedRectsDelta_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamUpdateGetMovedRectsDelta_ADDR, CGDisplayStreamUpdateGetMovedRectsDelta_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamUpdateGetMovedRectsDelta(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CGDisplayStreamUpdateGetMovedRectsDelta_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamUpdateGetDropCount typedef size_t = UNSIGNED = Long(typedef CGDisplayStreamUpdateRef = (Declared(CGDisplayStreamUpdate))*)
 */
private val CGDisplayStreamUpdateGetDropCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGDisplayStreamUpdateGetDropCount_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamUpdateGetDropCount").orElseThrow()
private val CGDisplayStreamUpdateGetDropCount_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamUpdateGetDropCount_ADDR, CGDisplayStreamUpdateGetDropCount_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamUpdateGetDropCount(arg0: MemorySegment): Long {
    try {
        return CGDisplayStreamUpdateGetDropCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCGDisplayStreamSourceRect typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamSourceRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamSourceRect_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamSourceRect").orElseThrow().reinterpret(kCGDisplayStreamSourceRect_LAYOUT.byteSize()) }
private val kCGDisplayStreamSourceRect_VH: VarHandle by lazy { kCGDisplayStreamSourceRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamSourceRect: MemorySegment
    get() = kCGDisplayStreamSourceRect_VH.get(kCGDisplayStreamSourceRect_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamSourceRect_VH.set(kCGDisplayStreamSourceRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamDestinationRect typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamDestinationRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamDestinationRect_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamDestinationRect").orElseThrow().reinterpret(kCGDisplayStreamDestinationRect_LAYOUT.byteSize()) }
private val kCGDisplayStreamDestinationRect_VH: VarHandle by lazy { kCGDisplayStreamDestinationRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamDestinationRect: MemorySegment
    get() = kCGDisplayStreamDestinationRect_VH.get(kCGDisplayStreamDestinationRect_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamDestinationRect_VH.set(kCGDisplayStreamDestinationRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamPreserveAspectRatio typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamPreserveAspectRatio_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamPreserveAspectRatio_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamPreserveAspectRatio").orElseThrow().reinterpret(kCGDisplayStreamPreserveAspectRatio_LAYOUT.byteSize()) }
private val kCGDisplayStreamPreserveAspectRatio_VH: VarHandle by lazy { kCGDisplayStreamPreserveAspectRatio_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamPreserveAspectRatio: MemorySegment
    get() = kCGDisplayStreamPreserveAspectRatio_VH.get(kCGDisplayStreamPreserveAspectRatio_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamPreserveAspectRatio_VH.set(kCGDisplayStreamPreserveAspectRatio_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamColorSpace typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamColorSpace_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamColorSpace").orElseThrow().reinterpret(kCGDisplayStreamColorSpace_LAYOUT.byteSize()) }
private val kCGDisplayStreamColorSpace_VH: VarHandle by lazy { kCGDisplayStreamColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamColorSpace: MemorySegment
    get() = kCGDisplayStreamColorSpace_VH.get(kCGDisplayStreamColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamColorSpace_VH.set(kCGDisplayStreamColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamMinimumFrameTime typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamMinimumFrameTime_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamMinimumFrameTime_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamMinimumFrameTime").orElseThrow().reinterpret(kCGDisplayStreamMinimumFrameTime_LAYOUT.byteSize()) }
private val kCGDisplayStreamMinimumFrameTime_VH: VarHandle by lazy { kCGDisplayStreamMinimumFrameTime_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamMinimumFrameTime: MemorySegment
    get() = kCGDisplayStreamMinimumFrameTime_VH.get(kCGDisplayStreamMinimumFrameTime_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamMinimumFrameTime_VH.set(kCGDisplayStreamMinimumFrameTime_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamShowCursor typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamShowCursor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamShowCursor_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamShowCursor").orElseThrow().reinterpret(kCGDisplayStreamShowCursor_LAYOUT.byteSize()) }
private val kCGDisplayStreamShowCursor_VH: VarHandle by lazy { kCGDisplayStreamShowCursor_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamShowCursor: MemorySegment
    get() = kCGDisplayStreamShowCursor_VH.get(kCGDisplayStreamShowCursor_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamShowCursor_VH.set(kCGDisplayStreamShowCursor_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamQueueDepth typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamQueueDepth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamQueueDepth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamQueueDepth").orElseThrow().reinterpret(kCGDisplayStreamQueueDepth_LAYOUT.byteSize()) }
private val kCGDisplayStreamQueueDepth_VH: VarHandle by lazy { kCGDisplayStreamQueueDepth_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamQueueDepth: MemorySegment
    get() = kCGDisplayStreamQueueDepth_VH.get(kCGDisplayStreamQueueDepth_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamQueueDepth_VH.set(kCGDisplayStreamQueueDepth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamYCbCrMatrix typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamYCbCrMatrix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamYCbCrMatrix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamYCbCrMatrix").orElseThrow().reinterpret(kCGDisplayStreamYCbCrMatrix_LAYOUT.byteSize()) }
private val kCGDisplayStreamYCbCrMatrix_VH: VarHandle by lazy { kCGDisplayStreamYCbCrMatrix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
var kCGDisplayStreamYCbCrMatrix: MemorySegment
    get() = kCGDisplayStreamYCbCrMatrix_VH.get(kCGDisplayStreamYCbCrMatrix_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamYCbCrMatrix_VH.set(kCGDisplayStreamYCbCrMatrix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamYCbCrMatrix_ITU_R_709_2 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamYCbCrMatrix_ITU_R_709_2").orElseThrow().reinterpret(kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_LAYOUT.byteSize()) }
private val kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_VH: VarHandle by lazy { kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_LAYOUT.varHandle() }

var kCGDisplayStreamYCbCrMatrix_ITU_R_709_2: MemorySegment
    get() = kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_VH.get(kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_VH.set(kCGDisplayStreamYCbCrMatrix_ITU_R_709_2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamYCbCrMatrix_ITU_R_601_4 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamYCbCrMatrix_ITU_R_601_4").orElseThrow().reinterpret(kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_LAYOUT.byteSize()) }
private val kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_VH: VarHandle by lazy { kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_LAYOUT.varHandle() }

var kCGDisplayStreamYCbCrMatrix_ITU_R_601_4: MemorySegment
    get() = kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_VH.get(kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_VH.set(kCGDisplayStreamYCbCrMatrix_ITU_R_601_4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995 typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995").orElseThrow().reinterpret(kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_LAYOUT.byteSize()) }
private val kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_VH: VarHandle by lazy { kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_LAYOUT.varHandle() }

var kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995: MemorySegment
    get() = kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_VH.get(kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_SEGMENT, 0L) as MemorySegment
    set(value) = kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_VH.set(kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CGDisplayStreamGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGDisplayStreamGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGDisplayStreamGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamGetTypeID").orElseThrow()
private val CGDisplayStreamGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamGetTypeID_ADDR, CGDisplayStreamGetTypeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamGetTypeID(): Long {
    try {
        return CGDisplayStreamGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamCreate typedef CGDisplayStreamRef = (Declared(CGDisplayStream))*(typedef CGDirectDisplayID = UNSIGNED = Int,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef int32_t = Int,typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef CGDisplayStreamFrameAvailableHandler = (Void)*)
 */
private val CGDisplayStreamCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayStreamCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamCreate").orElseThrow()
private val CGDisplayStreamCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamCreate_ADDR, CGDisplayStreamCreate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamCreate(arg0: Int, arg1: Long, arg2: Long, arg3: Int, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CGDisplayStreamCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamCreateWithDispatchQueue typedef CGDisplayStreamRef = (Declared(CGDisplayStream))*(typedef CGDirectDisplayID = UNSIGNED = Int,typedef size_t = UNSIGNED = Long,typedef size_t = UNSIGNED = Long,typedef int32_t = Int,typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef dispatch_queue_t = (Void)*,typedef CGDisplayStreamFrameAvailableHandler = (Void)*)
 */
private val CGDisplayStreamCreateWithDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayStreamCreateWithDispatchQueue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamCreateWithDispatchQueue").orElseThrow()
private val CGDisplayStreamCreateWithDispatchQueue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamCreateWithDispatchQueue_ADDR, CGDisplayStreamCreateWithDispatchQueue_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamCreateWithDispatchQueue(arg0: Int, arg1: Long, arg2: Long, arg3: Int, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CGDisplayStreamCreateWithDispatchQueue_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamStart typedef CGError = Declared(CGError)(typedef CGDisplayStreamRef = (Declared(CGDisplayStream))*)
 */
private val CGDisplayStreamStart_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplayStreamStart_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamStart").orElseThrow()
private val CGDisplayStreamStart_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamStart_ADDR, CGDisplayStreamStart_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamStart(arg0: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplayStreamStart_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamStop typedef CGError = Declared(CGError)(typedef CGDisplayStreamRef = (Declared(CGDisplayStream))*)
 */
private val CGDisplayStreamStop_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGDisplayStreamStop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamStop").orElseThrow()
private val CGDisplayStreamStop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamStop_ADDR, CGDisplayStreamStop_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamStop(arg0: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGDisplayStreamStop_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDisplayStreamGetRunLoopSource typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CGDisplayStreamRef = (Declared(CGDisplayStream))*)
 */
private val CGDisplayStreamGetRunLoopSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGDisplayStreamGetRunLoopSource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDisplayStreamGetRunLoopSource").orElseThrow()
private val CGDisplayStreamGetRunLoopSource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDisplayStreamGetRunLoopSource_ADDR, CGDisplayStreamGetRunLoopSource_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, obsoletedMajor = 15, obsoletedMinor = 0, obsoletedSubminor = -1, message = "Please use ScreenCaptureKit instead.")
fun CGDisplayStreamGetRunLoopSource(arg0: MemorySegment): MemorySegment {
    try {
        return CGDisplayStreamGetRunLoopSource_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRegisterScreenRefreshCallback typedef CGError = Declared(CGError)(typedef CGScreenRefreshCallback = (Void(UNSIGNED = Int,(Declared(CGRect))*,(Void)*))*,(Void)*)
 */
private val CGRegisterScreenRefreshCallback_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGRegisterScreenRefreshCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRegisterScreenRefreshCallback").orElseThrow()
private val CGRegisterScreenRefreshCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRegisterScreenRefreshCallback_ADDR, CGRegisterScreenRefreshCallback_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGRegisterScreenRefreshCallback(arg0: MemorySegment, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGRegisterScreenRefreshCallback_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGUnregisterScreenRefreshCallback Void(typedef CGScreenRefreshCallback = (Void(UNSIGNED = Int,(Declared(CGRect))*,(Void)*))*,(Void)*)
 */
private val CGUnregisterScreenRefreshCallback_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGUnregisterScreenRefreshCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGUnregisterScreenRefreshCallback").orElseThrow()
private val CGUnregisterScreenRefreshCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGUnregisterScreenRefreshCallback_ADDR, CGUnregisterScreenRefreshCallback_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGUnregisterScreenRefreshCallback(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGUnregisterScreenRefreshCallback_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWaitForScreenRefreshRects typedef CGError = Declared(CGError)(((typedef CGRect = Declared(CGRect))*)*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGWaitForScreenRefreshRects_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGWaitForScreenRefreshRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWaitForScreenRefreshRects").orElseThrow()
private val CGWaitForScreenRefreshRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWaitForScreenRefreshRects_ADDR, CGWaitForScreenRefreshRects_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGWaitForScreenRefreshRects(arg0: MemorySegment, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGWaitForScreenRefreshRects_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGScreenRegisterMoveCallback typedef CGError = Declared(CGError)(typedef CGScreenUpdateMoveCallback = (Void(Declared(CGScreenUpdateMoveDelta),UNSIGNED = Long,(Declared(CGRect))*,(Void)*))*,(Void)*)
 */
private val CGScreenRegisterMoveCallback_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGScreenRegisterMoveCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGScreenRegisterMoveCallback").orElseThrow()
private val CGScreenRegisterMoveCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGScreenRegisterMoveCallback_ADDR, CGScreenRegisterMoveCallback_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGScreenRegisterMoveCallback(arg0: MemorySegment, arg1: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGScreenRegisterMoveCallback_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGScreenUnregisterMoveCallback Void(typedef CGScreenUpdateMoveCallback = (Void(Declared(CGScreenUpdateMoveDelta),UNSIGNED = Long,(Declared(CGRect))*,(Void)*))*,(Void)*)
 */
private val CGScreenUnregisterMoveCallback_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGScreenUnregisterMoveCallback_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGScreenUnregisterMoveCallback").orElseThrow()
private val CGScreenUnregisterMoveCallback_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGScreenUnregisterMoveCallback_ADDR, CGScreenUnregisterMoveCallback_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGScreenUnregisterMoveCallback(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGScreenUnregisterMoveCallback_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWaitForScreenUpdateRects typedef CGError = Declared(CGError)(typedef CGScreenUpdateOperation = Declared(CGScreenUpdateOperation),(typedef CGScreenUpdateOperation = Declared(CGScreenUpdateOperation))*,((typedef CGRect = Declared(CGRect))*)*,(typedef size_t = UNSIGNED = Long)*,(typedef CGScreenUpdateMoveDelta = Declared(CGScreenUpdateMoveDelta))*)
 */
private val CGWaitForScreenUpdateRects_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGWaitForScreenUpdateRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWaitForScreenUpdateRects").orElseThrow()
private val CGWaitForScreenUpdateRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWaitForScreenUpdateRects_ADDR, CGWaitForScreenUpdateRects_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGWaitForScreenUpdateRects(arg0: CGScreenUpdateOperation, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGWaitForScreenUpdateRects_HANDLE.invokeExact(arg0.rawValue.toInt(), arg1, arg2, arg3, arg4) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGReleaseScreenRefreshRects Void((typedef CGRect = Declared(CGRect))*)
 */
private val CGReleaseScreenRefreshRects_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CGReleaseScreenRefreshRects_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGReleaseScreenRefreshRects").orElseThrow()
private val CGReleaseScreenRefreshRects_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGReleaseScreenRefreshRects_ADDR, CGReleaseScreenRefreshRects_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGReleaseScreenRefreshRects(arg0: MemorySegment): Unit {
    try {
        CGReleaseScreenRefreshRects_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGCursorIsVisible typedef boolean_t = Int()
 */
private val CGCursorIsVisible_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGCursorIsVisible_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGCursorIsVisible").orElseThrow()
private val CGCursorIsVisible_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGCursorIsVisible_ADDR, CGCursorIsVisible_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "No longer supported")
fun CGCursorIsVisible(): Int {
    try {
        return CGCursorIsVisible_HANDLE.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGCursorIsDrawnInFramebuffer typedef boolean_t = Int()
 */
private val CGCursorIsDrawnInFramebuffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CGCursorIsDrawnInFramebuffer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGCursorIsDrawnInFramebuffer").orElseThrow()
private val CGCursorIsDrawnInFramebuffer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGCursorIsDrawnInFramebuffer_ADDR, CGCursorIsDrawnInFramebuffer_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "No longer supported")
fun CGCursorIsDrawnInFramebuffer(): Int {
    try {
        return CGCursorIsDrawnInFramebuffer_HANDLE.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWarpMouseCursorPosition typedef CGError = Declared(CGError)(typedef CGPoint = Declared(CGPoint))
 */
private val CGWarpMouseCursorPosition_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, CGPoint.layout)
private val CGWarpMouseCursorPosition_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWarpMouseCursorPosition").orElseThrow()
private val CGWarpMouseCursorPosition_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWarpMouseCursorPosition_ADDR, CGWarpMouseCursorPosition_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGWarpMouseCursorPosition(arg0: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGWarpMouseCursorPosition_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGWarpMouseCursorPosition(arg0: CGPoint): CGError {
    return CGWarpMouseCursorPosition(arg0.segment)
}

/**
 * {@snippet lang=c : CGAssociateMouseAndMouseCursorPosition typedef CGError = Declared(CGError)(typedef boolean_t = Int)
 */
private val CGAssociateMouseAndMouseCursorPosition_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGAssociateMouseAndMouseCursorPosition_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGAssociateMouseAndMouseCursorPosition").orElseThrow()
private val CGAssociateMouseAndMouseCursorPosition_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGAssociateMouseAndMouseCursorPosition_ADDR, CGAssociateMouseAndMouseCursorPosition_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun CGAssociateMouseAndMouseCursorPosition(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGAssociateMouseAndMouseCursorPosition_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWindowServerCreateServerPort typedef CFMachPortRef = (Declared(__CFMachPort))*()
 */
private val CGWindowServerCreateServerPort_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGWindowServerCreateServerPort_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowServerCreateServerPort").orElseThrow()
private val CGWindowServerCreateServerPort_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowServerCreateServerPort_ADDR, CGWindowServerCreateServerPort_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
fun CGWindowServerCreateServerPort(): MemorySegment {
    try {
        return CGWindowServerCreateServerPort_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEnableEventStateCombining typedef CGError = Declared(CGError)(typedef boolean_t = Int)
 */
private val CGEnableEventStateCombining_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEnableEventStateCombining_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEnableEventStateCombining").orElseThrow()
private val CGEnableEventStateCombining_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEnableEventStateCombining_ADDR, CGEnableEventStateCombining_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGEnableEventStateCombining(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGEnableEventStateCombining_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGInhibitLocalEvents typedef CGError = Declared(CGError)(typedef boolean_t = Int)
 */
private val CGInhibitLocalEvents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGInhibitLocalEvents_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGInhibitLocalEvents").orElseThrow()
private val CGInhibitLocalEvents_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGInhibitLocalEvents_ADDR, CGInhibitLocalEvents_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGInhibitLocalEvents(arg0: Int): CGError {
    try {
        return CGError.fromValue((CGInhibitLocalEvents_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPostMouseEvent typedef CGError = Declared(CGError)(typedef CGPoint = Declared(CGPoint),typedef boolean_t = Int,typedef CGButtonCount = UNSIGNED = Int,typedef boolean_t = Int)
 */
private val CGPostMouseEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, CGPoint.layout, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGPostMouseEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPostMouseEvent").orElseThrow()
private val CGPostMouseEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPostMouseEvent_ADDR, CGPostMouseEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGPostMouseEvent(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int): CGError {
    try {
        return CGError.fromValue((CGPostMouseEvent_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPostScrollWheelEvent typedef CGError = Declared(CGError)(typedef CGWheelCount = UNSIGNED = Int,typedef int32_t = Int)
 */
private val CGPostScrollWheelEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGPostScrollWheelEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPostScrollWheelEvent").orElseThrow()
private val CGPostScrollWheelEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPostScrollWheelEvent_ADDR, CGPostScrollWheelEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGPostScrollWheelEvent(arg0: Int, arg1: Int): CGError {
    try {
        return CGError.fromValue((CGPostScrollWheelEvent_HANDLE.invokeExact(arg0, arg1) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPostKeyboardEvent typedef CGError = Declared(CGError)(typedef CGCharCode = UNSIGNED = Short,typedef CGKeyCode = UNSIGNED = Short,typedef boolean_t = Int)
 */
private val CGPostKeyboardEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_INT)
private val CGPostKeyboardEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPostKeyboardEvent").orElseThrow()
private val CGPostKeyboardEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPostKeyboardEvent_ADDR, CGPostKeyboardEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGPostKeyboardEvent(arg0: Short, arg1: Short, arg2: Int): CGError {
    try {
        return CGError.fromValue((CGPostKeyboardEvent_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSetLocalEventsFilterDuringSuppressionState typedef CGError = Declared(CGError)(typedef CGEventFilterMask = Declared(CGEventFilterMask),typedef CGEventSuppressionState = Declared(CGEventSuppressionState))
 */
private val CGSetLocalEventsFilterDuringSuppressionState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGSetLocalEventsFilterDuringSuppressionState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGSetLocalEventsFilterDuringSuppressionState").orElseThrow()
private val CGSetLocalEventsFilterDuringSuppressionState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGSetLocalEventsFilterDuringSuppressionState_ADDR, CGSetLocalEventsFilterDuringSuppressionState_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGSetLocalEventsFilterDuringSuppressionState(arg0: CGEventFilterMask, arg1: CGEventSuppressionState): CGError {
    try {
        return CGError.fromValue((CGSetLocalEventsFilterDuringSuppressionState_HANDLE.invokeExact(arg0.rawValue.toInt(), arg1.value.toInt()) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSetLocalEventsSuppressionInterval typedef CGError = Declared(CGError)(typedef CFTimeInterval = Double)
 */
private val CGSetLocalEventsSuppressionInterval_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
private val CGSetLocalEventsSuppressionInterval_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGSetLocalEventsSuppressionInterval").orElseThrow()
private val CGSetLocalEventsSuppressionInterval_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGSetLocalEventsSuppressionInterval_ADDR, CGSetLocalEventsSuppressionInterval_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "No longer supported")
fun CGSetLocalEventsSuppressionInterval(arg0: Double): CGError {
    try {
        return CGError.fromValue((CGSetLocalEventsSuppressionInterval_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGWindowServerCFMachPort typedef CFMachPortRef = (Declared(__CFMachPort))*()
 */
private val CGWindowServerCFMachPort_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGWindowServerCFMachPort_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGWindowServerCFMachPort").orElseThrow()
private val CGWindowServerCFMachPort_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGWindowServerCFMachPort_ADDR, CGWindowServerCFMachPort_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "No longer supported")
fun CGWindowServerCFMachPort(): MemorySegment {
    try {
        return CGWindowServerCFMachPort_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGEventGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGEventGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetTypeID").orElseThrow()
private val CGEventGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetTypeID_ADDR, CGEventGetTypeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetTypeID(): Long {
    try {
        return CGEventGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreate typedef CGEventRef = (Declared(__CGEvent))*(typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreate").orElseThrow()
private val CGEventCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreate_ADDR, CGEventCreate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreate(arg0: MemorySegment): MemorySegment {
    try {
        return CGEventCreate_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateData typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventCreateData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventCreateData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateData").orElseThrow()
private val CGEventCreateData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateData_ADDR, CGEventCreateData_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateData(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGEventCreateData_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateFromData typedef CGEventRef = (Declared(__CGEvent))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CGEventCreateFromData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventCreateFromData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateFromData").orElseThrow()
private val CGEventCreateFromData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateFromData_ADDR, CGEventCreateFromData_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateFromData(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CGEventCreateFromData_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateMouseEvent typedef CGEventRef = (Declared(__CGEvent))*(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGEventType = Declared(CGEventType),typedef CGPoint = Declared(CGPoint),typedef CGMouseButton = Declared(CGMouseButton))
 */
private val CGEventCreateMouseEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, CGPoint.layout, ValueLayout.JAVA_INT)
private val CGEventCreateMouseEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateMouseEvent").orElseThrow()
private val CGEventCreateMouseEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateMouseEvent_ADDR, CGEventCreateMouseEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateMouseEvent(arg0: MemorySegment, arg1: CGEventType, arg2: MemorySegment, arg3: CGMouseButton): MemorySegment {
    try {
        return CGEventCreateMouseEvent_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2, arg3.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateMouseEvent(arg0: MemorySegment, arg1: CGEventType, arg2: CGPoint, arg3: CGMouseButton): MemorySegment {
    return CGEventCreateMouseEvent(arg0, arg1, arg2.segment, arg3)
}

/**
 * {@snippet lang=c : CGEventCreateKeyboardEvent typedef CGEventRef = (Declared(__CGEvent))*(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGKeyCode = UNSIGNED = Short,Bool)
 */
private val CGEventCreateKeyboardEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_BOOLEAN)
private val CGEventCreateKeyboardEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateKeyboardEvent").orElseThrow()
private val CGEventCreateKeyboardEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateKeyboardEvent_ADDR, CGEventCreateKeyboardEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateKeyboardEvent(arg0: MemorySegment, arg1: Short, arg2: Boolean): MemorySegment {
    try {
        return CGEventCreateKeyboardEvent_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateScrollWheelEvent typedef CGEventRef = (Declared(__CGEvent))*(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGScrollEventUnit = Declared(CGScrollEventUnit),typedef uint32_t = UNSIGNED = Int,typedef int32_t = Int)
 */
private val CGEventCreateScrollWheelEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEventCreateScrollWheelEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateScrollWheelEvent").orElseThrow()
private val CGEventCreateScrollWheelEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateScrollWheelEvent_ADDR, CGEventCreateScrollWheelEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGEventCreateScrollWheelEvent(arg0: MemorySegment, arg1: CGScrollEventUnit, arg2: Int, arg3: Int): MemorySegment {
    try {
        return CGEventCreateScrollWheelEvent_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateScrollWheelEvent2 typedef CGEventRef = (Declared(__CGEvent))*(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGScrollEventUnit = Declared(CGScrollEventUnit),typedef uint32_t = UNSIGNED = Int,typedef int32_t = Int,typedef int32_t = Int,typedef int32_t = Int)
 */
private val CGEventCreateScrollWheelEvent2_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEventCreateScrollWheelEvent2_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateScrollWheelEvent2").orElseThrow()
private val CGEventCreateScrollWheelEvent2_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateScrollWheelEvent2_ADDR, CGEventCreateScrollWheelEvent2_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
fun CGEventCreateScrollWheelEvent2(arg0: MemorySegment, arg1: CGScrollEventUnit, arg2: Int, arg3: Int, arg4: Int, arg5: Int): MemorySegment {
    try {
        return CGEventCreateScrollWheelEvent2_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateCopy typedef CGEventRef = (Declared(__CGEvent))*(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventCreateCopy_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateCopy").orElseThrow()
private val CGEventCreateCopy_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateCopy_ADDR, CGEventCreateCopy_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateCopy(arg0: MemorySegment): MemorySegment {
    try {
        return CGEventCreateCopy_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventCreateSourceFromEvent typedef CGEventSourceRef = (Declared(__CGEventSource))*(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventCreateSourceFromEvent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventCreateSourceFromEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventCreateSourceFromEvent").orElseThrow()
private val CGEventCreateSourceFromEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventCreateSourceFromEvent_ADDR, CGEventCreateSourceFromEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventCreateSourceFromEvent(arg0: MemorySegment): MemorySegment {
    try {
        return CGEventCreateSourceFromEvent_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSetSource Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventSetSource_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventSetSource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetSource").orElseThrow()
private val CGEventSetSource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetSource_ADDR, CGEventSetSource_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetSource(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGEventSetSource_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventGetType typedef CGEventType = Declared(CGEventType)(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventGetType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGEventGetType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetType").orElseThrow()
private val CGEventGetType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetType_ADDR, CGEventGetType_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetType(arg0: MemorySegment): CGEventType {
    try {
        return CGEventType.fromValue(Integer.toUnsignedLong(CGEventGetType_HANDLE.invokeExact(arg0) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSetType Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventType = Declared(CGEventType))
 */
private val CGEventSetType_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGEventSetType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetType").orElseThrow()
private val CGEventSetType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetType_ADDR, CGEventSetType_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetType(arg0: MemorySegment, arg1: CGEventType): Unit {
    try {
        CGEventSetType_HANDLE.invokeExact(arg0, arg1.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventGetTimestamp typedef CGEventTimestamp = UNSIGNED = LongLong(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventGetTimestamp_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGEventGetTimestamp_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetTimestamp").orElseThrow()
private val CGEventGetTimestamp_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetTimestamp_ADDR, CGEventGetTimestamp_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetTimestamp(arg0: MemorySegment): Long {
    try {
        return CGEventGetTimestamp_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSetTimestamp Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventTimestamp = UNSIGNED = LongLong)
 */
private val CGEventSetTimestamp_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGEventSetTimestamp_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetTimestamp").orElseThrow()
private val CGEventSetTimestamp_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetTimestamp_ADDR, CGEventSetTimestamp_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetTimestamp(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CGEventSetTimestamp_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventGetLocation typedef CGPoint = Declared(CGPoint)(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventGetLocation_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS)
private val CGEventGetLocation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetLocation").orElseThrow()
private val CGEventGetLocation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetLocation_ADDR, CGEventGetLocation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetLocation(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGEventGetLocation_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetLocationTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGEventGetLocation(allocator, arg0))
}

/**
 * {@snippet lang=c : CGEventGetUnflippedLocation typedef CGPoint = Declared(CGPoint)(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventGetUnflippedLocation_DESC: FunctionDescriptor = FunctionDescriptor.of(CGPoint.layout, ValueLayout.ADDRESS)
private val CGEventGetUnflippedLocation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetUnflippedLocation").orElseThrow()
private val CGEventGetUnflippedLocation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetUnflippedLocation_ADDR, CGEventGetUnflippedLocation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGEventGetUnflippedLocation(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CGEventGetUnflippedLocation_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGEventGetUnflippedLocationTyped(allocator: SegmentAllocator, arg0: MemorySegment): CGPoint {
    return CGPoint(CGEventGetUnflippedLocation(allocator, arg0))
}

/**
 * {@snippet lang=c : CGEventSetLocation Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGPoint = Declared(CGPoint))
 */
private val CGEventSetLocation_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CGPoint.layout)
private val CGEventSetLocation_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetLocation").orElseThrow()
private val CGEventSetLocation_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetLocation_ADDR, CGEventSetLocation_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetLocation(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGEventSetLocation_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetLocation(arg0: MemorySegment, arg1: CGPoint): Unit {
    CGEventSetLocation(arg0, arg1.segment)
}

/**
 * {@snippet lang=c : CGEventGetFlags typedef CGEventFlags = Declared(CGEventFlags)(typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventGetFlags_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGEventGetFlags_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetFlags").orElseThrow()
private val CGEventGetFlags_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetFlags_ADDR, CGEventGetFlags_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetFlags(arg0: MemorySegment): CGEventFlags {
    try {
        return CGEventFlags(CGEventGetFlags_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSetFlags Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventFlags = Declared(CGEventFlags))
 */
private val CGEventSetFlags_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGEventSetFlags_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetFlags").orElseThrow()
private val CGEventSetFlags_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetFlags_ADDR, CGEventSetFlags_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetFlags(arg0: MemorySegment, arg1: CGEventFlags): Unit {
    try {
        CGEventSetFlags_HANDLE.invokeExact(arg0, arg1.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventKeyboardGetUnicodeString Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef UniCharCount = UNSIGNED = Long,(typedef UniCharCount = UNSIGNED = Long)*,(typedef UniChar = UNSIGNED = Short)*)
 */
private val CGEventKeyboardGetUnicodeString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventKeyboardGetUnicodeString_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventKeyboardGetUnicodeString").orElseThrow()
private val CGEventKeyboardGetUnicodeString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventKeyboardGetUnicodeString_ADDR, CGEventKeyboardGetUnicodeString_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventKeyboardGetUnicodeString(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment): Unit {
    try {
        CGEventKeyboardGetUnicodeString_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventKeyboardSetUnicodeString Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef UniCharCount = UNSIGNED = Long,(typedef UniChar = UNSIGNED = Short)*)
 */
private val CGEventKeyboardSetUnicodeString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGEventKeyboardSetUnicodeString_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventKeyboardSetUnicodeString").orElseThrow()
private val CGEventKeyboardSetUnicodeString_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventKeyboardSetUnicodeString_ADDR, CGEventKeyboardSetUnicodeString_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventKeyboardSetUnicodeString(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Unit {
    try {
        CGEventKeyboardSetUnicodeString_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventGetIntegerValueField typedef int64_t = LongLong(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventField = Declared(CGEventField))
 */
private val CGEventGetIntegerValueField_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGEventGetIntegerValueField_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetIntegerValueField").orElseThrow()
private val CGEventGetIntegerValueField_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetIntegerValueField_ADDR, CGEventGetIntegerValueField_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetIntegerValueField(arg0: MemorySegment, arg1: CGEventField): Long {
    try {
        return CGEventGetIntegerValueField_HANDLE.invokeExact(arg0, arg1.value.toInt()) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSetIntegerValueField Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventField = Declared(CGEventField),typedef int64_t = LongLong)
 */
private val CGEventSetIntegerValueField_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val CGEventSetIntegerValueField_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetIntegerValueField").orElseThrow()
private val CGEventSetIntegerValueField_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetIntegerValueField_ADDR, CGEventSetIntegerValueField_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetIntegerValueField(arg0: MemorySegment, arg1: CGEventField, arg2: Long): Unit {
    try {
        CGEventSetIntegerValueField_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventGetDoubleValueField Double(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventField = Declared(CGEventField))
 */
private val CGEventGetDoubleValueField_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGEventGetDoubleValueField_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventGetDoubleValueField").orElseThrow()
private val CGEventGetDoubleValueField_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventGetDoubleValueField_ADDR, CGEventGetDoubleValueField_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventGetDoubleValueField(arg0: MemorySegment, arg1: CGEventField): Double {
    try {
        return CGEventGetDoubleValueField_HANDLE.invokeExact(arg0, arg1.value.toInt()) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSetDoubleValueField Void(typedef CGEventRef = (Declared(__CGEvent))*,typedef CGEventField = Declared(CGEventField),Double)
 */
private val CGEventSetDoubleValueField_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
private val CGEventSetDoubleValueField_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSetDoubleValueField").orElseThrow()
private val CGEventSetDoubleValueField_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSetDoubleValueField_ADDR, CGEventSetDoubleValueField_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSetDoubleValueField(arg0: MemorySegment, arg1: CGEventField, arg2: Double): Unit {
    try {
        CGEventSetDoubleValueField_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventTapCreate typedef CFMachPortRef = (Declared(__CFMachPort))*(typedef CGEventTapLocation = Declared(CGEventTapLocation),typedef CGEventTapPlacement = Declared(CGEventTapPlacement),typedef CGEventTapOptions = Declared(CGEventTapOptions),typedef CGEventMask = UNSIGNED = LongLong,typedef CGEventTapCallBack = ((Declared(__CGEvent))*((Declared(__CGEventTapProxy))*,Declared(CGEventType),(Declared(__CGEvent))*,(Void)*))*,(Void)*)
 */
private val CGEventTapCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventTapCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventTapCreate").orElseThrow()
private val CGEventTapCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventTapCreate_ADDR, CGEventTapCreate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventTapCreate(arg0: CGEventTapLocation, arg1: CGEventTapPlacement, arg2: CGEventTapOptions, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CGEventTapCreate_HANDLE.invokeExact(arg0.value.toInt(), arg1.value.toInt(), arg2.value.toInt(), arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventTapCreateForPSN typedef CFMachPortRef = (Declared(__CFMachPort))*((Void)*,typedef CGEventTapPlacement = Declared(CGEventTapPlacement),typedef CGEventTapOptions = Declared(CGEventTapOptions),typedef CGEventMask = UNSIGNED = LongLong,typedef CGEventTapCallBack = ((Declared(__CGEvent))*((Declared(__CGEventTapProxy))*,Declared(CGEventType),(Declared(__CGEvent))*,(Void)*))*,(Void)*)
 */
private val CGEventTapCreateForPSN_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventTapCreateForPSN_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventTapCreateForPSN").orElseThrow()
private val CGEventTapCreateForPSN_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventTapCreateForPSN_ADDR, CGEventTapCreateForPSN_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventTapCreateForPSN(arg0: MemorySegment, arg1: CGEventTapPlacement, arg2: CGEventTapOptions, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CGEventTapCreateForPSN_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2.value.toInt(), arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventTapCreateForPid typedef CFMachPortRef = (Declared(__CFMachPort))*(typedef pid_t = Int,typedef CGEventTapPlacement = Declared(CGEventTapPlacement),typedef CGEventTapOptions = Declared(CGEventTapOptions),typedef CGEventMask = UNSIGNED = LongLong,typedef CGEventTapCallBack = ((Declared(__CGEvent))*((Declared(__CGEventTapProxy))*,Declared(CGEventType),(Declared(__CGEvent))*,(Void)*))*,(Void)*)
 */
private val CGEventTapCreateForPid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventTapCreateForPid_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventTapCreateForPid").orElseThrow()
private val CGEventTapCreateForPid_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventTapCreateForPid_ADDR, CGEventTapCreateForPid_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun CGEventTapCreateForPid(arg0: Int, arg1: CGEventTapPlacement, arg2: CGEventTapOptions, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CGEventTapCreateForPid_HANDLE.invokeExact(arg0, arg1.value.toInt(), arg2.value.toInt(), arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventTapEnable Void(typedef CFMachPortRef = (Declared(__CFMachPort))*,Bool)
 */
private val CGEventTapEnable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN)
private val CGEventTapEnable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventTapEnable").orElseThrow()
private val CGEventTapEnable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventTapEnable_ADDR, CGEventTapEnable_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventTapEnable(arg0: MemorySegment, arg1: Boolean): Unit {
    try {
        CGEventTapEnable_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventTapIsEnabled Bool(typedef CFMachPortRef = (Declared(__CFMachPort))*)
 */
private val CGEventTapIsEnabled_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGEventTapIsEnabled_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventTapIsEnabled").orElseThrow()
private val CGEventTapIsEnabled_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventTapIsEnabled_ADDR, CGEventTapIsEnabled_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventTapIsEnabled(arg0: MemorySegment): Boolean {
    try {
        return CGEventTapIsEnabled_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventTapPostEvent Void(typedef CGEventTapProxy = (Declared(__CGEventTapProxy))*,typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventTapPostEvent_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventTapPostEvent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventTapPostEvent").orElseThrow()
private val CGEventTapPostEvent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventTapPostEvent_ADDR, CGEventTapPostEvent_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventTapPostEvent(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGEventTapPostEvent_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventPost Void(typedef CGEventTapLocation = Declared(CGEventTapLocation),typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventPost_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGEventPost_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventPost").orElseThrow()
private val CGEventPost_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventPost_ADDR, CGEventPost_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventPost(arg0: CGEventTapLocation, arg1: MemorySegment): Unit {
    try {
        CGEventPost_HANDLE.invokeExact(arg0.value.toInt(), arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventPostToPSN Void((Void)*,typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventPostToPSN_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGEventPostToPSN_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventPostToPSN").orElseThrow()
private val CGEventPostToPSN_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventPostToPSN_ADDR, CGEventPostToPSN_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventPostToPSN(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CGEventPostToPSN_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventPostToPid Void(typedef pid_t = Int,typedef CGEventRef = (Declared(__CGEvent))*)
 */
private val CGEventPostToPid_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGEventPostToPid_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventPostToPid").orElseThrow()
private val CGEventPostToPid_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventPostToPid_ADDR, CGEventPostToPid_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun CGEventPostToPid(arg0: Int, arg1: MemorySegment): Unit {
    try {
        CGEventPostToPid_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGGetEventTapList typedef CGError = Declared(CGError)(typedef uint32_t = UNSIGNED = Int,(typedef CGEventTapInformation = Declared(__CGEventTapInformation))*,(typedef uint32_t = UNSIGNED = Int)*)
 */
private val CGGetEventTapList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGGetEventTapList_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGGetEventTapList").orElseThrow()
private val CGGetEventTapList_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGGetEventTapList_ADDR, CGGetEventTapList_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGGetEventTapList(arg0: Int, arg1: MemorySegment, arg2: MemorySegment): CGError {
    try {
        return CGError.fromValue((CGGetEventTapList_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPreflightListenEventAccess Bool()
 */
private val CGPreflightListenEventAccess_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val CGPreflightListenEventAccess_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPreflightListenEventAccess").orElseThrow()
private val CGPreflightListenEventAccess_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPreflightListenEventAccess_ADDR, CGPreflightListenEventAccess_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGPreflightListenEventAccess(): Boolean {
    try {
        return CGPreflightListenEventAccess_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRequestListenEventAccess Bool()
 */
private val CGRequestListenEventAccess_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val CGRequestListenEventAccess_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRequestListenEventAccess").orElseThrow()
private val CGRequestListenEventAccess_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRequestListenEventAccess_ADDR, CGRequestListenEventAccess_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGRequestListenEventAccess(): Boolean {
    try {
        return CGRequestListenEventAccess_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPreflightPostEventAccess Bool()
 */
private val CGPreflightPostEventAccess_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val CGPreflightPostEventAccess_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPreflightPostEventAccess").orElseThrow()
private val CGPreflightPostEventAccess_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPreflightPostEventAccess_ADDR, CGPreflightPostEventAccess_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGPreflightPostEventAccess(): Boolean {
    try {
        return CGPreflightPostEventAccess_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGRequestPostEventAccess Bool()
 */
private val CGRequestPostEventAccess_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN)
private val CGRequestPostEventAccess_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGRequestPostEventAccess").orElseThrow()
private val CGRequestPostEventAccess_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGRequestPostEventAccess_ADDR, CGRequestPostEventAccess_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun CGRequestPostEventAccess(): Boolean {
    try {
        return CGRequestPostEventAccess_HANDLE.invokeExact() as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGEventSourceGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGEventSourceGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetTypeID").orElseThrow()
private val CGEventSourceGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetTypeID_ADDR, CGEventSourceGetTypeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceGetTypeID(): Long {
    try {
        return CGEventSourceGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceCreate typedef CGEventSourceRef = (Declared(__CGEventSource))*(typedef CGEventSourceStateID = Declared(CGEventSourceStateID))
 */
private val CGEventSourceCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGEventSourceCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceCreate").orElseThrow()
private val CGEventSourceCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceCreate_ADDR, CGEventSourceCreate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceCreate(arg0: CGEventSourceStateID): MemorySegment {
    try {
        return CGEventSourceCreate_HANDLE.invokeExact(arg0.value.toInt()) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetKeyboardType typedef CGEventSourceKeyboardType = UNSIGNED = Int(typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventSourceGetKeyboardType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGEventSourceGetKeyboardType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetKeyboardType").orElseThrow()
private val CGEventSourceGetKeyboardType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetKeyboardType_ADDR, CGEventSourceGetKeyboardType_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceGetKeyboardType(arg0: MemorySegment): Int {
    try {
        return CGEventSourceGetKeyboardType_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceSetKeyboardType Void(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGEventSourceKeyboardType = UNSIGNED = Int)
 */
private val CGEventSourceSetKeyboardType_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGEventSourceSetKeyboardType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceSetKeyboardType").orElseThrow()
private val CGEventSourceSetKeyboardType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceSetKeyboardType_ADDR, CGEventSourceSetKeyboardType_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceSetKeyboardType(arg0: MemorySegment, arg1: Int): Unit {
    try {
        CGEventSourceSetKeyboardType_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetPixelsPerLine Double(typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventSourceGetPixelsPerLine_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGEventSourceGetPixelsPerLine_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetPixelsPerLine").orElseThrow()
private val CGEventSourceGetPixelsPerLine_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetPixelsPerLine_ADDR, CGEventSourceGetPixelsPerLine_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGEventSourceGetPixelsPerLine(arg0: MemorySegment): Double {
    try {
        return CGEventSourceGetPixelsPerLine_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceSetPixelsPerLine Void(typedef CGEventSourceRef = (Declared(__CGEventSource))*,Double)
 */
private val CGEventSourceSetPixelsPerLine_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGEventSourceSetPixelsPerLine_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceSetPixelsPerLine").orElseThrow()
private val CGEventSourceSetPixelsPerLine_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceSetPixelsPerLine_ADDR, CGEventSourceSetPixelsPerLine_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun CGEventSourceSetPixelsPerLine(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGEventSourceSetPixelsPerLine_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetSourceStateID typedef CGEventSourceStateID = Declared(CGEventSourceStateID)(typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventSourceGetSourceStateID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CGEventSourceGetSourceStateID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetSourceStateID").orElseThrow()
private val CGEventSourceGetSourceStateID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetSourceStateID_ADDR, CGEventSourceGetSourceStateID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceGetSourceStateID(arg0: MemorySegment): CGEventSourceStateID {
    try {
        return CGEventSourceStateID.fromValue((CGEventSourceGetSourceStateID_HANDLE.invokeExact(arg0) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceButtonState Bool(typedef CGEventSourceStateID = Declared(CGEventSourceStateID),typedef CGMouseButton = Declared(CGMouseButton))
 */
private val CGEventSourceButtonState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEventSourceButtonState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceButtonState").orElseThrow()
private val CGEventSourceButtonState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceButtonState_ADDR, CGEventSourceButtonState_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceButtonState(arg0: CGEventSourceStateID, arg1: CGMouseButton): Boolean {
    try {
        return CGEventSourceButtonState_HANDLE.invokeExact(arg0.value.toInt(), arg1.value.toInt()) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceKeyState Bool(typedef CGEventSourceStateID = Declared(CGEventSourceStateID),typedef CGKeyCode = UNSIGNED = Short)
 */
private val CGEventSourceKeyState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
private val CGEventSourceKeyState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceKeyState").orElseThrow()
private val CGEventSourceKeyState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceKeyState_ADDR, CGEventSourceKeyState_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceKeyState(arg0: CGEventSourceStateID, arg1: Short): Boolean {
    try {
        return CGEventSourceKeyState_HANDLE.invokeExact(arg0.value.toInt(), arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceFlagsState typedef CGEventFlags = Declared(CGEventFlags)(typedef CGEventSourceStateID = Declared(CGEventSourceStateID))
 */
private val CGEventSourceFlagsState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CGEventSourceFlagsState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceFlagsState").orElseThrow()
private val CGEventSourceFlagsState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceFlagsState_ADDR, CGEventSourceFlagsState_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceFlagsState(arg0: CGEventSourceStateID): CGEventFlags {
    try {
        return CGEventFlags(CGEventSourceFlagsState_HANDLE.invokeExact(arg0.value.toInt()) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceSecondsSinceLastEventType typedef CFTimeInterval = Double(typedef CGEventSourceStateID = Declared(CGEventSourceStateID),typedef CGEventType = Declared(CGEventType))
 */
private val CGEventSourceSecondsSinceLastEventType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEventSourceSecondsSinceLastEventType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceSecondsSinceLastEventType").orElseThrow()
private val CGEventSourceSecondsSinceLastEventType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceSecondsSinceLastEventType_ADDR, CGEventSourceSecondsSinceLastEventType_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceSecondsSinceLastEventType(arg0: CGEventSourceStateID, arg1: CGEventType): Double {
    try {
        return CGEventSourceSecondsSinceLastEventType_HANDLE.invokeExact(arg0.value.toInt(), arg1.value.toInt()) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceCounterForEventType typedef uint32_t = UNSIGNED = Int(typedef CGEventSourceStateID = Declared(CGEventSourceStateID),typedef CGEventType = Declared(CGEventType))
 */
private val CGEventSourceCounterForEventType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEventSourceCounterForEventType_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceCounterForEventType").orElseThrow()
private val CGEventSourceCounterForEventType_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceCounterForEventType_ADDR, CGEventSourceCounterForEventType_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceCounterForEventType(arg0: CGEventSourceStateID, arg1: CGEventType): Int {
    try {
        return CGEventSourceCounterForEventType_HANDLE.invokeExact(arg0.value.toInt(), arg1.value.toInt()) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceSetUserData Void(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef int64_t = LongLong)
 */
private val CGEventSourceSetUserData_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CGEventSourceSetUserData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceSetUserData").orElseThrow()
private val CGEventSourceSetUserData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceSetUserData_ADDR, CGEventSourceSetUserData_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceSetUserData(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CGEventSourceSetUserData_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetUserData typedef int64_t = LongLong(typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventSourceGetUserData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CGEventSourceGetUserData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetUserData").orElseThrow()
private val CGEventSourceGetUserData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetUserData_ADDR, CGEventSourceGetUserData_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceGetUserData(arg0: MemorySegment): Long {
    try {
        return CGEventSourceGetUserData_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceSetLocalEventsFilterDuringSuppressionState Void(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGEventFilterMask = Declared(CGEventFilterMask),typedef CGEventSuppressionState = Declared(CGEventSuppressionState))
 */
private val CGEventSourceSetLocalEventsFilterDuringSuppressionState_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CGEventSourceSetLocalEventsFilterDuringSuppressionState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceSetLocalEventsFilterDuringSuppressionState").orElseThrow()
private val CGEventSourceSetLocalEventsFilterDuringSuppressionState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceSetLocalEventsFilterDuringSuppressionState_ADDR, CGEventSourceSetLocalEventsFilterDuringSuppressionState_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceSetLocalEventsFilterDuringSuppressionState(arg0: MemorySegment, arg1: CGEventFilterMask, arg2: CGEventSuppressionState): Unit {
    try {
        CGEventSourceSetLocalEventsFilterDuringSuppressionState_HANDLE.invokeExact(arg0, arg1.rawValue.toInt(), arg2.value.toInt())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetLocalEventsFilterDuringSuppressionState typedef CGEventFilterMask = Declared(CGEventFilterMask)(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CGEventSuppressionState = Declared(CGEventSuppressionState))
 */
private val CGEventSourceGetLocalEventsFilterDuringSuppressionState_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGEventSourceGetLocalEventsFilterDuringSuppressionState_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetLocalEventsFilterDuringSuppressionState").orElseThrow()
private val CGEventSourceGetLocalEventsFilterDuringSuppressionState_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetLocalEventsFilterDuringSuppressionState_ADDR, CGEventSourceGetLocalEventsFilterDuringSuppressionState_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceGetLocalEventsFilterDuringSuppressionState(arg0: MemorySegment, arg1: CGEventSuppressionState): CGEventFilterMask {
    try {
        return CGEventFilterMask(Integer.toUnsignedLong(CGEventSourceGetLocalEventsFilterDuringSuppressionState_HANDLE.invokeExact(arg0, arg1.value.toInt()) as Int))
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceSetLocalEventsSuppressionInterval Void(typedef CGEventSourceRef = (Declared(__CGEventSource))*,typedef CFTimeInterval = Double)
 */
private val CGEventSourceSetLocalEventsSuppressionInterval_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CGEventSourceSetLocalEventsSuppressionInterval_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceSetLocalEventsSuppressionInterval").orElseThrow()
private val CGEventSourceSetLocalEventsSuppressionInterval_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceSetLocalEventsSuppressionInterval_ADDR, CGEventSourceSetLocalEventsSuppressionInterval_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceSetLocalEventsSuppressionInterval(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CGEventSourceSetLocalEventsSuppressionInterval_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGEventSourceGetLocalEventsSuppressionInterval typedef CFTimeInterval = Double(typedef CGEventSourceRef = (Declared(__CGEventSource))*)
 */
private val CGEventSourceGetLocalEventsSuppressionInterval_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CGEventSourceGetLocalEventsSuppressionInterval_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGEventSourceGetLocalEventsSuppressionInterval").orElseThrow()
private val CGEventSourceGetLocalEventsSuppressionInterval_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGEventSourceGetLocalEventsSuppressionInterval_ADDR, CGEventSourceGetLocalEventsSuppressionInterval_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
fun CGEventSourceGetLocalEventsSuppressionInterval(arg0: MemorySegment): Double {
    try {
        return CGEventSourceGetLocalEventsSuppressionInterval_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPSConverterCreate typedef CGPSConverterRef = (Declared(CGPSConverter))*((Void)*,(typedef CGPSConverterCallbacks = Declared(CGPSConverterCallbacks))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPSConverterCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPSConverterCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPSConverterCreate").orElseThrow()
private val CGPSConverterCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPSConverterCreate_ADDR, CGPSConverterCreate_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPSConverterCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CGPSConverterCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPSConverterConvert Bool(typedef CGPSConverterRef = (Declared(CGPSConverter))*,typedef CGDataProviderRef = (Declared(CGDataProvider))*,typedef CGDataConsumerRef = (Declared(CGDataConsumer))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CGPSConverterConvert_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CGPSConverterConvert_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPSConverterConvert").orElseThrow()
private val CGPSConverterConvert_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPSConverterConvert_ADDR, CGPSConverterConvert_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPSConverterConvert(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Boolean {
    try {
        return CGPSConverterConvert_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPSConverterAbort Bool(typedef CGPSConverterRef = (Declared(CGPSConverter))*)
 */
private val CGPSConverterAbort_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPSConverterAbort_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPSConverterAbort").orElseThrow()
private val CGPSConverterAbort_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPSConverterAbort_ADDR, CGPSConverterAbort_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPSConverterAbort(arg0: MemorySegment): Boolean {
    try {
        return CGPSConverterAbort_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPSConverterIsConverting Bool(typedef CGPSConverterRef = (Declared(CGPSConverter))*)
 */
private val CGPSConverterIsConverting_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val CGPSConverterIsConverting_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPSConverterIsConverting").orElseThrow()
private val CGPSConverterIsConverting_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPSConverterIsConverting_ADDR, CGPSConverterIsConverting_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPSConverterIsConverting(arg0: MemorySegment): Boolean {
    try {
        return CGPSConverterIsConverting_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGPSConverterGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CGPSConverterGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CGPSConverterGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGPSConverterGetTypeID").orElseThrow()
private val CGPSConverterGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGPSConverterGetTypeID_ADDR, CGPSConverterGetTypeID_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGPSConverterGetTypeID(): Long {
    try {
        return CGPSConverterGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGSessionCopyCurrentDictionary typedef CFDictionaryRef = (Declared(__CFDictionary))*()
 */
private val CGSessionCopyCurrentDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CGSessionCopyCurrentDictionary_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGSessionCopyCurrentDictionary").orElseThrow()
private val CGSessionCopyCurrentDictionary_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGSessionCopyCurrentDictionary_ADDR, CGSessionCopyCurrentDictionary_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
fun CGSessionCopyCurrentDictionary(): MemorySegment {
    try {
        return CGSessionCopyCurrentDictionary_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CGDirectDisplayCopyCurrentMetalDevice (Void)*(typedef CGDirectDisplayID = UNSIGNED = Int)
 */
private val CGDirectDisplayCopyCurrentMetalDevice_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CGDirectDisplayCopyCurrentMetalDevice_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CGDirectDisplayCopyCurrentMetalDevice").orElseThrow()
private val CGDirectDisplayCopyCurrentMetalDevice_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CGDirectDisplayCopyCurrentMetalDevice_ADDR, CGDirectDisplayCopyCurrentMetalDevice_DESC)

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun CGDirectDisplayCopyCurrentMetalDevice(arg0: Int): MemorySegment {
    try {
        return CGDirectDisplayCopyCurrentMetalDevice_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSPasteboardTypeString typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeString_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeString_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeString").orElseThrow().reinterpret(NSPasteboardTypeString_LAYOUT.byteSize()) }
private val NSPasteboardTypeString_VH: VarHandle by lazy { NSPasteboardTypeString_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPasteboardTypeString: MemorySegment
    get() = NSPasteboardTypeString_VH.get(NSPasteboardTypeString_SEGMENT, 0L) as MemorySegment
    set(value) = NSPasteboardTypeString_VH.set(NSPasteboardTypeString_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPasteboardTypePDF typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypePDF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypePDF_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypePDF").orElseThrow().reinterpret(NSPasteboardTypePDF_LAYOUT.byteSize()) }
private val NSPasteboardTypePDF_VH: VarHandle by lazy { NSPasteboardTypePDF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPasteboardTypePDF: MemorySegment
    get() = NSPasteboardTypePDF_VH.get(NSPasteboardTypePDF_SEGMENT, 0L) as MemorySegment
    set(value) = NSPasteboardTypePDF_VH.set(NSPasteboardTypePDF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPasteboardTypeTIFF typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeTIFF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeTIFF_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeTIFF").orElseThrow().reinterpret(NSPasteboardTypeTIFF_LAYOUT.byteSize()) }
private val NSPasteboardTypeTIFF_VH: VarHandle by lazy { NSPasteboardTypeTIFF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPasteboardTypeTIFF: MemorySegment
    get() = NSPasteboardTypeTIFF_VH.get(NSPasteboardTypeTIFF_SEGMENT, 0L) as MemorySegment
    set(value) = NSPasteboardTypeTIFF_VH.set(NSPasteboardTypeTIFF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPasteboardTypePNG typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypePNG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypePNG_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypePNG").orElseThrow().reinterpret(NSPasteboardTypePNG_LAYOUT.byteSize()) }
private val NSPasteboardTypePNG_VH: VarHandle by lazy { NSPasteboardTypePNG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPasteboardTypePNG: MemorySegment
    get() = NSPasteboardTypePNG_VH.get(NSPasteboardTypePNG_SEGMENT, 0L) as MemorySegment
    set(value) = NSPasteboardTypePNG_VH.set(NSPasteboardTypePNG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPasteboardTypeRTF typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeRTF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeRTF_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeRTF").orElseThrow().reinterpret(NSPasteboardTypeRTF_LAYOUT.byteSize()) }
private val NSPasteboardTypeRTF_VH: VarHandle by lazy { NSPasteboardTypeRTF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPasteboardTypeRTF: MemorySegment
    get() = NSPasteboardTypeRTF_VH.get(NSPasteboardTypeRTF_SEGMENT, 0L) as MemorySegment
    set(value) = NSPasteboardTypeRTF_VH.set(NSPasteboardTypeRTF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPasteboardTypeRTFD typedef const NSPasteboardType = (Void)*
 */
private val NSPasteboardTypeRTFD_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPasteboardTypeRTFD_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPasteboardTypeRTFD").orElseThrow().reinterpret(NSPasteboardTypeRTFD_LAYOUT.byteSize()) }
private val NSPasteboardTypeRTFD_VH: VarHandle by lazy { NSPasteboardTypeRTFD_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
var NSPasteboardTypeRTFD: MemorySegment
    get() = NSPasteboardTypeRTFD_VH.get(NSPasteboardTypeRTFD_SEGMENT, 0L) as MemorySegment
    set(value) = NSPasteboardTypeRTFD_VH.set(NSPasteboardTypeRTFD_SEGMENT, 0L, value)
