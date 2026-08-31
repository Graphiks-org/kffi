@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSplitView
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSplitView(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSplitView") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawDividerInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawDividerInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun adjustSubviews(): Unit {
        val sel = ObjCRuntime.sel("adjustSubviews")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isSubviewCollapsed(subview: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("isSubviewCollapsed:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, subview) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun minPossiblePositionOfDividerAtIndex(dividerIndex: Long): Double {
        val sel = ObjCRuntime.sel("minPossiblePositionOfDividerAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, dividerIndex) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun maxPossiblePositionOfDividerAtIndex(dividerIndex: Long): Double {
        val sel = ObjCRuntime.sel("maxPossiblePositionOfDividerAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel, dividerIndex) as Double
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setPosition_ofDividerAtIndex(position: Double, dividerIndex: Long): Unit {
        val sel = ObjCRuntime.sel("setPosition:ofDividerAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, position, dividerIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun holdingPriorityForSubviewAtIndex(subviewIndex: Long): Float {
        val sel = ObjCRuntime.sel("holdingPriorityForSubviewAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel, subviewIndex) as Float
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setHoldingPriority_forSubviewAtIndex(priority: Float, subviewIndex: Long): Unit {
        val sel = ObjCRuntime.sel("setHoldingPriority:forSubviewAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, priority, subviewIndex)
    }

    // @property vertical
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isVertical(): Boolean {
        val sel = ObjCRuntime.sel("isVertical")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setVertical(value: Boolean) {
        val sel = ObjCRuntime.sel("setVertical:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property dividerStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun dividerStyle(): NSSplitViewDividerStyle {
        val sel = ObjCRuntime.sel("dividerStyle")
        return NSSplitViewDividerStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setDividerStyle(value: NSSplitViewDividerStyle) {
        val sel = ObjCRuntime.sel("setDividerStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property autosaveName
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun autosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("autosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAutosaveName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAutosaveName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSSplitViewDelegate> */
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

    // @property dividerColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun dividerColor(): MemorySegment {
        val sel = ObjCRuntime.sel("dividerColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property dividerThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun dividerThickness(): Double {
        val sel = ObjCRuntime.sel("dividerThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}

// ── Category: NSSplitViewArrangedSubviews on NSSplitView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitView.addArrangedSubview(view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addArrangedSubview:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitView.insertArrangedSubview_atIndex(view: MemorySegment, index: Long): Unit {
    val sel = ObjCRuntime.sel("insertArrangedSubview:atIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view, index)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitView.removeArrangedSubview(view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeArrangedSubview:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitView.arrangesAllSubviews(): Boolean {
    val sel = ObjCRuntime.sel("arrangesAllSubviews")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitView.setArrangesAllSubviews(arrangesAllSubviews: Boolean): Unit {
    val sel = ObjCRuntime.sel("setArrangesAllSubviews:")
    ObjCRuntime.msgSend(null, this.ptr, sel, arrangesAllSubviews)
}

/** @return NSArray<__kindof NSView *> * */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSplitView.arrangedSubviews(): MemorySegment {
    val sel = ObjCRuntime.sel("arrangedSubviews")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDeprecated on NSSplitView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSSplitView.setIsPaneSplitter(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setIsPaneSplitter:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSSplitView.isPaneSplitter(): Boolean {
    val sel = ObjCRuntime.sel("isPaneSplitter")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
