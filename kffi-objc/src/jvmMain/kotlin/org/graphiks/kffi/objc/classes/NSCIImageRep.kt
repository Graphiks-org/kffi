@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCIImageRep
 * Superclass: NSImageRep
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSCIImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCIImageRep") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithCIImage(image: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithCIImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCIImage(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCIImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    // @property CIImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun CIImage(): MemorySegment {
        val sel = ObjCRuntime.sel("CIImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
