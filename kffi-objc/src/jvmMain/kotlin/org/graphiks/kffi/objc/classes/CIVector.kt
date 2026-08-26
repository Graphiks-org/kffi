package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CIVector
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class CIVector(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("CIVector") }

        fun vectorWithValues_count(values: MemorySegment, count: Long): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithValues:count:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, values, count) as MemorySegment
        }

        fun vectorWithX(x: Double): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithX:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, x) as MemorySegment
        }

        fun vectorWithX_Y(x: Double, y: Double): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithX:Y:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, x, y) as MemorySegment
        }

        fun vectorWithX_Y_Z(x: Double, y: Double, z: Double): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithX:Y:Z:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, x, y, z) as MemorySegment
        }

        fun vectorWithX_Y_Z_W(x: Double, y: Double, z: Double, w: Double): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithX:Y:Z:W:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, x, y, z, w) as MemorySegment
        }

        fun vectorWithCGPoint(p: CGPoint): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithCGPoint:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(p.segment, CGPoint.layout)) as MemorySegment
        }

        fun vectorWithCGRect(r: CGRect): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithCGRect:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(r.segment, CGRect.layout)) as MemorySegment
        }

        fun vectorWithCGAffineTransform(t: CGAffineTransform): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithCGAffineTransform:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(t.segment, CGAffineTransform.layout)) as MemorySegment
        }

        fun vectorWithString(representation: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("vectorWithString:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, representation) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun vectorWithString(representation: String): MemorySegment = vectorWithString(ObjCRuntime.newNSString(Arena.global(), representation))

    }

    open fun initWithValues_count(values: MemorySegment, count: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithValues:count:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, values, count) as MemorySegment
    }

    open fun initWithX(x: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithX:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, x) as MemorySegment
    }

    open fun initWithX_Y(x: Double, y: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithX:Y:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, x, y) as MemorySegment
    }

    open fun initWithX_Y_Z(x: Double, y: Double, z: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithX:Y:Z:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, x, y, z) as MemorySegment
    }

    open fun initWithX_Y_Z_W(x: Double, y: Double, z: Double, w: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithX:Y:Z:W:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, x, y, z, w) as MemorySegment
    }

    open fun initWithCGPoint(p: CGPoint): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGPoint:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(p.segment, CGPoint.layout)) as MemorySegment
    }

    open fun initWithCGRect(r: CGRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(r.segment, CGRect.layout)) as MemorySegment
    }

    open fun initWithCGAffineTransform(t: CGAffineTransform): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGAffineTransform:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(t.segment, CGAffineTransform.layout)) as MemorySegment
    }

    open fun initWithString(representation: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, representation) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithString(representation: String): MemorySegment = initWithString(ObjCRuntime.newNSString(Arena.global(), representation))

    open fun valueAtIndex(index: Long): Double {
        val sel = ObjCRuntime.sel("valueAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, index) as Double
    }

    // @property count
    open fun count(): Long {
        val sel = ObjCRuntime.sel("count")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property X
    open fun X(): Double {
        val sel = ObjCRuntime.sel("X")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property Y
    open fun Y(): Double {
        val sel = ObjCRuntime.sel("Y")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property Z
    open fun Z(): Double {
        val sel = ObjCRuntime.sel("Z")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property W
    open fun W(): Double {
        val sel = ObjCRuntime.sel("W")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property CGPointValue
    open fun CGPointValue(): CGPoint {
        val sel = ObjCRuntime.sel("CGPointValue")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel))
    }

    // @property CGRectValue
    open fun CGRectValue(): CGRect {
        val sel = ObjCRuntime.sel("CGRectValue")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }

    // @property CGAffineTransformValue
    open fun CGAffineTransformValue(): CGAffineTransform {
        val sel = ObjCRuntime.sel("CGAffineTransformValue")
        return CGAffineTransform(ObjCRuntime.msgSendStruct(CGAffineTransform.layout, ptr, sel))
    }

    // @property stringRepresentation
    open fun stringRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("stringRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun stringRepresentationAsString(): String = ObjCRuntime.toJavaString(stringRepresentation())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _count: Long
    // ivar: _u: MemorySegment
}

/** Required by Objective-C protocol NSCopying. */
fun CIVector.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun CIVector.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun CIVector.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun CIVector_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("CIVector")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
