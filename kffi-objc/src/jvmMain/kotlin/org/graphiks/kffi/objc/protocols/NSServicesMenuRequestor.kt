@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSServicesMenuRequestor
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSServicesMenuRequestor {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun writeSelectionToPasteboard_types(pboard: MemorySegment, types: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'writeSelectionToPasteboard:types:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun readSelectionFromPasteboard(pboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'readSelectionFromPasteboard:' not implemented")

}
