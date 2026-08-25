package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCustomImageRep
 * Superclass: NSImageRep
 */
open class NSCustomImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCustomImageRep") }

    }

    open fun initWithSize_flipped_drawingHandler(size: NSSize, drawingHandlerShouldBeCalledWithFlippedContext: Boolean, drawingHandler: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSize:flipped:drawingHandler:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), drawingHandlerShouldBeCalledWithFlippedContext, drawingHandler) as MemorySegment
    }

    open fun initWithDrawSelector_delegate(selector: MemorySegment, delegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDrawSelector:delegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, selector, delegate) as MemorySegment
    }

    // @property drawingHandler
    open fun drawingHandler(): MemorySegment {
        val sel = ObjCRuntime.sel("drawingHandler")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property drawSelector
    open fun drawSelector(): MemorySegment {
        val sel = ObjCRuntime.sel("drawSelector")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property delegate
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
