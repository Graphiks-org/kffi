@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityCheckBox
 * Inherits protocols: NSAccessibilityButton
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityCheckBox : NSAccessibilityButton {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityValue(): MemorySegment

}
