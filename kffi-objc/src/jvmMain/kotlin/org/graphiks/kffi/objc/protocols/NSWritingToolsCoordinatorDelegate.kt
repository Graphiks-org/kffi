@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSWritingToolsCoordinatorDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
interface NSWritingToolsCoordinatorDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_requestsContextsForScope_completion(writingToolsCoordinator: MemorySegment, scope: NSWritingToolsCoordinatorContextScope, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_replaceRange_inContext_proposedText_reason_animationParameters_completion(writingToolsCoordinator: MemorySegment, range: NSRange, context: MemorySegment, replacementText: MemorySegment, reason: NSWritingToolsCoordinatorTextReplacementReason, animationParameters: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_selectRanges_inContext_completion(writingToolsCoordinator: MemorySegment, ranges: MemorySegment, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_requestsBoundingBezierPathsForRange_inContext_completion(writingToolsCoordinator: MemorySegment, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_requestsUnderlinePathsForRange_inContext_completion(writingToolsCoordinator: MemorySegment, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_prepareForTextAnimation_forRange_inContext_completion(writingToolsCoordinator: MemorySegment, textAnimation: NSWritingToolsCoordinatorTextAnimation, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_requestsPreviewForTextAnimation_ofRange_inContext_completion(writingToolsCoordinator: MemorySegment, textAnimation: NSWritingToolsCoordinatorTextAnimation, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_requestsPreviewForRect_inContext_completion(writingToolsCoordinator: MemorySegment, rect: NSRect, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writingToolsCoordinator_finishTextAnimation_forRange_inContext_completion(writingToolsCoordinator: MemorySegment, textAnimation: NSWritingToolsCoordinatorTextAnimation, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun writingToolsCoordinator_requestsSingleContainerSubrangesOfRange_inContext_completion(writingToolsCoordinator: MemorySegment, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'writingToolsCoordinator:requestsSingleContainerSubrangesOfRange:inContext:completion:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun writingToolsCoordinator_requestsDecorationContainerViewForRange_inContext_completion(writingToolsCoordinator: MemorySegment, range: NSRange, context: MemorySegment, completion: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'writingToolsCoordinator:requestsDecorationContainerViewForRange:inContext:completion:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun writingToolsCoordinator_willChangeToState_completion(writingToolsCoordinator: MemorySegment, newState: NSWritingToolsCoordinatorState, completion: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'writingToolsCoordinator:willChangeToState:completion:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 4, deprecatedSubminor = -1, message = "In macOS 15.4 and later, NSWritingToolsCoordinator automatically determines the location of the character at the specified point in your view's coordinate system and no longer calls this method.")
    // @optional
    fun writingToolsCoordinator_requestsRangeInContextWithIdentifierForPoint_completion(writingToolsCoordinator: MemorySegment, point: NSPoint, completion: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'writingToolsCoordinator:requestsRangeInContextWithIdentifierForPoint:completion:' not implemented")

}
