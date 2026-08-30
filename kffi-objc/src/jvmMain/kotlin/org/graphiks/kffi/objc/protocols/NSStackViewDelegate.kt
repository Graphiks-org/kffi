@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSStackViewDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSStackViewDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun stackView_willDetachViews(stackView: MemorySegment, views: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'stackView:willDetachViews:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun stackView_didReattachViews(stackView: MemorySegment, views: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'stackView:didReattachViews:' not implemented")

}
