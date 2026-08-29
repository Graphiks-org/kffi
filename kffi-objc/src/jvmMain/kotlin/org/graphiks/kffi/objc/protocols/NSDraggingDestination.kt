@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSDraggingDestination
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSDraggingDestination {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun draggingEntered(sender: MemorySegment): NSDragOperation =
        throw UnsupportedOperationException("Optional ObjC method 'draggingEntered:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun draggingUpdated(sender: MemorySegment): NSDragOperation =
        throw UnsupportedOperationException("Optional ObjC method 'draggingUpdated:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun draggingExited(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'draggingExited:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun prepareForDragOperation(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'prepareForDragOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun performDragOperation(sender: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'performDragOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun concludeDragOperation(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'concludeDragOperation:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun draggingEnded(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'draggingEnded:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun wantsPeriodicDraggingUpdates(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'wantsPeriodicDraggingUpdates' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    // @optional
    fun updateDraggingItemsForDrag(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'updateDraggingItemsForDrag:' not implemented")

}
