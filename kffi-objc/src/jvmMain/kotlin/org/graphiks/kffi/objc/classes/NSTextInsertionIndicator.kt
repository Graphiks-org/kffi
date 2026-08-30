@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextInsertionIndicator
 * Superclass: NSView
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
open class NSTextInsertionIndicator(override val ptr: MemorySegment) : NSView(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextInsertionIndicator") }

    }

    // @property displayMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayMode(): NSTextInsertionIndicatorDisplayMode {
        val sel = ObjCRuntime.sel("displayMode")
        return NSTextInsertionIndicatorDisplayMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplayMode(value: NSTextInsertionIndicatorDisplayMode) {
        val sel = ObjCRuntime.sel("setDisplayMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property color
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun color(): MemorySegment {
        val sel = ObjCRuntime.sel("color")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property automaticModeOptions
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun automaticModeOptions(): NSTextInsertionIndicatorAutomaticModeOptions {
        val sel = ObjCRuntime.sel("automaticModeOptions")
        return NSTextInsertionIndicatorAutomaticModeOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAutomaticModeOptions(value: NSTextInsertionIndicatorAutomaticModeOptions) {
        val sel = ObjCRuntime.sel("setAutomaticModeOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property effectsViewInserter
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun effectsViewInserter(): MemorySegment {
        val sel = ObjCRuntime.sel("effectsViewInserter")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEffectsViewInserter(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setEffectsViewInserter:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
