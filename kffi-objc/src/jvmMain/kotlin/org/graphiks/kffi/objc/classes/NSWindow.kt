@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWindow
 * Superclass: NSResponder
 * Protocols: NSAnimatablePropertyContainer, NSMenuItemValidation, NSUserInterfaceValidations, NSUserInterfaceItemIdentification, NSAppearanceCustomization, NSAccessibilityElement, NSAccessibility
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSWindow(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSWindow") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun frameRectForContentRect_styleMask(cRect: NSRect, style: NSWindowStyleMask): NSRect {
            val sel = ObjCRuntime.sel("frameRectForContentRect:styleMask:")
            return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, _class, sel, ObjCRuntime.ObjCStructArg(cRect.segment, NSRect.layout), style.rawValue))
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun contentRectForFrameRect_styleMask(fRect: NSRect, style: NSWindowStyleMask): NSRect {
            val sel = ObjCRuntime.sel("contentRectForFrameRect:styleMask:")
            return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, _class, sel, ObjCRuntime.ObjCStructArg(fRect.segment, NSRect.layout), style.rawValue))
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun minFrameWidthWithTitle_styleMask(title: MemorySegment, style: NSWindowStyleMask): Double {
            val sel = ObjCRuntime.sel("minFrameWidthWithTitle:styleMask:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel, title, style.rawValue) as Double
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun minFrameWidthWithTitle_styleMask(title: String, style: NSWindowStyleMask): Double = minFrameWidthWithTitle_styleMask(ObjCRuntime.newNSString(Arena.global(), title), style)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun removeFrameUsingName(name: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("removeFrameUsingName:")
            ObjCRuntime.msgSend(null, _class, sel, name)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun standardWindowButton_forStyleMask(b: NSWindowButton, styleMask: NSWindowStyleMask): MemorySegment {
            val sel = ObjCRuntime.sel("standardWindowButton:forStyleMask:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, b.rawValue, styleMask.rawValue) as MemorySegment
        }

        /** @return NSArray<NSNumber *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun windowNumbersWithOptions(options: NSWindowNumberListOptions): MemorySegment {
            val sel = ObjCRuntime.sel("windowNumbersWithOptions:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, options.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun windowNumberAtPoint_belowWindowWithWindowNumber(point: NSPoint, windowNumber: Long): Long {
            val sel = ObjCRuntime.sel("windowNumberAtPoint:belowWindowWithWindowNumber:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout), windowNumber) as Long
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun windowWithContentViewController(contentViewController: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("windowWithContentViewController:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, contentViewController) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun defaultDepthLimit(): NSWindowDepth {
            val sel = ObjCRuntime.sel("defaultDepthLimit")
            return NSWindowDepth((ObjCRuntime.msgSend(ValueLayout.JAVA_INT, _class, sel) as Int).toLong())
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun allowsAutomaticWindowTabbing(): Boolean {
            val sel = ObjCRuntime.sel("allowsAutomaticWindowTabbing")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun setAllowsAutomaticWindowTabbing(allowsAutomaticWindowTabbing: Boolean): Unit {
            val sel = ObjCRuntime.sel("setAllowsAutomaticWindowTabbing:")
            ObjCRuntime.msgSend(null, _class, sel, allowsAutomaticWindowTabbing)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun userTabbingPreference(): NSWindowUserTabbingPreference {
            val sel = ObjCRuntime.sel("userTabbingPreference")
            return NSWindowUserTabbingPreference(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frameRectForContentRect(contentRect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("frameRectForContentRect:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(contentRect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentRectForFrameRect(frameRect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("contentRectForFrameRect:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentRect_styleMask_backing_defer(contentRect: NSRect, style: NSWindowStyleMask, backingStoreType: NSBackingStoreType, flag: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentRect:styleMask:backing:defer:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(contentRect.segment, NSRect.layout), style.rawValue, backingStoreType.rawValue, flag) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentRect_styleMask_backing_defer_screen(contentRect: NSRect, style: NSWindowStyleMask, backingStoreType: NSBackingStoreType, flag: Boolean, screen: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentRect:styleMask:backing:defer:screen:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(contentRect.segment, NSRect.layout), style.rawValue, backingStoreType.rawValue, flag, screen) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun addTitlebarAccessoryViewController(childViewController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addTitlebarAccessoryViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, childViewController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun insertTitlebarAccessoryViewController_atIndex(childViewController: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertTitlebarAccessoryViewController:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, childViewController, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun removeTitlebarAccessoryViewControllerAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeTitlebarAccessoryViewControllerAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleWithRepresentedFilename(filename: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTitleWithRepresentedFilename:")
        ObjCRuntime.msgSend(null, ptr, sel, filename)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setTitleWithRepresentedFilename(filename: String): Unit = setTitleWithRepresentedFilename(ObjCRuntime.newNSString(Arena.global(), filename))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fieldEditor_forObject(createFlag: Boolean, `object`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fieldEditor:forObject:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, createFlag, `object`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun endEditingFor(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("endEditingFor:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun constrainFrameRect_toScreen(frameRect: NSRect, screen: MemorySegment): NSRect {
        val sel = ObjCRuntime.sel("constrainFrameRect:toScreen:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), screen))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrame_display(frameRect: NSRect, flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setFrame:display:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentSize(size: NSSize): Unit {
        val sel = ObjCRuntime.sel("setContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameOrigin(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("setFrameOrigin:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameTopLeftPoint(point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("setFrameTopLeftPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cascadeTopLeftFromPoint(topLeftPoint: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("cascadeTopLeftFromPoint:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(topLeftPoint.segment, NSPoint.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun animationResizeTime(newFrame: NSRect): Double {
        val sel = ObjCRuntime.sel("animationResizeTime:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, ObjCRuntime.ObjCStructArg(newFrame.segment, NSRect.layout)) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrame_display_animate(frameRect: NSRect, displayFlag: Boolean, animateFlag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setFrame:display:animate:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout), displayFlag, animateFlag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayIfNeeded(): Unit {
        val sel = ObjCRuntime.sel("displayIfNeeded")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun display(): Unit {
        val sel = ObjCRuntime.sel("display")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun update(): Unit {
        val sel = ObjCRuntime.sel("update")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeFirstResponder(responder: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("makeFirstResponder:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, responder) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun close(): Unit {
        val sel = ObjCRuntime.sel("close")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun miniaturize(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("miniaturize:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deminiaturize(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deminiaturize:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun zoom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("zoom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun tryToPerform_with(action: MemorySegment, `object`: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("tryToPerform:with:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, action, `object`) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun validRequestorForSendType_returnType(sendType: MemorySegment, returnType: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("validRequestorForSendType:returnType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sendType, returnType) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setContentBorderThickness_forEdge(thickness: Double, edge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("setContentBorderThickness:forEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, thickness, edge.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun contentBorderThicknessForEdge(edge: NSRectEdge): Double {
        val sel = ObjCRuntime.sel("contentBorderThicknessForEdge:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, edge.rawValue) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAutorecalculatesContentBorderThickness_forEdge(flag: Boolean, edge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("setAutorecalculatesContentBorderThickness:forEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, flag, edge.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun autorecalculatesContentBorderThicknessForEdge(edge: NSRectEdge): Boolean {
        val sel = ObjCRuntime.sel("autorecalculatesContentBorderThicknessForEdge:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, edge.rawValue) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun center(): Unit {
        val sel = ObjCRuntime.sel("center")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeKeyAndOrderFront(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("makeKeyAndOrderFront:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFront(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFront:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderBack(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderBack:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderOut(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderOut:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderWindow_relativeTo(place: NSWindowOrderingMode, otherWin: Long): Unit {
        val sel = ObjCRuntime.sel("orderWindow:relativeTo:")
        ObjCRuntime.msgSend(null, ptr, sel, place.rawValue, otherWin)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFrontRegardless(): Unit {
        val sel = ObjCRuntime.sel("orderFrontRegardless")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeKeyWindow(): Unit {
        val sel = ObjCRuntime.sel("makeKeyWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeMainWindow(): Unit {
        val sel = ObjCRuntime.sel("makeMainWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun becomeKeyWindow(): Unit {
        val sel = ObjCRuntime.sel("becomeKeyWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resignKeyWindow(): Unit {
        val sel = ObjCRuntime.sel("resignKeyWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun becomeMainWindow(): Unit {
        val sel = ObjCRuntime.sel("becomeMainWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resignMainWindow(): Unit {
        val sel = ObjCRuntime.sel("resignMainWindow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun convertRectToScreen(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectToScreen:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun convertRectFromScreen(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectFromScreen:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun convertPointToScreen(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointToScreen:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun convertPointFromScreen(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointFromScreen:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun convertRectToBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectToBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun convertRectFromBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectFromBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun convertPointToBacking(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointToBacking:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun convertPointFromBacking(point: NSPoint): NSPoint {
        val sel = ObjCRuntime.sel("convertPointFromBacking:")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun backingAlignedRect_options(rect: NSRect, options: NSAlignmentOptions): NSRect {
        val sel = ObjCRuntime.sel("backingAlignedRect:options:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performClose(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performClose:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performMiniaturize(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performMiniaturize:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun performZoom(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performZoom:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dataWithEPSInsideRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("dataWithEPSInsideRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dataWithPDFInsideRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("dataWithPDFInsideRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun print(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("print:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDynamicDepthLimit(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setDynamicDepthLimit:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidateShadow(): Unit {
        val sel = ObjCRuntime.sel("invalidateShadow")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun toggleFullScreen(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleFullScreen:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameFromString(string: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setFrameFromString:")
        ObjCRuntime.msgSend(null, ptr, sel, string)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveFrameUsingName(name: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("saveFrameUsingName:")
        ObjCRuntime.msgSend(null, ptr, sel, name)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameUsingName_force(name: MemorySegment, force: Boolean): Boolean {
        val sel = ObjCRuntime.sel("setFrameUsingName:force:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, name, force) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameUsingName(name: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setFrameUsingName:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, name) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFrameAutosaveName(name: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setFrameAutosaveName:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, name) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun beginSheet_completionHandler(sheetWindow: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginSheet:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, sheetWindow, handler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun beginCriticalSheet_completionHandler(sheetWindow: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginCriticalSheet:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, sheetWindow, handler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun endSheet(sheetWindow: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("endSheet:")
        ObjCRuntime.msgSend(null, ptr, sel, sheetWindow)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun endSheet_returnCode(sheetWindow: MemorySegment, returnCode: Long): Unit {
        val sel = ObjCRuntime.sel("endSheet:returnCode:")
        ObjCRuntime.msgSend(null, ptr, sel, sheetWindow, returnCode)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun standardWindowButton(b: NSWindowButton): MemorySegment {
        val sel = ObjCRuntime.sel("standardWindowButton:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, b.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addChildWindow_ordered(childWin: MemorySegment, place: NSWindowOrderingMode): Unit {
        val sel = ObjCRuntime.sel("addChildWindow:ordered:")
        ObjCRuntime.msgSend(null, ptr, sel, childWin, place.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeChildWindow(childWin: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeChildWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, childWin)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun canRepresentDisplayGamut(displayGamut: NSDisplayGamut): Boolean {
        val sel = ObjCRuntime.sel("canRepresentDisplayGamut:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, displayGamut.rawValue) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun performWindowDragWithEvent(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performWindowDragWithEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectNextKeyView(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectNextKeyView:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectPreviousKeyView(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectPreviousKeyView:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectKeyViewFollowingView(view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectKeyViewFollowingView:")
        ObjCRuntime.msgSend(null, ptr, sel, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectKeyViewPrecedingView(view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectKeyViewPrecedingView:")
        ObjCRuntime.msgSend(null, ptr, sel, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun disableKeyEquivalentForDefaultButtonCell(): Unit {
        val sel = ObjCRuntime.sel("disableKeyEquivalentForDefaultButtonCell")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun enableKeyEquivalentForDefaultButtonCell(): Unit {
        val sel = ObjCRuntime.sel("enableKeyEquivalentForDefaultButtonCell")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun recalculateKeyViewLoop(): Unit {
        val sel = ObjCRuntime.sel("recalculateKeyViewLoop")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun toggleToolbarShown(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleToolbarShown:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runToolbarCustomizationPalette(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("runToolbarCustomizationPalette:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun selectNextTab(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectNextTab:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun selectPreviousTab(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectPreviousTab:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun moveTabToNewWindow(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveTabToNewWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun mergeAllWindows(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("mergeAllWindows:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun toggleTabBar(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleTabBar:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun toggleTabOverview(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggleTabOverview:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun addTabbedWindow_ordered(window: MemorySegment, ordered: NSWindowOrderingMode): Unit {
        val sel = ObjCRuntime.sel("addTabbedWindow:ordered:")
        ObjCRuntime.msgSend(null, ptr, sel, window, ordered.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
    open fun transferWindowSharingToWindow_completionHandler(window: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("transferWindowSharingToWindow:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, window, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun requestSharingOfWindow_completionHandler(window: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("requestSharingOfWindow:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, window, completionHandler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun requestSharingOfWindowUsingPreview_title_completionHandler(image: MemorySegment, title: MemorySegment, completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("requestSharingOfWindowUsingPreview:title:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, image, title, completionHandler)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    fun requestSharingOfWindowUsingPreview_title_completionHandler(image: MemorySegment, title: String, completionHandler: MemorySegment): Unit = requestSharingOfWindowUsingPreview_title_completionHandler(image, ObjCRuntime.newNSString(Arena.global(), title), completionHandler)

    // @property title
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun title(): MemorySegment {
        val sel = ObjCRuntime.sel("title")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun titleAsString(): String = ObjCRuntime.toJavaString(title())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitle(value: String) = setTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property subtitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun subtitle(): MemorySegment {
        val sel = ObjCRuntime.sel("subtitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setSubtitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubtitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun subtitleAsString(): String = ObjCRuntime.toJavaString(subtitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setSubtitle(value: String) = setSubtitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property titleVisibility
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun titleVisibility(): NSWindowTitleVisibility {
        val sel = ObjCRuntime.sel("titleVisibility")
        return NSWindowTitleVisibility(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setTitleVisibility(value: NSWindowTitleVisibility) {
        val sel = ObjCRuntime.sel("setTitleVisibility:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property titlebarAppearsTransparent
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun titlebarAppearsTransparent(): Boolean {
        val sel = ObjCRuntime.sel("titlebarAppearsTransparent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setTitlebarAppearsTransparent(value: Boolean) {
        val sel = ObjCRuntime.sel("setTitlebarAppearsTransparent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property toolbarStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun toolbarStyle(): NSWindowToolbarStyle {
        val sel = ObjCRuntime.sel("toolbarStyle")
        return NSWindowToolbarStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setToolbarStyle(value: NSWindowToolbarStyle) {
        val sel = ObjCRuntime.sel("setToolbarStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property contentLayoutRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun contentLayoutRect(): NSRect {
        val sel = ObjCRuntime.sel("contentLayoutRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property contentLayoutGuide
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun contentLayoutGuide(): MemorySegment {
        val sel = ObjCRuntime.sel("contentLayoutGuide")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property titlebarAccessoryViewControllers
    /** @return NSArray<__kindof NSTitlebarAccessoryViewController *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun titlebarAccessoryViewControllers(): MemorySegment {
        val sel = ObjCRuntime.sel("titlebarAccessoryViewControllers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setTitlebarAccessoryViewControllers(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTitlebarAccessoryViewControllers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property representedURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun representedURL(): MemorySegment {
        val sel = ObjCRuntime.sel("representedURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setRepresentedURL(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRepresentedURL:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property representedFilename
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun representedFilename(): MemorySegment {
        val sel = ObjCRuntime.sel("representedFilename")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRepresentedFilename(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRepresentedFilename:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun representedFilenameAsString(): String = ObjCRuntime.toJavaString(representedFilename())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRepresentedFilename(value: String) = setRepresentedFilename(ObjCRuntime.newNSString(Arena.global(), value))

    // @property excludedFromWindowsMenu
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isExcludedFromWindowsMenu(): Boolean {
        val sel = ObjCRuntime.sel("isExcludedFromWindowsMenu")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setExcludedFromWindowsMenu(value: Boolean) {
        val sel = ObjCRuntime.sel("setExcludedFromWindowsMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSWindowDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property windowNumber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowNumber(): Long {
        val sel = ObjCRuntime.sel("windowNumber")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property styleMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun styleMask(): NSWindowStyleMask {
        val sel = ObjCRuntime.sel("styleMask")
        return NSWindowStyleMask(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStyleMask(value: NSWindowStyleMask) {
        val sel = ObjCRuntime.sel("setStyleMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property cascadingReferenceFrame
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun cascadingReferenceFrame(): NSRect {
        val sel = ObjCRuntime.sel("cascadingReferenceFrame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property frame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property inLiveResize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun inLiveResize(): Boolean {
        val sel = ObjCRuntime.sel("inLiveResize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property resizeIncrements
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resizeIncrements(): NSSize {
        val sel = ObjCRuntime.sel("resizeIncrements")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setResizeIncrements(value: NSSize) {
        val sel = ObjCRuntime.sel("setResizeIncrements:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property aspectRatio
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun aspectRatio(): NSSize {
        val sel = ObjCRuntime.sel("aspectRatio")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAspectRatio(value: NSSize) {
        val sel = ObjCRuntime.sel("setAspectRatio:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property contentResizeIncrements
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentResizeIncrements(): NSSize {
        val sel = ObjCRuntime.sel("contentResizeIncrements")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentResizeIncrements(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentResizeIncrements:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property contentAspectRatio
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentAspectRatio(): NSSize {
        val sel = ObjCRuntime.sel("contentAspectRatio")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentAspectRatio(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentAspectRatio:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property viewsNeedDisplay
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun viewsNeedDisplay(): Boolean {
        val sel = ObjCRuntime.sel("viewsNeedDisplay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setViewsNeedDisplay(value: Boolean) {
        val sel = ObjCRuntime.sel("setViewsNeedDisplay:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preservesContentDuringLiveResize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preservesContentDuringLiveResize(): Boolean {
        val sel = ObjCRuntime.sel("preservesContentDuringLiveResize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreservesContentDuringLiveResize(value: Boolean) {
        val sel = ObjCRuntime.sel("setPreservesContentDuringLiveResize:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property firstResponder
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun firstResponder(): MemorySegment {
        val sel = ObjCRuntime.sel("firstResponder")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property resizeFlags
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resizeFlags(): NSEventModifierFlags {
        val sel = ObjCRuntime.sel("resizeFlags")
        return NSEventModifierFlags(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property releasedWhenClosed
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isReleasedWhenClosed(): Boolean {
        val sel = ObjCRuntime.sel("isReleasedWhenClosed")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setReleasedWhenClosed(value: Boolean) {
        val sel = ObjCRuntime.sel("setReleasedWhenClosed:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property zoomed
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isZoomed(): Boolean {
        val sel = ObjCRuntime.sel("isZoomed")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property miniaturized
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isMiniaturized(): Boolean {
        val sel = ObjCRuntime.sel("isMiniaturized")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
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

    // @property movable
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun isMovable(): Boolean {
        val sel = ObjCRuntime.sel("isMovable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setMovable(value: Boolean) {
        val sel = ObjCRuntime.sel("setMovable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property movableByWindowBackground
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isMovableByWindowBackground(): Boolean {
        val sel = ObjCRuntime.sel("isMovableByWindowBackground")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMovableByWindowBackground(value: Boolean) {
        val sel = ObjCRuntime.sel("setMovableByWindowBackground:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidesOnDeactivate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hidesOnDeactivate(): Boolean {
        val sel = ObjCRuntime.sel("hidesOnDeactivate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHidesOnDeactivate(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidesOnDeactivate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canHide
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canHide(): Boolean {
        val sel = ObjCRuntime.sel("canHide")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCanHide(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanHide:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property miniwindowImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun miniwindowImage(): MemorySegment {
        val sel = ObjCRuntime.sel("miniwindowImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMiniwindowImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMiniwindowImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property miniwindowTitle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun miniwindowTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("miniwindowTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMiniwindowTitle(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMiniwindowTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun miniwindowTitleAsString(): String = ObjCRuntime.toJavaString(miniwindowTitle())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMiniwindowTitle(value: String) = setMiniwindowTitle(ObjCRuntime.newNSString(Arena.global(), value))

    // @property dockTile
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun dockTile(): MemorySegment {
        val sel = ObjCRuntime.sel("dockTile")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property documentEdited
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isDocumentEdited(): Boolean {
        val sel = ObjCRuntime.sel("isDocumentEdited")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDocumentEdited(value: Boolean) {
        val sel = ObjCRuntime.sel("setDocumentEdited:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property visible
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isVisible(): Boolean {
        val sel = ObjCRuntime.sel("isVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property keyWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isKeyWindow(): Boolean {
        val sel = ObjCRuntime.sel("isKeyWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property mainWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isMainWindow(): Boolean {
        val sel = ObjCRuntime.sel("isMainWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canBecomeKeyWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canBecomeKeyWindow(): Boolean {
        val sel = ObjCRuntime.sel("canBecomeKeyWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canBecomeMainWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canBecomeMainWindow(): Boolean {
        val sel = ObjCRuntime.sel("canBecomeMainWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property worksWhenModal
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun worksWhenModal(): Boolean {
        val sel = ObjCRuntime.sel("worksWhenModal")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property preventsApplicationTerminationWhenModal
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun preventsApplicationTerminationWhenModal(): Boolean {
        val sel = ObjCRuntime.sel("preventsApplicationTerminationWhenModal")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setPreventsApplicationTerminationWhenModal(value: Boolean) {
        val sel = ObjCRuntime.sel("setPreventsApplicationTerminationWhenModal:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backingScaleFactor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun backingScaleFactor(): Double {
        val sel = ObjCRuntime.sel("backingScaleFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property allowsToolTipsWhenApplicationIsInactive
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsToolTipsWhenApplicationIsInactive(): Boolean {
        val sel = ObjCRuntime.sel("allowsToolTipsWhenApplicationIsInactive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsToolTipsWhenApplicationIsInactive(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsToolTipsWhenApplicationIsInactive:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backingType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backingType(): NSBackingStoreType {
        val sel = ObjCRuntime.sel("backingType")
        return NSBackingStoreType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackingType(value: NSBackingStoreType) {
        val sel = ObjCRuntime.sel("setBackingType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property level
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun level(): Long {
        val sel = ObjCRuntime.sel("level")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLevel(value: Long) {
        val sel = ObjCRuntime.sel("setLevel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property depthLimit
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun depthLimit(): NSWindowDepth {
        val sel = ObjCRuntime.sel("depthLimit")
        return NSWindowDepth((ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int).toLong())
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDepthLimit(value: NSWindowDepth) {
        val sel = ObjCRuntime.sel("setDepthLimit:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue.toInt())
    }

    // @property hasDynamicDepthLimit
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasDynamicDepthLimit(): Boolean {
        val sel = ObjCRuntime.sel("hasDynamicDepthLimit")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property screen
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun screen(): MemorySegment {
        val sel = ObjCRuntime.sel("screen")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property deepestScreen
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deepestScreen(): MemorySegment {
        val sel = ObjCRuntime.sel("deepestScreen")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hasShadow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasShadow(): Boolean {
        val sel = ObjCRuntime.sel("hasShadow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHasShadow(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasShadow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alphaValue
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alphaValue(): Double {
        val sel = ObjCRuntime.sel("alphaValue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlphaValue(value: Double) {
        val sel = ObjCRuntime.sel("setAlphaValue:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOpaque(value: Boolean) {
        val sel = ObjCRuntime.sel("setOpaque:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sharingType
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun sharingType(): NSWindowSharingType {
        val sel = ObjCRuntime.sel("sharingType")
        return NSWindowSharingType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setSharingType(value: NSWindowSharingType) {
        val sel = ObjCRuntime.sel("setSharingType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property allowsConcurrentViewDrawing
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun allowsConcurrentViewDrawing(): Boolean {
        val sel = ObjCRuntime.sel("allowsConcurrentViewDrawing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setAllowsConcurrentViewDrawing(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsConcurrentViewDrawing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property displaysWhenScreenProfileChanges
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displaysWhenScreenProfileChanges(): Boolean {
        val sel = ObjCRuntime.sel("displaysWhenScreenProfileChanges")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplaysWhenScreenProfileChanges(value: Boolean) {
        val sel = ObjCRuntime.sel("setDisplaysWhenScreenProfileChanges:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canBecomeVisibleWithoutLogin
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun canBecomeVisibleWithoutLogin(): Boolean {
        val sel = ObjCRuntime.sel("canBecomeVisibleWithoutLogin")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setCanBecomeVisibleWithoutLogin(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanBecomeVisibleWithoutLogin:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property collectionBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun collectionBehavior(): NSWindowCollectionBehavior {
        val sel = ObjCRuntime.sel("collectionBehavior")
        return NSWindowCollectionBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setCollectionBehavior(value: NSWindowCollectionBehavior) {
        val sel = ObjCRuntime.sel("setCollectionBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property animationBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun animationBehavior(): NSWindowAnimationBehavior {
        val sel = ObjCRuntime.sel("animationBehavior")
        return NSWindowAnimationBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setAnimationBehavior(value: NSWindowAnimationBehavior) {
        val sel = ObjCRuntime.sel("setAnimationBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property onActiveSpace
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun isOnActiveSpace(): Boolean {
        val sel = ObjCRuntime.sel("isOnActiveSpace")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property stringWithSavedFrame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stringWithSavedFrame(): MemorySegment {
        val sel = ObjCRuntime.sel("stringWithSavedFrame")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property frameAutosaveName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frameAutosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("frameAutosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property minSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minSize(): NSSize {
        val sel = ObjCRuntime.sel("minSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property maxSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxSize(): NSSize {
        val sel = ObjCRuntime.sel("maxSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaxSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property contentMinSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentMinSize(): NSSize {
        val sel = ObjCRuntime.sel("contentMinSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentMinSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentMinSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property contentMaxSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentMaxSize(): NSSize {
        val sel = ObjCRuntime.sel("contentMaxSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentMaxSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentMaxSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property minFullScreenContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun minFullScreenContentSize(): NSSize {
        val sel = ObjCRuntime.sel("minFullScreenContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setMinFullScreenContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinFullScreenContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property maxFullScreenContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun maxFullScreenContentSize(): NSSize {
        val sel = ObjCRuntime.sel("maxFullScreenContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setMaxFullScreenContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaxFullScreenContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property deviceDescription
    /** @return NSDictionary<NSDeviceDescriptionKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deviceDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("deviceDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property windowController
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun windowController(): MemorySegment {
        val sel = ObjCRuntime.sel("windowController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWindowController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setWindowController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sheets
    /** @return NSArray<__kindof NSWindow *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun sheets(): MemorySegment {
        val sel = ObjCRuntime.sel("sheets")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property attachedSheet
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attachedSheet(): MemorySegment {
        val sel = ObjCRuntime.sel("attachedSheet")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property sheet
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSheet(): Boolean {
        val sel = ObjCRuntime.sel("isSheet")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property sheetParent
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun sheetParent(): MemorySegment {
        val sel = ObjCRuntime.sel("sheetParent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property childWindows
    /** @return NSArray<__kindof NSWindow *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun childWindows(): MemorySegment {
        val sel = ObjCRuntime.sel("childWindows")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property parentWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun parentWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("parentWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setParentWindow(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setParentWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property appearanceSource
    /** @return NSObject<NSAppearanceCustomization> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun appearanceSource(): MemorySegment {
        val sel = ObjCRuntime.sel("appearanceSource")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun setAppearanceSource(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAppearanceSource:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorSpace
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun colorSpace(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpace")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun setColorSpace(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColorSpace:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property occlusionState
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun occlusionState(): NSWindowOcclusionState {
        val sel = ObjCRuntime.sel("occlusionState")
        return NSWindowOcclusionState(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property titlebarSeparatorStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun titlebarSeparatorStyle(): NSTitlebarSeparatorStyle {
        val sel = ObjCRuntime.sel("titlebarSeparatorStyle")
        return NSTitlebarSeparatorStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setTitlebarSeparatorStyle(value: NSTitlebarSeparatorStyle) {
        val sel = ObjCRuntime.sel("setTitlebarSeparatorStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property contentViewController
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun contentViewController(): MemorySegment {
        val sel = ObjCRuntime.sel("contentViewController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setContentViewController(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentViewController:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property initialFirstResponder
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initialFirstResponder(): MemorySegment {
        val sel = ObjCRuntime.sel("initialFirstResponder")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInitialFirstResponder(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInitialFirstResponder:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property keyViewSelectionDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun keyViewSelectionDirection(): NSSelectionDirection {
        val sel = ObjCRuntime.sel("keyViewSelectionDirection")
        return NSSelectionDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property defaultButtonCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaultButtonCell(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultButtonCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDefaultButtonCell(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDefaultButtonCell:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autorecalculatesKeyViewLoop
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autorecalculatesKeyViewLoop(): Boolean {
        val sel = ObjCRuntime.sel("autorecalculatesKeyViewLoop")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutorecalculatesKeyViewLoop(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutorecalculatesKeyViewLoop:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property toolbar
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun toolbar(): MemorySegment {
        val sel = ObjCRuntime.sel("toolbar")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setToolbar(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setToolbar:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsToolbarButton
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This property has no effect")
    open fun showsToolbarButton(): Boolean {
        val sel = ObjCRuntime.sel("showsToolbarButton")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "This property has no effect")
    open fun setShowsToolbarButton(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsToolbarButton:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tabbingMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun tabbingMode(): NSWindowTabbingMode {
        val sel = ObjCRuntime.sel("tabbingMode")
        return NSWindowTabbingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setTabbingMode(value: NSWindowTabbingMode) {
        val sel = ObjCRuntime.sel("setTabbingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property tabbingIdentifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun tabbingIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("tabbingIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setTabbingIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTabbingIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tabbedWindows
    /** @return NSArray<NSWindow *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun tabbedWindows(): MemorySegment {
        val sel = ObjCRuntime.sel("tabbedWindows")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property tab
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun tab(): MemorySegment {
        val sel = ObjCRuntime.sel("tab")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property tabGroup
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun tabGroup(): MemorySegment {
        val sel = ObjCRuntime.sel("tabGroup")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hasActiveWindowSharingSession
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 3, introducedSubminor = -1)
    open fun hasActiveWindowSharingSession(): Boolean {
        val sel = ObjCRuntime.sel("hasActiveWindowSharingSession")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property windowTitlebarLayoutDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun windowTitlebarLayoutDirection(): NSUserInterfaceLayoutDirection {
        val sel = ObjCRuntime.sel("windowTitlebarLayoutDirection")
        return NSUserInterfaceLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

/**
 * Required by Objective-C protocol NSAnimatablePropertyContainer.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.animations(): MemorySegment {
    val sel = ObjCRuntime.sel("animations")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAnimations(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAnimations:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSWindow.animator(): MemorySegment {
    val sel = ObjCRuntime.sel("animator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSWindow.animationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("animationForKey:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSAnimatablePropertyContainer. */
fun NSWindow_defaultAnimationForKey(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("defaultAnimationForKey:")
    val cls = ObjCRuntime.getClass("NSWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, key) as MemorySegment
}

/** Required by Objective-C protocol NSUserInterfaceValidations. */
fun NSWindow.validateUserInterfaceItem(item: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("validateUserInterfaceItem:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, item) as Boolean
}

/**
 * Required by Objective-C protocol NSUserInterfaceItemIdentification.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.identifier(): MemorySegment {
    val sel = ObjCRuntime.sel("identifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAppearanceCustomization.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.appearance(): MemorySegment {
    val sel = ObjCRuntime.sel("appearance")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAppearance(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAppearance:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAppearanceCustomization.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.effectiveAppearance(): MemorySegment {
    val sel = ObjCRuntime.sel("effectiveAppearance")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSWindow.accessibilityFrame(): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSWindow.accessibilityParent(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityParent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityElement(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityElement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityElement(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSWindow.setAccessibilityFrame(value: NSRect) {
    val sel = ObjCRuntime.sel("setAccessibilityFrame:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityFocused(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFocused")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityFocused(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFocused:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityActivationPoint(): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityActivationPoint")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}
fun NSWindow.setAccessibilityActivationPoint(value: NSPoint) {
    val sel = ObjCRuntime.sel("setAccessibilityActivationPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityTopLevelUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTopLevelUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityTopLevelUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTopLevelUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityURL(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityURL(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityURL:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityValueDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValueDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityValueDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValueDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityVisibleChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityVisibleChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySubrole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySubrole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySubrole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySubrole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityTitle(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityTitleUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitleUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityTitleUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitleUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityNextContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityNextContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityNextContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityNextContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityOrientation(): NSAccessibilityOrientation {
    val sel = ObjCRuntime.sel("accessibilityOrientation")
    return NSAccessibilityOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSWindow.setAccessibilityOrientation(value: NSAccessibilityOrientation) {
    val sel = ObjCRuntime.sel("setAccessibilityOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityOverflowButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityOverflowButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityOverflowButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityOverflowButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSWindow.setAccessibilityParent(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityParent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityPlaceholderValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPlaceholderValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityPlaceholderValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPlaceholderValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityPreviousContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPreviousContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityPreviousContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPreviousContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityRole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityRole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityRoleDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRoleDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityRoleDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRoleDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySearchButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySearchButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySearchMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySearchMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilitySelected(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelected")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilitySelected(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilitySelected:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySelectedChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySelectedChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityServesAsTitleForUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityServesAsTitleForUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityServesAsTitleForUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityServesAsTitleForUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityShownMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityShownMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityShownMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityShownMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMinValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMinValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMaxValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMaxValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMaxValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMaxValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityLinkedUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLinkedUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityLinkedUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLinkedUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityHelp(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHelp")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityHelp(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHelp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityFilename(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFilename")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityFilename(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFilename:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityExpanded(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityExpanded")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityExpanded(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityExpanded:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityEdited(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEdited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityEdited(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEdited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityEnabled(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityChildrenInNavigationOrder(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildrenInNavigationOrder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityChildrenInNavigationOrder(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildrenInNavigationOrder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityClearButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityClearButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityClearButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityClearButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityCancelButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCancelButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityCancelButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCancelButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityProtectedContent(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityProtectedContent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityProtectedContent(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityProtectedContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityLabel(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabel")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityLabel(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityAlternateUIVisible(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityAlternateUIVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityAlternateUIVisible(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityAlternateUIVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySharedFocusElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedFocusElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySharedFocusElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedFocusElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityRequired(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityRequired")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityRequired(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityRequired:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityCustomRotors(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomRotors")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityCustomRotors(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomRotors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityAttributedUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityAttributedUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAttributedUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityApplicationFocusedUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityApplicationFocusedUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityApplicationFocusedUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityApplicationFocusedUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMainWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMainWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMainWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMainWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityHidden(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityHidden")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityHidden(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityHidden:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityFrontmost(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFrontmost")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityFrontmost(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFrontmost:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityFocusedWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFocusedWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityFocusedWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFocusedWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityWindows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityWindows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityExtrasMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityExtrasMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityExtrasMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityExtrasMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityColumnTitles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnTitles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityColumnTitles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnTitles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityOrderedByRow(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityOrderedByRow")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityOrderedByRow(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityOrderedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityHorizontalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSWindow.setAccessibilityHorizontalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityVerticalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSWindow.setAccessibilityVerticalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityHorizontalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityHorizontalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityVerticalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityVerticalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityHandles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHandles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityHandles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHandles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityWarningValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWarningValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityWarningValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWarningValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityCriticalValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCriticalValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityCriticalValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCriticalValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityDisclosed(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityDisclosed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityDisclosed(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityDisclosedByRow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedByRow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityDisclosedByRow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityDisclosedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityDisclosedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityDisclosureLevel(): Long {
    val sel = ObjCRuntime.sel("accessibilityDisclosureLevel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSWindow.setAccessibilityDisclosureLevel(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosureLevel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMarkerUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMarkerUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMarkerValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMarkerValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMarkerGroupUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerGroupUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMarkerGroupUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerGroupUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSWindow.setAccessibilityUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityRulerMarkerType(): NSAccessibilityRulerMarkerType {
    val sel = ObjCRuntime.sel("accessibilityRulerMarkerType")
    return NSAccessibilityRulerMarkerType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSWindow.setAccessibilityRulerMarkerType(value: NSAccessibilityRulerMarkerType) {
    val sel = ObjCRuntime.sel("setAccessibilityRulerMarkerType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMarkerTypeDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerTypeDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMarkerTypeDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerTypeDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityHorizontalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityHorizontalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityVerticalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityVerticalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityAllowedValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAllowedValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityAllowedValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAllowedValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityLabelUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabelUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityLabelUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityLabelValue(): Float {
    val sel = ObjCRuntime.sel("accessibilityLabelValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun NSWindow.setAccessibilityLabelValue(value: Float) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySplitters(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySplitters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySplitters(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySplitters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityDecrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDecrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityDecrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDecrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityIncrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIncrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityIncrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIncrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityTabs(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTabs")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityTabs(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTabs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityHeader(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHeader")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityHeader(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHeader:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityColumnCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityColumnCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSWindow.setAccessibilityColumnCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityRowCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityRowCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSWindow.setAccessibilityRowCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityRowCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityIndex(): Long {
    val sel = ObjCRuntime.sel("accessibilityIndex")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSWindow.setAccessibilityIndex(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityVisibleRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityVisibleRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySelectedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySelectedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityVisibleColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityVisibleColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySelectedColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySelectedColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilitySortDirection(): NSAccessibilitySortDirection {
    val sel = ObjCRuntime.sel("accessibilitySortDirection")
    return NSAccessibilitySortDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSWindow.setAccessibilitySortDirection(value: NSAccessibilitySortDirection) {
    val sel = ObjCRuntime.sel("setAccessibilitySortDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityRowHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRowHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityRowHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRowHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySelectedCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySelectedCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityVisibleCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityVisibleCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityColumnHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityColumnHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityRowIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRowIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSWindow.setAccessibilityRowIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityRowIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityColumnIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityColumnIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSWindow.setAccessibilityColumnIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityInsertionPointLineNumber(): Long {
    val sel = ObjCRuntime.sel("accessibilityInsertionPointLineNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSWindow.setAccessibilityInsertionPointLineNumber(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityInsertionPointLineNumber:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilitySharedCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySharedCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSWindow.setAccessibilitySharedCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySharedTextUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedTextUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySharedTextUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedTextUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityVisibleCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityVisibleCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSWindow.setAccessibilityVisibleCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilityNumberOfCharacters(): Long {
    val sel = ObjCRuntime.sel("accessibilityNumberOfCharacters")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSWindow.setAccessibilityNumberOfCharacters(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityNumberOfCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySelectedText(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySelectedText(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.accessibilitySelectedTextRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSWindow.setAccessibilitySelectedTextRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilitySelectedTextRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilitySelectedTextRanges(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityToolbarButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityToolbarButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityToolbarButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityToolbarButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityModal(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityModal")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityModal(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityModal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityProxy(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityProxy")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityProxy(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityProxy:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityMain(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMain")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityMain(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMain:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityFullScreenButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFullScreenButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityFullScreenButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFullScreenButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityGrowArea(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityGrowArea")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityGrowArea(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityGrowArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityDocument(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityDocument(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityDefaultButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDefaultButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityDefaultButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDefaultButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityCloseButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCloseButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityCloseButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCloseButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityZoomButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityZoomButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityZoomButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityZoomButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityMinimizeButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinimizeButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityMinimizeButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimizeButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSWindow.isAccessibilityMinimized(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMinimized")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSWindow.setAccessibilityMinimized(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSWindow.accessibilityCustomActions(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomActions")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSWindow.setAccessibilityCustomActions(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomActions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityLayoutPointForScreenPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityLayoutPointForScreenPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityLayoutSizeForScreenSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityLayoutSizeForScreenSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityScreenPointForLayoutPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityScreenPointForLayoutPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityScreenSizeForLayoutSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityScreenSizeForLayoutSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityCellForColumn_row(column: Long, row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCellForColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column, row) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityAttributedStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityRangeForLine(line: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForLine:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, line))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityRangeForPosition(point: NSPoint): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForPosition:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityFrameForRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrameForRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityRTFForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRTFForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityStyleRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityStyleRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityLineForIndex(index: Long): Long {
    val sel = ObjCRuntime.sel("accessibilityLineForIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, index) as Long
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformCancel(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformCancel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformConfirm(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformConfirm")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformDecrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDecrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformDelete(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDelete")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformIncrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformIncrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformPick(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPick")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformPress(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPress")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformRaise(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformRaise")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformShowAlternateUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowAlternateUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformShowDefaultUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowDefaultUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.accessibilityPerformShowMenu(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowMenu")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSWindow.isAccessibilitySelectorAllowed(selector: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelectorAllowed:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, selector) as Boolean
}

// ── Category: NSEvent on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
fun NSWindow.trackEventsMatchingMask_timeout_mode_handler(mask: NSEventMask, timeout: Double, mode: MemorySegment, trackingHandler: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("trackEventsMatchingMask:timeout:mode:handler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, mask.rawValue, timeout, mode, trackingHandler)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.nextEventMatchingMask(mask: NSEventMask): MemorySegment {
    val sel = ObjCRuntime.sel("nextEventMatchingMask:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, mask.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.nextEventMatchingMask_untilDate_inMode_dequeue(mask: NSEventMask, expiration: MemorySegment, mode: MemorySegment, deqFlag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("nextEventMatchingMask:untilDate:inMode:dequeue:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, mask.rawValue, expiration, mode, deqFlag) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.discardEventsMatchingMask_beforeEvent(mask: NSEventMask, lastEvent: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("discardEventsMatchingMask:beforeEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, mask.rawValue, lastEvent)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.postEvent_atStart(event: MemorySegment, flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("postEvent:atStart:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.sendEvent(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sendEvent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.currentEvent(): MemorySegment {
    val sel = ObjCRuntime.sel("currentEvent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.acceptsMouseMovedEvents(): Boolean {
    val sel = ObjCRuntime.sel("acceptsMouseMovedEvents")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setAcceptsMouseMovedEvents(acceptsMouseMovedEvents: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAcceptsMouseMovedEvents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, acceptsMouseMovedEvents)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.ignoresMouseEvents(): Boolean {
    val sel = ObjCRuntime.sel("ignoresMouseEvents")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setIgnoresMouseEvents(ignoresMouseEvents: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIgnoresMouseEvents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ignoresMouseEvents)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.mouseLocationOutsideOfEventStream(): NSPoint {
    val sel = ObjCRuntime.sel("mouseLocationOutsideOfEventStream")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}

// ── Category: NSCursorRect on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.disableCursorRects(): Unit {
    val sel = ObjCRuntime.sel("disableCursorRects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.enableCursorRects(): Unit {
    val sel = ObjCRuntime.sel("enableCursorRects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.discardCursorRects(): Unit {
    val sel = ObjCRuntime.sel("discardCursorRects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.invalidateCursorRectsForView(view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("invalidateCursorRectsForView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.resetCursorRects(): Unit {
    val sel = ObjCRuntime.sel("resetCursorRects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.areCursorRectsEnabled(): Boolean {
    val sel = ObjCRuntime.sel("areCursorRectsEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSDrag on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
fun NSWindow.beginDraggingSessionWithItems_event_source(items: MemorySegment, event: MemorySegment, source: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("beginDraggingSessionWithItems:event:source:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, items, event, source) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use -[NSWindow beginDraggingSessionWithItems:event:source:] instead.")
fun NSWindow.dragImage_at_offset_event_pasteboard_source_slideBack(image: MemorySegment, baseLocation: NSPoint, initialOffset: NSSize, event: MemorySegment, pboard: MemorySegment, sourceObj: MemorySegment, slideFlag: Boolean): Unit {
    val sel = ObjCRuntime.sel("dragImage:at:offset:event:pasteboard:source:slideBack:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image, ObjCRuntime.ObjCStructArg(baseLocation.segment, NSPoint.layout), ObjCRuntime.ObjCStructArg(initialOffset.segment, NSSize.layout), event, pboard, sourceObj, slideFlag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.registerForDraggedTypes(newTypes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("registerForDraggedTypes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, newTypes)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.unregisterDraggedTypes(): Unit {
    val sel = ObjCRuntime.sel("unregisterDraggedTypes")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSDisplayLink on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.displayLinkWithTarget_selector(target: MemorySegment, selector: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("displayLinkWithTarget:selector:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, target, selector) as MemorySegment
}

// ── Category: NSDeprecated on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "This method shouldn’t be used as it doesn’t work in all drawing situations; instead, a subview should be used that implements the desired drawing behavior")
fun NSWindow.cacheImageInRect(rect: NSRect): Unit {
    val sel = ObjCRuntime.sel("cacheImageInRect:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "This method shouldn’t be used as it doesn’t work in all drawing situations; instead, a subview should be used that implements the desired drawing behavior")
fun NSWindow.restoreCachedImage(): Unit {
    val sel = ObjCRuntime.sel("restoreCachedImage")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "This method shouldn’t be used as it doesn’t work in all drawing situations; instead, a subview should be used that implements the desired drawing behavior")
fun NSWindow.discardCachedImage(): Unit {
    val sel = ObjCRuntime.sel("discardCachedImage")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "This method is unused and should not be called.")
fun NSWindow.gState(): Long {
    val sel = ObjCRuntime.sel("gState")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -convertRectToScreen: or -convertPointToScreen: instead")
fun NSWindow.convertBaseToScreen(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("convertBaseToScreen:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -convertRectFromScreen or -convertPointFromScreen: instead")
fun NSWindow.convertScreenToBase(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("convertScreenToBase:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -convertRectToBacking: and -backingScaleFactor instead")
fun NSWindow.userSpaceScaleFactor(): Double {
    val sel = ObjCRuntime.sel("userSpaceScaleFactor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "This method does not do anything and should not be called.")
fun NSWindow.useOptimizedDrawing(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("useOptimizedDrawing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "This method does not do anything and should not be called.")
fun NSWindow.canStoreColor(): Boolean {
    val sel = ObjCRuntime.sel("canStoreColor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +[NSAnimationContext runAnimationGroup:completionHandler:] to perform atomic updates across runloop invocations.")
fun NSWindow.disableFlushWindow(): Unit {
    val sel = ObjCRuntime.sel("disableFlushWindow")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +[NSAnimationContext runAnimationGroup:completionHandler:] to perform atomic updates across runloop invocations.")
fun NSWindow.enableFlushWindow(): Unit {
    val sel = ObjCRuntime.sel("enableFlushWindow")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Allow AppKit's automatic deferred display mechanism to take care of flushing any graphics contexts as needed.")
fun NSWindow.flushWindow(): Unit {
    val sel = ObjCRuntime.sel("flushWindow")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Allow AppKit's automatic deferred display mechanism to take care of flushing any graphics contexts as needed.")
fun NSWindow.flushWindowIfNeeded(): Unit {
    val sel = ObjCRuntime.sel("flushWindowIfNeeded")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This method should not be used.")
fun NSWindow.initWithWindowRef(windowRef: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithWindowRef:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, windowRef) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This method does not do anything and should not be called.")
fun NSWindow.disableScreenUpdatesUntilFlush(): Unit {
    val sel = ObjCRuntime.sel("disableScreenUpdatesUntilFlush")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +[NSAnimationContext runAnimationGroup:completionHandler:] to perform atomic updates across runloop invocations.")
fun NSWindow.isFlushWindowDisabled(): Boolean {
    val sel = ObjCRuntime.sel("isFlushWindowDisabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +[NSAnimationContext runAnimationGroup:completionHandler:] to temporarily prevent AppKit's automatic deferred display mechanism from drawing.")
fun NSWindow.isAutodisplay(): Boolean {
    val sel = ObjCRuntime.sel("isAutodisplay")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use +[NSAnimationContext runAnimationGroup:completionHandler:] to temporarily prevent AppKit's automatic deferred display mechanism from drawing.")
fun NSWindow.setAutodisplay(autodisplay: Boolean): Unit {
    val sel = ObjCRuntime.sel("setAutodisplay:")
    ObjCRuntime.msgSend(null, this.ptr, sel, autodisplay)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Add instances of NSView to display content in a window.")
fun NSWindow.graphicsContext(): MemorySegment {
    val sel = ObjCRuntime.sel("graphicsContext")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This property does not do anything and should not be used")
fun NSWindow.isOneShot(): Boolean {
    val sel = ObjCRuntime.sel("isOneShot")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This property does not do anything and should not be used")
fun NSWindow.setOneShot(oneShot: Boolean): Unit {
    val sel = ObjCRuntime.sel("setOneShot:")
    ObjCRuntime.msgSend(null, this.ptr, sel, oneShot)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This property does not do anything and should not be used")
fun NSWindow.preferredBackingLocation(): NSWindowBackingLocation {
    val sel = ObjCRuntime.sel("preferredBackingLocation")
    return NSWindowBackingLocation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This property does not do anything and should not be used")
fun NSWindow.setPreferredBackingLocation(preferredBackingLocation: NSWindowBackingLocation): Unit {
    val sel = ObjCRuntime.sel("setPreferredBackingLocation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, preferredBackingLocation.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "This property does not do anything and should not be used")
fun NSWindow.backingLocation(): NSWindowBackingLocation {
    val sel = ObjCRuntime.sel("backingLocation")
    return NSWindowBackingLocation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This property does not do anything and should not be used.")
fun NSWindow.showsResizeIndicator(): Boolean {
    val sel = ObjCRuntime.sel("showsResizeIndicator")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This property does not do anything and should not be used.")
fun NSWindow.setShowsResizeIndicator(showsResizeIndicator: Boolean): Unit {
    val sel = ObjCRuntime.sel("setShowsResizeIndicator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, showsResizeIndicator)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 15, deprecatedMinor = 0, deprecatedSubminor = -1, message = "This method should not be used.")
fun NSWindow.windowRef(): MemorySegment {
    val sel = ObjCRuntime.sel("windowRef")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSWindow menuChanged:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "This method does not do anything and should not be called.")
fun NSWindow_menuChanged(menu: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("menuChanged:")
    val cls = ObjCRuntime.getClass("NSWindow")
    ObjCRuntime.msgSend(null, cls, sel, menu)
}

// ── Category: NSConstraintBasedLayoutCoreMethods on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.updateConstraintsIfNeeded(): Unit {
    val sel = ObjCRuntime.sel("updateConstraintsIfNeeded")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.layoutIfNeeded(): Unit {
    val sel = ObjCRuntime.sel("layoutIfNeeded")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSConstraintBasedLayoutAnchoring on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.anchorAttributeForOrientation(orientation: NSLayoutConstraintOrientation): NSLayoutAttribute {
    val sel = ObjCRuntime.sel("anchorAttributeForOrientation:")
    return NSLayoutAttribute(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, orientation.rawValue) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setAnchorAttribute_forOrientation(attr: NSLayoutAttribute, orientation: NSLayoutConstraintOrientation): Unit {
    val sel = ObjCRuntime.sel("setAnchorAttribute:forOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attr.rawValue, orientation.rawValue)
}

// ── Category: NSConstraintBasedLayoutDebugging on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.visualizeConstraints(constraints: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("visualizeConstraints:")
    ObjCRuntime.msgSend(null, this.ptr, sel, constraints)
}

// ── Category: NSDrawers on NSWindow ─────────────────────────────────────────

/** @return NSArray<NSDrawer *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
fun NSWindow.drawers(): MemorySegment {
    val sel = ObjCRuntime.sel("drawers")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSScripting on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setIsMiniaturized(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIsMiniaturized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setIsVisible(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIsVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setIsZoomed(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIsZoomed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.handleCloseScriptCommand(command: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handleCloseScriptCommand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, command) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.handlePrintScriptCommand(command: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handlePrintScriptCommand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, command) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.handleSaveScriptCommand(command: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("handleSaveScriptCommand:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, command) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.hasCloseBox(): Boolean {
    val sel = ObjCRuntime.sel("hasCloseBox")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.hasTitleBar(): Boolean {
    val sel = ObjCRuntime.sel("hasTitleBar")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.isFloatingPanel(): Boolean {
    val sel = ObjCRuntime.sel("isFloatingPanel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.isMiniaturizable(): Boolean {
    val sel = ObjCRuntime.sel("isMiniaturizable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.isModalPanel(): Boolean {
    val sel = ObjCRuntime.sel("isModalPanel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.isResizable(): Boolean {
    val sel = ObjCRuntime.sel("isResizable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.isZoomable(): Boolean {
    val sel = ObjCRuntime.sel("isZoomable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.orderedIndex(): Long {
    val sel = ObjCRuntime.sel("orderedIndex")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.setOrderedIndex(orderedIndex: Long): Unit {
    val sel = ObjCRuntime.sel("setOrderedIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, orderedIndex)
}

// ── Category: NSUserInterfaceRestoration on NSWindow ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.disableSnapshotRestoration(): Unit {
    val sel = ObjCRuntime.sel("disableSnapshotRestoration")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSWindow.enableSnapshotRestoration(): Unit {
    val sel = ObjCRuntime.sel("enableSnapshotRestoration")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.isRestorable(): Boolean {
    val sel = ObjCRuntime.sel("isRestorable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.setRestorable(restorable: Boolean): Unit {
    val sel = ObjCRuntime.sel("setRestorable:")
    ObjCRuntime.msgSend(null, this.ptr, sel, restorable)
}

/** @return Class<NSWindowRestoration> */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.restorationClass(): MemorySegment {
    val sel = ObjCRuntime.sel("restorationClass")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSWindow.setRestorationClass(restorationClass: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setRestorationClass:")
    ObjCRuntime.msgSend(null, this.ptr, sel, restorationClass)
}
