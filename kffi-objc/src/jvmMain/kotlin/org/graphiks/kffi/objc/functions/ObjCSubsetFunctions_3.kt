@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : CFWriteStreamCopyDispatchQueue typedef dispatch_queue_t = (Void)*(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamCopyDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFWriteStreamCopyDispatchQueue_ADDR: MemorySegment by lazy { LOOKUP.find("CFWriteStreamCopyDispatchQueue").orElseThrow() }
private val CFWriteStreamCopyDispatchQueue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFWriteStreamCopyDispatchQueue_ADDR, CFWriteStreamCopyDispatchQueue_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFWriteStreamCopyDispatchQueue(arg0: MemorySegment): MemorySegment {
    try {
        return CFWriteStreamCopyDispatchQueue_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFReadStreamGetError typedef CFStreamError = Declared(CFStreamError)(typedef CFReadStreamRef = (Declared(__CFReadStream))*)
 */
private val CFReadStreamGetError_DESC: FunctionDescriptor = FunctionDescriptor.of(CFStreamError.layout, ValueLayout.ADDRESS)
private val CFReadStreamGetError_ADDR: MemorySegment by lazy { LOOKUP.find("CFReadStreamGetError").orElseThrow() }
private val CFReadStreamGetError_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFReadStreamGetError_ADDR, CFReadStreamGetError_DESC) }

fun CFReadStreamGetError(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CFReadStreamGetError_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFWriteStreamGetError typedef CFStreamError = Declared(CFStreamError)(typedef CFWriteStreamRef = (Declared(__CFWriteStream))*)
 */
private val CFWriteStreamGetError_DESC: FunctionDescriptor = FunctionDescriptor.of(CFStreamError.layout, ValueLayout.ADDRESS)
private val CFWriteStreamGetError_ADDR: MemorySegment by lazy { LOOKUP.find("CFWriteStreamGetError").orElseThrow() }
private val CFWriteStreamGetError_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFWriteStreamGetError_ADDR, CFWriteStreamGetError_DESC) }

fun CFWriteStreamGetError(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CFWriteStreamGetError_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateFromXMLData typedef CFPropertyListRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFOptionFlags = UNSIGNED = Long,(typedef CFStringRef = (Declared(__CFString))*)*)
 */
private val CFPropertyListCreateFromXMLData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFPropertyListCreateFromXMLData_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateFromXMLData").orElseThrow() }
private val CFPropertyListCreateFromXMLData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateFromXMLData_ADDR, CFPropertyListCreateFromXMLData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithData instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithData instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithData instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithData instead.")
fun CFPropertyListCreateFromXMLData(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return CFPropertyListCreateFromXMLData_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateXMLData typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFPropertyListRef = (Void)*)
 */
private val CFPropertyListCreateXMLData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPropertyListCreateXMLData_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateXMLData").orElseThrow() }
private val CFPropertyListCreateXMLData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateXMLData_ADDR, CFPropertyListCreateXMLData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateData instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use CFPropertyListCreateData instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateData instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateData instead.")
fun CFPropertyListCreateXMLData(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFPropertyListCreateXMLData_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateDeepCopy typedef CFPropertyListRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFPropertyListRef = (Void)*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFPropertyListCreateDeepCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFPropertyListCreateDeepCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateDeepCopy").orElseThrow() }
private val CFPropertyListCreateDeepCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateDeepCopy_ADDR, CFPropertyListCreateDeepCopy_DESC) }

fun CFPropertyListCreateDeepCopy(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFPropertyListCreateDeepCopy_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListIsValid typedef Boolean = UNSIGNED = Char(typedef CFPropertyListRef = (Void)*,typedef CFPropertyListFormat = Declared(CFPropertyListFormat))
 */
private val CFPropertyListIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFPropertyListIsValid_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListIsValid").orElseThrow() }
private val CFPropertyListIsValid_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListIsValid_ADDR, CFPropertyListIsValid_DESC) }

fun CFPropertyListIsValid(arg0: MemorySegment, arg1: CFPropertyListFormat): Byte {
    try {
        return CFPropertyListIsValid_HANDLE.invokeExact(arg0, arg1.value) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListWriteToStream typedef CFIndex = Long(typedef CFPropertyListRef = (Void)*,typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFPropertyListFormat = Declared(CFPropertyListFormat),(typedef CFStringRef = (Declared(__CFString))*)*)
 */
private val CFPropertyListWriteToStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFPropertyListWriteToStream_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListWriteToStream").orElseThrow() }
private val CFPropertyListWriteToStream_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListWriteToStream_ADDR, CFPropertyListWriteToStream_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListWrite instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use CFPropertyListWrite instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListWrite instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListWrite instead.")
fun CFPropertyListWriteToStream(arg0: MemorySegment, arg1: MemorySegment, arg2: CFPropertyListFormat, arg3: MemorySegment): Long {
    try {
        return CFPropertyListWriteToStream_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateFromStream typedef CFPropertyListRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFIndex = Long,typedef CFOptionFlags = UNSIGNED = Long,(typedef CFPropertyListFormat = Declared(CFPropertyListFormat))*,(typedef CFStringRef = (Declared(__CFString))*)*)
 */
private val CFPropertyListCreateFromStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPropertyListCreateFromStream_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateFromStream").orElseThrow() }
private val CFPropertyListCreateFromStream_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateFromStream_ADDR, CFPropertyListCreateFromStream_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithStream instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithStream instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithStream instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFPropertyListCreateWithStream instead.")
fun CFPropertyListCreateFromStream(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CFPropertyListCreateFromStream_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateWithData typedef CFPropertyListRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFOptionFlags = UNSIGNED = Long,(typedef CFPropertyListFormat = Declared(CFPropertyListFormat))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFPropertyListCreateWithData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPropertyListCreateWithData_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateWithData").orElseThrow() }
private val CFPropertyListCreateWithData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateWithData_ADDR, CFPropertyListCreateWithData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFPropertyListCreateWithData(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFPropertyListCreateWithData_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateWithStream typedef CFPropertyListRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFReadStreamRef = (Declared(__CFReadStream))*,typedef CFIndex = Long,typedef CFOptionFlags = UNSIGNED = Long,(typedef CFPropertyListFormat = Declared(CFPropertyListFormat))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFPropertyListCreateWithStream_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPropertyListCreateWithStream_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateWithStream").orElseThrow() }
private val CFPropertyListCreateWithStream_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateWithStream_ADDR, CFPropertyListCreateWithStream_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFPropertyListCreateWithStream(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CFPropertyListCreateWithStream_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListWrite typedef CFIndex = Long(typedef CFPropertyListRef = (Void)*,typedef CFWriteStreamRef = (Declared(__CFWriteStream))*,typedef CFPropertyListFormat = Declared(CFPropertyListFormat),typedef CFOptionFlags = UNSIGNED = Long,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFPropertyListWrite_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFPropertyListWrite_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListWrite").orElseThrow() }
private val CFPropertyListWrite_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListWrite_ADDR, CFPropertyListWrite_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFPropertyListWrite(arg0: MemorySegment, arg1: MemorySegment, arg2: CFPropertyListFormat, arg3: Long, arg4: MemorySegment): Long {
    try {
        return CFPropertyListWrite_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3, arg4) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPropertyListCreateData typedef CFDataRef = (Declared(__CFData))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFPropertyListRef = (Void)*,typedef CFPropertyListFormat = Declared(CFPropertyListFormat),typedef CFOptionFlags = UNSIGNED = Long,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFPropertyListCreateData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFPropertyListCreateData_ADDR: MemorySegment by lazy { LOOKUP.find("CFPropertyListCreateData").orElseThrow() }
private val CFPropertyListCreateData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPropertyListCreateData_ADDR, CFPropertyListCreateData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFPropertyListCreateData(arg0: MemorySegment, arg1: MemorySegment, arg2: CFPropertyListFormat, arg3: Long, arg4: MemorySegment): MemorySegment {
    try {
        return CFPropertyListCreateData_HANDLE.invokeExact(arg0, arg1, arg2.value, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFTypeSetCallBacks typedef const CFSetCallBacks = Declared(CFSetCallBacks)
 */
val kCFTypeSetCallBacks: MemorySegment = LOOKUP.find("kCFTypeSetCallBacks").orElseThrow()

/**
 * {@snippet lang=c : kCFCopyStringSetCallBacks typedef const CFSetCallBacks = Declared(CFSetCallBacks)
 */
val kCFCopyStringSetCallBacks: MemorySegment = LOOKUP.find("kCFCopyStringSetCallBacks").orElseThrow()

/**
 * {@snippet lang=c : CFSetGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFSetGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFSetGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetGetTypeID").orElseThrow() }
private val CFSetGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetGetTypeID_ADDR, CFSetGetTypeID_DESC) }

fun CFSetGetTypeID(): Long {
    try {
        return CFSetGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetCreate typedef CFSetRef = (Declared(__CFSet))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,((Void)*)*,typedef CFIndex = Long,(typedef CFSetCallBacks = Declared(CFSetCallBacks))*)
 */
private val CFSetCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFSetCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetCreate").orElseThrow() }
private val CFSetCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetCreate_ADDR, CFSetCreate_DESC) }

fun CFSetCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): MemorySegment {
    try {
        return CFSetCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetCreateCopy typedef CFSetRef = (Declared(__CFSet))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFSetRef = (Declared(__CFSet))*)
 */
private val CFSetCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetCreateCopy").orElseThrow() }
private val CFSetCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetCreateCopy_ADDR, CFSetCreateCopy_DESC) }

fun CFSetCreateCopy(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFSetCreateCopy_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetCreateMutable typedef CFMutableSetRef = (Declared(__CFSet))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFIndex = Long,(typedef CFSetCallBacks = Declared(CFSetCallBacks))*)
 */
private val CFSetCreateMutable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFSetCreateMutable_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetCreateMutable").orElseThrow() }
private val CFSetCreateMutable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetCreateMutable_ADDR, CFSetCreateMutable_DESC) }

fun CFSetCreateMutable(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CFSetCreateMutable_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetCreateMutableCopy typedef CFMutableSetRef = (Declared(__CFSet))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFIndex = Long,typedef CFSetRef = (Declared(__CFSet))*)
 */
private val CFSetCreateMutableCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFSetCreateMutableCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetCreateMutableCopy").orElseThrow() }
private val CFSetCreateMutableCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetCreateMutableCopy_ADDR, CFSetCreateMutableCopy_DESC) }

fun CFSetCreateMutableCopy(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CFSetCreateMutableCopy_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetGetCount typedef CFIndex = Long(typedef CFSetRef = (Declared(__CFSet))*)
 */
private val CFSetGetCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFSetGetCount_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetGetCount").orElseThrow() }
private val CFSetGetCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetGetCount_ADDR, CFSetGetCount_DESC) }

fun CFSetGetCount(arg0: MemorySegment): Long {
    try {
        return CFSetGetCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetGetCountOfValue typedef CFIndex = Long(typedef CFSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetGetCountOfValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetGetCountOfValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetGetCountOfValue").orElseThrow() }
private val CFSetGetCountOfValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetGetCountOfValue_ADDR, CFSetGetCountOfValue_DESC) }

fun CFSetGetCountOfValue(arg0: MemorySegment, arg1: MemorySegment): Long {
    try {
        return CFSetGetCountOfValue_HANDLE.invokeExact(arg0, arg1) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetContainsValue typedef Boolean = UNSIGNED = Char(typedef CFSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetContainsValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetContainsValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetContainsValue").orElseThrow() }
private val CFSetContainsValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetContainsValue_ADDR, CFSetContainsValue_DESC) }

fun CFSetContainsValue(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFSetContainsValue_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetGetValue (Void)*(typedef CFSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetGetValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetGetValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetGetValue").orElseThrow() }
private val CFSetGetValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetGetValue_ADDR, CFSetGetValue_DESC) }

fun CFSetGetValue(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFSetGetValue_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetGetValueIfPresent typedef Boolean = UNSIGNED = Char(typedef CFSetRef = (Declared(__CFSet))*,(Void)*,((Void)*)*)
 */
private val CFSetGetValueIfPresent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetGetValueIfPresent_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetGetValueIfPresent").orElseThrow() }
private val CFSetGetValueIfPresent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetGetValueIfPresent_ADDR, CFSetGetValueIfPresent_DESC) }

fun CFSetGetValueIfPresent(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFSetGetValueIfPresent_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetGetValues Void(typedef CFSetRef = (Declared(__CFSet))*,((Void)*)*)
 */
private val CFSetGetValues_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetGetValues_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetGetValues").orElseThrow() }
private val CFSetGetValues_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetGetValues_ADDR, CFSetGetValues_DESC) }

fun CFSetGetValues(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFSetGetValues_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetApplyFunction Void(typedef CFSetRef = (Declared(__CFSet))*,typedef CFSetApplierFunction = (Void((Void)*,(Void)*))*,(Void)*)
 */
private val CFSetApplyFunction_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetApplyFunction_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetApplyFunction").orElseThrow() }
private val CFSetApplyFunction_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetApplyFunction_ADDR, CFSetApplyFunction_DESC) }

fun CFSetApplyFunction(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFSetApplyFunction_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetAddValue Void(typedef CFMutableSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetAddValue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetAddValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetAddValue").orElseThrow() }
private val CFSetAddValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetAddValue_ADDR, CFSetAddValue_DESC) }

fun CFSetAddValue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFSetAddValue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetReplaceValue Void(typedef CFMutableSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetReplaceValue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetReplaceValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetReplaceValue").orElseThrow() }
private val CFSetReplaceValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetReplaceValue_ADDR, CFSetReplaceValue_DESC) }

fun CFSetReplaceValue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFSetReplaceValue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetSetValue Void(typedef CFMutableSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetSetValue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetSetValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetSetValue").orElseThrow() }
private val CFSetSetValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetSetValue_ADDR, CFSetSetValue_DESC) }

fun CFSetSetValue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFSetSetValue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetRemoveValue Void(typedef CFMutableSetRef = (Declared(__CFSet))*,(Void)*)
 */
private val CFSetRemoveValue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFSetRemoveValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetRemoveValue").orElseThrow() }
private val CFSetRemoveValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetRemoveValue_ADDR, CFSetRemoveValue_DESC) }

fun CFSetRemoveValue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFSetRemoveValue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFSetRemoveAllValues Void(typedef CFMutableSetRef = (Declared(__CFSet))*)
 */
private val CFSetRemoveAllValues_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFSetRemoveAllValues_ADDR: MemorySegment by lazy { LOOKUP.find("CFSetRemoveAllValues").orElseThrow() }
private val CFSetRemoveAllValues_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFSetRemoveAllValues_ADDR, CFSetRemoveAllValues_DESC) }

fun CFSetRemoveAllValues(arg0: MemorySegment): Unit {
    try {
        CFSetRemoveAllValues_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFTreeGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFTreeGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetTypeID").orElseThrow() }
private val CFTreeGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetTypeID_ADDR, CFTreeGetTypeID_DESC) }

fun CFTreeGetTypeID(): Long {
    try {
        return CFTreeGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeCreate typedef CFTreeRef = (Declared(__CFTree))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,(typedef CFTreeContext = Declared(CFTreeContext))*)
 */
private val CFTreeCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeCreate").orElseThrow() }
private val CFTreeCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeCreate_ADDR, CFTreeCreate_DESC) }

fun CFTreeCreate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFTreeCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetParent typedef CFTreeRef = (Declared(__CFTree))*(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeGetParent_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeGetParent_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetParent").orElseThrow() }
private val CFTreeGetParent_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetParent_ADDR, CFTreeGetParent_DESC) }

fun CFTreeGetParent(arg0: MemorySegment): MemorySegment {
    try {
        return CFTreeGetParent_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetNextSibling typedef CFTreeRef = (Declared(__CFTree))*(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeGetNextSibling_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeGetNextSibling_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetNextSibling").orElseThrow() }
private val CFTreeGetNextSibling_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetNextSibling_ADDR, CFTreeGetNextSibling_DESC) }

fun CFTreeGetNextSibling(arg0: MemorySegment): MemorySegment {
    try {
        return CFTreeGetNextSibling_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetFirstChild typedef CFTreeRef = (Declared(__CFTree))*(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeGetFirstChild_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeGetFirstChild_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetFirstChild").orElseThrow() }
private val CFTreeGetFirstChild_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetFirstChild_ADDR, CFTreeGetFirstChild_DESC) }

fun CFTreeGetFirstChild(arg0: MemorySegment): MemorySegment {
    try {
        return CFTreeGetFirstChild_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetContext Void(typedef CFTreeRef = (Declared(__CFTree))*,(typedef CFTreeContext = Declared(CFTreeContext))*)
 */
private val CFTreeGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeGetContext_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetContext").orElseThrow() }
private val CFTreeGetContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetContext_ADDR, CFTreeGetContext_DESC) }

fun CFTreeGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFTreeGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetChildCount typedef CFIndex = Long(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeGetChildCount_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFTreeGetChildCount_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetChildCount").orElseThrow() }
private val CFTreeGetChildCount_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetChildCount_ADDR, CFTreeGetChildCount_DESC) }

fun CFTreeGetChildCount(arg0: MemorySegment): Long {
    try {
        return CFTreeGetChildCount_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetChildAtIndex typedef CFTreeRef = (Declared(__CFTree))*(typedef CFTreeRef = (Declared(__CFTree))*,typedef CFIndex = Long)
 */
private val CFTreeGetChildAtIndex_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFTreeGetChildAtIndex_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetChildAtIndex").orElseThrow() }
private val CFTreeGetChildAtIndex_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetChildAtIndex_ADDR, CFTreeGetChildAtIndex_DESC) }

fun CFTreeGetChildAtIndex(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return CFTreeGetChildAtIndex_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeGetChildren Void(typedef CFTreeRef = (Declared(__CFTree))*,(typedef CFTreeRef = (Declared(__CFTree))*)*)
 */
private val CFTreeGetChildren_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeGetChildren_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeGetChildren").orElseThrow() }
private val CFTreeGetChildren_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeGetChildren_ADDR, CFTreeGetChildren_DESC) }

fun CFTreeGetChildren(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFTreeGetChildren_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeApplyFunctionToChildren Void(typedef CFTreeRef = (Declared(__CFTree))*,typedef CFTreeApplierFunction = (Void((Void)*,(Void)*))*,(Void)*)
 */
private val CFTreeApplyFunctionToChildren_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeApplyFunctionToChildren_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeApplyFunctionToChildren").orElseThrow() }
private val CFTreeApplyFunctionToChildren_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeApplyFunctionToChildren_ADDR, CFTreeApplyFunctionToChildren_DESC) }

fun CFTreeApplyFunctionToChildren(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFTreeApplyFunctionToChildren_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeFindRoot typedef CFTreeRef = (Declared(__CFTree))*(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeFindRoot_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeFindRoot_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeFindRoot").orElseThrow() }
private val CFTreeFindRoot_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeFindRoot_ADDR, CFTreeFindRoot_DESC) }

