@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityContainsTransientUI
 * Inherits protocols: NSAccessibilityElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityContainsTransientUI {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityPerformShowAlternateUI(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityPerformShowDefaultUI(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun isAccessibilityAlternateUIVisible(): Boolean

}
