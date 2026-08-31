@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCGearShifterElement
 * Superclass: NSObject
 * Protocols: GCPhysicalInputElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
open class GCGearShifterElement(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCGearShifterElement") } }

    }

    // @property patternInput
    /** @return id<GCSwitchPositionInput> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun patternInput(): MemorySegment {
        val sel = ObjCRuntime.sel("patternInput")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property sequentialInput
    /** @return id<GCRelativeInput> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    open fun sequentialInput(): MemorySegment {
        val sel = ObjCRuntime.sel("sequentialInput")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol GCPhysicalInputElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCGearShifterElement.aliases(): MemorySegment {
    val sel = ObjCRuntime.sel("aliases")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCPhysicalInputElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCGearShifterElement.localizedName(): MemorySegment {
    val sel = ObjCRuntime.sel("localizedName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol GCPhysicalInputElement.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun GCGearShifterElement.sfSymbolsName(): MemorySegment {
    val sel = ObjCRuntime.sel("sfSymbolsName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
