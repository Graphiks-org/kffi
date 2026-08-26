package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSliderAccessoryBehavior
 * Superclass: NSObject
 * Protocols: NSCoding, NSCopying
 */
open class NSSliderAccessoryBehavior(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSliderAccessoryBehavior") }

        fun behaviorWithTarget_action(target: MemorySegment, action: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("behaviorWithTarget:action:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, target, action) as MemorySegment
        }

        fun behaviorWithHandler(handler: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("behaviorWithHandler:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, handler) as MemorySegment
        }

        fun automaticBehavior(): MemorySegment {
            val sel = ObjCRuntime.sel("automaticBehavior")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun valueStepBehavior(): MemorySegment {
            val sel = ObjCRuntime.sel("valueStepBehavior")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun valueResetBehavior(): MemorySegment {
            val sel = ObjCRuntime.sel("valueResetBehavior")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun handleAction(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("handleAction:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSSliderAccessoryBehavior.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSSliderAccessoryBehavior.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/** Required by Objective-C protocol NSCopying. */
fun NSSliderAccessoryBehavior.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
