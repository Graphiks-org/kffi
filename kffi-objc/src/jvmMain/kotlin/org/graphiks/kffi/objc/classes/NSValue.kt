package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSValue
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSValue(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSValue") }

    }

    open fun getValue_size(value: MemorySegment, size: Long): Unit {
        val sel = ObjCRuntime.sel("getValue:size:")
        ObjCRuntime.msgSend(null, ptr, sel, value, size)
    }

    open fun initWithBytes_objCType(value: MemorySegment, type: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithBytes:objCType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, value, type) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property objCType
    open fun objCType(): MemorySegment {
        val sel = ObjCRuntime.sel("objCType")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSValue.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSValue.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSValue_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSValueCreation on NSValue ─────────────────────────────────────────

// Class method: +[NSValue valueWithBytes:objCType:]
fun NSValue_valueWithBytes_objCType(value: MemorySegment, type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithBytes:objCType:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, value, type) as MemorySegment
}

// Class method: +[NSValue value:withObjCType:]
fun NSValue_value_withObjCType(value: MemorySegment, type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("value:withObjCType:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, value, type) as MemorySegment
}

// ── Category: NSValueExtensionMethods on NSValue ─────────────────────────────────────────

fun NSValue.isEqualToValue(value: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToValue:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, value) as Boolean
}

fun NSValue.nonretainedObjectValue(): MemorySegment {
    val sel = ObjCRuntime.sel("nonretainedObjectValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSValue.pointerValue(): MemorySegment {
    val sel = ObjCRuntime.sel("pointerValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSValue valueWithNonretainedObject:]
fun NSValue_valueWithNonretainedObject(anObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithNonretainedObject:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, anObject) as MemorySegment
}

// Class method: +[NSValue valueWithPointer:]
fun NSValue_valueWithPointer(pointer: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithPointer:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, pointer) as MemorySegment
}

// ── Category: NSDeprecated on NSValue ─────────────────────────────────────────

fun NSValue.getValue(value: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

// ── Category: NSValueRangeExtensions on NSValue ─────────────────────────────────────────

fun NSValue.rangeValue(): NSRange {
    val sel = ObjCRuntime.sel("rangeValue")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

// Class method: +[NSValue valueWithRange:]
fun NSValue_valueWithRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithRange:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

// ── Category: NSValueGeometryExtensions on NSValue ─────────────────────────────────────────

fun NSValue.pointValue(): NSPoint {
    val sel = ObjCRuntime.sel("pointValue")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}

fun NSValue.sizeValue(): NSSize {
    val sel = ObjCRuntime.sel("sizeValue")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

fun NSValue.rectValue(): NSRect {
    val sel = ObjCRuntime.sel("rectValue")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

fun NSValue.edgeInsetsValue(): NSEdgeInsets {
    val sel = ObjCRuntime.sel("edgeInsetsValue")
    return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, this.ptr, sel))
}

// Class method: +[NSValue valueWithPoint:]
fun NSValue_valueWithPoint(point: NSPoint): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithPoint:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
}

// Class method: +[NSValue valueWithSize:]
fun NSValue_valueWithSize(size: NSSize): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithSize:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)) as MemorySegment
}

// Class method: +[NSValue valueWithRect:]
fun NSValue_valueWithRect(rect: NSRect): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithRect:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
}

// Class method: +[NSValue valueWithEdgeInsets:]
fun NSValue_valueWithEdgeInsets(insets: NSEdgeInsets): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithEdgeInsets:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(insets.segment, NSEdgeInsets.layout)) as MemorySegment
}

// ── Category: CATransform3DAdditions on NSValue ─────────────────────────────────────────

fun NSValue.CATransform3DValue(): CATransform3D {
    val sel = ObjCRuntime.sel("CATransform3DValue")
    return CATransform3D(ObjCRuntime.msgSendStruct(CATransform3D.layout, this.ptr, sel))
}

// Class method: +[NSValue valueWithCATransform3D:]
fun NSValue_valueWithCATransform3D(t: CATransform3D): MemorySegment {
    val sel = ObjCRuntime.sel("valueWithCATransform3D:")
    val cls = ObjCRuntime.getClass("NSValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(t.segment, CATransform3D.layout)) as MemorySegment
}
