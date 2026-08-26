package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSBitmapImageRep
 * Superclass: NSImageRep
 * Protocols: NSSecureCoding
 */
open class NSBitmapImageRep(override val ptr: MemorySegment) : NSImageRep(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSBitmapImageRep") }

        /** @return NSArray<NSImageRep *> * */
        fun imageRepsWithData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        fun imageRepWithData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        fun TIFFRepresentationOfImageRepsInArray(array: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("TIFFRepresentationOfImageRepsInArray:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, array) as MemorySegment
        }

        fun TIFFRepresentationOfImageRepsInArray_usingCompression_factor(array: MemorySegment, comp: NSTIFFCompression, factor: Float): MemorySegment {
            val sel = ObjCRuntime.sel("TIFFRepresentationOfImageRepsInArray:usingCompression:factor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, array, comp.rawValue, factor) as MemorySegment
        }

        fun getTIFFCompressionTypes_count(list: MemorySegment, numTypes: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("getTIFFCompressionTypes:count:")
            ObjCRuntime.msgSend(null, _class, sel, list, numTypes)
        }

        fun localizedNameForTIFFCompressionType(compression: NSTIFFCompression): MemorySegment {
            val sel = ObjCRuntime.sel("localizedNameForTIFFCompressionType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, compression.rawValue) as MemorySegment
        }

        /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
        fun localizedNameForTIFFCompressionTypeAsString(compression: NSTIFFCompression): String = ObjCRuntime.toJavaString(localizedNameForTIFFCompressionType(compression))

    }

    open fun initWithFocusedViewRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFocusedViewRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    open fun initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel(planes: MemorySegment, width: Long, height: Long, bps: Long, spp: Long, alpha: Boolean, isPlanar: Boolean, colorSpaceName: MemorySegment, rBytes: Long, pBits: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bytesPerRow:bitsPerPixel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, planes, width, height, bps, spp, alpha, isPlanar, colorSpaceName, rBytes, pBits) as MemorySegment
    }

    open fun initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel(planes: MemorySegment, width: Long, height: Long, bps: Long, spp: Long, alpha: Boolean, isPlanar: Boolean, colorSpaceName: MemorySegment, bitmapFormat: NSBitmapFormat, rBytes: Long, pBits: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bitmapFormat:bytesPerRow:bitsPerPixel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, planes, width, height, bps, spp, alpha, isPlanar, colorSpaceName, bitmapFormat.rawValue, rBytes, pBits) as MemorySegment
    }

    open fun initWithCGImage(cgImage: CGImageRef): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCGImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, cgImage.segment) as MemorySegment
    }

    open fun initWithCIImage(ciImage: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCIImage:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ciImage) as MemorySegment
    }

    open fun initWithData(`data`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithData:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `data`) as MemorySegment
    }

    open fun getBitmapDataPlanes(`data`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getBitmapDataPlanes:")
        ObjCRuntime.msgSend(null, ptr, sel, `data`)
    }

    open fun getCompression_factor(compression: MemorySegment, factor: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getCompression:factor:")
        ObjCRuntime.msgSend(null, ptr, sel, compression, factor)
    }

    open fun setCompression_factor(compression: NSTIFFCompression, factor: Float): Unit {
        val sel = ObjCRuntime.sel("setCompression:factor:")
        ObjCRuntime.msgSend(null, ptr, sel, compression.rawValue, factor)
    }

    open fun TIFFRepresentationUsingCompression_factor(comp: NSTIFFCompression, factor: Float): MemorySegment {
        val sel = ObjCRuntime.sel("TIFFRepresentationUsingCompression:factor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, comp.rawValue, factor) as MemorySegment
    }

    open fun canBeCompressedUsing(compression: NSTIFFCompression): Boolean {
        val sel = ObjCRuntime.sel("canBeCompressedUsing:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, compression.rawValue) as Boolean
    }

    open fun colorizeByMappingGray_toColor_blackMapping_whiteMapping(midPoint: Double, midPointColor: MemorySegment, shadowColor: MemorySegment, lightColor: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("colorizeByMappingGray:toColor:blackMapping:whiteMapping:")
        ObjCRuntime.msgSend(null, ptr, sel, midPoint, midPointColor, shadowColor, lightColor)
    }

    open fun initForIncrementalLoad(): MemorySegment {
        val sel = ObjCRuntime.sel("initForIncrementalLoad")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun incrementalLoadFromData_complete(`data`: MemorySegment, complete: Boolean): Long {
        val sel = ObjCRuntime.sel("incrementalLoadFromData:complete:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, `data`, complete) as Long
    }

    open fun setColor_atX_y(color: MemorySegment, x: Long, y: Long): Unit {
        val sel = ObjCRuntime.sel("setColor:atX:y:")
        ObjCRuntime.msgSend(null, ptr, sel, color, x, y)
    }

    open fun colorAtX_y(x: Long, y: Long): MemorySegment {
        val sel = ObjCRuntime.sel("colorAtX:y:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, x, y) as MemorySegment
    }

    open fun getPixel_atX_y(p: MemorySegment, x: Long, y: Long): Unit {
        val sel = ObjCRuntime.sel("getPixel:atX:y:")
        ObjCRuntime.msgSend(null, ptr, sel, p, x, y)
    }

    open fun setPixel_atX_y(p: MemorySegment, x: Long, y: Long): Unit {
        val sel = ObjCRuntime.sel("setPixel:atX:y:")
        ObjCRuntime.msgSend(null, ptr, sel, p, x, y)
    }

    open fun bitmapImageRepByConvertingToColorSpace_renderingIntent(targetSpace: MemorySegment, renderingIntent: NSColorRenderingIntent): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapImageRepByConvertingToColorSpace:renderingIntent:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, targetSpace, renderingIntent.rawValue) as MemorySegment
    }

    open fun bitmapImageRepByRetaggingWithColorSpace(newSpace: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapImageRepByRetaggingWithColorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newSpace) as MemorySegment
    }

    // @property bitmapData
    open fun bitmapData(): MemorySegment {
        val sel = ObjCRuntime.sel("bitmapData")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property planar
    open fun isPlanar(): Boolean {
        val sel = ObjCRuntime.sel("isPlanar")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property samplesPerPixel
    open fun samplesPerPixel(): Long {
        val sel = ObjCRuntime.sel("samplesPerPixel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bitsPerPixel
    open fun bitsPerPixel(): Long {
        val sel = ObjCRuntime.sel("bitsPerPixel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bytesPerRow
    open fun bytesPerRow(): Long {
        val sel = ObjCRuntime.sel("bytesPerRow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bytesPerPlane
    open fun bytesPerPlane(): Long {
        val sel = ObjCRuntime.sel("bytesPerPlane")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property numberOfPlanes
    open fun numberOfPlanes(): Long {
        val sel = ObjCRuntime.sel("numberOfPlanes")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property bitmapFormat
    open fun bitmapFormat(): NSBitmapFormat {
        val sel = ObjCRuntime.sel("bitmapFormat")
        return NSBitmapFormat(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property TIFFRepresentation
    open fun TIFFRepresentation(): MemorySegment {
        val sel = ObjCRuntime.sel("TIFFRepresentation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property CGImage
    open fun CGImage(): CGImageRef {
        val sel = ObjCRuntime.sel("CGImage")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property colorSpace
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

fun NSBitmapImageRep.representationUsingType_properties(storageType: NSBitmapImageFileType, properties: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("representationUsingType:properties:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, storageType.rawValue, properties) as MemorySegment
}

fun NSBitmapImageRep.setProperty_withValue(property: MemorySegment, value: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setProperty:withValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, property, value)
}

fun NSBitmapImageRep.valueForProperty(property: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("valueForProperty:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, property) as MemorySegment
}

// Class method: +[NSBitmapImageRep representationOfImageRepsInArray:usingType:properties:]
fun NSBitmapImageRep_representationOfImageRepsInArray_usingType_properties(imageReps: MemorySegment, storageType: NSBitmapImageFileType, properties: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("representationOfImageRepsInArray:usingType:properties:")
    val cls = ObjCRuntime.getClass("NSBitmapImageRep")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, imageReps, storageType.rawValue, properties) as MemorySegment
}
