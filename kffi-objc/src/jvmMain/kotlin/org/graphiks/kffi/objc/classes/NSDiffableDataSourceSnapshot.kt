@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDiffableDataSourceSnapshot
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
open class NSDiffableDataSourceSnapshot(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDiffableDataSourceSnapshot") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfItemsInSection(sectionIdentifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("numberOfItemsInSection:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, sectionIdentifier) as Long
    }

    /** @return NSArray<ItemIdentifierType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemIdentifiersInSectionWithIdentifier(sectionIdentifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("itemIdentifiersInSectionWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, sectionIdentifier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sectionIdentifierForSectionContainingItemIdentifier(itemIdentifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("sectionIdentifierForSectionContainingItemIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, itemIdentifier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfItemIdentifier(itemIdentifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfItemIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, itemIdentifier) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexOfSectionIdentifier(sectionIdentifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("indexOfSectionIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, sectionIdentifier) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun appendItemsWithIdentifiers(identifiers: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendItemsWithIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, identifiers)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun appendItemsWithIdentifiers_intoSectionWithIdentifier(identifiers: MemorySegment, sectionIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendItemsWithIdentifiers:intoSectionWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, identifiers, sectionIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertItemsWithIdentifiers_beforeItemWithIdentifier(identifiers: MemorySegment, itemIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertItemsWithIdentifiers:beforeItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, identifiers, itemIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertItemsWithIdentifiers_afterItemWithIdentifier(identifiers: MemorySegment, itemIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertItemsWithIdentifiers:afterItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, identifiers, itemIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deleteItemsWithIdentifiers(identifiers: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deleteItemsWithIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, identifiers)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deleteAllItems(): Unit {
        val sel = ObjCRuntime.sel("deleteAllItems")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveItemWithIdentifier_beforeItemWithIdentifier(fromIdentifier: MemorySegment, toIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveItemWithIdentifier:beforeItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, fromIdentifier, toIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveItemWithIdentifier_afterItemWithIdentifier(fromIdentifier: MemorySegment, toIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveItemWithIdentifier:afterItemWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, fromIdentifier, toIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadItemsWithIdentifiers(identifiers: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadItemsWithIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, identifiers)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun appendSectionsWithIdentifiers(sectionIdentifiers: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("appendSectionsWithIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIdentifiers)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertSectionsWithIdentifiers_beforeSectionWithIdentifier(sectionIdentifiers: MemorySegment, toSectionIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertSectionsWithIdentifiers:beforeSectionWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIdentifiers, toSectionIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertSectionsWithIdentifiers_afterSectionWithIdentifier(sectionIdentifiers: MemorySegment, toSectionIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertSectionsWithIdentifiers:afterSectionWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIdentifiers, toSectionIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deleteSectionsWithIdentifiers(sectionIdentifiers: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("deleteSectionsWithIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIdentifiers)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveSectionWithIdentifier_beforeSectionWithIdentifier(fromSectionIdentifier: MemorySegment, toSectionIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveSectionWithIdentifier:beforeSectionWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, fromSectionIdentifier, toSectionIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun moveSectionWithIdentifier_afterSectionWithIdentifier(fromSectionIdentifier: MemorySegment, toSectionIdentifier: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("moveSectionWithIdentifier:afterSectionWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, fromSectionIdentifier, toSectionIdentifier)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadSectionsWithIdentifiers(sectionIdentifiers: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("reloadSectionsWithIdentifiers:")
        ObjCRuntime.msgSend(null, ptr, sel, sectionIdentifiers)
    }

    // @property numberOfItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfItems(): Long {
        val sel = ObjCRuntime.sel("numberOfItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfSections
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfSections(): Long {
        val sel = ObjCRuntime.sel("numberOfSections")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property sectionIdentifiers
    /** @return NSArray<SectionIdentifierType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sectionIdentifiers(): MemorySegment {
        val sel = ObjCRuntime.sel("sectionIdentifiers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property itemIdentifiers
    /** @return NSArray<ItemIdentifierType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemIdentifiers(): MemorySegment {
        val sel = ObjCRuntime.sel("itemIdentifiers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSDiffableDataSourceSnapshot.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
