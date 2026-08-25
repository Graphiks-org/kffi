package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPDFImageRep
 * Superclass: NSImageRep
 */
open class NSPDFImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPDFImageRep") }

        fun imageRepWithData(pdfData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pdfData) as MemorySegment
        }

    }

    open fun initWithData(pdfData: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pdfData) as MemorySegment
    }

    // @property PDFRepresentation
    open fun PDFRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("PDFRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property bounds
    open fun bounds(): NSRect {
        val sel = ObjCRuntime.sel("bounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property currentPage
    open fun currentPage(): Long {
        val sel = ObjCRuntime.sel("currentPage")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setCurrentPage(value: Long) {
        val sel = ObjCRuntime.sel("setCurrentPage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pageCount
    open fun pageCount(): Long {
        val sel = ObjCRuntime.sel("pageCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
