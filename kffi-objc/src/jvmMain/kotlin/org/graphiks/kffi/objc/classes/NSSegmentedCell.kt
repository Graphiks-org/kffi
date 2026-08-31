@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSegmentedCell
 * Superclass: NSActionCell
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSegmentedCell(override val ptr: MemorySegment) : NSActionCell(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSegmentedCell") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectSegmentWithTag(tag: Long): Boolean {
        val sel = ObjCRuntime.sel("selectSegmentWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, tag) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makeNextSegmentKey(): Unit {
        val sel = ObjCRuntime.sel("makeNextSegmentKey")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun makePreviousSegmentKey(): Unit {
        val sel = ObjCRuntime.sel("makePreviousSegmentKey")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWidth_forSegment(width: Double, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setWidth:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, width, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun widthForSegment(segment: Long): Double {
        val sel = ObjCRuntime.sel("widthForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, segment) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImage_forSegment(image: MemorySegment, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setImage:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, image, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageForSegment(segment: Long): MemorySegment {
        val sel = ObjCRuntime.sel("imageForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setImageScaling_forSegment(scaling: NSImageScaling, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setImageScaling:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, scaling.rawValue, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun imageScalingForSegment(segment: Long): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScalingForSegment:")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, segment) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLabel_forSegment(label: MemorySegment, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setLabel:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, label, segment)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setLabel_forSegment(label: String, segment: Long): Unit = setLabel_forSegment(ObjCRuntime.newNSString(Arena.global(), label), segment)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun labelForSegment(segment: Long): MemorySegment {
        val sel = ObjCRuntime.sel("labelForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, segment) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun labelForSegmentAsString(segment: Long): String = ObjCRuntime.toJavaString(labelForSegment(segment))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelected_forSegment(selected: Boolean, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setSelected:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, selected, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSelectedForSegment(segment: Long): Boolean {
        val sel = ObjCRuntime.sel("isSelectedForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, segment) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEnabled_forSegment(enabled: Boolean, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setEnabled:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, enabled, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEnabledForSegment(segment: Long): Boolean {
        val sel = ObjCRuntime.sel("isEnabledForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, segment) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMenu_forSegment(menu: MemorySegment, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setMenu:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, menu, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun menuForSegment(segment: Long): MemorySegment {
        val sel = ObjCRuntime.sel("menuForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setToolTip_forSegment(toolTip: MemorySegment, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setToolTip:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, toolTip, segment)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setToolTip_forSegment(toolTip: String, segment: Long): Unit = setToolTip_forSegment(ObjCRuntime.newNSString(Arena.global(), toolTip), segment)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun toolTipForSegment(segment: Long): MemorySegment {
        val sel = ObjCRuntime.sel("toolTipForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, segment) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun toolTipForSegmentAsString(segment: Long): String = ObjCRuntime.toJavaString(toolTipForSegment(segment))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTag_forSegment(tag: Long, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setTag:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, tag, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tagForSegment(segment: Long): Long {
        val sel = ObjCRuntime.sel("tagForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, segment) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawSegment_inFrame_withView(segment: Long, frame: NSRect, controlView: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("drawSegment:inFrame:withView:")
        ObjCRuntime.msgSend(null, ptr, sel, segment, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), controlView)
    }

    // @property segmentCount
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun segmentCount(): Long {
        val sel = ObjCRuntime.sel("segmentCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSegmentCount(value: Long) {
        val sel = ObjCRuntime.sel("setSegmentCount:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectedSegment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedSegment(): Long {
        val sel = ObjCRuntime.sel("selectedSegment")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectedSegment(value: Long) {
        val sel = ObjCRuntime.sel("setSelectedSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trackingMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trackingMode(): NSSegmentSwitchTracking {
        val sel = ObjCRuntime.sel("trackingMode")
        return NSSegmentSwitchTracking(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTrackingMode(value: NSSegmentSwitchTracking) {
        val sel = ObjCRuntime.sel("setTrackingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property segmentStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun segmentStyle(): NSSegmentStyle {
        val sel = ObjCRuntime.sel("segmentStyle")
        return NSSegmentStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setSegmentStyle(value: NSSegmentStyle) {
        val sel = ObjCRuntime.sel("setSegmentStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

// ── Category: NSSegmentBackgroundStyle on NSSegmentedCell ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSSegmentedCell.interiorBackgroundStyleForSegment(segment: Long): NSBackgroundStyle {
    val sel = ObjCRuntime.sel("interiorBackgroundStyleForSegment:")
    return NSBackgroundStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, segment) as Long)
}
