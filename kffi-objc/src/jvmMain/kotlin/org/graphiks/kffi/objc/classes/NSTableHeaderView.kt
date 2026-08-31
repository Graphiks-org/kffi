@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableHeaderView
 * Superclass: NSView
 * Protocols: NSViewToolTipOwner
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTableHeaderView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTableHeaderView") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun headerRectOfColumn(column: Long): NSRect {
        val sel = ObjCRuntime.sel("headerRectOfColumn:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, column))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun columnAtPoint(point: NSPoint): Long {
        val sel = ObjCRuntime.sel("columnAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Long
    }

    // @property tableView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tableView(): MemorySegment {
        val sel = ObjCRuntime.sel("tableView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTableView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTableView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property draggedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggedColumn(): Long {
        val sel = ObjCRuntime.sel("draggedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property draggedDistance
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draggedDistance(): Double {
        val sel = ObjCRuntime.sel("draggedDistance")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property resizedColumn
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resizedColumn(): Long {
        val sel = ObjCRuntime.sel("resizedColumn")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
