package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStringDrawingContext
 * Superclass: NSObject
 */
open class NSStringDrawingContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSStringDrawingContext") }

    }

    // @property minimumScaleFactor
    open fun minimumScaleFactor(): Double {
        val sel = ObjCRuntime.sel("minimumScaleFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMinimumScaleFactor(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumScaleFactor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property actualScaleFactor
    open fun actualScaleFactor(): Double {
        val sel = ObjCRuntime.sel("actualScaleFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property totalBounds
    open fun totalBounds(): CGRect {
        val sel = ObjCRuntime.sel("totalBounds")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }

}
