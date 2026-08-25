package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBox
 * Superclass: NSView
 */
open class NSBox(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSBox") }

    }

    open fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun setFrameFromContentFrame(contentFrame: NSRect): Unit {
        val sel = ObjCRuntime.sel("setFrameFromContentFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(contentFrame.segment, NSRect.layout))
    }

    // @property boxType
    open fun boxType(): NSBoxType {
        val sel = ObjCRuntime.sel("boxType")
        return NSBoxType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setBoxType(value: NSBoxType) {
        val sel = ObjCRuntime.sel("setBoxType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property titlePosition
    open fun titlePosition(): NSTitlePosition {
        val sel = ObjCRuntime.sel("titlePosition")
        return NSTitlePosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTitlePosition(value: NSTitlePosition) {
        val sel = ObjCRuntime.sel("setTitlePosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property title
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property titleFont
    open fun titleFont(): MemorySegment {
        val sel = ObjCRuntime.sel("titleFont")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTitleFont(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitleFont:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderRect
    open fun borderRect(): NSRect {
        val sel = ObjCRuntime.sel("borderRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property titleRect
    open fun titleRect(): NSRect {
        val sel = ObjCRuntime.sel("titleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property titleCell
    open fun titleCell(): MemorySegment {
        val sel = ObjCRuntime.sel("titleCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contentViewMargins
    open fun contentViewMargins(): NSSize {
        val sel = ObjCRuntime.sel("contentViewMargins")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setContentViewMargins(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentViewMargins:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property contentView
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property transparent
    open fun isTransparent(): Boolean {
        val sel = ObjCRuntime.sel("isTransparent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setTransparent(value: Boolean) {
        val sel = ObjCRuntime.sel("setTransparent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderWidth
    open fun borderWidth(): Double {
        val sel = ObjCRuntime.sel("borderWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setBorderWidth(value: Double) {
        val sel = ObjCRuntime.sel("setBorderWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cornerRadius
    open fun cornerRadius(): Double {
        val sel = ObjCRuntime.sel("cornerRadius")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setCornerRadius(value: Double) {
        val sel = ObjCRuntime.sel("setCornerRadius:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderColor
    open fun borderColor(): MemorySegment {
        val sel = ObjCRuntime.sel("borderColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBorderColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBorderColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fillColor
    open fun fillColor(): MemorySegment {
        val sel = ObjCRuntime.sel("fillColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFillColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFillColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSBox ─────────────────────────────────────────

fun NSBox.setTitleWithMnemonic(stringWithAmpersand: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleWithMnemonic:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stringWithAmpersand)
}

fun NSBox.borderType(): NSBorderType {
    val sel = ObjCRuntime.sel("borderType")
    return NSBorderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSBox.setBorderType(borderType: NSBorderType): Unit {
    val sel = ObjCRuntime.sel("setBorderType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, borderType.rawValue)
}
