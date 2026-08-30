@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextInputTraits
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTextInputTraits {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun autocorrectionType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'autocorrectionType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setAutocorrectionType(autocorrectionType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setAutocorrectionType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun spellCheckingType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'spellCheckingType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setSpellCheckingType(spellCheckingType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setSpellCheckingType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun grammarCheckingType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'grammarCheckingType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setGrammarCheckingType(grammarCheckingType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setGrammarCheckingType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun smartQuotesType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'smartQuotesType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setSmartQuotesType(smartQuotesType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setSmartQuotesType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun smartDashesType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'smartDashesType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setSmartDashesType(smartDashesType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setSmartDashesType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun smartInsertDeleteType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'smartInsertDeleteType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setSmartInsertDeleteType(smartInsertDeleteType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setSmartInsertDeleteType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun textReplacementType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'textReplacementType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setTextReplacementType(textReplacementType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setTextReplacementType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun dataDetectionType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'dataDetectionType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setDataDetectionType(dataDetectionType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setDataDetectionType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun linkDetectionType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'linkDetectionType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setLinkDetectionType(linkDetectionType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setLinkDetectionType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun textCompletionType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'textCompletionType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setTextCompletionType(textCompletionType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setTextCompletionType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun inlinePredictionType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'inlinePredictionType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun setInlinePredictionType(inlinePredictionType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setInlinePredictionType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun mathExpressionCompletionType(): NSTextInputTraitType =
        throw UnsupportedOperationException("Optional ObjC method 'mathExpressionCompletionType' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun setMathExpressionCompletionType(mathExpressionCompletionType: NSTextInputTraitType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setMathExpressionCompletionType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun writingToolsBehavior(): NSWritingToolsBehavior =
        throw UnsupportedOperationException("Optional ObjC method 'writingToolsBehavior' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun setWritingToolsBehavior(writingToolsBehavior: NSWritingToolsBehavior): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setWritingToolsBehavior:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun allowedWritingToolsResultOptions(): NSWritingToolsResultOptions =
        throw UnsupportedOperationException("Optional ObjC method 'allowedWritingToolsResultOptions' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun setAllowedWritingToolsResultOptions(allowedWritingToolsResultOptions: NSWritingToolsResultOptions): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setAllowedWritingToolsResultOptions:' not implemented")

}
