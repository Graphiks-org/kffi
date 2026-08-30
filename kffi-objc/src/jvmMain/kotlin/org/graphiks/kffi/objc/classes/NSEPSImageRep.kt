@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSEPSImageRep
 * Superclass: NSImageRep
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "`NSEPSImageRep` instances cannot be created on macOS 14.0 and later")
open class NSEPSImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSEPSImageRep") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithData(epsData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, epsData) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithData(epsData: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, epsData) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1)
    open fun prepareGState(): Unit {
        val sel = ObjCRuntime.sel("prepareGState")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property boundingBox
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun boundingBox(): NSRect {
        val sel = ObjCRuntime.sel("boundingBox")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property EPSRepresentation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun EPSRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("EPSRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
