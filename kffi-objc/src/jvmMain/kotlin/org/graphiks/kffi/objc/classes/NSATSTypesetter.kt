package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSATSTypesetter
 * Superclass: NSTypesetter
 */
open class NSATSTypesetter(override val ptr: MemorySegment) : NSTypesetter(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSATSTypesetter") }

        fun sharedTypesetter(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedTypesetter")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property sharedTypesetter
    open fun sharedTypesetter(): MemorySegment {
        val sel = ObjCRuntime.sel("sharedTypesetter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category: NSPantherCompatibility on NSATSTypesetter ─────────────────────────────────────────

fun NSATSTypesetter.lineFragmentRectForProposedRect_remainingRect(proposedRect: NSRect, remainingRect: NSRectPointer): NSRect {
    val sel = ObjCRuntime.sel("lineFragmentRectForProposedRect:remainingRect:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), remainingRect.segment))
}

// ── Category: NSPrimitiveInterface on NSATSTypesetter ─────────────────────────────────────────

fun NSATSTypesetter.substituteFontForFont(originalFont: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("substituteFontForFont:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, originalFont) as MemorySegment
}

fun NSATSTypesetter.textTabForGlyphLocation_writingDirection_maxLocation(glyphLocation: Double, direction: NSWritingDirection, maxLocation: Double): MemorySegment {
    val sel = ObjCRuntime.sel("textTabForGlyphLocation:writingDirection:maxLocation:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, glyphLocation, direction.rawValue, maxLocation) as MemorySegment
}

fun NSATSTypesetter.setParagraphGlyphRange_separatorGlyphRange(paragraphRange: NSRange, paragraphSeparatorRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setParagraphGlyphRange:separatorGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(paragraphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(paragraphSeparatorRange.segment, NSRange.layout))
}

fun NSATSTypesetter.layoutParagraphAtPoint(lineFragmentOrigin: NSPointPointer): Long {
    val sel = ObjCRuntime.sel("layoutParagraphAtPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, lineFragmentOrigin.segment) as Long
}

fun NSATSTypesetter.lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Long, rect: NSRect): Double {
    val sel = ObjCRuntime.sel("lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, glyphIndex, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Double
}

fun NSATSTypesetter.paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Long, rect: NSRect): Double {
    val sel = ObjCRuntime.sel("paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, glyphIndex, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Double
}

fun NSATSTypesetter.paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Long, rect: NSRect): Double {
    val sel = ObjCRuntime.sel("paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, glyphIndex, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Double
}

fun NSATSTypesetter.setHardInvalidation_forGlyphRange(flag: Boolean, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setHardInvalidation:forGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

fun NSATSTypesetter.getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin(lineFragmentRect: NSRectPointer, lineFragmentUsedRect: NSRectPointer, paragraphSeparatorGlyphRange: NSRange, lineOrigin: NSPoint): Unit {
    val sel = ObjCRuntime.sel("getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:")
    ObjCRuntime.msgSend(null, this.ptr, sel, lineFragmentRect.segment, lineFragmentUsedRect.segment, ObjCRuntime.ObjCStructArg(paragraphSeparatorGlyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(lineOrigin.segment, NSPoint.layout))
}

fun NSATSTypesetter.usesFontLeading(): Boolean {
    val sel = ObjCRuntime.sel("usesFontLeading")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSATSTypesetter.setUsesFontLeading(usesFontLeading: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesFontLeading:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesFontLeading)
}

fun NSATSTypesetter.typesetterBehavior(): NSTypesetterBehavior {
    val sel = ObjCRuntime.sel("typesetterBehavior")
    return NSTypesetterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSATSTypesetter.setTypesetterBehavior(typesetterBehavior: NSTypesetterBehavior): Unit {
    val sel = ObjCRuntime.sel("setTypesetterBehavior:")
    ObjCRuntime.msgSend(null, this.ptr, sel, typesetterBehavior.rawValue)
}

fun NSATSTypesetter.hyphenationFactor(): Float {
    val sel = ObjCRuntime.sel("hyphenationFactor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}

fun NSATSTypesetter.setHyphenationFactor(hyphenationFactor: Float): Unit {
    val sel = ObjCRuntime.sel("setHyphenationFactor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hyphenationFactor)
}

fun NSATSTypesetter.lineFragmentPadding(): Double {
    val sel = ObjCRuntime.sel("lineFragmentPadding")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSATSTypesetter.setLineFragmentPadding(lineFragmentPadding: Double): Unit {
    val sel = ObjCRuntime.sel("setLineFragmentPadding:")
    ObjCRuntime.msgSend(null, this.ptr, sel, lineFragmentPadding)
}

fun NSATSTypesetter.bidiProcessingEnabled(): Boolean {
    val sel = ObjCRuntime.sel("bidiProcessingEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSATSTypesetter.setBidiProcessingEnabled(bidiProcessingEnabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setBidiProcessingEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, bidiProcessingEnabled)
}

fun NSATSTypesetter.attributedString(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSATSTypesetter.setAttributedString(attributedString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedString)
}

fun NSATSTypesetter.paragraphGlyphRange(): NSRange {
    val sel = ObjCRuntime.sel("paragraphGlyphRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

fun NSATSTypesetter.paragraphSeparatorGlyphRange(): NSRange {
    val sel = ObjCRuntime.sel("paragraphSeparatorGlyphRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}

fun NSATSTypesetter.layoutManager(): MemorySegment {
    val sel = ObjCRuntime.sel("layoutManager")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSATSTypesetter.currentTextContainer(): MemorySegment {
    val sel = ObjCRuntime.sel("currentTextContainer")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSLayoutPhaseInterface on NSATSTypesetter ─────────────────────────────────────────

fun NSATSTypesetter.willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset(lineRect: NSRectPointer, glyphRange: NSRange, usedRect: NSRectPointer, baselineOffset: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("willSetLineFragmentRect:forGlyphRange:usedRect:baselineOffset:")
    ObjCRuntime.msgSend(null, this.ptr, sel, lineRect.segment, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), usedRect.segment, baselineOffset)
}

fun NSATSTypesetter.shouldBreakLineByWordBeforeCharacterAtIndex(charIndex: Long): Boolean {
    val sel = ObjCRuntime.sel("shouldBreakLineByWordBeforeCharacterAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, charIndex) as Boolean
}

fun NSATSTypesetter.shouldBreakLineByHyphenatingBeforeCharacterAtIndex(charIndex: Long): Boolean {
    val sel = ObjCRuntime.sel("shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, charIndex) as Boolean
}

fun NSATSTypesetter.hyphenationFactorForGlyphAtIndex(glyphIndex: Long): Float {
    val sel = ObjCRuntime.sel("hyphenationFactorForGlyphAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel, glyphIndex) as Float
}

fun NSATSTypesetter.hyphenCharacterForGlyphAtIndex(glyphIndex: Long): Int {
    val sel = ObjCRuntime.sel("hyphenCharacterForGlyphAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel, glyphIndex) as Int
}

fun NSATSTypesetter.boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex(glyphIndex: Long, textContainer: MemorySegment, proposedRect: NSRect, glyphPosition: NSPoint, charIndex: Long): NSRect {
    val sel = ObjCRuntime.sel("boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, glyphIndex, textContainer, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(glyphPosition.segment, NSPoint.layout), charIndex))
}

// ── Category: NSGlyphStorageInterface on NSATSTypesetter ─────────────────────────────────────────

fun NSATSTypesetter.getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(glyphsRange: NSRange, glyphBuffer: MemorySegment, charIndexBuffer: MemorySegment, inscribeBuffer: MemorySegment, elasticBuffer: MemorySegment): Long {
    val sel = ObjCRuntime.sel("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphsRange.segment, NSRange.layout), glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer) as Long
}
