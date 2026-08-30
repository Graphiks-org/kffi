@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSColorPickingDefault
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSColorPickingDefault {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun initWithPickerMask_colorPanel(mask: Long, owningColorPanel: MemorySegment): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun provideNewButtonImage(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun insertNewButtonImage_in(newButtonImage: MemorySegment, buttonCell: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun viewSizeChanged(sender: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun alphaControlAddedOrRemoved(sender: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun attachColorList(colorList: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun detachColorList(colorList: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setMode(mode: NSColorPanelMode): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun buttonToolTip(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun minContentSize(): NSSize

}
