@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSForm
 * Superclass: NSMatrix
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use NSTextField directly instead, and consider NSStackView for layout assistance")
open class NSForm(override val ptr: MemorySegment) : NSMatrix(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSForm") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfSelectedItem(): Long {
        val sel = ObjCRuntime.sel("indexOfSelectedItem")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEntryWidth(width: Double): Unit {
        val sel = ObjCRuntime.sel("setEntryWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, width)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInterlineSpacing(spacing: Double): Unit {
        val sel = ObjCRuntime.sel("setInterlineSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, spacing)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBordered(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setBordered:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBezeled(flag: Boolean): Unit {
        val sel = ObjCRuntime.sel("setBezeled:")
        ObjCRuntime.msgSend(null, ptr, sel, flag)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleAlignment(mode: NSTextAlignment): Unit {
        val sel = ObjCRuntime.sel("setTitleAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, mode.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextAlignment(mode: NSTextAlignment): Unit {
        val sel = ObjCRuntime.sel("setTextAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, mode.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleFont(fontObj: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTitleFont:")
        ObjCRuntime.msgSend(null, ptr, sel, fontObj)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextFont(fontObj: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setTextFont:")
        ObjCRuntime.msgSend(null, ptr, sel, fontObj)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cellAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("cellAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawCellAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("drawCellAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addEntry(title: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("addEntry:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, title) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun addEntry(title: String): MemorySegment = addEntry(ObjCRuntime.newNSString(Arena.global(), title))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertEntry_atIndex(title: MemorySegment, index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("insertEntry:atIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, title, index) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun insertEntry_atIndex(title: String, index: Long): MemorySegment = insertEntry_atIndex(ObjCRuntime.newNSString(Arena.global(), title), index)

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeEntryAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeEntryAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfCellWithTag(tag: Long): Long {
        val sel = ObjCRuntime.sel("indexOfCellWithTag:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, tag) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectTextAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("selectTextAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun setFrameSize(newSize: NSSize): Unit {
        val sel = ObjCRuntime.sel("setFrameSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(newSize.segment, NSSize.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTitleBaseWritingDirection(writingDirection: NSWritingDirection): Unit {
        val sel = ObjCRuntime.sel("setTitleBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, writingDirection.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTextBaseWritingDirection(writingDirection: NSWritingDirection): Unit {
        val sel = ObjCRuntime.sel("setTextBaseWritingDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, writingDirection.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun setPreferredTextFieldWidth(preferredWidth: Double): Unit {
        val sel = ObjCRuntime.sel("setPreferredTextFieldWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, preferredWidth)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun preferredTextFieldWidth(): Double {
        val sel = ObjCRuntime.sel("preferredTextFieldWidth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

}
