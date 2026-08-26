package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTokenField
 * Superclass: NSTextField
 */
open class NSTokenField(override val ptr: MemorySegment) : NSTextField(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTokenField") }

        fun defaultCompletionDelay(): Double {
            val sel = ObjCRuntime.sel("defaultCompletionDelay")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        fun defaultTokenizingCharacterSet(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultTokenizingCharacterSet")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property delegate
    /** @return id<NSTokenFieldDelegate> */
    override fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    override fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tokenStyle
    open fun tokenStyle(): NSTokenStyle {
        val sel = ObjCRuntime.sel("tokenStyle")
        return NSTokenStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTokenStyle(value: NSTokenStyle) {
        val sel = ObjCRuntime.sel("setTokenStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property completionDelay
    open fun completionDelay(): Double {
        val sel = ObjCRuntime.sel("completionDelay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setCompletionDelay(value: Double) {
        val sel = ObjCRuntime.sel("setCompletionDelay:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tokenizingCharacterSet
    open fun tokenizingCharacterSet(): MemorySegment {
        val sel = ObjCRuntime.sel("tokenizingCharacterSet")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTokenizingCharacterSet(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTokenizingCharacterSet:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
