@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

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
