package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTouch
 * Superclass: NSObject
 * Protocols: NSCopying
 */
open class NSTouch(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTouch") }

    }

    // @property identity
    /** @return id<NSObject,NSCopying> */
    open fun identity(): MemorySegment {
        val sel = ObjCRuntime.sel("identity")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property phase
    open fun phase(): NSTouchPhase {
        val sel = ObjCRuntime.sel("phase")
        return NSTouchPhase(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property normalizedPosition
    open fun normalizedPosition(): NSPoint {
        val sel = ObjCRuntime.sel("normalizedPosition")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property resting
    open fun isResting(): Boolean {
        val sel = ObjCRuntime.sel("isResting")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property device
    open fun device(): MemorySegment {
        val sel = ObjCRuntime.sel("device")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property deviceSize
    open fun deviceSize(): NSSize {
        val sel = ObjCRuntime.sel("deviceSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSTouch.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: NSTouchBar on NSTouch ─────────────────────────────────────────

fun NSTouch.locationInView(view: MemorySegment): NSPoint {
    val sel = ObjCRuntime.sel("locationInView:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, view))
}

fun NSTouch.previousLocationInView(view: MemorySegment): NSPoint {
    val sel = ObjCRuntime.sel("previousLocationInView:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, view))
}

fun NSTouch.type(): NSTouchType {
    val sel = ObjCRuntime.sel("type")
    return NSTouchType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
