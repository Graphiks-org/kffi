@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableColumn
 * Superclass: NSObject
 * Protocols: NSCoding, NSUserInterfaceItemIdentification
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSTableColumn(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSTableColumn") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithIdentifier(identifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sizeToFit(): Unit {
        val sel = ObjCRuntime.sel("sizeToFit")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property identifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property tableView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun tableView(): MemorySegment {
        val sel = ObjCRuntime.sel("tableView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTableView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTableView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
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

    // @property minWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minWidth(): Double {
        val sel = ObjCRuntime.sel("minWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinWidth(value: Double) {
        val sel = ObjCRuntime.sel("setMinWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maxWidth
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxWidth(): Double {
        val sel = ObjCRuntime.sel("maxWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxWidth(value: Double) {
        val sel = ObjCRuntime.sel("setMaxWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

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

    // @property headerCell
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun headerCell(): MemorySegment {
        val sel = ObjCRuntime.sel("headerCell")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHeaderCell(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHeaderCell:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property editable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEditable(): Boolean {
        val sel = ObjCRuntime.sel("isEditable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEditable(value: Boolean) {
        val sel = ObjCRuntime.sel("setEditable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sortDescriptorPrototype
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sortDescriptorPrototype(): MemorySegment {
        val sel = ObjCRuntime.sel("sortDescriptorPrototype")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSortDescriptorPrototype(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSortDescriptorPrototype:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property resizingMask
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resizingMask(): NSTableColumnResizingOptions {
        val sel = ObjCRuntime.sel("resizingMask")
        return NSTableColumnResizingOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setResizingMask(value: NSTableColumnResizingOptions) {
        val sel = ObjCRuntime.sel("setResizingMask:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property headerToolTip
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun headerToolTip(): MemorySegment {
        val sel = ObjCRuntime.sel("headerToolTip")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setHeaderToolTip(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHeaderToolTip:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun headerToolTipAsString(): String = ObjCRuntime.toJavaString(headerToolTip())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setHeaderToolTip(value: String) = setHeaderToolTip(ObjCRuntime.newNSString(Arena.global(), value))

    // @property hidden
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSTableColumn.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

// ── Category: NSDeprecated on NSTableColumn ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSTableColumn.setResizable(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setResizable:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 4, deprecatedSubminor = -1)
fun NSTableColumn.isResizable(): Boolean {
    val sel = ObjCRuntime.sel("isResizable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTableColumn.dataCellForRow(row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("dataCellForRow:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, row) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTableColumn.dataCell(): MemorySegment {
    val sel = ObjCRuntime.sel("dataCell")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSTableColumn.setDataCell(dataCell: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDataCell:")
    ObjCRuntime.msgSend(null, this.ptr, sel, dataCell)
}
