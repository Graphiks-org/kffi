@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCRacingWheel
 * Superclass: NSObject
 * Protocols: GCDevice
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
open class GCRacingWheel(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCRacingWheel") } }

        /** @return NSSet<GCRacingWheel *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", unavailable = true)
        fun connectedRacingWheels(): MemorySegment {
            val sel = ObjCRuntime.sel("connectedRacingWheels")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun acquireDeviceWithError(error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("acquireDeviceWithError:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, error) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun relinquishDevice(): Unit {
        val sel = ObjCRuntime.sel("relinquishDevice")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun capture(): MemorySegment {
        val sel = ObjCRuntime.sel("capture")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property acquired
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun isAcquired(): Boolean {
        val sel = ObjCRuntime.sel("isAcquired")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property wheelInput
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun wheelInput(): MemorySegment {
        val sel = ObjCRuntime.sel("wheelInput")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property snapshot
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun isSnapshot(): Boolean {
        val sel = ObjCRuntime.sel("isSnapshot")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheel.handlerQueue(): MemorySegment {
    val sel = ObjCRuntime.sel("handlerQueue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCRacingWheel.setHandlerQueue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setHandlerQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheel.vendorName(): MemorySegment {
    val sel = ObjCRuntime.sel("vendorName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheel.productCategory(): MemorySegment {
    val sel = ObjCRuntime.sel("productCategory")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCRacingWheel.physicalInputProfile(): MemorySegment {
    val sel = ObjCRuntime.sel("physicalInputProfile")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
