@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSharingServiceDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSharingServiceDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingService_willShareItems(sharingService: MemorySegment, items: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'sharingService:willShareItems:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingService_didFailToShareItems_error(sharingService: MemorySegment, items: MemorySegment, error: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'sharingService:didFailToShareItems:error:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingService_didShareItems(sharingService: MemorySegment, items: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'sharingService:didShareItems:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingService_sourceFrameOnScreenForShareItem(sharingService: MemorySegment, item: MemorySegment): NSRect =
        throw UnsupportedOperationException("Optional ObjC method 'sharingService:sourceFrameOnScreenForShareItem:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingService_transitionImageForShareItem_contentRect(sharingService: MemorySegment, item: MemorySegment, contentRect: NSRectPointer): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'sharingService:transitionImageForShareItem:contentRect:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun sharingService_sourceWindowForShareItems_sharingContentScope(sharingService: MemorySegment, items: MemorySegment, sharingContentScope: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'sharingService:sourceWindowForShareItems:sharingContentScope:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun anchoringViewForSharingService_showRelativeToRect_preferredEdge(sharingService: MemorySegment, positioningRect: NSRectPointer, preferredEdge: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'anchoringViewForSharingService:showRelativeToRect:preferredEdge:' not implemented")

}
