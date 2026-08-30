@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : CFURLCreateFileReferenceURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCreateFileReferenceURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateFileReferenceURL_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateFileReferenceURL").orElseThrow()
private val CFURLCreateFileReferenceURL_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateFileReferenceURL_ADDR, CFURLCreateFileReferenceURL_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateFileReferenceURL(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateFileReferenceURL_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateFilePathURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCreateFilePathURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateFilePathURL_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateFilePathURL").orElseThrow()
private val CFURLCreateFilePathURL_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateFilePathURL_ADDR, CFURLCreateFilePathURL_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateFilePathURL(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateFilePathURL_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateFromFSRef typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(Void)*)
 */
private val CFURLCreateFromFSRef_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateFromFSRef_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateFromFSRef").orElseThrow()
private val CFURLCreateFromFSRef_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateFromFSRef_ADDR, CFURLCreateFromFSRef_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
fun CFURLCreateFromFSRef(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCreateFromFSRef_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLGetFSRef typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,(Void)*)
 */
private val CFURLGetFSRef_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLGetFSRef_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLGetFSRef").orElseThrow()
private val CFURLGetFSRef_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLGetFSRef_ADDR, CFURLGetFSRef_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
fun CFURLGetFSRef(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFURLGetFSRef_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyResourcePropertyForKey typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,(Void)*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCopyResourcePropertyForKey_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyResourcePropertyForKey_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCopyResourcePropertyForKey").orElseThrow()
private val CFURLCopyResourcePropertyForKey_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCopyResourcePropertyForKey_ADDR, CFURLCopyResourcePropertyForKey_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCopyResourcePropertyForKey(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Byte {
    try {
        return CFURLCopyResourcePropertyForKey_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCopyResourcePropertiesForKeys typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFArrayRef = (Declared(__CFArray))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCopyResourcePropertiesForKeys_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCopyResourcePropertiesForKeys_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCopyResourcePropertiesForKeys").orElseThrow()
private val CFURLCopyResourcePropertiesForKeys_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCopyResourcePropertiesForKeys_ADDR, CFURLCopyResourcePropertiesForKeys_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCopyResourcePropertiesForKeys(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCopyResourcePropertiesForKeys_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLSetResourcePropertyForKey typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFTypeRef = (Void)*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLSetResourcePropertyForKey_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLSetResourcePropertyForKey_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLSetResourcePropertyForKey").orElseThrow()
private val CFURLSetResourcePropertyForKey_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLSetResourcePropertyForKey_ADDR, CFURLSetResourcePropertyForKey_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLSetResourcePropertyForKey(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Byte {
    try {
        return CFURLSetResourcePropertyForKey_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLSetResourcePropertiesForKeys typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLSetResourcePropertiesForKeys_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLSetResourcePropertiesForKeys_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLSetResourcePropertiesForKeys").orElseThrow()
private val CFURLSetResourcePropertiesForKeys_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLSetResourcePropertiesForKeys_ADDR, CFURLSetResourcePropertiesForKeys_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLSetResourcePropertiesForKeys(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFURLSetResourcePropertiesForKeys_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFURLKeysOfUnsetValuesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLKeysOfUnsetValuesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLKeysOfUnsetValuesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLKeysOfUnsetValuesKey").orElseThrow().reinterpret(kCFURLKeysOfUnsetValuesKey_LAYOUT.byteSize()) }
private val kCFURLKeysOfUnsetValuesKey_VH: VarHandle by lazy { kCFURLKeysOfUnsetValuesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLKeysOfUnsetValuesKey: MemorySegment
    get() = kCFURLKeysOfUnsetValuesKey_VH.get(kCFURLKeysOfUnsetValuesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLKeysOfUnsetValuesKey_VH.set(kCFURLKeysOfUnsetValuesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFURLClearResourcePropertyCacheForKey Void(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFURLClearResourcePropertyCacheForKey_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLClearResourcePropertyCacheForKey_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLClearResourcePropertyCacheForKey").orElseThrow()
private val CFURLClearResourcePropertyCacheForKey_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLClearResourcePropertyCacheForKey_ADDR, CFURLClearResourcePropertyCacheForKey_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLClearResourcePropertyCacheForKey(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFURLClearResourcePropertyCacheForKey_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLClearResourcePropertyCache Void(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLClearResourcePropertyCache_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFURLClearResourcePropertyCache_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLClearResourcePropertyCache").orElseThrow()
private val CFURLClearResourcePropertyCache_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLClearResourcePropertyCache_ADDR, CFURLClearResourcePropertyCache_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLClearResourcePropertyCache(arg0: MemorySegment): Unit {
    try {
        CFURLClearResourcePropertyCache_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLSetTemporaryResourcePropertyForKey Void(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFTypeRef = (Void)*)
 */
private val CFURLSetTemporaryResourcePropertyForKey_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLSetTemporaryResourcePropertyForKey_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLSetTemporaryResourcePropertyForKey").orElseThrow()
private val CFURLSetTemporaryResourcePropertyForKey_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLSetTemporaryResourcePropertyForKey_ADDR, CFURLSetTemporaryResourcePropertyForKey_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLSetTemporaryResourcePropertyForKey(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFURLSetTemporaryResourcePropertyForKey_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLResourceIsReachable typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLResourceIsReachable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLResourceIsReachable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLResourceIsReachable").orElseThrow()
private val CFURLResourceIsReachable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLResourceIsReachable_ADDR, CFURLResourceIsReachable_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLResourceIsReachable(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFURLResourceIsReachable_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFURLNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLNameKey").orElseThrow().reinterpret(kCFURLNameKey_LAYOUT.byteSize()) }
private val kCFURLNameKey_VH: VarHandle by lazy { kCFURLNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLNameKey: MemorySegment
    get() = kCFURLNameKey_VH.get(kCFURLNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLNameKey_VH.set(kCFURLNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLLocalizedNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLLocalizedNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLLocalizedNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLLocalizedNameKey").orElseThrow().reinterpret(kCFURLLocalizedNameKey_LAYOUT.byteSize()) }
private val kCFURLLocalizedNameKey_VH: VarHandle by lazy { kCFURLLocalizedNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLLocalizedNameKey: MemorySegment
    get() = kCFURLLocalizedNameKey_VH.get(kCFURLLocalizedNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLLocalizedNameKey_VH.set(kCFURLLocalizedNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsRegularFileKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsRegularFileKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsRegularFileKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsRegularFileKey").orElseThrow().reinterpret(kCFURLIsRegularFileKey_LAYOUT.byteSize()) }
private val kCFURLIsRegularFileKey_VH: VarHandle by lazy { kCFURLIsRegularFileKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsRegularFileKey: MemorySegment
    get() = kCFURLIsRegularFileKey_VH.get(kCFURLIsRegularFileKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsRegularFileKey_VH.set(kCFURLIsRegularFileKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsDirectoryKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsDirectoryKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsDirectoryKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsDirectoryKey").orElseThrow().reinterpret(kCFURLIsDirectoryKey_LAYOUT.byteSize()) }
private val kCFURLIsDirectoryKey_VH: VarHandle by lazy { kCFURLIsDirectoryKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsDirectoryKey: MemorySegment
    get() = kCFURLIsDirectoryKey_VH.get(kCFURLIsDirectoryKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsDirectoryKey_VH.set(kCFURLIsDirectoryKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsSymbolicLinkKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsSymbolicLinkKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsSymbolicLinkKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsSymbolicLinkKey").orElseThrow().reinterpret(kCFURLIsSymbolicLinkKey_LAYOUT.byteSize()) }
private val kCFURLIsSymbolicLinkKey_VH: VarHandle by lazy { kCFURLIsSymbolicLinkKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsSymbolicLinkKey: MemorySegment
    get() = kCFURLIsSymbolicLinkKey_VH.get(kCFURLIsSymbolicLinkKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsSymbolicLinkKey_VH.set(kCFURLIsSymbolicLinkKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsVolumeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsVolumeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsVolumeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsVolumeKey").orElseThrow().reinterpret(kCFURLIsVolumeKey_LAYOUT.byteSize()) }
private val kCFURLIsVolumeKey_VH: VarHandle by lazy { kCFURLIsVolumeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsVolumeKey: MemorySegment
    get() = kCFURLIsVolumeKey_VH.get(kCFURLIsVolumeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsVolumeKey_VH.set(kCFURLIsVolumeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsPackageKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsPackageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsPackageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsPackageKey").orElseThrow().reinterpret(kCFURLIsPackageKey_LAYOUT.byteSize()) }
private val kCFURLIsPackageKey_VH: VarHandle by lazy { kCFURLIsPackageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsPackageKey: MemorySegment
    get() = kCFURLIsPackageKey_VH.get(kCFURLIsPackageKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsPackageKey_VH.set(kCFURLIsPackageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsApplicationKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsApplicationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsApplicationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsApplicationKey").orElseThrow().reinterpret(kCFURLIsApplicationKey_LAYOUT.byteSize()) }
private val kCFURLIsApplicationKey_VH: VarHandle by lazy { kCFURLIsApplicationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsApplicationKey: MemorySegment
    get() = kCFURLIsApplicationKey_VH.get(kCFURLIsApplicationKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsApplicationKey_VH.set(kCFURLIsApplicationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLApplicationIsScriptableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLApplicationIsScriptableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLApplicationIsScriptableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLApplicationIsScriptableKey").orElseThrow().reinterpret(kCFURLApplicationIsScriptableKey_LAYOUT.byteSize()) }
private val kCFURLApplicationIsScriptableKey_VH: VarHandle by lazy { kCFURLApplicationIsScriptableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFURLApplicationIsScriptableKey: MemorySegment
    get() = kCFURLApplicationIsScriptableKey_VH.get(kCFURLApplicationIsScriptableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLApplicationIsScriptableKey_VH.set(kCFURLApplicationIsScriptableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsSystemImmutableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsSystemImmutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsSystemImmutableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsSystemImmutableKey").orElseThrow().reinterpret(kCFURLIsSystemImmutableKey_LAYOUT.byteSize()) }
private val kCFURLIsSystemImmutableKey_VH: VarHandle by lazy { kCFURLIsSystemImmutableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsSystemImmutableKey: MemorySegment
    get() = kCFURLIsSystemImmutableKey_VH.get(kCFURLIsSystemImmutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsSystemImmutableKey_VH.set(kCFURLIsSystemImmutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsUserImmutableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsUserImmutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsUserImmutableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsUserImmutableKey").orElseThrow().reinterpret(kCFURLIsUserImmutableKey_LAYOUT.byteSize()) }
private val kCFURLIsUserImmutableKey_VH: VarHandle by lazy { kCFURLIsUserImmutableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsUserImmutableKey: MemorySegment
    get() = kCFURLIsUserImmutableKey_VH.get(kCFURLIsUserImmutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsUserImmutableKey_VH.set(kCFURLIsUserImmutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsHiddenKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsHiddenKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsHiddenKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsHiddenKey").orElseThrow().reinterpret(kCFURLIsHiddenKey_LAYOUT.byteSize()) }
private val kCFURLIsHiddenKey_VH: VarHandle by lazy { kCFURLIsHiddenKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsHiddenKey: MemorySegment
    get() = kCFURLIsHiddenKey_VH.get(kCFURLIsHiddenKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsHiddenKey_VH.set(kCFURLIsHiddenKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLHasHiddenExtensionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLHasHiddenExtensionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLHasHiddenExtensionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLHasHiddenExtensionKey").orElseThrow().reinterpret(kCFURLHasHiddenExtensionKey_LAYOUT.byteSize()) }
private val kCFURLHasHiddenExtensionKey_VH: VarHandle by lazy { kCFURLHasHiddenExtensionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLHasHiddenExtensionKey: MemorySegment
    get() = kCFURLHasHiddenExtensionKey_VH.get(kCFURLHasHiddenExtensionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLHasHiddenExtensionKey_VH.set(kCFURLHasHiddenExtensionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLCreationDateKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLCreationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLCreationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLCreationDateKey").orElseThrow().reinterpret(kCFURLCreationDateKey_LAYOUT.byteSize()) }
private val kCFURLCreationDateKey_VH: VarHandle by lazy { kCFURLCreationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLCreationDateKey: MemorySegment
    get() = kCFURLCreationDateKey_VH.get(kCFURLCreationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLCreationDateKey_VH.set(kCFURLCreationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLContentAccessDateKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLContentAccessDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLContentAccessDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLContentAccessDateKey").orElseThrow().reinterpret(kCFURLContentAccessDateKey_LAYOUT.byteSize()) }
private val kCFURLContentAccessDateKey_VH: VarHandle by lazy { kCFURLContentAccessDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLContentAccessDateKey: MemorySegment
    get() = kCFURLContentAccessDateKey_VH.get(kCFURLContentAccessDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLContentAccessDateKey_VH.set(kCFURLContentAccessDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLContentModificationDateKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLContentModificationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLContentModificationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLContentModificationDateKey").orElseThrow().reinterpret(kCFURLContentModificationDateKey_LAYOUT.byteSize()) }
private val kCFURLContentModificationDateKey_VH: VarHandle by lazy { kCFURLContentModificationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLContentModificationDateKey: MemorySegment
    get() = kCFURLContentModificationDateKey_VH.get(kCFURLContentModificationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLContentModificationDateKey_VH.set(kCFURLContentModificationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLAttributeModificationDateKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLAttributeModificationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLAttributeModificationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLAttributeModificationDateKey").orElseThrow().reinterpret(kCFURLAttributeModificationDateKey_LAYOUT.byteSize()) }
private val kCFURLAttributeModificationDateKey_VH: VarHandle by lazy { kCFURLAttributeModificationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLAttributeModificationDateKey: MemorySegment
    get() = kCFURLAttributeModificationDateKey_VH.get(kCFURLAttributeModificationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLAttributeModificationDateKey_VH.set(kCFURLAttributeModificationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileIdentifierKey").orElseThrow().reinterpret(kCFURLFileIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLFileIdentifierKey_VH: VarHandle by lazy { kCFURLFileIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var kCFURLFileIdentifierKey: MemorySegment
    get() = kCFURLFileIdentifierKey_VH.get(kCFURLFileIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileIdentifierKey_VH.set(kCFURLFileIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileContentIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileContentIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileContentIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileContentIdentifierKey").orElseThrow().reinterpret(kCFURLFileContentIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLFileContentIdentifierKey_VH: VarHandle by lazy { kCFURLFileContentIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileContentIdentifierKey: MemorySegment
    get() = kCFURLFileContentIdentifierKey_VH.get(kCFURLFileContentIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileContentIdentifierKey_VH.set(kCFURLFileContentIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLMayShareFileContentKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLMayShareFileContentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLMayShareFileContentKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLMayShareFileContentKey").orElseThrow().reinterpret(kCFURLMayShareFileContentKey_LAYOUT.byteSize()) }
private val kCFURLMayShareFileContentKey_VH: VarHandle by lazy { kCFURLMayShareFileContentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var kCFURLMayShareFileContentKey: MemorySegment
    get() = kCFURLMayShareFileContentKey_VH.get(kCFURLMayShareFileContentKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLMayShareFileContentKey_VH.set(kCFURLMayShareFileContentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLMayHaveExtendedAttributesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLMayHaveExtendedAttributesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLMayHaveExtendedAttributesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLMayHaveExtendedAttributesKey").orElseThrow().reinterpret(kCFURLMayHaveExtendedAttributesKey_LAYOUT.byteSize()) }
private val kCFURLMayHaveExtendedAttributesKey_VH: VarHandle by lazy { kCFURLMayHaveExtendedAttributesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var kCFURLMayHaveExtendedAttributesKey: MemorySegment
    get() = kCFURLMayHaveExtendedAttributesKey_VH.get(kCFURLMayHaveExtendedAttributesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLMayHaveExtendedAttributesKey_VH.set(kCFURLMayHaveExtendedAttributesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsPurgeableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsPurgeableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsPurgeableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsPurgeableKey").orElseThrow().reinterpret(kCFURLIsPurgeableKey_LAYOUT.byteSize()) }
private val kCFURLIsPurgeableKey_VH: VarHandle by lazy { kCFURLIsPurgeableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsPurgeableKey: MemorySegment
    get() = kCFURLIsPurgeableKey_VH.get(kCFURLIsPurgeableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsPurgeableKey_VH.set(kCFURLIsPurgeableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsSparseKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsSparseKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsSparseKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsSparseKey").orElseThrow().reinterpret(kCFURLIsSparseKey_LAYOUT.byteSize()) }
private val kCFURLIsSparseKey_VH: VarHandle by lazy { kCFURLIsSparseKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsSparseKey: MemorySegment
    get() = kCFURLIsSparseKey_VH.get(kCFURLIsSparseKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsSparseKey_VH.set(kCFURLIsSparseKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLLinkCountKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLLinkCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLLinkCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLLinkCountKey").orElseThrow().reinterpret(kCFURLLinkCountKey_LAYOUT.byteSize()) }
private val kCFURLLinkCountKey_VH: VarHandle by lazy { kCFURLLinkCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLLinkCountKey: MemorySegment
    get() = kCFURLLinkCountKey_VH.get(kCFURLLinkCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLLinkCountKey_VH.set(kCFURLLinkCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLParentDirectoryURLKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLParentDirectoryURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLParentDirectoryURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLParentDirectoryURLKey").orElseThrow().reinterpret(kCFURLParentDirectoryURLKey_LAYOUT.byteSize()) }
private val kCFURLParentDirectoryURLKey_VH: VarHandle by lazy { kCFURLParentDirectoryURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLParentDirectoryURLKey: MemorySegment
    get() = kCFURLParentDirectoryURLKey_VH.get(kCFURLParentDirectoryURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLParentDirectoryURLKey_VH.set(kCFURLParentDirectoryURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeURLKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeURLKey").orElseThrow().reinterpret(kCFURLVolumeURLKey_LAYOUT.byteSize()) }
private val kCFURLVolumeURLKey_VH: VarHandle by lazy { kCFURLVolumeURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeURLKey: MemorySegment
    get() = kCFURLVolumeURLKey_VH.get(kCFURLVolumeURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeURLKey_VH.set(kCFURLVolumeURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLTypeIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLTypeIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLTypeIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLTypeIdentifierKey").orElseThrow().reinterpret(kCFURLTypeIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLTypeIdentifierKey_VH: VarHandle by lazy { kCFURLTypeIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
var kCFURLTypeIdentifierKey: MemorySegment
    get() = kCFURLTypeIdentifierKey_VH.get(kCFURLTypeIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLTypeIdentifierKey_VH.set(kCFURLTypeIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLLocalizedTypeDescriptionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLLocalizedTypeDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLLocalizedTypeDescriptionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLLocalizedTypeDescriptionKey").orElseThrow().reinterpret(kCFURLLocalizedTypeDescriptionKey_LAYOUT.byteSize()) }
private val kCFURLLocalizedTypeDescriptionKey_VH: VarHandle by lazy { kCFURLLocalizedTypeDescriptionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLLocalizedTypeDescriptionKey: MemorySegment
    get() = kCFURLLocalizedTypeDescriptionKey_VH.get(kCFURLLocalizedTypeDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLLocalizedTypeDescriptionKey_VH.set(kCFURLLocalizedTypeDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLLabelNumberKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLLabelNumberKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLLabelNumberKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLLabelNumberKey").orElseThrow().reinterpret(kCFURLLabelNumberKey_LAYOUT.byteSize()) }
private val kCFURLLabelNumberKey_VH: VarHandle by lazy { kCFURLLabelNumberKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLLabelNumberKey: MemorySegment
    get() = kCFURLLabelNumberKey_VH.get(kCFURLLabelNumberKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLLabelNumberKey_VH.set(kCFURLLabelNumberKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLLabelColorKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLLabelColorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLLabelColorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLLabelColorKey").orElseThrow().reinterpret(kCFURLLabelColorKey_LAYOUT.byteSize()) }
private val kCFURLLabelColorKey_VH: VarHandle by lazy { kCFURLLabelColorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLLabelColorKey")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "Use NSURLLabelColorKey")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLLabelColorKey")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 3, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLLabelColorKey")
var kCFURLLabelColorKey: MemorySegment
    get() = kCFURLLabelColorKey_VH.get(kCFURLLabelColorKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLLabelColorKey_VH.set(kCFURLLabelColorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLLocalizedLabelKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLLocalizedLabelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLLocalizedLabelKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLLocalizedLabelKey").orElseThrow().reinterpret(kCFURLLocalizedLabelKey_LAYOUT.byteSize()) }
private val kCFURLLocalizedLabelKey_VH: VarHandle by lazy { kCFURLLocalizedLabelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLLocalizedLabelKey: MemorySegment
    get() = kCFURLLocalizedLabelKey_VH.get(kCFURLLocalizedLabelKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLLocalizedLabelKey_VH.set(kCFURLLocalizedLabelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLEffectiveIconKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLEffectiveIconKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLEffectiveIconKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLEffectiveIconKey").orElseThrow().reinterpret(kCFURLEffectiveIconKey_LAYOUT.byteSize()) }
private val kCFURLEffectiveIconKey_VH: VarHandle by lazy { kCFURLEffectiveIconKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLEffectiveIconKey")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "Use NSURLEffectiveIconKey")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLEffectiveIconKey")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 3, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLEffectiveIconKey")
var kCFURLEffectiveIconKey: MemorySegment
    get() = kCFURLEffectiveIconKey_VH.get(kCFURLEffectiveIconKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLEffectiveIconKey_VH.set(kCFURLEffectiveIconKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLCustomIconKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLCustomIconKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLCustomIconKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLCustomIconKey").orElseThrow().reinterpret(kCFURLCustomIconKey_LAYOUT.byteSize()) }
private val kCFURLCustomIconKey_VH: VarHandle by lazy { kCFURLCustomIconKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLCustomIconKey")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "Use NSURLCustomIconKey")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLCustomIconKey")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 3, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSURLCustomIconKey")
var kCFURLCustomIconKey: MemorySegment
    get() = kCFURLCustomIconKey_VH.get(kCFURLCustomIconKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLCustomIconKey_VH.set(kCFURLCustomIconKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceIdentifierKey").orElseThrow().reinterpret(kCFURLFileResourceIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLFileResourceIdentifierKey_VH: VarHandle by lazy { kCFURLFileResourceIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceIdentifierKey: MemorySegment
    get() = kCFURLFileResourceIdentifierKey_VH.get(kCFURLFileResourceIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceIdentifierKey_VH.set(kCFURLFileResourceIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIdentifierKey").orElseThrow().reinterpret(kCFURLVolumeIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIdentifierKey_VH: VarHandle by lazy { kCFURLVolumeIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIdentifierKey: MemorySegment
    get() = kCFURLVolumeIdentifierKey_VH.get(kCFURLVolumeIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIdentifierKey_VH.set(kCFURLVolumeIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLPreferredIOBlockSizeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLPreferredIOBlockSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLPreferredIOBlockSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLPreferredIOBlockSizeKey").orElseThrow().reinterpret(kCFURLPreferredIOBlockSizeKey_LAYOUT.byteSize()) }
private val kCFURLPreferredIOBlockSizeKey_VH: VarHandle by lazy { kCFURLPreferredIOBlockSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLPreferredIOBlockSizeKey: MemorySegment
    get() = kCFURLPreferredIOBlockSizeKey_VH.get(kCFURLPreferredIOBlockSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLPreferredIOBlockSizeKey_VH.set(kCFURLPreferredIOBlockSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsReadableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsReadableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsReadableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsReadableKey").orElseThrow().reinterpret(kCFURLIsReadableKey_LAYOUT.byteSize()) }
private val kCFURLIsReadableKey_VH: VarHandle by lazy { kCFURLIsReadableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsReadableKey: MemorySegment
    get() = kCFURLIsReadableKey_VH.get(kCFURLIsReadableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsReadableKey_VH.set(kCFURLIsReadableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsWritableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsWritableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsWritableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsWritableKey").orElseThrow().reinterpret(kCFURLIsWritableKey_LAYOUT.byteSize()) }
private val kCFURLIsWritableKey_VH: VarHandle by lazy { kCFURLIsWritableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsWritableKey: MemorySegment
    get() = kCFURLIsWritableKey_VH.get(kCFURLIsWritableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsWritableKey_VH.set(kCFURLIsWritableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsExecutableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsExecutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsExecutableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsExecutableKey").orElseThrow().reinterpret(kCFURLIsExecutableKey_LAYOUT.byteSize()) }
private val kCFURLIsExecutableKey_VH: VarHandle by lazy { kCFURLIsExecutableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsExecutableKey: MemorySegment
    get() = kCFURLIsExecutableKey_VH.get(kCFURLIsExecutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsExecutableKey_VH.set(kCFURLIsExecutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileSecurityKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileSecurityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileSecurityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileSecurityKey").orElseThrow().reinterpret(kCFURLFileSecurityKey_LAYOUT.byteSize()) }
private val kCFURLFileSecurityKey_VH: VarHandle by lazy { kCFURLFileSecurityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileSecurityKey: MemorySegment
    get() = kCFURLFileSecurityKey_VH.get(kCFURLFileSecurityKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileSecurityKey_VH.set(kCFURLFileSecurityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsExcludedFromBackupKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsExcludedFromBackupKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsExcludedFromBackupKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsExcludedFromBackupKey").orElseThrow().reinterpret(kCFURLIsExcludedFromBackupKey_LAYOUT.byteSize()) }
private val kCFURLIsExcludedFromBackupKey_VH: VarHandle by lazy { kCFURLIsExcludedFromBackupKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsExcludedFromBackupKey: MemorySegment
    get() = kCFURLIsExcludedFromBackupKey_VH.get(kCFURLIsExcludedFromBackupKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsExcludedFromBackupKey_VH.set(kCFURLIsExcludedFromBackupKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLTagNamesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLTagNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLTagNamesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLTagNamesKey").orElseThrow().reinterpret(kCFURLTagNamesKey_LAYOUT.byteSize()) }
private val kCFURLTagNamesKey_VH: VarHandle by lazy { kCFURLTagNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFURLTagNamesKey: MemorySegment
    get() = kCFURLTagNamesKey_VH.get(kCFURLTagNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLTagNamesKey_VH.set(kCFURLTagNamesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLPathKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLPathKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLPathKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLPathKey").orElseThrow().reinterpret(kCFURLPathKey_LAYOUT.byteSize()) }
private val kCFURLPathKey_VH: VarHandle by lazy { kCFURLPathKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLPathKey: MemorySegment
    get() = kCFURLPathKey_VH.get(kCFURLPathKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLPathKey_VH.set(kCFURLPathKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLCanonicalPathKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLCanonicalPathKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLCanonicalPathKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLCanonicalPathKey").orElseThrow().reinterpret(kCFURLCanonicalPathKey_LAYOUT.byteSize()) }
private val kCFURLCanonicalPathKey_VH: VarHandle by lazy { kCFURLCanonicalPathKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLCanonicalPathKey: MemorySegment
    get() = kCFURLCanonicalPathKey_VH.get(kCFURLCanonicalPathKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLCanonicalPathKey_VH.set(kCFURLCanonicalPathKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsMountTriggerKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsMountTriggerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsMountTriggerKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsMountTriggerKey").orElseThrow().reinterpret(kCFURLIsMountTriggerKey_LAYOUT.byteSize()) }
private val kCFURLIsMountTriggerKey_VH: VarHandle by lazy { kCFURLIsMountTriggerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsMountTriggerKey: MemorySegment
    get() = kCFURLIsMountTriggerKey_VH.get(kCFURLIsMountTriggerKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsMountTriggerKey_VH.set(kCFURLIsMountTriggerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLGenerationIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLGenerationIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLGenerationIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLGenerationIdentifierKey").orElseThrow().reinterpret(kCFURLGenerationIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLGenerationIdentifierKey_VH: VarHandle by lazy { kCFURLGenerationIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLGenerationIdentifierKey: MemorySegment
    get() = kCFURLGenerationIdentifierKey_VH.get(kCFURLGenerationIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLGenerationIdentifierKey_VH.set(kCFURLGenerationIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLDocumentIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLDocumentIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLDocumentIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLDocumentIdentifierKey").orElseThrow().reinterpret(kCFURLDocumentIdentifierKey_LAYOUT.byteSize()) }
private val kCFURLDocumentIdentifierKey_VH: VarHandle by lazy { kCFURLDocumentIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLDocumentIdentifierKey: MemorySegment
    get() = kCFURLDocumentIdentifierKey_VH.get(kCFURLDocumentIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLDocumentIdentifierKey_VH.set(kCFURLDocumentIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLAddedToDirectoryDateKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLAddedToDirectoryDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLAddedToDirectoryDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLAddedToDirectoryDateKey").orElseThrow().reinterpret(kCFURLAddedToDirectoryDateKey_LAYOUT.byteSize()) }
private val kCFURLAddedToDirectoryDateKey_VH: VarHandle by lazy { kCFURLAddedToDirectoryDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLAddedToDirectoryDateKey: MemorySegment
    get() = kCFURLAddedToDirectoryDateKey_VH.get(kCFURLAddedToDirectoryDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLAddedToDirectoryDateKey_VH.set(kCFURLAddedToDirectoryDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLQuarantinePropertiesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLQuarantinePropertiesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLQuarantinePropertiesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLQuarantinePropertiesKey").orElseThrow().reinterpret(kCFURLQuarantinePropertiesKey_LAYOUT.byteSize()) }
private val kCFURLQuarantinePropertiesKey_VH: VarHandle by lazy { kCFURLQuarantinePropertiesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFURLQuarantinePropertiesKey: MemorySegment
    get() = kCFURLQuarantinePropertiesKey_VH.get(kCFURLQuarantinePropertiesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLQuarantinePropertiesKey_VH.set(kCFURLQuarantinePropertiesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeKey").orElseThrow().reinterpret(kCFURLFileResourceTypeKey_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeKey_VH: VarHandle by lazy { kCFURLFileResourceTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeKey: MemorySegment
    get() = kCFURLFileResourceTypeKey_VH.get(kCFURLFileResourceTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeKey_VH.set(kCFURLFileResourceTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeNamedPipe typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeNamedPipe_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeNamedPipe_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeNamedPipe").orElseThrow().reinterpret(kCFURLFileResourceTypeNamedPipe_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeNamedPipe_VH: VarHandle by lazy { kCFURLFileResourceTypeNamedPipe_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeNamedPipe: MemorySegment
    get() = kCFURLFileResourceTypeNamedPipe_VH.get(kCFURLFileResourceTypeNamedPipe_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeNamedPipe_VH.set(kCFURLFileResourceTypeNamedPipe_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeCharacterSpecial typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeCharacterSpecial_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeCharacterSpecial_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeCharacterSpecial").orElseThrow().reinterpret(kCFURLFileResourceTypeCharacterSpecial_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeCharacterSpecial_VH: VarHandle by lazy { kCFURLFileResourceTypeCharacterSpecial_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeCharacterSpecial: MemorySegment
    get() = kCFURLFileResourceTypeCharacterSpecial_VH.get(kCFURLFileResourceTypeCharacterSpecial_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeCharacterSpecial_VH.set(kCFURLFileResourceTypeCharacterSpecial_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeDirectory typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeDirectory_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeDirectory_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeDirectory").orElseThrow().reinterpret(kCFURLFileResourceTypeDirectory_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeDirectory_VH: VarHandle by lazy { kCFURLFileResourceTypeDirectory_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeDirectory: MemorySegment
    get() = kCFURLFileResourceTypeDirectory_VH.get(kCFURLFileResourceTypeDirectory_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeDirectory_VH.set(kCFURLFileResourceTypeDirectory_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeBlockSpecial typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeBlockSpecial_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeBlockSpecial_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeBlockSpecial").orElseThrow().reinterpret(kCFURLFileResourceTypeBlockSpecial_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeBlockSpecial_VH: VarHandle by lazy { kCFURLFileResourceTypeBlockSpecial_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeBlockSpecial: MemorySegment
    get() = kCFURLFileResourceTypeBlockSpecial_VH.get(kCFURLFileResourceTypeBlockSpecial_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeBlockSpecial_VH.set(kCFURLFileResourceTypeBlockSpecial_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeRegular typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeRegular_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeRegular_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeRegular").orElseThrow().reinterpret(kCFURLFileResourceTypeRegular_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeRegular_VH: VarHandle by lazy { kCFURLFileResourceTypeRegular_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeRegular: MemorySegment
    get() = kCFURLFileResourceTypeRegular_VH.get(kCFURLFileResourceTypeRegular_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeRegular_VH.set(kCFURLFileResourceTypeRegular_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeSymbolicLink typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeSymbolicLink_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeSymbolicLink_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeSymbolicLink").orElseThrow().reinterpret(kCFURLFileResourceTypeSymbolicLink_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeSymbolicLink_VH: VarHandle by lazy { kCFURLFileResourceTypeSymbolicLink_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeSymbolicLink: MemorySegment
    get() = kCFURLFileResourceTypeSymbolicLink_VH.get(kCFURLFileResourceTypeSymbolicLink_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeSymbolicLink_VH.set(kCFURLFileResourceTypeSymbolicLink_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeSocket typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeSocket_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeSocket_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeSocket").orElseThrow().reinterpret(kCFURLFileResourceTypeSocket_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeSocket_VH: VarHandle by lazy { kCFURLFileResourceTypeSocket_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeSocket: MemorySegment
    get() = kCFURLFileResourceTypeSocket_VH.get(kCFURLFileResourceTypeSocket_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeSocket_VH.set(kCFURLFileResourceTypeSocket_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileResourceTypeUnknown typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileResourceTypeUnknown_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileResourceTypeUnknown_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileResourceTypeUnknown").orElseThrow().reinterpret(kCFURLFileResourceTypeUnknown_LAYOUT.byteSize()) }
private val kCFURLFileResourceTypeUnknown_VH: VarHandle by lazy { kCFURLFileResourceTypeUnknown_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileResourceTypeUnknown: MemorySegment
    get() = kCFURLFileResourceTypeUnknown_VH.get(kCFURLFileResourceTypeUnknown_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileResourceTypeUnknown_VH.set(kCFURLFileResourceTypeUnknown_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileSizeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileSizeKey").orElseThrow().reinterpret(kCFURLFileSizeKey_LAYOUT.byteSize()) }
private val kCFURLFileSizeKey_VH: VarHandle by lazy { kCFURLFileSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileSizeKey: MemorySegment
    get() = kCFURLFileSizeKey_VH.get(kCFURLFileSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileSizeKey_VH.set(kCFURLFileSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileAllocatedSizeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileAllocatedSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileAllocatedSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileAllocatedSizeKey").orElseThrow().reinterpret(kCFURLFileAllocatedSizeKey_LAYOUT.byteSize()) }
private val kCFURLFileAllocatedSizeKey_VH: VarHandle by lazy { kCFURLFileAllocatedSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileAllocatedSizeKey: MemorySegment
    get() = kCFURLFileAllocatedSizeKey_VH.get(kCFURLFileAllocatedSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileAllocatedSizeKey_VH.set(kCFURLFileAllocatedSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLTotalFileSizeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLTotalFileSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLTotalFileSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLTotalFileSizeKey").orElseThrow().reinterpret(kCFURLTotalFileSizeKey_LAYOUT.byteSize()) }
private val kCFURLTotalFileSizeKey_VH: VarHandle by lazy { kCFURLTotalFileSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLTotalFileSizeKey: MemorySegment
    get() = kCFURLTotalFileSizeKey_VH.get(kCFURLTotalFileSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLTotalFileSizeKey_VH.set(kCFURLTotalFileSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLTotalFileAllocatedSizeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLTotalFileAllocatedSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLTotalFileAllocatedSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLTotalFileAllocatedSizeKey").orElseThrow().reinterpret(kCFURLTotalFileAllocatedSizeKey_LAYOUT.byteSize()) }
private val kCFURLTotalFileAllocatedSizeKey_VH: VarHandle by lazy { kCFURLTotalFileAllocatedSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLTotalFileAllocatedSizeKey: MemorySegment
    get() = kCFURLTotalFileAllocatedSizeKey_VH.get(kCFURLTotalFileAllocatedSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLTotalFileAllocatedSizeKey_VH.set(kCFURLTotalFileAllocatedSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsAliasFileKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsAliasFileKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsAliasFileKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsAliasFileKey").orElseThrow().reinterpret(kCFURLIsAliasFileKey_LAYOUT.byteSize()) }
private val kCFURLIsAliasFileKey_VH: VarHandle by lazy { kCFURLIsAliasFileKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsAliasFileKey: MemorySegment
    get() = kCFURLIsAliasFileKey_VH.get(kCFURLIsAliasFileKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsAliasFileKey_VH.set(kCFURLIsAliasFileKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileProtectionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileProtectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileProtectionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileProtectionKey").orElseThrow().reinterpret(kCFURLFileProtectionKey_LAYOUT.byteSize()) }
private val kCFURLFileProtectionKey_VH: VarHandle by lazy { kCFURLFileProtectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileProtectionKey: MemorySegment
    get() = kCFURLFileProtectionKey_VH.get(kCFURLFileProtectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileProtectionKey_VH.set(kCFURLFileProtectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileProtectionNone typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileProtectionNone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileProtectionNone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileProtectionNone").orElseThrow().reinterpret(kCFURLFileProtectionNone_LAYOUT.byteSize()) }
private val kCFURLFileProtectionNone_VH: VarHandle by lazy { kCFURLFileProtectionNone_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileProtectionNone: MemorySegment
    get() = kCFURLFileProtectionNone_VH.get(kCFURLFileProtectionNone_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileProtectionNone_VH.set(kCFURLFileProtectionNone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileProtectionComplete typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileProtectionComplete_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileProtectionComplete_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileProtectionComplete").orElseThrow().reinterpret(kCFURLFileProtectionComplete_LAYOUT.byteSize()) }
private val kCFURLFileProtectionComplete_VH: VarHandle by lazy { kCFURLFileProtectionComplete_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileProtectionComplete: MemorySegment
    get() = kCFURLFileProtectionComplete_VH.get(kCFURLFileProtectionComplete_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileProtectionComplete_VH.set(kCFURLFileProtectionComplete_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileProtectionCompleteUnlessOpen typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileProtectionCompleteUnlessOpen_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileProtectionCompleteUnlessOpen_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileProtectionCompleteUnlessOpen").orElseThrow().reinterpret(kCFURLFileProtectionCompleteUnlessOpen_LAYOUT.byteSize()) }
private val kCFURLFileProtectionCompleteUnlessOpen_VH: VarHandle by lazy { kCFURLFileProtectionCompleteUnlessOpen_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileProtectionCompleteUnlessOpen: MemorySegment
    get() = kCFURLFileProtectionCompleteUnlessOpen_VH.get(kCFURLFileProtectionCompleteUnlessOpen_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileProtectionCompleteUnlessOpen_VH.set(kCFURLFileProtectionCompleteUnlessOpen_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileProtectionCompleteUntilFirstUserAuthentication typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileProtectionCompleteUntilFirstUserAuthentication").orElseThrow().reinterpret(kCFURLFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT.byteSize()) }
private val kCFURLFileProtectionCompleteUntilFirstUserAuthentication_VH: VarHandle by lazy { kCFURLFileProtectionCompleteUntilFirstUserAuthentication_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileProtectionCompleteUntilFirstUserAuthentication: MemorySegment
    get() = kCFURLFileProtectionCompleteUntilFirstUserAuthentication_VH.get(kCFURLFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileProtectionCompleteUntilFirstUserAuthentication_VH.set(kCFURLFileProtectionCompleteUntilFirstUserAuthentication_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileProtectionCompleteWhenUserInactive typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileProtectionCompleteWhenUserInactive_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileProtectionCompleteWhenUserInactive_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLFileProtectionCompleteWhenUserInactive").orElseThrow().reinterpret(kCFURLFileProtectionCompleteWhenUserInactive_LAYOUT.byteSize()) }
private val kCFURLFileProtectionCompleteWhenUserInactive_VH: VarHandle by lazy { kCFURLFileProtectionCompleteWhenUserInactive_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var kCFURLFileProtectionCompleteWhenUserInactive: MemorySegment
    get() = kCFURLFileProtectionCompleteWhenUserInactive_VH.get(kCFURLFileProtectionCompleteWhenUserInactive_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileProtectionCompleteWhenUserInactive_VH.set(kCFURLFileProtectionCompleteWhenUserInactive_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLDirectoryEntryCountKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLDirectoryEntryCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLDirectoryEntryCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLDirectoryEntryCountKey").orElseThrow().reinterpret(kCFURLDirectoryEntryCountKey_LAYOUT.byteSize()) }
private val kCFURLDirectoryEntryCountKey_VH: VarHandle by lazy { kCFURLDirectoryEntryCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var kCFURLDirectoryEntryCountKey: MemorySegment
    get() = kCFURLDirectoryEntryCountKey_VH.get(kCFURLDirectoryEntryCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLDirectoryEntryCountKey_VH.set(kCFURLDirectoryEntryCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeLocalizedFormatDescriptionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeLocalizedFormatDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeLocalizedFormatDescriptionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeLocalizedFormatDescriptionKey").orElseThrow().reinterpret(kCFURLVolumeLocalizedFormatDescriptionKey_LAYOUT.byteSize()) }
private val kCFURLVolumeLocalizedFormatDescriptionKey_VH: VarHandle by lazy { kCFURLVolumeLocalizedFormatDescriptionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeLocalizedFormatDescriptionKey: MemorySegment
    get() = kCFURLVolumeLocalizedFormatDescriptionKey_VH.get(kCFURLVolumeLocalizedFormatDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeLocalizedFormatDescriptionKey_VH.set(kCFURLVolumeLocalizedFormatDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeTotalCapacityKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeTotalCapacityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeTotalCapacityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeTotalCapacityKey").orElseThrow().reinterpret(kCFURLVolumeTotalCapacityKey_LAYOUT.byteSize()) }
private val kCFURLVolumeTotalCapacityKey_VH: VarHandle by lazy { kCFURLVolumeTotalCapacityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeTotalCapacityKey: MemorySegment
    get() = kCFURLVolumeTotalCapacityKey_VH.get(kCFURLVolumeTotalCapacityKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeTotalCapacityKey_VH.set(kCFURLVolumeTotalCapacityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeAvailableCapacityKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeAvailableCapacityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeAvailableCapacityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeAvailableCapacityKey").orElseThrow().reinterpret(kCFURLVolumeAvailableCapacityKey_LAYOUT.byteSize()) }
private val kCFURLVolumeAvailableCapacityKey_VH: VarHandle by lazy { kCFURLVolumeAvailableCapacityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeAvailableCapacityKey: MemorySegment
    get() = kCFURLVolumeAvailableCapacityKey_VH.get(kCFURLVolumeAvailableCapacityKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeAvailableCapacityKey_VH.set(kCFURLVolumeAvailableCapacityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeAvailableCapacityForImportantUsageKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeAvailableCapacityForImportantUsageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeAvailableCapacityForImportantUsageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeAvailableCapacityForImportantUsageKey").orElseThrow().reinterpret(kCFURLVolumeAvailableCapacityForImportantUsageKey_LAYOUT.byteSize()) }
private val kCFURLVolumeAvailableCapacityForImportantUsageKey_VH: VarHandle by lazy { kCFURLVolumeAvailableCapacityForImportantUsageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFURLVolumeAvailableCapacityForImportantUsageKey: MemorySegment
    get() = kCFURLVolumeAvailableCapacityForImportantUsageKey_VH.get(kCFURLVolumeAvailableCapacityForImportantUsageKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeAvailableCapacityForImportantUsageKey_VH.set(kCFURLVolumeAvailableCapacityForImportantUsageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeAvailableCapacityForOpportunisticUsageKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeAvailableCapacityForOpportunisticUsageKey").orElseThrow().reinterpret(kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_LAYOUT.byteSize()) }
private val kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_VH: VarHandle by lazy { kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFURLVolumeAvailableCapacityForOpportunisticUsageKey: MemorySegment
    get() = kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_VH.get(kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_VH.set(kCFURLVolumeAvailableCapacityForOpportunisticUsageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeResourceCountKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeResourceCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeResourceCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeResourceCountKey").orElseThrow().reinterpret(kCFURLVolumeResourceCountKey_LAYOUT.byteSize()) }
private val kCFURLVolumeResourceCountKey_VH: VarHandle by lazy { kCFURLVolumeResourceCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeResourceCountKey: MemorySegment
    get() = kCFURLVolumeResourceCountKey_VH.get(kCFURLVolumeResourceCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeResourceCountKey_VH.set(kCFURLVolumeResourceCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsPersistentIDsKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsPersistentIDsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsPersistentIDsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsPersistentIDsKey").orElseThrow().reinterpret(kCFURLVolumeSupportsPersistentIDsKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsPersistentIDsKey_VH: VarHandle by lazy { kCFURLVolumeSupportsPersistentIDsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsPersistentIDsKey: MemorySegment
    get() = kCFURLVolumeSupportsPersistentIDsKey_VH.get(kCFURLVolumeSupportsPersistentIDsKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsPersistentIDsKey_VH.set(kCFURLVolumeSupportsPersistentIDsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsSymbolicLinksKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsSymbolicLinksKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsSymbolicLinksKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsSymbolicLinksKey").orElseThrow().reinterpret(kCFURLVolumeSupportsSymbolicLinksKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsSymbolicLinksKey_VH: VarHandle by lazy { kCFURLVolumeSupportsSymbolicLinksKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsSymbolicLinksKey: MemorySegment
    get() = kCFURLVolumeSupportsSymbolicLinksKey_VH.get(kCFURLVolumeSupportsSymbolicLinksKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsSymbolicLinksKey_VH.set(kCFURLVolumeSupportsSymbolicLinksKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsHardLinksKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsHardLinksKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsHardLinksKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsHardLinksKey").orElseThrow().reinterpret(kCFURLVolumeSupportsHardLinksKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsHardLinksKey_VH: VarHandle by lazy { kCFURLVolumeSupportsHardLinksKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsHardLinksKey: MemorySegment
    get() = kCFURLVolumeSupportsHardLinksKey_VH.get(kCFURLVolumeSupportsHardLinksKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsHardLinksKey_VH.set(kCFURLVolumeSupportsHardLinksKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsJournalingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsJournalingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsJournalingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsJournalingKey").orElseThrow().reinterpret(kCFURLVolumeSupportsJournalingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsJournalingKey_VH: VarHandle by lazy { kCFURLVolumeSupportsJournalingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsJournalingKey: MemorySegment
    get() = kCFURLVolumeSupportsJournalingKey_VH.get(kCFURLVolumeSupportsJournalingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsJournalingKey_VH.set(kCFURLVolumeSupportsJournalingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsJournalingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsJournalingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsJournalingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsJournalingKey").orElseThrow().reinterpret(kCFURLVolumeIsJournalingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsJournalingKey_VH: VarHandle by lazy { kCFURLVolumeIsJournalingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsJournalingKey: MemorySegment
    get() = kCFURLVolumeIsJournalingKey_VH.get(kCFURLVolumeIsJournalingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsJournalingKey_VH.set(kCFURLVolumeIsJournalingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsSparseFilesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsSparseFilesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsSparseFilesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsSparseFilesKey").orElseThrow().reinterpret(kCFURLVolumeSupportsSparseFilesKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsSparseFilesKey_VH: VarHandle by lazy { kCFURLVolumeSupportsSparseFilesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsSparseFilesKey: MemorySegment
    get() = kCFURLVolumeSupportsSparseFilesKey_VH.get(kCFURLVolumeSupportsSparseFilesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsSparseFilesKey_VH.set(kCFURLVolumeSupportsSparseFilesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsZeroRunsKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsZeroRunsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsZeroRunsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsZeroRunsKey").orElseThrow().reinterpret(kCFURLVolumeSupportsZeroRunsKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsZeroRunsKey_VH: VarHandle by lazy { kCFURLVolumeSupportsZeroRunsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsZeroRunsKey: MemorySegment
    get() = kCFURLVolumeSupportsZeroRunsKey_VH.get(kCFURLVolumeSupportsZeroRunsKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsZeroRunsKey_VH.set(kCFURLVolumeSupportsZeroRunsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsCaseSensitiveNamesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsCaseSensitiveNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsCaseSensitiveNamesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsCaseSensitiveNamesKey").orElseThrow().reinterpret(kCFURLVolumeSupportsCaseSensitiveNamesKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsCaseSensitiveNamesKey_VH: VarHandle by lazy { kCFURLVolumeSupportsCaseSensitiveNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsCaseSensitiveNamesKey: MemorySegment
    get() = kCFURLVolumeSupportsCaseSensitiveNamesKey_VH.get(kCFURLVolumeSupportsCaseSensitiveNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsCaseSensitiveNamesKey_VH.set(kCFURLVolumeSupportsCaseSensitiveNamesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsCasePreservedNamesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsCasePreservedNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsCasePreservedNamesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsCasePreservedNamesKey").orElseThrow().reinterpret(kCFURLVolumeSupportsCasePreservedNamesKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsCasePreservedNamesKey_VH: VarHandle by lazy { kCFURLVolumeSupportsCasePreservedNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsCasePreservedNamesKey: MemorySegment
    get() = kCFURLVolumeSupportsCasePreservedNamesKey_VH.get(kCFURLVolumeSupportsCasePreservedNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsCasePreservedNamesKey_VH.set(kCFURLVolumeSupportsCasePreservedNamesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsRootDirectoryDatesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsRootDirectoryDatesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsRootDirectoryDatesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsRootDirectoryDatesKey").orElseThrow().reinterpret(kCFURLVolumeSupportsRootDirectoryDatesKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsRootDirectoryDatesKey_VH: VarHandle by lazy { kCFURLVolumeSupportsRootDirectoryDatesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsRootDirectoryDatesKey: MemorySegment
    get() = kCFURLVolumeSupportsRootDirectoryDatesKey_VH.get(kCFURLVolumeSupportsRootDirectoryDatesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsRootDirectoryDatesKey_VH.set(kCFURLVolumeSupportsRootDirectoryDatesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsVolumeSizesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsVolumeSizesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsVolumeSizesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsVolumeSizesKey").orElseThrow().reinterpret(kCFURLVolumeSupportsVolumeSizesKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsVolumeSizesKey_VH: VarHandle by lazy { kCFURLVolumeSupportsVolumeSizesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsVolumeSizesKey: MemorySegment
    get() = kCFURLVolumeSupportsVolumeSizesKey_VH.get(kCFURLVolumeSupportsVolumeSizesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsVolumeSizesKey_VH.set(kCFURLVolumeSupportsVolumeSizesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsRenamingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsRenamingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsRenamingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsRenamingKey").orElseThrow().reinterpret(kCFURLVolumeSupportsRenamingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsRenamingKey_VH: VarHandle by lazy { kCFURLVolumeSupportsRenamingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsRenamingKey: MemorySegment
    get() = kCFURLVolumeSupportsRenamingKey_VH.get(kCFURLVolumeSupportsRenamingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsRenamingKey_VH.set(kCFURLVolumeSupportsRenamingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsAdvisoryFileLockingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsAdvisoryFileLockingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsAdvisoryFileLockingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsAdvisoryFileLockingKey").orElseThrow().reinterpret(kCFURLVolumeSupportsAdvisoryFileLockingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsAdvisoryFileLockingKey_VH: VarHandle by lazy { kCFURLVolumeSupportsAdvisoryFileLockingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsAdvisoryFileLockingKey: MemorySegment
    get() = kCFURLVolumeSupportsAdvisoryFileLockingKey_VH.get(kCFURLVolumeSupportsAdvisoryFileLockingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsAdvisoryFileLockingKey_VH.set(kCFURLVolumeSupportsAdvisoryFileLockingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsExtendedSecurityKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsExtendedSecurityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsExtendedSecurityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsExtendedSecurityKey").orElseThrow().reinterpret(kCFURLVolumeSupportsExtendedSecurityKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsExtendedSecurityKey_VH: VarHandle by lazy { kCFURLVolumeSupportsExtendedSecurityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsExtendedSecurityKey: MemorySegment
    get() = kCFURLVolumeSupportsExtendedSecurityKey_VH.get(kCFURLVolumeSupportsExtendedSecurityKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsExtendedSecurityKey_VH.set(kCFURLVolumeSupportsExtendedSecurityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsBrowsableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsBrowsableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsBrowsableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsBrowsableKey").orElseThrow().reinterpret(kCFURLVolumeIsBrowsableKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsBrowsableKey_VH: VarHandle by lazy { kCFURLVolumeIsBrowsableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsBrowsableKey: MemorySegment
    get() = kCFURLVolumeIsBrowsableKey_VH.get(kCFURLVolumeIsBrowsableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsBrowsableKey_VH.set(kCFURLVolumeIsBrowsableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeMaximumFileSizeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeMaximumFileSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeMaximumFileSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeMaximumFileSizeKey").orElseThrow().reinterpret(kCFURLVolumeMaximumFileSizeKey_LAYOUT.byteSize()) }
private val kCFURLVolumeMaximumFileSizeKey_VH: VarHandle by lazy { kCFURLVolumeMaximumFileSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeMaximumFileSizeKey: MemorySegment
    get() = kCFURLVolumeMaximumFileSizeKey_VH.get(kCFURLVolumeMaximumFileSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeMaximumFileSizeKey_VH.set(kCFURLVolumeMaximumFileSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsEjectableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsEjectableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsEjectableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsEjectableKey").orElseThrow().reinterpret(kCFURLVolumeIsEjectableKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsEjectableKey_VH: VarHandle by lazy { kCFURLVolumeIsEjectableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsEjectableKey: MemorySegment
    get() = kCFURLVolumeIsEjectableKey_VH.get(kCFURLVolumeIsEjectableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsEjectableKey_VH.set(kCFURLVolumeIsEjectableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsRemovableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsRemovableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsRemovableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsRemovableKey").orElseThrow().reinterpret(kCFURLVolumeIsRemovableKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsRemovableKey_VH: VarHandle by lazy { kCFURLVolumeIsRemovableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsRemovableKey: MemorySegment
    get() = kCFURLVolumeIsRemovableKey_VH.get(kCFURLVolumeIsRemovableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsRemovableKey_VH.set(kCFURLVolumeIsRemovableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsInternalKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsInternalKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsInternalKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsInternalKey").orElseThrow().reinterpret(kCFURLVolumeIsInternalKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsInternalKey_VH: VarHandle by lazy { kCFURLVolumeIsInternalKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsInternalKey: MemorySegment
    get() = kCFURLVolumeIsInternalKey_VH.get(kCFURLVolumeIsInternalKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsInternalKey_VH.set(kCFURLVolumeIsInternalKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsAutomountedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsAutomountedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsAutomountedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsAutomountedKey").orElseThrow().reinterpret(kCFURLVolumeIsAutomountedKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsAutomountedKey_VH: VarHandle by lazy { kCFURLVolumeIsAutomountedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsAutomountedKey: MemorySegment
    get() = kCFURLVolumeIsAutomountedKey_VH.get(kCFURLVolumeIsAutomountedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsAutomountedKey_VH.set(kCFURLVolumeIsAutomountedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsLocalKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsLocalKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsLocalKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsLocalKey").orElseThrow().reinterpret(kCFURLVolumeIsLocalKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsLocalKey_VH: VarHandle by lazy { kCFURLVolumeIsLocalKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsLocalKey: MemorySegment
    get() = kCFURLVolumeIsLocalKey_VH.get(kCFURLVolumeIsLocalKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsLocalKey_VH.set(kCFURLVolumeIsLocalKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsReadOnlyKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsReadOnlyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsReadOnlyKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsReadOnlyKey").orElseThrow().reinterpret(kCFURLVolumeIsReadOnlyKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsReadOnlyKey_VH: VarHandle by lazy { kCFURLVolumeIsReadOnlyKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsReadOnlyKey: MemorySegment
    get() = kCFURLVolumeIsReadOnlyKey_VH.get(kCFURLVolumeIsReadOnlyKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsReadOnlyKey_VH.set(kCFURLVolumeIsReadOnlyKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeCreationDateKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeCreationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeCreationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeCreationDateKey").orElseThrow().reinterpret(kCFURLVolumeCreationDateKey_LAYOUT.byteSize()) }
private val kCFURLVolumeCreationDateKey_VH: VarHandle by lazy { kCFURLVolumeCreationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeCreationDateKey: MemorySegment
    get() = kCFURLVolumeCreationDateKey_VH.get(kCFURLVolumeCreationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeCreationDateKey_VH.set(kCFURLVolumeCreationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeURLForRemountingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeURLForRemountingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeURLForRemountingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeURLForRemountingKey").orElseThrow().reinterpret(kCFURLVolumeURLForRemountingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeURLForRemountingKey_VH: VarHandle by lazy { kCFURLVolumeURLForRemountingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeURLForRemountingKey: MemorySegment
    get() = kCFURLVolumeURLForRemountingKey_VH.get(kCFURLVolumeURLForRemountingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeURLForRemountingKey_VH.set(kCFURLVolumeURLForRemountingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeUUIDStringKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeUUIDStringKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeUUIDStringKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeUUIDStringKey").orElseThrow().reinterpret(kCFURLVolumeUUIDStringKey_LAYOUT.byteSize()) }
private val kCFURLVolumeUUIDStringKey_VH: VarHandle by lazy { kCFURLVolumeUUIDStringKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeUUIDStringKey: MemorySegment
    get() = kCFURLVolumeUUIDStringKey_VH.get(kCFURLVolumeUUIDStringKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeUUIDStringKey_VH.set(kCFURLVolumeUUIDStringKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeNameKey").orElseThrow().reinterpret(kCFURLVolumeNameKey_LAYOUT.byteSize()) }
private val kCFURLVolumeNameKey_VH: VarHandle by lazy { kCFURLVolumeNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeNameKey: MemorySegment
    get() = kCFURLVolumeNameKey_VH.get(kCFURLVolumeNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeNameKey_VH.set(kCFURLVolumeNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeLocalizedNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeLocalizedNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeLocalizedNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeLocalizedNameKey").orElseThrow().reinterpret(kCFURLVolumeLocalizedNameKey_LAYOUT.byteSize()) }
private val kCFURLVolumeLocalizedNameKey_VH: VarHandle by lazy { kCFURLVolumeLocalizedNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeLocalizedNameKey: MemorySegment
    get() = kCFURLVolumeLocalizedNameKey_VH.get(kCFURLVolumeLocalizedNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeLocalizedNameKey_VH.set(kCFURLVolumeLocalizedNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsEncryptedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsEncryptedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsEncryptedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsEncryptedKey").orElseThrow().reinterpret(kCFURLVolumeIsEncryptedKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsEncryptedKey_VH: VarHandle by lazy { kCFURLVolumeIsEncryptedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsEncryptedKey: MemorySegment
    get() = kCFURLVolumeIsEncryptedKey_VH.get(kCFURLVolumeIsEncryptedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsEncryptedKey_VH.set(kCFURLVolumeIsEncryptedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeIsRootFileSystemKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeIsRootFileSystemKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeIsRootFileSystemKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeIsRootFileSystemKey").orElseThrow().reinterpret(kCFURLVolumeIsRootFileSystemKey_LAYOUT.byteSize()) }
private val kCFURLVolumeIsRootFileSystemKey_VH: VarHandle by lazy { kCFURLVolumeIsRootFileSystemKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeIsRootFileSystemKey: MemorySegment
    get() = kCFURLVolumeIsRootFileSystemKey_VH.get(kCFURLVolumeIsRootFileSystemKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeIsRootFileSystemKey_VH.set(kCFURLVolumeIsRootFileSystemKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsCompressionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsCompressionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsCompressionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsCompressionKey").orElseThrow().reinterpret(kCFURLVolumeSupportsCompressionKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsCompressionKey_VH: VarHandle by lazy { kCFURLVolumeSupportsCompressionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsCompressionKey: MemorySegment
    get() = kCFURLVolumeSupportsCompressionKey_VH.get(kCFURLVolumeSupportsCompressionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsCompressionKey_VH.set(kCFURLVolumeSupportsCompressionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsFileCloningKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsFileCloningKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsFileCloningKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsFileCloningKey").orElseThrow().reinterpret(kCFURLVolumeSupportsFileCloningKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsFileCloningKey_VH: VarHandle by lazy { kCFURLVolumeSupportsFileCloningKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsFileCloningKey: MemorySegment
    get() = kCFURLVolumeSupportsFileCloningKey_VH.get(kCFURLVolumeSupportsFileCloningKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsFileCloningKey_VH.set(kCFURLVolumeSupportsFileCloningKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsSwapRenamingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsSwapRenamingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsSwapRenamingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsSwapRenamingKey").orElseThrow().reinterpret(kCFURLVolumeSupportsSwapRenamingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsSwapRenamingKey_VH: VarHandle by lazy { kCFURLVolumeSupportsSwapRenamingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsSwapRenamingKey: MemorySegment
    get() = kCFURLVolumeSupportsSwapRenamingKey_VH.get(kCFURLVolumeSupportsSwapRenamingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsSwapRenamingKey_VH.set(kCFURLVolumeSupportsSwapRenamingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsExclusiveRenamingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsExclusiveRenamingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsExclusiveRenamingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsExclusiveRenamingKey").orElseThrow().reinterpret(kCFURLVolumeSupportsExclusiveRenamingKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsExclusiveRenamingKey_VH: VarHandle by lazy { kCFURLVolumeSupportsExclusiveRenamingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsExclusiveRenamingKey: MemorySegment
    get() = kCFURLVolumeSupportsExclusiveRenamingKey_VH.get(kCFURLVolumeSupportsExclusiveRenamingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsExclusiveRenamingKey_VH.set(kCFURLVolumeSupportsExclusiveRenamingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsImmutableFilesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsImmutableFilesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsImmutableFilesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsImmutableFilesKey").orElseThrow().reinterpret(kCFURLVolumeSupportsImmutableFilesKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsImmutableFilesKey_VH: VarHandle by lazy { kCFURLVolumeSupportsImmutableFilesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsImmutableFilesKey: MemorySegment
    get() = kCFURLVolumeSupportsImmutableFilesKey_VH.get(kCFURLVolumeSupportsImmutableFilesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsImmutableFilesKey_VH.set(kCFURLVolumeSupportsImmutableFilesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsAccessPermissionsKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsAccessPermissionsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsAccessPermissionsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsAccessPermissionsKey").orElseThrow().reinterpret(kCFURLVolumeSupportsAccessPermissionsKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsAccessPermissionsKey_VH: VarHandle by lazy { kCFURLVolumeSupportsAccessPermissionsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsAccessPermissionsKey: MemorySegment
    get() = kCFURLVolumeSupportsAccessPermissionsKey_VH.get(kCFURLVolumeSupportsAccessPermissionsKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsAccessPermissionsKey_VH.set(kCFURLVolumeSupportsAccessPermissionsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSupportsFileProtectionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSupportsFileProtectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSupportsFileProtectionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSupportsFileProtectionKey").orElseThrow().reinterpret(kCFURLVolumeSupportsFileProtectionKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSupportsFileProtectionKey_VH: VarHandle by lazy { kCFURLVolumeSupportsFileProtectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var kCFURLVolumeSupportsFileProtectionKey: MemorySegment
    get() = kCFURLVolumeSupportsFileProtectionKey_VH.get(kCFURLVolumeSupportsFileProtectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSupportsFileProtectionKey_VH.set(kCFURLVolumeSupportsFileProtectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeTypeNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeTypeNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeTypeNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeTypeNameKey").orElseThrow().reinterpret(kCFURLVolumeTypeNameKey_LAYOUT.byteSize()) }
private val kCFURLVolumeTypeNameKey_VH: VarHandle by lazy { kCFURLVolumeTypeNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var kCFURLVolumeTypeNameKey: MemorySegment
    get() = kCFURLVolumeTypeNameKey_VH.get(kCFURLVolumeTypeNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeTypeNameKey_VH.set(kCFURLVolumeTypeNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeSubtypeKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeSubtypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeSubtypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeSubtypeKey").orElseThrow().reinterpret(kCFURLVolumeSubtypeKey_LAYOUT.byteSize()) }
private val kCFURLVolumeSubtypeKey_VH: VarHandle by lazy { kCFURLVolumeSubtypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var kCFURLVolumeSubtypeKey: MemorySegment
    get() = kCFURLVolumeSubtypeKey_VH.get(kCFURLVolumeSubtypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeSubtypeKey_VH.set(kCFURLVolumeSubtypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLVolumeMountFromLocationKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLVolumeMountFromLocationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLVolumeMountFromLocationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLVolumeMountFromLocationKey").orElseThrow().reinterpret(kCFURLVolumeMountFromLocationKey_LAYOUT.byteSize()) }
private val kCFURLVolumeMountFromLocationKey_VH: VarHandle by lazy { kCFURLVolumeMountFromLocationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 4, introducedSubminor = -1)
var kCFURLVolumeMountFromLocationKey: MemorySegment
    get() = kCFURLVolumeMountFromLocationKey_VH.get(kCFURLVolumeMountFromLocationKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLVolumeMountFromLocationKey_VH.set(kCFURLVolumeMountFromLocationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLIsUbiquitousItemKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLIsUbiquitousItemKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLIsUbiquitousItemKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLIsUbiquitousItemKey").orElseThrow().reinterpret(kCFURLIsUbiquitousItemKey_LAYOUT.byteSize()) }
private val kCFURLIsUbiquitousItemKey_VH: VarHandle by lazy { kCFURLIsUbiquitousItemKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLIsUbiquitousItemKey: MemorySegment
    get() = kCFURLIsUbiquitousItemKey_VH.get(kCFURLIsUbiquitousItemKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLIsUbiquitousItemKey_VH.set(kCFURLIsUbiquitousItemKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemHasUnresolvedConflictsKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemHasUnresolvedConflictsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemHasUnresolvedConflictsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemHasUnresolvedConflictsKey").orElseThrow().reinterpret(kCFURLUbiquitousItemHasUnresolvedConflictsKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemHasUnresolvedConflictsKey_VH: VarHandle by lazy { kCFURLUbiquitousItemHasUnresolvedConflictsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemHasUnresolvedConflictsKey: MemorySegment
    get() = kCFURLUbiquitousItemHasUnresolvedConflictsKey_VH.get(kCFURLUbiquitousItemHasUnresolvedConflictsKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemHasUnresolvedConflictsKey_VH.set(kCFURLUbiquitousItemHasUnresolvedConflictsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemIsDownloadedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemIsDownloadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemIsDownloadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemIsDownloadedKey").orElseThrow().reinterpret(kCFURLUbiquitousItemIsDownloadedKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemIsDownloadedKey_VH: VarHandle by lazy { kCFURLUbiquitousItemIsDownloadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use kCFURLUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use kCFURLUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use kCFURLUbiquitousItemDownloadingStatusKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use kCFURLUbiquitousItemDownloadingStatusKey instead")
var kCFURLUbiquitousItemIsDownloadedKey: MemorySegment
    get() = kCFURLUbiquitousItemIsDownloadedKey_VH.get(kCFURLUbiquitousItemIsDownloadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemIsDownloadedKey_VH.set(kCFURLUbiquitousItemIsDownloadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemIsDownloadingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemIsDownloadingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemIsDownloadingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemIsDownloadingKey").orElseThrow().reinterpret(kCFURLUbiquitousItemIsDownloadingKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemIsDownloadingKey_VH: VarHandle by lazy { kCFURLUbiquitousItemIsDownloadingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemIsDownloadingKey: MemorySegment
    get() = kCFURLUbiquitousItemIsDownloadingKey_VH.get(kCFURLUbiquitousItemIsDownloadingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemIsDownloadingKey_VH.set(kCFURLUbiquitousItemIsDownloadingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemIsUploadedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemIsUploadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemIsUploadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemIsUploadedKey").orElseThrow().reinterpret(kCFURLUbiquitousItemIsUploadedKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemIsUploadedKey_VH: VarHandle by lazy { kCFURLUbiquitousItemIsUploadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemIsUploadedKey: MemorySegment
    get() = kCFURLUbiquitousItemIsUploadedKey_VH.get(kCFURLUbiquitousItemIsUploadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemIsUploadedKey_VH.set(kCFURLUbiquitousItemIsUploadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemIsUploadingKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemIsUploadingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemIsUploadingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemIsUploadingKey").orElseThrow().reinterpret(kCFURLUbiquitousItemIsUploadingKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemIsUploadingKey_VH: VarHandle by lazy { kCFURLUbiquitousItemIsUploadingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemIsUploadingKey: MemorySegment
    get() = kCFURLUbiquitousItemIsUploadingKey_VH.get(kCFURLUbiquitousItemIsUploadingKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemIsUploadingKey_VH.set(kCFURLUbiquitousItemIsUploadingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemPercentDownloadedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemPercentDownloadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemPercentDownloadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemPercentDownloadedKey").orElseThrow().reinterpret(kCFURLUbiquitousItemPercentDownloadedKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemPercentDownloadedKey_VH: VarHandle by lazy { kCFURLUbiquitousItemPercentDownloadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem instead")
var kCFURLUbiquitousItemPercentDownloadedKey: MemorySegment
    get() = kCFURLUbiquitousItemPercentDownloadedKey_VH.get(kCFURLUbiquitousItemPercentDownloadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemPercentDownloadedKey_VH.set(kCFURLUbiquitousItemPercentDownloadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemPercentUploadedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemPercentUploadedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemPercentUploadedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemPercentUploadedKey").orElseThrow().reinterpret(kCFURLUbiquitousItemPercentUploadedKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemPercentUploadedKey_VH: VarHandle by lazy { kCFURLUbiquitousItemPercentUploadedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead")
var kCFURLUbiquitousItemPercentUploadedKey: MemorySegment
    get() = kCFURLUbiquitousItemPercentUploadedKey_VH.get(kCFURLUbiquitousItemPercentUploadedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemPercentUploadedKey_VH.set(kCFURLUbiquitousItemPercentUploadedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemDownloadingStatusKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemDownloadingStatusKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemDownloadingStatusKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemDownloadingStatusKey").orElseThrow().reinterpret(kCFURLUbiquitousItemDownloadingStatusKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemDownloadingStatusKey_VH: VarHandle by lazy { kCFURLUbiquitousItemDownloadingStatusKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemDownloadingStatusKey: MemorySegment
    get() = kCFURLUbiquitousItemDownloadingStatusKey_VH.get(kCFURLUbiquitousItemDownloadingStatusKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemDownloadingStatusKey_VH.set(kCFURLUbiquitousItemDownloadingStatusKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemDownloadingErrorKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemDownloadingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemDownloadingErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemDownloadingErrorKey").orElseThrow().reinterpret(kCFURLUbiquitousItemDownloadingErrorKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemDownloadingErrorKey_VH: VarHandle by lazy { kCFURLUbiquitousItemDownloadingErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemDownloadingErrorKey: MemorySegment
    get() = kCFURLUbiquitousItemDownloadingErrorKey_VH.get(kCFURLUbiquitousItemDownloadingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemDownloadingErrorKey_VH.set(kCFURLUbiquitousItemDownloadingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemUploadingErrorKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemUploadingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemUploadingErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemUploadingErrorKey").orElseThrow().reinterpret(kCFURLUbiquitousItemUploadingErrorKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemUploadingErrorKey_VH: VarHandle by lazy { kCFURLUbiquitousItemUploadingErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemUploadingErrorKey: MemorySegment
    get() = kCFURLUbiquitousItemUploadingErrorKey_VH.get(kCFURLUbiquitousItemUploadingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemUploadingErrorKey_VH.set(kCFURLUbiquitousItemUploadingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemIsExcludedFromSyncKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemIsExcludedFromSyncKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemIsExcludedFromSyncKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemIsExcludedFromSyncKey").orElseThrow().reinterpret(kCFURLUbiquitousItemIsExcludedFromSyncKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemIsExcludedFromSyncKey_VH: VarHandle by lazy { kCFURLUbiquitousItemIsExcludedFromSyncKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 4, introducedSubminor = -1)
var kCFURLUbiquitousItemIsExcludedFromSyncKey: MemorySegment
    get() = kCFURLUbiquitousItemIsExcludedFromSyncKey_VH.get(kCFURLUbiquitousItemIsExcludedFromSyncKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemIsExcludedFromSyncKey_VH.set(kCFURLUbiquitousItemIsExcludedFromSyncKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemDownloadingStatusNotDownloaded typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemDownloadingStatusNotDownloaded").orElseThrow().reinterpret(kCFURLUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemDownloadingStatusNotDownloaded_VH: VarHandle by lazy { kCFURLUbiquitousItemDownloadingStatusNotDownloaded_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemDownloadingStatusNotDownloaded: MemorySegment
    get() = kCFURLUbiquitousItemDownloadingStatusNotDownloaded_VH.get(kCFURLUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemDownloadingStatusNotDownloaded_VH.set(kCFURLUbiquitousItemDownloadingStatusNotDownloaded_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemDownloadingStatusDownloaded typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemDownloadingStatusDownloaded_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemDownloadingStatusDownloaded_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemDownloadingStatusDownloaded").orElseThrow().reinterpret(kCFURLUbiquitousItemDownloadingStatusDownloaded_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemDownloadingStatusDownloaded_VH: VarHandle by lazy { kCFURLUbiquitousItemDownloadingStatusDownloaded_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemDownloadingStatusDownloaded: MemorySegment
    get() = kCFURLUbiquitousItemDownloadingStatusDownloaded_VH.get(kCFURLUbiquitousItemDownloadingStatusDownloaded_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemDownloadingStatusDownloaded_VH.set(kCFURLUbiquitousItemDownloadingStatusDownloaded_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemDownloadingStatusCurrent typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemDownloadingStatusCurrent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemDownloadingStatusCurrent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemDownloadingStatusCurrent").orElseThrow().reinterpret(kCFURLUbiquitousItemDownloadingStatusCurrent_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemDownloadingStatusCurrent_VH: VarHandle by lazy { kCFURLUbiquitousItemDownloadingStatusCurrent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemDownloadingStatusCurrent: MemorySegment
    get() = kCFURLUbiquitousItemDownloadingStatusCurrent_VH.get(kCFURLUbiquitousItemDownloadingStatusCurrent_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemDownloadingStatusCurrent_VH.set(kCFURLUbiquitousItemDownloadingStatusCurrent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemSupportedSyncControlsKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemSupportedSyncControlsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemSupportedSyncControlsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemSupportedSyncControlsKey").orElseThrow().reinterpret(kCFURLUbiquitousItemSupportedSyncControlsKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemSupportedSyncControlsKey_VH: VarHandle by lazy { kCFURLUbiquitousItemSupportedSyncControlsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemSupportedSyncControlsKey: MemorySegment
    get() = kCFURLUbiquitousItemSupportedSyncControlsKey_VH.get(kCFURLUbiquitousItemSupportedSyncControlsKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemSupportedSyncControlsKey_VH.set(kCFURLUbiquitousItemSupportedSyncControlsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLUbiquitousItemIsSyncPausedKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLUbiquitousItemIsSyncPausedKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLUbiquitousItemIsSyncPausedKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFURLUbiquitousItemIsSyncPausedKey").orElseThrow().reinterpret(kCFURLUbiquitousItemIsSyncPausedKey_LAYOUT.byteSize()) }
private val kCFURLUbiquitousItemIsSyncPausedKey_VH: VarHandle by lazy { kCFURLUbiquitousItemIsSyncPausedKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var kCFURLUbiquitousItemIsSyncPausedKey: MemorySegment
    get() = kCFURLUbiquitousItemIsSyncPausedKey_VH.get(kCFURLUbiquitousItemIsSyncPausedKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLUbiquitousItemIsSyncPausedKey_VH.set(kCFURLUbiquitousItemIsSyncPausedKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFURLCreateBookmarkData typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLBookmarkCreationOptions = Declared(CFURLBookmarkCreationOptions),typedef CFArrayRef = (Declared(__CFArray))*,typedef CFURLRef = (Declared(__CFURL))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCreateBookmarkData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateBookmarkData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateBookmarkData").orElseThrow()
private val CFURLCreateBookmarkData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateBookmarkData_ADDR, CFURLCreateBookmarkData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateBookmarkData(arg0: MemorySegment, arg1: MemorySegment, arg2: CFURLBookmarkCreationOptions, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CFURLCreateBookmarkData_HANDLE.invokeExact(arg0, arg1, arg2.rawValue, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateByResolvingBookmarkData typedef CFURLRef = (Declared(__CFURL))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFURLBookmarkResolutionOptions = Declared(CFURLBookmarkResolutionOptions),typedef CFURLRef = (Declared(__CFURL))*,typedef CFArrayRef = (Declared(__CFArray))*,(typedef Boolean = UNSIGNED = Char)*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCreateByResolvingBookmarkData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateByResolvingBookmarkData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateByResolvingBookmarkData").orElseThrow()
private val CFURLCreateByResolvingBookmarkData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateByResolvingBookmarkData_ADDR, CFURLCreateByResolvingBookmarkData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateByResolvingBookmarkData(arg0: MemorySegment, arg1: MemorySegment, arg2: CFURLBookmarkResolutionOptions, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CFURLCreateByResolvingBookmarkData_HANDLE.invokeExact(arg0, arg1, arg2.rawValue, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateResourcePropertiesForKeysFromBookmarkData typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFArrayRef = (Declared(__CFArray))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CFURLCreateResourcePropertiesForKeysFromBookmarkData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateResourcePropertiesForKeysFromBookmarkData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateResourcePropertiesForKeysFromBookmarkData").orElseThrow()
private val CFURLCreateResourcePropertiesForKeysFromBookmarkData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateResourcePropertiesForKeysFromBookmarkData_ADDR, CFURLCreateResourcePropertiesForKeysFromBookmarkData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateResourcePropertiesForKeysFromBookmarkData(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateResourcePropertiesForKeysFromBookmarkData_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateResourcePropertyForKeyFromBookmarkData typedef CFTypeRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CFURLCreateResourcePropertyForKeyFromBookmarkData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateResourcePropertyForKeyFromBookmarkData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateResourcePropertyForKeyFromBookmarkData").orElseThrow()
private val CFURLCreateResourcePropertyForKeyFromBookmarkData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateResourcePropertyForKeyFromBookmarkData_ADDR, CFURLCreateResourcePropertyForKeyFromBookmarkData_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateResourcePropertyForKeyFromBookmarkData(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateResourcePropertyForKeyFromBookmarkData_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateBookmarkDataFromFile typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLCreateBookmarkDataFromFile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateBookmarkDataFromFile_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateBookmarkDataFromFile").orElseThrow()
private val CFURLCreateBookmarkDataFromFile_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateBookmarkDataFromFile_ADDR, CFURLCreateBookmarkDataFromFile_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLCreateBookmarkDataFromFile(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLCreateBookmarkDataFromFile_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLWriteBookmarkDataToFile typedef Boolean = UNSIGNED = Char(typedef CFDataRef = (Declared(__CFData))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLBookmarkFileCreationOptions = UNSIGNED = Long,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLWriteBookmarkDataToFile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFURLWriteBookmarkDataToFile_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLWriteBookmarkDataToFile").orElseThrow()
private val CFURLWriteBookmarkDataToFile_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLWriteBookmarkDataToFile_ADDR, CFURLWriteBookmarkDataToFile_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLWriteBookmarkDataToFile(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Byte {
    try {
        return CFURLWriteBookmarkDataToFile_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateBookmarkDataFromAliasRecord typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CFURLCreateBookmarkDataFromAliasRecord_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateBookmarkDataFromAliasRecord_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLCreateBookmarkDataFromAliasRecord").orElseThrow()
private val CFURLCreateBookmarkDataFromAliasRecord_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLCreateBookmarkDataFromAliasRecord_ADDR, CFURLCreateBookmarkDataFromAliasRecord_DESC)

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The Carbon Alias Manager is deprecated. This function should only be used to convert Carbon AliasRecords to bookmark data.")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFURLCreateBookmarkDataFromAliasRecord(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFURLCreateBookmarkDataFromAliasRecord_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLStartAccessingSecurityScopedResource typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLStartAccessingSecurityScopedResource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLStartAccessingSecurityScopedResource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLStartAccessingSecurityScopedResource").orElseThrow()
private val CFURLStartAccessingSecurityScopedResource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLStartAccessingSecurityScopedResource_ADDR, CFURLStartAccessingSecurityScopedResource_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLStartAccessingSecurityScopedResource(arg0: MemorySegment): Byte {
    try {
        return CFURLStartAccessingSecurityScopedResource_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLStopAccessingSecurityScopedResource Void(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFURLStopAccessingSecurityScopedResource_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFURLStopAccessingSecurityScopedResource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFURLStopAccessingSecurityScopedResource").orElseThrow()
private val CFURLStopAccessingSecurityScopedResource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFURLStopAccessingSecurityScopedResource_ADDR, CFURLStopAccessingSecurityScopedResource_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLStopAccessingSecurityScopedResource(arg0: MemorySegment): Unit {
    try {
        CFURLStopAccessingSecurityScopedResource_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFRunLoopDefaultMode typedef const CFRunLoopMode = (Declared(__CFString))*
 */
private val kCFRunLoopDefaultMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFRunLoopDefaultMode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFRunLoopDefaultMode").orElseThrow().reinterpret(kCFRunLoopDefaultMode_LAYOUT.byteSize()) }
private val kCFRunLoopDefaultMode_VH: VarHandle by lazy { kCFRunLoopDefaultMode_LAYOUT.varHandle() }

var kCFRunLoopDefaultMode: MemorySegment
    get() = kCFRunLoopDefaultMode_VH.get(kCFRunLoopDefaultMode_SEGMENT, 0L) as MemorySegment
    set(value) = kCFRunLoopDefaultMode_VH.set(kCFRunLoopDefaultMode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFRunLoopCommonModes typedef const CFRunLoopMode = (Declared(__CFString))*
 */
private val kCFRunLoopCommonModes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFRunLoopCommonModes_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFRunLoopCommonModes").orElseThrow().reinterpret(kCFRunLoopCommonModes_LAYOUT.byteSize()) }
private val kCFRunLoopCommonModes_VH: VarHandle by lazy { kCFRunLoopCommonModes_LAYOUT.varHandle() }

var kCFRunLoopCommonModes: MemorySegment
    get() = kCFRunLoopCommonModes_VH.get(kCFRunLoopCommonModes_SEGMENT, 0L) as MemorySegment
    set(value) = kCFRunLoopCommonModes_VH.set(kCFRunLoopCommonModes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFRunLoopGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFRunLoopGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFRunLoopGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopGetTypeID").orElseThrow()
private val CFRunLoopGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopGetTypeID_ADDR, CFRunLoopGetTypeID_DESC)

fun CFRunLoopGetTypeID(): Long {
    try {
        return CFRunLoopGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopGetCurrent typedef CFRunLoopRef = (Declared(__CFRunLoop))*()
 */
private val CFRunLoopGetCurrent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFRunLoopGetCurrent_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopGetCurrent").orElseThrow()
private val CFRunLoopGetCurrent_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopGetCurrent_ADDR, CFRunLoopGetCurrent_DESC)

fun CFRunLoopGetCurrent(): MemorySegment {
    try {
        return CFRunLoopGetCurrent_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopGetMain typedef CFRunLoopRef = (Declared(__CFRunLoop))*()
 */
private val CFRunLoopGetMain_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFRunLoopGetMain_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopGetMain").orElseThrow()
private val CFRunLoopGetMain_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopGetMain_ADDR, CFRunLoopGetMain_DESC)

fun CFRunLoopGetMain(): MemorySegment {
    try {
        return CFRunLoopGetMain_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopCopyCurrentMode typedef CFRunLoopMode = (Declared(__CFString))*(typedef CFRunLoopRef = (Declared(__CFRunLoop))*)
 */
private val CFRunLoopCopyCurrentMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopCopyCurrentMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopCopyCurrentMode").orElseThrow()
private val CFRunLoopCopyCurrentMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopCopyCurrentMode_ADDR, CFRunLoopCopyCurrentMode_DESC)

fun CFRunLoopCopyCurrentMode(arg0: MemorySegment): MemorySegment {
    try {
        return CFRunLoopCopyCurrentMode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopCopyAllModes typedef CFArrayRef = (Declared(__CFArray))*(typedef CFRunLoopRef = (Declared(__CFRunLoop))*)
 */
private val CFRunLoopCopyAllModes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopCopyAllModes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopCopyAllModes").orElseThrow()
private val CFRunLoopCopyAllModes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopCopyAllModes_ADDR, CFRunLoopCopyAllModes_DESC)

fun CFRunLoopCopyAllModes(arg0: MemorySegment): MemorySegment {
    try {
        return CFRunLoopCopyAllModes_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopAddCommonMode Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopAddCommonMode_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopAddCommonMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopAddCommonMode").orElseThrow()
private val CFRunLoopAddCommonMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopAddCommonMode_ADDR, CFRunLoopAddCommonMode_DESC)

fun CFRunLoopAddCommonMode(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFRunLoopAddCommonMode_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopGetNextTimerFireDate typedef CFAbsoluteTime = Double(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopGetNextTimerFireDate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopGetNextTimerFireDate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopGetNextTimerFireDate").orElseThrow()
private val CFRunLoopGetNextTimerFireDate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopGetNextTimerFireDate_ADDR, CFRunLoopGetNextTimerFireDate_DESC)

fun CFRunLoopGetNextTimerFireDate(arg0: MemorySegment, arg1: MemorySegment): Double {
    try {
        return CFRunLoopGetNextTimerFireDate_HANDLE.invokeExact(arg0, arg1) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopRun Void()
 */
private val CFRunLoopRun_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid()
private val CFRunLoopRun_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopRun").orElseThrow()
private val CFRunLoopRun_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopRun_ADDR, CFRunLoopRun_DESC)

fun CFRunLoopRun(): Unit {
    try {
        CFRunLoopRun_HANDLE.invokeExact()
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopRunInMode typedef CFRunLoopRunResult = Declared(CFRunLoopRunResult)(typedef CFRunLoopMode = (Declared(__CFString))*,typedef CFTimeInterval = Double,typedef Boolean = UNSIGNED = Char)
 */
private val CFRunLoopRunInMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_BYTE)
private val CFRunLoopRunInMode_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopRunInMode").orElseThrow()
private val CFRunLoopRunInMode_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopRunInMode_ADDR, CFRunLoopRunInMode_DESC)

fun CFRunLoopRunInMode(arg0: MemorySegment, arg1: Double, arg2: Byte): CFRunLoopRunResult {
    try {
        return CFRunLoopRunResult.fromValue((CFRunLoopRunInMode_HANDLE.invokeExact(arg0, arg1, arg2) as Int).toLong())
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopIsWaiting typedef Boolean = UNSIGNED = Char(typedef CFRunLoopRef = (Declared(__CFRunLoop))*)
 */
private val CFRunLoopIsWaiting_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFRunLoopIsWaiting_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopIsWaiting").orElseThrow()
private val CFRunLoopIsWaiting_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopIsWaiting_ADDR, CFRunLoopIsWaiting_DESC)

fun CFRunLoopIsWaiting(arg0: MemorySegment): Byte {
    try {
        return CFRunLoopIsWaiting_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopWakeUp Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*)
 */
private val CFRunLoopWakeUp_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFRunLoopWakeUp_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopWakeUp").orElseThrow()
private val CFRunLoopWakeUp_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopWakeUp_ADDR, CFRunLoopWakeUp_DESC)

fun CFRunLoopWakeUp(arg0: MemorySegment): Unit {
    try {
        CFRunLoopWakeUp_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopStop Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*)
 */
private val CFRunLoopStop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFRunLoopStop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopStop").orElseThrow()
private val CFRunLoopStop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopStop_ADDR, CFRunLoopStop_DESC)

fun CFRunLoopStop(arg0: MemorySegment): Unit {
    try {
        CFRunLoopStop_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopPerformBlock Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFTypeRef = (Void)*,(Void)*)
 */
private val CFRunLoopPerformBlock_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopPerformBlock_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopPerformBlock").orElseThrow()
private val CFRunLoopPerformBlock_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopPerformBlock_ADDR, CFRunLoopPerformBlock_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFRunLoopPerformBlock(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopPerformBlock_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopContainsSource typedef Boolean = UNSIGNED = Char(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopContainsSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopContainsSource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopContainsSource").orElseThrow()
private val CFRunLoopContainsSource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopContainsSource_ADDR, CFRunLoopContainsSource_DESC)

fun CFRunLoopContainsSource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFRunLoopContainsSource_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopAddSource Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopAddSource_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopAddSource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopAddSource").orElseThrow()
private val CFRunLoopAddSource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopAddSource_ADDR, CFRunLoopAddSource_DESC)

fun CFRunLoopAddSource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopAddSource_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopRemoveSource Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopRemoveSource_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopRemoveSource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopRemoveSource").orElseThrow()
private val CFRunLoopRemoveSource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopRemoveSource_ADDR, CFRunLoopRemoveSource_DESC)

fun CFRunLoopRemoveSource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopRemoveSource_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopContainsObserver typedef Boolean = UNSIGNED = Char(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopContainsObserver_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopContainsObserver_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopContainsObserver").orElseThrow()
private val CFRunLoopContainsObserver_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopContainsObserver_ADDR, CFRunLoopContainsObserver_DESC)

fun CFRunLoopContainsObserver(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFRunLoopContainsObserver_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopAddObserver Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopAddObserver_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopAddObserver_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopAddObserver").orElseThrow()
private val CFRunLoopAddObserver_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopAddObserver_ADDR, CFRunLoopAddObserver_DESC)

fun CFRunLoopAddObserver(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopAddObserver_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopRemoveObserver Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopRemoveObserver_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopRemoveObserver_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopRemoveObserver").orElseThrow()
private val CFRunLoopRemoveObserver_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopRemoveObserver_ADDR, CFRunLoopRemoveObserver_DESC)

fun CFRunLoopRemoveObserver(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopRemoveObserver_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopContainsTimer typedef Boolean = UNSIGNED = Char(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopContainsTimer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopContainsTimer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopContainsTimer").orElseThrow()
private val CFRunLoopContainsTimer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopContainsTimer_ADDR, CFRunLoopContainsTimer_DESC)

fun CFRunLoopContainsTimer(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFRunLoopContainsTimer_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopAddTimer Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopAddTimer_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopAddTimer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopAddTimer").orElseThrow()
private val CFRunLoopAddTimer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopAddTimer_ADDR, CFRunLoopAddTimer_DESC)

fun CFRunLoopAddTimer(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopAddTimer_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopRemoveTimer Void(typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFRunLoopRemoveTimer_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopRemoveTimer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopRemoveTimer").orElseThrow()
private val CFRunLoopRemoveTimer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopRemoveTimer_ADDR, CFRunLoopRemoveTimer_DESC)

fun CFRunLoopRemoveTimer(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFRunLoopRemoveTimer_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFRunLoopSourceGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFRunLoopSourceGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceGetTypeID").orElseThrow()
private val CFRunLoopSourceGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceGetTypeID_ADDR, CFRunLoopSourceGetTypeID_DESC)

fun CFRunLoopSourceGetTypeID(): Long {
    try {
        return CFRunLoopSourceGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceCreate typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFIndex = Long,(typedef CFRunLoopSourceContext = Declared(CFRunLoopSourceContext))*)
 */
private val CFRunLoopSourceCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopSourceCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceCreate").orElseThrow()
private val CFRunLoopSourceCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceCreate_ADDR, CFRunLoopSourceCreate_DESC)

fun CFRunLoopSourceCreate(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CFRunLoopSourceCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceGetOrder typedef CFIndex = Long(typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*)
 */
private val CFRunLoopSourceGetOrder_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopSourceGetOrder_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceGetOrder").orElseThrow()
private val CFRunLoopSourceGetOrder_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceGetOrder_ADDR, CFRunLoopSourceGetOrder_DESC)

fun CFRunLoopSourceGetOrder(arg0: MemorySegment): Long {
    try {
        return CFRunLoopSourceGetOrder_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceInvalidate Void(typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*)
 */
private val CFRunLoopSourceInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFRunLoopSourceInvalidate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceInvalidate").orElseThrow()
private val CFRunLoopSourceInvalidate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceInvalidate_ADDR, CFRunLoopSourceInvalidate_DESC)

fun CFRunLoopSourceInvalidate(arg0: MemorySegment): Unit {
    try {
        CFRunLoopSourceInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceIsValid typedef Boolean = UNSIGNED = Char(typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*)
 */
private val CFRunLoopSourceIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFRunLoopSourceIsValid_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceIsValid").orElseThrow()
private val CFRunLoopSourceIsValid_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceIsValid_ADDR, CFRunLoopSourceIsValid_DESC)

fun CFRunLoopSourceIsValid(arg0: MemorySegment): Byte {
    try {
        return CFRunLoopSourceIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceGetContext Void(typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*,(typedef CFRunLoopSourceContext = Declared(CFRunLoopSourceContext))*)
 */
private val CFRunLoopSourceGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopSourceGetContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceGetContext").orElseThrow()
private val CFRunLoopSourceGetContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceGetContext_ADDR, CFRunLoopSourceGetContext_DESC)

fun CFRunLoopSourceGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFRunLoopSourceGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopSourceSignal Void(typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*)
 */
private val CFRunLoopSourceSignal_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFRunLoopSourceSignal_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopSourceSignal").orElseThrow()
private val CFRunLoopSourceSignal_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopSourceSignal_ADDR, CFRunLoopSourceSignal_DESC)

fun CFRunLoopSourceSignal(arg0: MemorySegment): Unit {
    try {
        CFRunLoopSourceSignal_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFRunLoopObserverGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFRunLoopObserverGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverGetTypeID").orElseThrow()
private val CFRunLoopObserverGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverGetTypeID_ADDR, CFRunLoopObserverGetTypeID_DESC)

fun CFRunLoopObserverGetTypeID(): Long {
    try {
        return CFRunLoopObserverGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverCreate typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFOptionFlags = UNSIGNED = Long,typedef Boolean = UNSIGNED = Char,typedef CFIndex = Long,typedef CFRunLoopObserverCallBack = (Void((Declared(__CFRunLoopObserver))*,Declared(CFRunLoopActivity),(Void)*))*,(typedef CFRunLoopObserverContext = Declared(CFRunLoopObserverContext))*)
 */
private val CFRunLoopObserverCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopObserverCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverCreate").orElseThrow()
private val CFRunLoopObserverCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverCreate_ADDR, CFRunLoopObserverCreate_DESC)

fun CFRunLoopObserverCreate(arg0: MemorySegment, arg1: Long, arg2: Byte, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CFRunLoopObserverCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverCreateWithHandler typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFOptionFlags = UNSIGNED = Long,typedef Boolean = UNSIGNED = Char,typedef CFIndex = Long,(Void)*)
 */
private val CFRunLoopObserverCreateWithHandler_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopObserverCreateWithHandler_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverCreateWithHandler").orElseThrow()
private val CFRunLoopObserverCreateWithHandler_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverCreateWithHandler_ADDR, CFRunLoopObserverCreateWithHandler_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFRunLoopObserverCreateWithHandler(arg0: MemorySegment, arg1: Long, arg2: Byte, arg3: Long, arg4: MemorySegment): MemorySegment {
    try {
        return CFRunLoopObserverCreateWithHandler_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverGetActivities typedef CFOptionFlags = UNSIGNED = Long(typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*)
 */
private val CFRunLoopObserverGetActivities_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopObserverGetActivities_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverGetActivities").orElseThrow()
private val CFRunLoopObserverGetActivities_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverGetActivities_ADDR, CFRunLoopObserverGetActivities_DESC)

fun CFRunLoopObserverGetActivities(arg0: MemorySegment): Long {
    try {
        return CFRunLoopObserverGetActivities_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverDoesRepeat typedef Boolean = UNSIGNED = Char(typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*)
 */
private val CFRunLoopObserverDoesRepeat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFRunLoopObserverDoesRepeat_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverDoesRepeat").orElseThrow()
private val CFRunLoopObserverDoesRepeat_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverDoesRepeat_ADDR, CFRunLoopObserverDoesRepeat_DESC)

fun CFRunLoopObserverDoesRepeat(arg0: MemorySegment): Byte {
    try {
        return CFRunLoopObserverDoesRepeat_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverGetOrder typedef CFIndex = Long(typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*)
 */
private val CFRunLoopObserverGetOrder_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopObserverGetOrder_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverGetOrder").orElseThrow()
private val CFRunLoopObserverGetOrder_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverGetOrder_ADDR, CFRunLoopObserverGetOrder_DESC)

fun CFRunLoopObserverGetOrder(arg0: MemorySegment): Long {
    try {
        return CFRunLoopObserverGetOrder_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverInvalidate Void(typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*)
 */
private val CFRunLoopObserverInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFRunLoopObserverInvalidate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverInvalidate").orElseThrow()
private val CFRunLoopObserverInvalidate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverInvalidate_ADDR, CFRunLoopObserverInvalidate_DESC)

fun CFRunLoopObserverInvalidate(arg0: MemorySegment): Unit {
    try {
        CFRunLoopObserverInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverIsValid typedef Boolean = UNSIGNED = Char(typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*)
 */
private val CFRunLoopObserverIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFRunLoopObserverIsValid_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverIsValid").orElseThrow()
private val CFRunLoopObserverIsValid_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverIsValid_ADDR, CFRunLoopObserverIsValid_DESC)

fun CFRunLoopObserverIsValid(arg0: MemorySegment): Byte {
    try {
        return CFRunLoopObserverIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopObserverGetContext Void(typedef CFRunLoopObserverRef = (Declared(__CFRunLoopObserver))*,(typedef CFRunLoopObserverContext = Declared(CFRunLoopObserverContext))*)
 */
private val CFRunLoopObserverGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopObserverGetContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopObserverGetContext").orElseThrow()
private val CFRunLoopObserverGetContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopObserverGetContext_ADDR, CFRunLoopObserverGetContext_DESC)

fun CFRunLoopObserverGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFRunLoopObserverGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFRunLoopTimerGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFRunLoopTimerGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerGetTypeID").orElseThrow()
private val CFRunLoopTimerGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerGetTypeID_ADDR, CFRunLoopTimerGetTypeID_DESC)

fun CFRunLoopTimerGetTypeID(): Long {
    try {
        return CFRunLoopTimerGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerCreate typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFAbsoluteTime = Double,typedef CFTimeInterval = Double,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long,typedef CFRunLoopTimerCallBack = (Void((Declared(__CFRunLoopTimer))*,(Void)*))*,(typedef CFRunLoopTimerContext = Declared(CFRunLoopTimerContext))*)
 */
private val CFRunLoopTimerCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopTimerCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerCreate").orElseThrow()
private val CFRunLoopTimerCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerCreate_ADDR, CFRunLoopTimerCreate_DESC)

fun CFRunLoopTimerCreate(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Long, arg4: Long, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CFRunLoopTimerCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerCreateWithHandler typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFAbsoluteTime = Double,typedef CFTimeInterval = Double,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long,(Void)*)
 */
private val CFRunLoopTimerCreateWithHandler_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopTimerCreateWithHandler_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerCreateWithHandler").orElseThrow()
private val CFRunLoopTimerCreateWithHandler_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerCreateWithHandler_ADDR, CFRunLoopTimerCreateWithHandler_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFRunLoopTimerCreateWithHandler(arg0: MemorySegment, arg1: Double, arg2: Double, arg3: Long, arg4: Long, arg5: MemorySegment): MemorySegment {
    try {
        return CFRunLoopTimerCreateWithHandler_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerGetNextFireDate typedef CFAbsoluteTime = Double(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerGetNextFireDate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFRunLoopTimerGetNextFireDate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerGetNextFireDate").orElseThrow()
private val CFRunLoopTimerGetNextFireDate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerGetNextFireDate_ADDR, CFRunLoopTimerGetNextFireDate_DESC)

fun CFRunLoopTimerGetNextFireDate(arg0: MemorySegment): Double {
    try {
        return CFRunLoopTimerGetNextFireDate_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerSetNextFireDate Void(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*,typedef CFAbsoluteTime = Double)
 */
private val CFRunLoopTimerSetNextFireDate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFRunLoopTimerSetNextFireDate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerSetNextFireDate").orElseThrow()
private val CFRunLoopTimerSetNextFireDate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerSetNextFireDate_ADDR, CFRunLoopTimerSetNextFireDate_DESC)

fun CFRunLoopTimerSetNextFireDate(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CFRunLoopTimerSetNextFireDate_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerGetInterval typedef CFTimeInterval = Double(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerGetInterval_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFRunLoopTimerGetInterval_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerGetInterval").orElseThrow()
private val CFRunLoopTimerGetInterval_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerGetInterval_ADDR, CFRunLoopTimerGetInterval_DESC)

fun CFRunLoopTimerGetInterval(arg0: MemorySegment): Double {
    try {
        return CFRunLoopTimerGetInterval_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerDoesRepeat typedef Boolean = UNSIGNED = Char(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerDoesRepeat_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFRunLoopTimerDoesRepeat_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerDoesRepeat").orElseThrow()
private val CFRunLoopTimerDoesRepeat_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerDoesRepeat_ADDR, CFRunLoopTimerDoesRepeat_DESC)

fun CFRunLoopTimerDoesRepeat(arg0: MemorySegment): Byte {
    try {
        return CFRunLoopTimerDoesRepeat_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerGetOrder typedef CFIndex = Long(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerGetOrder_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFRunLoopTimerGetOrder_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerGetOrder").orElseThrow()
private val CFRunLoopTimerGetOrder_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerGetOrder_ADDR, CFRunLoopTimerGetOrder_DESC)

fun CFRunLoopTimerGetOrder(arg0: MemorySegment): Long {
    try {
        return CFRunLoopTimerGetOrder_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerInvalidate Void(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFRunLoopTimerInvalidate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerInvalidate").orElseThrow()
private val CFRunLoopTimerInvalidate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerInvalidate_ADDR, CFRunLoopTimerInvalidate_DESC)

fun CFRunLoopTimerInvalidate(arg0: MemorySegment): Unit {
    try {
        CFRunLoopTimerInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerIsValid typedef Boolean = UNSIGNED = Char(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFRunLoopTimerIsValid_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerIsValid").orElseThrow()
private val CFRunLoopTimerIsValid_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerIsValid_ADDR, CFRunLoopTimerIsValid_DESC)

fun CFRunLoopTimerIsValid(arg0: MemorySegment): Byte {
    try {
        return CFRunLoopTimerIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerGetContext Void(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*,(typedef CFRunLoopTimerContext = Declared(CFRunLoopTimerContext))*)
 */
private val CFRunLoopTimerGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFRunLoopTimerGetContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerGetContext").orElseThrow()
private val CFRunLoopTimerGetContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerGetContext_ADDR, CFRunLoopTimerGetContext_DESC)

fun CFRunLoopTimerGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFRunLoopTimerGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerGetTolerance typedef CFTimeInterval = Double(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*)
 */
private val CFRunLoopTimerGetTolerance_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFRunLoopTimerGetTolerance_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerGetTolerance").orElseThrow()
private val CFRunLoopTimerGetTolerance_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerGetTolerance_ADDR, CFRunLoopTimerGetTolerance_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFRunLoopTimerGetTolerance(arg0: MemorySegment): Double {
    try {
        return CFRunLoopTimerGetTolerance_HANDLE.invokeExact(arg0) as Double
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFRunLoopTimerSetTolerance Void(typedef CFRunLoopTimerRef = (Declared(__CFRunLoopTimer))*,typedef CFTimeInterval = Double)
 */
private val CFRunLoopTimerSetTolerance_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFRunLoopTimerSetTolerance_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFRunLoopTimerSetTolerance").orElseThrow()
private val CFRunLoopTimerSetTolerance_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFRunLoopTimerSetTolerance_ADDR, CFRunLoopTimerSetTolerance_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFRunLoopTimerSetTolerance(arg0: MemorySegment, arg1: Double): Unit {
    try {
        CFRunLoopTimerSetTolerance_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFSocketGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFSocketGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketGetTypeID").orElseThrow()
private val CFSocketGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketGetTypeID_ADDR, CFSocketGetTypeID_DESC)

fun CFSocketGetTypeID(): Long {
    try {
        return CFSocketGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCreate typedef CFSocketRef = (Declared(__CFSocket))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef SInt32 = Int,typedef SInt32 = Int,typedef SInt32 = Int,typedef CFOptionFlags = UNSIGNED = Long,typedef CFSocketCallBack = (Void((Declared(__CFSocket))*,Declared(CFSocketCallBackType),(Declared(__CFData))*,(Void)*,(Void)*))*,(typedef CFSocketContext = Declared(CFSocketContext))*)
 */
private val CFSocketCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCreate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCreate").orElseThrow()
private val CFSocketCreate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCreate_ADDR, CFSocketCreate_DESC)

fun CFSocketCreate(arg0: MemorySegment, arg1: Int, arg2: Int, arg3: Int, arg4: Long, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CFSocketCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCreateWithNative typedef CFSocketRef = (Declared(__CFSocket))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFSocketNativeHandle = Int,typedef CFOptionFlags = UNSIGNED = Long,typedef CFSocketCallBack = (Void((Declared(__CFSocket))*,Declared(CFSocketCallBackType),(Declared(__CFData))*,(Void)*,(Void)*))*,(typedef CFSocketContext = Declared(CFSocketContext))*)
 */
private val CFSocketCreateWithNative_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCreateWithNative_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCreateWithNative").orElseThrow()
private val CFSocketCreateWithNative_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCreateWithNative_ADDR, CFSocketCreateWithNative_DESC)

fun CFSocketCreateWithNative(arg0: MemorySegment, arg1: Int, arg2: Long, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFSocketCreateWithNative_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCreateWithSocketSignature typedef CFSocketRef = (Declared(__CFSocket))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFSocketCallBack = (Void((Declared(__CFSocket))*,Declared(CFSocketCallBackType),(Declared(__CFData))*,(Void)*,(Void)*))*,(typedef CFSocketContext = Declared(CFSocketContext))*)
 */
private val CFSocketCreateWithSocketSignature_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCreateWithSocketSignature_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCreateWithSocketSignature").orElseThrow()
private val CFSocketCreateWithSocketSignature_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCreateWithSocketSignature_ADDR, CFSocketCreateWithSocketSignature_DESC)

fun CFSocketCreateWithSocketSignature(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFSocketCreateWithSocketSignature_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCreateConnectedToSocketSignature typedef CFSocketRef = (Declared(__CFSocket))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFSocketCallBack = (Void((Declared(__CFSocket))*,Declared(CFSocketCallBackType),(Declared(__CFData))*,(Void)*,(Void)*))*,(typedef CFSocketContext = Declared(CFSocketContext))*,typedef CFTimeInterval = Double)
 */
private val CFSocketCreateConnectedToSocketSignature_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFSocketCreateConnectedToSocketSignature_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCreateConnectedToSocketSignature").orElseThrow()
private val CFSocketCreateConnectedToSocketSignature_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCreateConnectedToSocketSignature_ADDR, CFSocketCreateConnectedToSocketSignature_DESC)

fun CFSocketCreateConnectedToSocketSignature(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment, arg4: MemorySegment, arg5: Double): MemorySegment {
    try {
        return CFSocketCreateConnectedToSocketSignature_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketSetAddress typedef CFSocketError = Declared(CFSocketError)(typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFDataRef = (Declared(__CFData))*)
 */
private val CFSocketSetAddress_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketSetAddress_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketSetAddress").orElseThrow()
private val CFSocketSetAddress_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketSetAddress_ADDR, CFSocketSetAddress_DESC)

fun CFSocketSetAddress(arg0: MemorySegment, arg1: MemorySegment): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketSetAddress_HANDLE.invokeExact(arg0, arg1) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketConnectToAddress typedef CFSocketError = Declared(CFSocketError)(typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFTimeInterval = Double)
 */
private val CFSocketConnectToAddress_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFSocketConnectToAddress_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketConnectToAddress").orElseThrow()
private val CFSocketConnectToAddress_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketConnectToAddress_ADDR, CFSocketConnectToAddress_DESC)

fun CFSocketConnectToAddress(arg0: MemorySegment, arg1: MemorySegment, arg2: Double): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketConnectToAddress_HANDLE.invokeExact(arg0, arg1, arg2) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketInvalidate Void(typedef CFSocketRef = (Declared(__CFSocket))*)
 */
private val CFSocketInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFSocketInvalidate_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketInvalidate").orElseThrow()
private val CFSocketInvalidate_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketInvalidate_ADDR, CFSocketInvalidate_DESC)

fun CFSocketInvalidate(arg0: MemorySegment): Unit {
    try {
        CFSocketInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketIsValid typedef Boolean = UNSIGNED = Char(typedef CFSocketRef = (Declared(__CFSocket))*)
 */
private val CFSocketIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFSocketIsValid_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketIsValid").orElseThrow()
private val CFSocketIsValid_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketIsValid_ADDR, CFSocketIsValid_DESC)

fun CFSocketIsValid(arg0: MemorySegment): Byte {
    try {
        return CFSocketIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCopyAddress typedef CFDataRef = (Declared(__CFData))*(typedef CFSocketRef = (Declared(__CFSocket))*)
 */
private val CFSocketCopyAddress_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCopyAddress_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCopyAddress").orElseThrow()
private val CFSocketCopyAddress_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCopyAddress_ADDR, CFSocketCopyAddress_DESC)

fun CFSocketCopyAddress(arg0: MemorySegment): MemorySegment {
    try {
        return CFSocketCopyAddress_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCopyPeerAddress typedef CFDataRef = (Declared(__CFData))*(typedef CFSocketRef = (Declared(__CFSocket))*)
 */
private val CFSocketCopyPeerAddress_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCopyPeerAddress_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCopyPeerAddress").orElseThrow()
private val CFSocketCopyPeerAddress_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCopyPeerAddress_ADDR, CFSocketCopyPeerAddress_DESC)

fun CFSocketCopyPeerAddress(arg0: MemorySegment): MemorySegment {
    try {
        return CFSocketCopyPeerAddress_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketGetContext Void(typedef CFSocketRef = (Declared(__CFSocket))*,(typedef CFSocketContext = Declared(CFSocketContext))*)
 */
private val CFSocketGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketGetContext_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketGetContext").orElseThrow()
private val CFSocketGetContext_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketGetContext_ADDR, CFSocketGetContext_DESC)

fun CFSocketGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFSocketGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketGetNative typedef CFSocketNativeHandle = Int(typedef CFSocketRef = (Declared(__CFSocket))*)
 */
private val CFSocketGetNative_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFSocketGetNative_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketGetNative").orElseThrow()
private val CFSocketGetNative_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketGetNative_ADDR, CFSocketGetNative_DESC)

fun CFSocketGetNative(arg0: MemorySegment): Int {
    try {
        return CFSocketGetNative_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCreateRunLoopSource typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFIndex = Long)
 */
private val CFSocketCreateRunLoopSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFSocketCreateRunLoopSource_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCreateRunLoopSource").orElseThrow()
private val CFSocketCreateRunLoopSource_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCreateRunLoopSource_ADDR, CFSocketCreateRunLoopSource_DESC)

fun CFSocketCreateRunLoopSource(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFSocketCreateRunLoopSource_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketGetSocketFlags typedef CFOptionFlags = UNSIGNED = Long(typedef CFSocketRef = (Declared(__CFSocket))*)
 */
private val CFSocketGetSocketFlags_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFSocketGetSocketFlags_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketGetSocketFlags").orElseThrow()
private val CFSocketGetSocketFlags_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketGetSocketFlags_ADDR, CFSocketGetSocketFlags_DESC)

fun CFSocketGetSocketFlags(arg0: MemorySegment): Long {
    try {
        return CFSocketGetSocketFlags_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketSetSocketFlags Void(typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFSocketSetSocketFlags_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFSocketSetSocketFlags_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketSetSocketFlags").orElseThrow()
private val CFSocketSetSocketFlags_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketSetSocketFlags_ADDR, CFSocketSetSocketFlags_DESC)

fun CFSocketSetSocketFlags(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFSocketSetSocketFlags_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketDisableCallBacks Void(typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFSocketDisableCallBacks_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFSocketDisableCallBacks_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketDisableCallBacks").orElseThrow()
private val CFSocketDisableCallBacks_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketDisableCallBacks_ADDR, CFSocketDisableCallBacks_DESC)

fun CFSocketDisableCallBacks(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFSocketDisableCallBacks_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketEnableCallBacks Void(typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFSocketEnableCallBacks_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFSocketEnableCallBacks_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketEnableCallBacks").orElseThrow()
private val CFSocketEnableCallBacks_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketEnableCallBacks_ADDR, CFSocketEnableCallBacks_DESC)

fun CFSocketEnableCallBacks(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFSocketEnableCallBacks_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketSendData typedef CFSocketError = Declared(CFSocketError)(typedef CFSocketRef = (Declared(__CFSocket))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFTimeInterval = Double)
 */
private val CFSocketSendData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
private val CFSocketSendData_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketSendData").orElseThrow()
private val CFSocketSendData_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketSendData_ADDR, CFSocketSendData_DESC)

fun CFSocketSendData(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Double): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketSendData_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketRegisterValue typedef CFSocketError = Declared(CFSocketError)((typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFTimeInterval = Double,typedef CFStringRef = (Declared(__CFString))*,typedef CFPropertyListRef = (Void)*)
 */
private val CFSocketRegisterValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketRegisterValue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketRegisterValue").orElseThrow()
private val CFSocketRegisterValue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketRegisterValue_ADDR, CFSocketRegisterValue_DESC)

fun CFSocketRegisterValue(arg0: MemorySegment, arg1: Double, arg2: MemorySegment, arg3: MemorySegment): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketRegisterValue_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCopyRegisteredValue typedef CFSocketError = Declared(CFSocketError)((typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFTimeInterval = Double,typedef CFStringRef = (Declared(__CFString))*,(typedef CFPropertyListRef = (Void)*)*,(typedef CFDataRef = (Declared(__CFData))*)*)
 */
private val CFSocketCopyRegisteredValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCopyRegisteredValue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCopyRegisteredValue").orElseThrow()
private val CFSocketCopyRegisteredValue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCopyRegisteredValue_ADDR, CFSocketCopyRegisteredValue_DESC)

fun CFSocketCopyRegisteredValue(arg0: MemorySegment, arg1: Double, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketCopyRegisteredValue_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketRegisterSocketSignature typedef CFSocketError = Declared(CFSocketError)((typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFTimeInterval = Double,typedef CFStringRef = (Declared(__CFString))*,(typedef CFSocketSignature = Declared(CFSocketSignature))*)
 */
private val CFSocketRegisterSocketSignature_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketRegisterSocketSignature_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketRegisterSocketSignature").orElseThrow()
private val CFSocketRegisterSocketSignature_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketRegisterSocketSignature_ADDR, CFSocketRegisterSocketSignature_DESC)

fun CFSocketRegisterSocketSignature(arg0: MemorySegment, arg1: Double, arg2: MemorySegment, arg3: MemorySegment): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketRegisterSocketSignature_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketCopyRegisteredSocketSignature typedef CFSocketError = Declared(CFSocketError)((typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFTimeInterval = Double,typedef CFStringRef = (Declared(__CFString))*,(typedef CFSocketSignature = Declared(CFSocketSignature))*,(typedef CFDataRef = (Declared(__CFData))*)*)
 */
private val CFSocketCopyRegisteredSocketSignature_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSocketCopyRegisteredSocketSignature_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketCopyRegisteredSocketSignature").orElseThrow()
private val CFSocketCopyRegisteredSocketSignature_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketCopyRegisteredSocketSignature_ADDR, CFSocketCopyRegisteredSocketSignature_DESC)

fun CFSocketCopyRegisteredSocketSignature(arg0: MemorySegment, arg1: Double, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketCopyRegisteredSocketSignature_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketUnregister typedef CFSocketError = Declared(CFSocketError)((typedef CFSocketSignature = Declared(CFSocketSignature))*,typedef CFTimeInterval = Double,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFSocketUnregister_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFSocketUnregister_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketUnregister").orElseThrow()
private val CFSocketUnregister_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketUnregister_ADDR, CFSocketUnregister_DESC)

fun CFSocketUnregister(arg0: MemorySegment, arg1: Double, arg2: MemorySegment): CFSocketError {
    try {
        return CFSocketError.fromValue(CFSocketUnregister_HANDLE.invokeExact(arg0, arg1, arg2) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketSetDefaultNameRegistryPortNumber Void(typedef UInt16 = UNSIGNED = Short)
 */
private val CFSocketSetDefaultNameRegistryPortNumber_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT)
private val CFSocketSetDefaultNameRegistryPortNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketSetDefaultNameRegistryPortNumber").orElseThrow()
private val CFSocketSetDefaultNameRegistryPortNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketSetDefaultNameRegistryPortNumber_ADDR, CFSocketSetDefaultNameRegistryPortNumber_DESC)

fun CFSocketSetDefaultNameRegistryPortNumber(arg0: Short): Unit {
    try {
        CFSocketSetDefaultNameRegistryPortNumber_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSocketGetDefaultNameRegistryPortNumber typedef UInt16 = UNSIGNED = Short()
 */
private val CFSocketGetDefaultNameRegistryPortNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_SHORT)
private val CFSocketGetDefaultNameRegistryPortNumber_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFSocketGetDefaultNameRegistryPortNumber").orElseThrow()
private val CFSocketGetDefaultNameRegistryPortNumber_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFSocketGetDefaultNameRegistryPortNumber_ADDR, CFSocketGetDefaultNameRegistryPortNumber_DESC)

fun CFSocketGetDefaultNameRegistryPortNumber(): Short {
    try {
        return CFSocketGetDefaultNameRegistryPortNumber_HANDLE.invokeExact() as Short
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFSocketCommandKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketCommandKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketCommandKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketCommandKey").orElseThrow().reinterpret(kCFSocketCommandKey_LAYOUT.byteSize()) }
private val kCFSocketCommandKey_VH: VarHandle by lazy { kCFSocketCommandKey_LAYOUT.varHandle() }

var kCFSocketCommandKey: MemorySegment
    get() = kCFSocketCommandKey_VH.get(kCFSocketCommandKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketCommandKey_VH.set(kCFSocketCommandKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFSocketNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketNameKey").orElseThrow().reinterpret(kCFSocketNameKey_LAYOUT.byteSize()) }
private val kCFSocketNameKey_VH: VarHandle by lazy { kCFSocketNameKey_LAYOUT.varHandle() }

var kCFSocketNameKey: MemorySegment
    get() = kCFSocketNameKey_VH.get(kCFSocketNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketNameKey_VH.set(kCFSocketNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFSocketValueKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketValueKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketValueKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketValueKey").orElseThrow().reinterpret(kCFSocketValueKey_LAYOUT.byteSize()) }
private val kCFSocketValueKey_VH: VarHandle by lazy { kCFSocketValueKey_LAYOUT.varHandle() }

var kCFSocketValueKey: MemorySegment
    get() = kCFSocketValueKey_VH.get(kCFSocketValueKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketValueKey_VH.set(kCFSocketValueKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFSocketResultKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketResultKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketResultKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketResultKey").orElseThrow().reinterpret(kCFSocketResultKey_LAYOUT.byteSize()) }
private val kCFSocketResultKey_VH: VarHandle by lazy { kCFSocketResultKey_LAYOUT.varHandle() }

var kCFSocketResultKey: MemorySegment
    get() = kCFSocketResultKey_VH.get(kCFSocketResultKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketResultKey_VH.set(kCFSocketResultKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFSocketErrorKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketErrorKey").orElseThrow().reinterpret(kCFSocketErrorKey_LAYOUT.byteSize()) }
private val kCFSocketErrorKey_VH: VarHandle by lazy { kCFSocketErrorKey_LAYOUT.varHandle() }

var kCFSocketErrorKey: MemorySegment
    get() = kCFSocketErrorKey_VH.get(kCFSocketErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketErrorKey_VH.set(kCFSocketErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFSocketRegisterCommand typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketRegisterCommand_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketRegisterCommand_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketRegisterCommand").orElseThrow().reinterpret(kCFSocketRegisterCommand_LAYOUT.byteSize()) }
private val kCFSocketRegisterCommand_VH: VarHandle by lazy { kCFSocketRegisterCommand_LAYOUT.varHandle() }

var kCFSocketRegisterCommand: MemorySegment
    get() = kCFSocketRegisterCommand_VH.get(kCFSocketRegisterCommand_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketRegisterCommand_VH.set(kCFSocketRegisterCommand_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFSocketRetrieveCommand typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFSocketRetrieveCommand_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFSocketRetrieveCommand_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFSocketRetrieveCommand").orElseThrow().reinterpret(kCFSocketRetrieveCommand_LAYOUT.byteSize()) }
private val kCFSocketRetrieveCommand_VH: VarHandle by lazy { kCFSocketRetrieveCommand_LAYOUT.varHandle() }

var kCFSocketRetrieveCommand: MemorySegment
    get() = kCFSocketRetrieveCommand_VH.get(kCFSocketRetrieveCommand_SEGMENT, 0L) as MemorySegment
    set(value) = kCFSocketRetrieveCommand_VH.set(kCFSocketRetrieveCommand_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFReadStreamGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFReadStreamGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFReadStreamGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamGetTypeID").orElseThrow()
private val CFReadStreamGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamGetTypeID_ADDR, CFReadStreamGetTypeID_DESC)

fun CFReadStreamGetTypeID(): Long {
    try {
        return CFReadStreamGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFWriteStreamGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFWriteStreamGetTypeID_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamGetTypeID").orElseThrow()
private val CFWriteStreamGetTypeID_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamGetTypeID_ADDR, CFWriteStreamGetTypeID_DESC)

fun CFWriteStreamGetTypeID(): Long {
    try {
        return CFWriteStreamGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFStreamPropertyDataWritten typedef CFStreamPropertyKey = (Declared(__CFString))*
 */
private val kCFStreamPropertyDataWritten_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertyDataWritten_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertyDataWritten").orElseThrow().reinterpret(kCFStreamPropertyDataWritten_LAYOUT.byteSize()) }
private val kCFStreamPropertyDataWritten_VH: VarHandle by lazy { kCFStreamPropertyDataWritten_LAYOUT.varHandle() }

var kCFStreamPropertyDataWritten: MemorySegment
    get() = kCFStreamPropertyDataWritten_VH.get(kCFStreamPropertyDataWritten_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertyDataWritten_VH.set(kCFStreamPropertyDataWritten_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFReadStreamCreateWithBytesNoCopy typedef CFReadStreamRef = (Declared(__CFReadStream))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long,typedef CFAllocatorRef = (Declared(__CFAllocator))*)
 */
private val CFReadStreamCreateWithBytesNoCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFReadStreamCreateWithBytesNoCopy_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamCreateWithBytesNoCopy").orElseThrow()
private val CFReadStreamCreateWithBytesNoCopy_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamCreateWithBytesNoCopy_ADDR, CFReadStreamCreateWithBytesNoCopy_DESC)

fun CFReadStreamCreateWithBytesNoCopy(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return CFReadStreamCreateWithBytesNoCopy_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamCreateWithBuffer typedef CFWriteStreamRef = (Declared(__CFWriteStream))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long)
 */
private val CFWriteStreamCreateWithBuffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFWriteStreamCreateWithBuffer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamCreateWithBuffer").orElseThrow()
private val CFWriteStreamCreateWithBuffer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamCreateWithBuffer_ADDR, CFWriteStreamCreateWithBuffer_DESC)

fun CFWriteStreamCreateWithBuffer(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFWriteStreamCreateWithBuffer_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamCreateWithAllocatedBuffers typedef CFWriteStreamRef = (Declared(__CFWriteStream))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFAllocatorRef = (Declared(__CFAllocator))*)
 */
private val CFWriteStreamCreateWithAllocatedBuffers_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamCreateWithAllocatedBuffers_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamCreateWithAllocatedBuffers").orElseThrow()
private val CFWriteStreamCreateWithAllocatedBuffers_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamCreateWithAllocatedBuffers_ADDR, CFWriteStreamCreateWithAllocatedBuffers_DESC)

fun CFWriteStreamCreateWithAllocatedBuffers(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFWriteStreamCreateWithAllocatedBuffers_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamCreateWithFile typedef CFReadStreamRef = (Declared(__CFReadStream))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFReadStreamCreateWithFile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamCreateWithFile_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamCreateWithFile").orElseThrow()
private val CFReadStreamCreateWithFile_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamCreateWithFile_ADDR, CFReadStreamCreateWithFile_DESC)

fun CFReadStreamCreateWithFile(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFReadStreamCreateWithFile_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamCreateWithFile typedef CFWriteStreamRef = (Declared(__CFWriteStream))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFWriteStreamCreateWithFile_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamCreateWithFile_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamCreateWithFile").orElseThrow()
private val CFWriteStreamCreateWithFile_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamCreateWithFile_ADDR, CFWriteStreamCreateWithFile_DESC)

fun CFWriteStreamCreateWithFile(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFWriteStreamCreateWithFile_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStreamCreateBoundPair Void(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef CFReadStreamRef = (Declared(__CFReadStream))*)*,(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)*,typedef CFIndex = Long)
 */
private val CFStreamCreateBoundPair_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStreamCreateBoundPair_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFStreamCreateBoundPair").orElseThrow()
private val CFStreamCreateBoundPair_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFStreamCreateBoundPair_ADDR, CFStreamCreateBoundPair_DESC)

fun CFStreamCreateBoundPair(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): Unit {
    try {
        CFStreamCreateBoundPair_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFStreamPropertyAppendToFile typedef CFStreamPropertyKey = (Declared(__CFString))*
 */
private val kCFStreamPropertyAppendToFile_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertyAppendToFile_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertyAppendToFile").orElseThrow().reinterpret(kCFStreamPropertyAppendToFile_LAYOUT.byteSize()) }
private val kCFStreamPropertyAppendToFile_VH: VarHandle by lazy { kCFStreamPropertyAppendToFile_LAYOUT.varHandle() }

var kCFStreamPropertyAppendToFile: MemorySegment
    get() = kCFStreamPropertyAppendToFile_VH.get(kCFStreamPropertyAppendToFile_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertyAppendToFile_VH.set(kCFStreamPropertyAppendToFile_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertyFileCurrentOffset typedef CFStreamPropertyKey = (Declared(__CFString))*
 */
private val kCFStreamPropertyFileCurrentOffset_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertyFileCurrentOffset_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertyFileCurrentOffset").orElseThrow().reinterpret(kCFStreamPropertyFileCurrentOffset_LAYOUT.byteSize()) }
private val kCFStreamPropertyFileCurrentOffset_VH: VarHandle by lazy { kCFStreamPropertyFileCurrentOffset_LAYOUT.varHandle() }

var kCFStreamPropertyFileCurrentOffset: MemorySegment
    get() = kCFStreamPropertyFileCurrentOffset_VH.get(kCFStreamPropertyFileCurrentOffset_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertyFileCurrentOffset_VH.set(kCFStreamPropertyFileCurrentOffset_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySocketNativeHandle typedef CFStreamPropertyKey = (Declared(__CFString))*
 */
private val kCFStreamPropertySocketNativeHandle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySocketNativeHandle_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySocketNativeHandle").orElseThrow().reinterpret(kCFStreamPropertySocketNativeHandle_LAYOUT.byteSize()) }
private val kCFStreamPropertySocketNativeHandle_VH: VarHandle by lazy { kCFStreamPropertySocketNativeHandle_LAYOUT.varHandle() }

var kCFStreamPropertySocketNativeHandle: MemorySegment
    get() = kCFStreamPropertySocketNativeHandle_VH.get(kCFStreamPropertySocketNativeHandle_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySocketNativeHandle_VH.set(kCFStreamPropertySocketNativeHandle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySocketRemoteHostName typedef CFStreamPropertyKey = (Declared(__CFString))*
 */
private val kCFStreamPropertySocketRemoteHostName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySocketRemoteHostName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySocketRemoteHostName").orElseThrow().reinterpret(kCFStreamPropertySocketRemoteHostName_LAYOUT.byteSize()) }
private val kCFStreamPropertySocketRemoteHostName_VH: VarHandle by lazy { kCFStreamPropertySocketRemoteHostName_LAYOUT.varHandle() }

var kCFStreamPropertySocketRemoteHostName: MemorySegment
    get() = kCFStreamPropertySocketRemoteHostName_VH.get(kCFStreamPropertySocketRemoteHostName_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySocketRemoteHostName_VH.set(kCFStreamPropertySocketRemoteHostName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySocketRemotePortNumber typedef CFStreamPropertyKey = (Declared(__CFString))*
 */
private val kCFStreamPropertySocketRemotePortNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySocketRemotePortNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySocketRemotePortNumber").orElseThrow().reinterpret(kCFStreamPropertySocketRemotePortNumber_LAYOUT.byteSize()) }
private val kCFStreamPropertySocketRemotePortNumber_VH: VarHandle by lazy { kCFStreamPropertySocketRemotePortNumber_LAYOUT.varHandle() }

var kCFStreamPropertySocketRemotePortNumber: MemorySegment
    get() = kCFStreamPropertySocketRemotePortNumber_VH.get(kCFStreamPropertySocketRemotePortNumber_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySocketRemotePortNumber_VH.set(kCFStreamPropertySocketRemotePortNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamErrorDomainSOCKS Int
 */
private val kCFStreamErrorDomainSOCKS_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCFStreamErrorDomainSOCKS_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamErrorDomainSOCKS").orElseThrow().reinterpret(kCFStreamErrorDomainSOCKS_LAYOUT.byteSize()) }
private val kCFStreamErrorDomainSOCKS_VH: VarHandle by lazy { kCFStreamErrorDomainSOCKS_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var kCFStreamErrorDomainSOCKS: Int
    get() = kCFStreamErrorDomainSOCKS_VH.get(kCFStreamErrorDomainSOCKS_SEGMENT, 0L) as Int
    set(value) = kCFStreamErrorDomainSOCKS_VH.set(kCFStreamErrorDomainSOCKS_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySOCKSProxy typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySOCKSProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySOCKSProxy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySOCKSProxy").orElseThrow().reinterpret(kCFStreamPropertySOCKSProxy_LAYOUT.byteSize()) }
private val kCFStreamPropertySOCKSProxy_VH: VarHandle by lazy { kCFStreamPropertySOCKSProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySOCKSProxy: MemorySegment
    get() = kCFStreamPropertySOCKSProxy_VH.get(kCFStreamPropertySOCKSProxy_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySOCKSProxy_VH.set(kCFStreamPropertySOCKSProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySOCKSProxyHost typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySOCKSProxyHost_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySOCKSProxyHost_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySOCKSProxyHost").orElseThrow().reinterpret(kCFStreamPropertySOCKSProxyHost_LAYOUT.byteSize()) }
private val kCFStreamPropertySOCKSProxyHost_VH: VarHandle by lazy { kCFStreamPropertySOCKSProxyHost_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySOCKSProxyHost: MemorySegment
    get() = kCFStreamPropertySOCKSProxyHost_VH.get(kCFStreamPropertySOCKSProxyHost_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySOCKSProxyHost_VH.set(kCFStreamPropertySOCKSProxyHost_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySOCKSProxyPort typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySOCKSProxyPort_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySOCKSProxyPort_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySOCKSProxyPort").orElseThrow().reinterpret(kCFStreamPropertySOCKSProxyPort_LAYOUT.byteSize()) }
private val kCFStreamPropertySOCKSProxyPort_VH: VarHandle by lazy { kCFStreamPropertySOCKSProxyPort_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySOCKSProxyPort: MemorySegment
    get() = kCFStreamPropertySOCKSProxyPort_VH.get(kCFStreamPropertySOCKSProxyPort_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySOCKSProxyPort_VH.set(kCFStreamPropertySOCKSProxyPort_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySOCKSVersion typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySOCKSVersion_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySOCKSVersion_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySOCKSVersion").orElseThrow().reinterpret(kCFStreamPropertySOCKSVersion_LAYOUT.byteSize()) }
private val kCFStreamPropertySOCKSVersion_VH: VarHandle by lazy { kCFStreamPropertySOCKSVersion_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySOCKSVersion: MemorySegment
    get() = kCFStreamPropertySOCKSVersion_VH.get(kCFStreamPropertySOCKSVersion_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySOCKSVersion_VH.set(kCFStreamPropertySOCKSVersion_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSOCKSVersion4 typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSOCKSVersion4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSOCKSVersion4_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSOCKSVersion4").orElseThrow().reinterpret(kCFStreamSocketSOCKSVersion4_LAYOUT.byteSize()) }
private val kCFStreamSocketSOCKSVersion4_VH: VarHandle by lazy { kCFStreamSocketSOCKSVersion4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamSocketSOCKSVersion4: MemorySegment
    get() = kCFStreamSocketSOCKSVersion4_VH.get(kCFStreamSocketSOCKSVersion4_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSOCKSVersion4_VH.set(kCFStreamSocketSOCKSVersion4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSOCKSVersion5 typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSOCKSVersion5_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSOCKSVersion5_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSOCKSVersion5").orElseThrow().reinterpret(kCFStreamSocketSOCKSVersion5_LAYOUT.byteSize()) }
private val kCFStreamSocketSOCKSVersion5_VH: VarHandle by lazy { kCFStreamSocketSOCKSVersion5_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamSocketSOCKSVersion5: MemorySegment
    get() = kCFStreamSocketSOCKSVersion5_VH.get(kCFStreamSocketSOCKSVersion5_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSOCKSVersion5_VH.set(kCFStreamSocketSOCKSVersion5_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySOCKSUser typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySOCKSUser_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySOCKSUser_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySOCKSUser").orElseThrow().reinterpret(kCFStreamPropertySOCKSUser_LAYOUT.byteSize()) }
private val kCFStreamPropertySOCKSUser_VH: VarHandle by lazy { kCFStreamPropertySOCKSUser_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySOCKSUser: MemorySegment
    get() = kCFStreamPropertySOCKSUser_VH.get(kCFStreamPropertySOCKSUser_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySOCKSUser_VH.set(kCFStreamPropertySOCKSUser_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySOCKSPassword typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySOCKSPassword_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySOCKSPassword_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySOCKSPassword").orElseThrow().reinterpret(kCFStreamPropertySOCKSPassword_LAYOUT.byteSize()) }
private val kCFStreamPropertySOCKSPassword_VH: VarHandle by lazy { kCFStreamPropertySOCKSPassword_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySOCKSPassword: MemorySegment
    get() = kCFStreamPropertySOCKSPassword_VH.get(kCFStreamPropertySOCKSPassword_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySOCKSPassword_VH.set(kCFStreamPropertySOCKSPassword_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamErrorDomainSSL Int
 */
private val kCFStreamErrorDomainSSL_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_INT }
private val kCFStreamErrorDomainSSL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamErrorDomainSSL").orElseThrow().reinterpret(kCFStreamErrorDomainSSL_LAYOUT.byteSize()) }
private val kCFStreamErrorDomainSSL_VH: VarHandle by lazy { kCFStreamErrorDomainSSL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamErrorDomainSSL: Int
    get() = kCFStreamErrorDomainSSL_VH.get(kCFStreamErrorDomainSSL_SEGMENT, 0L) as Int
    set(value) = kCFStreamErrorDomainSSL_VH.set(kCFStreamErrorDomainSSL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertySocketSecurityLevel typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertySocketSecurityLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertySocketSecurityLevel_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertySocketSecurityLevel").orElseThrow().reinterpret(kCFStreamPropertySocketSecurityLevel_LAYOUT.byteSize()) }
private val kCFStreamPropertySocketSecurityLevel_VH: VarHandle by lazy { kCFStreamPropertySocketSecurityLevel_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertySocketSecurityLevel: MemorySegment
    get() = kCFStreamPropertySocketSecurityLevel_VH.get(kCFStreamPropertySocketSecurityLevel_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertySocketSecurityLevel_VH.set(kCFStreamPropertySocketSecurityLevel_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSecurityLevelNone typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSecurityLevelNone_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSecurityLevelNone_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSecurityLevelNone").orElseThrow().reinterpret(kCFStreamSocketSecurityLevelNone_LAYOUT.byteSize()) }
private val kCFStreamSocketSecurityLevelNone_VH: VarHandle by lazy { kCFStreamSocketSecurityLevelNone_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamSocketSecurityLevelNone: MemorySegment
    get() = kCFStreamSocketSecurityLevelNone_VH.get(kCFStreamSocketSecurityLevelNone_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSecurityLevelNone_VH.set(kCFStreamSocketSecurityLevelNone_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSecurityLevelSSLv2 typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSecurityLevelSSLv2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSecurityLevelSSLv2_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSecurityLevelSSLv2").orElseThrow().reinterpret(kCFStreamSocketSecurityLevelSSLv2_LAYOUT.byteSize()) }
private val kCFStreamSocketSecurityLevelSSLv2_VH: VarHandle by lazy { kCFStreamSocketSecurityLevelSSLv2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1)
var kCFStreamSocketSecurityLevelSSLv2: MemorySegment
    get() = kCFStreamSocketSecurityLevelSSLv2_VH.get(kCFStreamSocketSecurityLevelSSLv2_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSecurityLevelSSLv2_VH.set(kCFStreamSocketSecurityLevelSSLv2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSecurityLevelSSLv3 typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSecurityLevelSSLv3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSecurityLevelSSLv3_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSecurityLevelSSLv3").orElseThrow().reinterpret(kCFStreamSocketSecurityLevelSSLv3_LAYOUT.byteSize()) }
private val kCFStreamSocketSecurityLevelSSLv3_VH: VarHandle by lazy { kCFStreamSocketSecurityLevelSSLv3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1)
var kCFStreamSocketSecurityLevelSSLv3: MemorySegment
    get() = kCFStreamSocketSecurityLevelSSLv3_VH.get(kCFStreamSocketSecurityLevelSSLv3_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSecurityLevelSSLv3_VH.set(kCFStreamSocketSecurityLevelSSLv3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSecurityLevelTLSv1 typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSecurityLevelTLSv1_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSecurityLevelTLSv1_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSecurityLevelTLSv1").orElseThrow().reinterpret(kCFStreamSocketSecurityLevelTLSv1_LAYOUT.byteSize()) }
private val kCFStreamSocketSecurityLevelTLSv1_VH: VarHandle by lazy { kCFStreamSocketSecurityLevelTLSv1_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamSocketSecurityLevelTLSv1: MemorySegment
    get() = kCFStreamSocketSecurityLevelTLSv1_VH.get(kCFStreamSocketSecurityLevelTLSv1_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSecurityLevelTLSv1_VH.set(kCFStreamSocketSecurityLevelTLSv1_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamSocketSecurityLevelNegotiatedSSL typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamSocketSecurityLevelNegotiatedSSL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamSocketSecurityLevelNegotiatedSSL_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamSocketSecurityLevelNegotiatedSSL").orElseThrow().reinterpret(kCFStreamSocketSecurityLevelNegotiatedSSL_LAYOUT.byteSize()) }
private val kCFStreamSocketSecurityLevelNegotiatedSSL_VH: VarHandle by lazy { kCFStreamSocketSecurityLevelNegotiatedSSL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamSocketSecurityLevelNegotiatedSSL: MemorySegment
    get() = kCFStreamSocketSecurityLevelNegotiatedSSL_VH.get(kCFStreamSocketSecurityLevelNegotiatedSSL_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamSocketSecurityLevelNegotiatedSSL_VH.set(kCFStreamSocketSecurityLevelNegotiatedSSL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFStreamPropertyShouldCloseNativeSocket typedef CFStringRef = (Declared(__CFString))*
 */
private val kCFStreamPropertyShouldCloseNativeSocket_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFStreamPropertyShouldCloseNativeSocket_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFStreamPropertyShouldCloseNativeSocket").orElseThrow().reinterpret(kCFStreamPropertyShouldCloseNativeSocket_LAYOUT.byteSize()) }
private val kCFStreamPropertyShouldCloseNativeSocket_VH: VarHandle by lazy { kCFStreamPropertyShouldCloseNativeSocket_LAYOUT.varHandle() }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1)
var kCFStreamPropertyShouldCloseNativeSocket: MemorySegment
    get() = kCFStreamPropertyShouldCloseNativeSocket_VH.get(kCFStreamPropertyShouldCloseNativeSocket_SEGMENT, 0L) as MemorySegment
    set(value) = kCFStreamPropertyShouldCloseNativeSocket_VH.set(kCFStreamPropertyShouldCloseNativeSocket_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFStreamCreatePairWithSocket Void(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFSocketNativeHandle = Int,(typedef CFReadStreamRef = (Declared(__CFReadStream))*)*,(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)*)
 */
private val CFStreamCreatePairWithSocket_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStreamCreatePairWithSocket_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFStreamCreatePairWithSocket").orElseThrow()
private val CFStreamCreatePairWithSocket_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFStreamCreatePairWithSocket_ADDR, CFStreamCreatePairWithSocket_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
fun CFStreamCreatePairWithSocket(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: MemorySegment): Unit {
    try {
        CFStreamCreatePairWithSocket_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStreamCreatePairWithSocketToHost Void(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef UInt32 = UNSIGNED = Int,(typedef CFReadStreamRef = (Declared(__CFReadStream))*)*,(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)*)
 */
private val CFStreamCreatePairWithSocketToHost_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStreamCreatePairWithSocketToHost_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFStreamCreatePairWithSocketToHost").orElseThrow()
private val CFStreamCreatePairWithSocketToHost_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFStreamCreatePairWithSocketToHost_ADDR, CFStreamCreatePairWithSocketToHost_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
fun CFStreamCreatePairWithSocketToHost(arg0: MemorySegment, arg1: MemorySegment, arg2: Int, arg3: MemorySegment, arg4: MemorySegment): Unit {
    try {
        CFStreamCreatePairWithSocketToHost_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStreamCreatePairWithPeerSocketSignature Void(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef CFSocketSignature = Declared(CFSocketSignature))*,(typedef CFReadStreamRef = (Declared(__CFReadStream))*)*,(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)*)
 */
private val CFStreamCreatePairWithPeerSocketSignature_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFStreamCreatePairWithPeerSocketSignature_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFStreamCreatePairWithPeerSocketSignature").orElseThrow()
private val CFStreamCreatePairWithPeerSocketSignature_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFStreamCreatePairWithPeerSocketSignature_ADDR, CFStreamCreatePairWithPeerSocketSignature_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use nw_connection_t in Network framework instead")
fun CFStreamCreatePairWithPeerSocketSignature(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Unit {
    try {
        CFStreamCreatePairWithPeerSocketSignature_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamGetStatus typedef CFStreamStatus = Declared(CFStreamStatus)(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamGetStatus_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFReadStreamGetStatus_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamGetStatus").orElseThrow()
private val CFReadStreamGetStatus_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamGetStatus_ADDR, CFReadStreamGetStatus_DESC)

fun CFReadStreamGetStatus(arg0: MemorySegment): CFStreamStatus {
    try {
        return CFStreamStatus.fromValue(CFReadStreamGetStatus_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamGetStatus typedef CFStreamStatus = Declared(CFStreamStatus)(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamGetStatus_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFWriteStreamGetStatus_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamGetStatus").orElseThrow()
private val CFWriteStreamGetStatus_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamGetStatus_ADDR, CFWriteStreamGetStatus_DESC)

fun CFWriteStreamGetStatus(arg0: MemorySegment): CFStreamStatus {
    try {
        return CFStreamStatus.fromValue(CFWriteStreamGetStatus_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamCopyError typedef CFErrorRef = (Declared(__CFError))*(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamCopyError_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamCopyError_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamCopyError").orElseThrow()
private val CFReadStreamCopyError_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamCopyError_ADDR, CFReadStreamCopyError_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFReadStreamCopyError(arg0: MemorySegment): MemorySegment {
    try {
        return CFReadStreamCopyError_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamCopyError typedef CFErrorRef = (Declared(__CFError))*(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamCopyError_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamCopyError_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamCopyError").orElseThrow()
private val CFWriteStreamCopyError_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamCopyError_ADDR, CFWriteStreamCopyError_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFWriteStreamCopyError(arg0: MemorySegment): MemorySegment {
    try {
        return CFWriteStreamCopyError_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamOpen typedef Boolean = UNSIGNED = Char(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamOpen_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFReadStreamOpen_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamOpen").orElseThrow()
private val CFReadStreamOpen_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamOpen_ADDR, CFReadStreamOpen_DESC)

fun CFReadStreamOpen(arg0: MemorySegment): Byte {
    try {
        return CFReadStreamOpen_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamOpen typedef Boolean = UNSIGNED = Char(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamOpen_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFWriteStreamOpen_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamOpen").orElseThrow()
private val CFWriteStreamOpen_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamOpen_ADDR, CFWriteStreamOpen_DESC)

fun CFWriteStreamOpen(arg0: MemorySegment): Byte {
    try {
        return CFWriteStreamOpen_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamClose Void(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamClose_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFReadStreamClose_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamClose").orElseThrow()
private val CFReadStreamClose_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamClose_ADDR, CFReadStreamClose_DESC)

fun CFReadStreamClose(arg0: MemorySegment): Unit {
    try {
        CFReadStreamClose_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamClose Void(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamClose_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFWriteStreamClose_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamClose").orElseThrow()
private val CFWriteStreamClose_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamClose_ADDR, CFWriteStreamClose_DESC)

fun CFWriteStreamClose(arg0: MemorySegment): Unit {
    try {
        CFWriteStreamClose_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamHasBytesAvailable typedef Boolean = UNSIGNED = Char(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamHasBytesAvailable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFReadStreamHasBytesAvailable_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamHasBytesAvailable").orElseThrow()
private val CFReadStreamHasBytesAvailable_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamHasBytesAvailable_ADDR, CFReadStreamHasBytesAvailable_DESC)

fun CFReadStreamHasBytesAvailable(arg0: MemorySegment): Byte {
    try {
        return CFReadStreamHasBytesAvailable_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamRead typedef CFIndex = Long(typedef CFReadStreamRef = (Declared(__CFReadStream))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long)
 */
private val CFReadStreamRead_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFReadStreamRead_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamRead").orElseThrow()
private val CFReadStreamRead_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamRead_ADDR, CFReadStreamRead_DESC)

fun CFReadStreamRead(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Long {
    try {
        return CFReadStreamRead_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamGetBuffer (typedef UInt8 = UNSIGNED = Char)*(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFIndex = Long,(typedef CFIndex = Long)*)
 */
private val CFReadStreamGetBuffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFReadStreamGetBuffer_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamGetBuffer").orElseThrow()
private val CFReadStreamGetBuffer_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamGetBuffer_ADDR, CFReadStreamGetBuffer_DESC)

fun CFReadStreamGetBuffer(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CFReadStreamGetBuffer_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamCanAcceptBytes typedef Boolean = UNSIGNED = Char(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamCanAcceptBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFWriteStreamCanAcceptBytes_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamCanAcceptBytes").orElseThrow()
private val CFWriteStreamCanAcceptBytes_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamCanAcceptBytes_ADDR, CFWriteStreamCanAcceptBytes_DESC)

fun CFWriteStreamCanAcceptBytes(arg0: MemorySegment): Byte {
    try {
        return CFWriteStreamCanAcceptBytes_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamWrite typedef CFIndex = Long(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,(typedef UInt8 = UNSIGNED = Char)*,typedef CFIndex = Long)
 */
private val CFWriteStreamWrite_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFWriteStreamWrite_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamWrite").orElseThrow()
private val CFWriteStreamWrite_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamWrite_ADDR, CFWriteStreamWrite_DESC)

fun CFWriteStreamWrite(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Long {
    try {
        return CFWriteStreamWrite_HANDLE.invokeExact(arg0, arg1, arg2) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamCopyProperty typedef CFTypeRef = (Void)*(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFStreamPropertyKey = (Declared(__CFString))*)
 */
private val CFReadStreamCopyProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamCopyProperty_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamCopyProperty").orElseThrow()
private val CFReadStreamCopyProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamCopyProperty_ADDR, CFReadStreamCopyProperty_DESC)

fun CFReadStreamCopyProperty(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFReadStreamCopyProperty_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamCopyProperty typedef CFTypeRef = (Void)*(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFStreamPropertyKey = (Declared(__CFString))*)
 */
private val CFWriteStreamCopyProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamCopyProperty_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamCopyProperty").orElseThrow()
private val CFWriteStreamCopyProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamCopyProperty_ADDR, CFWriteStreamCopyProperty_DESC)

fun CFWriteStreamCopyProperty(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFWriteStreamCopyProperty_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamSetProperty typedef Boolean = UNSIGNED = Char(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFStreamPropertyKey = (Declared(__CFString))*,typedef CFTypeRef = (Void)*)
 */
private val CFReadStreamSetProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamSetProperty_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamSetProperty").orElseThrow()
private val CFReadStreamSetProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamSetProperty_ADDR, CFReadStreamSetProperty_DESC)

fun CFReadStreamSetProperty(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFReadStreamSetProperty_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamSetProperty typedef Boolean = UNSIGNED = Char(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFStreamPropertyKey = (Declared(__CFString))*,typedef CFTypeRef = (Void)*)
 */
private val CFWriteStreamSetProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamSetProperty_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamSetProperty").orElseThrow()
private val CFWriteStreamSetProperty_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamSetProperty_ADDR, CFWriteStreamSetProperty_DESC)

fun CFWriteStreamSetProperty(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFWriteStreamSetProperty_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamSetClient typedef Boolean = UNSIGNED = Char(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFReadStreamClientCallBack = (Void((Declared(__CFReadStream))*,Declared(CFStreamEventType),(Void)*))*,(typedef CFStreamClientContext = Declared(CFStreamClientContext))*)
 */
private val CFReadStreamSetClient_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamSetClient_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamSetClient").orElseThrow()
private val CFReadStreamSetClient_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamSetClient_ADDR, CFReadStreamSetClient_DESC)

fun CFReadStreamSetClient(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment): Byte {
    try {
        return CFReadStreamSetClient_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamSetClient typedef Boolean = UNSIGNED = Char(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFWriteStreamClientCallBack = (Void((Declared(__CFWriteStream))*,Declared(CFStreamEventType),(Void)*))*,(typedef CFStreamClientContext = Declared(CFStreamClientContext))*)
 */
private val CFWriteStreamSetClient_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamSetClient_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamSetClient").orElseThrow()
private val CFWriteStreamSetClient_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamSetClient_ADDR, CFWriteStreamSetClient_DESC)

fun CFWriteStreamSetClient(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment): Byte {
    try {
        return CFWriteStreamSetClient_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamScheduleWithRunLoop Void(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFReadStreamScheduleWithRunLoop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamScheduleWithRunLoop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamScheduleWithRunLoop").orElseThrow()
private val CFReadStreamScheduleWithRunLoop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamScheduleWithRunLoop_ADDR, CFReadStreamScheduleWithRunLoop_DESC)

fun CFReadStreamScheduleWithRunLoop(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFReadStreamScheduleWithRunLoop_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamScheduleWithRunLoop Void(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFWriteStreamScheduleWithRunLoop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamScheduleWithRunLoop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamScheduleWithRunLoop").orElseThrow()
private val CFWriteStreamScheduleWithRunLoop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamScheduleWithRunLoop_ADDR, CFWriteStreamScheduleWithRunLoop_DESC)

fun CFWriteStreamScheduleWithRunLoop(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFWriteStreamScheduleWithRunLoop_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamUnscheduleFromRunLoop Void(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFReadStreamUnscheduleFromRunLoop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamUnscheduleFromRunLoop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamUnscheduleFromRunLoop").orElseThrow()
private val CFReadStreamUnscheduleFromRunLoop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamUnscheduleFromRunLoop_ADDR, CFReadStreamUnscheduleFromRunLoop_DESC)

fun CFReadStreamUnscheduleFromRunLoop(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFReadStreamUnscheduleFromRunLoop_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamUnscheduleFromRunLoop Void(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFRunLoopRef = (Declared(__CFRunLoop))*,typedef CFRunLoopMode = (Declared(__CFString))*)
 */
private val CFWriteStreamUnscheduleFromRunLoop_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamUnscheduleFromRunLoop_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamUnscheduleFromRunLoop").orElseThrow()
private val CFWriteStreamUnscheduleFromRunLoop_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamUnscheduleFromRunLoop_ADDR, CFWriteStreamUnscheduleFromRunLoop_DESC)

fun CFWriteStreamUnscheduleFromRunLoop(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFWriteStreamUnscheduleFromRunLoop_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamSetDispatchQueue Void(typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef dispatch_queue_t = (Void)*)
 */
private val CFReadStreamSetDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamSetDispatchQueue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamSetDispatchQueue").orElseThrow()
private val CFReadStreamSetDispatchQueue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamSetDispatchQueue_ADDR, CFReadStreamSetDispatchQueue_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFReadStreamSetDispatchQueue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFReadStreamSetDispatchQueue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamSetDispatchQueue Void(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef dispatch_queue_t = (Void)*)
 */
private val CFWriteStreamSetDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamSetDispatchQueue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFWriteStreamSetDispatchQueue").orElseThrow()
private val CFWriteStreamSetDispatchQueue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFWriteStreamSetDispatchQueue_ADDR, CFWriteStreamSetDispatchQueue_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFWriteStreamSetDispatchQueue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFWriteStreamSetDispatchQueue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamCopyDispatchQueue typedef dispatch_queue_t = (Void)*(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamCopyDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFReadStreamCopyDispatchQueue_ADDR: MemorySegment = SymbolLookup.loaderLookup().find("CFReadStreamCopyDispatchQueue").orElseThrow()
private val CFReadStreamCopyDispatchQueue_HANDLE: MethodHandle = Linker.nativeLinker().downcallHandle(CFReadStreamCopyDispatchQueue_ADDR, CFReadStreamCopyDispatchQueue_DESC)

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFReadStreamCopyDispatchQueue(arg0: MemorySegment): MemorySegment {
    try {
        return CFReadStreamCopyDispatchQueue_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
