@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGridCell
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
open class NSGridCell(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSGridCell") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun emptyContentView(): MemorySegment {
            val sel = ObjCRuntime.sel("emptyContentView")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

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

    // @property row
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun row(): MemorySegment {
        val sel = ObjCRuntime.sel("row")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property column
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun column(): MemorySegment {
        val sel = ObjCRuntime.sel("column")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
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

    // @property customPlacementConstraints
    /** @return NSArray<NSLayoutConstraint *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun customPlacementConstraints(): MemorySegment {
        val sel = ObjCRuntime.sel("customPlacementConstraints")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCustomPlacementConstraints(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCustomPlacementConstraints:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSGridCell.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSGridCell.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
