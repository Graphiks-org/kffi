@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSActionCell
 * Superclass: NSCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSActionCell(override val ptr: MemorySegment) : NSCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSActionCell") }

    }

    // @property target
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun target(): MemorySegment {
        val sel = ObjCRuntime.sel("target")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property action
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun action(): MemorySegment {
        val sel = ObjCRuntime.sel("action")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tag
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun tag(): Long {
        val sel = ObjCRuntime.sel("tag")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setTag(value: Long) {
        val sel = ObjCRuntime.sel("setTag:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
