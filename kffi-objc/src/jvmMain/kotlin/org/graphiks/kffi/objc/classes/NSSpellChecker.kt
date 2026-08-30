@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSpellChecker
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSpellChecker(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSpellChecker") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun uniqueSpellDocumentTag(): Long {
            val sel = ObjCRuntime.sel("uniqueSpellDocumentTag")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedSpellChecker(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedSpellChecker")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedSpellCheckerExists(): Boolean {
            val sel = ObjCRuntime.sel("sharedSpellCheckerExists")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun isAutomaticTextReplacementEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticTextReplacementEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun isAutomaticSpellingCorrectionEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticSpellingCorrectionEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        fun isAutomaticQuoteSubstitutionEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticQuoteSubstitutionEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        fun isAutomaticDashSubstitutionEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticDashSubstitutionEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun isAutomaticCapitalizationEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticCapitalizationEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun isAutomaticPeriodSubstitutionEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticPeriodSubstitutionEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun isAutomaticTextCompletionEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticTextCompletionEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun isAutomaticInlinePredictionEnabled(): Boolean {
            val sel = ObjCRuntime.sel("isAutomaticInlinePredictionEnabled")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount(stringToCheck: MemorySegment, startingOffset: Long, language: MemorySegment, wrapFlag: Boolean, tag: Long, wordCount: MemorySegment): NSRange {
        val sel = ObjCRuntime.sel("checkSpellingOfString:startingAt:language:wrap:inSpellDocumentWithTag:wordCount:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, stringToCheck, startingOffset, language, wrapFlag, tag, wordCount))
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount(stringToCheck: String, startingOffset: Long, language: String, wrapFlag: Boolean, tag: Long, wordCount: MemorySegment): NSRange = checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount(ObjCRuntime.newNSString(Arena.global(), stringToCheck), startingOffset, ObjCRuntime.newNSString(Arena.global(), language), wrapFlag, tag, wordCount)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkSpellingOfString_startingAt(stringToCheck: MemorySegment, startingOffset: Long): NSRange {
        val sel = ObjCRuntime.sel("checkSpellingOfString:startingAt:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, stringToCheck, startingOffset))
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun checkSpellingOfString_startingAt(stringToCheck: String, startingOffset: Long): NSRange = checkSpellingOfString_startingAt(ObjCRuntime.newNSString(Arena.global(), stringToCheck), startingOffset)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun countWordsInString_language(stringToCount: MemorySegment, language: MemorySegment): Long {
        val sel = ObjCRuntime.sel("countWordsInString:language:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, stringToCount, language) as Long
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun countWordsInString_language(stringToCount: String, language: String): Long = countWordsInString_language(ObjCRuntime.newNSString(Arena.global(), stringToCount), ObjCRuntime.newNSString(Arena.global(), language))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details(stringToCheck: MemorySegment, startingOffset: Long, language: MemorySegment, wrapFlag: Boolean, tag: Long, details: MemorySegment): NSRange {
        val sel = ObjCRuntime.sel("checkGrammarOfString:startingAt:language:wrap:inSpellDocumentWithTag:details:")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel, stringToCheck, startingOffset, language, wrapFlag, tag, details))
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details(stringToCheck: String, startingOffset: Long, language: String, wrapFlag: Boolean, tag: Long, details: MemorySegment): NSRange = checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details(ObjCRuntime.newNSString(Arena.global(), stringToCheck), startingOffset, ObjCRuntime.newNSString(Arena.global(), language), wrapFlag, tag, details)

    /** @return NSArray<NSTextCheckingResult *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount(stringToCheck: MemorySegment, range: NSRange, checkingTypes: Long, options: MemorySegment, tag: Long, orthography: MemorySegment, wordCount: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("checkString:range:types:options:inSpellDocumentWithTag:orthography:wordCount:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, stringToCheck, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options, tag, orthography, wordCount) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount(stringToCheck: String, range: NSRange, checkingTypes: Long, options: MemorySegment, tag: Long, orthography: MemorySegment, wordCount: MemorySegment): MemorySegment = checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount(ObjCRuntime.newNSString(Arena.global(), stringToCheck), range, checkingTypes, options, tag, orthography, wordCount)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler(stringToCheck: MemorySegment, range: NSRange, checkingTypes: Long, options: MemorySegment, tag: Long, completionHandler: MemorySegment): Long {
        val sel = ObjCRuntime.sel("requestCheckingOfString:range:types:options:inSpellDocumentWithTag:completionHandler:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, stringToCheck, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options, tag, completionHandler) as Long
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler(stringToCheck: String, range: NSRange, checkingTypes: Long, options: MemorySegment, tag: Long, completionHandler: MemorySegment): Long = requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler(ObjCRuntime.newNSString(Arena.global(), stringToCheck), range, checkingTypes, options, tag, completionHandler)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun requestCandidatesForSelectedRange_inString_types_options_inSpellDocumentWithTag_completionHandler(selectedRange: NSRange, stringToCheck: MemorySegment, checkingTypes: Long, options: MemorySegment, tag: Long, completionHandler: MemorySegment): Long {
        val sel = ObjCRuntime.sel("requestCandidatesForSelectedRange:inString:types:options:inSpellDocumentWithTag:completionHandler:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(selectedRange.segment, NSRange.layout), stringToCheck, checkingTypes, options, tag, completionHandler) as Long
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    fun requestCandidatesForSelectedRange_inString_types_options_inSpellDocumentWithTag_completionHandler(selectedRange: NSRange, stringToCheck: String, checkingTypes: Long, options: MemorySegment, tag: Long, completionHandler: MemorySegment): Long = requestCandidatesForSelectedRange_inString_types_options_inSpellDocumentWithTag_completionHandler(selectedRange, ObjCRuntime.newNSString(Arena.global(), stringToCheck), checkingTypes, options, tag, completionHandler)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun menuForResult_string_options_atLocation_inView(result: MemorySegment, checkedString: MemorySegment, options: MemorySegment, location: NSPoint, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("menuForResult:string:options:atLocation:inView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, result, checkedString, options, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), view) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun menuForResult_string_options_atLocation_inView(result: MemorySegment, checkedString: String, options: MemorySegment, location: NSPoint, view: MemorySegment): MemorySegment = menuForResult_string_options_atLocation_inView(result, ObjCRuntime.newNSString(Arena.global(), checkedString), options, location, view)

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun userQuotesArrayForLanguage(language: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("userQuotesArrayForLanguage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, language) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun userQuotesArrayForLanguage(language: String): MemorySegment = userQuotesArrayForLanguage(ObjCRuntime.newNSString(Arena.global(), language))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateSpellingPanelWithMisspelledWord(word: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateSpellingPanelWithMisspelledWord:")
        ObjCRuntime.msgSend(null, ptr, sel, word)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun updateSpellingPanelWithMisspelledWord(word: String): Unit = updateSpellingPanelWithMisspelledWord(ObjCRuntime.newNSString(Arena.global(), word))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun updateSpellingPanelWithGrammarString_detail(string: MemorySegment, detail: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateSpellingPanelWithGrammarString:detail:")
        ObjCRuntime.msgSend(null, ptr, sel, string, detail)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun updateSpellingPanelWithGrammarString_detail(string: String, detail: MemorySegment): Unit = updateSpellingPanelWithGrammarString_detail(ObjCRuntime.newNSString(Arena.global(), string), detail)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun updatePanels(): Unit {
        val sel = ObjCRuntime.sel("updatePanels")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ignoreWord_inSpellDocumentWithTag(wordToIgnore: MemorySegment, tag: Long): Unit {
        val sel = ObjCRuntime.sel("ignoreWord:inSpellDocumentWithTag:")
        ObjCRuntime.msgSend(null, ptr, sel, wordToIgnore, tag)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun ignoreWord_inSpellDocumentWithTag(wordToIgnore: String, tag: Long): Unit = ignoreWord_inSpellDocumentWithTag(ObjCRuntime.newNSString(Arena.global(), wordToIgnore), tag)

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ignoredWordsInSpellDocumentWithTag(tag: Long): MemorySegment {
        val sel = ObjCRuntime.sel("ignoredWordsInSpellDocumentWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, tag) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIgnoredWords_inSpellDocumentWithTag(words: MemorySegment, tag: Long): Unit {
        val sel = ObjCRuntime.sel("setIgnoredWords:inSpellDocumentWithTag:")
        ObjCRuntime.msgSend(null, ptr, sel, words, tag)
    }

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun guessesForWordRange_inString_language_inSpellDocumentWithTag(range: NSRange, string: MemorySegment, language: MemorySegment, tag: Long): MemorySegment {
        val sel = ObjCRuntime.sel("guessesForWordRange:inString:language:inSpellDocumentWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), string, language, tag) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    fun guessesForWordRange_inString_language_inSpellDocumentWithTag(range: NSRange, string: String, language: String, tag: Long): MemorySegment = guessesForWordRange_inString_language_inSpellDocumentWithTag(range, ObjCRuntime.newNSString(Arena.global(), string), ObjCRuntime.newNSString(Arena.global(), language), tag)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun correctionForWordRange_inString_language_inSpellDocumentWithTag(range: NSRange, string: MemorySegment, language: MemorySegment, tag: Long): MemorySegment {
        val sel = ObjCRuntime.sel("correctionForWordRange:inString:language:inSpellDocumentWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), string, language, tag) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun correctionForWordRange_inString_language_inSpellDocumentWithTagAsString(range: NSRange, string: MemorySegment, language: MemorySegment, tag: Long): String = ObjCRuntime.toJavaString(correctionForWordRange_inString_language_inSpellDocumentWithTag(range, string, language, tag))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun correctionForWordRange_inString_language_inSpellDocumentWithTag(range: NSRange, string: String, language: String, tag: Long): MemorySegment = correctionForWordRange_inString_language_inSpellDocumentWithTag(range, ObjCRuntime.newNSString(Arena.global(), string), ObjCRuntime.newNSString(Arena.global(), language), tag)

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun correctionForWordRange_inString_language_inSpellDocumentWithTagAsString(range: NSRange, string: String, language: String, tag: Long): String = ObjCRuntime.toJavaString(correctionForWordRange_inString_language_inSpellDocumentWithTag(range, ObjCRuntime.newNSString(Arena.global(), string), ObjCRuntime.newNSString(Arena.global(), language), tag))

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun completionsForPartialWordRange_inString_language_inSpellDocumentWithTag(range: NSRange, string: MemorySegment, language: MemorySegment, tag: Long): MemorySegment {
        val sel = ObjCRuntime.sel("completionsForPartialWordRange:inString:language:inSpellDocumentWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), string, language, tag) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun completionsForPartialWordRange_inString_language_inSpellDocumentWithTag(range: NSRange, string: String, language: String, tag: Long): MemorySegment = completionsForPartialWordRange_inString_language_inSpellDocumentWithTag(range, ObjCRuntime.newNSString(Arena.global(), string), ObjCRuntime.newNSString(Arena.global(), language), tag)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun languageForWordRange_inString_orthography(range: NSRange, string: MemorySegment, orthography: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("languageForWordRange:inString:orthography:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), string, orthography) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun languageForWordRange_inString_orthographyAsString(range: NSRange, string: MemorySegment, orthography: MemorySegment): String = ObjCRuntime.toJavaString(languageForWordRange_inString_orthography(range, string, orthography))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun languageForWordRange_inString_orthography(range: NSRange, string: String, orthography: MemorySegment): MemorySegment = languageForWordRange_inString_orthography(range, ObjCRuntime.newNSString(Arena.global(), string), orthography)

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun languageForWordRange_inString_orthographyAsString(range: NSRange, string: String, orthography: MemorySegment): String = ObjCRuntime.toJavaString(languageForWordRange_inString_orthography(range, ObjCRuntime.newNSString(Arena.global(), string), orthography))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun closeSpellDocumentWithTag(tag: Long): Unit {
        val sel = ObjCRuntime.sel("closeSpellDocumentWithTag:")
        ObjCRuntime.msgSend(null, ptr, sel, tag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag(response: NSCorrectionResponse, correction: MemorySegment, word: MemorySegment, language: MemorySegment, tag: Long): Unit {
        val sel = ObjCRuntime.sel("recordResponse:toCorrection:forWord:language:inSpellDocumentWithTag:")
        ObjCRuntime.msgSend(null, ptr, sel, response.rawValue, correction, word, language, tag)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag(response: NSCorrectionResponse, correction: String, word: String, language: String, tag: Long): Unit = recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag(response, ObjCRuntime.newNSString(Arena.global(), correction), ObjCRuntime.newNSString(Arena.global(), word), ObjCRuntime.newNSString(Arena.global(), language), tag)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler(type: NSCorrectionIndicatorType, primaryString: MemorySegment, alternativeStrings: MemorySegment, rectOfTypedString: NSRect, view: MemorySegment, completionBlock: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showCorrectionIndicatorOfType:primaryString:alternativeStrings:forStringInRect:view:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, type.rawValue, primaryString, alternativeStrings, ObjCRuntime.ObjCStructArg(rectOfTypedString.segment, NSRect.layout), view, completionBlock)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler(type: NSCorrectionIndicatorType, primaryString: String, alternativeStrings: MemorySegment, rectOfTypedString: NSRect, view: MemorySegment, completionBlock: MemorySegment): Unit = showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler(type, ObjCRuntime.newNSString(Arena.global(), primaryString), alternativeStrings, rectOfTypedString, view, completionBlock)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun dismissCorrectionIndicatorForView(view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("dismissCorrectionIndicatorForView:")
        ObjCRuntime.msgSend(null, ptr, sel, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun showInlinePredictionForCandidates_client(candidates: MemorySegment, client: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showInlinePredictionForCandidates:client:")
        ObjCRuntime.msgSend(null, ptr, sel, candidates, client)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun preventsAutocorrectionBeforeString_language(string: MemorySegment, language: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("preventsAutocorrectionBeforeString:language:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, string, language) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    fun preventsAutocorrectionBeforeString_language(string: String, language: String): Boolean = preventsAutocorrectionBeforeString_language(ObjCRuntime.newNSString(Arena.global(), string), ObjCRuntime.newNSString(Arena.global(), language))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun deletesAutospaceBetweenString_andString_language(precedingString: MemorySegment, followingString: MemorySegment, language: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("deletesAutospaceBetweenString:andString:language:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, precedingString, followingString, language) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    fun deletesAutospaceBetweenString_andString_language(precedingString: String, followingString: String, language: String): Boolean = deletesAutospaceBetweenString_andString_language(ObjCRuntime.newNSString(Arena.global(), precedingString), ObjCRuntime.newNSString(Arena.global(), followingString), ObjCRuntime.newNSString(Arena.global(), language))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWordFieldStringValue(string: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setWordFieldStringValue:")
        ObjCRuntime.msgSend(null, ptr, sel, string)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setWordFieldStringValue(string: String): Unit = setWordFieldStringValue(ObjCRuntime.newNSString(Arena.global(), string))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun learnWord(word: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("learnWord:")
        ObjCRuntime.msgSend(null, ptr, sel, word)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun learnWord(word: String): Unit = learnWord(ObjCRuntime.newNSString(Arena.global(), word))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun hasLearnedWord(word: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("hasLearnedWord:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, word) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun hasLearnedWord(word: String): Boolean = hasLearnedWord(ObjCRuntime.newNSString(Arena.global(), word))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun unlearnWord(word: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("unlearnWord:")
        ObjCRuntime.msgSend(null, ptr, sel, word)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun unlearnWord(word: String): Unit = unlearnWord(ObjCRuntime.newNSString(Arena.global(), word))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun language(): MemorySegment {
        val sel = ObjCRuntime.sel("language")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun languageAsString(): String = ObjCRuntime.toJavaString(language())

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLanguage(language: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setLanguage:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, language) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setLanguage(language: String): Boolean = setLanguage(ObjCRuntime.newNSString(Arena.global(), language))

    // @property userReplacementsDictionary
    /** @return NSDictionary<NSString *,NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun userReplacementsDictionary(): MemorySegment {
        val sel = ObjCRuntime.sel("userReplacementsDictionary")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property spellingPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun spellingPanel(): MemorySegment {
        val sel = ObjCRuntime.sel("spellingPanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property accessoryView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun accessoryView(): MemorySegment {
        val sel = ObjCRuntime.sel("accessoryView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAccessoryView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAccessoryView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property substitutionsPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun substitutionsPanel(): MemorySegment {
        val sel = ObjCRuntime.sel("substitutionsPanel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property substitutionsPanelAccessoryViewController
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun substitutionsPanelAccessoryViewController(): MemorySegment {
        val sel = ObjCRuntime.sel("substitutionsPanelAccessoryViewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setSubstitutionsPanelAccessoryViewController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubstitutionsPanelAccessoryViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property availableLanguages
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun availableLanguages(): MemorySegment {
        val sel = ObjCRuntime.sel("availableLanguages")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property userPreferredLanguages
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun userPreferredLanguages(): MemorySegment {
        val sel = ObjCRuntime.sel("userPreferredLanguages")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property automaticallyIdentifiesLanguages
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun automaticallyIdentifiesLanguages(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyIdentifiesLanguages")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setAutomaticallyIdentifiesLanguages(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyIdentifiesLanguages:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSDeprecated on NSSpellChecker ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Use -guessesForWordRange:inString:language:inSpellDocumentWithTag instead")
fun NSSpellChecker.guessesForWord(word: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("guessesForWord:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, word) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSSpellChecker.forgetWord(word: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("forgetWord:")
    ObjCRuntime.msgSend(null, this.ptr, sel, word)
}
