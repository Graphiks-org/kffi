package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextInput
 */
interface NSTextInput {
    fun insertText(string: MemorySegment): Unit

    fun doCommandBySelector(selector: MemorySegment): Unit

    fun setMarkedText_selectedRange(string: MemorySegment, selRange: NSRange): Unit

    fun unmarkText(): Unit

    fun hasMarkedText(): Boolean

    fun conversationIdentifier(): Long

    fun attributedSubstringFromRange(range: NSRange): MemorySegment

    fun markedRange(): NSRange

    fun selectedRange(): NSRange

    fun firstRectForCharacterRange(range: NSRange): NSRect

    fun characterIndexForPoint(point: NSPoint): Long

    fun validAttributesForMarkedText(): MemorySegment

}
