@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextStorageDelegate
 * Inherits protocols: NSObject
 */
interface NSTextStorageDelegate {
    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun textStorage_willProcessEditing_range_changeInLength(textStorage: MemorySegment, editedMask: NSTextStorageEditActions, editedRange: NSRange, delta: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'textStorage:willProcessEditing:range:changeInLength:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun textStorage_didProcessEditing_range_changeInLength(textStorage: MemorySegment, editedMask: NSTextStorageEditActions, editedRange: NSRange, delta: Long): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'textStorage:didProcessEditing:range:changeInLength:' not implemented")

}
