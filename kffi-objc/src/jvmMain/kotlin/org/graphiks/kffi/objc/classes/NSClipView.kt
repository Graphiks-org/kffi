@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSClipView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSClipView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSClipView") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewFrameChanged(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewFrameChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewBoundsChanged(notification: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewBoundsChanged:")
        ObjCRuntime.msgSend(null, ptr, sel, notification)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun autoscroll(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("autoscroll:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollToPoint(newOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("scrollToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun constrainBoundsRect(proposedBounds: NSRect): NSRect {
        val sel = ObjCRuntime.sel("constrainBoundsRect:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(proposedBounds.segment, NSRect.layout)))
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColor(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property drawsBackground
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawsBackground(): Boolean {
        val sel = ObjCRuntime.sel("drawsBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDrawsBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setDrawsBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentView(): MemorySegment {
        val sel = ObjCRuntime.sel("documentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDocumentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDocumentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentRect(): NSRect {
        val sel = ObjCRuntime.sel("documentRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property documentCursor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("documentCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDocumentCursor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDocumentCursor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property documentVisibleRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentVisibleRect(): NSRect {
        val sel = ObjCRuntime.sel("documentVisibleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property contentInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun contentInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("contentInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setContentInsets(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property automaticallyAdjustsContentInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun automaticallyAdjustsContentInsets(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyAdjustsContentInsets")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setAutomaticallyAdjustsContentInsets(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyAdjustsContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category:  on NSClipView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use -constrainBoundsRect: instead.")
fun NSClipView.constrainScrollPoint(newOrigin: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("constrainScrollPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin.segment, NSPoint.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Setting this property has no effect.  NSClipView will always minimize the area of the document view that is invalidated.  To force invalidation of the document view, use -[NSView setNeedsDisplayInRect:].")
fun NSClipView.copiesOnScroll(): Boolean {
    val sel = ObjCRuntime.sel("copiesOnScroll")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Setting this property has no effect.  NSClipView will always minimize the area of the document view that is invalidated.  To force invalidation of the document view, use -[NSView setNeedsDisplayInRect:].")
fun NSClipView.setCopiesOnScroll(copiesOnScroll: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCopiesOnScroll:")
    ObjCRuntime.msgSend(null, this.ptr, sel, copiesOnScroll)
}
