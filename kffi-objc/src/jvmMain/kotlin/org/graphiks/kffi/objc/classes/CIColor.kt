@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: CIColor
 * Superclass: NSObject
 * Protocols: NSSecureCoding, NSCopying
 */
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
open class CIColor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("CIColor") } }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun colorWithCGColor(color: CGColorRef): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithCGColor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, color.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun colorWithRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun colorWithRed_green_blue(red: Double, green: Double, blue: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun colorWithRed_green_blue_alpha_colorSpace(red: Double, green: Double, blue: Double, alpha: Double, colorSpace: CGColorSpaceRef): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:alpha:colorSpace:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha, colorSpace.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun colorWithRed_green_blue_colorSpace(red: Double, green: Double, blue: Double, colorSpace: CGColorSpaceRef): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:colorSpace:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, colorSpace.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun colorWithString(representation: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithString:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, representation) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        fun colorWithString(representation: String): MemorySegment = colorWithString(ObjCRuntime.newNSString(Arena.global(), representation))

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun blackColor(): MemorySegment {
            val sel = ObjCRuntime.sel("blackColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun whiteColor(): MemorySegment {
            val sel = ObjCRuntime.sel("whiteColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun grayColor(): MemorySegment {
            val sel = ObjCRuntime.sel("grayColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun redColor(): MemorySegment {
            val sel = ObjCRuntime.sel("redColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun greenColor(): MemorySegment {
            val sel = ObjCRuntime.sel("greenColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun blueColor(): MemorySegment {
            val sel = ObjCRuntime.sel("blueColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun cyanColor(): MemorySegment {
            val sel = ObjCRuntime.sel("cyanColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun magentaColor(): MemorySegment {
            val sel = ObjCRuntime.sel("magentaColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun yellowColor(): MemorySegment {
            val sel = ObjCRuntime.sel("yellowColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun clearColor(): MemorySegment {
            val sel = ObjCRuntime.sel("clearColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithCGColor(color: CGColorRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGColor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, color.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun initWithRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRed:green:blue:alpha:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, red, green, blue, alpha) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun initWithRed_green_blue(red: Double, green: Double, blue: Double): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRed:green:blue:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, red, green, blue) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun initWithRed_green_blue_alpha_colorSpace(red: Double, green: Double, blue: Double, alpha: Double, colorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRed:green:blue:alpha:colorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, red, green, blue, alpha, colorSpace.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun initWithRed_green_blue_colorSpace(red: Double, green: Double, blue: Double, colorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRed:green:blue:colorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, red, green, blue, colorSpace.segment) as MemorySegment
    }

    // @property numberOfComponents
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun numberOfComponents(): Long {
        val sel = ObjCRuntime.sel("numberOfComponents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property components
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun components(): MemorySegment {
        val sel = ObjCRuntime.sel("components")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property alpha
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun alpha(): Double {
        val sel = ObjCRuntime.sel("alpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property colorSpace
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun colorSpace(): CGColorSpaceRef {
        val sel = ObjCRuntime.sel("colorSpace")
        return CGColorSpaceRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property red
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun red(): Double {
        val sel = ObjCRuntime.sel("red")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property green
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun green(): Double {
        val sel = ObjCRuntime.sel("green")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property blue
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun blue(): Double {
        val sel = ObjCRuntime.sel("blue")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property stringRepresentation
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun stringRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("stringRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    open fun stringRepresentationAsString(): String = ObjCRuntime.toJavaString(stringRepresentation())


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: _priv: MemorySegment
    // ivar: _pad: MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun CIColor.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun CIColor.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun CIColor_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("CIColor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSCopying. */
fun CIColor.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

// ── Category: NSAppKitAdditions on CIColor ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun CIColor.initWithColor(color: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithColor:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, color) as MemorySegment
}
