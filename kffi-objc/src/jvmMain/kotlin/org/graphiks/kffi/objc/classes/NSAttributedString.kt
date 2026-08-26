package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAttributedString
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding
 */
open class NSAttributedString(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAttributedString") }

    }

    /** @return NSDictionary<NSAttributedStringKey,id> * */
    open fun attributesAtIndex_effectiveRange(location: Long, range: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("attributesAtIndex:effectiveRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, location, range.segment) as MemorySegment
    }

    // @property string
    open fun string(): MemorySegment {
        val sel = ObjCRuntime.sel("string")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun stringAsString(): String = ObjCRuntime.toJavaString(string())

}

/** Required by Objective-C protocol NSCopying. */
fun NSAttributedString.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSAttributedString.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSAttributedString.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSAttributedString.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSAttributedString_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSExtendedAttributedString on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.attribute_atIndex_effectiveRange(attrName: MemorySegment, location: Long, range: NSRangePointer): MemorySegment {
    val sel = ObjCRuntime.sel("attribute:atIndex:effectiveRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, attrName, location, range.segment) as MemorySegment
}

fun NSAttributedString.attributedSubstringFromRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("attributedSubstringFromRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSAttributedString.attributesAtIndex_longestEffectiveRange_inRange(location: Long, range: NSRangePointer, rangeLimit: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("attributesAtIndex:longestEffectiveRange:inRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, location, range.segment, ObjCRuntime.ObjCStructArg(rangeLimit.segment, NSRange.layout)) as MemorySegment
}

fun NSAttributedString.attribute_atIndex_longestEffectiveRange_inRange(attrName: MemorySegment, location: Long, range: NSRangePointer, rangeLimit: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("attribute:atIndex:longestEffectiveRange:inRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, attrName, location, range.segment, ObjCRuntime.ObjCStructArg(rangeLimit.segment, NSRange.layout)) as MemorySegment
}

fun NSAttributedString.isEqualToAttributedString(other: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToAttributedString:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, other) as Boolean
}

fun NSAttributedString.initWithString(str: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, str) as MemorySegment
}

fun NSAttributedString.initWithString_attributes(str: MemorySegment, attrs: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithString:attributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, str, attrs) as MemorySegment
}

fun NSAttributedString.initWithAttributedString(attrStr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithAttributedString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, attrStr) as MemorySegment
}

fun NSAttributedString.enumerateAttributesInRange_options_usingBlock(enumerationRange: NSRange, opts: NSAttributedStringEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateAttributesInRange:options:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(enumerationRange.segment, NSRange.layout), opts.rawValue, block)
}

fun NSAttributedString.enumerateAttribute_inRange_options_usingBlock(attrName: MemorySegment, enumerationRange: NSRange, opts: NSAttributedStringEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateAttribute:inRange:options:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrName, ObjCRuntime.ObjCStructArg(enumerationRange.segment, NSRange.layout), opts.rawValue, block)
}

fun NSAttributedString.length(): Long {
    val sel = ObjCRuntime.sel("length")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

// ── Category: NSAttributedStringCreateFromMarkdown on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.initWithContentsOfMarkdownFileAtURL_options_baseURL_error(markdownFile: MemorySegment, options: MemorySegment, baseURL: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfMarkdownFileAtURL:options:baseURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, markdownFile, options, baseURL, error) as MemorySegment
}

fun NSAttributedString.initWithMarkdown_options_baseURL_error(markdown: MemorySegment, options: MemorySegment, baseURL: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithMarkdown:options:baseURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, markdown, options, baseURL, error) as MemorySegment
}

fun NSAttributedString.initWithMarkdownString_options_baseURL_error(markdownString: MemorySegment, options: MemorySegment, baseURL: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithMarkdownString:options:baseURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, markdownString, options, baseURL, error) as MemorySegment
}

// ── Category: NSAttributedStringFormatting on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.initWithFormat_options_locale(format: MemorySegment, options: NSAttributedStringFormattingOptions, locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:options:locale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, options.rawValue, locale) as MemorySegment
}

fun NSAttributedString.initWithFormat_options_locale_arguments(format: MemorySegment, options: NSAttributedStringFormattingOptions, locale: MemorySegment, arguments: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:options:locale:arguments:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, options.rawValue, locale, arguments) as MemorySegment
}

fun NSAttributedString.initWithFormat_options_locale_context(format: MemorySegment, options: NSAttributedStringFormattingOptions, locale: MemorySegment, context: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:options:locale:context:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, options.rawValue, locale, context) as MemorySegment
}

fun NSAttributedString.initWithFormat_options_locale_context_arguments(format: MemorySegment, options: NSAttributedStringFormattingOptions, locale: MemorySegment, context: MemorySegment, arguments: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithFormat:options:locale:context:arguments:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, options.rawValue, locale, context, arguments) as MemorySegment
}

// Class method: +[NSAttributedString localizedAttributedStringWithFormat:]
fun NSAttributedString_localizedAttributedStringWithFormat(format: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedAttributedStringWithFormat:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format) as MemorySegment
}

