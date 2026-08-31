@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewFlowLayoutInvalidationContext
 * Superclass: NSCollectionViewLayoutInvalidationContext
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSCollectionViewFlowLayoutInvalidationContext(override val ptr: MemorySegment) : NSCollectionViewLayoutInvalidationContext(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionViewFlowLayoutInvalidationContext") } }

    }

    // @property invalidateFlowLayoutDelegateMetrics
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateFlowLayoutDelegateMetrics(): Boolean {
        val sel = ObjCRuntime.sel("invalidateFlowLayoutDelegateMetrics")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInvalidateFlowLayoutDelegateMetrics(value: Boolean) {
        val sel = ObjCRuntime.sel("setInvalidateFlowLayoutDelegateMetrics:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property invalidateFlowLayoutAttributes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateFlowLayoutAttributes(): Boolean {
        val sel = ObjCRuntime.sel("invalidateFlowLayoutAttributes")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInvalidateFlowLayoutAttributes(value: Boolean) {
        val sel = ObjCRuntime.sel("setInvalidateFlowLayoutAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
