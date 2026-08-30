@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : CFStringCreateMutableWithExternalCharactersNoCopy typedef CFMutableStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UniChar = UNSIGNED = Short)*,typedef CFIndex = Long,typedef CFIndex = Long,typedef CFAllocatorRef = (Declared(__CFAllocator))*)
 */
private val CFStringCreateMutableWithExternalCharactersNoCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringCreateMutableWithExternalCharactersNoCopy_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateMutableWithExternalCharactersNoCopy").orElseThrow() }
private val CFStringCreateMutableWithExternalCharactersNoCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateMutableWithExternalCharactersNoCopy_ADDR, CFStringCreateMutableWithExternalCharactersNoCopy_DESC) }

fun CFStringCreateMutableWithExternalCharactersNoCopy(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long, arg4: MemorySegment): MemorySegment {
    try {
        return CFStringCreateMutableWithExternalCharactersNoCopy_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetLength typedef CFIndex = Long(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetLength_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringGetLength_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetLength").orElseThrow() }
private val CFStringGetLength_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetLength_ADDR, CFStringGetLength_DESC) }

fun CFStringGetLength(arg0: MemorySegment): Long {
    try {
        return CFStringGetLength_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetCharacterAtIndex typedef UniChar = UNSIGNED = Short(typedef CFStringRef = (Declared(__CFString))*,typedef CFIndex = Long)
 */
private val CFStringGetCharacterAtIndex_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringGetCharacterAtIndex_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetCharacterAtIndex").orElseThrow() }
private val CFStringGetCharacterAtIndex_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetCharacterAtIndex_ADDR, CFStringGetCharacterAtIndex_DESC) }

fun CFStringGetCharacterAtIndex(arg0: MemorySegment, arg1: Long): Short {
    try {
        return CFStringGetCharacterAtIndex_HANDLE.invokeExact(arg0, arg1) as Short
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetCharacters Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),(typedef UniChar = UNSIGNED = Short)*)
 */
private val CFStringGetCharacters_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS)
private val CFStringGetCharacters_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetCharacters").orElseThrow() }
private val CFStringGetCharacters_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetCharacters_ADDR, CFStringGetCharacters_DESC) }

fun CFStringGetCharacters(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFStringGetCharacters_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetPascalString typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef StringPtr = (UNSIGNED = Char)*,typedef CFIndex = Long,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetPascalString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CFStringGetPascalString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetPascalString").orElseThrow() }
private val CFStringGetPascalString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetPascalString_ADDR, CFStringGetPascalString_DESC) }

fun CFStringGetPascalString(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Int): Byte {
    try {
        return CFStringGetPascalString_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetCString typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,(Char)*,typedef CFIndex = Long,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetCString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CFStringGetCString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetCString").orElseThrow() }
private val CFStringGetCString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetCString_ADDR, CFStringGetCString_DESC) }

fun CFStringGetCString(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Int): Byte {
    try {
        return CFStringGetCString_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetPascalStringPtr typedef ConstStringPtr = (UNSIGNED = Char)*(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetPascalStringPtr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringGetPascalStringPtr_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetPascalStringPtr").orElseThrow() }
private val CFStringGetPascalStringPtr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetPascalStringPtr_ADDR, CFStringGetPascalStringPtr_DESC) }

fun CFStringGetPascalStringPtr(arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CFStringGetPascalStringPtr_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetCStringPtr (Char)*(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetCStringPtr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringGetCStringPtr_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetCStringPtr").orElseThrow() }
private val CFStringGetCStringPtr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetCStringPtr_ADDR, CFStringGetCStringPtr_DESC) }

fun CFStringGetCStringPtr(arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return CFStringGetCStringPtr_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetCharactersPtr (typedef UniChar = UNSIGNED = Short)*(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetCharactersPtr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringGetCharactersPtr_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetCharactersPtr").orElseThrow() }
private val CFStringGetCharactersPtr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetCharactersPtr_ADDR, CFStringGetCharactersPtr_DESC) }

fun CFStringGetCharactersPtr(arg0: MemorySegment): MemorySegment {
    try {
        return CFStringGetCharactersPtr_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetBytes typedef CFIndex = Long(typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringEncoding = UNSIGNED = Int,typedef UInt8 = UNSIGNED = Char,typedef Boolean = UNSIGNED = Char,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long,(typedef CFIndex = Long)*)
 */
private val CFStringGetBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringGetBytes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetBytes").orElseThrow() }
private val CFStringGetBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetBytes_ADDR, CFStringGetBytes_DESC) }

fun CFStringGetBytes(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Byte, arg4: Byte, arg5: MemorySegment, arg6: Long, arg7: MemorySegment): Long {
    try {
        return CFStringGetBytes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCreateFromExternalRepresentation typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringCreateFromExternalRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringCreateFromExternalRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateFromExternalRepresentation").orElseThrow() }
private val CFStringCreateFromExternalRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateFromExternalRepresentation_ADDR, CFStringCreateFromExternalRepresentation_DESC) }

fun CFStringCreateFromExternalRepresentation(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): MemorySegment {
    try {
        return CFStringCreateFromExternalRepresentation_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCreateExternalRepresentation typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringEncoding = UNSIGNED = Int,typedef UInt8 = UNSIGNED = Char)
 */
private val CFStringCreateExternalRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)
private val CFStringCreateExternalRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateExternalRepresentation").orElseThrow() }
private val CFStringCreateExternalRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateExternalRepresentation_ADDR, CFStringCreateExternalRepresentation_DESC) }

fun CFStringCreateExternalRepresentation(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Byte): MemorySegment {
    try {
        return CFStringCreateExternalRepresentation_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetSmallestEncoding typedef CFStringEncoding = UNSIGNED = Int(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetSmallestEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFStringGetSmallestEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetSmallestEncoding").orElseThrow() }
private val CFStringGetSmallestEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetSmallestEncoding_ADDR, CFStringGetSmallestEncoding_DESC) }

fun CFStringGetSmallestEncoding(arg0: MemorySegment): Int {
    try {
        return CFStringGetSmallestEncoding_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetFastestEncoding typedef CFStringEncoding = UNSIGNED = Int(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetFastestEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFStringGetFastestEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetFastestEncoding").orElseThrow() }
private val CFStringGetFastestEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetFastestEncoding_ADDR, CFStringGetFastestEncoding_DESC) }

fun CFStringGetFastestEncoding(arg0: MemorySegment): Int {
    try {
        return CFStringGetFastestEncoding_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetSystemEncoding typedef CFStringEncoding = UNSIGNED = Int()
 */
private val CFStringGetSystemEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT)
private val CFStringGetSystemEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetSystemEncoding").orElseThrow() }
private val CFStringGetSystemEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetSystemEncoding_ADDR, CFStringGetSystemEncoding_DESC) }

fun CFStringGetSystemEncoding(): Int {
    try {
        return CFStringGetSystemEncoding_HANDLE.invokeExact() as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetMaximumSizeForEncoding typedef CFIndex = Long(typedef CFIndex = Long,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetMaximumSizeForEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CFStringGetMaximumSizeForEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetMaximumSizeForEncoding").orElseThrow() }
private val CFStringGetMaximumSizeForEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetMaximumSizeForEncoding_ADDR, CFStringGetMaximumSizeForEncoding_DESC) }

fun CFStringGetMaximumSizeForEncoding(arg0: Long, arg1: Int): Long {
    try {
        return CFStringGetMaximumSizeForEncoding_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetFileSystemRepresentation typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,(Char)*,typedef CFIndex = Long)
 */
private val CFStringGetFileSystemRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringGetFileSystemRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetFileSystemRepresentation").orElseThrow() }
private val CFStringGetFileSystemRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetFileSystemRepresentation_ADDR, CFStringGetFileSystemRepresentation_DESC) }

fun CFStringGetFileSystemRepresentation(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Byte {
    try {
        return CFStringGetFileSystemRepresentation_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetMaximumSizeOfFileSystemRepresentation typedef CFIndex = Long(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetMaximumSizeOfFileSystemRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringGetMaximumSizeOfFileSystemRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetMaximumSizeOfFileSystemRepresentation").orElseThrow() }
private val CFStringGetMaximumSizeOfFileSystemRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetMaximumSizeOfFileSystemRepresentation_ADDR, CFStringGetMaximumSizeOfFileSystemRepresentation_DESC) }

fun CFStringGetMaximumSizeOfFileSystemRepresentation(arg0: MemorySegment): Long {
    try {
        return CFStringGetMaximumSizeOfFileSystemRepresentation_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCreateWithFileSystemRepresentation typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(Char)*)
 */
private val CFStringCreateWithFileSystemRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringCreateWithFileSystemRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateWithFileSystemRepresentation").orElseThrow() }
private val CFStringCreateWithFileSystemRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateWithFileSystemRepresentation_ADDR, CFStringCreateWithFileSystemRepresentation_DESC) }

fun CFStringCreateWithFileSystemRepresentation(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFStringCreateWithFileSystemRepresentation_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCompareWithOptionsAndLocale typedef CFComparisonResult = Declared(CFComparisonResult)(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags),typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringCompareWithOptionsAndLocale_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringCompareWithOptionsAndLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCompareWithOptionsAndLocale").orElseThrow() }
private val CFStringCompareWithOptionsAndLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCompareWithOptionsAndLocale_ADDR, CFStringCompareWithOptionsAndLocale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringCompareWithOptionsAndLocale(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CFStringCompareFlags, arg4: MemorySegment): CFComparisonResult {
    try {
        return CFComparisonResult.fromValue(CFStringCompareWithOptionsAndLocale_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue, arg4) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCompareWithOptions typedef CFComparisonResult = Declared(CFComparisonResult)(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags))
 */
private val CFStringCompareWithOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG)
private val CFStringCompareWithOptions_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCompareWithOptions").orElseThrow() }
private val CFStringCompareWithOptions_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCompareWithOptions_ADDR, CFStringCompareWithOptions_DESC) }

fun CFStringCompareWithOptions(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CFStringCompareFlags): CFComparisonResult {
    try {
        return CFComparisonResult.fromValue(CFStringCompareWithOptions_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCompare typedef CFComparisonResult = Declared(CFComparisonResult)(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringCompareFlags = Declared(CFStringCompareFlags))
 */
private val CFStringCompare_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringCompare_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCompare").orElseThrow() }
private val CFStringCompare_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCompare_ADDR, CFStringCompare_DESC) }

fun CFStringCompare(arg0: MemorySegment, arg1: MemorySegment, arg2: CFStringCompareFlags): CFComparisonResult {
    try {
        return CFComparisonResult.fromValue(CFStringCompare_HANDLE.invokeExact(arg0, arg1, arg2.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringFindWithOptionsAndLocale typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags),typedef CFLocaleRef = (Declared(__CFLocale))*,(typedef CFRange = Declared(CFRange))*)
 */
private val CFStringFindWithOptionsAndLocale_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringFindWithOptionsAndLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringFindWithOptionsAndLocale").orElseThrow() }
private val CFStringFindWithOptionsAndLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringFindWithOptionsAndLocale_ADDR, CFStringFindWithOptionsAndLocale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringFindWithOptionsAndLocale(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CFStringCompareFlags, arg4: MemorySegment, arg5: MemorySegment): Byte {
    try {
        return CFStringFindWithOptionsAndLocale_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue, arg4, arg5) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringFindWithOptions typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags),(typedef CFRange = Declared(CFRange))*)
 */
private val CFStringFindWithOptions_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringFindWithOptions_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringFindWithOptions").orElseThrow() }
private val CFStringFindWithOptions_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringFindWithOptions_ADDR, CFStringFindWithOptions_DESC) }

fun CFStringFindWithOptions(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CFStringCompareFlags, arg4: MemorySegment): Byte {
    try {
        return CFStringFindWithOptions_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue, arg4) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCreateArrayWithFindResults typedef CFArrayRef = (Declared(__CFArray))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags))
 */
private val CFStringCreateArrayWithFindResults_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG)
private val CFStringCreateArrayWithFindResults_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateArrayWithFindResults").orElseThrow() }
private val CFStringCreateArrayWithFindResults_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateArrayWithFindResults_ADDR, CFStringCreateArrayWithFindResults_DESC) }

fun CFStringCreateArrayWithFindResults(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: CFStringCompareFlags): MemorySegment {
    try {
        return CFStringCreateArrayWithFindResults_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4.rawValue) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringFind typedef CFRange = Declared(CFRange)(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringCompareFlags = Declared(CFStringCompareFlags))
 */
private val CFStringFind_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringFind_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringFind").orElseThrow() }
private val CFStringFind_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringFind_ADDR, CFStringFind_DESC) }

fun CFStringFind(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment, arg2: CFStringCompareFlags): MemorySegment {
    try {
        return CFStringFind_HANDLE.invokeExact(allocator, arg0, arg1, arg2.rawValue) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringHasPrefix typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringHasPrefix_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringHasPrefix_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringHasPrefix").orElseThrow() }
private val CFStringHasPrefix_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringHasPrefix_ADDR, CFStringHasPrefix_DESC) }

fun CFStringHasPrefix(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFStringHasPrefix_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringHasSuffix typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringHasSuffix_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringHasSuffix_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringHasSuffix").orElseThrow() }
private val CFStringHasSuffix_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringHasSuffix_ADDR, CFStringHasSuffix_DESC) }

fun CFStringHasSuffix(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFStringHasSuffix_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetRangeOfComposedCharactersAtIndex typedef CFRange = Declared(CFRange)(typedef CFStringRef = (Declared(__CFString))*,typedef CFIndex = Long)
 */
private val CFStringGetRangeOfComposedCharactersAtIndex_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringGetRangeOfComposedCharactersAtIndex_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetRangeOfComposedCharactersAtIndex").orElseThrow() }
private val CFStringGetRangeOfComposedCharactersAtIndex_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetRangeOfComposedCharactersAtIndex_ADDR, CFStringGetRangeOfComposedCharactersAtIndex_DESC) }

fun CFStringGetRangeOfComposedCharactersAtIndex(allocator: SegmentAllocator, arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return CFStringGetRangeOfComposedCharactersAtIndex_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringFindCharacterFromSet typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFCharacterSetRef = (Declared(__CFCharacterSet))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags),(typedef CFRange = Declared(CFRange))*)
 */
private val CFStringFindCharacterFromSet_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringFindCharacterFromSet_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringFindCharacterFromSet").orElseThrow() }
private val CFStringFindCharacterFromSet_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringFindCharacterFromSet_ADDR, CFStringFindCharacterFromSet_DESC) }

fun CFStringFindCharacterFromSet(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CFStringCompareFlags, arg4: MemorySegment): Byte {
    try {
        return CFStringFindCharacterFromSet_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue, arg4) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetLineBounds Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),(typedef CFIndex = Long)*,(typedef CFIndex = Long)*,(typedef CFIndex = Long)*)
 */
private val CFStringGetLineBounds_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringGetLineBounds_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetLineBounds").orElseThrow() }
private val CFStringGetLineBounds_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetLineBounds_ADDR, CFStringGetLineBounds_DESC) }

fun CFStringGetLineBounds(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Unit {
    try {
        CFStringGetLineBounds_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetParagraphBounds Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),(typedef CFIndex = Long)*,(typedef CFIndex = Long)*,(typedef CFIndex = Long)*)
 */
private val CFStringGetParagraphBounds_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringGetParagraphBounds_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetParagraphBounds").orElseThrow() }
private val CFStringGetParagraphBounds_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetParagraphBounds_ADDR, CFStringGetParagraphBounds_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringGetParagraphBounds(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Unit {
    try {
        CFStringGetParagraphBounds_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetHyphenationLocationBeforeIndex typedef CFIndex = Long(typedef CFStringRef = (Declared(__CFString))*,typedef CFIndex = Long,typedef CFRange = Declared(CFRange),typedef CFOptionFlags = UNSIGNED = Long,typedef CFLocaleRef = (Declared(__CFLocale))*,(typedef UTF32Char = UNSIGNED = Int)*)
 */
private val CFStringGetHyphenationLocationBeforeIndex_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, CFRange.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringGetHyphenationLocationBeforeIndex_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetHyphenationLocationBeforeIndex").orElseThrow() }
private val CFStringGetHyphenationLocationBeforeIndex_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetHyphenationLocationBeforeIndex_ADDR, CFStringGetHyphenationLocationBeforeIndex_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringGetHyphenationLocationBeforeIndex(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): Long {
    try {
        return CFStringGetHyphenationLocationBeforeIndex_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringIsHyphenationAvailableForLocale typedef Boolean = UNSIGNED = Char(typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringIsHyphenationAvailableForLocale_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFStringIsHyphenationAvailableForLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringIsHyphenationAvailableForLocale").orElseThrow() }
private val CFStringIsHyphenationAvailableForLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringIsHyphenationAvailableForLocale_ADDR, CFStringIsHyphenationAvailableForLocale_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringIsHyphenationAvailableForLocale(arg0: MemorySegment): Byte {
    try {
        return CFStringIsHyphenationAvailableForLocale_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCreateByCombiningStrings typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFArrayRef = (Declared(__CFArray))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringCreateByCombiningStrings_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringCreateByCombiningStrings_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateByCombiningStrings").orElseThrow() }
private val CFStringCreateByCombiningStrings_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateByCombiningStrings_ADDR, CFStringCreateByCombiningStrings_DESC) }

fun CFStringCreateByCombiningStrings(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFStringCreateByCombiningStrings_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCreateArrayBySeparatingStrings typedef CFArrayRef = (Declared(__CFArray))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringCreateArrayBySeparatingStrings_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringCreateArrayBySeparatingStrings_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCreateArrayBySeparatingStrings").orElseThrow() }
private val CFStringCreateArrayBySeparatingStrings_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCreateArrayBySeparatingStrings_ADDR, CFStringCreateArrayBySeparatingStrings_DESC) }

fun CFStringCreateArrayBySeparatingStrings(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFStringCreateArrayBySeparatingStrings_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetIntValue typedef SInt32 = Int(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetIntValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFStringGetIntValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetIntValue").orElseThrow() }
private val CFStringGetIntValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetIntValue_ADDR, CFStringGetIntValue_DESC) }

fun CFStringGetIntValue(arg0: MemorySegment): Int {
    try {
        return CFStringGetIntValue_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetDoubleValue Double(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringGetDoubleValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFStringGetDoubleValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetDoubleValue").orElseThrow() }
private val CFStringGetDoubleValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetDoubleValue_ADDR, CFStringGetDoubleValue_DESC) }

fun CFStringGetDoubleValue(arg0: MemorySegment): Double {
    try {
        return CFStringGetDoubleValue_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringAppend Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringAppend_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringAppend_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringAppend").orElseThrow() }
private val CFStringAppend_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringAppend_ADDR, CFStringAppend_DESC) }

fun CFStringAppend(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringAppend_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringAppendCharacters Void(typedef CFMutableStringRef = (Declared(__CFString))*,(typedef UniChar = UNSIGNED = Short)*,typedef CFIndex = Long)
 */
private val CFStringAppendCharacters_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringAppendCharacters_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringAppendCharacters").orElseThrow() }
private val CFStringAppendCharacters_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringAppendCharacters_ADDR, CFStringAppendCharacters_DESC) }

fun CFStringAppendCharacters(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        CFStringAppendCharacters_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringAppendPascalString Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef ConstStr255Param = (UNSIGNED = Char)*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringAppendPascalString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringAppendPascalString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringAppendPascalString").orElseThrow() }
private val CFStringAppendPascalString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringAppendPascalString_ADDR, CFStringAppendPascalString_DESC) }

fun CFStringAppendPascalString(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Unit {
    try {
        CFStringAppendPascalString_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringAppendCString Void(typedef CFMutableStringRef = (Declared(__CFString))*,(Char)*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringAppendCString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringAppendCString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringAppendCString").orElseThrow() }
private val CFStringAppendCString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringAppendCString_ADDR, CFStringAppendCString_DESC) }

fun CFStringAppendCString(arg0: MemorySegment, arg1: MemorySegment, arg2: Int): Unit {
    try {
        CFStringAppendCString_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringAppendFormat Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringAppendFormat_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringAppendFormat_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringAppendFormat").orElseThrow() }
private val CFStringAppendFormat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringAppendFormat_ADDR, CFStringAppendFormat_DESC) }

fun CFStringAppendFormat(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFStringAppendFormat_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringAppendFormatAndArguments Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef CFStringRef = (Declared(__CFString))*,typedef va_list = (Char)*)
 */
private val CFStringAppendFormatAndArguments_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringAppendFormatAndArguments_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringAppendFormatAndArguments").orElseThrow() }
private val CFStringAppendFormatAndArguments_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringAppendFormatAndArguments_ADDR, CFStringAppendFormatAndArguments_DESC) }

fun CFStringAppendFormatAndArguments(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Unit {
    try {
        CFStringAppendFormatAndArguments_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringInsert Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFIndex = Long,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringInsert_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringInsert_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringInsert").orElseThrow() }
private val CFStringInsert_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringInsert_ADDR, CFStringInsert_DESC) }

fun CFStringInsert(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): Unit {
    try {
        CFStringInsert_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringDelete Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange))
 */
private val CFStringDelete_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout)
private val CFStringDelete_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringDelete").orElseThrow() }
private val CFStringDelete_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringDelete_ADDR, CFStringDelete_DESC) }

fun CFStringDelete(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringDelete_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringReplace Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringReplace_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS)
private val CFStringReplace_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringReplace").orElseThrow() }
private val CFStringReplace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringReplace_ADDR, CFStringReplace_DESC) }

fun CFStringReplace(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFStringReplace_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringReplaceAll Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringReplaceAll_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringReplaceAll_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringReplaceAll").orElseThrow() }
private val CFStringReplaceAll_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringReplaceAll_ADDR, CFStringReplaceAll_DESC) }

