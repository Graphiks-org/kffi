@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBindingSelectionMarker
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
open class NSBindingSelectionMarker(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSBindingSelectionMarker") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun setDefaultPlaceholder_forMarker_onClass_withBinding(placeholder: MemorySegment, marker: MemorySegment, objectClass: MemorySegment, binding: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setDefaultPlaceholder:forMarker:onClass:withBinding:")
            ObjCRuntime.msgSend(null, _class, sel, placeholder, marker, objectClass, binding)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun defaultPlaceholderForMarker_onClass_withBinding(marker: MemorySegment, objectClass: MemorySegment, binding: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("defaultPlaceholderForMarker:onClass:withBinding:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, marker, objectClass, binding) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun multipleValuesSelectionMarker(): MemorySegment {
            val sel = ObjCRuntime.sel("multipleValuesSelectionMarker")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun noSelectionMarker(): MemorySegment {
            val sel = ObjCRuntime.sel("noSelectionMarker")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun notApplicableSelectionMarker(): MemorySegment {
            val sel = ObjCRuntime.sel("notApplicableSelectionMarker")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSBindingSelectionMarker.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
