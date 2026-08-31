@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSArray
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration
 */
open class NSArray(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSArray") } }

    }

    open fun objectAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("objectAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
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
fun NSArray.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSArray.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSArray.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSArray_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSFastEnumeration. */
fun NSArray.countByEnumeratingWithState_objects_count(state: NSFastEnumerationStatePointer, buffer: MemorySegment, len: Long): Long {
    val sel = ObjCRuntime.sel("countByEnumeratingWithState:objects:count:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, state.segment, buffer, len) as Long
}

// ── Category: NSExtendedArray on NSArray ─────────────────────────────────────────

/** @return NSArray<ObjectType> * */
fun NSArray.arrayByAddingObject(anObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayByAddingObject:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, anObject) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSArray.arrayByAddingObjectsFromArray(otherArray: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayByAddingObjectsFromArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, otherArray) as MemorySegment
}

fun NSArray.componentsJoinedByString(separator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("componentsJoinedByString:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, separator) as MemorySegment
}

fun NSArray.containsObject(anObject: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("containsObject:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, anObject) as Boolean
}

fun NSArray.descriptionWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

fun NSArray.descriptionWithLocale_indent(locale: MemorySegment, level: Long): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:indent:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale, level) as MemorySegment
}

fun NSArray.firstObjectCommonWithArray(otherArray: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("firstObjectCommonWithArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, otherArray) as MemorySegment
}

@PlatformAvailability(platform = "swift", unavailable = true, message = "Use 'subarrayWithRange()' instead")
fun NSArray.getObjects_range(objects: MemorySegment, range: NSRange): Unit {
    val sel = ObjCRuntime.sel("getObjects:range:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
}

fun NSArray.indexOfObject(anObject: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObject:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, anObject) as Long
}

fun NSArray.indexOfObject_inRange(anObject: MemorySegment, range: NSRange): Long {
    val sel = ObjCRuntime.sel("indexOfObject:inRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, anObject, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as Long
}

fun NSArray.indexOfObjectIdenticalTo(anObject: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectIdenticalTo:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, anObject) as Long
}

fun NSArray.indexOfObjectIdenticalTo_inRange(anObject: MemorySegment, range: NSRange): Long {
    val sel = ObjCRuntime.sel("indexOfObjectIdenticalTo:inRange:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, anObject, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as Long
}

fun NSArray.isEqualToArray(otherArray: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToArray:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherArray) as Boolean
}

/** @return NSEnumerator<ObjectType> * */
fun NSArray.objectEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("objectEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSEnumerator<ObjectType> * */
fun NSArray.reverseObjectEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("reverseObjectEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSArray.sortedArrayUsingFunction_context(comparator: MemorySegment, context: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingFunction:context:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, comparator, context) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSArray.sortedArrayUsingFunction_context_hint(comparator: MemorySegment, context: MemorySegment, hint: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingFunction:context:hint:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, comparator, context, hint) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSArray.sortedArrayUsingSelector(comparator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingSelector:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, comparator) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSArray.subarrayWithRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("subarrayWithRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.writeToURL_error(url: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, error) as Boolean
}

@PlatformAvailability(platform = "swift", unavailable = true, message = "Use enumerateObjectsUsingBlock: or a for loop instead")
fun NSArray.makeObjectsPerformSelector(aSelector: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("makeObjectsPerformSelector:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector)
}

@PlatformAvailability(platform = "swift", unavailable = true, message = "Use enumerateObjectsUsingBlock: or a for loop instead")
fun NSArray.makeObjectsPerformSelector_withObject(aSelector: MemorySegment, argument: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("makeObjectsPerformSelector:withObject:")
    ObjCRuntime.msgSend(null, this.ptr, sel, aSelector, argument)
}

/** @return NSArray<ObjectType> * */
fun NSArray.objectsAtIndexes(indexes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectsAtIndexes:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, indexes) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.objectAtIndexedSubscript(idx: Long): MemorySegment {
    val sel = ObjCRuntime.sel("objectAtIndexedSubscript:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, idx) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.enumerateObjectsUsingBlock(block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsUsingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.enumerateObjectsWithOptions_usingBlock(opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsWithOptions:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.enumerateObjectsAtIndexes_options_usingBlock(s: MemorySegment, opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateObjectsAtIndexes:options:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, s, opts.rawValue, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexOfObjectPassingTest(predicate: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectPassingTest:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, predicate) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexOfObjectWithOptions_passingTest(opts: NSEnumerationOptions, predicate: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectWithOptions:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, opts.rawValue, predicate) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexOfObjectAtIndexes_options_passingTest(s: MemorySegment, opts: NSEnumerationOptions, predicate: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObjectAtIndexes:options:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, s, opts.rawValue, predicate) as Long
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexesOfObjectsPassingTest(predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexesOfObjectsPassingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, predicate) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexesOfObjectsWithOptions_passingTest(opts: NSEnumerationOptions, predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexesOfObjectsWithOptions:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, predicate) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexesOfObjectsAtIndexes_options_passingTest(s: MemorySegment, opts: NSEnumerationOptions, predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("indexesOfObjectsAtIndexes:options:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, s, opts.rawValue, predicate) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.sortedArrayUsingComparator(cmptr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, cmptr) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.sortedArrayWithOptions_usingComparator(opts: NSSortOptions, cmptr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayWithOptions:usingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, cmptr) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.indexOfObject_inSortedRange_options_usingComparator(obj: MemorySegment, r: NSRange, opts: NSBinarySearchingOptions, cmp: MemorySegment): Long {
    val sel = ObjCRuntime.sel("indexOfObject:inSortedRange:options:usingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, obj, ObjCRuntime.ObjCStructArg(r.segment, NSRange.layout), opts.rawValue, cmp) as Long
}

fun NSArray.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.firstObject(): MemorySegment {
    val sel = ObjCRuntime.sel("firstObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSArray.lastObject(): MemorySegment {
    val sel = ObjCRuntime.sel("lastObject")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSArray.sortedArrayHint(): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayHint")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSArrayCreation on NSArray ─────────────────────────────────────────

fun NSArray.initWithObjects(firstObj: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithObjects:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, firstObj) as MemorySegment
}

fun NSArray.initWithArray(array: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, array) as MemorySegment
}

fun NSArray.initWithArray_copyItems(array: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithArray:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, array, flag) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.initWithContentsOfURL_error(url: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, error) as MemorySegment
}

// Class method: +[NSArray array]
fun NSArray_array(): MemorySegment {
    val sel = ObjCRuntime.sel("array")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSArray arrayWithObject:]
fun NSArray_arrayWithObject(anObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithObject:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, anObject) as MemorySegment
}

// Class method: +[NSArray arrayWithObjects:count:]
fun NSArray_arrayWithObjects_count(objects: MemorySegment, cnt: Long): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithObjects:count:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, objects, cnt) as MemorySegment
}

// Class method: +[NSArray arrayWithObjects:]
fun NSArray_arrayWithObjects(firstObj: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithObjects:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, firstObj) as MemorySegment
}

// Class method: +[NSArray arrayWithArray:]
fun NSArray_arrayWithArray(array: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithArray:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, array) as MemorySegment
}

// Class method: +[NSArray arrayWithContentsOfURL:error:]
@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use initializer instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSArray_arrayWithContentsOfURL_error(url: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithContentsOfURL:error:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url, error) as MemorySegment
}

// ── Category: NSArrayDiffing on NSArray ─────────────────────────────────────────

/** @return NSOrderedCollectionDifference<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSArray diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.differenceFromArray_withOptions_usingEquivalenceTest(other: MemorySegment, options: NSOrderedCollectionDifferenceCalculationOptions, block: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("differenceFromArray:withOptions:usingEquivalenceTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other, options.rawValue, block) as MemorySegment
}

/** @return NSOrderedCollectionDifference<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSArray diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.differenceFromArray_withOptions(other: MemorySegment, options: NSOrderedCollectionDifferenceCalculationOptions): MemorySegment {
    val sel = ObjCRuntime.sel("differenceFromArray:withOptions:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other, options.rawValue) as MemorySegment
}

/** @return NSOrderedCollectionDifference<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSArray diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.differenceFromArray(other: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("differenceFromArray:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, other) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "NSArray diffing methods are not available in Swift, use Collection.difference(from:) instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.arrayByApplyingDifference(difference: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayByApplyingDifference:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, difference) as MemorySegment
}

// ── Category: NSDeprecated on NSArray ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getObjects:range: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use -getObjects:range: instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use 'as [AnyObject]' instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getObjects:range: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getObjects:range: instead")
fun NSArray.getObjects(objects: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getObjects:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects)
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSArray.initWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path) as MemorySegment
}

/** @return NSArray<ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSArray.initWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSArray.writeToFile_atomically(path: MemorySegment, useAuxiliaryFile: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, path, useAuxiliaryFile) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSArray.writeToURL_atomically(url: MemorySegment, atomically: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, atomically) as Boolean
}

// Class method: +[NSArray arrayWithContentsOfFile:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSArray_arrayWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithContentsOfFile:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}

// Class method: +[NSArray arrayWithContentsOfURL:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSArray_arrayWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("arrayWithContentsOfURL:")
    val cls = ObjCRuntime.getClass("NSArray")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url) as MemorySegment
}

// ── Category: NSArrayPathExtensions on NSArray ─────────────────────────────────────────

/** @return NSArray<NSString *> * */
fun NSArray.pathsMatchingExtensions(filterTypes: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("pathsMatchingExtensions:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, filterTypes) as MemorySegment
}

// ── Category: NSKeyValueCoding on NSArray ─────────────────────────────────────────

// ── Category: NSKeyValueObserverRegistration on NSArray ─────────────────────────────────────────

fun NSArray.addObserver_toObjectsAtIndexes_forKeyPath_options_context(observer: MemorySegment, indexes: MemorySegment, keyPath: MemorySegment, options: NSKeyValueObservingOptions, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addObserver:toObjectsAtIndexes:forKeyPath:options:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observer, indexes, keyPath, options.rawValue, context)
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSArray.removeObserver_fromObjectsAtIndexes_forKeyPath_context(observer: MemorySegment, indexes: MemorySegment, keyPath: MemorySegment, context: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObserver:fromObjectsAtIndexes:forKeyPath:context:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observer, indexes, keyPath, context)
}

fun NSArray.removeObserver_fromObjectsAtIndexes_forKeyPath(observer: MemorySegment, indexes: MemorySegment, keyPath: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObserver:fromObjectsAtIndexes:forKeyPath:")
    ObjCRuntime.msgSend(null, this.ptr, sel, observer, indexes, keyPath)
}

// ── Category: NSSortDescriptorSorting on NSArray ─────────────────────────────────────────

/** @return NSArray<ObjectType> * */
fun NSArray.sortedArrayUsingDescriptors(sortDescriptors: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sortedArrayUsingDescriptors:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, sortDescriptors) as MemorySegment
}

// ── Category: NSPredicateSupport on NSArray ─────────────────────────────────────────

/** @return NSArray<ObjectType> * */
fun NSArray.filteredArrayUsingPredicate(predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("filteredArrayUsingPredicate:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, predicate) as MemorySegment
}
