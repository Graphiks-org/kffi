@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CAOpenGLLayer
 * Superclass: CALayer
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
@PlatformAvailability(platform = "xros", unavailable = true)
open class CAOpenGLLayer(override val ptr: MemorySegment) : CALayer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("CAOpenGLLayer") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun canDrawInCGLContext_pixelFormat_forLayerTime_displayTime(ctx: CGLContextObj, pf: CGLPixelFormatObj, t: Double, ts: CVTimeStampPointer): Boolean {
        val sel = ObjCRuntime.sel("canDrawInCGLContext:pixelFormat:forLayerTime:displayTime:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ctx.segment, pf.segment, t, ts.segment) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun drawInCGLContext_pixelFormat_forLayerTime_displayTime(ctx: CGLContextObj, pf: CGLPixelFormatObj, t: Double, ts: CVTimeStampPointer): Unit {
        val sel = ObjCRuntime.sel("drawInCGLContext:pixelFormat:forLayerTime:displayTime:")
        ObjCRuntime.msgSend(null, ptr, sel, ctx.segment, pf.segment, t, ts.segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun copyCGLPixelFormatForDisplayMask(mask: Int): CGLPixelFormatObj {
        val sel = ObjCRuntime.sel("copyCGLPixelFormatForDisplayMask:")
        return CGLPixelFormatObj(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, mask) as MemorySegment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun releaseCGLPixelFormat(pf: CGLPixelFormatObj): Unit {
        val sel = ObjCRuntime.sel("releaseCGLPixelFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, pf.segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun copyCGLContextForPixelFormat(pf: CGLPixelFormatObj): CGLContextObj {
        val sel = ObjCRuntime.sel("copyCGLContextForPixelFormat:")
        return CGLContextObj(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pf.segment) as MemorySegment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun releaseCGLContext(ctx: CGLContextObj): Unit {
        val sel = ObjCRuntime.sel("releaseCGLContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ctx.segment)
    }

    // @property asynchronous
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun isAsynchronous(): Boolean {
        val sel = ObjCRuntime.sel("isAsynchronous")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun setAsynchronous(value: Boolean) {
        val sel = ObjCRuntime.sel("setAsynchronous:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorspace
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun colorspace(): CGColorSpaceRef {
        val sel = ObjCRuntime.sel("colorspace")
        return CGColorSpaceRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 13, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 1, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "OpenGL is deprecated. (Define GL_SILENCE_DEPRECATION to silence these warnings)")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    @PlatformAvailability(platform = "xros", unavailable = true)
    open fun setColorspace(value: CGColorSpaceRef) {
        val sel = ObjCRuntime.sel("setColorspace:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property wantsExtendedDynamicRangeContent
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    override fun wantsExtendedDynamicRangeContent(): Boolean {
        val sel = ObjCRuntime.sel("wantsExtendedDynamicRangeContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    override fun setWantsExtendedDynamicRangeContent(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsExtendedDynamicRangeContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _glPriv: MemorySegment
}
