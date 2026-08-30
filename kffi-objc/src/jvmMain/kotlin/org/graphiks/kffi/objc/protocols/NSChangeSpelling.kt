@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSChangeSpelling
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSChangeSpelling {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun changeSpelling(sender: MemorySegment): Unit

}
