@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityNavigableStaticText
 * Inherits protocols: NSAccessibilityStaticText
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityNavigableStaticText : NSAccessibilityStaticText {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityStringForRange(range: NSRange): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityLineForIndex(index: Long): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityRangeForLine(lineNumber: Long): NSRange

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityFrameForRange(range: NSRange): NSRect

}
