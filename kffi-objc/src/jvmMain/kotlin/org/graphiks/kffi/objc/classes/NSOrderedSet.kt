@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOrderedSet
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration
 */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSOrderedSet(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSOrderedSet") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun objectAtIndex(idx: Long): MemorySegment {
        val sel = ObjCRuntime.sel("objectAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, idx) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun indexOfObject(`object`: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfObject:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, `object`) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithObjects_count(objects: MemorySegment, cnt: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithObjects:count:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, objects, cnt) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property count
    @PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun count(): Long {
        val sel = ObjCRuntime.sel("count")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSOrderedSet.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSOrderedSet.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSOrderedSet.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSOrderedSet_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSFastEnumeration. */
fun NSOrderedSet.countByEnumeratingWithState_objects_count(state: NSFastEnumerationStatePointer, buffer: MemorySegment, len: Long): Long {
    val sel = ObjCRuntime.sel("countByEnumeratingWithState:objects:count:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, state.segment, buffer, len) as Long
}

// ── Category: NSExtendedOrderedSet on NSOrderedSet ─────────────────────────────────────────

@PlatformAvailability(platform = "swift", unavailable = true, message = "Use 'array' instead")
fun NSOrderedSet.getObjects_range(objects: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("getObjects:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.objectsAtIndexes(indexes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectsAtIndexes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, indexes) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.isEqualToOrderedSet(other: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToOrderedSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, other) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.containsObject(`object`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("containsObject:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `object`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.intersectsOrderedSet(other: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("intersectsOrderedSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, other) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.intersectsSet(`set`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("intersectsSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `set`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.isSubsetOfOrderedSet(other: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isSubsetOfOrderedSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, other) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.isSubsetOfSet(`set`: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isSubsetOfSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, `set`) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.objectAtIndexedSubscript(idx: Long): MemorySegment {
    val sel = ObjCRuntime.sel("objectAtIndexedSubscript:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, idx) as MemorySegment
}

/** @return NSEnumerator<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.objectEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("objectEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSEnumerator<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.reverseObjectEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("reverseObjectEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.enumerateObjectsUsingBlock(block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsUsingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.enumerateObjectsWithOptions_usingBlock(opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsWithOptions:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.enumerateObjectsAtIndexes_options_usingBlock(s: MemorySegment, opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsAtIndexes:options:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, s, opts.rawValue, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexOfObjectPassingTest(predicate: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectPassingTest:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, predicate) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexOfObjectWithOptions_passingTest(opts: NSEnumerationOptions, predicate: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectWithOptions:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, opts.rawValue, predicate) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexOfObjectAtIndexes_options_passingTest(s: MemorySegment, opts: NSEnumerationOptions, predicate: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectAtIndexes:options:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, s, opts.rawValue, predicate) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexesOfObjectsPassingTest(predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexesOfObjectsPassingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, predicate) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexesOfObjectsWithOptions_passingTest(opts: NSEnumerationOptions, predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexesOfObjectsWithOptions:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, predicate) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexesOfObjectsAtIndexes_options_passingTest(s: MemorySegment, opts: NSEnumerationOptions, predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexesOfObjectsAtIndexes:options:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, s, opts.rawValue, predicate) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.indexOfObject_inSortedRange_options_usingComparator(`object`: MemorySegment, range: NSRange, opts: NSBinarySearchingOptions, cmp: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObject:inSortedRange:options:usingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, `object`, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), opts.rawValue, cmp) as Long
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.sortedArrayUsingComparator(cmptr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, cmptr) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.sortedArrayWithOptions_usingComparator(opts: NSSortOptions, cmptr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayWithOptions:usingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, cmptr) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.descriptionWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.descriptionWithLocale_indent(locale: MemorySegment, level: Long): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:indent:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale, level) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.firstObject(): MemorySegment {
    val sel = ObjCRuntime.sel("firstObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.lastObject(): MemorySegment {
    val sel = ObjCRuntime.sel("lastObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSOrderedSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.reversedOrderedSet(): MemorySegment {
    val sel = ObjCRuntime.sel("reversedOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.array(): MemorySegment {
    val sel = ObjCRuntime.sel("array")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.`set`(): MemorySegment {
    val sel = ObjCRuntime.sel("set")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSOrderedSetCreation on NSOrderedSet ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithObject(`object`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithObject:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `object`) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithObjects(firstObj: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithObjects:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, firstObj) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithOrderedSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithOrderedSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithOrderedSet_copyItems(`set`: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithOrderedSet:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`, flag) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithOrderedSet_range_copyItems(`set`: MemorySegment, range: NSRange, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithOrderedSet:range:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), flag) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithArray(array: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, array) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithArray_copyItems(`set`: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithArray:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`, flag) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithArray_range_copyItems(`set`: MemorySegment, range: NSRange, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithArray:range:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), flag) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.initWithSet_copyItems(`set`: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithSet:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`, flag) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSet]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSet(): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSet")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithObject:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithObject(`object`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithObject:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `object`) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithObjects:count:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithObjects_count(objects: MemorySegment, cnt: Long): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithObjects:count:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, objects, cnt) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithObjects:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithObjects(firstObj: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithObjects:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, firstObj) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithOrderedSet:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithOrderedSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithOrderedSet:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `set`) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithOrderedSet:range:copyItems:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithOrderedSet_range_copyItems(`set`: MemorySegment, range: NSRange, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithOrderedSet:range:copyItems:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `set`, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), flag) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithArray:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithArray(array: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithArray:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, array) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithArray:range:copyItems:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithArray_range_copyItems(array: MemorySegment, range: NSRange, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithArray:range:copyItems:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, array, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), flag) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithSet:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithSet:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `set`) as MemorySegment
}

// Class method: +[NSOrderedSet orderedSetWithSet:copyItems:]
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet_orderedSetWithSet_copyItems(`set`: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetWithSet:copyItems:")
    val cls = ObjCRuntime.getClass("NSOrderedSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `set`, flag) as MemorySegment
}

// ── Category: NSOrderedSetDiffing on NSOrderedSet ─────────────────────────────────────────

/** @return NSOrderedCollectionDifference<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSOrderedSet diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.differenceFromOrderedSet_withOptions_usingEquivalenceTest(other: MemorySegment, options: NSOrderedCollectionDifferenceCalculationOptions, block: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("differenceFromOrderedSet:withOptions:usingEquivalenceTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other, options.rawValue, block) as MemorySegment
}

/** @return NSOrderedCollectionDifference<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSOrderedSet diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.differenceFromOrderedSet_withOptions(other: MemorySegment, options: NSOrderedCollectionDifferenceCalculationOptions): MemorySegment {
    val sel = ObjCRuntime.sel("differenceFromOrderedSet:withOptions:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other, options.rawValue) as MemorySegment
}

/** @return NSOrderedCollectionDifference<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSOrderedSet diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.differenceFromOrderedSet(other: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("differenceFromOrderedSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other) as MemorySegment
}

/** @return NSOrderedSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSOrderedSet diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.orderedSetByApplyingDifference(difference: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("orderedSetByApplyingDifference:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, difference) as MemorySegment
}

// ── Category: NSKeyValueCoding on NSOrderedSet ─────────────────────────────────────────

// ── Category: NSKeyValueObserverRegistration on NSOrderedSet ─────────────────────────────────────────

// ── Category: NSKeyValueSorting on NSOrderedSet ─────────────────────────────────────────

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.sortedArrayUsingDescriptors(sortDescriptors: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingDescriptors:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, sortDescriptors) as MemorySegment
}

// ── Category: NSPredicateSupport on NSOrderedSet ─────────────────────────────────────────

/** @return NSOrderedSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSOrderedSet.filteredOrderedSetUsingPredicate(p: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("filteredOrderedSetUsingPredicate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, p) as MemorySegment
}
