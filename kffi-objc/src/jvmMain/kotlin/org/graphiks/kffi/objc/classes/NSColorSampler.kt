@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorSampler
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSColorSampler(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSColorSampler") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showSamplerWithSelectionHandler(selectionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showSamplerWithSelectionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, selectionHandler)
    }

}
