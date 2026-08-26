package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextTab
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding, NSSecureCoding
 */
open class NSTextTab(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextTab") }

        fun columnTerminatorsForLocale(aLocale: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("columnTerminatorsForLocale:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, aLocale) as MemorySegment
        }

    }

    // @property location
    open fun location(): Double {
        val sel = ObjCRuntime.sel("location")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property options
    /** @return NSDictionary<NSTextTabOptionKey,id> * */
    open fun options(): MemorySegment {
        val sel = ObjCRuntime.sel("options")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSTextTab.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSTextTab.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSTextTab.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTextTab_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTextTab")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category:  on NSTextTab ─────────────────────────────────────────

fun NSTextTab.initWithTextAlignment_location_options(alignment: NSTextAlignment, loc: Double, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithTextAlignment:location:options:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, alignment.rawValue, loc, options) as MemorySegment
}

fun NSTextTab.alignment(): NSTextAlignment {
    val sel = ObjCRuntime.sel("alignment")
    return NSTextAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

// ── Category: NSTextTabDeprecated on NSTextTab ─────────────────────────────────────────

fun NSTextTab.initWithType_location(type: NSTextTabType, loc: Double): MemorySegment {
    val sel = ObjCRuntime.sel("initWithType:location:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type.rawValue, loc) as MemorySegment
}

fun NSTextTab.tabStopType(): NSTextTabType {
    val sel = ObjCRuntime.sel("tabStopType")
    return NSTextTabType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
