@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextView
 * Superclass: NSText
 * Protocols: NSColorChanging, NSMenuItemValidation, NSUserInterfaceValidations, NSTextInputClient, NSTextLayoutOrientationProvider, NSDraggingSource, NSStandardKeyBindingResponding, NSTextInput, NSAccessibilityNavigableStaticText, NSTextContent
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTextView(override val ptr: MemorySegment) : NSText(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextView") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun textViewUsingTextLayoutManager(usingTextLayoutManager: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("textViewUsingTextLayoutManager:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, usingTextLayoutManager) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun stronglyReferencesTextStorage(): Boolean {
            val sel = ObjCRuntime.sel("stronglyReferencesTextStorage")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFrame_textContainer(frameRect: NSRect, container: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:textContainer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), container) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initUsingTextLayoutManager(usingTextLayoutManager: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initUsingTextLayoutManager:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, usingTextLayoutManager) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun replaceTextContainer(newContainer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, newContainer)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateTextContainerOrigin(): Unit {
        val sel = ObjCRuntime.sel("invalidateTextContainerOrigin")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -insertText:replacementRange: from NSTextInputClient instead. Since the method is designed to be used solely by the input system, the message should never be sent to a text view from applications. Any content modifications should be via either NSTextStorage or NSText methods.")
    open fun insertText(insertString: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertText:")
        ObjCRuntime.msgSend(null, ptr, sel, insertString)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setConstrainedFrameSize(desiredSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("setConstrainedFrameSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(desiredSize.segment, NSSize.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlignment_range(alignment: NSTextAlignment, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setAlignment:range:")
        ObjCRuntime.msgSend(null, ptr, sel, alignment.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBaseWritingDirection_range(writingDirection: NSWritingDirection, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setBaseWritingDirection:range:")
        ObjCRuntime.msgSend(null, ptr, sel, writingDirection.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun turnOffKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("turnOffKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tightenKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("tightenKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun loosenKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("loosenKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun useStandardKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("useStandardKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun turnOffLigatures(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("turnOffLigatures:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun useStandardLigatures(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("useStandardLigatures:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun useAllLigatures(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("useAllLigatures:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun raiseBaseline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("raiseBaseline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun lowerBaseline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("lowerBaseline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use the traditional shaped characters encoded in the Unicode standard. Access the characters via the character palette.")
    open fun toggleTraditionalCharacterShape(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleTraditionalCharacterShape:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun outline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("outline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performFindPanelAction(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performFindPanelAction:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignJustified(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("alignJustified:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun changeColor(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeColor:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun changeAttributes(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun changeDocumentBackgroundColor(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeDocumentBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFrontSpacingPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontSpacingPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFrontLinkPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontLinkPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFrontListPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontListPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFrontTablePanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontTablePanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_didMoveMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:didMoveMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, marker)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_didRemoveMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:didRemoveMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, marker)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_didAddMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:didAddMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, marker)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_shouldMoveMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("rulerView:shouldMoveMarker:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ruler, marker) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_shouldAddMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("rulerView:shouldAddMarker:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ruler, marker) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_willMoveMarker_toLocation(ruler: MemorySegment, marker: MemorySegment, location: Double): Double {
        val sel = ObjCRuntime.sel("rulerView:willMoveMarker:toLocation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ruler, marker, location) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_shouldRemoveMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("rulerView:shouldRemoveMarker:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ruler, marker) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_willAddMarker_atLocation(ruler: MemorySegment, marker: MemorySegment, location: Double): Double {
        val sel = ObjCRuntime.sel("rulerView:willAddMarker:atLocation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ruler, marker, location) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rulerView_handleMouseDown(ruler: MemorySegment, event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:handleMouseDown:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, event)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNeedsDisplayInRect_avoidAdditionalLayout(rect: NSRect, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setNeedsDisplayInRect:avoidAdditionalLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawInsertionPointInRect_color_turnedOn(rect: NSRect, color: MemorySegment, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("drawInsertionPointInRect:color:turnedOn:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), color, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawViewBackgroundInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawViewBackgroundInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateRuler(): Unit {
        val sel = ObjCRuntime.sel("updateRuler")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateFontPanel(): Unit {
        val sel = ObjCRuntime.sel("updateFontPanel")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateDragTypeRegistration(): Unit {
        val sel = ObjCRuntime.sel("updateDragTypeRegistration")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionRangeForProposedRange_granularity(proposedCharRange: NSRange, granularity: NSSelectionGranularity): NSRange {
        val sel = ObjCRuntime.sel("selectionRangeForProposedRange:granularity:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(proposedCharRange.segment, NSRange.layout), granularity.rawValue))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clickedOnLink_atIndex(link: MemorySegment, charIndex: Long): Unit {
        val sel = ObjCRuntime.sel("clickedOnLink:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, link, charIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun startSpeaking(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("startSpeaking:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stopSpeaking(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("stopSpeaking:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setLayoutOrientation(orientation: NSTextLayoutOrientation): Unit {
        val sel = ObjCRuntime.sel("setLayoutOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, orientation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun changeLayoutOrientation(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeLayoutOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun characterIndexForInsertionAtPoint(point: NSPoint): Long {
        val sel = ObjCRuntime.sel("characterIndexForInsertionAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun performValidatedReplacementInRange_withAttributedString(range: NSRange, attributedString: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performValidatedReplacementInRange:withAttributedString:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), attributedString) as Boolean
    }

    // @property textContainer
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textContainer(): MemorySegment {
        val sel = ObjCRuntime.sel("textContainer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextContainer(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textContainerInset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textContainerInset(): NSSize {
        val sel = ObjCRuntime.sel("textContainerInset")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextContainerInset(value: NSSize) {
        val sel = ObjCRuntime.sel("setTextContainerInset:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property textContainerOrigin
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textContainerOrigin(): NSPoint {
        val sel = ObjCRuntime.sel("textContainerOrigin")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property layoutManager
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun layoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textStorage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textStorage(): MemorySegment {
        val sel = ObjCRuntime.sel("textStorage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textLayoutManager
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun textLayoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("textLayoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textContentStorage
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun textContentStorage(): MemorySegment {
        val sel = ObjCRuntime.sel("textContentStorage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property shouldDrawInsertionPoint
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldDrawInsertionPoint(): Boolean {
        val sel = ObjCRuntime.sel("shouldDrawInsertionPoint")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property usesAdaptiveColorMappingForDarkAppearance
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun usesAdaptiveColorMappingForDarkAppearance(): Boolean {
        val sel = ObjCRuntime.sel("usesAdaptiveColorMappingForDarkAppearance")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun setUsesAdaptiveColorMappingForDarkAppearance(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesAdaptiveColorMappingForDarkAppearance:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSUserInterfaceValidations. */
fun NSTextView.validateUserInterfaceItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.insertText_replacementRange(string: MemorySegment, replacementRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("insertText:replacementRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string, ObjCRuntime.ObjCStructArg(replacementRange.segment, NSRange.layout))
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.doCommandBySelector(selector: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("doCommandBySelector:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selector)
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.setMarkedText_selectedRange_replacementRange(string: MemorySegment, selectedRange: NSRange, replacementRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setMarkedText:selectedRange:replacementRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string, ObjCRuntime.ObjCStructArg(selectedRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(replacementRange.segment, NSRange.layout))
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.unmarkText(): Unit {
    val sel = ObjCRuntime.sel("unmarkText")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.markedRange(): NSRange {
    val sel = ObjCRuntime.sel("markedRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.hasMarkedText(): Boolean {
    val sel = ObjCRuntime.sel("hasMarkedText")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.attributedSubstringForProposedRange_actualRange(range: NSRange, actualRange: NSRangePointer): MemorySegment {
    val sel = ObjCRuntime.sel("attributedSubstringForProposedRange:actualRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), actualRange.segment) as MemorySegment
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.validAttributesForMarkedText(): MemorySegment {
    val sel = ObjCRuntime.sel("validAttributesForMarkedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.firstRectForCharacterRange_actualRange(range: NSRange, actualRange: NSRangePointer): NSRect {
    val sel = ObjCRuntime.sel("firstRectForCharacterRange:actualRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), actualRange.segment))
}

/** Required by Objective-C protocol NSTextInputClient. */
fun NSTextView.characterIndexForPoint(point: NSPoint): Long {
    val sel = ObjCRuntime.sel("characterIndexForPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
}

/**
 * Required by Objective-C protocol NSTextLayoutOrientationProvider.
 */
fun NSTextView.layoutOrientation(): NSTextLayoutOrientation {
    val sel = ObjCRuntime.sel("layoutOrientation")
    return NSTextLayoutOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

/** Required by Objective-C protocol NSDraggingSource. */
fun NSTextView.draggingSession_sourceOperationMaskForDraggingContext(session: MemorySegment, context: NSDraggingContext): NSDragOperation {
    val sel = ObjCRuntime.sel("draggingSession:sourceOperationMaskForDraggingContext:")
    return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, session, context.rawValue) as Long)
}

/** Required by Objective-C protocol NSTextInput. */
fun NSTextView.setMarkedText_selectedRange(string: MemorySegment, selRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setMarkedText:selectedRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, string, ObjCRuntime.ObjCStructArg(selRange.segment, NSRange.layout))
}

/** Required by Objective-C protocol NSTextInput. */
fun NSTextView.conversationIdentifier(): Long {
    val sel = ObjCRuntime.sel("conversationIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

/** Required by Objective-C protocol NSTextInput. */
fun NSTextView.attributedSubstringFromRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("attributedSubstringFromRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSTextInput. */
fun NSTextView.firstRectForCharacterRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("firstRectForCharacterRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/**
 * Required by Objective-C protocol NSTextContent.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSTextView.contentType(): MemorySegment {
    val sel = ObjCRuntime.sel("contentType")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSTextView.setContentType(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setContentType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

// ── Category: NSCompletion on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.complete(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("complete:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.completionsForPartialWordRange_indexOfSelectedItem(charRange: NSRange, index: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("completionsForPartialWordRange:indexOfSelectedItem:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), index) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.insertCompletion_forPartialWordRange_movement_isFinal(word: MemorySegment, charRange: NSRange, movement: Long, flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("insertCompletion:forPartialWordRange:movement:isFinal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, word, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), movement, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangeForUserCompletion(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserCompletion")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

// ── Category: NSPasteboard on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.writeSelectionToPasteboard_type(pboard: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeSelectionToPasteboard:type:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.writeSelectionToPasteboard_types(pboard: MemorySegment, types: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeSelectionToPasteboard:types:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard, types) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.preferredPasteboardTypeFromArray_restrictedToTypesFromArray(availableTypes: MemorySegment, allowedTypes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("preferredPasteboardTypeFromArray:restrictedToTypesFromArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, availableTypes, allowedTypes) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.readSelectionFromPasteboard_type(pboard: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readSelectionFromPasteboard:type:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard, type) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.readSelectionFromPasteboard(pboard: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readSelectionFromPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.pasteAsPlainText(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pasteAsPlainText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.pasteAsRichText(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pasteAsRichText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<NSPasteboardType> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.writablePasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("writablePasteboardTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSPasteboardType> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.readablePasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("readablePasteboardTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSTextView registerForServices]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView_registerForServices(): Unit {
    val sel = ObjCRuntime.sel("registerForServices")
    val cls = ObjCRuntime.getClass("NSTextView")
    ObjCRuntime.msgSend(null, cls, sel)
}

// ── Category: NSDragging on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.dragSelectionWithEvent_offset_slideBack(event: MemorySegment, mouseOffset: NSSize, slideBack: Boolean): Boolean {
    val sel = ObjCRuntime.sel("dragSelectionWithEvent:offset:slideBack:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, event, ObjCRuntime.ObjCStructArg(mouseOffset.segment, NSSize.layout), slideBack) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.dragImageForSelectionWithEvent_origin(event: MemorySegment, origin: NSPointPointer): MemorySegment {
    val sel = ObjCRuntime.sel("dragImageForSelectionWithEvent:origin:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, event, origin.segment) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.dragOperationForDraggingInfo_type(dragInfo: MemorySegment, type: MemorySegment): NSDragOperation {
    val sel = ObjCRuntime.sel("dragOperationForDraggingInfo:type:")
    return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, dragInfo, type) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.cleanUpAfterDragOperation(): Unit {
    val sel = ObjCRuntime.sel("cleanUpAfterDragOperation")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** @return NSArray<NSPasteboardType> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.acceptableDragTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("acceptableDragTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSSharing on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setSelectedRanges_affinity_stillSelecting(ranges: MemorySegment, affinity: NSSelectionAffinity, stillSelectingFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setSelectedRanges:affinity:stillSelecting:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ranges, affinity.rawValue, stillSelectingFlag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setSelectedRange_affinity_stillSelecting(charRange: NSRange, affinity: NSSelectionAffinity, stillSelectingFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setSelectedRange:affinity:stillSelecting:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), affinity.rawValue, stillSelectingFlag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.updateInsertionPointStateAndRestartTimer(restartFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("updateInsertionPointStateAndRestartTimer:")
    ObjCRuntime.msgSend(null, this.ptr, sel, restartFlag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.toggleContinuousSpellChecking(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleContinuousSpellChecking:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.toggleGrammarChecking(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleGrammarChecking:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setSpellingState_range(value: Long, charRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setSpellingState:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.shouldChangeTextInRanges_replacementStrings(affectedRanges: MemorySegment, replacementStrings: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldChangeTextInRanges:replacementStrings:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, affectedRanges, replacementStrings) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.shouldChangeTextInRange_replacementString(affectedCharRange: NSRange, replacementString: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldChangeTextInRange:replacementString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(affectedCharRange.segment, NSRange.layout), replacementString) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.didChangeText(): Unit {
    val sel = ObjCRuntime.sel("didChangeText")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.breakUndoCoalescing(): Unit {
    val sel = ObjCRuntime.sel("breakUndoCoalescing")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.showFindIndicatorForRange(charRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("showFindIndicatorForRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
}

/** @return NSArray<NSValue *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.selectedRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setSelectedRanges(selectedRanges: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSelectedRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selectedRanges)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.selectionAffinity(): NSSelectionAffinity {
    val sel = ObjCRuntime.sel("selectionAffinity")
    return NSSelectionAffinity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.selectionGranularity(): NSSelectionGranularity {
    val sel = ObjCRuntime.sel("selectionGranularity")
    return NSSelectionGranularity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setSelectionGranularity(selectionGranularity: NSSelectionGranularity): Unit {
    val sel = ObjCRuntime.sel("setSelectionGranularity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selectionGranularity.rawValue)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.selectedTextAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setSelectedTextAttributes(selectedTextAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSelectedTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selectedTextAttributes)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.insertionPointColor(): MemorySegment {
    val sel = ObjCRuntime.sel("insertionPointColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setInsertionPointColor(insertionPointColor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setInsertionPointColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, insertionPointColor)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.markedTextAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("markedTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setMarkedTextAttributes(markedTextAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setMarkedTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, markedTextAttributes)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.linkTextAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("linkTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setLinkTextAttributes(linkTextAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setLinkTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, linkTextAttributes)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.displaysLinkToolTips(): Boolean {
    val sel = ObjCRuntime.sel("displaysLinkToolTips")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setDisplaysLinkToolTips(displaysLinkToolTips: Boolean): Unit {
    val sel = ObjCRuntime.sel("setDisplaysLinkToolTips:")
    ObjCRuntime.msgSend(null, this.ptr, sel, displaysLinkToolTips)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.acceptsGlyphInfo(): Boolean {
    val sel = ObjCRuntime.sel("acceptsGlyphInfo")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setAcceptsGlyphInfo(acceptsGlyphInfo: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAcceptsGlyphInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, acceptsGlyphInfo)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.usesRuler(): Boolean {
    val sel = ObjCRuntime.sel("usesRuler")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setUsesRuler(usesRuler: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesRuler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesRuler)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.usesInspectorBar(): Boolean {
    val sel = ObjCRuntime.sel("usesInspectorBar")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.setUsesInspectorBar(usesInspectorBar: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesInspectorBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesInspectorBar)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.isContinuousSpellCheckingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isContinuousSpellCheckingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setContinuousSpellCheckingEnabled(continuousSpellCheckingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setContinuousSpellCheckingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, continuousSpellCheckingEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.spellCheckerDocumentTag(): Long {
    val sel = ObjCRuntime.sel("spellCheckerDocumentTag")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.isGrammarCheckingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isGrammarCheckingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setGrammarCheckingEnabled(grammarCheckingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setGrammarCheckingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, grammarCheckingEnabled)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.typingAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("typingAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setTypingAttributes(typingAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTypingAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, typingAttributes)
}

/** @return NSArray<NSValue *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangesForUserTextChange(): MemorySegment {
    val sel = ObjCRuntime.sel("rangesForUserTextChange")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSValue *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangesForUserCharacterAttributeChange(): MemorySegment {
    val sel = ObjCRuntime.sel("rangesForUserCharacterAttributeChange")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSValue *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangesForUserParagraphAttributeChange(): MemorySegment {
    val sel = ObjCRuntime.sel("rangesForUserParagraphAttributeChange")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangeForUserTextChange(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserTextChange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangeForUserCharacterAttributeChange(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserCharacterAttributeChange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.rangeForUserParagraphAttributeChange(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserParagraphAttributeChange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.allowsDocumentBackgroundColorChange(): Boolean {
    val sel = ObjCRuntime.sel("allowsDocumentBackgroundColorChange")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setAllowsDocumentBackgroundColorChange(allowsDocumentBackgroundColorChange: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsDocumentBackgroundColorChange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsDocumentBackgroundColorChange)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.defaultParagraphStyle(): MemorySegment {
    val sel = ObjCRuntime.sel("defaultParagraphStyle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setDefaultParagraphStyle(defaultParagraphStyle: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDefaultParagraphStyle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, defaultParagraphStyle)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.allowsUndo(): Boolean {
    val sel = ObjCRuntime.sel("allowsUndo")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setAllowsUndo(allowsUndo: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsUndo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsUndo)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.isCoalescingUndo(): Boolean {
    val sel = ObjCRuntime.sel("isCoalescingUndo")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.allowsImageEditing(): Boolean {
    val sel = ObjCRuntime.sel("allowsImageEditing")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setAllowsImageEditing(allowsImageEditing: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsImageEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsImageEditing)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSTextView.usesRolloverButtonForSelection(): Boolean {
    val sel = ObjCRuntime.sel("usesRolloverButtonForSelection")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSTextView.setUsesRolloverButtonForSelection(usesRolloverButtonForSelection: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesRolloverButtonForSelection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesRolloverButtonForSelection)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setRulerVisible(rulerVisible: Boolean): Unit {
    val sel = ObjCRuntime.sel("setRulerVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, rulerVisible)
}

/** @return NSArray<NSString *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.allowedInputSourceLocales(): MemorySegment {
    val sel = ObjCRuntime.sel("allowedInputSourceLocales")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setAllowedInputSourceLocales(allowedInputSourceLocales: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAllowedInputSourceLocales:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowedInputSourceLocales)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.isWritingToolsActive(): Boolean {
    val sel = ObjCRuntime.sel("isWritingToolsActive")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.writingToolsBehavior(): NSWritingToolsBehavior {
    val sel = ObjCRuntime.sel("writingToolsBehavior")
    return NSWritingToolsBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.setWritingToolsBehavior(writingToolsBehavior: NSWritingToolsBehavior): Unit {
    val sel = ObjCRuntime.sel("setWritingToolsBehavior:")
    ObjCRuntime.msgSend(null, this.ptr, sel, writingToolsBehavior.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.allowedWritingToolsResultOptions(): NSWritingToolsResultOptions {
    val sel = ObjCRuntime.sel("allowedWritingToolsResultOptions")
    return NSWritingToolsResultOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.setAllowedWritingToolsResultOptions(allowedWritingToolsResultOptions: NSWritingToolsResultOptions): Unit {
    val sel = ObjCRuntime.sel("setAllowedWritingToolsResultOptions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowedWritingToolsResultOptions.rawValue)
}

// ── Category: NSTextChecking on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.smartDeleteRangeForProposedRange(proposedCharRange: NSRange): NSRange {
    val sel = ObjCRuntime.sel("smartDeleteRangeForProposedRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedCharRange.segment, NSRange.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.toggleSmartInsertDelete(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleSmartInsertDelete:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.smartInsertForString_replacingRange_beforeString_afterString(pasteString: MemorySegment, charRangeToReplace: NSRange, beforeString: MemorySegment, afterString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("smartInsertForString:replacingRange:beforeString:afterString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, pasteString, ObjCRuntime.ObjCStructArg(charRangeToReplace.segment, NSRange.layout), beforeString, afterString)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.smartInsertBeforeStringForString_replacingRange(pasteString: MemorySegment, charRangeToReplace: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("smartInsertBeforeStringForString:replacingRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteString, ObjCRuntime.ObjCStructArg(charRangeToReplace.segment, NSRange.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.smartInsertAfterStringForString_replacingRange(pasteString: MemorySegment, charRangeToReplace: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("smartInsertAfterStringForString:replacingRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteString, ObjCRuntime.ObjCStructArg(charRangeToReplace.segment, NSRange.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.toggleAutomaticQuoteSubstitution(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticQuoteSubstitution:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.toggleAutomaticLinkDetection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticLinkDetection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.toggleAutomaticDataDetection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticDataDetection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.toggleAutomaticDashSubstitution(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticDashSubstitution:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.toggleAutomaticTextReplacement(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticTextReplacement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.toggleAutomaticSpellingCorrection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticSpellingCorrection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.checkTextInRange_types_options(range: NSRange, checkingTypes: Long, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("checkTextInRange:types:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.handleTextCheckingResults_forRange_types_options_orthography_wordCount(results: MemorySegment, range: NSRange, checkingTypes: Long, options: MemorySegment, orthography: MemorySegment, wordCount: Long): Unit {
    val sel = ObjCRuntime.sel("handleTextCheckingResults:forRange:types:options:orthography:wordCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, results, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options, orthography, wordCount)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.orderFrontSubstitutionsPanel(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("orderFrontSubstitutionsPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.checkTextInSelection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("checkTextInSelection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.checkTextInDocument(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("checkTextInDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.smartInsertDeleteEnabled(): Boolean {
    val sel = ObjCRuntime.sel("smartInsertDeleteEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setSmartInsertDeleteEnabled(smartInsertDeleteEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setSmartInsertDeleteEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, smartInsertDeleteEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.isAutomaticQuoteSubstitutionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticQuoteSubstitutionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setAutomaticQuoteSubstitutionEnabled(automaticQuoteSubstitutionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticQuoteSubstitutionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticQuoteSubstitutionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.isAutomaticLinkDetectionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticLinkDetectionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSTextView.setAutomaticLinkDetectionEnabled(automaticLinkDetectionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticLinkDetectionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticLinkDetectionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.isAutomaticDataDetectionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticDataDetectionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.setAutomaticDataDetectionEnabled(automaticDataDetectionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticDataDetectionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticDataDetectionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.isAutomaticDashSubstitutionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticDashSubstitutionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.setAutomaticDashSubstitutionEnabled(automaticDashSubstitutionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticDashSubstitutionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticDashSubstitutionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.isAutomaticTextReplacementEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticTextReplacementEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.setAutomaticTextReplacementEnabled(automaticTextReplacementEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticTextReplacementEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticTextReplacementEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.isAutomaticSpellingCorrectionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticSpellingCorrectionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.setAutomaticSpellingCorrectionEnabled(automaticSpellingCorrectionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticSpellingCorrectionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticSpellingCorrectionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.enabledTextCheckingTypes(): Long {
    val sel = ObjCRuntime.sel("enabledTextCheckingTypes")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
fun NSTextView.setEnabledTextCheckingTypes(enabledTextCheckingTypes: Long): Unit {
    val sel = ObjCRuntime.sel("setEnabledTextCheckingTypes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, enabledTextCheckingTypes)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.usesFindPanel(): Boolean {
    val sel = ObjCRuntime.sel("usesFindPanel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTextView.setUsesFindPanel(usesFindPanel: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesFindPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesFindPanel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.usesFindBar(): Boolean {
    val sel = ObjCRuntime.sel("usesFindBar")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.setUsesFindBar(usesFindBar: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesFindBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesFindBar)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.isIncrementalSearchingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isIncrementalSearchingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.setIncrementalSearchingEnabled(incrementalSearchingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIncrementalSearchingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, incrementalSearchingEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.inlinePredictionType(): NSTextInputTraitType {
    val sel = ObjCRuntime.sel("inlinePredictionType")
    return NSTextInputTraitType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.setInlinePredictionType(inlinePredictionType: NSTextInputTraitType): Unit {
    val sel = ObjCRuntime.sel("setInlinePredictionType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, inlinePredictionType.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.mathExpressionCompletionType(): NSTextInputTraitType {
    val sel = ObjCRuntime.sel("mathExpressionCompletionType")
    return NSTextInputTraitType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.setMathExpressionCompletionType(mathExpressionCompletionType: NSTextInputTraitType): Unit {
    val sel = ObjCRuntime.sel("setMathExpressionCompletionType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, mathExpressionCompletionType.rawValue)
}

// ── Category: NSQuickLookPreview on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.toggleQuickLookPreviewPanel(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleQuickLookPreviewPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<id<QLPreviewItem>> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.quickLookPreviewableItemsInRanges(ranges: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("quickLookPreviewableItemsInRanges:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ranges) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSTextView.updateQuickLookPreviewPanel(): Unit {
    val sel = ObjCRuntime.sel("updateQuickLookPreviewPanel")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSTextView_SharingService on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
fun NSTextView.orderFrontSharingServicePicker(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("orderFrontSharingServicePicker:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

// ── Category: NSTextView_TouchBar on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.toggleAutomaticTextCompletion(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticTextCompletion:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.updateTouchBarItemIdentifiers(): Unit {
    val sel = ObjCRuntime.sel("updateTouchBarItemIdentifiers")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.updateTextTouchBarItems(): Unit {
    val sel = ObjCRuntime.sel("updateTextTouchBarItems")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.updateCandidates(): Unit {
    val sel = ObjCRuntime.sel("updateCandidates")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.isAutomaticTextCompletionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticTextCompletionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.setAutomaticTextCompletionEnabled(automaticTextCompletionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticTextCompletionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticTextCompletionEnabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.allowsCharacterPickerTouchBarItem(): Boolean {
    val sel = ObjCRuntime.sel("allowsCharacterPickerTouchBarItem")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
fun NSTextView.setAllowsCharacterPickerTouchBarItem(allowsCharacterPickerTouchBarItem: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsCharacterPickerTouchBarItem:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsCharacterPickerTouchBarItem)
}

// ── Category: NSTextView_Factory on NSTextView ─────────────────────────────────────────

// Class method: +[NSTextView scrollableTextView]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun NSTextView_scrollableTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollableTextView")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSTextView fieldEditor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun NSTextView_fieldEditor(): MemorySegment {
    val sel = ObjCRuntime.sel("fieldEditor")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSTextView scrollableDocumentContentTextView]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun NSTextView_scrollableDocumentContentTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollableDocumentContentTextView")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSTextView scrollablePlainDocumentContentTextView]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
fun NSTextView_scrollablePlainDocumentContentTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollablePlainDocumentContentTextView")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSTextView_TextHighlight on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.drawTextHighlightBackgroundForTextRange_origin(textRange: MemorySegment, origin: NSPoint): Unit {
    val sel = ObjCRuntime.sel("drawTextHighlightBackgroundForTextRange:origin:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textRange, ObjCRuntime.ObjCStructArg(origin.segment, NSPoint.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.highlight(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("highlight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.textHighlightAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("textHighlightAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSTextView.setTextHighlightAttributes(textHighlightAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTextHighlightAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textHighlightAttributes)
}

// ── Category: NSDeprecated on NSTextView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use NSResponder's makeBaseWritingDirectionNatural:, makeBaseWritingDirectionLeftToRight:, and makeBaseWritingDirectionRightToLeft: instead")
fun NSTextView.toggleBaseWritingDirection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleBaseWritingDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}
