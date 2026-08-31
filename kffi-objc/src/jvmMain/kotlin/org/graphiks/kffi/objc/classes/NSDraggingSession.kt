@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDraggingSession
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
open class NSDraggingSession(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDraggingSession") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: NSDraggingItemEnumerationOptions, view: MemorySegment, classArray: MemorySegment, searchOptions: MemorySegment, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, enumOpts.rawValue, view, classArray, searchOptions, block)
    }

    // @property draggingFormation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingFormation(): NSDraggingFormation {
        val sel = ObjCRuntime.sel("draggingFormation")
        return NSDraggingFormation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDraggingFormation(value: NSDraggingFormation) {
        val sel = ObjCRuntime.sel("setDraggingFormation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property animatesToStartingPositionsOnCancelOrFail
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun animatesToStartingPositionsOnCancelOrFail(): Boolean {
        val sel = ObjCRuntime.sel("animatesToStartingPositionsOnCancelOrFail")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAnimatesToStartingPositionsOnCancelOrFail(value: Boolean) {
        val sel = ObjCRuntime.sel("setAnimatesToStartingPositionsOnCancelOrFail:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggingLeaderIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingLeaderIndex(): Long {
        val sel = ObjCRuntime.sel("draggingLeaderIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDraggingLeaderIndex(value: Long) {
        val sel = ObjCRuntime.sel("setDraggingLeaderIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggingPasteboard
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingPasteboard(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingPasteboard")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property draggingSequenceNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingSequenceNumber(): Long {
        val sel = ObjCRuntime.sel("draggingSequenceNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property draggingLocation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingLocation(): NSPoint {
        val sel = ObjCRuntime.sel("draggingLocation")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

}
