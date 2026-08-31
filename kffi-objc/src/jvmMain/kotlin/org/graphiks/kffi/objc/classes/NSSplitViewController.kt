@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSplitViewController
 * Superclass: NSViewController
 * Protocols: NSSplitViewDelegate, NSUserInterfaceValidations
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSSplitViewController(override val ptr: MemorySegment) : NSViewController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSplitViewController") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addSplitViewItem(splitViewItem: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addSplitViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, splitViewItem)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertSplitViewItem_atIndex(splitViewItem: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertSplitViewItem:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, splitViewItem, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeSplitViewItem(splitViewItem: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeSplitViewItem:")
        ObjCRuntime.msgSend(null, ptr, sel, splitViewItem)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitViewItemForViewController(viewController: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("splitViewItemForViewController:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, viewController) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun validateUserInterfaceItem(item: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, item) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun viewDidLoad(): Unit {
        val sel = ObjCRuntime.sel("viewDidLoad")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitView_canCollapseSubview(splitView: MemorySegment, subview: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("splitView:canCollapseSubview:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, splitView, subview) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 15, deprecatedSubminor = -1, message = "NSSplitView no longer supports collapsing sections via double-click. This delegate method is never called, and NSSplitViewController's implementation always returns NO.")
    open fun splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex(splitView: MemorySegment, subview: MemorySegment, dividerIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("splitView:shouldCollapseSubview:forDoubleClickOnDividerAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, splitView, subview, dividerIndex) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitView_shouldHideDividerAtIndex(splitView: MemorySegment, dividerIndex: Long): Boolean {
        val sel = ObjCRuntime.sel("splitView:shouldHideDividerAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, splitView, dividerIndex) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitView_effectiveRect_forDrawnRect_ofDividerAtIndex(splitView: MemorySegment, proposedEffectiveRect: NSRect, drawnRect: NSRect, dividerIndex: Long): NSRect {
        val sel = ObjCRuntime.sel("splitView:effectiveRect:forDrawnRect:ofDividerAtIndex:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, splitView, ObjCRuntime.ObjCStructArg(proposedEffectiveRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(drawnRect.segment, NSRect.layout), dividerIndex))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitView_additionalEffectiveRectOfDividerAtIndex(splitView: MemorySegment, dividerIndex: Long): NSRect {
        val sel = ObjCRuntime.sel("splitView:additionalEffectiveRectOfDividerAtIndex:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, splitView, dividerIndex))
    }

    // @property splitView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitView(): MemorySegment {
        val sel = ObjCRuntime.sel("splitView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSplitView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSplitView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property splitViewItems
    /** @return NSArray<__kindof NSSplitViewItem *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun splitViewItems(): MemorySegment {
        val sel = ObjCRuntime.sel("splitViewItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSplitViewItems(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSplitViewItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumThicknessForInlineSidebars
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun minimumThicknessForInlineSidebars(): Double {
        val sel = ObjCRuntime.sel("minimumThicknessForInlineSidebars")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setMinimumThicknessForInlineSidebars(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumThicknessForInlineSidebars:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSSplitViewControllerToggleSidebarAction on NSSplitViewController ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitViewController.toggleSidebar(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleSidebar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSSplitViewController.toggleInspector(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("toggleInspector:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}