// Class method: +[NSAttributedString localizedAttributedStringWithFormat:options:]
fun NSAttributedString_localizedAttributedStringWithFormat_options(format: MemorySegment, options: NSAttributedStringFormattingOptions): MemorySegment {
    val sel = ObjCRuntime.sel("localizedAttributedStringWithFormat:options:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format, options.rawValue) as MemorySegment
}

// Class method: +[NSAttributedString localizedAttributedStringWithFormat:context:]
fun NSAttributedString_localizedAttributedStringWithFormat_context(format: MemorySegment, context: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedAttributedStringWithFormat:context:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format, context) as MemorySegment
}

// Class method: +[NSAttributedString localizedAttributedStringWithFormat:options:context:]
fun NSAttributedString_localizedAttributedStringWithFormat_options_context(format: MemorySegment, options: NSAttributedStringFormattingOptions, context: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedAttributedStringWithFormat:options:context:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, format, options.rawValue, context) as MemorySegment
}

// ── Category: NSMorphology on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.attributedStringByInflectingString(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringByInflectingString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSAttributedStringDocumentFormats on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.initWithURL_options_documentAttributes_error(url: MemorySegment, options: MemorySegment, dict: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithURL:options:documentAttributes:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, options, dict, error) as MemorySegment
}

fun NSAttributedString.initWithData_options_documentAttributes_error(`data`: MemorySegment, options: MemorySegment, dict: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithData:options:documentAttributes:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, options, dict, error) as MemorySegment
}

fun NSAttributedString.dataFromRange_documentAttributes_error(range: NSRange, dict: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dataFromRange:documentAttributes:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), dict, error) as MemorySegment
}

fun NSAttributedString.fileWrapperFromRange_documentAttributes_error(range: NSRange, dict: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("fileWrapperFromRange:documentAttributes:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), dict, error) as MemorySegment
}

// ── Category: NSAttributedStringKitAdditions on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.containsAttachmentsInRange(range: NSRange): Boolean {
    val sel = ObjCRuntime.sel("containsAttachmentsInRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as Boolean
}

fun NSAttributedString.prefersRTFDInRange(range: NSRange): Boolean {
    val sel = ObjCRuntime.sel("prefersRTFDInRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as Boolean
}

// ── Category: NSAttributedStringAppKitDocumentFormats on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.initWithRTF_documentAttributes(`data`: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithRTF:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, dict) as MemorySegment
}

fun NSAttributedString.initWithRTFD_documentAttributes(`data`: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithRTFD:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, dict) as MemorySegment
}

fun NSAttributedString.initWithHTML_documentAttributes(`data`: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithHTML:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, dict) as MemorySegment
}

fun NSAttributedString.initWithHTML_baseURL_documentAttributes(`data`: MemorySegment, base: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithHTML:baseURL:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, base, dict) as MemorySegment
}

fun NSAttributedString.initWithDocFormat_documentAttributes(`data`: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithDocFormat:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, dict) as MemorySegment
}

fun NSAttributedString.initWithHTML_options_documentAttributes(`data`: MemorySegment, options: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithHTML:options:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `data`, options, dict) as MemorySegment
}

fun NSAttributedString.initWithRTFDFileWrapper_documentAttributes(wrapper: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithRTFDFileWrapper:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, wrapper, dict) as MemorySegment
}

