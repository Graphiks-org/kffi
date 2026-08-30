@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSTouchBarProvider
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
interface NSTouchBarProvider {
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
    fun touchBar(): MemorySegment

}
