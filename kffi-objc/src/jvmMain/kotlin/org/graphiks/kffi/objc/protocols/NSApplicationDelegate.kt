@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSApplicationDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSApplicationDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationShouldTerminate(sender: MemorySegment): NSApplicationTerminateReply =
        throw UnsupportedOperationException("Optional ObjC method 'applicationShouldTerminate:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    // @optional
    fun application_openURLs(application: MemorySegment, urls: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:openURLs:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_openFile(sender: MemorySegment, filename: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:openFile:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_openFiles(sender: MemorySegment, filenames: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:openFiles:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_openTempFile(sender: MemorySegment, filename: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:openTempFile:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationShouldOpenUntitledFile(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'applicationShouldOpenUntitledFile:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationOpenUntitledFile(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'applicationOpenUntitledFile:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_openFileWithoutUI(sender: MemorySegment, filename: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:openFileWithoutUI:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_printFile(sender: MemorySegment, filename: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:printFile:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_printFiles_withSettings_showPrintPanels(application: MemorySegment, fileNames: MemorySegment, printSettings: MemorySegment, showPrintPanels: Boolean): NSApplicationPrintReply =
        throw UnsupportedOperationException("Optional ObjC method 'application:printFiles:withSettings:showPrintPanels:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationShouldTerminateAfterLastWindowClosed(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'applicationShouldTerminateAfterLastWindowClosed:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationShouldHandleReopen_hasVisibleWindows(sender: MemorySegment, hasVisibleWindows: Boolean): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'applicationShouldHandleReopen:hasVisibleWindows:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDockMenu(sender: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDockMenu:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_willPresentError(application: MemorySegment, error: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'application:willPresentError:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun application_didRegisterForRemoteNotificationsWithDeviceToken(application: MemorySegment, deviceToken: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:didRegisterForRemoteNotificationsWithDeviceToken:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun application_didFailToRegisterForRemoteNotificationsWithError(application: MemorySegment, error: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:didFailToRegisterForRemoteNotificationsWithError:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun application_didReceiveRemoteNotification(application: MemorySegment, userInfo: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:didReceiveRemoteNotification:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun applicationSupportsSecureRestorableState(app: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'applicationSupportsSecureRestorableState:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun application_handlerForIntent(application: MemorySegment, intent: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'application:handlerForIntent:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun application_willEncodeRestorableState(app: MemorySegment, coder: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:willEncodeRestorableState:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun application_didDecodeRestorableState(app: MemorySegment, coder: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:didDecodeRestorableState:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun application_willContinueUserActivityWithType(application: MemorySegment, userActivityType: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:willContinueUserActivityWithType:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun application_continueUserActivity_restorationHandler(application: MemorySegment, userActivity: MemorySegment, restorationHandler: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:continueUserActivity:restorationHandler:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun application_didFailToContinueUserActivityWithType_error(application: MemorySegment, userActivityType: MemorySegment, error: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:didFailToContinueUserActivityWithType:error:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    // @optional
    fun application_didUpdateUserActivity(application: MemorySegment, userActivity: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:didUpdateUserActivity:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    // @optional
    fun application_userDidAcceptCloudKitShareWithMetadata(application: MemorySegment, metadata: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'application:userDidAcceptCloudKitShareWithMetadata:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun application_delegateHandlesKey(sender: MemorySegment, key: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'application:delegateHandlesKey:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun applicationShouldAutomaticallyLocalizeKeyEquivalents(application: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'applicationShouldAutomaticallyLocalizeKeyEquivalents:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillFinishLaunching(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillFinishLaunching:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidFinishLaunching(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidFinishLaunching:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillHide(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillHide:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidHide(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidHide:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillUnhide(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillUnhide:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidUnhide(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidUnhide:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillBecomeActive(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillBecomeActive:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidBecomeActive(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidBecomeActive:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillResignActive(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillResignActive:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidResignActive(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidResignActive:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillUpdate(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillUpdate:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidUpdate(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidUpdate:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationWillTerminate(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationWillTerminate:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun applicationDidChangeScreenParameters(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidChangeScreenParameters:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    // @optional
    fun applicationDidChangeOcclusionState(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationDidChangeOcclusionState:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun applicationProtectedDataWillBecomeUnavailable(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationProtectedDataWillBecomeUnavailable:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun applicationProtectedDataDidBecomeAvailable(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applicationProtectedDataDidBecomeAvailable:' not implemented")

}
