@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSDrawerDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSDrawerDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerShouldOpen(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'drawerShouldOpen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerShouldClose(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'drawerShouldClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerWillResizeContents_toSize(sender: MemorySegment, contentSize: NSSize): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'drawerWillResizeContents:toSize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerWillOpen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'drawerWillOpen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerDidOpen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'drawerDidOpen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerWillClose(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'drawerWillClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
    // @optional
    fun drawerDidClose(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'drawerDidClose:' not implemented")

}
