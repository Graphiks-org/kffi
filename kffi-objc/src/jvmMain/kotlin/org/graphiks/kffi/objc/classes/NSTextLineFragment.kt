package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextLineFragment
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
open class NSTextLineFragment(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextLineFragment") }

    }

    open fun initWithAttributedString_range(attributedString: MemorySegment, range: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("initWithAttributedString:range:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributedString, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
    }

    open fun initWithCoder(aDecoder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, aDecoder) as MemorySegment
    }

    open fun initWithString_attributes_range(string: MemorySegment, attributes: MemorySegment, range: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("initWithString:attributes:range:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string, attributes, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithString_attributes_range(string: String, attributes: MemorySegment, range: NSRange): MemorySegment = initWithString_attributes_range(ObjCRuntime.newNSString(Arena.global(), string), attributes, range)

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun drawAtPoint_inContext(point: CGPoint, context: CGContextRef): Unit {
        val sel = ObjCRuntime.sel("drawAtPoint:inContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout), context.segment)
    }

    open fun locationForCharacterAtIndex(index: Long): CGPoint {
        val sel = ObjCRuntime.sel("locationForCharacterAtIndex:")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel, index))
    }

    open fun characterIndexForPoint(point: CGPoint): Long {
        val sel = ObjCRuntime.sel("characterIndexForPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout)) as Long
    }

    open fun fractionOfDistanceThroughGlyphForPoint(point: CGPoint): Double {
        val sel = ObjCRuntime.sel("fractionOfDistanceThroughGlyphForPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout)) as Double
    }

    // @property attributedString
    open fun attributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property characterRange
    open fun characterRange(): NSRange {
        val sel = ObjCRuntime.sel("characterRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property typographicBounds
    open fun typographicBounds(): CGRect {
        val sel = ObjCRuntime.sel("typographicBounds")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }

    // @property glyphOrigin
    open fun glyphOrigin(): CGPoint {
        val sel = ObjCRuntime.sel("glyphOrigin")
        return CGPoint(ObjCRuntime.msgSendStruct(CGPoint.layout, ptr, sel))
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSTextLineFragment.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTextLineFragment_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTextLineFragment")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
