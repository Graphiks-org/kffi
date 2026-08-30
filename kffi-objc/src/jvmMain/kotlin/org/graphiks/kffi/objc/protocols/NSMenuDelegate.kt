@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSMenuDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSMenuDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun menuNeedsUpdate(menu: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'menuNeedsUpdate:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun numberOfItemsInMenu(menu: MemorySegment): Long =
        throw UnsupportedOperationException("Optional ObjC method 'numberOfItemsInMenu:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun menu_updateItem_atIndex_shouldCancel(menu: MemorySegment, item: MemorySegment, index: Long, shouldCancel: Boolean): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'menu:updateItem:atIndex:shouldCancel:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun menuHasKeyEquivalent_forEvent_target_action(menu: MemorySegment, event: MemorySegment, target: MemorySegment, action: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'menuHasKeyEquivalent:forEvent:target:action:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun menuWillOpen(menu: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'menuWillOpen:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun menuDidClose(menu: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'menuDidClose:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun menu_willHighlightItem(menu: MemorySegment, item: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'menu:willHighlightItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    // @optional
    fun confinementRectForMenu_onScreen(menu: MemorySegment, screen: MemorySegment): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'confinementRectForMenu:onScreen:' not implemented")

}
