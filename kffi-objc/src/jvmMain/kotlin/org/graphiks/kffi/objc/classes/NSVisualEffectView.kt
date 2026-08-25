package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSVisualEffectView
 * Superclass: NSView
 */
open class NSVisualEffectView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSVisualEffectView") }

    }

    override fun viewDidMoveToWindow(): Unit {
        val sel = ObjCRuntime.sel("viewDidMoveToWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    override fun viewWillMoveToWindow(newWindow: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewWillMoveToWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, newWindow)
    }

    // @property material
    open fun material(): NSVisualEffectMaterial {
        val sel = ObjCRuntime.sel("material")
        return NSVisualEffectMaterial(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setMaterial(value: NSVisualEffectMaterial) {
        val sel = ObjCRuntime.sel("setMaterial:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property interiorBackgroundStyle
    open fun interiorBackgroundStyle(): NSBackgroundStyle {
        val sel = ObjCRuntime.sel("interiorBackgroundStyle")
        return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property blendingMode
    open fun blendingMode(): NSVisualEffectBlendingMode {
        val sel = ObjCRuntime.sel("blendingMode")
        return NSVisualEffectBlendingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setBlendingMode(value: NSVisualEffectBlendingMode) {
        val sel = ObjCRuntime.sel("setBlendingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property state
    open fun state(): NSVisualEffectState {
        val sel = ObjCRuntime.sel("state")
        return NSVisualEffectState(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setState(value: NSVisualEffectState) {
        val sel = ObjCRuntime.sel("setState:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property maskImage
    open fun maskImage(): MemorySegment {
        val sel = ObjCRuntime.sel("maskImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setMaskImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMaskImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property emphasized
    open fun isEmphasized(): Boolean {
        val sel = ObjCRuntime.sel("isEmphasized")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setEmphasized(value: Boolean) {
        val sel = ObjCRuntime.sel("setEmphasized:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
