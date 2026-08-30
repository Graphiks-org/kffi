@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSViewAnimation
 * Superclass: NSAnimation
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSViewAnimation(override val ptr: MemorySegment) : NSAnimation(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSViewAnimation") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithViewAnimations(viewAnimations: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithViewAnimations:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, viewAnimations) as MemorySegment
    }

    // @property viewAnimations
    /** @return NSArray<NSDictionary<NSViewAnimationKey,id> *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewAnimations(): MemorySegment {
        val sel = ObjCRuntime.sel("viewAnimations")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setViewAnimations(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setViewAnimations:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
