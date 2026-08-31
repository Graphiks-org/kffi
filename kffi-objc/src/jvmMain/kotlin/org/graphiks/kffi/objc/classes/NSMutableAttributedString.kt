@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableAttributedString
 * Superclass: NSAttributedString
 */
@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSMutableAttributedString(override val ptr: MemorySegment) : NSAttributedString(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSMutableAttributedString") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun replaceCharactersInRange_withString(range: NSRange, str: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceCharactersInRange:withString:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), str)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun replaceCharactersInRange_withString(range: NSRange, str: String): Unit = replaceCharactersInRange_withString(range, ObjCRuntime.newNSString(Arena.global(), str))

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setAttributes_range(attrs: MemorySegment, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setAttributes:range:")
        ObjCRuntime.msgSend(null, ptr, sel, attrs, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

}

// ── Category: NSExtendedMutableAttributedString on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.addAttribute_value_range(name: MemorySegment, value: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("addAttribute:value:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, name, value, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.addAttributes_range(attrs: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("addAttributes:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrs, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.removeAttribute_range(name: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("removeAttribute:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, name, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.replaceCharactersInRange_withAttributedString(range: NSRange, attrString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceCharactersInRange:withAttributedString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), attrString)
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.insertAttributedString_atIndex(attrString: MemorySegment, loc: Long): Unit {
    val sel = ObjCRuntime.sel("insertAttributedString:atIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrString, loc)
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.appendAttributedString(attrString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendAttributedString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrString)
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.deleteCharactersInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("deleteCharactersInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.setAttributedString(attrString: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedString:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrString)
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.beginEditing(): Unit {
    val sel = ObjCRuntime.sel("beginEditing")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.endEditing(): Unit {
    val sel = ObjCRuntime.sel("endEditing")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.mutableString(): MemorySegment {
    val sel = ObjCRuntime.sel("mutableString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSMutableAttributedStringFormatting on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.appendLocalizedFormat(format: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("appendLocalizedFormat:")
    ObjCRuntime.msgSend(null, this.ptr, sel, format)
}

// ── Category: NSAttributedStringAttributeFixing on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.fixAttributesInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("fixAttributesInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

// ── Category: NSMutableAttributedStringDocumentFormats on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.readFromURL_options_documentAttributes_error(url: MemorySegment, opts: MemorySegment, dict: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readFromURL:options:documentAttributes:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, opts, dict, error) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.readFromData_options_documentAttributes_error(`data`: MemorySegment, opts: MemorySegment, dict: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readFromData:options:documentAttributes:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `data`, opts, dict, error) as Boolean
}

// ── Category: NSAttributedStringAppKitAttributeFixing on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.fixFontAttributeInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("fixFontAttributeInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.fixParagraphStyleAttributeInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("fixParagraphStyleAttributeInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.fixAttachmentAttributeInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("fixAttachmentAttributeInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

// ── Category: NSMutableAttributedStringAppKitAdditions on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.superscriptRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("superscriptRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.subscriptRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("subscriptRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.unscriptRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("unscriptRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.applyFontTraits_range(traitMask: NSFontTraitMask, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("applyFontTraits:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, traitMask.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.setAlignment_range(alignment: NSTextAlignment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("setAlignment:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, alignment.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.setBaseWritingDirection_range(writingDirection: NSWritingDirection, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("setBaseWritingDirection:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, writingDirection.rawValue, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

// ── Category: NSDeprecatedKitAdditions on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -readFromURL:options:documentAttributes:error: instead")
fun NSMutableAttributedString.readFromURL_options_documentAttributes(url: MemorySegment, options: MemorySegment, dict: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readFromURL:options:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, options, dict) as Boolean
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Use -readFromData:options:documentAttributes:error: instead")
fun NSMutableAttributedString.readFromData_options_documentAttributes(`data`: MemorySegment, options: MemorySegment, dict: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("readFromData:options:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `data`, options, dict) as Boolean
}

// ── Category: NSMutableAttributedStringAttachmentConveniences on NSMutableAttributedString ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableAttributedString.updateAttachmentsFromPath(path: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("updateAttachmentsFromPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, path)
}
