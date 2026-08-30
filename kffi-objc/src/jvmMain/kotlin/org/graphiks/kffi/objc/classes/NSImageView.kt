@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImageView
 * Superclass: NSControl
 * Protocols: NSAccessibilityImage, NSMenuItemValidation
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSImageView(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSImageView") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
        fun imageViewWithImage(image: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageViewWithImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun defaultPreferredImageDynamicRange(): NSImageDynamicRange {
            val sel = ObjCRuntime.sel("defaultPreferredImageDynamicRange")
            return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
        fun setDefaultPreferredImageDynamicRange(defaultPreferredImageDynamicRange: NSImageDynamicRange): Unit {
            val sel = ObjCRuntime.sel("setDefaultPreferredImageDynamicRange:")
            ObjCRuntime.msgSend(null, _class, sel, defaultPreferredImageDynamicRange.rawValue)
        }

    }

    // @property image
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property editable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEditable(): Boolean {
        val sel = ObjCRuntime.sel("isEditable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEditable(value: Boolean) {
        val sel = ObjCRuntime.sel("setEditable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageAlignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageAlignment(): NSImageAlignment {
        val sel = ObjCRuntime.sel("imageAlignment")
        return NSImageAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageAlignment(value: NSImageAlignment) {
        val sel = ObjCRuntime.sel("setImageAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageScaling
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setImageScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageFrameStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun imageFrameStyle(): NSImageFrameStyle {
        val sel = ObjCRuntime.sel("imageFrameStyle")
        return NSImageFrameStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setImageFrameStyle(value: NSImageFrameStyle) {
        val sel = ObjCRuntime.sel("setImageFrameStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property symbolConfiguration
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun symbolConfiguration(): MemorySegment {
        val sel = ObjCRuntime.sel("symbolConfiguration")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun setSymbolConfiguration(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSymbolConfiguration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentTintColor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun contentTintColor(): MemorySegment {
        val sel = ObjCRuntime.sel("contentTintColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 14, introducedSubminor = -1)
    open fun setContentTintColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentTintColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property animates
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun animates(): Boolean {
        val sel = ObjCRuntime.sel("animates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAnimates(value: Boolean) {
        val sel = ObjCRuntime.sel("setAnimates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsCutCopyPaste
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsCutCopyPaste(): Boolean {
        val sel = ObjCRuntime.sel("allowsCutCopyPaste")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsCutCopyPaste(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsCutCopyPaste:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredImageDynamicRange
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun preferredImageDynamicRange(): NSImageDynamicRange {
        val sel = ObjCRuntime.sel("preferredImageDynamicRange")
        return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setPreferredImageDynamicRange(value: NSImageDynamicRange) {
        val sel = ObjCRuntime.sel("setPreferredImageDynamicRange:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageDynamicRange
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun imageDynamicRange(): NSImageDynamicRange {
        val sel = ObjCRuntime.sel("imageDynamicRange")
        return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

// ── Category: NSSymbolEffect on NSImageView ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.addSymbolEffect(symbolEffect: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addSymbolEffect:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.addSymbolEffect_options(symbolEffect: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addSymbolEffect:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.addSymbolEffect_options_animated(symbolEffect: MemorySegment, options: MemorySegment, animated: Boolean): Unit {
    val sel = ObjCRuntime.sel("addSymbolEffect:options:animated:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options, animated)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.removeSymbolEffectOfType(symbolEffect: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeSymbolEffectOfType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.removeSymbolEffectOfType_options(symbolEffect: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeSymbolEffectOfType:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.removeSymbolEffectOfType_options_animated(symbolEffect: MemorySegment, options: MemorySegment, animated: Boolean): Unit {
    val sel = ObjCRuntime.sel("removeSymbolEffectOfType:options:animated:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options, animated)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.removeAllSymbolEffects(): Unit {
    val sel = ObjCRuntime.sel("removeAllSymbolEffects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.removeAllSymbolEffectsWithOptions(options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeAllSymbolEffectsWithOptions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.removeAllSymbolEffectsWithOptions_animated(options: MemorySegment, animated: Boolean): Unit {
    val sel = ObjCRuntime.sel("removeAllSymbolEffectsWithOptions:animated:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options, animated)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.setSymbolImage_withContentTransition(symbolImage: MemorySegment, transition: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSymbolImage:withContentTransition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolImage, transition)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
fun NSImageView.setSymbolImage_withContentTransition_options(symbolImage: MemorySegment, transition: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSymbolImage:withContentTransition:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolImage, transition, options)
}
