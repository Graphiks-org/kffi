@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWritingToolsCoordinator
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
open class NSWritingToolsCoordinator(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSWritingToolsCoordinator") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun isWritingToolsAvailable(): Boolean {
            val sel = ObjCRuntime.sel("isWritingToolsAvailable")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithDelegate(delegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithDelegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, delegate) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun stopWritingTools(): Unit {
        val sel = ObjCRuntime.sel("stopWritingTools")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateRange_withText_reason_forContextWithIdentifier(range: NSRange, replacementText: MemorySegment, reason: NSWritingToolsCoordinatorTextUpdateReason, contextID: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateRange:withText:reason:forContextWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), replacementText, reason.rawValue, contextID)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateForReflowedTextInContextWithIdentifier(contextID: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("updateForReflowedTextInContextWithIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, contextID)
    }

    // @property delegate
    /** @return id<NSWritingToolsCoordinatorDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property view
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun view(): MemorySegment {
        val sel = ObjCRuntime.sel("view")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property effectContainerView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun effectContainerView(): MemorySegment {
        val sel = ObjCRuntime.sel("effectContainerView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEffectContainerView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setEffectContainerView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property decorationContainerView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun decorationContainerView(): MemorySegment {
        val sel = ObjCRuntime.sel("decorationContainerView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDecorationContainerView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDecorationContainerView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property state
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun state(): NSWritingToolsCoordinatorState {
        val sel = ObjCRuntime.sel("state")
        return NSWritingToolsCoordinatorState(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property preferredBehavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preferredBehavior(): NSWritingToolsBehavior {
        val sel = ObjCRuntime.sel("preferredBehavior")
        return NSWritingToolsBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreferredBehavior(value: NSWritingToolsBehavior) {
        val sel = ObjCRuntime.sel("setPreferredBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property behavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun behavior(): NSWritingToolsBehavior {
        val sel = ObjCRuntime.sel("behavior")
        return NSWritingToolsBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property preferredResultOptions
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preferredResultOptions(): NSWritingToolsResultOptions {
        val sel = ObjCRuntime.sel("preferredResultOptions")
        return NSWritingToolsResultOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreferredResultOptions(value: NSWritingToolsResultOptions) {
        val sel = ObjCRuntime.sel("setPreferredResultOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property resultOptions
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resultOptions(): NSWritingToolsResultOptions {
        val sel = ObjCRuntime.sel("resultOptions")
        return NSWritingToolsResultOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property includesTextListMarkers
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun includesTextListMarkers(): Boolean {
        val sel = ObjCRuntime.sel("includesTextListMarkers")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    open fun setIncludesTextListMarkers(value: Boolean) {
        val sel = ObjCRuntime.sel("setIncludesTextListMarkers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
