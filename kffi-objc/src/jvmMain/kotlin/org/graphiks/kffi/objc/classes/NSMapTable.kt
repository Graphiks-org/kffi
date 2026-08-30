@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMapTable
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding, NSFastEnumeration
 */
@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSMapTable(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMapTable") }

        /** @return NSMapTable<KeyType,ObjectType> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun mapTableWithKeyOptions_valueOptions(keyOptions: NSPointerFunctionsOptions, valueOptions: NSPointerFunctionsOptions): MemorySegment {
            val sel = ObjCRuntime.sel("mapTableWithKeyOptions:valueOptions:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, keyOptions.rawValue, valueOptions.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "GC no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun mapTableWithStrongToStrongObjects(): MemorySegment {
            val sel = ObjCRuntime.sel("mapTableWithStrongToStrongObjects")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "GC no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun mapTableWithWeakToStrongObjects(): MemorySegment {
            val sel = ObjCRuntime.sel("mapTableWithWeakToStrongObjects")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "GC no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun mapTableWithStrongToWeakObjects(): MemorySegment {
            val sel = ObjCRuntime.sel("mapTableWithStrongToWeakObjects")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 8, deprecatedSubminor = -1, message = "GC no longer supported")
        @PlatformAvailability(platform = "tvos", unavailable = true)
        @PlatformAvailability(platform = "watchos", unavailable = true)
        fun mapTableWithWeakToWeakObjects(): MemorySegment {
            val sel = ObjCRuntime.sel("mapTableWithWeakToWeakObjects")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSMapTable<KeyType,ObjectType> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun strongToStrongObjectsMapTable(): MemorySegment {
            val sel = ObjCRuntime.sel("strongToStrongObjectsMapTable")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSMapTable<KeyType,ObjectType> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun weakToStrongObjectsMapTable(): MemorySegment {
            val sel = ObjCRuntime.sel("weakToStrongObjectsMapTable")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSMapTable<KeyType,ObjectType> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun strongToWeakObjectsMapTable(): MemorySegment {
            val sel = ObjCRuntime.sel("strongToWeakObjectsMapTable")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSMapTable<KeyType,ObjectType> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun weakToWeakObjectsMapTable(): MemorySegment {
            val sel = ObjCRuntime.sel("weakToWeakObjectsMapTable")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithKeyOptions_valueOptions_capacity(keyOptions: NSPointerFunctionsOptions, valueOptions: NSPointerFunctionsOptions, initialCapacity: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithKeyOptions:valueOptions:capacity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, keyOptions.rawValue, valueOptions.rawValue, initialCapacity) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithKeyPointerFunctions_valuePointerFunctions_capacity(keyFunctions: MemorySegment, valueFunctions: MemorySegment, initialCapacity: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithKeyPointerFunctions:valuePointerFunctions:capacity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, keyFunctions, valueFunctions, initialCapacity) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun objectForKey(aKey: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("objectForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, aKey) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeObjectForKey(aKey: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeObjectForKey:")
        ObjCRuntime.msgSend(null, ptr, sel, aKey)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun setObject_forKey(anObject: MemorySegment, aKey: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setObject:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, anObject, aKey)
    }

    /** @return NSEnumerator<KeyType> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun keyEnumerator(): MemorySegment {
        val sel = ObjCRuntime.sel("keyEnumerator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return NSEnumerator<ObjectType> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun objectEnumerator(): MemorySegment {
        val sel = ObjCRuntime.sel("objectEnumerator")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun removeAllObjects(): Unit {
        val sel = ObjCRuntime.sel("removeAllObjects")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    /** @return NSDictionary<KeyType,ObjectType> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun dictionaryRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("dictionaryRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property keyPointerFunctions
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun keyPointerFunctions(): MemorySegment {
        val sel = ObjCRuntime.sel("keyPointerFunctions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property valuePointerFunctions
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun valuePointerFunctions(): MemorySegment {
        val sel = ObjCRuntime.sel("valuePointerFunctions")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property count
    @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun count(): Long {
        val sel = ObjCRuntime.sel("count")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSMapTable.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSMapTable.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSMapTable.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSMapTable_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSMapTable")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSFastEnumeration. */
fun NSMapTable.countByEnumeratingWithState_objects_count(state: NSFastEnumerationStatePointer, buffer: MemorySegment, len: Long): Long {
    val sel = ObjCRuntime.sel("countByEnumeratingWithState:objects:count:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, state.segment, buffer, len) as Long
}
