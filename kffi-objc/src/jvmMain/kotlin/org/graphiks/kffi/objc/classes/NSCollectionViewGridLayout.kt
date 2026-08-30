@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewGridLayout
 * Superclass: NSCollectionViewLayout
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSCollectionViewGridLayout(override val ptr: MemorySegment) : NSCollectionViewLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewGridLayout") }

    }

    // @property margins
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun margins(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("margins")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMargins(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setMargins:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property minimumInteritemSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minimumInteritemSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumInteritemSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinimumInteritemSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumInteritemSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumLineSpacing
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minimumLineSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumLineSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinimumLineSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumLineSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maximumNumberOfRows(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaximumNumberOfRows(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfRows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfColumns
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maximumNumberOfColumns(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaximumNumberOfColumns(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfColumns:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumItemSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minimumItemSize(): NSSize {
        val sel = ObjCRuntime.sel("minimumItemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinimumItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinimumItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property maximumItemSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maximumItemSize(): NSSize {
        val sel = ObjCRuntime.sel("maximumItemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaximumItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaximumItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property backgroundColors
    /** @return NSArray<NSColor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun backgroundColors(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBackgroundColors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
