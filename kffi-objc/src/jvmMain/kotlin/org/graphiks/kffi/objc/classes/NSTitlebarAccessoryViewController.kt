@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTitlebarAccessoryViewController
 * Superclass: NSViewController
 * Protocols: NSAnimationDelegate, NSAnimatablePropertyContainer
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSTitlebarAccessoryViewController(override val ptr: MemorySegment) : NSViewController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTitlebarAccessoryViewController") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun viewWillAppear(): Unit {
        val sel = ObjCRuntime.sel("viewWillAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun viewDidAppear(): Unit {
        val sel = ObjCRuntime.sel("viewDidAppear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun viewDidDisappear(): Unit {
        val sel = ObjCRuntime.sel("viewDidDisappear")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property layoutAttribute
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun layoutAttribute(): NSLayoutAttribute {
        val sel = ObjCRuntime.sel("layoutAttribute")
        return NSLayoutAttribute(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLayoutAttribute(value: NSLayoutAttribute) {
        val sel = ObjCRuntime.sel("setLayoutAttribute:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property fullScreenMinHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fullScreenMinHeight(): Double {
        val sel = ObjCRuntime.sel("fullScreenMinHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFullScreenMinHeight(value: Double) {
        val sel = ObjCRuntime.sel("setFullScreenMinHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidden
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property automaticallyAdjustsSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun automaticallyAdjustsSize(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyAdjustsSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setAutomaticallyAdjustsSize(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyAdjustsSize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredScrollEdgeEffectStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
    open fun preferredScrollEdgeEffectStyle(): MemorySegment {
        val sel = ObjCRuntime.sel("preferredScrollEdgeEffectStyle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
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
