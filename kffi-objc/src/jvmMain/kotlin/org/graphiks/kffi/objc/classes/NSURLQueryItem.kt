package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSURLQueryItem
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
open class NSURLQueryItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSURLQueryItem") }

        fun queryItemWithName_value(name: MemorySegment, value: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("queryItemWithName:value:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, value) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun queryItemWithName_value(name: String, value: String): MemorySegment = queryItemWithName_value(ObjCRuntime.newNSString(Arena.global(), name), ObjCRuntime.newNSString(Arena.global(), value))

    }

    open fun initWithName_value(name: MemorySegment, value: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithName:value:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, name, value) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    fun initWithName_value(name: String, value: String): MemorySegment = initWithName_value(ObjCRuntime.newNSString(Arena.global(), name), ObjCRuntime.newNSString(Arena.global(), value))

    // @property name
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun nameAsString(): String = ObjCRuntime.toJavaString(name())

    // @property value
    open fun value(): MemorySegment {
        val sel = ObjCRuntime.sel("value")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun valueAsString(): String = ObjCRuntime.toJavaString(value())

}

/** Required by Objective-C protocol NSCoding. */
fun NSURLQueryItem.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSURLQueryItem.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSURLQueryItem_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSURLQueryItem")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun NSURLQueryItem.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
