@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFont
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSFont(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFont") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontWithName_size(fontName: MemorySegment, fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("fontWithName:size:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontName, fontSize) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontWithName_size(fontName: String, fontSize: Double): MemorySegment = fontWithName_size(ObjCRuntime.newNSString(Arena.global(), fontName), fontSize)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontWithName_matrix(fontName: MemorySegment, fontMatrix: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontWithName:matrix:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontName, fontMatrix) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontWithName_matrix(fontName: String, fontMatrix: MemorySegment): MemorySegment = fontWithName_matrix(ObjCRuntime.newNSString(Arena.global(), fontName), fontMatrix)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontWithDescriptor_size(fontDescriptor: MemorySegment, fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("fontWithDescriptor:size:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontDescriptor, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun fontWithDescriptor_textTransform(fontDescriptor: MemorySegment, textTransform: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("fontWithDescriptor:textTransform:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontDescriptor, textTransform) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun userFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("userFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun userFixedPitchFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("userFixedPitchFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setUserFont(font: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setUserFont:")
            ObjCRuntime.msgSend(null, _class, sel, font)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setUserFixedPitchFont(font: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setUserFixedPitchFont:")
            ObjCRuntime.msgSend(null, _class, sel, font)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun systemFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("systemFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun boldSystemFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("boldSystemFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun labelFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("labelFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun titleBarFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("titleBarFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun menuFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("menuFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun menuBarFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("menuBarFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun messageFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("messageFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun paletteFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("paletteFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun toolTipsFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("toolTipsFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun controlContentFontOfSize(fontSize: Double): MemorySegment {
            val sel = ObjCRuntime.sel("controlContentFontOfSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun systemFontOfSize_weight(fontSize: Double, weight: Double): MemorySegment {
            val sel = ObjCRuntime.sel("systemFontOfSize:weight:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize, weight) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
        fun monospacedDigitSystemFontOfSize_weight(fontSize: Double, weight: Double): MemorySegment {
            val sel = ObjCRuntime.sel("monospacedDigitSystemFontOfSize:weight:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize, weight) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        fun systemFontOfSize_weight_width(fontSize: Double, weight: Double, width: Double): MemorySegment {
            val sel = ObjCRuntime.sel("systemFontOfSize:weight:width:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize, weight, width) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun monospacedSystemFontOfSize_weight(fontSize: Double, weight: Double): MemorySegment {
            val sel = ObjCRuntime.sel("monospacedSystemFontOfSize:weight:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, fontSize, weight) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun systemFontSizeForControlSize(controlSize: NSControlSize): Double {
            val sel = ObjCRuntime.sel("systemFontSizeForControlSize:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel, controlSize.rawValue) as Double
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun systemFontSize(): Double {
            val sel = ObjCRuntime.sel("systemFontSize")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun smallSystemFontSize(): Double {
            val sel = ObjCRuntime.sel("smallSystemFontSize")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun labelFontSize(): Double {
            val sel = ObjCRuntime.sel("labelFontSize")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, _class, sel) as Double
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun fontWithSize(fontSize: Double): MemorySegment {
        val sel = ObjCRuntime.sel("fontWithSize:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fontSize) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun boundingRectForCGGlyph(glyph: Short): NSRect {
        val sel = ObjCRuntime.sel("boundingRectForCGGlyph:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, glyph))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun advancementForCGGlyph(glyph: Short): NSSize {
        val sel = ObjCRuntime.sel("advancementForCGGlyph:")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel, glyph))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun getBoundingRects_forCGGlyphs_count(bounds: NSRectArray, glyphs: MemorySegment, glyphCount: Long): Unit {
        val sel = ObjCRuntime.sel("getBoundingRects:forCGGlyphs:count:")
        ObjCRuntime.msgSend(null, ptr, sel, bounds.segment, glyphs, glyphCount)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun getAdvancements_forCGGlyphs_count(advancements: NSSizeArray, glyphs: MemorySegment, glyphCount: Long): Unit {
        val sel = ObjCRuntime.sel("getAdvancements:forCGGlyphs:count:")
        ObjCRuntime.msgSend(null, ptr, sel, advancements.segment, glyphs, glyphCount)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun `set`(): Unit {
        val sel = ObjCRuntime.sel("set")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInContext(graphicsContext: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setInContext:")
        ObjCRuntime.msgSend(null, ptr, sel, graphicsContext)
    }

    // @property fontName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontName(): MemorySegment {
        val sel = ObjCRuntime.sel("fontName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontNameAsString(): String = ObjCRuntime.toJavaString(fontName())

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

    // @property familyName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun familyName(): MemorySegment {
        val sel = ObjCRuntime.sel("familyName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun familyNameAsString(): String = ObjCRuntime.toJavaString(familyName())

    // @property displayName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayName(): MemorySegment {
        val sel = ObjCRuntime.sel("displayName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayNameAsString(): String = ObjCRuntime.toJavaString(displayName())

    // @property fontDescriptor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fontDescriptor(): MemorySegment {
        val sel = ObjCRuntime.sel("fontDescriptor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property textTransform
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun textTransform(): MemorySegment {
        val sel = ObjCRuntime.sel("textTransform")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfGlyphs
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfGlyphs(): Long {
        val sel = ObjCRuntime.sel("numberOfGlyphs")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property mostCompatibleStringEncoding
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mostCompatibleStringEncoding(): Long {
        val sel = ObjCRuntime.sel("mostCompatibleStringEncoding")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property coveredCharacterSet
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun coveredCharacterSet(): MemorySegment {
        val sel = ObjCRuntime.sel("coveredCharacterSet")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property boundingRectForFont
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun boundingRectForFont(): NSRect {
        val sel = ObjCRuntime.sel("boundingRectForFont")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property maximumAdvancement
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maximumAdvancement(): NSSize {
        val sel = ObjCRuntime.sel("maximumAdvancement")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

    // @property ascender
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ascender(): Double {
        val sel = ObjCRuntime.sel("ascender")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property descender
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun descender(): Double {
        val sel = ObjCRuntime.sel("descender")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property leading
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leading(): Double {
        val sel = ObjCRuntime.sel("leading")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property underlinePosition
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun underlinePosition(): Double {
        val sel = ObjCRuntime.sel("underlinePosition")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property underlineThickness
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun underlineThickness(): Double {
        val sel = ObjCRuntime.sel("underlineThickness")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property italicAngle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun italicAngle(): Double {
        val sel = ObjCRuntime.sel("italicAngle")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property capHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun capHeight(): Double {
        val sel = ObjCRuntime.sel("capHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property xHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun xHeight(): Double {
        val sel = ObjCRuntime.sel("xHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property fixedPitch
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFixedPitch(): Boolean {
        val sel = ObjCRuntime.sel("isFixedPitch")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property verticalFont
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun verticalFont(): MemorySegment {
        val sel = ObjCRuntime.sel("verticalFont")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property vertical
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun isVertical(): Boolean {
        val sel = ObjCRuntime.sel("isVertical")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSFont.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSFont.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSFont.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSFont_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSFont")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: NSFont_Deprecated on NSFont ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.glyphWithName(name: MemorySegment): Int {
    val sel = ObjCRuntime.sel("glyphWithName:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, this.ptr, sel, name) as Int
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.boundingRectForGlyph(glyph: Int): NSRect {
    val sel = ObjCRuntime.sel("boundingRectForGlyph:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, glyph))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.advancementForGlyph(glyph: Int): NSSize {
    val sel = ObjCRuntime.sel("advancementForGlyph:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, glyph))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.getBoundingRects_forGlyphs_count(bounds: NSRectArray, glyphs: MemorySegment, glyphCount: Long): Unit {
    val sel = ObjCRuntime.sel("getBoundingRects:forGlyphs:count:")
    ObjCRuntime.msgSend(null, this.ptr, sel, bounds.segment, glyphs, glyphCount)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.getAdvancements_forGlyphs_count(advancements: NSSizeArray, glyphs: MemorySegment, glyphCount: Long): Unit {
    val sel = ObjCRuntime.sel("getAdvancements:forGlyphs:count:")
    ObjCRuntime.msgSend(null, this.ptr, sel, advancements.segment, glyphs, glyphCount)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.getAdvancements_forPackedGlyphs_length(advancements: NSSizeArray, packedGlyphs: MemorySegment, length: Long): Unit {
    val sel = ObjCRuntime.sel("getAdvancements:forPackedGlyphs:length:")
    ObjCRuntime.msgSend(null, this.ptr, sel, advancements.segment, packedGlyphs, length)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.screenFontWithRenderingMode(renderingMode: NSFontRenderingMode): MemorySegment {
    val sel = ObjCRuntime.sel("screenFontWithRenderingMode:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, renderingMode.rawValue) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.printerFont(): MemorySegment {
    val sel = ObjCRuntime.sel("printerFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.screenFont(): MemorySegment {
    val sel = ObjCRuntime.sel("screenFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSFont.renderingMode(): NSFontRenderingMode {
    val sel = ObjCRuntime.sel("renderingMode")
    return NSFontRenderingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

// ── Category: NSFont_TextStyles on NSFont ─────────────────────────────────────────

// Class method: +[NSFont preferredFontForTextStyle:options:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
fun NSFont_preferredFontForTextStyle_options(style: MemorySegment, options: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("preferredFontForTextStyle:options:")
    val cls = ObjCRuntime.getClass("NSFont")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, style, options) as MemorySegment
}
