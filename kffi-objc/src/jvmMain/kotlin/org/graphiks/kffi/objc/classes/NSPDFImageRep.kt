@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPDFImageRep
 * Superclass: NSImageRep
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPDFImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPDFImageRep") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithData(pdfData: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pdfData) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithData(pdfData: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, pdfData) as MemorySegment
    }

    // @property PDFRepresentation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun PDFRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("PDFRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property bounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bounds(): NSRect {
        val sel = ObjCRuntime.sel("bounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property currentPage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun currentPage(): Long {
        val sel = ObjCRuntime.sel("currentPage")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCurrentPage(value: Long) {
        val sel = ObjCRuntime.sel("setCurrentPage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pageCount
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pageCount(): Long {
        val sel = ObjCRuntime.sel("pageCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
