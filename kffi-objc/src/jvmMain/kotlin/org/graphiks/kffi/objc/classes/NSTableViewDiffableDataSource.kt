@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTableViewDiffableDataSource
 * Superclass: NSObject
 * Protocols: NSTableViewDataSource
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
open class NSTableViewDiffableDataSource(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTableViewDiffableDataSource") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithTableView_cellProvider(tableView: MemorySegment, cellProvider: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithTableView:cellProvider:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, tableView, cellProvider) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** @return NSDiffableDataSourceSnapshot<SectionIdentifierType,ItemIdentifierType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun snapshot(): MemorySegment {
        val sel = ObjCRuntime.sel("snapshot")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun applySnapshot_animatingDifferences(snapshot: MemorySegment, animatingDifferences: Boolean): Unit {
        val sel = ObjCRuntime.sel("applySnapshot:animatingDifferences:")
        ObjCRuntime.msgSend(null, ptr, sel, snapshot, animatingDifferences)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun applySnapshot_animatingDifferences_completion(snapshot: MemorySegment, animatingDifferences: Boolean, completion: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("applySnapshot:animatingDifferences:completion:")
        ObjCRuntime.msgSend(null, ptr, sel, snapshot, animatingDifferences, completion)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun itemIdentifierForRow(row: Long): MemorySegment {
        val sel = ObjCRuntime.sel("itemIdentifierForRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowForItemIdentifier(identifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("rowForItemIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, identifier) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sectionIdentifierForRow(row: Long): MemorySegment {
        val sel = ObjCRuntime.sel("sectionIdentifierForRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowForSectionIdentifier(identifier: MemorySegment): Long {
        val sel = ObjCRuntime.sel("rowForSectionIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, identifier) as Long
    }

    // @property rowViewProvider
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowViewProvider(): MemorySegment {
        val sel = ObjCRuntime.sel("rowViewProvider")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowViewProvider(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRowViewProvider:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sectionHeaderViewProvider
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sectionHeaderViewProvider(): MemorySegment {
        val sel = ObjCRuntime.sel("sectionHeaderViewProvider")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSectionHeaderViewProvider(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSectionHeaderViewProvider:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property defaultRowAnimation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun defaultRowAnimation(): NSTableViewAnimationOptions {
        val sel = ObjCRuntime.sel("defaultRowAnimation")
        return NSTableViewAnimationOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDefaultRowAnimation(value: NSTableViewAnimationOptions) {
        val sel = ObjCRuntime.sel("setDefaultRowAnimation:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
