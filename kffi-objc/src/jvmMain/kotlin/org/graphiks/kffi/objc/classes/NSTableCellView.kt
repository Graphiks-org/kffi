package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableCellView
 * Superclass: NSView
 */
open class NSTableCellView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTableCellView") }

    }

    // @property objectValue
    open fun objectValue(): MemorySegment {
        val sel = ObjCRuntime.sel("objectValue")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setObjectValue(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setObjectValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property textField
    open fun textField(): MemorySegment {
        val sel = ObjCRuntime.sel("textField")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextField(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextField:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageView
    open fun imageView(): MemorySegment {
        val sel = ObjCRuntime.sel("imageView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setImageView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImageView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundStyle
    open fun backgroundStyle(): NSBackgroundStyle {
        val sel = ObjCRuntime.sel("backgroundStyle")
        return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setBackgroundStyle(value: NSBackgroundStyle) {
        val sel = ObjCRuntime.sel("setBackgroundStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property rowSizeStyle
    open fun rowSizeStyle(): NSTableViewRowSizeStyle {
        val sel = ObjCRuntime.sel("rowSizeStyle")
        return NSTableViewRowSizeStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setRowSizeStyle(value: NSTableViewRowSizeStyle) {
        val sel = ObjCRuntime.sel("setRowSizeStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property draggingImageComponents
    /** @return NSArray<NSDraggingImageComponent *> * */
    open fun draggingImageComponents(): MemorySegment {
        val sel = ObjCRuntime.sel("draggingImageComponents")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
