@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSIndexPath
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
open class NSIndexPath(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSIndexPath") } }

        fun indexPathWithIndex(index: Long): MemorySegment {
            val sel = ObjCRuntime.sel("indexPathWithIndex:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, index) as MemorySegment
        }

        fun indexPathWithIndexes_length(indexes: MemorySegment, length: Long): MemorySegment {
            val sel = ObjCRuntime.sel("indexPathWithIndexes:length:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, indexes, length) as MemorySegment
        }

    }

    open fun initWithIndexes_length(indexes: MemorySegment, length: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIndexes:length:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexes, length) as MemorySegment
    }

    open fun initWithIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    open fun indexPathByAddingIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathByAddingIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    open fun indexPathByRemovingLastIndex(): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathByRemovingLastIndex")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun indexAtPosition(position: Long): Long {
        val sel = ObjCRuntime.sel("indexAtPosition:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, position) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun getIndexes_range(indexes: MemorySegment, positionRange: NSRange): Unit {
        val sel = ObjCRuntime.sel("getIndexes:range:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, ObjCRuntime.ObjCStructArg(positionRange.segment, NSRange.layout))
    }

    open fun compare(otherObject: MemorySegment): NSComparisonResult {
        val sel = ObjCRuntime.sel("compare:")
        return NSComparisonResult(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, otherObject) as Long)
    }

    // @property length
    open fun length(): Long {
        val sel = ObjCRuntime.sel("length")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSIndexPath.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSIndexPath.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSIndexPath.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSIndexPath_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSIndexPath")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSDeprecated on NSIndexPath ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
fun NSIndexPath.getIndexes(indexes: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("getIndexes:")
    ObjCRuntime.msgSend(null, this.ptr, sel, indexes)
}

// ── Category: NSCollectionViewAdditions on NSIndexPath ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSIndexPath.item(): Long {
    val sel = ObjCRuntime.sel("item")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSIndexPath.section(): Long {
    val sel = ObjCRuntime.sel("section")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}

// Class method: +[NSIndexPath indexPathForItem:inSection:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSIndexPath_indexPathForItem_inSection(item: Long, section: Long): MemorySegment {
    val sel = ObjCRuntime.sel("indexPathForItem:inSection:")
    val cls = ObjCRuntime.getClass("NSIndexPath")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, item, section) as MemorySegment
}
