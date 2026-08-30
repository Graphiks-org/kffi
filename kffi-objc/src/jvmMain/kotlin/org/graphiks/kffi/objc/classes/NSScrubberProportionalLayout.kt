@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberProportionalLayout
 * Superclass: NSScrubberLayout
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubberProportionalLayout(override val ptr: MemorySegment) : NSScrubberLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScrubberProportionalLayout") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithNumberOfVisibleItems(numberOfVisibleItems: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithNumberOfVisibleItems:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, numberOfVisibleItems) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property numberOfVisibleItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfVisibleItems(): Long {
        val sel = ObjCRuntime.sel("numberOfVisibleItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNumberOfVisibleItems(value: Long) {
        val sel = ObjCRuntime.sel("setNumberOfVisibleItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
