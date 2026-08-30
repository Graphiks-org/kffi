@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPageControllerDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSPageControllerDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageController_identifierForObject(pageController: MemorySegment, `object`: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'pageController:identifierForObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageController_viewControllerForIdentifier(pageController: MemorySegment, identifier: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'pageController:viewControllerForIdentifier:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageController_frameForObject(pageController: MemorySegment, `object`: MemorySegment): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'pageController:frameForObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageController_prepareViewController_withObject(pageController: MemorySegment, viewController: MemorySegment, `object`: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageController:prepareViewController:withObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageController_didTransitionToObject(pageController: MemorySegment, `object`: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageController:didTransitionToObject:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageControllerWillStartLiveTransition(pageController: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageControllerWillStartLiveTransition:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun pageControllerDidEndLiveTransition(pageController: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'pageControllerDidEndLiveTransition:' not implemented")

}
