@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSViewToolTipOwner
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSViewToolTipOwner {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun view_stringForToolTip_point_userData(view: MemorySegment, tag: Long, point: NSPoint, `data`: MemorySegment): MemorySegment

}
