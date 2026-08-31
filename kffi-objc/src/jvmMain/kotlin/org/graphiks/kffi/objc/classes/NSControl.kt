@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSControl
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSControl(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSControl") } }

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
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun sizeThatFits(size: NSSize): NSSize {
        val sel = ObjCRuntime.sel("sizeThatFits:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendActionOn(mask: NSEventMask): Long {
        val sel = ObjCRuntime.sel("sendActionOn:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, mask.rawValue) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sendAction_to(action: MemorySegment, target: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("sendAction:to:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, action, target) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takeIntValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeIntValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takeFloatValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeFloatValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takeDoubleValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeDoubleValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takeStringValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeStringValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun takeObjectValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeObjectValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun takeIntegerValueFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeIntegerValueFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performClick(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performClick:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun expansionFrameWithFrame(contentFrame: NSRect): NSRect {
        val sel = ObjCRuntime.sel("expansionFrameWithFrame:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(contentFrame.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun drawWithExpansionFrame_inView(contentFrame: NSRect, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawWithExpansionFrame:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(contentFrame.segment, NSRect.layout), view)
    }

    // @property target
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property action
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun action(): MemorySegment {
        val sel = ObjCRuntime.sel("action")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tag
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun tag(): Long {
        val sel = ObjCRuntime.sel("tag")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTag(value: Long) {
        val sel = ObjCRuntime.sel("setTag:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property ignoresMultiClick
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ignoresMultiClick(): Boolean {
        val sel = ObjCRuntime.sel("ignoresMultiClick")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIgnoresMultiClick(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoresMultiClick:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property continuous
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isContinuous(): Boolean {
        val sel = ObjCRuntime.sel("isContinuous")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContinuous(value: Boolean) {
        val sel = ObjCRuntime.sel("setContinuous:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property enabled
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property refusesFirstResponder
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun refusesFirstResponder(): Boolean {
        val sel = ObjCRuntime.sel("refusesFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRefusesFirstResponder(value: Boolean) {
        val sel = ObjCRuntime.sel("setRefusesFirstResponder:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property highlighted
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun isHighlighted(): Boolean {
        val sel = ObjCRuntime.sel("isHighlighted")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setHighlighted(value: Boolean) {
        val sel = ObjCRuntime.sel("setHighlighted:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property controlSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun controlSize(): NSControlSize {
        val sel = ObjCRuntime.sel("controlSize")
        return NSControlSize(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setControlSize(value: NSControlSize) {
        val sel = ObjCRuntime.sel("setControlSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property formatter
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun formatter(): MemorySegment {
        val sel = ObjCRuntime.sel("formatter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFormatter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFormatter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property objectValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun objectValue(): MemorySegment {
        val sel = ObjCRuntime.sel("objectValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setObjectValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property stringValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringValue(): MemorySegment {
        val sel = ObjCRuntime.sel("stringValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStringValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStringValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringValueAsString(): String = ObjCRuntime.toJavaString(stringValue())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStringValue(value: String) = setStringValue(ObjCRuntime.newNSString(Arena.global(), value))

    // @property attributedStringValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributedStringValue(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedStringValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAttributedStringValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedStringValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property intValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun intValue(): Int {
        val sel = ObjCRuntime.sel("intValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIntValue(value: Int) {
        val sel = ObjCRuntime.sel("setIntValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property integerValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun integerValue(): Long {
        val sel = ObjCRuntime.sel("integerValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIntegerValue(value: Long) {
        val sel = ObjCRuntime.sel("setIntegerValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property floatValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun floatValue(): Float {
        val sel = ObjCRuntime.sel("floatValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFloatValue(value: Float) {
        val sel = ObjCRuntime.sel("setFloatValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property doubleValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun doubleValue(): Double {
        val sel = ObjCRuntime.sel("doubleValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDoubleValue(value: Double) {
        val sel = ObjCRuntime.sel("setDoubleValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property usesSingleLineMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun usesSingleLineMode(): Boolean {
        val sel = ObjCRuntime.sel("usesSingleLineMode")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setUsesSingleLineMode(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesSingleLineMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lineBreakMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun lineBreakMode(): NSLineBreakMode {
        val sel = ObjCRuntime.sel("lineBreakMode")
        return NSLineBreakMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setLineBreakMode(value: NSLineBreakMode) {
        val sel = ObjCRuntime.sel("setLineBreakMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property allowsExpansionToolTips
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun allowsExpansionToolTips(): Boolean {
        val sel = ObjCRuntime.sel("allowsExpansionToolTips")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setAllowsExpansionToolTips(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsExpansionToolTips:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSControlEditableTextMethods on NSControl ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.currentEditor(): MemorySegment {
    val sel = ObjCRuntime.sel("currentEditor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.abortEditing(): Boolean {
    val sel = ObjCRuntime.sel("abortEditing")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.validateEditing(): Unit {
    val sel = ObjCRuntime.sel("validateEditing")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSControl.editWithFrame_editor_delegate_event(rect: NSRect, textObj: MemorySegment, delegate: MemorySegment, event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("editWithFrame:editor:delegate:event:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), textObj, delegate, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSControl.selectWithFrame_editor_delegate_start_length(rect: NSRect, textObj: MemorySegment, delegate: MemorySegment, selStart: Long, selLength: Long): Unit {
    val sel = ObjCRuntime.sel("selectWithFrame:editor:delegate:start:length:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), textObj, delegate, selStart, selLength)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSControl.endEditing(textObj: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("endEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textObj)
}

// ── Category: NSDeprecated on NSControl ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSControl.setFloatingPointFormat_left_right(autoRange: Boolean, leftDigits: Long, rightDigits: Long): Unit {
    val sel = ObjCRuntime.sel("setFloatingPointFormat:left:right:")
    ObjCRuntime.msgSend(null, this.ptr, sel, autoRange, leftDigits, rightDigits)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.selectedCell(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedCell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.selectedTag(): Long {
    val sel = ObjCRuntime.sel("selectedTag")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Set the needsDisplay property to YES instead")
fun NSControl.setNeedsDisplay(): Unit {
    val sel = ObjCRuntime.sel("setNeedsDisplay")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Override -layout instead. This method should never be called")
fun NSControl.calcSize(): Unit {
    val sel = ObjCRuntime.sel("calcSize")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.updateCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("updateCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.updateCellInside(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("updateCellInside:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.drawCellInside(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawCellInside:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.drawCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.selectCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("selectCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.cell(): MemorySegment {
    val sel = ObjCRuntime.sel("cell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl.setCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}

// Class method: +[NSControl cellClass]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl_cellClass(): MemorySegment {
    val sel = ObjCRuntime.sel("cellClass")
    val cls = ObjCRuntime.getClass("NSControl")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSControl setCellClass:]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSControl_setCellClass(cellClass: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setCellClass:")
    val cls = ObjCRuntime.getClass("NSControl")
    ObjCRuntime.msgSend(null, cls, sel, cellClass)
}

// ── Category: NSConstraintBasedLayoutLayering on NSControl ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSControl.invalidateIntrinsicContentSizeForCell(cell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("invalidateIntrinsicContentSizeForCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cell)
}
