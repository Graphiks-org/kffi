@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSUserInterfaceCompression
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSUserInterfaceCompression {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun compressWithPrioritizedCompressionOptions(prioritizedOptions: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun minimumSizeWithPrioritizedCompressionOptions(prioritizedOptions: MemorySegment): NSSize

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun activeCompressionOptions(): MemorySegment

}
