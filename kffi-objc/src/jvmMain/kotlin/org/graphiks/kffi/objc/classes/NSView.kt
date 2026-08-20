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

    open fun initWithFrame(frameRect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
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

    open fun needsToDrawRect(rect: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("needsToDrawRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as Boolean
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

    open fun addSubview_positioned_relativeTo(view: MemorySegment, place: MemorySegment, otherView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addSubview:positioned:relativeTo:")
        ObjCRuntime.msgSend(null, ptr, sel, view, place, otherView)
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

    open fun resizeSubviewsWithOldSize(oldSize: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("resizeSubviewsWithOldSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(oldSize, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun resizeWithOldSuperviewSize(oldSize: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("resizeWithOldSuperviewSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(oldSize, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun setFrameOrigin(newOrigin: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setFrameOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")))
    }

    open fun setFrameSize(newSize: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setFrameSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newSize, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun setBoundsOrigin(newOrigin: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setBoundsOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newOrigin, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")))
    }

    open fun setBoundsSize(newSize: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setBoundsSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newSize, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun translateOriginToPoint(translation: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("translateOriginToPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(translation, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")))
    }

    open fun scaleUnitSquareToSize(newUnitSize: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scaleUnitSquareToSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newUnitSize, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun rotateByAngle(angle: Double): Unit {
        val sel = ObjCRuntime.sel("rotateByAngle:")
        ObjCRuntime.msgSend(null, ptr, sel, angle)
    }

    open fun convertPoint_fromView(point: MemorySegment, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertPoint:fromView:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")), view) as MemorySegment
    }

    open fun convertPoint_toView(point: MemorySegment, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertPoint:toView:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")), view) as MemorySegment
    }

    open fun convertSize_fromView(size: MemorySegment, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertSize:fromView:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"), ptr, sel, ObjCRuntime.ObjCStructArg(size, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")), view) as MemorySegment
    }

    open fun convertSize_toView(size: MemorySegment, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertSize:toView:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"), ptr, sel, ObjCRuntime.ObjCStructArg(size, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")), view) as MemorySegment
    }

    open fun convertRect_fromView(rect: MemorySegment, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertRect:fromView:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), view) as MemorySegment
    }

    open fun convertRect_toView(rect: MemorySegment, view: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertRect:toView:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), view) as MemorySegment
    }

    open fun backingAlignedRect_options(rect: MemorySegment, options: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("backingAlignedRect:options:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), options) as MemorySegment
    }

    open fun centerScanRect(rect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("centerScanRect:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun convertPointToBacking(point: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertPointToBacking:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"))) as MemorySegment
    }

    open fun convertPointFromBacking(point: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertPointFromBacking:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"))) as MemorySegment
    }

    open fun convertSizeToBacking(size: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertSizeToBacking:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"), ptr, sel, ObjCRuntime.ObjCStructArg(size, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"))) as MemorySegment
    }

    open fun convertSizeFromBacking(size: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertSizeFromBacking:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"), ptr, sel, ObjCRuntime.ObjCStructArg(size, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"))) as MemorySegment
    }

    open fun convertRectToBacking(rect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertRectToBacking:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun convertRectFromBacking(rect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertRectFromBacking:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun convertPointToLayer(point: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertPointToLayer:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"))) as MemorySegment
    }

    open fun convertPointFromLayer(point: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertPointFromLayer:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"))) as MemorySegment
    }

    open fun convertSizeToLayer(size: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertSizeToLayer:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"), ptr, sel, ObjCRuntime.ObjCStructArg(size, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"))) as MemorySegment
    }

    open fun convertSizeFromLayer(size: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertSizeFromLayer:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"), ptr, sel, ObjCRuntime.ObjCStructArg(size, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize"))) as MemorySegment
    }

    open fun convertRectToLayer(rect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertRectToLayer:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun convertRectFromLayer(rect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("convertRectFromLayer:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun setNeedsDisplayInRect(invalidRect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setNeedsDisplayInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(invalidRect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
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

    open fun displayRect(rect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("displayRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
    }

    open fun displayIfNeededInRect(rect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("displayIfNeededInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
    }

    open fun displayRectIgnoringOpacity(rect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("displayRectIgnoringOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
    }

    open fun displayIfNeededInRectIgnoringOpacity(rect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("displayIfNeededInRectIgnoringOpacity:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
    }

    open fun drawRect(dirtyRect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(dirtyRect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
    }

    open fun displayRectIgnoringOpacity_inContext(rect: MemorySegment, context: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("displayRectIgnoringOpacity:inContext:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), context)
    }

    open fun bitmapImageRepForCachingDisplayInRect(rect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapImageRepForCachingDisplayInRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun cacheDisplayInRect_toBitmapImageRep(rect: MemorySegment, bitmapImageRep: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("cacheDisplayInRect:toBitmapImageRep:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), bitmapImageRep)
    }

    open fun viewWillDraw(): Unit {
        val sel = ObjCRuntime.sel("viewWillDraw")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun scrollPoint(point: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scrollPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")))
    }

    open fun scrollRectToVisible(rect: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("scrollRectToVisible:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as Boolean
    }

    open fun autoscroll(event: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("autoscroll:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, event) as Boolean
    }

    open fun adjustScroll(newVisible: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("adjustScroll:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(newVisible, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun scrollRect_by(rect: MemorySegment, delta: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scrollRect:by:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), ObjCRuntime.ObjCStructArg(delta, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun translateRectsNeedingDisplayInRect_by(clipRect: MemorySegment, delta: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("translateRectsNeedingDisplayInRect:by:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(clipRect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), ObjCRuntime.ObjCStructArg(delta, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("CGSize")))
    }

    open fun hitTest(point: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("hitTest:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"))) as MemorySegment
    }

    open fun mouse_inRect(point: MemorySegment, rect: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("mouse:inRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")), ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as Boolean
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

    open fun addToolTipRect_owner_userData(rect: MemorySegment, owner: MemorySegment, `data`: MemorySegment): Long {
        val sel = ObjCRuntime.sel("addToolTipRect:owner:userData:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")), owner, `data`) as Long
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

    open fun getRectsExposedDuringLiveResize_count(exposedRects: MemorySegment, count: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getRectsExposedDuringLiveResize:count:")
        ObjCRuntime.msgSend(null, ptr, sel, exposedRects, count)
    }

    open fun rectForSmartMagnificationAtPoint_inRect(location: MemorySegment, visibleRect: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("rectForSmartMagnificationAtPoint:inRect:")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel, ObjCRuntime.ObjCStructArg(location, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint")), ObjCRuntime.ObjCStructArg(visibleRect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"))) as MemorySegment
    }

    open fun prepareForReuse(): Unit {
        val sel = ObjCRuntime.sel("prepareForReuse")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun prepareContentInRect(rect: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("prepareContentInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
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
    open fun autoresizingMask(): MemorySegment {
        val sel = ObjCRuntime.sel("autoresizingMask")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAutoresizingMask(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAutoresizingMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property frame
    open fun frame(): MemorySegment {
        val sel = ObjCRuntime.sel("frame")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel) as MemorySegment
    }
    open fun setFrame(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
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
    open fun bounds(): MemorySegment {
        val sel = ObjCRuntime.sel("bounds")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel) as MemorySegment
    }
    open fun setBounds(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
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

    // @property focusView
    open fun focusView(): MemorySegment {
        val sel = ObjCRuntime.sel("focusView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property visibleRect
    open fun visibleRect(): MemorySegment {
        val sel = ObjCRuntime.sel("visibleRect")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel) as MemorySegment
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
    open fun layerContentsRedrawPolicy(): MemorySegment {
        val sel = ObjCRuntime.sel("layerContentsRedrawPolicy")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setLayerContentsRedrawPolicy(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLayerContentsRedrawPolicy:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layerContentsPlacement
    open fun layerContentsPlacement(): MemorySegment {
        val sel = ObjCRuntime.sel("layerContentsPlacement")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setLayerContentsPlacement(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setLayerContentsPlacement:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property defaultMenu
    open fun defaultMenu(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultMenu")
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
    open fun rectPreservedDuringLiveResize(): MemorySegment {
        val sel = ObjCRuntime.sel("rectPreservedDuringLiveResize")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel) as MemorySegment
    }

    // @property inputContext
    open fun inputContext(): MemorySegment {
        val sel = ObjCRuntime.sel("inputContext")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property userInterfaceLayoutDirection
    open fun userInterfaceLayoutDirection(): MemorySegment {
        val sel = ObjCRuntime.sel("userInterfaceLayoutDirection")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setUserInterfaceLayoutDirection(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setUserInterfaceLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property compatibleWithResponsiveScrolling
    open fun isCompatibleWithResponsiveScrolling(): Boolean {
        val sel = ObjCRuntime.sel("isCompatibleWithResponsiveScrolling")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property preparedContentRect
    open fun preparedContentRect(): MemorySegment {
        val sel = ObjCRuntime.sel("preparedContentRect")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect"), ptr, sel) as MemorySegment
    }
    open fun setPreparedContentRect(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setPreparedContentRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value, MemoryLayout.structLayout(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("origin"), MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("width"), ValueLayout.JAVA_DOUBLE.withName("height")).withName("size")).withName("CGRect")))
    }

    // @property allowsVibrancy
    open fun allowsVibrancy(): Boolean {
        val sel = ObjCRuntime.sel("allowsVibrancy")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
