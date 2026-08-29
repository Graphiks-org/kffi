@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImageSymbolConfiguration
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
open class NSImageSymbolConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSImageSymbolConfiguration") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun configurationWithPointSize_weight_scale(pointSize: Double, weight: Double, scale: NSImageSymbolScale): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithPointSize:weight:scale:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pointSize, weight, scale.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun configurationWithPointSize_weight(pointSize: Double, weight: Double): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithPointSize:weight:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pointSize, weight) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun configurationWithTextStyle_scale(style: MemorySegment, scale: NSImageSymbolScale): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithTextStyle:scale:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, style, scale.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun configurationWithTextStyle(style: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithTextStyle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, style) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun configurationWithScale(scale: NSImageSymbolScale): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithScale:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, scale.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun configurationPreferringMonochrome(): MemorySegment {
            val sel = ObjCRuntime.sel("configurationPreferringMonochrome")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun configurationPreferringHierarchical(): MemorySegment {
            val sel = ObjCRuntime.sel("configurationPreferringHierarchical")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        fun configurationWithHierarchicalColor(hierarchicalColor: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithHierarchicalColor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, hierarchicalColor) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        fun configurationWithPaletteColors(paletteColors: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithPaletteColors:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, paletteColors) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        fun configurationPreferringMulticolor(): MemorySegment {
            val sel = ObjCRuntime.sel("configurationPreferringMulticolor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun configurationWithVariableValueMode(variableValueMode: NSImageSymbolVariableValueMode): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithVariableValueMode:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, variableValueMode.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun configurationWithColorRenderingMode(mode: NSImageSymbolColorRenderingMode): MemorySegment {
            val sel = ObjCRuntime.sel("configurationWithColorRenderingMode:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, mode.rawValue) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun configurationByApplyingConfiguration(configuration: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("configurationByApplyingConfiguration:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, configuration) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSImageSymbolConfiguration.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSImageSymbolConfiguration.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSImageSymbolConfiguration.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSImageSymbolConfiguration_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSImageSymbolConfiguration")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
