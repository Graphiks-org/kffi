package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTypesetter
 * Superclass: NSObject
 */
open class NSTypesetter(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTypesetter") }

        fun printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count(layoutMgr: MemorySegment, nominallySpacedGlyphsRange: NSRange, packedGlyphs: MemorySegment, packedGlyphsCount: Long): NSSize {
            val sel = ObjCRuntime.sel("printingAdjustmentInLayoutManager:forNominallySpacedGlyphRange:packedGlyphs:count:")
            return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, _class, sel, layoutMgr, ObjCRuntime.ObjCStructArg(nominallySpacedGlyphsRange.segment, NSRange.layout), packedGlyphs, packedGlyphsCount))
        }

        fun sharedSystemTypesetterForBehavior(behavior: NSTypesetterBehavior): MemorySegment {
            val sel = ObjCRuntime.sel("sharedSystemTypesetterForBehavior:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, behavior.rawValue) as MemorySegment
        }

        fun sharedSystemTypesetter(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedSystemTypesetter")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun defaultTypesetterBehavior(): NSTypesetterBehavior {
            val sel = ObjCRuntime.sel("defaultTypesetterBehavior")
            return NSTypesetterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

    }

    open fun substituteFontForFont(originalFont: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("substituteFontForFont:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, originalFont) as MemorySegment
    }

    open fun textTabForGlyphLocation_writingDirection_maxLocation(glyphLocation: Double, direction: NSWritingDirection, maxLocation: Double): MemorySegment {
        val sel = ObjCRuntime.sel("textTabForGlyphLocation:writingDirection:maxLocation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, glyphLocation, direction.rawValue, maxLocation) as MemorySegment
    }

    open fun setParagraphGlyphRange_separatorGlyphRange(paragraphRange: NSRange, paragraphSeparatorRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setParagraphGlyphRange:separatorGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(paragraphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(paragraphSeparatorRange.segment, NSRange.layout))
    }

    open fun layoutParagraphAtPoint(lineFragmentOrigin: NSPointPointer): Long {
        val sel = ObjCRuntime.sel("layoutParagraphAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, lineFragmentOrigin.segment) as Long
    }

    open fun beginParagraph(): Unit {
        val sel = ObjCRuntime.sel("beginParagraph")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun endParagraph(): Unit {
        val sel = ObjCRuntime.sel("endParagraph")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun beginLineWithGlyphAtIndex(glyphIndex: Long): Unit {
        val sel = ObjCRuntime.sel("beginLineWithGlyphAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, glyphIndex)
    }

    open fun endLineWithGlyphRange(lineGlyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("endLineWithGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(lineGlyphRange.segment, NSRange.layout))
    }

    open fun lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Long, rect: NSRect): Double {
        val sel = ObjCRuntime.sel("lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, glyphIndex, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Double
    }

    open fun paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Long, rect: NSRect): Double {
        val sel = ObjCRuntime.sel("paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, glyphIndex, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Double
    }

    open fun paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Long, rect: NSRect): Double {
        val sel = ObjCRuntime.sel("paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, glyphIndex, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Double
    }

    open fun getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin(lineFragmentRect: NSRectPointer, lineFragmentUsedRect: NSRectPointer, paragraphSeparatorGlyphRange: NSRange, lineOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, lineFragmentRect.segment, lineFragmentUsedRect.segment, ObjCRuntime.ObjCStructArg(paragraphSeparatorGlyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(lineOrigin.segment, NSPoint.layout))
    }

    open fun setHardInvalidation_forGlyphRange(flag: Boolean, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setHardInvalidation:forGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, flag, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    open fun layoutGlyphsInLayoutManager_startingAtGlyphIndex_maxNumberOfLineFragments_nextGlyphIndex(layoutManager: MemorySegment, startGlyphIndex: Long, maxNumLines: Long, nextGlyph: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("layoutGlyphsInLayoutManager:startingAtGlyphIndex:maxNumberOfLineFragments:nextGlyphIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, layoutManager, startGlyphIndex, maxNumLines, nextGlyph)
    }

    open fun layoutCharactersInRange_forLayoutManager_maximumNumberOfLineFragments(characterRange: NSRange, layoutManager: MemorySegment, maxNumLines: Long): NSRange {
        val sel = ObjCRuntime.sel("layoutCharactersInRange:forLayoutManager:maximumNumberOfLineFragments:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(characterRange.segment, NSRange.layout), layoutManager, maxNumLines))
    }

    open fun baselineOffsetInLayoutManager_glyphIndex(layoutMgr: MemorySegment, glyphIndex: Long): Double {
        val sel = ObjCRuntime.sel("baselineOffsetInLayoutManager:glyphIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, layoutMgr, glyphIndex) as Double
    }

    // @property usesFontLeading
    open fun usesFontLeading(): Boolean {
        val sel = ObjCRuntime.sel("usesFontLeading")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setUsesFontLeading(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesFontLeading:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property typesetterBehavior
    open fun typesetterBehavior(): NSTypesetterBehavior {
        val sel = ObjCRuntime.sel("typesetterBehavior")
        return NSTypesetterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTypesetterBehavior(value: NSTypesetterBehavior) {
        val sel = ObjCRuntime.sel("setTypesetterBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property hyphenationFactor
    open fun hyphenationFactor(): Float {
        val sel = ObjCRuntime.sel("hyphenationFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    open fun setHyphenationFactor(value: Float) {
        val sel = ObjCRuntime.sel("setHyphenationFactor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lineFragmentPadding
    open fun lineFragmentPadding(): Double {
        val sel = ObjCRuntime.sel("lineFragmentPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setLineFragmentPadding(value: Double) {
        val sel = ObjCRuntime.sel("setLineFragmentPadding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bidiProcessingEnabled
    open fun bidiProcessingEnabled(): Boolean {
        val sel = ObjCRuntime.sel("bidiProcessingEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setBidiProcessingEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setBidiProcessingEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property attributedString
    open fun attributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property paragraphGlyphRange
    open fun paragraphGlyphRange(): NSRange {
        val sel = ObjCRuntime.sel("paragraphGlyphRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property paragraphSeparatorGlyphRange
    open fun paragraphSeparatorGlyphRange(): NSRange {
        val sel = ObjCRuntime.sel("paragraphSeparatorGlyphRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property paragraphCharacterRange
    open fun paragraphCharacterRange(): NSRange {
        val sel = ObjCRuntime.sel("paragraphCharacterRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property paragraphSeparatorCharacterRange
    open fun paragraphSeparatorCharacterRange(): NSRange {
        val sel = ObjCRuntime.sel("paragraphSeparatorCharacterRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property attributesForExtraLineFragment
    /** @return NSDictionary<NSAttributedStringKey,id> * */
    open fun attributesForExtraLineFragment(): MemorySegment {
        val sel = ObjCRuntime.sel("attributesForExtraLineFragment")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property layoutManager
    open fun layoutManager(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutManager")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textContainers
    /** @return NSArray<NSTextContainer *> * */
    open fun textContainers(): MemorySegment {
        val sel = ObjCRuntime.sel("textContainers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property currentTextContainer
    open fun currentTextContainer(): MemorySegment {
        val sel = ObjCRuntime.sel("currentTextContainer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property currentParagraphStyle
    open fun currentParagraphStyle(): MemorySegment {
        val sel = ObjCRuntime.sel("currentParagraphStyle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property sharedSystemTypesetter
    open fun sharedSystemTypesetter(): MemorySegment {
        val sel = ObjCRuntime.sel("sharedSystemTypesetter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property defaultTypesetterBehavior
    open fun defaultTypesetterBehavior(): NSTypesetterBehavior {
        val sel = ObjCRuntime.sel("defaultTypesetterBehavior")
        return NSTypesetterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

// ── Category: NSLayoutPhaseInterface on NSTypesetter ─────────────────────────────────────────

fun NSTypesetter.willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset(lineRect: NSRectPointer, glyphRange: NSRange, usedRect: NSRectPointer, baselineOffset: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("willSetLineFragmentRect:forGlyphRange:usedRect:baselineOffset:")
    ObjCRuntime.msgSend(null, this.ptr, sel, lineRect.segment, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), usedRect.segment, baselineOffset)
}

fun NSTypesetter.shouldBreakLineByWordBeforeCharacterAtIndex(charIndex: Long): Boolean {
    val sel = ObjCRuntime.sel("shouldBreakLineByWordBeforeCharacterAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, charIndex) as Boolean
}

fun NSTypesetter.shouldBreakLineByHyphenatingBeforeCharacterAtIndex(charIndex: Long): Boolean {
    val sel = ObjCRuntime.sel("shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, charIndex) as Boolean
}

fun NSTypesetter.hyphenationFactorForGlyphAtIndex(glyphIndex: Long): Float {
    val sel = ObjCRuntime.sel("hyphenationFactorForGlyphAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel, glyphIndex) as Float
}

fun NSTypesetter.hyphenCharacterForGlyphAtIndex(glyphIndex: Long): Int {
    val sel = ObjCRuntime.sel("hyphenCharacterForGlyphAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel, glyphIndex) as Int
}

fun NSTypesetter.boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex(glyphIndex: Long, textContainer: MemorySegment, proposedRect: NSRect, glyphPosition: NSPoint, charIndex: Long): NSRect {
    val sel = ObjCRuntime.sel("boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, glyphIndex, textContainer, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(glyphPosition.segment, NSPoint.layout), charIndex))
}

// ── Category: NSGlyphStorageInterface on NSTypesetter ─────────────────────────────────────────

fun NSTypesetter.characterRangeForGlyphRange_actualGlyphRange(glyphRange: NSRange, actualGlyphRange: NSRangePointer): NSRange {
    val sel = ObjCRuntime.sel("characterRangeForGlyphRange:actualGlyphRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), actualGlyphRange.segment))
}

fun NSTypesetter.glyphRangeForCharacterRange_actualCharacterRange(charRange: NSRange, actualCharRange: NSRangePointer): NSRange {
    val sel = ObjCRuntime.sel("glyphRangeForCharacterRange:actualCharacterRange:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), actualCharRange.segment))
}

fun NSTypesetter.getLineFragmentRect_usedRect_remainingRect_forStartingGlyphAtIndex_proposedRect_lineSpacing_paragraphSpacingBefore_paragraphSpacingAfter(lineFragmentRect: NSRectPointer, lineFragmentUsedRect: NSRectPointer, remainingRect: NSRectPointer, startingGlyphIndex: Long, proposedRect: NSRect, lineSpacing: Double, paragraphSpacingBefore: Double, paragraphSpacingAfter: Double): Unit {
    val sel = ObjCRuntime.sel("getLineFragmentRect:usedRect:remainingRect:forStartingGlyphAtIndex:proposedRect:lineSpacing:paragraphSpacingBefore:paragraphSpacingAfter:")
    ObjCRuntime.msgSend(null, this.ptr, sel, lineFragmentRect.segment, lineFragmentUsedRect.segment, remainingRect.segment, startingGlyphIndex, ObjCRuntime.ObjCStructArg(proposedRect.segment, NSRect.layout), lineSpacing, paragraphSpacingBefore, paragraphSpacingAfter)
}

fun NSTypesetter.setLineFragmentRect_forGlyphRange_usedRect_baselineOffset(fragmentRect: NSRect, glyphRange: NSRange, usedRect: NSRect, baselineOffset: Double): Unit {
    val sel = ObjCRuntime.sel("setLineFragmentRect:forGlyphRange:usedRect:baselineOffset:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(fragmentRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(usedRect.segment, NSRect.layout), baselineOffset)
}

fun NSTypesetter.setNotShownAttribute_forGlyphRange(flag: Boolean, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setNotShownAttribute:forGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

fun NSTypesetter.setDrawsOutsideLineFragment_forGlyphRange(flag: Boolean, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setDrawsOutsideLineFragment:forGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

fun NSTypesetter.setLocation_withAdvancements_forStartOfGlyphRange(location: NSPoint, advancements: MemorySegment, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setLocation:withAdvancements:forStartOfGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), advancements, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

fun NSTypesetter.setAttachmentSize_forGlyphRange(attachmentSize: NSSize, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setAttachmentSize:forGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(attachmentSize.segment, NSSize.layout), ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

fun NSTypesetter.setBidiLevels_forGlyphRange(levels: MemorySegment, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setBidiLevels:forGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, levels, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

// ── Category: NSTypesetter_Deprecated on NSTypesetter ─────────────────────────────────────────

fun NSTypesetter.actionForControlCharacterAtIndex(charIndex: Long): NSTypesetterControlCharacterAction {
    val sel = ObjCRuntime.sel("actionForControlCharacterAtIndex:")
    return NSTypesetterControlCharacterAction(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, charIndex) as Long)
}

fun NSTypesetter.getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels(glyphsRange: NSRange, glyphBuffer: MemorySegment, charIndexBuffer: MemorySegment, inscribeBuffer: MemorySegment, elasticBuffer: MemorySegment, bidiLevelBuffer: MemorySegment): Long {
    val sel = ObjCRuntime.sel("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:bidiLevels:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphsRange.segment, NSRange.layout), glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer, bidiLevelBuffer) as Long
}

fun NSTypesetter.substituteGlyphsInRange_withGlyphs(glyphRange: NSRange, glyphs: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("substituteGlyphsInRange:withGlyphs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), glyphs)
}

fun NSTypesetter.insertGlyph_atGlyphIndex_characterIndex(glyph: Int, glyphIndex: Long, characterIndex: Long): Unit {
    val sel = ObjCRuntime.sel("insertGlyph:atGlyphIndex:characterIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyph, glyphIndex, characterIndex)
}

fun NSTypesetter.deleteGlyphsInRange(glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("deleteGlyphsInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}
