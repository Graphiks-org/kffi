@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSGestureRecognizerDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSGestureRecognizerDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun gestureRecognizer_shouldAttemptToRecognizeWithEvent(gestureRecognizer: MemorySegment, event: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'gestureRecognizer:shouldAttemptToRecognizeWithEvent:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun gestureRecognizerShouldBegin(gestureRecognizer: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'gestureRecognizerShouldBegin:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun gestureRecognizer_shouldRecognizeSimultaneouslyWithGestureRecognizer(gestureRecognizer: MemorySegment, otherGestureRecognizer: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun gestureRecognizer_shouldRequireFailureOfGestureRecognizer(gestureRecognizer: MemorySegment, otherGestureRecognizer: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'gestureRecognizer:shouldRequireFailureOfGestureRecognizer:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun gestureRecognizer_shouldBeRequiredToFailByGestureRecognizer(gestureRecognizer: MemorySegment, otherGestureRecognizer: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun gestureRecognizer_shouldReceiveTouch(gestureRecognizer: MemorySegment, touch: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'gestureRecognizer:shouldReceiveTouch:' not implemented")

}