fun CFStringReplaceAll(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringReplaceAll_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringFindAndReplace typedef CFIndex = Long(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFStringCompareFlags = Declared(CFStringCompareFlags))
 */
private val CFStringFindAndReplace_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG)
private val CFStringFindAndReplace_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringFindAndReplace").orElseThrow() }
private val CFStringFindAndReplace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringFindAndReplace_ADDR, CFStringFindAndReplace_DESC) }

fun CFStringFindAndReplace(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: CFStringCompareFlags): Long {
    try {
        return CFStringFindAndReplace_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4.rawValue) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringSetExternalCharactersNoCopy Void(typedef CFMutableStringRef = (Declared(__CFString))*,(typedef UniChar = UNSIGNED = Short)*,typedef CFIndex = Long,typedef CFIndex = Long)
 */
private val CFStringSetExternalCharactersNoCopy_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val CFStringSetExternalCharactersNoCopy_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringSetExternalCharactersNoCopy").orElseThrow() }
private val CFStringSetExternalCharactersNoCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringSetExternalCharactersNoCopy_ADDR, CFStringSetExternalCharactersNoCopy_DESC) }

fun CFStringSetExternalCharactersNoCopy(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long): Unit {
    try {
        CFStringSetExternalCharactersNoCopy_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringPad Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFIndex = Long,typedef CFIndex = Long)
 */
private val CFStringPad_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val CFStringPad_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringPad").orElseThrow() }
private val CFStringPad_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringPad_ADDR, CFStringPad_DESC) }

fun CFStringPad(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long): Unit {
    try {
        CFStringPad_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTrim Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringTrim_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringTrim_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringTrim").orElseThrow() }
private val CFStringTrim_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTrim_ADDR, CFStringTrim_DESC) }

fun CFStringTrim(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringTrim_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTrimWhitespace Void(typedef CFMutableStringRef = (Declared(__CFString))*)
 */
private val CFStringTrimWhitespace_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFStringTrimWhitespace_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringTrimWhitespace").orElseThrow() }
private val CFStringTrimWhitespace_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTrimWhitespace_ADDR, CFStringTrimWhitespace_DESC) }

fun CFStringTrimWhitespace(arg0: MemorySegment): Unit {
    try {
        CFStringTrimWhitespace_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringLowercase Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringLowercase_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringLowercase_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringLowercase").orElseThrow() }
private val CFStringLowercase_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringLowercase_ADDR, CFStringLowercase_DESC) }

fun CFStringLowercase(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringLowercase_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringUppercase Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringUppercase_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringUppercase_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringUppercase").orElseThrow() }
private val CFStringUppercase_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringUppercase_ADDR, CFStringUppercase_DESC) }

fun CFStringUppercase(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringUppercase_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringCapitalize Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringCapitalize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStringCapitalize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringCapitalize").orElseThrow() }
private val CFStringCapitalize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringCapitalize_ADDR, CFStringCapitalize_DESC) }

fun CFStringCapitalize(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFStringCapitalize_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringNormalize Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringNormalizationForm = Declared(CFStringNormalizationForm))
 */
private val CFStringNormalize_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringNormalize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringNormalize").orElseThrow() }
private val CFStringNormalize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringNormalize_ADDR, CFStringNormalize_DESC) }

