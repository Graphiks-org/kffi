package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSEPSImageRep
 * Superclass: NSImageRep
 */
open class NSEPSImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSEPSImageRep") }

        fun imageRepWithData(epsData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, epsData) as MemorySegment
        }

    }

    open fun initWithData(epsData: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, epsData) as MemorySegment
    }

    open fun prepareGState(): Unit {
        val sel = ObjCRuntime.sel("prepareGState")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property boundingBox
    open fun boundingBox(): NSRect {
        val sel = ObjCRuntime.sel("boundingBox")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property EPSRepresentation
    open fun EPSRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("EPSRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
