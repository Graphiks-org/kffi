package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewGridLayout
 * Superclass: NSCollectionViewLayout
 */
open class NSCollectionViewGridLayout(override val ptr: MemorySegment) : NSCollectionViewLayout(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewGridLayout") }

    }

    // @property margins
    open fun margins(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("margins")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }
    open fun setMargins(value: NSEdgeInsets) {
        val sel = ObjCRuntime.sel("setMargins:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSEdgeInsets.layout))
    }

    // @property minimumInteritemSpacing
    open fun minimumInteritemSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumInteritemSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMinimumInteritemSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumInteritemSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumLineSpacing
    open fun minimumLineSpacing(): Double {
        val sel = ObjCRuntime.sel("minimumLineSpacing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setMinimumLineSpacing(value: Double) {
        val sel = ObjCRuntime.sel("setMinimumLineSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfRows
    open fun maximumNumberOfRows(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMaximumNumberOfRows(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfRows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumNumberOfColumns
    open fun maximumNumberOfColumns(): Long {
        val sel = ObjCRuntime.sel("maximumNumberOfColumns")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMaximumNumberOfColumns(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumNumberOfColumns:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumItemSize
    open fun minimumItemSize(): NSSize {
        val sel = ObjCRuntime.sel("minimumItemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setMinimumItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinimumItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property maximumItemSize
    open fun maximumItemSize(): NSSize {
        val sel = ObjCRuntime.sel("maximumItemSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setMaximumItemSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaximumItemSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property backgroundColors
    /** @return NSArray<NSColor *> * */
    open fun backgroundColors(): MemorySegment {
        val sel = ObjCRuntime.sel("backgroundColors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setBackgroundColors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setBackgroundColors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
