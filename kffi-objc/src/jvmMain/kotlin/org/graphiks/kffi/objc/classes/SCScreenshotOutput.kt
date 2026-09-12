@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCScreenshotOutput
 * Superclass: NSObject
 */
open class SCScreenshotOutput(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCScreenshotOutput") } }

    }

    // @property sdrImage
    open fun sdrImage(): CGImageRef {
        val sel = ObjCRuntime.sel("sdrImage")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setSdrImage(value: CGImageRef) {
        val sel = ObjCRuntime.sel("setSdrImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property hdrImage
    open fun hdrImage(): CGImageRef {
        val sel = ObjCRuntime.sel("hdrImage")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    open fun setHdrImage(value: CGImageRef) {
        val sel = ObjCRuntime.sel("setHdrImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property fileURL
    open fun fileURL(): MemorySegment {
        val sel = ObjCRuntime.sel("fileURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setFileURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFileURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
