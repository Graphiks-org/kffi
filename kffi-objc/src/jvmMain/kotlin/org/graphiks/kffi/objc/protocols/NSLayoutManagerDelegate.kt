@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSLayoutManagerDelegate
 * Inherits protocols: NSObject
 */
interface NSLayoutManagerDelegate {
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_shouldGenerateGlyphs_properties_characterIndexes_font_forGlyphRange(layoutManager: MemorySegment, glyphs: MemorySegment, props: MemorySegment, charIndexes: MemorySegment, aFont: MemorySegment, glyphRange: NSRange): Long =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(layoutManager: MemorySegment, glyphIndex: Long, rect: NSRect): Double =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(layoutManager: MemorySegment, glyphIndex: Long, rect: NSRect): Double =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(layoutManager: MemorySegment, glyphIndex: Long, rect: NSRect): Double =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_shouldUseAction_forControlCharacterAtIndex(layoutManager: MemorySegment, action: NSControlCharacterAction, charIndex: Long): NSControlCharacterAction =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:shouldUseAction:forControlCharacterAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_shouldBreakLineByWordBeforeCharacterAtIndex(layoutManager: MemorySegment, charIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_shouldBreakLineByHyphenatingBeforeCharacterAtIndex(layoutManager: MemorySegment, charIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex(layoutManager: MemorySegment, glyphIndex: Long, textContainer: MemorySegment, proposedRect: NSRect, glyphPosition: NSPoint, charIndex: Long): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_shouldSetLineFragmentRect_lineFragmentUsedRect_baselineOffset_inTextContainer_forGlyphRange(layoutManager: MemorySegment, lineFragmentRect: NSRectPointer, lineFragmentUsedRect: NSRectPointer, baselineOffset: MemorySegment, textContainer: MemorySegment, glyphRange: NSRange): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:shouldSetLineFragmentRect:lineFragmentUsedRect:baselineOffset:inTextContainer:forGlyphRange:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManagerDidInvalidateLayout(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManagerDidInvalidateLayout:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_didCompleteLayoutForTextContainer_atEnd(layoutManager: MemorySegment, textContainer: MemorySegment, layoutFinishedFlag: Boolean): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:didCompleteLayoutForTextContainer:atEnd:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun layoutManager_textContainer_didChangeGeometryFromSize(layoutManager: MemorySegment, textContainer: MemorySegment, oldSize: NSSize): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:textContainer:didChangeGeometryFromSize:' not implemented")

    /** @return NSDictionary<NSAttributedStringKey,id> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun layoutManager_shouldUseTemporaryAttributes_forDrawingToScreen_atCharacterIndex_effectiveRange(layoutManager: MemorySegment, attrs: MemorySegment, toScreen: Boolean, charIndex: Long, effectiveCharRange: NSRangePointer): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'layoutManager:shouldUseTemporaryAttributes:forDrawingToScreen:atCharacterIndex:effectiveRange:' not implemented")

}
