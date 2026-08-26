package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPageController
 * Superclass: NSViewController
 * Protocols: NSAnimatablePropertyContainer, NSCoding
 */
open class NSPageController(override val ptr: MemorySegment) : NSViewController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPageController") }

    }

    open fun navigateForwardToObject(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("navigateForwardToObject:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    open fun completeTransition(): Unit {
        val sel = ObjCRuntime.sel("completeTransition")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun navigateBack(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("navigateBack:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun navigateForward(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("navigateForward:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun takeSelectedIndexFrom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("takeSelectedIndexFrom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property delegate
    /** @return id<NSPageControllerDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectedViewController
    open fun selectedViewController(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedViewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property transitionStyle
    open fun transitionStyle(): NSPageControllerTransitionStyle {
        val sel = ObjCRuntime.sel("transitionStyle")
        return NSPageControllerTransitionStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setTransitionStyle(value: NSPageControllerTransitionStyle) {
        val sel = ObjCRuntime.sel("setTransitionStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property arrangedObjects
    open fun arrangedObjects(): MemorySegment {
        val sel = ObjCRuntime.sel("arrangedObjects")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setArrangedObjects(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setArrangedObjects:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectedIndex
    open fun selectedIndex(): Long {
        val sel = ObjCRuntime.sel("selectedIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setSelectedIndex(value: Long) {
        val sel = ObjCRuntime.sel("setSelectedIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/**
 * Required by Objective-C protocol NSAnimatablePropertyContainer.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSPageController.animations(): MemorySegment {
    val sel = ObjCRuntime.sel("animations")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSPageController.setAnimations(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAnimations:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSPageController.animator(): MemorySegment {
    val sel = ObjCRuntime.sel("animator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSPageController.animationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("animationForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSPageController_defaultAnimationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultAnimationForKey:")
    val cls = ObjCRuntime.getClass("NSPageController")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}
