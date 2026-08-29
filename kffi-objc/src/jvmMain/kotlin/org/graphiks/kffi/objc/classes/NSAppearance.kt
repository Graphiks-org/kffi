@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAppearance
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
open class NSAppearance(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAppearance") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun appearanceNamed(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("appearanceNamed:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -performAsCurrentDrawingAppearance: to temporarily set the drawing appearance, or +currentDrawingAppearance to access the currently drawing appearance.")
        fun currentAppearance(): MemorySegment {
            val sel = ObjCRuntime.sel("currentAppearance")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use -performAsCurrentDrawingAppearance: to temporarily set the drawing appearance, or +currentDrawingAppearance to access the currently drawing appearance.")
        fun setCurrentAppearance(currentAppearance: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setCurrentAppearance:")
            ObjCRuntime.msgSend(null, _class, sel, currentAppearance)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun currentDrawingAppearance(): MemorySegment {
            val sel = ObjCRuntime.sel("currentDrawingAppearance")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun performAsCurrentDrawingAppearance(block: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("performAsCurrentDrawingAppearance:")
        ObjCRuntime.msgSend(null, ptr, sel, block)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithAppearanceNamed_bundle(name: MemorySegment, bundle: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithAppearanceNamed:bundle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, name, bundle) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun bestMatchFromAppearancesWithNames(appearances: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("bestMatchFromAppearancesWithNames:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, appearances) as MemorySegment
    }

    // @property name
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun name(): MemorySegment {
        val sel = ObjCRuntime.sel("name")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property allowsVibrancy
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun allowsVibrancy(): Boolean {
        val sel = ObjCRuntime.sel("allowsVibrancy")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSAppearance.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSAppearance_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSAppearance")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
