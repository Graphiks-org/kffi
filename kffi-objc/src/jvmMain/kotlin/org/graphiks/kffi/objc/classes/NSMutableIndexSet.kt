@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableIndexSet
 * Superclass: NSIndexSet
 */
open class NSMutableIndexSet(override val ptr: MemorySegment) : NSIndexSet(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMutableIndexSet") }

    }

    open fun addIndexes(indexSet: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, indexSet)
    }

    open fun removeIndexes(indexSet: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, indexSet)
    }

    open fun removeAllIndexes(): Unit {
        val sel = ObjCRuntime.sel("removeAllIndexes")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun addIndex(value: Long): Unit {
        val sel = ObjCRuntime.sel("addIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    open fun removeIndex(value: Long): Unit {
        val sel = ObjCRuntime.sel("removeIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    open fun addIndexesInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("addIndexesInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    open fun removeIndexesInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("removeIndexesInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    open fun shiftIndexesStartingAtIndex_by(index: Long, delta: Long): Unit {
        val sel = ObjCRuntime.sel("shiftIndexesStartingAtIndex:by:")
        ObjCRuntime.msgSend(null, ptr, sel, index, delta)
    }

}
