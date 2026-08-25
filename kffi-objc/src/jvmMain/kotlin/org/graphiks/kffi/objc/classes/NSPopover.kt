package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPopover
 * Superclass: NSResponder
 * Protocols: NSAppearanceCustomization, NSAccessibilityElement, NSAccessibility
 */
open class NSPopover(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPopover") }

    }

    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun showRelativeToRect_ofView_preferredEdge(positioningRect: NSRect, positioningView: MemorySegment, preferredEdge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("showRelativeToRect:ofView:preferredEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(positioningRect.segment, NSRect.layout), positioningView, preferredEdge.rawValue)
    }

    open fun showRelativeToToolbarItem(toolbarItem: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showRelativeToToolbarItem:")
        ObjCRuntime.msgSend(null, ptr, sel, toolbarItem)
    }

    open fun performClose(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performClose:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    open fun close(): Unit {
        val sel = ObjCRuntime.sel("close")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property delegate
    /** @return id<NSPopoverDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property appearance
    open fun appearance(): MemorySegment {
        val sel = ObjCRuntime.sel("appearance")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAppearance(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAppearance:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property effectiveAppearance
    open fun effectiveAppearance(): MemorySegment {
        val sel = ObjCRuntime.sel("effectiveAppearance")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property behavior
    open fun behavior(): NSPopoverBehavior {
        val sel = ObjCRuntime.sel("behavior")
        return NSPopoverBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setBehavior(value: NSPopoverBehavior) {
        val sel = ObjCRuntime.sel("setBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property animates
    open fun animates(): Boolean {
        val sel = ObjCRuntime.sel("animates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAnimates(value: Boolean) {
        val sel = ObjCRuntime.sel("setAnimates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentViewController
    open fun contentViewController(): MemorySegment {
        val sel = ObjCRuntime.sel("contentViewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentViewController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property shown
    open fun isShown(): Boolean {
        val sel = ObjCRuntime.sel("isShown")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property detached
    open fun isDetached(): Boolean {
        val sel = ObjCRuntime.sel("isDetached")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property positioningRect
    open fun positioningRect(): NSRect {
        val sel = ObjCRuntime.sel("positioningRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setPositioningRect(value: NSRect) {
        val sel = ObjCRuntime.sel("setPositioningRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property hasFullSizeContent
    open fun hasFullSizeContent(): Boolean {
        val sel = ObjCRuntime.sel("hasFullSizeContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHasFullSizeContent(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasFullSizeContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
