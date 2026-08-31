@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDateFormatter
 * Superclass: NSFormatter
 */
open class NSDateFormatter(override val ptr: MemorySegment) : NSFormatter(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDateFormatter") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun localizedStringFromDate_dateStyle_timeStyle(date: MemorySegment, dstyle: NSDateFormatterStyle, tstyle: NSDateFormatterStyle): MemorySegment {
            val sel = ObjCRuntime.sel("localizedStringFromDate:dateStyle:timeStyle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, date, dstyle.rawValue, tstyle.rawValue) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun localizedStringFromDate_dateStyle_timeStyleAsString(date: MemorySegment, dstyle: NSDateFormatterStyle, tstyle: NSDateFormatterStyle): String = ObjCRuntime.toJavaString(localizedStringFromDate_dateStyle_timeStyle(date, dstyle, tstyle))

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun dateFormatFromTemplate_options_locale(tmplate: MemorySegment, opts: Long, locale: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dateFormatFromTemplate:options:locale:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, tmplate, opts, locale) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun dateFormatFromTemplate_options_localeAsString(tmplate: MemorySegment, opts: Long, locale: MemorySegment): String = ObjCRuntime.toJavaString(dateFormatFromTemplate_options_locale(tmplate, opts, locale))

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun dateFormatFromTemplate_options_locale(tmplate: String, opts: Long, locale: MemorySegment): MemorySegment = dateFormatFromTemplate_options_locale(ObjCRuntime.newNSString(Arena.global(), tmplate), opts, locale)

        /** Convenience overload — [String] parameters and [String] return type. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun dateFormatFromTemplate_options_localeAsString(tmplate: String, opts: Long, locale: MemorySegment): String = ObjCRuntime.toJavaString(dateFormatFromTemplate_options_locale(ObjCRuntime.newNSString(Arena.global(), tmplate), opts, locale))

        fun defaultFormatterBehavior(): NSDateFormatterBehavior {
            val sel = ObjCRuntime.sel("defaultFormatterBehavior")
            return NSDateFormatterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        fun setDefaultFormatterBehavior(defaultFormatterBehavior: NSDateFormatterBehavior): Unit {
            val sel = ObjCRuntime.sel("setDefaultFormatterBehavior:")
            ObjCRuntime.msgSend(null, _class, sel, defaultFormatterBehavior.rawValue)
        }

    }

    open fun getObjectValue_forString_range_error(obj: MemorySegment, string: MemorySegment, rangep: NSRangePointer, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("getObjectValue:forString:range:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, obj, string, rangep.segment, error) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun getObjectValue_forString_range_error(obj: MemorySegment, string: String, rangep: NSRangePointer, error: MemorySegment): Boolean = getObjectValue_forString_range_error(obj, ObjCRuntime.newNSString(Arena.global(), string), rangep, error)

    open fun stringFromDate(date: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("stringFromDate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, date) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    fun stringFromDateAsString(date: MemorySegment): String = ObjCRuntime.toJavaString(stringFromDate(date))

    open fun dateFromString(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("dateFromString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun dateFromString(string: String): MemorySegment = dateFromString(ObjCRuntime.newNSString(Arena.global(), string))

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setLocalizedDateFormatFromTemplate(dateFormatTemplate: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setLocalizedDateFormatFromTemplate:")
        ObjCRuntime.msgSend(null, ptr, sel, dateFormatTemplate)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    fun setLocalizedDateFormatFromTemplate(dateFormatTemplate: String): Unit = setLocalizedDateFormatFromTemplate(ObjCRuntime.newNSString(Arena.global(), dateFormatTemplate))

    // @property formattingContext
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun formattingContext(): NSFormattingContext {
        val sel = ObjCRuntime.sel("formattingContext")
        return NSFormattingContext(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setFormattingContext(value: NSFormattingContext) {
        val sel = ObjCRuntime.sel("setFormattingContext:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property dateFormat
    open fun dateFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("dateFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDateFormat(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDateFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun dateFormatAsString(): String = ObjCRuntime.toJavaString(dateFormat())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setDateFormat(value: String) = setDateFormat(ObjCRuntime.newNSString(Arena.global(), value))

    // @property dateStyle
    open fun dateStyle(): NSDateFormatterStyle {
        val sel = ObjCRuntime.sel("dateStyle")
        return NSDateFormatterStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDateStyle(value: NSDateFormatterStyle) {
        val sel = ObjCRuntime.sel("setDateStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property timeStyle
    open fun timeStyle(): NSDateFormatterStyle {
        val sel = ObjCRuntime.sel("timeStyle")
        return NSDateFormatterStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTimeStyle(value: NSDateFormatterStyle) {
        val sel = ObjCRuntime.sel("setTimeStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property locale
    open fun locale(): MemorySegment {
        val sel = ObjCRuntime.sel("locale")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setLocale(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLocale:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property generatesCalendarDates
    open fun generatesCalendarDates(): Boolean {
        val sel = ObjCRuntime.sel("generatesCalendarDates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setGeneratesCalendarDates(value: Boolean) {
        val sel = ObjCRuntime.sel("setGeneratesCalendarDates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property formatterBehavior
    open fun formatterBehavior(): NSDateFormatterBehavior {
        val sel = ObjCRuntime.sel("formatterBehavior")
        return NSDateFormatterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setFormatterBehavior(value: NSDateFormatterBehavior) {
        val sel = ObjCRuntime.sel("setFormatterBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property timeZone
    open fun timeZone(): MemorySegment {
        val sel = ObjCRuntime.sel("timeZone")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTimeZone(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTimeZone:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property calendar
    open fun calendar(): MemorySegment {
        val sel = ObjCRuntime.sel("calendar")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCalendar(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCalendar:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lenient
    open fun isLenient(): Boolean {
        val sel = ObjCRuntime.sel("isLenient")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setLenient(value: Boolean) {
        val sel = ObjCRuntime.sel("setLenient:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property twoDigitStartDate
    open fun twoDigitStartDate(): MemorySegment {
        val sel = ObjCRuntime.sel("twoDigitStartDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTwoDigitStartDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTwoDigitStartDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property defaultDate
    open fun defaultDate(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDefaultDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDefaultDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property eraSymbols
    /** @return NSArray<NSString *> * */
    open fun eraSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("eraSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setEraSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setEraSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property monthSymbols
    /** @return NSArray<NSString *> * */
    open fun monthSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("monthSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMonthSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMonthSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shortMonthSymbols
    /** @return NSArray<NSString *> * */
    open fun shortMonthSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("shortMonthSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setShortMonthSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShortMonthSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property weekdaySymbols
    /** @return NSArray<NSString *> * */
    open fun weekdaySymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("weekdaySymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setWeekdaySymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setWeekdaySymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shortWeekdaySymbols
    /** @return NSArray<NSString *> * */
    open fun shortWeekdaySymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("shortWeekdaySymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setShortWeekdaySymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShortWeekdaySymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property AMSymbol
    open fun AMSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("AMSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAMSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAMSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun AMSymbolAsString(): String = ObjCRuntime.toJavaString(AMSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setAMSymbol(value: String) = setAMSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property PMSymbol
    open fun PMSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("PMSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPMSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPMSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun PMSymbolAsString(): String = ObjCRuntime.toJavaString(PMSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPMSymbol(value: String) = setPMSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property longEraSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun longEraSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("longEraSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setLongEraSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLongEraSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property veryShortMonthSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun veryShortMonthSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("veryShortMonthSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setVeryShortMonthSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVeryShortMonthSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property standaloneMonthSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun standaloneMonthSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("standaloneMonthSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setStandaloneMonthSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStandaloneMonthSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shortStandaloneMonthSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun shortStandaloneMonthSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("shortStandaloneMonthSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setShortStandaloneMonthSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShortStandaloneMonthSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property veryShortStandaloneMonthSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun veryShortStandaloneMonthSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("veryShortStandaloneMonthSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setVeryShortStandaloneMonthSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVeryShortStandaloneMonthSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property veryShortWeekdaySymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun veryShortWeekdaySymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("veryShortWeekdaySymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setVeryShortWeekdaySymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVeryShortWeekdaySymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property standaloneWeekdaySymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun standaloneWeekdaySymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("standaloneWeekdaySymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setStandaloneWeekdaySymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStandaloneWeekdaySymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shortStandaloneWeekdaySymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun shortStandaloneWeekdaySymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("shortStandaloneWeekdaySymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setShortStandaloneWeekdaySymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShortStandaloneWeekdaySymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property veryShortStandaloneWeekdaySymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun veryShortStandaloneWeekdaySymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("veryShortStandaloneWeekdaySymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setVeryShortStandaloneWeekdaySymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVeryShortStandaloneWeekdaySymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property quarterSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun quarterSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("quarterSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setQuarterSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setQuarterSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shortQuarterSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun shortQuarterSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("shortQuarterSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setShortQuarterSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShortQuarterSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property standaloneQuarterSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun standaloneQuarterSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("standaloneQuarterSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setStandaloneQuarterSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStandaloneQuarterSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shortStandaloneQuarterSymbols
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun shortStandaloneQuarterSymbols(): MemorySegment {
        val sel = ObjCRuntime.sel("shortStandaloneQuarterSymbols")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setShortStandaloneQuarterSymbols(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShortStandaloneQuarterSymbols:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property gregorianStartDate
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun gregorianStartDate(): MemorySegment {
        val sel = ObjCRuntime.sel("gregorianStartDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setGregorianStartDate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setGregorianStartDate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property doesRelativeDateFormatting
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun doesRelativeDateFormatting(): Boolean {
        val sel = ObjCRuntime.sel("doesRelativeDateFormatting")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setDoesRelativeDateFormatting(value: Boolean) {
        val sel = ObjCRuntime.sel("setDoesRelativeDateFormatting:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _attributes: MemorySegment
    // ivar: _formatter: MemorySegment
    // ivar: _counter: Long
}

// ── Category: NSDateFormatterCompatibility on NSDateFormatter ─────────────────────────────────────────

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "Create an NSDateFormatter with `init` and set the dateFormat property instead.")
fun NSDateFormatter.initWithDateFormat_allowNaturalLanguage(format: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithDateFormat:allowNaturalLanguage:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, format, flag) as MemorySegment
}

@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 9, deprecatedSubminor = -1, message = "There is no replacement")
fun NSDateFormatter.allowsNaturalLanguage(): Boolean {
    val sel = ObjCRuntime.sel("allowsNaturalLanguage")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
