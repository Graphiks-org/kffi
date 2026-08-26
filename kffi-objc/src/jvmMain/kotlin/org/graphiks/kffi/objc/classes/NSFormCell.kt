package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFormCell
 * Superclass: NSActionCell
 */
open class NSFormCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFormCell") }

    }

    override fun initTextCell(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    override fun initImageCell(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initImageCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    open fun titleWidth(size: NSSize): Double {
        val sel = ObjCRuntime.sel("titleWidth:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)) as Double
    }

    // @property titleWidth
    open fun titleWidth(): Double {
        val sel = ObjCRuntime.sel("titleWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setTitleWidth(value: Double) {
        val sel = ObjCRuntime.sel("setTitleWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property title
    override fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    override fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property titleFont
    open fun titleFont(): MemorySegment {
        val sel = ObjCRuntime.sel("titleFont")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTitleFont(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitleFont:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    override fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property placeholderString
    open fun placeholderString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPlaceholderString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun placeholderStringAsString(): String = ObjCRuntime.toJavaString(placeholderString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPlaceholderString(value: String) = setPlaceholderString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property placeholderAttributedString
    open fun placeholderAttributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPlaceholderAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property titleAlignment
    open fun titleAlignment(): NSTextAlignment {
        val sel = ObjCRuntime.sel("titleAlignment")
        return NSTextAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTitleAlignment(value: NSTextAlignment) {
        val sel = ObjCRuntime.sel("setTitleAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property titleBaseWritingDirection
    open fun titleBaseWritingDirection(): NSWritingDirection {
        val sel = ObjCRuntime.sel("titleBaseWritingDirection")
        return NSWritingDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTitleBaseWritingDirection(value: NSWritingDirection) {
        val sel = ObjCRuntime.sel("setTitleBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property preferredTextFieldWidth
    open fun preferredTextFieldWidth(): Double {
        val sel = ObjCRuntime.sel("preferredTextFieldWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setPreferredTextFieldWidth(value: Double) {
        val sel = ObjCRuntime.sel("setPreferredTextFieldWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSKeyboardUI on NSFormCell ─────────────────────────────────────────

// ── Category: NSFormCellAttributedStringMethods on NSFormCell ─────────────────────────────────────────

fun NSFormCell.attributedTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSFormCell.setAttributedTitle(attributedTitle: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedTitle)
}
