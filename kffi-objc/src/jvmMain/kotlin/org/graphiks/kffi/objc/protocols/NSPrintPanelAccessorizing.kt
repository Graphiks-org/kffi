@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPrintPanelAccessorizing
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSPrintPanelAccessorizing {
    /** @return NSArray<NSDictionary<NSPrintPanelAccessorySummaryKey,NSString *> *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun localizedSummaryItems(): MemorySegment

    /** @return NSSet<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun keyPathsForValuesAffectingPreview(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'keyPathsForValuesAffectingPreview' not implemented")

}
