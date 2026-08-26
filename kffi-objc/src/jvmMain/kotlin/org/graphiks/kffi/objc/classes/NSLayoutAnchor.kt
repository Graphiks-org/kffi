package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLayoutAnchor
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
open class NSLayoutAnchor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSLayoutAnchor") }

    }

    open fun constraintEqualToAnchor(anchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("constraintEqualToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor) as MemorySegment
    }

    open fun constraintGreaterThanOrEqualToAnchor(anchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("constraintGreaterThanOrEqualToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor) as MemorySegment
    }

    open fun constraintLessThanOrEqualToAnchor(anchor: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("constraintLessThanOrEqualToAnchor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor) as MemorySegment
    }

    open fun constraintEqualToAnchor_constant(anchor: MemorySegment, c: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintEqualToAnchor:constant:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, c) as MemorySegment
    }

    open fun constraintGreaterThanOrEqualToAnchor_constant(anchor: MemorySegment, c: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintGreaterThanOrEqualToAnchor:constant:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, c) as MemorySegment
    }

    open fun constraintLessThanOrEqualToAnchor_constant(anchor: MemorySegment, c: Double): MemorySegment {
        val sel = ObjCRuntime.sel("constraintLessThanOrEqualToAnchor:constant:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anchor, c) as MemorySegment
    }

    // @property name
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    // @property item
    open fun item(): MemorySegment {
        val sel = ObjCRuntime.sel("item")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hasAmbiguousLayout
    open fun hasAmbiguousLayout(): Boolean {
        val sel = ObjCRuntime.sel("hasAmbiguousLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property constraintsAffectingLayout
    /** @return NSArray<NSLayoutConstraint *> * */
    open fun constraintsAffectingLayout(): MemorySegment {
        val sel = ObjCRuntime.sel("constraintsAffectingLayout")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSLayoutAnchor.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutAnchor.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutAnchor.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
