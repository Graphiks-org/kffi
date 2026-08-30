@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGridColumn
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
open class NSGridColumn(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSGridColumn") }

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

    // @property xPlacement
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun xPlacement(): NSGridCellPlacement {
        val sel = ObjCRuntime.sel("xPlacement")
        return NSGridCellPlacement(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setXPlacement(value: NSGridCellPlacement) {
        val sel = ObjCRuntime.sel("setXPlacement:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property width
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun width(): Double {
        val sel = ObjCRuntime.sel("width")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWidth(value: Double) {
        val sel = ObjCRuntime.sel("setWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property leadingPadding
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leadingPadding(): Double {
        val sel = ObjCRuntime.sel("leadingPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLeadingPadding(value: Double) {
        val sel = ObjCRuntime.sel("setLeadingPadding:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trailingPadding
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trailingPadding(): Double {
        val sel = ObjCRuntime.sel("trailingPadding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTrailingPadding(value: Double) {
        val sel = ObjCRuntime.sel("setTrailingPadding:")
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
fun NSGridColumn.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSGridColumn.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
