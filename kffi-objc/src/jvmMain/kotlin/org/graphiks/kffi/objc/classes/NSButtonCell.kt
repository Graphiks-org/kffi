@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSButtonCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSButtonCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSButtonCell") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initTextCell(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initTextCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initImageCell(image: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initImageCell:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, image) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setButtonType(type: NSButtonType): Unit {
        val sel = ObjCRuntime.sel("setButtonType:")
        ObjCRuntime.msgSend(null, ptr, sel, type.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPeriodicDelay_interval(delay: Float, interval: Float): Unit {
        val sel = ObjCRuntime.sel("setPeriodicDelay:interval:")
        ObjCRuntime.msgSend(null, ptr, sel, delay, interval)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun getPeriodicDelay_interval(delay: MemorySegment, interval: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getPeriodicDelay:interval:")
        ObjCRuntime.msgSend(null, ptr, sel, delay, interval)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performClick(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performClick:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mouseEntered(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseEntered:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mouseExited(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mouseExited:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawBezelWithFrame_inView(frame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawBezelWithFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), controlView)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawImage_withFrame_inView(image: MemorySegment, frame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawImage:withFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, image, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), controlView)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawTitle_withFrame_inView(title: MemorySegment, frame: NSRect, controlView: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("drawTitle:withFrame:inView:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, title, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), controlView))
    }

    // @property bezelStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bezelStyle(): NSBezelStyle {
        val sel = ObjCRuntime.sel("bezelStyle")
        return NSBezelStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBezelStyle(value: NSBezelStyle) {
        val sel = ObjCRuntime.sel("setBezelStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property highlightsBy
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightsBy(): NSCellStyleMask {
        val sel = ObjCRuntime.sel("highlightsBy")
        return NSCellStyleMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHighlightsBy(value: NSCellStyleMask) {
        val sel = ObjCRuntime.sel("setHighlightsBy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property showsStateBy
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsStateBy(): NSCellStyleMask {
        val sel = ObjCRuntime.sel("showsStateBy")
        return NSCellStyleMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsStateBy(value: NSCellStyleMask) {
        val sel = ObjCRuntime.sel("setShowsStateBy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property attributedTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributedTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAttributedTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alternateTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("alternateTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAlternateTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateTitleAsString(): String = ObjCRuntime.toJavaString(alternateTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateTitle(value: String) = setAlternateTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property attributedAlternateTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributedAlternateTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedAlternateTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAttributedAlternateTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedAlternateTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alternateImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alternateImage(): MemorySegment {
        val sel = ObjCRuntime.sel("alternateImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlternateImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAlternateImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imagePosition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imagePosition(): NSCellImagePosition {
        val sel = ObjCRuntime.sel("imagePosition")
        return NSCellImagePosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImagePosition(value: NSCellImagePosition) {
        val sel = ObjCRuntime.sel("setImagePosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageScaling
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun imageScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setImageScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setImageScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property keyEquivalent
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun keyEquivalent(): MemorySegment {
        val sel = ObjCRuntime.sel("keyEquivalent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKeyEquivalent(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setKeyEquivalent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property keyEquivalentModifierMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyEquivalentModifierMask(): NSEventModifierFlags {
        val sel = ObjCRuntime.sel("keyEquivalentModifierMask")
        return NSEventModifierFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setKeyEquivalentModifierMask(value: NSEventModifierFlags) {
        val sel = ObjCRuntime.sel("setKeyEquivalentModifierMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property transparent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isTransparent(): Boolean {
        val sel = ObjCRuntime.sel("isTransparent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTransparent(value: Boolean) {
        val sel = ObjCRuntime.sel("setTransparent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property imageDimsWhenDisabled
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageDimsWhenDisabled(): Boolean {
        val sel = ObjCRuntime.sel("imageDimsWhenDisabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageDimsWhenDisabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setImageDimsWhenDisabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsBorderOnlyWhileMouseInside
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsBorderOnlyWhileMouseInside(): Boolean {
        val sel = ObjCRuntime.sel("showsBorderOnlyWhileMouseInside")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsBorderOnlyWhileMouseInside(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsBorderOnlyWhileMouseInside:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sound
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sound(): MemorySegment {
        val sel = ObjCRuntime.sel("sound")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSound(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSound:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSButtonCell ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Mnemonics are not used on macOS. Set the alternateTitle property directly instead.")
fun NSButtonCell.setAlternateTitleWithMnemonic(stringWithAmpersand: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAlternateTitleWithMnemonic:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stringWithAmpersand)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Mnemonics are not used on macOS. Calling this method has no effect.")
fun NSButtonCell.setAlternateMnemonicLocation(location: Long): Unit {
    val sel = ObjCRuntime.sel("setAlternateMnemonicLocation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, location)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Mnemonics are not used on macOS. This property always returns NSNotFound.")
fun NSButtonCell.alternateMnemonicLocation(): Long {
    val sel = ObjCRuntime.sel("alternateMnemonicLocation")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Mnemonics are not used on macOS. This property always returns an empty string.")
fun NSButtonCell.alternateMnemonic(): MemorySegment {
    val sel = ObjCRuntime.sel("alternateMnemonic")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The keyEquivalentFont property is no longer used. Setting it has no effect.")
fun NSButtonCell.setKeyEquivalentFont_size(fontName: MemorySegment, fontSize: Double): Unit {
    val sel = ObjCRuntime.sel("setKeyEquivalentFont:size:")
    ObjCRuntime.msgSend(null, this.ptr, sel, fontName, fontSize)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "The gradientType property is unused, and setting it has no effect.")
fun NSButtonCell.gradientType(): NSGradientType {
    val sel = ObjCRuntime.sel("gradientType")
    return NSGradientType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "The gradientType property is unused, and setting it has no effect.")
fun NSButtonCell.setGradientType(gradientType: NSGradientType): Unit {
    val sel = ObjCRuntime.sel("setGradientType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, gradientType.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The keyEquivalentFont property is no longer used. It always returns the NSButtonCell's font, and setting it has no effect.")
fun NSButtonCell.keyEquivalentFont(): MemorySegment {
    val sel = ObjCRuntime.sel("keyEquivalentFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "The keyEquivalentFont property is no longer used. It always returns the NSButtonCell's font, and setting it has no effect.")
fun NSButtonCell.setKeyEquivalentFont(keyEquivalentFont: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setKeyEquivalentFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, keyEquivalentFont)
}
