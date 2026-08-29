@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBox
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSBox(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSBox") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameFromContentFrame(contentFrame: NSRect): Unit {
        val sel = ObjCRuntime.sel("setFrameFromContentFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(contentFrame.segment, NSRect.layout))
    }

    // @property boxType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun boxType(): NSBoxType {
        val sel = ObjCRuntime.sel("boxType")
        return NSBoxType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBoxType(value: NSBoxType) {
        val sel = ObjCRuntime.sel("setBoxType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property titlePosition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titlePosition(): NSTitlePosition {
        val sel = ObjCRuntime.sel("titlePosition")
        return NSTitlePosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitlePosition(value: NSTitlePosition) {
        val sel = ObjCRuntime.sel("setTitlePosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

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

    // @property borderRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun borderRect(): NSRect {
        val sel = ObjCRuntime.sel("borderRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property titleRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleRect(): NSRect {
        val sel = ObjCRuntime.sel("titleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property titleCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleCell(): MemorySegment {
        val sel = ObjCRuntime.sel("titleCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contentViewMargins
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentViewMargins(): NSSize {
        val sel = ObjCRuntime.sel("contentViewMargins")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentViewMargins(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentViewMargins:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property contentView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property transparent
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun isTransparent(): Boolean {
        val sel = ObjCRuntime.sel("isTransparent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setTransparent(value: Boolean) {
        val sel = ObjCRuntime.sel("setTransparent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun borderWidth(): Double {
        val sel = ObjCRuntime.sel("borderWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setBorderWidth(value: Double) {
        val sel = ObjCRuntime.sel("setBorderWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property cornerRadius
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun cornerRadius(): Double {
        val sel = ObjCRuntime.sel("cornerRadius")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setCornerRadius(value: Double) {
        val sel = ObjCRuntime.sel("setCornerRadius:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property borderColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun borderColor(): MemorySegment {
        val sel = ObjCRuntime.sel("borderColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setBorderColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBorderColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fillColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun fillColor(): MemorySegment {
        val sel = ObjCRuntime.sel("fillColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setFillColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFillColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSBox ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1)
fun NSBox.setTitleWithMnemonic(stringWithAmpersand: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleWithMnemonic:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stringWithAmpersand)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "borderType is only applicable to NSBoxOldStyle, which is deprecated. To replace a borderType of NSNoBorder, use the `transparent` property.")
fun NSBox.borderType(): NSBorderType {
    val sel = ObjCRuntime.sel("borderType")
    return NSBorderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "borderType is only applicable to NSBoxOldStyle, which is deprecated. To replace a borderType of NSNoBorder, use the `transparent` property.")
fun NSBox.setBorderType(borderType: NSBorderType): Unit {
    val sel = ObjCRuntime.sel("setBorderType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, borderType.rawValue)
}
