@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBitmapImageRep
 * Superclass: NSImageRep
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSBitmapImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSBitmapImageRep") } }

        /** @return NSArray<NSImageRep *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepsWithData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun TIFFRepresentationOfImageRepsInArray(array: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("TIFFRepresentationOfImageRepsInArray:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, array) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun TIFFRepresentationOfImageRepsInArray_usingCompression_factor(array: MemorySegment, comp: NSTIFFCompression, factor: Float): MemorySegment {
            val sel = ObjCRuntime.sel("TIFFRepresentationOfImageRepsInArray:usingCompression:factor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, array, comp.rawValue, factor) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun getTIFFCompressionTypes_count(list: MemorySegment, numTypes: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getTIFFCompressionTypes:count:")
            ObjCRuntime.msgSend(null, _class, sel, list, numTypes)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun localizedNameForTIFFCompressionType(compression: NSTIFFCompression): MemorySegment {
            val sel = ObjCRuntime.sel("localizedNameForTIFFCompressionType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, compression.rawValue) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun localizedNameForTIFFCompressionTypeAsString(compression: NSTIFFCompression): String = ObjCRuntime.toJavaString(localizedNameForTIFFCompressionType(compression))

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -[NSView cacheDisplayInRect:toBitmapImageRep:] to snapshot a view.")
    open fun initWithFocusedViewRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFocusedViewRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel(planes: MemorySegment, width: Long, height: Long, bps: Long, spp: Long, alpha: Boolean, isPlanar: Boolean, colorSpaceName: MemorySegment, rBytes: Long, pBits: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bytesPerRow:bitsPerPixel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, planes, width, height, bps, spp, alpha, isPlanar, colorSpaceName, rBytes, pBits) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel(planes: MemorySegment, width: Long, height: Long, bps: Long, spp: Long, alpha: Boolean, isPlanar: Boolean, colorSpaceName: MemorySegment, bitmapFormat: NSBitmapFormat, rBytes: Long, pBits: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bitmapFormat:bytesPerRow:bitsPerPixel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, planes, width, height, bps, spp, alpha, isPlanar, colorSpaceName, bitmapFormat.rawValue, rBytes, pBits) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun initWithCGImage(cgImage: CGImageRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cgImage.segment) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun initWithCIImage(ciImage: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCIImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ciImage) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getBitmapDataPlanes(`data`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getBitmapDataPlanes:")
        ObjCRuntime.msgSend(null, ptr, sel, `data`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getCompression_factor(compression: MemorySegment, factor: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getCompression:factor:")
        ObjCRuntime.msgSend(null, ptr, sel, compression, factor)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCompression_factor(compression: NSTIFFCompression, factor: Float): Unit {
        val sel = ObjCRuntime.sel("setCompression:factor:")
        ObjCRuntime.msgSend(null, ptr, sel, compression.rawValue, factor)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun TIFFRepresentationUsingCompression_factor(comp: NSTIFFCompression, factor: Float): MemorySegment {
        val sel = ObjCRuntime.sel("TIFFRepresentationUsingCompression:factor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, comp.rawValue, factor) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canBeCompressedUsing(compression: NSTIFFCompression): Boolean {
        val sel = ObjCRuntime.sel("canBeCompressedUsing:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, compression.rawValue) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorizeByMappingGray_toColor_blackMapping_whiteMapping(midPoint: Double, midPointColor: MemorySegment, shadowColor: MemorySegment, lightColor: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("colorizeByMappingGray:toColor:blackMapping:whiteMapping:")
        ObjCRuntime.msgSend(null, ptr, sel, midPoint, midPointColor, shadowColor, lightColor)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initForIncrementalLoad(): MemorySegment {
        val sel = ObjCRuntime.sel("initForIncrementalLoad")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun incrementalLoadFromData_complete(`data`: MemorySegment, complete: Boolean): Long {
        val sel = ObjCRuntime.sel("incrementalLoadFromData:complete:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, `data`, complete) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColor_atX_y(color: MemorySegment, x: Long, y: Long): Unit {
        val sel = ObjCRuntime.sel("setColor:atX:y:")
        ObjCRuntime.msgSend(null, ptr, sel, color, x, y)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorAtX_y(x: Long, y: Long): MemorySegment {
        val sel = ObjCRuntime.sel("colorAtX:y:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, x, y) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getPixel_atX_y(p: MemorySegment, x: Long, y: Long): Unit {
        val sel = ObjCRuntime.sel("getPixel:atX:y:")
        ObjCRuntime.msgSend(null, ptr, sel, p, x, y)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPixel_atX_y(p: MemorySegment, x: Long, y: Long): Unit {
        val sel = ObjCRuntime.sel("setPixel:atX:y:")
        ObjCRuntime.msgSend(null, ptr, sel, p, x, y)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun bitmapImageRepByConvertingToColorSpace_renderingIntent(targetSpace: MemorySegment, renderingIntent: NSColorRenderingIntent): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapImageRepByConvertingToColorSpace:renderingIntent:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, targetSpace, renderingIntent.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun bitmapImageRepByRetaggingWithColorSpace(newSpace: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapImageRepByRetaggingWithColorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newSpace) as MemorySegment
    }

    // @property bitmapData
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bitmapData(): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property planar
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isPlanar(): Boolean {
        val sel = ObjCRuntime.sel("isPlanar")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property samplesPerPixel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun samplesPerPixel(): Long {
        val sel = ObjCRuntime.sel("samplesPerPixel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bitsPerPixel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bitsPerPixel(): Long {
        val sel = ObjCRuntime.sel("bitsPerPixel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bytesPerRow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bytesPerRow(): Long {
        val sel = ObjCRuntime.sel("bytesPerRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bytesPerPlane
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bytesPerPlane(): Long {
        val sel = ObjCRuntime.sel("bytesPerPlane")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfPlanes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfPlanes(): Long {
        val sel = ObjCRuntime.sel("numberOfPlanes")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bitmapFormat
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bitmapFormat(): NSBitmapFormat {
        val sel = ObjCRuntime.sel("bitmapFormat")
        return NSBitmapFormat(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property TIFFRepresentation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun TIFFRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("TIFFRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property CGImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun CGImage(): CGImageRef {
        val sel = ObjCRuntime.sel("CGImage")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property colorSpace
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun colorSpace(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpace")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSBitmapImageRep_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSBitmapImageRep")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSBitmapImageFileTypeExtensions on NSBitmapImageRep ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBitmapImageRep.representationUsingType_properties(storageType: NSBitmapImageFileType, properties: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("representationUsingType:properties:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, storageType.rawValue, properties) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBitmapImageRep.setProperty_withValue(property: MemorySegment, value: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setProperty:withValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, property, value)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBitmapImageRep.valueForProperty(property: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueForProperty:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, property) as MemorySegment
}

// Class method: +[NSBitmapImageRep representationOfImageRepsInArray:usingType:properties:]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSBitmapImageRep_representationOfImageRepsInArray_usingType_properties(imageReps: MemorySegment, storageType: NSBitmapImageFileType, properties: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("representationOfImageRepsInArray:usingType:properties:")
    val cls = ObjCRuntime.getClass("NSBitmapImageRep")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, imageReps, storageType.rawValue, properties) as MemorySegment
}
