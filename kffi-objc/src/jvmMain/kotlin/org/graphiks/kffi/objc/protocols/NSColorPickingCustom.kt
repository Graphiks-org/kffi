@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSColorPickingCustom
 * Inherits protocols: NSColorPickingDefault
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSColorPickingCustom : NSColorPickingDefault {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun supportsMode(mode: NSColorPanelMode): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun currentMode(): NSColorPanelMode

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun provideNewView(initialRequest: Boolean): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setColor(newColor: MemorySegment): Unit

}
