@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImageCell
 * Superclass: NSCell
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSImageCell(override val ptr: MemorySegment) : NSCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSImageCell") }

    }

    // @property imageAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageAlignment(): NSImageAlignment {
        val sel = ObjCRuntime.sel("imageAlignment")
        return NSImageAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageAlignment(value: NSImageAlignment) {
        val sel = ObjCRuntime.sel("setImageAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageScaling
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setImageScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageFrameStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageFrameStyle(): NSImageFrameStyle {
        val sel = ObjCRuntime.sel("imageFrameStyle")
        return NSImageFrameStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageFrameStyle(value: NSImageFrameStyle) {
        val sel = ObjCRuntime.sel("setImageFrameStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