fun CFTreeFindRoot(arg0: MemorySegment): MemorySegment {
    try {
        return CFTreeFindRoot_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeSetContext Void(typedef CFTreeRef = (Declared(__CFTree))*,(typedef CFTreeContext = Declared(CFTreeContext))*)
 */
private val CFTreeSetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeSetContext_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeSetContext").orElseThrow() }
private val CFTreeSetContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeSetContext_ADDR, CFTreeSetContext_DESC) }

fun CFTreeSetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFTreeSetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreePrependChild Void(typedef CFTreeRef = (Declared(__CFTree))*,typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreePrependChild_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreePrependChild_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreePrependChild").orElseThrow() }
private val CFTreePrependChild_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreePrependChild_ADDR, CFTreePrependChild_DESC) }

fun CFTreePrependChild(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFTreePrependChild_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeAppendChild Void(typedef CFTreeRef = (Declared(__CFTree))*,typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeAppendChild_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeAppendChild_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeAppendChild").orElseThrow() }
private val CFTreeAppendChild_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeAppendChild_ADDR, CFTreeAppendChild_DESC) }

fun CFTreeAppendChild(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFTreeAppendChild_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeInsertSibling Void(typedef CFTreeRef = (Declared(__CFTree))*,typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeInsertSibling_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeInsertSibling_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeInsertSibling").orElseThrow() }
private val CFTreeInsertSibling_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeInsertSibling_ADDR, CFTreeInsertSibling_DESC) }

fun CFTreeInsertSibling(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFTreeInsertSibling_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeRemove Void(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeRemove_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFTreeRemove_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeRemove").orElseThrow() }
private val CFTreeRemove_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeRemove_ADDR, CFTreeRemove_DESC) }

fun CFTreeRemove(arg0: MemorySegment): Unit {
    try {
        CFTreeRemove_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeRemoveAllChildren Void(typedef CFTreeRef = (Declared(__CFTree))*)
 */
private val CFTreeRemoveAllChildren_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFTreeRemoveAllChildren_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeRemoveAllChildren").orElseThrow() }
private val CFTreeRemoveAllChildren_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeRemoveAllChildren_ADDR, CFTreeRemoveAllChildren_DESC) }

fun CFTreeRemoveAllChildren(arg0: MemorySegment): Unit {
    try {
        CFTreeRemoveAllChildren_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFTreeSortChildren Void(typedef CFTreeRef = (Declared(__CFTree))*,typedef CFComparatorFunction = (Declared(CFComparisonResult)((Void)*,(Void)*,(Void)*))*,(Void)*)
 */
private val CFTreeSortChildren_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFTreeSortChildren_ADDR: MemorySegment by lazy { LOOKUP.find("CFTreeSortChildren").orElseThrow() }
private val CFTreeSortChildren_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFTreeSortChildren_ADDR, CFTreeSortChildren_DESC) }

fun CFTreeSortChildren(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFTreeSortChildren_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreateDataAndPropertiesFromResource typedef Boolean = UNSIGNED = Char(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,(typedef CFDataRef = (Declared(__CFData))*)*,(typedef CFDictionaryRef = (Declared(__CFDictionary))*)*,typedef CFArrayRef = (Declared(__CFArray))*,(typedef SInt32 = Int)*)
 */
private val CFURLCreateDataAndPropertiesFromResource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreateDataAndPropertiesFromResource_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLCreateDataAndPropertiesFromResource").orElseThrow() }
private val CFURLCreateDataAndPropertiesFromResource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreateDataAndPropertiesFromResource_ADDR, CFURLCreateDataAndPropertiesFromResource_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For resource data, use the CFReadStream API. For file resource properties, use CFURLCopyResourcePropertiesForKeys.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "For resource data, use the CFReadStream API. For file resource properties, use CFURLCopyResourcePropertiesForKeys.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For resource data, use the CFReadStream API. For file resource properties, use CFURLCopyResourcePropertiesForKeys.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For resource data, use the CFReadStream API. For file resource properties, use CFURLCopyResourcePropertiesForKeys.")
fun CFURLCreateDataAndPropertiesFromResource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment): Byte {
    try {
        return CFURLCreateDataAndPropertiesFromResource_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLWriteDataAndPropertiesToResource typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*,(typedef SInt32 = Int)*)
 */
private val CFURLWriteDataAndPropertiesToResource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLWriteDataAndPropertiesToResource_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLWriteDataAndPropertiesToResource").orElseThrow() }
private val CFURLWriteDataAndPropertiesToResource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLWriteDataAndPropertiesToResource_ADDR, CFURLWriteDataAndPropertiesToResource_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For resource data, use the CFWriteStream API. For file resource properties, use CFURLSetResourcePropertiesForKeys.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "For resource data, use the CFWriteStream API. For file resource properties, use CFURLSetResourcePropertiesForKeys.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For resource data, use the CFWriteStream API. For file resource properties, use CFURLSetResourcePropertiesForKeys.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For resource data, use the CFWriteStream API. For file resource properties, use CFURLSetResourcePropertiesForKeys.")
fun CFURLWriteDataAndPropertiesToResource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Byte {
    try {
        return CFURLWriteDataAndPropertiesToResource_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLDestroyResource typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,(typedef SInt32 = Int)*)
 */
private val CFURLDestroyResource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLDestroyResource_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLDestroyResource").orElseThrow() }
private val CFURLDestroyResource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLDestroyResource_ADDR, CFURLDestroyResource_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLGetFileSystemRepresentation and removefile(3) instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use CFURLGetFileSystemRepresentation and removefile(3) instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLGetFileSystemRepresentation and removefile(3) instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLGetFileSystemRepresentation and removefile(3) instead.")
fun CFURLDestroyResource(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFURLDestroyResource_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLCreatePropertyFromResource typedef CFTypeRef = (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,(typedef SInt32 = Int)*)
 */
private val CFURLCreatePropertyFromResource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLCreatePropertyFromResource_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLCreatePropertyFromResource").orElseThrow() }
private val CFURLCreatePropertyFromResource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLCreatePropertyFromResource_ADDR, CFURLCreatePropertyFromResource_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For file resource properties, use CFURLCopyResourcePropertyForKey.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "For file resource properties, use CFURLCopyResourcePropertyForKey.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For file resource properties, use CFURLCopyResourcePropertyForKey.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "For file resource properties, use CFURLCopyResourcePropertyForKey.")
fun CFURLCreatePropertyFromResource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFURLCreatePropertyFromResource_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFURLFileExists typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileExists_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileExists_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLFileExists").orElseThrow().reinterpret(kCFURLFileExists_LAYOUT.byteSize()) }
private val kCFURLFileExists_VH: VarHandle by lazy { kCFURLFileExists_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLResourceIsReachable instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use CFURLResourceIsReachable instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLResourceIsReachable instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLResourceIsReachable instead.")
var kCFURLFileExists: MemorySegment
    get() = kCFURLFileExists_VH.get(kCFURLFileExists_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileExists_VH.set(kCFURLFileExists_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileDirectoryContents typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileDirectoryContents_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileDirectoryContents_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLFileDirectoryContents").orElseThrow().reinterpret(kCFURLFileDirectoryContents_LAYOUT.byteSize()) }
private val kCFURLFileDirectoryContents_VH: VarHandle by lazy { kCFURLFileDirectoryContents_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the CFURLEnumerator API instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use the CFURLEnumerator API instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the CFURLEnumerator API instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use the CFURLEnumerator API instead.")
var kCFURLFileDirectoryContents: MemorySegment
    get() = kCFURLFileDirectoryContents_VH.get(kCFURLFileDirectoryContents_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileDirectoryContents_VH.set(kCFURLFileDirectoryContents_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileLength typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileLength_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileLength_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLFileLength").orElseThrow().reinterpret(kCFURLFileLength_LAYOUT.byteSize()) }
private val kCFURLFileLength_VH: VarHandle by lazy { kCFURLFileLength_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSizeKey instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSizeKey instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSizeKey instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSizeKey instead.")
var kCFURLFileLength: MemorySegment
    get() = kCFURLFileLength_VH.get(kCFURLFileLength_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileLength_VH.set(kCFURLFileLength_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileLastModificationTime typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileLastModificationTime_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileLastModificationTime_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLFileLastModificationTime").orElseThrow().reinterpret(kCFURLFileLastModificationTime_LAYOUT.byteSize()) }
private val kCFURLFileLastModificationTime_VH: VarHandle by lazy { kCFURLFileLastModificationTime_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLContentModificationDateKey instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLContentModificationDateKey instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLContentModificationDateKey instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLContentModificationDateKey instead.")
var kCFURLFileLastModificationTime: MemorySegment
    get() = kCFURLFileLastModificationTime_VH.get(kCFURLFileLastModificationTime_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileLastModificationTime_VH.set(kCFURLFileLastModificationTime_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFilePOSIXMode typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFilePOSIXMode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFilePOSIXMode_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLFilePOSIXMode").orElseThrow().reinterpret(kCFURLFilePOSIXMode_LAYOUT.byteSize()) }
private val kCFURLFilePOSIXMode_VH: VarHandle by lazy { kCFURLFilePOSIXMode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
var kCFURLFilePOSIXMode: MemorySegment
    get() = kCFURLFilePOSIXMode_VH.get(kCFURLFilePOSIXMode_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFilePOSIXMode_VH.set(kCFURLFilePOSIXMode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLFileOwnerID typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLFileOwnerID_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLFileOwnerID_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLFileOwnerID").orElseThrow().reinterpret(kCFURLFileOwnerID_LAYOUT.byteSize()) }
private val kCFURLFileOwnerID_VH: VarHandle by lazy { kCFURLFileOwnerID_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use CFURLCopyResourcePropertyForKey with kCFURLFileSecurityKey and then the CFFileSecurity API instead.")
var kCFURLFileOwnerID: MemorySegment
    get() = kCFURLFileOwnerID_VH.get(kCFURLFileOwnerID_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLFileOwnerID_VH.set(kCFURLFileOwnerID_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLHTTPStatusCode typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLHTTPStatusCode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLHTTPStatusCode_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLHTTPStatusCode").orElseThrow().reinterpret(kCFURLHTTPStatusCode_LAYOUT.byteSize()) }
private val kCFURLHTTPStatusCode_VH: VarHandle by lazy { kCFURLHTTPStatusCode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
var kCFURLHTTPStatusCode: MemorySegment
    get() = kCFURLHTTPStatusCode_VH.get(kCFURLHTTPStatusCode_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLHTTPStatusCode_VH.set(kCFURLHTTPStatusCode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFURLHTTPStatusLine typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFURLHTTPStatusLine_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFURLHTTPStatusLine_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFURLHTTPStatusLine").orElseThrow().reinterpret(kCFURLHTTPStatusLine_LAYOUT.byteSize()) }
private val kCFURLHTTPStatusLine_VH: VarHandle by lazy { kCFURLHTTPStatusLine_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 7, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSHTTPURLResponse methods instead.")
var kCFURLHTTPStatusLine: MemorySegment
    get() = kCFURLHTTPStatusLine_VH.get(kCFURLHTTPStatusLine_SEGMENT, 0L) as MemorySegment
    set(value) = kCFURLHTTPStatusLine_VH.set(kCFURLHTTPStatusLine_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFUUIDGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFUUIDGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFUUIDGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDGetTypeID").orElseThrow() }
private val CFUUIDGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDGetTypeID_ADDR, CFUUIDGetTypeID_DESC) }

fun CFUUIDGetTypeID(): Long {
    try {
        return CFUUIDGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDCreate typedef CFUUIDRef = (Declared(__CFUUID))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*)
 */
private val CFUUIDCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUUIDCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDCreate").orElseThrow() }
private val CFUUIDCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDCreate_ADDR, CFUUIDCreate_DESC) }

fun CFUUIDCreate(arg0: MemorySegment): MemorySegment {
    try {
        return CFUUIDCreate_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDCreateWithBytes typedef CFUUIDRef = (Declared(__CFUUID))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char)
 */
private val CFUUIDCreateWithBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)
private val CFUUIDCreateWithBytes_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDCreateWithBytes").orElseThrow() }
private val CFUUIDCreateWithBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDCreateWithBytes_ADDR, CFUUIDCreateWithBytes_DESC) }

fun CFUUIDCreateWithBytes(arg0: MemorySegment, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Byte, arg5: Byte, arg6: Byte, arg7: Byte, arg8: Byte, arg9: Byte, arg10: Byte, arg11: Byte, arg12: Byte, arg13: Byte, arg14: Byte, arg15: Byte, arg16: Byte): MemorySegment {
    try {
        return CFUUIDCreateWithBytes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDCreateFromString typedef CFUUIDRef = (Declared(__CFUUID))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFUUIDCreateFromString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUUIDCreateFromString_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDCreateFromString").orElseThrow() }
private val CFUUIDCreateFromString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDCreateFromString_ADDR, CFUUIDCreateFromString_DESC) }

fun CFUUIDCreateFromString(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFUUIDCreateFromString_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDCreateString typedef CFStringRef = (Declared(__CFString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFUUIDCreateString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUUIDCreateString_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDCreateString").orElseThrow() }
private val CFUUIDCreateString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDCreateString_ADDR, CFUUIDCreateString_DESC) }

fun CFUUIDCreateString(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFUUIDCreateString_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDGetConstantUUIDWithBytes typedef CFUUIDRef = (Declared(__CFUUID))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char,typedef UInt8 = UNSIGNED = Char)
 */
private val CFUUIDGetConstantUUIDWithBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)
private val CFUUIDGetConstantUUIDWithBytes_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDGetConstantUUIDWithBytes").orElseThrow() }
private val CFUUIDGetConstantUUIDWithBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDGetConstantUUIDWithBytes_ADDR, CFUUIDGetConstantUUIDWithBytes_DESC) }

fun CFUUIDGetConstantUUIDWithBytes(arg0: MemorySegment, arg1: Byte, arg2: Byte, arg3: Byte, arg4: Byte, arg5: Byte, arg6: Byte, arg7: Byte, arg8: Byte, arg9: Byte, arg10: Byte, arg11: Byte, arg12: Byte, arg13: Byte, arg14: Byte, arg15: Byte, arg16: Byte): MemorySegment {
    try {
        return CFUUIDGetConstantUUIDWithBytes_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDGetUUIDBytes typedef CFUUIDBytes = Declared(CFUUIDBytes)(typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFUUIDGetUUIDBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(CFUUIDBytes.layout, ValueLayout.ADDRESS)
private val CFUUIDGetUUIDBytes_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDGetUUIDBytes").orElseThrow() }
private val CFUUIDGetUUIDBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDGetUUIDBytes_ADDR, CFUUIDGetUUIDBytes_DESC) }

fun CFUUIDGetUUIDBytes(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CFUUIDGetUUIDBytes_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUUIDCreateFromUUIDBytes typedef CFUUIDRef = (Declared(__CFUUID))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFUUIDBytes = Declared(CFUUIDBytes))
 */
private val CFUUIDCreateFromUUIDBytes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFUUIDBytes.layout)
private val CFUUIDCreateFromUUIDBytes_ADDR: MemorySegment by lazy { LOOKUP.find("CFUUIDCreateFromUUIDBytes").orElseThrow() }
private val CFUUIDCreateFromUUIDBytes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUUIDCreateFromUUIDBytes_ADDR, CFUUIDCreateFromUUIDBytes_DESC) }

fun CFUUIDCreateFromUUIDBytes(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFUUIDCreateFromUUIDBytes_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFCopyHomeDirectoryURL typedef CFURLRef = (Declared(__CFURL))*()
 */
private val CFCopyHomeDirectoryURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFCopyHomeDirectoryURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFCopyHomeDirectoryURL").orElseThrow() }
private val CFCopyHomeDirectoryURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFCopyHomeDirectoryURL_ADDR, CFCopyHomeDirectoryURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFCopyHomeDirectoryURL(): MemorySegment {
    try {
        return CFCopyHomeDirectoryURL_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFBundleInfoDictionaryVersionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleInfoDictionaryVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleInfoDictionaryVersionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleInfoDictionaryVersionKey").orElseThrow().reinterpret(kCFBundleInfoDictionaryVersionKey_LAYOUT.byteSize()) }
private val kCFBundleInfoDictionaryVersionKey_VH: VarHandle by lazy { kCFBundleInfoDictionaryVersionKey_LAYOUT.varHandle() }

var kCFBundleInfoDictionaryVersionKey: MemorySegment
    get() = kCFBundleInfoDictionaryVersionKey_VH.get(kCFBundleInfoDictionaryVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleInfoDictionaryVersionKey_VH.set(kCFBundleInfoDictionaryVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBundleExecutableKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleExecutableKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleExecutableKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleExecutableKey").orElseThrow().reinterpret(kCFBundleExecutableKey_LAYOUT.byteSize()) }
private val kCFBundleExecutableKey_VH: VarHandle by lazy { kCFBundleExecutableKey_LAYOUT.varHandle() }

var kCFBundleExecutableKey: MemorySegment
    get() = kCFBundleExecutableKey_VH.get(kCFBundleExecutableKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleExecutableKey_VH.set(kCFBundleExecutableKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBundleIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleIdentifierKey").orElseThrow().reinterpret(kCFBundleIdentifierKey_LAYOUT.byteSize()) }
private val kCFBundleIdentifierKey_VH: VarHandle by lazy { kCFBundleIdentifierKey_LAYOUT.varHandle() }

var kCFBundleIdentifierKey: MemorySegment
    get() = kCFBundleIdentifierKey_VH.get(kCFBundleIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleIdentifierKey_VH.set(kCFBundleIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBundleVersionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleVersionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleVersionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleVersionKey").orElseThrow().reinterpret(kCFBundleVersionKey_LAYOUT.byteSize()) }
private val kCFBundleVersionKey_VH: VarHandle by lazy { kCFBundleVersionKey_LAYOUT.varHandle() }

var kCFBundleVersionKey: MemorySegment
    get() = kCFBundleVersionKey_VH.get(kCFBundleVersionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleVersionKey_VH.set(kCFBundleVersionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBundleDevelopmentRegionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleDevelopmentRegionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleDevelopmentRegionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleDevelopmentRegionKey").orElseThrow().reinterpret(kCFBundleDevelopmentRegionKey_LAYOUT.byteSize()) }
private val kCFBundleDevelopmentRegionKey_VH: VarHandle by lazy { kCFBundleDevelopmentRegionKey_LAYOUT.varHandle() }

var kCFBundleDevelopmentRegionKey: MemorySegment
    get() = kCFBundleDevelopmentRegionKey_VH.get(kCFBundleDevelopmentRegionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleDevelopmentRegionKey_VH.set(kCFBundleDevelopmentRegionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBundleNameKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleNameKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleNameKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleNameKey").orElseThrow().reinterpret(kCFBundleNameKey_LAYOUT.byteSize()) }
private val kCFBundleNameKey_VH: VarHandle by lazy { kCFBundleNameKey_LAYOUT.varHandle() }

var kCFBundleNameKey: MemorySegment
    get() = kCFBundleNameKey_VH.get(kCFBundleNameKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleNameKey_VH.set(kCFBundleNameKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFBundleLocalizationsKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFBundleLocalizationsKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFBundleLocalizationsKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFBundleLocalizationsKey").orElseThrow().reinterpret(kCFBundleLocalizationsKey_LAYOUT.byteSize()) }
private val kCFBundleLocalizationsKey_VH: VarHandle by lazy { kCFBundleLocalizationsKey_LAYOUT.varHandle() }

var kCFBundleLocalizationsKey: MemorySegment
    get() = kCFBundleLocalizationsKey_VH.get(kCFBundleLocalizationsKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFBundleLocalizationsKey_VH.set(kCFBundleLocalizationsKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFBundleGetMainBundle typedef CFBundleRef = (Declared(__CFBundle))*()
 */
private val CFBundleGetMainBundle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFBundleGetMainBundle_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetMainBundle").orElseThrow() }
private val CFBundleGetMainBundle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetMainBundle_ADDR, CFBundleGetMainBundle_DESC) }

fun CFBundleGetMainBundle(): MemorySegment {
    try {
        return CFBundleGetMainBundle_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetBundleWithIdentifier typedef CFBundleRef = (Declared(__CFBundle))*(typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleGetBundleWithIdentifier_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetBundleWithIdentifier_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetBundleWithIdentifier").orElseThrow() }
private val CFBundleGetBundleWithIdentifier_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetBundleWithIdentifier_ADDR, CFBundleGetBundleWithIdentifier_DESC) }

fun CFBundleGetBundleWithIdentifier(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleGetBundleWithIdentifier_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetAllBundles typedef CFArrayRef = (Declared(__CFArray))*()
 */
private val CFBundleGetAllBundles_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS)
private val CFBundleGetAllBundles_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetAllBundles").orElseThrow() }
private val CFBundleGetAllBundles_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetAllBundles_ADDR, CFBundleGetAllBundles_DESC) }

fun CFBundleGetAllBundles(): MemorySegment {
    try {
        return CFBundleGetAllBundles_HANDLE.invokeExact() as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFBundleGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFBundleGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetTypeID").orElseThrow() }
private val CFBundleGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetTypeID_ADDR, CFBundleGetTypeID_DESC) }

fun CFBundleGetTypeID(): Long {
    try {
        return CFBundleGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCreate typedef CFBundleRef = (Declared(__CFBundle))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFBundleCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCreate").orElseThrow() }
private val CFBundleCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCreate_ADDR, CFBundleCreate_DESC) }

fun CFBundleCreate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFBundleCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCreateBundlesFromDirectory typedef CFArrayRef = (Declared(__CFArray))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCreateBundlesFromDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCreateBundlesFromDirectory_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCreateBundlesFromDirectory").orElseThrow() }
private val CFBundleCreateBundlesFromDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCreateBundlesFromDirectory_ADDR, CFBundleCreateBundlesFromDirectory_DESC) }

fun CFBundleCreateBundlesFromDirectory(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFBundleCreateBundlesFromDirectory_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyBundleURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyBundleURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyBundleURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyBundleURL").orElseThrow() }
private val CFBundleCopyBundleURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyBundleURL_ADDR, CFBundleCopyBundleURL_DESC) }

fun CFBundleCopyBundleURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyBundleURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetValueForInfoDictionaryKey typedef CFTypeRef = (Void)*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleGetValueForInfoDictionaryKey_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetValueForInfoDictionaryKey_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetValueForInfoDictionaryKey").orElseThrow() }
private val CFBundleGetValueForInfoDictionaryKey_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetValueForInfoDictionaryKey_ADDR, CFBundleGetValueForInfoDictionaryKey_DESC) }

fun CFBundleGetValueForInfoDictionaryKey(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFBundleGetValueForInfoDictionaryKey_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetInfoDictionary typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleGetInfoDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetInfoDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetInfoDictionary").orElseThrow() }
private val CFBundleGetInfoDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetInfoDictionary_ADDR, CFBundleGetInfoDictionary_DESC) }

fun CFBundleGetInfoDictionary(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleGetInfoDictionary_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetLocalInfoDictionary typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleGetLocalInfoDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetLocalInfoDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetLocalInfoDictionary").orElseThrow() }
private val CFBundleGetLocalInfoDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetLocalInfoDictionary_ADDR, CFBundleGetLocalInfoDictionary_DESC) }

fun CFBundleGetLocalInfoDictionary(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleGetLocalInfoDictionary_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetPackageInfo Void(typedef CFBundleRef = (Declared(__CFBundle))*,(typedef UInt32 = UNSIGNED = Int)*,(typedef UInt32 = UNSIGNED = Int)*)
 */
private val CFBundleGetPackageInfo_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetPackageInfo_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetPackageInfo").orElseThrow() }
private val CFBundleGetPackageInfo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetPackageInfo_ADDR, CFBundleGetPackageInfo_DESC) }

fun CFBundleGetPackageInfo(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFBundleGetPackageInfo_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetIdentifier typedef CFStringRef = (Declared(__CFString))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleGetIdentifier_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetIdentifier_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetIdentifier").orElseThrow() }
private val CFBundleGetIdentifier_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetIdentifier_ADDR, CFBundleGetIdentifier_DESC) }

fun CFBundleGetIdentifier(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleGetIdentifier_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetVersionNumber typedef UInt32 = UNSIGNED = Int(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleGetVersionNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFBundleGetVersionNumber_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetVersionNumber").orElseThrow() }
private val CFBundleGetVersionNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetVersionNumber_ADDR, CFBundleGetVersionNumber_DESC) }

fun CFBundleGetVersionNumber(arg0: MemorySegment): Int {
    try {
        return CFBundleGetVersionNumber_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetDevelopmentRegion typedef CFStringRef = (Declared(__CFString))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleGetDevelopmentRegion_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetDevelopmentRegion_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetDevelopmentRegion").orElseThrow() }
private val CFBundleGetDevelopmentRegion_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetDevelopmentRegion_ADDR, CFBundleGetDevelopmentRegion_DESC) }

fun CFBundleGetDevelopmentRegion(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleGetDevelopmentRegion_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopySupportFilesDirectoryURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopySupportFilesDirectoryURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopySupportFilesDirectoryURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopySupportFilesDirectoryURL").orElseThrow() }
private val CFBundleCopySupportFilesDirectoryURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopySupportFilesDirectoryURL_ADDR, CFBundleCopySupportFilesDirectoryURL_DESC) }

fun CFBundleCopySupportFilesDirectoryURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopySupportFilesDirectoryURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourcesDirectoryURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyResourcesDirectoryURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourcesDirectoryURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourcesDirectoryURL").orElseThrow() }
private val CFBundleCopyResourcesDirectoryURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourcesDirectoryURL_ADDR, CFBundleCopyResourcesDirectoryURL_DESC) }

fun CFBundleCopyResourcesDirectoryURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourcesDirectoryURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyPrivateFrameworksURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyPrivateFrameworksURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyPrivateFrameworksURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyPrivateFrameworksURL").orElseThrow() }
private val CFBundleCopyPrivateFrameworksURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyPrivateFrameworksURL_ADDR, CFBundleCopyPrivateFrameworksURL_DESC) }

fun CFBundleCopyPrivateFrameworksURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyPrivateFrameworksURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopySharedFrameworksURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopySharedFrameworksURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopySharedFrameworksURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopySharedFrameworksURL").orElseThrow() }
private val CFBundleCopySharedFrameworksURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopySharedFrameworksURL_ADDR, CFBundleCopySharedFrameworksURL_DESC) }

fun CFBundleCopySharedFrameworksURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopySharedFrameworksURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopySharedSupportURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopySharedSupportURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopySharedSupportURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopySharedSupportURL").orElseThrow() }
private val CFBundleCopySharedSupportURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopySharedSupportURL_ADDR, CFBundleCopySharedSupportURL_DESC) }

fun CFBundleCopySharedSupportURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopySharedSupportURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyBuiltInPlugInsURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyBuiltInPlugInsURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyBuiltInPlugInsURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyBuiltInPlugInsURL").orElseThrow() }
private val CFBundleCopyBuiltInPlugInsURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyBuiltInPlugInsURL_ADDR, CFBundleCopyBuiltInPlugInsURL_DESC) }

fun CFBundleCopyBuiltInPlugInsURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyBuiltInPlugInsURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyInfoDictionaryInDirectory typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFBundleCopyInfoDictionaryInDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyInfoDictionaryInDirectory_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyInfoDictionaryInDirectory").orElseThrow() }
private val CFBundleCopyInfoDictionaryInDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyInfoDictionaryInDirectory_ADDR, CFBundleCopyInfoDictionaryInDirectory_DESC) }

fun CFBundleCopyInfoDictionaryInDirectory(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyInfoDictionaryInDirectory_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetPackageInfoInDirectory typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*,(typedef UInt32 = UNSIGNED = Int)*,(typedef UInt32 = UNSIGNED = Int)*)
 */
private val CFBundleGetPackageInfoInDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetPackageInfoInDirectory_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetPackageInfoInDirectory").orElseThrow() }
private val CFBundleGetPackageInfoInDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetPackageInfoInDirectory_ADDR, CFBundleGetPackageInfoInDirectory_DESC) }

fun CFBundleGetPackageInfoInDirectory(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFBundleGetPackageInfoInDirectory_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourceURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyResourceURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourceURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourceURL").orElseThrow() }
private val CFBundleCopyResourceURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourceURL_ADDR, CFBundleCopyResourceURL_DESC) }

fun CFBundleCopyResourceURL(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourceURL_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourceURLsOfType typedef CFArrayRef = (Declared(__CFArray))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyResourceURLsOfType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourceURLsOfType_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourceURLsOfType").orElseThrow() }
private val CFBundleCopyResourceURLsOfType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourceURLsOfType_ADDR, CFBundleCopyResourceURLsOfType_DESC) }

fun CFBundleCopyResourceURLsOfType(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourceURLsOfType_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyLocalizedString typedef CFStringRef = (Declared(__CFString))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyLocalizedString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyLocalizedString_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyLocalizedString").orElseThrow() }
private val CFBundleCopyLocalizedString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyLocalizedString_ADDR, CFBundleCopyLocalizedString_DESC) }

fun CFBundleCopyLocalizedString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyLocalizedString_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyLocalizedStringForLocalizations typedef CFStringRef = (Declared(__CFString))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFArrayRef = (Declared(__CFArray))*)
 */
private val CFBundleCopyLocalizedStringForLocalizations_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyLocalizedStringForLocalizations_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyLocalizedStringForLocalizations").orElseThrow() }
private val CFBundleCopyLocalizedStringForLocalizations_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyLocalizedStringForLocalizations_ADDR, CFBundleCopyLocalizedStringForLocalizations_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 4, introducedSubminor = -1)
fun CFBundleCopyLocalizedStringForLocalizations(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyLocalizedStringForLocalizations_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourceURLInDirectory typedef CFURLRef = (Declared(__CFURL))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyResourceURLInDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourceURLInDirectory_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourceURLInDirectory").orElseThrow() }
private val CFBundleCopyResourceURLInDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourceURLInDirectory_ADDR, CFBundleCopyResourceURLInDirectory_DESC) }

