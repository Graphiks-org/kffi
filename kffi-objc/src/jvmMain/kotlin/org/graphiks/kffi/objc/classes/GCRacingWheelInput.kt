@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCRacingWheelInput
 * Superclass: GCRacingWheelInputState
 * Protocols: GCDevicePhysicalInput
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
open class GCRacingWheelInput(override val ptr: MemorySegment) : GCRacingWheelInputState(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCRacingWheelInput") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun capture(): MemorySegment {
        val sel = ObjCRuntime.sel("capture")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return GCRacingWheelInputState<GCDevicePhysicalInputStateDiff> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun nextInputState(): MemorySegment {
        val sel = ObjCRuntime.sel("nextInputState")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInput.queue(): MemorySegment {
    val sel = ObjCRuntime.sel("queue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCRacingWheelInput.setQueue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 */
fun GCRacingWheelInput.elementValueDidChangeHandler(): MemorySegment {
    val sel = ObjCRuntime.sel("elementValueDidChangeHandler")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCRacingWheelInput.setElementValueDidChangeHandler(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setElementValueDidChangeHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 */
fun GCRacingWheelInput.inputStateAvailableHandler(): MemorySegment {
    val sel = ObjCRuntime.sel("inputStateAvailableHandler")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCRacingWheelInput.setInputStateAvailableHandler(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setInputStateAvailableHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 */
fun GCRacingWheelInput.inputStateQueueDepth(): Long {
    val sel = ObjCRuntime.sel("inputStateQueueDepth")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun GCRacingWheelInput.setInputStateQueueDepth(value: Long) {
    val sel = ObjCRuntime.sel("setInputStateQueueDepth:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}
