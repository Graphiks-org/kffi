@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSCollectionViewElement
 * Inherits protocols: NSObject, NSUserInterfaceItemIdentification
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSCollectionViewElement : NSUserInterfaceItemIdentification {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun prepareForReuse(): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'prepareForReuse' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun applyLayoutAttributes(layoutAttributes: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'applyLayoutAttributes:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun willTransitionFromLayout_toLayout(oldLayout: MemorySegment, newLayout: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'willTransitionFromLayout:toLayout:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun didTransitionFromLayout_toLayout(oldLayout: MemorySegment, newLayout: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'didTransitionFromLayout:toLayout:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    // @optional
    fun preferredLayoutAttributesFittingAttributes(layoutAttributes: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'preferredLayoutAttributesFittingAttributes:' not implemented")

}
