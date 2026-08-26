package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSInflectionRule
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSInflectionRule(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSInflectionRule") }

        fun automaticRule(): MemorySegment {
            val sel = ObjCRuntime.sel("automaticRule")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSInflectionRule.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSInflectionRule.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSInflectionRule.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSInflectionRule_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSInflectionRule")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSInflectionAvailability on NSInflectionRule ─────────────────────────────────────────

// Class method: +[NSInflectionRule canInflectLanguage:]
fun NSInflectionRule_canInflectLanguage(language: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("canInflectLanguage:")
    val cls = ObjCRuntime.getClass("NSInflectionRule")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel, language) as Boolean
}

// Class method: +[NSInflectionRule canInflectPreferredLocalization]
fun NSInflectionRule_canInflectPreferredLocalization(): Boolean {
    val sel = ObjCRuntime.sel("canInflectPreferredLocalization")
    val cls = ObjCRuntime.getClass("NSInflectionRule")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
