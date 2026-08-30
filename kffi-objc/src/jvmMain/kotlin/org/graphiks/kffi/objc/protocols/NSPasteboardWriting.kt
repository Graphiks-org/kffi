@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPasteboardWriting
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSPasteboardWriting {
    /** @return NSArray<NSPasteboardType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun writableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun writingOptionsForType_pasteboard(type: MemorySegment, pasteboard: MemorySegment): NSPasteboardWritingOptions =
        throw UnsupportedOperationException("Optional ObjC method 'writingOptionsForType:pasteboard:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun pasteboardPropertyListForType(type: MemorySegment): MemorySegment

}
