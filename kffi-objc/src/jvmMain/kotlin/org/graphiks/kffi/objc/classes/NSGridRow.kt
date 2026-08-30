@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGridRow
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
open class NSGridRow(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSGridRow") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("cellAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mergeCellsInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("mergeCellsInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    // @property gridView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun gridView(): MemorySegment {
        val sel = ObjCRuntime.sel("gridView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfCells
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfCells(): Long {
        val sel = ObjCRuntime.sel("numberOfCells")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property yPlacement
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun yPlacement(): NSGridCellPlacement {
        val sel = ObjCRuntime.sel("yPlacement")
        return NSGridCellPlacement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setYPlacement(value: NSGridCellPlacement) {
        val sel = ObjCRuntime.sel("setYPlacement:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property rowAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowAlignment(): NSGridRowAlignment {
        val sel = ObjCRuntime.sel("rowAlignment")
        return NSGridRowAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowAlignment(value: NSGridRowAlignment) {
        val sel = ObjCRuntime.sel("setRowAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property height
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun height(): Double {
        val sel = ObjCRuntime.sel("height")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHeight(value: Double) {
        val sel = ObjCRuntime.sel("setHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property topPadding
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun topPadding(): Double {
        val sel = ObjCRuntime.sel("topPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTopPadding(value: Double) {
        val sel = ObjCRuntime.sel("setTopPadding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bottomPadding
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bottomPadding(): Double {
        val sel = ObjCRuntime.sel("bottomPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBottomPadding(value: Double) {
        val sel = ObjCRuntime.sel("setBottomPadding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidden
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSGridRow.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSGridRow.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
