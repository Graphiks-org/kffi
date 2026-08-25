package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextCheckingClient
 * Inherits protocols: NSTextInputClient, NSTextInputTraits
 */
interface NSTextCheckingClient : NSTextInputClient, NSTextInputTraits {
    fun annotatedSubstringForProposedRange_actualRange(range: NSRange, actualRange: NSRangePointer): MemorySegment

    fun setAnnotations_range(annotations: MemorySegment, range: NSRange): Unit

    fun addAnnotations_range(annotations: MemorySegment, range: NSRange): Unit

    fun removeAnnotation_range(annotationName: MemorySegment, range: NSRange): Unit

    fun replaceCharactersInRange_withAnnotatedString(range: NSRange, annotatedString: MemorySegment): Unit

    fun selectAndShowRange(range: NSRange): Unit

    fun viewForRange_firstRect_actualRange(range: NSRange, firstRect: NSRectPointer, actualRange: NSRangePointer): MemorySegment

    fun candidateListTouchBarItem(): MemorySegment

}
