package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSView
 * Superclass: NSResponder
 * Protocols: NSAnimatablePropertyContainer, NSUserInterfaceItemIdentification, NSDraggingDestination, NSAppearanceCustomization, NSAccessibilityElement, NSAccessibility
 */
open class NSView(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSView") }

        fun focusView(): MemorySegment {
            val sel = ObjCRuntime.sel("focusView")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun defaultMenu(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultMenu")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun isCompatibleWithResponsiveScrolling(): Boolean {
            val sel = ObjCRuntime.sel("isCompatibleWithResponsiveScrolling")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    open fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun isDescendantOf(view: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isDescendantOf:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, view) as Boolean
    }

    open fun ancestorSharedWithView(view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("ancestorSharedWithView:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, view) as MemorySegment
    }

    open fun getRectsBeingDrawn_count(rects: MemorySegment, count: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getRectsBeingDrawn:count:")
        ObjCRuntime.msgSend(null, ptr, sel, rects, count)
    }

    open fun needsToDrawRect(rect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("needsToDrawRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Boolean
    }

    open fun viewDidHide(): Unit {
        val sel = ObjCRuntime.sel("viewDidHide")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidUnhide(): Unit {
        val sel = ObjCRuntime.sel("viewDidUnhide")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun addSubview(view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addSubview:")
        ObjCRuntime.msgSend(null, ptr, sel, view)
    }

    open fun addSubview_positioned_relativeTo(view: MemorySegment, place: NSWindowOrderingMode, otherView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addSubview:positioned:relativeTo:")
        ObjCRuntime.msgSend(null, ptr, sel, view, place.rawValue, otherView)
    }

    open fun sortSubviewsUsingFunction_context(compare: MemorySegment, context: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("sortSubviewsUsingFunction:context:")
        ObjCRuntime.msgSend(null, ptr, sel, compare, context)
    }

    open fun viewWillMoveToWindow(newWindow: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewWillMoveToWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, newWindow)
    }

    open fun viewDidMoveToWindow(): Unit {
        val sel = ObjCRuntime.sel("viewDidMoveToWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewWillMoveToSuperview(newSuperview: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("viewWillMoveToSuperview:")
        ObjCRuntime.msgSend(null, ptr, sel, newSuperview)
    }

    open fun viewDidMoveToSuperview(): Unit {
        val sel = ObjCRuntime.sel("viewDidMoveToSuperview")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun didAddSubview(subview: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("didAddSubview:")
        ObjCRuntime.msgSend(null, ptr, sel, subview)
    }

    open fun willRemoveSubview(subview: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("willRemoveSubview:")
        ObjCRuntime.msgSend(null, ptr, sel, subview)
    }

    open fun removeFromSuperview(): Unit {
        val sel = ObjCRuntime.sel("removeFromSuperview")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun replaceSubview_with(oldView: MemorySegment, newView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceSubview:with:")
        ObjCRuntime.msgSend(null, ptr, sel, oldView, newView)
    }

    open fun removeFromSuperviewWithoutNeedingDisplay(): Unit {
        val sel = ObjCRuntime.sel("removeFromSuperviewWithoutNeedingDisplay")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidChangeBackingProperties(): Unit {
        val sel = ObjCRuntime.sel("viewDidChangeBackingProperties")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun resizeSubviewsWithOldSize(oldSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("resizeSubviewsWithOldSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(oldSize.segment, NSSize.layout))
    }

    open fun resizeWithOldSuperviewSize(oldSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("resizeWithOldSuperviewSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(oldSize.segment, NSSize.layout))
    }

    open fun setFrameOrigin(newOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("setFrameOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin.segment, NSPoint.layout))
    }

    open fun setFrameSize(newSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("setFrameSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newSize.segment, NSSize.layout))
    }

    open fun setBoundsOrigin(newOrigin: NSPoint): Unit {
        val sel = ObjCRuntime.sel("setBoundsOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin.segment, NSPoint.layout))
    }

    open fun setBoundsSize(newSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("setBoundsSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newSize.segment, NSSize.layout))
    }

    open fun translateOriginToPoint(translation: NSPoint): Unit {
        val sel = ObjCRuntime.sel("translateOriginToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(translation.segment, NSPoint.layout))
    }

    open fun scaleUnitSquareToSize(newUnitSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("scaleUnitSquareToSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newUnitSize.segment, NSSize.layout))
    }

    open fun rotateByAngle(angle: Double): Unit {
        val sel = ObjCRuntime.sel("rotateByAngle:")
        ObjCRuntime.msgSend(null, ptr, sel, angle)
    }

    open fun convertPoint_fromView(point: NSPoint, view: MemorySegment): NSPoint {
        val sel = ObjCRuntime.sel("convertPoint:fromView:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), view))
    }

    open fun convertPoint_toView(point: NSPoint, view: MemorySegment): NSPoint {
        val sel = ObjCRuntime.sel("convertPoint:toView:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), view))
    }

    open fun convertSize_fromView(size: NSSize, view: MemorySegment): NSSize {
        val sel = ObjCRuntime.sel("convertSize:fromView:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), view))
    }

    open fun convertSize_toView(size: NSSize, view: MemorySegment): NSSize {
        val sel = ObjCRuntime.sel("convertSize:toView:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout), view))
    }

    open fun convertRect_fromView(rect: NSRect, view: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("convertRect:fromView:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), view))
    }

    open fun convertRect_toView(rect: NSRect, view: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("convertRect:toView:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), view))
    }

    open fun backingAlignedRect_options(rect: NSRect, options: NSAlignmentOptions): NSRect {
        val sel = ObjCRuntime.sel("backingAlignedRect:options:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue))
    }

    open fun centerScanRect(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("centerScanRect:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun convertPointToBacking(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointToBacking:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    open fun convertPointFromBacking(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointFromBacking:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    open fun convertSizeToBacking(size: NSSize): NSSize {
        val sel = ObjCRuntime.sel("convertSizeToBacking:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
    }

    open fun convertSizeFromBacking(size: NSSize): NSSize {
        val sel = ObjCRuntime.sel("convertSizeFromBacking:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
    }

    open fun convertRectToBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectToBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun convertRectFromBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectFromBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun convertPointToLayer(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointToLayer:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    open fun convertPointFromLayer(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointFromLayer:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    open fun convertSizeToLayer(size: NSSize): NSSize {
        val sel = ObjCRuntime.sel("convertSizeToLayer:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
    }

    open fun convertSizeFromLayer(size: NSSize): NSSize {
        val sel = ObjCRuntime.sel("convertSizeFromLayer:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
    }

    open fun convertRectToLayer(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectToLayer:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun convertRectFromLayer(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectFromLayer:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun setNeedsDisplayInRect(invalidRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("setNeedsDisplayInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(invalidRect.segment, NSRect.layout))
    }

    open fun lockFocus(): Unit {
        val sel = ObjCRuntime.sel("lockFocus")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun unlockFocus(): Unit {
        val sel = ObjCRuntime.sel("unlockFocus")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun lockFocusIfCanDraw(): Boolean {
        val sel = ObjCRuntime.sel("lockFocusIfCanDraw")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun lockFocusIfCanDrawInContext(context: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("lockFocusIfCanDrawInContext:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, context) as Boolean
    }

    open fun display(): Unit {
        val sel = ObjCRuntime.sel("display")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun displayIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("displayIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun displayIfNeededIgnoringOpacity(): Unit {
        val sel = ObjCRuntime.sel("displayIfNeededIgnoringOpacity")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun displayRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("displayRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun displayIfNeededInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("displayIfNeededInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun displayRectIgnoringOpacity(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("displayRectIgnoringOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun displayIfNeededInRectIgnoringOpacity(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("displayIfNeededInRectIgnoringOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun drawRect(dirtyRect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect.segment, NSRect.layout))
    }

    open fun displayRectIgnoringOpacity_inContext(rect: NSRect, context: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("displayRectIgnoringOpacity:inContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), context)
    }

    open fun bitmapImageRepForCachingDisplayInRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapImageRepForCachingDisplayInRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    open fun cacheDisplayInRect_toBitmapImageRep(rect: NSRect, bitmapImageRep: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("cacheDisplayInRect:toBitmapImageRep:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), bitmapImageRep)
    }

    open fun viewWillDraw(): Unit {
        val sel = ObjCRuntime.sel("viewWillDraw")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun scrollPoint(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("scrollPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    open fun scrollRectToVisible(rect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("scrollRectToVisible:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Boolean
    }

    open fun autoscroll(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("autoscroll:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun adjustScroll(newVisible: NSRect): NSRect {
        val sel = ObjCRuntime.sel("adjustScroll:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(newVisible.segment, NSRect.layout)))
    }

    open fun scrollRect_by(rect: NSRect, delta: NSSize): Unit {
        val sel = ObjCRuntime.sel("scrollRect:by:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(delta.segment, NSSize.layout))
    }

    open fun translateRectsNeedingDisplayInRect_by(clipRect: NSRect, delta: NSSize): Unit {
        val sel = ObjCRuntime.sel("translateRectsNeedingDisplayInRect:by:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(clipRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(delta.segment, NSSize.layout))
    }

    open fun hitTest(point: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("hitTest:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
    }

    open fun mouse_inRect(point: NSPoint, rect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("mouse:inRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Boolean
    }

    open fun viewWithTag(tag: Long): MemorySegment {
        val sel = ObjCRuntime.sel("viewWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, tag) as MemorySegment
    }

    override fun performKeyEquivalent(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("performKeyEquivalent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun acceptsFirstMouse(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("acceptsFirstMouse:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun shouldDelayWindowOrderingForEvent(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("shouldDelayWindowOrderingForEvent:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun makeBackingLayer(): MemorySegment {
        val sel = ObjCRuntime.sel("makeBackingLayer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun updateLayer(): Unit {
        val sel = ObjCRuntime.sel("updateLayer")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun layoutSubtreeIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("layoutSubtreeIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun layout(): Unit {
        val sel = ObjCRuntime.sel("layout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun menuForEvent(event: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("menuForEvent:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, event) as MemorySegment
    }

    open fun willOpenMenu_withEvent(menu: MemorySegment, event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("willOpenMenu:withEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, menu, event)
    }

    open fun didCloseMenu_withEvent(menu: MemorySegment, event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("didCloseMenu:withEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, menu, event)
    }

    open fun addToolTipRect_owner_userData(rect: NSRect, owner: MemorySegment, `data`: MemorySegment): Long {
        val sel = ObjCRuntime.sel("addToolTipRect:owner:userData:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), owner, `data`) as Long
    }

    open fun removeToolTip(tag: Long): Unit {
        val sel = ObjCRuntime.sel("removeToolTip:")
        ObjCRuntime.msgSend(null, ptr, sel, tag)
    }

    open fun removeAllToolTips(): Unit {
        val sel = ObjCRuntime.sel("removeAllToolTips")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewWillStartLiveResize(): Unit {
        val sel = ObjCRuntime.sel("viewWillStartLiveResize")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun viewDidEndLiveResize(): Unit {
        val sel = ObjCRuntime.sel("viewDidEndLiveResize")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun getRectsExposedDuringLiveResize_count(exposedRects: NSRectPointer, count: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getRectsExposedDuringLiveResize:count:")
        ObjCRuntime.msgSend(null, ptr, sel, exposedRects.segment, count)
    }

    open fun rectForSmartMagnificationAtPoint_inRect(location: NSPoint, visibleRect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("rectForSmartMagnificationAtPoint:inRect:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(visibleRect.segment, NSRect.layout)))
    }

    open fun prepareForReuse(): Unit {
        val sel = ObjCRuntime.sel("prepareForReuse")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun prepareContentInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("prepareContentInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    open fun viewDidChangeEffectiveAppearance(): Unit {
        val sel = ObjCRuntime.sel("viewDidChangeEffectiveAppearance")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property window
    open fun window(): MemorySegment {
        val sel = ObjCRuntime.sel("window")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property superview
    open fun superview(): MemorySegment {
        val sel = ObjCRuntime.sel("superview")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property subviews
    /** @return NSArray<__kindof NSView *> * */
    open fun subviews(): MemorySegment {
        val sel = ObjCRuntime.sel("subviews")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setSubviews(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubviews:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaqueAncestor
    open fun opaqueAncestor(): MemorySegment {
        val sel = ObjCRuntime.sel("opaqueAncestor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hidden
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hiddenOrHasHiddenAncestor
    open fun isHiddenOrHasHiddenAncestor(): Boolean {
        val sel = ObjCRuntime.sel("isHiddenOrHasHiddenAncestor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property wantsDefaultClipping
    open fun wantsDefaultClipping(): Boolean {
        val sel = ObjCRuntime.sel("wantsDefaultClipping")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property postsFrameChangedNotifications
    open fun postsFrameChangedNotifications(): Boolean {
        val sel = ObjCRuntime.sel("postsFrameChangedNotifications")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setPostsFrameChangedNotifications(value: Boolean) {
        val sel = ObjCRuntime.sel("setPostsFrameChangedNotifications:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autoresizesSubviews
    open fun autoresizesSubviews(): Boolean {
        val sel = ObjCRuntime.sel("autoresizesSubviews")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAutoresizesSubviews(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutoresizesSubviews:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autoresizingMask
    open fun autoresizingMask(): NSAutoresizingMaskOptions {
        val sel = ObjCRuntime.sel("autoresizingMask")
        return NSAutoresizingMaskOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setAutoresizingMask(value: NSAutoresizingMaskOptions) {
        val sel = ObjCRuntime.sel("setAutoresizingMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property frame
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setFrame(value: NSRect) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property frameRotation
    open fun frameRotation(): Double {
        val sel = ObjCRuntime.sel("frameRotation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setFrameRotation(value: Double) {
        val sel = ObjCRuntime.sel("setFrameRotation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property frameCenterRotation
    open fun frameCenterRotation(): Double {
        val sel = ObjCRuntime.sel("frameCenterRotation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setFrameCenterRotation(value: Double) {
        val sel = ObjCRuntime.sel("setFrameCenterRotation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property boundsRotation
    open fun boundsRotation(): Double {
        val sel = ObjCRuntime.sel("boundsRotation")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setBoundsRotation(value: Double) {
        val sel = ObjCRuntime.sel("setBoundsRotation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bounds
    open fun bounds(): NSRect {
        val sel = ObjCRuntime.sel("bounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setBounds(value: NSRect) {
        val sel = ObjCRuntime.sel("setBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property flipped
    open fun isFlipped(): Boolean {
        val sel = ObjCRuntime.sel("isFlipped")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property rotatedFromBase
    open fun isRotatedFromBase(): Boolean {
        val sel = ObjCRuntime.sel("isRotatedFromBase")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property rotatedOrScaledFromBase
    open fun isRotatedOrScaledFromBase(): Boolean {
        val sel = ObjCRuntime.sel("isRotatedOrScaledFromBase")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property opaque
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canDrawConcurrently
    open fun canDrawConcurrently(): Boolean {
        val sel = ObjCRuntime.sel("canDrawConcurrently")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setCanDrawConcurrently(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanDrawConcurrently:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canDraw
    open fun canDraw(): Boolean {
        val sel = ObjCRuntime.sel("canDraw")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property needsDisplay
    open fun needsDisplay(): Boolean {
        val sel = ObjCRuntime.sel("needsDisplay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setNeedsDisplay(value: Boolean) {
        val sel = ObjCRuntime.sel("setNeedsDisplay:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property visibleRect
    open fun visibleRect(): NSRect {
        val sel = ObjCRuntime.sel("visibleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property tag
    open fun tag(): Long {
        val sel = ObjCRuntime.sel("tag")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property needsPanelToBecomeKey
    open fun needsPanelToBecomeKey(): Boolean {
        val sel = ObjCRuntime.sel("needsPanelToBecomeKey")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property mouseDownCanMoveWindow
    open fun mouseDownCanMoveWindow(): Boolean {
        val sel = ObjCRuntime.sel("mouseDownCanMoveWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property acceptsTouchEvents
    open fun acceptsTouchEvents(): Boolean {
        val sel = ObjCRuntime.sel("acceptsTouchEvents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAcceptsTouchEvents(value: Boolean) {
        val sel = ObjCRuntime.sel("setAcceptsTouchEvents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property wantsRestingTouches
    open fun wantsRestingTouches(): Boolean {
        val sel = ObjCRuntime.sel("wantsRestingTouches")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setWantsRestingTouches(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsRestingTouches:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layerContentsRedrawPolicy
    open fun layerContentsRedrawPolicy(): NSViewLayerContentsRedrawPolicy {
        val sel = ObjCRuntime.sel("layerContentsRedrawPolicy")
        return NSViewLayerContentsRedrawPolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLayerContentsRedrawPolicy(value: NSViewLayerContentsRedrawPolicy) {
        val sel = ObjCRuntime.sel("setLayerContentsRedrawPolicy:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property layerContentsPlacement
    open fun layerContentsPlacement(): NSViewLayerContentsPlacement {
        val sel = ObjCRuntime.sel("layerContentsPlacement")
        return NSViewLayerContentsPlacement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setLayerContentsPlacement(value: NSViewLayerContentsPlacement) {
        val sel = ObjCRuntime.sel("setLayerContentsPlacement:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property wantsLayer
    open fun wantsLayer(): Boolean {
        val sel = ObjCRuntime.sel("wantsLayer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setWantsLayer(value: Boolean) {
        val sel = ObjCRuntime.sel("setWantsLayer:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layer
    open fun layer(): MemorySegment {
        val sel = ObjCRuntime.sel("layer")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setLayer(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLayer:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property wantsUpdateLayer
    open fun wantsUpdateLayer(): Boolean {
        val sel = ObjCRuntime.sel("wantsUpdateLayer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canDrawSubviewsIntoLayer
    open fun canDrawSubviewsIntoLayer(): Boolean {
        val sel = ObjCRuntime.sel("canDrawSubviewsIntoLayer")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setCanDrawSubviewsIntoLayer(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanDrawSubviewsIntoLayer:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property needsLayout
    open fun needsLayout(): Boolean {
        val sel = ObjCRuntime.sel("needsLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setNeedsLayout(value: Boolean) {
        val sel = ObjCRuntime.sel("setNeedsLayout:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alphaValue
    open fun alphaValue(): Double {
        val sel = ObjCRuntime.sel("alphaValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setAlphaValue(value: Double) {
        val sel = ObjCRuntime.sel("setAlphaValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layerUsesCoreImageFilters
    open fun layerUsesCoreImageFilters(): Boolean {
        val sel = ObjCRuntime.sel("layerUsesCoreImageFilters")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setLayerUsesCoreImageFilters(value: Boolean) {
        val sel = ObjCRuntime.sel("setLayerUsesCoreImageFilters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundFilters
    /** @return NSArray<__kindof CIFilter *> * */
    open fun backgroundFilters(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundFilters")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundFilters(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundFilters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property compositingFilter
    open fun compositingFilter(): MemorySegment {
        val sel = ObjCRuntime.sel("compositingFilter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setCompositingFilter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCompositingFilter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentFilters
    /** @return NSArray<__kindof CIFilter *> * */
    open fun contentFilters(): MemorySegment {
        val sel = ObjCRuntime.sel("contentFilters")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentFilters(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentFilters:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shadow
    open fun shadow(): MemorySegment {
        val sel = ObjCRuntime.sel("shadow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setShadow(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setShadow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property clipsToBounds
    open fun clipsToBounds(): Boolean {
        val sel = ObjCRuntime.sel("clipsToBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setClipsToBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setClipsToBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property postsBoundsChangedNotifications
    open fun postsBoundsChangedNotifications(): Boolean {
        val sel = ObjCRuntime.sel("postsBoundsChangedNotifications")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setPostsBoundsChangedNotifications(value: Boolean) {
        val sel = ObjCRuntime.sel("setPostsBoundsChangedNotifications:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property enclosingScrollView
    open fun enclosingScrollView(): MemorySegment {
        val sel = ObjCRuntime.sel("enclosingScrollView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property toolTip
    open fun toolTip(): MemorySegment {
        val sel = ObjCRuntime.sel("toolTip")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setToolTip(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setToolTip:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun toolTipAsString(): String = ObjCRuntime.toJavaString(toolTip())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setToolTip(value: String) = setToolTip(ObjCRuntime.newNSString(Arena.global(), value))

    // @property inLiveResize
    open fun inLiveResize(): Boolean {
        val sel = ObjCRuntime.sel("inLiveResize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property preservesContentDuringLiveResize
    open fun preservesContentDuringLiveResize(): Boolean {
        val sel = ObjCRuntime.sel("preservesContentDuringLiveResize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property rectPreservedDuringLiveResize
    open fun rectPreservedDuringLiveResize(): NSRect {
        val sel = ObjCRuntime.sel("rectPreservedDuringLiveResize")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property inputContext
    open fun inputContext(): MemorySegment {
        val sel = ObjCRuntime.sel("inputContext")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property userInterfaceLayoutDirection
    open fun userInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection {
        val sel = ObjCRuntime.sel("userInterfaceLayoutDirection")
        return NSUserInterfaceLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setUserInterfaceLayoutDirection(value: NSUserInterfaceLayoutDirection) {
        val sel = ObjCRuntime.sel("setUserInterfaceLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property preparedContentRect
    open fun preparedContentRect(): NSRect {
        val sel = ObjCRuntime.sel("preparedContentRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setPreparedContentRect(value: NSRect) {
        val sel = ObjCRuntime.sel("setPreparedContentRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property allowsVibrancy
    open fun allowsVibrancy(): Boolean {
        val sel = ObjCRuntime.sel("allowsVibrancy")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/**
 * Required by Objective-C protocol NSAnimatablePropertyContainer.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.animations(): MemorySegment {
    val sel = ObjCRuntime.sel("animations")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAnimations(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAnimations:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSView.animator(): MemorySegment {
    val sel = ObjCRuntime.sel("animator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSView.animationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("animationForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSView_defaultAnimationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultAnimationForKey:")
    val cls = ObjCRuntime.getClass("NSView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}

/**
 * Required by Objective-C protocol NSUserInterfaceItemIdentification.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.identifier(): MemorySegment {
    val sel = ObjCRuntime.sel("identifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAppearanceCustomization.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.appearance(): MemorySegment {
    val sel = ObjCRuntime.sel("appearance")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAppearance(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAppearance:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAppearanceCustomization.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.effectiveAppearance(): MemorySegment {
    val sel = ObjCRuntime.sel("effectiveAppearance")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSView.accessibilityFrame(): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSView.accessibilityParent(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityParent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityElement(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityElement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityElement(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSView.setAccessibilityFrame(value: NSRect) {
    val sel = ObjCRuntime.sel("setAccessibilityFrame:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityFocused(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFocused")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityFocused(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFocused:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityActivationPoint(): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityActivationPoint")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}
fun NSView.setAccessibilityActivationPoint(value: NSPoint) {
    val sel = ObjCRuntime.sel("setAccessibilityActivationPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityTopLevelUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTopLevelUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityTopLevelUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTopLevelUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityURL(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityURL(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityURL:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityValueDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValueDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityValueDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValueDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityVisibleChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityVisibleChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySubrole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySubrole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySubrole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySubrole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityTitle(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityTitleUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitleUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityTitleUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitleUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityNextContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityNextContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityNextContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityNextContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityOrientation(): NSAccessibilityOrientation {
    val sel = ObjCRuntime.sel("accessibilityOrientation")
    return NSAccessibilityOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSView.setAccessibilityOrientation(value: NSAccessibilityOrientation) {
    val sel = ObjCRuntime.sel("setAccessibilityOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityOverflowButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityOverflowButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityOverflowButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityOverflowButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSView.setAccessibilityParent(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityParent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityPlaceholderValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPlaceholderValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityPlaceholderValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPlaceholderValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityPreviousContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPreviousContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityPreviousContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPreviousContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityRole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityRole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityRoleDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRoleDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityRoleDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRoleDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySearchButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySearchButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySearchMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySearchMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilitySelected(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelected")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilitySelected(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilitySelected:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySelectedChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySelectedChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityServesAsTitleForUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityServesAsTitleForUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityServesAsTitleForUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityServesAsTitleForUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityShownMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityShownMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityShownMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityShownMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMinValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMinValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMaxValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMaxValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMaxValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMaxValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityLinkedUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLinkedUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityLinkedUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLinkedUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityHelp(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHelp")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityHelp(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHelp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityFilename(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFilename")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityFilename(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFilename:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityExpanded(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityExpanded")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityExpanded(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityExpanded:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityEdited(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEdited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityEdited(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEdited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityEnabled(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityChildrenInNavigationOrder(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildrenInNavigationOrder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityChildrenInNavigationOrder(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildrenInNavigationOrder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityClearButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityClearButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityClearButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityClearButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityCancelButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCancelButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityCancelButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCancelButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityProtectedContent(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityProtectedContent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityProtectedContent(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityProtectedContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityLabel(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabel")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityLabel(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityAlternateUIVisible(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityAlternateUIVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityAlternateUIVisible(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityAlternateUIVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySharedFocusElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedFocusElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySharedFocusElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedFocusElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityRequired(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityRequired")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityRequired(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityRequired:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityCustomRotors(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomRotors")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityCustomRotors(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomRotors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityAttributedUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityAttributedUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAttributedUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityApplicationFocusedUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityApplicationFocusedUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityApplicationFocusedUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityApplicationFocusedUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMainWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMainWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMainWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMainWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityHidden(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityHidden")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityHidden(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityHidden:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityFrontmost(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFrontmost")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityFrontmost(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFrontmost:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityFocusedWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFocusedWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityFocusedWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFocusedWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityWindows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityWindows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityExtrasMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityExtrasMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityExtrasMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityExtrasMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityColumnTitles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnTitles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityColumnTitles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnTitles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityOrderedByRow(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityOrderedByRow")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityOrderedByRow(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityOrderedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityHorizontalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSView.setAccessibilityHorizontalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityVerticalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSView.setAccessibilityVerticalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityHorizontalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityHorizontalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityVerticalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityVerticalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityHandles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHandles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityHandles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHandles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityWarningValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWarningValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityWarningValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWarningValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityCriticalValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCriticalValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityCriticalValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCriticalValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityDisclosed(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityDisclosed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityDisclosed(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityDisclosedByRow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedByRow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityDisclosedByRow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityDisclosedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityDisclosedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityDisclosureLevel(): Long {
    val sel = ObjCRuntime.sel("accessibilityDisclosureLevel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSView.setAccessibilityDisclosureLevel(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosureLevel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMarkerUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMarkerUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMarkerValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMarkerValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMarkerGroupUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerGroupUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMarkerGroupUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerGroupUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSView.setAccessibilityUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityRulerMarkerType(): NSAccessibilityRulerMarkerType {
    val sel = ObjCRuntime.sel("accessibilityRulerMarkerType")
    return NSAccessibilityRulerMarkerType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSView.setAccessibilityRulerMarkerType(value: NSAccessibilityRulerMarkerType) {
    val sel = ObjCRuntime.sel("setAccessibilityRulerMarkerType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMarkerTypeDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerTypeDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMarkerTypeDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerTypeDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityHorizontalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityHorizontalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityVerticalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityVerticalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityAllowedValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAllowedValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityAllowedValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAllowedValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityLabelUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabelUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityLabelUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityLabelValue(): Float {
    val sel = ObjCRuntime.sel("accessibilityLabelValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun NSView.setAccessibilityLabelValue(value: Float) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySplitters(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySplitters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySplitters(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySplitters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityDecrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDecrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityDecrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDecrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityIncrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIncrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityIncrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIncrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityTabs(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTabs")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityTabs(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTabs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityHeader(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHeader")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityHeader(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHeader:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityColumnCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityColumnCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSView.setAccessibilityColumnCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityRowCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityRowCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSView.setAccessibilityRowCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityRowCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityIndex(): Long {
    val sel = ObjCRuntime.sel("accessibilityIndex")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSView.setAccessibilityIndex(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityVisibleRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityVisibleRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySelectedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySelectedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityVisibleColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityVisibleColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySelectedColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySelectedColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilitySortDirection(): NSAccessibilitySortDirection {
    val sel = ObjCRuntime.sel("accessibilitySortDirection")
    return NSAccessibilitySortDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSView.setAccessibilitySortDirection(value: NSAccessibilitySortDirection) {
    val sel = ObjCRuntime.sel("setAccessibilitySortDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityRowHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRowHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityRowHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRowHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySelectedCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySelectedCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityVisibleCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityVisibleCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityColumnHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityColumnHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityRowIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRowIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSView.setAccessibilityRowIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityRowIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityColumnIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityColumnIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSView.setAccessibilityColumnIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityInsertionPointLineNumber(): Long {
    val sel = ObjCRuntime.sel("accessibilityInsertionPointLineNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSView.setAccessibilityInsertionPointLineNumber(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityInsertionPointLineNumber:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilitySharedCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySharedCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSView.setAccessibilitySharedCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySharedTextUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedTextUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySharedTextUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedTextUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityVisibleCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityVisibleCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSView.setAccessibilityVisibleCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilityNumberOfCharacters(): Long {
    val sel = ObjCRuntime.sel("accessibilityNumberOfCharacters")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSView.setAccessibilityNumberOfCharacters(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityNumberOfCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySelectedText(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySelectedText(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.accessibilitySelectedTextRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSView.setAccessibilitySelectedTextRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilitySelectedTextRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilitySelectedTextRanges(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityToolbarButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityToolbarButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityToolbarButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityToolbarButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityModal(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityModal")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityModal(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityModal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityProxy(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityProxy")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityProxy(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityProxy:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityMain(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMain")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityMain(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMain:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityFullScreenButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFullScreenButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityFullScreenButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFullScreenButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityGrowArea(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityGrowArea")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityGrowArea(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityGrowArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityDocument(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityDocument(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityDefaultButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDefaultButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityDefaultButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDefaultButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityCloseButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCloseButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityCloseButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCloseButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityZoomButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityZoomButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityZoomButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityZoomButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityMinimizeButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinimizeButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityMinimizeButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimizeButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSView.isAccessibilityMinimized(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMinimized")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSView.setAccessibilityMinimized(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSView.accessibilityCustomActions(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomActions")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSView.setAccessibilityCustomActions(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomActions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityLayoutPointForScreenPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityLayoutPointForScreenPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityLayoutSizeForScreenSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityLayoutSizeForScreenSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityScreenPointForLayoutPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityScreenPointForLayoutPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityScreenSizeForLayoutSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityScreenSizeForLayoutSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityCellForColumn_row(column: Long, row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCellForColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column, row) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityAttributedStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityRangeForLine(line: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForLine:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, line))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityRangeForPosition(point: NSPoint): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForPosition:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityFrameForRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrameForRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityRTFForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRTFForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityStyleRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityStyleRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityLineForIndex(index: Long): Long {
    val sel = ObjCRuntime.sel("accessibilityLineForIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, index) as Long
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformCancel(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformCancel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformConfirm(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformConfirm")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformDecrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDecrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformDelete(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDelete")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformIncrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformIncrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformPick(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPick")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformPress(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPress")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformRaise(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformRaise")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformShowAlternateUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowAlternateUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformShowDefaultUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowDefaultUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.accessibilityPerformShowMenu(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowMenu")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSView.isAccessibilitySelectorAllowed(selector: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelectorAllowed:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, selector) as Boolean
}

// ── Category: NSKeyboardUI on NSView ─────────────────────────────────────────

fun NSView.setKeyboardFocusRingNeedsDisplayInRect(rect: NSRect): Unit {
    val sel = ObjCRuntime.sel("setKeyboardFocusRingNeedsDisplayInRect:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
}

fun NSView.drawFocusRingMask(): Unit {
    val sel = ObjCRuntime.sel("drawFocusRingMask")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.noteFocusRingMaskChanged(): Unit {
    val sel = ObjCRuntime.sel("noteFocusRingMaskChanged")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.nextKeyView(): MemorySegment {
    val sel = ObjCRuntime.sel("nextKeyView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.setNextKeyView(nextKeyView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setNextKeyView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, nextKeyView)
}

fun NSView.previousKeyView(): MemorySegment {
    val sel = ObjCRuntime.sel("previousKeyView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.nextValidKeyView(): MemorySegment {
    val sel = ObjCRuntime.sel("nextValidKeyView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.previousValidKeyView(): MemorySegment {
    val sel = ObjCRuntime.sel("previousValidKeyView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.canBecomeKeyView(): Boolean {
    val sel = ObjCRuntime.sel("canBecomeKeyView")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.focusRingType(): NSFocusRingType {
    val sel = ObjCRuntime.sel("focusRingType")
    return NSFocusRingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSView.setFocusRingType(focusRingType: NSFocusRingType): Unit {
    val sel = ObjCRuntime.sel("setFocusRingType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, focusRingType.rawValue)
}

fun NSView.focusRingMaskBounds(): NSRect {
    val sel = ObjCRuntime.sel("focusRingMaskBounds")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

// Class method: +[NSView defaultFocusRingType]
fun NSView_defaultFocusRingType(): NSFocusRingType {
    val sel = ObjCRuntime.sel("defaultFocusRingType")
    val cls = ObjCRuntime.getClass("NSView")
    return NSFocusRingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, cls, sel) as Long)
}

// ── Category: NSPrinting on NSView ─────────────────────────────────────────

fun NSView.writeEPSInsideRect_toPasteboard(rect: NSRect, pasteboard: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("writeEPSInsideRect:toPasteboard:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), pasteboard)
}

fun NSView.dataWithEPSInsideRect(rect: NSRect): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithEPSInsideRect:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
}

fun NSView.writePDFInsideRect_toPasteboard(rect: NSRect, pasteboard: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("writePDFInsideRect:toPasteboard:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), pasteboard)
}

fun NSView.dataWithPDFInsideRect(rect: NSRect): MemorySegment {
    val sel = ObjCRuntime.sel("dataWithPDFInsideRect:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
}

fun NSView.print(sender: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("print:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sender)
}

fun NSView.knowsPageRange(range: NSRangePointer): Boolean {
    val sel = ObjCRuntime.sel("knowsPageRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, range.segment) as Boolean
}

fun NSView.adjustPageWidthNew_left_right_limit(newRight: MemorySegment, oldLeft: Double, oldRight: Double, rightLimit: Double): Unit {
    val sel = ObjCRuntime.sel("adjustPageWidthNew:left:right:limit:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newRight, oldLeft, oldRight, rightLimit)
}

fun NSView.adjustPageHeightNew_top_bottom_limit(newBottom: MemorySegment, oldTop: Double, oldBottom: Double, bottomLimit: Double): Unit {
    val sel = ObjCRuntime.sel("adjustPageHeightNew:top:bottom:limit:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newBottom, oldTop, oldBottom, bottomLimit)
}

fun NSView.rectForPage(page: Long): NSRect {
    val sel = ObjCRuntime.sel("rectForPage:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, page))
}

fun NSView.locationOfPrintRect(rect: NSRect): NSPoint {
    val sel = ObjCRuntime.sel("locationOfPrintRect:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
}

fun NSView.drawPageBorderWithSize(borderSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("drawPageBorderWithSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(borderSize.segment, NSSize.layout))
}

fun NSView.drawSheetBorderWithSize(borderSize: NSSize): Unit {
    val sel = ObjCRuntime.sel("drawSheetBorderWithSize:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(borderSize.segment, NSSize.layout))
}

fun NSView.beginDocument(): Unit {
    val sel = ObjCRuntime.sel("beginDocument")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.endDocument(): Unit {
    val sel = ObjCRuntime.sel("endDocument")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.beginPageInRect_atPlacement(rect: NSRect, location: NSPoint): Unit {
    val sel = ObjCRuntime.sel("beginPageInRect:atPlacement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(location.segment, NSPoint.layout))
}

fun NSView.endPage(): Unit {
    val sel = ObjCRuntime.sel("endPage")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.heightAdjustLimit(): Double {
    val sel = ObjCRuntime.sel("heightAdjustLimit")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSView.widthAdjustLimit(): Double {
    val sel = ObjCRuntime.sel("widthAdjustLimit")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSView.pageHeader(): MemorySegment {
    val sel = ObjCRuntime.sel("pageHeader")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.pageFooter(): MemorySegment {
    val sel = ObjCRuntime.sel("pageFooter")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.printJobTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("printJobTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDrag on NSView ─────────────────────────────────────────

fun NSView.beginDraggingSessionWithItems_event_source(items: MemorySegment, event: MemorySegment, source: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("beginDraggingSessionWithItems:event:source:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, items, event, source) as MemorySegment
}

fun NSView.registerForDraggedTypes(newTypes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("registerForDraggedTypes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newTypes)
}

fun NSView.unregisterDraggedTypes(): Unit {
    val sel = ObjCRuntime.sel("unregisterDraggedTypes")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** @return NSArray<NSPasteboardType> * */
fun NSView.registeredDraggedTypes(): MemorySegment {
    val sel = ObjCRuntime.sel("registeredDraggedTypes")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSFullScreenMode on NSView ─────────────────────────────────────────

fun NSView.enterFullScreenMode_withOptions(screen: MemorySegment, options: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("enterFullScreenMode:withOptions:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, screen, options) as Boolean
}

fun NSView.exitFullScreenModeWithOptions(options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("exitFullScreenModeWithOptions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options)
}

fun NSView.isInFullScreenMode(): Boolean {
    val sel = ObjCRuntime.sel("isInFullScreenMode")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSDefinition on NSView ─────────────────────────────────────────

fun NSView.showDefinitionForAttributedString_atPoint(attrString: MemorySegment, textBaselineOrigin: NSPoint): Unit {
    val sel = ObjCRuntime.sel("showDefinitionForAttributedString:atPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrString, ObjCRuntime.ObjCStructArg(textBaselineOrigin.segment, NSPoint.layout))
}

fun NSView.showDefinitionForAttributedString_range_options_baselineOriginProvider(attrString: MemorySegment, targetRange: NSRange, options: MemorySegment, originProvider: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("showDefinitionForAttributedString:range:options:baselineOriginProvider:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attrString, ObjCRuntime.ObjCStructArg(targetRange.segment, NSRange.layout), options, originProvider)
}

// ── Category: NSFindIndicator on NSView ─────────────────────────────────────────

fun NSView.isDrawingFindIndicator(): Boolean {
    val sel = ObjCRuntime.sel("isDrawingFindIndicator")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSGestureRecognizer on NSView ─────────────────────────────────────────

fun NSView.addGestureRecognizer(gestureRecognizer: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addGestureRecognizer:")
    ObjCRuntime.msgSend(null, this.ptr, sel, gestureRecognizer)
}

fun NSView.removeGestureRecognizer(gestureRecognizer: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeGestureRecognizer:")
    ObjCRuntime.msgSend(null, this.ptr, sel, gestureRecognizer)
}

/** @return NSArray<__kindof NSGestureRecognizer *> * */
fun NSView.gestureRecognizers(): MemorySegment {
    val sel = ObjCRuntime.sel("gestureRecognizers")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.setGestureRecognizers(gestureRecognizers: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setGestureRecognizers:")
    ObjCRuntime.msgSend(null, this.ptr, sel, gestureRecognizers)
}

// ── Category: NSTouchBar on NSView ─────────────────────────────────────────

fun NSView.allowedTouchTypes(): NSTouchTypeMask {
    val sel = ObjCRuntime.sel("allowedTouchTypes")
    return NSTouchTypeMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

fun NSView.setAllowedTouchTypes(allowedTouchTypes: NSTouchTypeMask): Unit {
    val sel = ObjCRuntime.sel("setAllowedTouchTypes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, allowedTouchTypes.rawValue)
}

// ── Category: NSSafeAreas on NSView ─────────────────────────────────────────

fun NSView.safeAreaInsets(): NSEdgeInsets {
    val sel = ObjCRuntime.sel("safeAreaInsets")
    return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, this.ptr, sel))
}

fun NSView.additionalSafeAreaInsets(): NSEdgeInsets {
    val sel = ObjCRuntime.sel("additionalSafeAreaInsets")
    return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, this.ptr, sel))
}

fun NSView.setAdditionalSafeAreaInsets(additionalSafeAreaInsets: NSEdgeInsets): Unit {
    val sel = ObjCRuntime.sel("setAdditionalSafeAreaInsets:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(additionalSafeAreaInsets.segment, NSEdgeInsets.layout))
}

fun NSView.safeAreaLayoutGuide(): MemorySegment {
    val sel = ObjCRuntime.sel("safeAreaLayoutGuide")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.safeAreaRect(): NSRect {
    val sel = ObjCRuntime.sel("safeAreaRect")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

fun NSView.layoutMarginsGuide(): MemorySegment {
    val sel = ObjCRuntime.sel("layoutMarginsGuide")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSCompactControlSizeMetrics on NSView ─────────────────────────────────────────

fun NSView.prefersCompactControlSizeMetrics(): Boolean {
    val sel = ObjCRuntime.sel("prefersCompactControlSizeMetrics")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setPrefersCompactControlSizeMetrics(prefersCompactControlSizeMetrics: Boolean): Unit {
    val sel = ObjCRuntime.sel("setPrefersCompactControlSizeMetrics:")
    ObjCRuntime.msgSend(null, this.ptr, sel, prefersCompactControlSizeMetrics)
}

// ── Category: NSTrackingArea on NSView ─────────────────────────────────────────

fun NSView.addTrackingArea(trackingArea: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addTrackingArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, trackingArea)
}

fun NSView.removeTrackingArea(trackingArea: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeTrackingArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, trackingArea)
}

fun NSView.updateTrackingAreas(): Unit {
    val sel = ObjCRuntime.sel("updateTrackingAreas")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.addCursorRect_cursor(rect: NSRect, `object`: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addCursorRect:cursor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), `object`)
}

fun NSView.removeCursorRect_cursor(rect: NSRect, `object`: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeCursorRect:cursor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), `object`)
}

fun NSView.discardCursorRects(): Unit {
    val sel = ObjCRuntime.sel("discardCursorRects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.resetCursorRects(): Unit {
    val sel = ObjCRuntime.sel("resetCursorRects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.addTrackingRect_owner_userData_assumeInside(rect: NSRect, owner: MemorySegment, `data`: MemorySegment, flag: Boolean): Long {
    val sel = ObjCRuntime.sel("addTrackingRect:owner:userData:assumeInside:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), owner, `data`, flag) as Long
}

fun NSView.removeTrackingRect(tag: Long): Unit {
    val sel = ObjCRuntime.sel("removeTrackingRect:")
    ObjCRuntime.msgSend(null, this.ptr, sel, tag)
}

/** @return NSArray<NSTrackingArea *> * */
fun NSView.trackingAreas(): MemorySegment {
    val sel = ObjCRuntime.sel("trackingAreas")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDisplayLink on NSView ─────────────────────────────────────────

fun NSView.displayLinkWithTarget_selector(target: MemorySegment, selector: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("displayLinkWithTarget:selector:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, target, selector) as MemorySegment
}

// ── Category: NSDeprecated on NSView ─────────────────────────────────────────

fun NSView.dragImage_at_offset_event_pasteboard_source_slideBack(image: MemorySegment, viewLocation: NSPoint, initialOffset: NSSize, event: MemorySegment, pboard: MemorySegment, sourceObj: MemorySegment, slideFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("dragImage:at:offset:event:pasteboard:source:slideBack:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(viewLocation.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(initialOffset.segment, NSSize.layout), event, pboard, sourceObj, slideFlag)
}

fun NSView.dragFile_fromRect_slideBack_event(filename: MemorySegment, rect: NSRect, flag: Boolean, event: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("dragFile:fromRect:slideBack:event:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, filename, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), flag, event) as Boolean
}

fun NSView.dragPromisedFilesOfTypes_fromRect_source_slideBack_event(typeArray: MemorySegment, rect: NSRect, sourceObject: MemorySegment, flag: Boolean, event: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("dragPromisedFilesOfTypes:fromRect:source:slideBack:event:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, typeArray, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), sourceObject, flag, event) as Boolean
}

fun NSView.convertPointToBase(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("convertPointToBase:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

fun NSView.convertPointFromBase(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("convertPointFromBase:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

fun NSView.convertSizeToBase(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("convertSizeToBase:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

fun NSView.convertSizeFromBase(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("convertSizeFromBase:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

fun NSView.convertRectToBase(rect: NSRect): NSRect {
    val sel = ObjCRuntime.sel("convertRectToBase:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
}

fun NSView.convertRectFromBase(rect: NSRect): NSRect {
    val sel = ObjCRuntime.sel("convertRectFromBase:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
}

fun NSView.shouldDrawColor(): Boolean {
    val sel = ObjCRuntime.sel("shouldDrawColor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.gState(): Long {
    val sel = ObjCRuntime.sel("gState")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSView.allocateGState(): Unit {
    val sel = ObjCRuntime.sel("allocateGState")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.releaseGState(): Unit {
    val sel = ObjCRuntime.sel("releaseGState")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.setUpGState(): Unit {
    val sel = ObjCRuntime.sel("setUpGState")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.renewGState(): Unit {
    val sel = ObjCRuntime.sel("renewGState")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSWritingToolsCoordinator on NSView ─────────────────────────────────────────

fun NSView.writingToolsCoordinator(): MemorySegment {
    val sel = ObjCRuntime.sel("writingToolsCoordinator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.setWritingToolsCoordinator(writingToolsCoordinator: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setWritingToolsCoordinator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, writingToolsCoordinator)
}

// ── Category: NSViewEnclosingMenuItem on NSView ─────────────────────────────────────────

fun NSView.enclosingMenuItem(): MemorySegment {
    val sel = ObjCRuntime.sel("enclosingMenuItem")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSCandidateListTouchBarItem on NSView ─────────────────────────────────────────

fun NSView.candidateListTouchBarItem(): MemorySegment {
    val sel = ObjCRuntime.sel("candidateListTouchBarItem")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSClipViewSuperview on NSView ─────────────────────────────────────────

fun NSView.reflectScrolledClipView(clipView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("reflectScrolledClipView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, clipView)
}

fun NSView.scrollClipView_toPoint(clipView: MemorySegment, point: NSPoint): Unit {
    val sel = ObjCRuntime.sel("scrollClipView:toPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, clipView, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
}

// ── Category: NSConstraintBasedLayoutInstallingConstraints on NSView ─────────────────────────────────────────

fun NSView.addConstraint(constraint: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addConstraint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, constraint)
}

fun NSView.addConstraints(constraints: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addConstraints:")
    ObjCRuntime.msgSend(null, this.ptr, sel, constraints)
}

fun NSView.removeConstraint(constraint: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeConstraint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, constraint)
}

fun NSView.removeConstraints(constraints: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeConstraints:")
    ObjCRuntime.msgSend(null, this.ptr, sel, constraints)
}

fun NSView.leadingAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("leadingAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.trailingAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("trailingAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.leftAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("leftAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.rightAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("rightAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.topAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("topAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.bottomAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("bottomAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.widthAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("widthAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.heightAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("heightAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.centerXAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("centerXAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.centerYAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("centerYAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.firstBaselineAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("firstBaselineAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.lastBaselineAnchor(): MemorySegment {
    val sel = ObjCRuntime.sel("lastBaselineAnchor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<NSLayoutConstraint *> * */
fun NSView.constraints(): MemorySegment {
    val sel = ObjCRuntime.sel("constraints")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSConstraintBasedLayoutCoreMethods on NSView ─────────────────────────────────────────

fun NSView.updateConstraintsForSubtreeIfNeeded(): Unit {
    val sel = ObjCRuntime.sel("updateConstraintsForSubtreeIfNeeded")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.updateConstraints(): Unit {
    val sel = ObjCRuntime.sel("updateConstraints")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.needsUpdateConstraints(): Boolean {
    val sel = ObjCRuntime.sel("needsUpdateConstraints")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setNeedsUpdateConstraints(needsUpdateConstraints: Boolean): Unit {
    val sel = ObjCRuntime.sel("setNeedsUpdateConstraints:")
    ObjCRuntime.msgSend(null, this.ptr, sel, needsUpdateConstraints)
}

// ── Category: NSConstraintBasedCompatibility on NSView ─────────────────────────────────────────

fun NSView.translatesAutoresizingMaskIntoConstraints(): Boolean {
    val sel = ObjCRuntime.sel("translatesAutoresizingMaskIntoConstraints")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setTranslatesAutoresizingMaskIntoConstraints(translatesAutoresizingMaskIntoConstraints: Boolean): Unit {
    val sel = ObjCRuntime.sel("setTranslatesAutoresizingMaskIntoConstraints:")
    ObjCRuntime.msgSend(null, this.ptr, sel, translatesAutoresizingMaskIntoConstraints)
}

// Class method: +[NSView requiresConstraintBasedLayout]
fun NSView_requiresConstraintBasedLayout(): Boolean {
    val sel = ObjCRuntime.sel("requiresConstraintBasedLayout")
    val cls = ObjCRuntime.getClass("NSView")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSConstraintBasedLayoutLayering on NSView ─────────────────────────────────────────

fun NSView.alignmentRectForFrame(frame: NSRect): NSRect {
    val sel = ObjCRuntime.sel("alignmentRectForFrame:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout)))
}

fun NSView.frameForAlignmentRect(alignmentRect: NSRect): NSRect {
    val sel = ObjCRuntime.sel("frameForAlignmentRect:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(alignmentRect.segment, NSRect.layout)))
}

fun NSView.invalidateIntrinsicContentSize(): Unit {
    val sel = ObjCRuntime.sel("invalidateIntrinsicContentSize")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.contentHuggingPriorityForOrientation(orientation: NSLayoutConstraintOrientation): Float {
    val sel = ObjCRuntime.sel("contentHuggingPriorityForOrientation:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel, orientation.rawValue) as Float
}

fun NSView.setContentHuggingPriority_forOrientation(priority: Float, orientation: NSLayoutConstraintOrientation): Unit {
    val sel = ObjCRuntime.sel("setContentHuggingPriority:forOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, priority, orientation.rawValue)
}

fun NSView.contentCompressionResistancePriorityForOrientation(orientation: NSLayoutConstraintOrientation): Float {
    val sel = ObjCRuntime.sel("contentCompressionResistancePriorityForOrientation:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel, orientation.rawValue) as Float
}

fun NSView.setContentCompressionResistancePriority_forOrientation(priority: Float, orientation: NSLayoutConstraintOrientation): Unit {
    val sel = ObjCRuntime.sel("setContentCompressionResistancePriority:forOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, priority, orientation.rawValue)
}

fun NSView.alignmentRectInsets(): NSEdgeInsets {
    val sel = ObjCRuntime.sel("alignmentRectInsets")
    return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, this.ptr, sel))
}

fun NSView.firstBaselineOffsetFromTop(): Double {
    val sel = ObjCRuntime.sel("firstBaselineOffsetFromTop")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSView.lastBaselineOffsetFromBottom(): Double {
    val sel = ObjCRuntime.sel("lastBaselineOffsetFromBottom")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSView.baselineOffsetFromBottom(): Double {
    val sel = ObjCRuntime.sel("baselineOffsetFromBottom")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSView.intrinsicContentSize(): NSSize {
    val sel = ObjCRuntime.sel("intrinsicContentSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

fun NSView.isHorizontalContentSizeConstraintActive(): Boolean {
    val sel = ObjCRuntime.sel("isHorizontalContentSizeConstraintActive")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setHorizontalContentSizeConstraintActive(horizontalContentSizeConstraintActive: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHorizontalContentSizeConstraintActive:")
    ObjCRuntime.msgSend(null, this.ptr, sel, horizontalContentSizeConstraintActive)
}

fun NSView.isVerticalContentSizeConstraintActive(): Boolean {
    val sel = ObjCRuntime.sel("isVerticalContentSizeConstraintActive")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setVerticalContentSizeConstraintActive(verticalContentSizeConstraintActive: Boolean): Unit {
    val sel = ObjCRuntime.sel("setVerticalContentSizeConstraintActive:")
    ObjCRuntime.msgSend(null, this.ptr, sel, verticalContentSizeConstraintActive)
}

// ── Category: NSConstraintBasedLayoutFittingSize on NSView ─────────────────────────────────────────

fun NSView.fittingSize(): NSSize {
    val sel = ObjCRuntime.sel("fittingSize")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel))
}

// ── Category: NSConstraintBasedLayoutDebugging on NSView ─────────────────────────────────────────

/** @return NSArray<NSLayoutConstraint *> * */
fun NSView.constraintsAffectingLayoutForOrientation(orientation: NSLayoutConstraintOrientation): MemorySegment {
    val sel = ObjCRuntime.sel("constraintsAffectingLayoutForOrientation:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, orientation.rawValue) as MemorySegment
}

fun NSView.exerciseAmbiguityInLayout(): Unit {
    val sel = ObjCRuntime.sel("exerciseAmbiguityInLayout")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSView.hasAmbiguousLayout(): Boolean {
    val sel = ObjCRuntime.sel("hasAmbiguousLayout")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSLayoutGuideSupport on NSView ─────────────────────────────────────────

fun NSView.addLayoutGuide(guide: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addLayoutGuide:")
    ObjCRuntime.msgSend(null, this.ptr, sel, guide)
}

fun NSView.removeLayoutGuide(guide: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeLayoutGuide:")
    ObjCRuntime.msgSend(null, this.ptr, sel, guide)
}

/** @return NSArray<NSLayoutGuide *> * */
fun NSView.layoutGuides(): MemorySegment {
    val sel = ObjCRuntime.sel("layoutGuides")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: LayoutRegions on NSView ─────────────────────────────────────────

fun NSView.layoutGuideForLayoutRegion(layoutRegion: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("layoutGuideForLayoutRegion:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, layoutRegion) as MemorySegment
}

fun NSView.edgeInsetsForLayoutRegion(layoutRegion: MemorySegment): NSEdgeInsets {
    val sel = ObjCRuntime.sel("edgeInsetsForLayoutRegion:")
    return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, this.ptr, sel, layoutRegion))
}

fun NSView.rectForLayoutRegion(layoutRegion: MemorySegment): NSRect {
    val sel = ObjCRuntime.sel("rectForLayoutRegion:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, layoutRegion))
}

// ── Category: NSRulerMarkerClientViewDelegation on NSView ─────────────────────────────────────────

fun NSView.rulerView_shouldMoveMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("rulerView:shouldMoveMarker:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ruler, marker) as Boolean
}

fun NSView.rulerView_willMoveMarker_toLocation(ruler: MemorySegment, marker: MemorySegment, location: Double): Double {
    val sel = ObjCRuntime.sel("rulerView:willMoveMarker:toLocation:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, ruler, marker, location) as Double
}

fun NSView.rulerView_didMoveMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rulerView:didMoveMarker:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ruler, marker)
}

fun NSView.rulerView_shouldRemoveMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("rulerView:shouldRemoveMarker:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ruler, marker) as Boolean
}

fun NSView.rulerView_didRemoveMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rulerView:didRemoveMarker:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ruler, marker)
}

fun NSView.rulerView_shouldAddMarker(ruler: MemorySegment, marker: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("rulerView:shouldAddMarker:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, ruler, marker) as Boolean
}

fun NSView.rulerView_willAddMarker_atLocation(ruler: MemorySegment, marker: MemorySegment, location: Double): Double {
    val sel = ObjCRuntime.sel("rulerView:willAddMarker:atLocation:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, ruler, marker, location) as Double
}

fun NSView.rulerView_didAddMarker(ruler: MemorySegment, marker: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rulerView:didAddMarker:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ruler, marker)
}

fun NSView.rulerView_handleMouseDown(ruler: MemorySegment, event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rulerView:handleMouseDown:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ruler, event)
}

fun NSView.rulerView_willSetClientView(ruler: MemorySegment, newClient: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("rulerView:willSetClientView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ruler, newClient)
}

fun NSView.rulerView_locationForPoint(ruler: MemorySegment, point: NSPoint): Double {
    val sel = ObjCRuntime.sel("rulerView:locationForPoint:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel, ruler, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Double
}

fun NSView.rulerView_pointForLocation(ruler: MemorySegment, point: Double): NSPoint {
    val sel = ObjCRuntime.sel("rulerView:pointForLocation:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ruler, point))
}

// ── Category: NSOpenGLSurfaceResolution on NSView ─────────────────────────────────────────

fun NSView.wantsBestResolutionOpenGLSurface(): Boolean {
    val sel = ObjCRuntime.sel("wantsBestResolutionOpenGLSurface")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setWantsBestResolutionOpenGLSurface(wantsBestResolutionOpenGLSurface: Boolean): Unit {
    val sel = ObjCRuntime.sel("setWantsBestResolutionOpenGLSurface:")
    ObjCRuntime.msgSend(null, this.ptr, sel, wantsBestResolutionOpenGLSurface)
}

// ── Category: NSExtendedDynamicRange on NSView ─────────────────────────────────────────

fun NSView.wantsExtendedDynamicRangeOpenGLSurface(): Boolean {
    val sel = ObjCRuntime.sel("wantsExtendedDynamicRangeOpenGLSurface")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSView.setWantsExtendedDynamicRangeOpenGLSurface(wantsExtendedDynamicRangeOpenGLSurface: Boolean): Unit {
    val sel = ObjCRuntime.sel("setWantsExtendedDynamicRangeOpenGLSurface:")
    ObjCRuntime.msgSend(null, this.ptr, sel, wantsExtendedDynamicRangeOpenGLSurface)
}

// ── Category: NSPressureConfiguration on NSView ─────────────────────────────────────────

fun NSView.pressureConfiguration(): MemorySegment {
    val sel = ObjCRuntime.sel("pressureConfiguration")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSView.setPressureConfiguration(pressureConfiguration: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setPressureConfiguration:")
    ObjCRuntime.msgSend(null, this.ptr, sel, pressureConfiguration)
}
