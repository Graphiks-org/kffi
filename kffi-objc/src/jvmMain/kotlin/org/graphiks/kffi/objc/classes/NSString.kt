package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSString
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding
 */
open class NSString(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSString") }

    }

    open fun characterAtIndex(index: Long): Short {
        val sel = ObjCRuntime.sel("characterAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_SHORT, ptr, sel, index) as Short
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property length
    open fun length(): Long {
        val sel = ObjCRuntime.sel("length")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
