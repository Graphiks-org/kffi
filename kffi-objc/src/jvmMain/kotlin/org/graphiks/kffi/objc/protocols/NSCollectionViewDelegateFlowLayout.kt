@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionViewDelegateFlowLayout
 * Inherits protocols: NSCollectionViewDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSCollectionViewDelegateFlowLayout : NSCollectionViewDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_layout_sizeForItemAtIndexPath(collectionView: MemorySegment, collectionViewLayout: MemorySegment, indexPath: MemorySegment): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:layout:sizeForItemAtIndexPath:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_layout_insetForSectionAtIndex(collectionView: MemorySegment, collectionViewLayout: MemorySegment, section: Long): NSEdgeInsets =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:layout:insetForSectionAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_layout_minimumLineSpacingForSectionAtIndex(collectionView: MemorySegment, collectionViewLayout: MemorySegment, section: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:layout:minimumLineSpacingForSectionAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_layout_minimumInteritemSpacingForSectionAtIndex(collectionView: MemorySegment, collectionViewLayout: MemorySegment, section: Long): Double =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:layout:minimumInteritemSpacingForSectionAtIndex:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_layout_referenceSizeForHeaderInSection(collectionView: MemorySegment, collectionViewLayout: MemorySegment, section: Long): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:layout:referenceSizeForHeaderInSection:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun collectionView_layout_referenceSizeForFooterInSection(collectionView: MemorySegment, collectionViewLayout: MemorySegment, section: Long): NSSize =
        throw UnsupportedOperationException("Optional ObjC method 'collectionView:layout:referenceSizeForFooterInSection:' not implemented")

}
