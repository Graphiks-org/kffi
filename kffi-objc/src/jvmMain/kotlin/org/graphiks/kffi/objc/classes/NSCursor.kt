@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCursor
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
open class NSCursor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCursor") } }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun hide(): Unit {
            val sel = ObjCRuntime.sel("hide")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun unhide(): Unit {
            val sel = ObjCRuntime.sel("unhide")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun setHiddenUntilMouseMoves(flag: Boolean): Unit {
            val sel = ObjCRuntime.sel("setHiddenUntilMouseMoves:")
            ObjCRuntime.msgSend(null, _class, sel, flag)
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun pop(): Unit {
            val sel = ObjCRuntime.sel("pop")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun columnResizeCursorInDirections(directions: NSHorizontalDirections): MemorySegment {
            val sel = ObjCRuntime.sel("columnResizeCursorInDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, directions.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun rowResizeCursorInDirections(directions: NSVerticalDirections): MemorySegment {
            val sel = ObjCRuntime.sel("rowResizeCursorInDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, directions.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun frameResizeCursorFromPosition_inDirections(position: NSCursorFrameResizePosition, directions: NSCursorFrameResizeDirections): MemorySegment {
            val sel = ObjCRuntime.sel("frameResizeCursorFromPosition:inDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, position.rawValue, directions.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun currentCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("currentCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun arrowCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("arrowCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun crosshairCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("crosshairCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun disappearingItemCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("disappearingItemCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun operationNotAllowedCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("operationNotAllowedCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun dragLinkCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("dragLinkCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun dragCopyCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("dragCopyCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
        fun contextualMenuCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("contextualMenuCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun pointingHandCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("pointingHandCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun closedHandCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("closedHandCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun openHandCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("openHandCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
        fun IBeamCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("IBeamCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        fun IBeamCursorForVerticalLayout(): MemorySegment {
            val sel = ObjCRuntime.sel("IBeamCursorForVerticalLayout")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun zoomInCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("zoomInCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun zoomOutCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("zoomOutCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun columnResizeCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("columnResizeCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun rowResizeCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("rowResizeCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithImage_hotSpot(newImage: MemorySegment, point: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("initWithImage:hotSpot:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newImage, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun pop(): Unit {
        val sel = ObjCRuntime.sel("pop")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun push(): Unit {
        val sel = ObjCRuntime.sel("push")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun `set`(): Unit {
        val sel = ObjCRuntime.sel("set")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property image
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hotSpot
    @PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    open fun hotSpot(): NSPoint {
        val sel = ObjCRuntime.sel("hotSpot")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSCursor.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSCursor_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: Deprecated on NSCursor ─────────────────────────────────────────

// Class method: +[NSCursor currentSystemCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "No longer recommended. Use ScreenCaptureKit to capture the screen. Use the `showsCursor` property on `SCStreamConfiguration` to control whether or not to include the cursor in the capture. Or, use `NSCursor.currentCursor` if needing to just get the current cursor for this application.")
fun NSCursor_currentSystemCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("currentSystemCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeLeftCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use either `+[NSCursor columnResizeCursorInDirections:]` or `+[NSCursor frameResizeCursorFromPosition:inDirections:]` instead, depending on whether a divider is being re-positioned or a rectangular frame is being resized.")
fun NSCursor_resizeLeftCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeLeftCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeRightCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use either `+[NSCursor columnResizeCursorInDirections:]` or `+[NSCursor frameResizeCursorFromPosition:inDirections:]` instead, depending on whether a divider is being re-positioned or a rectangular frame is being resized.")
fun NSCursor_resizeRightCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeRightCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeLeftRightCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use either `+[NSCursor columnResizeCursorInDirections:]` or `+[NSCursor frameResizeCursorFromPosition:inDirections:]` instead, depending on whether a divider is being re-positioned or a rectangular frame is being resized.")
fun NSCursor_resizeLeftRightCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeLeftRightCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeUpCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use either `+[NSCursor rowResizeCursorInDirections:]` or `+[NSCursor frameResizeCursorFromPosition:inDirections:]` instead, depending on whether a divider is being re-positioned or a rectangular frame is being resized.")
fun NSCursor_resizeUpCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeUpCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeDownCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use either `+[NSCursor rowResizeCursorInDirections:]` or `+[NSCursor frameResizeCursorFromPosition:inDirections:]` instead, depending on whether a divider is being re-positioned or a rectangular frame is being resized.")
fun NSCursor_resizeDownCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeDownCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeUpDownCursor]
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1, message = "Use either `+[NSCursor rowResizeCursorInDirections:]` or `+[NSCursor frameResizeCursorFromPosition:inDirections:]` instead, depending on whether a divider is being re-positioned or a rectangular frame is being resized.")
fun NSCursor_resizeUpDownCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeUpDownCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSDeprecated on NSCursor ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 12, deprecatedSubminor = -1, message = "Color hints are ignored. Use -initWithImage:hotSpot: instead")
fun NSCursor.initWithImage_foregroundColorHint_backgroundColorHint_hotSpot(newImage: MemorySegment, fg: MemorySegment, bg: MemorySegment, hotSpot: NSPoint): MemorySegment {
    val sel = ObjCRuntime.sel("initWithImage:foregroundColorHint:backgroundColorHint:hotSpot:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, newImage, fg, bg, ObjCRuntime.ObjCStructArg(hotSpot.segment, NSPoint.layout)) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "setOnMouseExited is unused and should not be called")
fun NSCursor.setOnMouseExited(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setOnMouseExited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "setOnMouseEntered is unused and should not be called")
fun NSCursor.setOnMouseEntered(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setOnMouseEntered:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "mouseEntered: is unused and should not be called")
fun NSCursor.mouseEntered(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseEntered:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "mouseExited: is unused and should not be called")
fun NSCursor.mouseExited(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseExited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "isSetOnMouseExited is unused")
fun NSCursor.isSetOnMouseExited(): Boolean {
    val sel = ObjCRuntime.sel("isSetOnMouseExited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "isSetOnMouseEntered is unused")
fun NSCursor.isSetOnMouseEntered(): Boolean {
    val sel = ObjCRuntime.sel("isSetOnMouseEntered")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
