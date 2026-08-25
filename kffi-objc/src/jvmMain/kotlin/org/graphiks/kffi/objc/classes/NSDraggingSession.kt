package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDraggingSession
 * Superclass: NSObject
 */
open class NSDraggingSession(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDraggingSession") }

    }

    open fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: NSDraggingItemEnumerationOptions, view: MemorySegment, classArray: MemorySegment, searchOptions: MemorySegment, block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:")
        ObjCRuntime.msgSend(null, ptr, sel, enumOpts.rawValue, view, classArray, searchOptions, block)
    }

    // @property draggingFormation
    open fun draggingFormation(): NSDraggingFormation {
        val sel = ObjCRuntime.sel("draggingFormation")
        return NSDraggingFormation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDraggingFormation(value: NSDraggingFormation) {
        val sel = ObjCRuntime.sel("setDraggingFormation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property animatesToStartingPositionsOnCancelOrFail
    open fun animatesToStartingPositionsOnCancelOrFail(): Boolean {
        val sel = ObjCRuntime.sel("animatesToStartingPositionsOnCancelOrFail")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAnimatesToStartingPositionsOnCancelOrFail(value: Boolean) {
        val sel = ObjCRuntime.sel("setAnimatesToStartingPositionsOnCancelOrFail:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggingLeaderIndex
    open fun draggingLeaderIndex(): Long {
        val sel = ObjCRuntime.sel("draggingLeaderIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setDraggingLeaderIndex(value: Long) {
        val sel = ObjCRuntime.sel("setDraggingLeaderIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggingPasteboard
    open fun draggingPasteboard(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingPasteboard")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property draggingSequenceNumber
    open fun draggingSequenceNumber(): Long {
        val sel = ObjCRuntime.sel("draggingSequenceNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property draggingLocation
    open fun draggingLocation(): NSPoint {
        val sel = ObjCRuntime.sel("draggingLocation")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

}
