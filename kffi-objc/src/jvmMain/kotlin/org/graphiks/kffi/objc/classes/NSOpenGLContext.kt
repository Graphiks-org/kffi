@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOpenGLContext
 * Superclass: NSObject
 * Protocols: NSLocking
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Please use Metal or MetalKit.")
open class NSOpenGLContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSOpenGLContext") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun clearCurrentContext(): Unit {
            val sel = ObjCRuntime.sel("clearCurrentContext")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentContext(): MemorySegment {
            val sel = ObjCRuntime.sel("currentContext")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFormat_shareContext(format: MemorySegment, share: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFormat:shareContext:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, format, share) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun initWithCGLContextObj(context: CGLContextObj): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGLContextObj:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, context.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use a fullscreen NSOpenGLView instead")
    open fun setFullScreen(): Unit {
        val sel = ObjCRuntime.sel("setFullScreen")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
    open fun setOffScreen_width_height_rowbytes(baseaddr: MemorySegment, width: Int, height: Int, rowbytes: Int): Unit {
        val sel = ObjCRuntime.sel("setOffScreen:width:height:rowbytes:")
        ObjCRuntime.msgSend(null, ptr, sel, baseaddr, width, height, rowbytes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clearDrawable(): Unit {
        val sel = ObjCRuntime.sel("clearDrawable")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun update(): Unit {
        val sel = ObjCRuntime.sel("update")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun flushBuffer(): Unit {
        val sel = ObjCRuntime.sel("flushBuffer")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeCurrentContext(): Unit {
        val sel = ObjCRuntime.sel("makeCurrentContext")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
    open fun copyAttributesFromContext_withMask(context: MemorySegment, mask: Int): Unit {
        val sel = ObjCRuntime.sel("copyAttributesFromContext:withMask:")
        ObjCRuntime.msgSend(null, ptr, sel, context, mask)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setValues_forParameter(vals: MemorySegment, param: NSOpenGLContextParameter): Unit {
        val sel = ObjCRuntime.sel("setValues:forParameter:")
        ObjCRuntime.msgSend(null, ptr, sel, vals, param.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getValues_forParameter(vals: MemorySegment, param: NSOpenGLContextParameter): Unit {
        val sel = ObjCRuntime.sel("getValues:forParameter:")
        ObjCRuntime.msgSend(null, ptr, sel, vals, param.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
    open fun createTexture_fromView_internalFormat(target: Int, view: MemorySegment, format: Int): Unit {
        val sel = ObjCRuntime.sel("createTexture:fromView:internalFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, target, view, format)
    }

    // @property pixelFormat
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun pixelFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("pixelFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
    open fun setView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property currentVirtualScreen
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentVirtualScreen(): Int {
        val sel = ObjCRuntime.sel("currentVirtualScreen")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCurrentVirtualScreen(value: Int) {
        val sel = ObjCRuntime.sel("setCurrentVirtualScreen:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property CGLContextObj
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun CGLContextObj(): CGLContextObj {
        val sel = ObjCRuntime.sel("CGLContextObj")
        return CGLContextObj(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

}

/** Required by Objective-C protocol NSLocking. */
fun NSOpenGLContext.lock(): Unit {
    val sel = ObjCRuntime.sel("lock")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** Required by Objective-C protocol NSLocking. */
fun NSOpenGLContext.unlock(): Unit {
    val sel = ObjCRuntime.sel("unlock")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSOpenGLPixelBuffer on NSOpenGLContext ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
fun NSOpenGLContext.setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen(pixelBuffer: MemorySegment, face: Int, level: Int, screen: Int): Unit {
    val sel = ObjCRuntime.sel("setPixelBuffer:cubeMapFace:mipMapLevel:currentVirtualScreen:")
    ObjCRuntime.msgSend(null, this.ptr, sel, pixelBuffer, face, level, screen)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
fun NSOpenGLContext.pixelBuffer(): MemorySegment {
    val sel = ObjCRuntime.sel("pixelBuffer")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
fun NSOpenGLContext.pixelBufferCubeMapFace(): Int {
    val sel = ObjCRuntime.sel("pixelBufferCubeMapFace")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel) as Int
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
fun NSOpenGLContext.pixelBufferMipMapLevel(): Int {
    val sel = ObjCRuntime.sel("pixelBufferMipMapLevel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel) as Int
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1)
fun NSOpenGLContext.setTextureImageToPixelBuffer_colorBuffer(pixelBuffer: MemorySegment, source: Int): Unit {
    val sel = ObjCRuntime.sel("setTextureImageToPixelBuffer:colorBuffer:")
    ObjCRuntime.msgSend(null, this.ptr, sel, pixelBuffer, source)
}
