@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : CFXMLTreeCreateXMLData typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFXMLTreeRef = (Declared(__CFTree))*)
 */
private val CFXMLTreeCreateXMLData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLTreeCreateXMLData_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFXMLTreeCreateXMLData").orElseThrow() }
private val CFXMLTreeCreateXMLData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLTreeCreateXMLData_ADDR, CFXMLTreeCreateXMLData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLTreeCreateXMLData(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFXMLTreeCreateXMLData_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLCreateStringByEscapingEntities typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CFXMLCreateStringByEscapingEntities_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLCreateStringByEscapingEntities_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFXMLCreateStringByEscapingEntities").orElseThrow() }
private val CFXMLCreateStringByEscapingEntities_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLCreateStringByEscapingEntities_ADDR, CFXMLCreateStringByEscapingEntities_DESC) }

fun CFXMLCreateStringByEscapingEntities(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFXMLCreateStringByEscapingEntities_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLCreateStringByUnescapingEntities typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CFXMLCreateStringByUnescapingEntities_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLCreateStringByUnescapingEntities_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("CFXMLCreateStringByUnescapingEntities").orElseThrow() }
private val CFXMLCreateStringByUnescapingEntities_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLCreateStringByUnescapingEntities_ADDR, CFXMLCreateStringByUnescapingEntities_DESC) }

