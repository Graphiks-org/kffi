@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityLayoutArea
 * Inherits protocols: NSAccessibilityGroup
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityLayoutArea : NSAccessibilityGroup {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityLabel(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityChildren(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilitySelectedChildren(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityFocusedUIElement(): MemorySegment

}
