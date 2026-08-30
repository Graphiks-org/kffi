@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSIgnoreMisspelledWords
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSIgnoreMisspelledWords {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun ignoreSpelling(sender: MemorySegment): Unit

}