fun CFStringNormalize(arg0: MemorySegment, arg1: CFStringNormalizationForm): Unit {
    try {
        CFStringNormalize_HANDLE.invokeExact(arg0, arg1.value)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringFold Void(typedef CFMutableStringRef = (Declared(__CFString))*,typedef CFStringCompareFlags = Declared(CFStringCompareFlags),typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringFold_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringFold_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringFold").orElseThrow() }
private val CFStringFold_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringFold_ADDR, CFStringFold_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringFold(arg0: MemorySegment, arg1: CFStringCompareFlags, arg2: MemorySegment): Unit {
    try {
        CFStringFold_HANDLE.invokeExact(arg0, arg1.rawValue, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTransform typedef Boolean = UNSIGNED = Char(typedef CFMutableStringRef = (Declared(__CFString))*,(typedef CFRange = Declared(CFRange))*,typedef CFStringRef = (Declared(__CFString))*,typedef Boolean = UNSIGNED = Char)
 */
private val CFStringTransform_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
private val CFStringTransform_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringTransform").orElseThrow() }
private val CFStringTransform_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTransform_ADDR, CFStringTransform_DESC) }

fun CFStringTransform(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Byte): Byte {
    try {
        return CFStringTransform_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFStringTransformStripCombiningMarks typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformStripCombiningMarks_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformStripCombiningMarks_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformStripCombiningMarks").orElseThrow().reinterpret(kCFStringTransformStripCombiningMarks_LAYOUT.byteSize()) }
private val kCFStringTransformStripCombiningMarks_VH: VarHandle by lazy { kCFStringTransformStripCombiningMarks_LAYOUT.varHandle() }

var kCFStringTransformStripCombiningMarks: MemorySegment
    get() = kCFStringTransformStripCombiningMarks_VH.get(kCFStringTransformStripCombiningMarks_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformStripCombiningMarks_VH.set(kCFStringTransformStripCombiningMarks_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformToLatin typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformToLatin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformToLatin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformToLatin").orElseThrow().reinterpret(kCFStringTransformToLatin_LAYOUT.byteSize()) }
private val kCFStringTransformToLatin_VH: VarHandle by lazy { kCFStringTransformToLatin_LAYOUT.varHandle() }

var kCFStringTransformToLatin: MemorySegment
    get() = kCFStringTransformToLatin_VH.get(kCFStringTransformToLatin_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformToLatin_VH.set(kCFStringTransformToLatin_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformFullwidthHalfwidth typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformFullwidthHalfwidth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformFullwidthHalfwidth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformFullwidthHalfwidth").orElseThrow().reinterpret(kCFStringTransformFullwidthHalfwidth_LAYOUT.byteSize()) }
private val kCFStringTransformFullwidthHalfwidth_VH: VarHandle by lazy { kCFStringTransformFullwidthHalfwidth_LAYOUT.varHandle() }

var kCFStringTransformFullwidthHalfwidth: MemorySegment
    get() = kCFStringTransformFullwidthHalfwidth_VH.get(kCFStringTransformFullwidthHalfwidth_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformFullwidthHalfwidth_VH.set(kCFStringTransformFullwidthHalfwidth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinKatakana typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinKatakana_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinKatakana_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinKatakana").orElseThrow().reinterpret(kCFStringTransformLatinKatakana_LAYOUT.byteSize()) }
private val kCFStringTransformLatinKatakana_VH: VarHandle by lazy { kCFStringTransformLatinKatakana_LAYOUT.varHandle() }

var kCFStringTransformLatinKatakana: MemorySegment
    get() = kCFStringTransformLatinKatakana_VH.get(kCFStringTransformLatinKatakana_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinKatakana_VH.set(kCFStringTransformLatinKatakana_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinHiragana typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinHiragana_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinHiragana_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinHiragana").orElseThrow().reinterpret(kCFStringTransformLatinHiragana_LAYOUT.byteSize()) }
private val kCFStringTransformLatinHiragana_VH: VarHandle by lazy { kCFStringTransformLatinHiragana_LAYOUT.varHandle() }

var kCFStringTransformLatinHiragana: MemorySegment
    get() = kCFStringTransformLatinHiragana_VH.get(kCFStringTransformLatinHiragana_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinHiragana_VH.set(kCFStringTransformLatinHiragana_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformHiraganaKatakana typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformHiraganaKatakana_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformHiraganaKatakana_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformHiraganaKatakana").orElseThrow().reinterpret(kCFStringTransformHiraganaKatakana_LAYOUT.byteSize()) }
private val kCFStringTransformHiraganaKatakana_VH: VarHandle by lazy { kCFStringTransformHiraganaKatakana_LAYOUT.varHandle() }

var kCFStringTransformHiraganaKatakana: MemorySegment
    get() = kCFStringTransformHiraganaKatakana_VH.get(kCFStringTransformHiraganaKatakana_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformHiraganaKatakana_VH.set(kCFStringTransformHiraganaKatakana_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformMandarinLatin typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformMandarinLatin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformMandarinLatin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformMandarinLatin").orElseThrow().reinterpret(kCFStringTransformMandarinLatin_LAYOUT.byteSize()) }
private val kCFStringTransformMandarinLatin_VH: VarHandle by lazy { kCFStringTransformMandarinLatin_LAYOUT.varHandle() }

var kCFStringTransformMandarinLatin: MemorySegment
    get() = kCFStringTransformMandarinLatin_VH.get(kCFStringTransformMandarinLatin_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformMandarinLatin_VH.set(kCFStringTransformMandarinLatin_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinHangul typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinHangul_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinHangul_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinHangul").orElseThrow().reinterpret(kCFStringTransformLatinHangul_LAYOUT.byteSize()) }
private val kCFStringTransformLatinHangul_VH: VarHandle by lazy { kCFStringTransformLatinHangul_LAYOUT.varHandle() }

var kCFStringTransformLatinHangul: MemorySegment
    get() = kCFStringTransformLatinHangul_VH.get(kCFStringTransformLatinHangul_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinHangul_VH.set(kCFStringTransformLatinHangul_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinArabic typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinArabic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinArabic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinArabic").orElseThrow().reinterpret(kCFStringTransformLatinArabic_LAYOUT.byteSize()) }
private val kCFStringTransformLatinArabic_VH: VarHandle by lazy { kCFStringTransformLatinArabic_LAYOUT.varHandle() }

var kCFStringTransformLatinArabic: MemorySegment
    get() = kCFStringTransformLatinArabic_VH.get(kCFStringTransformLatinArabic_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinArabic_VH.set(kCFStringTransformLatinArabic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinHebrew typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinHebrew_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinHebrew_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinHebrew").orElseThrow().reinterpret(kCFStringTransformLatinHebrew_LAYOUT.byteSize()) }
private val kCFStringTransformLatinHebrew_VH: VarHandle by lazy { kCFStringTransformLatinHebrew_LAYOUT.varHandle() }

var kCFStringTransformLatinHebrew: MemorySegment
    get() = kCFStringTransformLatinHebrew_VH.get(kCFStringTransformLatinHebrew_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinHebrew_VH.set(kCFStringTransformLatinHebrew_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinThai typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinThai_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinThai_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinThai").orElseThrow().reinterpret(kCFStringTransformLatinThai_LAYOUT.byteSize()) }
private val kCFStringTransformLatinThai_VH: VarHandle by lazy { kCFStringTransformLatinThai_LAYOUT.varHandle() }

var kCFStringTransformLatinThai: MemorySegment
    get() = kCFStringTransformLatinThai_VH.get(kCFStringTransformLatinThai_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinThai_VH.set(kCFStringTransformLatinThai_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinCyrillic typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinCyrillic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinCyrillic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinCyrillic").orElseThrow().reinterpret(kCFStringTransformLatinCyrillic_LAYOUT.byteSize()) }
private val kCFStringTransformLatinCyrillic_VH: VarHandle by lazy { kCFStringTransformLatinCyrillic_LAYOUT.varHandle() }

var kCFStringTransformLatinCyrillic: MemorySegment
    get() = kCFStringTransformLatinCyrillic_VH.get(kCFStringTransformLatinCyrillic_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinCyrillic_VH.set(kCFStringTransformLatinCyrillic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformLatinGreek typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformLatinGreek_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformLatinGreek_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformLatinGreek").orElseThrow().reinterpret(kCFStringTransformLatinGreek_LAYOUT.byteSize()) }
private val kCFStringTransformLatinGreek_VH: VarHandle by lazy { kCFStringTransformLatinGreek_LAYOUT.varHandle() }

var kCFStringTransformLatinGreek: MemorySegment
    get() = kCFStringTransformLatinGreek_VH.get(kCFStringTransformLatinGreek_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformLatinGreek_VH.set(kCFStringTransformLatinGreek_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformToXMLHex typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformToXMLHex_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformToXMLHex_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformToXMLHex").orElseThrow().reinterpret(kCFStringTransformToXMLHex_LAYOUT.byteSize()) }
private val kCFStringTransformToXMLHex_VH: VarHandle by lazy { kCFStringTransformToXMLHex_LAYOUT.varHandle() }

var kCFStringTransformToXMLHex: MemorySegment
    get() = kCFStringTransformToXMLHex_VH.get(kCFStringTransformToXMLHex_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformToXMLHex_VH.set(kCFStringTransformToXMLHex_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformToUnicodeName typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformToUnicodeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformToUnicodeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformToUnicodeName").orElseThrow().reinterpret(kCFStringTransformToUnicodeName_LAYOUT.byteSize()) }
private val kCFStringTransformToUnicodeName_VH: VarHandle by lazy { kCFStringTransformToUnicodeName_LAYOUT.varHandle() }

var kCFStringTransformToUnicodeName: MemorySegment
    get() = kCFStringTransformToUnicodeName_VH.get(kCFStringTransformToUnicodeName_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformToUnicodeName_VH.set(kCFStringTransformToUnicodeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStringTransformStripDiacritics typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFStringTransformStripDiacritics_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStringTransformStripDiacritics_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStringTransformStripDiacritics").orElseThrow().reinterpret(kCFStringTransformStripDiacritics_LAYOUT.byteSize()) }
private val kCFStringTransformStripDiacritics_VH: VarHandle by lazy { kCFStringTransformStripDiacritics_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFStringTransformStripDiacritics: MemorySegment
    get() = kCFStringTransformStripDiacritics_VH.get(kCFStringTransformStripDiacritics_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStringTransformStripDiacritics_VH.set(kCFStringTransformStripDiacritics_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFStringIsEncodingAvailable typedef Boolean = UNSIGNED = Char(typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringIsEncodingAvailable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
private val CFStringIsEncodingAvailable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringIsEncodingAvailable").orElseThrow() }
private val CFStringIsEncodingAvailable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringIsEncodingAvailable_ADDR, CFStringIsEncodingAvailable_DESC) }

fun CFStringIsEncodingAvailable(arg0: Int): Byte {
    try {
        return CFStringIsEncodingAvailable_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetListOfAvailableEncodings (typedef CFStringEncoding = UNSIGNED = Int)*()
 */
private val CFStringGetListOfAvailableEncodings_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFStringGetListOfAvailableEncodings_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetListOfAvailableEncodings").orElseThrow() }
private val CFStringGetListOfAvailableEncodings_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetListOfAvailableEncodings_ADDR, CFStringGetListOfAvailableEncodings_DESC) }

fun CFStringGetListOfAvailableEncodings(): MemorySegment {
    try {
        return CFStringGetListOfAvailableEncodings_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetNameOfEncoding typedef CFStringRef = (Declared(__CFString))*(typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetNameOfEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringGetNameOfEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetNameOfEncoding").orElseThrow() }
private val CFStringGetNameOfEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetNameOfEncoding_ADDR, CFStringGetNameOfEncoding_DESC) }

fun CFStringGetNameOfEncoding(arg0: Int): MemorySegment {
    try {
        return CFStringGetNameOfEncoding_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringConvertEncodingToNSStringEncoding UNSIGNED = Long(typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringConvertEncodingToNSStringEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
private val CFStringConvertEncodingToNSStringEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringConvertEncodingToNSStringEncoding").orElseThrow() }
private val CFStringConvertEncodingToNSStringEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringConvertEncodingToNSStringEncoding_ADDR, CFStringConvertEncodingToNSStringEncoding_DESC) }

fun CFStringConvertEncodingToNSStringEncoding(arg0: Int): Long {
    try {
        return CFStringConvertEncodingToNSStringEncoding_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringConvertNSStringEncodingToEncoding typedef CFStringEncoding = UNSIGNED = Int(UNSIGNED = Long)
 */
private val CFStringConvertNSStringEncodingToEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
private val CFStringConvertNSStringEncodingToEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringConvertNSStringEncodingToEncoding").orElseThrow() }
private val CFStringConvertNSStringEncodingToEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringConvertNSStringEncodingToEncoding_ADDR, CFStringConvertNSStringEncodingToEncoding_DESC) }

fun CFStringConvertNSStringEncodingToEncoding(arg0: Long): Int {
    try {
        return CFStringConvertNSStringEncodingToEncoding_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringConvertEncodingToWindowsCodepage typedef UInt32 = UNSIGNED = Int(typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringConvertEncodingToWindowsCodepage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CFStringConvertEncodingToWindowsCodepage_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringConvertEncodingToWindowsCodepage").orElseThrow() }
private val CFStringConvertEncodingToWindowsCodepage_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringConvertEncodingToWindowsCodepage_ADDR, CFStringConvertEncodingToWindowsCodepage_DESC) }

fun CFStringConvertEncodingToWindowsCodepage(arg0: Int): Int {
    try {
        return CFStringConvertEncodingToWindowsCodepage_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringConvertWindowsCodepageToEncoding typedef CFStringEncoding = UNSIGNED = Int(typedef UInt32 = UNSIGNED = Int)
 */
private val CFStringConvertWindowsCodepageToEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CFStringConvertWindowsCodepageToEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringConvertWindowsCodepageToEncoding").orElseThrow() }
private val CFStringConvertWindowsCodepageToEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringConvertWindowsCodepageToEncoding_ADDR, CFStringConvertWindowsCodepageToEncoding_DESC) }

fun CFStringConvertWindowsCodepageToEncoding(arg0: Int): Int {
    try {
        return CFStringConvertWindowsCodepageToEncoding_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringConvertIANACharSetNameToEncoding typedef CFStringEncoding = UNSIGNED = Int(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFStringConvertIANACharSetNameToEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFStringConvertIANACharSetNameToEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringConvertIANACharSetNameToEncoding").orElseThrow() }
private val CFStringConvertIANACharSetNameToEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringConvertIANACharSetNameToEncoding_ADDR, CFStringConvertIANACharSetNameToEncoding_DESC) }

fun CFStringConvertIANACharSetNameToEncoding(arg0: MemorySegment): Int {
    try {
        return CFStringConvertIANACharSetNameToEncoding_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringConvertEncodingToIANACharSetName typedef CFStringRef = (Declared(__CFString))*(typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringConvertEncodingToIANACharSetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFStringConvertEncodingToIANACharSetName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringConvertEncodingToIANACharSetName").orElseThrow() }
private val CFStringConvertEncodingToIANACharSetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringConvertEncodingToIANACharSetName_ADDR, CFStringConvertEncodingToIANACharSetName_DESC) }

fun CFStringConvertEncodingToIANACharSetName(arg0: Int): MemorySegment {
    try {
        return CFStringConvertEncodingToIANACharSetName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringGetMostCompatibleMacStringEncoding typedef CFStringEncoding = UNSIGNED = Int(typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFStringGetMostCompatibleMacStringEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val CFStringGetMostCompatibleMacStringEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFStringGetMostCompatibleMacStringEncoding").orElseThrow() }
private val CFStringGetMostCompatibleMacStringEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringGetMostCompatibleMacStringEncoding_ADDR, CFStringGetMostCompatibleMacStringEncoding_DESC) }

fun CFStringGetMostCompatibleMacStringEncoding(arg0: Int): Int {
    try {
        return CFStringGetMostCompatibleMacStringEncoding_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFShow Void(typedef CFTypeRef = (Void)*)
 */
private val CFShow_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFShow_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFShow").orElseThrow() }
private val CFShow_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFShow_ADDR, CFShow_DESC) }

fun CFShow(arg0: MemorySegment): Unit {
    try {
        CFShow_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFShowStr Void(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFShowStr_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFShowStr_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFShowStr").orElseThrow() }
private val CFShowStr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFShowStr_ADDR, CFShowStr_DESC) }

fun CFShowStr(arg0: MemorySegment): Unit {
    try {
        CFShowStr_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : __CFStringMakeConstantString typedef CFStringRef = (Declared(__CFString))*((Char)*)
 */
private val _CFStringMakeConstantString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val _CFStringMakeConstantString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("__CFStringMakeConstantString").orElseThrow() }
private val _CFStringMakeConstantString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(_CFStringMakeConstantString_ADDR, _CFStringMakeConstantString_DESC) }

fun _CFStringMakeConstantString(arg0: MemorySegment): MemorySegment {
    try {
        return _CFStringMakeConstantString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFTimeZoneGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFTimeZoneGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneGetTypeID").orElseThrow() }
private val CFTimeZoneGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneGetTypeID_ADDR, CFTimeZoneGetTypeID_DESC) }

fun CFTimeZoneGetTypeID(): Long {
    try {
        return CFTimeZoneGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCopySystem typedef CFTimeZoneRef = (Declared(__CFTimeZone))*()
 */
private val CFTimeZoneCopySystem_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFTimeZoneCopySystem_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCopySystem").orElseThrow() }
private val CFTimeZoneCopySystem_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCopySystem_ADDR, CFTimeZoneCopySystem_DESC) }

fun CFTimeZoneCopySystem(): MemorySegment {
    try {
        return CFTimeZoneCopySystem_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneResetSystem Void()
 */
private val CFTimeZoneResetSystem_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val CFTimeZoneResetSystem_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneResetSystem").orElseThrow() }
private val CFTimeZoneResetSystem_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneResetSystem_ADDR, CFTimeZoneResetSystem_DESC) }

fun CFTimeZoneResetSystem(): Unit {
    try {
        CFTimeZoneResetSystem_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCopyDefault typedef CFTimeZoneRef = (Declared(__CFTimeZone))*()
 */
private val CFTimeZoneCopyDefault_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFTimeZoneCopyDefault_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCopyDefault").orElseThrow() }
private val CFTimeZoneCopyDefault_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCopyDefault_ADDR, CFTimeZoneCopyDefault_DESC) }

fun CFTimeZoneCopyDefault(): MemorySegment {
    try {
        return CFTimeZoneCopyDefault_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneSetDefault Void(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*)
 */
private val CFTimeZoneSetDefault_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFTimeZoneSetDefault_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneSetDefault").orElseThrow() }
private val CFTimeZoneSetDefault_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneSetDefault_ADDR, CFTimeZoneSetDefault_DESC) }

fun CFTimeZoneSetDefault(arg0: MemorySegment): Unit {
    try {
        CFTimeZoneSetDefault_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCopyKnownNames typedef CFArrayRef = (Declared(__CFArray))*()
 */
private val CFTimeZoneCopyKnownNames_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFTimeZoneCopyKnownNames_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCopyKnownNames").orElseThrow() }
private val CFTimeZoneCopyKnownNames_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCopyKnownNames_ADDR, CFTimeZoneCopyKnownNames_DESC) }

fun CFTimeZoneCopyKnownNames(): MemorySegment {
    try {
        return CFTimeZoneCopyKnownNames_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCopyAbbreviationDictionary typedef CFDictionaryRef = (Declared(__CFDictionary))*()
 */
private val CFTimeZoneCopyAbbreviationDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFTimeZoneCopyAbbreviationDictionary_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCopyAbbreviationDictionary").orElseThrow() }
private val CFTimeZoneCopyAbbreviationDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCopyAbbreviationDictionary_ADDR, CFTimeZoneCopyAbbreviationDictionary_DESC) }

fun CFTimeZoneCopyAbbreviationDictionary(): MemorySegment {
    try {
        return CFTimeZoneCopyAbbreviationDictionary_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneSetAbbreviationDictionary Void(typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CFTimeZoneSetAbbreviationDictionary_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFTimeZoneSetAbbreviationDictionary_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneSetAbbreviationDictionary").orElseThrow() }
private val CFTimeZoneSetAbbreviationDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneSetAbbreviationDictionary_ADDR, CFTimeZoneSetAbbreviationDictionary_DESC) }

fun CFTimeZoneSetAbbreviationDictionary(arg0: MemorySegment): Unit {
    try {
        CFTimeZoneSetAbbreviationDictionary_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCreate typedef CFTimeZoneRef = (Declared(__CFTimeZone))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CFTimeZoneCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTimeZoneCreate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCreate").orElseThrow() }
private val CFTimeZoneCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCreate_ADDR, CFTimeZoneCreate_DESC) }

fun CFTimeZoneCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFTimeZoneCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCreateWithTimeIntervalFromGMT typedef CFTimeZoneRef = (Declared(__CFTimeZone))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFTimeInterval = Double)
 */
private val CFTimeZoneCreateWithTimeIntervalFromGMT_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFTimeZoneCreateWithTimeIntervalFromGMT_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCreateWithTimeIntervalFromGMT").orElseThrow() }
private val CFTimeZoneCreateWithTimeIntervalFromGMT_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCreateWithTimeIntervalFromGMT_ADDR, CFTimeZoneCreateWithTimeIntervalFromGMT_DESC) }

fun CFTimeZoneCreateWithTimeIntervalFromGMT(arg0: MemorySegment, arg1: Double): MemorySegment {
    try {
        return CFTimeZoneCreateWithTimeIntervalFromGMT_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCreateWithName typedef CFTimeZoneRef = (Declared(__CFTimeZone))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef Boolean = UNSIGNED = Char)
 */
private val CFTimeZoneCreateWithName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
private val CFTimeZoneCreateWithName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCreateWithName").orElseThrow() }
private val CFTimeZoneCreateWithName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCreateWithName_ADDR, CFTimeZoneCreateWithName_DESC) }

fun CFTimeZoneCreateWithName(arg0: MemorySegment, arg1: MemorySegment, arg2: Byte): MemorySegment {
    try {
        return CFTimeZoneCreateWithName_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneGetName typedef CFStringRef = (Declared(__CFString))*(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*)
 */
private val CFTimeZoneGetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTimeZoneGetName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneGetName").orElseThrow() }
private val CFTimeZoneGetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneGetName_ADDR, CFTimeZoneGetName_DESC) }

fun CFTimeZoneGetName(arg0: MemorySegment): MemorySegment {
    try {
        return CFTimeZoneGetName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneGetData typedef CFDataRef = (Declared(__CFData))*(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*)
 */
private val CFTimeZoneGetData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTimeZoneGetData_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneGetData").orElseThrow() }
private val CFTimeZoneGetData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneGetData_ADDR, CFTimeZoneGetData_DESC) }

fun CFTimeZoneGetData(arg0: MemorySegment): MemorySegment {
    try {
        return CFTimeZoneGetData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneGetSecondsFromGMT typedef CFTimeInterval = Double(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*,typedef CFAbsoluteTime = Double)
 */
private val CFTimeZoneGetSecondsFromGMT_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFTimeZoneGetSecondsFromGMT_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneGetSecondsFromGMT").orElseThrow() }
private val CFTimeZoneGetSecondsFromGMT_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneGetSecondsFromGMT_ADDR, CFTimeZoneGetSecondsFromGMT_DESC) }

fun CFTimeZoneGetSecondsFromGMT(arg0: MemorySegment, arg1: Double): Double {
    try {
        return CFTimeZoneGetSecondsFromGMT_HANDLE.invokeExact(arg0, arg1) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCopyAbbreviation typedef CFStringRef = (Declared(__CFString))*(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*,typedef CFAbsoluteTime = Double)
 */
private val CFTimeZoneCopyAbbreviation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFTimeZoneCopyAbbreviation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCopyAbbreviation").orElseThrow() }
private val CFTimeZoneCopyAbbreviation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCopyAbbreviation_ADDR, CFTimeZoneCopyAbbreviation_DESC) }

fun CFTimeZoneCopyAbbreviation(arg0: MemorySegment, arg1: Double): MemorySegment {
    try {
        return CFTimeZoneCopyAbbreviation_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneIsDaylightSavingTime typedef Boolean = UNSIGNED = Char(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*,typedef CFAbsoluteTime = Double)
 */
private val CFTimeZoneIsDaylightSavingTime_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFTimeZoneIsDaylightSavingTime_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneIsDaylightSavingTime").orElseThrow() }
private val CFTimeZoneIsDaylightSavingTime_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneIsDaylightSavingTime_ADDR, CFTimeZoneIsDaylightSavingTime_DESC) }

fun CFTimeZoneIsDaylightSavingTime(arg0: MemorySegment, arg1: Double): Byte {
    try {
        return CFTimeZoneIsDaylightSavingTime_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneGetDaylightSavingTimeOffset typedef CFTimeInterval = Double(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*,typedef CFAbsoluteTime = Double)
 */
private val CFTimeZoneGetDaylightSavingTimeOffset_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFTimeZoneGetDaylightSavingTimeOffset_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneGetDaylightSavingTimeOffset").orElseThrow() }
private val CFTimeZoneGetDaylightSavingTimeOffset_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneGetDaylightSavingTimeOffset_ADDR, CFTimeZoneGetDaylightSavingTimeOffset_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFTimeZoneGetDaylightSavingTimeOffset(arg0: MemorySegment, arg1: Double): Double {
    try {
        return CFTimeZoneGetDaylightSavingTimeOffset_HANDLE.invokeExact(arg0, arg1) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneGetNextDaylightSavingTimeTransition typedef CFAbsoluteTime = Double(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*,typedef CFAbsoluteTime = Double)
 */
private val CFTimeZoneGetNextDaylightSavingTimeTransition_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFTimeZoneGetNextDaylightSavingTimeTransition_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneGetNextDaylightSavingTimeTransition").orElseThrow() }
private val CFTimeZoneGetNextDaylightSavingTimeTransition_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneGetNextDaylightSavingTimeTransition_ADDR, CFTimeZoneGetNextDaylightSavingTimeTransition_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFTimeZoneGetNextDaylightSavingTimeTransition(arg0: MemorySegment, arg1: Double): Double {
    try {
        return CFTimeZoneGetNextDaylightSavingTimeTransition_HANDLE.invokeExact(arg0, arg1) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTimeZoneCopyLocalizedName typedef CFStringRef = (Declared(__CFString))*(typedef CFTimeZoneRef = (Declared(__CFTimeZone))*,typedef CFTimeZoneNameStyle = Declared(CFTimeZoneNameStyle),typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFTimeZoneCopyLocalizedName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFTimeZoneCopyLocalizedName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFTimeZoneCopyLocalizedName").orElseThrow() }
private val CFTimeZoneCopyLocalizedName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTimeZoneCopyLocalizedName_ADDR, CFTimeZoneCopyLocalizedName_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFTimeZoneCopyLocalizedName(arg0: MemorySegment, arg1: CFTimeZoneNameStyle, arg2: MemorySegment): MemorySegment {
    try {
        return CFTimeZoneCopyLocalizedName_HANDLE.invokeExact(arg0, arg1.value, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFTimeZoneSystemTimeZoneDidChangeNotification typedef const CFNotificationName = (Declared(__CFString))*
 */
private val kCFTimeZoneSystemTimeZoneDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFTimeZoneSystemTimeZoneDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFTimeZoneSystemTimeZoneDidChangeNotification").orElseThrow().reinterpret(kCFTimeZoneSystemTimeZoneDidChangeNotification_LAYOUT.byteSize()) }
private val kCFTimeZoneSystemTimeZoneDidChangeNotification_VH: VarHandle by lazy { kCFTimeZoneSystemTimeZoneDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFTimeZoneSystemTimeZoneDidChangeNotification: MemorySegment
    get() = kCFTimeZoneSystemTimeZoneDidChangeNotification_VH.get(kCFTimeZoneSystemTimeZoneDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = kCFTimeZoneSystemTimeZoneDidChangeNotification_VH.set(kCFTimeZoneSystemTimeZoneDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFCalendarGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFCalendarGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFCalendarGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetTypeID").orElseThrow() }
private val CFCalendarGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetTypeID_ADDR, CFCalendarGetTypeID_DESC) }

fun CFCalendarGetTypeID(): Long {
    try {
        return CFCalendarGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarCopyCurrent typedef CFCalendarRef = (Declared(__CFCalendar))*()
 */
private val CFCalendarCopyCurrent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFCalendarCopyCurrent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarCopyCurrent").orElseThrow() }
private val CFCalendarCopyCurrent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarCopyCurrent_ADDR, CFCalendarCopyCurrent_DESC) }

fun CFCalendarCopyCurrent(): MemorySegment {
    try {
        return CFCalendarCopyCurrent_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarCreateWithIdentifier typedef CFCalendarRef = (Declared(__CFCalendar))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFCalendarIdentifier = (Declared(__CFString))*)
 */
private val CFCalendarCreateWithIdentifier_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarCreateWithIdentifier_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarCreateWithIdentifier").orElseThrow() }
private val CFCalendarCreateWithIdentifier_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarCreateWithIdentifier_ADDR, CFCalendarCreateWithIdentifier_DESC) }

fun CFCalendarCreateWithIdentifier(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFCalendarCreateWithIdentifier_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetIdentifier typedef CFCalendarIdentifier = (Declared(__CFString))*(typedef CFCalendarRef = (Declared(__CFCalendar))*)
 */
private val CFCalendarGetIdentifier_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarGetIdentifier_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetIdentifier").orElseThrow() }
private val CFCalendarGetIdentifier_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetIdentifier_ADDR, CFCalendarGetIdentifier_DESC) }

fun CFCalendarGetIdentifier(arg0: MemorySegment): MemorySegment {
    try {
        return CFCalendarGetIdentifier_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarCopyLocale typedef CFLocaleRef = (Declared(__CFLocale))*(typedef CFCalendarRef = (Declared(__CFCalendar))*)
 */
private val CFCalendarCopyLocale_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarCopyLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarCopyLocale").orElseThrow() }
private val CFCalendarCopyLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarCopyLocale_ADDR, CFCalendarCopyLocale_DESC) }

fun CFCalendarCopyLocale(arg0: MemorySegment): MemorySegment {
    try {
        return CFCalendarCopyLocale_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarSetLocale Void(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFCalendarSetLocale_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarSetLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarSetLocale").orElseThrow() }
private val CFCalendarSetLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarSetLocale_ADDR, CFCalendarSetLocale_DESC) }

fun CFCalendarSetLocale(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFCalendarSetLocale_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarCopyTimeZone typedef CFTimeZoneRef = (Declared(__CFTimeZone))*(typedef CFCalendarRef = (Declared(__CFCalendar))*)
 */
private val CFCalendarCopyTimeZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarCopyTimeZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarCopyTimeZone").orElseThrow() }
private val CFCalendarCopyTimeZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarCopyTimeZone_ADDR, CFCalendarCopyTimeZone_DESC) }

fun CFCalendarCopyTimeZone(arg0: MemorySegment): MemorySegment {
    try {
        return CFCalendarCopyTimeZone_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarSetTimeZone Void(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFTimeZoneRef = (Declared(__CFTimeZone))*)
 */
private val CFCalendarSetTimeZone_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarSetTimeZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarSetTimeZone").orElseThrow() }
private val CFCalendarSetTimeZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarSetTimeZone_ADDR, CFCalendarSetTimeZone_DESC) }

fun CFCalendarSetTimeZone(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFCalendarSetTimeZone_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetFirstWeekday typedef CFIndex = Long(typedef CFCalendarRef = (Declared(__CFCalendar))*)
 */
private val CFCalendarGetFirstWeekday_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFCalendarGetFirstWeekday_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetFirstWeekday").orElseThrow() }
private val CFCalendarGetFirstWeekday_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetFirstWeekday_ADDR, CFCalendarGetFirstWeekday_DESC) }

fun CFCalendarGetFirstWeekday(arg0: MemorySegment): Long {
    try {
        return CFCalendarGetFirstWeekday_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarSetFirstWeekday Void(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFIndex = Long)
 */
private val CFCalendarSetFirstWeekday_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFCalendarSetFirstWeekday_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarSetFirstWeekday").orElseThrow() }
private val CFCalendarSetFirstWeekday_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarSetFirstWeekday_ADDR, CFCalendarSetFirstWeekday_DESC) }

fun CFCalendarSetFirstWeekday(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFCalendarSetFirstWeekday_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetMinimumDaysInFirstWeek typedef CFIndex = Long(typedef CFCalendarRef = (Declared(__CFCalendar))*)
 */
private val CFCalendarGetMinimumDaysInFirstWeek_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFCalendarGetMinimumDaysInFirstWeek_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetMinimumDaysInFirstWeek").orElseThrow() }
private val CFCalendarGetMinimumDaysInFirstWeek_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetMinimumDaysInFirstWeek_ADDR, CFCalendarGetMinimumDaysInFirstWeek_DESC) }

fun CFCalendarGetMinimumDaysInFirstWeek(arg0: MemorySegment): Long {
    try {
        return CFCalendarGetMinimumDaysInFirstWeek_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarSetMinimumDaysInFirstWeek Void(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFIndex = Long)
 */
private val CFCalendarSetMinimumDaysInFirstWeek_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFCalendarSetMinimumDaysInFirstWeek_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarSetMinimumDaysInFirstWeek").orElseThrow() }
private val CFCalendarSetMinimumDaysInFirstWeek_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarSetMinimumDaysInFirstWeek_ADDR, CFCalendarSetMinimumDaysInFirstWeek_DESC) }

fun CFCalendarSetMinimumDaysInFirstWeek(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFCalendarSetMinimumDaysInFirstWeek_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetMinimumRangeOfUnit typedef CFRange = Declared(CFRange)(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFCalendarUnit = Declared(CFCalendarUnit))
 */
private val CFCalendarGetMinimumRangeOfUnit_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFCalendarGetMinimumRangeOfUnit_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetMinimumRangeOfUnit").orElseThrow() }
private val CFCalendarGetMinimumRangeOfUnit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetMinimumRangeOfUnit_ADDR, CFCalendarGetMinimumRangeOfUnit_DESC) }

fun CFCalendarGetMinimumRangeOfUnit(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CFCalendarUnit): MemorySegment {
    try {
        return CFCalendarGetMinimumRangeOfUnit_HANDLE.invokeExact(allocator, arg0, arg1.rawValue) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetMaximumRangeOfUnit typedef CFRange = Declared(CFRange)(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFCalendarUnit = Declared(CFCalendarUnit))
 */
private val CFCalendarGetMaximumRangeOfUnit_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFCalendarGetMaximumRangeOfUnit_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetMaximumRangeOfUnit").orElseThrow() }
private val CFCalendarGetMaximumRangeOfUnit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetMaximumRangeOfUnit_ADDR, CFCalendarGetMaximumRangeOfUnit_DESC) }

fun CFCalendarGetMaximumRangeOfUnit(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CFCalendarUnit): MemorySegment {
    try {
        return CFCalendarGetMaximumRangeOfUnit_HANDLE.invokeExact(allocator, arg0, arg1.rawValue) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetRangeOfUnit typedef CFRange = Declared(CFRange)(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFCalendarUnit = Declared(CFCalendarUnit),typedef CFCalendarUnit = Declared(CFCalendarUnit),typedef CFAbsoluteTime = Double)
 */
private val CFCalendarGetRangeOfUnit_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_DOUBLE)
private val CFCalendarGetRangeOfUnit_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetRangeOfUnit").orElseThrow() }
private val CFCalendarGetRangeOfUnit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetRangeOfUnit_ADDR, CFCalendarGetRangeOfUnit_DESC) }

fun CFCalendarGetRangeOfUnit(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CFCalendarUnit, arg2: CFCalendarUnit, arg3: Double): MemorySegment {
    try {
        return CFCalendarGetRangeOfUnit_HANDLE.invokeExact(allocator, arg0, arg1.rawValue, arg2.rawValue, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetOrdinalityOfUnit typedef CFIndex = Long(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFCalendarUnit = Declared(CFCalendarUnit),typedef CFCalendarUnit = Declared(CFCalendarUnit),typedef CFAbsoluteTime = Double)
 */
private val CFCalendarGetOrdinalityOfUnit_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_DOUBLE)
private val CFCalendarGetOrdinalityOfUnit_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetOrdinalityOfUnit").orElseThrow() }
private val CFCalendarGetOrdinalityOfUnit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetOrdinalityOfUnit_ADDR, CFCalendarGetOrdinalityOfUnit_DESC) }

fun CFCalendarGetOrdinalityOfUnit(arg0: MemorySegment, arg1: CFCalendarUnit, arg2: CFCalendarUnit, arg3: Double): Long {
    try {
        return CFCalendarGetOrdinalityOfUnit_HANDLE.invokeExact(arg0, arg1.rawValue, arg2.rawValue, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetTimeRangeOfUnit typedef Boolean = UNSIGNED = Char(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFCalendarUnit = Declared(CFCalendarUnit),typedef CFAbsoluteTime = Double,(typedef CFAbsoluteTime = Double)*,(typedef CFTimeInterval = Double)*)
 */
private val CFCalendarGetTimeRangeOfUnit_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarGetTimeRangeOfUnit_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetTimeRangeOfUnit").orElseThrow() }
private val CFCalendarGetTimeRangeOfUnit_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetTimeRangeOfUnit_ADDR, CFCalendarGetTimeRangeOfUnit_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFCalendarGetTimeRangeOfUnit(arg0: MemorySegment, arg1: CFCalendarUnit, arg2: Double, arg3: MemorySegment, arg4: MemorySegment): Byte {
    try {
        return CFCalendarGetTimeRangeOfUnit_HANDLE.invokeExact(arg0, arg1.rawValue, arg2, arg3, arg4) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarComposeAbsoluteTime typedef Boolean = UNSIGNED = Char(typedef CFCalendarRef = (Declared(__CFCalendar))*,(typedef CFAbsoluteTime = Double)*,(Char)*)
 */
private val CFCalendarComposeAbsoluteTime_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFCalendarComposeAbsoluteTime_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarComposeAbsoluteTime").orElseThrow() }
private val CFCalendarComposeAbsoluteTime_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarComposeAbsoluteTime_ADDR, CFCalendarComposeAbsoluteTime_DESC) }

fun CFCalendarComposeAbsoluteTime(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFCalendarComposeAbsoluteTime_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarDecomposeAbsoluteTime typedef Boolean = UNSIGNED = Char(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFAbsoluteTime = Double,(Char)*)
 */
private val CFCalendarDecomposeAbsoluteTime_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFCalendarDecomposeAbsoluteTime_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarDecomposeAbsoluteTime").orElseThrow() }
private val CFCalendarDecomposeAbsoluteTime_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarDecomposeAbsoluteTime_ADDR, CFCalendarDecomposeAbsoluteTime_DESC) }

fun CFCalendarDecomposeAbsoluteTime(arg0: MemorySegment, arg1: Double, arg2: MemorySegment): Byte {
    try {
        return CFCalendarDecomposeAbsoluteTime_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarAddComponents typedef Boolean = UNSIGNED = Char(typedef CFCalendarRef = (Declared(__CFCalendar))*,(typedef CFAbsoluteTime = Double)*,typedef CFOptionFlags = UNSIGNED = Long,(Char)*)
 */
private val CFCalendarAddComponents_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFCalendarAddComponents_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarAddComponents").orElseThrow() }
private val CFCalendarAddComponents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarAddComponents_ADDR, CFCalendarAddComponents_DESC) }

fun CFCalendarAddComponents(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Byte {
    try {
        return CFCalendarAddComponents_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCalendarGetComponentDifference typedef Boolean = UNSIGNED = Char(typedef CFCalendarRef = (Declared(__CFCalendar))*,typedef CFAbsoluteTime = Double,typedef CFAbsoluteTime = Double,typedef CFOptionFlags = UNSIGNED = Long,(Char)*)
 */
private val CFCalendarGetComponentDifference_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFCalendarGetComponentDifference_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFCalendarGetComponentDifference").orElseThrow() }
private val CFCalendarGetComponentDifference_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCalendarGetComponentDifference_ADDR, CFCalendarGetComponentDifference_DESC) }

fun CFCalendarGetComponentDifference(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Long, arg4: MemorySegment): Byte {
    try {
        return CFCalendarGetComponentDifference_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCreateDateFormatFromTemplate typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFDateFormatterCreateDateFormatFromTemplate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFDateFormatterCreateDateFormatFromTemplate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCreateDateFormatFromTemplate").orElseThrow() }
private val CFDateFormatterCreateDateFormatFromTemplate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCreateDateFormatFromTemplate_ADDR, CFDateFormatterCreateDateFormatFromTemplate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFDateFormatterCreateDateFormatFromTemplate(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return CFDateFormatterCreateDateFormatFromTemplate_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFDateFormatterGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFDateFormatterGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterGetTypeID").orElseThrow() }
private val CFDateFormatterGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterGetTypeID_ADDR, CFDateFormatterGetTypeID_DESC) }

fun CFDateFormatterGetTypeID(): Long {
    try {
        return CFDateFormatterGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCreateISO8601Formatter typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFISO8601DateFormatOptions = Declared(CFISO8601DateFormatOptions))
 */
private val CFDateFormatterCreateISO8601Formatter_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFDateFormatterCreateISO8601Formatter_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCreateISO8601Formatter").orElseThrow() }
private val CFDateFormatterCreateISO8601Formatter_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCreateISO8601Formatter_ADDR, CFDateFormatterCreateISO8601Formatter_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun CFDateFormatterCreateISO8601Formatter(arg0: MemorySegment, arg1: CFISO8601DateFormatOptions): MemorySegment {
    try {
        return CFDateFormatterCreateISO8601Formatter_HANDLE.invokeExact(arg0, arg1.rawValue) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCreate typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFLocaleRef = (Declared(__CFLocale))*,typedef CFDateFormatterStyle = Declared(CFDateFormatterStyle),typedef CFDateFormatterStyle = Declared(CFDateFormatterStyle))
 */
private val CFDateFormatterCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val CFDateFormatterCreate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCreate").orElseThrow() }
private val CFDateFormatterCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCreate_ADDR, CFDateFormatterCreate_DESC) }

fun CFDateFormatterCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: CFDateFormatterStyle, arg3: CFDateFormatterStyle): MemorySegment {
    try {
        return CFDateFormatterCreate_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3.value) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterGetLocale typedef CFLocaleRef = (Declared(__CFLocale))*(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*)
 */
private val CFDateFormatterGetLocale_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterGetLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterGetLocale").orElseThrow() }
private val CFDateFormatterGetLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterGetLocale_ADDR, CFDateFormatterGetLocale_DESC) }

fun CFDateFormatterGetLocale(arg0: MemorySegment): MemorySegment {
    try {
        return CFDateFormatterGetLocale_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterGetDateStyle typedef CFDateFormatterStyle = Declared(CFDateFormatterStyle)(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*)
 */
private val CFDateFormatterGetDateStyle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFDateFormatterGetDateStyle_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterGetDateStyle").orElseThrow() }
private val CFDateFormatterGetDateStyle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterGetDateStyle_ADDR, CFDateFormatterGetDateStyle_DESC) }

fun CFDateFormatterGetDateStyle(arg0: MemorySegment): CFDateFormatterStyle {
    try {
        return CFDateFormatterStyle.fromValue(CFDateFormatterGetDateStyle_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterGetTimeStyle typedef CFDateFormatterStyle = Declared(CFDateFormatterStyle)(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*)
 */
private val CFDateFormatterGetTimeStyle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFDateFormatterGetTimeStyle_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterGetTimeStyle").orElseThrow() }
private val CFDateFormatterGetTimeStyle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterGetTimeStyle_ADDR, CFDateFormatterGetTimeStyle_DESC) }

fun CFDateFormatterGetTimeStyle(arg0: MemorySegment): CFDateFormatterStyle {
    try {
        return CFDateFormatterStyle.fromValue(CFDateFormatterGetTimeStyle_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterGetFormat typedef CFStringRef = (Declared(__CFString))*(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*)
 */
private val CFDateFormatterGetFormat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterGetFormat_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterGetFormat").orElseThrow() }
private val CFDateFormatterGetFormat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterGetFormat_ADDR, CFDateFormatterGetFormat_DESC) }

fun CFDateFormatterGetFormat(arg0: MemorySegment): MemorySegment {
    try {
        return CFDateFormatterGetFormat_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterSetFormat Void(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFDateFormatterSetFormat_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterSetFormat_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterSetFormat").orElseThrow() }
private val CFDateFormatterSetFormat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterSetFormat_ADDR, CFDateFormatterSetFormat_DESC) }

fun CFDateFormatterSetFormat(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFDateFormatterSetFormat_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCreateStringWithDate typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFDateRef = (Declared(__CFDate))*)
 */
private val CFDateFormatterCreateStringWithDate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterCreateStringWithDate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCreateStringWithDate").orElseThrow() }
private val CFDateFormatterCreateStringWithDate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCreateStringWithDate_ADDR, CFDateFormatterCreateStringWithDate_DESC) }

fun CFDateFormatterCreateStringWithDate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFDateFormatterCreateStringWithDate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCreateStringWithAbsoluteTime typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFAbsoluteTime = Double)
 */
private val CFDateFormatterCreateStringWithAbsoluteTime_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFDateFormatterCreateStringWithAbsoluteTime_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCreateStringWithAbsoluteTime").orElseThrow() }
private val CFDateFormatterCreateStringWithAbsoluteTime_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCreateStringWithAbsoluteTime_ADDR, CFDateFormatterCreateStringWithAbsoluteTime_DESC) }

fun CFDateFormatterCreateStringWithAbsoluteTime(arg0: MemorySegment, arg1: MemorySegment, arg2: Double): MemorySegment {
    try {
        return CFDateFormatterCreateStringWithAbsoluteTime_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCreateDateFromString typedef CFDateRef = (Declared(__CFDate))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFStringRef = (Declared(__CFString))*,(typedef CFRange = Declared(CFRange))*)
 */
private val CFDateFormatterCreateDateFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterCreateDateFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCreateDateFromString").orElseThrow() }
private val CFDateFormatterCreateDateFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCreateDateFromString_ADDR, CFDateFormatterCreateDateFromString_DESC) }

fun CFDateFormatterCreateDateFromString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFDateFormatterCreateDateFromString_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterGetAbsoluteTimeFromString typedef Boolean = UNSIGNED = Char(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFStringRef = (Declared(__CFString))*,(typedef CFRange = Declared(CFRange))*,(typedef CFAbsoluteTime = Double)*)
 */
private val CFDateFormatterGetAbsoluteTimeFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterGetAbsoluteTimeFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterGetAbsoluteTimeFromString").orElseThrow() }
private val CFDateFormatterGetAbsoluteTimeFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterGetAbsoluteTimeFromString_ADDR, CFDateFormatterGetAbsoluteTimeFromString_DESC) }

fun CFDateFormatterGetAbsoluteTimeFromString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Byte {
    try {
        return CFDateFormatterGetAbsoluteTimeFromString_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterSetProperty Void(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFTypeRef = (Void)*)
 */
private val CFDateFormatterSetProperty_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterSetProperty_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterSetProperty").orElseThrow() }
private val CFDateFormatterSetProperty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterSetProperty_ADDR, CFDateFormatterSetProperty_DESC) }

fun CFDateFormatterSetProperty(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFDateFormatterSetProperty_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFDateFormatterCopyProperty typedef CFTypeRef = (Void)*(typedef CFDateFormatterRef = (Declared(__CFDateFormatter))*,typedef CFDateFormatterKey = (Declared(__CFString))*)
 */
private val CFDateFormatterCopyProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFDateFormatterCopyProperty_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFDateFormatterCopyProperty").orElseThrow() }
private val CFDateFormatterCopyProperty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFDateFormatterCopyProperty_ADDR, CFDateFormatterCopyProperty_DESC) }

fun CFDateFormatterCopyProperty(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFDateFormatterCopyProperty_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFDateFormatterIsLenient typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterIsLenient_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterIsLenient_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterIsLenient").orElseThrow().reinterpret(kCFDateFormatterIsLenient_LAYOUT.byteSize()) }
private val kCFDateFormatterIsLenient_VH: VarHandle by lazy { kCFDateFormatterIsLenient_LAYOUT.varHandle() }

var kCFDateFormatterIsLenient: MemorySegment
    get() = kCFDateFormatterIsLenient_VH.get(kCFDateFormatterIsLenient_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterIsLenient_VH.set(kCFDateFormatterIsLenient_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterTimeZone typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterTimeZone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterTimeZone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterTimeZone").orElseThrow().reinterpret(kCFDateFormatterTimeZone_LAYOUT.byteSize()) }
private val kCFDateFormatterTimeZone_VH: VarHandle by lazy { kCFDateFormatterTimeZone_LAYOUT.varHandle() }

var kCFDateFormatterTimeZone: MemorySegment
    get() = kCFDateFormatterTimeZone_VH.get(kCFDateFormatterTimeZone_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterTimeZone_VH.set(kCFDateFormatterTimeZone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterCalendarName typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterCalendarName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterCalendarName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterCalendarName").orElseThrow().reinterpret(kCFDateFormatterCalendarName_LAYOUT.byteSize()) }
private val kCFDateFormatterCalendarName_VH: VarHandle by lazy { kCFDateFormatterCalendarName_LAYOUT.varHandle() }

var kCFDateFormatterCalendarName: MemorySegment
    get() = kCFDateFormatterCalendarName_VH.get(kCFDateFormatterCalendarName_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterCalendarName_VH.set(kCFDateFormatterCalendarName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterDefaultFormat typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterDefaultFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterDefaultFormat_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterDefaultFormat").orElseThrow().reinterpret(kCFDateFormatterDefaultFormat_LAYOUT.byteSize()) }
private val kCFDateFormatterDefaultFormat_VH: VarHandle by lazy { kCFDateFormatterDefaultFormat_LAYOUT.varHandle() }

var kCFDateFormatterDefaultFormat: MemorySegment
    get() = kCFDateFormatterDefaultFormat_VH.get(kCFDateFormatterDefaultFormat_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterDefaultFormat_VH.set(kCFDateFormatterDefaultFormat_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterTwoDigitStartDate typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterTwoDigitStartDate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterTwoDigitStartDate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterTwoDigitStartDate").orElseThrow().reinterpret(kCFDateFormatterTwoDigitStartDate_LAYOUT.byteSize()) }
private val kCFDateFormatterTwoDigitStartDate_VH: VarHandle by lazy { kCFDateFormatterTwoDigitStartDate_LAYOUT.varHandle() }

var kCFDateFormatterTwoDigitStartDate: MemorySegment
    get() = kCFDateFormatterTwoDigitStartDate_VH.get(kCFDateFormatterTwoDigitStartDate_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterTwoDigitStartDate_VH.set(kCFDateFormatterTwoDigitStartDate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterDefaultDate typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterDefaultDate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterDefaultDate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterDefaultDate").orElseThrow().reinterpret(kCFDateFormatterDefaultDate_LAYOUT.byteSize()) }
private val kCFDateFormatterDefaultDate_VH: VarHandle by lazy { kCFDateFormatterDefaultDate_LAYOUT.varHandle() }

var kCFDateFormatterDefaultDate: MemorySegment
    get() = kCFDateFormatterDefaultDate_VH.get(kCFDateFormatterDefaultDate_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterDefaultDate_VH.set(kCFDateFormatterDefaultDate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterCalendar typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterCalendar").orElseThrow().reinterpret(kCFDateFormatterCalendar_LAYOUT.byteSize()) }
private val kCFDateFormatterCalendar_VH: VarHandle by lazy { kCFDateFormatterCalendar_LAYOUT.varHandle() }

var kCFDateFormatterCalendar: MemorySegment
    get() = kCFDateFormatterCalendar_VH.get(kCFDateFormatterCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterCalendar_VH.set(kCFDateFormatterCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterEraSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterEraSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterEraSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterEraSymbols").orElseThrow().reinterpret(kCFDateFormatterEraSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterEraSymbols_VH: VarHandle by lazy { kCFDateFormatterEraSymbols_LAYOUT.varHandle() }

var kCFDateFormatterEraSymbols: MemorySegment
    get() = kCFDateFormatterEraSymbols_VH.get(kCFDateFormatterEraSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterEraSymbols_VH.set(kCFDateFormatterEraSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterMonthSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterMonthSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterMonthSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterMonthSymbols").orElseThrow().reinterpret(kCFDateFormatterMonthSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterMonthSymbols_VH: VarHandle by lazy { kCFDateFormatterMonthSymbols_LAYOUT.varHandle() }

var kCFDateFormatterMonthSymbols: MemorySegment
    get() = kCFDateFormatterMonthSymbols_VH.get(kCFDateFormatterMonthSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterMonthSymbols_VH.set(kCFDateFormatterMonthSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterShortMonthSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterShortMonthSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterShortMonthSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterShortMonthSymbols").orElseThrow().reinterpret(kCFDateFormatterShortMonthSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterShortMonthSymbols_VH: VarHandle by lazy { kCFDateFormatterShortMonthSymbols_LAYOUT.varHandle() }

var kCFDateFormatterShortMonthSymbols: MemorySegment
    get() = kCFDateFormatterShortMonthSymbols_VH.get(kCFDateFormatterShortMonthSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterShortMonthSymbols_VH.set(kCFDateFormatterShortMonthSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterWeekdaySymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterWeekdaySymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterWeekdaySymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterWeekdaySymbols").orElseThrow().reinterpret(kCFDateFormatterWeekdaySymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterWeekdaySymbols_VH: VarHandle by lazy { kCFDateFormatterWeekdaySymbols_LAYOUT.varHandle() }

var kCFDateFormatterWeekdaySymbols: MemorySegment
    get() = kCFDateFormatterWeekdaySymbols_VH.get(kCFDateFormatterWeekdaySymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterWeekdaySymbols_VH.set(kCFDateFormatterWeekdaySymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterShortWeekdaySymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterShortWeekdaySymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterShortWeekdaySymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterShortWeekdaySymbols").orElseThrow().reinterpret(kCFDateFormatterShortWeekdaySymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterShortWeekdaySymbols_VH: VarHandle by lazy { kCFDateFormatterShortWeekdaySymbols_LAYOUT.varHandle() }

var kCFDateFormatterShortWeekdaySymbols: MemorySegment
    get() = kCFDateFormatterShortWeekdaySymbols_VH.get(kCFDateFormatterShortWeekdaySymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterShortWeekdaySymbols_VH.set(kCFDateFormatterShortWeekdaySymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterAMSymbol typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterAMSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterAMSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterAMSymbol").orElseThrow().reinterpret(kCFDateFormatterAMSymbol_LAYOUT.byteSize()) }
private val kCFDateFormatterAMSymbol_VH: VarHandle by lazy { kCFDateFormatterAMSymbol_LAYOUT.varHandle() }

var kCFDateFormatterAMSymbol: MemorySegment
    get() = kCFDateFormatterAMSymbol_VH.get(kCFDateFormatterAMSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterAMSymbol_VH.set(kCFDateFormatterAMSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterPMSymbol typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterPMSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterPMSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterPMSymbol").orElseThrow().reinterpret(kCFDateFormatterPMSymbol_LAYOUT.byteSize()) }
private val kCFDateFormatterPMSymbol_VH: VarHandle by lazy { kCFDateFormatterPMSymbol_LAYOUT.varHandle() }

var kCFDateFormatterPMSymbol: MemorySegment
    get() = kCFDateFormatterPMSymbol_VH.get(kCFDateFormatterPMSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterPMSymbol_VH.set(kCFDateFormatterPMSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterLongEraSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterLongEraSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterLongEraSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterLongEraSymbols").orElseThrow().reinterpret(kCFDateFormatterLongEraSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterLongEraSymbols_VH: VarHandle by lazy { kCFDateFormatterLongEraSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterLongEraSymbols: MemorySegment
    get() = kCFDateFormatterLongEraSymbols_VH.get(kCFDateFormatterLongEraSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterLongEraSymbols_VH.set(kCFDateFormatterLongEraSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterVeryShortMonthSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterVeryShortMonthSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterVeryShortMonthSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterVeryShortMonthSymbols").orElseThrow().reinterpret(kCFDateFormatterVeryShortMonthSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterVeryShortMonthSymbols_VH: VarHandle by lazy { kCFDateFormatterVeryShortMonthSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterVeryShortMonthSymbols: MemorySegment
    get() = kCFDateFormatterVeryShortMonthSymbols_VH.get(kCFDateFormatterVeryShortMonthSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterVeryShortMonthSymbols_VH.set(kCFDateFormatterVeryShortMonthSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterStandaloneMonthSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterStandaloneMonthSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterStandaloneMonthSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterStandaloneMonthSymbols").orElseThrow().reinterpret(kCFDateFormatterStandaloneMonthSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterStandaloneMonthSymbols_VH: VarHandle by lazy { kCFDateFormatterStandaloneMonthSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterStandaloneMonthSymbols: MemorySegment
    get() = kCFDateFormatterStandaloneMonthSymbols_VH.get(kCFDateFormatterStandaloneMonthSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterStandaloneMonthSymbols_VH.set(kCFDateFormatterStandaloneMonthSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterShortStandaloneMonthSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterShortStandaloneMonthSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterShortStandaloneMonthSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterShortStandaloneMonthSymbols").orElseThrow().reinterpret(kCFDateFormatterShortStandaloneMonthSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterShortStandaloneMonthSymbols_VH: VarHandle by lazy { kCFDateFormatterShortStandaloneMonthSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterShortStandaloneMonthSymbols: MemorySegment
    get() = kCFDateFormatterShortStandaloneMonthSymbols_VH.get(kCFDateFormatterShortStandaloneMonthSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterShortStandaloneMonthSymbols_VH.set(kCFDateFormatterShortStandaloneMonthSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterVeryShortStandaloneMonthSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterVeryShortStandaloneMonthSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterVeryShortStandaloneMonthSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterVeryShortStandaloneMonthSymbols").orElseThrow().reinterpret(kCFDateFormatterVeryShortStandaloneMonthSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterVeryShortStandaloneMonthSymbols_VH: VarHandle by lazy { kCFDateFormatterVeryShortStandaloneMonthSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterVeryShortStandaloneMonthSymbols: MemorySegment
    get() = kCFDateFormatterVeryShortStandaloneMonthSymbols_VH.get(kCFDateFormatterVeryShortStandaloneMonthSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterVeryShortStandaloneMonthSymbols_VH.set(kCFDateFormatterVeryShortStandaloneMonthSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterVeryShortWeekdaySymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterVeryShortWeekdaySymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterVeryShortWeekdaySymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterVeryShortWeekdaySymbols").orElseThrow().reinterpret(kCFDateFormatterVeryShortWeekdaySymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterVeryShortWeekdaySymbols_VH: VarHandle by lazy { kCFDateFormatterVeryShortWeekdaySymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterVeryShortWeekdaySymbols: MemorySegment
    get() = kCFDateFormatterVeryShortWeekdaySymbols_VH.get(kCFDateFormatterVeryShortWeekdaySymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterVeryShortWeekdaySymbols_VH.set(kCFDateFormatterVeryShortWeekdaySymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterStandaloneWeekdaySymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterStandaloneWeekdaySymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterStandaloneWeekdaySymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterStandaloneWeekdaySymbols").orElseThrow().reinterpret(kCFDateFormatterStandaloneWeekdaySymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterStandaloneWeekdaySymbols_VH: VarHandle by lazy { kCFDateFormatterStandaloneWeekdaySymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterStandaloneWeekdaySymbols: MemorySegment
    get() = kCFDateFormatterStandaloneWeekdaySymbols_VH.get(kCFDateFormatterStandaloneWeekdaySymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterStandaloneWeekdaySymbols_VH.set(kCFDateFormatterStandaloneWeekdaySymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterShortStandaloneWeekdaySymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterShortStandaloneWeekdaySymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterShortStandaloneWeekdaySymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterShortStandaloneWeekdaySymbols").orElseThrow().reinterpret(kCFDateFormatterShortStandaloneWeekdaySymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterShortStandaloneWeekdaySymbols_VH: VarHandle by lazy { kCFDateFormatterShortStandaloneWeekdaySymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterShortStandaloneWeekdaySymbols: MemorySegment
    get() = kCFDateFormatterShortStandaloneWeekdaySymbols_VH.get(kCFDateFormatterShortStandaloneWeekdaySymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterShortStandaloneWeekdaySymbols_VH.set(kCFDateFormatterShortStandaloneWeekdaySymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterVeryShortStandaloneWeekdaySymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterVeryShortStandaloneWeekdaySymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterVeryShortStandaloneWeekdaySymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterVeryShortStandaloneWeekdaySymbols").orElseThrow().reinterpret(kCFDateFormatterVeryShortStandaloneWeekdaySymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterVeryShortStandaloneWeekdaySymbols_VH: VarHandle by lazy { kCFDateFormatterVeryShortStandaloneWeekdaySymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterVeryShortStandaloneWeekdaySymbols: MemorySegment
    get() = kCFDateFormatterVeryShortStandaloneWeekdaySymbols_VH.get(kCFDateFormatterVeryShortStandaloneWeekdaySymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterVeryShortStandaloneWeekdaySymbols_VH.set(kCFDateFormatterVeryShortStandaloneWeekdaySymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterQuarterSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterQuarterSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterQuarterSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterQuarterSymbols").orElseThrow().reinterpret(kCFDateFormatterQuarterSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterQuarterSymbols_VH: VarHandle by lazy { kCFDateFormatterQuarterSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterQuarterSymbols: MemorySegment
    get() = kCFDateFormatterQuarterSymbols_VH.get(kCFDateFormatterQuarterSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterQuarterSymbols_VH.set(kCFDateFormatterQuarterSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterShortQuarterSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterShortQuarterSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterShortQuarterSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterShortQuarterSymbols").orElseThrow().reinterpret(kCFDateFormatterShortQuarterSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterShortQuarterSymbols_VH: VarHandle by lazy { kCFDateFormatterShortQuarterSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterShortQuarterSymbols: MemorySegment
    get() = kCFDateFormatterShortQuarterSymbols_VH.get(kCFDateFormatterShortQuarterSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterShortQuarterSymbols_VH.set(kCFDateFormatterShortQuarterSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterStandaloneQuarterSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterStandaloneQuarterSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterStandaloneQuarterSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterStandaloneQuarterSymbols").orElseThrow().reinterpret(kCFDateFormatterStandaloneQuarterSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterStandaloneQuarterSymbols_VH: VarHandle by lazy { kCFDateFormatterStandaloneQuarterSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterStandaloneQuarterSymbols: MemorySegment
    get() = kCFDateFormatterStandaloneQuarterSymbols_VH.get(kCFDateFormatterStandaloneQuarterSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterStandaloneQuarterSymbols_VH.set(kCFDateFormatterStandaloneQuarterSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterShortStandaloneQuarterSymbols typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterShortStandaloneQuarterSymbols_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterShortStandaloneQuarterSymbols_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterShortStandaloneQuarterSymbols").orElseThrow().reinterpret(kCFDateFormatterShortStandaloneQuarterSymbols_LAYOUT.byteSize()) }
private val kCFDateFormatterShortStandaloneQuarterSymbols_VH: VarHandle by lazy { kCFDateFormatterShortStandaloneQuarterSymbols_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterShortStandaloneQuarterSymbols: MemorySegment
    get() = kCFDateFormatterShortStandaloneQuarterSymbols_VH.get(kCFDateFormatterShortStandaloneQuarterSymbols_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterShortStandaloneQuarterSymbols_VH.set(kCFDateFormatterShortStandaloneQuarterSymbols_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterGregorianStartDate typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterGregorianStartDate_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterGregorianStartDate_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterGregorianStartDate").orElseThrow().reinterpret(kCFDateFormatterGregorianStartDate_LAYOUT.byteSize()) }
private val kCFDateFormatterGregorianStartDate_VH: VarHandle by lazy { kCFDateFormatterGregorianStartDate_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterGregorianStartDate: MemorySegment
    get() = kCFDateFormatterGregorianStartDate_VH.get(kCFDateFormatterGregorianStartDate_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterGregorianStartDate_VH.set(kCFDateFormatterGregorianStartDate_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFDateFormatterDoesRelativeDateFormattingKey typedef const CFDateFormatterKey = (Declared(__CFString))*
 */
private val kCFDateFormatterDoesRelativeDateFormattingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFDateFormatterDoesRelativeDateFormattingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFDateFormatterDoesRelativeDateFormattingKey").orElseThrow().reinterpret(kCFDateFormatterDoesRelativeDateFormattingKey_LAYOUT.byteSize()) }
private val kCFDateFormatterDoesRelativeDateFormattingKey_VH: VarHandle by lazy { kCFDateFormatterDoesRelativeDateFormattingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFDateFormatterDoesRelativeDateFormattingKey: MemorySegment
    get() = kCFDateFormatterDoesRelativeDateFormattingKey_VH.get(kCFDateFormatterDoesRelativeDateFormattingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFDateFormatterDoesRelativeDateFormattingKey_VH.set(kCFDateFormatterDoesRelativeDateFormattingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBooleanTrue typedef const CFBooleanRef = (Declared(__CFBoolean))*
 */
private val kCFBooleanTrue_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBooleanTrue_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFBooleanTrue").orElseThrow().reinterpret(kCFBooleanTrue_LAYOUT.byteSize()) }
private val kCFBooleanTrue_VH: VarHandle by lazy { kCFBooleanTrue_LAYOUT.varHandle() }

var kCFBooleanTrue: MemorySegment
    get() = kCFBooleanTrue_VH.get(kCFBooleanTrue_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBooleanTrue_VH.set(kCFBooleanTrue_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBooleanFalse typedef const CFBooleanRef = (Declared(__CFBoolean))*
 */
private val kCFBooleanFalse_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBooleanFalse_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFBooleanFalse").orElseThrow().reinterpret(kCFBooleanFalse_LAYOUT.byteSize()) }
private val kCFBooleanFalse_VH: VarHandle by lazy { kCFBooleanFalse_LAYOUT.varHandle() }

var kCFBooleanFalse: MemorySegment
    get() = kCFBooleanFalse_VH.get(kCFBooleanFalse_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBooleanFalse_VH.set(kCFBooleanFalse_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFBooleanGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFBooleanGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFBooleanGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFBooleanGetTypeID").orElseThrow() }
private val CFBooleanGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBooleanGetTypeID_ADDR, CFBooleanGetTypeID_DESC) }

fun CFBooleanGetTypeID(): Long {
    try {
        return CFBooleanGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBooleanGetValue typedef Boolean = UNSIGNED = Char(typedef CFBooleanRef = (Declared(__CFBoolean))*)
 */
private val CFBooleanGetValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFBooleanGetValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFBooleanGetValue").orElseThrow() }
private val CFBooleanGetValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBooleanGetValue_ADDR, CFBooleanGetValue_DESC) }

fun CFBooleanGetValue(arg0: MemorySegment): Byte {
    try {
        return CFBooleanGetValue_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFNumberPositiveInfinity typedef const CFNumberRef = (Declared(__CFNumber))*
 */
private val kCFNumberPositiveInfinity_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberPositiveInfinity_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberPositiveInfinity").orElseThrow().reinterpret(kCFNumberPositiveInfinity_LAYOUT.byteSize()) }
private val kCFNumberPositiveInfinity_VH: VarHandle by lazy { kCFNumberPositiveInfinity_LAYOUT.varHandle() }

var kCFNumberPositiveInfinity: MemorySegment
    get() = kCFNumberPositiveInfinity_VH.get(kCFNumberPositiveInfinity_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberPositiveInfinity_VH.set(kCFNumberPositiveInfinity_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberNegativeInfinity typedef const CFNumberRef = (Declared(__CFNumber))*
 */
private val kCFNumberNegativeInfinity_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberNegativeInfinity_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberNegativeInfinity").orElseThrow().reinterpret(kCFNumberNegativeInfinity_LAYOUT.byteSize()) }
private val kCFNumberNegativeInfinity_VH: VarHandle by lazy { kCFNumberNegativeInfinity_LAYOUT.varHandle() }

var kCFNumberNegativeInfinity: MemorySegment
    get() = kCFNumberNegativeInfinity_VH.get(kCFNumberNegativeInfinity_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberNegativeInfinity_VH.set(kCFNumberNegativeInfinity_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberNaN typedef const CFNumberRef = (Declared(__CFNumber))*
 */
private val kCFNumberNaN_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberNaN_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberNaN").orElseThrow().reinterpret(kCFNumberNaN_LAYOUT.byteSize()) }
private val kCFNumberNaN_VH: VarHandle by lazy { kCFNumberNaN_LAYOUT.varHandle() }

var kCFNumberNaN: MemorySegment
    get() = kCFNumberNaN_VH.get(kCFNumberNaN_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberNaN_VH.set(kCFNumberNaN_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFNumberGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFNumberGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFNumberGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberGetTypeID").orElseThrow() }
private val CFNumberGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberGetTypeID_ADDR, CFNumberGetTypeID_DESC) }

fun CFNumberGetTypeID(): Long {
    try {
        return CFNumberGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberCreate typedef CFNumberRef = (Declared(__CFNumber))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFNumberType = Declared(CFNumberType),(Void)*)
 */
private val CFNumberCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberCreate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberCreate").orElseThrow() }
private val CFNumberCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberCreate_ADDR, CFNumberCreate_DESC) }

fun CFNumberCreate(arg0: MemorySegment, arg1: CFNumberType, arg2: MemorySegment): MemorySegment {
    try {
        return CFNumberCreate_HANDLE.invokeExact(arg0, arg1.value, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberGetType typedef CFNumberType = Declared(CFNumberType)(typedef CFNumberRef = (Declared(__CFNumber))*)
 */
private val CFNumberGetType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberGetType_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberGetType").orElseThrow() }
private val CFNumberGetType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberGetType_ADDR, CFNumberGetType_DESC) }

fun CFNumberGetType(arg0: MemorySegment): CFNumberType {
    try {
        return CFNumberType.fromValue(CFNumberGetType_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberGetByteSize typedef CFIndex = Long(typedef CFNumberRef = (Declared(__CFNumber))*)
 */
private val CFNumberGetByteSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberGetByteSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberGetByteSize").orElseThrow() }
private val CFNumberGetByteSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberGetByteSize_ADDR, CFNumberGetByteSize_DESC) }

fun CFNumberGetByteSize(arg0: MemorySegment): Long {
    try {
        return CFNumberGetByteSize_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberIsFloatType typedef Boolean = UNSIGNED = Char(typedef CFNumberRef = (Declared(__CFNumber))*)
 */
private val CFNumberIsFloatType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFNumberIsFloatType_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberIsFloatType").orElseThrow() }
private val CFNumberIsFloatType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberIsFloatType_ADDR, CFNumberIsFloatType_DESC) }

fun CFNumberIsFloatType(arg0: MemorySegment): Byte {
    try {
        return CFNumberIsFloatType_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberGetValue typedef Boolean = UNSIGNED = Char(typedef CFNumberRef = (Declared(__CFNumber))*,typedef CFNumberType = Declared(CFNumberType),(Void)*)
 */
private val CFNumberGetValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberGetValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberGetValue").orElseThrow() }
private val CFNumberGetValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberGetValue_ADDR, CFNumberGetValue_DESC) }

fun CFNumberGetValue(arg0: MemorySegment, arg1: CFNumberType, arg2: MemorySegment): Byte {
    try {
        return CFNumberGetValue_HANDLE.invokeExact(arg0, arg1.value, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberCompare typedef CFComparisonResult = Declared(CFComparisonResult)(typedef CFNumberRef = (Declared(__CFNumber))*,typedef CFNumberRef = (Declared(__CFNumber))*,(Void)*)
 */
private val CFNumberCompare_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberCompare_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberCompare").orElseThrow() }
private val CFNumberCompare_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberCompare_ADDR, CFNumberCompare_DESC) }

fun CFNumberCompare(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): CFComparisonResult {
    try {
        return CFComparisonResult.fromValue(CFNumberCompare_HANDLE.invokeExact(arg0, arg1, arg2) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFNumberFormatterGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFNumberFormatterGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterGetTypeID").orElseThrow() }
private val CFNumberFormatterGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterGetTypeID_ADDR, CFNumberFormatterGetTypeID_DESC) }

fun CFNumberFormatterGetTypeID(): Long {
    try {
        return CFNumberFormatterGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterCreate typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFLocaleRef = (Declared(__CFLocale))*,typedef CFNumberFormatterStyle = Declared(CFNumberFormatterStyle))
 */
private val CFNumberFormatterCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFNumberFormatterCreate_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterCreate").orElseThrow() }
private val CFNumberFormatterCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterCreate_ADDR, CFNumberFormatterCreate_DESC) }

fun CFNumberFormatterCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: CFNumberFormatterStyle): MemorySegment {
    try {
        return CFNumberFormatterCreate_HANDLE.invokeExact(arg0, arg1, arg2.value) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterGetLocale typedef CFLocaleRef = (Declared(__CFLocale))*(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*)
 */
private val CFNumberFormatterGetLocale_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterGetLocale_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterGetLocale").orElseThrow() }
private val CFNumberFormatterGetLocale_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterGetLocale_ADDR, CFNumberFormatterGetLocale_DESC) }

fun CFNumberFormatterGetLocale(arg0: MemorySegment): MemorySegment {
    try {
        return CFNumberFormatterGetLocale_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterGetStyle typedef CFNumberFormatterStyle = Declared(CFNumberFormatterStyle)(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*)
 */
private val CFNumberFormatterGetStyle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberFormatterGetStyle_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterGetStyle").orElseThrow() }
private val CFNumberFormatterGetStyle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterGetStyle_ADDR, CFNumberFormatterGetStyle_DESC) }

fun CFNumberFormatterGetStyle(arg0: MemorySegment): CFNumberFormatterStyle {
    try {
        return CFNumberFormatterStyle.fromValue(CFNumberFormatterGetStyle_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterGetFormat typedef CFStringRef = (Declared(__CFString))*(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*)
 */
private val CFNumberFormatterGetFormat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterGetFormat_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterGetFormat").orElseThrow() }
private val CFNumberFormatterGetFormat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterGetFormat_ADDR, CFNumberFormatterGetFormat_DESC) }

fun CFNumberFormatterGetFormat(arg0: MemorySegment): MemorySegment {
    try {
        return CFNumberFormatterGetFormat_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterSetFormat Void(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFNumberFormatterSetFormat_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterSetFormat_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterSetFormat").orElseThrow() }
private val CFNumberFormatterSetFormat_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterSetFormat_ADDR, CFNumberFormatterSetFormat_DESC) }

fun CFNumberFormatterSetFormat(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFNumberFormatterSetFormat_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterCreateStringWithNumber typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFNumberRef = (Declared(__CFNumber))*)
 */
private val CFNumberFormatterCreateStringWithNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterCreateStringWithNumber_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterCreateStringWithNumber").orElseThrow() }
private val CFNumberFormatterCreateStringWithNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterCreateStringWithNumber_ADDR, CFNumberFormatterCreateStringWithNumber_DESC) }

fun CFNumberFormatterCreateStringWithNumber(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFNumberFormatterCreateStringWithNumber_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterCreateStringWithValue typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFNumberType = Declared(CFNumberType),(Void)*)
 */
private val CFNumberFormatterCreateStringWithValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberFormatterCreateStringWithValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterCreateStringWithValue").orElseThrow() }
private val CFNumberFormatterCreateStringWithValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterCreateStringWithValue_ADDR, CFNumberFormatterCreateStringWithValue_DESC) }

fun CFNumberFormatterCreateStringWithValue(arg0: MemorySegment, arg1: MemorySegment, arg2: CFNumberType, arg3: MemorySegment): MemorySegment {
    try {
        return CFNumberFormatterCreateStringWithValue_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterCreateNumberFromString typedef CFNumberRef = (Declared(__CFNumber))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFStringRef = (Declared(__CFString))*,(typedef CFRange = Declared(CFRange))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFNumberFormatterCreateNumberFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFNumberFormatterCreateNumberFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterCreateNumberFromString").orElseThrow() }
private val CFNumberFormatterCreateNumberFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterCreateNumberFromString_ADDR, CFNumberFormatterCreateNumberFromString_DESC) }

fun CFNumberFormatterCreateNumberFromString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): MemorySegment {
    try {
        return CFNumberFormatterCreateNumberFromString_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterGetValueFromString typedef Boolean = UNSIGNED = Char(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFStringRef = (Declared(__CFString))*,(typedef CFRange = Declared(CFRange))*,typedef CFNumberType = Declared(CFNumberType),(Void)*)
 */
private val CFNumberFormatterGetValueFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFNumberFormatterGetValueFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterGetValueFromString").orElseThrow() }
private val CFNumberFormatterGetValueFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterGetValueFromString_ADDR, CFNumberFormatterGetValueFromString_DESC) }

fun CFNumberFormatterGetValueFromString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: CFNumberType, arg4: MemorySegment): Byte {
    try {
        return CFNumberFormatterGetValueFromString_HANDLE.invokeExact(arg0, arg1, arg2, arg3.value, arg4) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterSetProperty Void(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFNumberFormatterKey = (Declared(__CFString))*,typedef CFTypeRef = (Void)*)
 */
private val CFNumberFormatterSetProperty_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterSetProperty_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterSetProperty").orElseThrow() }
private val CFNumberFormatterSetProperty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterSetProperty_ADDR, CFNumberFormatterSetProperty_DESC) }

fun CFNumberFormatterSetProperty(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFNumberFormatterSetProperty_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFNumberFormatterCopyProperty typedef CFTypeRef = (Void)*(typedef CFNumberFormatterRef = (Declared(__CFNumberFormatter))*,typedef CFNumberFormatterKey = (Declared(__CFString))*)
 */
private val CFNumberFormatterCopyProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterCopyProperty_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterCopyProperty").orElseThrow() }
private val CFNumberFormatterCopyProperty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterCopyProperty_ADDR, CFNumberFormatterCopyProperty_DESC) }

fun CFNumberFormatterCopyProperty(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFNumberFormatterCopyProperty_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFNumberFormatterCurrencyCode typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterCurrencyCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterCurrencyCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterCurrencyCode").orElseThrow().reinterpret(kCFNumberFormatterCurrencyCode_LAYOUT.byteSize()) }
private val kCFNumberFormatterCurrencyCode_VH: VarHandle by lazy { kCFNumberFormatterCurrencyCode_LAYOUT.varHandle() }

var kCFNumberFormatterCurrencyCode: MemorySegment
    get() = kCFNumberFormatterCurrencyCode_VH.get(kCFNumberFormatterCurrencyCode_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterCurrencyCode_VH.set(kCFNumberFormatterCurrencyCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterDecimalSeparator typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterDecimalSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterDecimalSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterDecimalSeparator").orElseThrow().reinterpret(kCFNumberFormatterDecimalSeparator_LAYOUT.byteSize()) }
private val kCFNumberFormatterDecimalSeparator_VH: VarHandle by lazy { kCFNumberFormatterDecimalSeparator_LAYOUT.varHandle() }

var kCFNumberFormatterDecimalSeparator: MemorySegment
    get() = kCFNumberFormatterDecimalSeparator_VH.get(kCFNumberFormatterDecimalSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterDecimalSeparator_VH.set(kCFNumberFormatterDecimalSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterCurrencyDecimalSeparator typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterCurrencyDecimalSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterCurrencyDecimalSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterCurrencyDecimalSeparator").orElseThrow().reinterpret(kCFNumberFormatterCurrencyDecimalSeparator_LAYOUT.byteSize()) }
private val kCFNumberFormatterCurrencyDecimalSeparator_VH: VarHandle by lazy { kCFNumberFormatterCurrencyDecimalSeparator_LAYOUT.varHandle() }

var kCFNumberFormatterCurrencyDecimalSeparator: MemorySegment
    get() = kCFNumberFormatterCurrencyDecimalSeparator_VH.get(kCFNumberFormatterCurrencyDecimalSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterCurrencyDecimalSeparator_VH.set(kCFNumberFormatterCurrencyDecimalSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterAlwaysShowDecimalSeparator typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterAlwaysShowDecimalSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterAlwaysShowDecimalSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterAlwaysShowDecimalSeparator").orElseThrow().reinterpret(kCFNumberFormatterAlwaysShowDecimalSeparator_LAYOUT.byteSize()) }
private val kCFNumberFormatterAlwaysShowDecimalSeparator_VH: VarHandle by lazy { kCFNumberFormatterAlwaysShowDecimalSeparator_LAYOUT.varHandle() }

var kCFNumberFormatterAlwaysShowDecimalSeparator: MemorySegment
    get() = kCFNumberFormatterAlwaysShowDecimalSeparator_VH.get(kCFNumberFormatterAlwaysShowDecimalSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterAlwaysShowDecimalSeparator_VH.set(kCFNumberFormatterAlwaysShowDecimalSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterGroupingSeparator typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterGroupingSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterGroupingSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterGroupingSeparator").orElseThrow().reinterpret(kCFNumberFormatterGroupingSeparator_LAYOUT.byteSize()) }
private val kCFNumberFormatterGroupingSeparator_VH: VarHandle by lazy { kCFNumberFormatterGroupingSeparator_LAYOUT.varHandle() }

var kCFNumberFormatterGroupingSeparator: MemorySegment
    get() = kCFNumberFormatterGroupingSeparator_VH.get(kCFNumberFormatterGroupingSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterGroupingSeparator_VH.set(kCFNumberFormatterGroupingSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterUseGroupingSeparator typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterUseGroupingSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterUseGroupingSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterUseGroupingSeparator").orElseThrow().reinterpret(kCFNumberFormatterUseGroupingSeparator_LAYOUT.byteSize()) }
private val kCFNumberFormatterUseGroupingSeparator_VH: VarHandle by lazy { kCFNumberFormatterUseGroupingSeparator_LAYOUT.varHandle() }

var kCFNumberFormatterUseGroupingSeparator: MemorySegment
    get() = kCFNumberFormatterUseGroupingSeparator_VH.get(kCFNumberFormatterUseGroupingSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterUseGroupingSeparator_VH.set(kCFNumberFormatterUseGroupingSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPercentSymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPercentSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPercentSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPercentSymbol").orElseThrow().reinterpret(kCFNumberFormatterPercentSymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterPercentSymbol_VH: VarHandle by lazy { kCFNumberFormatterPercentSymbol_LAYOUT.varHandle() }

var kCFNumberFormatterPercentSymbol: MemorySegment
    get() = kCFNumberFormatterPercentSymbol_VH.get(kCFNumberFormatterPercentSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPercentSymbol_VH.set(kCFNumberFormatterPercentSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterZeroSymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterZeroSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterZeroSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterZeroSymbol").orElseThrow().reinterpret(kCFNumberFormatterZeroSymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterZeroSymbol_VH: VarHandle by lazy { kCFNumberFormatterZeroSymbol_LAYOUT.varHandle() }

var kCFNumberFormatterZeroSymbol: MemorySegment
    get() = kCFNumberFormatterZeroSymbol_VH.get(kCFNumberFormatterZeroSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterZeroSymbol_VH.set(kCFNumberFormatterZeroSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterNaNSymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterNaNSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterNaNSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterNaNSymbol").orElseThrow().reinterpret(kCFNumberFormatterNaNSymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterNaNSymbol_VH: VarHandle by lazy { kCFNumberFormatterNaNSymbol_LAYOUT.varHandle() }

var kCFNumberFormatterNaNSymbol: MemorySegment
    get() = kCFNumberFormatterNaNSymbol_VH.get(kCFNumberFormatterNaNSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterNaNSymbol_VH.set(kCFNumberFormatterNaNSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterInfinitySymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterInfinitySymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterInfinitySymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterInfinitySymbol").orElseThrow().reinterpret(kCFNumberFormatterInfinitySymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterInfinitySymbol_VH: VarHandle by lazy { kCFNumberFormatterInfinitySymbol_LAYOUT.varHandle() }

var kCFNumberFormatterInfinitySymbol: MemorySegment
    get() = kCFNumberFormatterInfinitySymbol_VH.get(kCFNumberFormatterInfinitySymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterInfinitySymbol_VH.set(kCFNumberFormatterInfinitySymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMinusSign typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMinusSign_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMinusSign_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMinusSign").orElseThrow().reinterpret(kCFNumberFormatterMinusSign_LAYOUT.byteSize()) }
private val kCFNumberFormatterMinusSign_VH: VarHandle by lazy { kCFNumberFormatterMinusSign_LAYOUT.varHandle() }

var kCFNumberFormatterMinusSign: MemorySegment
    get() = kCFNumberFormatterMinusSign_VH.get(kCFNumberFormatterMinusSign_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMinusSign_VH.set(kCFNumberFormatterMinusSign_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPlusSign typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPlusSign_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPlusSign_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPlusSign").orElseThrow().reinterpret(kCFNumberFormatterPlusSign_LAYOUT.byteSize()) }
private val kCFNumberFormatterPlusSign_VH: VarHandle by lazy { kCFNumberFormatterPlusSign_LAYOUT.varHandle() }

var kCFNumberFormatterPlusSign: MemorySegment
    get() = kCFNumberFormatterPlusSign_VH.get(kCFNumberFormatterPlusSign_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPlusSign_VH.set(kCFNumberFormatterPlusSign_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterCurrencySymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterCurrencySymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterCurrencySymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterCurrencySymbol").orElseThrow().reinterpret(kCFNumberFormatterCurrencySymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterCurrencySymbol_VH: VarHandle by lazy { kCFNumberFormatterCurrencySymbol_LAYOUT.varHandle() }

var kCFNumberFormatterCurrencySymbol: MemorySegment
    get() = kCFNumberFormatterCurrencySymbol_VH.get(kCFNumberFormatterCurrencySymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterCurrencySymbol_VH.set(kCFNumberFormatterCurrencySymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterExponentSymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterExponentSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterExponentSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterExponentSymbol").orElseThrow().reinterpret(kCFNumberFormatterExponentSymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterExponentSymbol_VH: VarHandle by lazy { kCFNumberFormatterExponentSymbol_LAYOUT.varHandle() }

var kCFNumberFormatterExponentSymbol: MemorySegment
    get() = kCFNumberFormatterExponentSymbol_VH.get(kCFNumberFormatterExponentSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterExponentSymbol_VH.set(kCFNumberFormatterExponentSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMinIntegerDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMinIntegerDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMinIntegerDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMinIntegerDigits").orElseThrow().reinterpret(kCFNumberFormatterMinIntegerDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMinIntegerDigits_VH: VarHandle by lazy { kCFNumberFormatterMinIntegerDigits_LAYOUT.varHandle() }

var kCFNumberFormatterMinIntegerDigits: MemorySegment
    get() = kCFNumberFormatterMinIntegerDigits_VH.get(kCFNumberFormatterMinIntegerDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMinIntegerDigits_VH.set(kCFNumberFormatterMinIntegerDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMaxIntegerDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMaxIntegerDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMaxIntegerDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMaxIntegerDigits").orElseThrow().reinterpret(kCFNumberFormatterMaxIntegerDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMaxIntegerDigits_VH: VarHandle by lazy { kCFNumberFormatterMaxIntegerDigits_LAYOUT.varHandle() }

var kCFNumberFormatterMaxIntegerDigits: MemorySegment
    get() = kCFNumberFormatterMaxIntegerDigits_VH.get(kCFNumberFormatterMaxIntegerDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMaxIntegerDigits_VH.set(kCFNumberFormatterMaxIntegerDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMinFractionDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMinFractionDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMinFractionDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMinFractionDigits").orElseThrow().reinterpret(kCFNumberFormatterMinFractionDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMinFractionDigits_VH: VarHandle by lazy { kCFNumberFormatterMinFractionDigits_LAYOUT.varHandle() }

var kCFNumberFormatterMinFractionDigits: MemorySegment
    get() = kCFNumberFormatterMinFractionDigits_VH.get(kCFNumberFormatterMinFractionDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMinFractionDigits_VH.set(kCFNumberFormatterMinFractionDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMaxFractionDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMaxFractionDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMaxFractionDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMaxFractionDigits").orElseThrow().reinterpret(kCFNumberFormatterMaxFractionDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMaxFractionDigits_VH: VarHandle by lazy { kCFNumberFormatterMaxFractionDigits_LAYOUT.varHandle() }

var kCFNumberFormatterMaxFractionDigits: MemorySegment
    get() = kCFNumberFormatterMaxFractionDigits_VH.get(kCFNumberFormatterMaxFractionDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMaxFractionDigits_VH.set(kCFNumberFormatterMaxFractionDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterGroupingSize typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterGroupingSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterGroupingSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterGroupingSize").orElseThrow().reinterpret(kCFNumberFormatterGroupingSize_LAYOUT.byteSize()) }
private val kCFNumberFormatterGroupingSize_VH: VarHandle by lazy { kCFNumberFormatterGroupingSize_LAYOUT.varHandle() }

var kCFNumberFormatterGroupingSize: MemorySegment
    get() = kCFNumberFormatterGroupingSize_VH.get(kCFNumberFormatterGroupingSize_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterGroupingSize_VH.set(kCFNumberFormatterGroupingSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterSecondaryGroupingSize typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterSecondaryGroupingSize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterSecondaryGroupingSize_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterSecondaryGroupingSize").orElseThrow().reinterpret(kCFNumberFormatterSecondaryGroupingSize_LAYOUT.byteSize()) }
private val kCFNumberFormatterSecondaryGroupingSize_VH: VarHandle by lazy { kCFNumberFormatterSecondaryGroupingSize_LAYOUT.varHandle() }

var kCFNumberFormatterSecondaryGroupingSize: MemorySegment
    get() = kCFNumberFormatterSecondaryGroupingSize_VH.get(kCFNumberFormatterSecondaryGroupingSize_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterSecondaryGroupingSize_VH.set(kCFNumberFormatterSecondaryGroupingSize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterRoundingMode typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterRoundingMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterRoundingMode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterRoundingMode").orElseThrow().reinterpret(kCFNumberFormatterRoundingMode_LAYOUT.byteSize()) }
private val kCFNumberFormatterRoundingMode_VH: VarHandle by lazy { kCFNumberFormatterRoundingMode_LAYOUT.varHandle() }

var kCFNumberFormatterRoundingMode: MemorySegment
    get() = kCFNumberFormatterRoundingMode_VH.get(kCFNumberFormatterRoundingMode_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterRoundingMode_VH.set(kCFNumberFormatterRoundingMode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterRoundingIncrement typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterRoundingIncrement_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterRoundingIncrement_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterRoundingIncrement").orElseThrow().reinterpret(kCFNumberFormatterRoundingIncrement_LAYOUT.byteSize()) }
private val kCFNumberFormatterRoundingIncrement_VH: VarHandle by lazy { kCFNumberFormatterRoundingIncrement_LAYOUT.varHandle() }

var kCFNumberFormatterRoundingIncrement: MemorySegment
    get() = kCFNumberFormatterRoundingIncrement_VH.get(kCFNumberFormatterRoundingIncrement_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterRoundingIncrement_VH.set(kCFNumberFormatterRoundingIncrement_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterFormatWidth typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterFormatWidth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterFormatWidth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterFormatWidth").orElseThrow().reinterpret(kCFNumberFormatterFormatWidth_LAYOUT.byteSize()) }
private val kCFNumberFormatterFormatWidth_VH: VarHandle by lazy { kCFNumberFormatterFormatWidth_LAYOUT.varHandle() }

var kCFNumberFormatterFormatWidth: MemorySegment
    get() = kCFNumberFormatterFormatWidth_VH.get(kCFNumberFormatterFormatWidth_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterFormatWidth_VH.set(kCFNumberFormatterFormatWidth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPaddingPosition typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPaddingPosition_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPaddingPosition_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPaddingPosition").orElseThrow().reinterpret(kCFNumberFormatterPaddingPosition_LAYOUT.byteSize()) }
private val kCFNumberFormatterPaddingPosition_VH: VarHandle by lazy { kCFNumberFormatterPaddingPosition_LAYOUT.varHandle() }

var kCFNumberFormatterPaddingPosition: MemorySegment
    get() = kCFNumberFormatterPaddingPosition_VH.get(kCFNumberFormatterPaddingPosition_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPaddingPosition_VH.set(kCFNumberFormatterPaddingPosition_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPaddingCharacter typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPaddingCharacter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPaddingCharacter_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPaddingCharacter").orElseThrow().reinterpret(kCFNumberFormatterPaddingCharacter_LAYOUT.byteSize()) }
private val kCFNumberFormatterPaddingCharacter_VH: VarHandle by lazy { kCFNumberFormatterPaddingCharacter_LAYOUT.varHandle() }

var kCFNumberFormatterPaddingCharacter: MemorySegment
    get() = kCFNumberFormatterPaddingCharacter_VH.get(kCFNumberFormatterPaddingCharacter_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPaddingCharacter_VH.set(kCFNumberFormatterPaddingCharacter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterDefaultFormat typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterDefaultFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterDefaultFormat_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterDefaultFormat").orElseThrow().reinterpret(kCFNumberFormatterDefaultFormat_LAYOUT.byteSize()) }
private val kCFNumberFormatterDefaultFormat_VH: VarHandle by lazy { kCFNumberFormatterDefaultFormat_LAYOUT.varHandle() }

var kCFNumberFormatterDefaultFormat: MemorySegment
    get() = kCFNumberFormatterDefaultFormat_VH.get(kCFNumberFormatterDefaultFormat_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterDefaultFormat_VH.set(kCFNumberFormatterDefaultFormat_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMultiplier typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMultiplier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMultiplier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMultiplier").orElseThrow().reinterpret(kCFNumberFormatterMultiplier_LAYOUT.byteSize()) }
private val kCFNumberFormatterMultiplier_VH: VarHandle by lazy { kCFNumberFormatterMultiplier_LAYOUT.varHandle() }

var kCFNumberFormatterMultiplier: MemorySegment
    get() = kCFNumberFormatterMultiplier_VH.get(kCFNumberFormatterMultiplier_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMultiplier_VH.set(kCFNumberFormatterMultiplier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPositivePrefix typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPositivePrefix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPositivePrefix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPositivePrefix").orElseThrow().reinterpret(kCFNumberFormatterPositivePrefix_LAYOUT.byteSize()) }
private val kCFNumberFormatterPositivePrefix_VH: VarHandle by lazy { kCFNumberFormatterPositivePrefix_LAYOUT.varHandle() }

var kCFNumberFormatterPositivePrefix: MemorySegment
    get() = kCFNumberFormatterPositivePrefix_VH.get(kCFNumberFormatterPositivePrefix_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPositivePrefix_VH.set(kCFNumberFormatterPositivePrefix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPositiveSuffix typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPositiveSuffix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPositiveSuffix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPositiveSuffix").orElseThrow().reinterpret(kCFNumberFormatterPositiveSuffix_LAYOUT.byteSize()) }
private val kCFNumberFormatterPositiveSuffix_VH: VarHandle by lazy { kCFNumberFormatterPositiveSuffix_LAYOUT.varHandle() }

var kCFNumberFormatterPositiveSuffix: MemorySegment
    get() = kCFNumberFormatterPositiveSuffix_VH.get(kCFNumberFormatterPositiveSuffix_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPositiveSuffix_VH.set(kCFNumberFormatterPositiveSuffix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterNegativePrefix typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterNegativePrefix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterNegativePrefix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterNegativePrefix").orElseThrow().reinterpret(kCFNumberFormatterNegativePrefix_LAYOUT.byteSize()) }
private val kCFNumberFormatterNegativePrefix_VH: VarHandle by lazy { kCFNumberFormatterNegativePrefix_LAYOUT.varHandle() }

var kCFNumberFormatterNegativePrefix: MemorySegment
    get() = kCFNumberFormatterNegativePrefix_VH.get(kCFNumberFormatterNegativePrefix_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterNegativePrefix_VH.set(kCFNumberFormatterNegativePrefix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterNegativeSuffix typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterNegativeSuffix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterNegativeSuffix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterNegativeSuffix").orElseThrow().reinterpret(kCFNumberFormatterNegativeSuffix_LAYOUT.byteSize()) }
private val kCFNumberFormatterNegativeSuffix_VH: VarHandle by lazy { kCFNumberFormatterNegativeSuffix_LAYOUT.varHandle() }

var kCFNumberFormatterNegativeSuffix: MemorySegment
    get() = kCFNumberFormatterNegativeSuffix_VH.get(kCFNumberFormatterNegativeSuffix_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterNegativeSuffix_VH.set(kCFNumberFormatterNegativeSuffix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterPerMillSymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterPerMillSymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterPerMillSymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterPerMillSymbol").orElseThrow().reinterpret(kCFNumberFormatterPerMillSymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterPerMillSymbol_VH: VarHandle by lazy { kCFNumberFormatterPerMillSymbol_LAYOUT.varHandle() }

var kCFNumberFormatterPerMillSymbol: MemorySegment
    get() = kCFNumberFormatterPerMillSymbol_VH.get(kCFNumberFormatterPerMillSymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterPerMillSymbol_VH.set(kCFNumberFormatterPerMillSymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterInternationalCurrencySymbol typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterInternationalCurrencySymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterInternationalCurrencySymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterInternationalCurrencySymbol").orElseThrow().reinterpret(kCFNumberFormatterInternationalCurrencySymbol_LAYOUT.byteSize()) }
private val kCFNumberFormatterInternationalCurrencySymbol_VH: VarHandle by lazy { kCFNumberFormatterInternationalCurrencySymbol_LAYOUT.varHandle() }

var kCFNumberFormatterInternationalCurrencySymbol: MemorySegment
    get() = kCFNumberFormatterInternationalCurrencySymbol_VH.get(kCFNumberFormatterInternationalCurrencySymbol_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterInternationalCurrencySymbol_VH.set(kCFNumberFormatterInternationalCurrencySymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterCurrencyGroupingSeparator typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterCurrencyGroupingSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterCurrencyGroupingSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterCurrencyGroupingSeparator").orElseThrow().reinterpret(kCFNumberFormatterCurrencyGroupingSeparator_LAYOUT.byteSize()) }
private val kCFNumberFormatterCurrencyGroupingSeparator_VH: VarHandle by lazy { kCFNumberFormatterCurrencyGroupingSeparator_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFNumberFormatterCurrencyGroupingSeparator: MemorySegment
    get() = kCFNumberFormatterCurrencyGroupingSeparator_VH.get(kCFNumberFormatterCurrencyGroupingSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterCurrencyGroupingSeparator_VH.set(kCFNumberFormatterCurrencyGroupingSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterIsLenient typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterIsLenient_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterIsLenient_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterIsLenient").orElseThrow().reinterpret(kCFNumberFormatterIsLenient_LAYOUT.byteSize()) }
private val kCFNumberFormatterIsLenient_VH: VarHandle by lazy { kCFNumberFormatterIsLenient_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFNumberFormatterIsLenient: MemorySegment
    get() = kCFNumberFormatterIsLenient_VH.get(kCFNumberFormatterIsLenient_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterIsLenient_VH.set(kCFNumberFormatterIsLenient_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterUseSignificantDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterUseSignificantDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterUseSignificantDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterUseSignificantDigits").orElseThrow().reinterpret(kCFNumberFormatterUseSignificantDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterUseSignificantDigits_VH: VarHandle by lazy { kCFNumberFormatterUseSignificantDigits_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFNumberFormatterUseSignificantDigits: MemorySegment
    get() = kCFNumberFormatterUseSignificantDigits_VH.get(kCFNumberFormatterUseSignificantDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterUseSignificantDigits_VH.set(kCFNumberFormatterUseSignificantDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMinSignificantDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMinSignificantDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMinSignificantDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMinSignificantDigits").orElseThrow().reinterpret(kCFNumberFormatterMinSignificantDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMinSignificantDigits_VH: VarHandle by lazy { kCFNumberFormatterMinSignificantDigits_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFNumberFormatterMinSignificantDigits: MemorySegment
    get() = kCFNumberFormatterMinSignificantDigits_VH.get(kCFNumberFormatterMinSignificantDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMinSignificantDigits_VH.set(kCFNumberFormatterMinSignificantDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMaxSignificantDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMaxSignificantDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMaxSignificantDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMaxSignificantDigits").orElseThrow().reinterpret(kCFNumberFormatterMaxSignificantDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMaxSignificantDigits_VH: VarHandle by lazy { kCFNumberFormatterMaxSignificantDigits_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFNumberFormatterMaxSignificantDigits: MemorySegment
    get() = kCFNumberFormatterMaxSignificantDigits_VH.get(kCFNumberFormatterMaxSignificantDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMaxSignificantDigits_VH.set(kCFNumberFormatterMaxSignificantDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFNumberFormatterMinGroupingDigits typedef const CFNumberFormatterKey = (Declared(__CFString))*
 */
private val kCFNumberFormatterMinGroupingDigits_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFNumberFormatterMinGroupingDigits_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFNumberFormatterMinGroupingDigits").orElseThrow().reinterpret(kCFNumberFormatterMinGroupingDigits_LAYOUT.byteSize()) }
private val kCFNumberFormatterMinGroupingDigits_VH: VarHandle by lazy { kCFNumberFormatterMinGroupingDigits_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFNumberFormatterMinGroupingDigits: MemorySegment
    get() = kCFNumberFormatterMinGroupingDigits_VH.get(kCFNumberFormatterMinGroupingDigits_SEGMENT, 0L) as MemorySegment
    set(value) = kCFNumberFormatterMinGroupingDigits_VH.set(kCFNumberFormatterMinGroupingDigits_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFNumberFormatterGetDecimalInfoForCurrencyCode typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,(typedef int32_t = Int)*,(Double)*)
 */
private val CFNumberFormatterGetDecimalInfoForCurrencyCode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFNumberFormatterGetDecimalInfoForCurrencyCode_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFNumberFormatterGetDecimalInfoForCurrencyCode").orElseThrow() }
private val CFNumberFormatterGetDecimalInfoForCurrencyCode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFNumberFormatterGetDecimalInfoForCurrencyCode_ADDR, CFNumberFormatterGetDecimalInfoForCurrencyCode_DESC) }

fun CFNumberFormatterGetDecimalInfoForCurrencyCode(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFNumberFormatterGetDecimalInfoForCurrencyCode_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFPreferencesAnyApplication typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPreferencesAnyApplication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPreferencesAnyApplication_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFPreferencesAnyApplication").orElseThrow().reinterpret(kCFPreferencesAnyApplication_LAYOUT.byteSize()) }
private val kCFPreferencesAnyApplication_VH: VarHandle by lazy { kCFPreferencesAnyApplication_LAYOUT.varHandle() }

var kCFPreferencesAnyApplication: MemorySegment
    get() = kCFPreferencesAnyApplication_VH.get(kCFPreferencesAnyApplication_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPreferencesAnyApplication_VH.set(kCFPreferencesAnyApplication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPreferencesCurrentApplication typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPreferencesCurrentApplication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPreferencesCurrentApplication_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFPreferencesCurrentApplication").orElseThrow().reinterpret(kCFPreferencesCurrentApplication_LAYOUT.byteSize()) }
private val kCFPreferencesCurrentApplication_VH: VarHandle by lazy { kCFPreferencesCurrentApplication_LAYOUT.varHandle() }

var kCFPreferencesCurrentApplication: MemorySegment
    get() = kCFPreferencesCurrentApplication_VH.get(kCFPreferencesCurrentApplication_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPreferencesCurrentApplication_VH.set(kCFPreferencesCurrentApplication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPreferencesAnyHost typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPreferencesAnyHost_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPreferencesAnyHost_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFPreferencesAnyHost").orElseThrow().reinterpret(kCFPreferencesAnyHost_LAYOUT.byteSize()) }
private val kCFPreferencesAnyHost_VH: VarHandle by lazy { kCFPreferencesAnyHost_LAYOUT.varHandle() }

var kCFPreferencesAnyHost: MemorySegment
    get() = kCFPreferencesAnyHost_VH.get(kCFPreferencesAnyHost_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPreferencesAnyHost_VH.set(kCFPreferencesAnyHost_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPreferencesCurrentHost typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPreferencesCurrentHost_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPreferencesCurrentHost_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFPreferencesCurrentHost").orElseThrow().reinterpret(kCFPreferencesCurrentHost_LAYOUT.byteSize()) }
private val kCFPreferencesCurrentHost_VH: VarHandle by lazy { kCFPreferencesCurrentHost_LAYOUT.varHandle() }

var kCFPreferencesCurrentHost: MemorySegment
    get() = kCFPreferencesCurrentHost_VH.get(kCFPreferencesCurrentHost_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPreferencesCurrentHost_VH.set(kCFPreferencesCurrentHost_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPreferencesAnyUser typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPreferencesAnyUser_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPreferencesAnyUser_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFPreferencesAnyUser").orElseThrow().reinterpret(kCFPreferencesAnyUser_LAYOUT.byteSize()) }
private val kCFPreferencesAnyUser_VH: VarHandle by lazy { kCFPreferencesAnyUser_LAYOUT.varHandle() }

var kCFPreferencesAnyUser: MemorySegment
    get() = kCFPreferencesAnyUser_VH.get(kCFPreferencesAnyUser_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPreferencesAnyUser_VH.set(kCFPreferencesAnyUser_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPreferencesCurrentUser typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPreferencesCurrentUser_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPreferencesCurrentUser_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFPreferencesCurrentUser").orElseThrow().reinterpret(kCFPreferencesCurrentUser_LAYOUT.byteSize()) }
private val kCFPreferencesCurrentUser_VH: VarHandle by lazy { kCFPreferencesCurrentUser_LAYOUT.varHandle() }

var kCFPreferencesCurrentUser: MemorySegment
    get() = kCFPreferencesCurrentUser_VH.get(kCFPreferencesCurrentUser_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPreferencesCurrentUser_VH.set(kCFPreferencesCurrentUser_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFPreferencesCopyAppValue typedef CFPropertyListRef = (Void)*(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesCopyAppValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesCopyAppValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesCopyAppValue").orElseThrow() }
private val CFPreferencesCopyAppValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesCopyAppValue_ADDR, CFPreferencesCopyAppValue_DESC) }

fun CFPreferencesCopyAppValue(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFPreferencesCopyAppValue_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesGetAppBooleanValue typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,(typedef Boolean = UNSIGNED = Char)*)
 */
private val CFPreferencesGetAppBooleanValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesGetAppBooleanValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesGetAppBooleanValue").orElseThrow() }
private val CFPreferencesGetAppBooleanValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesGetAppBooleanValue_ADDR, CFPreferencesGetAppBooleanValue_DESC) }

fun CFPreferencesGetAppBooleanValue(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFPreferencesGetAppBooleanValue_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesGetAppIntegerValue typedef CFIndex = Long(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,(typedef Boolean = UNSIGNED = Char)*)
 */
private val CFPreferencesGetAppIntegerValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesGetAppIntegerValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesGetAppIntegerValue").orElseThrow() }
private val CFPreferencesGetAppIntegerValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesGetAppIntegerValue_ADDR, CFPreferencesGetAppIntegerValue_DESC) }

fun CFPreferencesGetAppIntegerValue(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Long {
    try {
        return CFPreferencesGetAppIntegerValue_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesSetAppValue Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFPropertyListRef = (Void)*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesSetAppValue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesSetAppValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesSetAppValue").orElseThrow() }
private val CFPreferencesSetAppValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesSetAppValue_ADDR, CFPreferencesSetAppValue_DESC) }

fun CFPreferencesSetAppValue(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFPreferencesSetAppValue_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesAddSuitePreferencesToApp Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesAddSuitePreferencesToApp_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesAddSuitePreferencesToApp_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesAddSuitePreferencesToApp").orElseThrow() }
private val CFPreferencesAddSuitePreferencesToApp_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesAddSuitePreferencesToApp_ADDR, CFPreferencesAddSuitePreferencesToApp_DESC) }

fun CFPreferencesAddSuitePreferencesToApp(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFPreferencesAddSuitePreferencesToApp_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesRemoveSuitePreferencesFromApp Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesRemoveSuitePreferencesFromApp_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesRemoveSuitePreferencesFromApp_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesRemoveSuitePreferencesFromApp").orElseThrow() }
private val CFPreferencesRemoveSuitePreferencesFromApp_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesRemoveSuitePreferencesFromApp_ADDR, CFPreferencesRemoveSuitePreferencesFromApp_DESC) }

fun CFPreferencesRemoveSuitePreferencesFromApp(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFPreferencesRemoveSuitePreferencesFromApp_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesAppSynchronize typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesAppSynchronize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFPreferencesAppSynchronize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesAppSynchronize").orElseThrow() }
private val CFPreferencesAppSynchronize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesAppSynchronize_ADDR, CFPreferencesAppSynchronize_DESC) }

fun CFPreferencesAppSynchronize(arg0: MemorySegment): Byte {
    try {
        return CFPreferencesAppSynchronize_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesCopyValue typedef CFPropertyListRef = (Void)*(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesCopyValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesCopyValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesCopyValue").orElseThrow() }
private val CFPreferencesCopyValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesCopyValue_ADDR, CFPreferencesCopyValue_DESC) }

fun CFPreferencesCopyValue(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFPreferencesCopyValue_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesCopyMultiple typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFArrayRef = (Declared(__CFArray))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesCopyMultiple_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesCopyMultiple_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesCopyMultiple").orElseThrow() }
private val CFPreferencesCopyMultiple_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesCopyMultiple_ADDR, CFPreferencesCopyMultiple_DESC) }

fun CFPreferencesCopyMultiple(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFPreferencesCopyMultiple_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesSetValue Void(typedef CFStringRef = (Declared(__CFString))*,typedef CFPropertyListRef = (Void)*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesSetValue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesSetValue_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesSetValue").orElseThrow() }
private val CFPreferencesSetValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesSetValue_ADDR, CFPreferencesSetValue_DESC) }

fun CFPreferencesSetValue(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Unit {
    try {
        CFPreferencesSetValue_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesSetMultiple Void(typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef CFArrayRef = (Declared(__CFArray))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesSetMultiple_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesSetMultiple_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesSetMultiple").orElseThrow() }
private val CFPreferencesSetMultiple_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesSetMultiple_ADDR, CFPreferencesSetMultiple_DESC) }

fun CFPreferencesSetMultiple(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): Unit {
    try {
        CFPreferencesSetMultiple_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesSynchronize typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesSynchronize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesSynchronize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesSynchronize").orElseThrow() }
private val CFPreferencesSynchronize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesSynchronize_ADDR, CFPreferencesSynchronize_DESC) }

fun CFPreferencesSynchronize(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFPreferencesSynchronize_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesCopyApplicationList typedef CFArrayRef = (Declared(__CFArray))*(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesCopyApplicationList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesCopyApplicationList_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesCopyApplicationList").orElseThrow() }
private val CFPreferencesCopyApplicationList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesCopyApplicationList_ADDR, CFPreferencesCopyApplicationList_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Unsupported API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Unsupported API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Unsupported API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Unsupported API")
fun CFPreferencesCopyApplicationList(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFPreferencesCopyApplicationList_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesCopyKeyList typedef CFArrayRef = (Declared(__CFArray))*(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesCopyKeyList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesCopyKeyList_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesCopyKeyList").orElseThrow() }
private val CFPreferencesCopyKeyList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesCopyKeyList_ADDR, CFPreferencesCopyKeyList_DESC) }

fun CFPreferencesCopyKeyList(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFPreferencesCopyKeyList_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPreferencesAppValueIsForced typedef Boolean = UNSIGNED = Char(typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPreferencesAppValueIsForced_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPreferencesAppValueIsForced_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFPreferencesAppValueIsForced").orElseThrow() }
private val CFPreferencesAppValueIsForced_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPreferencesAppValueIsForced_ADDR, CFPreferencesAppValueIsForced_DESC) }

fun CFPreferencesAppValueIsForced(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFPreferencesAppValueIsForced_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFURLGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFURLGetTypeID_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetTypeID").orElseThrow() }
private val CFURLGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetTypeID_ADDR, CFURLGetTypeID_DESC) }

fun CFURLGetTypeID(): Long {
    try {
        return CFURLGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateWithBytes typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long,typedef CFStringEncoding = UNSIGNED = Int,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCreateWithBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFURLCreateWithBytes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateWithBytes").orElseThrow() }
private val CFURLCreateWithBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateWithBytes_ADDR, CFURLCreateWithBytes_DESC) }

fun CFURLCreateWithBytes(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Int, arg4: MemorySegment): MemorySegment {
    try {
        return CFURLCreateWithBytes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateData typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringEncoding = UNSIGNED = Int,typedef Boolean = UNSIGNED = Char)
 */
private val CFURLCreateData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)
private val CFURLCreateData_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateData").orElseThrow() }
private val CFURLCreateData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateData_ADDR, CFURLCreateData_DESC) }

fun CFURLCreateData(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: Byte): MemorySegment {
    try {
        return CFURLCreateData_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateWithString typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCreateWithString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateWithString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateWithString").orElseThrow() }
private val CFURLCreateWithString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateWithString_ADDR, CFURLCreateWithString_DESC) }

fun CFURLCreateWithString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateWithString_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateAbsoluteURLWithBytes typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long,typedef CFStringEncoding = UNSIGNED = Int,typedef CFURLRef = (Declared(__CFURL))*,typedef Boolean = UNSIGNED = Char)
 */
private val CFURLCreateAbsoluteURLWithBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
private val CFURLCreateAbsoluteURLWithBytes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateAbsoluteURLWithBytes").orElseThrow() }
private val CFURLCreateAbsoluteURLWithBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateAbsoluteURLWithBytes_ADDR, CFURLCreateAbsoluteURLWithBytes_DESC) }

fun CFURLCreateAbsoluteURLWithBytes(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Int, arg4: MemorySegment, arg5: Byte): MemorySegment {
    try {
        return CFURLCreateAbsoluteURLWithBytes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateWithFileSystemPath typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFURLPathStyle = Declared(CFURLPathStyle),typedef Boolean = UNSIGNED = Char)
 */
private val CFURLCreateWithFileSystemPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)
private val CFURLCreateWithFileSystemPath_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateWithFileSystemPath").orElseThrow() }
private val CFURLCreateWithFileSystemPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateWithFileSystemPath_ADDR, CFURLCreateWithFileSystemPath_DESC) }

fun CFURLCreateWithFileSystemPath(arg0: MemorySegment, arg1: MemorySegment, arg2: CFURLPathStyle, arg3: Byte): MemorySegment {
    try {
        return CFURLCreateWithFileSystemPath_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateFromFileSystemRepresentation typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long,typedef Boolean = UNSIGNED = Char)
 */
private val CFURLCreateFromFileSystemRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)
private val CFURLCreateFromFileSystemRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateFromFileSystemRepresentation").orElseThrow() }
private val CFURLCreateFromFileSystemRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateFromFileSystemRepresentation_ADDR, CFURLCreateFromFileSystemRepresentation_DESC) }

fun CFURLCreateFromFileSystemRepresentation(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Byte): MemorySegment {
    try {
        return CFURLCreateFromFileSystemRepresentation_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateWithFileSystemPathRelativeToBase typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFURLPathStyle = Declared(CFURLPathStyle),typedef Boolean = UNSIGNED = Char,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCreateWithFileSystemPathRelativeToBase_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLCreateWithFileSystemPathRelativeToBase_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateWithFileSystemPathRelativeToBase").orElseThrow() }
private val CFURLCreateWithFileSystemPathRelativeToBase_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateWithFileSystemPathRelativeToBase_ADDR, CFURLCreateWithFileSystemPathRelativeToBase_DESC) }

fun CFURLCreateWithFileSystemPathRelativeToBase(arg0: MemorySegment, arg1: MemorySegment, arg2: CFURLPathStyle, arg3: Byte, arg4: MemorySegment): MemorySegment {
    try {
        return CFURLCreateWithFileSystemPathRelativeToBase_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateFromFileSystemRepresentationRelativeToBase typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long,typedef Boolean = UNSIGNED = Char,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCreateFromFileSystemRepresentationRelativeToBase_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLCreateFromFileSystemRepresentationRelativeToBase_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateFromFileSystemRepresentationRelativeToBase").orElseThrow() }
private val CFURLCreateFromFileSystemRepresentationRelativeToBase_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateFromFileSystemRepresentationRelativeToBase_ADDR, CFURLCreateFromFileSystemRepresentationRelativeToBase_DESC) }

fun CFURLCreateFromFileSystemRepresentationRelativeToBase(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Byte, arg4: MemorySegment): MemorySegment {
    try {
        return CFURLCreateFromFileSystemRepresentationRelativeToBase_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetFileSystemRepresentation typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,typedef Boolean = UNSIGNED = Char,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long)
 */
private val CFURLGetFileSystemRepresentation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFURLGetFileSystemRepresentation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetFileSystemRepresentation").orElseThrow() }
private val CFURLGetFileSystemRepresentation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetFileSystemRepresentation_ADDR, CFURLGetFileSystemRepresentation_DESC) }

fun CFURLGetFileSystemRepresentation(arg0: MemorySegment, arg1: Byte, arg2: MemorySegment, arg3: Long): Byte {
    try {
        return CFURLGetFileSystemRepresentation_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyAbsoluteURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyAbsoluteURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyAbsoluteURL_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyAbsoluteURL").orElseThrow() }
private val CFURLCopyAbsoluteURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyAbsoluteURL_ADDR, CFURLCopyAbsoluteURL_DESC) }

fun CFURLCopyAbsoluteURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyAbsoluteURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetString typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLGetString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLGetString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetString").orElseThrow() }
private val CFURLGetString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetString_ADDR, CFURLGetString_DESC) }

fun CFURLGetString(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLGetString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetBaseURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLGetBaseURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLGetBaseURL_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetBaseURL").orElseThrow() }
private val CFURLGetBaseURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetBaseURL_ADDR, CFURLGetBaseURL_DESC) }

fun CFURLGetBaseURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLGetBaseURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCanBeDecomposed typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCanBeDecomposed_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLCanBeDecomposed_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCanBeDecomposed").orElseThrow() }
private val CFURLCanBeDecomposed_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCanBeDecomposed_ADDR, CFURLCanBeDecomposed_DESC) }

fun CFURLCanBeDecomposed(arg0: MemorySegment): Byte {
    try {
        return CFURLCanBeDecomposed_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyScheme typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyScheme_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyScheme_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyScheme").orElseThrow() }
private val CFURLCopyScheme_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyScheme_ADDR, CFURLCopyScheme_DESC) }

fun CFURLCopyScheme(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyScheme_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyNetLocation typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyNetLocation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyNetLocation_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyNetLocation").orElseThrow() }
private val CFURLCopyNetLocation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyNetLocation_ADDR, CFURLCopyNetLocation_DESC) }

fun CFURLCopyNetLocation(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyNetLocation_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyPath typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyPath_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyPath").orElseThrow() }
private val CFURLCopyPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyPath_ADDR, CFURLCopyPath_DESC) }

fun CFURLCopyPath(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyPath_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyStrictPath typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*,(typedef Boolean = UNSIGNED = Char)*)
 */
private val CFURLCopyStrictPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyStrictPath_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyStrictPath").orElseThrow() }
private val CFURLCopyStrictPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyStrictPath_ADDR, CFURLCopyStrictPath_DESC) }

fun CFURLCopyStrictPath(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCopyStrictPath_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyFileSystemPath typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLPathStyle = Declared(CFURLPathStyle))
 */
private val CFURLCopyFileSystemPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFURLCopyFileSystemPath_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyFileSystemPath").orElseThrow() }
private val CFURLCopyFileSystemPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyFileSystemPath_ADDR, CFURLCopyFileSystemPath_DESC) }

fun CFURLCopyFileSystemPath(arg0: MemorySegment, arg1: CFURLPathStyle): MemorySegment {
    try {
        return CFURLCopyFileSystemPath_HANDLE.invokeExact(arg0, arg1.value) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLHasDirectoryPath typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLHasDirectoryPath_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLHasDirectoryPath_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLHasDirectoryPath").orElseThrow() }
private val CFURLHasDirectoryPath_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLHasDirectoryPath_ADDR, CFURLHasDirectoryPath_DESC) }

fun CFURLHasDirectoryPath(arg0: MemorySegment): Byte {
    try {
        return CFURLHasDirectoryPath_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyResourceSpecifier typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyResourceSpecifier_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyResourceSpecifier_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyResourceSpecifier").orElseThrow() }
private val CFURLCopyResourceSpecifier_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyResourceSpecifier_ADDR, CFURLCopyResourceSpecifier_DESC) }

fun CFURLCopyResourceSpecifier(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyResourceSpecifier_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyHostName typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyHostName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyHostName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyHostName").orElseThrow() }
private val CFURLCopyHostName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyHostName_ADDR, CFURLCopyHostName_DESC) }

fun CFURLCopyHostName(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyHostName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetPortNumber typedef SInt32 = Int(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLGetPortNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFURLGetPortNumber_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetPortNumber").orElseThrow() }
private val CFURLGetPortNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetPortNumber_ADDR, CFURLGetPortNumber_DESC) }

fun CFURLGetPortNumber(arg0: MemorySegment): Int {
    try {
        return CFURLGetPortNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyUserName typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyUserName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyUserName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyUserName").orElseThrow() }
private val CFURLCopyUserName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyUserName_ADDR, CFURLCopyUserName_DESC) }

fun CFURLCopyUserName(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyUserName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyPassword typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyPassword_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyPassword_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyPassword").orElseThrow() }
private val CFURLCopyPassword_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyPassword_ADDR, CFURLCopyPassword_DESC) }

fun CFURLCopyPassword(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyPassword_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyParameterString typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFURLCopyParameterString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyParameterString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyParameterString").orElseThrow() }
private val CFURLCopyParameterString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyParameterString_ADDR, CFURLCopyParameterString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The CFURLCopyParameterString function is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, CFURLCopyParameterString will always return NULL, and the CFURLCopyPath(), CFURLCopyStrictPath(), and CFURLCopyFileSystemPath() functions will return the complete path including the semicolon separator and params component if the URL string contains them.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The CFURLCopyParameterString function is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, CFURLCopyParameterString will always return NULL, and the CFURLCopyPath(), CFURLCopyStrictPath(), and CFURLCopyFileSystemPath() functions will return the complete path including the semicolon separator and params component if the URL string contains them.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The CFURLCopyParameterString function is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, CFURLCopyParameterString will always return NULL, and the CFURLCopyPath(), CFURLCopyStrictPath(), and CFURLCopyFileSystemPath() functions will return the complete path including the semicolon separator and params component if the URL string contains them.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The CFURLCopyParameterString function is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, CFURLCopyParameterString will always return NULL, and the CFURLCopyPath(), CFURLCopyStrictPath(), and CFURLCopyFileSystemPath() functions will return the complete path including the semicolon separator and params component if the URL string contains them.")
fun CFURLCopyParameterString(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCopyParameterString_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyQueryString typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFURLCopyQueryString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyQueryString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyQueryString").orElseThrow() }
private val CFURLCopyQueryString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyQueryString_ADDR, CFURLCopyQueryString_DESC) }

fun CFURLCopyQueryString(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCopyQueryString_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyFragment typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFURLCopyFragment_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyFragment_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyFragment").orElseThrow() }
private val CFURLCopyFragment_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyFragment_ADDR, CFURLCopyFragment_DESC) }

fun CFURLCopyFragment(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCopyFragment_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyLastPathComponent typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyLastPathComponent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyLastPathComponent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyLastPathComponent").orElseThrow() }
private val CFURLCopyLastPathComponent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyLastPathComponent_ADDR, CFURLCopyLastPathComponent_DESC) }

fun CFURLCopyLastPathComponent(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyLastPathComponent_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyPathExtension typedef CFStringRef = (Declared(__CFString))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCopyPathExtension_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyPathExtension_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCopyPathExtension").orElseThrow() }
private val CFURLCopyPathExtension_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCopyPathExtension_ADDR, CFURLCopyPathExtension_DESC) }

fun CFURLCopyPathExtension(arg0: MemorySegment): MemorySegment {
    try {
        return CFURLCopyPathExtension_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateCopyAppendingPathComponent typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef Boolean = UNSIGNED = Char)
 */
private val CFURLCreateCopyAppendingPathComponent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
private val CFURLCreateCopyAppendingPathComponent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateCopyAppendingPathComponent").orElseThrow() }
private val CFURLCreateCopyAppendingPathComponent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateCopyAppendingPathComponent_ADDR, CFURLCreateCopyAppendingPathComponent_DESC) }

fun CFURLCreateCopyAppendingPathComponent(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Byte): MemorySegment {
    try {
        return CFURLCreateCopyAppendingPathComponent_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateCopyDeletingLastPathComponent typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCreateCopyDeletingLastPathComponent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateCopyDeletingLastPathComponent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateCopyDeletingLastPathComponent").orElseThrow() }
private val CFURLCreateCopyDeletingLastPathComponent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateCopyDeletingLastPathComponent_ADDR, CFURLCreateCopyDeletingLastPathComponent_DESC) }

fun CFURLCreateCopyDeletingLastPathComponent(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCreateCopyDeletingLastPathComponent_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateCopyAppendingPathExtension typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFURLCreateCopyAppendingPathExtension_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateCopyAppendingPathExtension_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateCopyAppendingPathExtension").orElseThrow() }
private val CFURLCreateCopyAppendingPathExtension_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateCopyAppendingPathExtension_ADDR, CFURLCreateCopyAppendingPathExtension_DESC) }

fun CFURLCreateCopyAppendingPathExtension(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateCopyAppendingPathExtension_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateCopyDeletingPathExtension typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLCreateCopyDeletingPathExtension_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateCopyDeletingPathExtension_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateCopyDeletingPathExtension").orElseThrow() }
private val CFURLCreateCopyDeletingPathExtension_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateCopyDeletingPathExtension_ADDR, CFURLCreateCopyDeletingPathExtension_DESC) }

fun CFURLCreateCopyDeletingPathExtension(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCreateCopyDeletingPathExtension_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetBytes typedef CFIndex = Long(typedef CFURLRef = (Declared(__CFURL))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long)
 */
private val CFURLGetBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFURLGetBytes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetBytes").orElseThrow() }
private val CFURLGetBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetBytes_ADDR, CFURLGetBytes_DESC) }

fun CFURLGetBytes(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Long {
    try {
        return CFURLGetBytes_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetByteRangeForComponent typedef CFRange = Declared(CFRange)(typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLComponentType = Declared(CFURLComponentType),(typedef CFRange = Declared(CFRange))*)
 */
private val CFURLGetByteRangeForComponent_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFURLGetByteRangeForComponent_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLGetByteRangeForComponent").orElseThrow() }
private val CFURLGetByteRangeForComponent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLGetByteRangeForComponent_ADDR, CFURLGetByteRangeForComponent_DESC) }

fun CFURLGetByteRangeForComponent(allocator: SegmentAllocator, arg0: MemorySegment, arg1: CFURLComponentType, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLGetByteRangeForComponent_HANDLE.invokeExact(allocator, arg0, arg1.value, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateStringByReplacingPercentEscapes typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFURLCreateStringByReplacingPercentEscapes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateStringByReplacingPercentEscapes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateStringByReplacingPercentEscapes").orElseThrow() }
private val CFURLCreateStringByReplacingPercentEscapes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateStringByReplacingPercentEscapes_ADDR, CFURLCreateStringByReplacingPercentEscapes_DESC) }

fun CFURLCreateStringByReplacingPercentEscapes(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateStringByReplacingPercentEscapes_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateStringByReplacingPercentEscapesUsingEncoding typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFURLCreateStringByReplacingPercentEscapesUsingEncoding_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFURLCreateStringByReplacingPercentEscapesUsingEncoding_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateStringByReplacingPercentEscapesUsingEncoding").orElseThrow() }
private val CFURLCreateStringByReplacingPercentEscapesUsingEncoding_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateStringByReplacingPercentEscapesUsingEncoding_ADDR, CFURLCreateStringByReplacingPercentEscapesUsingEncoding_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSString stringByRemovingPercentEncoding] or CFURLCreateStringByReplacingPercentEscapes() instead, which always uses the recommended UTF-8 encoding.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use [NSString stringByRemovingPercentEncoding] or CFURLCreateStringByReplacingPercentEscapes() instead, which always uses the recommended UTF-8 encoding.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSString stringByRemovingPercentEncoding] or CFURLCreateStringByReplacingPercentEscapes() instead, which always uses the recommended UTF-8 encoding.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSString stringByRemovingPercentEncoding] or CFURLCreateStringByReplacingPercentEscapes() instead, which always uses the recommended UTF-8 encoding.")
fun CFURLCreateStringByReplacingPercentEscapesUsingEncoding(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Int): MemorySegment {
    try {
        return CFURLCreateStringByReplacingPercentEscapesUsingEncoding_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateStringByAddingPercentEscapes typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringEncoding = UNSIGNED = Int)
 */
private val CFURLCreateStringByAddingPercentEscapes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFURLCreateStringByAddingPercentEscapes_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLCreateStringByAddingPercentEscapes").orElseThrow() }
private val CFURLCreateStringByAddingPercentEscapes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateStringByAddingPercentEscapes_ADDR, CFURLCreateStringByAddingPercentEscapes_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSString stringByAddingPercentEncodingWithAllowedCharacters:] instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent (since each URL component or subcomponent has different rules for what characters are valid).")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use [NSString stringByAddingPercentEncodingWithAllowedCharacters:] instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent (since each URL component or subcomponent has different rules for what characters are valid).")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSString stringByAddingPercentEncodingWithAllowedCharacters:] instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent (since each URL component or subcomponent has different rules for what characters are valid).")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use [NSString stringByAddingPercentEncodingWithAllowedCharacters:] instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent (since each URL component or subcomponent has different rules for what characters are valid).")
fun CFURLCreateStringByAddingPercentEscapes(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: Int): MemorySegment {
    try {
        return CFURLCreateStringByAddingPercentEscapes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLIsFileReferenceURL typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLIsFileReferenceURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLIsFileReferenceURL_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFURLIsFileReferenceURL").orElseThrow() }
private val CFURLIsFileReferenceURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLIsFileReferenceURL_ADDR, CFURLIsFileReferenceURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLIsFileReferenceURL(arg0: MemorySegment): Byte {
    try {
        return CFURLIsFileReferenceURL_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
