@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableCellView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
open class NSTableCellView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTableCellView") } }

    }

    // @property objectValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun objectValue(): MemorySegment {
        val sel = ObjCRuntime.sel("objectValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setObjectValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textField
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textField(): MemorySegment {
        val sel = ObjCRuntime.sel("textField")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextField(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextField:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageView(): MemorySegment {
        val sel = ObjCRuntime.sel("imageView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImageView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundStyle(): NSBackgroundStyle {
        val sel = ObjCRuntime.sel("backgroundStyle")
        return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundStyle(value: NSBackgroundStyle) {
        val sel = ObjCRuntime.sel("setBackgroundStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property rowSizeStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowSizeStyle(): NSTableViewRowSizeStyle {
        val sel = ObjCRuntime.sel("rowSizeStyle")
        return NSTableViewRowSizeStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowSizeStyle(value: NSTableViewRowSizeStyle) {
        val sel = ObjCRuntime.sel("setRowSizeStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property draggingImageComponents
    /** @return NSArray<NSDraggingImageComponent *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggingImageComponents(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingImageComponents")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
