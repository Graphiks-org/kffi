package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSClipView
 * Superclass: NSView
 */
open class NSClipView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSClipView") }

    }

    open fun viewFrameChanged(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewFrameChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    open fun viewBoundsChanged(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewBoundsChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    override fun autoscroll(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("autoscroll:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun scrollToPoint(newOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("scrollToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin.segment, NSPoint.layout))
    }

    open fun constrainBoundsRect(proposedBounds: NSRect): NSRect {
        val sel = ObjCRuntime.sel("constrainBoundsRect:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(proposedBounds.segment, NSRect.layout)))
    }

    // @property backgroundColor
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property drawsBackground
    open fun drawsBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setDrawsBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentView
    open fun documentView(): MemorySegment {
        val sel = ObjCRuntime.sel("documentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDocumentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDocumentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentRect
    open fun documentRect(): NSRect {
        val sel = ObjCRuntime.sel("documentRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property documentCursor
    open fun documentCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("documentCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDocumentCursor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDocumentCursor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentVisibleRect
    open fun documentVisibleRect(): NSRect {
        val sel = ObjCRuntime.sel("documentVisibleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property contentInsets
    open fun contentInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("contentInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    open fun setContentInsets(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property automaticallyAdjustsContentInsets
    open fun automaticallyAdjustsContentInsets(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyAdjustsContentInsets")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAutomaticallyAdjustsContentInsets(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyAdjustsContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category:  on NSClipView ─────────────────────────────────────────

fun NSClipView.constrainScrollPoint(newOrigin: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("constrainScrollPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin.segment, NSPoint.layout)))
}

fun NSClipView.copiesOnScroll(): Boolean {
    val sel = ObjCRuntime.sel("copiesOnScroll")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSClipView.setCopiesOnScroll(copiesOnScroll: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCopiesOnScroll:")
    ObjCRuntime.msgSend(null, this.ptr, sel, copiesOnScroll)
}
