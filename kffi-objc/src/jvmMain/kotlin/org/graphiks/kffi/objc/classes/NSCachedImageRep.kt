package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCachedImageRep
 * Superclass: NSImageRep
 */
open class NSCachedImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCachedImageRep") }

    }

    open fun initWithWindow_rect(win: MemorySegment, rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithWindow:rect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, win, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    open fun initWithSize_depth_separate_alpha(size: NSSize, depth: NSWindowDepth, flag: Boolean, alpha: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithSize:depth:separate:alpha:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), depth.rawValue.toInt(), flag, alpha) as MemorySegment
    }

    open fun window(): MemorySegment {
        val sel = ObjCRuntime.sel("window")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun rect(): NSRect {
        val sel = ObjCRuntime.sel("rect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

}
