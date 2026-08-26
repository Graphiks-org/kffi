package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextCheckingResult
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSTextCheckingResult(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextCheckingResult") }

    }

    // @property resultType
    open fun resultType(): NSTextCheckingType {
        val sel = ObjCRuntime.sel("resultType")
        return NSTextCheckingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property range
    open fun range(): NSRange {
        val sel = ObjCRuntime.sel("range")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSTextCheckingResult.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSTextCheckingResult.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTextCheckingResult.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTextCheckingResult_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSTextCheckingResultOptional on NSTextCheckingResult ─────────────────────────────────────────

fun NSTextCheckingResult.rangeAtIndex(idx: Long): NSRange {
    val sel = ObjCRuntime.sel("rangeAtIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, idx))
}

fun NSTextCheckingResult.rangeWithName(name: MemorySegment): NSRange {
    val sel = ObjCRuntime.sel("rangeWithName:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, name))
}

fun NSTextCheckingResult.resultByAdjustingRangesWithOffset(offset: Long): MemorySegment {
    val sel = ObjCRuntime.sel("resultByAdjustingRangesWithOffset:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, offset) as MemorySegment
}

fun NSTextCheckingResult.orthography(): MemorySegment {
    val sel = ObjCRuntime.sel("orthography")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSDictionary<NSString *,id> *> * */
fun NSTextCheckingResult.grammarDetails(): MemorySegment {
    val sel = ObjCRuntime.sel("grammarDetails")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.date(): MemorySegment {
    val sel = ObjCRuntime.sel("date")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.timeZone(): MemorySegment {
    val sel = ObjCRuntime.sel("timeZone")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.duration(): Double {
    val sel = ObjCRuntime.sel("duration")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

/** @return NSDictionary<NSTextCheckingKey,NSString *> * */
fun NSTextCheckingResult.components(): MemorySegment {
    val sel = ObjCRuntime.sel("components")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.URL(): MemorySegment {
    val sel = ObjCRuntime.sel("URL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.replacementString(): MemorySegment {
    val sel = ObjCRuntime.sel("replacementString")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSString *> * */
fun NSTextCheckingResult.alternativeStrings(): MemorySegment {
    val sel = ObjCRuntime.sel("alternativeStrings")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.regularExpression(): MemorySegment {
    val sel = ObjCRuntime.sel("regularExpression")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.phoneNumber(): MemorySegment {
    val sel = ObjCRuntime.sel("phoneNumber")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextCheckingResult.numberOfRanges(): Long {
    val sel = ObjCRuntime.sel("numberOfRanges")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

/** @return NSDictionary<NSTextCheckingKey,NSString *> * */
fun NSTextCheckingResult.addressComponents(): MemorySegment {
    val sel = ObjCRuntime.sel("addressComponents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSTextCheckingResultCreation on NSTextCheckingResult ─────────────────────────────────────────

// Class method: +[NSTextCheckingResult orthographyCheckingResultWithRange:orthography:]
fun NSTextCheckingResult_orthographyCheckingResultWithRange_orthography(range: NSRange, orthography: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orthographyCheckingResultWithRange:orthography:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), orthography) as MemorySegment
}

// Class method: +[NSTextCheckingResult spellCheckingResultWithRange:]
fun NSTextCheckingResult_spellCheckingResultWithRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("spellCheckingResultWithRange:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

// Class method: +[NSTextCheckingResult grammarCheckingResultWithRange:details:]
fun NSTextCheckingResult_grammarCheckingResultWithRange_details(range: NSRange, details: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("grammarCheckingResultWithRange:details:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), details) as MemorySegment
}

// Class method: +[NSTextCheckingResult dateCheckingResultWithRange:date:]
fun NSTextCheckingResult_dateCheckingResultWithRange_date(range: NSRange, date: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dateCheckingResultWithRange:date:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), date) as MemorySegment
}

// Class method: +[NSTextCheckingResult dateCheckingResultWithRange:date:timeZone:duration:]
fun NSTextCheckingResult_dateCheckingResultWithRange_date_timeZone_duration(range: NSRange, date: MemorySegment, timeZone: MemorySegment, duration: Double): MemorySegment {
    val sel = ObjCRuntime.sel("dateCheckingResultWithRange:date:timeZone:duration:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), date, timeZone, duration) as MemorySegment
}

// Class method: +[NSTextCheckingResult addressCheckingResultWithRange:components:]
fun NSTextCheckingResult_addressCheckingResultWithRange_components(range: NSRange, components: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("addressCheckingResultWithRange:components:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), components) as MemorySegment
}

// Class method: +[NSTextCheckingResult linkCheckingResultWithRange:URL:]
fun NSTextCheckingResult_linkCheckingResultWithRange_URL(range: NSRange, url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("linkCheckingResultWithRange:URL:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), url) as MemorySegment
}

// Class method: +[NSTextCheckingResult quoteCheckingResultWithRange:replacementString:]
fun NSTextCheckingResult_quoteCheckingResultWithRange_replacementString(range: NSRange, replacementString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("quoteCheckingResultWithRange:replacementString:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacementString) as MemorySegment
}

// Class method: +[NSTextCheckingResult dashCheckingResultWithRange:replacementString:]
fun NSTextCheckingResult_dashCheckingResultWithRange_replacementString(range: NSRange, replacementString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dashCheckingResultWithRange:replacementString:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacementString) as MemorySegment
}

// Class method: +[NSTextCheckingResult replacementCheckingResultWithRange:replacementString:]
fun NSTextCheckingResult_replacementCheckingResultWithRange_replacementString(range: NSRange, replacementString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("replacementCheckingResultWithRange:replacementString:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacementString) as MemorySegment
}

// Class method: +[NSTextCheckingResult correctionCheckingResultWithRange:replacementString:]
fun NSTextCheckingResult_correctionCheckingResultWithRange_replacementString(range: NSRange, replacementString: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("correctionCheckingResultWithRange:replacementString:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacementString) as MemorySegment
}

// Class method: +[NSTextCheckingResult correctionCheckingResultWithRange:replacementString:alternativeStrings:]
fun NSTextCheckingResult_correctionCheckingResultWithRange_replacementString_alternativeStrings(range: NSRange, replacementString: MemorySegment, alternativeStrings: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("correctionCheckingResultWithRange:replacementString:alternativeStrings:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacementString, alternativeStrings) as MemorySegment
}

// Class method: +[NSTextCheckingResult regularExpressionCheckingResultWithRanges:count:regularExpression:]
fun NSTextCheckingResult_regularExpressionCheckingResultWithRanges_count_regularExpression(ranges: NSRangePointer, count: Long, regularExpression: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("regularExpressionCheckingResultWithRanges:count:regularExpression:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ranges.segment, count, regularExpression) as MemorySegment
}

// Class method: +[NSTextCheckingResult phoneNumberCheckingResultWithRange:phoneNumber:]
fun NSTextCheckingResult_phoneNumberCheckingResultWithRange_phoneNumber(range: NSRange, phoneNumber: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("phoneNumberCheckingResultWithRange:phoneNumber:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), phoneNumber) as MemorySegment
}

// Class method: +[NSTextCheckingResult transitInformationCheckingResultWithRange:components:]
fun NSTextCheckingResult_transitInformationCheckingResultWithRange_components(range: NSRange, components: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("transitInformationCheckingResultWithRange:components:")
    val cls = ObjCRuntime.getClass("NSTextCheckingResult")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), components) as MemorySegment
}
