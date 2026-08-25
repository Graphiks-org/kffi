package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorWell
 * Superclass: NSControl
 */
open class NSColorWell(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSColorWell") }

        fun colorWellWithStyle(style: NSColorWellStyle): MemorySegment {
            val sel = ObjCRuntime.sel("colorWellWithStyle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, style.rawValue) as MemorySegment
        }

    }

    open fun deactivate(): Unit {
        val sel = ObjCRuntime.sel("deactivate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun activate(exclusive: Boolean): Unit {
        val sel = ObjCRuntime.sel("activate:")
        ObjCRuntime.msgSend(null, ptr, sel, exclusive)
    }

    open fun drawWellInside(insideRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawWellInside:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(insideRect.segment, NSRect.layout))
    }

    open fun takeColorFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeColorFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property active
    open fun isActive(): Boolean {
        val sel = ObjCRuntime.sel("isActive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property bordered
    open fun isBordered(): Boolean {
        val sel = ObjCRuntime.sel("isBordered")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setBordered(value: Boolean) {
        val sel = ObjCRuntime.sel("setBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property color
    open fun color(): MemorySegment {
        val sel = ObjCRuntime.sel("color")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorWellStyle
    open fun colorWellStyle(): NSColorWellStyle {
        val sel = ObjCRuntime.sel("colorWellStyle")
        return NSColorWellStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setColorWellStyle(value: NSColorWellStyle) {
        val sel = ObjCRuntime.sel("setColorWellStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property image
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pulldownTarget
    open fun pulldownTarget(): MemorySegment {
        val sel = ObjCRuntime.sel("pulldownTarget")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPulldownTarget(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPulldownTarget:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pulldownAction
    open fun pulldownAction(): MemorySegment {
        val sel = ObjCRuntime.sel("pulldownAction")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPulldownAction(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPulldownAction:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property supportsAlpha
    open fun supportsAlpha(): Boolean {
        val sel = ObjCRuntime.sel("supportsAlpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSupportsAlpha(value: Boolean) {
        val sel = ObjCRuntime.sel("setSupportsAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumLinearExposure
    open fun maximumLinearExposure(): Double {
        val sel = ObjCRuntime.sel("maximumLinearExposure")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMaximumLinearExposure(value: Double) {
        val sel = ObjCRuntime.sel("setMaximumLinearExposure:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
