@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityTable
 * Inherits protocols: NSAccessibilityGroup
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityTable : NSAccessibilityGroup {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityLabel(): MemorySegment

    /** @return NSArray<id<NSAccessibilityRow>> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityRows(): MemorySegment

    /** @return NSArray<id<NSAccessibilityRow>> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilitySelectedRows(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilitySelectedRows' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun setAccessibilitySelectedRows(selectedRows: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setAccessibilitySelectedRows:' not implemented")

    /** @return NSArray<id<NSAccessibilityRow>> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityVisibleRows(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityVisibleRows' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityColumns(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityColumns' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityVisibleColumns(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityVisibleColumns' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilitySelectedColumns(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilitySelectedColumns' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
    // @optional
    fun accessibilityHeaderGroup(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityHeaderGroup' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilitySelectedCells(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilitySelectedCells' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityVisibleCells(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityVisibleCells' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityRowHeaderUIElements(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityRowHeaderUIElements' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityColumnHeaderUIElements(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityColumnHeaderUIElements' not implemented")

}
