@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSFontChanging
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSFontChanging {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun changeFont(sender: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'changeFont:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun validModesForFontPanel(fontPanel: MemorySegment): NSFontPanelModeMask =
        throw UnsupportedOperationException("Optional ObjC method 'validModesForFontPanel:' not implemented")

}
