@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableArray
 * Superclass: NSArray
 */
open class NSMutableArray(override val ptr: MemorySegment) : NSArray(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSMutableArray") } }

    }

    open fun addObject(anObject: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addObject:")
        ObjCRuntime.msgSend(null, ptr, sel, anObject)
    }

    open fun insertObject_atIndex(anObject: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertObject:atIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, anObject, index)
    }

    open fun removeLastObject(): Unit {
        val sel = ObjCRuntime.sel("removeLastObject")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun removeObjectAtIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeObjectAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    open fun replaceObjectAtIndex_withObject(index: Long, anObject: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("replaceObjectAtIndex:withObject:")
        ObjCRuntime.msgSend(null, ptr, sel, index, anObject)
    }

    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithCapacity(numItems: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCapacity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, numItems) as MemorySegment
    }

    override fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

}

// ── Category: NSExtendedMutableArray on NSMutableArray ─────────────────────────────────────────

fun NSMutableArray.addObjectsFromArray(otherArray: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addObjectsFromArray:")
    ObjCRuntime.msgSend(null, this.ptr, sel, otherArray)
}

fun NSMutableArray.exchangeObjectAtIndex_withObjectAtIndex(idx1: Long, idx2: Long): Unit {
    val sel = ObjCRuntime.sel("exchangeObjectAtIndex:withObjectAtIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, idx1, idx2)
}

fun NSMutableArray.removeAllObjects(): Unit {
    val sel = ObjCRuntime.sel("removeAllObjects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSMutableArray.removeObject_inRange(anObject: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("removeObject:inRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, anObject, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSMutableArray.removeObject(anObject: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObject:")
    ObjCRuntime.msgSend(null, this.ptr, sel, anObject)
}

fun NSMutableArray.removeObjectIdenticalTo_inRange(anObject: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("removeObjectIdenticalTo:inRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, anObject, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSMutableArray.removeObjectIdenticalTo(anObject: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObjectIdenticalTo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, anObject)
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Not supported")
fun NSMutableArray.removeObjectsFromIndices_numIndices(indices: MemorySegment, cnt: Long): Unit {
    val sel = ObjCRuntime.sel("removeObjectsFromIndices:numIndices:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indices, cnt)
}

fun NSMutableArray.removeObjectsInArray(otherArray: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObjectsInArray:")
    ObjCRuntime.msgSend(null, this.ptr, sel, otherArray)
}

fun NSMutableArray.removeObjectsInRange(range: NSRange): Unit {
    val sel = ObjCRuntime.sel("removeObjectsInRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSMutableArray.replaceObjectsInRange_withObjectsFromArray_range(range: NSRange, otherArray: MemorySegment, otherRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("replaceObjectsInRange:withObjectsFromArray:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), otherArray, ObjCRuntime.ObjCStructArg(otherRange.segment, NSRange.layout))
}

fun NSMutableArray.replaceObjectsInRange_withObjectsFromArray(range: NSRange, otherArray: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceObjectsInRange:withObjectsFromArray:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), otherArray)
}

fun NSMutableArray.setArray(otherArray: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setArray:")
    ObjCRuntime.msgSend(null, this.ptr, sel, otherArray)
}

fun NSMutableArray.sortUsingFunction_context(compare: MemorySegment, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortUsingFunction:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, compare, context)
}

fun NSMutableArray.sortUsingSelector(comparator: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortUsingSelector:")
    ObjCRuntime.msgSend(null, this.ptr, sel, comparator)
}

fun NSMutableArray.insertObjects_atIndexes(objects: MemorySegment, indexes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("insertObjects:atIndexes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, indexes)
}

fun NSMutableArray.removeObjectsAtIndexes(indexes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObjectsAtIndexes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indexes)
}

fun NSMutableArray.replaceObjectsAtIndexes_withObjects(indexes: MemorySegment, objects: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("replaceObjectsAtIndexes:withObjects:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indexes, objects)
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableArray.setObject_atIndexedSubscript(obj: MemorySegment, idx: Long): Unit {
    val sel = ObjCRuntime.sel("setObject:atIndexedSubscript:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj, idx)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableArray.sortUsingComparator(cmptr: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortUsingComparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, cmptr)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableArray.sortWithOptions_usingComparator(opts: NSSortOptions, cmptr: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortWithOptions:usingComparator:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, cmptr)
}

// ── Category: NSMutableArrayCreation on NSMutableArray ─────────────────────────────────────────

// Class method: +[NSMutableArray arrayWithCapacity:]
fun NSMutableArray_arrayWithCapacity(numItems: Long): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithCapacity:")
    val cls = ObjCRuntime.getClass("NSMutableArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, numItems) as MemorySegment
}

// Class method: +[NSMutableArray arrayWithContentsOfFile:]
fun NSMutableArray_arrayWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithContentsOfFile:")
    val cls = ObjCRuntime.getClass("NSMutableArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}

// Class method: +[NSMutableArray arrayWithContentsOfURL:]
fun NSMutableArray_arrayWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithContentsOfURL:")
    val cls = ObjCRuntime.getClass("NSMutableArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url) as MemorySegment
}

// ── Category: NSMutableArrayDiffing on NSMutableArray ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSMutableArray diffing methods are not available in Swift")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableArray.applyDifference(difference: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("applyDifference:")
    ObjCRuntime.msgSend(null, this.ptr, sel, difference)
}

// ── Category: NSSortDescriptorSorting on NSMutableArray ─────────────────────────────────────────

fun NSMutableArray.sortUsingDescriptors(sortDescriptors: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("sortUsingDescriptors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, sortDescriptors)
}

// ── Category: NSPredicateSupport on NSMutableArray ─────────────────────────────────────────

fun NSMutableArray.filterUsingPredicate(predicate: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("filterUsingPredicate:")
    ObjCRuntime.msgSend(null, this.ptr, sel, predicate)
}
