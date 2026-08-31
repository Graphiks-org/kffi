@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCControllerInputState
 * Superclass: NSObject
 * Protocols: GCDevicePhysicalInputState
 */
@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
open class GCControllerInputState(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCControllerInputState") } }

    }

}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerInputState.device(): MemorySegment {
    val sel = ObjCRuntime.sel("device")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 */
fun GCControllerInputState.lastEventTimestamp(): Double {
    val sel = ObjCRuntime.sel("lastEventTimestamp")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 */
fun GCControllerInputState.lastEventLatency(): Double {
    val sel = ObjCRuntime.sel("lastEventLatency")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerInputState.elements(): MemorySegment {
    val sel = ObjCRuntime.sel("elements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerInputState.buttons(): MemorySegment {
    val sel = ObjCRuntime.sel("buttons")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerInputState.axes(): MemorySegment {
    val sel = ObjCRuntime.sel("axes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerInputState.switches(): MemorySegment {
    val sel = ObjCRuntime.sel("switches")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCControllerInputState.dpads(): MemorySegment {
    val sel = ObjCRuntime.sel("dpads")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol GCDevicePhysicalInputState. */
fun GCControllerInputState.objectForKeyedSubscript(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectForKeyedSubscript:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}