fun CFBundleCopyResourceURLInDirectory(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourceURLInDirectory_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourceURLsOfTypeInDirectory typedef CFArrayRef = (Declared(__CFArray))*(typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyResourceURLsOfTypeInDirectory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourceURLsOfTypeInDirectory_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourceURLsOfTypeInDirectory").orElseThrow() }
private val CFBundleCopyResourceURLsOfTypeInDirectory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourceURLsOfTypeInDirectory_ADDR, CFBundleCopyResourceURLsOfTypeInDirectory_DESC) }

fun CFBundleCopyResourceURLsOfTypeInDirectory(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourceURLsOfTypeInDirectory_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyBundleLocalizations typedef CFArrayRef = (Declared(__CFArray))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyBundleLocalizations_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyBundleLocalizations_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyBundleLocalizations").orElseThrow() }
private val CFBundleCopyBundleLocalizations_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyBundleLocalizations_ADDR, CFBundleCopyBundleLocalizations_DESC) }

fun CFBundleCopyBundleLocalizations(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyBundleLocalizations_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyPreferredLocalizationsFromArray typedef CFArrayRef = (Declared(__CFArray))*(typedef CFArrayRef = (Declared(__CFArray))*)
 */
private val CFBundleCopyPreferredLocalizationsFromArray_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyPreferredLocalizationsFromArray_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyPreferredLocalizationsFromArray").orElseThrow() }
private val CFBundleCopyPreferredLocalizationsFromArray_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyPreferredLocalizationsFromArray_ADDR, CFBundleCopyPreferredLocalizationsFromArray_DESC) }

fun CFBundleCopyPreferredLocalizationsFromArray(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyPreferredLocalizationsFromArray_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyLocalizationsForPreferences typedef CFArrayRef = (Declared(__CFArray))*(typedef CFArrayRef = (Declared(__CFArray))*,typedef CFArrayRef = (Declared(__CFArray))*)
 */
private val CFBundleCopyLocalizationsForPreferences_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyLocalizationsForPreferences_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyLocalizationsForPreferences").orElseThrow() }
private val CFBundleCopyLocalizationsForPreferences_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyLocalizationsForPreferences_ADDR, CFBundleCopyLocalizationsForPreferences_DESC) }

fun CFBundleCopyLocalizationsForPreferences(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyLocalizationsForPreferences_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourceURLForLocalization typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyResourceURLForLocalization_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourceURLForLocalization_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourceURLForLocalization").orElseThrow() }
private val CFBundleCopyResourceURLForLocalization_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourceURLForLocalization_ADDR, CFBundleCopyResourceURLForLocalization_DESC) }

fun CFBundleCopyResourceURLForLocalization(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourceURLForLocalization_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyResourceURLsOfTypeForLocalization typedef CFArrayRef = (Declared(__CFArray))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyResourceURLsOfTypeForLocalization_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyResourceURLsOfTypeForLocalization_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyResourceURLsOfTypeForLocalization").orElseThrow() }
private val CFBundleCopyResourceURLsOfTypeForLocalization_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyResourceURLsOfTypeForLocalization_ADDR, CFBundleCopyResourceURLsOfTypeForLocalization_DESC) }

fun CFBundleCopyResourceURLsOfTypeForLocalization(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyResourceURLsOfTypeForLocalization_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyInfoDictionaryForURL typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFBundleCopyInfoDictionaryForURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyInfoDictionaryForURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyInfoDictionaryForURL").orElseThrow() }
private val CFBundleCopyInfoDictionaryForURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyInfoDictionaryForURL_ADDR, CFBundleCopyInfoDictionaryForURL_DESC) }

fun CFBundleCopyInfoDictionaryForURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyInfoDictionaryForURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyLocalizationsForURL typedef CFArrayRef = (Declared(__CFArray))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFBundleCopyLocalizationsForURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyLocalizationsForURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyLocalizationsForURL").orElseThrow() }
private val CFBundleCopyLocalizationsForURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyLocalizationsForURL_ADDR, CFBundleCopyLocalizationsForURL_DESC) }

fun CFBundleCopyLocalizationsForURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyLocalizationsForURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyExecutableArchitecturesForURL typedef CFArrayRef = (Declared(__CFArray))*(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFBundleCopyExecutableArchitecturesForURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyExecutableArchitecturesForURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyExecutableArchitecturesForURL").orElseThrow() }
private val CFBundleCopyExecutableArchitecturesForURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyExecutableArchitecturesForURL_ADDR, CFBundleCopyExecutableArchitecturesForURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFBundleCopyExecutableArchitecturesForURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyExecutableArchitecturesForURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyExecutableURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyExecutableURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyExecutableURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyExecutableURL").orElseThrow() }
private val CFBundleCopyExecutableURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyExecutableURL_ADDR, CFBundleCopyExecutableURL_DESC) }

fun CFBundleCopyExecutableURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyExecutableURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyExecutableArchitectures typedef CFArrayRef = (Declared(__CFArray))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleCopyExecutableArchitectures_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyExecutableArchitectures_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyExecutableArchitectures").orElseThrow() }
private val CFBundleCopyExecutableArchitectures_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyExecutableArchitectures_ADDR, CFBundleCopyExecutableArchitectures_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFBundleCopyExecutableArchitectures(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyExecutableArchitectures_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundlePreflightExecutable typedef Boolean = UNSIGNED = Char(typedef CFBundleRef = (Declared(__CFBundle))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFBundlePreflightExecutable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundlePreflightExecutable_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundlePreflightExecutable").orElseThrow() }
private val CFBundlePreflightExecutable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundlePreflightExecutable_ADDR, CFBundlePreflightExecutable_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFBundlePreflightExecutable(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFBundlePreflightExecutable_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleLoadExecutableAndReturnError typedef Boolean = UNSIGNED = Char(typedef CFBundleRef = (Declared(__CFBundle))*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFBundleLoadExecutableAndReturnError_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleLoadExecutableAndReturnError_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleLoadExecutableAndReturnError").orElseThrow() }
private val CFBundleLoadExecutableAndReturnError_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleLoadExecutableAndReturnError_ADDR, CFBundleLoadExecutableAndReturnError_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFBundleLoadExecutableAndReturnError(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFBundleLoadExecutableAndReturnError_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleLoadExecutable typedef Boolean = UNSIGNED = Char(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleLoadExecutable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFBundleLoadExecutable_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleLoadExecutable").orElseThrow() }
private val CFBundleLoadExecutable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleLoadExecutable_ADDR, CFBundleLoadExecutable_DESC) }

fun CFBundleLoadExecutable(arg0: MemorySegment): Byte {
    try {
        return CFBundleLoadExecutable_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleIsExecutableLoaded typedef Boolean = UNSIGNED = Char(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleIsExecutableLoaded_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFBundleIsExecutableLoaded_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleIsExecutableLoaded").orElseThrow() }
private val CFBundleIsExecutableLoaded_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleIsExecutableLoaded_ADDR, CFBundleIsExecutableLoaded_DESC) }

fun CFBundleIsExecutableLoaded(arg0: MemorySegment): Byte {
    try {
        return CFBundleIsExecutableLoaded_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleUnloadExecutable Void(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleUnloadExecutable_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFBundleUnloadExecutable_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleUnloadExecutable").orElseThrow() }
private val CFBundleUnloadExecutable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleUnloadExecutable_ADDR, CFBundleUnloadExecutable_DESC) }

fun CFBundleUnloadExecutable(arg0: MemorySegment): Unit {
    try {
        CFBundleUnloadExecutable_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetFunctionPointerForName (Void)*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleGetFunctionPointerForName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetFunctionPointerForName_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetFunctionPointerForName").orElseThrow() }
private val CFBundleGetFunctionPointerForName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetFunctionPointerForName_ADDR, CFBundleGetFunctionPointerForName_DESC) }

fun CFBundleGetFunctionPointerForName(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFBundleGetFunctionPointerForName_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetFunctionPointersForNames Void(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFArrayRef = (Declared(__CFArray))*,((Void)*)*)
 */
private val CFBundleGetFunctionPointersForNames_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetFunctionPointersForNames_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetFunctionPointersForNames").orElseThrow() }
private val CFBundleGetFunctionPointersForNames_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetFunctionPointersForNames_ADDR, CFBundleGetFunctionPointersForNames_DESC) }

fun CFBundleGetFunctionPointersForNames(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFBundleGetFunctionPointersForNames_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetDataPointerForName (Void)*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleGetDataPointerForName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetDataPointerForName_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetDataPointerForName").orElseThrow() }
private val CFBundleGetDataPointerForName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetDataPointerForName_ADDR, CFBundleGetDataPointerForName_DESC) }

fun CFBundleGetDataPointerForName(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFBundleGetDataPointerForName_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetDataPointersForNames Void(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFArrayRef = (Declared(__CFArray))*,((Void)*)*)
 */
private val CFBundleGetDataPointersForNames_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetDataPointersForNames_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetDataPointersForNames").orElseThrow() }
private val CFBundleGetDataPointersForNames_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetDataPointersForNames_ADDR, CFBundleGetDataPointersForNames_DESC) }

fun CFBundleGetDataPointersForNames(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFBundleGetDataPointersForNames_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCopyAuxiliaryExecutableURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFBundleCopyAuxiliaryExecutableURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleCopyAuxiliaryExecutableURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCopyAuxiliaryExecutableURL").orElseThrow() }
private val CFBundleCopyAuxiliaryExecutableURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCopyAuxiliaryExecutableURL_ADDR, CFBundleCopyAuxiliaryExecutableURL_DESC) }

fun CFBundleCopyAuxiliaryExecutableURL(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFBundleCopyAuxiliaryExecutableURL_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleIsExecutableLoadable typedef Boolean = UNSIGNED = Char(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleIsExecutableLoadable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFBundleIsExecutableLoadable_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleIsExecutableLoadable").orElseThrow() }
private val CFBundleIsExecutableLoadable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleIsExecutableLoadable_ADDR, CFBundleIsExecutableLoadable_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFBundleIsExecutableLoadable(arg0: MemorySegment): Byte {
    try {
        return CFBundleIsExecutableLoadable_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleIsExecutableLoadableForURL typedef Boolean = UNSIGNED = Char(typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFBundleIsExecutableLoadableForURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFBundleIsExecutableLoadableForURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleIsExecutableLoadableForURL").orElseThrow() }
private val CFBundleIsExecutableLoadableForURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleIsExecutableLoadableForURL_ADDR, CFBundleIsExecutableLoadableForURL_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFBundleIsExecutableLoadableForURL(arg0: MemorySegment): Byte {
    try {
        return CFBundleIsExecutableLoadableForURL_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleIsArchitectureLoadable typedef Boolean = UNSIGNED = Char(typedef cpu_type_t = Int)
 */
private val CFBundleIsArchitectureLoadable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
private val CFBundleIsArchitectureLoadable_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleIsArchitectureLoadable").orElseThrow() }
private val CFBundleIsArchitectureLoadable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleIsArchitectureLoadable_ADDR, CFBundleIsArchitectureLoadable_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFBundleIsArchitectureLoadable(arg0: Int): Byte {
    try {
        return CFBundleIsArchitectureLoadable_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleGetPlugIn typedef CFPlugInRef = (Declared(__CFBundle))*(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleGetPlugIn_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleGetPlugIn_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleGetPlugIn").orElseThrow() }
private val CFBundleGetPlugIn_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleGetPlugIn_ADDR, CFBundleGetPlugIn_DESC) }

fun CFBundleGetPlugIn(arg0: MemorySegment): MemorySegment {
    try {
        return CFBundleGetPlugIn_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleOpenBundleResourceMap typedef CFBundleRefNum = Int(typedef CFBundleRef = (Declared(__CFBundle))*)
 */
private val CFBundleOpenBundleResourceMap_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFBundleOpenBundleResourceMap_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleOpenBundleResourceMap").orElseThrow() }
private val CFBundleOpenBundleResourceMap_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleOpenBundleResourceMap_ADDR, CFBundleOpenBundleResourceMap_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The Carbon Resource Manager is deprecated. This should only be used to access Resource Manager-style resources in old bundles.")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFBundleOpenBundleResourceMap(arg0: MemorySegment): Int {
    try {
        return CFBundleOpenBundleResourceMap_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleOpenBundleResourceFiles typedef SInt32 = Int(typedef CFBundleRef = (Declared(__CFBundle))*,(typedef CFBundleRefNum = Int)*,(typedef CFBundleRefNum = Int)*)
 */
private val CFBundleOpenBundleResourceFiles_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFBundleOpenBundleResourceFiles_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleOpenBundleResourceFiles").orElseThrow() }
private val CFBundleOpenBundleResourceFiles_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleOpenBundleResourceFiles_ADDR, CFBundleOpenBundleResourceFiles_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The Carbon Resource Manager is deprecated. This should only be used to access Resource Manager-style resources in old bundles.")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFBundleOpenBundleResourceFiles(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Int {
    try {
        return CFBundleOpenBundleResourceFiles_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFBundleCloseBundleResourceMap Void(typedef CFBundleRef = (Declared(__CFBundle))*,typedef CFBundleRefNum = Int)
 */
private val CFBundleCloseBundleResourceMap_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFBundleCloseBundleResourceMap_ADDR: MemorySegment by lazy { LOOKUP.find("CFBundleCloseBundleResourceMap").orElseThrow() }
private val CFBundleCloseBundleResourceMap_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFBundleCloseBundleResourceMap_ADDR, CFBundleCloseBundleResourceMap_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The Carbon Resource Manager is deprecated. This should only be used to access Resource Manager-style resources in old bundles.")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFBundleCloseBundleResourceMap(arg0: MemorySegment, arg1: Int): Unit {
    try {
        CFBundleCloseBundleResourceMap_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFMessagePortGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFMessagePortGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortGetTypeID").orElseThrow() }
private val CFMessagePortGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortGetTypeID_ADDR, CFMessagePortGetTypeID_DESC) }

fun CFMessagePortGetTypeID(): Long {
    try {
        return CFMessagePortGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortCreateLocal typedef CFMessagePortRef = (Declared(__CFMessagePort))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFMessagePortCallBack = ((Declared(__CFData))*((Declared(__CFMessagePort))*,Int,(Declared(__CFData))*,(Void)*))*,(typedef CFMessagePortContext = Declared(CFMessagePortContext))*,(typedef Boolean = UNSIGNED = Char)*)
 */
private val CFMessagePortCreateLocal_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortCreateLocal_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortCreateLocal").orElseThrow() }
private val CFMessagePortCreateLocal_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortCreateLocal_ADDR, CFMessagePortCreateLocal_DESC) }

fun CFMessagePortCreateLocal(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFMessagePortCreateLocal_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortCreateRemote typedef CFMessagePortRef = (Declared(__CFMessagePort))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFMessagePortCreateRemote_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortCreateRemote_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortCreateRemote").orElseThrow() }
private val CFMessagePortCreateRemote_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortCreateRemote_ADDR, CFMessagePortCreateRemote_DESC) }

fun CFMessagePortCreateRemote(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFMessagePortCreateRemote_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortIsRemote typedef Boolean = UNSIGNED = Char(typedef CFMessagePortRef = (Declared(__CFMessagePort))*)
 */
private val CFMessagePortIsRemote_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFMessagePortIsRemote_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortIsRemote").orElseThrow() }
private val CFMessagePortIsRemote_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortIsRemote_ADDR, CFMessagePortIsRemote_DESC) }

fun CFMessagePortIsRemote(arg0: MemorySegment): Byte {
    try {
        return CFMessagePortIsRemote_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortGetName typedef CFStringRef = (Declared(__CFString))*(typedef CFMessagePortRef = (Declared(__CFMessagePort))*)
 */
private val CFMessagePortGetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortGetName_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortGetName").orElseThrow() }
private val CFMessagePortGetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortGetName_ADDR, CFMessagePortGetName_DESC) }

fun CFMessagePortGetName(arg0: MemorySegment): MemorySegment {
    try {
        return CFMessagePortGetName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortSetName typedef Boolean = UNSIGNED = Char(typedef CFMessagePortRef = (Declared(__CFMessagePort))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFMessagePortSetName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortSetName_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortSetName").orElseThrow() }
private val CFMessagePortSetName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortSetName_ADDR, CFMessagePortSetName_DESC) }

fun CFMessagePortSetName(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFMessagePortSetName_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortGetContext Void(typedef CFMessagePortRef = (Declared(__CFMessagePort))*,(typedef CFMessagePortContext = Declared(CFMessagePortContext))*)
 */
private val CFMessagePortGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortGetContext_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortGetContext").orElseThrow() }
private val CFMessagePortGetContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortGetContext_ADDR, CFMessagePortGetContext_DESC) }

fun CFMessagePortGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFMessagePortGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortInvalidate Void(typedef CFMessagePortRef = (Declared(__CFMessagePort))*)
 */
private val CFMessagePortInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFMessagePortInvalidate_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortInvalidate").orElseThrow() }
private val CFMessagePortInvalidate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortInvalidate_ADDR, CFMessagePortInvalidate_DESC) }

fun CFMessagePortInvalidate(arg0: MemorySegment): Unit {
    try {
        CFMessagePortInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortIsValid typedef Boolean = UNSIGNED = Char(typedef CFMessagePortRef = (Declared(__CFMessagePort))*)
 */
private val CFMessagePortIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFMessagePortIsValid_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortIsValid").orElseThrow() }
private val CFMessagePortIsValid_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortIsValid_ADDR, CFMessagePortIsValid_DESC) }

fun CFMessagePortIsValid(arg0: MemorySegment): Byte {
    try {
        return CFMessagePortIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortGetInvalidationCallBack typedef CFMessagePortInvalidationCallBack = (Void((Declared(__CFMessagePort))*,(Void)*))*(typedef CFMessagePortRef = (Declared(__CFMessagePort))*)
 */
private val CFMessagePortGetInvalidationCallBack_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortGetInvalidationCallBack_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortGetInvalidationCallBack").orElseThrow() }
private val CFMessagePortGetInvalidationCallBack_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortGetInvalidationCallBack_ADDR, CFMessagePortGetInvalidationCallBack_DESC) }

fun CFMessagePortGetInvalidationCallBack(arg0: MemorySegment): MemorySegment {
    try {
        return CFMessagePortGetInvalidationCallBack_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortSetInvalidationCallBack Void(typedef CFMessagePortRef = (Declared(__CFMessagePort))*,typedef CFMessagePortInvalidationCallBack = (Void((Declared(__CFMessagePort))*,(Void)*))*)
 */
private val CFMessagePortSetInvalidationCallBack_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortSetInvalidationCallBack_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortSetInvalidationCallBack").orElseThrow() }
private val CFMessagePortSetInvalidationCallBack_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortSetInvalidationCallBack_ADDR, CFMessagePortSetInvalidationCallBack_DESC) }

fun CFMessagePortSetInvalidationCallBack(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFMessagePortSetInvalidationCallBack_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortSendRequest typedef SInt32 = Int(typedef CFMessagePortRef = (Declared(__CFMessagePort))*,typedef SInt32 = Int,typedef CFDataRef = (Declared(__CFData))*,typedef CFTimeInterval = Double,typedef CFTimeInterval = Double,typedef CFStringRef = (Declared(__CFString))*,(typedef CFDataRef = (Declared(__CFData))*)*)
 */
private val CFMessagePortSendRequest_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortSendRequest_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortSendRequest").orElseThrow() }
private val CFMessagePortSendRequest_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortSendRequest_ADDR, CFMessagePortSendRequest_DESC) }

fun CFMessagePortSendRequest(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: Double, arg4: Double, arg5: MemorySegment, arg6: MemorySegment): Int {
    try {
        return CFMessagePortSendRequest_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortCreateRunLoopSource typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFMessagePortRef = (Declared(__CFMessagePort))*,typedef CFIndex = Long)
 */
private val CFMessagePortCreateRunLoopSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFMessagePortCreateRunLoopSource_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortCreateRunLoopSource").orElseThrow() }
private val CFMessagePortCreateRunLoopSource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortCreateRunLoopSource_ADDR, CFMessagePortCreateRunLoopSource_DESC) }

fun CFMessagePortCreateRunLoopSource(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFMessagePortCreateRunLoopSource_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMessagePortSetDispatchQueue Void(typedef CFMessagePortRef = (Declared(__CFMessagePort))*,typedef __strong dispatch_queue_t = (Void)*)
 */
private val CFMessagePortSetDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMessagePortSetDispatchQueue_ADDR: MemorySegment by lazy { LOOKUP.find("CFMessagePortSetDispatchQueue").orElseThrow() }
private val CFMessagePortSetDispatchQueue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMessagePortSetDispatchQueue_ADDR, CFMessagePortSetDispatchQueue_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFMessagePortSetDispatchQueue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFMessagePortSetDispatchQueue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFPlugInDynamicRegistrationKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPlugInDynamicRegistrationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPlugInDynamicRegistrationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFPlugInDynamicRegistrationKey").orElseThrow().reinterpret(kCFPlugInDynamicRegistrationKey_LAYOUT.byteSize()) }
private val kCFPlugInDynamicRegistrationKey_VH: VarHandle by lazy { kCFPlugInDynamicRegistrationKey_LAYOUT.varHandle() }

var kCFPlugInDynamicRegistrationKey: MemorySegment
    get() = kCFPlugInDynamicRegistrationKey_VH.get(kCFPlugInDynamicRegistrationKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPlugInDynamicRegistrationKey_VH.set(kCFPlugInDynamicRegistrationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPlugInDynamicRegisterFunctionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPlugInDynamicRegisterFunctionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPlugInDynamicRegisterFunctionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFPlugInDynamicRegisterFunctionKey").orElseThrow().reinterpret(kCFPlugInDynamicRegisterFunctionKey_LAYOUT.byteSize()) }
private val kCFPlugInDynamicRegisterFunctionKey_VH: VarHandle by lazy { kCFPlugInDynamicRegisterFunctionKey_LAYOUT.varHandle() }

var kCFPlugInDynamicRegisterFunctionKey: MemorySegment
    get() = kCFPlugInDynamicRegisterFunctionKey_VH.get(kCFPlugInDynamicRegisterFunctionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPlugInDynamicRegisterFunctionKey_VH.set(kCFPlugInDynamicRegisterFunctionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPlugInUnloadFunctionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPlugInUnloadFunctionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPlugInUnloadFunctionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFPlugInUnloadFunctionKey").orElseThrow().reinterpret(kCFPlugInUnloadFunctionKey_LAYOUT.byteSize()) }
private val kCFPlugInUnloadFunctionKey_VH: VarHandle by lazy { kCFPlugInUnloadFunctionKey_LAYOUT.varHandle() }

var kCFPlugInUnloadFunctionKey: MemorySegment
    get() = kCFPlugInUnloadFunctionKey_VH.get(kCFPlugInUnloadFunctionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPlugInUnloadFunctionKey_VH.set(kCFPlugInUnloadFunctionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPlugInFactoriesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPlugInFactoriesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPlugInFactoriesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFPlugInFactoriesKey").orElseThrow().reinterpret(kCFPlugInFactoriesKey_LAYOUT.byteSize()) }
private val kCFPlugInFactoriesKey_VH: VarHandle by lazy { kCFPlugInFactoriesKey_LAYOUT.varHandle() }

var kCFPlugInFactoriesKey: MemorySegment
    get() = kCFPlugInFactoriesKey_VH.get(kCFPlugInFactoriesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPlugInFactoriesKey_VH.set(kCFPlugInFactoriesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFPlugInTypesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFPlugInTypesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFPlugInTypesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFPlugInTypesKey").orElseThrow().reinterpret(kCFPlugInTypesKey_LAYOUT.byteSize()) }
private val kCFPlugInTypesKey_VH: VarHandle by lazy { kCFPlugInTypesKey_LAYOUT.varHandle() }

var kCFPlugInTypesKey: MemorySegment
    get() = kCFPlugInTypesKey_VH.get(kCFPlugInTypesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFPlugInTypesKey_VH.set(kCFPlugInTypesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFPlugInGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFPlugInGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFPlugInGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInGetTypeID").orElseThrow() }
private val CFPlugInGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInGetTypeID_ADDR, CFPlugInGetTypeID_DESC) }

fun CFPlugInGetTypeID(): Long {
    try {
        return CFPlugInGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInCreate typedef CFPlugInRef = (Declared(__CFBundle))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*)
 */
private val CFPlugInCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInCreate").orElseThrow() }
private val CFPlugInCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInCreate_ADDR, CFPlugInCreate_DESC) }

fun CFPlugInCreate(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFPlugInCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInGetBundle typedef CFBundleRef = (Declared(__CFBundle))*(typedef CFPlugInRef = (Declared(__CFBundle))*)
 */
private val CFPlugInGetBundle_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInGetBundle_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInGetBundle").orElseThrow() }
private val CFPlugInGetBundle_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInGetBundle_ADDR, CFPlugInGetBundle_DESC) }

fun CFPlugInGetBundle(arg0: MemorySegment): MemorySegment {
    try {
        return CFPlugInGetBundle_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInSetLoadOnDemand Void(typedef CFPlugInRef = (Declared(__CFBundle))*,typedef Boolean = UNSIGNED = Char)
 */
private val CFPlugInSetLoadOnDemand_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
private val CFPlugInSetLoadOnDemand_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInSetLoadOnDemand").orElseThrow() }
private val CFPlugInSetLoadOnDemand_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInSetLoadOnDemand_ADDR, CFPlugInSetLoadOnDemand_DESC) }

fun CFPlugInSetLoadOnDemand(arg0: MemorySegment, arg1: Byte): Unit {
    try {
        CFPlugInSetLoadOnDemand_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInIsLoadOnDemand typedef Boolean = UNSIGNED = Char(typedef CFPlugInRef = (Declared(__CFBundle))*)
 */
private val CFPlugInIsLoadOnDemand_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFPlugInIsLoadOnDemand_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInIsLoadOnDemand").orElseThrow() }
private val CFPlugInIsLoadOnDemand_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInIsLoadOnDemand_ADDR, CFPlugInIsLoadOnDemand_DESC) }

fun CFPlugInIsLoadOnDemand(arg0: MemorySegment): Byte {
    try {
        return CFPlugInIsLoadOnDemand_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInFindFactoriesForPlugInType typedef CFArrayRef = (Declared(__CFArray))*(typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInFindFactoriesForPlugInType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInFindFactoriesForPlugInType_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInFindFactoriesForPlugInType").orElseThrow() }
private val CFPlugInFindFactoriesForPlugInType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInFindFactoriesForPlugInType_ADDR, CFPlugInFindFactoriesForPlugInType_DESC) }

fun CFPlugInFindFactoriesForPlugInType(arg0: MemorySegment): MemorySegment {
    try {
        return CFPlugInFindFactoriesForPlugInType_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInFindFactoriesForPlugInTypeInPlugIn typedef CFArrayRef = (Declared(__CFArray))*(typedef CFUUIDRef = (Declared(__CFUUID))*,typedef CFPlugInRef = (Declared(__CFBundle))*)
 */
private val CFPlugInFindFactoriesForPlugInTypeInPlugIn_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInFindFactoriesForPlugInTypeInPlugIn_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInFindFactoriesForPlugInTypeInPlugIn").orElseThrow() }
private val CFPlugInFindFactoriesForPlugInTypeInPlugIn_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInFindFactoriesForPlugInTypeInPlugIn_ADDR, CFPlugInFindFactoriesForPlugInTypeInPlugIn_DESC) }

fun CFPlugInFindFactoriesForPlugInTypeInPlugIn(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFPlugInFindFactoriesForPlugInTypeInPlugIn_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInInstanceCreate (Void)*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFUUIDRef = (Declared(__CFUUID))*,typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInInstanceCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInInstanceCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInInstanceCreate").orElseThrow() }
private val CFPlugInInstanceCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInInstanceCreate_ADDR, CFPlugInInstanceCreate_DESC) }

fun CFPlugInInstanceCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFPlugInInstanceCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInRegisterFactoryFunction typedef Boolean = UNSIGNED = Char(typedef CFUUIDRef = (Declared(__CFUUID))*,typedef CFPlugInFactoryFunction = ((Void)*((Declared(__CFAllocator))*,(Declared(__CFUUID))*))*)
 */
private val CFPlugInRegisterFactoryFunction_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInRegisterFactoryFunction_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInRegisterFactoryFunction").orElseThrow() }
private val CFPlugInRegisterFactoryFunction_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInRegisterFactoryFunction_ADDR, CFPlugInRegisterFactoryFunction_DESC) }

fun CFPlugInRegisterFactoryFunction(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFPlugInRegisterFactoryFunction_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInRegisterFactoryFunctionByName typedef Boolean = UNSIGNED = Char(typedef CFUUIDRef = (Declared(__CFUUID))*,typedef CFPlugInRef = (Declared(__CFBundle))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFPlugInRegisterFactoryFunctionByName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInRegisterFactoryFunctionByName_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInRegisterFactoryFunctionByName").orElseThrow() }
private val CFPlugInRegisterFactoryFunctionByName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInRegisterFactoryFunctionByName_ADDR, CFPlugInRegisterFactoryFunctionByName_DESC) }

fun CFPlugInRegisterFactoryFunctionByName(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFPlugInRegisterFactoryFunctionByName_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInUnregisterFactory typedef Boolean = UNSIGNED = Char(typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInUnregisterFactory_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFPlugInUnregisterFactory_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInUnregisterFactory").orElseThrow() }
private val CFPlugInUnregisterFactory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInUnregisterFactory_ADDR, CFPlugInUnregisterFactory_DESC) }

fun CFPlugInUnregisterFactory(arg0: MemorySegment): Byte {
    try {
        return CFPlugInUnregisterFactory_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInRegisterPlugInType typedef Boolean = UNSIGNED = Char(typedef CFUUIDRef = (Declared(__CFUUID))*,typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInRegisterPlugInType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInRegisterPlugInType_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInRegisterPlugInType").orElseThrow() }
private val CFPlugInRegisterPlugInType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInRegisterPlugInType_ADDR, CFPlugInRegisterPlugInType_DESC) }

fun CFPlugInRegisterPlugInType(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFPlugInRegisterPlugInType_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInUnregisterPlugInType typedef Boolean = UNSIGNED = Char(typedef CFUUIDRef = (Declared(__CFUUID))*,typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInUnregisterPlugInType_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInUnregisterPlugInType_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInUnregisterPlugInType").orElseThrow() }
private val CFPlugInUnregisterPlugInType_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInUnregisterPlugInType_ADDR, CFPlugInUnregisterPlugInType_DESC) }

fun CFPlugInUnregisterPlugInType(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFPlugInUnregisterPlugInType_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInAddInstanceForFactory Void(typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInAddInstanceForFactory_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFPlugInAddInstanceForFactory_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInAddInstanceForFactory").orElseThrow() }
private val CFPlugInAddInstanceForFactory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInAddInstanceForFactory_ADDR, CFPlugInAddInstanceForFactory_DESC) }

fun CFPlugInAddInstanceForFactory(arg0: MemorySegment): Unit {
    try {
        CFPlugInAddInstanceForFactory_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInRemoveInstanceForFactory Void(typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFPlugInRemoveInstanceForFactory_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFPlugInRemoveInstanceForFactory_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInRemoveInstanceForFactory").orElseThrow() }
private val CFPlugInRemoveInstanceForFactory_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInRemoveInstanceForFactory_ADDR, CFPlugInRemoveInstanceForFactory_DESC) }

fun CFPlugInRemoveInstanceForFactory(arg0: MemorySegment): Unit {
    try {
        CFPlugInRemoveInstanceForFactory_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInInstanceGetInterfaceFunctionTable typedef Boolean = UNSIGNED = Char(typedef CFPlugInInstanceRef = (Declared(__CFPlugInInstance))*,typedef CFStringRef = (Declared(__CFString))*,((Void)*)*)
 */
private val CFPlugInInstanceGetInterfaceFunctionTable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInInstanceGetInterfaceFunctionTable_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInInstanceGetInterfaceFunctionTable").orElseThrow() }
private val CFPlugInInstanceGetInterfaceFunctionTable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInInstanceGetInterfaceFunctionTable_ADDR, CFPlugInInstanceGetInterfaceFunctionTable_DESC) }

fun CFPlugInInstanceGetInterfaceFunctionTable(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Byte {
    try {
        return CFPlugInInstanceGetInterfaceFunctionTable_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInInstanceGetFactoryName typedef CFStringRef = (Declared(__CFString))*(typedef CFPlugInInstanceRef = (Declared(__CFPlugInInstance))*)
 */
private val CFPlugInInstanceGetFactoryName_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInInstanceGetFactoryName_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInInstanceGetFactoryName").orElseThrow() }
private val CFPlugInInstanceGetFactoryName_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInInstanceGetFactoryName_ADDR, CFPlugInInstanceGetFactoryName_DESC) }

fun CFPlugInInstanceGetFactoryName(arg0: MemorySegment): MemorySegment {
    try {
        return CFPlugInInstanceGetFactoryName_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInInstanceGetInstanceData (Void)*(typedef CFPlugInInstanceRef = (Declared(__CFPlugInInstance))*)
 */
private val CFPlugInInstanceGetInstanceData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInInstanceGetInstanceData_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInInstanceGetInstanceData").orElseThrow() }
private val CFPlugInInstanceGetInstanceData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInInstanceGetInstanceData_ADDR, CFPlugInInstanceGetInstanceData_DESC) }

fun CFPlugInInstanceGetInstanceData(arg0: MemorySegment): MemorySegment {
    try {
        return CFPlugInInstanceGetInstanceData_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInInstanceGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFPlugInInstanceGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFPlugInInstanceGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInInstanceGetTypeID").orElseThrow() }
private val CFPlugInInstanceGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInInstanceGetTypeID_ADDR, CFPlugInInstanceGetTypeID_DESC) }

fun CFPlugInInstanceGetTypeID(): Long {
    try {
        return CFPlugInInstanceGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFPlugInInstanceCreateWithInstanceDataSize typedef CFPlugInInstanceRef = (Declared(__CFPlugInInstance))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFIndex = Long,typedef CFPlugInInstanceDeallocateInstanceDataFunction = (Void((Void)*))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFPlugInInstanceGetInterfaceFunction = (UNSIGNED = Char((Declared(__CFPlugInInstance))*,(Declared(__CFString))*,((Void)*)*))*)
 */
private val CFPlugInInstanceCreateWithInstanceDataSize_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFPlugInInstanceCreateWithInstanceDataSize_ADDR: MemorySegment by lazy { LOOKUP.find("CFPlugInInstanceCreateWithInstanceDataSize").orElseThrow() }
private val CFPlugInInstanceCreateWithInstanceDataSize_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFPlugInInstanceCreateWithInstanceDataSize_ADDR, CFPlugInInstanceCreateWithInstanceDataSize_DESC) }

fun CFPlugInInstanceCreateWithInstanceDataSize(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFPlugInInstanceCreateWithInstanceDataSize_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFMachPortGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFMachPortGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortGetTypeID").orElseThrow() }
private val CFMachPortGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortGetTypeID_ADDR, CFMachPortGetTypeID_DESC) }

fun CFMachPortGetTypeID(): Long {
    try {
        return CFMachPortGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortCreate typedef CFMachPortRef = (Declared(__CFMachPort))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFMachPortCallBack = (Void((Declared(__CFMachPort))*,(Void)*,Long,(Void)*))*,(typedef CFMachPortContext = Declared(CFMachPortContext))*,(typedef Boolean = UNSIGNED = Char)*)
 */
private val CFMachPortCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMachPortCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortCreate").orElseThrow() }
private val CFMachPortCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortCreate_ADDR, CFMachPortCreate_DESC) }

fun CFMachPortCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFMachPortCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortCreateWithPort typedef CFMachPortRef = (Declared(__CFMachPort))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef mach_port_t = UNSIGNED = Int,typedef CFMachPortCallBack = (Void((Declared(__CFMachPort))*,(Void)*,Long,(Void)*))*,(typedef CFMachPortContext = Declared(CFMachPortContext))*,(typedef Boolean = UNSIGNED = Char)*)
 */
private val CFMachPortCreateWithPort_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMachPortCreateWithPort_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortCreateWithPort").orElseThrow() }
private val CFMachPortCreateWithPort_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortCreateWithPort_ADDR, CFMachPortCreateWithPort_DESC) }

fun CFMachPortCreateWithPort(arg0: MemorySegment, arg1: Int, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFMachPortCreateWithPort_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortGetPort typedef mach_port_t = UNSIGNED = Int(typedef CFMachPortRef = (Declared(__CFMachPort))*)
 */
private val CFMachPortGetPort_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFMachPortGetPort_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortGetPort").orElseThrow() }
private val CFMachPortGetPort_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortGetPort_ADDR, CFMachPortGetPort_DESC) }

fun CFMachPortGetPort(arg0: MemorySegment): Int {
    try {
        return CFMachPortGetPort_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortGetContext Void(typedef CFMachPortRef = (Declared(__CFMachPort))*,(typedef CFMachPortContext = Declared(CFMachPortContext))*)
 */
private val CFMachPortGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMachPortGetContext_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortGetContext").orElseThrow() }
private val CFMachPortGetContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortGetContext_ADDR, CFMachPortGetContext_DESC) }

fun CFMachPortGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFMachPortGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortInvalidate Void(typedef CFMachPortRef = (Declared(__CFMachPort))*)
 */
private val CFMachPortInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFMachPortInvalidate_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortInvalidate").orElseThrow() }
private val CFMachPortInvalidate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortInvalidate_ADDR, CFMachPortInvalidate_DESC) }

fun CFMachPortInvalidate(arg0: MemorySegment): Unit {
    try {
        CFMachPortInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortIsValid typedef Boolean = UNSIGNED = Char(typedef CFMachPortRef = (Declared(__CFMachPort))*)
 */
private val CFMachPortIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFMachPortIsValid_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortIsValid").orElseThrow() }
private val CFMachPortIsValid_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortIsValid_ADDR, CFMachPortIsValid_DESC) }

fun CFMachPortIsValid(arg0: MemorySegment): Byte {
    try {
        return CFMachPortIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortGetInvalidationCallBack typedef CFMachPortInvalidationCallBack = (Void((Declared(__CFMachPort))*,(Void)*))*(typedef CFMachPortRef = (Declared(__CFMachPort))*)
 */
private val CFMachPortGetInvalidationCallBack_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMachPortGetInvalidationCallBack_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortGetInvalidationCallBack").orElseThrow() }
private val CFMachPortGetInvalidationCallBack_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortGetInvalidationCallBack_ADDR, CFMachPortGetInvalidationCallBack_DESC) }

fun CFMachPortGetInvalidationCallBack(arg0: MemorySegment): MemorySegment {
    try {
        return CFMachPortGetInvalidationCallBack_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortSetInvalidationCallBack Void(typedef CFMachPortRef = (Declared(__CFMachPort))*,typedef CFMachPortInvalidationCallBack = (Void((Declared(__CFMachPort))*,(Void)*))*)
 */
private val CFMachPortSetInvalidationCallBack_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFMachPortSetInvalidationCallBack_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortSetInvalidationCallBack").orElseThrow() }
private val CFMachPortSetInvalidationCallBack_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortSetInvalidationCallBack_ADDR, CFMachPortSetInvalidationCallBack_DESC) }

fun CFMachPortSetInvalidationCallBack(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFMachPortSetInvalidationCallBack_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFMachPortCreateRunLoopSource typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFMachPortRef = (Declared(__CFMachPort))*,typedef CFIndex = Long)
 */
private val CFMachPortCreateRunLoopSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFMachPortCreateRunLoopSource_ADDR: MemorySegment by lazy { LOOKUP.find("CFMachPortCreateRunLoopSource").orElseThrow() }
private val CFMachPortCreateRunLoopSource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFMachPortCreateRunLoopSource_ADDR, CFMachPortCreateRunLoopSource_DESC) }

fun CFMachPortCreateRunLoopSource(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFMachPortCreateRunLoopSource_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFAttributedStringGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFAttributedStringGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetTypeID").orElseThrow() }
private val CFAttributedStringGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetTypeID_ADDR, CFAttributedStringGetTypeID_DESC) }

fun CFAttributedStringGetTypeID(): Long {
    try {
        return CFAttributedStringGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringCreate typedef CFAttributedStringRef = (Declared(__CFAttributedString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CFAttributedStringCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringCreate").orElseThrow() }
private val CFAttributedStringCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringCreate_ADDR, CFAttributedStringCreate_DESC) }

fun CFAttributedStringCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringCreate_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringCreateWithSubstring typedef CFAttributedStringRef = (Declared(__CFAttributedString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange))
 */
private val CFAttributedStringCreateWithSubstring_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout)
private val CFAttributedStringCreateWithSubstring_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringCreateWithSubstring").orElseThrow() }
private val CFAttributedStringCreateWithSubstring_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringCreateWithSubstring_ADDR, CFAttributedStringCreateWithSubstring_DESC) }

fun CFAttributedStringCreateWithSubstring(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringCreateWithSubstring_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringCreateCopy typedef CFAttributedStringRef = (Declared(__CFAttributedString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringCreateCopy").orElseThrow() }
private val CFAttributedStringCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringCreateCopy_ADDR, CFAttributedStringCreateCopy_DESC) }

fun CFAttributedStringCreateCopy(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringCreateCopy_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetString typedef CFStringRef = (Declared(__CFString))*(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringGetString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringGetString_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetString").orElseThrow() }
private val CFAttributedStringGetString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetString_ADDR, CFAttributedStringGetString_DESC) }

fun CFAttributedStringGetString(arg0: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringGetString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetLength typedef CFIndex = Long(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringGetLength_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFAttributedStringGetLength_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetLength").orElseThrow() }
private val CFAttributedStringGetLength_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetLength_ADDR, CFAttributedStringGetLength_DESC) }

fun CFAttributedStringGetLength(arg0: MemorySegment): Long {
    try {
        return CFAttributedStringGetLength_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetAttributes typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFIndex = Long,(typedef CFRange = Declared(CFRange))*)
 */
private val CFAttributedStringGetAttributes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFAttributedStringGetAttributes_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetAttributes").orElseThrow() }
private val CFAttributedStringGetAttributes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetAttributes_ADDR, CFAttributedStringGetAttributes_DESC) }

fun CFAttributedStringGetAttributes(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringGetAttributes_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetAttribute typedef CFTypeRef = (Void)*(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFIndex = Long,typedef CFStringRef = (Declared(__CFString))*,(typedef CFRange = Declared(CFRange))*)
 */
private val CFAttributedStringGetAttribute_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringGetAttribute_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetAttribute").orElseThrow() }
private val CFAttributedStringGetAttribute_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetAttribute_ADDR, CFAttributedStringGetAttribute_DESC) }