fun CFXMLCreateStringByUnescapingEntities(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFXMLCreateStringByUnescapingEntities_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFXMLTreeErrorDescription typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFXMLTreeErrorDescription_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFXMLTreeErrorDescription_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFXMLTreeErrorDescription").orElseThrow().reinterpret(kCFXMLTreeErrorDescription_LAYOUT.byteSize()) }
private val kCFXMLTreeErrorDescription_VH: VarHandle by lazy { kCFXMLTreeErrorDescription_LAYOUT.varHandle() }

var kCFXMLTreeErrorDescription: MemorySegment
    get() = kCFXMLTreeErrorDescription_VH.get(kCFXMLTreeErrorDescription_SEGMENT, 0L) as MemorySegment
    set(value) = kCFXMLTreeErrorDescription_VH.set(kCFXMLTreeErrorDescription_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFXMLTreeErrorLineNumber typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFXMLTreeErrorLineNumber_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFXMLTreeErrorLineNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFXMLTreeErrorLineNumber").orElseThrow().reinterpret(kCFXMLTreeErrorLineNumber_LAYOUT.byteSize()) }
private val kCFXMLTreeErrorLineNumber_VH: VarHandle by lazy { kCFXMLTreeErrorLineNumber_LAYOUT.varHandle() }

var kCFXMLTreeErrorLineNumber: MemorySegment
    get() = kCFXMLTreeErrorLineNumber_VH.get(kCFXMLTreeErrorLineNumber_SEGMENT, 0L) as MemorySegment
    set(value) = kCFXMLTreeErrorLineNumber_VH.set(kCFXMLTreeErrorLineNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFXMLTreeErrorLocation typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFXMLTreeErrorLocation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFXMLTreeErrorLocation_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFXMLTreeErrorLocation").orElseThrow().reinterpret(kCFXMLTreeErrorLocation_LAYOUT.byteSize()) }
private val kCFXMLTreeErrorLocation_VH: VarHandle by lazy { kCFXMLTreeErrorLocation_LAYOUT.varHandle() }

var kCFXMLTreeErrorLocation: MemorySegment
    get() = kCFXMLTreeErrorLocation_VH.get(kCFXMLTreeErrorLocation_SEGMENT, 0L) as MemorySegment
    set(value) = kCFXMLTreeErrorLocation_VH.set(kCFXMLTreeErrorLocation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFXMLTreeErrorStatusCode typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFXMLTreeErrorStatusCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFXMLTreeErrorStatusCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("kCFXMLTreeErrorStatusCode").orElseThrow().reinterpret(kCFXMLTreeErrorStatusCode_LAYOUT.byteSize()) }
private val kCFXMLTreeErrorStatusCode_VH: VarHandle by lazy { kCFXMLTreeErrorStatusCode_LAYOUT.varHandle() }

var kCFXMLTreeErrorStatusCode: MemorySegment
    get() = kCFXMLTreeErrorStatusCode_VH.get(kCFXMLTreeErrorStatusCode_SEGMENT, 0L) as MemorySegment
    set(value) = kCFXMLTreeErrorStatusCode_VH.set(kCFXMLTreeErrorStatusCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFoundationVersionNumber Double
 */
private val NSFoundationVersionNumber_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSFoundationVersionNumber_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFoundationVersionNumber").orElseThrow().reinterpret(NSFoundationVersionNumber_LAYOUT.byteSize()) }
private val NSFoundationVersionNumber_VH: VarHandle by lazy { NSFoundationVersionNumber_LAYOUT.varHandle() }

var NSFoundationVersionNumber: Double
    get() = NSFoundationVersionNumber_VH.get(NSFoundationVersionNumber_SEGMENT, 0L) as Double
    set(value) = NSFoundationVersionNumber_VH.set(NSFoundationVersionNumber_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringFromSelector typedef NSString = (Void)*(typedef SEL = ((Void)*)*)
 */
private val NSStringFromSelector_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSStringFromSelector_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromSelector").orElseThrow() }
private val NSStringFromSelector_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromSelector_ADDR, NSStringFromSelector_DESC) }

fun NSStringFromSelector(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromSelector_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSSelectorFromString typedef SEL = ((Void)*)*(typedef NSString = (Void)*)
 */
private val NSSelectorFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSSelectorFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSelectorFromString").orElseThrow() }
private val NSSelectorFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSSelectorFromString_ADDR, NSSelectorFromString_DESC) }

fun NSSelectorFromString(arg0: MemorySegment): MemorySegment {
    try {
        return NSSelectorFromString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSStringFromClass typedef NSString = (Void)*(typedef Class = typedef Class = (Void)*)
 */
private val NSStringFromClass_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSStringFromClass_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromClass").orElseThrow() }
private val NSStringFromClass_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromClass_ADDR, NSStringFromClass_DESC) }

fun NSStringFromClass(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromClass_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSClassFromString typedef Class = typedef Class = (Void)*(typedef NSString = (Void)*)
 */
private val NSClassFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSClassFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSClassFromString").orElseThrow() }
private val NSClassFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSClassFromString_ADDR, NSClassFromString_DESC) }

fun NSClassFromString(arg0: MemorySegment): MemorySegment {
    try {
        return NSClassFromString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSStringFromProtocol typedef NSString = (Void)*(typedef Protocol = (Void)*)
 */
private val NSStringFromProtocol_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSStringFromProtocol_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromProtocol").orElseThrow() }
private val NSStringFromProtocol_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromProtocol_ADDR, NSStringFromProtocol_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSStringFromProtocol(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromProtocol_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSProtocolFromString typedef Protocol = (Void)*(typedef NSString = (Void)*)
 */
private val NSProtocolFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSProtocolFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProtocolFromString").orElseThrow() }
private val NSProtocolFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSProtocolFromString_ADDR, NSProtocolFromString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSProtocolFromString(arg0: MemorySegment): MemorySegment {
    try {
        return NSProtocolFromString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGetSizeAndAlignment (Char)*((Char)*,(typedef NSUInteger = UNSIGNED = Long)*,(typedef NSUInteger = UNSIGNED = Long)*)
 */
private val NSGetSizeAndAlignment_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSGetSizeAndAlignment_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGetSizeAndAlignment").orElseThrow() }
private val NSGetSizeAndAlignment_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSGetSizeAndAlignment_ADDR, NSGetSizeAndAlignment_DESC) }

fun NSGetSizeAndAlignment(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return NSGetSizeAndAlignment_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSLog Void((Void)*)
 */
private val NSLog_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSLog_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLog").orElseThrow() }
private val NSLog_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSLog_ADDR, NSLog_DESC) }

fun NSLog(arg0: MemorySegment): Unit {
    try {
        NSLog_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSLogv Void((Void)*,typedef __builtin_va_list = (Char)*)
 */
private val NSLogv_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSLogv_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLogv").orElseThrow() }
private val NSLogv_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSLogv_ADDR, NSLogv_DESC) }

fun NSLogv(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSLogv_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDefaultMallocZone (typedef NSZone = Declared(_NSZone))*()
 */
private val NSDefaultMallocZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSDefaultMallocZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDefaultMallocZone").orElseThrow() }
private val NSDefaultMallocZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDefaultMallocZone_ADDR, NSDefaultMallocZone_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSDefaultMallocZone(): MemorySegment {
    try {
        return NSDefaultMallocZone_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCreateZone (typedef NSZone = Declared(_NSZone))*(typedef NSUInteger = UNSIGNED = Long,typedef NSUInteger = UNSIGNED = Long,typedef BOOL = Bool)
 */
private val NSCreateZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN)
private val NSCreateZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCreateZone").orElseThrow() }
private val NSCreateZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCreateZone_ADDR, NSCreateZone_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSCreateZone(arg0: Long, arg1: Long, arg2: Boolean): MemorySegment {
    try {
        return NSCreateZone_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRecycleZone Void((typedef NSZone = Declared(_NSZone))*)
 */
private val NSRecycleZone_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSRecycleZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRecycleZone").orElseThrow() }
private val NSRecycleZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRecycleZone_ADDR, NSRecycleZone_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSRecycleZone(arg0: MemorySegment): Unit {
    try {
        NSRecycleZone_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSSetZoneName Void((typedef NSZone = Declared(_NSZone))*,typedef NSString = (Void)*)
 */
private val NSSetZoneName_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSSetZoneName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSetZoneName").orElseThrow() }
private val NSSetZoneName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSSetZoneName_ADDR, NSSetZoneName_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSSetZoneName(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSSetZoneName_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZoneName typedef NSString = (Void)*((typedef NSZone = Declared(_NSZone))*)
 */
private val NSZoneName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSZoneName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSZoneName").orElseThrow() }
private val NSZoneName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSZoneName_ADDR, NSZoneName_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSZoneName(arg0: MemorySegment): MemorySegment {
    try {
        return NSZoneName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZoneFromPointer (typedef NSZone = Declared(_NSZone))*((Void)*)
 */
private val NSZoneFromPointer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSZoneFromPointer_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSZoneFromPointer").orElseThrow() }
private val NSZoneFromPointer_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSZoneFromPointer_ADDR, NSZoneFromPointer_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSZoneFromPointer(arg0: MemorySegment): MemorySegment {
    try {
        return NSZoneFromPointer_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZoneMalloc (Void)*((typedef NSZone = Declared(_NSZone))*,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSZoneMalloc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSZoneMalloc_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSZoneMalloc").orElseThrow() }
private val NSZoneMalloc_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSZoneMalloc_ADDR, NSZoneMalloc_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSZoneMalloc(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return NSZoneMalloc_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZoneCalloc (Void)*((typedef NSZone = Declared(_NSZone))*,typedef NSUInteger = UNSIGNED = Long,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSZoneCalloc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSZoneCalloc_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSZoneCalloc").orElseThrow() }
private val NSZoneCalloc_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSZoneCalloc_ADDR, NSZoneCalloc_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSZoneCalloc(arg0: MemorySegment, arg1: Long, arg2: Long): MemorySegment {
    try {
        return NSZoneCalloc_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZoneRealloc (Void)*((typedef NSZone = Declared(_NSZone))*,(Void)*,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSZoneRealloc_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSZoneRealloc_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSZoneRealloc").orElseThrow() }
private val NSZoneRealloc_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSZoneRealloc_ADDR, NSZoneRealloc_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSZoneRealloc(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return NSZoneRealloc_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSZoneFree Void((typedef NSZone = Declared(_NSZone))*,(Void)*)
 */
private val NSZoneFree_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSZoneFree_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSZoneFree").orElseThrow() }
private val NSZoneFree_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSZoneFree_ADDR, NSZoneFree_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Zone-based memory management is unavailable")
fun NSZoneFree(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSZoneFree_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAllocateCollectable (Void)*(typedef NSUInteger = UNSIGNED = Long,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSAllocateCollectable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSAllocateCollectable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllocateCollectable").orElseThrow() }
private val NSAllocateCollectable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAllocateCollectable_ADDR, NSAllocateCollectable_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
fun NSAllocateCollectable(arg0: Long, arg1: Long): MemorySegment {
    try {
        return NSAllocateCollectable_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSReallocateCollectable (Void)*((Void)*,typedef NSUInteger = UNSIGNED = Long,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSReallocateCollectable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSReallocateCollectable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSReallocateCollectable").orElseThrow() }
private val NSReallocateCollectable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSReallocateCollectable_ADDR, NSReallocateCollectable_DESC) }

@PlatformAvailability(platform = "swift", unavailable = true, message = "Garbage Collection is not supported")
fun NSReallocateCollectable(arg0: MemorySegment, arg1: Long, arg2: Long): MemorySegment {
    try {
        return NSReallocateCollectable_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSPageSize typedef NSUInteger = UNSIGNED = Long()
 */
private val NSPageSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val NSPageSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPageSize").orElseThrow() }
private val NSPageSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSPageSize_ADDR, NSPageSize_DESC) }

fun NSPageSize(): Long {
    try {
        return NSPageSize_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSLogPageSize typedef NSUInteger = UNSIGNED = Long()
 */
private val NSLogPageSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val NSLogPageSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLogPageSize").orElseThrow() }
private val NSLogPageSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSLogPageSize_ADDR, NSLogPageSize_DESC) }

fun NSLogPageSize(): Long {
    try {
        return NSLogPageSize_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRoundUpToMultipleOfPageSize typedef NSUInteger = UNSIGNED = Long(typedef NSUInteger = UNSIGNED = Long)
 */
private val NSRoundUpToMultipleOfPageSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSRoundUpToMultipleOfPageSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRoundUpToMultipleOfPageSize").orElseThrow() }
private val NSRoundUpToMultipleOfPageSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRoundUpToMultipleOfPageSize_ADDR, NSRoundUpToMultipleOfPageSize_DESC) }

fun NSRoundUpToMultipleOfPageSize(arg0: Long): Long {
    try {
        return NSRoundUpToMultipleOfPageSize_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRoundDownToMultipleOfPageSize typedef NSUInteger = UNSIGNED = Long(typedef NSUInteger = UNSIGNED = Long)
 */
private val NSRoundDownToMultipleOfPageSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSRoundDownToMultipleOfPageSize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRoundDownToMultipleOfPageSize").orElseThrow() }
private val NSRoundDownToMultipleOfPageSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRoundDownToMultipleOfPageSize_ADDR, NSRoundDownToMultipleOfPageSize_DESC) }

fun NSRoundDownToMultipleOfPageSize(arg0: Long): Long {
    try {
        return NSRoundDownToMultipleOfPageSize_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAllocateMemoryPages (Void)*(typedef NSUInteger = UNSIGNED = Long)
 */
private val NSAllocateMemoryPages_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSAllocateMemoryPages_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllocateMemoryPages").orElseThrow() }
private val NSAllocateMemoryPages_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAllocateMemoryPages_ADDR, NSAllocateMemoryPages_DESC) }

fun NSAllocateMemoryPages(arg0: Long): MemorySegment {
    try {
        return NSAllocateMemoryPages_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDeallocateMemoryPages Void((Void)*,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSDeallocateMemoryPages_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDeallocateMemoryPages_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDeallocateMemoryPages").orElseThrow() }
private val NSDeallocateMemoryPages_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDeallocateMemoryPages_ADDR, NSDeallocateMemoryPages_DESC) }

fun NSDeallocateMemoryPages(arg0: MemorySegment, arg1: Long): Unit {
    try {
        NSDeallocateMemoryPages_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCopyMemoryPages Void((Void)*,(Void)*,typedef NSUInteger = UNSIGNED = Long)
 */
private val NSCopyMemoryPages_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSCopyMemoryPages_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCopyMemoryPages").orElseThrow() }
private val NSCopyMemoryPages_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCopyMemoryPages_ADDR, NSCopyMemoryPages_DESC) }

fun NSCopyMemoryPages(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): Unit {
    try {
        NSCopyMemoryPages_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSRealMemoryAvailable typedef NSUInteger = UNSIGNED = Long()
 */
private val NSRealMemoryAvailable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val NSRealMemoryAvailable_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRealMemoryAvailable").orElseThrow() }
private val NSRealMemoryAvailable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRealMemoryAvailable_ADDR, NSRealMemoryAvailable_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSProcessInfo instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Use NSProcessInfo instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSProcessInfo instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSProcessInfo instead")
fun NSRealMemoryAvailable(): Long {
    try {
        return NSRealMemoryAvailable_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAllocateObject typedef id = (Void)*(typedef Class = typedef Class = (Void)*,typedef NSUInteger = UNSIGNED = Long,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSAllocateObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSAllocateObject_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAllocateObject").orElseThrow() }
private val NSAllocateObject_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSAllocateObject_ADDR, NSAllocateObject_DESC) }

@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSAllocateObject(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return NSAllocateObject_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDeallocateObject Void(typedef id = (Void)*)
 */
private val NSDeallocateObject_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSDeallocateObject_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDeallocateObject").orElseThrow() }
private val NSDeallocateObject_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDeallocateObject_ADDR, NSDeallocateObject_DESC) }

@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSDeallocateObject(arg0: MemorySegment): Unit {
    try {
        NSDeallocateObject_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSCopyObject typedef id = (Void)*(typedef id = (Void)*,typedef NSUInteger = UNSIGNED = Long,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSCopyObject_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSCopyObject_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCopyObject").orElseThrow() }
private val NSCopyObject_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSCopyObject_ADDR, NSCopyObject_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSCopyObject(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return NSCopyObject_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSShouldRetainWithZone typedef BOOL = Bool(typedef id = (Void)*,(typedef NSZone = Declared(_NSZone))*)
 */
private val NSShouldRetainWithZone_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSShouldRetainWithZone_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSShouldRetainWithZone").orElseThrow() }
private val NSShouldRetainWithZone_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSShouldRetainWithZone_ADDR, NSShouldRetainWithZone_DESC) }

@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSShouldRetainWithZone(arg0: MemorySegment, arg1: MemorySegment): Boolean {
    try {
        return NSShouldRetainWithZone_HANDLE.invokeExact(arg0, arg1) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSIncrementExtraRefCount Void(typedef id = (Void)*)
 */
private val NSIncrementExtraRefCount_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSIncrementExtraRefCount_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIncrementExtraRefCount").orElseThrow() }
private val NSIncrementExtraRefCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIncrementExtraRefCount_ADDR, NSIncrementExtraRefCount_DESC) }

@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSIncrementExtraRefCount(arg0: MemorySegment): Unit {
    try {
        NSIncrementExtraRefCount_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecrementExtraRefCountWasZero typedef BOOL = Bool(typedef id = (Void)*)
 */
private val NSDecrementExtraRefCountWasZero_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
private val NSDecrementExtraRefCountWasZero_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecrementExtraRefCountWasZero").orElseThrow() }
private val NSDecrementExtraRefCountWasZero_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecrementExtraRefCountWasZero_ADDR, NSDecrementExtraRefCountWasZero_DESC) }

@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSDecrementExtraRefCountWasZero(arg0: MemorySegment): Boolean {
    try {
        return NSDecrementExtraRefCountWasZero_HANDLE.invokeExact(arg0) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSExtraRefCount typedef NSUInteger = UNSIGNED = Long(typedef id = (Void)*)
 */
private val NSExtraRefCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val NSExtraRefCount_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSExtraRefCount").orElseThrow() }
private val NSExtraRefCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSExtraRefCount_ADDR, NSExtraRefCount_DESC) }

@PlatformAvailability(platform = "all", unavailable = true, message = "not available in automatic reference counting mode")
fun NSExtraRefCount(arg0: MemorySegment): Long {
    try {
        return NSExtraRefCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSUnionRange typedef NSRange = Declared(_NSRange)(typedef NSRange = Declared(_NSRange),typedef NSRange = Declared(_NSRange))
 */
private val NSUnionRange_DESC: FunctionDescriptor = FunctionDescriptor.of(_NSRange.layout, _NSRange.layout, _NSRange.layout)
private val NSUnionRange_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnionRange").orElseThrow() }
private val NSUnionRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSUnionRange_ADDR, NSUnionRange_DESC) }

fun NSUnionRange(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSUnionRange_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSUnionRange(allocator: SegmentAllocator, arg0: NSRange, arg1: NSRange): NSRange {
    return NSRange(NSUnionRange(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : NSIntersectionRange typedef NSRange = Declared(_NSRange)(typedef NSRange = Declared(_NSRange),typedef NSRange = Declared(_NSRange))
 */
private val NSIntersectionRange_DESC: FunctionDescriptor = FunctionDescriptor.of(_NSRange.layout, _NSRange.layout, _NSRange.layout)
private val NSIntersectionRange_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIntersectionRange").orElseThrow() }
private val NSIntersectionRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSIntersectionRange_ADDR, NSIntersectionRange_DESC) }

fun NSIntersectionRange(allocator: SegmentAllocator, arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSIntersectionRange_HANDLE.invokeExact(allocator, arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSIntersectionRange(allocator: SegmentAllocator, arg0: NSRange, arg1: NSRange): NSRange {
    return NSRange(NSIntersectionRange(allocator, arg0.segment, arg1.segment))
}

/**
 * {@snippet lang=c : NSStringFromRange typedef NSString = (Void)*(typedef NSRange = Declared(_NSRange))
 */
private val NSStringFromRange_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, _NSRange.layout)
private val NSStringFromRange_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringFromRange").orElseThrow() }
private val NSStringFromRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSStringFromRange_ADDR, NSStringFromRange_DESC) }

fun NSStringFromRange(arg0: MemorySegment): MemorySegment {
    try {
        return NSStringFromRange_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSStringFromRange(arg0: NSRange): MemorySegment {
    return NSStringFromRange(arg0.segment)
}

/**
 * {@snippet lang=c : NSRangeFromString typedef NSRange = Declared(_NSRange)(typedef NSString = (Void)*)
 */
private val NSRangeFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(_NSRange.layout, ValueLayout.ADDRESS)
private val NSRangeFromString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRangeFromString").orElseThrow() }
private val NSRangeFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSRangeFromString_ADDR, NSRangeFromString_DESC) }

fun NSRangeFromString(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return NSRangeFromString_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

fun NSRangeFromStringTyped(allocator: SegmentAllocator, arg0: MemorySegment): NSRange {
    return NSRange(NSRangeFromString(allocator, arg0))
}

/**
 * {@snippet lang=c : NSItemProviderPreferredImageSizeKey (Void)*
 */
private val NSItemProviderPreferredImageSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSItemProviderPreferredImageSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSItemProviderPreferredImageSizeKey").orElseThrow().reinterpret(NSItemProviderPreferredImageSizeKey_LAYOUT.byteSize()) }
private val NSItemProviderPreferredImageSizeKey_VH: VarHandle by lazy { NSItemProviderPreferredImageSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSItemProviderPreferredImageSizeKey: MemorySegment
    get() = NSItemProviderPreferredImageSizeKey_VH.get(NSItemProviderPreferredImageSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSItemProviderPreferredImageSizeKey_VH.set(NSItemProviderPreferredImageSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionJavaScriptPreprocessingResultsKey (Void)*
 */
private val NSExtensionJavaScriptPreprocessingResultsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionJavaScriptPreprocessingResultsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSExtensionJavaScriptPreprocessingResultsKey").orElseThrow().reinterpret(NSExtensionJavaScriptPreprocessingResultsKey_LAYOUT.byteSize()) }
private val NSExtensionJavaScriptPreprocessingResultsKey_VH: VarHandle by lazy { NSExtensionJavaScriptPreprocessingResultsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionJavaScriptPreprocessingResultsKey: MemorySegment
    get() = NSExtensionJavaScriptPreprocessingResultsKey_VH.get(NSExtensionJavaScriptPreprocessingResultsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionJavaScriptPreprocessingResultsKey_VH.set(NSExtensionJavaScriptPreprocessingResultsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSExtensionJavaScriptFinalizeArgumentKey (Void)*
 */
private val NSExtensionJavaScriptFinalizeArgumentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSExtensionJavaScriptFinalizeArgumentKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSExtensionJavaScriptFinalizeArgumentKey").orElseThrow().reinterpret(NSExtensionJavaScriptFinalizeArgumentKey_LAYOUT.byteSize()) }
private val NSExtensionJavaScriptFinalizeArgumentKey_VH: VarHandle by lazy { NSExtensionJavaScriptFinalizeArgumentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSExtensionJavaScriptFinalizeArgumentKey: MemorySegment
    get() = NSExtensionJavaScriptFinalizeArgumentKey_VH.get(NSExtensionJavaScriptFinalizeArgumentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSExtensionJavaScriptFinalizeArgumentKey_VH.set(NSExtensionJavaScriptFinalizeArgumentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSItemProviderErrorDomain (Void)*
 */
private val NSItemProviderErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSItemProviderErrorDomain_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSItemProviderErrorDomain").orElseThrow().reinterpret(NSItemProviderErrorDomain_LAYOUT.byteSize()) }
private val NSItemProviderErrorDomain_VH: VarHandle by lazy { NSItemProviderErrorDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSItemProviderErrorDomain: MemorySegment
    get() = NSItemProviderErrorDomain_VH.get(NSItemProviderErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSItemProviderErrorDomain_VH.set(NSItemProviderErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToKatakana typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToKatakana_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToKatakana_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToKatakana").orElseThrow().reinterpret(NSStringTransformLatinToKatakana_LAYOUT.byteSize()) }
private val NSStringTransformLatinToKatakana_VH: VarHandle by lazy { NSStringTransformLatinToKatakana_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToKatakana: MemorySegment
    get() = NSStringTransformLatinToKatakana_VH.get(NSStringTransformLatinToKatakana_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToKatakana_VH.set(NSStringTransformLatinToKatakana_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToHiragana typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToHiragana_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToHiragana_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToHiragana").orElseThrow().reinterpret(NSStringTransformLatinToHiragana_LAYOUT.byteSize()) }
private val NSStringTransformLatinToHiragana_VH: VarHandle by lazy { NSStringTransformLatinToHiragana_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToHiragana: MemorySegment
    get() = NSStringTransformLatinToHiragana_VH.get(NSStringTransformLatinToHiragana_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToHiragana_VH.set(NSStringTransformLatinToHiragana_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToHangul typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToHangul_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToHangul_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToHangul").orElseThrow().reinterpret(NSStringTransformLatinToHangul_LAYOUT.byteSize()) }
private val NSStringTransformLatinToHangul_VH: VarHandle by lazy { NSStringTransformLatinToHangul_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToHangul: MemorySegment
    get() = NSStringTransformLatinToHangul_VH.get(NSStringTransformLatinToHangul_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToHangul_VH.set(NSStringTransformLatinToHangul_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToArabic typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToArabic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToArabic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToArabic").orElseThrow().reinterpret(NSStringTransformLatinToArabic_LAYOUT.byteSize()) }
private val NSStringTransformLatinToArabic_VH: VarHandle by lazy { NSStringTransformLatinToArabic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToArabic: MemorySegment
    get() = NSStringTransformLatinToArabic_VH.get(NSStringTransformLatinToArabic_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToArabic_VH.set(NSStringTransformLatinToArabic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToHebrew typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToHebrew_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToHebrew_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToHebrew").orElseThrow().reinterpret(NSStringTransformLatinToHebrew_LAYOUT.byteSize()) }
private val NSStringTransformLatinToHebrew_VH: VarHandle by lazy { NSStringTransformLatinToHebrew_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToHebrew: MemorySegment
    get() = NSStringTransformLatinToHebrew_VH.get(NSStringTransformLatinToHebrew_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToHebrew_VH.set(NSStringTransformLatinToHebrew_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToThai typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToThai_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToThai_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToThai").orElseThrow().reinterpret(NSStringTransformLatinToThai_LAYOUT.byteSize()) }
private val NSStringTransformLatinToThai_VH: VarHandle by lazy { NSStringTransformLatinToThai_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToThai: MemorySegment
    get() = NSStringTransformLatinToThai_VH.get(NSStringTransformLatinToThai_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToThai_VH.set(NSStringTransformLatinToThai_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToCyrillic typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToCyrillic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToCyrillic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToCyrillic").orElseThrow().reinterpret(NSStringTransformLatinToCyrillic_LAYOUT.byteSize()) }
private val NSStringTransformLatinToCyrillic_VH: VarHandle by lazy { NSStringTransformLatinToCyrillic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToCyrillic: MemorySegment
    get() = NSStringTransformLatinToCyrillic_VH.get(NSStringTransformLatinToCyrillic_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToCyrillic_VH.set(NSStringTransformLatinToCyrillic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformLatinToGreek typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformLatinToGreek_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformLatinToGreek_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformLatinToGreek").orElseThrow().reinterpret(NSStringTransformLatinToGreek_LAYOUT.byteSize()) }
private val NSStringTransformLatinToGreek_VH: VarHandle by lazy { NSStringTransformLatinToGreek_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformLatinToGreek: MemorySegment
    get() = NSStringTransformLatinToGreek_VH.get(NSStringTransformLatinToGreek_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformLatinToGreek_VH.set(NSStringTransformLatinToGreek_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformToLatin typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformToLatin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformToLatin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformToLatin").orElseThrow().reinterpret(NSStringTransformToLatin_LAYOUT.byteSize()) }
private val NSStringTransformToLatin_VH: VarHandle by lazy { NSStringTransformToLatin_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformToLatin: MemorySegment
    get() = NSStringTransformToLatin_VH.get(NSStringTransformToLatin_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformToLatin_VH.set(NSStringTransformToLatin_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformMandarinToLatin typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformMandarinToLatin_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformMandarinToLatin_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformMandarinToLatin").orElseThrow().reinterpret(NSStringTransformMandarinToLatin_LAYOUT.byteSize()) }
private val NSStringTransformMandarinToLatin_VH: VarHandle by lazy { NSStringTransformMandarinToLatin_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformMandarinToLatin: MemorySegment
    get() = NSStringTransformMandarinToLatin_VH.get(NSStringTransformMandarinToLatin_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformMandarinToLatin_VH.set(NSStringTransformMandarinToLatin_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformHiraganaToKatakana typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformHiraganaToKatakana_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformHiraganaToKatakana_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformHiraganaToKatakana").orElseThrow().reinterpret(NSStringTransformHiraganaToKatakana_LAYOUT.byteSize()) }
private val NSStringTransformHiraganaToKatakana_VH: VarHandle by lazy { NSStringTransformHiraganaToKatakana_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformHiraganaToKatakana: MemorySegment
    get() = NSStringTransformHiraganaToKatakana_VH.get(NSStringTransformHiraganaToKatakana_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformHiraganaToKatakana_VH.set(NSStringTransformHiraganaToKatakana_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformFullwidthToHalfwidth typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformFullwidthToHalfwidth_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformFullwidthToHalfwidth_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformFullwidthToHalfwidth").orElseThrow().reinterpret(NSStringTransformFullwidthToHalfwidth_LAYOUT.byteSize()) }
private val NSStringTransformFullwidthToHalfwidth_VH: VarHandle by lazy { NSStringTransformFullwidthToHalfwidth_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformFullwidthToHalfwidth: MemorySegment
    get() = NSStringTransformFullwidthToHalfwidth_VH.get(NSStringTransformFullwidthToHalfwidth_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformFullwidthToHalfwidth_VH.set(NSStringTransformFullwidthToHalfwidth_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformToXMLHex typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformToXMLHex_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformToXMLHex_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformToXMLHex").orElseThrow().reinterpret(NSStringTransformToXMLHex_LAYOUT.byteSize()) }
private val NSStringTransformToXMLHex_VH: VarHandle by lazy { NSStringTransformToXMLHex_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformToXMLHex: MemorySegment
    get() = NSStringTransformToXMLHex_VH.get(NSStringTransformToXMLHex_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformToXMLHex_VH.set(NSStringTransformToXMLHex_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformToUnicodeName typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformToUnicodeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformToUnicodeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformToUnicodeName").orElseThrow().reinterpret(NSStringTransformToUnicodeName_LAYOUT.byteSize()) }
private val NSStringTransformToUnicodeName_VH: VarHandle by lazy { NSStringTransformToUnicodeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformToUnicodeName: MemorySegment
    get() = NSStringTransformToUnicodeName_VH.get(NSStringTransformToUnicodeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformToUnicodeName_VH.set(NSStringTransformToUnicodeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformStripCombiningMarks typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformStripCombiningMarks_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformStripCombiningMarks_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformStripCombiningMarks").orElseThrow().reinterpret(NSStringTransformStripCombiningMarks_LAYOUT.byteSize()) }
private val NSStringTransformStripCombiningMarks_VH: VarHandle by lazy { NSStringTransformStripCombiningMarks_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformStripCombiningMarks: MemorySegment
    get() = NSStringTransformStripCombiningMarks_VH.get(NSStringTransformStripCombiningMarks_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformStripCombiningMarks_VH.set(NSStringTransformStripCombiningMarks_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringTransformStripDiacritics typedef const NSStringTransform = (Void)*
 */
private val NSStringTransformStripDiacritics_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringTransformStripDiacritics_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringTransformStripDiacritics").orElseThrow().reinterpret(NSStringTransformStripDiacritics_LAYOUT.byteSize()) }
private val NSStringTransformStripDiacritics_VH: VarHandle by lazy { NSStringTransformStripDiacritics_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringTransformStripDiacritics: MemorySegment
    get() = NSStringTransformStripDiacritics_VH.get(NSStringTransformStripDiacritics_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringTransformStripDiacritics_VH.set(NSStringTransformStripDiacritics_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionSuggestedEncodingsKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionSuggestedEncodingsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionSuggestedEncodingsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionSuggestedEncodingsKey").orElseThrow().reinterpret(NSStringEncodingDetectionSuggestedEncodingsKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionSuggestedEncodingsKey_VH: VarHandle by lazy { NSStringEncodingDetectionSuggestedEncodingsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionSuggestedEncodingsKey: MemorySegment
    get() = NSStringEncodingDetectionSuggestedEncodingsKey_VH.get(NSStringEncodingDetectionSuggestedEncodingsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionSuggestedEncodingsKey_VH.set(NSStringEncodingDetectionSuggestedEncodingsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionDisallowedEncodingsKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionDisallowedEncodingsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionDisallowedEncodingsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionDisallowedEncodingsKey").orElseThrow().reinterpret(NSStringEncodingDetectionDisallowedEncodingsKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionDisallowedEncodingsKey_VH: VarHandle by lazy { NSStringEncodingDetectionDisallowedEncodingsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionDisallowedEncodingsKey: MemorySegment
    get() = NSStringEncodingDetectionDisallowedEncodingsKey_VH.get(NSStringEncodingDetectionDisallowedEncodingsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionDisallowedEncodingsKey_VH.set(NSStringEncodingDetectionDisallowedEncodingsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionUseOnlySuggestedEncodingsKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionUseOnlySuggestedEncodingsKey").orElseThrow().reinterpret(NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_VH: VarHandle by lazy { NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionUseOnlySuggestedEncodingsKey: MemorySegment
    get() = NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_VH.get(NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_VH.set(NSStringEncodingDetectionUseOnlySuggestedEncodingsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionAllowLossyKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionAllowLossyKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionAllowLossyKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionAllowLossyKey").orElseThrow().reinterpret(NSStringEncodingDetectionAllowLossyKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionAllowLossyKey_VH: VarHandle by lazy { NSStringEncodingDetectionAllowLossyKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionAllowLossyKey: MemorySegment
    get() = NSStringEncodingDetectionAllowLossyKey_VH.get(NSStringEncodingDetectionAllowLossyKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionAllowLossyKey_VH.set(NSStringEncodingDetectionAllowLossyKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionFromWindowsKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionFromWindowsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionFromWindowsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionFromWindowsKey").orElseThrow().reinterpret(NSStringEncodingDetectionFromWindowsKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionFromWindowsKey_VH: VarHandle by lazy { NSStringEncodingDetectionFromWindowsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionFromWindowsKey: MemorySegment
    get() = NSStringEncodingDetectionFromWindowsKey_VH.get(NSStringEncodingDetectionFromWindowsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionFromWindowsKey_VH.set(NSStringEncodingDetectionFromWindowsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionLossySubstitutionKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionLossySubstitutionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionLossySubstitutionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionLossySubstitutionKey").orElseThrow().reinterpret(NSStringEncodingDetectionLossySubstitutionKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionLossySubstitutionKey_VH: VarHandle by lazy { NSStringEncodingDetectionLossySubstitutionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionLossySubstitutionKey: MemorySegment
    get() = NSStringEncodingDetectionLossySubstitutionKey_VH.get(NSStringEncodingDetectionLossySubstitutionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionLossySubstitutionKey_VH.set(NSStringEncodingDetectionLossySubstitutionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingDetectionLikelyLanguageKey typedef const NSStringEncodingDetectionOptionsKey = (Void)*
 */
private val NSStringEncodingDetectionLikelyLanguageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingDetectionLikelyLanguageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingDetectionLikelyLanguageKey").orElseThrow().reinterpret(NSStringEncodingDetectionLikelyLanguageKey_LAYOUT.byteSize()) }
private val NSStringEncodingDetectionLikelyLanguageKey_VH: VarHandle by lazy { NSStringEncodingDetectionLikelyLanguageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSStringEncodingDetectionLikelyLanguageKey: MemorySegment
    get() = NSStringEncodingDetectionLikelyLanguageKey_VH.get(NSStringEncodingDetectionLikelyLanguageKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingDetectionLikelyLanguageKey_VH.set(NSStringEncodingDetectionLikelyLanguageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCharacterConversionException typedef const NSExceptionName = (Void)*
 */
private val NSCharacterConversionException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCharacterConversionException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCharacterConversionException").orElseThrow().reinterpret(NSCharacterConversionException_LAYOUT.byteSize()) }
private val NSCharacterConversionException_VH: VarHandle by lazy { NSCharacterConversionException_LAYOUT.varHandle() }

var NSCharacterConversionException: MemorySegment
    get() = NSCharacterConversionException_VH.get(NSCharacterConversionException_SEGMENT, 0L) as MemorySegment
    set(value) = NSCharacterConversionException_VH.set(NSCharacterConversionException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSParseErrorException typedef const NSExceptionName = (Void)*
 */
private val NSParseErrorException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSParseErrorException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSParseErrorException").orElseThrow().reinterpret(NSParseErrorException_LAYOUT.byteSize()) }
private val NSParseErrorException_VH: VarHandle by lazy { NSParseErrorException_LAYOUT.varHandle() }

var NSParseErrorException: MemorySegment
    get() = NSParseErrorException_VH.get(NSParseErrorException_SEGMENT, 0L) as MemorySegment
    set(value) = NSParseErrorException_VH.set(NSParseErrorException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressEstimatedTimeRemainingKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressEstimatedTimeRemainingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressEstimatedTimeRemainingKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressEstimatedTimeRemainingKey").orElseThrow().reinterpret(NSProgressEstimatedTimeRemainingKey_LAYOUT.byteSize()) }
private val NSProgressEstimatedTimeRemainingKey_VH: VarHandle by lazy { NSProgressEstimatedTimeRemainingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressEstimatedTimeRemainingKey: MemorySegment
    get() = NSProgressEstimatedTimeRemainingKey_VH.get(NSProgressEstimatedTimeRemainingKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressEstimatedTimeRemainingKey_VH.set(NSProgressEstimatedTimeRemainingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressThroughputKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressThroughputKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressThroughputKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressThroughputKey").orElseThrow().reinterpret(NSProgressThroughputKey_LAYOUT.byteSize()) }
private val NSProgressThroughputKey_VH: VarHandle by lazy { NSProgressThroughputKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressThroughputKey: MemorySegment
    get() = NSProgressThroughputKey_VH.get(NSProgressThroughputKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressThroughputKey_VH.set(NSProgressThroughputKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressKindFile typedef const NSProgressKind = (Void)*
 */
private val NSProgressKindFile_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressKindFile_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressKindFile").orElseThrow().reinterpret(NSProgressKindFile_LAYOUT.byteSize()) }
private val NSProgressKindFile_VH: VarHandle by lazy { NSProgressKindFile_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressKindFile: MemorySegment
    get() = NSProgressKindFile_VH.get(NSProgressKindFile_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressKindFile_VH.set(NSProgressKindFile_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileOperationKindKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindKey").orElseThrow().reinterpret(NSProgressFileOperationKindKey_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindKey_VH: VarHandle by lazy { NSProgressFileOperationKindKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindKey: MemorySegment
    get() = NSProgressFileOperationKindKey_VH.get(NSProgressFileOperationKindKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindKey_VH.set(NSProgressFileOperationKindKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindDownloading typedef const NSProgressFileOperationKind = (Void)*
 */
private val NSProgressFileOperationKindDownloading_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindDownloading_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindDownloading").orElseThrow().reinterpret(NSProgressFileOperationKindDownloading_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindDownloading_VH: VarHandle by lazy { NSProgressFileOperationKindDownloading_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindDownloading: MemorySegment
    get() = NSProgressFileOperationKindDownloading_VH.get(NSProgressFileOperationKindDownloading_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindDownloading_VH.set(NSProgressFileOperationKindDownloading_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindDecompressingAfterDownloading typedef const NSProgressFileOperationKind = (Void)*
 */
private val NSProgressFileOperationKindDecompressingAfterDownloading_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindDecompressingAfterDownloading_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindDecompressingAfterDownloading").orElseThrow().reinterpret(NSProgressFileOperationKindDecompressingAfterDownloading_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindDecompressingAfterDownloading_VH: VarHandle by lazy { NSProgressFileOperationKindDecompressingAfterDownloading_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindDecompressingAfterDownloading: MemorySegment
    get() = NSProgressFileOperationKindDecompressingAfterDownloading_VH.get(NSProgressFileOperationKindDecompressingAfterDownloading_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindDecompressingAfterDownloading_VH.set(NSProgressFileOperationKindDecompressingAfterDownloading_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindReceiving typedef const NSProgressFileOperationKind = (Void)*
 */
private val NSProgressFileOperationKindReceiving_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindReceiving_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindReceiving").orElseThrow().reinterpret(NSProgressFileOperationKindReceiving_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindReceiving_VH: VarHandle by lazy { NSProgressFileOperationKindReceiving_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindReceiving: MemorySegment
    get() = NSProgressFileOperationKindReceiving_VH.get(NSProgressFileOperationKindReceiving_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindReceiving_VH.set(NSProgressFileOperationKindReceiving_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindCopying typedef const NSProgressFileOperationKind = (Void)*
 */
private val NSProgressFileOperationKindCopying_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindCopying_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindCopying").orElseThrow().reinterpret(NSProgressFileOperationKindCopying_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindCopying_VH: VarHandle by lazy { NSProgressFileOperationKindCopying_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindCopying: MemorySegment
    get() = NSProgressFileOperationKindCopying_VH.get(NSProgressFileOperationKindCopying_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindCopying_VH.set(NSProgressFileOperationKindCopying_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindUploading typedef const NSProgressFileOperationKind = (Void)*
 */
private val NSProgressFileOperationKindUploading_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindUploading_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindUploading").orElseThrow().reinterpret(NSProgressFileOperationKindUploading_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindUploading_VH: VarHandle by lazy { NSProgressFileOperationKindUploading_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindUploading: MemorySegment
    get() = NSProgressFileOperationKindUploading_VH.get(NSProgressFileOperationKindUploading_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindUploading_VH.set(NSProgressFileOperationKindUploading_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileOperationKindDuplicating typedef const NSProgressFileOperationKind = (Void)*
 */
private val NSProgressFileOperationKindDuplicating_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileOperationKindDuplicating_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileOperationKindDuplicating").orElseThrow().reinterpret(NSProgressFileOperationKindDuplicating_LAYOUT.byteSize()) }
private val NSProgressFileOperationKindDuplicating_VH: VarHandle by lazy { NSProgressFileOperationKindDuplicating_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileOperationKindDuplicating: MemorySegment
    get() = NSProgressFileOperationKindDuplicating_VH.get(NSProgressFileOperationKindDuplicating_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileOperationKindDuplicating_VH.set(NSProgressFileOperationKindDuplicating_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileURLKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileURLKey").orElseThrow().reinterpret(NSProgressFileURLKey_LAYOUT.byteSize()) }
private val NSProgressFileURLKey_VH: VarHandle by lazy { NSProgressFileURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileURLKey: MemorySegment
    get() = NSProgressFileURLKey_VH.get(NSProgressFileURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileURLKey_VH.set(NSProgressFileURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileTotalCountKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileTotalCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileTotalCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileTotalCountKey").orElseThrow().reinterpret(NSProgressFileTotalCountKey_LAYOUT.byteSize()) }
private val NSProgressFileTotalCountKey_VH: VarHandle by lazy { NSProgressFileTotalCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileTotalCountKey: MemorySegment
    get() = NSProgressFileTotalCountKey_VH.get(NSProgressFileTotalCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileTotalCountKey_VH.set(NSProgressFileTotalCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileCompletedCountKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileCompletedCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileCompletedCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileCompletedCountKey").orElseThrow().reinterpret(NSProgressFileCompletedCountKey_LAYOUT.byteSize()) }
private val NSProgressFileCompletedCountKey_VH: VarHandle by lazy { NSProgressFileCompletedCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSProgressFileCompletedCountKey: MemorySegment
    get() = NSProgressFileCompletedCountKey_VH.get(NSProgressFileCompletedCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileCompletedCountKey_VH.set(NSProgressFileCompletedCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileAnimationImageKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileAnimationImageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileAnimationImageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileAnimationImageKey").orElseThrow().reinterpret(NSProgressFileAnimationImageKey_LAYOUT.byteSize()) }
private val NSProgressFileAnimationImageKey_VH: VarHandle by lazy { NSProgressFileAnimationImageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSProgressFileAnimationImageKey: MemorySegment
    get() = NSProgressFileAnimationImageKey_VH.get(NSProgressFileAnimationImageKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileAnimationImageKey_VH.set(NSProgressFileAnimationImageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileAnimationImageOriginalRectKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileAnimationImageOriginalRectKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileAnimationImageOriginalRectKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileAnimationImageOriginalRectKey").orElseThrow().reinterpret(NSProgressFileAnimationImageOriginalRectKey_LAYOUT.byteSize()) }
private val NSProgressFileAnimationImageOriginalRectKey_VH: VarHandle by lazy { NSProgressFileAnimationImageOriginalRectKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSProgressFileAnimationImageOriginalRectKey: MemorySegment
    get() = NSProgressFileAnimationImageOriginalRectKey_VH.get(NSProgressFileAnimationImageOriginalRectKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileAnimationImageOriginalRectKey_VH.set(NSProgressFileAnimationImageOriginalRectKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSProgressFileIconKey typedef const NSProgressUserInfoKey = (Void)*
 */
private val NSProgressFileIconKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSProgressFileIconKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSProgressFileIconKey").orElseThrow().reinterpret(NSProgressFileIconKey_LAYOUT.byteSize()) }
private val NSProgressFileIconKey_VH: VarHandle by lazy { NSProgressFileIconKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSProgressFileIconKey: MemorySegment
    get() = NSProgressFileIconKey_VH.get(NSProgressFileIconKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSProgressFileIconKey_VH.set(NSProgressFileIconKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBundleDidLoadNotification typedef const NSNotificationName = (Void)*
 */
private val NSBundleDidLoadNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBundleDidLoadNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBundleDidLoadNotification").orElseThrow().reinterpret(NSBundleDidLoadNotification_LAYOUT.byteSize()) }
private val NSBundleDidLoadNotification_VH: VarHandle by lazy { NSBundleDidLoadNotification_LAYOUT.varHandle() }

var NSBundleDidLoadNotification: MemorySegment
    get() = NSBundleDidLoadNotification_VH.get(NSBundleDidLoadNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSBundleDidLoadNotification_VH.set(NSBundleDidLoadNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLoadedClasses (Void)*
 */
private val NSLoadedClasses_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLoadedClasses_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLoadedClasses").orElseThrow().reinterpret(NSLoadedClasses_LAYOUT.byteSize()) }
private val NSLoadedClasses_VH: VarHandle by lazy { NSLoadedClasses_LAYOUT.varHandle() }

var NSLoadedClasses: MemorySegment
    get() = NSLoadedClasses_VH.get(NSLoadedClasses_SEGMENT, 0L) as MemorySegment
    set(value) = NSLoadedClasses_VH.set(NSLoadedClasses_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBundleResourceRequestLowDiskSpaceNotification typedef const NSNotificationName = (Void)*
 */
private val NSBundleResourceRequestLowDiskSpaceNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBundleResourceRequestLowDiskSpaceNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBundleResourceRequestLowDiskSpaceNotification").orElseThrow().reinterpret(NSBundleResourceRequestLowDiskSpaceNotification_LAYOUT.byteSize()) }
private val NSBundleResourceRequestLowDiskSpaceNotification_VH: VarHandle by lazy { NSBundleResourceRequestLowDiskSpaceNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSBundleResourceRequestLowDiskSpaceNotification: MemorySegment
    get() = NSBundleResourceRequestLowDiskSpaceNotification_VH.get(NSBundleResourceRequestLowDiskSpaceNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSBundleResourceRequestLowDiskSpaceNotification_VH.set(NSBundleResourceRequestLowDiskSpaceNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBundleResourceRequestLoadingPriorityUrgent Double
 */
private val NSBundleResourceRequestLoadingPriorityUrgent_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_DOUBLE }
private val NSBundleResourceRequestLoadingPriorityUrgent_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBundleResourceRequestLoadingPriorityUrgent").orElseThrow().reinterpret(NSBundleResourceRequestLoadingPriorityUrgent_LAYOUT.byteSize()) }
private val NSBundleResourceRequestLoadingPriorityUrgent_VH: VarHandle by lazy { NSBundleResourceRequestLoadingPriorityUrgent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSBundleResourceRequestLoadingPriorityUrgent: Double
    get() = NSBundleResourceRequestLoadingPriorityUrgent_VH.get(NSBundleResourceRequestLoadingPriorityUrgent_SEGMENT, 0L) as Double
    set(value) = NSBundleResourceRequestLoadingPriorityUrgent_VH.set(NSBundleResourceRequestLoadingPriorityUrgent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSSystemClockDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSSystemClockDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSSystemClockDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSystemClockDidChangeNotification").orElseThrow().reinterpret(NSSystemClockDidChangeNotification_LAYOUT.byteSize()) }
private val NSSystemClockDidChangeNotification_VH: VarHandle by lazy { NSSystemClockDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSSystemClockDidChangeNotification: MemorySegment
    get() = NSSystemClockDidChangeNotification_VH.get(NSSystemClockDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSSystemClockDidChangeNotification_VH.set(NSSystemClockDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierGregorian typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierGregorian_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierGregorian_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierGregorian").orElseThrow().reinterpret(NSCalendarIdentifierGregorian_LAYOUT.byteSize()) }
private val NSCalendarIdentifierGregorian_VH: VarHandle by lazy { NSCalendarIdentifierGregorian_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierGregorian: MemorySegment
    get() = NSCalendarIdentifierGregorian_VH.get(NSCalendarIdentifierGregorian_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierGregorian_VH.set(NSCalendarIdentifierGregorian_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierBuddhist typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierBuddhist_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierBuddhist_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierBuddhist").orElseThrow().reinterpret(NSCalendarIdentifierBuddhist_LAYOUT.byteSize()) }
private val NSCalendarIdentifierBuddhist_VH: VarHandle by lazy { NSCalendarIdentifierBuddhist_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierBuddhist: MemorySegment
    get() = NSCalendarIdentifierBuddhist_VH.get(NSCalendarIdentifierBuddhist_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierBuddhist_VH.set(NSCalendarIdentifierBuddhist_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierChinese typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierChinese_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierChinese_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierChinese").orElseThrow().reinterpret(NSCalendarIdentifierChinese_LAYOUT.byteSize()) }
private val NSCalendarIdentifierChinese_VH: VarHandle by lazy { NSCalendarIdentifierChinese_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierChinese: MemorySegment
    get() = NSCalendarIdentifierChinese_VH.get(NSCalendarIdentifierChinese_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierChinese_VH.set(NSCalendarIdentifierChinese_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierCoptic typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierCoptic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierCoptic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierCoptic").orElseThrow().reinterpret(NSCalendarIdentifierCoptic_LAYOUT.byteSize()) }
private val NSCalendarIdentifierCoptic_VH: VarHandle by lazy { NSCalendarIdentifierCoptic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierCoptic: MemorySegment
    get() = NSCalendarIdentifierCoptic_VH.get(NSCalendarIdentifierCoptic_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierCoptic_VH.set(NSCalendarIdentifierCoptic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierEthiopicAmeteMihret typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierEthiopicAmeteMihret_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierEthiopicAmeteMihret_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierEthiopicAmeteMihret").orElseThrow().reinterpret(NSCalendarIdentifierEthiopicAmeteMihret_LAYOUT.byteSize()) }
private val NSCalendarIdentifierEthiopicAmeteMihret_VH: VarHandle by lazy { NSCalendarIdentifierEthiopicAmeteMihret_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierEthiopicAmeteMihret: MemorySegment
    get() = NSCalendarIdentifierEthiopicAmeteMihret_VH.get(NSCalendarIdentifierEthiopicAmeteMihret_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierEthiopicAmeteMihret_VH.set(NSCalendarIdentifierEthiopicAmeteMihret_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierEthiopicAmeteAlem typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierEthiopicAmeteAlem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierEthiopicAmeteAlem_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierEthiopicAmeteAlem").orElseThrow().reinterpret(NSCalendarIdentifierEthiopicAmeteAlem_LAYOUT.byteSize()) }
private val NSCalendarIdentifierEthiopicAmeteAlem_VH: VarHandle by lazy { NSCalendarIdentifierEthiopicAmeteAlem_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierEthiopicAmeteAlem: MemorySegment
    get() = NSCalendarIdentifierEthiopicAmeteAlem_VH.get(NSCalendarIdentifierEthiopicAmeteAlem_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierEthiopicAmeteAlem_VH.set(NSCalendarIdentifierEthiopicAmeteAlem_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierHebrew typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierHebrew_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierHebrew_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierHebrew").orElseThrow().reinterpret(NSCalendarIdentifierHebrew_LAYOUT.byteSize()) }
private val NSCalendarIdentifierHebrew_VH: VarHandle by lazy { NSCalendarIdentifierHebrew_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierHebrew: MemorySegment
    get() = NSCalendarIdentifierHebrew_VH.get(NSCalendarIdentifierHebrew_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierHebrew_VH.set(NSCalendarIdentifierHebrew_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierISO8601 typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierISO8601_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierISO8601_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierISO8601").orElseThrow().reinterpret(NSCalendarIdentifierISO8601_LAYOUT.byteSize()) }
private val NSCalendarIdentifierISO8601_VH: VarHandle by lazy { NSCalendarIdentifierISO8601_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierISO8601: MemorySegment
    get() = NSCalendarIdentifierISO8601_VH.get(NSCalendarIdentifierISO8601_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierISO8601_VH.set(NSCalendarIdentifierISO8601_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierIndian typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierIndian_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierIndian_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierIndian").orElseThrow().reinterpret(NSCalendarIdentifierIndian_LAYOUT.byteSize()) }
private val NSCalendarIdentifierIndian_VH: VarHandle by lazy { NSCalendarIdentifierIndian_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierIndian: MemorySegment
    get() = NSCalendarIdentifierIndian_VH.get(NSCalendarIdentifierIndian_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierIndian_VH.set(NSCalendarIdentifierIndian_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierIslamic typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierIslamic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierIslamic_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierIslamic").orElseThrow().reinterpret(NSCalendarIdentifierIslamic_LAYOUT.byteSize()) }
private val NSCalendarIdentifierIslamic_VH: VarHandle by lazy { NSCalendarIdentifierIslamic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierIslamic: MemorySegment
    get() = NSCalendarIdentifierIslamic_VH.get(NSCalendarIdentifierIslamic_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierIslamic_VH.set(NSCalendarIdentifierIslamic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierIslamicCivil typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierIslamicCivil_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierIslamicCivil_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierIslamicCivil").orElseThrow().reinterpret(NSCalendarIdentifierIslamicCivil_LAYOUT.byteSize()) }
private val NSCalendarIdentifierIslamicCivil_VH: VarHandle by lazy { NSCalendarIdentifierIslamicCivil_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierIslamicCivil: MemorySegment
    get() = NSCalendarIdentifierIslamicCivil_VH.get(NSCalendarIdentifierIslamicCivil_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierIslamicCivil_VH.set(NSCalendarIdentifierIslamicCivil_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierJapanese typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierJapanese_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierJapanese_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierJapanese").orElseThrow().reinterpret(NSCalendarIdentifierJapanese_LAYOUT.byteSize()) }
private val NSCalendarIdentifierJapanese_VH: VarHandle by lazy { NSCalendarIdentifierJapanese_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierJapanese: MemorySegment
    get() = NSCalendarIdentifierJapanese_VH.get(NSCalendarIdentifierJapanese_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierJapanese_VH.set(NSCalendarIdentifierJapanese_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierPersian typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierPersian_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierPersian_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierPersian").orElseThrow().reinterpret(NSCalendarIdentifierPersian_LAYOUT.byteSize()) }
private val NSCalendarIdentifierPersian_VH: VarHandle by lazy { NSCalendarIdentifierPersian_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierPersian: MemorySegment
    get() = NSCalendarIdentifierPersian_VH.get(NSCalendarIdentifierPersian_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierPersian_VH.set(NSCalendarIdentifierPersian_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierRepublicOfChina typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierRepublicOfChina_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierRepublicOfChina_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierRepublicOfChina").orElseThrow().reinterpret(NSCalendarIdentifierRepublicOfChina_LAYOUT.byteSize()) }
private val NSCalendarIdentifierRepublicOfChina_VH: VarHandle by lazy { NSCalendarIdentifierRepublicOfChina_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierRepublicOfChina: MemorySegment
    get() = NSCalendarIdentifierRepublicOfChina_VH.get(NSCalendarIdentifierRepublicOfChina_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierRepublicOfChina_VH.set(NSCalendarIdentifierRepublicOfChina_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierIslamicTabular typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierIslamicTabular_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierIslamicTabular_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierIslamicTabular").orElseThrow().reinterpret(NSCalendarIdentifierIslamicTabular_LAYOUT.byteSize()) }
private val NSCalendarIdentifierIslamicTabular_VH: VarHandle by lazy { NSCalendarIdentifierIslamicTabular_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierIslamicTabular: MemorySegment
    get() = NSCalendarIdentifierIslamicTabular_VH.get(NSCalendarIdentifierIslamicTabular_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierIslamicTabular_VH.set(NSCalendarIdentifierIslamicTabular_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierIslamicUmmAlQura typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierIslamicUmmAlQura_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierIslamicUmmAlQura_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierIslamicUmmAlQura").orElseThrow().reinterpret(NSCalendarIdentifierIslamicUmmAlQura_LAYOUT.byteSize()) }
private val NSCalendarIdentifierIslamicUmmAlQura_VH: VarHandle by lazy { NSCalendarIdentifierIslamicUmmAlQura_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierIslamicUmmAlQura: MemorySegment
    get() = NSCalendarIdentifierIslamicUmmAlQura_VH.get(NSCalendarIdentifierIslamicUmmAlQura_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierIslamicUmmAlQura_VH.set(NSCalendarIdentifierIslamicUmmAlQura_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierBangla typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierBangla_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierBangla_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierBangla").orElseThrow().reinterpret(NSCalendarIdentifierBangla_LAYOUT.byteSize()) }
private val NSCalendarIdentifierBangla_VH: VarHandle by lazy { NSCalendarIdentifierBangla_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierBangla: MemorySegment
    get() = NSCalendarIdentifierBangla_VH.get(NSCalendarIdentifierBangla_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierBangla_VH.set(NSCalendarIdentifierBangla_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierGujarati typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierGujarati_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierGujarati_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierGujarati").orElseThrow().reinterpret(NSCalendarIdentifierGujarati_LAYOUT.byteSize()) }
private val NSCalendarIdentifierGujarati_VH: VarHandle by lazy { NSCalendarIdentifierGujarati_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierGujarati: MemorySegment
    get() = NSCalendarIdentifierGujarati_VH.get(NSCalendarIdentifierGujarati_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierGujarati_VH.set(NSCalendarIdentifierGujarati_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierKannada typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierKannada_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierKannada_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierKannada").orElseThrow().reinterpret(NSCalendarIdentifierKannada_LAYOUT.byteSize()) }
private val NSCalendarIdentifierKannada_VH: VarHandle by lazy { NSCalendarIdentifierKannada_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierKannada: MemorySegment
    get() = NSCalendarIdentifierKannada_VH.get(NSCalendarIdentifierKannada_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierKannada_VH.set(NSCalendarIdentifierKannada_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierMalayalam typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierMalayalam_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierMalayalam_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierMalayalam").orElseThrow().reinterpret(NSCalendarIdentifierMalayalam_LAYOUT.byteSize()) }
private val NSCalendarIdentifierMalayalam_VH: VarHandle by lazy { NSCalendarIdentifierMalayalam_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierMalayalam: MemorySegment
    get() = NSCalendarIdentifierMalayalam_VH.get(NSCalendarIdentifierMalayalam_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierMalayalam_VH.set(NSCalendarIdentifierMalayalam_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierMarathi typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierMarathi_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierMarathi_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierMarathi").orElseThrow().reinterpret(NSCalendarIdentifierMarathi_LAYOUT.byteSize()) }
private val NSCalendarIdentifierMarathi_VH: VarHandle by lazy { NSCalendarIdentifierMarathi_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierMarathi: MemorySegment
    get() = NSCalendarIdentifierMarathi_VH.get(NSCalendarIdentifierMarathi_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierMarathi_VH.set(NSCalendarIdentifierMarathi_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierOdia typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierOdia_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierOdia_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierOdia").orElseThrow().reinterpret(NSCalendarIdentifierOdia_LAYOUT.byteSize()) }
private val NSCalendarIdentifierOdia_VH: VarHandle by lazy { NSCalendarIdentifierOdia_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierOdia: MemorySegment
    get() = NSCalendarIdentifierOdia_VH.get(NSCalendarIdentifierOdia_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierOdia_VH.set(NSCalendarIdentifierOdia_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierTamil typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierTamil_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierTamil_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierTamil").orElseThrow().reinterpret(NSCalendarIdentifierTamil_LAYOUT.byteSize()) }
private val NSCalendarIdentifierTamil_VH: VarHandle by lazy { NSCalendarIdentifierTamil_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierTamil: MemorySegment
    get() = NSCalendarIdentifierTamil_VH.get(NSCalendarIdentifierTamil_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierTamil_VH.set(NSCalendarIdentifierTamil_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierTelugu typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierTelugu_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierTelugu_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierTelugu").orElseThrow().reinterpret(NSCalendarIdentifierTelugu_LAYOUT.byteSize()) }
private val NSCalendarIdentifierTelugu_VH: VarHandle by lazy { NSCalendarIdentifierTelugu_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierTelugu: MemorySegment
    get() = NSCalendarIdentifierTelugu_VH.get(NSCalendarIdentifierTelugu_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierTelugu_VH.set(NSCalendarIdentifierTelugu_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierVikram typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierVikram_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierVikram_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierVikram").orElseThrow().reinterpret(NSCalendarIdentifierVikram_LAYOUT.byteSize()) }
private val NSCalendarIdentifierVikram_VH: VarHandle by lazy { NSCalendarIdentifierVikram_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierVikram: MemorySegment
    get() = NSCalendarIdentifierVikram_VH.get(NSCalendarIdentifierVikram_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierVikram_VH.set(NSCalendarIdentifierVikram_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierDangi typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierDangi_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierDangi_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierDangi").orElseThrow().reinterpret(NSCalendarIdentifierDangi_LAYOUT.byteSize()) }
private val NSCalendarIdentifierDangi_VH: VarHandle by lazy { NSCalendarIdentifierDangi_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierDangi: MemorySegment
    get() = NSCalendarIdentifierDangi_VH.get(NSCalendarIdentifierDangi_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierDangi_VH.set(NSCalendarIdentifierDangi_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarIdentifierVietnamese typedef const NSCalendarIdentifier = (Void)*
 */
private val NSCalendarIdentifierVietnamese_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarIdentifierVietnamese_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarIdentifierVietnamese").orElseThrow().reinterpret(NSCalendarIdentifierVietnamese_LAYOUT.byteSize()) }
private val NSCalendarIdentifierVietnamese_VH: VarHandle by lazy { NSCalendarIdentifierVietnamese_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarIdentifierVietnamese: MemorySegment
    get() = NSCalendarIdentifierVietnamese_VH.get(NSCalendarIdentifierVietnamese_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarIdentifierVietnamese_VH.set(NSCalendarIdentifierVietnamese_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCalendarDayChangedNotification typedef const NSNotificationName = (Void)*
 */
private val NSCalendarDayChangedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCalendarDayChangedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCalendarDayChangedNotification").orElseThrow().reinterpret(NSCalendarDayChangedNotification_LAYOUT.byteSize()) }
private val NSCalendarDayChangedNotification_VH: VarHandle by lazy { NSCalendarDayChangedNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCalendarDayChangedNotification: MemorySegment
    get() = NSCalendarDayChangedNotification_VH.get(NSCalendarDayChangedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSCalendarDayChangedNotification_VH.set(NSCalendarDayChangedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NXReadNSObjectFromCoder typedef NSObject = (Void)*(typedef NSCoder = (Void)*)
 */
private val NXReadNSObjectFromCoder_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NXReadNSObjectFromCoder_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NXReadNSObjectFromCoder").orElseThrow() }
private val NXReadNSObjectFromCoder_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NXReadNSObjectFromCoder_ADDR, NXReadNSObjectFromCoder_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
fun NXReadNSObjectFromCoder(arg0: MemorySegment): MemorySegment {
    try {
        return NXReadNSObjectFromCoder_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSInflectionConceptsKey typedef const NSAttributedStringFormattingContextKey = (Void)*
 */
private val NSInflectionConceptsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInflectionConceptsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInflectionConceptsKey").orElseThrow().reinterpret(NSInflectionConceptsKey_LAYOUT.byteSize()) }
private val NSInflectionConceptsKey_VH: VarHandle by lazy { NSInflectionConceptsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSInflectionConceptsKey: MemorySegment
    get() = NSInflectionConceptsKey_VH.get(NSInflectionConceptsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSInflectionConceptsKey_VH.set(NSInflectionConceptsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInlinePresentationIntentAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSInlinePresentationIntentAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInlinePresentationIntentAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInlinePresentationIntentAttributeName").orElseThrow().reinterpret(NSInlinePresentationIntentAttributeName_LAYOUT.byteSize()) }
private val NSInlinePresentationIntentAttributeName_VH: VarHandle by lazy { NSInlinePresentationIntentAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSInlinePresentationIntentAttributeName: MemorySegment
    get() = NSInlinePresentationIntentAttributeName_VH.get(NSInlinePresentationIntentAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSInlinePresentationIntentAttributeName_VH.set(NSInlinePresentationIntentAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSAlternateDescriptionAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSAlternateDescriptionAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAlternateDescriptionAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAlternateDescriptionAttributeName").orElseThrow().reinterpret(NSAlternateDescriptionAttributeName_LAYOUT.byteSize()) }
private val NSAlternateDescriptionAttributeName_VH: VarHandle by lazy { NSAlternateDescriptionAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSAlternateDescriptionAttributeName: MemorySegment
    get() = NSAlternateDescriptionAttributeName_VH.get(NSAlternateDescriptionAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSAlternateDescriptionAttributeName_VH.set(NSAlternateDescriptionAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSImageURLAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSImageURLAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSImageURLAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSImageURLAttributeName").orElseThrow().reinterpret(NSImageURLAttributeName_LAYOUT.byteSize()) }
private val NSImageURLAttributeName_VH: VarHandle by lazy { NSImageURLAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSImageURLAttributeName: MemorySegment
    get() = NSImageURLAttributeName_VH.get(NSImageURLAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSImageURLAttributeName_VH.set(NSImageURLAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLanguageIdentifierAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSLanguageIdentifierAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLanguageIdentifierAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLanguageIdentifierAttributeName").orElseThrow().reinterpret(NSLanguageIdentifierAttributeName_LAYOUT.byteSize()) }
private val NSLanguageIdentifierAttributeName_VH: VarHandle by lazy { NSLanguageIdentifierAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSLanguageIdentifierAttributeName: MemorySegment
    get() = NSLanguageIdentifierAttributeName_VH.get(NSLanguageIdentifierAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLanguageIdentifierAttributeName_VH.set(NSLanguageIdentifierAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMarkdownSourcePositionAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSMarkdownSourcePositionAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMarkdownSourcePositionAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMarkdownSourcePositionAttributeName").orElseThrow().reinterpret(NSMarkdownSourcePositionAttributeName_LAYOUT.byteSize()) }
private val NSMarkdownSourcePositionAttributeName_VH: VarHandle by lazy { NSMarkdownSourcePositionAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
var NSMarkdownSourcePositionAttributeName: MemorySegment
    get() = NSMarkdownSourcePositionAttributeName_VH.get(NSMarkdownSourcePositionAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSMarkdownSourcePositionAttributeName_VH.set(NSMarkdownSourcePositionAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSReplacementIndexAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSReplacementIndexAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSReplacementIndexAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSReplacementIndexAttributeName").orElseThrow().reinterpret(NSReplacementIndexAttributeName_LAYOUT.byteSize()) }
private val NSReplacementIndexAttributeName_VH: VarHandle by lazy { NSReplacementIndexAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSReplacementIndexAttributeName: MemorySegment
    get() = NSReplacementIndexAttributeName_VH.get(NSReplacementIndexAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSReplacementIndexAttributeName_VH.set(NSReplacementIndexAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMorphologyAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSMorphologyAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMorphologyAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMorphologyAttributeName").orElseThrow().reinterpret(NSMorphologyAttributeName_LAYOUT.byteSize()) }
private val NSMorphologyAttributeName_VH: VarHandle by lazy { NSMorphologyAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSMorphologyAttributeName: MemorySegment
    get() = NSMorphologyAttributeName_VH.get(NSMorphologyAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSMorphologyAttributeName_VH.set(NSMorphologyAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInflectionRuleAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSInflectionRuleAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInflectionRuleAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInflectionRuleAttributeName").orElseThrow().reinterpret(NSInflectionRuleAttributeName_LAYOUT.byteSize()) }
private val NSInflectionRuleAttributeName_VH: VarHandle by lazy { NSInflectionRuleAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSInflectionRuleAttributeName: MemorySegment
    get() = NSInflectionRuleAttributeName_VH.get(NSInflectionRuleAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSInflectionRuleAttributeName_VH.set(NSInflectionRuleAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInflectionAgreementArgumentAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSInflectionAgreementArgumentAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInflectionAgreementArgumentAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInflectionAgreementArgumentAttributeName").orElseThrow().reinterpret(NSInflectionAgreementArgumentAttributeName_LAYOUT.byteSize()) }
private val NSInflectionAgreementArgumentAttributeName_VH: VarHandle by lazy { NSInflectionAgreementArgumentAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSInflectionAgreementArgumentAttributeName: MemorySegment
    get() = NSInflectionAgreementArgumentAttributeName_VH.get(NSInflectionAgreementArgumentAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSInflectionAgreementArgumentAttributeName_VH.set(NSInflectionAgreementArgumentAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInflectionAgreementConceptAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSInflectionAgreementConceptAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInflectionAgreementConceptAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInflectionAgreementConceptAttributeName").orElseThrow().reinterpret(NSInflectionAgreementConceptAttributeName_LAYOUT.byteSize()) }
private val NSInflectionAgreementConceptAttributeName_VH: VarHandle by lazy { NSInflectionAgreementConceptAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSInflectionAgreementConceptAttributeName: MemorySegment
    get() = NSInflectionAgreementConceptAttributeName_VH.get(NSInflectionAgreementConceptAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSInflectionAgreementConceptAttributeName_VH.set(NSInflectionAgreementConceptAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInflectionReferentConceptAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSInflectionReferentConceptAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInflectionReferentConceptAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInflectionReferentConceptAttributeName").orElseThrow().reinterpret(NSInflectionReferentConceptAttributeName_LAYOUT.byteSize()) }
private val NSInflectionReferentConceptAttributeName_VH: VarHandle by lazy { NSInflectionReferentConceptAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
var NSInflectionReferentConceptAttributeName: MemorySegment
    get() = NSInflectionReferentConceptAttributeName_VH.get(NSInflectionReferentConceptAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSInflectionReferentConceptAttributeName_VH.set(NSInflectionReferentConceptAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInflectionAlternativeAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSInflectionAlternativeAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInflectionAlternativeAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInflectionAlternativeAttributeName").orElseThrow().reinterpret(NSInflectionAlternativeAttributeName_LAYOUT.byteSize()) }
private val NSInflectionAlternativeAttributeName_VH: VarHandle by lazy { NSInflectionAlternativeAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSInflectionAlternativeAttributeName: MemorySegment
    get() = NSInflectionAlternativeAttributeName_VH.get(NSInflectionAlternativeAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSInflectionAlternativeAttributeName_VH.set(NSInflectionAlternativeAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalizedNumberFormatAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSLocalizedNumberFormatAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedNumberFormatAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedNumberFormatAttributeName").orElseThrow().reinterpret(NSLocalizedNumberFormatAttributeName_LAYOUT.byteSize()) }
private val NSLocalizedNumberFormatAttributeName_VH: VarHandle by lazy { NSLocalizedNumberFormatAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
var NSLocalizedNumberFormatAttributeName: MemorySegment
    get() = NSLocalizedNumberFormatAttributeName_VH.get(NSLocalizedNumberFormatAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalizedNumberFormatAttributeName_VH.set(NSLocalizedNumberFormatAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSListItemDelimiterAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSListItemDelimiterAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSListItemDelimiterAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSListItemDelimiterAttributeName").orElseThrow().reinterpret(NSListItemDelimiterAttributeName_LAYOUT.byteSize()) }
private val NSListItemDelimiterAttributeName_VH: VarHandle by lazy { NSListItemDelimiterAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var NSListItemDelimiterAttributeName: MemorySegment
    get() = NSListItemDelimiterAttributeName_VH.get(NSListItemDelimiterAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSListItemDelimiterAttributeName_VH.set(NSListItemDelimiterAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPresentationIntentAttributeName typedef const NSAttributedStringKey = (Void)*
 */
private val NSPresentationIntentAttributeName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPresentationIntentAttributeName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPresentationIntentAttributeName").orElseThrow().reinterpret(NSPresentationIntentAttributeName_LAYOUT.byteSize()) }
private val NSPresentationIntentAttributeName_VH: VarHandle by lazy { NSPresentationIntentAttributeName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
var NSPresentationIntentAttributeName: MemorySegment
    get() = NSPresentationIntentAttributeName_VH.get(NSPresentationIntentAttributeName_SEGMENT, 0L) as MemorySegment
    set(value) = NSPresentationIntentAttributeName_VH.set(NSPresentationIntentAttributeName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCurrentLocaleDidChangeNotification typedef const NSNotificationName = (Void)*
 */
private val NSCurrentLocaleDidChangeNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCurrentLocaleDidChangeNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCurrentLocaleDidChangeNotification").orElseThrow().reinterpret(NSCurrentLocaleDidChangeNotification_LAYOUT.byteSize()) }
private val NSCurrentLocaleDidChangeNotification_VH: VarHandle by lazy { NSCurrentLocaleDidChangeNotification_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSCurrentLocaleDidChangeNotification: MemorySegment
    get() = NSCurrentLocaleDidChangeNotification_VH.get(NSCurrentLocaleDidChangeNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSCurrentLocaleDidChangeNotification_VH.set(NSCurrentLocaleDidChangeNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleIdentifier typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleIdentifier").orElseThrow().reinterpret(NSLocaleIdentifier_LAYOUT.byteSize()) }
private val NSLocaleIdentifier_VH: VarHandle by lazy { NSLocaleIdentifier_LAYOUT.varHandle() }

var NSLocaleIdentifier: MemorySegment
    get() = NSLocaleIdentifier_VH.get(NSLocaleIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleIdentifier_VH.set(NSLocaleIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleLanguageCode typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleLanguageCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleLanguageCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleLanguageCode").orElseThrow().reinterpret(NSLocaleLanguageCode_LAYOUT.byteSize()) }
private val NSLocaleLanguageCode_VH: VarHandle by lazy { NSLocaleLanguageCode_LAYOUT.varHandle() }

var NSLocaleLanguageCode: MemorySegment
    get() = NSLocaleLanguageCode_VH.get(NSLocaleLanguageCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleLanguageCode_VH.set(NSLocaleLanguageCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleCountryCode typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleCountryCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleCountryCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleCountryCode").orElseThrow().reinterpret(NSLocaleCountryCode_LAYOUT.byteSize()) }
private val NSLocaleCountryCode_VH: VarHandle by lazy { NSLocaleCountryCode_LAYOUT.varHandle() }

var NSLocaleCountryCode: MemorySegment
    get() = NSLocaleCountryCode_VH.get(NSLocaleCountryCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleCountryCode_VH.set(NSLocaleCountryCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleScriptCode typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleScriptCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleScriptCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleScriptCode").orElseThrow().reinterpret(NSLocaleScriptCode_LAYOUT.byteSize()) }
private val NSLocaleScriptCode_VH: VarHandle by lazy { NSLocaleScriptCode_LAYOUT.varHandle() }

var NSLocaleScriptCode: MemorySegment
    get() = NSLocaleScriptCode_VH.get(NSLocaleScriptCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleScriptCode_VH.set(NSLocaleScriptCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleVariantCode typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleVariantCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleVariantCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleVariantCode").orElseThrow().reinterpret(NSLocaleVariantCode_LAYOUT.byteSize()) }
private val NSLocaleVariantCode_VH: VarHandle by lazy { NSLocaleVariantCode_LAYOUT.varHandle() }

var NSLocaleVariantCode: MemorySegment
    get() = NSLocaleVariantCode_VH.get(NSLocaleVariantCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleVariantCode_VH.set(NSLocaleVariantCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleExemplarCharacterSet typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleExemplarCharacterSet_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleExemplarCharacterSet_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleExemplarCharacterSet").orElseThrow().reinterpret(NSLocaleExemplarCharacterSet_LAYOUT.byteSize()) }
private val NSLocaleExemplarCharacterSet_VH: VarHandle by lazy { NSLocaleExemplarCharacterSet_LAYOUT.varHandle() }

var NSLocaleExemplarCharacterSet: MemorySegment
    get() = NSLocaleExemplarCharacterSet_VH.get(NSLocaleExemplarCharacterSet_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleExemplarCharacterSet_VH.set(NSLocaleExemplarCharacterSet_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleCalendar typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleCalendar").orElseThrow().reinterpret(NSLocaleCalendar_LAYOUT.byteSize()) }
private val NSLocaleCalendar_VH: VarHandle by lazy { NSLocaleCalendar_LAYOUT.varHandle() }

var NSLocaleCalendar: MemorySegment
    get() = NSLocaleCalendar_VH.get(NSLocaleCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleCalendar_VH.set(NSLocaleCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleCollationIdentifier typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleCollationIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleCollationIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleCollationIdentifier").orElseThrow().reinterpret(NSLocaleCollationIdentifier_LAYOUT.byteSize()) }
private val NSLocaleCollationIdentifier_VH: VarHandle by lazy { NSLocaleCollationIdentifier_LAYOUT.varHandle() }

var NSLocaleCollationIdentifier: MemorySegment
    get() = NSLocaleCollationIdentifier_VH.get(NSLocaleCollationIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleCollationIdentifier_VH.set(NSLocaleCollationIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleUsesMetricSystem typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleUsesMetricSystem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleUsesMetricSystem_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleUsesMetricSystem").orElseThrow().reinterpret(NSLocaleUsesMetricSystem_LAYOUT.byteSize()) }
private val NSLocaleUsesMetricSystem_VH: VarHandle by lazy { NSLocaleUsesMetricSystem_LAYOUT.varHandle() }

var NSLocaleUsesMetricSystem: MemorySegment
    get() = NSLocaleUsesMetricSystem_VH.get(NSLocaleUsesMetricSystem_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleUsesMetricSystem_VH.set(NSLocaleUsesMetricSystem_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleMeasurementSystem typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleMeasurementSystem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleMeasurementSystem_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleMeasurementSystem").orElseThrow().reinterpret(NSLocaleMeasurementSystem_LAYOUT.byteSize()) }
private val NSLocaleMeasurementSystem_VH: VarHandle by lazy { NSLocaleMeasurementSystem_LAYOUT.varHandle() }

var NSLocaleMeasurementSystem: MemorySegment
    get() = NSLocaleMeasurementSystem_VH.get(NSLocaleMeasurementSystem_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleMeasurementSystem_VH.set(NSLocaleMeasurementSystem_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleDecimalSeparator typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleDecimalSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleDecimalSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleDecimalSeparator").orElseThrow().reinterpret(NSLocaleDecimalSeparator_LAYOUT.byteSize()) }
private val NSLocaleDecimalSeparator_VH: VarHandle by lazy { NSLocaleDecimalSeparator_LAYOUT.varHandle() }

var NSLocaleDecimalSeparator: MemorySegment
    get() = NSLocaleDecimalSeparator_VH.get(NSLocaleDecimalSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleDecimalSeparator_VH.set(NSLocaleDecimalSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleGroupingSeparator typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleGroupingSeparator_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleGroupingSeparator_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleGroupingSeparator").orElseThrow().reinterpret(NSLocaleGroupingSeparator_LAYOUT.byteSize()) }
private val NSLocaleGroupingSeparator_VH: VarHandle by lazy { NSLocaleGroupingSeparator_LAYOUT.varHandle() }

var NSLocaleGroupingSeparator: MemorySegment
    get() = NSLocaleGroupingSeparator_VH.get(NSLocaleGroupingSeparator_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleGroupingSeparator_VH.set(NSLocaleGroupingSeparator_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleCurrencySymbol typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleCurrencySymbol_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleCurrencySymbol_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleCurrencySymbol").orElseThrow().reinterpret(NSLocaleCurrencySymbol_LAYOUT.byteSize()) }
private val NSLocaleCurrencySymbol_VH: VarHandle by lazy { NSLocaleCurrencySymbol_LAYOUT.varHandle() }

var NSLocaleCurrencySymbol: MemorySegment
    get() = NSLocaleCurrencySymbol_VH.get(NSLocaleCurrencySymbol_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleCurrencySymbol_VH.set(NSLocaleCurrencySymbol_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleCurrencyCode typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleCurrencyCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleCurrencyCode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleCurrencyCode").orElseThrow().reinterpret(NSLocaleCurrencyCode_LAYOUT.byteSize()) }
private val NSLocaleCurrencyCode_VH: VarHandle by lazy { NSLocaleCurrencyCode_LAYOUT.varHandle() }

var NSLocaleCurrencyCode: MemorySegment
    get() = NSLocaleCurrencyCode_VH.get(NSLocaleCurrencyCode_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleCurrencyCode_VH.set(NSLocaleCurrencyCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleCollatorIdentifier typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleCollatorIdentifier_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleCollatorIdentifier_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleCollatorIdentifier").orElseThrow().reinterpret(NSLocaleCollatorIdentifier_LAYOUT.byteSize()) }
private val NSLocaleCollatorIdentifier_VH: VarHandle by lazy { NSLocaleCollatorIdentifier_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSLocaleCollatorIdentifier: MemorySegment
    get() = NSLocaleCollatorIdentifier_VH.get(NSLocaleCollatorIdentifier_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleCollatorIdentifier_VH.set(NSLocaleCollatorIdentifier_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleQuotationBeginDelimiterKey typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleQuotationBeginDelimiterKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleQuotationBeginDelimiterKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleQuotationBeginDelimiterKey").orElseThrow().reinterpret(NSLocaleQuotationBeginDelimiterKey_LAYOUT.byteSize()) }
private val NSLocaleQuotationBeginDelimiterKey_VH: VarHandle by lazy { NSLocaleQuotationBeginDelimiterKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSLocaleQuotationBeginDelimiterKey: MemorySegment
    get() = NSLocaleQuotationBeginDelimiterKey_VH.get(NSLocaleQuotationBeginDelimiterKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleQuotationBeginDelimiterKey_VH.set(NSLocaleQuotationBeginDelimiterKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleQuotationEndDelimiterKey typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleQuotationEndDelimiterKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleQuotationEndDelimiterKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleQuotationEndDelimiterKey").orElseThrow().reinterpret(NSLocaleQuotationEndDelimiterKey_LAYOUT.byteSize()) }
private val NSLocaleQuotationEndDelimiterKey_VH: VarHandle by lazy { NSLocaleQuotationEndDelimiterKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSLocaleQuotationEndDelimiterKey: MemorySegment
    get() = NSLocaleQuotationEndDelimiterKey_VH.get(NSLocaleQuotationEndDelimiterKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleQuotationEndDelimiterKey_VH.set(NSLocaleQuotationEndDelimiterKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleAlternateQuotationBeginDelimiterKey typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleAlternateQuotationBeginDelimiterKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleAlternateQuotationBeginDelimiterKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleAlternateQuotationBeginDelimiterKey").orElseThrow().reinterpret(NSLocaleAlternateQuotationBeginDelimiterKey_LAYOUT.byteSize()) }
private val NSLocaleAlternateQuotationBeginDelimiterKey_VH: VarHandle by lazy { NSLocaleAlternateQuotationBeginDelimiterKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSLocaleAlternateQuotationBeginDelimiterKey: MemorySegment
    get() = NSLocaleAlternateQuotationBeginDelimiterKey_VH.get(NSLocaleAlternateQuotationBeginDelimiterKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleAlternateQuotationBeginDelimiterKey_VH.set(NSLocaleAlternateQuotationBeginDelimiterKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocaleAlternateQuotationEndDelimiterKey typedef const NSLocaleKey = (Void)*
 */
private val NSLocaleAlternateQuotationEndDelimiterKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocaleAlternateQuotationEndDelimiterKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocaleAlternateQuotationEndDelimiterKey").orElseThrow().reinterpret(NSLocaleAlternateQuotationEndDelimiterKey_LAYOUT.byteSize()) }
private val NSLocaleAlternateQuotationEndDelimiterKey_VH: VarHandle by lazy { NSLocaleAlternateQuotationEndDelimiterKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSLocaleAlternateQuotationEndDelimiterKey: MemorySegment
    get() = NSLocaleAlternateQuotationEndDelimiterKey_VH.get(NSLocaleAlternateQuotationEndDelimiterKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocaleAlternateQuotationEndDelimiterKey_VH.set(NSLocaleAlternateQuotationEndDelimiterKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGregorianCalendar (Void)*
 */
private val NSGregorianCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGregorianCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGregorianCalendar").orElseThrow().reinterpret(NSGregorianCalendar_LAYOUT.byteSize()) }
private val NSGregorianCalendar_VH: VarHandle by lazy { NSGregorianCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSGregorianCalendar: MemorySegment
    get() = NSGregorianCalendar_VH.get(NSGregorianCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSGregorianCalendar_VH.set(NSGregorianCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSBuddhistCalendar (Void)*
 */
private val NSBuddhistCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSBuddhistCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSBuddhistCalendar").orElseThrow().reinterpret(NSBuddhistCalendar_LAYOUT.byteSize()) }
private val NSBuddhistCalendar_VH: VarHandle by lazy { NSBuddhistCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSBuddhistCalendar: MemorySegment
    get() = NSBuddhistCalendar_VH.get(NSBuddhistCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSBuddhistCalendar_VH.set(NSBuddhistCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSChineseCalendar (Void)*
 */
private val NSChineseCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSChineseCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSChineseCalendar").orElseThrow().reinterpret(NSChineseCalendar_LAYOUT.byteSize()) }
private val NSChineseCalendar_VH: VarHandle by lazy { NSChineseCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSChineseCalendar: MemorySegment
    get() = NSChineseCalendar_VH.get(NSChineseCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSChineseCalendar_VH.set(NSChineseCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHebrewCalendar (Void)*
 */
private val NSHebrewCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHebrewCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHebrewCalendar").orElseThrow().reinterpret(NSHebrewCalendar_LAYOUT.byteSize()) }
private val NSHebrewCalendar_VH: VarHandle by lazy { NSHebrewCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSHebrewCalendar: MemorySegment
    get() = NSHebrewCalendar_VH.get(NSHebrewCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSHebrewCalendar_VH.set(NSHebrewCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSIslamicCalendar (Void)*
 */
private val NSIslamicCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIslamicCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIslamicCalendar").orElseThrow().reinterpret(NSIslamicCalendar_LAYOUT.byteSize()) }
private val NSIslamicCalendar_VH: VarHandle by lazy { NSIslamicCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSIslamicCalendar: MemorySegment
    get() = NSIslamicCalendar_VH.get(NSIslamicCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSIslamicCalendar_VH.set(NSIslamicCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSIslamicCivilCalendar (Void)*
 */
private val NSIslamicCivilCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIslamicCivilCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIslamicCivilCalendar").orElseThrow().reinterpret(NSIslamicCivilCalendar_LAYOUT.byteSize()) }
private val NSIslamicCivilCalendar_VH: VarHandle by lazy { NSIslamicCivilCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSIslamicCivilCalendar: MemorySegment
    get() = NSIslamicCivilCalendar_VH.get(NSIslamicCivilCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSIslamicCivilCalendar_VH.set(NSIslamicCivilCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSJapaneseCalendar (Void)*
 */
private val NSJapaneseCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSJapaneseCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSJapaneseCalendar").orElseThrow().reinterpret(NSJapaneseCalendar_LAYOUT.byteSize()) }
private val NSJapaneseCalendar_VH: VarHandle by lazy { NSJapaneseCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSJapaneseCalendar: MemorySegment
    get() = NSJapaneseCalendar_VH.get(NSJapaneseCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSJapaneseCalendar_VH.set(NSJapaneseCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRepublicOfChinaCalendar (Void)*
 */
private val NSRepublicOfChinaCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRepublicOfChinaCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRepublicOfChinaCalendar").orElseThrow().reinterpret(NSRepublicOfChinaCalendar_LAYOUT.byteSize()) }
private val NSRepublicOfChinaCalendar_VH: VarHandle by lazy { NSRepublicOfChinaCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSRepublicOfChinaCalendar: MemorySegment
    get() = NSRepublicOfChinaCalendar_VH.get(NSRepublicOfChinaCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSRepublicOfChinaCalendar_VH.set(NSRepublicOfChinaCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersianCalendar (Void)*
 */
private val NSPersianCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersianCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersianCalendar").orElseThrow().reinterpret(NSPersianCalendar_LAYOUT.byteSize()) }
private val NSPersianCalendar_VH: VarHandle by lazy { NSPersianCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSPersianCalendar: MemorySegment
    get() = NSPersianCalendar_VH.get(NSPersianCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersianCalendar_VH.set(NSPersianCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSIndianCalendar (Void)*
 */
private val NSIndianCalendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSIndianCalendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSIndianCalendar").orElseThrow().reinterpret(NSIndianCalendar_LAYOUT.byteSize()) }
private val NSIndianCalendar_VH: VarHandle by lazy { NSIndianCalendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSIndianCalendar: MemorySegment
    get() = NSIndianCalendar_VH.get(NSIndianCalendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSIndianCalendar_VH.set(NSIndianCalendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSISO8601Calendar (Void)*
 */
private val NSISO8601Calendar_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSISO8601Calendar_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSISO8601Calendar").orElseThrow().reinterpret(NSISO8601Calendar_LAYOUT.byteSize()) }
private val NSISO8601Calendar_VH: VarHandle by lazy { NSISO8601Calendar_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1)
var NSISO8601Calendar: MemorySegment
    get() = NSISO8601Calendar_VH.get(NSISO8601Calendar_SEGMENT, 0L) as MemorySegment
    set(value) = NSISO8601Calendar_VH.set(NSISO8601Calendar_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentKey (Void)*
 */
private val NSPersonNameComponentKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentKey").orElseThrow().reinterpret(NSPersonNameComponentKey_LAYOUT.byteSize()) }
private val NSPersonNameComponentKey_VH: VarHandle by lazy { NSPersonNameComponentKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentKey: MemorySegment
    get() = NSPersonNameComponentKey_VH.get(NSPersonNameComponentKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentKey_VH.set(NSPersonNameComponentKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentGivenName (Void)*
 */
private val NSPersonNameComponentGivenName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentGivenName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentGivenName").orElseThrow().reinterpret(NSPersonNameComponentGivenName_LAYOUT.byteSize()) }
private val NSPersonNameComponentGivenName_VH: VarHandle by lazy { NSPersonNameComponentGivenName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentGivenName: MemorySegment
    get() = NSPersonNameComponentGivenName_VH.get(NSPersonNameComponentGivenName_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentGivenName_VH.set(NSPersonNameComponentGivenName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentFamilyName (Void)*
 */
private val NSPersonNameComponentFamilyName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentFamilyName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentFamilyName").orElseThrow().reinterpret(NSPersonNameComponentFamilyName_LAYOUT.byteSize()) }
private val NSPersonNameComponentFamilyName_VH: VarHandle by lazy { NSPersonNameComponentFamilyName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentFamilyName: MemorySegment
    get() = NSPersonNameComponentFamilyName_VH.get(NSPersonNameComponentFamilyName_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentFamilyName_VH.set(NSPersonNameComponentFamilyName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentMiddleName (Void)*
 */
private val NSPersonNameComponentMiddleName_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentMiddleName_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentMiddleName").orElseThrow().reinterpret(NSPersonNameComponentMiddleName_LAYOUT.byteSize()) }
private val NSPersonNameComponentMiddleName_VH: VarHandle by lazy { NSPersonNameComponentMiddleName_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentMiddleName: MemorySegment
    get() = NSPersonNameComponentMiddleName_VH.get(NSPersonNameComponentMiddleName_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentMiddleName_VH.set(NSPersonNameComponentMiddleName_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentPrefix (Void)*
 */
private val NSPersonNameComponentPrefix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentPrefix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentPrefix").orElseThrow().reinterpret(NSPersonNameComponentPrefix_LAYOUT.byteSize()) }
private val NSPersonNameComponentPrefix_VH: VarHandle by lazy { NSPersonNameComponentPrefix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentPrefix: MemorySegment
    get() = NSPersonNameComponentPrefix_VH.get(NSPersonNameComponentPrefix_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentPrefix_VH.set(NSPersonNameComponentPrefix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentSuffix (Void)*
 */
private val NSPersonNameComponentSuffix_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentSuffix_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentSuffix").orElseThrow().reinterpret(NSPersonNameComponentSuffix_LAYOUT.byteSize()) }
private val NSPersonNameComponentSuffix_VH: VarHandle by lazy { NSPersonNameComponentSuffix_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentSuffix: MemorySegment
    get() = NSPersonNameComponentSuffix_VH.get(NSPersonNameComponentSuffix_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentSuffix_VH.set(NSPersonNameComponentSuffix_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentNickname (Void)*
 */
private val NSPersonNameComponentNickname_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentNickname_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentNickname").orElseThrow().reinterpret(NSPersonNameComponentNickname_LAYOUT.byteSize()) }
private val NSPersonNameComponentNickname_VH: VarHandle by lazy { NSPersonNameComponentNickname_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentNickname: MemorySegment
    get() = NSPersonNameComponentNickname_VH.get(NSPersonNameComponentNickname_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentNickname_VH.set(NSPersonNameComponentNickname_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPersonNameComponentDelimiter (Void)*
 */
private val NSPersonNameComponentDelimiter_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPersonNameComponentDelimiter_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPersonNameComponentDelimiter").orElseThrow().reinterpret(NSPersonNameComponentDelimiter_LAYOUT.byteSize()) }
private val NSPersonNameComponentDelimiter_VH: VarHandle by lazy { NSPersonNameComponentDelimiter_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSPersonNameComponentDelimiter: MemorySegment
    get() = NSPersonNameComponentDelimiter_VH.get(NSPersonNameComponentDelimiter_SEGMENT, 0L) as MemorySegment
    set(value) = NSPersonNameComponentDelimiter_VH.set(NSPersonNameComponentDelimiter_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalCopy Void((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*)
 */
private val NSDecimalCopy_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSDecimalCopy_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalCopy").orElseThrow() }
private val NSDecimalCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalCopy_ADDR, NSDecimalCopy_DESC) }

fun NSDecimalCopy(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        NSDecimalCopy_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalCompact Void((typedef NSDecimal = Declared(NSDecimal))*)
 */
private val NSDecimalCompact_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSDecimalCompact_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalCompact").orElseThrow() }
private val NSDecimalCompact_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalCompact_ADDR, NSDecimalCompact_DESC) }

fun NSDecimalCompact(arg0: MemorySegment): Unit {
    try {
        NSDecimalCompact_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalCompare typedef NSComparisonResult = Declared(NSComparisonResult)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*)
 */
private val NSDecimalCompare_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSDecimalCompare_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalCompare").orElseThrow() }
private val NSDecimalCompare_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalCompare_ADDR, NSDecimalCompare_DESC) }

fun NSDecimalCompare(arg0: MemorySegment, arg1: MemorySegment): NSComparisonResult {
    try {
        return NSComparisonResult(NSDecimalCompare_HANDLE.invokeExact(arg0, arg1) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalRound Void((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSInteger = Long,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalRound_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSDecimalRound_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalRound").orElseThrow() }
private val NSDecimalRound_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalRound_ADDR, NSDecimalRound_DESC) }

fun NSDecimalRound(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: NSRoundingMode): Unit {
    try {
        NSDecimalRound_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalNormalize typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalNormalize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDecimalNormalize_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalNormalize").orElseThrow() }
private val NSDecimalNormalize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalNormalize_ADDR, NSDecimalNormalize_DESC) }

fun NSDecimalNormalize(arg0: MemorySegment, arg1: MemorySegment, arg2: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalNormalize_HANDLE.invokeExact(arg0, arg1, arg2.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalAdd typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalAdd_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDecimalAdd_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalAdd").orElseThrow() }
private val NSDecimalAdd_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalAdd_ADDR, NSDecimalAdd_DESC) }

fun NSDecimalAdd(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalAdd_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalSubtract typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalSubtract_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDecimalSubtract_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalSubtract").orElseThrow() }
private val NSDecimalSubtract_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalSubtract_ADDR, NSDecimalSubtract_DESC) }

fun NSDecimalSubtract(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalSubtract_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalMultiply typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalMultiply_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDecimalMultiply_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalMultiply").orElseThrow() }
private val NSDecimalMultiply_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalMultiply_ADDR, NSDecimalMultiply_DESC) }

fun NSDecimalMultiply(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalMultiply_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalDivide typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalDivide_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val NSDecimalDivide_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalDivide").orElseThrow() }
private val NSDecimalDivide_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalDivide_ADDR, NSDecimalDivide_DESC) }

fun NSDecimalDivide(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalDivide_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalPower typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,typedef NSUInteger = UNSIGNED = Long,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalPower_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val NSDecimalPower_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalPower").orElseThrow() }
private val NSDecimalPower_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalPower_ADDR, NSDecimalPower_DESC) }

fun NSDecimalPower(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalPower_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalMultiplyByPowerOf10 typedef NSCalculationError = Declared(NSCalculationError)((typedef NSDecimal = Declared(NSDecimal))*,(typedef NSDecimal = Declared(NSDecimal))*,Short,typedef NSRoundingMode = Declared(NSRoundingMode))
 */
private val NSDecimalMultiplyByPowerOf10_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_LONG)
private val NSDecimalMultiplyByPowerOf10_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalMultiplyByPowerOf10").orElseThrow() }
private val NSDecimalMultiplyByPowerOf10_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalMultiplyByPowerOf10_ADDR, NSDecimalMultiplyByPowerOf10_DESC) }

fun NSDecimalMultiplyByPowerOf10(arg0: MemorySegment, arg1: MemorySegment, arg2: Short, arg3: NSRoundingMode): NSCalculationError {
    try {
        return NSCalculationError(NSDecimalMultiplyByPowerOf10_HANDLE.invokeExact(arg0, arg1, arg2, arg3.rawValue) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSDecimalString typedef NSString = (Void)*((typedef NSDecimal = Declared(NSDecimal))*,typedef id = (Void)*)
 */
private val NSDecimalString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSDecimalString_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalString").orElseThrow() }
private val NSDecimalString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSDecimalString_ADDR, NSDecimalString_DESC) }

fun NSDecimalString(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return NSDecimalString_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSGenericException typedef const NSExceptionName = (Void)*
 */
private val NSGenericException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSGenericException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGenericException").orElseThrow().reinterpret(NSGenericException_LAYOUT.byteSize()) }
private val NSGenericException_VH: VarHandle by lazy { NSGenericException_LAYOUT.varHandle() }

var NSGenericException: MemorySegment
    get() = NSGenericException_VH.get(NSGenericException_SEGMENT, 0L) as MemorySegment
    set(value) = NSGenericException_VH.set(NSGenericException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRangeException typedef const NSExceptionName = (Void)*
 */
private val NSRangeException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRangeException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRangeException").orElseThrow().reinterpret(NSRangeException_LAYOUT.byteSize()) }
private val NSRangeException_VH: VarHandle by lazy { NSRangeException_LAYOUT.varHandle() }

var NSRangeException: MemorySegment
    get() = NSRangeException_VH.get(NSRangeException_SEGMENT, 0L) as MemorySegment
    set(value) = NSRangeException_VH.set(NSRangeException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInvalidArgumentException typedef const NSExceptionName = (Void)*
 */
private val NSInvalidArgumentException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvalidArgumentException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInvalidArgumentException").orElseThrow().reinterpret(NSInvalidArgumentException_LAYOUT.byteSize()) }
private val NSInvalidArgumentException_VH: VarHandle by lazy { NSInvalidArgumentException_LAYOUT.varHandle() }

var NSInvalidArgumentException: MemorySegment
    get() = NSInvalidArgumentException_VH.get(NSInvalidArgumentException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvalidArgumentException_VH.set(NSInvalidArgumentException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInternalInconsistencyException typedef const NSExceptionName = (Void)*
 */
private val NSInternalInconsistencyException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInternalInconsistencyException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInternalInconsistencyException").orElseThrow().reinterpret(NSInternalInconsistencyException_LAYOUT.byteSize()) }
private val NSInternalInconsistencyException_VH: VarHandle by lazy { NSInternalInconsistencyException_LAYOUT.varHandle() }

var NSInternalInconsistencyException: MemorySegment
    get() = NSInternalInconsistencyException_VH.get(NSInternalInconsistencyException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInternalInconsistencyException_VH.set(NSInternalInconsistencyException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMallocException typedef const NSExceptionName = (Void)*
 */
private val NSMallocException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMallocException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMallocException").orElseThrow().reinterpret(NSMallocException_LAYOUT.byteSize()) }
private val NSMallocException_VH: VarHandle by lazy { NSMallocException_LAYOUT.varHandle() }

var NSMallocException: MemorySegment
    get() = NSMallocException_VH.get(NSMallocException_SEGMENT, 0L) as MemorySegment
    set(value) = NSMallocException_VH.set(NSMallocException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSObjectInaccessibleException typedef const NSExceptionName = (Void)*
 */
private val NSObjectInaccessibleException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSObjectInaccessibleException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSObjectInaccessibleException").orElseThrow().reinterpret(NSObjectInaccessibleException_LAYOUT.byteSize()) }
private val NSObjectInaccessibleException_VH: VarHandle by lazy { NSObjectInaccessibleException_LAYOUT.varHandle() }

var NSObjectInaccessibleException: MemorySegment
    get() = NSObjectInaccessibleException_VH.get(NSObjectInaccessibleException_SEGMENT, 0L) as MemorySegment
    set(value) = NSObjectInaccessibleException_VH.set(NSObjectInaccessibleException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSObjectNotAvailableException typedef const NSExceptionName = (Void)*
 */
private val NSObjectNotAvailableException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSObjectNotAvailableException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSObjectNotAvailableException").orElseThrow().reinterpret(NSObjectNotAvailableException_LAYOUT.byteSize()) }
private val NSObjectNotAvailableException_VH: VarHandle by lazy { NSObjectNotAvailableException_LAYOUT.varHandle() }

var NSObjectNotAvailableException: MemorySegment
    get() = NSObjectNotAvailableException_VH.get(NSObjectNotAvailableException_SEGMENT, 0L) as MemorySegment
    set(value) = NSObjectNotAvailableException_VH.set(NSObjectNotAvailableException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDestinationInvalidException typedef const NSExceptionName = (Void)*
 */
private val NSDestinationInvalidException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDestinationInvalidException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDestinationInvalidException").orElseThrow().reinterpret(NSDestinationInvalidException_LAYOUT.byteSize()) }
private val NSDestinationInvalidException_VH: VarHandle by lazy { NSDestinationInvalidException_LAYOUT.varHandle() }

var NSDestinationInvalidException: MemorySegment
    get() = NSDestinationInvalidException_VH.get(NSDestinationInvalidException_SEGMENT, 0L) as MemorySegment
    set(value) = NSDestinationInvalidException_VH.set(NSDestinationInvalidException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPortTimeoutException typedef const NSExceptionName = (Void)*
 */
private val NSPortTimeoutException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPortTimeoutException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPortTimeoutException").orElseThrow().reinterpret(NSPortTimeoutException_LAYOUT.byteSize()) }
private val NSPortTimeoutException_VH: VarHandle by lazy { NSPortTimeoutException_LAYOUT.varHandle() }

var NSPortTimeoutException: MemorySegment
    get() = NSPortTimeoutException_VH.get(NSPortTimeoutException_SEGMENT, 0L) as MemorySegment
    set(value) = NSPortTimeoutException_VH.set(NSPortTimeoutException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInvalidSendPortException typedef const NSExceptionName = (Void)*
 */
private val NSInvalidSendPortException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvalidSendPortException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInvalidSendPortException").orElseThrow().reinterpret(NSInvalidSendPortException_LAYOUT.byteSize()) }
private val NSInvalidSendPortException_VH: VarHandle by lazy { NSInvalidSendPortException_LAYOUT.varHandle() }

var NSInvalidSendPortException: MemorySegment
    get() = NSInvalidSendPortException_VH.get(NSInvalidSendPortException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvalidSendPortException_VH.set(NSInvalidSendPortException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInvalidReceivePortException typedef const NSExceptionName = (Void)*
 */
private val NSInvalidReceivePortException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInvalidReceivePortException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInvalidReceivePortException").orElseThrow().reinterpret(NSInvalidReceivePortException_LAYOUT.byteSize()) }
private val NSInvalidReceivePortException_VH: VarHandle by lazy { NSInvalidReceivePortException_LAYOUT.varHandle() }

var NSInvalidReceivePortException: MemorySegment
    get() = NSInvalidReceivePortException_VH.get(NSInvalidReceivePortException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInvalidReceivePortException_VH.set(NSInvalidReceivePortException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPortSendException typedef const NSExceptionName = (Void)*
 */
private val NSPortSendException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPortSendException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPortSendException").orElseThrow().reinterpret(NSPortSendException_LAYOUT.byteSize()) }
private val NSPortSendException_VH: VarHandle by lazy { NSPortSendException_LAYOUT.varHandle() }

var NSPortSendException: MemorySegment
    get() = NSPortSendException_VH.get(NSPortSendException_SEGMENT, 0L) as MemorySegment
    set(value) = NSPortSendException_VH.set(NSPortSendException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPortReceiveException typedef const NSExceptionName = (Void)*
 */
private val NSPortReceiveException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPortReceiveException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPortReceiveException").orElseThrow().reinterpret(NSPortReceiveException_LAYOUT.byteSize()) }
private val NSPortReceiveException_VH: VarHandle by lazy { NSPortReceiveException_LAYOUT.varHandle() }

var NSPortReceiveException: MemorySegment
    get() = NSPortReceiveException_VH.get(NSPortReceiveException_SEGMENT, 0L) as MemorySegment
    set(value) = NSPortReceiveException_VH.set(NSPortReceiveException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOldStyleException typedef const NSExceptionName = (Void)*
 */
private val NSOldStyleException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOldStyleException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOldStyleException").orElseThrow().reinterpret(NSOldStyleException_LAYOUT.byteSize()) }
private val NSOldStyleException_VH: VarHandle by lazy { NSOldStyleException_LAYOUT.varHandle() }

var NSOldStyleException: MemorySegment
    get() = NSOldStyleException_VH.get(NSOldStyleException_SEGMENT, 0L) as MemorySegment
    set(value) = NSOldStyleException_VH.set(NSOldStyleException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSInconsistentArchiveException typedef const NSExceptionName = (Void)*
 */
private val NSInconsistentArchiveException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSInconsistentArchiveException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSInconsistentArchiveException").orElseThrow().reinterpret(NSInconsistentArchiveException_LAYOUT.byteSize()) }
private val NSInconsistentArchiveException_VH: VarHandle by lazy { NSInconsistentArchiveException_LAYOUT.varHandle() }

var NSInconsistentArchiveException: MemorySegment
    get() = NSInconsistentArchiveException_VH.get(NSInconsistentArchiveException_SEGMENT, 0L) as MemorySegment
    set(value) = NSInconsistentArchiveException_VH.set(NSInconsistentArchiveException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSGetUncaughtExceptionHandler (typedef NSUncaughtExceptionHandler = Void(typedef NSException = (Void)*))*()
 */
private val NSGetUncaughtExceptionHandler_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSGetUncaughtExceptionHandler_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSGetUncaughtExceptionHandler").orElseThrow() }
private val NSGetUncaughtExceptionHandler_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSGetUncaughtExceptionHandler_ADDR, NSGetUncaughtExceptionHandler_DESC) }

fun NSGetUncaughtExceptionHandler(): MemorySegment {
    try {
        return NSGetUncaughtExceptionHandler_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSSetUncaughtExceptionHandler Void((typedef NSUncaughtExceptionHandler = Void(typedef NSException = (Void)*))*)
 */
private val NSSetUncaughtExceptionHandler_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val NSSetUncaughtExceptionHandler_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSetUncaughtExceptionHandler").orElseThrow() }
private val NSSetUncaughtExceptionHandler_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSSetUncaughtExceptionHandler_ADDR, NSSetUncaughtExceptionHandler_DESC) }

fun NSSetUncaughtExceptionHandler(arg0: MemorySegment): Unit {
    try {
        NSSetUncaughtExceptionHandler_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSAssertionHandlerKey (Void)*
 */
private val NSAssertionHandlerKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSAssertionHandlerKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSAssertionHandlerKey").orElseThrow().reinterpret(NSAssertionHandlerKey_LAYOUT.byteSize()) }
private val NSAssertionHandlerKey_VH: VarHandle by lazy { NSAssertionHandlerKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSAssertionHandlerKey: MemorySegment
    get() = NSAssertionHandlerKey_VH.get(NSAssertionHandlerKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSAssertionHandlerKey_VH.set(NSAssertionHandlerKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalNumberExactnessException typedef const NSExceptionName = (Void)*
 */
private val NSDecimalNumberExactnessException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDecimalNumberExactnessException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalNumberExactnessException").orElseThrow().reinterpret(NSDecimalNumberExactnessException_LAYOUT.byteSize()) }
private val NSDecimalNumberExactnessException_VH: VarHandle by lazy { NSDecimalNumberExactnessException_LAYOUT.varHandle() }

var NSDecimalNumberExactnessException: MemorySegment
    get() = NSDecimalNumberExactnessException_VH.get(NSDecimalNumberExactnessException_SEGMENT, 0L) as MemorySegment
    set(value) = NSDecimalNumberExactnessException_VH.set(NSDecimalNumberExactnessException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalNumberOverflowException typedef const NSExceptionName = (Void)*
 */
private val NSDecimalNumberOverflowException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDecimalNumberOverflowException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalNumberOverflowException").orElseThrow().reinterpret(NSDecimalNumberOverflowException_LAYOUT.byteSize()) }
private val NSDecimalNumberOverflowException_VH: VarHandle by lazy { NSDecimalNumberOverflowException_LAYOUT.varHandle() }

var NSDecimalNumberOverflowException: MemorySegment
    get() = NSDecimalNumberOverflowException_VH.get(NSDecimalNumberOverflowException_SEGMENT, 0L) as MemorySegment
    set(value) = NSDecimalNumberOverflowException_VH.set(NSDecimalNumberOverflowException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalNumberUnderflowException typedef const NSExceptionName = (Void)*
 */
private val NSDecimalNumberUnderflowException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDecimalNumberUnderflowException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalNumberUnderflowException").orElseThrow().reinterpret(NSDecimalNumberUnderflowException_LAYOUT.byteSize()) }
private val NSDecimalNumberUnderflowException_VH: VarHandle by lazy { NSDecimalNumberUnderflowException_LAYOUT.varHandle() }

var NSDecimalNumberUnderflowException: MemorySegment
    get() = NSDecimalNumberUnderflowException_VH.get(NSDecimalNumberUnderflowException_SEGMENT, 0L) as MemorySegment
    set(value) = NSDecimalNumberUnderflowException_VH.set(NSDecimalNumberUnderflowException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDecimalNumberDivideByZeroException typedef const NSExceptionName = (Void)*
 */
private val NSDecimalNumberDivideByZeroException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDecimalNumberDivideByZeroException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDecimalNumberDivideByZeroException").orElseThrow().reinterpret(NSDecimalNumberDivideByZeroException_LAYOUT.byteSize()) }
private val NSDecimalNumberDivideByZeroException_VH: VarHandle by lazy { NSDecimalNumberDivideByZeroException_LAYOUT.varHandle() }

var NSDecimalNumberDivideByZeroException: MemorySegment
    get() = NSDecimalNumberDivideByZeroException_VH.get(NSDecimalNumberDivideByZeroException_SEGMENT, 0L) as MemorySegment
    set(value) = NSDecimalNumberDivideByZeroException_VH.set(NSDecimalNumberDivideByZeroException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSCocoaErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSCocoaErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSCocoaErrorDomain_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSCocoaErrorDomain").orElseThrow().reinterpret(NSCocoaErrorDomain_LAYOUT.byteSize()) }
private val NSCocoaErrorDomain_VH: VarHandle by lazy { NSCocoaErrorDomain_LAYOUT.varHandle() }

var NSCocoaErrorDomain: MemorySegment
    get() = NSCocoaErrorDomain_VH.get(NSCocoaErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSCocoaErrorDomain_VH.set(NSCocoaErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSPOSIXErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSPOSIXErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSPOSIXErrorDomain_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSPOSIXErrorDomain").orElseThrow().reinterpret(NSPOSIXErrorDomain_LAYOUT.byteSize()) }
private val NSPOSIXErrorDomain_VH: VarHandle by lazy { NSPOSIXErrorDomain_LAYOUT.varHandle() }

var NSPOSIXErrorDomain: MemorySegment
    get() = NSPOSIXErrorDomain_VH.get(NSPOSIXErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSPOSIXErrorDomain_VH.set(NSPOSIXErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSOSStatusErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSOSStatusErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSOSStatusErrorDomain_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOSStatusErrorDomain").orElseThrow().reinterpret(NSOSStatusErrorDomain_LAYOUT.byteSize()) }
private val NSOSStatusErrorDomain_VH: VarHandle by lazy { NSOSStatusErrorDomain_LAYOUT.varHandle() }

var NSOSStatusErrorDomain: MemorySegment
    get() = NSOSStatusErrorDomain_VH.get(NSOSStatusErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSOSStatusErrorDomain_VH.set(NSOSStatusErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMachErrorDomain typedef const NSErrorDomain = (Void)*
 */
private val NSMachErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMachErrorDomain_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMachErrorDomain").orElseThrow().reinterpret(NSMachErrorDomain_LAYOUT.byteSize()) }
private val NSMachErrorDomain_VH: VarHandle by lazy { NSMachErrorDomain_LAYOUT.varHandle() }

var NSMachErrorDomain: MemorySegment
    get() = NSMachErrorDomain_VH.get(NSMachErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = NSMachErrorDomain_VH.set(NSMachErrorDomain_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUnderlyingErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSUnderlyingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSUnderlyingErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUnderlyingErrorKey").orElseThrow().reinterpret(NSUnderlyingErrorKey_LAYOUT.byteSize()) }
private val NSUnderlyingErrorKey_VH: VarHandle by lazy { NSUnderlyingErrorKey_LAYOUT.varHandle() }

var NSUnderlyingErrorKey: MemorySegment
    get() = NSUnderlyingErrorKey_VH.get(NSUnderlyingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSUnderlyingErrorKey_VH.set(NSUnderlyingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSMultipleUnderlyingErrorsKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSMultipleUnderlyingErrorsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSMultipleUnderlyingErrorsKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSMultipleUnderlyingErrorsKey").orElseThrow().reinterpret(NSMultipleUnderlyingErrorsKey_LAYOUT.byteSize()) }
private val NSMultipleUnderlyingErrorsKey_VH: VarHandle by lazy { NSMultipleUnderlyingErrorsKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 4, introducedSubminor = -1)
var NSMultipleUnderlyingErrorsKey: MemorySegment
    get() = NSMultipleUnderlyingErrorsKey_VH.get(NSMultipleUnderlyingErrorsKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSMultipleUnderlyingErrorsKey_VH.set(NSMultipleUnderlyingErrorsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalizedDescriptionKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSLocalizedDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedDescriptionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedDescriptionKey").orElseThrow().reinterpret(NSLocalizedDescriptionKey_LAYOUT.byteSize()) }
private val NSLocalizedDescriptionKey_VH: VarHandle by lazy { NSLocalizedDescriptionKey_LAYOUT.varHandle() }

var NSLocalizedDescriptionKey: MemorySegment
    get() = NSLocalizedDescriptionKey_VH.get(NSLocalizedDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalizedDescriptionKey_VH.set(NSLocalizedDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalizedFailureReasonErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSLocalizedFailureReasonErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedFailureReasonErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedFailureReasonErrorKey").orElseThrow().reinterpret(NSLocalizedFailureReasonErrorKey_LAYOUT.byteSize()) }
private val NSLocalizedFailureReasonErrorKey_VH: VarHandle by lazy { NSLocalizedFailureReasonErrorKey_LAYOUT.varHandle() }

var NSLocalizedFailureReasonErrorKey: MemorySegment
    get() = NSLocalizedFailureReasonErrorKey_VH.get(NSLocalizedFailureReasonErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalizedFailureReasonErrorKey_VH.set(NSLocalizedFailureReasonErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalizedRecoverySuggestionErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSLocalizedRecoverySuggestionErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedRecoverySuggestionErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedRecoverySuggestionErrorKey").orElseThrow().reinterpret(NSLocalizedRecoverySuggestionErrorKey_LAYOUT.byteSize()) }
private val NSLocalizedRecoverySuggestionErrorKey_VH: VarHandle by lazy { NSLocalizedRecoverySuggestionErrorKey_LAYOUT.varHandle() }

var NSLocalizedRecoverySuggestionErrorKey: MemorySegment
    get() = NSLocalizedRecoverySuggestionErrorKey_VH.get(NSLocalizedRecoverySuggestionErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalizedRecoverySuggestionErrorKey_VH.set(NSLocalizedRecoverySuggestionErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalizedRecoveryOptionsErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSLocalizedRecoveryOptionsErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedRecoveryOptionsErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedRecoveryOptionsErrorKey").orElseThrow().reinterpret(NSLocalizedRecoveryOptionsErrorKey_LAYOUT.byteSize()) }
private val NSLocalizedRecoveryOptionsErrorKey_VH: VarHandle by lazy { NSLocalizedRecoveryOptionsErrorKey_LAYOUT.varHandle() }

var NSLocalizedRecoveryOptionsErrorKey: MemorySegment
    get() = NSLocalizedRecoveryOptionsErrorKey_VH.get(NSLocalizedRecoveryOptionsErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalizedRecoveryOptionsErrorKey_VH.set(NSLocalizedRecoveryOptionsErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRecoveryAttempterErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSRecoveryAttempterErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRecoveryAttempterErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRecoveryAttempterErrorKey").orElseThrow().reinterpret(NSRecoveryAttempterErrorKey_LAYOUT.byteSize()) }
private val NSRecoveryAttempterErrorKey_VH: VarHandle by lazy { NSRecoveryAttempterErrorKey_LAYOUT.varHandle() }

var NSRecoveryAttempterErrorKey: MemorySegment
    get() = NSRecoveryAttempterErrorKey_VH.get(NSRecoveryAttempterErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSRecoveryAttempterErrorKey_VH.set(NSRecoveryAttempterErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHelpAnchorErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSHelpAnchorErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHelpAnchorErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHelpAnchorErrorKey").orElseThrow().reinterpret(NSHelpAnchorErrorKey_LAYOUT.byteSize()) }
private val NSHelpAnchorErrorKey_VH: VarHandle by lazy { NSHelpAnchorErrorKey_LAYOUT.varHandle() }

var NSHelpAnchorErrorKey: MemorySegment
    get() = NSHelpAnchorErrorKey_VH.get(NSHelpAnchorErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSHelpAnchorErrorKey_VH.set(NSHelpAnchorErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDebugDescriptionErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSDebugDescriptionErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDebugDescriptionErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDebugDescriptionErrorKey").orElseThrow().reinterpret(NSDebugDescriptionErrorKey_LAYOUT.byteSize()) }
private val NSDebugDescriptionErrorKey_VH: VarHandle by lazy { NSDebugDescriptionErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSDebugDescriptionErrorKey: MemorySegment
    get() = NSDebugDescriptionErrorKey_VH.get(NSDebugDescriptionErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSDebugDescriptionErrorKey_VH.set(NSDebugDescriptionErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSLocalizedFailureErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSLocalizedFailureErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSLocalizedFailureErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSLocalizedFailureErrorKey").orElseThrow().reinterpret(NSLocalizedFailureErrorKey_LAYOUT.byteSize()) }
private val NSLocalizedFailureErrorKey_VH: VarHandle by lazy { NSLocalizedFailureErrorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
var NSLocalizedFailureErrorKey: MemorySegment
    get() = NSLocalizedFailureErrorKey_VH.get(NSLocalizedFailureErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSLocalizedFailureErrorKey_VH.set(NSLocalizedFailureErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSStringEncodingErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSStringEncodingErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSStringEncodingErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSStringEncodingErrorKey").orElseThrow().reinterpret(NSStringEncodingErrorKey_LAYOUT.byteSize()) }
private val NSStringEncodingErrorKey_VH: VarHandle by lazy { NSStringEncodingErrorKey_LAYOUT.varHandle() }

var NSStringEncodingErrorKey: MemorySegment
    get() = NSStringEncodingErrorKey_VH.get(NSStringEncodingErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSStringEncodingErrorKey_VH.set(NSStringEncodingErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSURLErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLErrorKey").orElseThrow().reinterpret(NSURLErrorKey_LAYOUT.byteSize()) }
private val NSURLErrorKey_VH: VarHandle by lazy { NSURLErrorKey_LAYOUT.varHandle() }

var NSURLErrorKey: MemorySegment
    get() = NSURLErrorKey_VH.get(NSURLErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLErrorKey_VH.set(NSURLErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFilePathErrorKey typedef const NSErrorUserInfoKey = (Void)*
 */
private val NSFilePathErrorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFilePathErrorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFilePathErrorKey").orElseThrow().reinterpret(NSFilePathErrorKey_LAYOUT.byteSize()) }
private val NSFilePathErrorKey_VH: VarHandle by lazy { NSFilePathErrorKey_LAYOUT.varHandle() }

var NSFilePathErrorKey: MemorySegment
    get() = NSFilePathErrorKey_VH.get(NSFilePathErrorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFilePathErrorKey_VH.set(NSFilePathErrorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSDefaultRunLoopMode typedef const NSRunLoopMode = (Void)*
 */
private val NSDefaultRunLoopMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSDefaultRunLoopMode_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSDefaultRunLoopMode").orElseThrow().reinterpret(NSDefaultRunLoopMode_LAYOUT.byteSize()) }
private val NSDefaultRunLoopMode_VH: VarHandle by lazy { NSDefaultRunLoopMode_LAYOUT.varHandle() }

var NSDefaultRunLoopMode: MemorySegment
    get() = NSDefaultRunLoopMode_VH.get(NSDefaultRunLoopMode_SEGMENT, 0L) as MemorySegment
    set(value) = NSDefaultRunLoopMode_VH.set(NSDefaultRunLoopMode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSRunLoopCommonModes typedef const NSRunLoopMode = (Void)*
 */
private val NSRunLoopCommonModes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSRunLoopCommonModes_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSRunLoopCommonModes").orElseThrow().reinterpret(NSRunLoopCommonModes_LAYOUT.byteSize()) }
private val NSRunLoopCommonModes_VH: VarHandle by lazy { NSRunLoopCommonModes_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSRunLoopCommonModes: MemorySegment
    get() = NSRunLoopCommonModes_VH.get(NSRunLoopCommonModes_SEGMENT, 0L) as MemorySegment
    set(value) = NSRunLoopCommonModes_VH.set(NSRunLoopCommonModes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleOperationException typedef const NSExceptionName = (Void)*
 */
private val NSFileHandleOperationException_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleOperationException_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleOperationException").orElseThrow().reinterpret(NSFileHandleOperationException_LAYOUT.byteSize()) }
private val NSFileHandleOperationException_VH: VarHandle by lazy { NSFileHandleOperationException_LAYOUT.varHandle() }

var NSFileHandleOperationException: MemorySegment
    get() = NSFileHandleOperationException_VH.get(NSFileHandleOperationException_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleOperationException_VH.set(NSFileHandleOperationException_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleReadCompletionNotification typedef const NSNotificationName = (Void)*
 */
private val NSFileHandleReadCompletionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleReadCompletionNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleReadCompletionNotification").orElseThrow().reinterpret(NSFileHandleReadCompletionNotification_LAYOUT.byteSize()) }
private val NSFileHandleReadCompletionNotification_VH: VarHandle by lazy { NSFileHandleReadCompletionNotification_LAYOUT.varHandle() }

var NSFileHandleReadCompletionNotification: MemorySegment
    get() = NSFileHandleReadCompletionNotification_VH.get(NSFileHandleReadCompletionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleReadCompletionNotification_VH.set(NSFileHandleReadCompletionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleReadToEndOfFileCompletionNotification typedef const NSNotificationName = (Void)*
 */
private val NSFileHandleReadToEndOfFileCompletionNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleReadToEndOfFileCompletionNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleReadToEndOfFileCompletionNotification").orElseThrow().reinterpret(NSFileHandleReadToEndOfFileCompletionNotification_LAYOUT.byteSize()) }
private val NSFileHandleReadToEndOfFileCompletionNotification_VH: VarHandle by lazy { NSFileHandleReadToEndOfFileCompletionNotification_LAYOUT.varHandle() }

var NSFileHandleReadToEndOfFileCompletionNotification: MemorySegment
    get() = NSFileHandleReadToEndOfFileCompletionNotification_VH.get(NSFileHandleReadToEndOfFileCompletionNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleReadToEndOfFileCompletionNotification_VH.set(NSFileHandleReadToEndOfFileCompletionNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleConnectionAcceptedNotification typedef const NSNotificationName = (Void)*
 */
private val NSFileHandleConnectionAcceptedNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleConnectionAcceptedNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleConnectionAcceptedNotification").orElseThrow().reinterpret(NSFileHandleConnectionAcceptedNotification_LAYOUT.byteSize()) }
private val NSFileHandleConnectionAcceptedNotification_VH: VarHandle by lazy { NSFileHandleConnectionAcceptedNotification_LAYOUT.varHandle() }

var NSFileHandleConnectionAcceptedNotification: MemorySegment
    get() = NSFileHandleConnectionAcceptedNotification_VH.get(NSFileHandleConnectionAcceptedNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleConnectionAcceptedNotification_VH.set(NSFileHandleConnectionAcceptedNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleDataAvailableNotification typedef const NSNotificationName = (Void)*
 */
private val NSFileHandleDataAvailableNotification_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleDataAvailableNotification_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleDataAvailableNotification").orElseThrow().reinterpret(NSFileHandleDataAvailableNotification_LAYOUT.byteSize()) }
private val NSFileHandleDataAvailableNotification_VH: VarHandle by lazy { NSFileHandleDataAvailableNotification_LAYOUT.varHandle() }

var NSFileHandleDataAvailableNotification: MemorySegment
    get() = NSFileHandleDataAvailableNotification_VH.get(NSFileHandleDataAvailableNotification_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleDataAvailableNotification_VH.set(NSFileHandleDataAvailableNotification_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleNotificationDataItem (Void)*
 */
private val NSFileHandleNotificationDataItem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleNotificationDataItem_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleNotificationDataItem").orElseThrow().reinterpret(NSFileHandleNotificationDataItem_LAYOUT.byteSize()) }
private val NSFileHandleNotificationDataItem_VH: VarHandle by lazy { NSFileHandleNotificationDataItem_LAYOUT.varHandle() }

var NSFileHandleNotificationDataItem: MemorySegment
    get() = NSFileHandleNotificationDataItem_VH.get(NSFileHandleNotificationDataItem_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleNotificationDataItem_VH.set(NSFileHandleNotificationDataItem_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleNotificationFileHandleItem (Void)*
 */
private val NSFileHandleNotificationFileHandleItem_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleNotificationFileHandleItem_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleNotificationFileHandleItem").orElseThrow().reinterpret(NSFileHandleNotificationFileHandleItem_LAYOUT.byteSize()) }
private val NSFileHandleNotificationFileHandleItem_VH: VarHandle by lazy { NSFileHandleNotificationFileHandleItem_LAYOUT.varHandle() }

var NSFileHandleNotificationFileHandleItem: MemorySegment
    get() = NSFileHandleNotificationFileHandleItem_VH.get(NSFileHandleNotificationFileHandleItem_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleNotificationFileHandleItem_VH.set(NSFileHandleNotificationFileHandleItem_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFileHandleNotificationMonitorModes (Void)*
 */
private val NSFileHandleNotificationMonitorModes_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFileHandleNotificationMonitorModes_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFileHandleNotificationMonitorModes").orElseThrow().reinterpret(NSFileHandleNotificationMonitorModes_LAYOUT.byteSize()) }
private val NSFileHandleNotificationMonitorModes_VH: VarHandle by lazy { NSFileHandleNotificationMonitorModes_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
var NSFileHandleNotificationMonitorModes: MemorySegment
    get() = NSFileHandleNotificationMonitorModes_VH.get(NSFileHandleNotificationMonitorModes_SEGMENT, 0L) as MemorySegment
    set(value) = NSFileHandleNotificationMonitorModes_VH.set(NSFileHandleNotificationMonitorModes_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSUserName typedef NSString = (Void)*()
 */
private val NSUserName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSUserName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSUserName").orElseThrow() }
private val NSUserName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSUserName_ADDR, NSUserName_DESC) }

fun NSUserName(): MemorySegment {
    try {
        return NSUserName_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSFullUserName typedef NSString = (Void)*()
 */
private val NSFullUserName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSFullUserName_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFullUserName").orElseThrow() }
private val NSFullUserName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSFullUserName_ADDR, NSFullUserName_DESC) }

fun NSFullUserName(): MemorySegment {
    try {
        return NSFullUserName_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHomeDirectory typedef NSString = (Void)*()
 */
private val NSHomeDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSHomeDirectory_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHomeDirectory").orElseThrow() }
private val NSHomeDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHomeDirectory_ADDR, NSHomeDirectory_DESC) }

fun NSHomeDirectory(): MemorySegment {
    try {
        return NSHomeDirectory_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHomeDirectoryForUser typedef NSString = (Void)*(typedef NSString = (Void)*)
 */
private val NSHomeDirectoryForUser_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val NSHomeDirectoryForUser_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHomeDirectoryForUser").orElseThrow() }
private val NSHomeDirectoryForUser_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSHomeDirectoryForUser_ADDR, NSHomeDirectoryForUser_DESC) }

fun NSHomeDirectoryForUser(arg0: MemorySegment): MemorySegment {
    try {
        return NSHomeDirectoryForUser_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSTemporaryDirectory typedef NSString = (Void)*()
 */
private val NSTemporaryDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSTemporaryDirectory_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSTemporaryDirectory").orElseThrow() }
private val NSTemporaryDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSTemporaryDirectory_ADDR, NSTemporaryDirectory_DESC) }

fun NSTemporaryDirectory(): MemorySegment {
    try {
        return NSTemporaryDirectory_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSOpenStepRootDirectory typedef NSString = (Void)*()
 */
private val NSOpenStepRootDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val NSOpenStepRootDirectory_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSOpenStepRootDirectory").orElseThrow() }
private val NSOpenStepRootDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSOpenStepRootDirectory_ADDR, NSOpenStepRootDirectory_DESC) }

fun NSOpenStepRootDirectory(): MemorySegment {
    try {
        return NSOpenStepRootDirectory_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSSearchPathForDirectoriesInDomains (Void)*(typedef NSSearchPathDirectory = Declared(NSSearchPathDirectory),typedef NSSearchPathDomainMask = Declared(NSSearchPathDomainMask),typedef BOOL = Bool)
 */
private val NSSearchPathForDirectoriesInDomains_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BOOLEAN)
private val NSSearchPathForDirectoriesInDomains_ADDR: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSSearchPathForDirectoriesInDomains").orElseThrow() }
private val NSSearchPathForDirectoriesInDomains_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(NSSearchPathForDirectoriesInDomains_ADDR, NSSearchPathForDirectoriesInDomains_DESC) }

fun NSSearchPathForDirectoriesInDomains(arg0: NSSearchPathDirectory, arg1: NSSearchPathDomainMask, arg2: Boolean): MemorySegment {
    try {
        return NSSearchPathForDirectoriesInDomains_HANDLE.invokeExact(arg0.rawValue, arg1.rawValue, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : NSHTTPPropertyStatusCodeKey (Void)*
 */
private val NSHTTPPropertyStatusCodeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPPropertyStatusCodeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPPropertyStatusCodeKey").orElseThrow().reinterpret(NSHTTPPropertyStatusCodeKey_LAYOUT.byteSize()) }
private val NSHTTPPropertyStatusCodeKey_VH: VarHandle by lazy { NSHTTPPropertyStatusCodeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHTTPPropertyStatusCodeKey: MemorySegment
    get() = NSHTTPPropertyStatusCodeKey_VH.get(NSHTTPPropertyStatusCodeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPPropertyStatusCodeKey_VH.set(NSHTTPPropertyStatusCodeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPPropertyStatusReasonKey (Void)*
 */
private val NSHTTPPropertyStatusReasonKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPPropertyStatusReasonKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPPropertyStatusReasonKey").orElseThrow().reinterpret(NSHTTPPropertyStatusReasonKey_LAYOUT.byteSize()) }
private val NSHTTPPropertyStatusReasonKey_VH: VarHandle by lazy { NSHTTPPropertyStatusReasonKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHTTPPropertyStatusReasonKey: MemorySegment
    get() = NSHTTPPropertyStatusReasonKey_VH.get(NSHTTPPropertyStatusReasonKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPPropertyStatusReasonKey_VH.set(NSHTTPPropertyStatusReasonKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPPropertyServerHTTPVersionKey (Void)*
 */
private val NSHTTPPropertyServerHTTPVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPPropertyServerHTTPVersionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPPropertyServerHTTPVersionKey").orElseThrow().reinterpret(NSHTTPPropertyServerHTTPVersionKey_LAYOUT.byteSize()) }
private val NSHTTPPropertyServerHTTPVersionKey_VH: VarHandle by lazy { NSHTTPPropertyServerHTTPVersionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHTTPPropertyServerHTTPVersionKey: MemorySegment
    get() = NSHTTPPropertyServerHTTPVersionKey_VH.get(NSHTTPPropertyServerHTTPVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPPropertyServerHTTPVersionKey_VH.set(NSHTTPPropertyServerHTTPVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPPropertyRedirectionHeadersKey (Void)*
 */
private val NSHTTPPropertyRedirectionHeadersKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPPropertyRedirectionHeadersKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPPropertyRedirectionHeadersKey").orElseThrow().reinterpret(NSHTTPPropertyRedirectionHeadersKey_LAYOUT.byteSize()) }
private val NSHTTPPropertyRedirectionHeadersKey_VH: VarHandle by lazy { NSHTTPPropertyRedirectionHeadersKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHTTPPropertyRedirectionHeadersKey: MemorySegment
    get() = NSHTTPPropertyRedirectionHeadersKey_VH.get(NSHTTPPropertyRedirectionHeadersKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPPropertyRedirectionHeadersKey_VH.set(NSHTTPPropertyRedirectionHeadersKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPPropertyErrorPageDataKey (Void)*
 */
private val NSHTTPPropertyErrorPageDataKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPPropertyErrorPageDataKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPPropertyErrorPageDataKey").orElseThrow().reinterpret(NSHTTPPropertyErrorPageDataKey_LAYOUT.byteSize()) }
private val NSHTTPPropertyErrorPageDataKey_VH: VarHandle by lazy { NSHTTPPropertyErrorPageDataKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHTTPPropertyErrorPageDataKey: MemorySegment
    get() = NSHTTPPropertyErrorPageDataKey_VH.get(NSHTTPPropertyErrorPageDataKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPPropertyErrorPageDataKey_VH.set(NSHTTPPropertyErrorPageDataKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSHTTPPropertyHTTPProxy (Void)*
 */
private val NSHTTPPropertyHTTPProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSHTTPPropertyHTTPProxy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSHTTPPropertyHTTPProxy").orElseThrow().reinterpret(NSHTTPPropertyHTTPProxy_LAYOUT.byteSize()) }
private val NSHTTPPropertyHTTPProxy_VH: VarHandle by lazy { NSHTTPPropertyHTTPProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSHTTPPropertyHTTPProxy: MemorySegment
    get() = NSHTTPPropertyHTTPProxy_VH.get(NSHTTPPropertyHTTPProxy_SEGMENT, 0L) as MemorySegment
    set(value) = NSHTTPPropertyHTTPProxy_VH.set(NSHTTPPropertyHTTPProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFTPPropertyUserLoginKey (Void)*
 */
private val NSFTPPropertyUserLoginKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFTPPropertyUserLoginKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFTPPropertyUserLoginKey").orElseThrow().reinterpret(NSFTPPropertyUserLoginKey_LAYOUT.byteSize()) }
private val NSFTPPropertyUserLoginKey_VH: VarHandle by lazy { NSFTPPropertyUserLoginKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSFTPPropertyUserLoginKey: MemorySegment
    get() = NSFTPPropertyUserLoginKey_VH.get(NSFTPPropertyUserLoginKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFTPPropertyUserLoginKey_VH.set(NSFTPPropertyUserLoginKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFTPPropertyUserPasswordKey (Void)*
 */
private val NSFTPPropertyUserPasswordKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFTPPropertyUserPasswordKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFTPPropertyUserPasswordKey").orElseThrow().reinterpret(NSFTPPropertyUserPasswordKey_LAYOUT.byteSize()) }
private val NSFTPPropertyUserPasswordKey_VH: VarHandle by lazy { NSFTPPropertyUserPasswordKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSFTPPropertyUserPasswordKey: MemorySegment
    get() = NSFTPPropertyUserPasswordKey_VH.get(NSFTPPropertyUserPasswordKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFTPPropertyUserPasswordKey_VH.set(NSFTPPropertyUserPasswordKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFTPPropertyActiveTransferModeKey (Void)*
 */
private val NSFTPPropertyActiveTransferModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFTPPropertyActiveTransferModeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFTPPropertyActiveTransferModeKey").orElseThrow().reinterpret(NSFTPPropertyActiveTransferModeKey_LAYOUT.byteSize()) }
private val NSFTPPropertyActiveTransferModeKey_VH: VarHandle by lazy { NSFTPPropertyActiveTransferModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSFTPPropertyActiveTransferModeKey: MemorySegment
    get() = NSFTPPropertyActiveTransferModeKey_VH.get(NSFTPPropertyActiveTransferModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFTPPropertyActiveTransferModeKey_VH.set(NSFTPPropertyActiveTransferModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFTPPropertyFileOffsetKey (Void)*
 */
private val NSFTPPropertyFileOffsetKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFTPPropertyFileOffsetKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFTPPropertyFileOffsetKey").orElseThrow().reinterpret(NSFTPPropertyFileOffsetKey_LAYOUT.byteSize()) }
private val NSFTPPropertyFileOffsetKey_VH: VarHandle by lazy { NSFTPPropertyFileOffsetKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSFTPPropertyFileOffsetKey: MemorySegment
    get() = NSFTPPropertyFileOffsetKey_VH.get(NSFTPPropertyFileOffsetKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSFTPPropertyFileOffsetKey_VH.set(NSFTPPropertyFileOffsetKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSFTPPropertyFTPProxy (Void)*
 */
private val NSFTPPropertyFTPProxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSFTPPropertyFTPProxy_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSFTPPropertyFTPProxy").orElseThrow().reinterpret(NSFTPPropertyFTPProxy_LAYOUT.byteSize()) }
private val NSFTPPropertyFTPProxy_VH: VarHandle by lazy { NSFTPPropertyFTPProxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSFTPPropertyFTPProxy: MemorySegment
    get() = NSFTPPropertyFTPProxy_VH.get(NSFTPPropertyFTPProxy_SEGMENT, 0L) as MemorySegment
    set(value) = NSFTPPropertyFTPProxy_VH.set(NSFTPPropertyFTPProxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileScheme (Void)*
 */
private val NSURLFileScheme_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileScheme_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileScheme").orElseThrow().reinterpret(NSURLFileScheme_LAYOUT.byteSize()) }
private val NSURLFileScheme_VH: VarHandle by lazy { NSURLFileScheme_LAYOUT.varHandle() }

var NSURLFileScheme: MemorySegment
    get() = NSURLFileScheme_VH.get(NSURLFileScheme_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileScheme_VH.set(NSURLFileScheme_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLKeysOfUnsetValuesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLKeysOfUnsetValuesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLKeysOfUnsetValuesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLKeysOfUnsetValuesKey").orElseThrow().reinterpret(NSURLKeysOfUnsetValuesKey_LAYOUT.byteSize()) }
private val NSURLKeysOfUnsetValuesKey_VH: VarHandle by lazy { NSURLKeysOfUnsetValuesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLKeysOfUnsetValuesKey: MemorySegment
    get() = NSURLKeysOfUnsetValuesKey_VH.get(NSURLKeysOfUnsetValuesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLKeysOfUnsetValuesKey_VH.set(NSURLKeysOfUnsetValuesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLNameKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLNameKey").orElseThrow().reinterpret(NSURLNameKey_LAYOUT.byteSize()) }
private val NSURLNameKey_VH: VarHandle by lazy { NSURLNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLNameKey: MemorySegment
    get() = NSURLNameKey_VH.get(NSURLNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLNameKey_VH.set(NSURLNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLLocalizedNameKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLLocalizedNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLLocalizedNameKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLLocalizedNameKey").orElseThrow().reinterpret(NSURLLocalizedNameKey_LAYOUT.byteSize()) }
private val NSURLLocalizedNameKey_VH: VarHandle by lazy { NSURLLocalizedNameKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLLocalizedNameKey: MemorySegment
    get() = NSURLLocalizedNameKey_VH.get(NSURLLocalizedNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLLocalizedNameKey_VH.set(NSURLLocalizedNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsRegularFileKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsRegularFileKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsRegularFileKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsRegularFileKey").orElseThrow().reinterpret(NSURLIsRegularFileKey_LAYOUT.byteSize()) }
private val NSURLIsRegularFileKey_VH: VarHandle by lazy { NSURLIsRegularFileKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsRegularFileKey: MemorySegment
    get() = NSURLIsRegularFileKey_VH.get(NSURLIsRegularFileKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsRegularFileKey_VH.set(NSURLIsRegularFileKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsDirectoryKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsDirectoryKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsDirectoryKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsDirectoryKey").orElseThrow().reinterpret(NSURLIsDirectoryKey_LAYOUT.byteSize()) }
private val NSURLIsDirectoryKey_VH: VarHandle by lazy { NSURLIsDirectoryKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsDirectoryKey: MemorySegment
    get() = NSURLIsDirectoryKey_VH.get(NSURLIsDirectoryKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsDirectoryKey_VH.set(NSURLIsDirectoryKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsSymbolicLinkKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsSymbolicLinkKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsSymbolicLinkKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsSymbolicLinkKey").orElseThrow().reinterpret(NSURLIsSymbolicLinkKey_LAYOUT.byteSize()) }
private val NSURLIsSymbolicLinkKey_VH: VarHandle by lazy { NSURLIsSymbolicLinkKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsSymbolicLinkKey: MemorySegment
    get() = NSURLIsSymbolicLinkKey_VH.get(NSURLIsSymbolicLinkKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsSymbolicLinkKey_VH.set(NSURLIsSymbolicLinkKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsVolumeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsVolumeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsVolumeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsVolumeKey").orElseThrow().reinterpret(NSURLIsVolumeKey_LAYOUT.byteSize()) }
private val NSURLIsVolumeKey_VH: VarHandle by lazy { NSURLIsVolumeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsVolumeKey: MemorySegment
    get() = NSURLIsVolumeKey_VH.get(NSURLIsVolumeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsVolumeKey_VH.set(NSURLIsVolumeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsPackageKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsPackageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsPackageKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsPackageKey").orElseThrow().reinterpret(NSURLIsPackageKey_LAYOUT.byteSize()) }
private val NSURLIsPackageKey_VH: VarHandle by lazy { NSURLIsPackageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsPackageKey: MemorySegment
    get() = NSURLIsPackageKey_VH.get(NSURLIsPackageKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsPackageKey_VH.set(NSURLIsPackageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsApplicationKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsApplicationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsApplicationKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsApplicationKey").orElseThrow().reinterpret(NSURLIsApplicationKey_LAYOUT.byteSize()) }
private val NSURLIsApplicationKey_VH: VarHandle by lazy { NSURLIsApplicationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsApplicationKey: MemorySegment
    get() = NSURLIsApplicationKey_VH.get(NSURLIsApplicationKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsApplicationKey_VH.set(NSURLIsApplicationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLApplicationIsScriptableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLApplicationIsScriptableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLApplicationIsScriptableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLApplicationIsScriptableKey").orElseThrow().reinterpret(NSURLApplicationIsScriptableKey_LAYOUT.byteSize()) }
private val NSURLApplicationIsScriptableKey_VH: VarHandle by lazy { NSURLApplicationIsScriptableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLApplicationIsScriptableKey: MemorySegment
    get() = NSURLApplicationIsScriptableKey_VH.get(NSURLApplicationIsScriptableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLApplicationIsScriptableKey_VH.set(NSURLApplicationIsScriptableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsSystemImmutableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsSystemImmutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsSystemImmutableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsSystemImmutableKey").orElseThrow().reinterpret(NSURLIsSystemImmutableKey_LAYOUT.byteSize()) }
private val NSURLIsSystemImmutableKey_VH: VarHandle by lazy { NSURLIsSystemImmutableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsSystemImmutableKey: MemorySegment
    get() = NSURLIsSystemImmutableKey_VH.get(NSURLIsSystemImmutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsSystemImmutableKey_VH.set(NSURLIsSystemImmutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsUserImmutableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsUserImmutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsUserImmutableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsUserImmutableKey").orElseThrow().reinterpret(NSURLIsUserImmutableKey_LAYOUT.byteSize()) }
private val NSURLIsUserImmutableKey_VH: VarHandle by lazy { NSURLIsUserImmutableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsUserImmutableKey: MemorySegment
    get() = NSURLIsUserImmutableKey_VH.get(NSURLIsUserImmutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsUserImmutableKey_VH.set(NSURLIsUserImmutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsHiddenKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsHiddenKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsHiddenKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsHiddenKey").orElseThrow().reinterpret(NSURLIsHiddenKey_LAYOUT.byteSize()) }
private val NSURLIsHiddenKey_VH: VarHandle by lazy { NSURLIsHiddenKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsHiddenKey: MemorySegment
    get() = NSURLIsHiddenKey_VH.get(NSURLIsHiddenKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsHiddenKey_VH.set(NSURLIsHiddenKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLHasHiddenExtensionKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLHasHiddenExtensionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLHasHiddenExtensionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLHasHiddenExtensionKey").orElseThrow().reinterpret(NSURLHasHiddenExtensionKey_LAYOUT.byteSize()) }
private val NSURLHasHiddenExtensionKey_VH: VarHandle by lazy { NSURLHasHiddenExtensionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLHasHiddenExtensionKey: MemorySegment
    get() = NSURLHasHiddenExtensionKey_VH.get(NSURLHasHiddenExtensionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLHasHiddenExtensionKey_VH.set(NSURLHasHiddenExtensionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLCreationDateKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLCreationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLCreationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLCreationDateKey").orElseThrow().reinterpret(NSURLCreationDateKey_LAYOUT.byteSize()) }
private val NSURLCreationDateKey_VH: VarHandle by lazy { NSURLCreationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLCreationDateKey: MemorySegment
    get() = NSURLCreationDateKey_VH.get(NSURLCreationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLCreationDateKey_VH.set(NSURLCreationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLContentAccessDateKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLContentAccessDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLContentAccessDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLContentAccessDateKey").orElseThrow().reinterpret(NSURLContentAccessDateKey_LAYOUT.byteSize()) }
private val NSURLContentAccessDateKey_VH: VarHandle by lazy { NSURLContentAccessDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLContentAccessDateKey: MemorySegment
    get() = NSURLContentAccessDateKey_VH.get(NSURLContentAccessDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLContentAccessDateKey_VH.set(NSURLContentAccessDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLContentModificationDateKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLContentModificationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLContentModificationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLContentModificationDateKey").orElseThrow().reinterpret(NSURLContentModificationDateKey_LAYOUT.byteSize()) }
private val NSURLContentModificationDateKey_VH: VarHandle by lazy { NSURLContentModificationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLContentModificationDateKey: MemorySegment
    get() = NSURLContentModificationDateKey_VH.get(NSURLContentModificationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLContentModificationDateKey_VH.set(NSURLContentModificationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLAttributeModificationDateKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLAttributeModificationDateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLAttributeModificationDateKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLAttributeModificationDateKey").orElseThrow().reinterpret(NSURLAttributeModificationDateKey_LAYOUT.byteSize()) }
private val NSURLAttributeModificationDateKey_VH: VarHandle by lazy { NSURLAttributeModificationDateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLAttributeModificationDateKey: MemorySegment
    get() = NSURLAttributeModificationDateKey_VH.get(NSURLAttributeModificationDateKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLAttributeModificationDateKey_VH.set(NSURLAttributeModificationDateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLLinkCountKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLLinkCountKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLLinkCountKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLLinkCountKey").orElseThrow().reinterpret(NSURLLinkCountKey_LAYOUT.byteSize()) }
private val NSURLLinkCountKey_VH: VarHandle by lazy { NSURLLinkCountKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLLinkCountKey: MemorySegment
    get() = NSURLLinkCountKey_VH.get(NSURLLinkCountKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLLinkCountKey_VH.set(NSURLLinkCountKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLParentDirectoryURLKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLParentDirectoryURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLParentDirectoryURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLParentDirectoryURLKey").orElseThrow().reinterpret(NSURLParentDirectoryURLKey_LAYOUT.byteSize()) }
private val NSURLParentDirectoryURLKey_VH: VarHandle by lazy { NSURLParentDirectoryURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLParentDirectoryURLKey: MemorySegment
    get() = NSURLParentDirectoryURLKey_VH.get(NSURLParentDirectoryURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLParentDirectoryURLKey_VH.set(NSURLParentDirectoryURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeURLKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeURLKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeURLKey").orElseThrow().reinterpret(NSURLVolumeURLKey_LAYOUT.byteSize()) }
private val NSURLVolumeURLKey_VH: VarHandle by lazy { NSURLVolumeURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeURLKey: MemorySegment
    get() = NSURLVolumeURLKey_VH.get(NSURLVolumeURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeURLKey_VH.set(NSURLVolumeURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLTypeIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLTypeIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLTypeIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLTypeIdentifierKey").orElseThrow().reinterpret(NSURLTypeIdentifierKey_LAYOUT.byteSize()) }
private val NSURLTypeIdentifierKey_VH: VarHandle by lazy { NSURLTypeIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use NSURLContentTypeKey instead")
var NSURLTypeIdentifierKey: MemorySegment
    get() = NSURLTypeIdentifierKey_VH.get(NSURLTypeIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLTypeIdentifierKey_VH.set(NSURLTypeIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLContentTypeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLContentTypeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLContentTypeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLContentTypeKey").orElseThrow().reinterpret(NSURLContentTypeKey_LAYOUT.byteSize()) }
private val NSURLContentTypeKey_VH: VarHandle by lazy { NSURLContentTypeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
var NSURLContentTypeKey: MemorySegment
    get() = NSURLContentTypeKey_VH.get(NSURLContentTypeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLContentTypeKey_VH.set(NSURLContentTypeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLLocalizedTypeDescriptionKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLLocalizedTypeDescriptionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLLocalizedTypeDescriptionKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLLocalizedTypeDescriptionKey").orElseThrow().reinterpret(NSURLLocalizedTypeDescriptionKey_LAYOUT.byteSize()) }
private val NSURLLocalizedTypeDescriptionKey_VH: VarHandle by lazy { NSURLLocalizedTypeDescriptionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLLocalizedTypeDescriptionKey: MemorySegment
    get() = NSURLLocalizedTypeDescriptionKey_VH.get(NSURLLocalizedTypeDescriptionKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLLocalizedTypeDescriptionKey_VH.set(NSURLLocalizedTypeDescriptionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLLabelNumberKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLLabelNumberKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLLabelNumberKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLLabelNumberKey").orElseThrow().reinterpret(NSURLLabelNumberKey_LAYOUT.byteSize()) }
private val NSURLLabelNumberKey_VH: VarHandle by lazy { NSURLLabelNumberKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLLabelNumberKey: MemorySegment
    get() = NSURLLabelNumberKey_VH.get(NSURLLabelNumberKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLLabelNumberKey_VH.set(NSURLLabelNumberKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLLabelColorKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLLabelColorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLLabelColorKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLLabelColorKey").orElseThrow().reinterpret(NSURLLabelColorKey_LAYOUT.byteSize()) }
private val NSURLLabelColorKey_VH: VarHandle by lazy { NSURLLabelColorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLLabelColorKey: MemorySegment
    get() = NSURLLabelColorKey_VH.get(NSURLLabelColorKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLLabelColorKey_VH.set(NSURLLabelColorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLLocalizedLabelKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLLocalizedLabelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLLocalizedLabelKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLLocalizedLabelKey").orElseThrow().reinterpret(NSURLLocalizedLabelKey_LAYOUT.byteSize()) }
private val NSURLLocalizedLabelKey_VH: VarHandle by lazy { NSURLLocalizedLabelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLLocalizedLabelKey: MemorySegment
    get() = NSURLLocalizedLabelKey_VH.get(NSURLLocalizedLabelKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLLocalizedLabelKey_VH.set(NSURLLocalizedLabelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLEffectiveIconKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLEffectiveIconKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLEffectiveIconKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLEffectiveIconKey").orElseThrow().reinterpret(NSURLEffectiveIconKey_LAYOUT.byteSize()) }
private val NSURLEffectiveIconKey_VH: VarHandle by lazy { NSURLEffectiveIconKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLEffectiveIconKey: MemorySegment
    get() = NSURLEffectiveIconKey_VH.get(NSURLEffectiveIconKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLEffectiveIconKey_VH.set(NSURLEffectiveIconKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLCustomIconKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLCustomIconKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLCustomIconKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLCustomIconKey").orElseThrow().reinterpret(NSURLCustomIconKey_LAYOUT.byteSize()) }
private val NSURLCustomIconKey_VH: VarHandle by lazy { NSURLCustomIconKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLCustomIconKey: MemorySegment
    get() = NSURLCustomIconKey_VH.get(NSURLCustomIconKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLCustomIconKey_VH.set(NSURLCustomIconKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileResourceIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileResourceIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileResourceIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileResourceIdentifierKey").orElseThrow().reinterpret(NSURLFileResourceIdentifierKey_LAYOUT.byteSize()) }
private val NSURLFileResourceIdentifierKey_VH: VarHandle by lazy { NSURLFileResourceIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileResourceIdentifierKey: MemorySegment
    get() = NSURLFileResourceIdentifierKey_VH.get(NSURLFileResourceIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileResourceIdentifierKey_VH.set(NSURLFileResourceIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLVolumeIdentifierKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLVolumeIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLVolumeIdentifierKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLVolumeIdentifierKey").orElseThrow().reinterpret(NSURLVolumeIdentifierKey_LAYOUT.byteSize()) }
private val NSURLVolumeIdentifierKey_VH: VarHandle by lazy { NSURLVolumeIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLVolumeIdentifierKey: MemorySegment
    get() = NSURLVolumeIdentifierKey_VH.get(NSURLVolumeIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLVolumeIdentifierKey_VH.set(NSURLVolumeIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLPreferredIOBlockSizeKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLPreferredIOBlockSizeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLPreferredIOBlockSizeKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLPreferredIOBlockSizeKey").orElseThrow().reinterpret(NSURLPreferredIOBlockSizeKey_LAYOUT.byteSize()) }
private val NSURLPreferredIOBlockSizeKey_VH: VarHandle by lazy { NSURLPreferredIOBlockSizeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLPreferredIOBlockSizeKey: MemorySegment
    get() = NSURLPreferredIOBlockSizeKey_VH.get(NSURLPreferredIOBlockSizeKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLPreferredIOBlockSizeKey_VH.set(NSURLPreferredIOBlockSizeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsReadableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsReadableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsReadableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsReadableKey").orElseThrow().reinterpret(NSURLIsReadableKey_LAYOUT.byteSize()) }
private val NSURLIsReadableKey_VH: VarHandle by lazy { NSURLIsReadableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsReadableKey: MemorySegment
    get() = NSURLIsReadableKey_VH.get(NSURLIsReadableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsReadableKey_VH.set(NSURLIsReadableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsWritableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsWritableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsWritableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsWritableKey").orElseThrow().reinterpret(NSURLIsWritableKey_LAYOUT.byteSize()) }
private val NSURLIsWritableKey_VH: VarHandle by lazy { NSURLIsWritableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsWritableKey: MemorySegment
    get() = NSURLIsWritableKey_VH.get(NSURLIsWritableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsWritableKey_VH.set(NSURLIsWritableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsExecutableKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsExecutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsExecutableKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsExecutableKey").orElseThrow().reinterpret(NSURLIsExecutableKey_LAYOUT.byteSize()) }
private val NSURLIsExecutableKey_VH: VarHandle by lazy { NSURLIsExecutableKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsExecutableKey: MemorySegment
    get() = NSURLIsExecutableKey_VH.get(NSURLIsExecutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsExecutableKey_VH.set(NSURLIsExecutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLFileSecurityKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLFileSecurityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLFileSecurityKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLFileSecurityKey").orElseThrow().reinterpret(NSURLFileSecurityKey_LAYOUT.byteSize()) }
private val NSURLFileSecurityKey_VH: VarHandle by lazy { NSURLFileSecurityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLFileSecurityKey: MemorySegment
    get() = NSURLFileSecurityKey_VH.get(NSURLFileSecurityKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLFileSecurityKey_VH.set(NSURLFileSecurityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLIsExcludedFromBackupKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLIsExcludedFromBackupKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLIsExcludedFromBackupKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLIsExcludedFromBackupKey").orElseThrow().reinterpret(NSURLIsExcludedFromBackupKey_LAYOUT.byteSize()) }
private val NSURLIsExcludedFromBackupKey_VH: VarHandle by lazy { NSURLIsExcludedFromBackupKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var NSURLIsExcludedFromBackupKey: MemorySegment
    get() = NSURLIsExcludedFromBackupKey_VH.get(NSURLIsExcludedFromBackupKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLIsExcludedFromBackupKey_VH.set(NSURLIsExcludedFromBackupKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : NSURLTagNamesKey typedef const NSURLResourceKey = (Void)*
 */
private val NSURLTagNamesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val NSURLTagNamesKey_SEGMENT: MemorySegment by lazy { SymbolLookup.loaderLookup().find("NSURLTagNamesKey").orElseThrow().reinterpret(NSURLTagNamesKey_LAYOUT.byteSize()) }
private val NSURLTagNamesKey_VH: VarHandle by lazy { NSURLTagNamesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var NSURLTagNamesKey: MemorySegment
    get() = NSURLTagNamesKey_VH.get(NSURLTagNamesKey_SEGMENT, 0L) as MemorySegment
    set(value) = NSURLTagNamesKey_VH.set(NSURLTagNamesKey_SEGMENT, 0L, value)
