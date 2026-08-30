@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableOrderedSet
 * Superclass: NSOrderedSet
 */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSMutableOrderedSet(override val ptr: MemorySegment) : NSOrderedSet(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMutableOrderedSet") }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun insertObject_atIndex(`object`: MemorySegment, idx: Long): Unit {
        val sel = ObjCRuntime.sel("insertObject:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`, idx)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeObjectAtIndex(idx: Long): Unit {
        val sel = ObjCRuntime.sel("removeObjectAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, idx)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun replaceObjectAtIndex_withObject(idx: Long, `object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceObjectAtIndex:withObject:")
        ObjCRuntime.msgSend(null, ptr, sel, idx, `object`)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithCapacity(numItems: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCapacity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, numItems) as MemorySegment
    }

}

// ── Category: NSExtendedMutableOrderedSet on NSMutableOrderedSet ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.addObject(`object`: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addObject:")
    ObjCRuntime.msgSend(null, this.ptr, sel, `object`)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.addObjects_count(objects: MemorySegment, count: Long): Unit {
    val sel = ObjCRuntime.sel("addObjects:count:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, count)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.addObjectsFromArray(array: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addObjectsFromArray:")
    ObjCRuntime.msgSend(null, this.ptr, sel, array)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.exchangeObjectAtIndex_withObjectAtIndex(idx1: Long, idx2: Long): Unit {
    val sel = ObjCRuntime.sel("exchangeObjectAtIndex:withObjectAtIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, idx1, idx2)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.moveObjectsAtIndexes_toIndex(indexes: MemorySegment, idx: Long): Unit {
    val sel = ObjCRuntime.sel("moveObjectsAtIndexes:toIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indexes, idx)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.insertObjects_atIndexes(objects: MemorySegment, indexes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("insertObjects:atIndexes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, indexes)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.setObject_atIndex(obj: MemorySegment, idx: Long): Unit {
    val sel = ObjCRuntime.sel("setObject:atIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj, idx)
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.setObject_atIndexedSubscript(obj: MemorySegment, idx: Long): Unit {
    val sel = ObjCRuntime.sel("setObject:atIndexedSubscript:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj, idx)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.replaceObjectsInRange_withObjects_count(range: NSRange, objects: MemorySegment, count: Long): Unit {
    val sel = ObjCRuntime.sel("replaceObjectsInRange:withObjects:count:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), objects, count)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.replaceObjectsAtIndexes_withObjects(indexes: MemorySegment, objects: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceObjectsAtIndexes:withObjects:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indexes, objects)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.removeObjectsInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("removeObjectsInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.removeObjectsAtIndexes(indexes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObjectsAtIndexes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indexes)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.removeAllObjects(): Unit {
    val sel = ObjCRuntime.sel("removeAllObjects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.removeObject(`object`: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObject:")
    ObjCRuntime.msgSend(null, this.ptr, sel, `object`)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.removeObjectsInArray(array: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObjectsInArray:")
    ObjCRuntime.msgSend(null, this.ptr, sel, array)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.intersectOrderedSet(other: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("intersectOrderedSet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, other)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.minusOrderedSet(other: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("minusOrderedSet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, other)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.unionOrderedSet(other: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("unionOrderedSet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, other)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.intersectSet(other: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("intersectSet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, other)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.minusSet(other: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("minusSet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, other)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.unionSet(other: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("unionSet:")
    ObjCRuntime.msgSend(null, this.ptr, sel, other)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.sortUsingComparator(cmptr: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortUsingComparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cmptr)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.sortWithOptions_usingComparator(opts: NSSortOptions, cmptr: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortWithOptions:usingComparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, cmptr)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.sortRange_options_usingComparator(range: NSRange, opts: NSSortOptions, cmptr: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortRange:options:usingComparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), opts.rawValue, cmptr)
}

// ── Category: NSMutableOrderedSetCreation on NSMutableOrderedSet ─────────────────────────────────────────

// Class method: +[NSMutableOrderedSet orderedSetWithCapacity:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet_orderedSetWithCapacity(numItems: Long): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithCapacity:")
    val cls = ObjCRuntime.getClass("NSMutableOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, numItems) as MemorySegment
}

// ── Category: NSMutableOrderedSetDiffing on NSMutableOrderedSet ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSMutableOrderedSet diffing methods are not available in Swift")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.applyDifference(difference: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("applyDifference:")
    ObjCRuntime.msgSend(null, this.ptr, sel, difference)
}

// ── Category: NSKeyValueSorting on NSMutableOrderedSet ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.sortUsingDescriptors(sortDescriptors: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortUsingDescriptors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sortDescriptors)
}

// ── Category: NSPredicateSupport on NSMutableOrderedSet ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableOrderedSet.filterUsingPredicate(p: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("filterUsingPredicate:")
    ObjCRuntime.msgSend(null, this.ptr, sel, p)
}
