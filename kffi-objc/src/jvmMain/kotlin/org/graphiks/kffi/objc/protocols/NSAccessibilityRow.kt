@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityRow
 * Inherits protocols: NSAccessibilityGroup
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityRow : NSAccessibilityGroup {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityIndex(): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityDisclosureLevel(): Long =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityDisclosureLevel' not implemented")

}
