@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSet
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration
 */
open class NSSet(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSet") } }

    }

    open fun member(`object`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("member:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `object`) as MemorySegment
    }

    /** @return NSEnumerator<ObjectType> * */
    open fun objectEnumerator(): MemorySegment {
        val sel = ObjCRuntime.sel("objectEnumerator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithObjects_count(objects: MemorySegment, cnt: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithObjects:count:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, objects, cnt) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property count
    open fun count(): Long {
        val sel = ObjCRuntime.sel("count")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSSet.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSSet.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSSet.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSSet_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSFastEnumeration. */
fun NSSet.countByEnumeratingWithState_objects_count(state: NSFastEnumerationStatePointer, buffer: MemorySegment, len: Long): Long {
    val sel = ObjCRuntime.sel("countByEnumeratingWithState:objects:count:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, state.segment, buffer, len) as Long
}

// ── Category: NSExtendedSet on NSSet ─────────────────────────────────────────

fun NSSet.anyObject(): MemorySegment {
    val sel = ObjCRuntime.sel("anyObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSSet.containsObject(anObject: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("containsObject:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, anObject) as Boolean
}

fun NSSet.descriptionWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

fun NSSet.intersectsSet(otherSet: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("intersectsSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherSet) as Boolean
}

fun NSSet.isEqualToSet(otherSet: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherSet) as Boolean
}

fun NSSet.isSubsetOfSet(otherSet: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isSubsetOfSet:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherSet) as Boolean
}

@PlatformAvailability(platform = "swift", unavailable = true, message = "Use enumerateObjectsUsingBlock: or a for loop instead")
fun NSSet.makeObjectsPerformSelector(aSelector: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("makeObjectsPerformSelector:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector)
}

@PlatformAvailability(platform = "swift", unavailable = true, message = "Use enumerateObjectsUsingBlock: or a for loop instead")
fun NSSet.makeObjectsPerformSelector_withObject(aSelector: MemorySegment, argument: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("makeObjectsPerformSelector:withObject:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, argument)
}

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.setByAddingObject(anObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setByAddingObject:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, anObject) as MemorySegment
}

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.setByAddingObjectsFromSet(other: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setByAddingObjectsFromSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other) as MemorySegment
}

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.setByAddingObjectsFromArray(other: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setByAddingObjectsFromArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.enumerateObjectsUsingBlock(block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsUsingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.enumerateObjectsWithOptions_usingBlock(opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsWithOptions:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, block)
}

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.objectsPassingTest(predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectsPassingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, predicate) as MemorySegment
}

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.objectsWithOptions_passingTest(opts: NSEnumerationOptions, predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectsWithOptions:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, predicate) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSSet.allObjects(): MemorySegment {
    val sel = ObjCRuntime.sel("allObjects")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSSet.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSSetCreation on NSSet ─────────────────────────────────────────

fun NSSet.initWithObjects(firstObj: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithObjects:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, firstObj) as MemorySegment
}

fun NSSet.initWithSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithSet:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`) as MemorySegment
}

fun NSSet.initWithSet_copyItems(`set`: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithSet:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, `set`, flag) as MemorySegment
}

fun NSSet.initWithArray(array: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, array) as MemorySegment
}

// Class method: +[NSSet set]
fun NSSet_set(): MemorySegment {
    val sel = ObjCRuntime.sel("set")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSSet setWithObject:]
fun NSSet_setWithObject(`object`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setWithObject:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `object`) as MemorySegment
}

// Class method: +[NSSet setWithObjects:count:]
fun NSSet_setWithObjects_count(objects: MemorySegment, cnt: Long): MemorySegment {
    val sel = ObjCRuntime.sel("setWithObjects:count:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, objects, cnt) as MemorySegment
}

// Class method: +[NSSet setWithObjects:]
fun NSSet_setWithObjects(firstObj: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setWithObjects:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, firstObj) as MemorySegment
}

// Class method: +[NSSet setWithSet:]
fun NSSet_setWithSet(`set`: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setWithSet:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `set`) as MemorySegment
}

// Class method: +[NSSet setWithArray:]
fun NSSet_setWithArray(array: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setWithArray:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, array) as MemorySegment
}

// ── Category: NSKeyValueCoding on NSSet ─────────────────────────────────────────

// ── Category: NSKeyValueObserverRegistration on NSSet ─────────────────────────────────────────

// ── Category: NSSortDescriptorSorting on NSSet ─────────────────────────────────────────

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.sortedArrayUsingDescriptors(sortDescriptors: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingDescriptors:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, sortDescriptors) as MemorySegment
}

// ── Category: NSPredicateSupport on NSSet ─────────────────────────────────────────

/** @return NSSet<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSSet.filteredSetUsingPredicate(predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("filteredSetUsingPredicate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, predicate) as MemorySegment
}

// ── Category: NSCollectionViewAdditions on NSSet ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSet.enumerateIndexPathsWithOptions_usingBlock(opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateIndexPathsWithOptions:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, block)
}

// Class method: +[NSSet setWithCollectionViewIndexPath:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSet_setWithCollectionViewIndexPath(indexPath: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setWithCollectionViewIndexPath:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, indexPath) as MemorySegment
}

// Class method: +[NSSet setWithCollectionViewIndexPaths:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSSet_setWithCollectionViewIndexPaths(indexPaths: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("setWithCollectionViewIndexPaths:")
    val cls = ObjCRuntime.getClass("NSSet")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, indexPaths) as MemorySegment
}
