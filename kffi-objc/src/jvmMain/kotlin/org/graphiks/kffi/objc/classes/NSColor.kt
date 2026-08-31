@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSColor
 * Superclass: NSObject
 * Protocols: NSCopying, NSSecureCoding, NSPasteboardReading, NSPasteboardWriting
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSColor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSColor") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithColorSpace_components_count(space: MemorySegment, components: MemorySegment, numberOfComponents: Long): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithColorSpace:components:count:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, space, components, numberOfComponents) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun colorWithSRGBRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithSRGBRed:green:blue:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun colorWithGenericGamma22White_alpha(white: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithGenericGamma22White:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, white, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun colorWithDisplayP3Red_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithDisplayP3Red:green:blue:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        fun colorWithWhite_alpha(white: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithWhite:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, white, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        fun colorWithRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        fun colorWithHue_saturation_brightness_alpha(hue: Double, saturation: Double, brightness: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithHue:saturation:brightness:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, hue, saturation, brightness, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun colorWithColorSpace_hue_saturation_brightness_alpha(space: MemorySegment, hue: Double, saturation: Double, brightness: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithColorSpace:hue:saturation:brightness:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, space, hue, saturation, brightness, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithCatalogName_colorName(listName: MemorySegment, colorName: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithCatalogName:colorName:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, listName, colorName) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        fun colorNamed_bundle(name: MemorySegment, bundle: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorNamed:bundle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, bundle) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        fun colorNamed(name: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorNamed:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun colorWithName_dynamicProvider(colorName: MemorySegment, dynamicProvider: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithName:dynamicProvider:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, colorName, dynamicProvider) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithDeviceWhite_alpha(white: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithDeviceWhite:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, white, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithDeviceRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithDeviceRed:green:blue:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithDeviceHue_saturation_brightness_alpha(hue: Double, saturation: Double, brightness: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithDeviceHue:saturation:brightness:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, hue, saturation, brightness, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithDeviceCyan_magenta_yellow_black_alpha(cyan: Double, magenta: Double, yellow: Double, black: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithDeviceCyan:magenta:yellow:black:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cyan, magenta, yellow, black, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithCalibratedWhite_alpha(white: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithCalibratedWhite:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, white, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithCalibratedRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithCalibratedRed:green:blue:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithCalibratedHue_saturation_brightness_alpha(hue: Double, saturation: Double, brightness: Double, alpha: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithCalibratedHue:saturation:brightness:alpha:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, hue, saturation, brightness, alpha) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorWithPatternImage(image: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithPatternImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun colorWithRed_green_blue_alpha_exposure(red: Double, green: Double, blue: Double, alpha: Double, exposure: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:alpha:exposure:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha, exposure) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
        fun colorWithRed_green_blue_alpha_linearExposure(red: Double, green: Double, blue: Double, alpha: Double, linearExposure: Double): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithRed:green:blue:alpha:linearExposure:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, red, green, blue, alpha, linearExposure) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "NSControlTint does not describe the full range of available control accent colors. Use +[NSColor controlAccentColor] instead.")
        fun colorForControlTint(controlTint: NSControlTint): MemorySegment {
            val sel = ObjCRuntime.sel("colorForControlTint:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, controlTint.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun colorFromPasteboard(pasteBoard: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("colorFromPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pasteBoard) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        fun colorWithCGColor(cgColor: CGColorRef): MemorySegment {
            val sel = ObjCRuntime.sel("colorWithCGColor:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, cgColor.segment) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun blackColor(): MemorySegment {
            val sel = ObjCRuntime.sel("blackColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun darkGrayColor(): MemorySegment {
            val sel = ObjCRuntime.sel("darkGrayColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun lightGrayColor(): MemorySegment {
            val sel = ObjCRuntime.sel("lightGrayColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun whiteColor(): MemorySegment {
            val sel = ObjCRuntime.sel("whiteColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun grayColor(): MemorySegment {
            val sel = ObjCRuntime.sel("grayColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun redColor(): MemorySegment {
            val sel = ObjCRuntime.sel("redColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun greenColor(): MemorySegment {
            val sel = ObjCRuntime.sel("greenColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun blueColor(): MemorySegment {
            val sel = ObjCRuntime.sel("blueColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun cyanColor(): MemorySegment {
            val sel = ObjCRuntime.sel("cyanColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun yellowColor(): MemorySegment {
            val sel = ObjCRuntime.sel("yellowColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun magentaColor(): MemorySegment {
            val sel = ObjCRuntime.sel("magentaColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun orangeColor(): MemorySegment {
            val sel = ObjCRuntime.sel("orangeColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun purpleColor(): MemorySegment {
            val sel = ObjCRuntime.sel("purpleColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun brownColor(): MemorySegment {
            val sel = ObjCRuntime.sel("brownColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun clearColor(): MemorySegment {
            val sel = ObjCRuntime.sel("clearColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun labelColor(): MemorySegment {
            val sel = ObjCRuntime.sel("labelColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun secondaryLabelColor(): MemorySegment {
            val sel = ObjCRuntime.sel("secondaryLabelColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun tertiaryLabelColor(): MemorySegment {
            val sel = ObjCRuntime.sel("tertiaryLabelColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun quaternaryLabelColor(): MemorySegment {
            val sel = ObjCRuntime.sel("quaternaryLabelColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
        fun quinaryLabelColor(): MemorySegment {
            val sel = ObjCRuntime.sel("quinaryLabelColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun linkColor(): MemorySegment {
            val sel = ObjCRuntime.sel("linkColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun placeholderTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("placeholderTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun windowFrameTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("windowFrameTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun selectedMenuItemTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("selectedMenuItemTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun alternateSelectedControlTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("alternateSelectedControlTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun headerTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("headerTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun separatorColor(): MemorySegment {
            val sel = ObjCRuntime.sel("separatorColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun gridColor(): MemorySegment {
            val sel = ObjCRuntime.sel("gridColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun windowBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("windowBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
        fun underPageBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("underPageBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun controlBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("controlBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun selectedContentBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("selectedContentBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun unemphasizedSelectedContentBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("unemphasizedSelectedContentBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSColor *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun alternatingContentBackgroundColors(): MemorySegment {
            val sel = ObjCRuntime.sel("alternatingContentBackgroundColors")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        fun findHighlightColor(): MemorySegment {
            val sel = ObjCRuntime.sel("findHighlightColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun textColor(): MemorySegment {
            val sel = ObjCRuntime.sel("textColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun textBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("textBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun textInsertionPointColor(): MemorySegment {
            val sel = ObjCRuntime.sel("textInsertionPointColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun selectedTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("selectedTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun selectedTextBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("selectedTextBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun unemphasizedSelectedTextBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("unemphasizedSelectedTextBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun unemphasizedSelectedTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("unemphasizedSelectedTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun controlColor(): MemorySegment {
            val sel = ObjCRuntime.sel("controlColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun controlTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("controlTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun selectedControlColor(): MemorySegment {
            val sel = ObjCRuntime.sel("selectedControlColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun selectedControlTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("selectedControlTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun disabledControlTextColor(): MemorySegment {
            val sel = ObjCRuntime.sel("disabledControlTextColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun keyboardFocusIndicatorColor(): MemorySegment {
            val sel = ObjCRuntime.sel("keyboardFocusIndicatorColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
        fun scrubberTexturedBackgroundColor(): MemorySegment {
            val sel = ObjCRuntime.sel("scrubberTexturedBackgroundColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemRedColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemRedColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemGreenColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemGreenColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemBlueColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemBlueColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemOrangeColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemOrangeColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemYellowColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemYellowColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemBrownColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemBrownColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemPinkColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemPinkColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemPurpleColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemPurpleColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun systemGrayColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemGrayColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun systemTealColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemTealColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
        fun systemIndigoColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemIndigoColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun systemMintColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemMintColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
        fun systemCyanColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemCyanColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun systemFillColor(): MemorySegment {
            val sel = ObjCRuntime.sel("systemFillColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun secondarySystemFillColor(): MemorySegment {
            val sel = ObjCRuntime.sel("secondarySystemFillColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun tertiarySystemFillColor(): MemorySegment {
            val sel = ObjCRuntime.sel("tertiarySystemFillColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun quaternarySystemFillColor(): MemorySegment {
            val sel = ObjCRuntime.sel("quaternarySystemFillColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun quinarySystemFillColor(): MemorySegment {
            val sel = ObjCRuntime.sel("quinarySystemFillColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
        fun controlAccentColor(): MemorySegment {
            val sel = ObjCRuntime.sel("controlAccentColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentControlTint(): NSControlTint {
            val sel = ObjCRuntime.sel("currentControlTint")
            return NSControlTint(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun highlightColor(): MemorySegment {
            val sel = ObjCRuntime.sel("highlightColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun shadowColor(): MemorySegment {
            val sel = ObjCRuntime.sel("shadowColor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use `showsAlpha` in `NSColorPanel` and `supportsAlpha` in `NSColorWell` to control alpha behavior for individual controls.")
        fun ignoresAlpha(): Boolean {
            val sel = ObjCRuntime.sel("ignoresAlpha")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use `showsAlpha` in `NSColorPanel` and `supportsAlpha` in `NSColorWell` to control alpha behavior for individual controls.")
        fun setIgnoresAlpha(ignoresAlpha: Boolean): Unit {
            val sel = ObjCRuntime.sel("setIgnoresAlpha:")
            ObjCRuntime.msgSend(null, _class, sel, ignoresAlpha)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun colorUsingType(type: NSColorType): MemorySegment {
        val sel = ObjCRuntime.sel("colorUsingType:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, type.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorUsingColorSpace(space: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("colorUsingColorSpace:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, space) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun colorByApplyingContentHeadroom(contentHeadroom: Double): MemorySegment {
        val sel = ObjCRuntime.sel("colorByApplyingContentHeadroom:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, contentHeadroom) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun highlightWithLevel(`val`: Double): MemorySegment {
        val sel = ObjCRuntime.sel("highlightWithLevel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `val`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shadowWithLevel(`val`: Double): MemorySegment {
        val sel = ObjCRuntime.sel("shadowWithLevel:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `val`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun colorWithSystemEffect(systemEffect: NSColorSystemEffect): MemorySegment {
        val sel = ObjCRuntime.sel("colorWithSystemEffect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, systemEffect.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun `set`(): Unit {
        val sel = ObjCRuntime.sel("set")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFill(): Unit {
        val sel = ObjCRuntime.sel("setFill")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setStroke(): Unit {
        val sel = ObjCRuntime.sel("setStroke")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun blendedColorWithFraction_ofColor(fraction: Double, color: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("blendedColorWithFraction:ofColor:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fraction, color) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorWithAlphaComponent(alpha: Double): MemorySegment {
        val sel = ObjCRuntime.sel("colorWithAlphaComponent:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, alpha) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getRed_green_blue_alpha(red: MemorySegment, green: MemorySegment, blue: MemorySegment, alpha: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getRed:green:blue:alpha:")
        ObjCRuntime.msgSend(null, ptr, sel, red, green, blue, alpha)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getHue_saturation_brightness_alpha(hue: MemorySegment, saturation: MemorySegment, brightness: MemorySegment, alpha: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getHue:saturation:brightness:alpha:")
        ObjCRuntime.msgSend(null, ptr, sel, hue, saturation, brightness, alpha)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getWhite_alpha(white: MemorySegment, alpha: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getWhite:alpha:")
        ObjCRuntime.msgSend(null, ptr, sel, white, alpha)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getCyan_magenta_yellow_black_alpha(cyan: MemorySegment, magenta: MemorySegment, yellow: MemorySegment, black: MemorySegment, alpha: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getCyan:magenta:yellow:black:alpha:")
        ObjCRuntime.msgSend(null, ptr, sel, cyan, magenta, yellow, black, alpha)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun getComponents(components: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("getComponents:")
        ObjCRuntime.msgSend(null, ptr, sel, components)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun writeToPasteboard(pasteBoard: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("writeToPasteboard:")
        ObjCRuntime.msgSend(null, ptr, sel, pasteBoard)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawSwatchInRect(rect: NSRect): Unit {
        val sel = ObjCRuntime.sel("drawSwatchInRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout))
    }

    // @property type
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
    open fun type(): NSColorType {
        val sel = ObjCRuntime.sel("type")
        return NSColorType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property standardDynamicRangeColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun standardDynamicRangeColor(): MemorySegment {
        val sel = ObjCRuntime.sel("standardDynamicRangeColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property catalogNameComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun catalogNameComponent(): MemorySegment {
        val sel = ObjCRuntime.sel("catalogNameComponent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property colorNameComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorNameComponent(): MemorySegment {
        val sel = ObjCRuntime.sel("colorNameComponent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property localizedCatalogNameComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedCatalogNameComponent(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedCatalogNameComponent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedCatalogNameComponentAsString(): String = ObjCRuntime.toJavaString(localizedCatalogNameComponent())

    // @property localizedColorNameComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedColorNameComponent(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedColorNameComponent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedColorNameComponentAsString(): String = ObjCRuntime.toJavaString(localizedColorNameComponent())

    // @property redComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun redComponent(): Double {
        val sel = ObjCRuntime.sel("redComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property greenComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun greenComponent(): Double {
        val sel = ObjCRuntime.sel("greenComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property blueComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun blueComponent(): Double {
        val sel = ObjCRuntime.sel("blueComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property hueComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hueComponent(): Double {
        val sel = ObjCRuntime.sel("hueComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property saturationComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saturationComponent(): Double {
        val sel = ObjCRuntime.sel("saturationComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property brightnessComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun brightnessComponent(): Double {
        val sel = ObjCRuntime.sel("brightnessComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property whiteComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun whiteComponent(): Double {
        val sel = ObjCRuntime.sel("whiteComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property cyanComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun cyanComponent(): Double {
        val sel = ObjCRuntime.sel("cyanComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property magentaComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun magentaComponent(): Double {
        val sel = ObjCRuntime.sel("magentaComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property yellowComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun yellowComponent(): Double {
        val sel = ObjCRuntime.sel("yellowComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property blackComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun blackComponent(): Double {
        val sel = ObjCRuntime.sel("blackComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property colorSpace
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorSpace(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpace")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfComponents
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfComponents(): Long {
        val sel = ObjCRuntime.sel("numberOfComponents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property patternImage
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun patternImage(): MemorySegment {
        val sel = ObjCRuntime.sel("patternImage")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property alphaComponent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alphaComponent(): Double {
        val sel = ObjCRuntime.sel("alphaComponent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property linearExposure
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun linearExposure(): Double {
        val sel = ObjCRuntime.sel("linearExposure")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property CGColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 8, introducedSubminor = -1)
    open fun CGColor(): CGColorRef {
        val sel = ObjCRuntime.sel("CGColor")
        return CGColorRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSColor.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSColor.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSColor_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

/** Required by Objective-C protocol NSPasteboardReading. */
fun NSColor_readableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("readableTypesForPasteboard:")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, pasteboard) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSColor.writableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("writableTypesForPasteboard:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, pasteboard) as MemorySegment
}

/** Required by Objective-C protocol NSPasteboardWriting. */
fun NSColor.pasteboardPropertyListForType(type: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("pasteboardPropertyListForType:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, type) as MemorySegment
}

// ── Category: NSDeprecated on NSColor ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -colorUsingType: or -colorUsingColorSpace: instead")
fun NSColor.colorUsingColorSpaceName_device(name: MemorySegment, deviceDescription: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("colorUsingColorSpaceName:device:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, name, deviceDescription) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -colorUsingType: or -colorUsingColorSpace: instead")
fun NSColor.colorUsingColorSpaceName(name: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("colorUsingColorSpaceName:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, name) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use -type and NSColorType instead")
fun NSColor.colorSpaceName(): MemorySegment {
    val sel = ObjCRuntime.sel("colorSpaceName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSColor controlHighlightColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use a color that matches the semantics being used, such as `separatorColor`")
fun NSColor_controlHighlightColor(): MemorySegment {
    val sel = ObjCRuntime.sel("controlHighlightColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor controlLightHighlightColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use a color that matches the semantics being used, such as `separatorColor`")
fun NSColor_controlLightHighlightColor(): MemorySegment {
    val sel = ObjCRuntime.sel("controlLightHighlightColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor controlShadowColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use a color that matches the semantics being used, such as `separatorColor`")
fun NSColor_controlShadowColor(): MemorySegment {
    val sel = ObjCRuntime.sel("controlShadowColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor controlDarkShadowColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use a color that matches the semantics being used, such as `separatorColor`")
fun NSColor_controlDarkShadowColor(): MemorySegment {
    val sel = ObjCRuntime.sel("controlDarkShadowColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor scrollBarColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSScroller instead")
fun NSColor_scrollBarColor(): MemorySegment {
    val sel = ObjCRuntime.sel("scrollBarColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor knobColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSScroller instead")
fun NSColor_knobColor(): MemorySegment {
    val sel = ObjCRuntime.sel("knobColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor selectedKnobColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSScroller instead")
fun NSColor_selectedKnobColor(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedKnobColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor windowFrameColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSVisualEffectMaterialTitlebar")
fun NSColor_windowFrameColor(): MemorySegment {
    val sel = ObjCRuntime.sel("windowFrameColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor selectedMenuItemColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSVisualEffectMaterialSelection")
fun NSColor_selectedMenuItemColor(): MemorySegment {
    val sel = ObjCRuntime.sel("selectedMenuItemColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor headerColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use NSVisualEffectMaterialHeaderView")
fun NSColor_headerColor(): MemorySegment {
    val sel = ObjCRuntime.sel("headerColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor secondarySelectedControlColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 1, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSColor_secondarySelectedControlColor(): MemorySegment {
    val sel = ObjCRuntime.sel("secondarySelectedControlColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor alternateSelectedControlColor]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 2, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSColor_alternateSelectedControlColor(): MemorySegment {
    val sel = ObjCRuntime.sel("alternateSelectedControlColor")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSColor controlAlternatingRowBackgroundColors]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 11, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSColor_controlAlternatingRowBackgroundColors(): MemorySegment {
    val sel = ObjCRuntime.sel("controlAlternatingRowBackgroundColors")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSQuartzCoreAdditions on NSColor ─────────────────────────────────────────

// Class method: +[NSColor colorWithCIColor:]
@PlatformAvailability(platform = "ios", unavailable = true)
fun NSColor_colorWithCIColor(color: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("colorWithCIColor:")
    val cls = ObjCRuntime.getClass("NSColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, color) as MemorySegment
}

// ── Category: NSAccessibilityColorConformance on NSColor ─────────────────────────────────────────
