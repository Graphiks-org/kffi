@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSearchFieldDelegate
 * Inherits protocols: NSTextFieldDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSearchFieldDelegate : NSTextFieldDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun searchFieldDidStartSearching(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'searchFieldDidStartSearching:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun searchFieldDidEndSearching(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'searchFieldDidEndSearching:' not implemented")

}
