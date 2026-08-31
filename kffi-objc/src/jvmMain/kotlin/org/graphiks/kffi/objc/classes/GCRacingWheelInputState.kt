@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCRacingWheelInputState
 * Superclass: NSObject
 * Protocols: GCDevicePhysicalInputState
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
open class GCRacingWheelInputState(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCRacingWheelInputState") } }

    }

    // @property wheel
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun wheel(): MemorySegment {
        val sel = ObjCRuntime.sel("wheel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property acceleratorPedal
    /** @return id<GCButtonElement> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun acceleratorPedal(): MemorySegment {
        val sel = ObjCRuntime.sel("acceleratorPedal")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property brakePedal
    /** @return id<GCButtonElement> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun brakePedal(): MemorySegment {
        val sel = ObjCRuntime.sel("brakePedal")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property clutchPedal
    /** @return id<GCButtonElement> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun clutchPedal(): MemorySegment {
        val sel = ObjCRuntime.sel("clutchPedal")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property shifter
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun shifter(): MemorySegment {
        val sel = ObjCRuntime.sel("shifter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInputState.device(): MemorySegment {
    val sel = ObjCRuntime.sel("device")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 */
fun GCRacingWheelInputState.lastEventTimestamp(): Double {
    val sel = ObjCRuntime.sel("lastEventTimestamp")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 */
fun GCRacingWheelInputState.lastEventLatency(): Double {
    val sel = ObjCRuntime.sel("lastEventLatency")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInputState.elements(): MemorySegment {
    val sel = ObjCRuntime.sel("elements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInputState.buttons(): MemorySegment {
    val sel = ObjCRuntime.sel("buttons")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInputState.axes(): MemorySegment {
    val sel = ObjCRuntime.sel("axes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInputState.switches(): MemorySegment {
    val sel = ObjCRuntime.sel("switches")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevicePhysicalInputState.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheelInputState.dpads(): MemorySegment {
    val sel = ObjCRuntime.sel("dpads")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol GCDevicePhysicalInputState. */
fun GCRacingWheelInputState.objectForKeyedSubscript(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectForKeyedSubscript:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}
