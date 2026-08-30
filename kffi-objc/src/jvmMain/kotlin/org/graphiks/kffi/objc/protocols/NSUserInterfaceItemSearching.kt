@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSUserInterfaceItemSearching
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSUserInterfaceItemSearching {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun searchForItemsWithSearchString_resultLimit_matchedItemHandler(searchString: MemorySegment, resultLimit: Long, handleMatchedItems: MemorySegment): Unit

    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun localizedTitlesForItem(item: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun performActionForItem(item: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'performActionForItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun showAllHelpTopicsForSearchString(searchString: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'showAllHelpTopicsForSearchString:' not implemented")

}
