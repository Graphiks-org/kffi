@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCControllerLiveInput
 * Superclass: GCControllerInputState
 * Protocols: GCDevicePhysicalInput
 */
@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
open class GCControllerLiveInput(override val ptr: MemorySegment) : GCControllerInputState(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCControllerLiveInput") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    open fun capture(): MemorySegment {
        val sel = ObjCRuntime.sel("capture")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return GCControllerInputState<GCDevicePhysicalInputStateDiff> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    open fun nextInputState(): MemorySegment {
        val sel = ObjCRuntime.sel("nextInputState")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property unmappedInput
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
    open fun unmappedInput(): MemorySegment {
        val sel = ObjCRuntime.sel("unmappedInput")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerLiveInput.queue(): MemorySegment {
    val sel = ObjCRuntime.sel("queue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCControllerLiveInput.setQueue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 */
fun GCControllerLiveInput.elementValueDidChangeHandler(): MemorySegment {
    val sel = ObjCRuntime.sel("elementValueDidChangeHandler")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCControllerLiveInput.setElementValueDidChangeHandler(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setElementValueDidChangeHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 */
fun GCControllerLiveInput.inputStateAvailableHandler(): MemorySegment {
    val sel = ObjCRuntime.sel("inputStateAvailableHandler")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCControllerLiveInput.setInputStateAvailableHandler(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setInputStateAvailableHandler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInput.
 */
fun GCControllerLiveInput.inputStateQueueDepth(): Long {
    val sel = ObjCRuntime.sel("inputStateQueueDepth")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun GCControllerLiveInput.setInputStateQueueDepth(value: Long) {
    val sel = ObjCRuntime.sel("setInputStateQueueDepth:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}
