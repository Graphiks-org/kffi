@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSWindowDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSWindowDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowShouldClose(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'windowShouldClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillReturnFieldEditor_toObject(sender: MemorySegment, client: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillReturnFieldEditor:toObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillResize_toSize(sender: MemorySegment, frameSize: NSSize): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillResize:toSize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillUseStandardFrame_defaultFrame(window: MemorySegment, newFrame: NSRect): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillUseStandardFrame:defaultFrame:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowShouldZoom_toFrame(window: MemorySegment, newFrame: NSRect): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'windowShouldZoom:toFrame:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillReturnUndoManager(window: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillReturnUndoManager:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun window_willPositionSheet_usingRect(window: MemorySegment, sheet: MemorySegment, rect: NSRect): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'window:willPositionSheet:usingRect:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun window_shouldPopUpDocumentPathMenu(window: MemorySegment, menu: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'window:shouldPopUpDocumentPathMenu:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun window_shouldDragDocumentWithEvent_from_withPasteboard(window: MemorySegment, event: MemorySegment, dragImageLocation: NSPoint, pasteboard: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'window:shouldDragDocumentWithEvent:from:withPasteboard:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_willUseFullScreenContentSize(window: MemorySegment, proposedSize: NSSize): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'window:willUseFullScreenContentSize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_willUseFullScreenPresentationOptions(window: MemorySegment, proposedOptions: NSApplicationPresentationOptions): NSApplicationPresentationOptions =
        throw UnsupportedOperationException("Optional ObjC method 'window:willUseFullScreenPresentationOptions:' not implemented")

    /** @return NSArray<NSWindow *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun customWindowsToEnterFullScreenForWindow(window: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'customWindowsToEnterFullScreenForWindow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_startCustomAnimationToEnterFullScreenWithDuration(window: MemorySegment, duration: Double): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'window:startCustomAnimationToEnterFullScreenWithDuration:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidFailToEnterFullScreen(window: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidFailToEnterFullScreen:' not implemented")

    /** @return NSArray<NSWindow *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun customWindowsToExitFullScreenForWindow(window: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'customWindowsToExitFullScreenForWindow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_startCustomAnimationToExitFullScreenWithDuration(window: MemorySegment, duration: Double): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'window:startCustomAnimationToExitFullScreenWithDuration:' not implemented")

    /** @return NSArray<NSWindow *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    // @optional
    fun customWindowsToEnterFullScreenForWindow_onScreen(window: MemorySegment, screen: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'customWindowsToEnterFullScreenForWindow:onScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    // @optional
    fun window_startCustomAnimationToEnterFullScreenOnScreen_withDuration(window: MemorySegment, screen: MemorySegment, duration: Double): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'window:startCustomAnimationToEnterFullScreenOnScreen:withDuration:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidFailToExitFullScreen(window: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidFailToExitFullScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_willResizeForVersionBrowserWithMaxPreferredSize_maxAllowedSize(window: MemorySegment, maxPreferredFrameSize: NSSize, maxAllowedFrameSize: NSSize): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'window:willResizeForVersionBrowserWithMaxPreferredSize:maxAllowedSize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_willEncodeRestorableState(window: MemorySegment, state: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'window:willEncodeRestorableState:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun window_didDecodeRestorableState(window: MemorySegment, state: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'window:didDecodeRestorableState:' not implemented")

    /** @return NSArray<id<NSPreviewRepresentableActivityItem>> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 2, introducedSubminor = -1)
    // @optional
    fun previewRepresentableActivityItemsForWindow(window: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'previewRepresentableActivityItemsForWindow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun windowForSharingRequestFromWindow(window: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'windowForSharingRequestFromWindow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidResize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidResize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidExpose(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidExpose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillMove(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillMove:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidMove(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidMove:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidBecomeKey(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidBecomeKey:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidResignKey(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidResignKey:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidBecomeMain(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidBecomeMain:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidResignMain(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidResignMain:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillClose(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillMiniaturize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillMiniaturize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidMiniaturize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidMiniaturize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidDeminiaturize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidDeminiaturize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidUpdate(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidUpdate:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidChangeScreen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidChangeScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidChangeScreenProfile(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidChangeScreenProfile:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidChangeBackingProperties(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidChangeBackingProperties:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowWillBeginSheet(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillBeginSheet:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun windowDidEndSheet(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidEndSheet:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun windowWillStartLiveResize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillStartLiveResize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun windowDidEndLiveResize(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidEndLiveResize:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowWillEnterFullScreen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillEnterFullScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidEnterFullScreen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidEnterFullScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowWillExitFullScreen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillExitFullScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidExitFullScreen(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidExitFullScreen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowWillEnterVersionBrowser(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillEnterVersionBrowser:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidEnterVersionBrowser(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidEnterVersionBrowser:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowWillExitVersionBrowser(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowWillExitVersionBrowser:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun windowDidExitVersionBrowser(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidExitVersionBrowser:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    // @optional
    fun windowDidChangeOcclusionState(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'windowDidChangeOcclusionState:' not implemented")

}
