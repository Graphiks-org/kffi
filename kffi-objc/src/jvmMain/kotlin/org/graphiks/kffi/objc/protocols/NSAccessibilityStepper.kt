@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityStepper
 * Inherits protocols: NSAccessibilityElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityStepper {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityLabel(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityPerformIncrement(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityPerformDecrement(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityValue(): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityValue' not implemented")

}
