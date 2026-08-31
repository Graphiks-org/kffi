@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCKeyboard
 * Superclass: NSObject
 * Protocols: GCDevice
 */
@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
open class GCKeyboard(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCKeyboard") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun coalescedKeyboard(): MemorySegment {
            val sel = ObjCRuntime.sel("coalescedKeyboard")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property keyboardInput
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun keyboardInput(): MemorySegment {
        val sel = ObjCRuntime.sel("keyboardInput")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCKeyboard.handlerQueue(): MemorySegment {
    val sel = ObjCRuntime.sel("handlerQueue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun GCKeyboard.setHandlerQueue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setHandlerQueue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCKeyboard.vendorName(): MemorySegment {
    val sel = ObjCRuntime.sel("vendorName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCKeyboard.productCategory(): MemorySegment {
    val sel = ObjCRuntime.sel("productCategory")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCDevice.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCKeyboard.physicalInputProfile(): MemorySegment {
    val sel = ObjCRuntime.sel("physicalInputProfile")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
