@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSimpleCString
 * Superclass: NSString
 */
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use String or NSString instead.")
open class NSSimpleCString(override val ptr: MemorySegment) : NSString(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSimpleCString") } }

    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: bytes: MemorySegment
    // ivar: numBytes: Int
    // ivar: _unused: Int
}
