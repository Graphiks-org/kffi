@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSecureUnarchiveFromDataTransformer
 * Superclass: NSValueTransformer
 */
@PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
open class NSSecureUnarchiveFromDataTransformer(override val ptr: MemorySegment) : NSValueTransformer(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSecureUnarchiveFromDataTransformer") } }

        /** @return NSArray<Class> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 5, introducedMinor = 0, introducedSubminor = -1)
        fun allowedTopLevelClasses(): MemorySegment {
            val sel = ObjCRuntime.sel("allowedTopLevelClasses")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

}
