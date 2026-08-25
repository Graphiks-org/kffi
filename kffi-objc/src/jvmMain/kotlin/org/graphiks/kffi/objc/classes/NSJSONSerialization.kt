package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSJSONSerialization
 * Superclass: NSObject
 */
open class NSJSONSerialization(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSJSONSerialization") }

        fun isValidJSONObject(obj: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("isValidJSONObject:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, obj) as Boolean
        }

        fun dataWithJSONObject_options_error(obj: MemorySegment, opt: NSJSONWritingOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("dataWithJSONObject:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, obj, opt.rawValue, error) as MemorySegment
        }

        fun JSONObjectWithData_options_error(`data`: MemorySegment, opt: NSJSONReadingOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("JSONObjectWithData:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`, opt.rawValue, error) as MemorySegment
        }

        fun writeJSONObject_toStream_options_error(obj: MemorySegment, stream: MemorySegment, opt: NSJSONWritingOptions, error: MemorySegment): Long {
            val sel = ObjCRuntime.sel("writeJSONObject:toStream:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel, obj, stream, opt.rawValue, error) as Long
        }

        fun JSONObjectWithStream_options_error(stream: MemorySegment, opt: NSJSONReadingOptions, error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("JSONObjectWithStream:options:error:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, stream, opt.rawValue, error) as MemorySegment
        }

    }

}
