@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionViewSectionHeaderView
 * Inherits protocols: NSCollectionViewElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSCollectionViewSectionHeaderView : NSCollectionViewElement {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    // @optional
    fun sectionCollapseButton(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'sectionCollapseButton' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    // @optional
    fun setSectionCollapseButton(sectionCollapseButton: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'setSectionCollapseButton:' not implemented")

}
