@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextField
 * Superclass: NSControl
 * Protocols: NSUserInterfaceValidations, NSAccessibilityNavigableStaticText, NSTextContent
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTextField(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextField") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectText(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectText:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textShouldBeginEditing(textObject: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("textShouldBeginEditing:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, textObject) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textShouldEndEditing(textObject: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("textShouldEndEditing:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, textObject) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textDidBeginEditing(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textDidBeginEditing:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textDidEndEditing(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textDidEndEditing:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textDidChange(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textDidChange:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    // @property placeholderString
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun placeholderString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setPlaceholderString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun placeholderStringAsString(): String = ObjCRuntime.toJavaString(placeholderString())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setPlaceholderString(value: String) = setPlaceholderString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property placeholderAttributedString
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun placeholderAttributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setPlaceholderAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedString:")
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

    // @property drawsBackground
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawsBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDrawsBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textColor(): MemorySegment {
        val sel = ObjCRuntime.sel("textColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bordered
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isBordered(): Boolean {
        val sel = ObjCRuntime.sel("isBordered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBordered(value: Boolean) {
        val sel = ObjCRuntime.sel("setBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bezeled
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isBezeled(): Boolean {
        val sel = ObjCRuntime.sel("isBezeled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBezeled(value: Boolean) {
        val sel = ObjCRuntime.sel("setBezeled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property editable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEditable(): Boolean {
        val sel = ObjCRuntime.sel("isEditable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEditable(value: Boolean) {
        val sel = ObjCRuntime.sel("setEditable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSelectable(): Boolean {
        val sel = ObjCRuntime.sel("isSelectable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectable(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelectable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSTextFieldDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property acceptsFirstResponder
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun acceptsFirstResponder(): Boolean {
        val sel = ObjCRuntime.sel("acceptsFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property bezelStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bezelStyle(): NSTextFieldBezelStyle {
        val sel = ObjCRuntime.sel("bezelStyle")
        return NSTextFieldBezelStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBezelStyle(value: NSTextFieldBezelStyle) {
        val sel = ObjCRuntime.sel("setBezelStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property preferredMaxLayoutWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun preferredMaxLayoutWidth(): Double {
        val sel = ObjCRuntime.sel("preferredMaxLayoutWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setPreferredMaxLayoutWidth(value: Double) {
        val sel = ObjCRuntime.sel("setPreferredMaxLayoutWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfLines
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun maximumNumberOfLines(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfLines")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setMaximumNumberOfLines(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfLines:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsDefaultTighteningForTruncation
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun allowsDefaultTighteningForTruncation(): Boolean {
        val sel = ObjCRuntime.sel("allowsDefaultTighteningForTruncation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setAllowsDefaultTighteningForTruncation(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsDefaultTighteningForTruncation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lineBreakStrategy
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun lineBreakStrategy(): NSLineBreakStrategy {
        val sel = ObjCRuntime.sel("lineBreakStrategy")
        return NSLineBreakStrategy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun setLineBreakStrategy(value: NSLineBreakStrategy) {
        val sel = ObjCRuntime.sel("setLineBreakStrategy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property allowsWritingTools
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun allowsWritingTools(): Boolean {
        val sel = ObjCRuntime.sel("allowsWritingTools")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    open fun setAllowsWritingTools(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsWritingTools:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsWritingToolsAffordance
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun allowsWritingToolsAffordance(): Boolean {
        val sel = ObjCRuntime.sel("allowsWritingToolsAffordance")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun setAllowsWritingToolsAffordance(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsWritingToolsAffordance:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property placeholderStrings
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun placeholderStrings(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderStrings")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setPlaceholderStrings(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderStrings:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property placeholderAttributedStrings
    /** @return NSArray<NSAttributedString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun placeholderAttributedStrings(): MemorySegment {
        val sel = ObjCRuntime.sel("placeholderAttributedStrings")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setPlaceholderAttributedStrings(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlaceholderAttributedStrings:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property resolvesNaturalAlignmentWithBaseWritingDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun resolvesNaturalAlignmentWithBaseWritingDirection(): Boolean {
        val sel = ObjCRuntime.sel("resolvesNaturalAlignmentWithBaseWritingDirection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setResolvesNaturalAlignmentWithBaseWritingDirection(value: Boolean) {
        val sel = ObjCRuntime.sel("setResolvesNaturalAlignmentWithBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSUserInterfaceValidations. */
fun NSTextField.validateUserInterfaceItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

/**
 * Required by Objective-C protocol NSTextContent.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSTextField.contentType(): MemorySegment {
    val sel = ObjCRuntime.sel("contentType")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSTextField.setContentType(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setContentType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

// ── Category: NSTouchBar on NSTextField ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextField.isAutomaticTextCompletionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticTextCompletionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextField.setAutomaticTextCompletionEnabled(automaticTextCompletionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticTextCompletionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticTextCompletionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextField.allowsCharacterPickerTouchBarItem(): Boolean {
    val sel = ObjCRuntime.sel("allowsCharacterPickerTouchBarItem")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextField.setAllowsCharacterPickerTouchBarItem(allowsCharacterPickerTouchBarItem: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsCharacterPickerTouchBarItem:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsCharacterPickerTouchBarItem)
}

// ── Category: NSTextFieldConvenience on NSTextField ─────────────────────────────────────────

// Class method: +[NSTextField labelWithString:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSTextField_labelWithString(stringValue: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("labelWithString:")
    val cls = ObjCRuntime.getClass("NSTextField")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, stringValue) as MemorySegment
}

// Class method: +[NSTextField wrappingLabelWithString:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSTextField_wrappingLabelWithString(stringValue: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("wrappingLabelWithString:")
    val cls = ObjCRuntime.getClass("NSTextField")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, stringValue) as MemorySegment
}

// Class method: +[NSTextField labelWithAttributedString:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSTextField_labelWithAttributedString(attributedStringValue: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("labelWithAttributedString:")
    val cls = ObjCRuntime.getClass("NSTextField")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, attributedStringValue) as MemorySegment
}

// Class method: +[NSTextField textFieldWithString:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSTextField_textFieldWithString(stringValue: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("textFieldWithString:")
    val cls = ObjCRuntime.getClass("NSTextField")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, stringValue) as MemorySegment
}

// ── Category: NSTextFieldAttributedStringMethods on NSTextField ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextField.allowsEditingTextAttributes(): Boolean {
    val sel = ObjCRuntime.sel("allowsEditingTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextField.setAllowsEditingTextAttributes(allowsEditingTextAttributes: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsEditingTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsEditingTextAttributes)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextField.importsGraphics(): Boolean {
    val sel = ObjCRuntime.sel("importsGraphics")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextField.setImportsGraphics(importsGraphics: Boolean): Unit {
    val sel = ObjCRuntime.sel("setImportsGraphics:")
    ObjCRuntime.msgSend(null, this.ptr, sel, importsGraphics)
}

// ── Category: NSDeprecated on NSTextField ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "Use `-setTitle:` instead")
fun NSTextField.setTitleWithMnemonic(stringWithAmpersand: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitleWithMnemonic:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stringWithAmpersand)
}
