@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPopoverDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSPopoverDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun popoverShouldClose(popover: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'popoverShouldClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun popoverShouldDetach(popover: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'popoverShouldDetach:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun popoverDidDetach(popover: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'popoverDidDetach:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun detachableWindowForPopover(popover: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'detachableWindowForPopover:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun popoverWillShow(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'popoverWillShow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun popoverDidShow(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'popoverDidShow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun popoverWillClose(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'popoverWillClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun popoverDidClose(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'popoverDidClose:' not implemented")

}
