@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDictionary
 * Superclass: NSObject
 * Protocols: NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration
 */
open class NSDictionary(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSDictionary") } }

    }

    open fun objectForKey(aKey: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("objectForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, aKey) as MemorySegment
    }

    /** @return NSEnumerator<KeyType> * */
    open fun keyEnumerator(): MemorySegment {
        val sel = ObjCRuntime.sel("keyEnumerator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithObjects_forKeys_count(objects: MemorySegment, keys: MemorySegment, cnt: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithObjects:forKeys:count:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, objects, keys, cnt) as MemorySegment
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
fun NSDictionary.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSMutableCopying. */
fun NSDictionary.mutableCopyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("mutableCopyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSDictionary.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSDictionary_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSFastEnumeration. */
fun NSDictionary.countByEnumeratingWithState_objects_count(state: NSFastEnumerationStatePointer, buffer: MemorySegment, len: Long): Long {
    val sel = ObjCRuntime.sel("countByEnumeratingWithState:objects:count:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, state.segment, buffer, len) as Long
}

// ── Category: NSExtendedDictionary on NSDictionary ─────────────────────────────────────────

/** @return NSArray<KeyType> * */
fun NSDictionary.allKeysForObject(anObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("allKeysForObject:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, anObject) as MemorySegment
}

fun NSDictionary.descriptionWithLocale(locale: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale) as MemorySegment
}

fun NSDictionary.descriptionWithLocale_indent(locale: MemorySegment, level: Long): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionWithLocale:indent:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, locale, level) as MemorySegment
}

fun NSDictionary.isEqualToDictionary(otherDictionary: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isEqualToDictionary:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, otherDictionary) as Boolean
}

/** @return NSEnumerator<ObjectType> * */
fun NSDictionary.objectEnumerator(): MemorySegment {
    val sel = ObjCRuntime.sel("objectEnumerator")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSDictionary.objectsForKeys_notFoundMarker(keys: MemorySegment, marker: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectsForKeys:notFoundMarker:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, keys, marker) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.writeToURL_error(url: MemorySegment, error: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, error) as Boolean
}

/** @return NSArray<KeyType> * */
fun NSDictionary.keysSortedByValueUsingSelector(comparator: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("keysSortedByValueUsingSelector:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, comparator) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use 'allKeys' and/or 'allValues' instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.getObjects_andKeys_count(objects: MemorySegment, keys: MemorySegment, count: Long): Unit {
    val sel = ObjCRuntime.sel("getObjects:andKeys:count:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, keys, count)
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.objectForKeyedSubscript(key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("objectForKeyedSubscript:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, key) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.enumerateKeysAndObjectsUsingBlock(block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateKeysAndObjectsUsingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.enumerateKeysAndObjectsWithOptions_usingBlock(opts: NSEnumerationOptions, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("enumerateKeysAndObjectsWithOptions:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, opts.rawValue, block)
}

/** @return NSArray<KeyType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.keysSortedByValueUsingComparator(cmptr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("keysSortedByValueUsingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, cmptr) as MemorySegment
}

/** @return NSArray<KeyType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.keysSortedByValueWithOptions_usingComparator(opts: NSSortOptions, cmptr: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("keysSortedByValueWithOptions:usingComparator:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, cmptr) as MemorySegment
}

/** @return NSSet<KeyType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.keysOfEntriesPassingTest(predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("keysOfEntriesPassingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, predicate) as MemorySegment
}

/** @return NSSet<KeyType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.keysOfEntriesWithOptions_passingTest(opts: NSEnumerationOptions, predicate: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("keysOfEntriesWithOptions:passingTest:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, opts.rawValue, predicate) as MemorySegment
}

/** @return NSArray<KeyType> * */
fun NSDictionary.allKeys(): MemorySegment {
    val sel = ObjCRuntime.sel("allKeys")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/** @return NSArray<ObjectType> * */
fun NSDictionary.allValues(): MemorySegment {
    val sel = ObjCRuntime.sel("allValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.description(): MemorySegment {
    val sel = ObjCRuntime.sel("description")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.descriptionInStringsFileFormat(): MemorySegment {
    val sel = ObjCRuntime.sel("descriptionInStringsFileFormat")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSDeprecated on NSDictionary ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getObjects:andKeys:count: instead")
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Use -getObjects:andKeys:count: instead")
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use 'allKeys' and/or 'allValues' instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getObjects:andKeys:count: instead")
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 4, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -getObjects:andKeys:count: instead")
fun NSDictionary.getObjects_andKeys(objects: MemorySegment, keys: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getObjects:andKeys:")
    ObjCRuntime.msgSend(null, this.ptr, sel, objects, keys)
}

/** @return NSDictionary<KeyType,ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDictionary.initWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfFile:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, path) as MemorySegment
}

/** @return NSDictionary<KeyType,ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDictionary.initWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDictionary.writeToFile_atomically(path: MemorySegment, useAuxiliaryFile: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToFile:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, path, useAuxiliaryFile) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDictionary.writeToURL_atomically(url: MemorySegment, atomically: Boolean): Boolean {
    val sel = ObjCRuntime.sel("writeToURL:atomically:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, url, atomically) as Boolean
}

// Class method: +[NSDictionary dictionaryWithContentsOfFile:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDictionary_dictionaryWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithContentsOfFile:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithContentsOfURL:]
@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSDictionary_dictionaryWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithContentsOfURL:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url) as MemorySegment
}

// ── Category: NSDictionaryCreation on NSDictionary ─────────────────────────────────────────

fun NSDictionary.initWithObjectsAndKeys(firstObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithObjectsAndKeys:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, firstObject) as MemorySegment
}

fun NSDictionary.initWithDictionary(otherDictionary: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithDictionary:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, otherDictionary) as MemorySegment
}

fun NSDictionary.initWithDictionary_copyItems(otherDictionary: MemorySegment, flag: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("initWithDictionary:copyItems:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, otherDictionary, flag) as MemorySegment
}

fun NSDictionary.initWithObjects_forKeys(objects: MemorySegment, keys: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithObjects:forKeys:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, objects, keys) as MemorySegment
}

/** @return NSDictionary<NSString *,ObjectType> * */
@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary.initWithContentsOfURL_error(url: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithContentsOfURL:error:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, url, error) as MemorySegment
}

// Class method: +[NSDictionary dictionary]
fun NSDictionary_dictionary(): MemorySegment {
    val sel = ObjCRuntime.sel("dictionary")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithObject:forKey:]
fun NSDictionary_dictionaryWithObject_forKey(`object`: MemorySegment, key: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithObject:forKey:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, `object`, key) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithObjects:forKeys:count:]
fun NSDictionary_dictionaryWithObjects_forKeys_count(objects: MemorySegment, keys: MemorySegment, cnt: Long): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithObjects:forKeys:count:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, objects, keys, cnt) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithObjectsAndKeys:]
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use dictionary literals instead")
fun NSDictionary_dictionaryWithObjectsAndKeys(firstObject: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithObjectsAndKeys:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, firstObject) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithDictionary:]
fun NSDictionary_dictionaryWithDictionary(dict: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithDictionary:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, dict) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithObjects:forKeys:]
fun NSDictionary_dictionaryWithObjects_forKeys(objects: MemorySegment, keys: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithObjects:forKeys:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, objects, keys) as MemorySegment
}

// Class method: +[NSDictionary dictionaryWithContentsOfURL:error:]
@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use initializer instead")
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary_dictionaryWithContentsOfURL_error(url: MemorySegment, error: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithContentsOfURL:error:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url, error) as MemorySegment
}

// ── Category: NSSharedKeySetDictionary on NSDictionary ─────────────────────────────────────────

// Class method: +[NSDictionary sharedKeySetForKeys:]
@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSDictionary_sharedKeySetForKeys(keys: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("sharedKeySetForKeys:")
    val cls = ObjCRuntime.getClass("NSDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, keys) as MemorySegment
}

// ── Category: NSGenericFastEnumeration on NSDictionary ─────────────────────────────────────────

// ── Category: NSFileAttributes on NSDictionary ─────────────────────────────────────────

fun NSDictionary.fileSize(): Long {
    val sel = ObjCRuntime.sel("fileSize")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSDictionary.fileModificationDate(): MemorySegment {
    val sel = ObjCRuntime.sel("fileModificationDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.fileType(): MemorySegment {
    val sel = ObjCRuntime.sel("fileType")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.filePosixPermissions(): Long {
    val sel = ObjCRuntime.sel("filePosixPermissions")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSDictionary.fileOwnerAccountName(): MemorySegment {
    val sel = ObjCRuntime.sel("fileOwnerAccountName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.fileGroupOwnerAccountName(): MemorySegment {
    val sel = ObjCRuntime.sel("fileGroupOwnerAccountName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.fileSystemNumber(): Long {
    val sel = ObjCRuntime.sel("fileSystemNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSDictionary.fileSystemFileNumber(): Long {
    val sel = ObjCRuntime.sel("fileSystemFileNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

fun NSDictionary.fileExtensionHidden(): Boolean {
    val sel = ObjCRuntime.sel("fileExtensionHidden")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSDictionary.fileHFSCreatorCode(): Int {
    val sel = ObjCRuntime.sel("fileHFSCreatorCode")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel) as Int
}

fun NSDictionary.fileHFSTypeCode(): Int {
    val sel = ObjCRuntime.sel("fileHFSTypeCode")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel) as Int
}

fun NSDictionary.fileIsImmutable(): Boolean {
    val sel = ObjCRuntime.sel("fileIsImmutable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSDictionary.fileIsAppendOnly(): Boolean {
    val sel = ObjCRuntime.sel("fileIsAppendOnly")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSDictionary.fileCreationDate(): MemorySegment {
    val sel = ObjCRuntime.sel("fileCreationDate")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.fileOwnerAccountID(): MemorySegment {
    val sel = ObjCRuntime.sel("fileOwnerAccountID")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSDictionary.fileGroupOwnerAccountID(): MemorySegment {
    val sel = ObjCRuntime.sel("fileGroupOwnerAccountID")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSKeyValueCoding on NSDictionary ─────────────────────────────────────────
