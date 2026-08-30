@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPasteboardItemDataProvider
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSPasteboardItemDataProvider {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun pasteboard_item_provideDataForType(pasteboard: MemorySegment, item: MemorySegment, type: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pasteboardFinishedWithDataProvider(pasteboard: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pasteboardFinishedWithDataProvider:' not implemented")

}
