package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDrawer
 * Superclass: NSResponder
 * Protocols: NSAccessibilityElement, NSAccessibility
 */
open class NSDrawer(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDrawer") }

    }

    open fun initWithContentSize_preferredEdge(contentSize: NSSize, edge: NSRectEdge): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentSize:preferredEdge:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(contentSize.segment, NSSize.layout), edge.rawValue) as MemorySegment
    }

    open fun open(): Unit {
        val sel = ObjCRuntime.sel("open")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun openOnEdge(edge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("openOnEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, edge.rawValue)
    }

    open fun close(): Unit {
        val sel = ObjCRuntime.sel("close")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun toggle(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggle:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property parentWindow
    open fun parentWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("parentWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setParentWindow(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setParentWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentView
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredEdge
    open fun preferredEdge(): NSRectEdge {
        val sel = ObjCRuntime.sel("preferredEdge")
        return NSRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setPreferredEdge(value: NSRectEdge) {
        val sel = ObjCRuntime.sel("setPreferredEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property delegate
    /** @return id<NSDrawerDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property state
    open fun state(): Long {
        val sel = ObjCRuntime.sel("state")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property edge
    open fun edge(): NSRectEdge {
        val sel = ObjCRuntime.sel("edge")
        return NSRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property contentSize
    open fun contentSize(): NSSize {
        val sel = ObjCRuntime.sel("contentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property minContentSize
    open fun minContentSize(): NSSize {
        val sel = ObjCRuntime.sel("minContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setMinContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property maxContentSize
    open fun maxContentSize(): NSSize {
        val sel = ObjCRuntime.sel("maxContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setMaxContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaxContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property leadingOffset
    open fun leadingOffset(): Double {
        val sel = ObjCRuntime.sel("leadingOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setLeadingOffset(value: Double) {
        val sel = ObjCRuntime.sel("setLeadingOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trailingOffset
    open fun trailingOffset(): Double {
        val sel = ObjCRuntime.sel("trailingOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setTrailingOffset(value: Double) {
        val sel = ObjCRuntime.sel("setTrailingOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
