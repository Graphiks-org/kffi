package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScreen
 * Superclass: NSObject
 */
open class NSScreen(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScreen") }

        /** @return NSArray<NSScreen *> * */
        fun screens(): MemorySegment {
            val sel = ObjCRuntime.sel("screens")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun mainScreen(): MemorySegment {
            val sel = ObjCRuntime.sel("mainScreen")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun deepestScreen(): MemorySegment {
            val sel = ObjCRuntime.sel("deepestScreen")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun screensHaveSeparateSpaces(): Boolean {
            val sel = ObjCRuntime.sel("screensHaveSeparateSpaces")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    open fun canRepresentDisplayGamut(displayGamut: NSDisplayGamut): Boolean {
        val sel = ObjCRuntime.sel("canRepresentDisplayGamut:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, displayGamut.rawValue) as Boolean
    }

    open fun convertRectToBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectToBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun convertRectFromBacking(rect: NSRect): NSRect {
        val sel = ObjCRuntime.sel("convertRectFromBacking:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)))
    }

    open fun backingAlignedRect_options(rect: NSRect, options: NSAlignmentOptions): NSRect {
        val sel = ObjCRuntime.sel("backingAlignedRect:options:")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), options.rawValue))
    }

    // @property screens
    /** @return NSArray<NSScreen *> * */
    open fun screens(): MemorySegment {
        val sel = ObjCRuntime.sel("screens")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property mainScreen
    open fun mainScreen(): MemorySegment {
        val sel = ObjCRuntime.sel("mainScreen")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property deepestScreen
    open fun deepestScreen(): MemorySegment {
        val sel = ObjCRuntime.sel("deepestScreen")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property screensHaveSeparateSpaces
    open fun screensHaveSeparateSpaces(): Boolean {
        val sel = ObjCRuntime.sel("screensHaveSeparateSpaces")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property depth
    open fun depth(): NSWindowDepth {
        val sel = ObjCRuntime.sel("depth")
        return NSWindowDepth((ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int).toLong())
    }

    // @property frame
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property visibleFrame
    open fun visibleFrame(): NSRect {
        val sel = ObjCRuntime.sel("visibleFrame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property deviceDescription
    /** @return NSDictionary<NSDeviceDescriptionKey,id> * */
    open fun deviceDescription(): MemorySegment {
        val sel = ObjCRuntime.sel("deviceDescription")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property colorSpace
    open fun colorSpace(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpace")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property supportedWindowDepths
    open fun supportedWindowDepths(): MemorySegment {
        val sel = ObjCRuntime.sel("supportedWindowDepths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property backingScaleFactor
    open fun backingScaleFactor(): Double {
        val sel = ObjCRuntime.sel("backingScaleFactor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property localizedName
    open fun localizedName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun localizedNameAsString(): String = ObjCRuntime.toJavaString(localizedName())

    // @property safeAreaInsets
    open fun safeAreaInsets(): NSEdgeInsets {
        val sel = ObjCRuntime.sel("safeAreaInsets")
        return NSEdgeInsets(ObjCRuntime.msgSendStruct(NSEdgeInsets.layout, ptr, sel))
    }

    // @property auxiliaryTopLeftArea
    open fun auxiliaryTopLeftArea(): NSRect {
        val sel = ObjCRuntime.sel("auxiliaryTopLeftArea")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property auxiliaryTopRightArea
    open fun auxiliaryTopRightArea(): NSRect {
        val sel = ObjCRuntime.sel("auxiliaryTopRightArea")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property CGDirectDisplayID
    open fun CGDirectDisplayID(): Int {
        val sel = ObjCRuntime.sel("CGDirectDisplayID")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

}

// ── Category:  on NSScreen ─────────────────────────────────────────

fun NSScreen.maximumExtendedDynamicRangeColorComponentValue(): Double {
    val sel = ObjCRuntime.sel("maximumExtendedDynamicRangeColorComponentValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSScreen.maximumPotentialExtendedDynamicRangeColorComponentValue(): Double {
    val sel = ObjCRuntime.sel("maximumPotentialExtendedDynamicRangeColorComponentValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

fun NSScreen.maximumReferenceExtendedDynamicRangeColorComponentValue(): Double {
    val sel = ObjCRuntime.sel("maximumReferenceExtendedDynamicRangeColorComponentValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}

// ── Category: NSDisplayLink on NSScreen ─────────────────────────────────────────

fun NSScreen.displayLinkWithTarget_selector(target: MemorySegment, selector: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("displayLinkWithTarget:selector:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, target, selector) as MemorySegment
}

// ── Category: NSDeprecated on NSScreen ─────────────────────────────────────────

fun NSScreen.userSpaceScaleFactor(): Double {
    val sel = ObjCRuntime.sel("userSpaceScaleFactor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, this.ptr, sel) as Double
}
