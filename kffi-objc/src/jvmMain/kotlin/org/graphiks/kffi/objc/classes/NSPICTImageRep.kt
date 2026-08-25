package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPICTImageRep
 * Superclass: NSImageRep
 */
open class NSPICTImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPICTImageRep") }

        fun imageRepWithData(pictData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pictData) as MemorySegment
        }

    }

    open fun initWithData(pictData: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pictData) as MemorySegment
    }

    // @property PICTRepresentation
    open fun PICTRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("PICTRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property boundingBox
    open fun boundingBox(): NSRect {
        val sel = ObjCRuntime.sel("boundingBox")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

}
