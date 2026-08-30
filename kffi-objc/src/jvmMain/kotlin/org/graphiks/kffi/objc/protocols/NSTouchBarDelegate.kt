@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTouchBarDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
interface NSTouchBarDelegate {
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun touchBar_makeItemForIdentifier(touchBar: MemorySegment, identifier: MemorySegment): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'touchBar:makeItemForIdentifier:' not implemented")

}
