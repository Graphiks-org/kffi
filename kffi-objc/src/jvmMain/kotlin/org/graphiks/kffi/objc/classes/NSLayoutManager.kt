@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLayoutManager
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
open class NSLayoutManager(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSLayoutManager") }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun replaceTextStorage(newTextStorage: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceTextStorage:")
        ObjCRuntime.msgSend(null, ptr, sel, newTextStorage)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun addTextContainer(container: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, container)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun insertTextContainer_atIndex(container: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertTextContainer:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, container, index)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun removeTextContainerAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeTextContainerAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun textContainerChangedGeometry(container: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textContainerChangedGeometry:")
        ObjCRuntime.msgSend(null, ptr, sel, container)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun textContainerChangedTextView(container: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("textContainerChangedTextView:")
        ObjCRuntime.msgSend(null, ptr, sel, container)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange(charRange: NSRange, delta: Long, actualCharRange: NSRangePointer): Unit {
        val sel = ObjCRuntime.sel("invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), delta, actualCharRange.segment)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun invalidateLayoutForCharacterRange_actualCharacterRange(charRange: NSRange, actualCharRange: NSRangePointer): Unit {
        val sel = ObjCRuntime.sel("invalidateLayoutForCharacterRange:actualCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), actualCharRange.segment)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun invalidateDisplayForCharacterRange(charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("invalidateDisplayForCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun invalidateDisplayForGlyphRange(glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("invalidateDisplayForGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun processEditingForTextStorage_edited_range_changeInLength_invalidatedRange(textStorage: MemorySegment, editMask: NSTextStorageEditActions, newCharRange: NSRange, delta: Long, invalidatedCharRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
        ObjCRuntime.msgSend(null, ptr, sel, textStorage, editMask.rawValue, ObjCRuntime.ObjCStructArg(newCharRange.segment, NSRange.layout), delta, ObjCRuntime.ObjCStructArg(invalidatedCharRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun ensureGlyphsForCharacterRange(charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("ensureGlyphsForCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun ensureGlyphsForGlyphRange(glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("ensureGlyphsForGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun ensureLayoutForCharacterRange(charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("ensureLayoutForCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun ensureLayoutForGlyphRange(glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("ensureLayoutForGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun ensureLayoutForTextContainer(container: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("ensureLayoutForTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, container)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun ensureLayoutForBoundingRect_inTextContainer(bounds: NSRect, container: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("ensureLayoutForBoundingRect:inTextContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(bounds.segment, NSRect.layout), container)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setGlyphs_properties_characterIndexes_font_forGlyphRange(glyphs: MemorySegment, props: MemorySegment, charIndexes: MemorySegment, aFont: MemorySegment, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setGlyphs:properties:characterIndexes:font:forGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, glyphs, props, charIndexes, aFont, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun CGGlyphAtIndex_isValidIndex(glyphIndex: Long, isValidIndex: MemorySegment): Short {
        val sel = ObjCRuntime.sel("CGGlyphAtIndex:isValidIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, ptr, sel, glyphIndex, isValidIndex) as Short
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun CGGlyphAtIndex(glyphIndex: Long): Short {
        val sel = ObjCRuntime.sel("CGGlyphAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, ptr, sel, glyphIndex) as Short
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun isValidGlyphIndex(glyphIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("isValidGlyphIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, glyphIndex) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun propertyForGlyphAtIndex(glyphIndex: Long): NSGlyphProperty {
        val sel = ObjCRuntime.sel("propertyForGlyphAtIndex:")
        return NSGlyphProperty(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, glyphIndex) as Long)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun characterIndexForGlyphAtIndex(glyphIndex: Long): Long {
        val sel = ObjCRuntime.sel("characterIndexForGlyphAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, glyphIndex) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphIndexForCharacterAtIndex(charIndex: Long): Long {
        val sel = ObjCRuntime.sel("glyphIndexForCharacterAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, charIndex) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun getGlyphsInRange_glyphs_properties_characterIndexes_bidiLevels(glyphRange: NSRange, glyphBuffer: MemorySegment, props: MemorySegment, charIndexBuffer: MemorySegment, bidiLevelBuffer: MemorySegment): Long {
        val sel = ObjCRuntime.sel("getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), glyphBuffer, props, charIndexBuffer, bidiLevelBuffer) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setTextContainer_forGlyphRange(container: MemorySegment, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setTextContainer:forGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, container, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setLineFragmentRect_forGlyphRange_usedRect(fragmentRect: NSRect, glyphRange: NSRange, usedRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("setLineFragmentRect:forGlyphRange:usedRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(fragmentRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(usedRect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setExtraLineFragmentRect_usedRect_textContainer(fragmentRect: NSRect, usedRect: NSRect, container: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setExtraLineFragmentRect:usedRect:textContainer:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(fragmentRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(usedRect.segment, NSRect.layout), container)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setLocation_forStartOfGlyphRange(location: NSPoint, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setLocation:forStartOfGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setNotShownAttribute_forGlyphAtIndex(flag: Boolean, glyphIndex: Long): Unit {
        val sel = ObjCRuntime.sel("setNotShownAttribute:forGlyphAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, flag, glyphIndex)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setDrawsOutsideLineFragment_forGlyphAtIndex(flag: Boolean, glyphIndex: Long): Unit {
        val sel = ObjCRuntime.sel("setDrawsOutsideLineFragment:forGlyphAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, flag, glyphIndex)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setAttachmentSize_forGlyphRange(attachmentSize: NSSize, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setAttachmentSize:forGlyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(attachmentSize.segment, NSSize.layout), ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun getFirstUnlaidCharacterIndex_glyphIndex(charIndex: MemorySegment, glyphIndex: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getFirstUnlaidCharacterIndex:glyphIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, charIndex, glyphIndex)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun firstUnlaidCharacterIndex(): Long {
        val sel = ObjCRuntime.sel("firstUnlaidCharacterIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun firstUnlaidGlyphIndex(): Long {
        val sel = ObjCRuntime.sel("firstUnlaidGlyphIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun textContainerForGlyphAtIndex_effectiveRange(glyphIndex: Long, effectiveGlyphRange: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("textContainerForGlyphAtIndex:effectiveRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, glyphIndex, effectiveGlyphRange.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(glyphIndex: Long, effectiveGlyphRange: NSRangePointer, flag: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, glyphIndex, effectiveGlyphRange.segment, flag) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun usedRectForTextContainer(container: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("usedRectForTextContainer:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, container))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun lineFragmentRectForGlyphAtIndex_effectiveRange(glyphIndex: Long, effectiveGlyphRange: NSRangePointer): NSRect {
        val sel = ObjCRuntime.sel("lineFragmentRectForGlyphAtIndex:effectiveRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, glyphIndex, effectiveGlyphRange.segment))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(glyphIndex: Long, effectiveGlyphRange: NSRangePointer, flag: Boolean): NSRect {
        val sel = ObjCRuntime.sel("lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, glyphIndex, effectiveGlyphRange.segment, flag))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun lineFragmentUsedRectForGlyphAtIndex_effectiveRange(glyphIndex: Long, effectiveGlyphRange: NSRangePointer): NSRect {
        val sel = ObjCRuntime.sel("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, glyphIndex, effectiveGlyphRange.segment))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(glyphIndex: Long, effectiveGlyphRange: NSRangePointer, flag: Boolean): NSRect {
        val sel = ObjCRuntime.sel("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, glyphIndex, effectiveGlyphRange.segment, flag))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun locationForGlyphAtIndex(glyphIndex: Long): NSPoint {
        val sel = ObjCRuntime.sel("locationForGlyphAtIndex:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, glyphIndex))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun notShownAttributeForGlyphAtIndex(glyphIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("notShownAttributeForGlyphAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, glyphIndex) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun drawsOutsideLineFragmentForGlyphAtIndex(glyphIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("drawsOutsideLineFragmentForGlyphAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, glyphIndex) as Boolean
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun attachmentSizeForGlyphAtIndex(glyphIndex: Long): NSSize {
        val sel = ObjCRuntime.sel("attachmentSizeForGlyphAtIndex:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, glyphIndex))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun truncatedGlyphRangeInLineFragmentForGlyphAtIndex(glyphIndex: Long): NSRange {
        val sel = ObjCRuntime.sel("truncatedGlyphRangeInLineFragmentForGlyphAtIndex:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, glyphIndex))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphRangeForCharacterRange_actualCharacterRange(charRange: NSRange, actualCharRange: NSRangePointer): NSRange {
        val sel = ObjCRuntime.sel("glyphRangeForCharacterRange:actualCharacterRange:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), actualCharRange.segment))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun characterRangeForGlyphRange_actualGlyphRange(glyphRange: NSRange, actualGlyphRange: NSRangePointer): NSRange {
        val sel = ObjCRuntime.sel("characterRangeForGlyphRange:actualGlyphRange:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), actualGlyphRange.segment))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphRangeForTextContainer(container: MemorySegment): NSRange {
        val sel = ObjCRuntime.sel("glyphRangeForTextContainer:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, container))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun rangeOfNominallySpacedGlyphsContainingIndex(glyphIndex: Long): NSRange {
        val sel = ObjCRuntime.sel("rangeOfNominallySpacedGlyphsContainingIndex:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, glyphIndex))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun boundingRectForGlyphRange_inTextContainer(glyphRange: NSRange, container: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("boundingRectForGlyphRange:inTextContainer:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), container))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphRangeForBoundingRect_inTextContainer(bounds: NSRect, container: MemorySegment): NSRange {
        val sel = ObjCRuntime.sel("glyphRangeForBoundingRect:inTextContainer:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(bounds.segment, NSRect.layout), container))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer(bounds: NSRect, container: MemorySegment): NSRange {
        val sel = ObjCRuntime.sel("glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(bounds.segment, NSRect.layout), container))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph(point: NSPoint, container: MemorySegment, partialFraction: MemorySegment): Long {
        val sel = ObjCRuntime.sel("glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), container, partialFraction) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun glyphIndexForPoint_inTextContainer(point: NSPoint, container: MemorySegment): Long {
        val sel = ObjCRuntime.sel("glyphIndexForPoint:inTextContainer:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), container) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun fractionOfDistanceThroughGlyphForPoint_inTextContainer(point: NSPoint, container: MemorySegment): Double {
        val sel = ObjCRuntime.sel("fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), container) as Double
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints(point: NSPoint, container: MemorySegment, partialFraction: MemorySegment): Long {
        val sel = ObjCRuntime.sel("characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), container, partialFraction) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes(charIndex: Long, aFlag: Boolean, dFlag: Boolean, positions: MemorySegment, charIndexes: MemorySegment): Long {
        val sel = ObjCRuntime.sel("getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, charIndex, aFlag, dFlag, positions, charIndexes) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun enumerateLineFragmentsForGlyphRange_usingBlock(glyphRange: NSRange, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateLineFragmentsForGlyphRange:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), block)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun enumerateEnclosingRectsForGlyphRange_withinSelectedGlyphRange_inTextContainer_usingBlock(glyphRange: NSRange, selectedRange: NSRange, textContainer: MemorySegment, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(selectedRange.segment, NSRange.layout), textContainer, block)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun drawBackgroundForGlyphRange_atPoint(glyphsToShow: NSRange, origin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("drawBackgroundForGlyphRange:atPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphsToShow.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(origin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun drawGlyphsForGlyphRange_atPoint(glyphsToShow: NSRange, origin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("drawGlyphsForGlyphRange:atPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphsToShow.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(origin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun showCGGlyphs_positions_count_font_textMatrix_attributes_inContext(glyphs: MemorySegment, positions: CGPointPointer, glyphCount: Long, font: MemorySegment, textMatrix: CGAffineTransform, attributes: MemorySegment, CGContext: CGContextRef): Unit {
        val sel = ObjCRuntime.sel("showCGGlyphs:positions:count:font:textMatrix:attributes:inContext:")
        ObjCRuntime.msgSend(null, ptr, sel, glyphs, positions.segment, glyphCount, font, ObjCRuntime.ObjCStructArg(textMatrix.segment, CGAffineTransform.layout), attributes, CGContext.segment)
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun fillBackgroundRectArray_count_forCharacterRange_color(rectArray: NSRectPointer, rectCount: Long, charRange: NSRange, color: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("fillBackgroundRectArray:count:forCharacterRange:color:")
        ObjCRuntime.msgSend(null, ptr, sel, rectArray.segment, rectCount, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), color)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: NSRange, underlineVal: NSUnderlineStyle, baselineOffset: Double, lineRect: NSRect, lineGlyphRange: NSRange, containerOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), underlineVal.rawValue, baselineOffset, ObjCRuntime.ObjCStructArg(lineRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(lineGlyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(containerOrigin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: NSRange, underlineVal: NSUnderlineStyle, lineRect: NSRect, lineGlyphRange: NSRange, containerOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), underlineVal.rawValue, ObjCRuntime.ObjCStructArg(lineRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(lineGlyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(containerOrigin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: NSRange, strikethroughVal: NSUnderlineStyle, baselineOffset: Double, lineRect: NSRect, lineGlyphRange: NSRange, containerOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), strikethroughVal.rawValue, baselineOffset, ObjCRuntime.ObjCStructArg(lineRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(lineGlyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(containerOrigin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: NSRange, strikethroughVal: NSUnderlineStyle, lineRect: NSRect, lineGlyphRange: NSRange, containerOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), strikethroughVal.rawValue, ObjCRuntime.ObjCStructArg(lineRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(lineGlyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(containerOrigin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun showAttachmentCell_inRect_characterIndex(cell: MemorySegment, rect: NSRect, attachmentIndex: Long): Unit {
        val sel = ObjCRuntime.sel("showAttachmentCell:inRect:characterIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, cell, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), attachmentIndex)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setLayoutRect_forTextBlock_glyphRange(rect: NSRect, block: MemorySegment, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setLayoutRect:forTextBlock:glyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), block, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setBoundsRect_forTextBlock_glyphRange(rect: NSRect, block: MemorySegment, glyphRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setBoundsRect:forTextBlock:glyphRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), block, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun layoutRectForTextBlock_glyphRange(block: MemorySegment, glyphRange: NSRange): NSRect {
        val sel = ObjCRuntime.sel("layoutRectForTextBlock:glyphRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, block, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout)))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun boundsRectForTextBlock_glyphRange(block: MemorySegment, glyphRange: NSRange): NSRect {
        val sel = ObjCRuntime.sel("boundsRectForTextBlock:glyphRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, block, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout)))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun layoutRectForTextBlock_atIndex_effectiveRange(block: MemorySegment, glyphIndex: Long, effectiveGlyphRange: NSRangePointer): NSRect {
        val sel = ObjCRuntime.sel("layoutRectForTextBlock:atIndex:effectiveRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, block, glyphIndex, effectiveGlyphRange.segment))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun boundsRectForTextBlock_atIndex_effectiveRange(block: MemorySegment, glyphIndex: Long, effectiveGlyphRange: NSRangePointer): NSRect {
        val sel = ObjCRuntime.sel("boundsRectForTextBlock:atIndex:effectiveRange:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, block, glyphIndex, effectiveGlyphRange.segment))
    }

    /** @return NSDictionary<NSAttributedStringKey,id> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun temporaryAttributesAtCharacterIndex_effectiveRange(charIndex: Long, effectiveCharRange: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("temporaryAttributesAtCharacterIndex:effectiveRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, charIndex, effectiveCharRange.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setTemporaryAttributes_forCharacterRange(attrs: MemorySegment, charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("setTemporaryAttributes:forCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, attrs, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun addTemporaryAttributes_forCharacterRange(attrs: MemorySegment, charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("addTemporaryAttributes:forCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, attrs, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun removeTemporaryAttribute_forCharacterRange(attrName: MemorySegment, charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("removeTemporaryAttribute:forCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, attrName, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun temporaryAttribute_atCharacterIndex_effectiveRange(attrName: MemorySegment, location: Long, range: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("temporaryAttribute:atCharacterIndex:effectiveRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attrName, location, range.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange(attrName: MemorySegment, location: Long, range: NSRangePointer, rangeLimit: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("temporaryAttribute:atCharacterIndex:longestEffectiveRange:inRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attrName, location, range.segment, ObjCRuntime.ObjCStructArg(rangeLimit.segment, NSRange.layout)) as MemorySegment
    }

    /** @return NSDictionary<NSAttributedStringKey,id> * */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange(location: Long, range: NSRangePointer, rangeLimit: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("temporaryAttributesAtCharacterIndex:longestEffectiveRange:inRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, location, range.segment, ObjCRuntime.ObjCStructArg(rangeLimit.segment, NSRange.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun addTemporaryAttribute_value_forCharacterRange(attrName: MemorySegment, value: MemorySegment, charRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("addTemporaryAttribute:value:forCharacterRange:")
        ObjCRuntime.msgSend(null, ptr, sel, attrName, value, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun defaultLineHeightForFont(theFont: MemorySegment): Double {
        val sel = ObjCRuntime.sel("defaultLineHeightForFont:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, theFont) as Double
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun defaultBaselineOffsetForFont(theFont: MemorySegment): Double {
        val sel = ObjCRuntime.sel("defaultBaselineOffsetForFont:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, theFont) as Double
    }

    // @property textStorage
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun textStorage(): MemorySegment {
        val sel = ObjCRuntime.sel("textStorage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setTextStorage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextStorage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textContainers
    /** @return NSArray<NSTextContainer *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun textContainers(): MemorySegment {
        val sel = ObjCRuntime.sel("textContainers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property delegate
    /** @return id<NSLayoutManagerDelegate> */
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsInvisibleCharacters
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun showsInvisibleCharacters(): Boolean {
        val sel = ObjCRuntime.sel("showsInvisibleCharacters")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setShowsInvisibleCharacters(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsInvisibleCharacters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsControlCharacters
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun showsControlCharacters(): Boolean {
        val sel = ObjCRuntime.sel("showsControlCharacters")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setShowsControlCharacters(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsControlCharacters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesDefaultHyphenation
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun usesDefaultHyphenation(): Boolean {
        val sel = ObjCRuntime.sel("usesDefaultHyphenation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setUsesDefaultHyphenation(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesDefaultHyphenation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesFontLeading
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun usesFontLeading(): Boolean {
        val sel = ObjCRuntime.sel("usesFontLeading")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setUsesFontLeading(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesFontLeading:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsNonContiguousLayout
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun allowsNonContiguousLayout(): Boolean {
        val sel = ObjCRuntime.sel("allowsNonContiguousLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsNonContiguousLayout(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsNonContiguousLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasNonContiguousLayout
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun hasNonContiguousLayout(): Boolean {
        val sel = ObjCRuntime.sel("hasNonContiguousLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property limitsLayoutForSuspiciousContents
    @PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun limitsLayoutForSuspiciousContents(): Boolean {
        val sel = ObjCRuntime.sel("limitsLayoutForSuspiciousContents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun setLimitsLayoutForSuspiciousContents(value: Boolean) {
        val sel = ObjCRuntime.sel("setLimitsLayoutForSuspiciousContents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundLayoutEnabled
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun backgroundLayoutEnabled(): Boolean {
        val sel = ObjCRuntime.sel("backgroundLayoutEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setBackgroundLayoutEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setBackgroundLayoutEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property defaultAttachmentScaling
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun defaultAttachmentScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("defaultAttachmentScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setDefaultAttachmentScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setDefaultAttachmentScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property typesetter
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun typesetter(): MemorySegment {
        val sel = ObjCRuntime.sel("typesetter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setTypesetter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTypesetter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property typesetterBehavior
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun typesetterBehavior(): NSTypesetterBehavior {
        val sel = ObjCRuntime.sel("typesetterBehavior")
        return NSTypesetterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun setTypesetterBehavior(value: NSTypesetterBehavior) {
        val sel = ObjCRuntime.sel("setTypesetterBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property numberOfGlyphs
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun numberOfGlyphs(): Long {
        val sel = ObjCRuntime.sel("numberOfGlyphs")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property extraLineFragmentRect
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun extraLineFragmentRect(): NSRect {
        val sel = ObjCRuntime.sel("extraLineFragmentRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property extraLineFragmentUsedRect
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun extraLineFragmentUsedRect(): NSRect {
        val sel = ObjCRuntime.sel("extraLineFragmentUsedRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property extraLineFragmentTextContainer
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    open fun extraLineFragmentTextContainer(): MemorySegment {
        val sel = ObjCRuntime.sel("extraLineFragmentTextContainer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutManager.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSLayoutManager_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSLayoutManager")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSTextViewSupport on NSLayoutManager ─────────────────────────────────────────

/** @return NSArray<NSRulerMarker *> * */
@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.rulerMarkersForTextView_paragraphStyle_ruler(view: MemorySegment, style: MemorySegment, ruler: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("rulerMarkersForTextView:paragraphStyle:ruler:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, view, style, ruler) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled(view: MemorySegment, style: MemorySegment, ruler: MemorySegment, isEnabled: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("rulerAccessoryViewForTextView:paragraphStyle:ruler:enabled:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, view, style, ruler, isEnabled) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.layoutManagerOwnsFirstResponderInWindow(window: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("layoutManagerOwnsFirstResponderInWindow:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, window) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.firstTextView(): MemorySegment {
    val sel = ObjCRuntime.sel("firstTextView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.textViewForBeginningOfSelection(): MemorySegment {
    val sel = ObjCRuntime.sel("textViewForBeginningOfSelection")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSLayoutManagerDeprecated on NSLayoutManager ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.glyphAtIndex_isValidIndex(glyphIndex: Long, isValidIndex: MemorySegment): Int {
    val sel = ObjCRuntime.sel("glyphAtIndex:isValidIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel, glyphIndex, isValidIndex) as Int
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.glyphAtIndex(glyphIndex: Long): Int {
    val sel = ObjCRuntime.sel("glyphAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel, glyphIndex) as Int
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount(charRange: NSRange, selCharRange: NSRange, container: MemorySegment, rectCount: MemorySegment): NSRectArray {
    val sel = ObjCRuntime.sel("rectArrayForCharacterRange:withinSelectedCharacterRange:inTextContainer:rectCount:")
    return NSRectArray(ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(selCharRange.segment, NSRange.layout), container, rectCount) as MemorySegment)
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount(glyphRange: NSRange, selGlyphRange: NSRange, container: MemorySegment, rectCount: MemorySegment): NSRectArray {
    val sel = ObjCRuntime.sel("rectArrayForGlyphRange:withinSelectedGlyphRange:inTextContainer:rectCount:")
    return NSRectArray(ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(selGlyphRange.segment, NSRange.layout), container, rectCount) as MemorySegment)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
fun NSLayoutManager.substituteFontForFont(originalFont: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("substituteFontForFont:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, originalFont) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.insertGlyphs_length_forStartingGlyphAtIndex_characterIndex(glyphs: MemorySegment, length: Long, glyphIndex: Long, charIndex: Long): Unit {
    val sel = ObjCRuntime.sel("insertGlyphs:length:forStartingGlyphAtIndex:characterIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyphs, length, glyphIndex, charIndex)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.insertGlyph_atGlyphIndex_characterIndex(glyph: Int, glyphIndex: Long, charIndex: Long): Unit {
    val sel = ObjCRuntime.sel("insertGlyph:atGlyphIndex:characterIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyph, glyphIndex, charIndex)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.replaceGlyphAtIndex_withGlyph(glyphIndex: Long, newGlyph: Int): Unit {
    val sel = ObjCRuntime.sel("replaceGlyphAtIndex:withGlyph:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyphIndex, newGlyph)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.deleteGlyphsInRange(glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("deleteGlyphsInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.setCharacterIndex_forGlyphAtIndex(charIndex: Long, glyphIndex: Long): Unit {
    val sel = ObjCRuntime.sel("setCharacterIndex:forGlyphAtIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, charIndex, glyphIndex)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.setIntAttribute_value_forGlyphAtIndex(attributeTag: Long, `val`: Long, glyphIndex: Long): Unit {
    val sel = ObjCRuntime.sel("setIntAttribute:value:forGlyphAtIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributeTag, `val`, glyphIndex)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setGlyphs:properties:characterIndexes:font:forGlyphRange instead")
fun NSLayoutManager.invalidateGlyphsOnLayoutInvalidationForGlyphRange(glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("invalidateGlyphsOnLayoutInvalidationForGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels: instead")
fun NSLayoutManager.intAttribute_forGlyphAtIndex(attributeTag: Long, glyphIndex: Long): Long {
    val sel = ObjCRuntime.sel("intAttribute:forGlyphAtIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, attributeTag, glyphIndex) as Long
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels: instead")
fun NSLayoutManager.getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(glyphRange: NSRange, glyphBuffer: MemorySegment, charIndexBuffer: MemorySegment, inscribeBuffer: MemorySegment, elasticBuffer: MemorySegment): Long {
    val sel = ObjCRuntime.sel("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer) as Long
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels: instead")
fun NSLayoutManager.getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels(glyphRange: NSRange, glyphBuffer: MemorySegment, charIndexBuffer: MemorySegment, inscribeBuffer: MemorySegment, elasticBuffer: MemorySegment, bidiLevelBuffer: MemorySegment): Long {
    val sel = ObjCRuntime.sel("getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:bidiLevels:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer, bidiLevelBuffer) as Long
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels: instead")
fun NSLayoutManager.getGlyphs_range(glyphArray: MemorySegment, glyphRange: NSRange): Long {
    val sel = ObjCRuntime.sel("getGlyphs:range:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, glyphArray, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout)) as Long
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -invalidateLayoutForCharacterRange:actualCharacterRange: instead")
fun NSLayoutManager.invalidateLayoutForCharacterRange_isSoft_actualCharacterRange(charRange: NSRange, flag: Boolean, actualCharRange: NSRangePointer): Unit {
    val sel = ObjCRuntime.sel("invalidateLayoutForCharacterRange:isSoft:actualCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(charRange.segment, NSRange.layout), flag, actualCharRange.segment)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -processEditingForTextStorage:edited:range:changeInLength:invalidatedRange: instead")
fun NSLayoutManager.textStorage_edited_range_changeInLength_invalidatedRange(str: MemorySegment, editedMask: Long, newCharRange: NSRange, delta: Long, invalidatedCharRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("textStorage:edited:range:changeInLength:invalidatedRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, str, editedMask, ObjCRuntime.ObjCStructArg(newCharRange.segment, NSRange.layout), delta, ObjCRuntime.ObjCStructArg(invalidatedCharRange.segment, NSRange.layout))
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -setLocation:forStartOfGlyphRange: instead")
fun NSLayoutManager.setLocations_startingGlyphIndexes_count_forGlyphRange(locations: NSPointArray, glyphIndexes: MemorySegment, count: Long, glyphRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("setLocations:startingGlyphIndexes:count:forGlyphRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, locations.segment, glyphIndexes, count, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout))
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -showCGGlyphs:positions:count:font:matrix:attributes:inContext: instead")
fun NSLayoutManager.showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment(glyphs: MemorySegment, glyphLen: Long, glyphRange: NSRange, point: NSPoint, font: MemorySegment, color: MemorySegment, printingAdjustment: NSSize): Unit {
    val sel = ObjCRuntime.sel("showPackedGlyphs:length:glyphRange:atPoint:font:color:printingAdjustment:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyphs, glyphLen, ObjCRuntime.ObjCStructArg(glyphRange.segment, NSRange.layout), ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), font, color, ObjCRuntime.ObjCStructArg(printingAdjustment.segment, NSSize.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSLayoutManager.showCGGlyphs_positions_count_font_matrix_attributes_inContext(glyphs: MemorySegment, positions: NSPointPointer, glyphCount: Long, font: MemorySegment, textMatrix: MemorySegment, attributes: MemorySegment, graphicsContext: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyphs, positions.segment, glyphCount, font, textMatrix, attributes, graphicsContext)
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
fun NSLayoutManager.usesScreenFonts(): Boolean {
    val sel = ObjCRuntime.sel("usesScreenFonts")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1)
fun NSLayoutManager.setUsesScreenFonts(usesScreenFonts: Boolean): Unit {
    val sel = ObjCRuntime.sel("setUsesScreenFonts:")
    ObjCRuntime.msgSend(null, this.ptr, sel, usesScreenFonts)
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.")
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.")
fun NSLayoutManager.hyphenationFactor(): Float {
    val sel = ObjCRuntime.sel("hyphenationFactor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.")
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 13, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.")
fun NSLayoutManager.setHyphenationFactor(hyphenationFactor: Float): Unit {
    val sel = ObjCRuntime.sel("setHyphenationFactor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hyphenationFactor)
}

// ── Category: NSGlyphGeneration on NSLayoutManager ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.glyphGenerator(): MemorySegment {
    val sel = ObjCRuntime.sel("glyphGenerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
fun NSLayoutManager.setGlyphGenerator(glyphGenerator: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setGlyphGenerator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, glyphGenerator)
}
