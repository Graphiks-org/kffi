@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSAccessibilityStaticText
 * Inherits protocols: NSAccessibilityElement
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSAccessibilityStaticText {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun accessibilityValue(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityAttributedStringForRange(range: NSRange): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityAttributedStringForRange:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun accessibilityVisibleCharacterRange(): NSRange =
        throw UnsupportedOperationException("Optional ObjC method 'accessibilityVisibleCharacterRange' not implemented")

}
