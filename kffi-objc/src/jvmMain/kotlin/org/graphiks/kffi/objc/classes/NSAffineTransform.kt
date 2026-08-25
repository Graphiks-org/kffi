package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAffineTransform
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSAffineTransform(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAffineTransform") }

        fun transform(): MemorySegment {
            val sel = ObjCRuntime.sel("transform")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun initWithTransform(transform: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTransform:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, transform) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun translateXBy_yBy(deltaX: Double, deltaY: Double): Unit {
        val sel = ObjCRuntime.sel("translateXBy:yBy:")
        ObjCRuntime.msgSend(null, ptr, sel, deltaX, deltaY)
    }

    open fun rotateByDegrees(angle: Double): Unit {
        val sel = ObjCRuntime.sel("rotateByDegrees:")
        ObjCRuntime.msgSend(null, ptr, sel, angle)
    }

    open fun rotateByRadians(angle: Double): Unit {
        val sel = ObjCRuntime.sel("rotateByRadians:")
        ObjCRuntime.msgSend(null, ptr, sel, angle)
    }

    open fun scaleBy(scale: Double): Unit {
        val sel = ObjCRuntime.sel("scaleBy:")
        ObjCRuntime.msgSend(null, ptr, sel, scale)
    }

    open fun scaleXBy_yBy(scaleX: Double, scaleY: Double): Unit {
        val sel = ObjCRuntime.sel("scaleXBy:yBy:")
        ObjCRuntime.msgSend(null, ptr, sel, scaleX, scaleY)
    }

    open fun invert(): Unit {
        val sel = ObjCRuntime.sel("invert")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun appendTransform(transform: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendTransform:")
        ObjCRuntime.msgSend(null, ptr, sel, transform)
    }

    open fun prependTransform(transform: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("prependTransform:")
        ObjCRuntime.msgSend(null, ptr, sel, transform)
    }

    open fun transformPoint(aPoint: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("transformPoint:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(aPoint.segment, NSPoint.layout)))
    }

    open fun transformSize(aSize: NSSize): NSSize {
        val sel = ObjCRuntime.sel("transformSize:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(aSize.segment, NSSize.layout)))
    }

    // @property transformStruct
    open fun transformStruct(): NSAffineTransformStruct {
        val sel = ObjCRuntime.sel("transformStruct")
        return NSAffineTransformStruct(ObjCRuntime.msgSendStruct(NSAffineTransformStruct.layout, ptr, sel))
    }
    open fun setTransformStruct(value: NSAffineTransformStruct) {
        val sel = ObjCRuntime.sel("setTransformStruct:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSAffineTransformStruct.layout))
    }

}

// ── Category: NSAppKitAdditions on NSAffineTransform ─────────────────────────────────────────

fun NSAffineTransform.transformBezierPath(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("transformBezierPath:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path) as MemorySegment
}

fun NSAffineTransform.`set`(): Unit {
    val sel = ObjCRuntime.sel("set")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSAffineTransform.concat(): Unit {
    val sel = ObjCRuntime.sel("concat")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}
