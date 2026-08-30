@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextFieldDelegate
 * Inherits protocols: NSControlTextEditingDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTextFieldDelegate : NSControlTextEditingDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun textField_textView_candidatesForSelectedRange(textField: MemorySegment, textView: MemorySegment, selectedRange: NSRange): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'textField:textView:candidatesForSelectedRange:' not implemented")

    /** @return NSArray<NSTextCheckingResult *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun textField_textView_candidates_forSelectedRange(textField: MemorySegment, textView: MemorySegment, candidates: MemorySegment, selectedRange: NSRange): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'textField:textView:candidates:forSelectedRange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    // @optional
    fun textField_textView_shouldSelectCandidateAtIndex(textField: MemorySegment, textView: MemorySegment, index: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'textField:textView:shouldSelectCandidateAtIndex:' not implemented")

}
