package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTrackingArea
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
open class NSTrackingArea(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTrackingArea") }

    }

    open fun initWithRect_options_owner_userInfo(rect: NSRect, options: NSTrackingAreaOptions, owner: MemorySegment, userInfo: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRect:options:owner:userInfo:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue, owner, userInfo) as MemorySegment
    }

    // @property rect
    open fun rect(): NSRect {
        val sel = ObjCRuntime.sel("rect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property options
    open fun options(): NSTrackingAreaOptions {
        val sel = ObjCRuntime.sel("options")
        return NSTrackingAreaOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property owner
    open fun owner(): MemorySegment {
        val sel = ObjCRuntime.sel("owner")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property userInfo
    /** @return NSDictionary<id,id> * */
    open fun userInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("userInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
