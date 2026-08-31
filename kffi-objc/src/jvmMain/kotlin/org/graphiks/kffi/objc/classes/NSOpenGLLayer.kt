@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOpenGLLayer
 * Superclass: CAOpenGLLayer
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Please use CAMetalLayer instead.")
open class NSOpenGLLayer(override val ptr: MemorySegment) : CAOpenGLLayer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSOpenGLLayer") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openGLPixelFormatForDisplayMask(mask: Int): MemorySegment {
        val sel = ObjCRuntime.sel("openGLPixelFormatForDisplayMask:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, mask) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openGLContextForPixelFormat(pixelFormat: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("openGLContextForPixelFormat:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pixelFormat) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime(context: MemorySegment, pixelFormat: MemorySegment, t: Double, ts: CVTimeStampPointer): Boolean {
        val sel = ObjCRuntime.sel("canDrawInOpenGLContext:pixelFormat:forLayerTime:displayTime:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, context, pixelFormat, t, ts.segment) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawInOpenGLContext_pixelFormat_forLayerTime_displayTime(context: MemorySegment, pixelFormat: MemorySegment, t: Double, ts: CVTimeStampPointer): Unit {
        val sel = ObjCRuntime.sel("drawInOpenGLContext:pixelFormat:forLayerTime:displayTime:")
        ObjCRuntime.msgSend(null, ptr, sel, context, pixelFormat, t, ts.segment)
    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property openGLPixelFormat
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openGLPixelFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("openGLPixelFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOpenGLPixelFormat(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setOpenGLPixelFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property openGLContext
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openGLContext(): MemorySegment {
        val sel = ObjCRuntime.sel("openGLContext")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOpenGLContext(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setOpenGLContext:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
