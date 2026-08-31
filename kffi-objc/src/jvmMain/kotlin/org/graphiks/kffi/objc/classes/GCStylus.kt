@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCStylus
 * Superclass: NSObject
 * Protocols: GCDevice
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
open class GCStylus(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCStylus") } }

    }

    // @property input
    /** @return id<GCDevicePhysicalInput> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", unavailable = true)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun input(): MemorySegment {
        val sel = ObjCRuntime.sel("input")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property haptics
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", unavailable = true)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun haptics(): MemorySegment {
        val sel = ObjCRuntime.sel("haptics")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCStylus.handlerQueue(): MemorySegment {
    val sel = ObjCRuntime.sel("handlerQueue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCStylus.setHandlerQueue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setHandlerQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCStylus.vendorName(): MemorySegment {
    val sel = ObjCRuntime.sel("vendorName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCStylus.productCategory(): MemorySegment {
    val sel = ObjCRuntime.sel("productCategory")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCStylus.physicalInputProfile(): MemorySegment {
    val sel = ObjCRuntime.sel("physicalInputProfile")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: Discovery on GCStylus ─────────────────────────────────────────

// Class method: +[GCStylus styli]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
fun GCStylus_styli(): MemorySegment {
    val sel = ObjCRuntime.sel("styli")
    val cls = ObjCRuntime.getClass("GCStylus")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}
