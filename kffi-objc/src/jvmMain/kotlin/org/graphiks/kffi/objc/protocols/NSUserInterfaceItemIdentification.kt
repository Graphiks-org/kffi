@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSUserInterfaceItemIdentification
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSUserInterfaceItemIdentification {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun identifier(): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun setIdentifier(identifier: MemorySegment): Unit

}
