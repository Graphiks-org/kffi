@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColorSpace
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSColorSpace(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSColorSpace") }

        /** @return NSArray<NSColorSpace *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun availableColorSpacesWithModel(model: NSColorSpaceModel): MemorySegment {
            val sel = ObjCRuntime.sel("availableColorSpacesWithModel:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, model.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun sRGBColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("sRGBColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun genericGamma22GrayColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("genericGamma22GrayColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun extendedSRGBColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("extendedSRGBColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun extendedGenericGamma22GrayColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("extendedGenericGamma22GrayColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun displayP3ColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("displayP3ColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun adobeRGB1998ColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("adobeRGB1998ColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun genericRGBColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("genericRGBColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun genericGrayColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("genericGrayColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun genericCMYKColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("genericCMYKColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun deviceRGBColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("deviceRGBColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun deviceGrayColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("deviceGrayColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun deviceCMYKColorSpace(): MemorySegment {
            val sel = ObjCRuntime.sel("deviceCMYKColorSpace")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithICCProfileData(iccData: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithICCProfileData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, iccData) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithColorSyncProfile(prof: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithColorSyncProfile:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, prof) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun initWithCGColorSpace(cgColorSpace: CGColorSpaceRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGColorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cgColorSpace.segment) as MemorySegment
    }

    // @property ICCProfileData
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ICCProfileData(): MemorySegment {
        val sel = ObjCRuntime.sel("ICCProfileData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property colorSyncProfile
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorSyncProfile(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSyncProfile")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property CGColorSpace
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun CGColorSpace(): CGColorSpaceRef {
        val sel = ObjCRuntime.sel("CGColorSpace")
        return CGColorSpaceRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property numberOfColorComponents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfColorComponents(): Long {
        val sel = ObjCRuntime.sel("numberOfColorComponents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property colorSpaceModel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorSpaceModel(): NSColorSpaceModel {
        val sel = ObjCRuntime.sel("colorSpaceModel")
        return NSColorSpaceModel(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property localizedName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedNameAsString(): String = ObjCRuntime.toJavaString(localizedName())

}

/** Required by Objective-C protocol NSCoding. */
fun NSColorSpace.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSColorSpace.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSColorSpace_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSColorSpace")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}