fun NSAttributedString.RTFFromRange_documentAttributes(range: NSRange, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("RTFFromRange:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), dict) as MemorySegment
}

fun NSAttributedString.RTFDFromRange_documentAttributes(range: NSRange, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("RTFDFromRange:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), dict) as MemorySegment
}

fun NSAttributedString.RTFDFileWrapperFromRange_documentAttributes(range: NSRange, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("RTFDFileWrapperFromRange:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), dict) as MemorySegment
}

fun NSAttributedString.docFormatFromRange_documentAttributes(range: NSRange, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("docFormatFromRange:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), dict) as MemorySegment
}

// ── Category: NSAttributedStringAppKitAdditions on NSAttributedString ─────────────────────────────────────────

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSAttributedString.fontAttributesInRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("fontAttributesInRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** @return NSDictionary<NSAttributedStringKey,id> * */
fun NSAttributedString.rulerAttributesInRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("rulerAttributesInRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

fun NSAttributedString.lineBreakBeforeIndex_withinRange(location: Long, aRange: NSRange): Long {
    val sel = ObjCRuntime.sel("lineBreakBeforeIndex:withinRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, location, ObjCRuntime.ObjCStructArg(aRange.segment, NSRange.layout)) as Long
}

fun NSAttributedString.lineBreakByHyphenatingBeforeIndex_withinRange(location: Long, aRange: NSRange): Long {
    val sel = ObjCRuntime.sel("lineBreakByHyphenatingBeforeIndex:withinRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, location, ObjCRuntime.ObjCStructArg(aRange.segment, NSRange.layout)) as Long
}

fun NSAttributedString.doubleClickAtIndex(location: Long): NSRange {
    val sel = ObjCRuntime.sel("doubleClickAtIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, location))
}

fun NSAttributedString.nextWordFromIndex_forward(location: Long, isForward: Boolean): Long {
    val sel = ObjCRuntime.sel("nextWordFromIndex:forward:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, location, isForward) as Long
}

fun NSAttributedString.rangeOfTextBlock_atIndex(block: MemorySegment, location: Long): NSRange {
    val sel = ObjCRuntime.sel("rangeOfTextBlock:atIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, block, location))
}

fun NSAttributedString.rangeOfTextTable_atIndex(table: MemorySegment, location: Long): NSRange {
    val sel = ObjCRuntime.sel("rangeOfTextTable:atIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, table, location))
}

fun NSAttributedString.rangeOfTextList_atIndex(list: MemorySegment, location: Long): NSRange {
    val sel = ObjCRuntime.sel("rangeOfTextList:atIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, list, location))
}

fun NSAttributedString.itemNumberInTextList_atIndex(list: MemorySegment, location: Long): Long {
    val sel = ObjCRuntime.sel("itemNumberInTextList:atIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, list, location) as Long
}

// ── Category: NSAttributedStringPasteboardAdditions on NSAttributedString ─────────────────────────────────────────

// Class method: +[NSAttributedString textTypes]
fun NSAttributedString_textTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("textTypes")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSAttributedString textUnfilteredTypes]
fun NSAttributedString_textUnfilteredTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("textUnfilteredTypes")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSDeprecatedKitAdditions on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.initWithURL_documentAttributes(url: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithURL:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, dict) as MemorySegment
}

fun NSAttributedString.initWithPath_documentAttributes(path: MemorySegment, dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithPath:documentAttributes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path, dict) as MemorySegment
}

fun NSAttributedString.URLAtIndex_effectiveRange(location: Long, effectiveRange: NSRangePointer): MemorySegment {
    val sel = ObjCRuntime.sel("URLAtIndex:effectiveRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, location, effectiveRange.segment) as MemorySegment
}

fun NSAttributedString.containsAttachments(): Boolean {
    val sel = ObjCRuntime.sel("containsAttachments")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// Class method: +[NSAttributedString textFileTypes]
fun NSAttributedString_textFileTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("textFileTypes")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSAttributedString textPasteboardTypes]
fun NSAttributedString_textPasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("textPasteboardTypes")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSAttributedString textUnfilteredFileTypes]
fun NSAttributedString_textUnfilteredFileTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("textUnfilteredFileTypes")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSAttributedString textUnfilteredPasteboardTypes]
fun NSAttributedString_textUnfilteredPasteboardTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("textUnfilteredPasteboardTypes")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSAttributedStringAttachmentConveniences on NSAttributedString ─────────────────────────────────────────

// Class method: +[NSAttributedString attributedStringWithAttachment:]
fun NSAttributedString_attributedStringWithAttachment(attachment: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringWithAttachment:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, attachment) as MemorySegment
}

// Class method: +[NSAttributedString attributedStringWithAttachment:attributes:]
fun NSAttributedString_attributedStringWithAttachment_attributes(attachment: MemorySegment, attributes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringWithAttachment:attributes:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, attachment, attributes) as MemorySegment
}

// ── Category: NSStringDrawing on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.size(): CGSize {
    val sel = ObjCRuntime.sel("size")
    return CGSize(ObjCRuntime.msgSendStruct(CGSize.layout, this.ptr, sel))
}

fun NSAttributedString.drawAtPoint(point: CGPoint): Unit {
    val sel = ObjCRuntime.sel("drawAtPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, CGPoint.layout))
}

fun NSAttributedString.drawInRect(rect: CGRect): Unit {
    val sel = ObjCRuntime.sel("drawInRect:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout))
}

// ── Category: NSExtendedStringDrawing on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.drawWithRect_options_context(rect: CGRect, options: NSStringDrawingOptions, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("drawWithRect:options:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, CGRect.layout), options.rawValue, context)
}

fun NSAttributedString.boundingRectWithSize_options_context(size: CGSize, options: NSStringDrawingOptions, context: MemorySegment): CGRect {
    val sel = ObjCRuntime.sel("boundingRectWithSize:options:context:")
    return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, CGSize.layout), options.rawValue, context))
}

// ── Category: NSStringDrawingDeprecated on NSAttributedString ─────────────────────────────────────────

fun NSAttributedString.drawWithRect_options(rect: NSRect, options: NSStringDrawingOptions): Unit {
    val sel = ObjCRuntime.sel("drawWithRect:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue)
}

fun NSAttributedString.boundingRectWithSize_options(size: NSSize, options: NSStringDrawingOptions): NSRect {
    val sel = ObjCRuntime.sel("boundingRectWithSize:options:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), options.rawValue))
}

// ── Category: NSAttributedStringAdaptiveImageGlyphConveniences on NSAttributedString ─────────────────────────────────────────

// Class method: +[NSAttributedString attributedStringWithAdaptiveImageGlyph:attributes:]
fun NSAttributedString_attributedStringWithAdaptiveImageGlyph_attributes(adaptiveImageGlyph: MemorySegment, attributes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringWithAdaptiveImageGlyph:attributes:")
    val cls = ObjCRuntime.getClass("NSAttributedString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, adaptiveImageGlyph, attributes) as MemorySegment
}
