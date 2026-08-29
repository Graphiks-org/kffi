@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMutableDictionary
 * Superclass: NSDictionary
 */
open class NSMutableDictionary(override val ptr: MemorySegment) : NSDictionary(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMutableDictionary") }

    }

    open fun removeObjectForKey(aKey: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeObjectForKey:")
        ObjCRuntime.msgSend(null, ptr, sel, aKey)
    }

    open fun setObject_forKey(anObject: MemorySegment, aKey: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setObject:forKey:")
        ObjCRuntime.msgSend(null, ptr, sel, anObject, aKey)
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

// ── Category: NSExtendedMutableDictionary on NSMutableDictionary ─────────────────────────────────────────

fun NSMutableDictionary.addEntriesFromDictionary(otherDictionary: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addEntriesFromDictionary:")
    ObjCRuntime.msgSend(null, this.ptr, sel, otherDictionary)
}

fun NSMutableDictionary.removeAllObjects(): Unit {
    val sel = ObjCRuntime.sel("removeAllObjects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSMutableDictionary.removeObjectsForKeys(keyArray: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeObjectsForKeys:")
    ObjCRuntime.msgSend(null, this.ptr, sel, keyArray)
}

fun NSMutableDictionary.setDictionary(otherDictionary: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDictionary:")
    ObjCRuntime.msgSend(null, this.ptr, sel, otherDictionary)
}

@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableDictionary.setObject_forKeyedSubscript(obj: MemorySegment, key: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setObject:forKeyedSubscript:")
    ObjCRuntime.msgSend(null, this.ptr, sel, obj, key)
}

// ── Category: NSMutableDictionaryCreation on NSMutableDictionary ─────────────────────────────────────────

// Class method: +[NSMutableDictionary dictionaryWithCapacity:]
fun NSMutableDictionary_dictionaryWithCapacity(numItems: Long): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithCapacity:")
    val cls = ObjCRuntime.getClass("NSMutableDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, numItems) as MemorySegment
}

// Class method: +[NSMutableDictionary dictionaryWithContentsOfFile:]
fun NSMutableDictionary_dictionaryWithContentsOfFile(path: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithContentsOfFile:")
    val cls = ObjCRuntime.getClass("NSMutableDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, path) as MemorySegment
}

// Class method: +[NSMutableDictionary dictionaryWithContentsOfURL:]
fun NSMutableDictionary_dictionaryWithContentsOfURL(url: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithContentsOfURL:")
    val cls = ObjCRuntime.getClass("NSMutableDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, url) as MemorySegment
}

// ── Category: NSSharedKeySetDictionary on NSMutableDictionary ─────────────────────────────────────────

// Class method: +[NSMutableDictionary dictionaryWithSharedKeySet:]
@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSMutableDictionary_dictionaryWithSharedKeySet(keyset: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("dictionaryWithSharedKeySet:")
    val cls = ObjCRuntime.getClass("NSMutableDictionary")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, keyset) as MemorySegment
}

// ── Category: NSKeyValueCoding on NSMutableDictionary ─────────────────────────────────────────
