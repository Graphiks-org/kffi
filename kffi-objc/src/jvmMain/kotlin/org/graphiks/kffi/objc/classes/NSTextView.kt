package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextView
 * Superclass: NSText
 * Protocols: NSColorChanging, NSMenuItemValidation, NSUserInterfaceValidations, NSTextInputClient, NSTextLayoutOrientationProvider, NSDraggingSource, NSStandardKeyBindingResponding, NSTextInput, NSAccessibilityNavigableStaticText, NSTextContent
 */
open class NSTextView(override val ptr: MemorySegment) : NSText(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextView") }

        fun textViewUsingTextLayoutManager(usingTextLayoutManager: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("textViewUsingTextLayoutManager:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, usingTextLayoutManager) as MemorySegment
        }

        fun stronglyReferencesTextStorage(): Boolean {
            val sel = ObjCRuntime.sel("stronglyReferencesTextStorage")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    open fun initWithFrame_textContainer(frameRect: NSRect, container: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:textContainer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), container) as MemorySegment
    }

    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    override fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    open fun initUsingTextLayoutManager(usingTextLayoutManager: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initUsingTextLayoutManager:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, usingTextLayoutManager) as MemorySegment
    }

    open fun replaceTextContainer(newContainer: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, newContainer)
    }

    open fun invalidateTextContainerOrigin(): Unit {
        val sel = ObjCRuntime.sel("invalidateTextContainerOrigin")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun insertText(insertString: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertText:")
        ObjCRuntime.msgSend(null, ptr, sel, insertString)
    }

    open fun setConstrainedFrameSize(desiredSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("setConstrainedFrameSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(desiredSize.segment, NSSize.layout))
    }

    open fun setAlignment_range(alignment: NSTextAlignment, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setAlignment:range:")
        ObjCRuntime.msgSend(null, ptr, sel, alignment.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    open fun setBaseWritingDirection_range(writingDirection: NSWritingDirection, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setBaseWritingDirection:range:")
        ObjCRuntime.msgSend(null, ptr, sel, writingDirection.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    open fun turnOffKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("turnOffKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun tightenKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("tightenKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun loosenKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("loosenKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun useStandardKerning(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("useStandardKerning:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun turnOffLigatures(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("turnOffLigatures:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun useStandardLigatures(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("useStandardLigatures:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun useAllLigatures(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("useAllLigatures:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun raiseBaseline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("raiseBaseline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun lowerBaseline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("lowerBaseline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun toggleTraditionalCharacterShape(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleTraditionalCharacterShape:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun outline(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("outline:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun performFindPanelAction(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performFindPanelAction:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun alignJustified(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("alignJustified:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun changeColor(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeColor:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun changeAttributes(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun changeDocumentBackgroundColor(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeDocumentBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun orderFrontSpacingPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontSpacingPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun orderFrontLinkPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontLinkPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun orderFrontListPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontListPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun orderFrontTablePanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontTablePanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun rulerView_didMoveMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:didMoveMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, marker)
    }

    open fun rulerView_didRemoveMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:didRemoveMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, marker)
    }

    open fun rulerView_didAddMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:didAddMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, marker)
    }

    open fun rulerView_shouldMoveMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("rulerView:shouldMoveMarker:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ruler, marker) as Boolean
    }

    open fun rulerView_shouldAddMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("rulerView:shouldAddMarker:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ruler, marker) as Boolean
    }

    open fun rulerView_willMoveMarker_toLocation(ruler: MemorySegment, marker: MemorySegment, location: Double): Double {
        val sel = ObjCRuntime.sel("rulerView:willMoveMarker:toLocation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ruler, marker, location) as Double
    }

    open fun rulerView_shouldRemoveMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("rulerView:shouldRemoveMarker:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ruler, marker) as Boolean
    }

    open fun rulerView_willAddMarker_atLocation(ruler: MemorySegment, marker: MemorySegment, location: Double): Double {
        val sel = ObjCRuntime.sel("rulerView:willAddMarker:atLocation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ruler, marker, location) as Double
    }

    open fun rulerView_handleMouseDown(ruler: MemorySegment, event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("rulerView:handleMouseDown:")
        ObjCRuntime.msgSend(null, ptr, sel, ruler, event)
    }

    open fun setNeedsDisplayInRect_avoidAdditionalLayout(rect: NSRect, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setNeedsDisplayInRect:avoidAdditionalLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), flag)
    }

    open fun drawInsertionPointInRect_color_turnedOn(rect: NSRect, color: MemorySegment, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("drawInsertionPointInRect:color:turnedOn:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), color, flag)
    }

    open fun drawViewBackgroundInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawViewBackgroundInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun updateRuler(): Unit {
        val sel = ObjCRuntime.sel("updateRuler")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun updateFontPanel(): Unit {
        val sel = ObjCRuntime.sel("updateFontPanel")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun updateDragTypeRegistration(): Unit {
        val sel = ObjCRuntime.sel("updateDragTypeRegistration")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun selectionRangeForProposedRange_granularity(proposedCharRange: NSRange, granularity: NSSelectionGranularity): NSRange {
        val sel = ObjCRuntime.sel("selectionRangeForProposedRange:granularity:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(proposedCharRange.segment, NSRange.layout), granularity.rawValue))
    }

    open fun clickedOnLink_atIndex(link: MemorySegment, charIndex: Long): Unit {
        val sel = ObjCRuntime.sel("clickedOnLink:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, link, charIndex)
    }

    open fun startSpeaking(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("startSpeaking:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun stopSpeaking(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("stopSpeaking:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun setLayoutOrientation(orientation: NSTextLayoutOrientation): Unit {
        val sel = ObjCRuntime.sel("setLayoutOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, orientation.rawValue)
    }

    open fun changeLayoutOrientation(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeLayoutOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun characterIndexForInsertionAtPoint(point: NSPoint): Long {
        val sel = ObjCRuntime.sel("characterIndexForInsertionAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
    }

    open fun performValidatedReplacementInRange_withAttributedString(range: NSRange, attributedString: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performValidatedReplacementInRange:withAttributedString:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), attributedString) as Boolean
    }

    // @property textContainer
    open fun textContainer(): MemorySegment {
        val sel = ObjCRuntime.sel("textContainer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextContainer(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textContainerInset
    open fun textContainerInset(): NSSize {
        val sel = ObjCRuntime.sel("textContainerInset")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setTextContainerInset(value: NSSize) {
        val sel = ObjCRuntime.sel("setTextContainerInset:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property textContainerOrigin
    open fun textContainerOrigin(): NSPoint {
        val sel = ObjCRuntime.sel("textContainerOrigin")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property layoutManager
    open fun layoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textStorage
    open fun textStorage(): MemorySegment {
        val sel = ObjCRuntime.sel("textStorage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textLayoutManager
    open fun textLayoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("textLayoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textContentStorage
    open fun textContentStorage(): MemorySegment {
        val sel = ObjCRuntime.sel("textContentStorage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property shouldDrawInsertionPoint
    open fun shouldDrawInsertionPoint(): Boolean {
        val sel = ObjCRuntime.sel("shouldDrawInsertionPoint")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property usesAdaptiveColorMappingForDarkAppearance
    open fun usesAdaptiveColorMappingForDarkAppearance(): Boolean {
        val sel = ObjCRuntime.sel("usesAdaptiveColorMappingForDarkAppearance")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
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

fun NSTextView.complete(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("complete:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<NSString *> * */
fun NSTextView.completionsForPartialWordRange_indexOfSelectedItem(charRange: NSRange, index: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("completionsForPartialWordRange:indexOfSelectedItem:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), index) as MemorySegment
}

fun NSTextView.insertCompletion_forPartialWordRange_movement_isFinal(word: MemorySegment, charRange: NSRange, movement: Long, flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("insertCompletion:forPartialWordRange:movement:isFinal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, word, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), movement, flag)
}

fun NSTextView.rangeForUserCompletion(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserCompletion")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

// ── Category: NSPasteboard on NSTextView ─────────────────────────────────────────

fun NSTextView.writeSelectionToPasteboard_type(pboard: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeSelectionToPasteboard:type:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard, type) as Boolean
}

fun NSTextView.writeSelectionToPasteboard_types(pboard: MemorySegment, types: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeSelectionToPasteboard:types:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard, types) as Boolean
}

fun NSTextView.preferredPasteboardTypeFromArray_restrictedToTypesFromArray(availableTypes: MemorySegment, allowedTypes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("preferredPasteboardTypeFromArray:restrictedToTypesFromArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, availableTypes, allowedTypes) as MemorySegment
}

fun NSTextView.readSelectionFromPasteboard_type(pboard: MemorySegment, type: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readSelectionFromPasteboard:type:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard, type) as Boolean
}

fun NSTextView.readSelectionFromPasteboard(pboard: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readSelectionFromPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, pboard) as Boolean
}

fun NSTextView.pasteAsPlainText(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pasteAsPlainText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.pasteAsRichText(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("pasteAsRichText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<NSPasteboardType> * */
fun NSTextView.writablePasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("writablePasteboardTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSPasteboardType> * */
fun NSTextView.readablePasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("readablePasteboardTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSTextView registerForServices]
fun NSTextView_registerForServices(): Unit {
    val sel = ObjCRuntime.sel("registerForServices")
    val cls = ObjCRuntime.getClass("NSTextView")
    ObjCRuntime.msgSend(null, cls, sel)
}

// ── Category: NSDragging on NSTextView ─────────────────────────────────────────

fun NSTextView.dragSelectionWithEvent_offset_slideBack(event: MemorySegment, mouseOffset: NSSize, slideBack: Boolean): Boolean {
    val sel = ObjCRuntime.sel("dragSelectionWithEvent:offset:slideBack:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, event, ObjCRuntime.ObjCStructArg(mouseOffset.segment, NSSize.layout), slideBack) as Boolean
}

fun NSTextView.dragImageForSelectionWithEvent_origin(event: MemorySegment, origin: NSPointPointer): MemorySegment {
    val sel = ObjCRuntime.sel("dragImageForSelectionWithEvent:origin:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, event, origin.segment) as MemorySegment
}

fun NSTextView.dragOperationForDraggingInfo_type(dragInfo: MemorySegment, type: MemorySegment): NSDragOperation {
    val sel = ObjCRuntime.sel("dragOperationForDraggingInfo:type:")
    return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, dragInfo, type) as Long)
}

fun NSTextView.cleanUpAfterDragOperation(): Unit {
    val sel = ObjCRuntime.sel("cleanUpAfterDragOperation")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** @return NSArray<NSPasteboardType> * */
fun NSTextView.acceptableDragTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("acceptableDragTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSSharing on NSTextView ─────────────────────────────────────────

fun NSTextView.setSelectedRanges_affinity_stillSelecting(ranges: MemorySegment, affinity: NSSelectionAffinity, stillSelectingFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setSelectedRanges:affinity:stillSelecting:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ranges, affinity.rawValue, stillSelectingFlag)
}

fun NSTextView.setSelectedRange_affinity_stillSelecting(charRange: NSRange, affinity: NSSelectionAffinity, stillSelectingFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setSelectedRange:affinity:stillSelecting:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), affinity.rawValue, stillSelectingFlag)
}

fun NSTextView.updateInsertionPointStateAndRestartTimer(restartFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("updateInsertionPointStateAndRestartTimer:")
    ObjCRuntime.msgSend(null, this.ptr, sel, restartFlag)
}

fun NSTextView.toggleContinuousSpellChecking(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleContinuousSpellChecking:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.toggleGrammarChecking(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleGrammarChecking:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.setSpellingState_range(value: Long, charRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setSpellingState:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
}

fun NSTextView.shouldChangeTextInRanges_replacementStrings(affectedRanges: MemorySegment, replacementStrings: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldChangeTextInRanges:replacementStrings:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, affectedRanges, replacementStrings) as Boolean
}

fun NSTextView.shouldChangeTextInRange_replacementString(affectedCharRange: NSRange, replacementString: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("shouldChangeTextInRange:replacementString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(affectedCharRange.segment, NSRange.layout), replacementString) as Boolean
}

fun NSTextView.didChangeText(): Unit {
    val sel = ObjCRuntime.sel("didChangeText")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSTextView.breakUndoCoalescing(): Unit {
    val sel = ObjCRuntime.sel("breakUndoCoalescing")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSTextView.showFindIndicatorForRange(charRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("showFindIndicatorForRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
}

/** @return NSArray<NSValue *> * */
fun NSTextView.selectedRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setSelectedRanges(selectedRanges: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSelectedRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selectedRanges)
}

fun NSTextView.selectionAffinity(): NSSelectionAffinity {
    val sel = ObjCRuntime.sel("selectionAffinity")
    return NSSelectionAffinity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSTextView.selectionGranularity(): NSSelectionGranularity {
    val sel = ObjCRuntime.sel("selectionGranularity")
    return NSSelectionGranularity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSTextView.setSelectionGranularity(selectionGranularity: NSSelectionGranularity): Unit {
    val sel = ObjCRuntime.sel("setSelectionGranularity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selectionGranularity.rawValue)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSTextView.selectedTextAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setSelectedTextAttributes(selectedTextAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSelectedTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, selectedTextAttributes)
}

fun NSTextView.insertionPointColor(): MemorySegment {
    val sel = ObjCRuntime.sel("insertionPointColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setInsertionPointColor(insertionPointColor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setInsertionPointColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, insertionPointColor)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSTextView.markedTextAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("markedTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setMarkedTextAttributes(markedTextAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setMarkedTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, markedTextAttributes)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSTextView.linkTextAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("linkTextAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setLinkTextAttributes(linkTextAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setLinkTextAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, linkTextAttributes)
}

fun NSTextView.displaysLinkToolTips(): Boolean {
    val sel = ObjCRuntime.sel("displaysLinkToolTips")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setDisplaysLinkToolTips(displaysLinkToolTips: Boolean): Unit {
    val sel = ObjCRuntime.sel("setDisplaysLinkToolTips:")
    ObjCRuntime.msgSend(null, this.ptr, sel, displaysLinkToolTips)
}

fun NSTextView.acceptsGlyphInfo(): Boolean {
    val sel = ObjCRuntime.sel("acceptsGlyphInfo")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAcceptsGlyphInfo(acceptsGlyphInfo: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAcceptsGlyphInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, acceptsGlyphInfo)
}

fun NSTextView.usesRuler(): Boolean {
    val sel = ObjCRuntime.sel("usesRuler")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setUsesRuler(usesRuler: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesRuler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesRuler)
}

fun NSTextView.usesInspectorBar(): Boolean {
    val sel = ObjCRuntime.sel("usesInspectorBar")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setUsesInspectorBar(usesInspectorBar: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesInspectorBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesInspectorBar)
}

fun NSTextView.isContinuousSpellCheckingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isContinuousSpellCheckingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setContinuousSpellCheckingEnabled(continuousSpellCheckingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setContinuousSpellCheckingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, continuousSpellCheckingEnabled)
}

fun NSTextView.spellCheckerDocumentTag(): Long {
    val sel = ObjCRuntime.sel("spellCheckerDocumentTag")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSTextView.isGrammarCheckingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isGrammarCheckingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setGrammarCheckingEnabled(grammarCheckingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setGrammarCheckingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, grammarCheckingEnabled)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSTextView.typingAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("typingAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setTypingAttributes(typingAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTypingAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, typingAttributes)
}

/** @return NSArray<NSValue *> * */
fun NSTextView.rangesForUserTextChange(): MemorySegment {
    val sel = ObjCRuntime.sel("rangesForUserTextChange")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSValue *> * */
fun NSTextView.rangesForUserCharacterAttributeChange(): MemorySegment {
    val sel = ObjCRuntime.sel("rangesForUserCharacterAttributeChange")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSValue *> * */
fun NSTextView.rangesForUserParagraphAttributeChange(): MemorySegment {
    val sel = ObjCRuntime.sel("rangesForUserParagraphAttributeChange")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.rangeForUserTextChange(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserTextChange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

fun NSTextView.rangeForUserCharacterAttributeChange(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserCharacterAttributeChange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

fun NSTextView.rangeForUserParagraphAttributeChange(): NSRange {
    val sel = ObjCRuntime.sel("rangeForUserParagraphAttributeChange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

fun NSTextView.allowsDocumentBackgroundColorChange(): Boolean {
    val sel = ObjCRuntime.sel("allowsDocumentBackgroundColorChange")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAllowsDocumentBackgroundColorChange(allowsDocumentBackgroundColorChange: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsDocumentBackgroundColorChange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsDocumentBackgroundColorChange)
}

fun NSTextView.defaultParagraphStyle(): MemorySegment {
    val sel = ObjCRuntime.sel("defaultParagraphStyle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setDefaultParagraphStyle(defaultParagraphStyle: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDefaultParagraphStyle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, defaultParagraphStyle)
}

fun NSTextView.allowsUndo(): Boolean {
    val sel = ObjCRuntime.sel("allowsUndo")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAllowsUndo(allowsUndo: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsUndo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsUndo)
}

fun NSTextView.isCoalescingUndo(): Boolean {
    val sel = ObjCRuntime.sel("isCoalescingUndo")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.allowsImageEditing(): Boolean {
    val sel = ObjCRuntime.sel("allowsImageEditing")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAllowsImageEditing(allowsImageEditing: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsImageEditing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsImageEditing)
}

fun NSTextView.usesRolloverButtonForSelection(): Boolean {
    val sel = ObjCRuntime.sel("usesRolloverButtonForSelection")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setUsesRolloverButtonForSelection(usesRolloverButtonForSelection: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesRolloverButtonForSelection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesRolloverButtonForSelection)
}

fun NSTextView.setRulerVisible(rulerVisible: Boolean): Unit {
    val sel = ObjCRuntime.sel("setRulerVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, rulerVisible)
}

/** @return NSArray<NSString *> * */
fun NSTextView.allowedInputSourceLocales(): MemorySegment {
    val sel = ObjCRuntime.sel("allowedInputSourceLocales")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setAllowedInputSourceLocales(allowedInputSourceLocales: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAllowedInputSourceLocales:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowedInputSourceLocales)
}

fun NSTextView.isWritingToolsActive(): Boolean {
    val sel = ObjCRuntime.sel("isWritingToolsActive")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.writingToolsBehavior(): NSWritingToolsBehavior {
    val sel = ObjCRuntime.sel("writingToolsBehavior")
    return NSWritingToolsBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSTextView.setWritingToolsBehavior(writingToolsBehavior: NSWritingToolsBehavior): Unit {
    val sel = ObjCRuntime.sel("setWritingToolsBehavior:")
    ObjCRuntime.msgSend(null, this.ptr, sel, writingToolsBehavior.rawValue)
}

fun NSTextView.allowedWritingToolsResultOptions(): NSWritingToolsResultOptions {
    val sel = ObjCRuntime.sel("allowedWritingToolsResultOptions")
    return NSWritingToolsResultOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSTextView.setAllowedWritingToolsResultOptions(allowedWritingToolsResultOptions: NSWritingToolsResultOptions): Unit {
    val sel = ObjCRuntime.sel("setAllowedWritingToolsResultOptions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowedWritingToolsResultOptions.rawValue)
}

// ── Category: NSTextChecking on NSTextView ─────────────────────────────────────────

fun NSTextView.smartDeleteRangeForProposedRange(proposedCharRange: NSRange): NSRange {
    val sel = ObjCRuntime.sel("smartDeleteRangeForProposedRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedCharRange.segment, NSRange.layout)))
}

fun NSTextView.toggleSmartInsertDelete(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleSmartInsertDelete:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.smartInsertForString_replacingRange_beforeString_afterString(pasteString: MemorySegment, charRangeToReplace: NSRange, beforeString: MemorySegment, afterString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("smartInsertForString:replacingRange:beforeString:afterString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, pasteString, ObjCRuntime.ObjCStructArg(charRangeToReplace.segment, NSRange.layout), beforeString, afterString)
}

fun NSTextView.smartInsertBeforeStringForString_replacingRange(pasteString: MemorySegment, charRangeToReplace: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("smartInsertBeforeStringForString:replacingRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteString, ObjCRuntime.ObjCStructArg(charRangeToReplace.segment, NSRange.layout)) as MemorySegment
}

fun NSTextView.smartInsertAfterStringForString_replacingRange(pasteString: MemorySegment, charRangeToReplace: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("smartInsertAfterStringForString:replacingRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteString, ObjCRuntime.ObjCStructArg(charRangeToReplace.segment, NSRange.layout)) as MemorySegment
}

fun NSTextView.toggleAutomaticQuoteSubstitution(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticQuoteSubstitution:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.toggleAutomaticLinkDetection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticLinkDetection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.toggleAutomaticDataDetection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticDataDetection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.toggleAutomaticDashSubstitution(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticDashSubstitution:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.toggleAutomaticTextReplacement(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticTextReplacement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.toggleAutomaticSpellingCorrection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticSpellingCorrection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.checkTextInRange_types_options(range: NSRange, checkingTypes: Long, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("checkTextInRange:types:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options)
}

fun NSTextView.handleTextCheckingResults_forRange_types_options_orthography_wordCount(results: MemorySegment, range: NSRange, checkingTypes: Long, options: MemorySegment, orthography: MemorySegment, wordCount: Long): Unit {
    val sel = ObjCRuntime.sel("handleTextCheckingResults:forRange:types:options:orthography:wordCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, results, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options, orthography, wordCount)
}

fun NSTextView.orderFrontSubstitutionsPanel(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("orderFrontSubstitutionsPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.checkTextInSelection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("checkTextInSelection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.checkTextInDocument(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("checkTextInDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.smartInsertDeleteEnabled(): Boolean {
    val sel = ObjCRuntime.sel("smartInsertDeleteEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setSmartInsertDeleteEnabled(smartInsertDeleteEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setSmartInsertDeleteEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, smartInsertDeleteEnabled)
}

fun NSTextView.isAutomaticQuoteSubstitutionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticQuoteSubstitutionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticQuoteSubstitutionEnabled(automaticQuoteSubstitutionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticQuoteSubstitutionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticQuoteSubstitutionEnabled)
}

fun NSTextView.isAutomaticLinkDetectionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticLinkDetectionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticLinkDetectionEnabled(automaticLinkDetectionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticLinkDetectionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticLinkDetectionEnabled)
}

fun NSTextView.isAutomaticDataDetectionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticDataDetectionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticDataDetectionEnabled(automaticDataDetectionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticDataDetectionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticDataDetectionEnabled)
}

fun NSTextView.isAutomaticDashSubstitutionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticDashSubstitutionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticDashSubstitutionEnabled(automaticDashSubstitutionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticDashSubstitutionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticDashSubstitutionEnabled)
}

fun NSTextView.isAutomaticTextReplacementEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticTextReplacementEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticTextReplacementEnabled(automaticTextReplacementEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticTextReplacementEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticTextReplacementEnabled)
}

fun NSTextView.isAutomaticSpellingCorrectionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticSpellingCorrectionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticSpellingCorrectionEnabled(automaticSpellingCorrectionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticSpellingCorrectionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticSpellingCorrectionEnabled)
}

fun NSTextView.enabledTextCheckingTypes(): Long {
    val sel = ObjCRuntime.sel("enabledTextCheckingTypes")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSTextView.setEnabledTextCheckingTypes(enabledTextCheckingTypes: Long): Unit {
    val sel = ObjCRuntime.sel("setEnabledTextCheckingTypes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, enabledTextCheckingTypes)
}

fun NSTextView.usesFindPanel(): Boolean {
    val sel = ObjCRuntime.sel("usesFindPanel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setUsesFindPanel(usesFindPanel: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesFindPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesFindPanel)
}

fun NSTextView.usesFindBar(): Boolean {
    val sel = ObjCRuntime.sel("usesFindBar")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setUsesFindBar(usesFindBar: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesFindBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesFindBar)
}

fun NSTextView.isIncrementalSearchingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isIncrementalSearchingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setIncrementalSearchingEnabled(incrementalSearchingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIncrementalSearchingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, incrementalSearchingEnabled)
}

fun NSTextView.inlinePredictionType(): NSTextInputTraitType {
    val sel = ObjCRuntime.sel("inlinePredictionType")
    return NSTextInputTraitType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSTextView.setInlinePredictionType(inlinePredictionType: NSTextInputTraitType): Unit {
    val sel = ObjCRuntime.sel("setInlinePredictionType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, inlinePredictionType.rawValue)
}

fun NSTextView.mathExpressionCompletionType(): NSTextInputTraitType {
    val sel = ObjCRuntime.sel("mathExpressionCompletionType")
    return NSTextInputTraitType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSTextView.setMathExpressionCompletionType(mathExpressionCompletionType: NSTextInputTraitType): Unit {
    val sel = ObjCRuntime.sel("setMathExpressionCompletionType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, mathExpressionCompletionType.rawValue)
}

// ── Category: NSQuickLookPreview on NSTextView ─────────────────────────────────────────

fun NSTextView.toggleQuickLookPreviewPanel(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleQuickLookPreviewPanel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSArray<id<QLPreviewItem>> * */
fun NSTextView.quickLookPreviewableItemsInRanges(ranges: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("quickLookPreviewableItemsInRanges:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ranges) as MemorySegment
}

fun NSTextView.updateQuickLookPreviewPanel(): Unit {
    val sel = ObjCRuntime.sel("updateQuickLookPreviewPanel")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSTextView_SharingService on NSTextView ─────────────────────────────────────────

fun NSTextView.orderFrontSharingServicePicker(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("orderFrontSharingServicePicker:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

// ── Category: NSTextView_TouchBar on NSTextView ─────────────────────────────────────────

fun NSTextView.toggleAutomaticTextCompletion(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleAutomaticTextCompletion:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSTextView.updateTouchBarItemIdentifiers(): Unit {
    val sel = ObjCRuntime.sel("updateTouchBarItemIdentifiers")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSTextView.updateTextTouchBarItems(): Unit {
    val sel = ObjCRuntime.sel("updateTextTouchBarItems")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSTextView.updateCandidates(): Unit {
    val sel = ObjCRuntime.sel("updateCandidates")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSTextView.isAutomaticTextCompletionEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAutomaticTextCompletionEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAutomaticTextCompletionEnabled(automaticTextCompletionEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutomaticTextCompletionEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, automaticTextCompletionEnabled)
}

fun NSTextView.allowsCharacterPickerTouchBarItem(): Boolean {
    val sel = ObjCRuntime.sel("allowsCharacterPickerTouchBarItem")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSTextView.setAllowsCharacterPickerTouchBarItem(allowsCharacterPickerTouchBarItem: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAllowsCharacterPickerTouchBarItem:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowsCharacterPickerTouchBarItem)
}

// ── Category: NSTextView_Factory on NSTextView ─────────────────────────────────────────

// Class method: +[NSTextView scrollableTextView]
fun NSTextView_scrollableTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollableTextView")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSTextView fieldEditor]
fun NSTextView_fieldEditor(): MemorySegment {
    val sel = ObjCRuntime.sel("fieldEditor")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSTextView scrollableDocumentContentTextView]
fun NSTextView_scrollableDocumentContentTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollableDocumentContentTextView")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSTextView scrollablePlainDocumentContentTextView]
fun NSTextView_scrollablePlainDocumentContentTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollablePlainDocumentContentTextView")
    val cls = ObjCRuntime.getClass("NSTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSTextView_TextHighlight on NSTextView ─────────────────────────────────────────

fun NSTextView.drawTextHighlightBackgroundForTextRange_origin(textRange: MemorySegment, origin: NSPoint): Unit {
    val sel = ObjCRuntime.sel("drawTextHighlightBackgroundForTextRange:origin:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textRange, ObjCRuntime.ObjCStructArg(origin.segment, NSPoint.layout))
}

fun NSTextView.highlight(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("highlight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSTextView.textHighlightAttributes(): MemorySegment {
    val sel = ObjCRuntime.sel("textHighlightAttributes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextView.setTextHighlightAttributes(textHighlightAttributes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTextHighlightAttributes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textHighlightAttributes)
}

// ── Category: NSDeprecated on NSTextView ─────────────────────────────────────────

fun NSTextView.toggleBaseWritingDirection(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleBaseWritingDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}
