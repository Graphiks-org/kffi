package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableHeaderCell
 * Superclass: NSTextFieldCell
 */
open class NSTableHeaderCell(override val ptr: MemorySegment) : NSTextFieldCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTableHeaderCell") }

    }

    open fun drawSortIndicatorWithFrame_inView_ascending_priority(cellFrame: NSRect, controlView: MemorySegment, ascending: Boolean, priority: Long): Unit {
        val sel = ObjCRuntime.sel("drawSortIndicatorWithFrame:inView:ascending:priority:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(cellFrame.segment, NSRect.layout), controlView, ascending, priority)
    }

    open fun sortIndicatorRectForBounds(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("sortIndicatorRectForBounds:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

}
