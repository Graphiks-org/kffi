package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CAOpenGLLayer
 * Superclass: CALayer
 */
open class CAOpenGLLayer(override val ptr: MemorySegment) : CALayer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("CAOpenGLLayer") }

    }

    open fun canDrawInCGLContext_pixelFormat_forLayerTime_displayTime(ctx: CGLContextObj, pf: CGLPixelFormatObj, t: Double, ts: CVTimeStampPointer): Boolean {
        val sel = ObjCRuntime.sel("canDrawInCGLContext:pixelFormat:forLayerTime:displayTime:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ctx.segment, pf.segment, t, ts.segment) as Boolean
    }

    open fun drawInCGLContext_pixelFormat_forLayerTime_displayTime(ctx: CGLContextObj, pf: CGLPixelFormatObj, t: Double, ts: CVTimeStampPointer): Unit {
        val sel = ObjCRuntime.sel("drawInCGLContext:pixelFormat:forLayerTime:displayTime:")
        ObjCRuntime.msgSend(null, ptr, sel, ctx.segment, pf.segment, t, ts.segment)
    }

    open fun copyCGLPixelFormatForDisplayMask(mask: Int): CGLPixelFormatObj {
        val sel = ObjCRuntime.sel("copyCGLPixelFormatForDisplayMask:")
        return CGLPixelFormatObj(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, mask) as MemorySegment)
    }

    open fun releaseCGLPixelFormat(pf: CGLPixelFormatObj): Unit {
        val sel = ObjCRuntime.sel("releaseCGLPixelFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, pf.segment)
    }

    open fun copyCGLContextForPixelFormat(pf: CGLPixelFormatObj): CGLContextObj {
        val sel = ObjCRuntime.sel("copyCGLContextForPixelFormat:")
        return CGLContextObj(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pf.segment) as MemorySegment)
    }

    open fun releaseCGLContext(ctx: CGLContextObj): Unit {
        val sel = ObjCRuntime.sel("releaseCGLContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ctx.segment)
    }

    // @property asynchronous
    open fun isAsynchronous(): Boolean {
        val sel = ObjCRuntime.sel("isAsynchronous")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAsynchronous(value: Boolean) {
        val sel = ObjCRuntime.sel("setAsynchronous:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorspace
    open fun colorspace(): CGColorSpaceRef {
        val sel = ObjCRuntime.sel("colorspace")
        return CGColorSpaceRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setColorspace(value: CGColorSpaceRef) {
        val sel = ObjCRuntime.sel("setColorspace:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property wantsExtendedDynamicRangeContent
    override fun wantsExtendedDynamicRangeContent(): Boolean {
        val sel = ObjCRuntime.sel("wantsExtendedDynamicRangeContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    override fun setWantsExtendedDynamicRangeContent(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsExtendedDynamicRangeContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _glPriv: MemorySegment
}