fun CFAttributedStringGetAttribute(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringGetAttribute_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetAttributesAndLongestEffectiveRange typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFIndex = Long,typedef CFRange = Declared(CFRange),(typedef CFRange = Declared(CFRange))*)
 */
private val CFAttributedStringGetAttributesAndLongestEffectiveRange_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, CFRange.layout, ValueLayout.ADDRESS)
private val CFAttributedStringGetAttributesAndLongestEffectiveRange_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetAttributesAndLongestEffectiveRange").orElseThrow() }
private val CFAttributedStringGetAttributesAndLongestEffectiveRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetAttributesAndLongestEffectiveRange_ADDR, CFAttributedStringGetAttributesAndLongestEffectiveRange_DESC) }

fun CFAttributedStringGetAttributesAndLongestEffectiveRange(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringGetAttributesAndLongestEffectiveRange_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetAttributeAndLongestEffectiveRange typedef CFTypeRef = (Void)*(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFIndex = Long,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),(typedef CFRange = Declared(CFRange))*)
 */
private val CFAttributedStringGetAttributeAndLongestEffectiveRange_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS)
private val CFAttributedStringGetAttributeAndLongestEffectiveRange_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetAttributeAndLongestEffectiveRange").orElseThrow() }
private val CFAttributedStringGetAttributeAndLongestEffectiveRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetAttributeAndLongestEffectiveRange_ADDR, CFAttributedStringGetAttributeAndLongestEffectiveRange_DESC) }

fun CFAttributedStringGetAttributeAndLongestEffectiveRange(arg0: MemorySegment, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringGetAttributeAndLongestEffectiveRange_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringCreateMutableCopy typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFIndex = Long,typedef CFAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringCreateMutableCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFAttributedStringCreateMutableCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringCreateMutableCopy").orElseThrow() }
private val CFAttributedStringCreateMutableCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringCreateMutableCopy_ADDR, CFAttributedStringCreateMutableCopy_DESC) }

fun CFAttributedStringCreateMutableCopy(arg0: MemorySegment, arg1: Long, arg2: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringCreateMutableCopy_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringCreateMutable typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFIndex = Long)
 */
private val CFAttributedStringCreateMutable_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFAttributedStringCreateMutable_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringCreateMutable").orElseThrow() }
private val CFAttributedStringCreateMutable_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringCreateMutable_ADDR, CFAttributedStringCreateMutable_DESC) }

fun CFAttributedStringCreateMutable(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return CFAttributedStringCreateMutable_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringReplaceString Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFAttributedStringReplaceString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS)
private val CFAttributedStringReplaceString_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringReplaceString").orElseThrow() }
private val CFAttributedStringReplaceString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringReplaceString_ADDR, CFAttributedStringReplaceString_DESC) }

fun CFAttributedStringReplaceString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFAttributedStringReplaceString_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetMutableString typedef CFMutableStringRef = (Declared(__CFString))*(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringGetMutableString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringGetMutableString_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetMutableString").orElseThrow() }
private val CFAttributedStringGetMutableString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetMutableString_ADDR, CFAttributedStringGetMutableString_DESC) }

