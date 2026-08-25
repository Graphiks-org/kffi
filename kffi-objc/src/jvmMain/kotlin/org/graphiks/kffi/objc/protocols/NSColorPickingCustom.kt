package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSColorPickingCustom
 * Inherits protocols: NSColorPickingDefault
 */
interface NSColorPickingCustom : NSColorPickingDefault {
    fun supportsMode(mode: NSColorPanelMode): Boolean

    fun currentMode(): NSColorPanelMode

    fun provideNewView(initialRequest: Boolean): MemorySegment

    fun setColor(newColor: MemorySegment): Unit

}
