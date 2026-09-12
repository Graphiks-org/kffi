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
 * {@snippet lang=c : IOHIDDeviceGetProperty typedef CFTypeRef = (Void)*(typedef IOHIDDeviceRef = (Declared(__IOHIDDevice))*,typedef CFStringRef = (Declared(__CFString))*)
 */
private val IOHIDDeviceGetProperty_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDDeviceGetProperty_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDDeviceGetProperty").orElseThrow() }
private val IOHIDDeviceGetProperty_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDDeviceGetProperty_ADDR, IOHIDDeviceGetProperty_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDDeviceGetProperty(arg0: MemorySegment, arg1: MemorySegment): MemorySegment {
    try {
        return IOHIDDeviceGetProperty_HANDLE.invokeExact(arg0, arg1) as MemorySegment
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
 * {@snippet lang=c : IOHIDManagerCopyDevices typedef CFSetRef = (Declared(__CFSet))*(typedef IOHIDManagerRef = (Declared(__IOHIDManager))*)
 */
private val IOHIDManagerCopyDevices_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val IOHIDManagerCopyDevices_ADDR: MemorySegment by lazy { LOOKUP.find("IOHIDManagerCopyDevices").orElseThrow() }
private val IOHIDManagerCopyDevices_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(IOHIDManagerCopyDevices_ADDR, IOHIDManagerCopyDevices_DESC) }

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun IOHIDManagerCopyDevices(arg0: MemorySegment): MemorySegment {
    try {
        return IOHIDManagerCopyDevices_HANDLE.invokeExact(arg0) as MemorySegment
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
 * {@snippet lang=c : CMSampleBufferGetImageBuffer typedef CVImageBufferRef = (Declared(__CVBuffer))*(typedef CMSampleBufferRef = (Declared(opaqueCMSampleBuffer))*)
 */
private val CMSampleBufferGetImageBuffer_DESC: FunctionDescriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
private val CMSampleBufferGetImageBuffer_ADDR: MemorySegment by lazy { LOOKUP.find("CMSampleBufferGetImageBuffer").orElseThrow() }
private val CMSampleBufferGetImageBuffer_HANDLE: MethodHandle by lazy { Linker.nativeLinker().downcallHandle(CMSampleBufferGetImageBuffer_ADDR, CMSampleBufferGetImageBuffer_DESC) }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
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

/**
 * {@snippet lang=c : AVVideoCodecKey (Void)*
 */
private val AVVideoCodecKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecKey").orElseThrow().reinterpret(AVVideoCodecKey_LAYOUT.byteSize()) }
private val AVVideoCodecKey_VH: VarHandle by lazy { AVVideoCodecKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCodecKey: MemorySegment
    get() = AVVideoCodecKey_VH.get(AVVideoCodecKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecKey_VH.set(AVVideoCodecKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeHEVC typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeHEVC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeHEVC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeHEVC").orElseThrow().reinterpret(AVVideoCodecTypeHEVC_LAYOUT.byteSize()) }
private val AVVideoCodecTypeHEVC_VH: VarHandle by lazy { AVVideoCodecTypeHEVC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCodecTypeHEVC: MemorySegment
    get() = AVVideoCodecTypeHEVC_VH.get(AVVideoCodecTypeHEVC_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeHEVC_VH.set(AVVideoCodecTypeHEVC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeH264 typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeH264_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeH264_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeH264").orElseThrow().reinterpret(AVVideoCodecTypeH264_LAYOUT.byteSize()) }
private val AVVideoCodecTypeH264_VH: VarHandle by lazy { AVVideoCodecTypeH264_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCodecTypeH264: MemorySegment
    get() = AVVideoCodecTypeH264_VH.get(AVVideoCodecTypeH264_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeH264_VH.set(AVVideoCodecTypeH264_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeJPEG typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeJPEG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeJPEG_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeJPEG").orElseThrow().reinterpret(AVVideoCodecTypeJPEG_LAYOUT.byteSize()) }
private val AVVideoCodecTypeJPEG_VH: VarHandle by lazy { AVVideoCodecTypeJPEG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCodecTypeJPEG: MemorySegment
    get() = AVVideoCodecTypeJPEG_VH.get(AVVideoCodecTypeJPEG_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeJPEG_VH.set(AVVideoCodecTypeJPEG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeJPEGXL typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeJPEGXL_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeJPEGXL_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeJPEGXL").orElseThrow().reinterpret(AVVideoCodecTypeJPEGXL_LAYOUT.byteSize()) }
private val AVVideoCodecTypeJPEGXL_VH: VarHandle by lazy { AVVideoCodecTypeJPEGXL_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCodecTypeJPEGXL: MemorySegment
    get() = AVVideoCodecTypeJPEGXL_VH.get(AVVideoCodecTypeJPEGXL_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeJPEGXL_VH.set(AVVideoCodecTypeJPEGXL_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProRes4444 typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProRes4444_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProRes4444_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProRes4444").orElseThrow().reinterpret(AVVideoCodecTypeAppleProRes4444_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProRes4444_VH: VarHandle by lazy { AVVideoCodecTypeAppleProRes4444_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProRes4444: MemorySegment
    get() = AVVideoCodecTypeAppleProRes4444_VH.get(AVVideoCodecTypeAppleProRes4444_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProRes4444_VH.set(AVVideoCodecTypeAppleProRes4444_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProRes4444XQ typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProRes4444XQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProRes4444XQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProRes4444XQ").orElseThrow().reinterpret(AVVideoCodecTypeAppleProRes4444XQ_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProRes4444XQ_VH: VarHandle by lazy { AVVideoCodecTypeAppleProRes4444XQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProRes4444XQ: MemorySegment
    get() = AVVideoCodecTypeAppleProRes4444XQ_VH.get(AVVideoCodecTypeAppleProRes4444XQ_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProRes4444XQ_VH.set(AVVideoCodecTypeAppleProRes4444XQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProRes422 typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProRes422_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProRes422_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProRes422").orElseThrow().reinterpret(AVVideoCodecTypeAppleProRes422_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProRes422_VH: VarHandle by lazy { AVVideoCodecTypeAppleProRes422_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProRes422: MemorySegment
    get() = AVVideoCodecTypeAppleProRes422_VH.get(AVVideoCodecTypeAppleProRes422_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProRes422_VH.set(AVVideoCodecTypeAppleProRes422_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProRes422HQ typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProRes422HQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProRes422HQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProRes422HQ").orElseThrow().reinterpret(AVVideoCodecTypeAppleProRes422HQ_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProRes422HQ_VH: VarHandle by lazy { AVVideoCodecTypeAppleProRes422HQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProRes422HQ: MemorySegment
    get() = AVVideoCodecTypeAppleProRes422HQ_VH.get(AVVideoCodecTypeAppleProRes422HQ_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProRes422HQ_VH.set(AVVideoCodecTypeAppleProRes422HQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProRes422LT typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProRes422LT_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProRes422LT_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProRes422LT").orElseThrow().reinterpret(AVVideoCodecTypeAppleProRes422LT_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProRes422LT_VH: VarHandle by lazy { AVVideoCodecTypeAppleProRes422LT_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProRes422LT: MemorySegment
    get() = AVVideoCodecTypeAppleProRes422LT_VH.get(AVVideoCodecTypeAppleProRes422LT_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProRes422LT_VH.set(AVVideoCodecTypeAppleProRes422LT_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProRes422Proxy typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProRes422Proxy_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProRes422Proxy_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProRes422Proxy").orElseThrow().reinterpret(AVVideoCodecTypeAppleProRes422Proxy_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProRes422Proxy_VH: VarHandle by lazy { AVVideoCodecTypeAppleProRes422Proxy_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProRes422Proxy: MemorySegment
    get() = AVVideoCodecTypeAppleProRes422Proxy_VH.get(AVVideoCodecTypeAppleProRes422Proxy_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProRes422Proxy_VH.set(AVVideoCodecTypeAppleProRes422Proxy_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProResRAW typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProResRAW_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProResRAW_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProResRAW").orElseThrow().reinterpret(AVVideoCodecTypeAppleProResRAW_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProResRAW_VH: VarHandle by lazy { AVVideoCodecTypeAppleProResRAW_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProResRAW: MemorySegment
    get() = AVVideoCodecTypeAppleProResRAW_VH.get(AVVideoCodecTypeAppleProResRAW_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProResRAW_VH.set(AVVideoCodecTypeAppleProResRAW_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeAppleProResRAWHQ typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeAppleProResRAWHQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeAppleProResRAWHQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeAppleProResRAWHQ").orElseThrow().reinterpret(AVVideoCodecTypeAppleProResRAWHQ_LAYOUT.byteSize()) }
private val AVVideoCodecTypeAppleProResRAWHQ_VH: VarHandle by lazy { AVVideoCodecTypeAppleProResRAWHQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecTypeAppleProResRAWHQ: MemorySegment
    get() = AVVideoCodecTypeAppleProResRAWHQ_VH.get(AVVideoCodecTypeAppleProResRAWHQ_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeAppleProResRAWHQ_VH.set(AVVideoCodecTypeAppleProResRAWHQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecTypeHEVCWithAlpha typedef const __strong AVVideoCodecType = (Void)*
 */
private val AVVideoCodecTypeHEVCWithAlpha_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecTypeHEVCWithAlpha_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecTypeHEVCWithAlpha").orElseThrow().reinterpret(AVVideoCodecTypeHEVCWithAlpha_LAYOUT.byteSize()) }
private val AVVideoCodecTypeHEVCWithAlpha_VH: VarHandle by lazy { AVVideoCodecTypeHEVCWithAlpha_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCodecTypeHEVCWithAlpha: MemorySegment
    get() = AVVideoCodecTypeHEVCWithAlpha_VH.get(AVVideoCodecTypeHEVCWithAlpha_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecTypeHEVCWithAlpha_VH.set(AVVideoCodecTypeHEVCWithAlpha_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecHEVC (Void)*
 */
private val AVVideoCodecHEVC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecHEVC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecHEVC").orElseThrow().reinterpret(AVVideoCodecHEVC_LAYOUT.byteSize()) }
private val AVVideoCodecHEVC_VH: VarHandle by lazy { AVVideoCodecHEVC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecHEVC: MemorySegment
    get() = AVVideoCodecHEVC_VH.get(AVVideoCodecHEVC_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecHEVC_VH.set(AVVideoCodecHEVC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecH264 (Void)*
 */
private val AVVideoCodecH264_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecH264_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecH264").orElseThrow().reinterpret(AVVideoCodecH264_LAYOUT.byteSize()) }
private val AVVideoCodecH264_VH: VarHandle by lazy { AVVideoCodecH264_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecH264: MemorySegment
    get() = AVVideoCodecH264_VH.get(AVVideoCodecH264_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecH264_VH.set(AVVideoCodecH264_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecJPEG (Void)*
 */
private val AVVideoCodecJPEG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecJPEG_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecJPEG").orElseThrow().reinterpret(AVVideoCodecJPEG_LAYOUT.byteSize()) }
private val AVVideoCodecJPEG_VH: VarHandle by lazy { AVVideoCodecJPEG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecJPEG: MemorySegment
    get() = AVVideoCodecJPEG_VH.get(AVVideoCodecJPEG_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecJPEG_VH.set(AVVideoCodecJPEG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecAppleProRes4444 (Void)*
 */
private val AVVideoCodecAppleProRes4444_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecAppleProRes4444_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecAppleProRes4444").orElseThrow().reinterpret(AVVideoCodecAppleProRes4444_LAYOUT.byteSize()) }
private val AVVideoCodecAppleProRes4444_VH: VarHandle by lazy { AVVideoCodecAppleProRes4444_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecAppleProRes4444: MemorySegment
    get() = AVVideoCodecAppleProRes4444_VH.get(AVVideoCodecAppleProRes4444_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecAppleProRes4444_VH.set(AVVideoCodecAppleProRes4444_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCodecAppleProRes422 (Void)*
 */
private val AVVideoCodecAppleProRes422_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCodecAppleProRes422_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCodecAppleProRes422").orElseThrow().reinterpret(AVVideoCodecAppleProRes422_LAYOUT.byteSize()) }
private val AVVideoCodecAppleProRes422_VH: VarHandle by lazy { AVVideoCodecAppleProRes422_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoCodecAppleProRes422: MemorySegment
    get() = AVVideoCodecAppleProRes422_VH.get(AVVideoCodecAppleProRes422_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCodecAppleProRes422_VH.set(AVVideoCodecAppleProRes422_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoWidthKey (Void)*
 */
private val AVVideoWidthKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoWidthKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoWidthKey").orElseThrow().reinterpret(AVVideoWidthKey_LAYOUT.byteSize()) }
private val AVVideoWidthKey_VH: VarHandle by lazy { AVVideoWidthKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoWidthKey: MemorySegment
    get() = AVVideoWidthKey_VH.get(AVVideoWidthKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoWidthKey_VH.set(AVVideoWidthKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoHeightKey (Void)*
 */
private val AVVideoHeightKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoHeightKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoHeightKey").orElseThrow().reinterpret(AVVideoHeightKey_LAYOUT.byteSize()) }
private val AVVideoHeightKey_VH: VarHandle by lazy { AVVideoHeightKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoHeightKey: MemorySegment
    get() = AVVideoHeightKey_VH.get(AVVideoHeightKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoHeightKey_VH.set(AVVideoHeightKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoPixelAspectRatioKey (Void)*
 */
private val AVVideoPixelAspectRatioKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoPixelAspectRatioKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoPixelAspectRatioKey").orElseThrow().reinterpret(AVVideoPixelAspectRatioKey_LAYOUT.byteSize()) }
private val AVVideoPixelAspectRatioKey_VH: VarHandle by lazy { AVVideoPixelAspectRatioKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoPixelAspectRatioKey: MemorySegment
    get() = AVVideoPixelAspectRatioKey_VH.get(AVVideoPixelAspectRatioKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoPixelAspectRatioKey_VH.set(AVVideoPixelAspectRatioKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoPixelAspectRatioHorizontalSpacingKey (Void)*
 */
private val AVVideoPixelAspectRatioHorizontalSpacingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoPixelAspectRatioHorizontalSpacingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoPixelAspectRatioHorizontalSpacingKey").orElseThrow().reinterpret(AVVideoPixelAspectRatioHorizontalSpacingKey_LAYOUT.byteSize()) }
private val AVVideoPixelAspectRatioHorizontalSpacingKey_VH: VarHandle by lazy { AVVideoPixelAspectRatioHorizontalSpacingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoPixelAspectRatioHorizontalSpacingKey: MemorySegment
    get() = AVVideoPixelAspectRatioHorizontalSpacingKey_VH.get(AVVideoPixelAspectRatioHorizontalSpacingKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoPixelAspectRatioHorizontalSpacingKey_VH.set(AVVideoPixelAspectRatioHorizontalSpacingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoPixelAspectRatioVerticalSpacingKey (Void)*
 */
private val AVVideoPixelAspectRatioVerticalSpacingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoPixelAspectRatioVerticalSpacingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoPixelAspectRatioVerticalSpacingKey").orElseThrow().reinterpret(AVVideoPixelAspectRatioVerticalSpacingKey_LAYOUT.byteSize()) }
private val AVVideoPixelAspectRatioVerticalSpacingKey_VH: VarHandle by lazy { AVVideoPixelAspectRatioVerticalSpacingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoPixelAspectRatioVerticalSpacingKey: MemorySegment
    get() = AVVideoPixelAspectRatioVerticalSpacingKey_VH.get(AVVideoPixelAspectRatioVerticalSpacingKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoPixelAspectRatioVerticalSpacingKey_VH.set(AVVideoPixelAspectRatioVerticalSpacingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCleanApertureKey (Void)*
 */
private val AVVideoCleanApertureKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCleanApertureKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCleanApertureKey").orElseThrow().reinterpret(AVVideoCleanApertureKey_LAYOUT.byteSize()) }
private val AVVideoCleanApertureKey_VH: VarHandle by lazy { AVVideoCleanApertureKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCleanApertureKey: MemorySegment
    get() = AVVideoCleanApertureKey_VH.get(AVVideoCleanApertureKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCleanApertureKey_VH.set(AVVideoCleanApertureKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCleanApertureWidthKey (Void)*
 */
private val AVVideoCleanApertureWidthKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCleanApertureWidthKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCleanApertureWidthKey").orElseThrow().reinterpret(AVVideoCleanApertureWidthKey_LAYOUT.byteSize()) }
private val AVVideoCleanApertureWidthKey_VH: VarHandle by lazy { AVVideoCleanApertureWidthKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCleanApertureWidthKey: MemorySegment
    get() = AVVideoCleanApertureWidthKey_VH.get(AVVideoCleanApertureWidthKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCleanApertureWidthKey_VH.set(AVVideoCleanApertureWidthKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCleanApertureHeightKey (Void)*
 */
private val AVVideoCleanApertureHeightKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCleanApertureHeightKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCleanApertureHeightKey").orElseThrow().reinterpret(AVVideoCleanApertureHeightKey_LAYOUT.byteSize()) }
private val AVVideoCleanApertureHeightKey_VH: VarHandle by lazy { AVVideoCleanApertureHeightKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCleanApertureHeightKey: MemorySegment
    get() = AVVideoCleanApertureHeightKey_VH.get(AVVideoCleanApertureHeightKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCleanApertureHeightKey_VH.set(AVVideoCleanApertureHeightKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCleanApertureHorizontalOffsetKey (Void)*
 */
private val AVVideoCleanApertureHorizontalOffsetKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCleanApertureHorizontalOffsetKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCleanApertureHorizontalOffsetKey").orElseThrow().reinterpret(AVVideoCleanApertureHorizontalOffsetKey_LAYOUT.byteSize()) }
private val AVVideoCleanApertureHorizontalOffsetKey_VH: VarHandle by lazy { AVVideoCleanApertureHorizontalOffsetKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCleanApertureHorizontalOffsetKey: MemorySegment
    get() = AVVideoCleanApertureHorizontalOffsetKey_VH.get(AVVideoCleanApertureHorizontalOffsetKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCleanApertureHorizontalOffsetKey_VH.set(AVVideoCleanApertureHorizontalOffsetKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCleanApertureVerticalOffsetKey (Void)*
 */
private val AVVideoCleanApertureVerticalOffsetKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCleanApertureVerticalOffsetKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCleanApertureVerticalOffsetKey").orElseThrow().reinterpret(AVVideoCleanApertureVerticalOffsetKey_LAYOUT.byteSize()) }
private val AVVideoCleanApertureVerticalOffsetKey_VH: VarHandle by lazy { AVVideoCleanApertureVerticalOffsetKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCleanApertureVerticalOffsetKey: MemorySegment
    get() = AVVideoCleanApertureVerticalOffsetKey_VH.get(AVVideoCleanApertureVerticalOffsetKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCleanApertureVerticalOffsetKey_VH.set(AVVideoCleanApertureVerticalOffsetKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoScalingModeKey (Void)*
 */
private val AVVideoScalingModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoScalingModeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoScalingModeKey").orElseThrow().reinterpret(AVVideoScalingModeKey_LAYOUT.byteSize()) }
private val AVVideoScalingModeKey_VH: VarHandle by lazy { AVVideoScalingModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoScalingModeKey: MemorySegment
    get() = AVVideoScalingModeKey_VH.get(AVVideoScalingModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoScalingModeKey_VH.set(AVVideoScalingModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoScalingModeFit (Void)*
 */
private val AVVideoScalingModeFit_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoScalingModeFit_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoScalingModeFit").orElseThrow().reinterpret(AVVideoScalingModeFit_LAYOUT.byteSize()) }
private val AVVideoScalingModeFit_VH: VarHandle by lazy { AVVideoScalingModeFit_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoScalingModeFit: MemorySegment
    get() = AVVideoScalingModeFit_VH.get(AVVideoScalingModeFit_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoScalingModeFit_VH.set(AVVideoScalingModeFit_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoScalingModeResize (Void)*
 */
private val AVVideoScalingModeResize_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoScalingModeResize_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoScalingModeResize").orElseThrow().reinterpret(AVVideoScalingModeResize_LAYOUT.byteSize()) }
private val AVVideoScalingModeResize_VH: VarHandle by lazy { AVVideoScalingModeResize_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoScalingModeResize: MemorySegment
    get() = AVVideoScalingModeResize_VH.get(AVVideoScalingModeResize_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoScalingModeResize_VH.set(AVVideoScalingModeResize_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoScalingModeResizeAspect (Void)*
 */
private val AVVideoScalingModeResizeAspect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoScalingModeResizeAspect_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoScalingModeResizeAspect").orElseThrow().reinterpret(AVVideoScalingModeResizeAspect_LAYOUT.byteSize()) }
private val AVVideoScalingModeResizeAspect_VH: VarHandle by lazy { AVVideoScalingModeResizeAspect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoScalingModeResizeAspect: MemorySegment
    get() = AVVideoScalingModeResizeAspect_VH.get(AVVideoScalingModeResizeAspect_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoScalingModeResizeAspect_VH.set(AVVideoScalingModeResizeAspect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoScalingModeResizeAspectFill (Void)*
 */
private val AVVideoScalingModeResizeAspectFill_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoScalingModeResizeAspectFill_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoScalingModeResizeAspectFill").orElseThrow().reinterpret(AVVideoScalingModeResizeAspectFill_LAYOUT.byteSize()) }
private val AVVideoScalingModeResizeAspectFill_VH: VarHandle by lazy { AVVideoScalingModeResizeAspectFill_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoScalingModeResizeAspectFill: MemorySegment
    get() = AVVideoScalingModeResizeAspectFill_VH.get(AVVideoScalingModeResizeAspectFill_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoScalingModeResizeAspectFill_VH.set(AVVideoScalingModeResizeAspectFill_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPropertiesKey (Void)*
 */
private val AVVideoColorPropertiesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPropertiesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPropertiesKey").orElseThrow().reinterpret(AVVideoColorPropertiesKey_LAYOUT.byteSize()) }
private val AVVideoColorPropertiesKey_VH: VarHandle by lazy { AVVideoColorPropertiesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoColorPropertiesKey: MemorySegment
    get() = AVVideoColorPropertiesKey_VH.get(AVVideoColorPropertiesKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPropertiesKey_VH.set(AVVideoColorPropertiesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPrimariesKey (Void)*
 */
private val AVVideoColorPrimariesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPrimariesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPrimariesKey").orElseThrow().reinterpret(AVVideoColorPrimariesKey_LAYOUT.byteSize()) }
private val AVVideoColorPrimariesKey_VH: VarHandle by lazy { AVVideoColorPrimariesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoColorPrimariesKey: MemorySegment
    get() = AVVideoColorPrimariesKey_VH.get(AVVideoColorPrimariesKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPrimariesKey_VH.set(AVVideoColorPrimariesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPrimaries_ITU_R_709_2 (Void)*
 */
private val AVVideoColorPrimaries_ITU_R_709_2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPrimaries_ITU_R_709_2_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPrimaries_ITU_R_709_2").orElseThrow().reinterpret(AVVideoColorPrimaries_ITU_R_709_2_LAYOUT.byteSize()) }
private val AVVideoColorPrimaries_ITU_R_709_2_VH: VarHandle by lazy { AVVideoColorPrimaries_ITU_R_709_2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoColorPrimaries_ITU_R_709_2: MemorySegment
    get() = AVVideoColorPrimaries_ITU_R_709_2_VH.get(AVVideoColorPrimaries_ITU_R_709_2_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPrimaries_ITU_R_709_2_VH.set(AVVideoColorPrimaries_ITU_R_709_2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPrimaries_EBU_3213 (Void)*
 */
private val AVVideoColorPrimaries_EBU_3213_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPrimaries_EBU_3213_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPrimaries_EBU_3213").orElseThrow().reinterpret(AVVideoColorPrimaries_EBU_3213_LAYOUT.byteSize()) }
private val AVVideoColorPrimaries_EBU_3213_VH: VarHandle by lazy { AVVideoColorPrimaries_EBU_3213_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoColorPrimaries_EBU_3213: MemorySegment
    get() = AVVideoColorPrimaries_EBU_3213_VH.get(AVVideoColorPrimaries_EBU_3213_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPrimaries_EBU_3213_VH.set(AVVideoColorPrimaries_EBU_3213_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPrimaries_SMPTE_C (Void)*
 */
private val AVVideoColorPrimaries_SMPTE_C_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPrimaries_SMPTE_C_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPrimaries_SMPTE_C").orElseThrow().reinterpret(AVVideoColorPrimaries_SMPTE_C_LAYOUT.byteSize()) }
private val AVVideoColorPrimaries_SMPTE_C_VH: VarHandle by lazy { AVVideoColorPrimaries_SMPTE_C_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoColorPrimaries_SMPTE_C: MemorySegment
    get() = AVVideoColorPrimaries_SMPTE_C_VH.get(AVVideoColorPrimaries_SMPTE_C_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPrimaries_SMPTE_C_VH.set(AVVideoColorPrimaries_SMPTE_C_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPrimaries_P3_D65 (Void)*
 */
private val AVVideoColorPrimaries_P3_D65_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPrimaries_P3_D65_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPrimaries_P3_D65").orElseThrow().reinterpret(AVVideoColorPrimaries_P3_D65_LAYOUT.byteSize()) }
private val AVVideoColorPrimaries_P3_D65_VH: VarHandle by lazy { AVVideoColorPrimaries_P3_D65_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoColorPrimaries_P3_D65: MemorySegment
    get() = AVVideoColorPrimaries_P3_D65_VH.get(AVVideoColorPrimaries_P3_D65_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPrimaries_P3_D65_VH.set(AVVideoColorPrimaries_P3_D65_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoColorPrimaries_ITU_R_2020 (Void)*
 */
private val AVVideoColorPrimaries_ITU_R_2020_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoColorPrimaries_ITU_R_2020_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoColorPrimaries_ITU_R_2020").orElseThrow().reinterpret(AVVideoColorPrimaries_ITU_R_2020_LAYOUT.byteSize()) }
private val AVVideoColorPrimaries_ITU_R_2020_VH: VarHandle by lazy { AVVideoColorPrimaries_ITU_R_2020_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoColorPrimaries_ITU_R_2020: MemorySegment
    get() = AVVideoColorPrimaries_ITU_R_2020_VH.get(AVVideoColorPrimaries_ITU_R_2020_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoColorPrimaries_ITU_R_2020_VH.set(AVVideoColorPrimaries_ITU_R_2020_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunctionKey (Void)*
 */
private val AVVideoTransferFunctionKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunctionKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunctionKey").orElseThrow().reinterpret(AVVideoTransferFunctionKey_LAYOUT.byteSize()) }
private val AVVideoTransferFunctionKey_VH: VarHandle by lazy { AVVideoTransferFunctionKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoTransferFunctionKey: MemorySegment
    get() = AVVideoTransferFunctionKey_VH.get(AVVideoTransferFunctionKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunctionKey_VH.set(AVVideoTransferFunctionKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunction_ITU_R_709_2 (Void)*
 */
private val AVVideoTransferFunction_ITU_R_709_2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunction_ITU_R_709_2_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunction_ITU_R_709_2").orElseThrow().reinterpret(AVVideoTransferFunction_ITU_R_709_2_LAYOUT.byteSize()) }
private val AVVideoTransferFunction_ITU_R_709_2_VH: VarHandle by lazy { AVVideoTransferFunction_ITU_R_709_2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoTransferFunction_ITU_R_709_2: MemorySegment
    get() = AVVideoTransferFunction_ITU_R_709_2_VH.get(AVVideoTransferFunction_ITU_R_709_2_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunction_ITU_R_709_2_VH.set(AVVideoTransferFunction_ITU_R_709_2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunction_SMPTE_240M_1995 (Void)*
 */
private val AVVideoTransferFunction_SMPTE_240M_1995_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunction_SMPTE_240M_1995_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunction_SMPTE_240M_1995").orElseThrow().reinterpret(AVVideoTransferFunction_SMPTE_240M_1995_LAYOUT.byteSize()) }
private val AVVideoTransferFunction_SMPTE_240M_1995_VH: VarHandle by lazy { AVVideoTransferFunction_SMPTE_240M_1995_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoTransferFunction_SMPTE_240M_1995: MemorySegment
    get() = AVVideoTransferFunction_SMPTE_240M_1995_VH.get(AVVideoTransferFunction_SMPTE_240M_1995_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunction_SMPTE_240M_1995_VH.set(AVVideoTransferFunction_SMPTE_240M_1995_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunction_SMPTE_ST_2084_PQ (Void)*
 */
private val AVVideoTransferFunction_SMPTE_ST_2084_PQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunction_SMPTE_ST_2084_PQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunction_SMPTE_ST_2084_PQ").orElseThrow().reinterpret(AVVideoTransferFunction_SMPTE_ST_2084_PQ_LAYOUT.byteSize()) }
private val AVVideoTransferFunction_SMPTE_ST_2084_PQ_VH: VarHandle by lazy { AVVideoTransferFunction_SMPTE_ST_2084_PQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoTransferFunction_SMPTE_ST_2084_PQ: MemorySegment
    get() = AVVideoTransferFunction_SMPTE_ST_2084_PQ_VH.get(AVVideoTransferFunction_SMPTE_ST_2084_PQ_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunction_SMPTE_ST_2084_PQ_VH.set(AVVideoTransferFunction_SMPTE_ST_2084_PQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunction_ITU_R_2100_HLG (Void)*
 */
private val AVVideoTransferFunction_ITU_R_2100_HLG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunction_ITU_R_2100_HLG_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunction_ITU_R_2100_HLG").orElseThrow().reinterpret(AVVideoTransferFunction_ITU_R_2100_HLG_LAYOUT.byteSize()) }
private val AVVideoTransferFunction_ITU_R_2100_HLG_VH: VarHandle by lazy { AVVideoTransferFunction_ITU_R_2100_HLG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoTransferFunction_ITU_R_2100_HLG: MemorySegment
    get() = AVVideoTransferFunction_ITU_R_2100_HLG_VH.get(AVVideoTransferFunction_ITU_R_2100_HLG_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunction_ITU_R_2100_HLG_VH.set(AVVideoTransferFunction_ITU_R_2100_HLG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunction_Linear (Void)*
 */
private val AVVideoTransferFunction_Linear_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunction_Linear_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunction_Linear").orElseThrow().reinterpret(AVVideoTransferFunction_Linear_LAYOUT.byteSize()) }
private val AVVideoTransferFunction_Linear_VH: VarHandle by lazy { AVVideoTransferFunction_Linear_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoTransferFunction_Linear: MemorySegment
    get() = AVVideoTransferFunction_Linear_VH.get(AVVideoTransferFunction_Linear_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunction_Linear_VH.set(AVVideoTransferFunction_Linear_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoTransferFunction_IEC_sRGB (Void)*
 */
private val AVVideoTransferFunction_IEC_sRGB_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoTransferFunction_IEC_sRGB_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoTransferFunction_IEC_sRGB").orElseThrow().reinterpret(AVVideoTransferFunction_IEC_sRGB_LAYOUT.byteSize()) }
private val AVVideoTransferFunction_IEC_sRGB_VH: VarHandle by lazy { AVVideoTransferFunction_IEC_sRGB_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
var AVVideoTransferFunction_IEC_sRGB: MemorySegment
    get() = AVVideoTransferFunction_IEC_sRGB_VH.get(AVVideoTransferFunction_IEC_sRGB_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoTransferFunction_IEC_sRGB_VH.set(AVVideoTransferFunction_IEC_sRGB_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoYCbCrMatrixKey (Void)*
 */
private val AVVideoYCbCrMatrixKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoYCbCrMatrixKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoYCbCrMatrixKey").orElseThrow().reinterpret(AVVideoYCbCrMatrixKey_LAYOUT.byteSize()) }
private val AVVideoYCbCrMatrixKey_VH: VarHandle by lazy { AVVideoYCbCrMatrixKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoYCbCrMatrixKey: MemorySegment
    get() = AVVideoYCbCrMatrixKey_VH.get(AVVideoYCbCrMatrixKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoYCbCrMatrixKey_VH.set(AVVideoYCbCrMatrixKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoYCbCrMatrix_ITU_R_709_2 (Void)*
 */
private val AVVideoYCbCrMatrix_ITU_R_709_2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoYCbCrMatrix_ITU_R_709_2_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoYCbCrMatrix_ITU_R_709_2").orElseThrow().reinterpret(AVVideoYCbCrMatrix_ITU_R_709_2_LAYOUT.byteSize()) }
private val AVVideoYCbCrMatrix_ITU_R_709_2_VH: VarHandle by lazy { AVVideoYCbCrMatrix_ITU_R_709_2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoYCbCrMatrix_ITU_R_709_2: MemorySegment
    get() = AVVideoYCbCrMatrix_ITU_R_709_2_VH.get(AVVideoYCbCrMatrix_ITU_R_709_2_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoYCbCrMatrix_ITU_R_709_2_VH.set(AVVideoYCbCrMatrix_ITU_R_709_2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoYCbCrMatrix_ITU_R_601_4 (Void)*
 */
private val AVVideoYCbCrMatrix_ITU_R_601_4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoYCbCrMatrix_ITU_R_601_4_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoYCbCrMatrix_ITU_R_601_4").orElseThrow().reinterpret(AVVideoYCbCrMatrix_ITU_R_601_4_LAYOUT.byteSize()) }
private val AVVideoYCbCrMatrix_ITU_R_601_4_VH: VarHandle by lazy { AVVideoYCbCrMatrix_ITU_R_601_4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoYCbCrMatrix_ITU_R_601_4: MemorySegment
    get() = AVVideoYCbCrMatrix_ITU_R_601_4_VH.get(AVVideoYCbCrMatrix_ITU_R_601_4_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoYCbCrMatrix_ITU_R_601_4_VH.set(AVVideoYCbCrMatrix_ITU_R_601_4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoYCbCrMatrix_SMPTE_240M_1995 (Void)*
 */
private val AVVideoYCbCrMatrix_SMPTE_240M_1995_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoYCbCrMatrix_SMPTE_240M_1995_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoYCbCrMatrix_SMPTE_240M_1995").orElseThrow().reinterpret(AVVideoYCbCrMatrix_SMPTE_240M_1995_LAYOUT.byteSize()) }
private val AVVideoYCbCrMatrix_SMPTE_240M_1995_VH: VarHandle by lazy { AVVideoYCbCrMatrix_SMPTE_240M_1995_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoYCbCrMatrix_SMPTE_240M_1995: MemorySegment
    get() = AVVideoYCbCrMatrix_SMPTE_240M_1995_VH.get(AVVideoYCbCrMatrix_SMPTE_240M_1995_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoYCbCrMatrix_SMPTE_240M_1995_VH.set(AVVideoYCbCrMatrix_SMPTE_240M_1995_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoYCbCrMatrix_ITU_R_2020 (Void)*
 */
private val AVVideoYCbCrMatrix_ITU_R_2020_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoYCbCrMatrix_ITU_R_2020_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoYCbCrMatrix_ITU_R_2020").orElseThrow().reinterpret(AVVideoYCbCrMatrix_ITU_R_2020_LAYOUT.byteSize()) }
private val AVVideoYCbCrMatrix_ITU_R_2020_VH: VarHandle by lazy { AVVideoYCbCrMatrix_ITU_R_2020_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoYCbCrMatrix_ITU_R_2020: MemorySegment
    get() = AVVideoYCbCrMatrix_ITU_R_2020_VH.get(AVVideoYCbCrMatrix_ITU_R_2020_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoYCbCrMatrix_ITU_R_2020_VH.set(AVVideoYCbCrMatrix_ITU_R_2020_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoAllowWideColorKey (Void)*
 */
private val AVVideoAllowWideColorKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoAllowWideColorKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoAllowWideColorKey").orElseThrow().reinterpret(AVVideoAllowWideColorKey_LAYOUT.byteSize()) }
private val AVVideoAllowWideColorKey_VH: VarHandle by lazy { AVVideoAllowWideColorKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoAllowWideColorKey: MemorySegment
    get() = AVVideoAllowWideColorKey_VH.get(AVVideoAllowWideColorKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoAllowWideColorKey_VH.set(AVVideoAllowWideColorKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoCompressionPropertiesKey (Void)*
 */
private val AVVideoCompressionPropertiesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoCompressionPropertiesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoCompressionPropertiesKey").orElseThrow().reinterpret(AVVideoCompressionPropertiesKey_LAYOUT.byteSize()) }
private val AVVideoCompressionPropertiesKey_VH: VarHandle by lazy { AVVideoCompressionPropertiesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoCompressionPropertiesKey: MemorySegment
    get() = AVVideoCompressionPropertiesKey_VH.get(AVVideoCompressionPropertiesKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoCompressionPropertiesKey_VH.set(AVVideoCompressionPropertiesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoAverageBitRateKey (Void)*
 */
private val AVVideoAverageBitRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoAverageBitRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoAverageBitRateKey").orElseThrow().reinterpret(AVVideoAverageBitRateKey_LAYOUT.byteSize()) }
private val AVVideoAverageBitRateKey_VH: VarHandle by lazy { AVVideoAverageBitRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoAverageBitRateKey: MemorySegment
    get() = AVVideoAverageBitRateKey_VH.get(AVVideoAverageBitRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoAverageBitRateKey_VH.set(AVVideoAverageBitRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoQualityKey (Void)*
 */
private val AVVideoQualityKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoQualityKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoQualityKey").orElseThrow().reinterpret(AVVideoQualityKey_LAYOUT.byteSize()) }
private val AVVideoQualityKey_VH: VarHandle by lazy { AVVideoQualityKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoQualityKey: MemorySegment
    get() = AVVideoQualityKey_VH.get(AVVideoQualityKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoQualityKey_VH.set(AVVideoQualityKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoMaxKeyFrameIntervalKey (Void)*
 */
private val AVVideoMaxKeyFrameIntervalKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoMaxKeyFrameIntervalKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoMaxKeyFrameIntervalKey").orElseThrow().reinterpret(AVVideoMaxKeyFrameIntervalKey_LAYOUT.byteSize()) }
private val AVVideoMaxKeyFrameIntervalKey_VH: VarHandle by lazy { AVVideoMaxKeyFrameIntervalKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoMaxKeyFrameIntervalKey: MemorySegment
    get() = AVVideoMaxKeyFrameIntervalKey_VH.get(AVVideoMaxKeyFrameIntervalKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoMaxKeyFrameIntervalKey_VH.set(AVVideoMaxKeyFrameIntervalKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoMaxKeyFrameIntervalDurationKey (Void)*
 */
private val AVVideoMaxKeyFrameIntervalDurationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoMaxKeyFrameIntervalDurationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoMaxKeyFrameIntervalDurationKey").orElseThrow().reinterpret(AVVideoMaxKeyFrameIntervalDurationKey_LAYOUT.byteSize()) }
private val AVVideoMaxKeyFrameIntervalDurationKey_VH: VarHandle by lazy { AVVideoMaxKeyFrameIntervalDurationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoMaxKeyFrameIntervalDurationKey: MemorySegment
    get() = AVVideoMaxKeyFrameIntervalDurationKey_VH.get(AVVideoMaxKeyFrameIntervalDurationKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoMaxKeyFrameIntervalDurationKey_VH.set(AVVideoMaxKeyFrameIntervalDurationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoAppleProRAWBitDepthKey (Void)*
 */
private val AVVideoAppleProRAWBitDepthKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoAppleProRAWBitDepthKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoAppleProRAWBitDepthKey").orElseThrow().reinterpret(AVVideoAppleProRAWBitDepthKey_LAYOUT.byteSize()) }
private val AVVideoAppleProRAWBitDepthKey_VH: VarHandle by lazy { AVVideoAppleProRAWBitDepthKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoAppleProRAWBitDepthKey: MemorySegment
    get() = AVVideoAppleProRAWBitDepthKey_VH.get(AVVideoAppleProRAWBitDepthKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoAppleProRAWBitDepthKey_VH.set(AVVideoAppleProRAWBitDepthKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoAllowFrameReorderingKey (Void)*
 */
private val AVVideoAllowFrameReorderingKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoAllowFrameReorderingKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoAllowFrameReorderingKey").orElseThrow().reinterpret(AVVideoAllowFrameReorderingKey_LAYOUT.byteSize()) }
private val AVVideoAllowFrameReorderingKey_VH: VarHandle by lazy { AVVideoAllowFrameReorderingKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoAllowFrameReorderingKey: MemorySegment
    get() = AVVideoAllowFrameReorderingKey_VH.get(AVVideoAllowFrameReorderingKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoAllowFrameReorderingKey_VH.set(AVVideoAllowFrameReorderingKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelKey (Void)*
 */
private val AVVideoProfileLevelKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelKey").orElseThrow().reinterpret(AVVideoProfileLevelKey_LAYOUT.byteSize()) }
private val AVVideoProfileLevelKey_VH: VarHandle by lazy { AVVideoProfileLevelKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelKey: MemorySegment
    get() = AVVideoProfileLevelKey_VH.get(AVVideoProfileLevelKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelKey_VH.set(AVVideoProfileLevelKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Baseline30 (Void)*
 */
private val AVVideoProfileLevelH264Baseline30_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Baseline30_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Baseline30").orElseThrow().reinterpret(AVVideoProfileLevelH264Baseline30_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Baseline30_VH: VarHandle by lazy { AVVideoProfileLevelH264Baseline30_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Baseline30: MemorySegment
    get() = AVVideoProfileLevelH264Baseline30_VH.get(AVVideoProfileLevelH264Baseline30_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Baseline30_VH.set(AVVideoProfileLevelH264Baseline30_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Baseline31 (Void)*
 */
private val AVVideoProfileLevelH264Baseline31_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Baseline31_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Baseline31").orElseThrow().reinterpret(AVVideoProfileLevelH264Baseline31_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Baseline31_VH: VarHandle by lazy { AVVideoProfileLevelH264Baseline31_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Baseline31: MemorySegment
    get() = AVVideoProfileLevelH264Baseline31_VH.get(AVVideoProfileLevelH264Baseline31_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Baseline31_VH.set(AVVideoProfileLevelH264Baseline31_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Baseline41 (Void)*
 */
private val AVVideoProfileLevelH264Baseline41_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Baseline41_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Baseline41").orElseThrow().reinterpret(AVVideoProfileLevelH264Baseline41_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Baseline41_VH: VarHandle by lazy { AVVideoProfileLevelH264Baseline41_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Baseline41: MemorySegment
    get() = AVVideoProfileLevelH264Baseline41_VH.get(AVVideoProfileLevelH264Baseline41_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Baseline41_VH.set(AVVideoProfileLevelH264Baseline41_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264BaselineAutoLevel (Void)*
 */
private val AVVideoProfileLevelH264BaselineAutoLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264BaselineAutoLevel_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264BaselineAutoLevel").orElseThrow().reinterpret(AVVideoProfileLevelH264BaselineAutoLevel_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264BaselineAutoLevel_VH: VarHandle by lazy { AVVideoProfileLevelH264BaselineAutoLevel_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264BaselineAutoLevel: MemorySegment
    get() = AVVideoProfileLevelH264BaselineAutoLevel_VH.get(AVVideoProfileLevelH264BaselineAutoLevel_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264BaselineAutoLevel_VH.set(AVVideoProfileLevelH264BaselineAutoLevel_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Main30 (Void)*
 */
private val AVVideoProfileLevelH264Main30_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Main30_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Main30").orElseThrow().reinterpret(AVVideoProfileLevelH264Main30_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Main30_VH: VarHandle by lazy { AVVideoProfileLevelH264Main30_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Main30: MemorySegment
    get() = AVVideoProfileLevelH264Main30_VH.get(AVVideoProfileLevelH264Main30_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Main30_VH.set(AVVideoProfileLevelH264Main30_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Main31 (Void)*
 */
private val AVVideoProfileLevelH264Main31_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Main31_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Main31").orElseThrow().reinterpret(AVVideoProfileLevelH264Main31_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Main31_VH: VarHandle by lazy { AVVideoProfileLevelH264Main31_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Main31: MemorySegment
    get() = AVVideoProfileLevelH264Main31_VH.get(AVVideoProfileLevelH264Main31_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Main31_VH.set(AVVideoProfileLevelH264Main31_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Main32 (Void)*
 */
private val AVVideoProfileLevelH264Main32_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Main32_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Main32").orElseThrow().reinterpret(AVVideoProfileLevelH264Main32_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Main32_VH: VarHandle by lazy { AVVideoProfileLevelH264Main32_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Main32: MemorySegment
    get() = AVVideoProfileLevelH264Main32_VH.get(AVVideoProfileLevelH264Main32_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Main32_VH.set(AVVideoProfileLevelH264Main32_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264Main41 (Void)*
 */
private val AVVideoProfileLevelH264Main41_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264Main41_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264Main41").orElseThrow().reinterpret(AVVideoProfileLevelH264Main41_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264Main41_VH: VarHandle by lazy { AVVideoProfileLevelH264Main41_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264Main41: MemorySegment
    get() = AVVideoProfileLevelH264Main41_VH.get(AVVideoProfileLevelH264Main41_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264Main41_VH.set(AVVideoProfileLevelH264Main41_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264MainAutoLevel (Void)*
 */
private val AVVideoProfileLevelH264MainAutoLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264MainAutoLevel_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264MainAutoLevel").orElseThrow().reinterpret(AVVideoProfileLevelH264MainAutoLevel_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264MainAutoLevel_VH: VarHandle by lazy { AVVideoProfileLevelH264MainAutoLevel_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264MainAutoLevel: MemorySegment
    get() = AVVideoProfileLevelH264MainAutoLevel_VH.get(AVVideoProfileLevelH264MainAutoLevel_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264MainAutoLevel_VH.set(AVVideoProfileLevelH264MainAutoLevel_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264High40 (Void)*
 */
private val AVVideoProfileLevelH264High40_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264High40_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264High40").orElseThrow().reinterpret(AVVideoProfileLevelH264High40_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264High40_VH: VarHandle by lazy { AVVideoProfileLevelH264High40_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264High40: MemorySegment
    get() = AVVideoProfileLevelH264High40_VH.get(AVVideoProfileLevelH264High40_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264High40_VH.set(AVVideoProfileLevelH264High40_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264High41 (Void)*
 */
private val AVVideoProfileLevelH264High41_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264High41_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264High41").orElseThrow().reinterpret(AVVideoProfileLevelH264High41_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264High41_VH: VarHandle by lazy { AVVideoProfileLevelH264High41_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264High41: MemorySegment
    get() = AVVideoProfileLevelH264High41_VH.get(AVVideoProfileLevelH264High41_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264High41_VH.set(AVVideoProfileLevelH264High41_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoProfileLevelH264HighAutoLevel (Void)*
 */
private val AVVideoProfileLevelH264HighAutoLevel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoProfileLevelH264HighAutoLevel_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoProfileLevelH264HighAutoLevel").orElseThrow().reinterpret(AVVideoProfileLevelH264HighAutoLevel_LAYOUT.byteSize()) }
private val AVVideoProfileLevelH264HighAutoLevel_VH: VarHandle by lazy { AVVideoProfileLevelH264HighAutoLevel_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoProfileLevelH264HighAutoLevel: MemorySegment
    get() = AVVideoProfileLevelH264HighAutoLevel_VH.get(AVVideoProfileLevelH264HighAutoLevel_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoProfileLevelH264HighAutoLevel_VH.set(AVVideoProfileLevelH264HighAutoLevel_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoH264EntropyModeKey (Void)*
 */
private val AVVideoH264EntropyModeKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoH264EntropyModeKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoH264EntropyModeKey").orElseThrow().reinterpret(AVVideoH264EntropyModeKey_LAYOUT.byteSize()) }
private val AVVideoH264EntropyModeKey_VH: VarHandle by lazy { AVVideoH264EntropyModeKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoH264EntropyModeKey: MemorySegment
    get() = AVVideoH264EntropyModeKey_VH.get(AVVideoH264EntropyModeKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoH264EntropyModeKey_VH.set(AVVideoH264EntropyModeKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoH264EntropyModeCAVLC (Void)*
 */
private val AVVideoH264EntropyModeCAVLC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoH264EntropyModeCAVLC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoH264EntropyModeCAVLC").orElseThrow().reinterpret(AVVideoH264EntropyModeCAVLC_LAYOUT.byteSize()) }
private val AVVideoH264EntropyModeCAVLC_VH: VarHandle by lazy { AVVideoH264EntropyModeCAVLC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoH264EntropyModeCAVLC: MemorySegment
    get() = AVVideoH264EntropyModeCAVLC_VH.get(AVVideoH264EntropyModeCAVLC_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoH264EntropyModeCAVLC_VH.set(AVVideoH264EntropyModeCAVLC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoH264EntropyModeCABAC (Void)*
 */
private val AVVideoH264EntropyModeCABAC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoH264EntropyModeCABAC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoH264EntropyModeCABAC").orElseThrow().reinterpret(AVVideoH264EntropyModeCABAC_LAYOUT.byteSize()) }
private val AVVideoH264EntropyModeCABAC_VH: VarHandle by lazy { AVVideoH264EntropyModeCABAC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoH264EntropyModeCABAC: MemorySegment
    get() = AVVideoH264EntropyModeCABAC_VH.get(AVVideoH264EntropyModeCABAC_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoH264EntropyModeCABAC_VH.set(AVVideoH264EntropyModeCABAC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoExpectedSourceFrameRateKey (Void)*
 */
private val AVVideoExpectedSourceFrameRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoExpectedSourceFrameRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoExpectedSourceFrameRateKey").orElseThrow().reinterpret(AVVideoExpectedSourceFrameRateKey_LAYOUT.byteSize()) }
private val AVVideoExpectedSourceFrameRateKey_VH: VarHandle by lazy { AVVideoExpectedSourceFrameRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoExpectedSourceFrameRateKey: MemorySegment
    get() = AVVideoExpectedSourceFrameRateKey_VH.get(AVVideoExpectedSourceFrameRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoExpectedSourceFrameRateKey_VH.set(AVVideoExpectedSourceFrameRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoAverageNonDroppableFrameRateKey (Void)*
 */
private val AVVideoAverageNonDroppableFrameRateKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoAverageNonDroppableFrameRateKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoAverageNonDroppableFrameRateKey").orElseThrow().reinterpret(AVVideoAverageNonDroppableFrameRateKey_LAYOUT.byteSize()) }
private val AVVideoAverageNonDroppableFrameRateKey_VH: VarHandle by lazy { AVVideoAverageNonDroppableFrameRateKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoAverageNonDroppableFrameRateKey: MemorySegment
    get() = AVVideoAverageNonDroppableFrameRateKey_VH.get(AVVideoAverageNonDroppableFrameRateKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoAverageNonDroppableFrameRateKey_VH.set(AVVideoAverageNonDroppableFrameRateKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoDecompressionPropertiesKey (Void)*
 */
private val AVVideoDecompressionPropertiesKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoDecompressionPropertiesKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoDecompressionPropertiesKey").orElseThrow().reinterpret(AVVideoDecompressionPropertiesKey_LAYOUT.byteSize()) }
private val AVVideoDecompressionPropertiesKey_VH: VarHandle by lazy { AVVideoDecompressionPropertiesKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoDecompressionPropertiesKey: MemorySegment
    get() = AVVideoDecompressionPropertiesKey_VH.get(AVVideoDecompressionPropertiesKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoDecompressionPropertiesKey_VH.set(AVVideoDecompressionPropertiesKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoEncoderSpecificationKey (Void)*
 */
private val AVVideoEncoderSpecificationKey_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoEncoderSpecificationKey_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoEncoderSpecificationKey").orElseThrow().reinterpret(AVVideoEncoderSpecificationKey_LAYOUT.byteSize()) }
private val AVVideoEncoderSpecificationKey_VH: VarHandle by lazy { AVVideoEncoderSpecificationKey_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVVideoEncoderSpecificationKey: MemorySegment
    get() = AVVideoEncoderSpecificationKey_VH.get(AVVideoEncoderSpecificationKey_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoEncoderSpecificationKey_VH.set(AVVideoEncoderSpecificationKey_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoApertureModeCleanAperture typedef const __strong AVVideoApertureMode = (Void)*
 */
private val AVVideoApertureModeCleanAperture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoApertureModeCleanAperture_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoApertureModeCleanAperture").orElseThrow().reinterpret(AVVideoApertureModeCleanAperture_LAYOUT.byteSize()) }
private val AVVideoApertureModeCleanAperture_VH: VarHandle by lazy { AVVideoApertureModeCleanAperture_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoApertureModeCleanAperture: MemorySegment
    get() = AVVideoApertureModeCleanAperture_VH.get(AVVideoApertureModeCleanAperture_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoApertureModeCleanAperture_VH.set(AVVideoApertureModeCleanAperture_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoApertureModeProductionAperture typedef const __strong AVVideoApertureMode = (Void)*
 */
private val AVVideoApertureModeProductionAperture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoApertureModeProductionAperture_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoApertureModeProductionAperture").orElseThrow().reinterpret(AVVideoApertureModeProductionAperture_LAYOUT.byteSize()) }
private val AVVideoApertureModeProductionAperture_VH: VarHandle by lazy { AVVideoApertureModeProductionAperture_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoApertureModeProductionAperture: MemorySegment
    get() = AVVideoApertureModeProductionAperture_VH.get(AVVideoApertureModeProductionAperture_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoApertureModeProductionAperture_VH.set(AVVideoApertureModeProductionAperture_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoApertureModeEncodedPixels typedef const __strong AVVideoApertureMode = (Void)*
 */
private val AVVideoApertureModeEncodedPixels_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoApertureModeEncodedPixels_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoApertureModeEncodedPixels").orElseThrow().reinterpret(AVVideoApertureModeEncodedPixels_LAYOUT.byteSize()) }
private val AVVideoApertureModeEncodedPixels_VH: VarHandle by lazy { AVVideoApertureModeEncodedPixels_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoApertureModeEncodedPixels: MemorySegment
    get() = AVVideoApertureModeEncodedPixels_VH.get(AVVideoApertureModeEncodedPixels_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoApertureModeEncodedPixels_VH.set(AVVideoApertureModeEncodedPixels_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeVideo typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeVideo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeVideo_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeVideo").orElseThrow().reinterpret(AVMediaTypeVideo_LAYOUT.byteSize()) }
private val AVMediaTypeVideo_VH: VarHandle by lazy { AVMediaTypeVideo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeVideo: MemorySegment
    get() = AVMediaTypeVideo_VH.get(AVMediaTypeVideo_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeVideo_VH.set(AVMediaTypeVideo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeAudio typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeAudio_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeAudio_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeAudio").orElseThrow().reinterpret(AVMediaTypeAudio_LAYOUT.byteSize()) }
private val AVMediaTypeAudio_VH: VarHandle by lazy { AVMediaTypeAudio_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeAudio: MemorySegment
    get() = AVMediaTypeAudio_VH.get(AVMediaTypeAudio_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeAudio_VH.set(AVMediaTypeAudio_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeText typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeText_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeText_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeText").orElseThrow().reinterpret(AVMediaTypeText_LAYOUT.byteSize()) }
private val AVMediaTypeText_VH: VarHandle by lazy { AVMediaTypeText_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeText: MemorySegment
    get() = AVMediaTypeText_VH.get(AVMediaTypeText_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeText_VH.set(AVMediaTypeText_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeClosedCaption typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeClosedCaption_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeClosedCaption_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeClosedCaption").orElseThrow().reinterpret(AVMediaTypeClosedCaption_LAYOUT.byteSize()) }
private val AVMediaTypeClosedCaption_VH: VarHandle by lazy { AVMediaTypeClosedCaption_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeClosedCaption: MemorySegment
    get() = AVMediaTypeClosedCaption_VH.get(AVMediaTypeClosedCaption_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeClosedCaption_VH.set(AVMediaTypeClosedCaption_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeSubtitle typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeSubtitle_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeSubtitle_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeSubtitle").orElseThrow().reinterpret(AVMediaTypeSubtitle_LAYOUT.byteSize()) }
private val AVMediaTypeSubtitle_VH: VarHandle by lazy { AVMediaTypeSubtitle_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeSubtitle: MemorySegment
    get() = AVMediaTypeSubtitle_VH.get(AVMediaTypeSubtitle_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeSubtitle_VH.set(AVMediaTypeSubtitle_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeTimecode typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeTimecode_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeTimecode_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeTimecode").orElseThrow().reinterpret(AVMediaTypeTimecode_LAYOUT.byteSize()) }
private val AVMediaTypeTimecode_VH: VarHandle by lazy { AVMediaTypeTimecode_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeTimecode: MemorySegment
    get() = AVMediaTypeTimecode_VH.get(AVMediaTypeTimecode_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeTimecode_VH.set(AVMediaTypeTimecode_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeMetadata typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeMetadata_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeMetadata_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeMetadata").orElseThrow().reinterpret(AVMediaTypeMetadata_LAYOUT.byteSize()) }
private val AVMediaTypeMetadata_VH: VarHandle by lazy { AVMediaTypeMetadata_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeMetadata: MemorySegment
    get() = AVMediaTypeMetadata_VH.get(AVMediaTypeMetadata_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeMetadata_VH.set(AVMediaTypeMetadata_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeMuxed typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeMuxed_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeMuxed_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeMuxed").orElseThrow().reinterpret(AVMediaTypeMuxed_LAYOUT.byteSize()) }
private val AVMediaTypeMuxed_VH: VarHandle by lazy { AVMediaTypeMuxed_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeMuxed: MemorySegment
    get() = AVMediaTypeMuxed_VH.get(AVMediaTypeMuxed_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeMuxed_VH.set(AVMediaTypeMuxed_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeHaptic typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeHaptic_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeHaptic_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeHaptic").orElseThrow().reinterpret(AVMediaTypeHaptic_LAYOUT.byteSize()) }
private val AVMediaTypeHaptic_VH: VarHandle by lazy { AVMediaTypeHaptic_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeHaptic: MemorySegment
    get() = AVMediaTypeHaptic_VH.get(AVMediaTypeHaptic_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeHaptic_VH.set(AVMediaTypeHaptic_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoRangeSDR typedef const __strong AVVideoRange = (Void)*
 */
private val AVVideoRangeSDR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoRangeSDR_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoRangeSDR").orElseThrow().reinterpret(AVVideoRangeSDR_LAYOUT.byteSize()) }
private val AVVideoRangeSDR_VH: VarHandle by lazy { AVVideoRangeSDR_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoRangeSDR: MemorySegment
    get() = AVVideoRangeSDR_VH.get(AVVideoRangeSDR_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoRangeSDR_VH.set(AVVideoRangeSDR_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoRangeHLG typedef const __strong AVVideoRange = (Void)*
 */
private val AVVideoRangeHLG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoRangeHLG_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoRangeHLG").orElseThrow().reinterpret(AVVideoRangeHLG_LAYOUT.byteSize()) }
private val AVVideoRangeHLG_VH: VarHandle by lazy { AVVideoRangeHLG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoRangeHLG: MemorySegment
    get() = AVVideoRangeHLG_VH.get(AVVideoRangeHLG_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoRangeHLG_VH.set(AVVideoRangeHLG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVVideoRangePQ typedef const __strong AVVideoRange = (Void)*
 */
private val AVVideoRangePQ_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVVideoRangePQ_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVVideoRangePQ").orElseThrow().reinterpret(AVVideoRangePQ_LAYOUT.byteSize()) }
private val AVVideoRangePQ_VH: VarHandle by lazy { AVVideoRangePQ_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVVideoRangePQ: MemorySegment
    get() = AVVideoRangePQ_VH.get(AVVideoRangePQ_SEGMENT, 0L) as MemorySegment
    set(value) = AVVideoRangePQ_VH.set(AVVideoRangePQ_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeMetadataObject typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeMetadataObject_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeMetadataObject_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeMetadataObject").orElseThrow().reinterpret(AVMediaTypeMetadataObject_LAYOUT.byteSize()) }
private val AVMediaTypeMetadataObject_VH: VarHandle by lazy { AVMediaTypeMetadataObject_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeMetadataObject: MemorySegment
    get() = AVMediaTypeMetadataObject_VH.get(AVMediaTypeMetadataObject_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeMetadataObject_VH.set(AVMediaTypeMetadataObject_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeDepthData typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeDepthData_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeDepthData_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeDepthData").orElseThrow().reinterpret(AVMediaTypeDepthData_LAYOUT.byteSize()) }
private val AVMediaTypeDepthData_VH: VarHandle by lazy { AVMediaTypeDepthData_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeDepthData: MemorySegment
    get() = AVMediaTypeDepthData_VH.get(AVMediaTypeDepthData_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeDepthData_VH.set(AVMediaTypeDepthData_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaTypeAuxiliaryPicture typedef const __strong AVMediaType = (Void)*
 */
private val AVMediaTypeAuxiliaryPicture_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaTypeAuxiliaryPicture_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaTypeAuxiliaryPicture").orElseThrow().reinterpret(AVMediaTypeAuxiliaryPicture_LAYOUT.byteSize()) }
private val AVMediaTypeAuxiliaryPicture_VH: VarHandle by lazy { AVMediaTypeAuxiliaryPicture_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaTypeAuxiliaryPicture: MemorySegment
    get() = AVMediaTypeAuxiliaryPicture_VH.get(AVMediaTypeAuxiliaryPicture_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaTypeAuxiliaryPicture_VH.set(AVMediaTypeAuxiliaryPicture_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicVisual typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicVisual_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicVisual_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicVisual").orElseThrow().reinterpret(AVMediaCharacteristicVisual_LAYOUT.byteSize()) }
private val AVMediaCharacteristicVisual_VH: VarHandle by lazy { AVMediaCharacteristicVisual_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicVisual: MemorySegment
    get() = AVMediaCharacteristicVisual_VH.get(AVMediaCharacteristicVisual_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicVisual_VH.set(AVMediaCharacteristicVisual_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicAudible typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicAudible_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicAudible_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicAudible").orElseThrow().reinterpret(AVMediaCharacteristicAudible_LAYOUT.byteSize()) }
private val AVMediaCharacteristicAudible_VH: VarHandle by lazy { AVMediaCharacteristicAudible_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicAudible: MemorySegment
    get() = AVMediaCharacteristicAudible_VH.get(AVMediaCharacteristicAudible_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicAudible_VH.set(AVMediaCharacteristicAudible_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicLegible typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicLegible_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicLegible_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicLegible").orElseThrow().reinterpret(AVMediaCharacteristicLegible_LAYOUT.byteSize()) }
private val AVMediaCharacteristicLegible_VH: VarHandle by lazy { AVMediaCharacteristicLegible_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicLegible: MemorySegment
    get() = AVMediaCharacteristicLegible_VH.get(AVMediaCharacteristicLegible_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicLegible_VH.set(AVMediaCharacteristicLegible_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicFrameBased typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicFrameBased_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicFrameBased_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicFrameBased").orElseThrow().reinterpret(AVMediaCharacteristicFrameBased_LAYOUT.byteSize()) }
private val AVMediaCharacteristicFrameBased_VH: VarHandle by lazy { AVMediaCharacteristicFrameBased_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicFrameBased: MemorySegment
    get() = AVMediaCharacteristicFrameBased_VH.get(AVMediaCharacteristicFrameBased_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicFrameBased_VH.set(AVMediaCharacteristicFrameBased_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicUsesWideGamutColorSpace typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicUsesWideGamutColorSpace_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicUsesWideGamutColorSpace_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicUsesWideGamutColorSpace").orElseThrow().reinterpret(AVMediaCharacteristicUsesWideGamutColorSpace_LAYOUT.byteSize()) }
private val AVMediaCharacteristicUsesWideGamutColorSpace_VH: VarHandle by lazy { AVMediaCharacteristicUsesWideGamutColorSpace_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicUsesWideGamutColorSpace: MemorySegment
    get() = AVMediaCharacteristicUsesWideGamutColorSpace_VH.get(AVMediaCharacteristicUsesWideGamutColorSpace_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicUsesWideGamutColorSpace_VH.set(AVMediaCharacteristicUsesWideGamutColorSpace_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicContainsHDRVideo typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicContainsHDRVideo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicContainsHDRVideo_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicContainsHDRVideo").orElseThrow().reinterpret(AVMediaCharacteristicContainsHDRVideo_LAYOUT.byteSize()) }
private val AVMediaCharacteristicContainsHDRVideo_VH: VarHandle by lazy { AVMediaCharacteristicContainsHDRVideo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicContainsHDRVideo: MemorySegment
    get() = AVMediaCharacteristicContainsHDRVideo_VH.get(AVMediaCharacteristicContainsHDRVideo_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicContainsHDRVideo_VH.set(AVMediaCharacteristicContainsHDRVideo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicContainsAlphaChannel typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicContainsAlphaChannel_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicContainsAlphaChannel_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicContainsAlphaChannel").orElseThrow().reinterpret(AVMediaCharacteristicContainsAlphaChannel_LAYOUT.byteSize()) }
private val AVMediaCharacteristicContainsAlphaChannel_VH: VarHandle by lazy { AVMediaCharacteristicContainsAlphaChannel_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicContainsAlphaChannel: MemorySegment
    get() = AVMediaCharacteristicContainsAlphaChannel_VH.get(AVMediaCharacteristicContainsAlphaChannel_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicContainsAlphaChannel_VH.set(AVMediaCharacteristicContainsAlphaChannel_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicIsMainProgramContent typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicIsMainProgramContent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicIsMainProgramContent_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicIsMainProgramContent").orElseThrow().reinterpret(AVMediaCharacteristicIsMainProgramContent_LAYOUT.byteSize()) }
private val AVMediaCharacteristicIsMainProgramContent_VH: VarHandle by lazy { AVMediaCharacteristicIsMainProgramContent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicIsMainProgramContent: MemorySegment
    get() = AVMediaCharacteristicIsMainProgramContent_VH.get(AVMediaCharacteristicIsMainProgramContent_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicIsMainProgramContent_VH.set(AVMediaCharacteristicIsMainProgramContent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicIsAuxiliaryContent typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicIsAuxiliaryContent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicIsAuxiliaryContent_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicIsAuxiliaryContent").orElseThrow().reinterpret(AVMediaCharacteristicIsAuxiliaryContent_LAYOUT.byteSize()) }
private val AVMediaCharacteristicIsAuxiliaryContent_VH: VarHandle by lazy { AVMediaCharacteristicIsAuxiliaryContent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicIsAuxiliaryContent: MemorySegment
    get() = AVMediaCharacteristicIsAuxiliaryContent_VH.get(AVMediaCharacteristicIsAuxiliaryContent_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicIsAuxiliaryContent_VH.set(AVMediaCharacteristicIsAuxiliaryContent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicIsOriginalContent typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicIsOriginalContent_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicIsOriginalContent_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicIsOriginalContent").orElseThrow().reinterpret(AVMediaCharacteristicIsOriginalContent_LAYOUT.byteSize()) }
private val AVMediaCharacteristicIsOriginalContent_VH: VarHandle by lazy { AVMediaCharacteristicIsOriginalContent_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicIsOriginalContent: MemorySegment
    get() = AVMediaCharacteristicIsOriginalContent_VH.get(AVMediaCharacteristicIsOriginalContent_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicIsOriginalContent_VH.set(AVMediaCharacteristicIsOriginalContent_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicContainsOnlyForcedSubtitles typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicContainsOnlyForcedSubtitles_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicContainsOnlyForcedSubtitles_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicContainsOnlyForcedSubtitles").orElseThrow().reinterpret(AVMediaCharacteristicContainsOnlyForcedSubtitles_LAYOUT.byteSize()) }
private val AVMediaCharacteristicContainsOnlyForcedSubtitles_VH: VarHandle by lazy { AVMediaCharacteristicContainsOnlyForcedSubtitles_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicContainsOnlyForcedSubtitles: MemorySegment
    get() = AVMediaCharacteristicContainsOnlyForcedSubtitles_VH.get(AVMediaCharacteristicContainsOnlyForcedSubtitles_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicContainsOnlyForcedSubtitles_VH.set(AVMediaCharacteristicContainsOnlyForcedSubtitles_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicTranscribesSpokenDialogForAccessibility typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicTranscribesSpokenDialogForAccessibility").orElseThrow().reinterpret(AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_LAYOUT.byteSize()) }
private val AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_VH: VarHandle by lazy { AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicTranscribesSpokenDialogForAccessibility: MemorySegment
    get() = AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_VH.get(AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_VH.set(AVMediaCharacteristicTranscribesSpokenDialogForAccessibility_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicDescribesMusicAndSoundForAccessibility typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicDescribesMusicAndSoundForAccessibility").orElseThrow().reinterpret(AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_LAYOUT.byteSize()) }
private val AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_VH: VarHandle by lazy { AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicDescribesMusicAndSoundForAccessibility: MemorySegment
    get() = AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_VH.get(AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_VH.set(AVMediaCharacteristicDescribesMusicAndSoundForAccessibility_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicEnhancesSpeechIntelligibility typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicEnhancesSpeechIntelligibility_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicEnhancesSpeechIntelligibility_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicEnhancesSpeechIntelligibility").orElseThrow().reinterpret(AVMediaCharacteristicEnhancesSpeechIntelligibility_LAYOUT.byteSize()) }
private val AVMediaCharacteristicEnhancesSpeechIntelligibility_VH: VarHandle by lazy { AVMediaCharacteristicEnhancesSpeechIntelligibility_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicEnhancesSpeechIntelligibility: MemorySegment
    get() = AVMediaCharacteristicEnhancesSpeechIntelligibility_VH.get(AVMediaCharacteristicEnhancesSpeechIntelligibility_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicEnhancesSpeechIntelligibility_VH.set(AVMediaCharacteristicEnhancesSpeechIntelligibility_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicEasyToRead typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicEasyToRead_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicEasyToRead_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicEasyToRead").orElseThrow().reinterpret(AVMediaCharacteristicEasyToRead_LAYOUT.byteSize()) }
private val AVMediaCharacteristicEasyToRead_VH: VarHandle by lazy { AVMediaCharacteristicEasyToRead_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicEasyToRead: MemorySegment
    get() = AVMediaCharacteristicEasyToRead_VH.get(AVMediaCharacteristicEasyToRead_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicEasyToRead_VH.set(AVMediaCharacteristicEasyToRead_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicDescribesVideoForAccessibility typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicDescribesVideoForAccessibility_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicDescribesVideoForAccessibility_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicDescribesVideoForAccessibility").orElseThrow().reinterpret(AVMediaCharacteristicDescribesVideoForAccessibility_LAYOUT.byteSize()) }
private val AVMediaCharacteristicDescribesVideoForAccessibility_VH: VarHandle by lazy { AVMediaCharacteristicDescribesVideoForAccessibility_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicDescribesVideoForAccessibility: MemorySegment
    get() = AVMediaCharacteristicDescribesVideoForAccessibility_VH.get(AVMediaCharacteristicDescribesVideoForAccessibility_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicDescribesVideoForAccessibility_VH.set(AVMediaCharacteristicDescribesVideoForAccessibility_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicLanguageTranslation typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicLanguageTranslation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicLanguageTranslation_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicLanguageTranslation").orElseThrow().reinterpret(AVMediaCharacteristicLanguageTranslation_LAYOUT.byteSize()) }
private val AVMediaCharacteristicLanguageTranslation_VH: VarHandle by lazy { AVMediaCharacteristicLanguageTranslation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicLanguageTranslation: MemorySegment
    get() = AVMediaCharacteristicLanguageTranslation_VH.get(AVMediaCharacteristicLanguageTranslation_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicLanguageTranslation_VH.set(AVMediaCharacteristicLanguageTranslation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicDubbedTranslation typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicDubbedTranslation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicDubbedTranslation_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicDubbedTranslation").orElseThrow().reinterpret(AVMediaCharacteristicDubbedTranslation_LAYOUT.byteSize()) }
private val AVMediaCharacteristicDubbedTranslation_VH: VarHandle by lazy { AVMediaCharacteristicDubbedTranslation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicDubbedTranslation: MemorySegment
    get() = AVMediaCharacteristicDubbedTranslation_VH.get(AVMediaCharacteristicDubbedTranslation_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicDubbedTranslation_VH.set(AVMediaCharacteristicDubbedTranslation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicVoiceOverTranslation typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicVoiceOverTranslation_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicVoiceOverTranslation_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicVoiceOverTranslation").orElseThrow().reinterpret(AVMediaCharacteristicVoiceOverTranslation_LAYOUT.byteSize()) }
private val AVMediaCharacteristicVoiceOverTranslation_VH: VarHandle by lazy { AVMediaCharacteristicVoiceOverTranslation_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicVoiceOverTranslation: MemorySegment
    get() = AVMediaCharacteristicVoiceOverTranslation_VH.get(AVMediaCharacteristicVoiceOverTranslation_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicVoiceOverTranslation_VH.set(AVMediaCharacteristicVoiceOverTranslation_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicTactileMinimal typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicTactileMinimal_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicTactileMinimal_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicTactileMinimal").orElseThrow().reinterpret(AVMediaCharacteristicTactileMinimal_LAYOUT.byteSize()) }
private val AVMediaCharacteristicTactileMinimal_VH: VarHandle by lazy { AVMediaCharacteristicTactileMinimal_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicTactileMinimal: MemorySegment
    get() = AVMediaCharacteristicTactileMinimal_VH.get(AVMediaCharacteristicTactileMinimal_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicTactileMinimal_VH.set(AVMediaCharacteristicTactileMinimal_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicContainsStereoMultiviewVideo typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicContainsStereoMultiviewVideo_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicContainsStereoMultiviewVideo_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicContainsStereoMultiviewVideo").orElseThrow().reinterpret(AVMediaCharacteristicContainsStereoMultiviewVideo_LAYOUT.byteSize()) }
private val AVMediaCharacteristicContainsStereoMultiviewVideo_VH: VarHandle by lazy { AVMediaCharacteristicContainsStereoMultiviewVideo_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicContainsStereoMultiviewVideo: MemorySegment
    get() = AVMediaCharacteristicContainsStereoMultiviewVideo_VH.get(AVMediaCharacteristicContainsStereoMultiviewVideo_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicContainsStereoMultiviewVideo_VH.set(AVMediaCharacteristicContainsStereoMultiviewVideo_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicCarriesVideoStereoMetadata typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicCarriesVideoStereoMetadata_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicCarriesVideoStereoMetadata_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicCarriesVideoStereoMetadata").orElseThrow().reinterpret(AVMediaCharacteristicCarriesVideoStereoMetadata_LAYOUT.byteSize()) }
private val AVMediaCharacteristicCarriesVideoStereoMetadata_VH: VarHandle by lazy { AVMediaCharacteristicCarriesVideoStereoMetadata_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicCarriesVideoStereoMetadata: MemorySegment
    get() = AVMediaCharacteristicCarriesVideoStereoMetadata_VH.get(AVMediaCharacteristicCarriesVideoStereoMetadata_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicCarriesVideoStereoMetadata_VH.set(AVMediaCharacteristicCarriesVideoStereoMetadata_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicIndicatesHorizontalFieldOfView typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicIndicatesHorizontalFieldOfView_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicIndicatesHorizontalFieldOfView_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicIndicatesHorizontalFieldOfView").orElseThrow().reinterpret(AVMediaCharacteristicIndicatesHorizontalFieldOfView_LAYOUT.byteSize()) }
private val AVMediaCharacteristicIndicatesHorizontalFieldOfView_VH: VarHandle by lazy { AVMediaCharacteristicIndicatesHorizontalFieldOfView_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicIndicatesHorizontalFieldOfView: MemorySegment
    get() = AVMediaCharacteristicIndicatesHorizontalFieldOfView_VH.get(AVMediaCharacteristicIndicatesHorizontalFieldOfView_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicIndicatesHorizontalFieldOfView_VH.set(AVMediaCharacteristicIndicatesHorizontalFieldOfView_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicIndicatesNonRectilinearProjection typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicIndicatesNonRectilinearProjection_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicIndicatesNonRectilinearProjection_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicIndicatesNonRectilinearProjection").orElseThrow().reinterpret(AVMediaCharacteristicIndicatesNonRectilinearProjection_LAYOUT.byteSize()) }
private val AVMediaCharacteristicIndicatesNonRectilinearProjection_VH: VarHandle by lazy { AVMediaCharacteristicIndicatesNonRectilinearProjection_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicIndicatesNonRectilinearProjection: MemorySegment
    get() = AVMediaCharacteristicIndicatesNonRectilinearProjection_VH.get(AVMediaCharacteristicIndicatesNonRectilinearProjection_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicIndicatesNonRectilinearProjection_VH.set(AVMediaCharacteristicIndicatesNonRectilinearProjection_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVMediaCharacteristicMachineGenerated typedef const __strong AVMediaCharacteristic = (Void)*
 */
private val AVMediaCharacteristicMachineGenerated_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVMediaCharacteristicMachineGenerated_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVMediaCharacteristicMachineGenerated").orElseThrow().reinterpret(AVMediaCharacteristicMachineGenerated_LAYOUT.byteSize()) }
private val AVMediaCharacteristicMachineGenerated_VH: VarHandle by lazy { AVMediaCharacteristicMachineGenerated_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var AVMediaCharacteristicMachineGenerated: MemorySegment
    get() = AVMediaCharacteristicMachineGenerated_VH.get(AVMediaCharacteristicMachineGenerated_SEGMENT, 0L) as MemorySegment
    set(value) = AVMediaCharacteristicMachineGenerated_VH.set(AVMediaCharacteristicMachineGenerated_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeQuickTimeMovie typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeQuickTimeMovie_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeQuickTimeMovie_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeQuickTimeMovie").orElseThrow().reinterpret(AVFileTypeQuickTimeMovie_LAYOUT.byteSize()) }
private val AVFileTypeQuickTimeMovie_VH: VarHandle by lazy { AVFileTypeQuickTimeMovie_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeQuickTimeMovie: MemorySegment
    get() = AVFileTypeQuickTimeMovie_VH.get(AVFileTypeQuickTimeMovie_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeQuickTimeMovie_VH.set(AVFileTypeQuickTimeMovie_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeQuickTimeAudio typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeQuickTimeAudio_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeQuickTimeAudio_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeQuickTimeAudio").orElseThrow().reinterpret(AVFileTypeQuickTimeAudio_LAYOUT.byteSize()) }
private val AVFileTypeQuickTimeAudio_VH: VarHandle by lazy { AVFileTypeQuickTimeAudio_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeQuickTimeAudio: MemorySegment
    get() = AVFileTypeQuickTimeAudio_VH.get(AVFileTypeQuickTimeAudio_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeQuickTimeAudio_VH.set(AVFileTypeQuickTimeAudio_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeMPEG4 typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeMPEG4_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeMPEG4_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeMPEG4").orElseThrow().reinterpret(AVFileTypeMPEG4_LAYOUT.byteSize()) }
private val AVFileTypeMPEG4_VH: VarHandle by lazy { AVFileTypeMPEG4_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeMPEG4: MemorySegment
    get() = AVFileTypeMPEG4_VH.get(AVFileTypeMPEG4_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeMPEG4_VH.set(AVFileTypeMPEG4_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAppleM4V typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAppleM4V_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAppleM4V_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAppleM4V").orElseThrow().reinterpret(AVFileTypeAppleM4V_LAYOUT.byteSize()) }
private val AVFileTypeAppleM4V_VH: VarHandle by lazy { AVFileTypeAppleM4V_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAppleM4V: MemorySegment
    get() = AVFileTypeAppleM4V_VH.get(AVFileTypeAppleM4V_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAppleM4V_VH.set(AVFileTypeAppleM4V_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAppleM4A typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAppleM4A_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAppleM4A_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAppleM4A").orElseThrow().reinterpret(AVFileTypeAppleM4A_LAYOUT.byteSize()) }
private val AVFileTypeAppleM4A_VH: VarHandle by lazy { AVFileTypeAppleM4A_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAppleM4A: MemorySegment
    get() = AVFileTypeAppleM4A_VH.get(AVFileTypeAppleM4A_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAppleM4A_VH.set(AVFileTypeAppleM4A_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileType3GPP typedef const __strong AVFileType = (Void)*
 */
private val AVFileType3GPP_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileType3GPP_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileType3GPP").orElseThrow().reinterpret(AVFileType3GPP_LAYOUT.byteSize()) }
private val AVFileType3GPP_VH: VarHandle by lazy { AVFileType3GPP_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileType3GPP: MemorySegment
    get() = AVFileType3GPP_VH.get(AVFileType3GPP_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileType3GPP_VH.set(AVFileType3GPP_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileType3GPP2 typedef const __strong AVFileType = (Void)*
 */
private val AVFileType3GPP2_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileType3GPP2_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileType3GPP2").orElseThrow().reinterpret(AVFileType3GPP2_LAYOUT.byteSize()) }
private val AVFileType3GPP2_VH: VarHandle by lazy { AVFileType3GPP2_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileType3GPP2: MemorySegment
    get() = AVFileType3GPP2_VH.get(AVFileType3GPP2_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileType3GPP2_VH.set(AVFileType3GPP2_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeCoreAudioFormat typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeCoreAudioFormat_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeCoreAudioFormat_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeCoreAudioFormat").orElseThrow().reinterpret(AVFileTypeCoreAudioFormat_LAYOUT.byteSize()) }
private val AVFileTypeCoreAudioFormat_VH: VarHandle by lazy { AVFileTypeCoreAudioFormat_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeCoreAudioFormat: MemorySegment
    get() = AVFileTypeCoreAudioFormat_VH.get(AVFileTypeCoreAudioFormat_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeCoreAudioFormat_VH.set(AVFileTypeCoreAudioFormat_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeWAVE typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeWAVE_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeWAVE_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeWAVE").orElseThrow().reinterpret(AVFileTypeWAVE_LAYOUT.byteSize()) }
private val AVFileTypeWAVE_VH: VarHandle by lazy { AVFileTypeWAVE_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeWAVE: MemorySegment
    get() = AVFileTypeWAVE_VH.get(AVFileTypeWAVE_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeWAVE_VH.set(AVFileTypeWAVE_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAIFF typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAIFF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAIFF_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAIFF").orElseThrow().reinterpret(AVFileTypeAIFF_LAYOUT.byteSize()) }
private val AVFileTypeAIFF_VH: VarHandle by lazy { AVFileTypeAIFF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAIFF: MemorySegment
    get() = AVFileTypeAIFF_VH.get(AVFileTypeAIFF_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAIFF_VH.set(AVFileTypeAIFF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAIFC typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAIFC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAIFC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAIFC").orElseThrow().reinterpret(AVFileTypeAIFC_LAYOUT.byteSize()) }
private val AVFileTypeAIFC_VH: VarHandle by lazy { AVFileTypeAIFC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAIFC: MemorySegment
    get() = AVFileTypeAIFC_VH.get(AVFileTypeAIFC_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAIFC_VH.set(AVFileTypeAIFC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAMR typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAMR_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAMR_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAMR").orElseThrow().reinterpret(AVFileTypeAMR_LAYOUT.byteSize()) }
private val AVFileTypeAMR_VH: VarHandle by lazy { AVFileTypeAMR_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAMR: MemorySegment
    get() = AVFileTypeAMR_VH.get(AVFileTypeAMR_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAMR_VH.set(AVFileTypeAMR_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeMPEGLayer3 typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeMPEGLayer3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeMPEGLayer3_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeMPEGLayer3").orElseThrow().reinterpret(AVFileTypeMPEGLayer3_LAYOUT.byteSize()) }
private val AVFileTypeMPEGLayer3_VH: VarHandle by lazy { AVFileTypeMPEGLayer3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeMPEGLayer3: MemorySegment
    get() = AVFileTypeMPEGLayer3_VH.get(AVFileTypeMPEGLayer3_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeMPEGLayer3_VH.set(AVFileTypeMPEGLayer3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeSunAU typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeSunAU_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeSunAU_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeSunAU").orElseThrow().reinterpret(AVFileTypeSunAU_LAYOUT.byteSize()) }
private val AVFileTypeSunAU_VH: VarHandle by lazy { AVFileTypeSunAU_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeSunAU: MemorySegment
    get() = AVFileTypeSunAU_VH.get(AVFileTypeSunAU_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeSunAU_VH.set(AVFileTypeSunAU_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAC3 typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAC3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAC3_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAC3").orElseThrow().reinterpret(AVFileTypeAC3_LAYOUT.byteSize()) }
private val AVFileTypeAC3_VH: VarHandle by lazy { AVFileTypeAC3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAC3: MemorySegment
    get() = AVFileTypeAC3_VH.get(AVFileTypeAC3_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAC3_VH.set(AVFileTypeAC3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeEnhancedAC3 typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeEnhancedAC3_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeEnhancedAC3_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeEnhancedAC3").orElseThrow().reinterpret(AVFileTypeEnhancedAC3_LAYOUT.byteSize()) }
private val AVFileTypeEnhancedAC3_VH: VarHandle by lazy { AVFileTypeEnhancedAC3_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeEnhancedAC3: MemorySegment
    get() = AVFileTypeEnhancedAC3_VH.get(AVFileTypeEnhancedAC3_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeEnhancedAC3_VH.set(AVFileTypeEnhancedAC3_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeJPEG typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeJPEG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeJPEG_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeJPEG").orElseThrow().reinterpret(AVFileTypeJPEG_LAYOUT.byteSize()) }
private val AVFileTypeJPEG_VH: VarHandle by lazy { AVFileTypeJPEG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeJPEG: MemorySegment
    get() = AVFileTypeJPEG_VH.get(AVFileTypeJPEG_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeJPEG_VH.set(AVFileTypeJPEG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeDNG typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeDNG_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeDNG_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeDNG").orElseThrow().reinterpret(AVFileTypeDNG_LAYOUT.byteSize()) }
private val AVFileTypeDNG_VH: VarHandle by lazy { AVFileTypeDNG_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeDNG: MemorySegment
    get() = AVFileTypeDNG_VH.get(AVFileTypeDNG_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeDNG_VH.set(AVFileTypeDNG_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeHEIC typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeHEIC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeHEIC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeHEIC").orElseThrow().reinterpret(AVFileTypeHEIC_LAYOUT.byteSize()) }
private val AVFileTypeHEIC_VH: VarHandle by lazy { AVFileTypeHEIC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeHEIC: MemorySegment
    get() = AVFileTypeHEIC_VH.get(AVFileTypeHEIC_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeHEIC_VH.set(AVFileTypeHEIC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAVCI typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAVCI_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAVCI_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAVCI").orElseThrow().reinterpret(AVFileTypeAVCI_LAYOUT.byteSize()) }
private val AVFileTypeAVCI_VH: VarHandle by lazy { AVFileTypeAVCI_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAVCI: MemorySegment
    get() = AVFileTypeAVCI_VH.get(AVFileTypeAVCI_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAVCI_VH.set(AVFileTypeAVCI_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeHEIF typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeHEIF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeHEIF_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeHEIF").orElseThrow().reinterpret(AVFileTypeHEIF_LAYOUT.byteSize()) }
private val AVFileTypeHEIF_VH: VarHandle by lazy { AVFileTypeHEIF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeHEIF: MemorySegment
    get() = AVFileTypeHEIF_VH.get(AVFileTypeHEIF_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeHEIF_VH.set(AVFileTypeHEIF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeTIFF typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeTIFF_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeTIFF_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeTIFF").orElseThrow().reinterpret(AVFileTypeTIFF_LAYOUT.byteSize()) }
private val AVFileTypeTIFF_VH: VarHandle by lazy { AVFileTypeTIFF_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeTIFF: MemorySegment
    get() = AVFileTypeTIFF_VH.get(AVFileTypeTIFF_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeTIFF_VH.set(AVFileTypeTIFF_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAppleiTT typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAppleiTT_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAppleiTT_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAppleiTT").orElseThrow().reinterpret(AVFileTypeAppleiTT_LAYOUT.byteSize()) }
private val AVFileTypeAppleiTT_VH: VarHandle by lazy { AVFileTypeAppleiTT_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVFileTypeAppleiTT: MemorySegment
    get() = AVFileTypeAppleiTT_VH.get(AVFileTypeAppleiTT_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAppleiTT_VH.set(AVFileTypeAppleiTT_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeSCC typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeSCC_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeSCC_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeSCC").orElseThrow().reinterpret(AVFileTypeSCC_LAYOUT.byteSize()) }
private val AVFileTypeSCC_VH: VarHandle by lazy { AVFileTypeSCC_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
var AVFileTypeSCC: MemorySegment
    get() = AVFileTypeSCC_VH.get(AVFileTypeSCC_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeSCC_VH.set(AVFileTypeSCC_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeAHAP typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeAHAP_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeAHAP_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeAHAP").orElseThrow().reinterpret(AVFileTypeAHAP_LAYOUT.byteSize()) }
private val AVFileTypeAHAP_VH: VarHandle by lazy { AVFileTypeAHAP_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeAHAP: MemorySegment
    get() = AVFileTypeAHAP_VH.get(AVFileTypeAHAP_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeAHAP_VH.set(AVFileTypeAHAP_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeDICOM typedef const __strong AVFileType = (Void)*
 */
private val AVFileTypeDICOM_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeDICOM_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeDICOM").orElseThrow().reinterpret(AVFileTypeDICOM_LAYOUT.byteSize()) }
private val AVFileTypeDICOM_VH: VarHandle by lazy { AVFileTypeDICOM_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeDICOM: MemorySegment
    get() = AVFileTypeDICOM_VH.get(AVFileTypeDICOM_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeDICOM_VH.set(AVFileTypeDICOM_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVStreamingKeyDeliveryContentKeyType (Void)*
 */
private val AVStreamingKeyDeliveryContentKeyType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVStreamingKeyDeliveryContentKeyType_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVStreamingKeyDeliveryContentKeyType").orElseThrow().reinterpret(AVStreamingKeyDeliveryContentKeyType_LAYOUT.byteSize()) }
private val AVStreamingKeyDeliveryContentKeyType_VH: VarHandle by lazy { AVStreamingKeyDeliveryContentKeyType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVStreamingKeyDeliveryContentKeyType: MemorySegment
    get() = AVStreamingKeyDeliveryContentKeyType_VH.get(AVStreamingKeyDeliveryContentKeyType_SEGMENT, 0L) as MemorySegment
    set(value) = AVStreamingKeyDeliveryContentKeyType_VH.set(AVStreamingKeyDeliveryContentKeyType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVStreamingKeyDeliveryPersistentContentKeyType (Void)*
 */
private val AVStreamingKeyDeliveryPersistentContentKeyType_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVStreamingKeyDeliveryPersistentContentKeyType_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVStreamingKeyDeliveryPersistentContentKeyType").orElseThrow().reinterpret(AVStreamingKeyDeliveryPersistentContentKeyType_LAYOUT.byteSize()) }
private val AVStreamingKeyDeliveryPersistentContentKeyType_VH: VarHandle by lazy { AVStreamingKeyDeliveryPersistentContentKeyType_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVStreamingKeyDeliveryPersistentContentKeyType: MemorySegment
    get() = AVStreamingKeyDeliveryPersistentContentKeyType_VH.get(AVStreamingKeyDeliveryPersistentContentKeyType_SEGMENT, 0L) as MemorySegment
    set(value) = AVStreamingKeyDeliveryPersistentContentKeyType_VH.set(AVStreamingKeyDeliveryPersistentContentKeyType_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeProfileMPEG4AppleHLS typedef const __strong AVFileTypeProfile = (Void)*
 */
private val AVFileTypeProfileMPEG4AppleHLS_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeProfileMPEG4AppleHLS_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeProfileMPEG4AppleHLS").orElseThrow().reinterpret(AVFileTypeProfileMPEG4AppleHLS_LAYOUT.byteSize()) }
private val AVFileTypeProfileMPEG4AppleHLS_VH: VarHandle by lazy { AVFileTypeProfileMPEG4AppleHLS_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeProfileMPEG4AppleHLS: MemorySegment
    get() = AVFileTypeProfileMPEG4AppleHLS_VH.get(AVFileTypeProfileMPEG4AppleHLS_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeProfileMPEG4AppleHLS_VH.set(AVFileTypeProfileMPEG4AppleHLS_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : AVFileTypeProfileMPEG4CMAFCompliant typedef const __strong AVFileTypeProfile = (Void)*
 */
private val AVFileTypeProfileMPEG4CMAFCompliant_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val AVFileTypeProfileMPEG4CMAFCompliant_SEGMENT: MemorySegment by lazy { LOOKUP.find("AVFileTypeProfileMPEG4CMAFCompliant").orElseThrow().reinterpret(AVFileTypeProfileMPEG4CMAFCompliant_LAYOUT.byteSize()) }
private val AVFileTypeProfileMPEG4CMAFCompliant_VH: VarHandle by lazy { AVFileTypeProfileMPEG4CMAFCompliant_LAYOUT.varHandle() }

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
var AVFileTypeProfileMPEG4CMAFCompliant: MemorySegment
    get() = AVFileTypeProfileMPEG4CMAFCompliant_VH.get(AVFileTypeProfileMPEG4CMAFCompliant_SEGMENT, 0L) as MemorySegment
    set(value) = AVFileTypeProfileMPEG4CMAFCompliant_VH.set(AVFileTypeProfileMPEG4CMAFCompliant_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoStatus typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoStatus_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoStatus_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoStatus").orElseThrow().reinterpret(SCStreamFrameInfoStatus_LAYOUT.byteSize()) }
private val SCStreamFrameInfoStatus_VH: VarHandle by lazy { SCStreamFrameInfoStatus_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamFrameInfoStatus: MemorySegment
    get() = SCStreamFrameInfoStatus_VH.get(SCStreamFrameInfoStatus_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoStatus_VH.set(SCStreamFrameInfoStatus_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoDisplayTime typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoDisplayTime_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoDisplayTime_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoDisplayTime").orElseThrow().reinterpret(SCStreamFrameInfoDisplayTime_LAYOUT.byteSize()) }
private val SCStreamFrameInfoDisplayTime_VH: VarHandle by lazy { SCStreamFrameInfoDisplayTime_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamFrameInfoDisplayTime: MemorySegment
    get() = SCStreamFrameInfoDisplayTime_VH.get(SCStreamFrameInfoDisplayTime_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoDisplayTime_VH.set(SCStreamFrameInfoDisplayTime_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoScaleFactor typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoScaleFactor_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoScaleFactor_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoScaleFactor").orElseThrow().reinterpret(SCStreamFrameInfoScaleFactor_LAYOUT.byteSize()) }
private val SCStreamFrameInfoScaleFactor_VH: VarHandle by lazy { SCStreamFrameInfoScaleFactor_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamFrameInfoScaleFactor: MemorySegment
    get() = SCStreamFrameInfoScaleFactor_VH.get(SCStreamFrameInfoScaleFactor_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoScaleFactor_VH.set(SCStreamFrameInfoScaleFactor_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoContentScale typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoContentScale_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoContentScale_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoContentScale").orElseThrow().reinterpret(SCStreamFrameInfoContentScale_LAYOUT.byteSize()) }
private val SCStreamFrameInfoContentScale_VH: VarHandle by lazy { SCStreamFrameInfoContentScale_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamFrameInfoContentScale: MemorySegment
    get() = SCStreamFrameInfoContentScale_VH.get(SCStreamFrameInfoContentScale_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoContentScale_VH.set(SCStreamFrameInfoContentScale_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoContentRect typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoContentRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoContentRect_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoContentRect").orElseThrow().reinterpret(SCStreamFrameInfoContentRect_LAYOUT.byteSize()) }
private val SCStreamFrameInfoContentRect_VH: VarHandle by lazy { SCStreamFrameInfoContentRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamFrameInfoContentRect: MemorySegment
    get() = SCStreamFrameInfoContentRect_VH.get(SCStreamFrameInfoContentRect_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoContentRect_VH.set(SCStreamFrameInfoContentRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoDirtyRects typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoDirtyRects_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoDirtyRects_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoDirtyRects").orElseThrow().reinterpret(SCStreamFrameInfoDirtyRects_LAYOUT.byteSize()) }
private val SCStreamFrameInfoDirtyRects_VH: VarHandle by lazy { SCStreamFrameInfoDirtyRects_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamFrameInfoDirtyRects: MemorySegment
    get() = SCStreamFrameInfoDirtyRects_VH.get(SCStreamFrameInfoDirtyRects_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoDirtyRects_VH.set(SCStreamFrameInfoDirtyRects_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoScreenRect typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoScreenRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoScreenRect_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoScreenRect").orElseThrow().reinterpret(SCStreamFrameInfoScreenRect_LAYOUT.byteSize()) }
private val SCStreamFrameInfoScreenRect_VH: VarHandle by lazy { SCStreamFrameInfoScreenRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1)
var SCStreamFrameInfoScreenRect: MemorySegment
    get() = SCStreamFrameInfoScreenRect_VH.get(SCStreamFrameInfoScreenRect_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoScreenRect_VH.set(SCStreamFrameInfoScreenRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoBoundingRect typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoBoundingRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoBoundingRect_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoBoundingRect").orElseThrow().reinterpret(SCStreamFrameInfoBoundingRect_LAYOUT.byteSize()) }
private val SCStreamFrameInfoBoundingRect_VH: VarHandle by lazy { SCStreamFrameInfoBoundingRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
var SCStreamFrameInfoBoundingRect: MemorySegment
    get() = SCStreamFrameInfoBoundingRect_VH.get(SCStreamFrameInfoBoundingRect_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoBoundingRect_VH.set(SCStreamFrameInfoBoundingRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamFrameInfoPresenterOverlayContentRect typedef const SCStreamFrameInfo = (Void)*
 */
private val SCStreamFrameInfoPresenterOverlayContentRect_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamFrameInfoPresenterOverlayContentRect_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamFrameInfoPresenterOverlayContentRect").orElseThrow().reinterpret(SCStreamFrameInfoPresenterOverlayContentRect_LAYOUT.byteSize()) }
private val SCStreamFrameInfoPresenterOverlayContentRect_VH: VarHandle by lazy { SCStreamFrameInfoPresenterOverlayContentRect_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 2, introducedSubminor = -1)
var SCStreamFrameInfoPresenterOverlayContentRect: MemorySegment
    get() = SCStreamFrameInfoPresenterOverlayContentRect_VH.get(SCStreamFrameInfoPresenterOverlayContentRect_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamFrameInfoPresenterOverlayContentRect_VH.set(SCStreamFrameInfoPresenterOverlayContentRect_SEGMENT, 0L, value)

/**
 * {@snippet lang=c : SCStreamErrorDomain (Void)*
 */
private val SCStreamErrorDomain_LAYOUT: ValueLayout by lazy { ValueLayout.ADDRESS }
private val SCStreamErrorDomain_SEGMENT: MemorySegment by lazy { LOOKUP.find("SCStreamErrorDomain").orElseThrow().reinterpret(SCStreamErrorDomain_LAYOUT.byteSize()) }
private val SCStreamErrorDomain_VH: VarHandle by lazy { SCStreamErrorDomain_LAYOUT.varHandle() }

@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
var SCStreamErrorDomain: MemorySegment
    get() = SCStreamErrorDomain_VH.get(SCStreamErrorDomain_SEGMENT, 0L) as MemorySegment
    set(value) = SCStreamErrorDomain_VH.set(SCStreamErrorDomain_SEGMENT, 0L, value)
