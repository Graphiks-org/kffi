@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSText
 * Superclass: NSView
 * Protocols: NSChangeSpelling, NSIgnoreMisspelledWords
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSText(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSText") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun replaceCharactersInRange_withString(range: NSRange, string: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceCharactersInRange:withString:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), string)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun replaceCharactersInRange_withString(range: NSRange, string: String): Unit = replaceCharactersInRange_withString(range, ObjCRuntime.newNSString(Arena.global(), string))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun replaceCharactersInRange_withRTF(range: NSRange, rtfData: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceCharactersInRange:withRTF:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), rtfData)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun replaceCharactersInRange_withRTFD(range: NSRange, rtfdData: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceCharactersInRange:withRTFD:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), rtfdData)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun RTFFromRange(range: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("RTFFromRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun RTFDFromRange(range: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("RTFDFromRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writeRTFDToFile_atomically(path: MemorySegment, flag: Boolean): Boolean {
        val sel = ObjCRuntime.sel("writeRTFDToFile:atomically:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, path, flag) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writeRTFDToFile_atomically(path: String, flag: Boolean): Boolean = writeRTFDToFile_atomically(ObjCRuntime.newNSString(Arena.global(), path), flag)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun readRTFDFromFile(path: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("readRTFDFromFile:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, path) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun readRTFDFromFile(path: String): Boolean = readRTFDFromFile(ObjCRuntime.newNSString(Arena.global(), path))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollRangeToVisible(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("scrollRangeToVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextColor_range(color: MemorySegment, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setTextColor:range:")
        ObjCRuntime.msgSend(null, ptr, sel, color, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFont_range(font: MemorySegment, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setFont:range:")
        ObjCRuntime.msgSend(null, ptr, sel, font, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun copy(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("copy:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun copyFont(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("copyFont:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun copyRuler(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("copyRuler:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cut(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("cut:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delete(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("delete:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun paste(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("paste:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pasteFont(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("pasteFont:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pasteRuler(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("pasteRuler:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectAll(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectAll:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun changeFont(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeFont:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignLeft(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("alignLeft:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignRight(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("alignRight:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignCenter(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("alignCenter:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun subscript(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("subscript:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun superscript(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("superscript:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun underline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("underline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun unscript(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unscript:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showGuessPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showGuessPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkSpelling(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("checkSpelling:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun toggleRuler(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleRuler:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property string
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun string(): MemorySegment {
        val sel = ObjCRuntime.sel("string")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringAsString(): String = ObjCRuntime.toJavaString(string())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setString(value: String) = setString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property delegate
    /** @return id<NSTextDelegate> */
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

    // @property richText
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isRichText(): Boolean {
        val sel = ObjCRuntime.sel("isRichText")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRichText(value: Boolean) {
        val sel = ObjCRuntime.sel("setRichText:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property importsGraphics
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun importsGraphics(): Boolean {
        val sel = ObjCRuntime.sel("importsGraphics")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImportsGraphics(value: Boolean) {
        val sel = ObjCRuntime.sel("setImportsGraphics:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fieldEditor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFieldEditor(): Boolean {
        val sel = ObjCRuntime.sel("isFieldEditor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFieldEditor(value: Boolean) {
        val sel = ObjCRuntime.sel("setFieldEditor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesFontPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun usesFontPanel(): Boolean {
        val sel = ObjCRuntime.sel("usesFontPanel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setUsesFontPanel(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesFontPanel:")
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

    // @property rulerVisible
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isRulerVisible(): Boolean {
        val sel = ObjCRuntime.sel("isRulerVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property selectedRange
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedRange(): NSRange {
        val sel = ObjCRuntime.sel("selectedRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectedRange(value: NSRange) {
        val sel = ObjCRuntime.sel("setSelectedRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
    }

    // @property font
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun font(): MemorySegment {
        val sel = ObjCRuntime.sel("font")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFont(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFont:")
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

    // @property alignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignment(): NSTextAlignment {
        val sel = ObjCRuntime.sel("alignment")
        return NSTextAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlignment(value: NSTextAlignment) {
        val sel = ObjCRuntime.sel("setAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property baseWritingDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun baseWritingDirection(): NSWritingDirection {
        val sel = ObjCRuntime.sel("baseWritingDirection")
        return NSWritingDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBaseWritingDirection(value: NSWritingDirection) {
        val sel = ObjCRuntime.sel("setBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property maxSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxSize(): NSSize {
        val sel = ObjCRuntime.sel("maxSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaxSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property minSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minSize(): NSSize {
        val sel = ObjCRuntime.sel("minSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property horizontallyResizable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isHorizontallyResizable(): Boolean {
        val sel = ObjCRuntime.sel("isHorizontallyResizable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHorizontallyResizable(value: Boolean) {
        val sel = ObjCRuntime.sel("setHorizontallyResizable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property verticallyResizable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isVerticallyResizable(): Boolean {
        val sel = ObjCRuntime.sel("isVerticallyResizable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticallyResizable(value: Boolean) {
        val sel = ObjCRuntime.sel("setVerticallyResizable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSChangeSpelling. */
fun NSText.changeSpelling(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("changeSpelling:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** Required by Objective-C protocol NSIgnoreMisspelledWords. */
fun NSText.ignoreSpelling(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("ignoreSpelling:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}
