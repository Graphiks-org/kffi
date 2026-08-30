@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSHapticFeedbackPerformer
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSHapticFeedbackPerformer {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun performFeedbackPattern_performanceTime(pattern: NSHapticFeedbackPattern, performanceTime: NSHapticFeedbackPerformanceTime): Unit

}
