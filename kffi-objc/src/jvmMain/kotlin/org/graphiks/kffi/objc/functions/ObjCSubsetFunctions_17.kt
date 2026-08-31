@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * {@snippet lang=c : GCHapticsLocalityAll typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityAll_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityAll_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityAll").orElseThrow().reinterpret(GCHapticsLocalityAll_LAYOUT.byteSize()) }
private val GCHapticsLocalityAll_VH: VarHandle by lazy { GCHapticsLocalityAll_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityAll: MemorySegment
    get() = GCHapticsLocalityAll_VH.get(GCHapticsLocalityAll_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityAll_VH.set(GCHapticsLocalityAll_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityHandles typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityHandles_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityHandles_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityHandles").orElseThrow().reinterpret(GCHapticsLocalityHandles_LAYOUT.byteSize()) }
private val GCHapticsLocalityHandles_VH: VarHandle by lazy { GCHapticsLocalityHandles_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityHandles: MemorySegment
    get() = GCHapticsLocalityHandles_VH.get(GCHapticsLocalityHandles_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityHandles_VH.set(GCHapticsLocalityHandles_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityLeftHandle typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityLeftHandle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityLeftHandle_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityLeftHandle").orElseThrow().reinterpret(GCHapticsLocalityLeftHandle_LAYOUT.byteSize()) }
private val GCHapticsLocalityLeftHandle_VH: VarHandle by lazy { GCHapticsLocalityLeftHandle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityLeftHandle: MemorySegment
    get() = GCHapticsLocalityLeftHandle_VH.get(GCHapticsLocalityLeftHandle_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityLeftHandle_VH.set(GCHapticsLocalityLeftHandle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityRightHandle typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityRightHandle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityRightHandle_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityRightHandle").orElseThrow().reinterpret(GCHapticsLocalityRightHandle_LAYOUT.byteSize()) }
private val GCHapticsLocalityRightHandle_VH: VarHandle by lazy { GCHapticsLocalityRightHandle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityRightHandle: MemorySegment
    get() = GCHapticsLocalityRightHandle_VH.get(GCHapticsLocalityRightHandle_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityRightHandle_VH.set(GCHapticsLocalityRightHandle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityTriggers typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityTriggers_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityTriggers_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityTriggers").orElseThrow().reinterpret(GCHapticsLocalityTriggers_LAYOUT.byteSize()) }
private val GCHapticsLocalityTriggers_VH: VarHandle by lazy { GCHapticsLocalityTriggers_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityTriggers: MemorySegment
    get() = GCHapticsLocalityTriggers_VH.get(GCHapticsLocalityTriggers_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityTriggers_VH.set(GCHapticsLocalityTriggers_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityLeftTrigger typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityLeftTrigger_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityLeftTrigger_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityLeftTrigger").orElseThrow().reinterpret(GCHapticsLocalityLeftTrigger_LAYOUT.byteSize()) }
private val GCHapticsLocalityLeftTrigger_VH: VarHandle by lazy { GCHapticsLocalityLeftTrigger_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityLeftTrigger: MemorySegment
    get() = GCHapticsLocalityLeftTrigger_VH.get(GCHapticsLocalityLeftTrigger_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityLeftTrigger_VH.set(GCHapticsLocalityLeftTrigger_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticsLocalityRightTrigger typedef const GCHapticsLocality = (Void)*
 */
private val GCHapticsLocalityRightTrigger_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val GCHapticsLocalityRightTrigger_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticsLocalityRightTrigger").orElseThrow().reinterpret(GCHapticsLocalityRightTrigger_LAYOUT.byteSize()) }
private val GCHapticsLocalityRightTrigger_VH: VarHandle by lazy { GCHapticsLocalityRightTrigger_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticsLocalityRightTrigger: MemorySegment
    get() = GCHapticsLocalityRightTrigger_VH.get(GCHapticsLocalityRightTrigger_SEGMENT, 0L) as MemorySegment
    set(value) = GCHapticsLocalityRightTrigger_VH.set(GCHapticsLocalityRightTrigger_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : GCHapticDurationInfinite Float
 */
private val GCHapticDurationInfinite_LAYOUT: ValueLayout by lazy { ValueLayout.JAVA_FLOAT }
private val GCHapticDurationInfinite_SEGMENT: MemorySegment by lazy { LOOKUP.find("GCHapticDurationInfinite").orElseThrow().reinterpret(GCHapticDurationInfinite_LAYOUT.byteSize()) }
private val GCHapticDurationInfinite_VH: VarHandle by lazy { GCHapticDurationInfinite_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var GCHapticDurationInfinite: Float
    get() = GCHapticDurationInfinite_VH.get(GCHapticDurationInfinite_SEGMENT, 0L) as Float
    set(value) = GCHapticDurationInfinite_VH.set(GCHapticDurationInfinite_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : IOHIDDeviceGetService typedef io_service_t = UNSIGNED = Int(typedef IOHIDDeviceRef = (Declared(__IOHIDDevice))*)
 */
private val IOHIDDeviceGetService_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
private val IOHIDDeviceGetService_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDDeviceGetService").orElseThrow() }
private val IOHIDDeviceGetService_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDDeviceGetService_ADDR, IOHIDDeviceGetService_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun IOHIDDeviceGetService(arg0: MemorySegment): Int {
    try {
        return IOHIDDeviceGetService_HANDLE.invokeExact(arg0) as Int
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDDeviceConformsTo typedef Boolean = UNSIGNED = Char(typedef IOHIDDeviceRef = (Declared(__IOHIDDevice))*,typedef uint32_t = UNSIGNED = Int,typedef uint32_t = UNSIGNED = Int)
 */
private val IOHIDDeviceConformsTo_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
private val IOHIDDeviceConformsTo_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDDeviceConformsTo").orElseThrow() }
private val IOHIDDeviceConformsTo_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDDeviceConformsTo_ADDR, IOHIDDeviceConformsTo_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDDeviceConformsTo(arg0: MemorySegment, arg1: Int, arg2: Int): Byte {
    try {
        return IOHIDDeviceConformsTo_HANDLE.invokeExact(arg0, arg1, arg2) as Byte
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerCreate typedef IOHIDManagerRef = (Declared(__IOHIDManager))*(typedef CFAllocatorRef = (Declared(__CFAllocator))*,typedef IOOptionBits = UNSIGNED = Int)
 */
private val IOHIDManagerCreate_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
private val IOHIDManagerCreate_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerCreate").orElseThrow() }
private val IOHIDManagerCreate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerCreate_ADDR, IOHIDManagerCreate_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDManagerCreate(arg0: MemorySegment, arg1: Int): MemorySegment {
    try {
        return IOHIDManagerCreate_HANDLE.invokeExact(arg0, arg1) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerSetDispatchQueue Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*,typedef dispatch_queue_t = (Void)*)
 */
private val IOHIDManagerSetDispatchQueue_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDManagerSetDispatchQueue_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerSetDispatchQueue").orElseThrow() }
private val IOHIDManagerSetDispatchQueue_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerSetDispatchQueue_ADDR, IOHIDManagerSetDispatchQueue_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun IOHIDManagerSetDispatchQueue(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        IOHIDManagerSetDispatchQueue_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerSetCancelHandler Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*,typedef dispatch_block_t = (Void)*)
 */
private val IOHIDManagerSetCancelHandler_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDManagerSetCancelHandler_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerSetCancelHandler").orElseThrow() }
private val IOHIDManagerSetCancelHandler_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerSetCancelHandler_ADDR, IOHIDManagerSetCancelHandler_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun IOHIDManagerSetCancelHandler(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        IOHIDManagerSetCancelHandler_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerActivate Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*)
 */
private val IOHIDManagerActivate_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val IOHIDManagerActivate_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerActivate").orElseThrow() }
private val IOHIDManagerActivate_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerActivate_ADDR, IOHIDManagerActivate_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun IOHIDManagerActivate(arg0: MemorySegment): Unit {
    try {
        IOHIDManagerActivate_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerCancel Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*)
 */
private val IOHIDManagerCancel_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
private val IOHIDManagerCancel_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerCancel").orElseThrow() }
private val IOHIDManagerCancel_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerCancel_ADDR, IOHIDManagerCancel_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun IOHIDManagerCancel(arg0: MemorySegment): Unit {
    try {
        IOHIDManagerCancel_HANDLE.invokeExact(arg0)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerSetDeviceMatching Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*,typedef CFDictionaryRef = (Declared(__CFDictionary))*)
 */
private val IOHIDManagerSetDeviceMatching_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDManagerSetDeviceMatching_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerSetDeviceMatching").orElseThrow() }
private val IOHIDManagerSetDeviceMatching_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerSetDeviceMatching_ADDR, IOHIDManagerSetDeviceMatching_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDManagerSetDeviceMatching(arg0: MemorySegment, arg1: MemorySegment): Unit {
    try {
        IOHIDManagerSetDeviceMatching_HANDLE.invokeExact(arg0, arg1)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerRegisterDeviceMatchingCallback Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*,typedef IOHIDDeviceCallback = (Void((Void)*,Int,(Void)*,(Declared(__IOHIDDevice))*))*,(Void)*)
 */
private val IOHIDManagerRegisterDeviceMatchingCallback_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDManagerRegisterDeviceMatchingCallback_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerRegisterDeviceMatchingCallback").orElseThrow() }
private val IOHIDManagerRegisterDeviceMatchingCallback_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerRegisterDeviceMatchingCallback_ADDR, IOHIDManagerRegisterDeviceMatchingCallback_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDManagerRegisterDeviceMatchingCallback(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        IOHIDManagerRegisterDeviceMatchingCallback_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : IOHIDManagerRegisterDeviceRemovalCallback Void(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*,typedef IOHIDDeviceCallback = (Void((Void)*,Int,(Void)*,(Declared(__IOHIDDevice))*))*,(Void)*)
 */
private val IOHIDManagerRegisterDeviceRemovalCallback_DESC: FunctionDescriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDManagerRegisterDeviceRemovalCallback_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerRegisterDeviceRemovalCallback").orElseThrow() }
private val IOHIDManagerRegisterDeviceRemovalCallback_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerRegisterDeviceRemovalCallback_ADDR, IOHIDManagerRegisterDeviceRemovalCallback_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDManagerRegisterDeviceRemovalCallback(arg0: MemorySegment, arg1: MemorySegment, arg2: MemorySegment): Unit {
    try {
        IOHIDManagerRegisterDeviceRemovalCallback_HANDLE.invokeExact(arg0, arg1, arg2)
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}

/**
 * {@snippet lang=c : CMSampleBufferGetImageBuffer typedef CVPixelBufferRef = (Declared(__CVBuffer))*(typedef CMSampleBufferRef = (Declared(opaqueCMSampleBuffer))*)
 */
private val CMSampleBufferGetImageBuffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CMSampleBufferGetImageBuffer_ADDR: MemorySegment by lazy { LOOKUP.find("CMSampleBufferGetImageBuffer").orElseThrow() }
private val CMSampleBufferGetImageBuffer_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CMSampleBufferGetImageBuffer_ADDR, CMSampleBufferGetImageBuffer_DESC) }

fun CMSampleBufferGetImageBuffer(arg0: MemorySegment): MemorySegment {
    try {
        return CMSampleBufferGetImageBuffer_HANDLE.invokeExact(arg0) as MemorySegment
    } catch (ex: Error) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: Throwable) {
        throw AssertionError("should not reach here", ex)
    }
}
