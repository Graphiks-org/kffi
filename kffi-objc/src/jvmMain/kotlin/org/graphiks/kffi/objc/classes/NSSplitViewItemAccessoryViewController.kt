package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSplitViewItemAccessoryViewController
 * Superclass: NSViewController
 * Protocols: NSAnimatablePropertyContainer
 */
open class NSSplitViewItemAccessoryViewController(override val ptr: MemorySegment) : NSViewController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSplitViewItemAccessoryViewController") }

    }

    override fun viewWillAppear(): Unit {
        val sel = ObjCRuntime.sel("viewWillAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    override fun viewDidAppear(): Unit {
        val sel = ObjCRuntime.sel("viewDidAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    override fun viewWillDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewWillDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    override fun viewDidDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewDidDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
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

    // @property automaticallyAppliesContentInsets
    open fun automaticallyAppliesContentInsets(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyAppliesContentInsets")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAutomaticallyAppliesContentInsets(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyAppliesContentInsets:")
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
fun NSSplitViewItemAccessoryViewController.animations(): MemorySegment {
    val sel = ObjCRuntime.sel("animations")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSSplitViewItemAccessoryViewController.setAnimations(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAnimations:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSSplitViewItemAccessoryViewController.animator(): MemorySegment {
    val sel = ObjCRuntime.sel("animator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSSplitViewItemAccessoryViewController.animationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("animationForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSSplitViewItemAccessoryViewController_defaultAnimationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultAnimationForKey:")
    val cls = ObjCRuntime.getClass("NSSplitViewItemAccessoryViewController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}
