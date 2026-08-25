package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPanGestureRecognizer
 * Superclass: NSGestureRecognizer
 * Protocols: NSCoding
 */
open class NSPanGestureRecognizer(override val ptr: MemorySegment) : NSGestureRecognizer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPanGestureRecognizer") }

    }

    open fun translationInView(view: MemorySegment): NSPoint {
        val sel = ObjCRuntime.sel("translationInView:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, view))
    }

    open fun setTranslation_inView(translation: NSPoint, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTranslation:inView:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(translation.segment, NSPoint.layout), view)
    }

    open fun velocityInView(view: MemorySegment): NSPoint {
        val sel = ObjCRuntime.sel("velocityInView:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, view))
    }

    // @property buttonMask
    open fun buttonMask(): Long {
        val sel = ObjCRuntime.sel("buttonMask")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setButtonMask(value: Long) {
        val sel = ObjCRuntime.sel("setButtonMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property numberOfTouchesRequired
    open fun numberOfTouchesRequired(): Long {
        val sel = ObjCRuntime.sel("numberOfTouchesRequired")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setNumberOfTouchesRequired(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfTouchesRequired:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
