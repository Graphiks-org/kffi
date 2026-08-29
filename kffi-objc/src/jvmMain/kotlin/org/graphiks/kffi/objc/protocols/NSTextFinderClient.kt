@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextFinderClient
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTextFinderClient {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun stringAtIndex_effectiveRange_endsWithSearchBoundary(characterIndex: Long, outRange: NSRangePointer, outFlag: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'stringAtIndex:effectiveRange:endsWithSearchBoundary:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun stringLength(): Long =
        throw UnsupportedOperationException("Optional ObjC method 'stringLength' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun scrollRangeToVisible(range: NSRange): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'scrollRangeToVisible:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun shouldReplaceCharactersInRanges_withStrings(ranges: MemorySegment, strings: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'shouldReplaceCharactersInRanges:withStrings:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun replaceCharactersInRange_withString(range: NSRange, string: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'replaceCharactersInRange:withString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun didReplaceCharacters(): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'didReplaceCharacters' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun contentViewAtIndex_effectiveCharacterRange(index: Long, outRange: NSRangePointer): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'contentViewAtIndex:effectiveCharacterRange:' not implemented")

    /** @return NSArray<NSValue *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun rectsForCharacterRange(range: NSRange): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'rectsForCharacterRange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun drawCharactersInRange_forContentView(range: NSRange, view: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'drawCharactersInRange:forContentView:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun isSelectable(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'isSelectable' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun allowsMultipleSelection(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'allowsMultipleSelection' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun isEditable(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'isEditable' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun string(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'string' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun firstSelectedRange(): NSRange =
        throw UnsupportedOperationException("Optional ObjC method 'firstSelectedRange' not implemented")

    /** @return NSArray<NSValue *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun selectedRanges(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'selectedRanges' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setSelectedRanges(selectedRanges: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setSelectedRanges:' not implemented")

    /** @return NSArray<NSValue *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun visibleCharacterRanges(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'visibleCharacterRanges' not implemented")

}
