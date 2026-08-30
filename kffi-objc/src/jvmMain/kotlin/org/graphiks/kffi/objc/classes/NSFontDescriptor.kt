@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFontDescriptor
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSFontDescriptor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSFontDescriptor") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontDescriptorWithFontAttributes(attributes: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontDescriptorWithFontAttributes:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, attributes) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontDescriptorWithName_size(fontName: MemorySegment, size: Double): MemorySegment {
            val sel = ObjCRuntime.sel("fontDescriptorWithName:size:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontName, size) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontDescriptorWithName_size(fontName: String, size: Double): MemorySegment = fontDescriptorWithName_size(ObjCRuntime.newNSString(Arena.global(), fontName), size)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontDescriptorWithName_matrix(fontName: MemorySegment, matrix: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontDescriptorWithName:matrix:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontName, matrix) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontDescriptorWithName_matrix(fontName: String, matrix: MemorySegment): MemorySegment = fontDescriptorWithName_matrix(ObjCRuntime.newNSString(Arena.global(), fontName), matrix)

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun objectForKey(attribute: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("objectForKey:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attribute) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFontAttributes(attributes: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFontAttributes:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributes) as MemorySegment
    }

    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matchingFontDescriptorsWithMandatoryKeys(mandatoryKeys: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("matchingFontDescriptorsWithMandatoryKeys:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, mandatoryKeys) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun matchingFontDescriptorWithMandatoryKeys(mandatoryKeys: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("matchingFontDescriptorWithMandatoryKeys:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, mandatoryKeys) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptorByAddingAttributes(attributes: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorByAddingAttributes:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributes) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptorWithSymbolicTraits(symbolicTraits: NSFontDescriptorSymbolicTraits): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorWithSymbolicTraits:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, symbolicTraits.rawValue.toInt()) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptorWithSize(newPointSize: Double): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorWithSize:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newPointSize) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptorWithMatrix(matrix: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorWithMatrix:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, matrix) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptorWithFace(newFace: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorWithFace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newFace) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun fontDescriptorWithFace(newFace: String): MemorySegment = fontDescriptorWithFace(ObjCRuntime.newNSString(Arena.global(), newFace))

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptorWithFamily(newFamily: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorWithFamily:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newFamily) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun fontDescriptorWithFamily(newFamily: String): MemorySegment = fontDescriptorWithFamily(ObjCRuntime.newNSString(Arena.global(), newFamily))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun fontDescriptorWithDesign(design: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptorWithDesign:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, design) as MemorySegment
    }

    // @property postscriptName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun postscriptName(): MemorySegment {
        val sel = ObjCRuntime.sel("postscriptName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun postscriptNameAsString(): String = ObjCRuntime.toJavaString(postscriptName())

    // @property pointSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pointSize(): Double {
        val sel = ObjCRuntime.sel("pointSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property matrix
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun matrix(): MemorySegment {
        val sel = ObjCRuntime.sel("matrix")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property symbolicTraits
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun symbolicTraits(): NSFontDescriptorSymbolicTraits {
        val sel = ObjCRuntime.sel("symbolicTraits")
        return NSFontDescriptorSymbolicTraits(Integer.toUnsignedLong(ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int))
    }

    // @property requiresFontAssetRequest
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun requiresFontAssetRequest(): Boolean {
        val sel = ObjCRuntime.sel("requiresFontAssetRequest")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property fontAttributes
    /** @return NSDictionary<NSFontDescriptorAttributeName,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontAttributes(): MemorySegment {
        val sel = ObjCRuntime.sel("fontAttributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSFontDescriptor.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSFontDescriptor.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSFontDescriptor.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSFontDescriptor_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSFontDescriptor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSFontDescriptor_TextStyles on NSFontDescriptor ─────────────────────────────────────────

// Class method: +[NSFontDescriptor preferredFontDescriptorForTextStyle:options:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun NSFontDescriptor_preferredFontDescriptorForTextStyle_options(style: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("preferredFontDescriptorForTextStyle:options:")
    val cls = ObjCRuntime.getClass("NSFontDescriptor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, style, options) as MemorySegment
}
