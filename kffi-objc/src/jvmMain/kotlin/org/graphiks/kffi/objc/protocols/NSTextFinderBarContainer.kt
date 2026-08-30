@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTextFinderBarContainer
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSTextFinderBarContainer {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun findBarViewDidChangeHeight(): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun contentView(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'contentView' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun findBarView(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setFindBarView(findBarView: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun isFindBarVisible(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setFindBarVisible(findBarVisible: Boolean): Unit

}
