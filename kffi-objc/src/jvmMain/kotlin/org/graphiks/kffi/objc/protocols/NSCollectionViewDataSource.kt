@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionViewDataSource
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSCollectionViewDataSource {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun collectionView_numberOfItemsInSection(collectionView: MemorySegment, section: Long): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    fun collectionView_itemForRepresentedObjectAtIndexPath(collectionView: MemorySegment, indexPath: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun numberOfSectionsInCollectionView(collectionView: MemorySegment): Long =
        throw UnsupportedOperationException("Optional ObjC method 'numberOfSectionsInCollectionView:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_viewForSupplementaryElementOfKind_atIndexPath(collectionView: MemorySegment, kind: MemorySegment, indexPath: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:viewForSupplementaryElementOfKind:atIndexPath:' not implemented")

}
