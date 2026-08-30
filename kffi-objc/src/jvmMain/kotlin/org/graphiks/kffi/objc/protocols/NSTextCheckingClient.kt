@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextCheckingClient
 * Inherits protocols: NSTextInputClient, NSTextInputTraits
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTextCheckingClient : NSTextInputClient, NSTextInputTraits {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun annotatedSubstringForProposedRange_actualRange(range: NSRange, actualRange: NSRangePointer): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setAnnotations_range(annotations: MemorySegment, range: NSRange): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun addAnnotations_range(annotations: MemorySegment, range: NSRange): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun removeAnnotation_range(annotationName: MemorySegment, range: NSRange): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun replaceCharactersInRange_withAnnotatedString(range: NSRange, annotatedString: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun selectAndShowRange(range: NSRange): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun viewForRange_firstRect_actualRange(range: NSRange, firstRect: NSRectPointer, actualRange: NSRangePointer): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun candidateListTouchBarItem(): MemorySegment

}
