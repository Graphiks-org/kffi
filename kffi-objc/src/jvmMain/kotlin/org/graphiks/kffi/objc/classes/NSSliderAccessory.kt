package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSliderAccessory
 * Superclass: NSObject
 * Protocols: NSCoding
 */
open class NSSliderAccessory(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSliderAccessory") }

        fun accessoryWithImage(image: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("accessoryWithImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image) as MemorySegment
        }

    }

    // @property behavior
    open fun behavior(): MemorySegment {
        val sel = ObjCRuntime.sel("behavior")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBehavior(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property enabled
    open fun isEnabled(): Boolean {
        val sel = ObjCRuntime.sel("isEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSSliderAccessory.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSSliderAccessory.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

// ── Category:  on NSSliderAccessory ─────────────────────────────────────────
