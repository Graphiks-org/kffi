@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLinguisticTagger
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
open class NSLinguisticTagger(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLinguisticTagger") } }

        /** @return NSArray<NSLinguisticTagScheme> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun availableTagSchemesForUnit_language(unit: NSLinguisticTaggerUnit, language: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("availableTagSchemesForUnit:language:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, unit.rawValue, language) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun availableTagSchemesForUnit_language(unit: NSLinguisticTaggerUnit, language: String): MemorySegment = availableTagSchemesForUnit_language(unit, ObjCRuntime.newNSString(Arena.global(), language))

        /** @return NSArray<NSLinguisticTagScheme> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun availableTagSchemesForLanguage(language: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("availableTagSchemesForLanguage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, language) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun availableTagSchemesForLanguage(language: String): MemorySegment = availableTagSchemesForLanguage(ObjCRuntime.newNSString(Arena.global(), language))

        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun dominantLanguageForString(string: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dominantLanguageForString:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, string) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun dominantLanguageForStringAsString(string: MemorySegment): String = ObjCRuntime.toJavaString(dominantLanguageForString(string))

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun dominantLanguageForString(string: String): MemorySegment = dominantLanguageForString(ObjCRuntime.newNSString(Arena.global(), string))

        /** Convenience overload — [String] parameters and [String] return type. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun dominantLanguageForStringAsString(string: String): String = ObjCRuntime.toJavaString(dominantLanguageForString(ObjCRuntime.newNSString(Arena.global(), string)))

        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun tagForString_atIndex_unit_scheme_orthography_tokenRange(string: MemorySegment, charIndex: Long, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, orthography: MemorySegment, tokenRange: NSRangePointer): MemorySegment {
            val sel = ObjCRuntime.sel("tagForString:atIndex:unit:scheme:orthography:tokenRange:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, string, charIndex, unit.rawValue, scheme, orthography, tokenRange.segment) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun tagForString_atIndex_unit_scheme_orthography_tokenRange(string: String, charIndex: Long, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, orthography: MemorySegment, tokenRange: NSRangePointer): MemorySegment = tagForString_atIndex_unit_scheme_orthography_tokenRange(ObjCRuntime.newNSString(Arena.global(), string), charIndex, unit, scheme, orthography, tokenRange)

        /** @return NSArray<NSLinguisticTag> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun tagsForString_range_unit_scheme_options_orthography_tokenRanges(string: MemorySegment, range: NSRange, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, options: NSLinguisticTaggerOptions, orthography: MemorySegment, tokenRanges: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("tagsForString:range:unit:scheme:options:orthography:tokenRanges:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, string, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), unit.rawValue, scheme, options.rawValue, orthography, tokenRanges) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun tagsForString_range_unit_scheme_options_orthography_tokenRanges(string: String, range: NSRange, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, options: NSLinguisticTaggerOptions, orthography: MemorySegment, tokenRanges: MemorySegment): MemorySegment = tagsForString_range_unit_scheme_options_orthography_tokenRanges(ObjCRuntime.newNSString(Arena.global(), string), range, unit, scheme, options, orthography, tokenRanges)

        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun enumerateTagsForString_range_unit_scheme_options_orthography_usingBlock(string: MemorySegment, range: NSRange, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, options: NSLinguisticTaggerOptions, orthography: MemorySegment, block: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("enumerateTagsForString:range:unit:scheme:options:orthography:usingBlock:")
            ObjCRuntime.msgSend(null, _class, sel, string, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), unit.rawValue, scheme, options.rawValue, orthography, block)
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
        fun enumerateTagsForString_range_unit_scheme_options_orthography_usingBlock(string: String, range: NSRange, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, options: NSLinguisticTaggerOptions, orthography: MemorySegment, block: MemorySegment): Unit = enumerateTagsForString_range_unit_scheme_options_orthography_usingBlock(ObjCRuntime.newNSString(Arena.global(), string), range, unit, scheme, options, orthography, block)

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun initWithTagSchemes_options(tagSchemes: MemorySegment, opts: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTagSchemes:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, tagSchemes, opts) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun setOrthography_range(orthography: MemorySegment, range: NSRange): Unit {
        val sel = ObjCRuntime.sel("setOrthography:range:")
        ObjCRuntime.msgSend(null, ptr, sel, orthography, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun orthographyAtIndex_effectiveRange(charIndex: Long, effectiveRange: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("orthographyAtIndex:effectiveRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, charIndex, effectiveRange.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun stringEditedInRange_changeInLength(newRange: NSRange, delta: Long): Unit {
        val sel = ObjCRuntime.sel("stringEditedInRange:changeInLength:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newRange.segment, NSRange.layout), delta)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun tokenRangeAtIndex_unit(charIndex: Long, unit: NSLinguisticTaggerUnit): NSRange {
        val sel = ObjCRuntime.sel("tokenRangeAtIndex:unit:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, charIndex, unit.rawValue))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun sentenceRangeForRange(range: NSRange): NSRange {
        val sel = ObjCRuntime.sel("sentenceRangeForRange:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun enumerateTagsInRange_unit_scheme_options_usingBlock(range: NSRange, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, options: NSLinguisticTaggerOptions, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateTagsInRange:unit:scheme:options:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), unit.rawValue, scheme, options.rawValue, block)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun tagAtIndex_unit_scheme_tokenRange(charIndex: Long, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, tokenRange: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("tagAtIndex:unit:scheme:tokenRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, charIndex, unit.rawValue, scheme, tokenRange.segment) as MemorySegment
    }

    /** @return NSArray<NSLinguisticTag> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun tagsInRange_unit_scheme_options_tokenRanges(range: NSRange, unit: NSLinguisticTaggerUnit, scheme: MemorySegment, options: NSLinguisticTaggerOptions, tokenRanges: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("tagsInRange:unit:scheme:options:tokenRanges:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), unit.rawValue, scheme, options.rawValue, tokenRanges) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun enumerateTagsInRange_scheme_options_usingBlock(range: NSRange, tagScheme: MemorySegment, opts: NSLinguisticTaggerOptions, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateTagsInRange:scheme:options:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), tagScheme, opts.rawValue, block)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun tagAtIndex_scheme_tokenRange_sentenceRange(charIndex: Long, scheme: MemorySegment, tokenRange: NSRangePointer, sentenceRange: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("tagAtIndex:scheme:tokenRange:sentenceRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, charIndex, scheme, tokenRange.segment, sentenceRange.segment) as MemorySegment
    }

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun tagsInRange_scheme_options_tokenRanges(range: NSRange, tagScheme: MemorySegment, opts: NSLinguisticTaggerOptions, tokenRanges: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("tagsInRange:scheme:options:tokenRanges:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), tagScheme, opts.rawValue, tokenRanges) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    fun tagsInRange_scheme_options_tokenRanges(range: NSRange, tagScheme: String, opts: NSLinguisticTaggerOptions, tokenRanges: MemorySegment): MemorySegment = tagsInRange_scheme_options_tokenRanges(range, ObjCRuntime.newNSString(Arena.global(), tagScheme), opts, tokenRanges)

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores(charIndex: Long, tagScheme: MemorySegment, tokenRange: NSRangePointer, sentenceRange: NSRangePointer, scores: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, charIndex, tagScheme, tokenRange.segment, sentenceRange.segment, scores) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    fun possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores(charIndex: Long, tagScheme: String, tokenRange: NSRangePointer, sentenceRange: NSRangePointer, scores: MemorySegment): MemorySegment = possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores(charIndex, ObjCRuntime.newNSString(Arena.global(), tagScheme), tokenRange, sentenceRange, scores)

    // @property tagSchemes
    /** @return NSArray<NSLinguisticTagScheme> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun tagSchemes(): MemorySegment {
        val sel = ObjCRuntime.sel("tagSchemes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property string
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun string(): MemorySegment {
        val sel = ObjCRuntime.sel("string")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun setString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun stringAsString(): String = ObjCRuntime.toJavaString(string())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun setString(value: String) = setString(ObjCRuntime.newNSString(Arena.global(), value))

    // @property dominantLanguage
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun dominantLanguage(): MemorySegment {
        val sel = ObjCRuntime.sel("dominantLanguage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    @PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API")
    open fun dominantLanguageAsString(): String = ObjCRuntime.toJavaString(dominantLanguage())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _schemes: MemorySegment
    // ivar: _options: Long
    // ivar: _string: MemorySegment
    // ivar: _orthographyArray: MemorySegment
    // ivar: _tokenArray: MemorySegment
    // ivar: _reserved: MemorySegment
}
