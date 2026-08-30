@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSEditor
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSEditor {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun discardEditing(): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun commitEditing(): Boolean

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: MemorySegment, didCommitSelector: MemorySegment, contextInfo: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    fun commitEditingAndReturnError(error: MemorySegment): Boolean

}