fun CFAttributedStringGetMutableString(arg0: MemorySegment): MemorySegment {
    try {
        return CFAttributedStringGetMutableString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringSetAttributes Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef CFDictionaryRef = (Declared(__CFDictionary))*,typedef Boolean = UNSIGNED = Char)
 */
private val CFAttributedStringSetAttributes_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
private val CFAttributedStringSetAttributes_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringSetAttributes").orElseThrow() }
private val CFAttributedStringSetAttributes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringSetAttributes_ADDR, CFAttributedStringSetAttributes_DESC) }

fun CFAttributedStringSetAttributes(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Byte): Unit {
    try {
        CFAttributedStringSetAttributes_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringSetAttribute Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef CFStringRef = (Declared(__CFString))*,typedef CFTypeRef = (Void)*)
 */
private val CFAttributedStringSetAttribute_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringSetAttribute_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringSetAttribute").orElseThrow() }
private val CFAttributedStringSetAttribute_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringSetAttribute_ADDR, CFAttributedStringSetAttribute_DESC) }

fun CFAttributedStringSetAttribute(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: MemorySegment): Unit {
    try {
        CFAttributedStringSetAttribute_HANDLE.invokeExact(arg0, arg1, arg2, arg3)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringRemoveAttribute Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFAttributedStringRemoveAttribute_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS)
private val CFAttributedStringRemoveAttribute_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringRemoveAttribute").orElseThrow() }
private val CFAttributedStringRemoveAttribute_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringRemoveAttribute_ADDR, CFAttributedStringRemoveAttribute_DESC) }

fun CFAttributedStringRemoveAttribute(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFAttributedStringRemoveAttribute_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringReplaceAttributedString Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef CFAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringReplaceAttributedString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CFRange.layout, ValueLayout.ADDRESS)
private val CFAttributedStringReplaceAttributedString_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringReplaceAttributedString").orElseThrow() }
private val CFAttributedStringReplaceAttributedString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringReplaceAttributedString_ADDR, CFAttributedStringReplaceAttributedString_DESC) }

fun CFAttributedStringReplaceAttributedString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFAttributedStringReplaceAttributedString_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringBeginEditing Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringBeginEditing_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFAttributedStringBeginEditing_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringBeginEditing").orElseThrow() }
private val CFAttributedStringBeginEditing_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringBeginEditing_ADDR, CFAttributedStringBeginEditing_DESC) }

fun CFAttributedStringBeginEditing(arg0: MemorySegment): Unit {
    try {
        CFAttributedStringBeginEditing_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringEndEditing Void(typedef CFMutableAttributedStringRef = (Declared(__CFAttributedString))*)
 */
private val CFAttributedStringEndEditing_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFAttributedStringEndEditing_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringEndEditing").orElseThrow() }
private val CFAttributedStringEndEditing_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringEndEditing_ADDR, CFAttributedStringEndEditing_DESC) }

fun CFAttributedStringEndEditing(arg0: MemorySegment): Unit {
    try {
        CFAttributedStringEndEditing_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetBidiLevelsAndResolvedDirections Bool(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef int8_t = SIGNED = Char,(typedef uint8_t = UNSIGNED = Char)*,(typedef uint8_t = UNSIGNED = Char)*)
 */
private val CFAttributedStringGetBidiLevelsAndResolvedDirections_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringGetBidiLevelsAndResolvedDirections_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetBidiLevelsAndResolvedDirections").orElseThrow() }
private val CFAttributedStringGetBidiLevelsAndResolvedDirections_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetBidiLevelsAndResolvedDirections_ADDR, CFAttributedStringGetBidiLevelsAndResolvedDirections_DESC) }

