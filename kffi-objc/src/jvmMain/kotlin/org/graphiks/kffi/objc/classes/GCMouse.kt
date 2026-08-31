@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCMouse
 * Superclass: NSObject
 * Protocols: GCDevice
 */
@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
open class GCMouse(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCMouse") } }

        /** @return NSArray<GCMouse *> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun mice(): MemorySegment {
            val sel = ObjCRuntime.sel("mice")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun current(): MemorySegment {
            val sel = ObjCRuntime.sel("current")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property mouseInput
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun mouseInput(): MemorySegment {
        val sel = ObjCRuntime.sel("mouseInput")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCMouse.handlerQueue(): MemorySegment {
    val sel = ObjCRuntime.sel("handlerQueue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCMouse.setHandlerQueue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setHandlerQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCMouse.vendorName(): MemorySegment {
    val sel = ObjCRuntime.sel("vendorName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCMouse.productCategory(): MemorySegment {
    val sel = ObjCRuntime.sel("productCategory")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCMouse.physicalInputProfile(): MemorySegment {
    val sel = ObjCRuntime.sel("physicalInputProfile")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
