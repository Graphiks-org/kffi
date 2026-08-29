@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberFlowLayout
 * Superclass: NSScrubberLayout
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubberFlowLayout(override val ptr: MemorySegment) : NSScrubberLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScrubberFlowLayout") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateLayoutForItemsAtIndexes(invalidItemIndexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("invalidateLayoutForItemsAtIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, invalidItemIndexes)
    }

    // @property itemSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemSpacing(): Double {
        val sel = ObjCRuntime.sel("itemSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setItemSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property itemSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemSize(): NSSize {
        val sel = ObjCRuntime.sel("itemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

}
