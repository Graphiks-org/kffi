@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSConstantString
 * Superclass: NSSimpleCString
 */
@PlatformAvailability(platform = "swift", unavailable = true, message = "Use String or NSString instead.")
open class NSConstantString(override val ptr: MemorySegment) : NSSimpleCString(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSConstantString") }

    }

}
