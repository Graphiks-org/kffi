@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSMatrixDelegate
 * Inherits protocols: NSControlTextEditingDelegate
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSMatrixDelegate : NSControlTextEditingDelegate {
}
