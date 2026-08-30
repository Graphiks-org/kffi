@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSEditorRegistration
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSEditorRegistration {
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun objectDidBeginEditing(editor: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'objectDidBeginEditing:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun objectDidEndEditing(editor: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'objectDidEndEditing:' not implemented")

}
