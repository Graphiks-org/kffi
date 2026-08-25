package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextPreview
 * Superclass: NSObject
 */
open class NSTextPreview(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextPreview") }

    }

    open fun initWithSnapshotImage_presentationFrame_candidateRects(snapshotImage: CGImageRef, presentationFrame: NSRect, candidateRects: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSnapshotImage:presentationFrame:candidateRects:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, snapshotImage.segment, ObjCRuntime.ObjCStructArg(presentationFrame.segment, NSRect.layout), candidateRects) as MemorySegment
    }

    open fun initWithSnapshotImage_presentationFrame(snapshotImage: CGImageRef, presentationFrame: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSnapshotImage:presentationFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, snapshotImage.segment, ObjCRuntime.ObjCStructArg(presentationFrame.segment, NSRect.layout)) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property previewImage
    open fun previewImage(): CGImageRef {
        val sel = ObjCRuntime.sel("previewImage")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property presentationFrame
    open fun presentationFrame(): NSRect {
        val sel = ObjCRuntime.sel("presentationFrame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property candidateRects
    /** @return NSArray<NSValue *> * */
    open fun candidateRects(): MemorySegment {
        val sel = ObjCRuntime.sel("candidateRects")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
