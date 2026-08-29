@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilitySwitch
 * Inherits protocols: NSAccessibilityButton
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilitySwitch : NSAccessibilityButton {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityValue(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityPerformIncrement(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityPerformIncrement' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityPerformDecrement(): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityPerformDecrement' not implemented")

}
