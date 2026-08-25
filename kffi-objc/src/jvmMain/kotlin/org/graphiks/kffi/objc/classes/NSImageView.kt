package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImageView
 * Superclass: NSControl
 * Protocols: NSAccessibilityImage, NSMenuItemValidation
 */
open class NSImageView(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSImageView") }

        fun imageViewWithImage(image: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageViewWithImage:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, image) as MemorySegment
        }

        fun defaultPreferredImageDynamicRange(): NSImageDynamicRange {
            val sel = ObjCRuntime.sel("defaultPreferredImageDynamicRange")
            return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, _class, sel) as Long)
        }

        fun setDefaultPreferredImageDynamicRange(defaultPreferredImageDynamicRange: NSImageDynamicRange): Unit {
            val sel = ObjCRuntime.sel("setDefaultPreferredImageDynamicRange:")
            ObjCRuntime.msgSend(null, _class, sel, defaultPreferredImageDynamicRange.rawValue)
        }

    }

    // @property image
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setImage(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setImage:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property editable
    open fun isEditable(): Boolean {
        val sel = ObjCRuntime.sel("isEditable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setEditable(value: Boolean) {
        val sel = ObjCRuntime.sel("setEditable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property imageAlignment
    open fun imageAlignment(): NSImageAlignment {
        val sel = ObjCRuntime.sel("imageAlignment")
        return NSImageAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setImageAlignment(value: NSImageAlignment) {
        val sel = ObjCRuntime.sel("setImageAlignment:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageScaling
    open fun imageScaling(): NSImageScaling {
        val sel = ObjCRuntime.sel("imageScaling")
        return NSImageScaling(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setImageScaling(value: NSImageScaling) {
        val sel = ObjCRuntime.sel("setImageScaling:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageFrameStyle
    open fun imageFrameStyle(): NSImageFrameStyle {
        val sel = ObjCRuntime.sel("imageFrameStyle")
        return NSImageFrameStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setImageFrameStyle(value: NSImageFrameStyle) {
        val sel = ObjCRuntime.sel("setImageFrameStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property symbolConfiguration
    open fun symbolConfiguration(): MemorySegment {
        val sel = ObjCRuntime.sel("symbolConfiguration")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setSymbolConfiguration(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSymbolConfiguration:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentTintColor
    open fun contentTintColor(): MemorySegment {
        val sel = ObjCRuntime.sel("contentTintColor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setContentTintColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentTintColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property animates
    open fun animates(): Boolean {
        val sel = ObjCRuntime.sel("animates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAnimates(value: Boolean) {
        val sel = ObjCRuntime.sel("setAnimates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsCutCopyPaste
    open fun allowsCutCopyPaste(): Boolean {
        val sel = ObjCRuntime.sel("allowsCutCopyPaste")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAllowsCutCopyPaste(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsCutCopyPaste:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property defaultPreferredImageDynamicRange
    open fun defaultPreferredImageDynamicRange(): NSImageDynamicRange {
        val sel = ObjCRuntime.sel("defaultPreferredImageDynamicRange")
        return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setDefaultPreferredImageDynamicRange(value: NSImageDynamicRange) {
        val sel = ObjCRuntime.sel("setDefaultPreferredImageDynamicRange:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property preferredImageDynamicRange
    open fun preferredImageDynamicRange(): NSImageDynamicRange {
        val sel = ObjCRuntime.sel("preferredImageDynamicRange")
        return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setPreferredImageDynamicRange(value: NSImageDynamicRange) {
        val sel = ObjCRuntime.sel("setPreferredImageDynamicRange:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property imageDynamicRange
    open fun imageDynamicRange(): NSImageDynamicRange {
        val sel = ObjCRuntime.sel("imageDynamicRange")
        return NSImageDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}

// ── Category: NSSymbolEffect on NSImageView ─────────────────────────────────────────

fun NSImageView.addSymbolEffect(symbolEffect: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addSymbolEffect:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect)
}

fun NSImageView.addSymbolEffect_options(symbolEffect: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("addSymbolEffect:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options)
}

fun NSImageView.addSymbolEffect_options_animated(symbolEffect: MemorySegment, options: MemorySegment, animated: Boolean): Unit {
    val sel = ObjCRuntime.sel("addSymbolEffect:options:animated:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options, animated)
}

fun NSImageView.removeSymbolEffectOfType(symbolEffect: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeSymbolEffectOfType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect)
}

fun NSImageView.removeSymbolEffectOfType_options(symbolEffect: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeSymbolEffectOfType:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options)
}

fun NSImageView.removeSymbolEffectOfType_options_animated(symbolEffect: MemorySegment, options: MemorySegment, animated: Boolean): Unit {
    val sel = ObjCRuntime.sel("removeSymbolEffectOfType:options:animated:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolEffect, options, animated)
}

fun NSImageView.removeAllSymbolEffects(): Unit {
    val sel = ObjCRuntime.sel("removeAllSymbolEffects")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

fun NSImageView.removeAllSymbolEffectsWithOptions(options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("removeAllSymbolEffectsWithOptions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options)
}

fun NSImageView.removeAllSymbolEffectsWithOptions_animated(options: MemorySegment, animated: Boolean): Unit {
    val sel = ObjCRuntime.sel("removeAllSymbolEffectsWithOptions:animated:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options, animated)
}

fun NSImageView.setSymbolImage_withContentTransition(symbolImage: MemorySegment, transition: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSymbolImage:withContentTransition:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolImage, transition)
}

fun NSImageView.setSymbolImage_withContentTransition_options(symbolImage: MemorySegment, transition: MemorySegment, options: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setSymbolImage:withContentTransition:options:")
    ObjCRuntime.msgSend(null, this.ptr, sel, symbolImage, transition, options)
}
