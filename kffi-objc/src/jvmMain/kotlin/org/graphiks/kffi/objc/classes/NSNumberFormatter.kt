@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSNumberFormatter
 * Superclass: NSFormatter
 */
open class NSNumberFormatter(override val ptr: MemorySegment) : NSFormatter(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSNumberFormatter") }

        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun localizedStringFromNumber_numberStyle(num: MemorySegment, nstyle: NSNumberFormatterStyle): MemorySegment {
            val sel = ObjCRuntime.sel("localizedStringFromNumber:numberStyle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, num, nstyle.rawValue) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun localizedStringFromNumber_numberStyleAsString(num: MemorySegment, nstyle: NSNumberFormatterStyle): String = ObjCRuntime.toJavaString(localizedStringFromNumber_numberStyle(num, nstyle))

        fun defaultFormatterBehavior(): NSNumberFormatterBehavior {
            val sel = ObjCRuntime.sel("defaultFormatterBehavior")
            return NSNumberFormatterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        fun setDefaultFormatterBehavior(behavior: NSNumberFormatterBehavior): Unit {
            val sel = ObjCRuntime.sel("setDefaultFormatterBehavior:")
            ObjCRuntime.msgSend(null, _class, sel, behavior.rawValue)
        }

    }

    open fun getObjectValue_forString_range_error(obj: MemorySegment, string: MemorySegment, rangep: NSRangePointer, error: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("getObjectValue:forString:range:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, obj, string, rangep.segment, error) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun getObjectValue_forString_range_error(obj: MemorySegment, string: String, rangep: NSRangePointer, error: MemorySegment): Boolean = getObjectValue_forString_range_error(obj, ObjCRuntime.newNSString(Arena.global(), string), rangep, error)

    open fun stringFromNumber(number: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("stringFromNumber:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, number) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    fun stringFromNumberAsString(number: MemorySegment): String = ObjCRuntime.toJavaString(stringFromNumber(number))

    open fun numberFromString(string: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("numberFromString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, string) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun numberFromString(string: String): MemorySegment = numberFromString(ObjCRuntime.newNSString(Arena.global(), string))

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

    // @property minimumGroupingDigits
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun minimumGroupingDigits(): Long {
        val sel = ObjCRuntime.sel("minimumGroupingDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 18, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setMinimumGroupingDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMinimumGroupingDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberStyle
    open fun numberStyle(): NSNumberFormatterStyle {
        val sel = ObjCRuntime.sel("numberStyle")
        return NSNumberFormatterStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setNumberStyle(value: NSNumberFormatterStyle) {
        val sel = ObjCRuntime.sel("setNumberStyle:")
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

    // @property generatesDecimalNumbers
    open fun generatesDecimalNumbers(): Boolean {
        val sel = ObjCRuntime.sel("generatesDecimalNumbers")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setGeneratesDecimalNumbers(value: Boolean) {
        val sel = ObjCRuntime.sel("setGeneratesDecimalNumbers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property formatterBehavior
    open fun formatterBehavior(): NSNumberFormatterBehavior {
        val sel = ObjCRuntime.sel("formatterBehavior")
        return NSNumberFormatterBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setFormatterBehavior(value: NSNumberFormatterBehavior) {
        val sel = ObjCRuntime.sel("setFormatterBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property negativeFormat
    open fun negativeFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("negativeFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNegativeFormat(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNegativeFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun negativeFormatAsString(): String = ObjCRuntime.toJavaString(negativeFormat())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setNegativeFormat(value: String) = setNegativeFormat(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForNegativeValues
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForNegativeValues(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForNegativeValues")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForNegativeValues(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForNegativeValues:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property positiveFormat
    open fun positiveFormat(): MemorySegment {
        val sel = ObjCRuntime.sel("positiveFormat")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPositiveFormat(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPositiveFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun positiveFormatAsString(): String = ObjCRuntime.toJavaString(positiveFormat())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPositiveFormat(value: String) = setPositiveFormat(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForPositiveValues
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForPositiveValues(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForPositiveValues")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForPositiveValues(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForPositiveValues:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsFloats
    open fun allowsFloats(): Boolean {
        val sel = ObjCRuntime.sel("allowsFloats")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsFloats(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsFloats:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property decimalSeparator
    open fun decimalSeparator(): MemorySegment {
        val sel = ObjCRuntime.sel("decimalSeparator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDecimalSeparator(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDecimalSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun decimalSeparatorAsString(): String = ObjCRuntime.toJavaString(decimalSeparator())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setDecimalSeparator(value: String) = setDecimalSeparator(ObjCRuntime.newNSString(Arena.global(), value))

    // @property alwaysShowsDecimalSeparator
    open fun alwaysShowsDecimalSeparator(): Boolean {
        val sel = ObjCRuntime.sel("alwaysShowsDecimalSeparator")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAlwaysShowsDecimalSeparator(value: Boolean) {
        val sel = ObjCRuntime.sel("setAlwaysShowsDecimalSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property currencyDecimalSeparator
    open fun currencyDecimalSeparator(): MemorySegment {
        val sel = ObjCRuntime.sel("currencyDecimalSeparator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCurrencyDecimalSeparator(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCurrencyDecimalSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun currencyDecimalSeparatorAsString(): String = ObjCRuntime.toJavaString(currencyDecimalSeparator())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setCurrencyDecimalSeparator(value: String) = setCurrencyDecimalSeparator(ObjCRuntime.newNSString(Arena.global(), value))

    // @property usesGroupingSeparator
    open fun usesGroupingSeparator(): Boolean {
        val sel = ObjCRuntime.sel("usesGroupingSeparator")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setUsesGroupingSeparator(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesGroupingSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property groupingSeparator
    open fun groupingSeparator(): MemorySegment {
        val sel = ObjCRuntime.sel("groupingSeparator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setGroupingSeparator(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setGroupingSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun groupingSeparatorAsString(): String = ObjCRuntime.toJavaString(groupingSeparator())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setGroupingSeparator(value: String) = setGroupingSeparator(ObjCRuntime.newNSString(Arena.global(), value))

    // @property zeroSymbol
    open fun zeroSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("zeroSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setZeroSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setZeroSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun zeroSymbolAsString(): String = ObjCRuntime.toJavaString(zeroSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setZeroSymbol(value: String) = setZeroSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForZero
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForZero(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForZero")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForZero(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForZero:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property nilSymbol
    open fun nilSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("nilSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNilSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNilSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun nilSymbolAsString(): String = ObjCRuntime.toJavaString(nilSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setNilSymbol(value: String) = setNilSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForNil
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForNil(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForNil")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForNil(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForNil:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property notANumberSymbol
    open fun notANumberSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("notANumberSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNotANumberSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNotANumberSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun notANumberSymbolAsString(): String = ObjCRuntime.toJavaString(notANumberSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setNotANumberSymbol(value: String) = setNotANumberSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForNotANumber
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForNotANumber(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForNotANumber")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForNotANumber(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForNotANumber:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property positiveInfinitySymbol
    open fun positiveInfinitySymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("positiveInfinitySymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPositiveInfinitySymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPositiveInfinitySymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun positiveInfinitySymbolAsString(): String = ObjCRuntime.toJavaString(positiveInfinitySymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPositiveInfinitySymbol(value: String) = setPositiveInfinitySymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForPositiveInfinity
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForPositiveInfinity(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForPositiveInfinity")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForPositiveInfinity(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForPositiveInfinity:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property negativeInfinitySymbol
    open fun negativeInfinitySymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("negativeInfinitySymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNegativeInfinitySymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNegativeInfinitySymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun negativeInfinitySymbolAsString(): String = ObjCRuntime.toJavaString(negativeInfinitySymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setNegativeInfinitySymbol(value: String) = setNegativeInfinitySymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property textAttributesForNegativeInfinity
    /** @return NSDictionary<NSString *,id> * */
    open fun textAttributesForNegativeInfinity(): MemorySegment {
        val sel = ObjCRuntime.sel("textAttributesForNegativeInfinity")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextAttributesForNegativeInfinity(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextAttributesForNegativeInfinity:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property positivePrefix
    open fun positivePrefix(): MemorySegment {
        val sel = ObjCRuntime.sel("positivePrefix")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPositivePrefix(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPositivePrefix:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun positivePrefixAsString(): String = ObjCRuntime.toJavaString(positivePrefix())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPositivePrefix(value: String) = setPositivePrefix(ObjCRuntime.newNSString(Arena.global(), value))

    // @property positiveSuffix
    open fun positiveSuffix(): MemorySegment {
        val sel = ObjCRuntime.sel("positiveSuffix")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPositiveSuffix(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPositiveSuffix:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun positiveSuffixAsString(): String = ObjCRuntime.toJavaString(positiveSuffix())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPositiveSuffix(value: String) = setPositiveSuffix(ObjCRuntime.newNSString(Arena.global(), value))

    // @property negativePrefix
    open fun negativePrefix(): MemorySegment {
        val sel = ObjCRuntime.sel("negativePrefix")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNegativePrefix(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNegativePrefix:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun negativePrefixAsString(): String = ObjCRuntime.toJavaString(negativePrefix())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setNegativePrefix(value: String) = setNegativePrefix(ObjCRuntime.newNSString(Arena.global(), value))

    // @property negativeSuffix
    open fun negativeSuffix(): MemorySegment {
        val sel = ObjCRuntime.sel("negativeSuffix")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setNegativeSuffix(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setNegativeSuffix:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun negativeSuffixAsString(): String = ObjCRuntime.toJavaString(negativeSuffix())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setNegativeSuffix(value: String) = setNegativeSuffix(ObjCRuntime.newNSString(Arena.global(), value))

    // @property currencyCode
    open fun currencyCode(): MemorySegment {
        val sel = ObjCRuntime.sel("currencyCode")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCurrencyCode(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCurrencyCode:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun currencyCodeAsString(): String = ObjCRuntime.toJavaString(currencyCode())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setCurrencyCode(value: String) = setCurrencyCode(ObjCRuntime.newNSString(Arena.global(), value))

    // @property currencySymbol
    open fun currencySymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("currencySymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCurrencySymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCurrencySymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun currencySymbolAsString(): String = ObjCRuntime.toJavaString(currencySymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setCurrencySymbol(value: String) = setCurrencySymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property internationalCurrencySymbol
    open fun internationalCurrencySymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("internationalCurrencySymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setInternationalCurrencySymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInternationalCurrencySymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun internationalCurrencySymbolAsString(): String = ObjCRuntime.toJavaString(internationalCurrencySymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setInternationalCurrencySymbol(value: String) = setInternationalCurrencySymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property percentSymbol
    open fun percentSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("percentSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPercentSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPercentSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun percentSymbolAsString(): String = ObjCRuntime.toJavaString(percentSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPercentSymbol(value: String) = setPercentSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property perMillSymbol
    open fun perMillSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("perMillSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPerMillSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPerMillSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun perMillSymbolAsString(): String = ObjCRuntime.toJavaString(perMillSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPerMillSymbol(value: String) = setPerMillSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property minusSign
    open fun minusSign(): MemorySegment {
        val sel = ObjCRuntime.sel("minusSign")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMinusSign(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMinusSign:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun minusSignAsString(): String = ObjCRuntime.toJavaString(minusSign())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setMinusSign(value: String) = setMinusSign(ObjCRuntime.newNSString(Arena.global(), value))

    // @property plusSign
    open fun plusSign(): MemorySegment {
        val sel = ObjCRuntime.sel("plusSign")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPlusSign(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPlusSign:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun plusSignAsString(): String = ObjCRuntime.toJavaString(plusSign())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPlusSign(value: String) = setPlusSign(ObjCRuntime.newNSString(Arena.global(), value))

    // @property exponentSymbol
    open fun exponentSymbol(): MemorySegment {
        val sel = ObjCRuntime.sel("exponentSymbol")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setExponentSymbol(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setExponentSymbol:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun exponentSymbolAsString(): String = ObjCRuntime.toJavaString(exponentSymbol())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setExponentSymbol(value: String) = setExponentSymbol(ObjCRuntime.newNSString(Arena.global(), value))

    // @property groupingSize
    open fun groupingSize(): Long {
        val sel = ObjCRuntime.sel("groupingSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setGroupingSize(value: Long) {
        val sel = ObjCRuntime.sel("setGroupingSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property secondaryGroupingSize
    open fun secondaryGroupingSize(): Long {
        val sel = ObjCRuntime.sel("secondaryGroupingSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setSecondaryGroupingSize(value: Long) {
        val sel = ObjCRuntime.sel("setSecondaryGroupingSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property multiplier
    open fun multiplier(): MemorySegment {
        val sel = ObjCRuntime.sel("multiplier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMultiplier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMultiplier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property formatWidth
    open fun formatWidth(): Long {
        val sel = ObjCRuntime.sel("formatWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setFormatWidth(value: Long) {
        val sel = ObjCRuntime.sel("setFormatWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property paddingCharacter
    open fun paddingCharacter(): MemorySegment {
        val sel = ObjCRuntime.sel("paddingCharacter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPaddingCharacter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPaddingCharacter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun paddingCharacterAsString(): String = ObjCRuntime.toJavaString(paddingCharacter())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setPaddingCharacter(value: String) = setPaddingCharacter(ObjCRuntime.newNSString(Arena.global(), value))

    // @property paddingPosition
    open fun paddingPosition(): NSNumberFormatterPadPosition {
        val sel = ObjCRuntime.sel("paddingPosition")
        return NSNumberFormatterPadPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setPaddingPosition(value: NSNumberFormatterPadPosition) {
        val sel = ObjCRuntime.sel("setPaddingPosition:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property roundingMode
    open fun roundingMode(): NSNumberFormatterRoundingMode {
        val sel = ObjCRuntime.sel("roundingMode")
        return NSNumberFormatterRoundingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setRoundingMode(value: NSNumberFormatterRoundingMode) {
        val sel = ObjCRuntime.sel("setRoundingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property roundingIncrement
    open fun roundingIncrement(): MemorySegment {
        val sel = ObjCRuntime.sel("roundingIncrement")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setRoundingIncrement(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRoundingIncrement:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumIntegerDigits
    open fun minimumIntegerDigits(): Long {
        val sel = ObjCRuntime.sel("minimumIntegerDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMinimumIntegerDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMinimumIntegerDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumIntegerDigits
    open fun maximumIntegerDigits(): Long {
        val sel = ObjCRuntime.sel("maximumIntegerDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMaximumIntegerDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumIntegerDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumFractionDigits
    open fun minimumFractionDigits(): Long {
        val sel = ObjCRuntime.sel("minimumFractionDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMinimumFractionDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMinimumFractionDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumFractionDigits
    open fun maximumFractionDigits(): Long {
        val sel = ObjCRuntime.sel("maximumFractionDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMaximumFractionDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumFractionDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimum
    open fun minimum(): MemorySegment {
        val sel = ObjCRuntime.sel("minimum")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMinimum(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMinimum:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximum
    open fun maximum(): MemorySegment {
        val sel = ObjCRuntime.sel("maximum")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMaximum(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMaximum:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property currencyGroupingSeparator
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun currencyGroupingSeparator(): MemorySegment {
        val sel = ObjCRuntime.sel("currencyGroupingSeparator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setCurrencyGroupingSeparator(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCurrencyGroupingSeparator:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun currencyGroupingSeparatorAsString(): String = ObjCRuntime.toJavaString(currencyGroupingSeparator())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setCurrencyGroupingSeparator(value: String) = setCurrencyGroupingSeparator(ObjCRuntime.newNSString(Arena.global(), value))

    // @property lenient
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isLenient(): Boolean {
        val sel = ObjCRuntime.sel("isLenient")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setLenient(value: Boolean) {
        val sel = ObjCRuntime.sel("setLenient:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesSignificantDigits
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun usesSignificantDigits(): Boolean {
        val sel = ObjCRuntime.sel("usesSignificantDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setUsesSignificantDigits(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesSignificantDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumSignificantDigits
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun minimumSignificantDigits(): Long {
        val sel = ObjCRuntime.sel("minimumSignificantDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setMinimumSignificantDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMinimumSignificantDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumSignificantDigits
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun maximumSignificantDigits(): Long {
        val sel = ObjCRuntime.sel("maximumSignificantDigits")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setMaximumSignificantDigits(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumSignificantDigits:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property partialStringValidationEnabled
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isPartialStringValidationEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isPartialStringValidationEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setPartialStringValidationEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setPartialStringValidationEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSNumberFormatterCompatibility on NSNumberFormatter ─────────────────────────────────────────

fun NSNumberFormatter.hasThousandSeparators(): Boolean {
    val sel = ObjCRuntime.sel("hasThousandSeparators")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSNumberFormatter.setHasThousandSeparators(hasThousandSeparators: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHasThousandSeparators:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hasThousandSeparators)
}

fun NSNumberFormatter.thousandSeparator(): MemorySegment {
    val sel = ObjCRuntime.sel("thousandSeparator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSNumberFormatter.setThousandSeparator(thousandSeparator: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setThousandSeparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, thousandSeparator)
}

fun NSNumberFormatter.localizesFormat(): Boolean {
    val sel = ObjCRuntime.sel("localizesFormat")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSNumberFormatter.setLocalizesFormat(localizesFormat: Boolean): Unit {
    val sel = ObjCRuntime.sel("setLocalizesFormat:")
    ObjCRuntime.msgSend(null, this.ptr, sel, localizesFormat)
}

fun NSNumberFormatter.format(): MemorySegment {
    val sel = ObjCRuntime.sel("format")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSNumberFormatter.setFormat(format: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setFormat:")
    ObjCRuntime.msgSend(null, this.ptr, sel, format)
}

fun NSNumberFormatter.attributedStringForZero(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringForZero")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSNumberFormatter.setAttributedStringForZero(attributedStringForZero: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedStringForZero:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedStringForZero)
}

fun NSNumberFormatter.attributedStringForNil(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringForNil")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSNumberFormatter.setAttributedStringForNil(attributedStringForNil: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedStringForNil:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedStringForNil)
}

fun NSNumberFormatter.attributedStringForNotANumber(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedStringForNotANumber")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSNumberFormatter.setAttributedStringForNotANumber(attributedStringForNotANumber: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedStringForNotANumber:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedStringForNotANumber)
}

fun NSNumberFormatter.roundingBehavior(): MemorySegment {
    val sel = ObjCRuntime.sel("roundingBehavior")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSNumberFormatter.setRoundingBehavior(roundingBehavior: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setRoundingBehavior:")
    ObjCRuntime.msgSend(null, this.ptr, sel, roundingBehavior)
}
