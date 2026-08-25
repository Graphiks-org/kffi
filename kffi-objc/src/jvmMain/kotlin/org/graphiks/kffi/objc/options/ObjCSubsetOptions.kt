package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFGregorianUnitFlags}
 */
@JvmInline
value class CFGregorianUnitFlags(val rawValue: Long) {
    companion object {
        val kCFGregorianUnitsYears = CFGregorianUnitFlags(1L)
        val kCFGregorianUnitsMonths = CFGregorianUnitFlags(2L)
        val kCFGregorianUnitsDays = CFGregorianUnitFlags(4L)
        val kCFGregorianUnitsHours = CFGregorianUnitFlags(8L)
        val kCFGregorianUnitsMinutes = CFGregorianUnitFlags(16L)
        val kCFGregorianUnitsSeconds = CFGregorianUnitFlags(32L)
        val kCFGregorianAllUnits = CFGregorianUnitFlags(16777215L)
    }

    operator fun plus(o: CFGregorianUnitFlags) = CFGregorianUnitFlags(rawValue or o.rawValue)
    operator fun contains(o: CFGregorianUnitFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFDataSearchFlags}
 */
@JvmInline
value class CFDataSearchFlags(val rawValue: Long) {
    companion object {
        val kCFDataSearchBackwards = CFDataSearchFlags(1L)
        val kCFDataSearchAnchored = CFDataSearchFlags(2L)
    }

    operator fun plus(o: CFDataSearchFlags) = CFDataSearchFlags(rawValue or o.rawValue)
    operator fun contains(o: CFDataSearchFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFStringCompareFlags}
 */
@JvmInline
value class CFStringCompareFlags(val rawValue: Long) {
    companion object {
        val kCFCompareCaseInsensitive = CFStringCompareFlags(1L)
        val kCFCompareBackwards = CFStringCompareFlags(4L)
        val kCFCompareAnchored = CFStringCompareFlags(8L)
        val kCFCompareNonliteral = CFStringCompareFlags(16L)
        val kCFCompareLocalized = CFStringCompareFlags(32L)
        val kCFCompareNumerically = CFStringCompareFlags(64L)
        val kCFCompareDiacriticInsensitive = CFStringCompareFlags(128L)
        val kCFCompareWidthInsensitive = CFStringCompareFlags(256L)
        val kCFCompareForcedOrdering = CFStringCompareFlags(512L)
    }

    operator fun plus(o: CFStringCompareFlags) = CFStringCompareFlags(rawValue or o.rawValue)
    operator fun contains(o: CFStringCompareFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFCalendarUnit}
 */
@JvmInline
value class CFCalendarUnit(val rawValue: Long) {
    companion object {
        val kCFCalendarUnitEra = CFCalendarUnit(2L)
        val kCFCalendarUnitYear = CFCalendarUnit(4L)
        val kCFCalendarUnitMonth = CFCalendarUnit(8L)
        val kCFCalendarUnitDay = CFCalendarUnit(16L)
        val kCFCalendarUnitHour = CFCalendarUnit(32L)
        val kCFCalendarUnitMinute = CFCalendarUnit(64L)
        val kCFCalendarUnitSecond = CFCalendarUnit(128L)
        val kCFCalendarUnitWeek = CFCalendarUnit(256L)
        val kCFCalendarUnitWeekday = CFCalendarUnit(512L)
        val kCFCalendarUnitWeekdayOrdinal = CFCalendarUnit(1024L)
        val kCFCalendarUnitQuarter = CFCalendarUnit(2048L)
        val kCFCalendarUnitWeekOfMonth = CFCalendarUnit(4096L)
        val kCFCalendarUnitWeekOfYear = CFCalendarUnit(8192L)
        val kCFCalendarUnitYearForWeekOfYear = CFCalendarUnit(16384L)
        val kCFCalendarUnitDayOfYear = CFCalendarUnit(65536L)
    }

    operator fun plus(o: CFCalendarUnit) = CFCalendarUnit(rawValue or o.rawValue)
    operator fun contains(o: CFCalendarUnit) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFISO8601DateFormatOptions}
 */
@JvmInline
value class CFISO8601DateFormatOptions(val rawValue: Long) {
    companion object {
        val kCFISO8601DateFormatWithYear = CFISO8601DateFormatOptions(1L)
        val kCFISO8601DateFormatWithMonth = CFISO8601DateFormatOptions(2L)
        val kCFISO8601DateFormatWithWeekOfYear = CFISO8601DateFormatOptions(4L)
        val kCFISO8601DateFormatWithDay = CFISO8601DateFormatOptions(16L)
        val kCFISO8601DateFormatWithTime = CFISO8601DateFormatOptions(32L)
        val kCFISO8601DateFormatWithTimeZone = CFISO8601DateFormatOptions(64L)
        val kCFISO8601DateFormatWithSpaceBetweenDateAndTime = CFISO8601DateFormatOptions(128L)
        val kCFISO8601DateFormatWithDashSeparatorInDate = CFISO8601DateFormatOptions(256L)
        val kCFISO8601DateFormatWithColonSeparatorInTime = CFISO8601DateFormatOptions(512L)
        val kCFISO8601DateFormatWithColonSeparatorInTimeZone = CFISO8601DateFormatOptions(1024L)
        val kCFISO8601DateFormatWithFractionalSeconds = CFISO8601DateFormatOptions(2048L)
        val kCFISO8601DateFormatWithFullDate = CFISO8601DateFormatOptions(275L)
        val kCFISO8601DateFormatWithFullTime = CFISO8601DateFormatOptions(1632L)
        val kCFISO8601DateFormatWithInternetDateTime = CFISO8601DateFormatOptions(1907L)
    }

    operator fun plus(o: CFISO8601DateFormatOptions) = CFISO8601DateFormatOptions(rawValue or o.rawValue)
    operator fun contains(o: CFISO8601DateFormatOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFNumberFormatterOptionFlags}
 */
@JvmInline
value class CFNumberFormatterOptionFlags(val rawValue: Long) {
    companion object {
        val kCFNumberFormatterParseIntegersOnly = CFNumberFormatterOptionFlags(1L)
    }

    operator fun plus(o: CFNumberFormatterOptionFlags) = CFNumberFormatterOptionFlags(rawValue or o.rawValue)
    operator fun contains(o: CFNumberFormatterOptionFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFURLBookmarkCreationOptions}
 */
@JvmInline
value class CFURLBookmarkCreationOptions(val rawValue: Long) {
    companion object {
        val kCFURLBookmarkCreationMinimalBookmarkMask = CFURLBookmarkCreationOptions(512L)
        val kCFURLBookmarkCreationSuitableForBookmarkFile = CFURLBookmarkCreationOptions(1024L)
        val kCFURLBookmarkCreationWithSecurityScope = CFURLBookmarkCreationOptions(2048L)
        val kCFURLBookmarkCreationSecurityScopeAllowOnlyReadAccess = CFURLBookmarkCreationOptions(4096L)
        val kCFURLBookmarkCreationWithoutImplicitSecurityScope = CFURLBookmarkCreationOptions(536870912L)
        val kCFURLBookmarkCreationPreferFileIDResolutionMask = CFURLBookmarkCreationOptions(256L)
    }

    operator fun plus(o: CFURLBookmarkCreationOptions) = CFURLBookmarkCreationOptions(rawValue or o.rawValue)
    operator fun contains(o: CFURLBookmarkCreationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFURLBookmarkResolutionOptions}
 */
@JvmInline
value class CFURLBookmarkResolutionOptions(val rawValue: Long) {
    companion object {
        val kCFURLBookmarkResolutionWithoutUIMask = CFURLBookmarkResolutionOptions(256L)
        val kCFURLBookmarkResolutionWithoutMountingMask = CFURLBookmarkResolutionOptions(512L)
        val kCFURLBookmarkResolutionWithSecurityScope = CFURLBookmarkResolutionOptions(1024L)
        val kCFURLBookmarkResolutionWithoutImplicitStartAccessing = CFURLBookmarkResolutionOptions(32768L)
        val kCFBookmarkResolutionWithoutUIMask = CFURLBookmarkResolutionOptions(256L)
        val kCFBookmarkResolutionWithoutMountingMask = CFURLBookmarkResolutionOptions(512L)
    }

    operator fun plus(o: CFURLBookmarkResolutionOptions) = CFURLBookmarkResolutionOptions(rawValue or o.rawValue)
    operator fun contains(o: CFURLBookmarkResolutionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum mpo_flags_t}
 */
@JvmInline
value class mpo_flags_t(val rawValue: Long) {
    companion object {
        val MPO_PORT = mpo_flags_t(0L)
        val MPO_SERVICE_PORT = mpo_flags_t(1024L)
        val MPO_CONNECTION_PORT = mpo_flags_t(2048L)
        val MPO_REPLY_PORT = mpo_flags_t(4096L)
        val MPO_WEAK_REPLY_PORT = mpo_flags_t(16384L)
        val MPO_NOTIFICATION_PORT = mpo_flags_t(17408L)
        val MPO_EXCEPTION_PORT = mpo_flags_t(32768L)
        val MPO_CONNECTION_PORT_WITH_PORT_ARRAY = mpo_flags_t(65536L)
    }

    operator fun plus(o: mpo_flags_t) = mpo_flags_t(rawValue or o.rawValue)
    operator fun contains(o: mpo_flags_t) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFRunLoopActivity}
 */
@JvmInline
value class CFRunLoopActivity(val rawValue: Long) {
    companion object {
        val kCFRunLoopEntry = CFRunLoopActivity(1L)
        val kCFRunLoopBeforeTimers = CFRunLoopActivity(2L)
        val kCFRunLoopBeforeSources = CFRunLoopActivity(4L)
        val kCFRunLoopBeforeWaiting = CFRunLoopActivity(32L)
        val kCFRunLoopAfterWaiting = CFRunLoopActivity(64L)
        val kCFRunLoopExit = CFRunLoopActivity(128L)
        val kCFRunLoopAllActivities = CFRunLoopActivity(268435455L)
    }

    operator fun plus(o: CFRunLoopActivity) = CFRunLoopActivity(rawValue or o.rawValue)
    operator fun contains(o: CFRunLoopActivity) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFSocketCallBackType}
 */
@JvmInline
value class CFSocketCallBackType(val rawValue: Long) {
    companion object {
        val kCFSocketNoCallBack = CFSocketCallBackType(0L)
        val kCFSocketReadCallBack = CFSocketCallBackType(1L)
        val kCFSocketAcceptCallBack = CFSocketCallBackType(2L)
        val kCFSocketDataCallBack = CFSocketCallBackType(3L)
        val kCFSocketConnectCallBack = CFSocketCallBackType(4L)
        val kCFSocketWriteCallBack = CFSocketCallBackType(8L)
    }

    operator fun plus(o: CFSocketCallBackType) = CFSocketCallBackType(rawValue or o.rawValue)
    operator fun contains(o: CFSocketCallBackType) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum dispatch_block_flags_t}
 */
@JvmInline
value class dispatch_block_flags_t(val rawValue: Long) {
    companion object {
        val DISPATCH_BLOCK_BARRIER = dispatch_block_flags_t(1L)
        val DISPATCH_BLOCK_DETACHED = dispatch_block_flags_t(2L)
        val DISPATCH_BLOCK_ASSIGN_CURRENT = dispatch_block_flags_t(4L)
        val DISPATCH_BLOCK_NO_QOS_CLASS = dispatch_block_flags_t(8L)
        val DISPATCH_BLOCK_INHERIT_QOS_CLASS = dispatch_block_flags_t(16L)
        val DISPATCH_BLOCK_ENFORCE_QOS_CLASS = dispatch_block_flags_t(32L)
    }

    operator fun plus(o: dispatch_block_flags_t) = dispatch_block_flags_t(rawValue or o.rawValue)
    operator fun contains(o: dispatch_block_flags_t) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFStreamEventType}
 */
@JvmInline
value class CFStreamEventType(val rawValue: Long) {
    companion object {
        val kCFStreamEventNone = CFStreamEventType(0L)
        val kCFStreamEventOpenCompleted = CFStreamEventType(1L)
        val kCFStreamEventHasBytesAvailable = CFStreamEventType(2L)
        val kCFStreamEventCanAcceptBytes = CFStreamEventType(4L)
        val kCFStreamEventErrorOccurred = CFStreamEventType(8L)
        val kCFStreamEventEndEncountered = CFStreamEventType(16L)
    }

    operator fun plus(o: CFStreamEventType) = CFStreamEventType(rawValue or o.rawValue)
    operator fun contains(o: CFStreamEventType) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFPropertyListMutabilityOptions}
 */
@JvmInline
value class CFPropertyListMutabilityOptions(val rawValue: Long) {
    companion object {
        val kCFPropertyListImmutable = CFPropertyListMutabilityOptions(0L)
        val kCFPropertyListMutableContainers = CFPropertyListMutabilityOptions(1L)
        val kCFPropertyListMutableContainersAndLeaves = CFPropertyListMutabilityOptions(2L)
    }

    operator fun plus(o: CFPropertyListMutabilityOptions) = CFPropertyListMutabilityOptions(rawValue or o.rawValue)
    operator fun contains(o: CFPropertyListMutabilityOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFURLEnumeratorOptions}
 */
@JvmInline
value class CFURLEnumeratorOptions(val rawValue: Long) {
    companion object {
        val kCFURLEnumeratorDefaultBehavior = CFURLEnumeratorOptions(0L)
        val kCFURLEnumeratorDescendRecursively = CFURLEnumeratorOptions(1L)
        val kCFURLEnumeratorSkipInvisibles = CFURLEnumeratorOptions(2L)
        val kCFURLEnumeratorGenerateFileReferenceURLs = CFURLEnumeratorOptions(4L)
        val kCFURLEnumeratorSkipPackageContents = CFURLEnumeratorOptions(8L)
        val kCFURLEnumeratorIncludeDirectoriesPreOrder = CFURLEnumeratorOptions(16L)
        val kCFURLEnumeratorIncludeDirectoriesPostOrder = CFURLEnumeratorOptions(32L)
        val kCFURLEnumeratorGenerateRelativePathURLs = CFURLEnumeratorOptions(64L)
    }

    operator fun plus(o: CFURLEnumeratorOptions) = CFURLEnumeratorOptions(rawValue or o.rawValue)
    operator fun contains(o: CFURLEnumeratorOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFFileSecurityClearOptions}
 */
@JvmInline
value class CFFileSecurityClearOptions(val rawValue: Long) {
    companion object {
        val kCFFileSecurityClearOwner = CFFileSecurityClearOptions(1L)
        val kCFFileSecurityClearGroup = CFFileSecurityClearOptions(2L)
        val kCFFileSecurityClearMode = CFFileSecurityClearOptions(4L)
        val kCFFileSecurityClearOwnerUUID = CFFileSecurityClearOptions(8L)
        val kCFFileSecurityClearGroupUUID = CFFileSecurityClearOptions(16L)
        val kCFFileSecurityClearAccessControlList = CFFileSecurityClearOptions(32L)
    }

    operator fun plus(o: CFFileSecurityClearOptions) = CFFileSecurityClearOptions(rawValue or o.rawValue)
    operator fun contains(o: CFFileSecurityClearOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFStringTokenizerTokenType}
 */
@JvmInline
value class CFStringTokenizerTokenType(val rawValue: Long) {
    companion object {
        val kCFStringTokenizerTokenNone = CFStringTokenizerTokenType(0L)
        val kCFStringTokenizerTokenNormal = CFStringTokenizerTokenType(1L)
        val kCFStringTokenizerTokenHasSubTokensMask = CFStringTokenizerTokenType(2L)
        val kCFStringTokenizerTokenHasDerivedSubTokensMask = CFStringTokenizerTokenType(4L)
        val kCFStringTokenizerTokenHasHasNumbersMask = CFStringTokenizerTokenType(8L)
        val kCFStringTokenizerTokenHasNonLettersMask = CFStringTokenizerTokenType(16L)
        val kCFStringTokenizerTokenIsCJWordMask = CFStringTokenizerTokenType(32L)
    }

    operator fun plus(o: CFStringTokenizerTokenType) = CFStringTokenizerTokenType(rawValue or o.rawValue)
    operator fun contains(o: CFStringTokenizerTokenType) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFXMLParserOptions}
 */
@JvmInline
value class CFXMLParserOptions(val rawValue: Long) {
    companion object {
        val kCFXMLParserValidateDocument = CFXMLParserOptions(1L)
        val kCFXMLParserSkipMetaData = CFXMLParserOptions(2L)
        val kCFXMLParserReplacePhysicalEntities = CFXMLParserOptions(4L)
        val kCFXMLParserSkipWhitespace = CFXMLParserOptions(8L)
        val kCFXMLParserResolveExternalEntities = CFXMLParserOptions(16L)
        val kCFXMLParserAddImpliedAttributes = CFXMLParserOptions(32L)
        val kCFXMLParserAllOptions = CFXMLParserOptions(16777215L)
        val kCFXMLParserNoOptions = CFXMLParserOptions(0L)
    }

    operator fun plus(o: CFXMLParserOptions) = CFXMLParserOptions(rawValue or o.rawValue)
    operator fun contains(o: CFXMLParserOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFXMLParserStatusCode}
 */
@JvmInline
value class CFXMLParserStatusCode(val rawValue: Long) {
    companion object {
        val kCFXMLStatusParseNotBegun = CFXMLParserStatusCode(-2L)
        val kCFXMLStatusParseInProgress = CFXMLParserStatusCode(-1L)
        val kCFXMLStatusParseSuccessful = CFXMLParserStatusCode(0L)
        val kCFXMLErrorUnexpectedEOF = CFXMLParserStatusCode(1L)
        val kCFXMLErrorUnknownEncoding = CFXMLParserStatusCode(2L)
        val kCFXMLErrorEncodingConversionFailure = CFXMLParserStatusCode(3L)
        val kCFXMLErrorMalformedProcessingInstruction = CFXMLParserStatusCode(4L)
        val kCFXMLErrorMalformedDTD = CFXMLParserStatusCode(5L)
        val kCFXMLErrorMalformedName = CFXMLParserStatusCode(6L)
        val kCFXMLErrorMalformedCDSect = CFXMLParserStatusCode(7L)
        val kCFXMLErrorMalformedCloseTag = CFXMLParserStatusCode(8L)
        val kCFXMLErrorMalformedStartTag = CFXMLParserStatusCode(9L)
        val kCFXMLErrorMalformedDocument = CFXMLParserStatusCode(10L)
        val kCFXMLErrorElementlessDocument = CFXMLParserStatusCode(11L)
        val kCFXMLErrorMalformedComment = CFXMLParserStatusCode(12L)
        val kCFXMLErrorMalformedCharacterReference = CFXMLParserStatusCode(13L)
        val kCFXMLErrorMalformedParsedCharacterData = CFXMLParserStatusCode(14L)
        val kCFXMLErrorNoData = CFXMLParserStatusCode(15L)
    }

    operator fun plus(o: CFXMLParserStatusCode) = CFXMLParserStatusCode(rawValue or o.rawValue)
    operator fun contains(o: CFXMLParserStatusCode) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSEnumerationOptions}
 */
@JvmInline
value class NSEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSEnumerationConcurrent = NSEnumerationOptions(1L)
        val NSEnumerationReverse = NSEnumerationOptions(2L)
    }

    operator fun plus(o: NSEnumerationOptions) = NSEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSSortOptions}
 */
@JvmInline
value class NSSortOptions(val rawValue: Long) {
    companion object {
        val NSSortConcurrent = NSSortOptions(1L)
        val NSSortStable = NSSortOptions(16L)
    }

    operator fun plus(o: NSSortOptions) = NSSortOptions(rawValue or o.rawValue)
    operator fun contains(o: NSSortOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSOrderedCollectionDifferenceCalculationOptions}
 */
@JvmInline
value class NSOrderedCollectionDifferenceCalculationOptions(val rawValue: Long) {
    companion object {
        val NSOrderedCollectionDifferenceCalculationOmitInsertedObjects = NSOrderedCollectionDifferenceCalculationOptions(1L)
        val NSOrderedCollectionDifferenceCalculationOmitRemovedObjects = NSOrderedCollectionDifferenceCalculationOptions(2L)
        val NSOrderedCollectionDifferenceCalculationInferMoves = NSOrderedCollectionDifferenceCalculationOptions(4L)
    }

    operator fun plus(o: NSOrderedCollectionDifferenceCalculationOptions) = NSOrderedCollectionDifferenceCalculationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSOrderedCollectionDifferenceCalculationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSBinarySearchingOptions}
 */
@JvmInline
value class NSBinarySearchingOptions(val rawValue: Long) {
    companion object {
        val NSBinarySearchingFirstEqual = NSBinarySearchingOptions(256L)
        val NSBinarySearchingLastEqual = NSBinarySearchingOptions(512L)
        val NSBinarySearchingInsertionIndex = NSBinarySearchingOptions(1024L)
    }

    operator fun plus(o: NSBinarySearchingOptions) = NSBinarySearchingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSBinarySearchingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSItemProviderFileOptions}
 */
@JvmInline
value class NSItemProviderFileOptions(val rawValue: Long) {
    companion object {
        val NSItemProviderFileOptionOpenInPlace = NSItemProviderFileOptions(1L)
    }

    operator fun plus(o: NSItemProviderFileOptions) = NSItemProviderFileOptions(rawValue or o.rawValue)
    operator fun contains(o: NSItemProviderFileOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSStringCompareOptions}
 */
@JvmInline
value class NSStringCompareOptions(val rawValue: Long) {
    companion object {
        val NSCaseInsensitiveSearch = NSStringCompareOptions(1L)
        val NSLiteralSearch = NSStringCompareOptions(2L)
        val NSBackwardsSearch = NSStringCompareOptions(4L)
        val NSAnchoredSearch = NSStringCompareOptions(8L)
        val NSNumericSearch = NSStringCompareOptions(64L)
        val NSDiacriticInsensitiveSearch = NSStringCompareOptions(128L)
        val NSWidthInsensitiveSearch = NSStringCompareOptions(256L)
        val NSForcedOrderingSearch = NSStringCompareOptions(512L)
        val NSRegularExpressionSearch = NSStringCompareOptions(1024L)
    }

    operator fun plus(o: NSStringCompareOptions) = NSStringCompareOptions(rawValue or o.rawValue)
    operator fun contains(o: NSStringCompareOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSStringEncodingConversionOptions}
 */
@JvmInline
value class NSStringEncodingConversionOptions(val rawValue: Long) {
    companion object {
        val NSStringEncodingConversionAllowLossy = NSStringEncodingConversionOptions(1L)
        val NSStringEncodingConversionExternalRepresentation = NSStringEncodingConversionOptions(2L)
    }

    operator fun plus(o: NSStringEncodingConversionOptions) = NSStringEncodingConversionOptions(rawValue or o.rawValue)
    operator fun contains(o: NSStringEncodingConversionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSStringEnumerationOptions}
 */
@JvmInline
value class NSStringEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSStringEnumerationByLines = NSStringEnumerationOptions(0L)
        val NSStringEnumerationByParagraphs = NSStringEnumerationOptions(1L)
        val NSStringEnumerationByComposedCharacterSequences = NSStringEnumerationOptions(2L)
        val NSStringEnumerationByWords = NSStringEnumerationOptions(3L)
        val NSStringEnumerationBySentences = NSStringEnumerationOptions(4L)
        val NSStringEnumerationByCaretPositions = NSStringEnumerationOptions(5L)
        val NSStringEnumerationByDeletionClusters = NSStringEnumerationOptions(6L)
        val NSStringEnumerationReverse = NSStringEnumerationOptions(256L)
        val NSStringEnumerationSubstringNotRequired = NSStringEnumerationOptions(512L)
        val NSStringEnumerationLocalized = NSStringEnumerationOptions(1024L)
    }

    operator fun plus(o: NSStringEnumerationOptions) = NSStringEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSStringEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCalendarUnit}
 */
@JvmInline
value class NSCalendarUnit(val rawValue: Long) {
    companion object {
        val NSCalendarUnitEra = NSCalendarUnit(2L)
        val NSCalendarUnitYear = NSCalendarUnit(4L)
        val NSCalendarUnitMonth = NSCalendarUnit(8L)
        val NSCalendarUnitDay = NSCalendarUnit(16L)
        val NSCalendarUnitHour = NSCalendarUnit(32L)
        val NSCalendarUnitMinute = NSCalendarUnit(64L)
        val NSCalendarUnitSecond = NSCalendarUnit(128L)
        val NSCalendarUnitWeekday = NSCalendarUnit(512L)
        val NSCalendarUnitWeekdayOrdinal = NSCalendarUnit(1024L)
        val NSCalendarUnitQuarter = NSCalendarUnit(2048L)
        val NSCalendarUnitWeekOfMonth = NSCalendarUnit(4096L)
        val NSCalendarUnitWeekOfYear = NSCalendarUnit(8192L)
        val NSCalendarUnitYearForWeekOfYear = NSCalendarUnit(16384L)
        val NSCalendarUnitNanosecond = NSCalendarUnit(32768L)
        val NSCalendarUnitDayOfYear = NSCalendarUnit(65536L)
        val NSCalendarUnitCalendar = NSCalendarUnit(1048576L)
        val NSCalendarUnitTimeZone = NSCalendarUnit(2097152L)
        val NSCalendarUnitIsLeapMonth = NSCalendarUnit(1073741824L)
        val NSCalendarUnitIsRepeatedDay = NSCalendarUnit(2147483648L)
        val NSEraCalendarUnit = NSCalendarUnit(2L)
        val NSYearCalendarUnit = NSCalendarUnit(4L)
        val NSMonthCalendarUnit = NSCalendarUnit(8L)
        val NSDayCalendarUnit = NSCalendarUnit(16L)
        val NSHourCalendarUnit = NSCalendarUnit(32L)
        val NSMinuteCalendarUnit = NSCalendarUnit(64L)
        val NSSecondCalendarUnit = NSCalendarUnit(128L)
        val NSWeekCalendarUnit = NSCalendarUnit(256L)
        val NSWeekdayCalendarUnit = NSCalendarUnit(512L)
        val NSWeekdayOrdinalCalendarUnit = NSCalendarUnit(1024L)
        val NSQuarterCalendarUnit = NSCalendarUnit(2048L)
        val NSWeekOfMonthCalendarUnit = NSCalendarUnit(4096L)
        val NSWeekOfYearCalendarUnit = NSCalendarUnit(8192L)
        val NSYearForWeekOfYearCalendarUnit = NSCalendarUnit(16384L)
        val NSCalendarCalendarUnit = NSCalendarUnit(1048576L)
        val NSTimeZoneCalendarUnit = NSCalendarUnit(2097152L)
    }

    operator fun plus(o: NSCalendarUnit) = NSCalendarUnit(rawValue or o.rawValue)
    operator fun contains(o: NSCalendarUnit) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCalendarOptions}
 */
@JvmInline
value class NSCalendarOptions(val rawValue: Long) {
    companion object {
        val NSCalendarWrapComponents = NSCalendarOptions(1L)
        val NSCalendarMatchStrictly = NSCalendarOptions(2L)
        val NSCalendarSearchBackwards = NSCalendarOptions(4L)
        val NSCalendarMatchPreviousTimePreservingSmallerUnits = NSCalendarOptions(256L)
        val NSCalendarMatchNextTimePreservingSmallerUnits = NSCalendarOptions(512L)
        val NSCalendarMatchNextTime = NSCalendarOptions(1024L)
        val NSCalendarMatchFirst = NSCalendarOptions(4096L)
        val NSCalendarMatchLast = NSCalendarOptions(8192L)
    }

    operator fun plus(o: NSCalendarOptions) = NSCalendarOptions(rawValue or o.rawValue)
    operator fun contains(o: NSCalendarOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDataReadingOptions}
 */
@JvmInline
value class NSDataReadingOptions(val rawValue: Long) {
    companion object {
        val NSDataReadingMappedIfSafe = NSDataReadingOptions(1L)
        val NSDataReadingUncached = NSDataReadingOptions(2L)
        val NSDataReadingMappedAlways = NSDataReadingOptions(8L)
        val NSDataReadingMapped = NSDataReadingOptions(1L)
        val NSMappedRead = NSDataReadingOptions(1L)
        val NSUncachedRead = NSDataReadingOptions(2L)
    }

    operator fun plus(o: NSDataReadingOptions) = NSDataReadingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDataReadingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDataWritingOptions}
 */
@JvmInline
value class NSDataWritingOptions(val rawValue: Long) {
    companion object {
        val NSDataWritingAtomic = NSDataWritingOptions(1L)
        val NSDataWritingWithoutOverwriting = NSDataWritingOptions(2L)
        val NSDataWritingFileProtectionNone = NSDataWritingOptions(268435456L)
        val NSDataWritingFileProtectionComplete = NSDataWritingOptions(536870912L)
        val NSDataWritingFileProtectionCompleteUnlessOpen = NSDataWritingOptions(805306368L)
        val NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication = NSDataWritingOptions(1073741824L)
        val NSDataWritingFileProtectionCompleteWhenUserInactive = NSDataWritingOptions(1342177280L)
        val NSDataWritingFileProtectionMask = NSDataWritingOptions(4026531840L)
        val NSAtomicWrite = NSDataWritingOptions(1L)
    }

    operator fun plus(o: NSDataWritingOptions) = NSDataWritingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDataWritingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDataSearchOptions}
 */
@JvmInline
value class NSDataSearchOptions(val rawValue: Long) {
    companion object {
        val NSDataSearchBackwards = NSDataSearchOptions(1L)
        val NSDataSearchAnchored = NSDataSearchOptions(2L)
    }

    operator fun plus(o: NSDataSearchOptions) = NSDataSearchOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDataSearchOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDataBase64EncodingOptions}
 */
@JvmInline
value class NSDataBase64EncodingOptions(val rawValue: Long) {
    companion object {
        val NSDataBase64Encoding64CharacterLineLength = NSDataBase64EncodingOptions(1L)
        val NSDataBase64Encoding76CharacterLineLength = NSDataBase64EncodingOptions(2L)
        val NSDataBase64EncodingEndLineWithCarriageReturn = NSDataBase64EncodingOptions(16L)
        val NSDataBase64EncodingEndLineWithLineFeed = NSDataBase64EncodingOptions(32L)
    }

    operator fun plus(o: NSDataBase64EncodingOptions) = NSDataBase64EncodingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDataBase64EncodingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDataBase64DecodingOptions}
 */
@JvmInline
value class NSDataBase64DecodingOptions(val rawValue: Long) {
    companion object {
        val NSDataBase64DecodingIgnoreUnknownCharacters = NSDataBase64DecodingOptions(1L)
    }

    operator fun plus(o: NSDataBase64DecodingOptions) = NSDataBase64DecodingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDataBase64DecodingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSAttributedStringEnumerationOptions}
 */
@JvmInline
value class NSAttributedStringEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSAttributedStringEnumerationReverse = NSAttributedStringEnumerationOptions(2L)
        val NSAttributedStringEnumerationLongestEffectiveRangeNotRequired = NSAttributedStringEnumerationOptions(1048576L)
    }

    operator fun plus(o: NSAttributedStringEnumerationOptions) = NSAttributedStringEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSAttributedStringEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSInlinePresentationIntent}
 */
@JvmInline
value class NSInlinePresentationIntent(val rawValue: Long) {
    companion object {
        val NSInlinePresentationIntentEmphasized = NSInlinePresentationIntent(1L)
        val NSInlinePresentationIntentStronglyEmphasized = NSInlinePresentationIntent(2L)
        val NSInlinePresentationIntentCode = NSInlinePresentationIntent(4L)
        val NSInlinePresentationIntentStrikethrough = NSInlinePresentationIntent(32L)
        val NSInlinePresentationIntentSoftBreak = NSInlinePresentationIntent(64L)
        val NSInlinePresentationIntentLineBreak = NSInlinePresentationIntent(128L)
        val NSInlinePresentationIntentInlineHTML = NSInlinePresentationIntent(256L)
        val NSInlinePresentationIntentBlockHTML = NSInlinePresentationIntent(512L)
    }

    operator fun plus(o: NSInlinePresentationIntent) = NSInlinePresentationIntent(rawValue or o.rawValue)
    operator fun contains(o: NSInlinePresentationIntent) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSAttributedStringFormattingOptions}
 */
@JvmInline
value class NSAttributedStringFormattingOptions(val rawValue: Long) {
    companion object {
        val NSAttributedStringFormattingInsertArgumentAttributesWithoutMerging = NSAttributedStringFormattingOptions(1L)
        val NSAttributedStringFormattingApplyReplacementIndexAttribute = NSAttributedStringFormattingOptions(2L)
    }

    operator fun plus(o: NSAttributedStringFormattingOptions) = NSAttributedStringFormattingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSAttributedStringFormattingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSISO8601DateFormatOptions}
 */
@JvmInline
value class NSISO8601DateFormatOptions(val rawValue: Long) {
    companion object {
        val NSISO8601DateFormatWithYear = NSISO8601DateFormatOptions(1L)
        val NSISO8601DateFormatWithMonth = NSISO8601DateFormatOptions(2L)
        val NSISO8601DateFormatWithWeekOfYear = NSISO8601DateFormatOptions(4L)
        val NSISO8601DateFormatWithDay = NSISO8601DateFormatOptions(16L)
        val NSISO8601DateFormatWithTime = NSISO8601DateFormatOptions(32L)
        val NSISO8601DateFormatWithTimeZone = NSISO8601DateFormatOptions(64L)
        val NSISO8601DateFormatWithSpaceBetweenDateAndTime = NSISO8601DateFormatOptions(128L)
        val NSISO8601DateFormatWithDashSeparatorInDate = NSISO8601DateFormatOptions(256L)
        val NSISO8601DateFormatWithColonSeparatorInTime = NSISO8601DateFormatOptions(512L)
        val NSISO8601DateFormatWithColonSeparatorInTimeZone = NSISO8601DateFormatOptions(1024L)
        val NSISO8601DateFormatWithFractionalSeconds = NSISO8601DateFormatOptions(2048L)
        val NSISO8601DateFormatWithFullDate = NSISO8601DateFormatOptions(275L)
        val NSISO8601DateFormatWithFullTime = NSISO8601DateFormatOptions(1632L)
        val NSISO8601DateFormatWithInternetDateTime = NSISO8601DateFormatOptions(1907L)
    }

    operator fun plus(o: NSISO8601DateFormatOptions) = NSISO8601DateFormatOptions(rawValue or o.rawValue)
    operator fun contains(o: NSISO8601DateFormatOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSMeasurementFormatterUnitOptions}
 */
@JvmInline
value class NSMeasurementFormatterUnitOptions(val rawValue: Long) {
    companion object {
        val NSMeasurementFormatterUnitOptionsProvidedUnit = NSMeasurementFormatterUnitOptions(1L)
        val NSMeasurementFormatterUnitOptionsNaturalScale = NSMeasurementFormatterUnitOptions(2L)
        val NSMeasurementFormatterUnitOptionsTemperatureWithoutUnit = NSMeasurementFormatterUnitOptions(4L)
    }

    operator fun plus(o: NSMeasurementFormatterUnitOptions) = NSMeasurementFormatterUnitOptions(rawValue or o.rawValue)
    operator fun contains(o: NSMeasurementFormatterUnitOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPersonNameComponentsFormatterOptions}
 */
@JvmInline
value class NSPersonNameComponentsFormatterOptions(val rawValue: Long) {
    companion object {
        val NSPersonNameComponentsFormatterPhonetic = NSPersonNameComponentsFormatterOptions(2L)
    }

    operator fun plus(o: NSPersonNameComponentsFormatterOptions) = NSPersonNameComponentsFormatterOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPersonNameComponentsFormatterOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSSearchPathDomainMask}
 */
@JvmInline
value class NSSearchPathDomainMask(val rawValue: Long) {
    companion object {
        val NSUserDomainMask = NSSearchPathDomainMask(1L)
        val NSLocalDomainMask = NSSearchPathDomainMask(2L)
        val NSNetworkDomainMask = NSSearchPathDomainMask(4L)
        val NSSystemDomainMask = NSSearchPathDomainMask(8L)
        val NSAllDomainsMask = NSSearchPathDomainMask(65535L)
    }

    operator fun plus(o: NSSearchPathDomainMask) = NSSearchPathDomainMask(rawValue or o.rawValue)
    operator fun contains(o: NSSearchPathDomainMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSURLBookmarkCreationOptions}
 */
@JvmInline
value class NSURLBookmarkCreationOptions(val rawValue: Long) {
    companion object {
        val NSURLBookmarkCreationPreferFileIDResolution = NSURLBookmarkCreationOptions(256L)
        val NSURLBookmarkCreationMinimalBookmark = NSURLBookmarkCreationOptions(512L)
        val NSURLBookmarkCreationSuitableForBookmarkFile = NSURLBookmarkCreationOptions(1024L)
        val NSURLBookmarkCreationWithSecurityScope = NSURLBookmarkCreationOptions(2048L)
        val NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess = NSURLBookmarkCreationOptions(4096L)
        val NSURLBookmarkCreationWithoutImplicitSecurityScope = NSURLBookmarkCreationOptions(536870912L)
    }

    operator fun plus(o: NSURLBookmarkCreationOptions) = NSURLBookmarkCreationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSURLBookmarkCreationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSURLBookmarkResolutionOptions}
 */
@JvmInline
value class NSURLBookmarkResolutionOptions(val rawValue: Long) {
    companion object {
        val NSURLBookmarkResolutionWithoutUI = NSURLBookmarkResolutionOptions(256L)
        val NSURLBookmarkResolutionWithoutMounting = NSURLBookmarkResolutionOptions(512L)
        val NSURLBookmarkResolutionWithSecurityScope = NSURLBookmarkResolutionOptions(1024L)
        val NSURLBookmarkResolutionWithoutImplicitStartAccessing = NSURLBookmarkResolutionOptions(32768L)
    }

    operator fun plus(o: NSURLBookmarkResolutionOptions) = NSURLBookmarkResolutionOptions(rawValue or o.rawValue)
    operator fun contains(o: NSURLBookmarkResolutionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSVolumeEnumerationOptions}
 */
@JvmInline
value class NSVolumeEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSVolumeEnumerationSkipHiddenVolumes = NSVolumeEnumerationOptions(2L)
        val NSVolumeEnumerationProduceFileReferenceURLs = NSVolumeEnumerationOptions(4L)
    }

    operator fun plus(o: NSVolumeEnumerationOptions) = NSVolumeEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSVolumeEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDirectoryEnumerationOptions}
 */
@JvmInline
value class NSDirectoryEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSDirectoryEnumerationSkipsSubdirectoryDescendants = NSDirectoryEnumerationOptions(1L)
        val NSDirectoryEnumerationSkipsPackageDescendants = NSDirectoryEnumerationOptions(2L)
        val NSDirectoryEnumerationSkipsHiddenFiles = NSDirectoryEnumerationOptions(4L)
        val NSDirectoryEnumerationIncludesDirectoriesPostOrder = NSDirectoryEnumerationOptions(8L)
        val NSDirectoryEnumerationProducesRelativePathURLs = NSDirectoryEnumerationOptions(16L)
    }

    operator fun plus(o: NSDirectoryEnumerationOptions) = NSDirectoryEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDirectoryEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileManagerItemReplacementOptions}
 */
@JvmInline
value class NSFileManagerItemReplacementOptions(val rawValue: Long) {
    companion object {
        val NSFileManagerItemReplacementUsingNewMetadataOnly = NSFileManagerItemReplacementOptions(1L)
        val NSFileManagerItemReplacementWithoutDeletingBackupItem = NSFileManagerItemReplacementOptions(2L)
    }

    operator fun plus(o: NSFileManagerItemReplacementOptions) = NSFileManagerItemReplacementOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileManagerItemReplacementOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileManagerUnmountOptions}
 */
@JvmInline
value class NSFileManagerUnmountOptions(val rawValue: Long) {
    companion object {
        val NSFileManagerUnmountAllPartitionsAndEjectDisk = NSFileManagerUnmountOptions(1L)
        val NSFileManagerUnmountWithoutUI = NSFileManagerUnmountOptions(2L)
    }

    operator fun plus(o: NSFileManagerUnmountOptions) = NSFileManagerUnmountOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileManagerUnmountOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileManagerSupportedSyncControls}
 */
@JvmInline
value class NSFileManagerSupportedSyncControls(val rawValue: Long) {
    companion object {
        val NSFileManagerSupportedSyncControlsPauseSync = NSFileManagerSupportedSyncControls(1L)
        val NSFileManagerSupportedSyncControlsFailUploadOnConflict = NSFileManagerSupportedSyncControls(2L)
    }

    operator fun plus(o: NSFileManagerSupportedSyncControls) = NSFileManagerSupportedSyncControls(rawValue or o.rawValue)
    operator fun contains(o: NSFileManagerSupportedSyncControls) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPointerFunctionsOptions}
 */
@JvmInline
value class NSPointerFunctionsOptions(val rawValue: Long) {
    companion object {
        val NSPointerFunctionsStrongMemory = NSPointerFunctionsOptions(0L)
        val NSPointerFunctionsZeroingWeakMemory = NSPointerFunctionsOptions(1L)
        val NSPointerFunctionsOpaqueMemory = NSPointerFunctionsOptions(2L)
        val NSPointerFunctionsMallocMemory = NSPointerFunctionsOptions(3L)
        val NSPointerFunctionsMachVirtualMemory = NSPointerFunctionsOptions(4L)
        val NSPointerFunctionsWeakMemory = NSPointerFunctionsOptions(5L)
        val NSPointerFunctionsObjectPersonality = NSPointerFunctionsOptions(0L)
        val NSPointerFunctionsOpaquePersonality = NSPointerFunctionsOptions(256L)
        val NSPointerFunctionsObjectPointerPersonality = NSPointerFunctionsOptions(512L)
        val NSPointerFunctionsCStringPersonality = NSPointerFunctionsOptions(768L)
        val NSPointerFunctionsStructPersonality = NSPointerFunctionsOptions(1024L)
        val NSPointerFunctionsIntegerPersonality = NSPointerFunctionsOptions(1280L)
        val NSPointerFunctionsCopyIn = NSPointerFunctionsOptions(65536L)
    }

    operator fun plus(o: NSPointerFunctionsOptions) = NSPointerFunctionsOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPointerFunctionsOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSJSONReadingOptions}
 */
@JvmInline
value class NSJSONReadingOptions(val rawValue: Long) {
    companion object {
        val NSJSONReadingMutableContainers = NSJSONReadingOptions(1L)
        val NSJSONReadingMutableLeaves = NSJSONReadingOptions(2L)
        val NSJSONReadingFragmentsAllowed = NSJSONReadingOptions(4L)
        val NSJSONReadingJSON5Allowed = NSJSONReadingOptions(8L)
        val NSJSONReadingTopLevelDictionaryAssumed = NSJSONReadingOptions(16L)
        val NSJSONReadingAllowFragments = NSJSONReadingOptions(4L)
    }

    operator fun plus(o: NSJSONReadingOptions) = NSJSONReadingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSJSONReadingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSJSONWritingOptions}
 */
@JvmInline
value class NSJSONWritingOptions(val rawValue: Long) {
    companion object {
        val NSJSONWritingPrettyPrinted = NSJSONWritingOptions(1L)
        val NSJSONWritingSortedKeys = NSJSONWritingOptions(2L)
        val NSJSONWritingFragmentsAllowed = NSJSONWritingOptions(4L)
        val NSJSONWritingWithoutEscapingSlashes = NSJSONWritingOptions(8L)
    }

    operator fun plus(o: NSJSONWritingOptions) = NSJSONWritingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSJSONWritingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSKeyValueObservingOptions}
 */
@JvmInline
value class NSKeyValueObservingOptions(val rawValue: Long) {
    companion object {
        val NSKeyValueObservingOptionNew = NSKeyValueObservingOptions(1L)
        val NSKeyValueObservingOptionOld = NSKeyValueObservingOptions(2L)
        val NSKeyValueObservingOptionInitial = NSKeyValueObservingOptions(4L)
        val NSKeyValueObservingOptionPrior = NSKeyValueObservingOptions(8L)
    }

    operator fun plus(o: NSKeyValueObservingOptions) = NSKeyValueObservingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSKeyValueObservingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPropertyListMutabilityOptions}
 */
@JvmInline
value class NSPropertyListMutabilityOptions(val rawValue: Long) {
    companion object {
        val NSPropertyListImmutable = NSPropertyListMutabilityOptions(0L)
        val NSPropertyListMutableContainers = NSPropertyListMutabilityOptions(1L)
        val NSPropertyListMutableContainersAndLeaves = NSPropertyListMutabilityOptions(2L)
    }

    operator fun plus(o: NSPropertyListMutabilityOptions) = NSPropertyListMutabilityOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPropertyListMutabilityOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSAlignmentOptions}
 */
@JvmInline
value class NSAlignmentOptions(val rawValue: Long) {
    companion object {
        val NSAlignMinXInward = NSAlignmentOptions(1L)
        val NSAlignMinYInward = NSAlignmentOptions(2L)
        val NSAlignMaxXInward = NSAlignmentOptions(4L)
        val NSAlignMaxYInward = NSAlignmentOptions(8L)
        val NSAlignWidthInward = NSAlignmentOptions(16L)
        val NSAlignHeightInward = NSAlignmentOptions(32L)
        val NSAlignMinXOutward = NSAlignmentOptions(256L)
        val NSAlignMinYOutward = NSAlignmentOptions(512L)
        val NSAlignMaxXOutward = NSAlignmentOptions(1024L)
        val NSAlignMaxYOutward = NSAlignmentOptions(2048L)
        val NSAlignWidthOutward = NSAlignmentOptions(4096L)
        val NSAlignHeightOutward = NSAlignmentOptions(8192L)
        val NSAlignMinXNearest = NSAlignmentOptions(65536L)
        val NSAlignMinYNearest = NSAlignmentOptions(131072L)
        val NSAlignMaxXNearest = NSAlignmentOptions(262144L)
        val NSAlignMaxYNearest = NSAlignmentOptions(524288L)
        val NSAlignWidthNearest = NSAlignmentOptions(1048576L)
        val NSAlignHeightNearest = NSAlignmentOptions(2097152L)
        val NSAlignRectFlipped = NSAlignmentOptions(Long.MIN_VALUE)
        val NSAlignAllEdgesInward = NSAlignmentOptions(15L)
        val NSAlignAllEdgesOutward = NSAlignmentOptions(3840L)
        val NSAlignAllEdgesNearest = NSAlignmentOptions(983040L)
    }

    operator fun plus(o: NSAlignmentOptions) = NSAlignmentOptions(rawValue or o.rawValue)
    operator fun contains(o: NSAlignmentOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSNotificationCoalescing}
 */
@JvmInline
value class NSNotificationCoalescing(val rawValue: Long) {
    companion object {
        val NSNotificationNoCoalescing = NSNotificationCoalescing(0L)
        val NSNotificationCoalescingOnName = NSNotificationCoalescing(1L)
        val NSNotificationCoalescingOnSender = NSNotificationCoalescing(2L)
    }

    operator fun plus(o: NSNotificationCoalescing) = NSNotificationCoalescing(rawValue or o.rawValue)
    operator fun contains(o: NSNotificationCoalescing) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSMachPortOptions}
 */
@JvmInline
value class NSMachPortOptions(val rawValue: Long) {
    companion object {
        val NSMachPortDeallocateNone = NSMachPortOptions(0L)
        val NSMachPortDeallocateSendRight = NSMachPortOptions(1L)
        val NSMachPortDeallocateReceiveRight = NSMachPortOptions(2L)
    }

    operator fun plus(o: NSMachPortOptions) = NSMachPortOptions(rawValue or o.rawValue)
    operator fun contains(o: NSMachPortOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSActivityOptions}
 */
@JvmInline
value class NSActivityOptions(val rawValue: Long) {
    companion object {
        val NSActivityIdleDisplaySleepDisabled = NSActivityOptions(1099511627776L)
        val NSActivityIdleSystemSleepDisabled = NSActivityOptions(1048576L)
        val NSActivitySuddenTerminationDisabled = NSActivityOptions(16384L)
        val NSActivityAutomaticTerminationDisabled = NSActivityOptions(32768L)
        val NSActivityAnimationTrackingEnabled = NSActivityOptions(35184372088832L)
        val NSActivityTrackingEnabled = NSActivityOptions(70368744177664L)
        val NSActivityUserInitiated = NSActivityOptions(16777215L)
        val NSActivityUserInitiatedAllowingIdleSystemSleep = NSActivityOptions(15728639L)
        val NSActivityBackground = NSActivityOptions(255L)
        val NSActivityLatencyCritical = NSActivityOptions(1095216660480L)
        val NSActivityUserInteractive = NSActivityOptions(1095233437695L)
    }

    operator fun plus(o: NSActivityOptions) = NSActivityOptions(rawValue or o.rawValue)
    operator fun contains(o: NSActivityOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextCheckingType}
 */
@JvmInline
value class NSTextCheckingType(val rawValue: Long) {
    companion object {
        val NSTextCheckingTypeOrthography = NSTextCheckingType(1L)
        val NSTextCheckingTypeSpelling = NSTextCheckingType(2L)
        val NSTextCheckingTypeGrammar = NSTextCheckingType(4L)
        val NSTextCheckingTypeDate = NSTextCheckingType(8L)
        val NSTextCheckingTypeAddress = NSTextCheckingType(16L)
        val NSTextCheckingTypeLink = NSTextCheckingType(32L)
        val NSTextCheckingTypeQuote = NSTextCheckingType(64L)
        val NSTextCheckingTypeDash = NSTextCheckingType(128L)
        val NSTextCheckingTypeReplacement = NSTextCheckingType(256L)
        val NSTextCheckingTypeCorrection = NSTextCheckingType(512L)
        val NSTextCheckingTypeRegularExpression = NSTextCheckingType(1024L)
        val NSTextCheckingTypePhoneNumber = NSTextCheckingType(2048L)
        val NSTextCheckingTypeTransitInformation = NSTextCheckingType(4096L)
    }

    operator fun plus(o: NSTextCheckingType) = NSTextCheckingType(rawValue or o.rawValue)
    operator fun contains(o: NSTextCheckingType) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSRegularExpressionOptions}
 */
@JvmInline
value class NSRegularExpressionOptions(val rawValue: Long) {
    companion object {
        val NSRegularExpressionCaseInsensitive = NSRegularExpressionOptions(1L)
        val NSRegularExpressionAllowCommentsAndWhitespace = NSRegularExpressionOptions(2L)
        val NSRegularExpressionIgnoreMetacharacters = NSRegularExpressionOptions(4L)
        val NSRegularExpressionDotMatchesLineSeparators = NSRegularExpressionOptions(8L)
        val NSRegularExpressionAnchorsMatchLines = NSRegularExpressionOptions(16L)
        val NSRegularExpressionUseUnixLineSeparators = NSRegularExpressionOptions(32L)
        val NSRegularExpressionUseUnicodeWordBoundaries = NSRegularExpressionOptions(64L)
    }

    operator fun plus(o: NSRegularExpressionOptions) = NSRegularExpressionOptions(rawValue or o.rawValue)
    operator fun contains(o: NSRegularExpressionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSMatchingOptions}
 */
@JvmInline
value class NSMatchingOptions(val rawValue: Long) {
    companion object {
        val NSMatchingReportProgress = NSMatchingOptions(1L)
        val NSMatchingReportCompletion = NSMatchingOptions(2L)
        val NSMatchingAnchored = NSMatchingOptions(4L)
        val NSMatchingWithTransparentBounds = NSMatchingOptions(8L)
        val NSMatchingWithoutAnchoringBounds = NSMatchingOptions(16L)
    }

    operator fun plus(o: NSMatchingOptions) = NSMatchingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSMatchingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSMatchingFlags}
 */
@JvmInline
value class NSMatchingFlags(val rawValue: Long) {
    companion object {
        val NSMatchingProgress = NSMatchingFlags(1L)
        val NSMatchingCompleted = NSMatchingFlags(2L)
        val NSMatchingHitEnd = NSMatchingFlags(4L)
        val NSMatchingRequiredEnd = NSMatchingFlags(8L)
        val NSMatchingInternalError = NSMatchingFlags(16L)
    }

    operator fun plus(o: NSMatchingFlags) = NSMatchingFlags(rawValue or o.rawValue)
    operator fun contains(o: NSMatchingFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSStreamEvent}
 */
@JvmInline
value class NSStreamEvent(val rawValue: Long) {
    companion object {
        val NSStreamEventNone = NSStreamEvent(0L)
        val NSStreamEventOpenCompleted = NSStreamEvent(1L)
        val NSStreamEventHasBytesAvailable = NSStreamEvent(2L)
        val NSStreamEventHasSpaceAvailable = NSStreamEvent(4L)
        val NSStreamEventErrorOccurred = NSStreamEvent(8L)
        val NSStreamEventEndEncountered = NSStreamEvent(16L)
    }

    operator fun plus(o: NSStreamEvent) = NSStreamEvent(rawValue or o.rawValue)
    operator fun contains(o: NSStreamEvent) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecKeyUsage}
 */
@JvmInline
value class SecKeyUsage(val rawValue: Long) {
    companion object {
        val kSecKeyUsageUnspecified = SecKeyUsage(0L)
        val kSecKeyUsageDigitalSignature = SecKeyUsage(1L)
        val kSecKeyUsageNonRepudiation = SecKeyUsage(2L)
        val kSecKeyUsageContentCommitment = SecKeyUsage(2L)
        val kSecKeyUsageKeyEncipherment = SecKeyUsage(4L)
        val kSecKeyUsageDataEncipherment = SecKeyUsage(8L)
        val kSecKeyUsageKeyAgreement = SecKeyUsage(16L)
        val kSecKeyUsageKeyCertSign = SecKeyUsage(32L)
        val kSecKeyUsageCRLSign = SecKeyUsage(64L)
        val kSecKeyUsageEncipherOnly = SecKeyUsage(128L)
        val kSecKeyUsageDecipherOnly = SecKeyUsage(256L)
        val kSecKeyUsageCritical = SecKeyUsage(-2147483648L)
        val kSecKeyUsageAll = SecKeyUsage(2147483647L)
    }

    operator fun plus(o: SecKeyUsage) = SecKeyUsage(rawValue or o.rawValue)
    operator fun contains(o: SecKeyUsage) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecAccessControlCreateFlags}
 */
@JvmInline
value class SecAccessControlCreateFlags(val rawValue: Long) {
    companion object {
        val kSecAccessControlUserPresence = SecAccessControlCreateFlags(1L)
        val kSecAccessControlBiometryAny = SecAccessControlCreateFlags(2L)
        val kSecAccessControlTouchIDAny = SecAccessControlCreateFlags(2L)
        val kSecAccessControlBiometryCurrentSet = SecAccessControlCreateFlags(8L)
        val kSecAccessControlTouchIDCurrentSet = SecAccessControlCreateFlags(8L)
        val kSecAccessControlDevicePasscode = SecAccessControlCreateFlags(16L)
        val kSecAccessControlWatch = SecAccessControlCreateFlags(32L)
        val kSecAccessControlCompanion = SecAccessControlCreateFlags(32L)
        val kSecAccessControlOr = SecAccessControlCreateFlags(16384L)
        val kSecAccessControlAnd = SecAccessControlCreateFlags(32768L)
        val kSecAccessControlPrivateKeyUsage = SecAccessControlCreateFlags(1073741824L)
        val kSecAccessControlApplicationPassword = SecAccessControlCreateFlags(2147483648L)
    }

    operator fun plus(o: SecAccessControlCreateFlags) = SecAccessControlCreateFlags(rawValue or o.rawValue)
    operator fun contains(o: SecAccessControlCreateFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecPadding}
 */
@JvmInline
value class SecPadding(val rawValue: Long) {
    companion object {
        val kSecPaddingNone = SecPadding(0L)
        val kSecPaddingPKCS1 = SecPadding(1L)
        val kSecPaddingOAEP = SecPadding(2L)
        val kSecPaddingSigRaw = SecPadding(16384L)
        val kSecPaddingPKCS1MD2 = SecPadding(32768L)
        val kSecPaddingPKCS1MD5 = SecPadding(32769L)
        val kSecPaddingPKCS1SHA1 = SecPadding(32770L)
        val kSecPaddingPKCS1SHA224 = SecPadding(32771L)
        val kSecPaddingPKCS1SHA256 = SecPadding(32772L)
        val kSecPaddingPKCS1SHA384 = SecPadding(32773L)
        val kSecPaddingPKCS1SHA512 = SecPadding(32774L)
    }

    operator fun plus(o: SecPadding) = SecPadding(rawValue or o.rawValue)
    operator fun contains(o: SecPadding) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecKeychainEventMask}
 */
@JvmInline
value class SecKeychainEventMask(val rawValue: Long) {
    companion object {
        val kSecLockEventMask = SecKeychainEventMask(2L)
        val kSecUnlockEventMask = SecKeychainEventMask(4L)
        val kSecAddEventMask = SecKeychainEventMask(8L)
        val kSecDeleteEventMask = SecKeychainEventMask(16L)
        val kSecUpdateEventMask = SecKeychainEventMask(32L)
        val kSecPasswordChangedEventMask = SecKeychainEventMask(64L)
        val kSecDefaultChangedEventMask = SecKeychainEventMask(512L)
        val kSecDataAccessEventMask = SecKeychainEventMask(1024L)
        val kSecKeychainListChangedMask = SecKeychainEventMask(2048L)
        val kSecTrustSettingsChangedEventMask = SecKeychainEventMask(4096L)
        val kSecEveryEventMask = SecKeychainEventMask(-1L)
    }

    operator fun plus(o: SecKeychainEventMask) = SecKeychainEventMask(rawValue or o.rawValue)
    operator fun contains(o: SecKeychainEventMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecItemImportExportFlags}
 */
@JvmInline
value class SecItemImportExportFlags(val rawValue: Long) {
    companion object {
        val kSecItemPemArmour = SecItemImportExportFlags(1L)
    }

    operator fun plus(o: SecItemImportExportFlags) = SecItemImportExportFlags(rawValue or o.rawValue)
    operator fun contains(o: SecItemImportExportFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecKeyImportExportFlags}
 */
@JvmInline
value class SecKeyImportExportFlags(val rawValue: Long) {
    companion object {
        val kSecKeyImportOnlyOne = SecKeyImportExportFlags(1L)
        val kSecKeySecurePassphrase = SecKeyImportExportFlags(2L)
        val kSecKeyNoAccessControl = SecKeyImportExportFlags(4L)
    }

    operator fun plus(o: SecKeyImportExportFlags) = SecKeyImportExportFlags(rawValue or o.rawValue)
    operator fun contains(o: SecKeyImportExportFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecTrustOptionFlags}
 */
@JvmInline
value class SecTrustOptionFlags(val rawValue: Long) {
    companion object {
        val kSecTrustOptionAllowExpired = SecTrustOptionFlags(1L)
        val kSecTrustOptionLeafIsCA = SecTrustOptionFlags(2L)
        val kSecTrustOptionFetchIssuerFromNet = SecTrustOptionFlags(4L)
        val kSecTrustOptionAllowExpiredRoot = SecTrustOptionFlags(8L)
        val kSecTrustOptionRequireRevPerCert = SecTrustOptionFlags(16L)
        val kSecTrustOptionUseTrustSettings = SecTrustOptionFlags(32L)
        val kSecTrustOptionImplicitAnchors = SecTrustOptionFlags(64L)
    }

    operator fun plus(o: SecTrustOptionFlags) = SecTrustOptionFlags(rawValue or o.rawValue)
    operator fun contains(o: SecTrustOptionFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum AuthorizationFlags}
 */
@JvmInline
value class AuthorizationFlags(val rawValue: Long) {
    companion object {
        val kAuthorizationFlagDefaults = AuthorizationFlags(0L)
        val kAuthorizationFlagInteractionAllowed = AuthorizationFlags(1L)
        val kAuthorizationFlagExtendRights = AuthorizationFlags(2L)
        val kAuthorizationFlagPartialRights = AuthorizationFlags(4L)
        val kAuthorizationFlagDestroyRights = AuthorizationFlags(8L)
        val kAuthorizationFlagPreAuthorize = AuthorizationFlags(16L)
        val kAuthorizationFlagSkipInternalAuth = AuthorizationFlags(512L)
        val kAuthorizationFlagNoData = AuthorizationFlags(1048576L)
    }

    operator fun plus(o: AuthorizationFlags) = AuthorizationFlags(rawValue or o.rawValue)
    operator fun contains(o: AuthorizationFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SessionAttributeBits}
 */
@JvmInline
value class SessionAttributeBits(val rawValue: Long) {
    companion object {
        val sessionIsRoot = SessionAttributeBits(1L)
        val sessionHasGraphicAccess = SessionAttributeBits(16L)
        val sessionHasTTY = SessionAttributeBits(32L)
        val sessionIsRemote = SessionAttributeBits(4096L)
    }

    operator fun plus(o: SessionAttributeBits) = SessionAttributeBits(rawValue or o.rawValue)
    operator fun contains(o: SessionAttributeBits) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SessionCreationFlags}
 */
@JvmInline
value class SessionCreationFlags(val rawValue: Long) {
    companion object {
        val sessionKeepCurrentBootstrap = SessionCreationFlags(32768L)
    }

    operator fun plus(o: SessionCreationFlags) = SessionCreationFlags(rawValue or o.rawValue)
    operator fun contains(o: SessionCreationFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecKeychainPromptSelector}
 */
@JvmInline
value class SecKeychainPromptSelector(val rawValue: Long) {
    companion object {
        val kSecKeychainPromptRequirePassphase = SecKeychainPromptSelector(1L)
        val kSecKeychainPromptUnsigned = SecKeychainPromptSelector(16L)
        val kSecKeychainPromptUnsignedAct = SecKeychainPromptSelector(32L)
        val kSecKeychainPromptInvalid = SecKeychainPromptSelector(64L)
        val kSecKeychainPromptInvalidAct = SecKeychainPromptSelector(128L)
    }

    operator fun plus(o: SecKeychainPromptSelector) = SecKeychainPromptSelector(rawValue or o.rawValue)
    operator fun contains(o: SecKeychainPromptSelector) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecTrustSettingsKeyUsage}
 */
@JvmInline
value class SecTrustSettingsKeyUsage(val rawValue: Long) {
    companion object {
        val kSecTrustSettingsKeyUseSignature = SecTrustSettingsKeyUsage(1L)
        val kSecTrustSettingsKeyUseEnDecryptData = SecTrustSettingsKeyUsage(2L)
        val kSecTrustSettingsKeyUseEnDecryptKey = SecTrustSettingsKeyUsage(4L)
        val kSecTrustSettingsKeyUseSignCert = SecTrustSettingsKeyUsage(8L)
        val kSecTrustSettingsKeyUseSignRevocation = SecTrustSettingsKeyUsage(16L)
        val kSecTrustSettingsKeyUseKeyExchange = SecTrustSettingsKeyUsage(32L)
        val kSecTrustSettingsKeyUseAny = SecTrustSettingsKeyUsage(-1L)
    }

    operator fun plus(o: SecTrustSettingsKeyUsage) = SecTrustSettingsKeyUsage(rawValue or o.rawValue)
    operator fun contains(o: SecTrustSettingsKeyUsage) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecCSFlags}
 */
@JvmInline
value class SecCSFlags(val rawValue: Long) {
    companion object {
        val kSecCSDefaultFlags = SecCSFlags(0L)
        val kSecCSConsiderExpiration = SecCSFlags(-2147483648L)
        val kSecCSEnforceRevocationChecks = SecCSFlags(1073741824L)
        val kSecCSNoNetworkAccess = SecCSFlags(536870912L)
        val kSecCSReportProgress = SecCSFlags(268435456L)
        val kSecCSCheckTrustedAnchors = SecCSFlags(134217728L)
        val kSecCSQuickCheck = SecCSFlags(67108864L)
        val kSecCSApplyEmbeddedPolicy = SecCSFlags(33554432L)
        val kSecCSStripDisallowedXattrs = SecCSFlags(16777216L)
        val kSecCSMatchGuestRequirementInKernel = SecCSFlags(8388608L)
    }

    operator fun plus(o: SecCSFlags) = SecCSFlags(rawValue or o.rawValue)
    operator fun contains(o: SecCSFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecCodeSignatureFlags}
 */
@JvmInline
value class SecCodeSignatureFlags(val rawValue: Long) {
    companion object {
        val kSecCodeSignatureHost = SecCodeSignatureFlags(1L)
        val kSecCodeSignatureAdhoc = SecCodeSignatureFlags(2L)
        val kSecCodeSignatureForceHard = SecCodeSignatureFlags(256L)
        val kSecCodeSignatureForceKill = SecCodeSignatureFlags(512L)
        val kSecCodeSignatureForceExpiration = SecCodeSignatureFlags(1024L)
        val kSecCodeSignatureRestrict = SecCodeSignatureFlags(2048L)
        val kSecCodeSignatureEnforcement = SecCodeSignatureFlags(4096L)
        val kSecCodeSignatureLibraryValidation = SecCodeSignatureFlags(8192L)
        val kSecCodeSignatureRuntime = SecCodeSignatureFlags(65536L)
        val kSecCodeSignatureLinkerSigned = SecCodeSignatureFlags(131072L)
    }

    operator fun plus(o: SecCodeSignatureFlags) = SecCodeSignatureFlags(rawValue or o.rawValue)
    operator fun contains(o: SecCodeSignatureFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum SecCodeStatus}
 */
@JvmInline
value class SecCodeStatus(val rawValue: Long) {
    companion object {
        val kSecCodeStatusValid = SecCodeStatus(1L)
        val kSecCodeStatusHard = SecCodeStatus(256L)
        val kSecCodeStatusKill = SecCodeStatus(512L)
        val kSecCodeStatusDebugged = SecCodeStatus(268435456L)
        val kSecCodeStatusPlatform = SecCodeStatus(67108864L)
    }

    operator fun plus(o: SecCodeStatus) = SecCodeStatus(rawValue or o.rawValue)
    operator fun contains(o: SecCodeStatus) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum xpc_session_create_flags_t}
 */
@JvmInline
value class xpc_session_create_flags_t(val rawValue: Long) {
    companion object {
        val XPC_SESSION_CREATE_NONE = xpc_session_create_flags_t(0L)
        val XPC_SESSION_CREATE_INACTIVE = xpc_session_create_flags_t(1L)
        val XPC_SESSION_CREATE_MACH_PRIVILEGED = xpc_session_create_flags_t(2L)
    }

    operator fun plus(o: xpc_session_create_flags_t) = xpc_session_create_flags_t(rawValue or o.rawValue)
    operator fun contains(o: xpc_session_create_flags_t) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum xpc_listener_create_flags_t}
 */
@JvmInline
value class xpc_listener_create_flags_t(val rawValue: Long) {
    companion object {
        val XPC_LISTENER_CREATE_NONE = xpc_listener_create_flags_t(0L)
        val XPC_LISTENER_CREATE_INACTIVE = xpc_listener_create_flags_t(1L)
        val XPC_LISTENER_CREATE_FORCE_MACH = xpc_listener_create_flags_t(2L)
        val XPC_LISTENER_CREATE_FORCE_XPCSERVICE = xpc_listener_create_flags_t(4L)
    }

    operator fun plus(o: xpc_listener_create_flags_t) = xpc_listener_create_flags_t(rawValue or o.rawValue)
    operator fun contains(o: xpc_listener_create_flags_t) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum mach_vm_range_flags_t}
 */
@JvmInline
value class mach_vm_range_flags_t(val rawValue: Long) {
    companion object {
        val MACH_VM_RANGE_NONE = mach_vm_range_flags_t(0L)
    }

    operator fun plus(o: mach_vm_range_flags_t) = mach_vm_range_flags_t(rawValue or o.rawValue)
    operator fun contains(o: mach_vm_range_flags_t) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CMSSignedAttributes}
 */
@JvmInline
value class CMSSignedAttributes(val rawValue: Long) {
    companion object {
        val kCMSAttrNone = CMSSignedAttributes(0L)
        val kCMSAttrSmimeCapabilities = CMSSignedAttributes(1L)
        val kCMSAttrSmimeEncryptionKeyPrefs = CMSSignedAttributes(2L)
        val kCMSAttrSmimeMSEncryptionKeyPrefs = CMSSignedAttributes(4L)
        val kCMSAttrSigningTime = CMSSignedAttributes(8L)
        val kCMSAttrAppleCodesigningHashAgility = CMSSignedAttributes(16L)
        val kCMSAttrAppleCodesigningHashAgilityV2 = CMSSignedAttributes(32L)
        val kCMSAttrAppleExpirationTime = CMSSignedAttributes(64L)
    }

    operator fun plus(o: CMSSignedAttributes) = CMSSignedAttributes(rawValue or o.rawValue)
    operator fun contains(o: CMSSignedAttributes) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFNetServiceRegisterFlags}
 */
@JvmInline
value class CFNetServiceRegisterFlags(val rawValue: Long) {
    companion object {
        val kCFNetServiceFlagNoAutoRename = CFNetServiceRegisterFlags(1L)
    }

    operator fun plus(o: CFNetServiceRegisterFlags) = CFNetServiceRegisterFlags(rawValue or o.rawValue)
    operator fun contains(o: CFNetServiceRegisterFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CFNetServiceBrowserFlags}
 */
@JvmInline
value class CFNetServiceBrowserFlags(val rawValue: Long) {
    companion object {
        val kCFNetServiceFlagMoreComing = CFNetServiceBrowserFlags(1L)
        val kCFNetServiceFlagIsDomain = CFNetServiceBrowserFlags(2L)
        val kCFNetServiceFlagIsDefault = CFNetServiceBrowserFlags(4L)
        val kCFNetServiceFlagIsRegistrationDomain = CFNetServiceBrowserFlags(4L)
        val kCFNetServiceFlagRemove = CFNetServiceBrowserFlags(8L)
    }

    operator fun plus(o: CFNetServiceBrowserFlags) = CFNetServiceBrowserFlags(rawValue or o.rawValue)
    operator fun contains(o: CFNetServiceBrowserFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum LSRolesMask}
 */
@JvmInline
value class LSRolesMask(val rawValue: Long) {
    companion object {
        val kLSRolesNone = LSRolesMask(1L)
        val kLSRolesViewer = LSRolesMask(2L)
        val kLSRolesEditor = LSRolesMask(4L)
        val kLSRolesShell = LSRolesMask(8L)
        val kLSRolesAll = LSRolesMask(-1L)
    }

    operator fun plus(o: LSRolesMask) = LSRolesMask(rawValue or o.rawValue)
    operator fun contains(o: LSRolesMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum LSAcceptanceFlags}
 */
@JvmInline
value class LSAcceptanceFlags(val rawValue: Long) {
    companion object {
        val kLSAcceptDefault = LSAcceptanceFlags(1L)
        val kLSAcceptAllowLoginUI = LSAcceptanceFlags(2L)
    }

    operator fun plus(o: LSAcceptanceFlags) = LSAcceptanceFlags(rawValue or o.rawValue)
    operator fun contains(o: LSAcceptanceFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum LSRequestedInfo}
 */
@JvmInline
value class LSRequestedInfo(val rawValue: Long) {
    companion object {
        val kLSRequestExtension = LSRequestedInfo(1L)
        val kLSRequestTypeCreator = LSRequestedInfo(2L)
        val kLSRequestBasicFlagsOnly = LSRequestedInfo(4L)
        val kLSRequestAppTypeFlags = LSRequestedInfo(8L)
        val kLSRequestAllFlags = LSRequestedInfo(16L)
        val kLSRequestIconAndKind = LSRequestedInfo(32L)
        val kLSRequestExtensionFlagsOnly = LSRequestedInfo(64L)
        val kLSRequestAllInfo = LSRequestedInfo(-1L)
    }

    operator fun plus(o: LSRequestedInfo) = LSRequestedInfo(rawValue or o.rawValue)
    operator fun contains(o: LSRequestedInfo) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum LSItemInfoFlags}
 */
@JvmInline
value class LSItemInfoFlags(val rawValue: Long) {
    companion object {
        val kLSItemInfoIsPlainFile = LSItemInfoFlags(1L)
        val kLSItemInfoIsPackage = LSItemInfoFlags(2L)
        val kLSItemInfoIsApplication = LSItemInfoFlags(4L)
        val kLSItemInfoIsContainer = LSItemInfoFlags(8L)
        val kLSItemInfoIsAliasFile = LSItemInfoFlags(16L)
        val kLSItemInfoIsSymlink = LSItemInfoFlags(32L)
        val kLSItemInfoIsInvisible = LSItemInfoFlags(64L)
        val kLSItemInfoIsNativeApp = LSItemInfoFlags(128L)
        val kLSItemInfoIsClassicApp = LSItemInfoFlags(256L)
        val kLSItemInfoAppPrefersNative = LSItemInfoFlags(512L)
        val kLSItemInfoAppPrefersClassic = LSItemInfoFlags(1024L)
        val kLSItemInfoAppIsScriptable = LSItemInfoFlags(2048L)
        val kLSItemInfoIsVolume = LSItemInfoFlags(4096L)
        val kLSItemInfoExtensionIsHidden = LSItemInfoFlags(1048576L)
    }

    operator fun plus(o: LSItemInfoFlags) = LSItemInfoFlags(rawValue or o.rawValue)
    operator fun contains(o: LSItemInfoFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum LSHandlerOptions}
 */
@JvmInline
value class LSHandlerOptions(val rawValue: Long) {
    companion object {
        val kLSHandlerOptionsDefault = LSHandlerOptions(0L)
        val kLSHandlerOptionsIgnoreCreator = LSHandlerOptions(1L)
    }

    operator fun plus(o: LSHandlerOptions) = LSHandlerOptions(rawValue or o.rawValue)
    operator fun contains(o: LSHandlerOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum LSLaunchFlags}
 */
@JvmInline
value class LSLaunchFlags(val rawValue: Long) {
    companion object {
        val kLSLaunchDefaults = LSLaunchFlags(1L)
        val kLSLaunchAndPrint = LSLaunchFlags(2L)
        val kLSLaunchAndDisplayErrors = LSLaunchFlags(64L)
        val kLSLaunchDontAddToRecents = LSLaunchFlags(256L)
        val kLSLaunchDontSwitch = LSLaunchFlags(512L)
        val kLSLaunchAsync = LSLaunchFlags(65536L)
        val kLSLaunchNewInstance = LSLaunchFlags(524288L)
        val kLSLaunchAndHide = LSLaunchFlags(1048576L)
        val kLSLaunchAndHideOthers = LSLaunchFlags(2097152L)
    }

    operator fun plus(o: LSLaunchFlags) = LSLaunchFlags(rawValue or o.rawValue)
    operator fun contains(o: LSLaunchFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSXPCConnectionOptions}
 */
@JvmInline
value class NSXPCConnectionOptions(val rawValue: Long) {
    companion object {
        val NSXPCConnectionPrivileged = NSXPCConnectionOptions(4096L)
    }

    operator fun plus(o: NSXPCConnectionOptions) = NSXPCConnectionOptions(rawValue or o.rawValue)
    operator fun contains(o: NSXPCConnectionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSByteCountFormatterUnits}
 */
@JvmInline
value class NSByteCountFormatterUnits(val rawValue: Long) {
    companion object {
        val NSByteCountFormatterUseDefault = NSByteCountFormatterUnits(0L)
        val NSByteCountFormatterUseBytes = NSByteCountFormatterUnits(1L)
        val NSByteCountFormatterUseKB = NSByteCountFormatterUnits(2L)
        val NSByteCountFormatterUseMB = NSByteCountFormatterUnits(4L)
        val NSByteCountFormatterUseGB = NSByteCountFormatterUnits(8L)
        val NSByteCountFormatterUseTB = NSByteCountFormatterUnits(16L)
        val NSByteCountFormatterUsePB = NSByteCountFormatterUnits(32L)
        val NSByteCountFormatterUseEB = NSByteCountFormatterUnits(64L)
        val NSByteCountFormatterUseZB = NSByteCountFormatterUnits(128L)
        val NSByteCountFormatterUseYBOrHigher = NSByteCountFormatterUnits(65280L)
        val NSByteCountFormatterUseAll = NSByteCountFormatterUnits(65535L)
    }

    operator fun plus(o: NSByteCountFormatterUnits) = NSByteCountFormatterUnits(rawValue or o.rawValue)
    operator fun contains(o: NSByteCountFormatterUnits) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSComparisonPredicateOptions}
 */
@JvmInline
value class NSComparisonPredicateOptions(val rawValue: Long) {
    companion object {
        val NSCaseInsensitivePredicateOption = NSComparisonPredicateOptions(1L)
        val NSDiacriticInsensitivePredicateOption = NSComparisonPredicateOptions(2L)
        val NSNormalizedPredicateOption = NSComparisonPredicateOptions(4L)
    }

    operator fun plus(o: NSComparisonPredicateOptions) = NSComparisonPredicateOptions(rawValue or o.rawValue)
    operator fun contains(o: NSComparisonPredicateOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDateComponentsFormatterZeroFormattingBehavior}
 */
@JvmInline
value class NSDateComponentsFormatterZeroFormattingBehavior(val rawValue: Long) {
    companion object {
        val NSDateComponentsFormatterZeroFormattingBehaviorNone = NSDateComponentsFormatterZeroFormattingBehavior(0L)
        val NSDateComponentsFormatterZeroFormattingBehaviorDefault = NSDateComponentsFormatterZeroFormattingBehavior(1L)
        val NSDateComponentsFormatterZeroFormattingBehaviorDropLeading = NSDateComponentsFormatterZeroFormattingBehavior(2L)
        val NSDateComponentsFormatterZeroFormattingBehaviorDropMiddle = NSDateComponentsFormatterZeroFormattingBehavior(4L)
        val NSDateComponentsFormatterZeroFormattingBehaviorDropTrailing = NSDateComponentsFormatterZeroFormattingBehavior(8L)
        val NSDateComponentsFormatterZeroFormattingBehaviorDropAll = NSDateComponentsFormatterZeroFormattingBehavior(14L)
        val NSDateComponentsFormatterZeroFormattingBehaviorPad = NSDateComponentsFormatterZeroFormattingBehavior(65536L)
    }

    operator fun plus(o: NSDateComponentsFormatterZeroFormattingBehavior) = NSDateComponentsFormatterZeroFormattingBehavior(rawValue or o.rawValue)
    operator fun contains(o: NSDateComponentsFormatterZeroFormattingBehavior) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileCoordinatorReadingOptions}
 */
@JvmInline
value class NSFileCoordinatorReadingOptions(val rawValue: Long) {
    companion object {
        val NSFileCoordinatorReadingWithoutChanges = NSFileCoordinatorReadingOptions(1L)
        val NSFileCoordinatorReadingResolvesSymbolicLink = NSFileCoordinatorReadingOptions(2L)
        val NSFileCoordinatorReadingImmediatelyAvailableMetadataOnly = NSFileCoordinatorReadingOptions(4L)
        val NSFileCoordinatorReadingForUploading = NSFileCoordinatorReadingOptions(8L)
    }

    operator fun plus(o: NSFileCoordinatorReadingOptions) = NSFileCoordinatorReadingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileCoordinatorReadingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileCoordinatorWritingOptions}
 */
@JvmInline
value class NSFileCoordinatorWritingOptions(val rawValue: Long) {
    companion object {
        val NSFileCoordinatorWritingForDeleting = NSFileCoordinatorWritingOptions(1L)
        val NSFileCoordinatorWritingForMoving = NSFileCoordinatorWritingOptions(2L)
        val NSFileCoordinatorWritingForMerging = NSFileCoordinatorWritingOptions(4L)
        val NSFileCoordinatorWritingForReplacing = NSFileCoordinatorWritingOptions(8L)
        val NSFileCoordinatorWritingContentIndependentMetadataOnly = NSFileCoordinatorWritingOptions(16L)
    }

    operator fun plus(o: NSFileCoordinatorWritingOptions) = NSFileCoordinatorWritingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileCoordinatorWritingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileVersionAddingOptions}
 */
@JvmInline
value class NSFileVersionAddingOptions(val rawValue: Long) {
    companion object {
        val NSFileVersionAddingByMoving = NSFileVersionAddingOptions(1L)
    }

    operator fun plus(o: NSFileVersionAddingOptions) = NSFileVersionAddingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileVersionAddingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileVersionReplacingOptions}
 */
@JvmInline
value class NSFileVersionReplacingOptions(val rawValue: Long) {
    companion object {
        val NSFileVersionReplacingByMoving = NSFileVersionReplacingOptions(1L)
    }

    operator fun plus(o: NSFileVersionReplacingOptions) = NSFileVersionReplacingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileVersionReplacingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileWrapperReadingOptions}
 */
@JvmInline
value class NSFileWrapperReadingOptions(val rawValue: Long) {
    companion object {
        val NSFileWrapperReadingImmediate = NSFileWrapperReadingOptions(1L)
        val NSFileWrapperReadingWithoutMapping = NSFileWrapperReadingOptions(2L)
    }

    operator fun plus(o: NSFileWrapperReadingOptions) = NSFileWrapperReadingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileWrapperReadingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFileWrapperWritingOptions}
 */
@JvmInline
value class NSFileWrapperWritingOptions(val rawValue: Long) {
    companion object {
        val NSFileWrapperWritingAtomic = NSFileWrapperWritingOptions(1L)
        val NSFileWrapperWritingWithNameUpdating = NSFileWrapperWritingOptions(2L)
    }

    operator fun plus(o: NSFileWrapperWritingOptions) = NSFileWrapperWritingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFileWrapperWritingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSLinguisticTaggerOptions}
 */
@JvmInline
value class NSLinguisticTaggerOptions(val rawValue: Long) {
    companion object {
        val NSLinguisticTaggerOmitWords = NSLinguisticTaggerOptions(1L)
        val NSLinguisticTaggerOmitPunctuation = NSLinguisticTaggerOptions(2L)
        val NSLinguisticTaggerOmitWhitespace = NSLinguisticTaggerOptions(4L)
        val NSLinguisticTaggerOmitOther = NSLinguisticTaggerOptions(8L)
        val NSLinguisticTaggerJoinNames = NSLinguisticTaggerOptions(16L)
    }

    operator fun plus(o: NSLinguisticTaggerOptions) = NSLinguisticTaggerOptions(rawValue or o.rawValue)
    operator fun contains(o: NSLinguisticTaggerOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSNetServiceOptions}
 */
@JvmInline
value class NSNetServiceOptions(val rawValue: Long) {
    companion object {
        val NSNetServiceNoAutoRename = NSNetServiceOptions(1L)
        val NSNetServiceListenForConnections = NSNetServiceOptions(2L)
    }

    operator fun plus(o: NSNetServiceOptions) = NSNetServiceOptions(rawValue or o.rawValue)
    operator fun contains(o: NSNetServiceOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDistributedNotificationOptions}
 */
@JvmInline
value class NSDistributedNotificationOptions(val rawValue: Long) {
    companion object {
        val NSDistributedNotificationDeliverImmediately = NSDistributedNotificationOptions(1L)
        val NSDistributedNotificationPostToAllSessions = NSDistributedNotificationOptions(2L)
    }

    operator fun plus(o: NSDistributedNotificationOptions) = NSDistributedNotificationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDistributedNotificationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSXMLNodeOptions}
 */
@JvmInline
value class NSXMLNodeOptions(val rawValue: Long) {
    companion object {
        val NSXMLNodeOptionsNone = NSXMLNodeOptions(0L)
        val NSXMLNodeIsCDATA = NSXMLNodeOptions(1L)
        val NSXMLNodeExpandEmptyElement = NSXMLNodeOptions(2L)
        val NSXMLNodeCompactEmptyElement = NSXMLNodeOptions(4L)
        val NSXMLNodeUseSingleQuotes = NSXMLNodeOptions(8L)
        val NSXMLNodeUseDoubleQuotes = NSXMLNodeOptions(16L)
        val NSXMLNodeNeverEscapeContents = NSXMLNodeOptions(32L)
        val NSXMLDocumentTidyHTML = NSXMLNodeOptions(512L)
        val NSXMLDocumentTidyXML = NSXMLNodeOptions(1024L)
        val NSXMLDocumentValidate = NSXMLNodeOptions(8192L)
        val NSXMLNodeLoadExternalEntitiesAlways = NSXMLNodeOptions(16384L)
        val NSXMLNodeLoadExternalEntitiesSameOriginOnly = NSXMLNodeOptions(32768L)
        val NSXMLNodeLoadExternalEntitiesNever = NSXMLNodeOptions(524288L)
        val NSXMLDocumentXInclude = NSXMLNodeOptions(65536L)
        val NSXMLNodePrettyPrint = NSXMLNodeOptions(131072L)
        val NSXMLDocumentIncludeContentTypeDeclaration = NSXMLNodeOptions(262144L)
        val NSXMLNodePreserveNamespaceOrder = NSXMLNodeOptions(1048576L)
        val NSXMLNodePreserveAttributeOrder = NSXMLNodeOptions(2097152L)
        val NSXMLNodePreserveEntities = NSXMLNodeOptions(4194304L)
        val NSXMLNodePreservePrefixes = NSXMLNodeOptions(8388608L)
        val NSXMLNodePreserveCDATA = NSXMLNodeOptions(16777216L)
        val NSXMLNodePreserveWhitespace = NSXMLNodeOptions(33554432L)
        val NSXMLNodePreserveDTD = NSXMLNodeOptions(67108864L)
        val NSXMLNodePreserveCharacterReferences = NSXMLNodeOptions(134217728L)
        val NSXMLNodePromoteSignificantWhitespace = NSXMLNodeOptions(268435456L)
        val NSXMLNodePreserveEmptyElements = NSXMLNodeOptions(6L)
        val NSXMLNodePreserveQuotes = NSXMLNodeOptions(24L)
        val NSXMLNodePreserveAll = NSXMLNodeOptions(4293918750L)
    }

    operator fun plus(o: NSXMLNodeOptions) = NSXMLNodeOptions(rawValue or o.rawValue)
    operator fun contains(o: NSXMLNodeOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSAppleEventSendOptions}
 */
@JvmInline
value class NSAppleEventSendOptions(val rawValue: Long) {
    companion object {
        val NSAppleEventSendNoReply = NSAppleEventSendOptions(1L)
        val NSAppleEventSendQueueReply = NSAppleEventSendOptions(2L)
        val NSAppleEventSendWaitForReply = NSAppleEventSendOptions(3L)
        val NSAppleEventSendNeverInteract = NSAppleEventSendOptions(16L)
        val NSAppleEventSendCanInteract = NSAppleEventSendOptions(32L)
        val NSAppleEventSendAlwaysInteract = NSAppleEventSendOptions(48L)
        val NSAppleEventSendCanSwitchLayer = NSAppleEventSendOptions(64L)
        val NSAppleEventSendDontRecord = NSAppleEventSendOptions(4096L)
        val NSAppleEventSendDontExecute = NSAppleEventSendOptions(8192L)
        val NSAppleEventSendDontAnnotate = NSAppleEventSendOptions(65536L)
        val NSAppleEventSendDefaultOptions = NSAppleEventSendOptions(35L)
    }

    operator fun plus(o: NSAppleEventSendOptions) = NSAppleEventSendOptions(rawValue or o.rawValue)
    operator fun contains(o: NSAppleEventSendOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGGradientDrawingOptions}
 */
@JvmInline
value class CGGradientDrawingOptions(val rawValue: Long) {
    companion object {
        val kCGGradientDrawsBeforeStartLocation = CGGradientDrawingOptions(1L)
        val kCGGradientDrawsAfterEndLocation = CGGradientDrawingOptions(2L)
    }

    operator fun plus(o: CGGradientDrawingOptions) = CGGradientDrawingOptions(rawValue or o.rawValue)
    operator fun contains(o: CGGradientDrawingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGBitmapInfo}
 */
@JvmInline
value class CGBitmapInfo(val rawValue: Long) {
    companion object {
        val kCGBitmapAlphaInfoMask = CGBitmapInfo(31L)
        val kCGBitmapComponentInfoMask = CGBitmapInfo(3840L)
        val kCGBitmapByteOrderInfoMask = CGBitmapInfo(28672L)
        val kCGBitmapPixelFormatInfoMask = CGBitmapInfo(983040L)
        val kCGBitmapFloatInfoMask = CGBitmapInfo(3840L)
        val kCGBitmapByteOrderMask = CGBitmapInfo(28672L)
        val kCGBitmapFloatComponents = CGBitmapInfo(256L)
        val kCGBitmapByteOrderDefault = CGBitmapInfo(0L)
        val kCGBitmapByteOrder16Little = CGBitmapInfo(4096L)
        val kCGBitmapByteOrder32Little = CGBitmapInfo(8192L)
        val kCGBitmapByteOrder16Big = CGBitmapInfo(12288L)
        val kCGBitmapByteOrder32Big = CGBitmapInfo(16384L)
    }

    operator fun plus(o: CGBitmapInfo) = CGBitmapInfo(rawValue or o.rawValue)
    operator fun contains(o: CGBitmapInfo) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGPDFAccessPermissions}
 */
@JvmInline
value class CGPDFAccessPermissions(val rawValue: Long) {
    companion object {
        val kCGPDFAllowsLowQualityPrinting = CGPDFAccessPermissions(1L)
        val kCGPDFAllowsHighQualityPrinting = CGPDFAccessPermissions(2L)
        val kCGPDFAllowsDocumentChanges = CGPDFAccessPermissions(4L)
        val kCGPDFAllowsDocumentAssembly = CGPDFAccessPermissions(8L)
        val kCGPDFAllowsContentCopying = CGPDFAccessPermissions(16L)
        val kCGPDFAllowsContentAccessibility = CGPDFAccessPermissions(32L)
        val kCGPDFAllowsCommenting = CGPDFAccessPermissions(64L)
        val kCGPDFAllowsFormFieldEntry = CGPDFAccessPermissions(128L)
    }

    operator fun plus(o: CGPDFAccessPermissions) = CGPDFAccessPermissions(rawValue or o.rawValue)
    operator fun contains(o: CGPDFAccessPermissions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWorkspaceIconCreationOptions}
 */
@JvmInline
value class NSWorkspaceIconCreationOptions(val rawValue: Long) {
    companion object {
        val NSExcludeQuickDrawElementsIconCreationOption = NSWorkspaceIconCreationOptions(2L)
        val NSExclude10_4ElementsIconCreationOption = NSWorkspaceIconCreationOptions(4L)
    }

    operator fun plus(o: NSWorkspaceIconCreationOptions) = NSWorkspaceIconCreationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSWorkspaceIconCreationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWorkspaceLaunchOptions}
 */
@JvmInline
value class NSWorkspaceLaunchOptions(val rawValue: Long) {
    companion object {
        val NSWorkspaceLaunchAndPrint = NSWorkspaceLaunchOptions(2L)
        val NSWorkspaceLaunchWithErrorPresentation = NSWorkspaceLaunchOptions(64L)
        val NSWorkspaceLaunchInhibitingBackgroundOnly = NSWorkspaceLaunchOptions(128L)
        val NSWorkspaceLaunchWithoutAddingToRecents = NSWorkspaceLaunchOptions(256L)
        val NSWorkspaceLaunchWithoutActivation = NSWorkspaceLaunchOptions(512L)
        val NSWorkspaceLaunchAsync = NSWorkspaceLaunchOptions(65536L)
        val NSWorkspaceLaunchNewInstance = NSWorkspaceLaunchOptions(524288L)
        val NSWorkspaceLaunchAndHide = NSWorkspaceLaunchOptions(1048576L)
        val NSWorkspaceLaunchAndHideOthers = NSWorkspaceLaunchOptions(2097152L)
        val NSWorkspaceLaunchDefault = NSWorkspaceLaunchOptions(65536L)
        val NSWorkspaceLaunchAllowingClassicStartup = NSWorkspaceLaunchOptions(131072L)
        val NSWorkspaceLaunchPreferringClassic = NSWorkspaceLaunchOptions(262144L)
    }

    operator fun plus(o: NSWorkspaceLaunchOptions) = NSWorkspaceLaunchOptions(rawValue or o.rawValue)
    operator fun contains(o: NSWorkspaceLaunchOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTouchPhase}
 */
@JvmInline
value class NSTouchPhase(val rawValue: Long) {
    companion object {
        val NSTouchPhaseBegan = NSTouchPhase(1L)
        val NSTouchPhaseMoved = NSTouchPhase(2L)
        val NSTouchPhaseStationary = NSTouchPhase(4L)
        val NSTouchPhaseEnded = NSTouchPhase(8L)
        val NSTouchPhaseCancelled = NSTouchPhase(16L)
        val NSTouchPhaseTouching = NSTouchPhase(7L)
        val NSTouchPhaseAny = NSTouchPhase(-1L)
    }

    operator fun plus(o: NSTouchPhase) = NSTouchPhase(rawValue or o.rawValue)
    operator fun contains(o: NSTouchPhase) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTouchTypeMask}
 */
@JvmInline
value class NSTouchTypeMask(val rawValue: Long) {
    companion object {
        val NSTouchTypeMaskDirect = NSTouchTypeMask(1L)
        val NSTouchTypeMaskIndirect = NSTouchTypeMask(2L)
    }

    operator fun plus(o: NSTouchTypeMask) = NSTouchTypeMask(rawValue or o.rawValue)
    operator fun contains(o: NSTouchTypeMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGColorModel}
 */
@JvmInline
value class CGColorModel(val rawValue: Long) {
    companion object {
        val kCGColorModelNoColorant = CGColorModel(0L)
        val kCGColorModelGray = CGColorModel(1L)
        val kCGColorModelRGB = CGColorModel(2L)
        val kCGColorModelCMYK = CGColorModel(4L)
        val kCGColorModelLab = CGColorModel(8L)
        val kCGColorModelDeviceN = CGColorModel(16L)
    }

    operator fun plus(o: CGColorModel) = CGColorModel(rawValue or o.rawValue)
    operator fun contains(o: CGColorModel) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGWindowListOption}
 */
@JvmInline
value class CGWindowListOption(val rawValue: Long) {
    companion object {
        val kCGWindowListOptionAll = CGWindowListOption(0L)
        val kCGWindowListOptionOnScreenOnly = CGWindowListOption(1L)
        val kCGWindowListOptionOnScreenAboveWindow = CGWindowListOption(2L)
        val kCGWindowListOptionOnScreenBelowWindow = CGWindowListOption(4L)
        val kCGWindowListOptionIncludingWindow = CGWindowListOption(8L)
        val kCGWindowListExcludeDesktopElements = CGWindowListOption(16L)
    }

    operator fun plus(o: CGWindowListOption) = CGWindowListOption(rawValue or o.rawValue)
    operator fun contains(o: CGWindowListOption) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGWindowImageOption}
 */
@JvmInline
value class CGWindowImageOption(val rawValue: Long) {
    companion object {
        val kCGWindowImageDefault = CGWindowImageOption(0L)
        val kCGWindowImageBoundsIgnoreFraming = CGWindowImageOption(1L)
        val kCGWindowImageShouldBeOpaque = CGWindowImageOption(2L)
        val kCGWindowImageOnlyShadows = CGWindowImageOption(4L)
        val kCGWindowImageBestResolution = CGWindowImageOption(8L)
        val kCGWindowImageNominalResolution = CGWindowImageOption(16L)
    }

    operator fun plus(o: CGWindowImageOption) = CGWindowImageOption(rawValue or o.rawValue)
    operator fun contains(o: CGWindowImageOption) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGCaptureOptions}
 */
@JvmInline
value class CGCaptureOptions(val rawValue: Long) {
    companion object {
        val kCGCaptureNoOptions = CGCaptureOptions(0L)
        val kCGCaptureNoFill = CGCaptureOptions(1L)
    }

    operator fun plus(o: CGCaptureOptions) = CGCaptureOptions(rawValue or o.rawValue)
    operator fun contains(o: CGCaptureOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGConfigureOption}
 */
@JvmInline
value class CGConfigureOption(val rawValue: Long) {
    companion object {
        val kCGConfigureForAppOnly = CGConfigureOption(0L)
        val kCGConfigureForSession = CGConfigureOption(1L)
        val kCGConfigurePermanently = CGConfigureOption(2L)
    }

    operator fun plus(o: CGConfigureOption) = CGConfigureOption(rawValue or o.rawValue)
    operator fun contains(o: CGConfigureOption) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGDisplayChangeSummaryFlags}
 */
@JvmInline
value class CGDisplayChangeSummaryFlags(val rawValue: Long) {
    companion object {
        val kCGDisplayBeginConfigurationFlag = CGDisplayChangeSummaryFlags(1L)
        val kCGDisplayMovedFlag = CGDisplayChangeSummaryFlags(2L)
        val kCGDisplaySetMainFlag = CGDisplayChangeSummaryFlags(4L)
        val kCGDisplaySetModeFlag = CGDisplayChangeSummaryFlags(8L)
        val kCGDisplayAddFlag = CGDisplayChangeSummaryFlags(16L)
        val kCGDisplayRemoveFlag = CGDisplayChangeSummaryFlags(32L)
        val kCGDisplayEnabledFlag = CGDisplayChangeSummaryFlags(256L)
        val kCGDisplayDisabledFlag = CGDisplayChangeSummaryFlags(512L)
        val kCGDisplayMirrorFlag = CGDisplayChangeSummaryFlags(1024L)
        val kCGDisplayUnMirrorFlag = CGDisplayChangeSummaryFlags(2048L)
        val kCGDisplayDesktopShapeChangedFlag = CGDisplayChangeSummaryFlags(4096L)
    }

    operator fun plus(o: CGDisplayChangeSummaryFlags) = CGDisplayChangeSummaryFlags(rawValue or o.rawValue)
    operator fun contains(o: CGDisplayChangeSummaryFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGScreenUpdateOperation}
 */
@JvmInline
value class CGScreenUpdateOperation(val rawValue: Long) {
    companion object {
        val kCGScreenUpdateOperationRefresh = CGScreenUpdateOperation(0L)
        val kCGScreenUpdateOperationMove = CGScreenUpdateOperation(1L)
        val kCGScreenUpdateOperationReducedDirtyRectangleCount = CGScreenUpdateOperation(-2147483648L)
    }

    operator fun plus(o: CGScreenUpdateOperation) = CGScreenUpdateOperation(rawValue or o.rawValue)
    operator fun contains(o: CGScreenUpdateOperation) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGEventFilterMask}
 */
@JvmInline
value class CGEventFilterMask(val rawValue: Long) {
    companion object {
        val kCGEventFilterMaskPermitLocalMouseEvents = CGEventFilterMask(1L)
        val kCGEventFilterMaskPermitLocalKeyboardEvents = CGEventFilterMask(2L)
        val kCGEventFilterMaskPermitSystemDefinedEvents = CGEventFilterMask(4L)
    }

    operator fun plus(o: CGEventFilterMask) = CGEventFilterMask(rawValue or o.rawValue)
    operator fun contains(o: CGEventFilterMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CGEventFlags}
 */
@JvmInline
value class CGEventFlags(val rawValue: Long) {
    companion object {
        val kCGEventFlagMaskAlphaShift = CGEventFlags(65536L)
        val kCGEventFlagMaskShift = CGEventFlags(131072L)
        val kCGEventFlagMaskControl = CGEventFlags(262144L)
        val kCGEventFlagMaskAlternate = CGEventFlags(524288L)
        val kCGEventFlagMaskCommand = CGEventFlags(1048576L)
        val kCGEventFlagMaskHelp = CGEventFlags(4194304L)
        val kCGEventFlagMaskSecondaryFn = CGEventFlags(8388608L)
        val kCGEventFlagMaskNumericPad = CGEventFlags(2097152L)
        val kCGEventFlagMaskNonCoalesced = CGEventFlags(256L)
    }

    operator fun plus(o: CGEventFlags) = CGEventFlags(rawValue or o.rawValue)
    operator fun contains(o: CGEventFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTFontSymbolicTraits}
 */
@JvmInline
value class CTFontSymbolicTraits(val rawValue: Long) {
    companion object {
        val kCTFontTraitItalic = CTFontSymbolicTraits(1L)
        val kCTFontTraitBold = CTFontSymbolicTraits(2L)
        val kCTFontTraitExpanded = CTFontSymbolicTraits(32L)
        val kCTFontTraitCondensed = CTFontSymbolicTraits(64L)
        val kCTFontTraitMonoSpace = CTFontSymbolicTraits(1024L)
        val kCTFontTraitVertical = CTFontSymbolicTraits(2048L)
        val kCTFontTraitUIOptimized = CTFontSymbolicTraits(4096L)
        val kCTFontTraitColorGlyphs = CTFontSymbolicTraits(8192L)
        val kCTFontTraitComposite = CTFontSymbolicTraits(16384L)
        val kCTFontTraitClassMask = CTFontSymbolicTraits(-268435456L)
        val kCTFontItalicTrait = CTFontSymbolicTraits(1L)
        val kCTFontBoldTrait = CTFontSymbolicTraits(2L)
        val kCTFontExpandedTrait = CTFontSymbolicTraits(32L)
        val kCTFontCondensedTrait = CTFontSymbolicTraits(64L)
        val kCTFontMonoSpaceTrait = CTFontSymbolicTraits(1024L)
        val kCTFontVerticalTrait = CTFontSymbolicTraits(2048L)
        val kCTFontUIOptimizedTrait = CTFontSymbolicTraits(4096L)
        val kCTFontColorGlyphsTrait = CTFontSymbolicTraits(8192L)
        val kCTFontCompositeTrait = CTFontSymbolicTraits(16384L)
        val kCTFontClassMaskTrait = CTFontSymbolicTraits(-268435456L)
    }

    operator fun plus(o: CTFontSymbolicTraits) = CTFontSymbolicTraits(rawValue or o.rawValue)
    operator fun contains(o: CTFontSymbolicTraits) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTFontStylisticClass}
 */
@JvmInline
value class CTFontStylisticClass(val rawValue: Long) {
    companion object {
        val kCTFontClassUnknown = CTFontStylisticClass(0L)
        val kCTFontClassOldStyleSerifs = CTFontStylisticClass(268435456L)
        val kCTFontClassTransitionalSerifs = CTFontStylisticClass(536870912L)
        val kCTFontClassModernSerifs = CTFontStylisticClass(805306368L)
        val kCTFontClassClarendonSerifs = CTFontStylisticClass(1073741824L)
        val kCTFontClassSlabSerifs = CTFontStylisticClass(1342177280L)
        val kCTFontClassFreeformSerifs = CTFontStylisticClass(1879048192L)
        val kCTFontClassSansSerif = CTFontStylisticClass(-2147483648L)
        val kCTFontClassOrnamentals = CTFontStylisticClass(-1879048192L)
        val kCTFontClassScripts = CTFontStylisticClass(-1610612736L)
        val kCTFontClassSymbolic = CTFontStylisticClass(-1073741824L)
        val kCTFontUnknownClass = CTFontStylisticClass(0L)
        val kCTFontOldStyleSerifsClass = CTFontStylisticClass(268435456L)
        val kCTFontTransitionalSerifsClass = CTFontStylisticClass(536870912L)
        val kCTFontModernSerifsClass = CTFontStylisticClass(805306368L)
        val kCTFontClarendonSerifsClass = CTFontStylisticClass(1073741824L)
        val kCTFontSlabSerifsClass = CTFontStylisticClass(1342177280L)
        val kCTFontFreeformSerifsClass = CTFontStylisticClass(1879048192L)
        val kCTFontSansSerifClass = CTFontStylisticClass(-2147483648L)
        val kCTFontOrnamentalsClass = CTFontStylisticClass(-1879048192L)
        val kCTFontScriptsClass = CTFontStylisticClass(-1610612736L)
        val kCTFontSymbolicClass = CTFontStylisticClass(-1073741824L)
    }

    operator fun plus(o: CTFontStylisticClass) = CTFontStylisticClass(rawValue or o.rawValue)
    operator fun contains(o: CTFontStylisticClass) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTFontOptions}
 */
@JvmInline
value class CTFontOptions(val rawValue: Long) {
    companion object {
        val kCTFontOptionsDefault = CTFontOptions(0L)
        val kCTFontOptionsPreventAutoActivation = CTFontOptions(1L)
        val kCTFontOptionsPreventAutoDownload = CTFontOptions(2L)
        val kCTFontOptionsPreferSystemFont = CTFontOptions(4L)
    }

    operator fun plus(o: CTFontOptions) = CTFontOptions(rawValue or o.rawValue)
    operator fun contains(o: CTFontOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTFontTableOptions}
 */
@JvmInline
value class CTFontTableOptions(val rawValue: Long) {
    companion object {
        val kCTFontTableOptionNoOptions = CTFontTableOptions(0L)
        val kCTFontTableOptionExcludeSynthetic = CTFontTableOptions(1L)
    }

    operator fun plus(o: CTFontTableOptions) = CTFontTableOptions(rawValue or o.rawValue)
    operator fun contains(o: CTFontTableOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTFontCollectionCopyOptions}
 */
@JvmInline
value class CTFontCollectionCopyOptions(val rawValue: Long) {
    companion object {
        val kCTFontCollectionCopyDefaultOptions = CTFontCollectionCopyOptions(0L)
        val kCTFontCollectionCopyUnique = CTFontCollectionCopyOptions(1L)
        val kCTFontCollectionCopyStandardSort = CTFontCollectionCopyOptions(2L)
    }

    operator fun plus(o: CTFontCollectionCopyOptions) = CTFontCollectionCopyOptions(rawValue or o.rawValue)
    operator fun contains(o: CTFontCollectionCopyOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTLineBoundsOptions}
 */
@JvmInline
value class CTLineBoundsOptions(val rawValue: Long) {
    companion object {
        val kCTLineBoundsExcludeTypographicLeading = CTLineBoundsOptions(1L)
        val kCTLineBoundsExcludeTypographicShifts = CTLineBoundsOptions(2L)
        val kCTLineBoundsUseHangingPunctuation = CTLineBoundsOptions(4L)
        val kCTLineBoundsUseGlyphPathBounds = CTLineBoundsOptions(8L)
        val kCTLineBoundsUseOpticalBounds = CTLineBoundsOptions(16L)
        val kCTLineBoundsIncludeLanguageExtents = CTLineBoundsOptions(32L)
    }

    operator fun plus(o: CTLineBoundsOptions) = CTLineBoundsOptions(rawValue or o.rawValue)
    operator fun contains(o: CTLineBoundsOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTRunStatus}
 */
@JvmInline
value class CTRunStatus(val rawValue: Long) {
    companion object {
        val kCTRunStatusNoStatus = CTRunStatus(0L)
        val kCTRunStatusRightToLeft = CTRunStatus(1L)
        val kCTRunStatusNonMonotonic = CTRunStatus(2L)
        val kCTRunStatusHasNonIdentityMatrix = CTRunStatus(4L)
    }

    operator fun plus(o: CTRunStatus) = CTRunStatus(rawValue or o.rawValue)
    operator fun contains(o: CTRunStatus) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTUnderlineStyle}
 */
@JvmInline
value class CTUnderlineStyle(val rawValue: Long) {
    companion object {
        val kCTUnderlineStyleNone = CTUnderlineStyle(0L)
        val kCTUnderlineStyleSingle = CTUnderlineStyle(1L)
        val kCTUnderlineStyleThick = CTUnderlineStyle(2L)
        val kCTUnderlineStyleDouble = CTUnderlineStyle(9L)
    }

    operator fun plus(o: CTUnderlineStyle) = CTUnderlineStyle(rawValue or o.rawValue)
    operator fun contains(o: CTUnderlineStyle) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CTUnderlineStyleModifiers}
 */
@JvmInline
value class CTUnderlineStyleModifiers(val rawValue: Long) {
    companion object {
        val kCTUnderlinePatternSolid = CTUnderlineStyleModifiers(0L)
        val kCTUnderlinePatternDot = CTUnderlineStyleModifiers(256L)
        val kCTUnderlinePatternDash = CTUnderlineStyleModifiers(512L)
        val kCTUnderlinePatternDashDot = CTUnderlineStyleModifiers(768L)
        val kCTUnderlinePatternDashDotDot = CTUnderlineStyleModifiers(1024L)
    }

    operator fun plus(o: CTUnderlineStyleModifiers) = CTUnderlineStyleModifiers(rawValue or o.rawValue)
    operator fun contains(o: CTUnderlineStyleModifiers) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum PasteboardSyncFlags}
 */
@JvmInline
value class PasteboardSyncFlags(val rawValue: Long) {
    companion object {
        val kPasteboardModified = PasteboardSyncFlags(1L)
        val kPasteboardClientIsOwner = PasteboardSyncFlags(2L)
    }

    operator fun plus(o: PasteboardSyncFlags) = PasteboardSyncFlags(rawValue or o.rawValue)
    operator fun contains(o: PasteboardSyncFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum PasteboardFlavorFlags}
 */
@JvmInline
value class PasteboardFlavorFlags(val rawValue: Long) {
    companion object {
        val kPasteboardFlavorNoFlags = PasteboardFlavorFlags(0L)
        val kPasteboardFlavorSenderOnly = PasteboardFlavorFlags(1L)
        val kPasteboardFlavorSenderTranslated = PasteboardFlavorFlags(2L)
        val kPasteboardFlavorNotSaved = PasteboardFlavorFlags(4L)
        val kPasteboardFlavorRequestOnly = PasteboardFlavorFlags(8L)
        val kPasteboardFlavorSystemTranslated = PasteboardFlavorFlags(256L)
        val kPasteboardFlavorPromised = PasteboardFlavorFlags(512L)
    }

    operator fun plus(o: PasteboardFlavorFlags) = PasteboardFlavorFlags(rawValue or o.rawValue)
    operator fun contains(o: PasteboardFlavorFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum AXMenuItemModifiers}
 */
@JvmInline
value class AXMenuItemModifiers(val rawValue: Long) {
    companion object {
        val kAXMenuItemModifierNone = AXMenuItemModifiers(0L)
        val kAXMenuItemModifierShift = AXMenuItemModifiers(1L)
        val kAXMenuItemModifierOption = AXMenuItemModifiers(2L)
        val kAXMenuItemModifierControl = AXMenuItemModifiers(4L)
        val kAXMenuItemModifierNoCommand = AXMenuItemModifiers(8L)
    }

    operator fun plus(o: AXMenuItemModifiers) = AXMenuItemModifiers(rawValue or o.rawValue)
    operator fun contains(o: AXMenuItemModifiers) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum AXCopyMultipleAttributeOptions}
 */
@JvmInline
value class AXCopyMultipleAttributeOptions(val rawValue: Long) {
    companion object {
        val kAXCopyMultipleAttributeOptionStopOnError = AXCopyMultipleAttributeOptions(1L)
    }

    operator fun plus(o: AXCopyMultipleAttributeOptions) = AXCopyMultipleAttributeOptions(rawValue or o.rawValue)
    operator fun contains(o: AXCopyMultipleAttributeOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSEventMask}
 */
@JvmInline
value class NSEventMask(val rawValue: Long) {
    companion object {
        val NSEventMaskLeftMouseDown = NSEventMask(2L)
        val NSEventMaskLeftMouseUp = NSEventMask(4L)
        val NSEventMaskRightMouseDown = NSEventMask(8L)
        val NSEventMaskRightMouseUp = NSEventMask(16L)
        val NSEventMaskMouseMoved = NSEventMask(32L)
        val NSEventMaskLeftMouseDragged = NSEventMask(64L)
        val NSEventMaskRightMouseDragged = NSEventMask(128L)
        val NSEventMaskMouseEntered = NSEventMask(256L)
        val NSEventMaskMouseExited = NSEventMask(512L)
        val NSEventMaskKeyDown = NSEventMask(1024L)
        val NSEventMaskKeyUp = NSEventMask(2048L)
        val NSEventMaskFlagsChanged = NSEventMask(4096L)
        val NSEventMaskAppKitDefined = NSEventMask(8192L)
        val NSEventMaskSystemDefined = NSEventMask(16384L)
        val NSEventMaskApplicationDefined = NSEventMask(32768L)
        val NSEventMaskPeriodic = NSEventMask(65536L)
        val NSEventMaskCursorUpdate = NSEventMask(131072L)
        val NSEventMaskScrollWheel = NSEventMask(4194304L)
        val NSEventMaskTabletPoint = NSEventMask(8388608L)
        val NSEventMaskTabletProximity = NSEventMask(16777216L)
        val NSEventMaskOtherMouseDown = NSEventMask(33554432L)
        val NSEventMaskOtherMouseUp = NSEventMask(67108864L)
        val NSEventMaskOtherMouseDragged = NSEventMask(134217728L)
        val NSEventMaskGesture = NSEventMask(536870912L)
        val NSEventMaskMagnify = NSEventMask(1073741824L)
        val NSEventMaskSwipe = NSEventMask(2147483648L)
        val NSEventMaskRotate = NSEventMask(262144L)
        val NSEventMaskBeginGesture = NSEventMask(524288L)
        val NSEventMaskEndGesture = NSEventMask(1048576L)
        val NSEventMaskSmartMagnify = NSEventMask(4294967296L)
        val NSEventMaskPressure = NSEventMask(17179869184L)
        val NSEventMaskDirectTouch = NSEventMask(137438953472L)
        val NSEventMaskChangeMode = NSEventMask(274877906944L)
        val NSEventMaskMouseCancelled = NSEventMask(1099511627776L)
        val NSEventMaskAny = NSEventMask(-1L)
    }

    operator fun plus(o: NSEventMask) = NSEventMask(rawValue or o.rawValue)
    operator fun contains(o: NSEventMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSEventModifierFlags}
 */
@JvmInline
value class NSEventModifierFlags(val rawValue: Long) {
    companion object {
        val NSEventModifierFlagCapsLock = NSEventModifierFlags(65536L)
        val NSEventModifierFlagShift = NSEventModifierFlags(131072L)
        val NSEventModifierFlagControl = NSEventModifierFlags(262144L)
        val NSEventModifierFlagOption = NSEventModifierFlags(524288L)
        val NSEventModifierFlagCommand = NSEventModifierFlags(1048576L)
        val NSEventModifierFlagNumericPad = NSEventModifierFlags(2097152L)
        val NSEventModifierFlagHelp = NSEventModifierFlags(4194304L)
        val NSEventModifierFlagFunction = NSEventModifierFlags(8388608L)
        val NSEventModifierFlagDeviceIndependentFlagsMask = NSEventModifierFlags(4294901760L)
    }

    operator fun plus(o: NSEventModifierFlags) = NSEventModifierFlags(rawValue or o.rawValue)
    operator fun contains(o: NSEventModifierFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSEventButtonMask}
 */
@JvmInline
value class NSEventButtonMask(val rawValue: Long) {
    companion object {
        val NSEventButtonMaskPenTip = NSEventButtonMask(1L)
        val NSEventButtonMaskPenLowerSide = NSEventButtonMask(2L)
        val NSEventButtonMaskPenUpperSide = NSEventButtonMask(4L)
    }

    operator fun plus(o: NSEventButtonMask) = NSEventButtonMask(rawValue or o.rawValue)
    operator fun contains(o: NSEventButtonMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSEventPhase}
 */
@JvmInline
value class NSEventPhase(val rawValue: Long) {
    companion object {
        val NSEventPhaseNone = NSEventPhase(0L)
        val NSEventPhaseBegan = NSEventPhase(1L)
        val NSEventPhaseStationary = NSEventPhase(2L)
        val NSEventPhaseChanged = NSEventPhase(4L)
        val NSEventPhaseEnded = NSEventPhase(8L)
        val NSEventPhaseCancelled = NSEventPhase(16L)
        val NSEventPhaseMayBegin = NSEventPhase(32L)
    }

    operator fun plus(o: NSEventPhase) = NSEventPhase(rawValue or o.rawValue)
    operator fun contains(o: NSEventPhase) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSEventSwipeTrackingOptions}
 */
@JvmInline
value class NSEventSwipeTrackingOptions(val rawValue: Long) {
    companion object {
        val NSEventSwipeTrackingLockDirection = NSEventSwipeTrackingOptions(1L)
        val NSEventSwipeTrackingClampGestureAmount = NSEventSwipeTrackingOptions(2L)
    }

    operator fun plus(o: NSEventSwipeTrackingOptions) = NSEventSwipeTrackingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSEventSwipeTrackingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPasteboardContentsOptions}
 */
@JvmInline
value class NSPasteboardContentsOptions(val rawValue: Long) {
    companion object {
        val NSPasteboardContentsCurrentHostOnly = NSPasteboardContentsOptions(1L)
    }

    operator fun plus(o: NSPasteboardContentsOptions) = NSPasteboardContentsOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPasteboardContentsOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPasteboardWritingOptions}
 */
@JvmInline
value class NSPasteboardWritingOptions(val rawValue: Long) {
    companion object {
        val NSPasteboardWritingPromised = NSPasteboardWritingOptions(512L)
    }

    operator fun plus(o: NSPasteboardWritingOptions) = NSPasteboardWritingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPasteboardWritingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPasteboardReadingOptions}
 */
@JvmInline
value class NSPasteboardReadingOptions(val rawValue: Long) {
    companion object {
        val NSPasteboardReadingAsData = NSPasteboardReadingOptions(0L)
        val NSPasteboardReadingAsString = NSPasteboardReadingOptions(1L)
        val NSPasteboardReadingAsPropertyList = NSPasteboardReadingOptions(2L)
        val NSPasteboardReadingAsKeyedArchive = NSPasteboardReadingOptions(4L)
    }

    operator fun plus(o: NSPasteboardReadingOptions) = NSPasteboardReadingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPasteboardReadingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSApplicationActivationOptions}
 */
@JvmInline
value class NSApplicationActivationOptions(val rawValue: Long) {
    companion object {
        val NSApplicationActivateAllWindows = NSApplicationActivationOptions(1L)
        val NSApplicationActivateIgnoringOtherApps = NSApplicationActivationOptions(2L)
    }

    operator fun plus(o: NSApplicationActivationOptions) = NSApplicationActivationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSApplicationActivationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDragOperation}
 */
@JvmInline
value class NSDragOperation(val rawValue: Long) {
    companion object {
        val NSDragOperationNone = NSDragOperation(0L)
        val NSDragOperationCopy = NSDragOperation(1L)
        val NSDragOperationLink = NSDragOperation(2L)
        val NSDragOperationGeneric = NSDragOperation(4L)
        val NSDragOperationPrivate = NSDragOperation(8L)
        val NSDragOperationMove = NSDragOperation(16L)
        val NSDragOperationDelete = NSDragOperation(32L)
        val NSDragOperationEvery = NSDragOperation(-1L)
        val NSDragOperationAll_Obsolete = NSDragOperation(15L)
        val NSDragOperationAll = NSDragOperation(15L)
    }

    operator fun plus(o: NSDragOperation) = NSDragOperation(rawValue or o.rawValue)
    operator fun contains(o: NSDragOperation) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDraggingItemEnumerationOptions}
 */
@JvmInline
value class NSDraggingItemEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSDraggingItemEnumerationConcurrent = NSDraggingItemEnumerationOptions(1L)
        val NSDraggingItemEnumerationClearNonenumeratedImages = NSDraggingItemEnumerationOptions(65536L)
    }

    operator fun plus(o: NSDraggingItemEnumerationOptions) = NSDraggingItemEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSDraggingItemEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSSpringLoadingOptions}
 */
@JvmInline
value class NSSpringLoadingOptions(val rawValue: Long) {
    companion object {
        val NSSpringLoadingDisabled = NSSpringLoadingOptions(0L)
        val NSSpringLoadingEnabled = NSSpringLoadingOptions(1L)
        val NSSpringLoadingContinuousActivation = NSSpringLoadingOptions(2L)
        val NSSpringLoadingNoHover = NSSpringLoadingOptions(8L)
    }

    operator fun plus(o: NSSpringLoadingOptions) = NSSpringLoadingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSSpringLoadingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSAutoresizingMaskOptions}
 */
@JvmInline
value class NSAutoresizingMaskOptions(val rawValue: Long) {
    companion object {
        val NSViewNotSizable = NSAutoresizingMaskOptions(0L)
        val NSViewMinXMargin = NSAutoresizingMaskOptions(1L)
        val NSViewWidthSizable = NSAutoresizingMaskOptions(2L)
        val NSViewMaxXMargin = NSAutoresizingMaskOptions(4L)
        val NSViewMinYMargin = NSAutoresizingMaskOptions(8L)
        val NSViewHeightSizable = NSAutoresizingMaskOptions(16L)
        val NSViewMaxYMargin = NSAutoresizingMaskOptions(32L)
    }

    operator fun plus(o: NSAutoresizingMaskOptions) = NSAutoresizingMaskOptions(rawValue or o.rawValue)
    operator fun contains(o: NSAutoresizingMaskOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSLineBreakStrategy}
 */
@JvmInline
value class NSLineBreakStrategy(val rawValue: Long) {
    companion object {
        val NSLineBreakStrategyNone = NSLineBreakStrategy(0L)
        val NSLineBreakStrategyPushOut = NSLineBreakStrategy(1L)
        val NSLineBreakStrategyHangulWordPriority = NSLineBreakStrategy(2L)
        val NSLineBreakStrategyStandard = NSLineBreakStrategy(65535L)
    }

    operator fun plus(o: NSLineBreakStrategy) = NSLineBreakStrategy(rawValue or o.rawValue)
    operator fun contains(o: NSLineBreakStrategy) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCellStyleMask}
 */
@JvmInline
value class NSCellStyleMask(val rawValue: Long) {
    companion object {
        val NSNoCellMask = NSCellStyleMask(0L)
        val NSContentsCellMask = NSCellStyleMask(1L)
        val NSPushInCellMask = NSCellStyleMask(2L)
        val NSChangeGrayCellMask = NSCellStyleMask(4L)
        val NSChangeBackgroundCellMask = NSCellStyleMask(8L)
    }

    operator fun plus(o: NSCellStyleMask) = NSCellStyleMask(rawValue or o.rawValue)
    operator fun contains(o: NSCellStyleMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCellHitResult}
 */
@JvmInline
value class NSCellHitResult(val rawValue: Long) {
    companion object {
        val NSCellHitNone = NSCellHitResult(0L)
        val NSCellHitContentArea = NSCellHitResult(1L)
        val NSCellHitEditableTextArea = NSCellHitResult(2L)
        val NSCellHitTrackableArea = NSCellHitResult(4L)
    }

    operator fun plus(o: NSCellHitResult) = NSCellHitResult(rawValue or o.rawValue)
    operator fun contains(o: NSCellHitResult) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSMenuProperties}
 */
@JvmInline
value class NSMenuProperties(val rawValue: Long) {
    companion object {
        val NSMenuPropertyItemTitle = NSMenuProperties(1L)
        val NSMenuPropertyItemAttributedTitle = NSMenuProperties(2L)
        val NSMenuPropertyItemKeyEquivalent = NSMenuProperties(4L)
        val NSMenuPropertyItemImage = NSMenuProperties(8L)
        val NSMenuPropertyItemEnabled = NSMenuProperties(16L)
        val NSMenuPropertyItemAccessibilityDescription = NSMenuProperties(32L)
    }

    operator fun plus(o: NSMenuProperties) = NSMenuProperties(rawValue or o.rawValue)
    operator fun contains(o: NSMenuProperties) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSApplicationPresentationOptions}
 */
@JvmInline
value class NSApplicationPresentationOptions(val rawValue: Long) {
    companion object {
        val NSApplicationPresentationDefault = NSApplicationPresentationOptions(0L)
        val NSApplicationPresentationAutoHideDock = NSApplicationPresentationOptions(1L)
        val NSApplicationPresentationHideDock = NSApplicationPresentationOptions(2L)
        val NSApplicationPresentationAutoHideMenuBar = NSApplicationPresentationOptions(4L)
        val NSApplicationPresentationHideMenuBar = NSApplicationPresentationOptions(8L)
        val NSApplicationPresentationDisableAppleMenu = NSApplicationPresentationOptions(16L)
        val NSApplicationPresentationDisableProcessSwitching = NSApplicationPresentationOptions(32L)
        val NSApplicationPresentationDisableForceQuit = NSApplicationPresentationOptions(64L)
        val NSApplicationPresentationDisableSessionTermination = NSApplicationPresentationOptions(128L)
        val NSApplicationPresentationDisableHideApplication = NSApplicationPresentationOptions(256L)
        val NSApplicationPresentationDisableMenuBarTransparency = NSApplicationPresentationOptions(512L)
        val NSApplicationPresentationFullScreen = NSApplicationPresentationOptions(1024L)
        val NSApplicationPresentationAutoHideToolbar = NSApplicationPresentationOptions(2048L)
        val NSApplicationPresentationDisableCursorLocationAssistance = NSApplicationPresentationOptions(4096L)
    }

    operator fun plus(o: NSApplicationPresentationOptions) = NSApplicationPresentationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSApplicationPresentationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSApplicationOcclusionState}
 */
@JvmInline
value class NSApplicationOcclusionState(val rawValue: Long) {
    companion object {
        val NSApplicationOcclusionStateVisible = NSApplicationOcclusionState(2L)
    }

    operator fun plus(o: NSApplicationOcclusionState) = NSApplicationOcclusionState(rawValue or o.rawValue)
    operator fun contains(o: NSApplicationOcclusionState) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWindowListOptions}
 */
@JvmInline
value class NSWindowListOptions(val rawValue: Long) {
    companion object {
        val NSWindowListOrderedFrontToBack = NSWindowListOptions(1L)
    }

    operator fun plus(o: NSWindowListOptions) = NSWindowListOptions(rawValue or o.rawValue)
    operator fun contains(o: NSWindowListOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSRemoteNotificationType}
 */
@JvmInline
value class NSRemoteNotificationType(val rawValue: Long) {
    companion object {
        val NSRemoteNotificationTypeNone = NSRemoteNotificationType(0L)
        val NSRemoteNotificationTypeBadge = NSRemoteNotificationType(1L)
        val NSRemoteNotificationTypeSound = NSRemoteNotificationType(2L)
        val NSRemoteNotificationTypeAlert = NSRemoteNotificationType(4L)
    }

    operator fun plus(o: NSRemoteNotificationType) = NSRemoteNotificationType(rawValue or o.rawValue)
    operator fun contains(o: NSRemoteNotificationType) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSViewControllerTransitionOptions}
 */
@JvmInline
value class NSViewControllerTransitionOptions(val rawValue: Long) {
    companion object {
        val NSViewControllerTransitionNone = NSViewControllerTransitionOptions(0L)
        val NSViewControllerTransitionCrossfade = NSViewControllerTransitionOptions(1L)
        val NSViewControllerTransitionSlideUp = NSViewControllerTransitionOptions(16L)
        val NSViewControllerTransitionSlideDown = NSViewControllerTransitionOptions(32L)
        val NSViewControllerTransitionSlideLeft = NSViewControllerTransitionOptions(64L)
        val NSViewControllerTransitionSlideRight = NSViewControllerTransitionOptions(128L)
        val NSViewControllerTransitionSlideForward = NSViewControllerTransitionOptions(320L)
        val NSViewControllerTransitionSlideBackward = NSViewControllerTransitionOptions(384L)
        val NSViewControllerTransitionAllowUserInteraction = NSViewControllerTransitionOptions(4096L)
    }

    operator fun plus(o: NSViewControllerTransitionOptions) = NSViewControllerTransitionOptions(rawValue or o.rawValue)
    operator fun contains(o: NSViewControllerTransitionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCollectionViewScrollPosition}
 */
@JvmInline
value class NSCollectionViewScrollPosition(val rawValue: Long) {
    companion object {
        val NSCollectionViewScrollPositionNone = NSCollectionViewScrollPosition(0L)
        val NSCollectionViewScrollPositionTop = NSCollectionViewScrollPosition(1L)
        val NSCollectionViewScrollPositionCenteredVertically = NSCollectionViewScrollPosition(2L)
        val NSCollectionViewScrollPositionBottom = NSCollectionViewScrollPosition(4L)
        val NSCollectionViewScrollPositionNearestHorizontalEdge = NSCollectionViewScrollPosition(512L)
        val NSCollectionViewScrollPositionLeft = NSCollectionViewScrollPosition(8L)
        val NSCollectionViewScrollPositionCenteredHorizontally = NSCollectionViewScrollPosition(16L)
        val NSCollectionViewScrollPositionRight = NSCollectionViewScrollPosition(32L)
        val NSCollectionViewScrollPositionLeadingEdge = NSCollectionViewScrollPosition(64L)
        val NSCollectionViewScrollPositionTrailingEdge = NSCollectionViewScrollPosition(128L)
        val NSCollectionViewScrollPositionNearestVerticalEdge = NSCollectionViewScrollPosition(256L)
    }

    operator fun plus(o: NSCollectionViewScrollPosition) = NSCollectionViewScrollPosition(rawValue or o.rawValue)
    operator fun contains(o: NSCollectionViewScrollPosition) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDirectionalRectEdge}
 */
@JvmInline
value class NSDirectionalRectEdge(val rawValue: Long) {
    companion object {
        val NSDirectionalRectEdgeNone = NSDirectionalRectEdge(0L)
        val NSDirectionalRectEdgeTop = NSDirectionalRectEdge(1L)
        val NSDirectionalRectEdgeLeading = NSDirectionalRectEdge(2L)
        val NSDirectionalRectEdgeBottom = NSDirectionalRectEdge(4L)
        val NSDirectionalRectEdgeTrailing = NSDirectionalRectEdge(8L)
        val NSDirectionalRectEdgeAll = NSDirectionalRectEdge(15L)
    }

    operator fun plus(o: NSDirectionalRectEdge) = NSDirectionalRectEdge(rawValue or o.rawValue)
    operator fun contains(o: NSDirectionalRectEdge) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSHorizontalDirections}
 */
@JvmInline
value class NSHorizontalDirections(val rawValue: Long) {
    companion object {
        val NSHorizontalDirectionsLeft = NSHorizontalDirections(1L)
        val NSHorizontalDirectionsRight = NSHorizontalDirections(2L)
        val NSHorizontalDirectionsAll = NSHorizontalDirections(3L)
    }

    operator fun plus(o: NSHorizontalDirections) = NSHorizontalDirections(rawValue or o.rawValue)
    operator fun contains(o: NSHorizontalDirections) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSVerticalDirections}
 */
@JvmInline
value class NSVerticalDirections(val rawValue: Long) {
    companion object {
        val NSVerticalDirectionsUp = NSVerticalDirections(1L)
        val NSVerticalDirectionsDown = NSVerticalDirections(2L)
        val NSVerticalDirectionsAll = NSVerticalDirections(3L)
    }

    operator fun plus(o: NSVerticalDirections) = NSVerticalDirections(rawValue or o.rawValue)
    operator fun contains(o: NSVerticalDirections) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFontDescriptorSymbolicTraits}
 */
@JvmInline
value class NSFontDescriptorSymbolicTraits(val rawValue: Long) {
    companion object {
        val NSFontDescriptorTraitItalic = NSFontDescriptorSymbolicTraits(1L)
        val NSFontDescriptorTraitBold = NSFontDescriptorSymbolicTraits(2L)
        val NSFontDescriptorTraitExpanded = NSFontDescriptorSymbolicTraits(32L)
        val NSFontDescriptorTraitCondensed = NSFontDescriptorSymbolicTraits(64L)
        val NSFontDescriptorTraitMonoSpace = NSFontDescriptorSymbolicTraits(1024L)
        val NSFontDescriptorTraitVertical = NSFontDescriptorSymbolicTraits(2048L)
        val NSFontDescriptorTraitUIOptimized = NSFontDescriptorSymbolicTraits(4096L)
        val NSFontDescriptorTraitTightLeading = NSFontDescriptorSymbolicTraits(32768L)
        val NSFontDescriptorTraitLooseLeading = NSFontDescriptorSymbolicTraits(65536L)
        val NSFontDescriptorTraitEmphasized = NSFontDescriptorSymbolicTraits(2L)
        val NSFontDescriptorClassMask = NSFontDescriptorSymbolicTraits(-268435456L)
        val NSFontDescriptorClassUnknown = NSFontDescriptorSymbolicTraits(0L)
        val NSFontDescriptorClassOldStyleSerifs = NSFontDescriptorSymbolicTraits(268435456L)
        val NSFontDescriptorClassTransitionalSerifs = NSFontDescriptorSymbolicTraits(536870912L)
        val NSFontDescriptorClassModernSerifs = NSFontDescriptorSymbolicTraits(805306368L)
        val NSFontDescriptorClassClarendonSerifs = NSFontDescriptorSymbolicTraits(1073741824L)
        val NSFontDescriptorClassSlabSerifs = NSFontDescriptorSymbolicTraits(1342177280L)
        val NSFontDescriptorClassFreeformSerifs = NSFontDescriptorSymbolicTraits(1879048192L)
        val NSFontDescriptorClassSansSerif = NSFontDescriptorSymbolicTraits(-2147483648L)
        val NSFontDescriptorClassOrnamentals = NSFontDescriptorSymbolicTraits(-1879048192L)
        val NSFontDescriptorClassScripts = NSFontDescriptorSymbolicTraits(-1610612736L)
        val NSFontDescriptorClassSymbolic = NSFontDescriptorSymbolicTraits(-1073741824L)
    }

    operator fun plus(o: NSFontDescriptorSymbolicTraits) = NSFontDescriptorSymbolicTraits(rawValue or o.rawValue)
    operator fun contains(o: NSFontDescriptorSymbolicTraits) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFontAssetRequestOptions}
 */
@JvmInline
value class NSFontAssetRequestOptions(val rawValue: Long) {
    companion object {
        val NSFontAssetRequestOptionUsesStandardUI = NSFontAssetRequestOptions(1L)
    }

    operator fun plus(o: NSFontAssetRequestOptions) = NSFontAssetRequestOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFontAssetRequestOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFontCollectionVisibility}
 */
@JvmInline
value class NSFontCollectionVisibility(val rawValue: Long) {
    companion object {
        val NSFontCollectionVisibilityProcess = NSFontCollectionVisibility(1L)
        val NSFontCollectionVisibilityUser = NSFontCollectionVisibility(2L)
        val NSFontCollectionVisibilityComputer = NSFontCollectionVisibility(4L)
    }

    operator fun plus(o: NSFontCollectionVisibility) = NSFontCollectionVisibility(rawValue or o.rawValue)
    operator fun contains(o: NSFontCollectionVisibility) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFontTraitMask}
 */
@JvmInline
value class NSFontTraitMask(val rawValue: Long) {
    companion object {
        val NSItalicFontMask = NSFontTraitMask(1L)
        val NSBoldFontMask = NSFontTraitMask(2L)
        val NSUnboldFontMask = NSFontTraitMask(4L)
        val NSNonStandardCharacterSetFontMask = NSFontTraitMask(8L)
        val NSNarrowFontMask = NSFontTraitMask(16L)
        val NSExpandedFontMask = NSFontTraitMask(32L)
        val NSCondensedFontMask = NSFontTraitMask(64L)
        val NSSmallCapsFontMask = NSFontTraitMask(128L)
        val NSPosterFontMask = NSFontTraitMask(256L)
        val NSCompressedFontMask = NSFontTraitMask(512L)
        val NSFixedPitchFontMask = NSFontTraitMask(1024L)
        val NSUnitalicFontMask = NSFontTraitMask(16777216L)
    }

    operator fun plus(o: NSFontTraitMask) = NSFontTraitMask(rawValue or o.rawValue)
    operator fun contains(o: NSFontTraitMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFontCollectionOptions}
 */
@JvmInline
value class NSFontCollectionOptions(val rawValue: Long) {
    companion object {
        val NSFontCollectionApplicationOnlyMask = NSFontCollectionOptions(1L)
    }

    operator fun plus(o: NSFontCollectionOptions) = NSFontCollectionOptions(rawValue or o.rawValue)
    operator fun contains(o: NSFontCollectionOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWindowStyleMask}
 */
@JvmInline
value class NSWindowStyleMask(val rawValue: Long) {
    companion object {
        val NSWindowStyleMaskBorderless = NSWindowStyleMask(0L)
        val NSWindowStyleMaskTitled = NSWindowStyleMask(1L)
        val NSWindowStyleMaskClosable = NSWindowStyleMask(2L)
        val NSWindowStyleMaskMiniaturizable = NSWindowStyleMask(4L)
        val NSWindowStyleMaskResizable = NSWindowStyleMask(8L)
        val NSWindowStyleMaskTexturedBackground = NSWindowStyleMask(256L)
        val NSWindowStyleMaskUnifiedTitleAndToolbar = NSWindowStyleMask(4096L)
        val NSWindowStyleMaskFullScreen = NSWindowStyleMask(16384L)
        val NSWindowStyleMaskFullSizeContentView = NSWindowStyleMask(32768L)
        val NSWindowStyleMaskUtilityWindow = NSWindowStyleMask(16L)
        val NSWindowStyleMaskDocModalWindow = NSWindowStyleMask(64L)
        val NSWindowStyleMaskNonactivatingPanel = NSWindowStyleMask(128L)
        val NSWindowStyleMaskHUDWindow = NSWindowStyleMask(8192L)
    }

    operator fun plus(o: NSWindowStyleMask) = NSWindowStyleMask(rawValue or o.rawValue)
    operator fun contains(o: NSWindowStyleMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWindowCollectionBehavior}
 */
@JvmInline
value class NSWindowCollectionBehavior(val rawValue: Long) {
    companion object {
        val NSWindowCollectionBehaviorDefault = NSWindowCollectionBehavior(0L)
        val NSWindowCollectionBehaviorCanJoinAllSpaces = NSWindowCollectionBehavior(1L)
        val NSWindowCollectionBehaviorMoveToActiveSpace = NSWindowCollectionBehavior(2L)
        val NSWindowCollectionBehaviorManaged = NSWindowCollectionBehavior(4L)
        val NSWindowCollectionBehaviorTransient = NSWindowCollectionBehavior(8L)
        val NSWindowCollectionBehaviorStationary = NSWindowCollectionBehavior(16L)
        val NSWindowCollectionBehaviorParticipatesInCycle = NSWindowCollectionBehavior(32L)
        val NSWindowCollectionBehaviorIgnoresCycle = NSWindowCollectionBehavior(64L)
        val NSWindowCollectionBehaviorFullScreenPrimary = NSWindowCollectionBehavior(128L)
        val NSWindowCollectionBehaviorFullScreenAuxiliary = NSWindowCollectionBehavior(256L)
        val NSWindowCollectionBehaviorFullScreenNone = NSWindowCollectionBehavior(512L)
        val NSWindowCollectionBehaviorFullScreenAllowsTiling = NSWindowCollectionBehavior(2048L)
        val NSWindowCollectionBehaviorFullScreenDisallowsTiling = NSWindowCollectionBehavior(4096L)
        val NSWindowCollectionBehaviorPrimary = NSWindowCollectionBehavior(65536L)
        val NSWindowCollectionBehaviorAuxiliary = NSWindowCollectionBehavior(131072L)
        val NSWindowCollectionBehaviorCanJoinAllApplications = NSWindowCollectionBehavior(262144L)
    }

    operator fun plus(o: NSWindowCollectionBehavior) = NSWindowCollectionBehavior(rawValue or o.rawValue)
    operator fun contains(o: NSWindowCollectionBehavior) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWindowNumberListOptions}
 */
@JvmInline
value class NSWindowNumberListOptions(val rawValue: Long) {
    companion object {
        val NSWindowNumberListAllApplications = NSWindowNumberListOptions(1L)
        val NSWindowNumberListAllSpaces = NSWindowNumberListOptions(16L)
    }

    operator fun plus(o: NSWindowNumberListOptions) = NSWindowNumberListOptions(rawValue or o.rawValue)
    operator fun contains(o: NSWindowNumberListOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWindowOcclusionState}
 */
@JvmInline
value class NSWindowOcclusionState(val rawValue: Long) {
    companion object {
        val NSWindowOcclusionStateVisible = NSWindowOcclusionState(2L)
    }

    operator fun plus(o: NSWindowOcclusionState) = NSWindowOcclusionState(rawValue or o.rawValue)
    operator fun contains(o: NSWindowOcclusionState) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSFontPanelModeMask}
 */
@JvmInline
value class NSFontPanelModeMask(val rawValue: Long) {
    companion object {
        val NSFontPanelModeMaskFace = NSFontPanelModeMask(1L)
        val NSFontPanelModeMaskSize = NSFontPanelModeMask(2L)
        val NSFontPanelModeMaskCollection = NSFontPanelModeMask(4L)
        val NSFontPanelModeMaskUnderlineEffect = NSFontPanelModeMask(256L)
        val NSFontPanelModeMaskStrikethroughEffect = NSFontPanelModeMask(512L)
        val NSFontPanelModeMaskTextColorEffect = NSFontPanelModeMask(1024L)
        val NSFontPanelModeMaskDocumentColorEffect = NSFontPanelModeMask(2048L)
        val NSFontPanelModeMaskShadowEffect = NSFontPanelModeMask(4096L)
        val NSFontPanelModeMaskAllEffects = NSFontPanelModeMask(1048320L)
        val NSFontPanelModesMaskStandardModes = NSFontPanelModeMask(65535L)
        val NSFontPanelModesMaskAllModes = NSFontPanelModeMask(4294967295L)
    }

    operator fun plus(o: NSFontPanelModeMask) = NSFontPanelModeMask(rawValue or o.rawValue)
    operator fun contains(o: NSFontPanelModeMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSBitmapFormat}
 */
@JvmInline
value class NSBitmapFormat(val rawValue: Long) {
    companion object {
        val NSBitmapFormatAlphaFirst = NSBitmapFormat(1L)
        val NSBitmapFormatAlphaNonpremultiplied = NSBitmapFormat(2L)
        val NSBitmapFormatFloatingPointSamples = NSBitmapFormat(4L)
        val NSBitmapFormatSixteenBitLittleEndian = NSBitmapFormat(256L)
        val NSBitmapFormatThirtyTwoBitLittleEndian = NSBitmapFormat(512L)
        val NSBitmapFormatSixteenBitBigEndian = NSBitmapFormat(1024L)
        val NSBitmapFormatThirtyTwoBitBigEndian = NSBitmapFormat(2048L)
    }

    operator fun plus(o: NSBitmapFormat) = NSBitmapFormat(rawValue or o.rawValue)
    operator fun contains(o: NSBitmapFormat) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CVSMPTETimeFlags}
 */
@JvmInline
value class CVSMPTETimeFlags(val rawValue: Long) {
    companion object {
        val kCVSMPTETimeValid = CVSMPTETimeFlags(1L)
        val kCVSMPTETimeRunning = CVSMPTETimeFlags(2L)
    }

    operator fun plus(o: CVSMPTETimeFlags) = CVSMPTETimeFlags(rawValue or o.rawValue)
    operator fun contains(o: CVSMPTETimeFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CVTimeFlags}
 */
@JvmInline
value class CVTimeFlags(val rawValue: Long) {
    companion object {
        val kCVTimeIsIndefinite = CVTimeFlags(1L)
    }

    operator fun plus(o: CVTimeFlags) = CVTimeFlags(rawValue or o.rawValue)
    operator fun contains(o: CVTimeFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CVTimeStampFlags}
 */
@JvmInline
value class CVTimeStampFlags(val rawValue: Long) {
    companion object {
        val kCVTimeStampVideoTimeValid = CVTimeStampFlags(1L)
        val kCVTimeStampHostTimeValid = CVTimeStampFlags(2L)
        val kCVTimeStampSMPTETimeValid = CVTimeStampFlags(4L)
        val kCVTimeStampVideoRefreshPeriodValid = CVTimeStampFlags(8L)
        val kCVTimeStampRateScalarValid = CVTimeStampFlags(16L)
        val kCVTimeStampTopField = CVTimeStampFlags(65536L)
        val kCVTimeStampBottomField = CVTimeStampFlags(131072L)
        val kCVTimeStampVideoHostTimeValid = CVTimeStampFlags(3L)
        val kCVTimeStampIsInterlaced = CVTimeStampFlags(196608L)
    }

    operator fun plus(o: CVTimeStampFlags) = CVTimeStampFlags(rawValue or o.rawValue)
    operator fun contains(o: CVTimeStampFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CVPixelBufferLockFlags}
 */
@JvmInline
value class CVPixelBufferLockFlags(val rawValue: Long) {
    companion object {
        val kCVPixelBufferLock_ReadOnly = CVPixelBufferLockFlags(1L)
    }

    operator fun plus(o: CVPixelBufferLockFlags) = CVPixelBufferLockFlags(rawValue or o.rawValue)
    operator fun contains(o: CVPixelBufferLockFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum IOSurfaceLockOptions}
 */
@JvmInline
value class IOSurfaceLockOptions(val rawValue: Long) {
    companion object {
        val kIOSurfaceLockReadOnly = IOSurfaceLockOptions(1L)
        val kIOSurfaceLockAvoidSync = IOSurfaceLockOptions(2L)
    }

    operator fun plus(o: IOSurfaceLockOptions) = IOSurfaceLockOptions(rawValue or o.rawValue)
    operator fun contains(o: IOSurfaceLockOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum IOSurfacePurgeabilityState}
 */
@JvmInline
value class IOSurfacePurgeabilityState(val rawValue: Long) {
    companion object {
        val kIOSurfacePurgeableNonVolatile = IOSurfacePurgeabilityState(0L)
        val kIOSurfacePurgeableVolatile = IOSurfacePurgeabilityState(1L)
        val kIOSurfacePurgeableEmpty = IOSurfacePurgeabilityState(2L)
        val kIOSurfacePurgeableKeepCurrent = IOSurfacePurgeabilityState(3L)
    }

    operator fun plus(o: IOSurfacePurgeabilityState) = IOSurfacePurgeabilityState(rawValue or o.rawValue)
    operator fun contains(o: IOSurfacePurgeabilityState) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum IOSurfaceMemoryLedgerFlags}
 */
@JvmInline
value class IOSurfaceMemoryLedgerFlags(val rawValue: Long) {
    companion object {
        val kIOSurfaceMemoryLedgerFlagNoFootprint = IOSurfaceMemoryLedgerFlags(1L)
    }

    operator fun plus(o: IOSurfaceMemoryLedgerFlags) = IOSurfaceMemoryLedgerFlags(rawValue or o.rawValue)
    operator fun contains(o: IOSurfaceMemoryLedgerFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CVPixelBufferPoolFlushFlags}
 */
@JvmInline
value class CVPixelBufferPoolFlushFlags(val rawValue: Long) {
    companion object {
        val kCVPixelBufferPoolFlushExcessBuffers = CVPixelBufferPoolFlushFlags(1L)
    }

    operator fun plus(o: CVPixelBufferPoolFlushFlags) = CVPixelBufferPoolFlushFlags(rawValue or o.rawValue)
    operator fun contains(o: CVPixelBufferPoolFlushFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSColorPanelOptions}
 */
@JvmInline
value class NSColorPanelOptions(val rawValue: Long) {
    companion object {
        val NSColorPanelGrayModeMask = NSColorPanelOptions(1L)
        val NSColorPanelRGBModeMask = NSColorPanelOptions(2L)
        val NSColorPanelCMYKModeMask = NSColorPanelOptions(4L)
        val NSColorPanelHSBModeMask = NSColorPanelOptions(8L)
        val NSColorPanelCustomPaletteModeMask = NSColorPanelOptions(16L)
        val NSColorPanelColorListModeMask = NSColorPanelOptions(32L)
        val NSColorPanelWheelModeMask = NSColorPanelOptions(64L)
        val NSColorPanelCrayonModeMask = NSColorPanelOptions(128L)
        val NSColorPanelAllModesMask = NSColorPanelOptions(65535L)
    }

    operator fun plus(o: NSColorPanelOptions) = NSColorPanelOptions(rawValue or o.rawValue)
    operator fun contains(o: NSColorPanelOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCursorFrameResizeDirections}
 */
@JvmInline
value class NSCursorFrameResizeDirections(val rawValue: Long) {
    companion object {
        val NSCursorFrameResizeDirectionsInward = NSCursorFrameResizeDirections(1L)
        val NSCursorFrameResizeDirectionsOutward = NSCursorFrameResizeDirections(2L)
        val NSCursorFrameResizeDirectionsAll = NSCursorFrameResizeDirections(3L)
    }

    operator fun plus(o: NSCursorFrameResizeDirections) = NSCursorFrameResizeDirections(rawValue or o.rawValue)
    operator fun contains(o: NSCursorFrameResizeDirections) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSGradientDrawingOptions}
 */
@JvmInline
value class NSGradientDrawingOptions(val rawValue: Long) {
    companion object {
        val NSGradientDrawsBeforeStartingLocation = NSGradientDrawingOptions(1L)
        val NSGradientDrawsAfterEndingLocation = NSGradientDrawingOptions(2L)
    }

    operator fun plus(o: NSGradientDrawingOptions) = NSGradientDrawingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSGradientDrawingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSLayoutFormatOptions}
 */
@JvmInline
value class NSLayoutFormatOptions(val rawValue: Long) {
    companion object {
        val NSLayoutFormatAlignAllLeft = NSLayoutFormatOptions(2L)
        val NSLayoutFormatAlignAllRight = NSLayoutFormatOptions(4L)
        val NSLayoutFormatAlignAllTop = NSLayoutFormatOptions(8L)
        val NSLayoutFormatAlignAllBottom = NSLayoutFormatOptions(16L)
        val NSLayoutFormatAlignAllLeading = NSLayoutFormatOptions(32L)
        val NSLayoutFormatAlignAllTrailing = NSLayoutFormatOptions(64L)
        val NSLayoutFormatAlignAllCenterX = NSLayoutFormatOptions(512L)
        val NSLayoutFormatAlignAllCenterY = NSLayoutFormatOptions(1024L)
        val NSLayoutFormatAlignAllLastBaseline = NSLayoutFormatOptions(2048L)
        val NSLayoutFormatAlignAllFirstBaseline = NSLayoutFormatOptions(4096L)
        val NSLayoutFormatAlignAllBaseline = NSLayoutFormatOptions(2048L)
        val NSLayoutFormatAlignmentMask = NSLayoutFormatOptions(65535L)
        val NSLayoutFormatDirectionLeadingToTrailing = NSLayoutFormatOptions(0L)
        val NSLayoutFormatDirectionLeftToRight = NSLayoutFormatOptions(65536L)
        val NSLayoutFormatDirectionRightToLeft = NSLayoutFormatOptions(131072L)
        val NSLayoutFormatDirectionMask = NSLayoutFormatOptions(196608L)
    }

    operator fun plus(o: NSLayoutFormatOptions) = NSLayoutFormatOptions(rawValue or o.rawValue)
    operator fun contains(o: NSLayoutFormatOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum os_unfair_lock_flags_t}
 */
@JvmInline
value class os_unfair_lock_flags_t(val rawValue: Long) {
    companion object {
        val OS_UNFAIR_LOCK_FLAG_NONE = os_unfair_lock_flags_t(0L)
        val OS_UNFAIR_LOCK_FLAG_ADAPTIVE_SPIN = os_unfair_lock_flags_t(262144L)
    }

    operator fun plus(o: os_unfair_lock_flags_t) = os_unfair_lock_flags_t(rawValue or o.rawValue)
    operator fun contains(o: os_unfair_lock_flags_t) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSCloudKitSharingServiceOptions}
 */
@JvmInline
value class NSCloudKitSharingServiceOptions(val rawValue: Long) {
    companion object {
        val NSCloudKitSharingServiceStandard = NSCloudKitSharingServiceOptions(0L)
        val NSCloudKitSharingServiceAllowPublic = NSCloudKitSharingServiceOptions(1L)
        val NSCloudKitSharingServiceAllowPrivate = NSCloudKitSharingServiceOptions(2L)
        val NSCloudKitSharingServiceAllowReadOnly = NSCloudKitSharingServiceOptions(16L)
        val NSCloudKitSharingServiceAllowReadWrite = NSCloudKitSharingServiceOptions(32L)
    }

    operator fun plus(o: NSCloudKitSharingServiceOptions) = NSCloudKitSharingServiceOptions(rawValue or o.rawValue)
    operator fun contains(o: NSCloudKitSharingServiceOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPrintPanelOptions}
 */
@JvmInline
value class NSPrintPanelOptions(val rawValue: Long) {
    companion object {
        val NSPrintPanelShowsCopies = NSPrintPanelOptions(1L)
        val NSPrintPanelShowsPageRange = NSPrintPanelOptions(2L)
        val NSPrintPanelShowsPaperSize = NSPrintPanelOptions(4L)
        val NSPrintPanelShowsOrientation = NSPrintPanelOptions(8L)
        val NSPrintPanelShowsScaling = NSPrintPanelOptions(16L)
        val NSPrintPanelShowsPrintSelection = NSPrintPanelOptions(32L)
        val NSPrintPanelShowsPageSetupAccessory = NSPrintPanelOptions(256L)
        val NSPrintPanelShowsPreview = NSPrintPanelOptions(131072L)
    }

    operator fun plus(o: NSPrintPanelOptions) = NSPrintPanelOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPrintPanelOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSPDFPanelOptions}
 */
@JvmInline
value class NSPDFPanelOptions(val rawValue: Long) {
    companion object {
        val NSPDFPanelShowsPaperSize = NSPDFPanelOptions(4L)
        val NSPDFPanelShowsOrientation = NSPDFPanelOptions(8L)
        val NSPDFPanelRequestsParentDirectory = NSPDFPanelOptions(16777216L)
    }

    operator fun plus(o: NSPDFPanelOptions) = NSPDFPanelOptions(rawValue or o.rawValue)
    operator fun contains(o: NSPDFPanelOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSMediaLibrary}
 */
@JvmInline
value class NSMediaLibrary(val rawValue: Long) {
    companion object {
        val NSMediaLibraryAudio = NSMediaLibrary(1L)
        val NSMediaLibraryImage = NSMediaLibrary(2L)
        val NSMediaLibraryMovie = NSMediaLibrary(4L)
    }

    operator fun plus(o: NSMediaLibrary) = NSMediaLibrary(rawValue or o.rawValue)
    operator fun contains(o: NSMediaLibrary) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSWritingToolsResultOptions}
 */
@JvmInline
value class NSWritingToolsResultOptions(val rawValue: Long) {
    companion object {
        val NSWritingToolsResultDefault = NSWritingToolsResultOptions(0L)
        val NSWritingToolsResultPlainText = NSWritingToolsResultOptions(1L)
        val NSWritingToolsResultRichText = NSWritingToolsResultOptions(2L)
        val NSWritingToolsResultList = NSWritingToolsResultOptions(4L)
        val NSWritingToolsResultTable = NSWritingToolsResultOptions(8L)
        val NSWritingToolsResultPresentationIntent = NSWritingToolsResultOptions(16L)
    }

    operator fun plus(o: NSWritingToolsResultOptions) = NSWritingToolsResultOptions(rawValue or o.rawValue)
    operator fun contains(o: NSWritingToolsResultOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextInsertionIndicatorAutomaticModeOptions}
 */
@JvmInline
value class NSTextInsertionIndicatorAutomaticModeOptions(val rawValue: Long) {
    companion object {
        val NSTextInsertionIndicatorAutomaticModeOptionsShowEffectsView = NSTextInsertionIndicatorAutomaticModeOptions(1L)
        val NSTextInsertionIndicatorAutomaticModeOptionsShowWhileTracking = NSTextInsertionIndicatorAutomaticModeOptions(2L)
    }

    operator fun plus(o: NSTextInsertionIndicatorAutomaticModeOptions) = NSTextInsertionIndicatorAutomaticModeOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTextInsertionIndicatorAutomaticModeOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSUnderlineStyle}
 */
@JvmInline
value class NSUnderlineStyle(val rawValue: Long) {
    companion object {
        val NSUnderlineStyleNone = NSUnderlineStyle(0L)
        val NSUnderlineStyleSingle = NSUnderlineStyle(1L)
        val NSUnderlineStyleThick = NSUnderlineStyle(2L)
        val NSUnderlineStyleDouble = NSUnderlineStyle(9L)
        val NSUnderlineStylePatternSolid = NSUnderlineStyle(0L)
        val NSUnderlineStylePatternDot = NSUnderlineStyle(256L)
        val NSUnderlineStylePatternDash = NSUnderlineStyle(512L)
        val NSUnderlineStylePatternDashDot = NSUnderlineStyle(768L)
        val NSUnderlineStylePatternDashDotDot = NSUnderlineStyle(1024L)
        val NSUnderlineStyleByWord = NSUnderlineStyle(32768L)
    }

    operator fun plus(o: NSUnderlineStyle) = NSUnderlineStyle(rawValue or o.rawValue)
    operator fun contains(o: NSUnderlineStyle) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextStorageEditActions}
 */
@JvmInline
value class NSTextStorageEditActions(val rawValue: Long) {
    companion object {
        val NSTextStorageEditedAttributes = NSTextStorageEditActions(1L)
        val NSTextStorageEditedCharacters = NSTextStorageEditActions(2L)
    }

    operator fun plus(o: NSTextStorageEditActions) = NSTextStorageEditActions(rawValue or o.rawValue)
    operator fun contains(o: NSTextStorageEditActions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSGlyphProperty}
 */
@JvmInline
value class NSGlyphProperty(val rawValue: Long) {
    companion object {
        val NSGlyphPropertyNull = NSGlyphProperty(1L)
        val NSGlyphPropertyControlCharacter = NSGlyphProperty(2L)
        val NSGlyphPropertyElastic = NSGlyphProperty(4L)
        val NSGlyphPropertyNonBaseCharacter = NSGlyphProperty(8L)
    }

    operator fun plus(o: NSGlyphProperty) = NSGlyphProperty(rawValue or o.rawValue)
    operator fun contains(o: NSGlyphProperty) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSControlCharacterAction}
 */
@JvmInline
value class NSControlCharacterAction(val rawValue: Long) {
    companion object {
        val NSControlCharacterActionZeroAdvancement = NSControlCharacterAction(1L)
        val NSControlCharacterActionWhitespace = NSControlCharacterAction(2L)
        val NSControlCharacterActionHorizontalTab = NSControlCharacterAction(4L)
        val NSControlCharacterActionLineBreak = NSControlCharacterAction(8L)
        val NSControlCharacterActionParagraphBreak = NSControlCharacterAction(16L)
        val NSControlCharacterActionContainerBreak = NSControlCharacterAction(32L)
    }

    operator fun plus(o: NSControlCharacterAction) = NSControlCharacterAction(rawValue or o.rawValue)
    operator fun contains(o: NSControlCharacterAction) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTrackingAreaOptions}
 */
@JvmInline
value class NSTrackingAreaOptions(val rawValue: Long) {
    companion object {
        val NSTrackingMouseEnteredAndExited = NSTrackingAreaOptions(1L)
        val NSTrackingMouseMoved = NSTrackingAreaOptions(2L)
        val NSTrackingCursorUpdate = NSTrackingAreaOptions(4L)
        val NSTrackingActiveWhenFirstResponder = NSTrackingAreaOptions(16L)
        val NSTrackingActiveInKeyWindow = NSTrackingAreaOptions(32L)
        val NSTrackingActiveInActiveApp = NSTrackingAreaOptions(64L)
        val NSTrackingActiveAlways = NSTrackingAreaOptions(128L)
        val NSTrackingAssumeInside = NSTrackingAreaOptions(256L)
        val NSTrackingInVisibleRect = NSTrackingAreaOptions(512L)
        val NSTrackingEnabledDuringMouseDrag = NSTrackingAreaOptions(1024L)
    }

    operator fun plus(o: NSTrackingAreaOptions) = NSTrackingAreaOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTrackingAreaOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTableViewGridLineStyle}
 */
@JvmInline
value class NSTableViewGridLineStyle(val rawValue: Long) {
    companion object {
        val NSTableViewGridNone = NSTableViewGridLineStyle(0L)
        val NSTableViewSolidVerticalGridLineMask = NSTableViewGridLineStyle(1L)
        val NSTableViewSolidHorizontalGridLineMask = NSTableViewGridLineStyle(2L)
        val NSTableViewDashedHorizontalGridLineMask = NSTableViewGridLineStyle(8L)
    }

    operator fun plus(o: NSTableViewGridLineStyle) = NSTableViewGridLineStyle(rawValue or o.rawValue)
    operator fun contains(o: NSTableViewGridLineStyle) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTableViewAnimationOptions}
 */
@JvmInline
value class NSTableViewAnimationOptions(val rawValue: Long) {
    companion object {
        val NSTableViewAnimationEffectNone = NSTableViewAnimationOptions(0L)
        val NSTableViewAnimationEffectFade = NSTableViewAnimationOptions(1L)
        val NSTableViewAnimationEffectGap = NSTableViewAnimationOptions(2L)
        val NSTableViewAnimationSlideUp = NSTableViewAnimationOptions(16L)
        val NSTableViewAnimationSlideDown = NSTableViewAnimationOptions(32L)
        val NSTableViewAnimationSlideLeft = NSTableViewAnimationOptions(48L)
        val NSTableViewAnimationSlideRight = NSTableViewAnimationOptions(64L)
    }

    operator fun plus(o: NSTableViewAnimationOptions) = NSTableViewAnimationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTableViewAnimationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTableColumnResizingOptions}
 */
@JvmInline
value class NSTableColumnResizingOptions(val rawValue: Long) {
    companion object {
        val NSTableColumnNoResizing = NSTableColumnResizingOptions(0L)
        val NSTableColumnAutoresizingMask = NSTableColumnResizingOptions(1L)
        val NSTableColumnUserResizingMask = NSTableColumnResizingOptions(2L)
    }

    operator fun plus(o: NSTableColumnResizingOptions) = NSTableColumnResizingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTableColumnResizingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSStringDrawingOptions}
 */
@JvmInline
value class NSStringDrawingOptions(val rawValue: Long) {
    companion object {
        val NSStringDrawingUsesLineFragmentOrigin = NSStringDrawingOptions(1L)
        val NSStringDrawingUsesFontLeading = NSStringDrawingOptions(2L)
        val NSStringDrawingUsesDeviceMetrics = NSStringDrawingOptions(8L)
        val NSStringDrawingTruncatesLastVisibleLine = NSStringDrawingOptions(32L)
        val NSStringDrawingOptionsResolvesNaturalAlignmentWithBaseWritingDirection = NSStringDrawingOptions(512L)
        val NSStringDrawingDisableScreenFontSubstitution = NSStringDrawingOptions(4L)
        val NSStringDrawingOneShot = NSStringDrawingOptions(16L)
    }

    operator fun plus(o: NSStringDrawingOptions) = NSStringDrawingOptions(rawValue or o.rawValue)
    operator fun contains(o: NSStringDrawingOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSStatusItemBehavior}
 */
@JvmInline
value class NSStatusItemBehavior(val rawValue: Long) {
    companion object {
        val NSStatusItemBehaviorRemovalAllowed = NSStatusItemBehavior(2L)
        val NSStatusItemBehaviorTerminationOnRemoval = NSStatusItemBehavior(4L)
    }

    operator fun plus(o: NSStatusItemBehavior) = NSStatusItemBehavior(rawValue or o.rawValue)
    operator fun contains(o: NSStatusItemBehavior) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CAAutoresizingMask}
 */
@JvmInline
value class CAAutoresizingMask(val rawValue: Long) {
    companion object {
        val kCALayerNotSizable = CAAutoresizingMask(0L)
        val kCALayerMinXMargin = CAAutoresizingMask(1L)
        val kCALayerWidthSizable = CAAutoresizingMask(2L)
        val kCALayerMaxXMargin = CAAutoresizingMask(4L)
        val kCALayerMinYMargin = CAAutoresizingMask(8L)
        val kCALayerHeightSizable = CAAutoresizingMask(16L)
        val kCALayerMaxYMargin = CAAutoresizingMask(32L)
    }

    operator fun plus(o: CAAutoresizingMask) = CAAutoresizingMask(rawValue or o.rawValue)
    operator fun contains(o: CAAutoresizingMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CAEdgeAntialiasingMask}
 */
@JvmInline
value class CAEdgeAntialiasingMask(val rawValue: Long) {
    companion object {
        val kCALayerLeftEdge = CAEdgeAntialiasingMask(1L)
        val kCALayerRightEdge = CAEdgeAntialiasingMask(2L)
        val kCALayerBottomEdge = CAEdgeAntialiasingMask(4L)
        val kCALayerTopEdge = CAEdgeAntialiasingMask(8L)
    }

    operator fun plus(o: CAEdgeAntialiasingMask) = CAEdgeAntialiasingMask(rawValue or o.rawValue)
    operator fun contains(o: CAEdgeAntialiasingMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum CACornerMask}
 */
@JvmInline
value class CACornerMask(val rawValue: Long) {
    companion object {
        val kCALayerMinXMinYCorner = CACornerMask(1L)
        val kCALayerMaxXMinYCorner = CACornerMask(2L)
        val kCALayerMinXMaxYCorner = CACornerMask(4L)
        val kCALayerMaxXMaxYCorner = CACornerMask(8L)
    }

    operator fun plus(o: CACornerMask) = CACornerMask(rawValue or o.rawValue)
    operator fun contains(o: CACornerMask) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTypesetterControlCharacterAction}
 */
@JvmInline
value class NSTypesetterControlCharacterAction(val rawValue: Long) {
    companion object {
        val NSTypesetterZeroAdvancementAction = NSTypesetterControlCharacterAction(1L)
        val NSTypesetterWhitespaceAction = NSTypesetterControlCharacterAction(2L)
        val NSTypesetterHorizontalTabAction = NSTypesetterControlCharacterAction(4L)
        val NSTypesetterLineBreakAction = NSTypesetterControlCharacterAction(8L)
        val NSTypesetterParagraphBreakAction = NSTypesetterControlCharacterAction(16L)
        val NSTypesetterContainerBreakAction = NSTypesetterControlCharacterAction(32L)
    }

    operator fun plus(o: NSTypesetterControlCharacterAction) = NSTypesetterControlCharacterAction(rawValue or o.rawValue)
    operator fun contains(o: NSTypesetterControlCharacterAction) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextListOptions}
 */
@JvmInline
value class NSTextListOptions(val rawValue: Long) {
    companion object {
        val NSTextListPrependEnclosingMarker = NSTextListOptions(1L)
    }

    operator fun plus(o: NSTextListOptions) = NSTextListOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTextListOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSDatePickerElementFlags}
 */
@JvmInline
value class NSDatePickerElementFlags(val rawValue: Long) {
    companion object {
        val NSDatePickerElementFlagHourMinute = NSDatePickerElementFlags(12L)
        val NSDatePickerElementFlagHourMinuteSecond = NSDatePickerElementFlags(14L)
        val NSDatePickerElementFlagTimeZone = NSDatePickerElementFlags(16L)
        val NSDatePickerElementFlagYearMonth = NSDatePickerElementFlags(192L)
        val NSDatePickerElementFlagYearMonthDay = NSDatePickerElementFlags(224L)
        val NSDatePickerElementFlagEra = NSDatePickerElementFlags(256L)
    }

    operator fun plus(o: NSDatePickerElementFlags) = NSDatePickerElementFlags(rawValue or o.rawValue)
    operator fun contains(o: NSDatePickerElementFlags) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextSelectionNavigationModifier}
 */
@JvmInline
value class NSTextSelectionNavigationModifier(val rawValue: Long) {
    companion object {
        val NSTextSelectionNavigationModifierExtend = NSTextSelectionNavigationModifier(1L)
        val NSTextSelectionNavigationModifierVisual = NSTextSelectionNavigationModifier(2L)
        val NSTextSelectionNavigationModifierMultiple = NSTextSelectionNavigationModifier(4L)
    }

    operator fun plus(o: NSTextSelectionNavigationModifier) = NSTextSelectionNavigationModifier(rawValue or o.rawValue)
    operator fun contains(o: NSTextSelectionNavigationModifier) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextContentManagerEnumerationOptions}
 */
@JvmInline
value class NSTextContentManagerEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSTextContentManagerEnumerationOptionsNone = NSTextContentManagerEnumerationOptions(0L)
        val NSTextContentManagerEnumerationOptionsReverse = NSTextContentManagerEnumerationOptions(1L)
    }

    operator fun plus(o: NSTextContentManagerEnumerationOptions) = NSTextContentManagerEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTextContentManagerEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextLayoutFragmentEnumerationOptions}
 */
@JvmInline
value class NSTextLayoutFragmentEnumerationOptions(val rawValue: Long) {
    companion object {
        val NSTextLayoutFragmentEnumerationOptionsNone = NSTextLayoutFragmentEnumerationOptions(0L)
        val NSTextLayoutFragmentEnumerationOptionsReverse = NSTextLayoutFragmentEnumerationOptions(1L)
        val NSTextLayoutFragmentEnumerationOptionsEstimatesSize = NSTextLayoutFragmentEnumerationOptions(2L)
        val NSTextLayoutFragmentEnumerationOptionsEnsuresLayout = NSTextLayoutFragmentEnumerationOptions(4L)
        val NSTextLayoutFragmentEnumerationOptionsEnsuresExtraLineFragment = NSTextLayoutFragmentEnumerationOptions(8L)
    }

    operator fun plus(o: NSTextLayoutFragmentEnumerationOptions) = NSTextLayoutFragmentEnumerationOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTextLayoutFragmentEnumerationOptions) = (rawValue and o.rawValue) != 0L
}

/**
 * NS_OPTIONS: {@snippet lang=c : enum NSTextLayoutManagerSegmentOptions}
 */
@JvmInline
value class NSTextLayoutManagerSegmentOptions(val rawValue: Long) {
    companion object {
        val NSTextLayoutManagerSegmentOptionsNone = NSTextLayoutManagerSegmentOptions(0L)
        val NSTextLayoutManagerSegmentOptionsRangeNotRequired = NSTextLayoutManagerSegmentOptions(1L)
        val NSTextLayoutManagerSegmentOptionsMiddleFragmentsExcluded = NSTextLayoutManagerSegmentOptions(2L)
        val NSTextLayoutManagerSegmentOptionsHeadSegmentExtended = NSTextLayoutManagerSegmentOptions(4L)
        val NSTextLayoutManagerSegmentOptionsTailSegmentExtended = NSTextLayoutManagerSegmentOptions(8L)
        val NSTextLayoutManagerSegmentOptionsUpstreamAffinity = NSTextLayoutManagerSegmentOptions(16L)
    }

    operator fun plus(o: NSTextLayoutManagerSegmentOptions) = NSTextLayoutManagerSegmentOptions(rawValue or o.rawValue)
    operator fun contains(o: NSTextLayoutManagerSegmentOptions) = (rawValue and o.rawValue) != 0L
}
