@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSegmentedControl
 * Superclass: NSControl
 * Protocols: NSUserInterfaceCompression
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSegmentedControl(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSegmentedControl") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectSegmentWithTag(tag: Long): Boolean {
        val sel = ObjCRuntime.sel("selectSegmentWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, tag) as Boolean
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
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setToolTip_forSegment(toolTip: MemorySegment, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setToolTip:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, toolTip, segment)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    fun setToolTip_forSegment(toolTip: String, segment: Long): Unit = setToolTip_forSegment(ObjCRuntime.newNSString(Arena.global(), toolTip), segment)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun toolTipForSegment(segment: Long): MemorySegment {
        val sel = ObjCRuntime.sel("toolTipForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, segment) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    fun toolTipForSegmentAsString(segment: Long): String = ObjCRuntime.toJavaString(toolTipForSegment(segment))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setTag_forSegment(tag: Long, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setTag:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, tag, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun tagForSegment(segment: Long): Long {
        val sel = ObjCRuntime.sel("tagForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, segment) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setShowsMenuIndicator_forSegment(showsMenuIndicator: Boolean, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setShowsMenuIndicator:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, showsMenuIndicator, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun showsMenuIndicatorForSegment(segment: Long): Boolean {
        val sel = ObjCRuntime.sel("showsMenuIndicatorForSegment:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, segment) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setAlignment_forSegment(alignment: NSTextAlignment, segment: Long): Unit {
        val sel = ObjCRuntime.sel("setAlignment:forSegment:")
        ObjCRuntime.msgSend(null, ptr, sel, alignment.rawValue, segment)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun alignmentForSegment(segment: Long): NSTextAlignment {
        val sel = ObjCRuntime.sel("alignmentForSegment:")
        return NSTextAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, segment) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun compressWithPrioritizedCompressionOptions(prioritizedOptions: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("compressWithPrioritizedCompressionOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, prioritizedOptions)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun minimumSizeWithPrioritizedCompressionOptions(prioritizedOptions: MemorySegment): NSSize {
        val sel = ObjCRuntime.sel("minimumSizeWithPrioritizedCompressionOptions:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, prioritizedOptions))
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

    // @property springLoaded
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun isSpringLoaded(): Boolean {
        val sel = ObjCRuntime.sel("isSpringLoaded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun setSpringLoaded(value: Boolean) {
        val sel = ObjCRuntime.sel("setSpringLoaded:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trackingMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun trackingMode(): NSSegmentSwitchTracking {
        val sel = ObjCRuntime.sel("trackingMode")
        return NSSegmentSwitchTracking(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun setTrackingMode(value: NSSegmentSwitchTracking) {
        val sel = ObjCRuntime.sel("setTrackingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property doubleValueForSelectedSegment
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
    open fun doubleValueForSelectedSegment(): Double {
        val sel = ObjCRuntime.sel("doubleValueForSelectedSegment")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property selectedSegmentBezelColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun selectedSegmentBezelColor(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedSegmentBezelColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    open fun setSelectedSegmentBezelColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSelectedSegmentBezelColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property indexOfSelectedItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun indexOfSelectedItem(): Long {
        val sel = ObjCRuntime.sel("indexOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property segmentDistribution
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun segmentDistribution(): NSSegmentDistribution {
        val sel = ObjCRuntime.sel("segmentDistribution")
        return NSSegmentDistribution(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun setSegmentDistribution(value: NSSegmentDistribution) {
        val sel = ObjCRuntime.sel("setSegmentDistribution:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property activeCompressionOptions
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun activeCompressionOptions(): MemorySegment {
        val sel = ObjCRuntime.sel("activeCompressionOptions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property borderShape
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun borderShape(): NSControlBorderShape {
        val sel = ObjCRuntime.sel("borderShape")
        return NSControlBorderShape(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setBorderShape(value: NSControlBorderShape) {
        val sel = ObjCRuntime.sel("setBorderShape:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

// ── Category: NSSegmentedControlConvenience on NSSegmentedControl ─────────────────────────────────────────

// Class method: +[NSSegmentedControl segmentedControlWithLabels:trackingMode:target:action:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSSegmentedControl_segmentedControlWithLabels_trackingMode_target_action(labels: MemorySegment, trackingMode: NSSegmentSwitchTracking, target: MemorySegment, action: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("segmentedControlWithLabels:trackingMode:target:action:")
    val cls = ObjCRuntime.getClass("NSSegmentedControl")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, labels, trackingMode.rawValue, target, action) as MemorySegment
}

// Class method: +[NSSegmentedControl segmentedControlWithImages:trackingMode:target:action:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
fun NSSegmentedControl_segmentedControlWithImages_trackingMode_target_action(images: MemorySegment, trackingMode: NSSegmentSwitchTracking, target: MemorySegment, action: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("segmentedControlWithImages:trackingMode:target:action:")
    val cls = ObjCRuntime.getClass("NSSegmentedControl")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, images, trackingMode.rawValue, target, action) as MemorySegment
}
