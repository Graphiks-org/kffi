@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSToolbarDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
interface NSToolbarDelegate {
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar(toolbar: MemorySegment, itemIdentifier: MemorySegment, flag: Boolean): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'toolbar:itemForItemIdentifier:willBeInsertedIntoToolbar:' not implemented")

    /** @return NSArray<NSToolbarItemIdentifier> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbarDefaultItemIdentifiers(toolbar: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'toolbarDefaultItemIdentifiers:' not implemented")

    /** @return NSArray<NSToolbarItemIdentifier> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbarAllowedItemIdentifiers(toolbar: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'toolbarAllowedItemIdentifiers:' not implemented")

    /** @return NSArray<NSToolbarItemIdentifier> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbarSelectableItemIdentifiers(toolbar: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'toolbarSelectableItemIdentifiers:' not implemented")

    /** @return NSSet<NSToolbarItemIdentifier> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbarImmovableItemIdentifiers(toolbar: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'toolbarImmovableItemIdentifiers:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 16, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbar_itemIdentifier_canBeInsertedAtIndex(toolbar: MemorySegment, itemIdentifier: MemorySegment, index: Long): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'toolbar:itemIdentifier:canBeInsertedAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbarWillAddItem(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'toolbarWillAddItem:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun toolbarDidRemoveItem(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'toolbarDidRemoveItem:' not implemented")

}
