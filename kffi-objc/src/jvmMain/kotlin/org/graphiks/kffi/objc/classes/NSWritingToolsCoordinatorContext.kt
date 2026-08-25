package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWritingToolsCoordinatorContext
 * Superclass: NSObject
 */
open class NSWritingToolsCoordinatorContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSWritingToolsCoordinatorContext") }

    }

    open fun initWithAttributedString_range(attributedString: MemorySegment, range: NSRange): MemorySegment {
        val sel = ObjCRuntime.sel("initWithAttributedString:range:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributedString, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property attributedString
    open fun attributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property range
    open fun range(): NSRange {
        val sel = ObjCRuntime.sel("range")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property identifier
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property resolvedRange
    open fun resolvedRange(): NSRange {
        val sel = ObjCRuntime.sel("resolvedRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

}
