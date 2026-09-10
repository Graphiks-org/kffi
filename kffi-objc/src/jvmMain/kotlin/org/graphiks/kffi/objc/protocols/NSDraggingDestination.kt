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

/**
 * Generated adapter for a borrowed Objective-C receiver conforming to [NSDraggingDestination].
 * The caller owns the native pointer lifetime and must not retain this adapter past it.
 */
private class NSDraggingDestinationPointerReceiver(private val ptr: MemorySegment) : NSDraggingDestination {
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingEntered(sender: MemorySegment): NSDragOperation {
        val sel = ObjCRuntime.sel("draggingEntered:")
        return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, sender) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingUpdated(sender: MemorySegment): NSDragOperation {
        val sel = ObjCRuntime.sel("draggingUpdated:")
        return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, sender) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingExited(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("draggingExited:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun prepareForDragOperation(sender: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("prepareForDragOperation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, sender) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun performDragOperation(sender: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performDragOperation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, sender) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun concludeDragOperation(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("concludeDragOperation:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingEnded(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("draggingEnded:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun wantsPeriodicDraggingUpdates(): Boolean {
        val sel = ObjCRuntime.sel("wantsPeriodicDraggingUpdates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun updateDraggingItemsForDrag(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateDraggingItemsForDrag:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

}

/** Wraps this borrowed native receiver as [NSDraggingDestination] without retaining it. */
fun MemorySegment.asNSDraggingDestination(): NSDraggingDestination = NSDraggingDestinationPointerReceiver(this)
