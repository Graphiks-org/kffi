@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSUserNotificationCenterDelegate
 * Inherits protocols: NSObject
 */
interface NSUserNotificationCenterDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun userNotificationCenter_didDeliverNotification(center: MemorySegment, notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'userNotificationCenter:didDeliverNotification:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun userNotificationCenter_didActivateNotification(center: MemorySegment, notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'userNotificationCenter:didActivateNotification:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "All NSUserNotifications API should be replaced with UserNotifications.frameworks API")
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    // @optional
    fun userNotificationCenter_shouldPresentNotification(center: MemorySegment, notification: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'userNotificationCenter:shouldPresentNotification:' not implemented")

}
