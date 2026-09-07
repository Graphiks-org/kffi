@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSDraggingInfo
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSDraggingInfo {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun slideDraggedImageTo(screenPoint: NSPoint): Unit

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    fun namesOfPromisedFilesDroppedAtDestination(dropDestination: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: NSDraggingItemEnumerationOptions, view: MemorySegment, classArray: MemorySegment, searchOptions: MemorySegment, block: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun resetSpringLoading(): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingDestinationWindow(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingSourceOperationMask(): NSDragOperation

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingLocation(): NSPoint

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggedImageLocation(): NSPoint

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDraggingItem objects instead")
    fun draggedImage(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingPasteboard(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingSource(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun draggingSequenceNumber(): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun draggingFormation(): NSDraggingFormation

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun setDraggingFormation(draggingFormation: NSDraggingFormation): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun animatesToDestination(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun setAnimatesToDestination(animatesToDestination: Boolean): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun numberOfValidItemsForDrop(): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun setNumberOfValidItemsForDrop(numberOfValidItemsForDrop: Long): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun springLoadingHighlight(): NSSpringLoadingHighlight

}

/**
 * Generated adapter for a borrowed Objective-C receiver conforming to [NSDraggingInfo].
 * The caller owns the native pointer lifetime and must not retain this adapter past it.
 */
private class NSDraggingInfoPointerReceiver(private val ptr: MemorySegment) : NSDraggingInfo {
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun slideDraggedImageTo(screenPoint: NSPoint): Unit {
        val sel = ObjCRuntime.sel("slideDraggedImageTo:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(screenPoint.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use NSFilePromiseReceiver objects instead")
    override fun namesOfPromisedFilesDroppedAtDestination(dropDestination: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("namesOfPromisedFilesDroppedAtDestination:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, dropDestination) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: NSDraggingItemEnumerationOptions, view: MemorySegment, classArray: MemorySegment, searchOptions: MemorySegment, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, enumOpts.rawValue, view, classArray, searchOptions, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    override fun resetSpringLoading(): Unit {
        val sel = ObjCRuntime.sel("resetSpringLoading")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingDestinationWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingDestinationWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingSourceOperationMask(): NSDragOperation {
        val sel = ObjCRuntime.sel("draggingSourceOperationMask")
        return NSDragOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingLocation(): NSPoint {
        val sel = ObjCRuntime.sel("draggingLocation")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggedImageLocation(): NSPoint {
        val sel = ObjCRuntime.sel("draggedImageLocation")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSDraggingItem objects instead")
    override fun draggedImage(): MemorySegment {
        val sel = ObjCRuntime.sel("draggedImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingPasteboard(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingPasteboard")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingSource(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun draggingSequenceNumber(): Long {
        val sel = ObjCRuntime.sel("draggingSequenceNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun draggingFormation(): NSDraggingFormation {
        val sel = ObjCRuntime.sel("draggingFormation")
        return NSDraggingFormation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun setDraggingFormation(draggingFormation: NSDraggingFormation): Unit {
        val sel = ObjCRuntime.sel("setDraggingFormation:")
        ObjCRuntime.msgSend(null, ptr, sel, draggingFormation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun animatesToDestination(): Boolean {
        val sel = ObjCRuntime.sel("animatesToDestination")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun setAnimatesToDestination(animatesToDestination: Boolean): Unit {
        val sel = ObjCRuntime.sel("setAnimatesToDestination:")
        ObjCRuntime.msgSend(null, ptr, sel, animatesToDestination)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun numberOfValidItemsForDrop(): Long {
        val sel = ObjCRuntime.sel("numberOfValidItemsForDrop")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    override fun setNumberOfValidItemsForDrop(numberOfValidItemsForDrop: Long): Unit {
        val sel = ObjCRuntime.sel("setNumberOfValidItemsForDrop:")
        ObjCRuntime.msgSend(null, ptr, sel, numberOfValidItemsForDrop)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    override fun springLoadingHighlight(): NSSpringLoadingHighlight {
        val sel = ObjCRuntime.sel("springLoadingHighlight")
        return NSSpringLoadingHighlight(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

/** Wraps this borrowed native receiver as [NSDraggingInfo] without retaining it. */
fun MemorySegment.asNSDraggingInfo(): NSDraggingInfo = NSDraggingInfoPointerReceiver(this)
