@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSpeechRecognizerDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSSpeechRecognizerDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun speechRecognizer_didRecognizeCommand(sender: MemorySegment, command: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'speechRecognizer:didRecognizeCommand:' not implemented")

}
