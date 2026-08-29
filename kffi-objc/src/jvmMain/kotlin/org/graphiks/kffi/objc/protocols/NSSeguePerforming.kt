@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSeguePerforming
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSeguePerforming {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun prepareForSegue_sender(segue: MemorySegment, sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'prepareForSegue:sender:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun performSegueWithIdentifier_sender(identifier: MemorySegment, sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'performSegueWithIdentifier:sender:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun shouldPerformSegueWithIdentifier_sender(identifier: MemorySegment, sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'shouldPerformSegueWithIdentifier:sender:' not implemented")

}
