@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFormCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSFormCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFormCell") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initTextCell(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun initImageCell(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initImageCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleWidth(size: NSSize): Double {
        val sel = ObjCRuntime.sel("titleWidth:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)) as Double
    }

    // @property titleWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleWidth(): Double {
        val sel = ObjCRuntime.sel("titleWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleWidth(value: Double) {
        val sel = ObjCRuntime.sel("setTitleWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property titleFont
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleFont(): MemorySegment {
        val sel = ObjCRuntime.sel("titleFont")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleFont(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitleFont:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property placeholderString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderStringAsString(): String = ObjCRuntime.toJavaString(placeholderString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderString(value: String) = setPlaceholderString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property placeholderAttributedString
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun placeholderAttributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPlaceholderAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property titleAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleAlignment(): NSTextAlignment {
        val sel = ObjCRuntime.sel("titleAlignment")
        return NSTextAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleAlignment(value: NSTextAlignment) {
        val sel = ObjCRuntime.sel("setTitleAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property titleBaseWritingDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleBaseWritingDirection(): NSWritingDirection {
        val sel = ObjCRuntime.sel("titleBaseWritingDirection")
        return NSWritingDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleBaseWritingDirection(value: NSWritingDirection) {
        val sel = ObjCRuntime.sel("setTitleBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property preferredTextFieldWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun preferredTextFieldWidth(): Double {
        val sel = ObjCRuntime.sel("preferredTextFieldWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setPreferredTextFieldWidth(value: Double) {
        val sel = ObjCRuntime.sel("setPreferredTextFieldWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSKeyboardUI on NSFormCell ─────────────────────────────────────────

// ── Category: NSFormCellAttributedStringMethods on NSFormCell ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFormCell.attributedTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFormCell.setAttributedTitle(attributedTitle: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedTitle)
}
