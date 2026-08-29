@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextInputClient
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTextInputClient {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun insertText_replacementRange(string: MemorySegment, replacementRange: NSRange): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun doCommandBySelector(selector: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setMarkedText_selectedRange_replacementRange(string: MemorySegment, selectedRange: NSRange, replacementRange: NSRange): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun unmarkText(): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun selectedRange(): NSRange

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun markedRange(): NSRange

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun hasMarkedText(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun attributedSubstringForProposedRange_actualRange(range: NSRange, actualRange: NSRangePointer): MemorySegment

    /** @return NSArray<NSAttributedStringKey> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun validAttributesForMarkedText(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun firstRectForCharacterRange_actualRange(range: NSRange, actualRange: NSRangePointer): NSRect

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun characterIndexForPoint(point: NSPoint): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun attributedString(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'attributedString' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun fractionOfDistanceThroughGlyphForPoint(point: NSPoint): Double =
        throw UnsupportedOperationException("Optional ObjC method 'fractionOfDistanceThroughGlyphForPoint:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun baselineDeltaForCharacterAtIndex(anIndex: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'baselineDeltaForCharacterAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowLevel(): Long =
        throw UnsupportedOperationException("Optional ObjC method 'windowLevel' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun drawsVerticallyForCharacterAtIndex(charIndex: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'drawsVerticallyForCharacterAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun preferredTextAccessoryPlacement(): NSTextCursorAccessoryPlacement =
        throw UnsupportedOperationException("Optional ObjC method 'preferredTextAccessoryPlacement' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun insertAdaptiveImageGlyph_replacementRange(adaptiveImageGlyph: MemorySegment, replacementRange: NSRange): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'insertAdaptiveImageGlyph:replacementRange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun unionRectInVisibleSelectedRange(): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'unionRectInVisibleSelectedRange' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun documentVisibleRect(): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'documentVisibleRect' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun supportsAdaptiveImageGlyph(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'supportsAdaptiveImageGlyph' not implemented")

}