fun CFAttributedStringGetBidiLevelsAndResolvedDirections(arg0: MemorySegment, arg1: MemorySegment, arg2: Byte, arg3: MemorySegment, arg4: MemorySegment): Boolean {
    try {
        return CFAttributedStringGetBidiLevelsAndResolvedDirections_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFAttributedStringGetStatisticalWritingDirections Bool(typedef CFAttributedStringRef = (Declared(__CFAttributedString))*,typedef CFRange = Declared(CFRange),typedef int8_t = SIGNED = Char,(typedef uint8_t = UNSIGNED = Char)*,(typedef uint8_t = UNSIGNED = Char)*)
 */
private val CFAttributedStringGetStatisticalWritingDirections_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFAttributedStringGetStatisticalWritingDirections_ADDR: MemorySegment by lazy { LOOKUP.find("CFAttributedStringGetStatisticalWritingDirections").orElseThrow() }
private val CFAttributedStringGetStatisticalWritingDirections_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFAttributedStringGetStatisticalWritingDirections_ADDR, CFAttributedStringGetStatisticalWritingDirections_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun CFAttributedStringGetStatisticalWritingDirections(arg0: MemorySegment, arg1: MemorySegment, arg2: Byte, arg3: MemorySegment, arg4: MemorySegment): Boolean {
    try {
        return CFAttributedStringGetStatisticalWritingDirections_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as Boolean
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFURLEnumeratorGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFURLEnumeratorGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorGetTypeID").orElseThrow() }
private val CFURLEnumeratorGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorGetTypeID_ADDR, CFURLEnumeratorGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLEnumeratorGetTypeID(): Long {
    try {
        return CFURLEnumeratorGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorCreateForDirectoryURL typedef CFURLEnumeratorRef = (Declared(__CFURLEnumerator))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLEnumeratorOptions = Declared(CFURLEnumeratorOptions),typedef CFArrayRef = (Declared(__CFArray))*)
 */
private val CFURLEnumeratorCreateForDirectoryURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFURLEnumeratorCreateForDirectoryURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorCreateForDirectoryURL").orElseThrow() }
private val CFURLEnumeratorCreateForDirectoryURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorCreateForDirectoryURL_ADDR, CFURLEnumeratorCreateForDirectoryURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLEnumeratorCreateForDirectoryURL(arg0: MemorySegment, arg1: MemorySegment, arg2: CFURLEnumeratorOptions, arg3: MemorySegment): MemorySegment {
    try {
        return CFURLEnumeratorCreateForDirectoryURL_HANDLE.invokeExact(arg0, arg1, arg2.rawValue, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorCreateForMountedVolumes typedef CFURLEnumeratorRef = (Declared(__CFURLEnumerator))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLEnumeratorOptions = Declared(CFURLEnumeratorOptions),typedef CFArrayRef = (Declared(__CFArray))*)
 */
private val CFURLEnumeratorCreateForMountedVolumes_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFURLEnumeratorCreateForMountedVolumes_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorCreateForMountedVolumes").orElseThrow() }
private val CFURLEnumeratorCreateForMountedVolumes_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorCreateForMountedVolumes_ADDR, CFURLEnumeratorCreateForMountedVolumes_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLEnumeratorCreateForMountedVolumes(arg0: MemorySegment, arg1: CFURLEnumeratorOptions, arg2: MemorySegment): MemorySegment {
    try {
        return CFURLEnumeratorCreateForMountedVolumes_HANDLE.invokeExact(arg0, arg1.rawValue, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorGetNextURL typedef CFURLEnumeratorResult = Declared(CFURLEnumeratorResult)(typedef CFURLEnumeratorRef = (Declared(__CFURLEnumerator))*,(typedef CFURLRef = (Declared(__CFURL))*)*,(typedef CFErrorRef = (Declared(__CFError))*)*)
 */
private val CFURLEnumeratorGetNextURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFURLEnumeratorGetNextURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorGetNextURL").orElseThrow() }
private val CFURLEnumeratorGetNextURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorGetNextURL_ADDR, CFURLEnumeratorGetNextURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLEnumeratorGetNextURL(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): CFURLEnumeratorResult {
    try {
        return CFURLEnumeratorResult.fromValue(CFURLEnumeratorGetNextURL_HANDLE.invokeExact(arg0, arg1, arg2) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorSkipDescendents Void(typedef CFURLEnumeratorRef = (Declared(__CFURLEnumerator))*)
 */
private val CFURLEnumeratorSkipDescendents_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFURLEnumeratorSkipDescendents_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorSkipDescendents").orElseThrow() }
private val CFURLEnumeratorSkipDescendents_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorSkipDescendents_ADDR, CFURLEnumeratorSkipDescendents_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLEnumeratorSkipDescendents(arg0: MemorySegment): Unit {
    try {
        CFURLEnumeratorSkipDescendents_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorGetDescendentLevel typedef CFIndex = Long(typedef CFURLEnumeratorRef = (Declared(__CFURLEnumerator))*)
 */
private val CFURLEnumeratorGetDescendentLevel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFURLEnumeratorGetDescendentLevel_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorGetDescendentLevel").orElseThrow() }
private val CFURLEnumeratorGetDescendentLevel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorGetDescendentLevel_ADDR, CFURLEnumeratorGetDescendentLevel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFURLEnumeratorGetDescendentLevel(arg0: MemorySegment): Long {
    try {
        return CFURLEnumeratorGetDescendentLevel_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFURLEnumeratorGetSourceDidChange typedef Boolean = UNSIGNED = Char(typedef CFURLEnumeratorRef = (Declared(__CFURLEnumerator))*)
 */
private val CFURLEnumeratorGetSourceDidChange_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFURLEnumeratorGetSourceDidChange_ADDR: MemorySegment by lazy { LOOKUP.find("CFURLEnumeratorGetSourceDidChange").orElseThrow() }
private val CFURLEnumeratorGetSourceDidChange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFURLEnumeratorGetSourceDidChange_ADDR, CFURLEnumeratorGetSourceDidChange_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 5, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use File System Events API instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use File System Events API instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use File System Events API instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use File System Events API instead")
fun CFURLEnumeratorGetSourceDidChange(arg0: MemorySegment): Byte {
    try {
        return CFURLEnumeratorGetSourceDidChange_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFFileSecurityGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFFileSecurityGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityGetTypeID").orElseThrow() }
private val CFFileSecurityGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityGetTypeID_ADDR, CFFileSecurityGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityGetTypeID(): Long {
    try {
        return CFFileSecurityGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityCreate typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*)
 */
private val CFFileSecurityCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityCreate").orElseThrow() }
private val CFFileSecurityCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityCreate_ADDR, CFFileSecurityCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityCreate(arg0: MemorySegment): MemorySegment {
    try {
        return CFFileSecurityCreate_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityCreateCopy typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*)
 */
private val CFFileSecurityCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityCreateCopy").orElseThrow() }
private val CFFileSecurityCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityCreateCopy_ADDR, CFFileSecurityCreateCopy_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityCreateCopy(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFFileSecurityCreateCopy_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityCopyOwnerUUID typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,(typedef CFUUIDRef = (Declared(__CFUUID))*)*)
 */
private val CFFileSecurityCopyOwnerUUID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityCopyOwnerUUID_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityCopyOwnerUUID").orElseThrow() }
private val CFFileSecurityCopyOwnerUUID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityCopyOwnerUUID_ADDR, CFFileSecurityCopyOwnerUUID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityCopyOwnerUUID(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecurityCopyOwnerUUID_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecuritySetOwnerUUID typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFFileSecuritySetOwnerUUID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecuritySetOwnerUUID_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecuritySetOwnerUUID").orElseThrow() }
private val CFFileSecuritySetOwnerUUID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecuritySetOwnerUUID_ADDR, CFFileSecuritySetOwnerUUID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecuritySetOwnerUUID(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecuritySetOwnerUUID_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityCopyGroupUUID typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,(typedef CFUUIDRef = (Declared(__CFUUID))*)*)
 */
private val CFFileSecurityCopyGroupUUID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityCopyGroupUUID_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityCopyGroupUUID").orElseThrow() }
private val CFFileSecurityCopyGroupUUID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityCopyGroupUUID_ADDR, CFFileSecurityCopyGroupUUID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityCopyGroupUUID(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecurityCopyGroupUUID_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecuritySetGroupUUID typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef CFUUIDRef = (Declared(__CFUUID))*)
 */
private val CFFileSecuritySetGroupUUID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecuritySetGroupUUID_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecuritySetGroupUUID").orElseThrow() }
private val CFFileSecuritySetGroupUUID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecuritySetGroupUUID_ADDR, CFFileSecuritySetGroupUUID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecuritySetGroupUUID(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecuritySetGroupUUID_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityCopyAccessControlList typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,(typedef acl_t = (Declared(_acl))*)*)
 */
private val CFFileSecurityCopyAccessControlList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityCopyAccessControlList_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityCopyAccessControlList").orElseThrow() }
private val CFFileSecurityCopyAccessControlList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityCopyAccessControlList_ADDR, CFFileSecurityCopyAccessControlList_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityCopyAccessControlList(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecurityCopyAccessControlList_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecuritySetAccessControlList typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef acl_t = (Declared(_acl))*)
 */
private val CFFileSecuritySetAccessControlList_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecuritySetAccessControlList_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecuritySetAccessControlList").orElseThrow() }
private val CFFileSecuritySetAccessControlList_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecuritySetAccessControlList_ADDR, CFFileSecuritySetAccessControlList_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecuritySetAccessControlList(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecuritySetAccessControlList_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityGetOwner typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,(typedef uid_t = UNSIGNED = Int)*)
 */
private val CFFileSecurityGetOwner_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityGetOwner_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityGetOwner").orElseThrow() }
private val CFFileSecurityGetOwner_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityGetOwner_ADDR, CFFileSecurityGetOwner_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityGetOwner(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecurityGetOwner_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecuritySetOwner typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef uid_t = UNSIGNED = Int)
 */
private val CFFileSecuritySetOwner_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFFileSecuritySetOwner_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecuritySetOwner").orElseThrow() }
private val CFFileSecuritySetOwner_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecuritySetOwner_ADDR, CFFileSecuritySetOwner_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecuritySetOwner(arg0: MemorySegment, arg1: Int): Byte {
    try {
        return CFFileSecuritySetOwner_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityGetGroup typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,(typedef gid_t = UNSIGNED = Int)*)
 */
private val CFFileSecurityGetGroup_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityGetGroup_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityGetGroup").orElseThrow() }
private val CFFileSecurityGetGroup_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityGetGroup_ADDR, CFFileSecurityGetGroup_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityGetGroup(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecurityGetGroup_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecuritySetGroup typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef gid_t = UNSIGNED = Int)
 */
private val CFFileSecuritySetGroup_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val CFFileSecuritySetGroup_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecuritySetGroup").orElseThrow() }
private val CFFileSecuritySetGroup_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecuritySetGroup_ADDR, CFFileSecuritySetGroup_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecuritySetGroup(arg0: MemorySegment, arg1: Int): Byte {
    try {
        return CFFileSecuritySetGroup_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityGetMode typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,(typedef mode_t = UNSIGNED = Short)*)
 */
private val CFFileSecurityGetMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileSecurityGetMode_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityGetMode").orElseThrow() }
private val CFFileSecurityGetMode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityGetMode_ADDR, CFFileSecurityGetMode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityGetMode(arg0: MemorySegment, arg1: MemorySegment): Byte {
    try {
        return CFFileSecurityGetMode_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecuritySetMode typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef mode_t = UNSIGNED = Short)
 */
private val CFFileSecuritySetMode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
private val CFFileSecuritySetMode_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecuritySetMode").orElseThrow() }
private val CFFileSecuritySetMode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecuritySetMode_ADDR, CFFileSecuritySetMode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecuritySetMode(arg0: MemorySegment, arg1: Short): Byte {
    try {
        return CFFileSecuritySetMode_HANDLE.invokeExact(arg0, arg1) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileSecurityClearProperties typedef Boolean = UNSIGNED = Char(typedef CFFileSecurityRef = (Declared(__CFFileSecurity))*,typedef CFFileSecurityClearOptions = Declared(CFFileSecurityClearOptions))
 */
private val CFFileSecurityClearProperties_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFFileSecurityClearProperties_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileSecurityClearProperties").orElseThrow() }
private val CFFileSecurityClearProperties_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileSecurityClearProperties_ADDR, CFFileSecurityClearProperties_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileSecurityClearProperties(arg0: MemorySegment, arg1: CFFileSecurityClearOptions): Byte {
    try {
        return CFFileSecurityClearProperties_HANDLE.invokeExact(arg0, arg1.rawValue) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerCopyBestStringLanguage typedef CFStringRef = (Declared(__CFString))*(typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange))
 */
private val CFStringTokenizerCopyBestStringLanguage_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout)
private val CFStringTokenizerCopyBestStringLanguage_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerCopyBestStringLanguage").orElseThrow() }
private val CFStringTokenizerCopyBestStringLanguage_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerCopyBestStringLanguage_ADDR, CFStringTokenizerCopyBestStringLanguage_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerCopyBestStringLanguage(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFStringTokenizerCopyBestStringLanguage_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFStringTokenizerGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFStringTokenizerGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerGetTypeID").orElseThrow() }
private val CFStringTokenizerGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerGetTypeID_ADDR, CFStringTokenizerGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerGetTypeID(): Long {
    try {
        return CFStringTokenizerGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerCreate typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange),typedef CFOptionFlags = UNSIGNED = Long,typedef CFLocaleRef = (Declared(__CFLocale))*)
 */
private val CFStringTokenizerCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringTokenizerCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerCreate").orElseThrow() }
private val CFStringTokenizerCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerCreate_ADDR, CFStringTokenizerCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long, arg4: MemorySegment): MemorySegment {
    try {
        return CFStringTokenizerCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerSetString Void(typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFRange = Declared(CFRange))
 */
private val CFStringTokenizerSetString_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CFRange.layout)
private val CFStringTokenizerSetString_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerSetString").orElseThrow() }
private val CFStringTokenizerSetString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerSetString_ADDR, CFStringTokenizerSetString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerSetString(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        CFStringTokenizerSetString_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerGoToTokenAtIndex typedef CFStringTokenizerTokenType = Declared(CFStringTokenizerTokenType)(typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*,typedef CFIndex = Long)
 */
private val CFStringTokenizerGoToTokenAtIndex_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringTokenizerGoToTokenAtIndex_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerGoToTokenAtIndex").orElseThrow() }
private val CFStringTokenizerGoToTokenAtIndex_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerGoToTokenAtIndex_ADDR, CFStringTokenizerGoToTokenAtIndex_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerGoToTokenAtIndex(arg0: MemorySegment, arg1: Long): CFStringTokenizerTokenType {
    try {
        return CFStringTokenizerTokenType(CFStringTokenizerGoToTokenAtIndex_HANDLE.invokeExact(arg0, arg1) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerAdvanceToNextToken typedef CFStringTokenizerTokenType = Declared(CFStringTokenizerTokenType)(typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*)
 */
private val CFStringTokenizerAdvanceToNextToken_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringTokenizerAdvanceToNextToken_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerAdvanceToNextToken").orElseThrow() }
private val CFStringTokenizerAdvanceToNextToken_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerAdvanceToNextToken_ADDR, CFStringTokenizerAdvanceToNextToken_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerAdvanceToNextToken(arg0: MemorySegment): CFStringTokenizerTokenType {
    try {
        return CFStringTokenizerTokenType(CFStringTokenizerAdvanceToNextToken_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerGetCurrentTokenRange typedef CFRange = Declared(CFRange)(typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*)
 */
private val CFStringTokenizerGetCurrentTokenRange_DESC: FunctionDescriptor = FunctionDescriptor.of(CFRange.layout, ValueLayout.ADDRESS)
private val CFStringTokenizerGetCurrentTokenRange_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerGetCurrentTokenRange").orElseThrow() }
private val CFStringTokenizerGetCurrentTokenRange_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerGetCurrentTokenRange_ADDR, CFStringTokenizerGetCurrentTokenRange_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerGetCurrentTokenRange(allocator: SegmentAllocator, arg0: MemorySegment): MemorySegment {
    try {
        return CFStringTokenizerGetCurrentTokenRange_HANDLE.invokeExact(allocator, arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerCopyCurrentTokenAttribute typedef CFTypeRef = (Void)*(typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFStringTokenizerCopyCurrentTokenAttribute_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFStringTokenizerCopyCurrentTokenAttribute_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerCopyCurrentTokenAttribute").orElseThrow() }
private val CFStringTokenizerCopyCurrentTokenAttribute_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerCopyCurrentTokenAttribute_ADDR, CFStringTokenizerCopyCurrentTokenAttribute_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerCopyCurrentTokenAttribute(arg0: MemorySegment, arg1: Long): MemorySegment {
    try {
        return CFStringTokenizerCopyCurrentTokenAttribute_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFStringTokenizerGetCurrentSubTokens typedef CFIndex = Long(typedef CFStringTokenizerRef = (Declared(__CFStringTokenizer))*,(typedef CFRange = Declared(CFRange))*,typedef CFIndex = Long,typedef CFMutableArrayRef = (Declared(__CFArray))*)
 */
private val CFStringTokenizerGetCurrentSubTokens_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFStringTokenizerGetCurrentSubTokens_ADDR: MemorySegment by lazy { LOOKUP.find("CFStringTokenizerGetCurrentSubTokens").orElseThrow() }
private val CFStringTokenizerGetCurrentSubTokens_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFStringTokenizerGetCurrentSubTokens_ADDR, CFStringTokenizerGetCurrentSubTokens_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFStringTokenizerGetCurrentSubTokens(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: MemorySegment): Long {
    try {
        return CFStringTokenizerGetCurrentSubTokens_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFFileDescriptorGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFFileDescriptorGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorGetTypeID").orElseThrow() }
private val CFFileDescriptorGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorGetTypeID_ADDR, CFFileDescriptorGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorGetTypeID(): Long {
    try {
        return CFFileDescriptorGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorCreate typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFFileDescriptorNativeDescriptor = Int,typedef Boolean = UNSIGNED = Char,typedef CFFileDescriptorCallBack = (Void((Declared(__CFFileDescriptor))*,UNSIGNED = Long,(Void)*))*,(typedef CFFileDescriptorContext = Declared(CFFileDescriptorContext))*)
 */
private val CFFileDescriptorCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileDescriptorCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorCreate").orElseThrow() }
private val CFFileDescriptorCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorCreate_ADDR, CFFileDescriptorCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorCreate(arg0: MemorySegment, arg1: Int, arg2: Byte, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFFileDescriptorCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorGetNativeDescriptor typedef CFFileDescriptorNativeDescriptor = Int(typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*)
 */
private val CFFileDescriptorGetNativeDescriptor_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFFileDescriptorGetNativeDescriptor_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorGetNativeDescriptor").orElseThrow() }
private val CFFileDescriptorGetNativeDescriptor_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorGetNativeDescriptor_ADDR, CFFileDescriptorGetNativeDescriptor_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorGetNativeDescriptor(arg0: MemorySegment): Int {
    try {
        return CFFileDescriptorGetNativeDescriptor_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorGetContext Void(typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*,(typedef CFFileDescriptorContext = Declared(CFFileDescriptorContext))*)
 */
private val CFFileDescriptorGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFFileDescriptorGetContext_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorGetContext").orElseThrow() }
private val CFFileDescriptorGetContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorGetContext_ADDR, CFFileDescriptorGetContext_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFFileDescriptorGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorEnableCallBacks Void(typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFFileDescriptorEnableCallBacks_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFFileDescriptorEnableCallBacks_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorEnableCallBacks").orElseThrow() }
private val CFFileDescriptorEnableCallBacks_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorEnableCallBacks_ADDR, CFFileDescriptorEnableCallBacks_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorEnableCallBacks(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFFileDescriptorEnableCallBacks_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorDisableCallBacks Void(typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*,typedef CFOptionFlags = UNSIGNED = Long)
 */
private val CFFileDescriptorDisableCallBacks_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFFileDescriptorDisableCallBacks_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorDisableCallBacks").orElseThrow() }
private val CFFileDescriptorDisableCallBacks_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorDisableCallBacks_ADDR, CFFileDescriptorDisableCallBacks_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorDisableCallBacks(arg0: MemorySegment, arg1: Long): Unit {
    try {
        CFFileDescriptorDisableCallBacks_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorInvalidate Void(typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*)
 */
private val CFFileDescriptorInvalidate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val CFFileDescriptorInvalidate_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorInvalidate").orElseThrow() }
private val CFFileDescriptorInvalidate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorInvalidate_ADDR, CFFileDescriptorInvalidate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorInvalidate(arg0: MemorySegment): Unit {
    try {
        CFFileDescriptorInvalidate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorIsValid typedef Boolean = UNSIGNED = Char(typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*)
 */
private val CFFileDescriptorIsValid_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFFileDescriptorIsValid_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorIsValid").orElseThrow() }
private val CFFileDescriptorIsValid_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorIsValid_ADDR, CFFileDescriptorIsValid_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorIsValid(arg0: MemorySegment): Byte {
    try {
        return CFFileDescriptorIsValid_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFFileDescriptorCreateRunLoopSource typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFFileDescriptorRef = (Declared(__CFFileDescriptor))*,typedef CFIndex = Long)
 */
private val CFFileDescriptorCreateRunLoopSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFFileDescriptorCreateRunLoopSource_ADDR: MemorySegment by lazy { LOOKUP.find("CFFileDescriptorCreateRunLoopSource").orElseThrow() }
private val CFFileDescriptorCreateRunLoopSource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFFileDescriptorCreateRunLoopSource_ADDR, CFFileDescriptorCreateRunLoopSource_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun CFFileDescriptorCreateRunLoopSource(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFFileDescriptorCreateRunLoopSource_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFUserNotificationGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFUserNotificationGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationGetTypeID").orElseThrow() }
private val CFUserNotificationGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationGetTypeID_ADDR, CFUserNotificationGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationGetTypeID(): Long {
    try {
        return CFUserNotificationGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationCreate typedef CFUserNotificationRef = (Declared(__CFUserNotification))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFTimeInterval = Double,typedef CFOptionFlags = UNSIGNED = Long,(typedef SInt32 = Int)*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CFUserNotificationCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUserNotificationCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationCreate").orElseThrow() }
private val CFUserNotificationCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationCreate_ADDR, CFUserNotificationCreate_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationCreate(arg0: MemorySegment, arg1: Double, arg2: Long, arg3: MemorySegment, arg4: MemorySegment): MemorySegment {
    try {
        return CFUserNotificationCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationReceiveResponse typedef SInt32 = Int(typedef CFUserNotificationRef = (Declared(__CFUserNotification))*,typedef CFTimeInterval = Double,(typedef CFOptionFlags = UNSIGNED = Long)*)
 */
private val CFUserNotificationReceiveResponse_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
private val CFUserNotificationReceiveResponse_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationReceiveResponse").orElseThrow() }
private val CFUserNotificationReceiveResponse_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationReceiveResponse_ADDR, CFUserNotificationReceiveResponse_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationReceiveResponse(arg0: MemorySegment, arg1: Double, arg2: MemorySegment): Int {
    try {
        return CFUserNotificationReceiveResponse_HANDLE.invokeExact(arg0, arg1, arg2) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationGetResponseValue typedef CFStringRef = (Declared(__CFString))*(typedef CFUserNotificationRef = (Declared(__CFUserNotification))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFIndex = Long)
 */
private val CFUserNotificationGetResponseValue_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFUserNotificationGetResponseValue_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationGetResponseValue").orElseThrow() }
private val CFUserNotificationGetResponseValue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationGetResponseValue_ADDR, CFUserNotificationGetResponseValue_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationGetResponseValue(arg0: MemorySegment, arg1: MemorySegment, arg2: Long): MemorySegment {
    try {
        return CFUserNotificationGetResponseValue_HANDLE.invokeExact(arg0, arg1, arg2) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationGetResponseDictionary typedef CFDictionaryRef = (Declared(__CFDictionary))*(typedef CFUserNotificationRef = (Declared(__CFUserNotification))*)
 */
private val CFUserNotificationGetResponseDictionary_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUserNotificationGetResponseDictionary_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationGetResponseDictionary").orElseThrow() }
private val CFUserNotificationGetResponseDictionary_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationGetResponseDictionary_ADDR, CFUserNotificationGetResponseDictionary_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationGetResponseDictionary(arg0: MemorySegment): MemorySegment {
    try {
        return CFUserNotificationGetResponseDictionary_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationUpdate typedef SInt32 = Int(typedef CFUserNotificationRef = (Declared(__CFUserNotification))*,typedef CFTimeInterval = Double,typedef CFOptionFlags = UNSIGNED = Long,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val CFUserNotificationUpdate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFUserNotificationUpdate_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationUpdate").orElseThrow() }
private val CFUserNotificationUpdate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationUpdate_ADDR, CFUserNotificationUpdate_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationUpdate(arg0: MemorySegment, arg1: Double, arg2: Long, arg3: MemorySegment): Int {
    try {
        return CFUserNotificationUpdate_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationCancel typedef SInt32 = Int(typedef CFUserNotificationRef = (Declared(__CFUserNotification))*)
 */
private val CFUserNotificationCancel_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val CFUserNotificationCancel_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationCancel").orElseThrow() }
private val CFUserNotificationCancel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationCancel_ADDR, CFUserNotificationCancel_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationCancel(arg0: MemorySegment): Int {
    try {
        return CFUserNotificationCancel_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationCreateRunLoopSource typedef CFRunLoopSourceRef = (Declared(__CFRunLoopSource))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFUserNotificationRef = (Declared(__CFUserNotification))*,typedef CFUserNotificationCallBack = (Void((Declared(__CFUserNotification))*,UNSIGNED = Long))*,typedef CFIndex = Long)
 */
private val CFUserNotificationCreateRunLoopSource_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFUserNotificationCreateRunLoopSource_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationCreateRunLoopSource").orElseThrow() }
private val CFUserNotificationCreateRunLoopSource_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationCreateRunLoopSource_ADDR, CFUserNotificationCreateRunLoopSource_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationCreateRunLoopSource(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long): MemorySegment {
    try {
        return CFUserNotificationCreateRunLoopSource_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationDisplayNotice typedef SInt32 = Int(typedef CFTimeInterval = Double,typedef CFOptionFlags = UNSIGNED = Long,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFUserNotificationDisplayNotice_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUserNotificationDisplayNotice_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationDisplayNotice").orElseThrow() }
private val CFUserNotificationDisplayNotice_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationDisplayNotice_ADDR, CFUserNotificationDisplayNotice_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationDisplayNotice(arg0: Double, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment): Int {
    try {
        return CFUserNotificationDisplayNotice_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFUserNotificationDisplayAlert typedef SInt32 = Int(typedef CFTimeInterval = Double,typedef CFOptionFlags = UNSIGNED = Long,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,typedef CFStringRef = (Declared(__CFString))*,(typedef CFOptionFlags = UNSIGNED = Long)*)
 */
private val CFUserNotificationDisplayAlert_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFUserNotificationDisplayAlert_ADDR: MemorySegment by lazy { LOOKUP.find("CFUserNotificationDisplayAlert").orElseThrow() }
private val CFUserNotificationDisplayAlert_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFUserNotificationDisplayAlert_ADDR, CFUserNotificationDisplayAlert_DESC) }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun CFUserNotificationDisplayAlert(arg0: Double, arg1: Long, arg2: MemorySegment, arg3: MemorySegment, arg4: MemorySegment, arg5: MemorySegment, arg6: MemorySegment, arg7: MemorySegment, arg8: MemorySegment, arg9: MemorySegment, arg10: MemorySegment): Int {
    try {
        return CFUserNotificationDisplayAlert_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : kCFUserNotificationIconURLKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationIconURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationIconURLKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationIconURLKey").orElseThrow().reinterpret(kCFUserNotificationIconURLKey_LAYOUT.byteSize()) }
private val kCFUserNotificationIconURLKey_VH: VarHandle by lazy { kCFUserNotificationIconURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationIconURLKey: MemorySegment
    get() = kCFUserNotificationIconURLKey_VH.get(kCFUserNotificationIconURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationIconURLKey_VH.set(kCFUserNotificationIconURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationSoundURLKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationSoundURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationSoundURLKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationSoundURLKey").orElseThrow().reinterpret(kCFUserNotificationSoundURLKey_LAYOUT.byteSize()) }
private val kCFUserNotificationSoundURLKey_VH: VarHandle by lazy { kCFUserNotificationSoundURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationSoundURLKey: MemorySegment
    get() = kCFUserNotificationSoundURLKey_VH.get(kCFUserNotificationSoundURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationSoundURLKey_VH.set(kCFUserNotificationSoundURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationLocalizationURLKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationLocalizationURLKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationLocalizationURLKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationLocalizationURLKey").orElseThrow().reinterpret(kCFUserNotificationLocalizationURLKey_LAYOUT.byteSize()) }
private val kCFUserNotificationLocalizationURLKey_VH: VarHandle by lazy { kCFUserNotificationLocalizationURLKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationLocalizationURLKey: MemorySegment
    get() = kCFUserNotificationLocalizationURLKey_VH.get(kCFUserNotificationLocalizationURLKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationLocalizationURLKey_VH.set(kCFUserNotificationLocalizationURLKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationAlertHeaderKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationAlertHeaderKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationAlertHeaderKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationAlertHeaderKey").orElseThrow().reinterpret(kCFUserNotificationAlertHeaderKey_LAYOUT.byteSize()) }
private val kCFUserNotificationAlertHeaderKey_VH: VarHandle by lazy { kCFUserNotificationAlertHeaderKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationAlertHeaderKey: MemorySegment
    get() = kCFUserNotificationAlertHeaderKey_VH.get(kCFUserNotificationAlertHeaderKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationAlertHeaderKey_VH.set(kCFUserNotificationAlertHeaderKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationAlertMessageKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationAlertMessageKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationAlertMessageKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationAlertMessageKey").orElseThrow().reinterpret(kCFUserNotificationAlertMessageKey_LAYOUT.byteSize()) }
private val kCFUserNotificationAlertMessageKey_VH: VarHandle by lazy { kCFUserNotificationAlertMessageKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationAlertMessageKey: MemorySegment
    get() = kCFUserNotificationAlertMessageKey_VH.get(kCFUserNotificationAlertMessageKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationAlertMessageKey_VH.set(kCFUserNotificationAlertMessageKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationDefaultButtonTitleKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationDefaultButtonTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationDefaultButtonTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationDefaultButtonTitleKey").orElseThrow().reinterpret(kCFUserNotificationDefaultButtonTitleKey_LAYOUT.byteSize()) }
private val kCFUserNotificationDefaultButtonTitleKey_VH: VarHandle by lazy { kCFUserNotificationDefaultButtonTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationDefaultButtonTitleKey: MemorySegment
    get() = kCFUserNotificationDefaultButtonTitleKey_VH.get(kCFUserNotificationDefaultButtonTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationDefaultButtonTitleKey_VH.set(kCFUserNotificationDefaultButtonTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationAlternateButtonTitleKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationAlternateButtonTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationAlternateButtonTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationAlternateButtonTitleKey").orElseThrow().reinterpret(kCFUserNotificationAlternateButtonTitleKey_LAYOUT.byteSize()) }
private val kCFUserNotificationAlternateButtonTitleKey_VH: VarHandle by lazy { kCFUserNotificationAlternateButtonTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationAlternateButtonTitleKey: MemorySegment
    get() = kCFUserNotificationAlternateButtonTitleKey_VH.get(kCFUserNotificationAlternateButtonTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationAlternateButtonTitleKey_VH.set(kCFUserNotificationAlternateButtonTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationOtherButtonTitleKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationOtherButtonTitleKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationOtherButtonTitleKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationOtherButtonTitleKey").orElseThrow().reinterpret(kCFUserNotificationOtherButtonTitleKey_LAYOUT.byteSize()) }
private val kCFUserNotificationOtherButtonTitleKey_VH: VarHandle by lazy { kCFUserNotificationOtherButtonTitleKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationOtherButtonTitleKey: MemorySegment
    get() = kCFUserNotificationOtherButtonTitleKey_VH.get(kCFUserNotificationOtherButtonTitleKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationOtherButtonTitleKey_VH.set(kCFUserNotificationOtherButtonTitleKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationProgressIndicatorValueKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationProgressIndicatorValueKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationProgressIndicatorValueKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationProgressIndicatorValueKey").orElseThrow().reinterpret(kCFUserNotificationProgressIndicatorValueKey_LAYOUT.byteSize()) }
private val kCFUserNotificationProgressIndicatorValueKey_VH: VarHandle by lazy { kCFUserNotificationProgressIndicatorValueKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationProgressIndicatorValueKey: MemorySegment
    get() = kCFUserNotificationProgressIndicatorValueKey_VH.get(kCFUserNotificationProgressIndicatorValueKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationProgressIndicatorValueKey_VH.set(kCFUserNotificationProgressIndicatorValueKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationPopUpTitlesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationPopUpTitlesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationPopUpTitlesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationPopUpTitlesKey").orElseThrow().reinterpret(kCFUserNotificationPopUpTitlesKey_LAYOUT.byteSize()) }
private val kCFUserNotificationPopUpTitlesKey_VH: VarHandle by lazy { kCFUserNotificationPopUpTitlesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationPopUpTitlesKey: MemorySegment
    get() = kCFUserNotificationPopUpTitlesKey_VH.get(kCFUserNotificationPopUpTitlesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationPopUpTitlesKey_VH.set(kCFUserNotificationPopUpTitlesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationTextFieldTitlesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationTextFieldTitlesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationTextFieldTitlesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationTextFieldTitlesKey").orElseThrow().reinterpret(kCFUserNotificationTextFieldTitlesKey_LAYOUT.byteSize()) }
private val kCFUserNotificationTextFieldTitlesKey_VH: VarHandle by lazy { kCFUserNotificationTextFieldTitlesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationTextFieldTitlesKey: MemorySegment
    get() = kCFUserNotificationTextFieldTitlesKey_VH.get(kCFUserNotificationTextFieldTitlesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationTextFieldTitlesKey_VH.set(kCFUserNotificationTextFieldTitlesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationCheckBoxTitlesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationCheckBoxTitlesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationCheckBoxTitlesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationCheckBoxTitlesKey").orElseThrow().reinterpret(kCFUserNotificationCheckBoxTitlesKey_LAYOUT.byteSize()) }
private val kCFUserNotificationCheckBoxTitlesKey_VH: VarHandle by lazy { kCFUserNotificationCheckBoxTitlesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationCheckBoxTitlesKey: MemorySegment
    get() = kCFUserNotificationCheckBoxTitlesKey_VH.get(kCFUserNotificationCheckBoxTitlesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationCheckBoxTitlesKey_VH.set(kCFUserNotificationCheckBoxTitlesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationTextFieldValuesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationTextFieldValuesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationTextFieldValuesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationTextFieldValuesKey").orElseThrow().reinterpret(kCFUserNotificationTextFieldValuesKey_LAYOUT.byteSize()) }
private val kCFUserNotificationTextFieldValuesKey_VH: VarHandle by lazy { kCFUserNotificationTextFieldValuesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationTextFieldValuesKey: MemorySegment
    get() = kCFUserNotificationTextFieldValuesKey_VH.get(kCFUserNotificationTextFieldValuesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationTextFieldValuesKey_VH.set(kCFUserNotificationTextFieldValuesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationPopUpSelectionKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationPopUpSelectionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationPopUpSelectionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationPopUpSelectionKey").orElseThrow().reinterpret(kCFUserNotificationPopUpSelectionKey_LAYOUT.byteSize()) }
private val kCFUserNotificationPopUpSelectionKey_VH: VarHandle by lazy { kCFUserNotificationPopUpSelectionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationPopUpSelectionKey: MemorySegment
    get() = kCFUserNotificationPopUpSelectionKey_VH.get(kCFUserNotificationPopUpSelectionKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationPopUpSelectionKey_VH.set(kCFUserNotificationPopUpSelectionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationAlertTopMostKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationAlertTopMostKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationAlertTopMostKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationAlertTopMostKey").orElseThrow().reinterpret(kCFUserNotificationAlertTopMostKey_LAYOUT.byteSize()) }
private val kCFUserNotificationAlertTopMostKey_VH: VarHandle by lazy { kCFUserNotificationAlertTopMostKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationAlertTopMostKey: MemorySegment
    get() = kCFUserNotificationAlertTopMostKey_VH.get(kCFUserNotificationAlertTopMostKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationAlertTopMostKey_VH.set(kCFUserNotificationAlertTopMostKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationKeyboardTypesKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationKeyboardTypesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationKeyboardTypesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationKeyboardTypesKey").orElseThrow().reinterpret(kCFUserNotificationKeyboardTypesKey_LAYOUT.byteSize()) }
private val kCFUserNotificationKeyboardTypesKey_VH: VarHandle by lazy { kCFUserNotificationKeyboardTypesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
var kCFUserNotificationKeyboardTypesKey: MemorySegment
    get() = kCFUserNotificationKeyboardTypesKey_VH.get(kCFUserNotificationKeyboardTypesKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationKeyboardTypesKey_VH.set(kCFUserNotificationKeyboardTypesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationAlertAccessibilityIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationAlertAccessibilityIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationAlertAccessibilityIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationAlertAccessibilityIdentifierKey").orElseThrow().reinterpret(kCFUserNotificationAlertAccessibilityIdentifierKey_LAYOUT.byteSize()) }
private val kCFUserNotificationAlertAccessibilityIdentifierKey_VH: VarHandle by lazy { kCFUserNotificationAlertAccessibilityIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var kCFUserNotificationAlertAccessibilityIdentifierKey: MemorySegment
    get() = kCFUserNotificationAlertAccessibilityIdentifierKey_VH.get(kCFUserNotificationAlertAccessibilityIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationAlertAccessibilityIdentifierKey_VH.set(kCFUserNotificationAlertAccessibilityIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationDefaultButtonAccessibilityIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationDefaultButtonAccessibilityIdentifierKey").orElseThrow().reinterpret(kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_LAYOUT.byteSize()) }
private val kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_VH: VarHandle by lazy { kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var kCFUserNotificationDefaultButtonAccessibilityIdentifierKey: MemorySegment
    get() = kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_VH.get(kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_VH.set(kCFUserNotificationDefaultButtonAccessibilityIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationAlternateButtonAccessibilityIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationAlternateButtonAccessibilityIdentifierKey").orElseThrow().reinterpret(kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_LAYOUT.byteSize()) }
private val kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_VH: VarHandle by lazy { kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var kCFUserNotificationAlternateButtonAccessibilityIdentifierKey: MemorySegment
    get() = kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_VH.get(kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_VH.set(kCFUserNotificationAlternateButtonAccessibilityIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : kCFUserNotificationOtherButtonAccessibilityIdentifierKey typedef const CFStringRef = (Declared(__CFString))*
 */
private val kCFUserNotificationOtherButtonAccessibilityIdentifierKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val kCFUserNotificationOtherButtonAccessibilityIdentifierKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("kCFUserNotificationOtherButtonAccessibilityIdentifierKey").orElseThrow().reinterpret(kCFUserNotificationOtherButtonAccessibilityIdentifierKey_LAYOUT.byteSize()) }
private val kCFUserNotificationOtherButtonAccessibilityIdentifierKey_VH: VarHandle by lazy { kCFUserNotificationOtherButtonAccessibilityIdentifierKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var kCFUserNotificationOtherButtonAccessibilityIdentifierKey: MemorySegment
    get() = kCFUserNotificationOtherButtonAccessibilityIdentifierKey_VH.get(kCFUserNotificationOtherButtonAccessibilityIdentifierKey_SEGMENT, 0L) as MemorySegment
    set(value) = kCFUserNotificationOtherButtonAccessibilityIdentifierKey_VH.set(kCFUserNotificationOtherButtonAccessibilityIdentifierKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : CFXMLNodeGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFXMLNodeGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFXMLNodeGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeGetTypeID").orElseThrow() }
private val CFXMLNodeGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeGetTypeID_ADDR, CFXMLNodeGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeGetTypeID(): Long {
    try {
        return CFXMLNodeGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLNodeCreate typedef CFXMLNodeRef = (Declared(__CFXMLNode))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFXMLNodeTypeCode = Declared(CFXMLNodeTypeCode),typedef CFStringRef = (Declared(__CFString))*,(Void)*,typedef CFIndex = Long)
 */
private val CFXMLNodeCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
private val CFXMLNodeCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeCreate").orElseThrow() }
private val CFXMLNodeCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeCreate_ADDR, CFXMLNodeCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeCreate(arg0: MemorySegment, arg1: CFXMLNodeTypeCode, arg2: MemorySegment, arg3: MemorySegment, arg4: Long): MemorySegment {
    try {
        return CFXMLNodeCreate_HANDLE.invokeExact(arg0, arg1.value, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLNodeCreateCopy typedef CFXMLNodeRef = (Declared(__CFXMLNode))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFXMLNodeRef = (Declared(__CFXMLNode))*)
 */
private val CFXMLNodeCreateCopy_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLNodeCreateCopy_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeCreateCopy").orElseThrow() }
private val CFXMLNodeCreateCopy_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeCreateCopy_ADDR, CFXMLNodeCreateCopy_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeCreateCopy(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFXMLNodeCreateCopy_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLNodeGetTypeCode typedef CFXMLNodeTypeCode = Declared(CFXMLNodeTypeCode)(typedef CFXMLNodeRef = (Declared(__CFXMLNode))*)
 */
private val CFXMLNodeGetTypeCode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLNodeGetTypeCode_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeGetTypeCode").orElseThrow() }
private val CFXMLNodeGetTypeCode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeGetTypeCode_ADDR, CFXMLNodeGetTypeCode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeGetTypeCode(arg0: MemorySegment): CFXMLNodeTypeCode {
    try {
        return CFXMLNodeTypeCode.fromValue(CFXMLNodeGetTypeCode_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLNodeGetString typedef CFStringRef = (Declared(__CFString))*(typedef CFXMLNodeRef = (Declared(__CFXMLNode))*)
 */
private val CFXMLNodeGetString_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLNodeGetString_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeGetString").orElseThrow() }
private val CFXMLNodeGetString_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeGetString_ADDR, CFXMLNodeGetString_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeGetString(arg0: MemorySegment): MemorySegment {
    try {
        return CFXMLNodeGetString_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLNodeGetInfoPtr (Void)*(typedef CFXMLNodeRef = (Declared(__CFXMLNode))*)
 */
private val CFXMLNodeGetInfoPtr_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLNodeGetInfoPtr_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeGetInfoPtr").orElseThrow() }
private val CFXMLNodeGetInfoPtr_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeGetInfoPtr_ADDR, CFXMLNodeGetInfoPtr_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeGetInfoPtr(arg0: MemorySegment): MemorySegment {
    try {
        return CFXMLNodeGetInfoPtr_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLNodeGetVersion typedef CFIndex = Long(typedef CFXMLNodeRef = (Declared(__CFXMLNode))*)
 */
private val CFXMLNodeGetVersion_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLNodeGetVersion_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLNodeGetVersion").orElseThrow() }
private val CFXMLNodeGetVersion_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLNodeGetVersion_ADDR, CFXMLNodeGetVersion_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLNodeGetVersion(arg0: MemorySegment): Long {
    try {
        return CFXMLNodeGetVersion_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLTreeCreateWithNode typedef CFXMLTreeRef = (Declared(__CFTree))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFXMLNodeRef = (Declared(__CFXMLNode))*)
 */
private val CFXMLTreeCreateWithNode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLTreeCreateWithNode_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLTreeCreateWithNode").orElseThrow() }
private val CFXMLTreeCreateWithNode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLTreeCreateWithNode_ADDR, CFXMLTreeCreateWithNode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLTreeCreateWithNode(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return CFXMLTreeCreateWithNode_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLTreeGetNode typedef CFXMLNodeRef = (Declared(__CFXMLNode))*(typedef CFXMLTreeRef = (Declared(__CFTree))*)
 */
private val CFXMLTreeGetNode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLTreeGetNode_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLTreeGetNode").orElseThrow() }
private val CFXMLTreeGetNode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLTreeGetNode_ADDR, CFXMLTreeGetNode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLNode is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLTreeGetNode(arg0: MemorySegment): MemorySegment {
    try {
        return CFXMLTreeGetNode_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetTypeID typedef CFTypeID = UNSIGNED = Long()
 */
private val CFXMLParserGetTypeID_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG)
private val CFXMLParserGetTypeID_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetTypeID").orElseThrow() }
private val CFXMLParserGetTypeID_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetTypeID_ADDR, CFXMLParserGetTypeID_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetTypeID(): Long {
    try {
        return CFXMLParserGetTypeID_HANDLE.invokeExact() as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserCreate typedef CFXMLParserRef = (Declared(__CFXMLParser))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long,(typedef CFXMLParserCallBacks = Declared(CFXMLParserCallBacks))*,(typedef CFXMLParserContext = Declared(CFXMLParserContext))*)
 */
private val CFXMLParserCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserCreate_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserCreate").orElseThrow() }
private val CFXMLParserCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserCreate_ADDR, CFXMLParserCreate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserCreate(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long, arg4: Long, arg5: MemorySegment, arg6: MemorySegment): MemorySegment {
    try {
        return CFXMLParserCreate_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserCreateWithDataFromURL typedef CFXMLParserRef = (Declared(__CFXMLParser))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long,(typedef CFXMLParserCallBacks = Declared(CFXMLParserCallBacks))*,(typedef CFXMLParserContext = Declared(CFXMLParserContext))*)
 */
private val CFXMLParserCreateWithDataFromURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserCreateWithDataFromURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserCreateWithDataFromURL").orElseThrow() }
private val CFXMLParserCreateWithDataFromURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserCreateWithDataFromURL_ADDR, CFXMLParserCreateWithDataFromURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserCreateWithDataFromURL(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long, arg4: MemorySegment, arg5: MemorySegment): MemorySegment {
    try {
        return CFXMLParserCreateWithDataFromURL_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetContext Void(typedef CFXMLParserRef = (Declared(__CFXMLParser))*,(typedef CFXMLParserContext = Declared(CFXMLParserContext))*)
 */
private val CFXMLParserGetContext_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserGetContext_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetContext").orElseThrow() }
private val CFXMLParserGetContext_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetContext_ADDR, CFXMLParserGetContext_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetContext(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFXMLParserGetContext_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetCallBacks Void(typedef CFXMLParserRef = (Declared(__CFXMLParser))*,(typedef CFXMLParserCallBacks = Declared(CFXMLParserCallBacks))*)
 */
private val CFXMLParserGetCallBacks_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserGetCallBacks_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetCallBacks").orElseThrow() }
private val CFXMLParserGetCallBacks_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetCallBacks_ADDR, CFXMLParserGetCallBacks_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetCallBacks(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        CFXMLParserGetCallBacks_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetSourceURL typedef CFURLRef = (Declared(__CFURL))*(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserGetSourceURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserGetSourceURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetSourceURL").orElseThrow() }
private val CFXMLParserGetSourceURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetSourceURL_ADDR, CFXMLParserGetSourceURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetSourceURL(arg0: MemorySegment): MemorySegment {
    try {
        return CFXMLParserGetSourceURL_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetLocation typedef CFIndex = Long(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserGetLocation_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLParserGetLocation_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetLocation").orElseThrow() }
private val CFXMLParserGetLocation_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetLocation_ADDR, CFXMLParserGetLocation_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetLocation(arg0: MemorySegment): Long {
    try {
        return CFXMLParserGetLocation_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetLineNumber typedef CFIndex = Long(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserGetLineNumber_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLParserGetLineNumber_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetLineNumber").orElseThrow() }
private val CFXMLParserGetLineNumber_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetLineNumber_ADDR, CFXMLParserGetLineNumber_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetLineNumber(arg0: MemorySegment): Long {
    try {
        return CFXMLParserGetLineNumber_HANDLE.invokeExact(arg0) as Long
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetDocument (Void)*(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserGetDocument_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserGetDocument_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetDocument").orElseThrow() }
private val CFXMLParserGetDocument_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetDocument_ADDR, CFXMLParserGetDocument_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetDocument(arg0: MemorySegment): MemorySegment {
    try {
        return CFXMLParserGetDocument_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserGetStatusCode typedef CFXMLParserStatusCode = Declared(CFXMLParserStatusCode)(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserGetStatusCode_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLParserGetStatusCode_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserGetStatusCode").orElseThrow() }
private val CFXMLParserGetStatusCode_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserGetStatusCode_ADDR, CFXMLParserGetStatusCode_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserGetStatusCode(arg0: MemorySegment): CFXMLParserStatusCode {
    try {
        return CFXMLParserStatusCode(CFXMLParserGetStatusCode_HANDLE.invokeExact(arg0) as Long)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserCopyErrorDescription typedef CFStringRef = (Declared(__CFString))*(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserCopyErrorDescription_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CFXMLParserCopyErrorDescription_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserCopyErrorDescription").orElseThrow() }
private val CFXMLParserCopyErrorDescription_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserCopyErrorDescription_ADDR, CFXMLParserCopyErrorDescription_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserCopyErrorDescription(arg0: MemorySegment): MemorySegment {
    try {
        return CFXMLParserCopyErrorDescription_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserAbort Void(typedef CFXMLParserRef = (Declared(__CFXMLParser))*,typedef CFXMLParserStatusCode = Declared(CFXMLParserStatusCode),typedef CFStringRef = (Declared(__CFString))*)
 */
private val CFXMLParserAbort_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLParserAbort_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserAbort").orElseThrow() }
private val CFXMLParserAbort_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserAbort_ADDR, CFXMLParserAbort_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserAbort(arg0: MemorySegment, arg1: CFXMLParserStatusCode, arg2: MemorySegment): Unit {
    try {
        CFXMLParserAbort_HANDLE.invokeExact(arg0, arg1.rawValue, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLParserParse typedef Boolean = UNSIGNED = Char(typedef CFXMLParserRef = (Declared(__CFXMLParser))*)
 */
private val CFXMLParserParse_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
private val CFXMLParserParse_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLParserParse").orElseThrow() }
private val CFXMLParserParse_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLParserParse_ADDR, CFXMLParserParse_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLParserParse(arg0: MemorySegment): Byte {
    try {
        return CFXMLParserParse_HANDLE.invokeExact(arg0) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLTreeCreateFromData typedef CFXMLTreeRef = (Declared(__CFTree))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long)
 */
private val CFXMLTreeCreateFromData_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val CFXMLTreeCreateFromData_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLTreeCreateFromData").orElseThrow() }
private val CFXMLTreeCreateFromData_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLTreeCreateFromData_ADDR, CFXMLTreeCreateFromData_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLTreeCreateFromData(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long, arg4: Long): MemorySegment {
    try {
        return CFXMLTreeCreateFromData_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLTreeCreateFromDataWithError typedef CFXMLTreeRef = (Declared(__CFTree))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFDataRef = (Declared(__CFData))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long,(typedef CFDictionaryRef = (Declared(__CFDictionary))*)*)
 */
private val CFXMLTreeCreateFromDataWithError_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
private val CFXMLTreeCreateFromDataWithError_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLTreeCreateFromDataWithError").orElseThrow() }
private val CFXMLTreeCreateFromDataWithError_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLTreeCreateFromDataWithError_ADDR, CFXMLTreeCreateFromDataWithError_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLTreeCreateFromDataWithError(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment, arg3: Long, arg4: Long, arg5: MemorySegment): MemorySegment {
    try {
        return CFXMLTreeCreateFromDataWithError_HANDLE.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CFXMLTreeCreateWithDataFromURL typedef CFXMLTreeRef = (Declared(__CFTree))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef CFURLRef = (Declared(__CFURL))*,typedef CFOptionFlags = UNSIGNED = Long,typedef CFIndex = Long)
 */
private val CFXMLTreeCreateWithDataFromURL_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
private val CFXMLTreeCreateWithDataFromURL_ADDR: MemorySegment by lazy { LOOKUP.find("CFXMLTreeCreateWithDataFromURL").orElseThrow() }
private val CFXMLTreeCreateWithDataFromURL_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CFXMLTreeCreateWithDataFromURL_ADDR, CFXMLTreeCreateWithDataFromURL_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 6, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "CFXMLParser is deprecated, use NSXMLParser, NSXMLDocument or libxml2 library instead")
fun CFXMLTreeCreateWithDataFromURL(arg0: MemorySegment, arg1: MemorySegment, arg2: Long, arg3: Long): MemorySegment {
    try {
        return CFXMLTreeCreateWithDataFromURL_HANDLE.invokeExact(arg0, arg1, arg2, arg3) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
