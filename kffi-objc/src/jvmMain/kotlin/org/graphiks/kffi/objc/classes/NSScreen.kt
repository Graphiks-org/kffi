@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScreen
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSScreen(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScreen") }

        /** @return NSArray<NSScreen *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun screens(): MemorySegment {
            val sel = ObjCRuntime.sel("screens")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun mainScreen(): MemorySegment {
            val sel = ObjCRuntime.sel("mainScreen")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun deepestScreen(): MemorySegment {
            val sel = ObjCRuntime.sel("deepestScreen")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
        fun screensHaveSeparateSpaces(): Boolean {
            val sel = ObjCRuntime.sel("screensHaveSeparateSpaces")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun canRepresentDisplayGamut(displayGamut: NSDisplayGamut): Boolean {
        val sel = ObjCRuntime.sel("canRepresentDisplayGamut:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, displayGamut.rawValue) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun convertRectToBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectToBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun convertRectFromBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectFromBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun backingAlignedRect_options(rect: NSRect, options: NSAlignmentOptions): NSRect {
        val sel = ObjCRuntime.sel("backingAlignedRect:options:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue))
    }

    // @property depth
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun depth(): NSWindowDepth {
        val sel = ObjCRuntime.sel("depth")
        return NSWindowDepth((ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int).toLong())
    }

    // @property frame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property visibleFrame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun visibleFrame(): NSRect {
        val sel = ObjCRuntime.sel("visibleFrame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property deviceDescription
    /** @return NSDictionary<NSDeviceDescriptionKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun deviceDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("deviceDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property colorSpace
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun colorSpace(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpace")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property supportedWindowDepths
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun supportedWindowDepths(): MemorySegment {
        val sel = ObjCRuntime.sel("supportedWindowDepths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property backingScaleFactor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun backingScaleFactor(): Double {
        val sel = ObjCRuntime.sel("backingScaleFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property localizedName
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun localizedName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun localizedNameAsString(): String = ObjCRuntime.toJavaString(localizedName())

    // @property safeAreaInsets
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun safeAreaInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("safeAreaInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }

    // @property auxiliaryTopLeftArea
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun auxiliaryTopLeftArea(): NSRect {
        val sel = ObjCRuntime.sel("auxiliaryTopLeftArea")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property auxiliaryTopRightArea
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
    open fun auxiliaryTopRightArea(): NSRect {
        val sel = ObjCRuntime.sel("auxiliaryTopRightArea")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property CGDirectDisplayID
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun CGDirectDisplayID(): Int {
        val sel = ObjCRuntime.sel("CGDirectDisplayID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

}

// ── Category:  on NSScreen ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
fun NSScreen.maximumExtendedDynamicRangeColorComponentValue(): Double {
    val sel = ObjCRuntime.sel("maximumExtendedDynamicRangeColorComponentValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun NSScreen.maximumPotentialExtendedDynamicRangeColorComponentValue(): Double {
    val sel = ObjCRuntime.sel("maximumPotentialExtendedDynamicRangeColorComponentValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
fun NSScreen.maximumReferenceExtendedDynamicRangeColorComponentValue(): Double {
    val sel = ObjCRuntime.sel("maximumReferenceExtendedDynamicRangeColorComponentValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

// ── Category: NSDisplayLink on NSScreen ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSScreen.displayLinkWithTarget_selector(target: MemorySegment, selector: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("displayLinkWithTarget:selector:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, target, selector) as MemorySegment
}

// ── Category: NSDeprecated on NSScreen ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 7, deprecatedSubminor = -1, message = "Use -convertRectToBacking: or -backingScaleFactor instead")
fun NSScreen.userSpaceScaleFactor(): Double {
    val sel = ObjCRuntime.sel("userSpaceScaleFactor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}
