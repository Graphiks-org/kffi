@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCDirectionalGamepad
 * Superclass: GCMicroGamepad
 */
@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
open class GCDirectionalGamepad(override val ptr: MemorySegment) : GCMicroGamepad(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCDirectionalGamepad") } }

    }

}
