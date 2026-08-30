@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityButton
 * Inherits protocols: NSAccessibilityElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityButton {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityLabel(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityPerformPress(): Boolean

}
