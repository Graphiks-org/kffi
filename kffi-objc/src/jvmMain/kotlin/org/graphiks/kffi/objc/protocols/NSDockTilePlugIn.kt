@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSDockTilePlugIn
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSDockTilePlugIn {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setDockTile(dockTile: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun dockMenu(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'dockMenu' not implemented")

}
