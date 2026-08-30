@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStackView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
open class NSStackView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSStackView") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun stackViewWithViews(views: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("stackViewWithViews:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, views) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCustomSpacing_afterView(spacing: Double, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setCustomSpacing:afterView:")
        ObjCRuntime.msgSend(null, ptr, sel, spacing, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun customSpacingAfterView(view: MemorySegment): Double {
        val sel = ObjCRuntime.sel("customSpacingAfterView:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, view) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun addArrangedSubview(view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addArrangedSubview:")
        ObjCRuntime.msgSend(null, ptr, sel, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun insertArrangedSubview_atIndex(view: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertArrangedSubview:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, view, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun removeArrangedSubview(view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeArrangedSubview:")
        ObjCRuntime.msgSend(null, ptr, sel, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVisibilityPriority_forView(priority: Float, view: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setVisibilityPriority:forView:")
        ObjCRuntime.msgSend(null, ptr, sel, priority, view)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun visibilityPriorityForView(view: MemorySegment): Float {
        val sel = ObjCRuntime.sel("visibilityPriorityForView:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel, view) as Float
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clippingResistancePriorityForOrientation(orientation: NSLayoutConstraintOrientation): Float {
        val sel = ObjCRuntime.sel("clippingResistancePriorityForOrientation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel, orientation.rawValue) as Float
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setClippingResistancePriority_forOrientation(clippingResistancePriority: Float, orientation: NSLayoutConstraintOrientation): Unit {
        val sel = ObjCRuntime.sel("setClippingResistancePriority:forOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, clippingResistancePriority, orientation.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun huggingPriorityForOrientation(orientation: NSLayoutConstraintOrientation): Float {
        val sel = ObjCRuntime.sel("huggingPriorityForOrientation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel, orientation.rawValue) as Float
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHuggingPriority_forOrientation(huggingPriority: Float, orientation: NSLayoutConstraintOrientation): Unit {
        val sel = ObjCRuntime.sel("setHuggingPriority:forOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, huggingPriority, orientation.rawValue)
    }

    // @property delegate
    /** @return id<NSStackViewDelegate> */
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

    // @property orientation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orientation(): NSUserInterfaceLayoutOrientation {
        val sel = ObjCRuntime.sel("orientation")
        return NSUserInterfaceLayoutOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOrientation(value: NSUserInterfaceLayoutOrientation) {
        val sel = ObjCRuntime.sel("setOrientation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property alignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignment(): NSLayoutAttribute {
        val sel = ObjCRuntime.sel("alignment")
        return NSLayoutAttribute(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlignment(value: NSLayoutAttribute) {
        val sel = ObjCRuntime.sel("setAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property edgeInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun edgeInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("edgeInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEdgeInsets(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setEdgeInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property distribution
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun distribution(): NSStackViewDistribution {
        val sel = ObjCRuntime.sel("distribution")
        return NSStackViewDistribution(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setDistribution(value: NSStackViewDistribution) {
        val sel = ObjCRuntime.sel("setDistribution:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property spacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun spacing(): Double {
        val sel = ObjCRuntime.sel("spacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property detachesHiddenViews
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun detachesHiddenViews(): Boolean {
        val sel = ObjCRuntime.sel("detachesHiddenViews")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setDetachesHiddenViews(value: Boolean) {
        val sel = ObjCRuntime.sel("setDetachesHiddenViews:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property arrangedSubviews
    /** @return NSArray<__kindof NSView *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun arrangedSubviews(): MemorySegment {
        val sel = ObjCRuntime.sel("arrangedSubviews")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property detachedViews
    /** @return NSArray<__kindof NSView *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun detachedViews(): MemorySegment {
        val sel = ObjCRuntime.sel("detachedViews")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category: NSStackViewGravityAreas on NSStackView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSStackView.addView_inGravity(view: MemorySegment, gravity: NSStackViewGravity): Unit {
    val sel = ObjCRuntime.sel("addView:inGravity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view, gravity.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSStackView.insertView_atIndex_inGravity(view: MemorySegment, index: Long, gravity: NSStackViewGravity): Unit {
    val sel = ObjCRuntime.sel("insertView:atIndex:inGravity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view, index, gravity.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSStackView.removeView(view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view)
}

/** @return NSArray<__kindof NSView *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSStackView.viewsInGravity(gravity: NSStackViewGravity): MemorySegment {
    val sel = ObjCRuntime.sel("viewsInGravity:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, gravity.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSStackView.setViews_inGravity(views: MemorySegment, gravity: NSStackViewGravity): Unit {
    val sel = ObjCRuntime.sel("setViews:inGravity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, views, gravity.rawValue)
}

/** @return NSArray<__kindof NSView *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSStackView.views(): MemorySegment {
    val sel = ObjCRuntime.sel("views")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSStackViewDeprecated on NSStackView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Set -distribution to NSStackViewDistributionEqualSpacing instead.")
fun NSStackView.hasEqualSpacing(): Boolean {
    val sel = ObjCRuntime.sel("hasEqualSpacing")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 11, deprecatedSubminor = -1, message = "Set -distribution to NSStackViewDistributionEqualSpacing instead.")
fun NSStackView.setHasEqualSpacing(hasEqualSpacing: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHasEqualSpacing:")
    ObjCRuntime.msgSend(null, this.ptr, sel, hasEqualSpacing)
}
