@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrollView
 * Superclass: NSView
 * Protocols: NSTextFinderBarContainer
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSScrollView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSScrollView") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle(cSize: NSSize, horizontalScrollerClass: MemorySegment, verticalScrollerClass: MemorySegment, type: NSBorderType, controlSize: NSControlSize, scrollerStyle: NSScrollerStyle): NSSize {
            val sel = ObjCRuntime.sel("frameSizeForContentSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:")
            return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, _class, sel, ObjCRuntime.ObjCStructArg(cSize.segment, NSSize.layout), horizontalScrollerClass, verticalScrollerClass, type.rawValue, controlSize.rawValue, scrollerStyle.rawValue))
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle(fSize: NSSize, horizontalScrollerClass: MemorySegment, verticalScrollerClass: MemorySegment, type: NSBorderType, controlSize: NSControlSize, scrollerStyle: NSScrollerStyle): NSSize {
            val sel = ObjCRuntime.sel("contentSizeForFrameSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:")
            return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, _class, sel, ObjCRuntime.ObjCStructArg(fSize.segment, NSSize.layout), horizontalScrollerClass, verticalScrollerClass, type.rawValue, controlSize.rawValue, scrollerStyle.rawValue))
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use +frameSizeForContentSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle: instead")
        fun frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType(cSize: NSSize, hFlag: Boolean, vFlag: Boolean, type: NSBorderType): NSSize {
            val sel = ObjCRuntime.sel("frameSizeForContentSize:hasHorizontalScroller:hasVerticalScroller:borderType:")
            return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, _class, sel, ObjCRuntime.ObjCStructArg(cSize.segment, NSSize.layout), hFlag, vFlag, type.rawValue))
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "+contentSizeForFrameSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle: instead")
        fun contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType(fSize: NSSize, hFlag: Boolean, vFlag: Boolean, type: NSBorderType): NSSize {
            val sel = ObjCRuntime.sel("contentSizeForFrameSize:hasHorizontalScroller:hasVerticalScroller:borderType:")
            return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, _class, sel, ObjCRuntime.ObjCStructArg(fSize.segment, NSSize.layout), hFlag, vFlag, type.rawValue))
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithFrame(frameRect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFrame:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(frameRect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tile(): Unit {
        val sel = ObjCRuntime.sel("tile")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reflectScrolledClipView(cView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reflectScrolledClipView:")
        ObjCRuntime.msgSend(null, ptr, sel, cView)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun scrollWheel(event: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("scrollWheel:")
        ObjCRuntime.msgSend(null, ptr, sel, event)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun flashScrollers(): Unit {
        val sel = ObjCRuntime.sel("flashScrollers")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun magnifyToFitRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("magnifyToFitRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setMagnification_centeredAtPoint(magnification: Double, point: NSPoint): Unit {
        val sel = ObjCRuntime.sel("setMagnification:centeredAtPoint:")
        ObjCRuntime.msgSend(null, ptr, sel, magnification, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun addFloatingSubview_forAxis(view: MemorySegment, axis: NSEventGestureAxis): Unit {
        val sel = ObjCRuntime.sel("addFloatingSubview:forAxis:")
        ObjCRuntime.msgSend(null, ptr, sel, view, axis.rawValue)
    }

    // @property documentVisibleRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun documentVisibleRect(): NSRect {
        val sel = ObjCRuntime.sel("documentVisibleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property contentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentSize(): NSSize {
        val sel = ObjCRuntime.sel("contentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
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

    // @property borderType
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun borderType(): NSBorderType {
        val sel = ObjCRuntime.sel("borderType")
        return NSBorderType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBorderType(value: NSBorderType) {
        val sel = ObjCRuntime.sel("setBorderType:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
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

    // @property hasVerticalScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasVerticalScroller(): Boolean {
        val sel = ObjCRuntime.sel("hasVerticalScroller")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHasVerticalScroller(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasVerticalScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hasHorizontalScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasHorizontalScroller(): Boolean {
        val sel = ObjCRuntime.sel("hasHorizontalScroller")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHasHorizontalScroller(value: Boolean) {
        val sel = ObjCRuntime.sel("setHasHorizontalScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property verticalScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun verticalScroller(): MemorySegment {
        val sel = ObjCRuntime.sel("verticalScroller")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticalScroller(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setVerticalScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property horizontalScroller
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun horizontalScroller(): MemorySegment {
        val sel = ObjCRuntime.sel("horizontalScroller")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHorizontalScroller(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHorizontalScroller:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autohidesScrollers
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun autohidesScrollers(): Boolean {
        val sel = ObjCRuntime.sel("autohidesScrollers")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutohidesScrollers(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutohidesScrollers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property horizontalLineScroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun horizontalLineScroll(): Double {
        val sel = ObjCRuntime.sel("horizontalLineScroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHorizontalLineScroll(value: Double) {
        val sel = ObjCRuntime.sel("setHorizontalLineScroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property verticalLineScroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun verticalLineScroll(): Double {
        val sel = ObjCRuntime.sel("verticalLineScroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticalLineScroll(value: Double) {
        val sel = ObjCRuntime.sel("setVerticalLineScroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property lineScroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun lineScroll(): Double {
        val sel = ObjCRuntime.sel("lineScroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLineScroll(value: Double) {
        val sel = ObjCRuntime.sel("setLineScroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property horizontalPageScroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun horizontalPageScroll(): Double {
        val sel = ObjCRuntime.sel("horizontalPageScroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHorizontalPageScroll(value: Double) {
        val sel = ObjCRuntime.sel("setHorizontalPageScroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property verticalPageScroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun verticalPageScroll(): Double {
        val sel = ObjCRuntime.sel("verticalPageScroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVerticalPageScroll(value: Double) {
        val sel = ObjCRuntime.sel("setVerticalPageScroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pageScroll
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pageScroll(): Double {
        val sel = ObjCRuntime.sel("pageScroll")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPageScroll(value: Double) {
        val sel = ObjCRuntime.sel("setPageScroll:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property scrollsDynamically
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrollsDynamically(): Boolean {
        val sel = ObjCRuntime.sel("scrollsDynamically")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setScrollsDynamically(value: Boolean) {
        val sel = ObjCRuntime.sel("setScrollsDynamically:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property scrollerStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun scrollerStyle(): NSScrollerStyle {
        val sel = ObjCRuntime.sel("scrollerStyle")
        return NSScrollerStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setScrollerStyle(value: NSScrollerStyle) {
        val sel = ObjCRuntime.sel("setScrollerStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property scrollerKnobStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun scrollerKnobStyle(): NSScrollerKnobStyle {
        val sel = ObjCRuntime.sel("scrollerKnobStyle")
        return NSScrollerKnobStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setScrollerKnobStyle(value: NSScrollerKnobStyle) {
        val sel = ObjCRuntime.sel("setScrollerKnobStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property horizontalScrollElasticity
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun horizontalScrollElasticity(): NSScrollElasticity {
        val sel = ObjCRuntime.sel("horizontalScrollElasticity")
        return NSScrollElasticity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setHorizontalScrollElasticity(value: NSScrollElasticity) {
        val sel = ObjCRuntime.sel("setHorizontalScrollElasticity:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property verticalScrollElasticity
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun verticalScrollElasticity(): NSScrollElasticity {
        val sel = ObjCRuntime.sel("verticalScrollElasticity")
        return NSScrollElasticity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setVerticalScrollElasticity(value: NSScrollElasticity) {
        val sel = ObjCRuntime.sel("setVerticalScrollElasticity:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property usesPredominantAxisScrolling
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun usesPredominantAxisScrolling(): Boolean {
        val sel = ObjCRuntime.sel("usesPredominantAxisScrolling")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun setUsesPredominantAxisScrolling(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesPredominantAxisScrolling:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsMagnification
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun allowsMagnification(): Boolean {
        val sel = ObjCRuntime.sel("allowsMagnification")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setAllowsMagnification(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsMagnification:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property magnification
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun magnification(): Double {
        val sel = ObjCRuntime.sel("magnification")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setMagnification(value: Double) {
        val sel = ObjCRuntime.sel("setMagnification:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxMagnification
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun maxMagnification(): Double {
        val sel = ObjCRuntime.sel("maxMagnification")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setMaxMagnification(value: Double) {
        val sel = ObjCRuntime.sel("setMaxMagnification:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minMagnification
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun minMagnification(): Double {
        val sel = ObjCRuntime.sel("minMagnification")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setMinMagnification(value: Double) {
        val sel = ObjCRuntime.sel("setMinMagnification:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property scrollerInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun scrollerInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("scrollerInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setScrollerInsets(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setScrollerInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

}

/**
 * Required by Objective-C protocol NSTextFinderBarContainer.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSScrollView.findBarView(): MemorySegment {
    val sel = ObjCRuntime.sel("findBarView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSScrollView.setFindBarView(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setFindBarView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSTextFinderBarContainer.
 */
fun NSScrollView.isFindBarVisible(): Boolean {
    val sel = ObjCRuntime.sel("isFindBarVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSScrollView.setFindBarVisible(value: Boolean) {
    val sel = ObjCRuntime.sel("setFindBarVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSTextFinderBarContainer. */
fun NSScrollView.findBarViewDidChangeHeight(): Unit {
    val sel = ObjCRuntime.sel("findBarViewDidChangeHeight")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

// ── Category: NSRulerSupport on NSScrollView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.rulersVisible(): Boolean {
    val sel = ObjCRuntime.sel("rulersVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.setRulersVisible(rulersVisible: Boolean): Unit {
    val sel = ObjCRuntime.sel("setRulersVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, rulersVisible)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.hasHorizontalRuler(): Boolean {
    val sel = ObjCRuntime.sel("hasHorizontalRuler")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.setHasHorizontalRuler(hasHorizontalRuler: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHasHorizontalRuler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hasHorizontalRuler)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.hasVerticalRuler(): Boolean {
    val sel = ObjCRuntime.sel("hasVerticalRuler")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.setHasVerticalRuler(hasVerticalRuler: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHasVerticalRuler:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hasVerticalRuler)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.horizontalRulerView(): MemorySegment {
    val sel = ObjCRuntime.sel("horizontalRulerView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.setHorizontalRulerView(horizontalRulerView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setHorizontalRulerView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, horizontalRulerView)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.verticalRulerView(): MemorySegment {
    val sel = ObjCRuntime.sel("verticalRulerView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView.setVerticalRulerView(verticalRulerView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setVerticalRulerView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, verticalRulerView)
}

// Class method: +[NSScrollView rulerViewClass]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView_rulerViewClass(): MemorySegment {
    val sel = ObjCRuntime.sel("rulerViewClass")
    val cls = ObjCRuntime.getClass("NSScrollView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSScrollView setRulerViewClass:]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScrollView_setRulerViewClass(rulerViewClass: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setRulerViewClass:")
    val cls = ObjCRuntime.getClass("NSScrollView")
    ObjCRuntime.msgSend(null, cls, sel, rulerViewClass)
}

// ── Category: NSFindBarSupport on NSScrollView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSScrollView.findBarPosition(): NSScrollViewFindBarPosition {
    val sel = ObjCRuntime.sel("findBarPosition")
    return NSScrollViewFindBarPosition(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSScrollView.setFindBarPosition(findBarPosition: NSScrollViewFindBarPosition): Unit {
    val sel = ObjCRuntime.sel("setFindBarPosition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, findBarPosition.rawValue)
}
