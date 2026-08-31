@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOpenGLView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Please use MTKView instead.")
open class NSOpenGLView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSOpenGLView") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun defaultPixelFormat(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultPixelFormat")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFrame_pixelFormat(frameRect: NSRect, format: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:pixelFormat:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), format) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clearGLContext(): Unit {
        val sel = ObjCRuntime.sel("clearGLContext")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun update(): Unit {
        val sel = ObjCRuntime.sel("update")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reshape(): Unit {
        val sel = ObjCRuntime.sel("reshape")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun prepareOpenGL(): Unit {
        val sel = ObjCRuntime.sel("prepareOpenGL")
        ObjCRuntime.msgSend(null, ptr, sel)
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

    // @property pixelFormat
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pixelFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("pixelFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPixelFormat(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPixelFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property wantsBestResolutionOpenGLSurface
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
    open fun wantsBestResolutionOpenGLSurface(): Boolean {
        val sel = ObjCRuntime.sel("wantsBestResolutionOpenGLSurface")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
    open fun setWantsBestResolutionOpenGLSurface(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsBestResolutionOpenGLSurface:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property wantsExtendedDynamicRangeOpenGLSurface
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
    open fun wantsExtendedDynamicRangeOpenGLSurface(): Boolean {
        val sel = ObjCRuntime.sel("wantsExtendedDynamicRangeOpenGLSurface")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL API deprecated; please use Metal and MetalKit.  (Define GL_SILENCE_DEPRECATION to silence these warnings.)")
    open fun setWantsExtendedDynamicRangeOpenGLSurface(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsExtendedDynamicRangeOpenGLSurface:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
