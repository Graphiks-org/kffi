@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLocale
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSLocale(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLocale") } }

    }

    open fun objectForKey(key: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("objectForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key) as MemorySegment
    }

    open fun displayNameForKey_value(key: MemorySegment, value: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("displayNameForKey:value:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, key, value) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    fun displayNameForKey_valueAsString(key: MemorySegment, value: MemorySegment): String = ObjCRuntime.toJavaString(displayNameForKey_value(key, value))

    open fun initWithLocaleIdentifier(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLocaleIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithLocaleIdentifier(string: String): MemorySegment = initWithLocaleIdentifier(ObjCRuntime.newNSString(Arena.global(), string))

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSLocale.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSLocale.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSLocale_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSExtendedLocale on NSLocale ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForLocaleIdentifier(localeIdentifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForLocaleIdentifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, localeIdentifier) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForLanguageCode(languageCode: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForLanguageCode:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, languageCode) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForCountryCode(countryCode: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForCountryCode:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, countryCode) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForScriptCode(scriptCode: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForScriptCode:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, scriptCode) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForVariantCode(variantCode: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForVariantCode:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, variantCode) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForCalendarIdentifier(calendarIdentifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForCalendarIdentifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, calendarIdentifier) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForCollationIdentifier(collationIdentifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForCollationIdentifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, collationIdentifier) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForCurrencyCode(currencyCode: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForCurrencyCode:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, currencyCode) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.localizedStringForCollatorIdentifier(collatorIdentifier: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localizedStringForCollatorIdentifier:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, collatorIdentifier) as MemorySegment
}

fun NSLocale.localeIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("localeIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.languageCode(): MemorySegment {
    val sel = ObjCRuntime.sel("languageCode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.languageIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("languageIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSLocale.countryCode(): MemorySegment {
    val sel = ObjCRuntime.sel("countryCode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.regionCode(): MemorySegment {
    val sel = ObjCRuntime.sel("regionCode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.scriptCode(): MemorySegment {
    val sel = ObjCRuntime.sel("scriptCode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.variantCode(): MemorySegment {
    val sel = ObjCRuntime.sel("variantCode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.exemplarCharacterSet(): MemorySegment {
    val sel = ObjCRuntime.sel("exemplarCharacterSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.calendarIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("calendarIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.collationIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("collationIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.usesMetricSystem(): Boolean {
    val sel = ObjCRuntime.sel("usesMetricSystem")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.decimalSeparator(): MemorySegment {
    val sel = ObjCRuntime.sel("decimalSeparator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.groupingSeparator(): MemorySegment {
    val sel = ObjCRuntime.sel("groupingSeparator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.currencySymbol(): MemorySegment {
    val sel = ObjCRuntime.sel("currencySymbol")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.currencyCode(): MemorySegment {
    val sel = ObjCRuntime.sel("currencyCode")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.collatorIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("collatorIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.quotationBeginDelimiter(): MemorySegment {
    val sel = ObjCRuntime.sel("quotationBeginDelimiter")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.quotationEndDelimiter(): MemorySegment {
    val sel = ObjCRuntime.sel("quotationEndDelimiter")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.alternateQuotationBeginDelimiter(): MemorySegment {
    val sel = ObjCRuntime.sel("alternateQuotationBeginDelimiter")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale.alternateQuotationEndDelimiter(): MemorySegment {
    val sel = ObjCRuntime.sel("alternateQuotationEndDelimiter")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSLocaleCreation on NSLocale ─────────────────────────────────────────

@PlatformAvailability(platform = "all", unavailable = true)
fun NSLocale.init(): MemorySegment {
    val sel = ObjCRuntime.sel("init")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSLocale localeWithLocaleIdentifier:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_localeWithLocaleIdentifier(ident: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localeWithLocaleIdentifier:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, ident) as MemorySegment
}

// Class method: +[NSLocale autoupdatingCurrentLocale]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_autoupdatingCurrentLocale(): MemorySegment {
    val sel = ObjCRuntime.sel("autoupdatingCurrentLocale")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale currentLocale]
fun NSLocale_currentLocale(): MemorySegment {
    val sel = ObjCRuntime.sel("currentLocale")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale systemLocale]
fun NSLocale_systemLocale(): MemorySegment {
    val sel = ObjCRuntime.sel("systemLocale")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSLocaleGeneralInfo on NSLocale ─────────────────────────────────────────

// Class method: +[NSLocale componentsFromLocaleIdentifier:]
fun NSLocale_componentsFromLocaleIdentifier(string: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("componentsFromLocaleIdentifier:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string) as MemorySegment
}

// Class method: +[NSLocale localeIdentifierFromComponents:]
fun NSLocale_localeIdentifierFromComponents(dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("localeIdentifierFromComponents:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, dict) as MemorySegment
}

// Class method: +[NSLocale canonicalLocaleIdentifierFromString:]
fun NSLocale_canonicalLocaleIdentifierFromString(string: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("canonicalLocaleIdentifierFromString:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string) as MemorySegment
}

// Class method: +[NSLocale canonicalLanguageIdentifierFromString:]
fun NSLocale_canonicalLanguageIdentifierFromString(string: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("canonicalLanguageIdentifierFromString:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, string) as MemorySegment
}

// Class method: +[NSLocale localeIdentifierFromWindowsLocaleCode:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_localeIdentifierFromWindowsLocaleCode(lcid: Int): MemorySegment {
    val sel = ObjCRuntime.sel("localeIdentifierFromWindowsLocaleCode:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, lcid) as MemorySegment
}

// Class method: +[NSLocale windowsLocaleCodeFromLocaleIdentifier:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_windowsLocaleCodeFromLocaleIdentifier(localeIdentifier: MemorySegment): Int {
    val sel = ObjCRuntime.sel("windowsLocaleCodeFromLocaleIdentifier:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, cls, sel, localeIdentifier) as Int
}

// Class method: +[NSLocale characterDirectionForLanguage:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_characterDirectionForLanguage(isoLangCode: MemorySegment): NSLocaleLanguageDirection {
    val sel = ObjCRuntime.sel("characterDirectionForLanguage:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return NSLocaleLanguageDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel, isoLangCode) as Long)
}

// Class method: +[NSLocale lineDirectionForLanguage:]
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_lineDirectionForLanguage(isoLangCode: MemorySegment): NSLocaleLanguageDirection {
    val sel = ObjCRuntime.sel("lineDirectionForLanguage:")
    val cls = ObjCRuntime.getClass("NSLocale")
    return NSLocaleLanguageDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel, isoLangCode) as Long)
}

// Class method: +[NSLocale availableLocaleIdentifiers]
fun NSLocale_availableLocaleIdentifiers(): MemorySegment {
    val sel = ObjCRuntime.sel("availableLocaleIdentifiers")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale ISOLanguageCodes]
fun NSLocale_ISOLanguageCodes(): MemorySegment {
    val sel = ObjCRuntime.sel("ISOLanguageCodes")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale ISOCountryCodes]
fun NSLocale_ISOCountryCodes(): MemorySegment {
    val sel = ObjCRuntime.sel("ISOCountryCodes")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale ISOCurrencyCodes]
fun NSLocale_ISOCurrencyCodes(): MemorySegment {
    val sel = ObjCRuntime.sel("ISOCurrencyCodes")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale commonISOCurrencyCodes]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_commonISOCurrencyCodes(): MemorySegment {
    val sel = ObjCRuntime.sel("commonISOCurrencyCodes")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSLocale preferredLanguages]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSLocale_preferredLanguages(): MemorySegment {
    val sel = ObjCRuntime.sel("preferredLanguages")
    val cls = ObjCRuntime.getClass("NSLocale")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}
