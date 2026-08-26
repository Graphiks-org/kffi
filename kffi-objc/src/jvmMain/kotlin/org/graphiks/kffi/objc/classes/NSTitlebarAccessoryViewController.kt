package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTitlebarAccessoryViewController
 * Superclass: NSViewController
 * Protocols: NSAnimationDelegate, NSAnimatablePropertyContainer
 */
open class NSTitlebarAccessoryViewController(override val ptr: MemorySegment) : NSViewController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTitlebarAccessoryViewController") }

    }

    override fun viewWillAppear(): Unit {
        val sel = ObjCRuntime.sel("viewWillAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    override fun viewDidAppear(): Unit {
        val sel = ObjCRuntime.sel("viewDidAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    override fun viewDidDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewDidDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property layoutAttribute
    open fun layoutAttribute(): NSLayoutAttribute {
        val sel = ObjCRuntime.sel("layoutAttribute")
        return NSLayoutAttribute(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLayoutAttribute(value: NSLayoutAttribute) {
        val sel = ObjCRuntime.sel("setLayoutAttribute:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property fullScreenMinHeight
    open fun fullScreenMinHeight(): Double {
        val sel = ObjCRuntime.sel("fullScreenMinHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setFullScreenMinHeight(value: Double) {
        val sel = ObjCRuntime.sel("setFullScreenMinHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidden
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property automaticallyAdjustsSize
    open fun automaticallyAdjustsSize(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyAdjustsSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAutomaticallyAdjustsSize(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyAdjustsSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredScrollEdgeEffectStyle
    open fun preferredScrollEdgeEffectStyle(): MemorySegment {
        val sel = ObjCRuntime.sel("preferredScrollEdgeEffectStyle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setPreferredScrollEdgeEffectStyle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPreferredScrollEdgeEffectStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/**
 * Required by Objective-C protocol NSAnimatablePropertyContainer.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSTitlebarAccessoryViewController.animations(): MemorySegment {
    val sel = ObjCRuntime.sel("animations")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSTitlebarAccessoryViewController.setAnimations(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAnimations:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSTitlebarAccessoryViewController.animator(): MemorySegment {
    val sel = ObjCRuntime.sel("animator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSTitlebarAccessoryViewController.animationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("animationForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSTitlebarAccessoryViewController_defaultAnimationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultAnimationForKey:")
    val cls = ObjCRuntime.getClass("NSTitlebarAccessoryViewController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}
