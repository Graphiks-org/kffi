@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCSteeringWheelElement
 * Superclass: NSObject
 * Protocols: GCAxisElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
open class GCSteeringWheelElement(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCSteeringWheelElement") } }

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

    // @property maximumDegreesOfRotation
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun maximumDegreesOfRotation(): Float {
        val sel = ObjCRuntime.sel("maximumDegreesOfRotation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

}

/**
 * Required by Objective-C protocol GCPhysicalInputElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCSteeringWheelElement.aliases(): MemorySegment {
    val sel = ObjCRuntime.sel("aliases")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCPhysicalInputElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCSteeringWheelElement.localizedName(): MemorySegment {
    val sel = ObjCRuntime.sel("localizedName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCPhysicalInputElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCSteeringWheelElement.sfSymbolsName(): MemorySegment {
    val sel = ObjCRuntime.sel("sfSymbolsName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCAxisElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCSteeringWheelElement.absoluteInput(): MemorySegment {
    val sel = ObjCRuntime.sel("absoluteInput")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCAxisElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCSteeringWheelElement.relativeInput(): MemorySegment {
    val sel = ObjCRuntime.sel("relativeInput")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
