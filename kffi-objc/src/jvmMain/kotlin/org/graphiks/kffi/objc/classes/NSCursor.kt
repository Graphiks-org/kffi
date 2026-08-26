package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCursor
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
open class NSCursor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCursor") }

        fun hide(): Unit {
            val sel = ObjCRuntime.sel("hide")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        fun unhide(): Unit {
            val sel = ObjCRuntime.sel("unhide")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        fun setHiddenUntilMouseMoves(flag: Boolean): Unit {
            val sel = ObjCRuntime.sel("setHiddenUntilMouseMoves:")
            ObjCRuntime.msgSend(null, _class, sel, flag)
        }

        fun pop(): Unit {
            val sel = ObjCRuntime.sel("pop")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        fun columnResizeCursorInDirections(directions: NSHorizontalDirections): MemorySegment {
            val sel = ObjCRuntime.sel("columnResizeCursorInDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, directions.rawValue) as MemorySegment
        }

        fun rowResizeCursorInDirections(directions: NSVerticalDirections): MemorySegment {
            val sel = ObjCRuntime.sel("rowResizeCursorInDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, directions.rawValue) as MemorySegment
        }

        fun frameResizeCursorFromPosition_inDirections(position: NSCursorFrameResizePosition, directions: NSCursorFrameResizeDirections): MemorySegment {
            val sel = ObjCRuntime.sel("frameResizeCursorFromPosition:inDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, position.rawValue, directions.rawValue) as MemorySegment
        }

        fun currentCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("currentCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun arrowCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("arrowCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun crosshairCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("crosshairCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun disappearingItemCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("disappearingItemCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun operationNotAllowedCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("operationNotAllowedCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun dragLinkCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("dragLinkCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun dragCopyCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("dragCopyCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun contextualMenuCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("contextualMenuCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun pointingHandCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("pointingHandCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun closedHandCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("closedHandCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun openHandCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("openHandCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun IBeamCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("IBeamCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun IBeamCursorForVerticalLayout(): MemorySegment {
            val sel = ObjCRuntime.sel("IBeamCursorForVerticalLayout")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun zoomInCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("zoomInCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun zoomOutCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("zoomOutCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun columnResizeCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("columnResizeCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun rowResizeCursor(): MemorySegment {
            val sel = ObjCRuntime.sel("rowResizeCursor")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun initWithImage_hotSpot(newImage: MemorySegment, point: NSPoint): MemorySegment {
        val sel = ObjCRuntime.sel("initWithImage:hotSpot:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newImage, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun pop(): Unit {
        val sel = ObjCRuntime.sel("pop")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun push(): Unit {
        val sel = ObjCRuntime.sel("push")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun `set`(): Unit {
        val sel = ObjCRuntime.sel("set")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property image
    open fun image(): MemorySegment {
        val sel = ObjCRuntime.sel("image")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hotSpot
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
fun NSCursor_currentSystemCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("currentSystemCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeLeftCursor]
fun NSCursor_resizeLeftCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeLeftCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeRightCursor]
fun NSCursor_resizeRightCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeRightCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeLeftRightCursor]
fun NSCursor_resizeLeftRightCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeLeftRightCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeUpCursor]
fun NSCursor_resizeUpCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeUpCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeDownCursor]
fun NSCursor_resizeDownCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeDownCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// Class method: +[NSCursor resizeUpDownCursor]
fun NSCursor_resizeUpDownCursor(): MemorySegment {
    val sel = ObjCRuntime.sel("resizeUpDownCursor")
    val cls = ObjCRuntime.getClass("NSCursor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel) as MemorySegment
}

// ── Category: NSDeprecated on NSCursor ─────────────────────────────────────────

fun NSCursor.initWithImage_foregroundColorHint_backgroundColorHint_hotSpot(newImage: MemorySegment, fg: MemorySegment, bg: MemorySegment, hotSpot: NSPoint): MemorySegment {
    val sel = ObjCRuntime.sel("initWithImage:foregroundColorHint:backgroundColorHint:hotSpot:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, newImage, fg, bg, ObjCRuntime.ObjCStructArg(hotSpot.segment, NSPoint.layout)) as MemorySegment
}

fun NSCursor.setOnMouseExited(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setOnMouseExited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

fun NSCursor.setOnMouseEntered(flag: Boolean): Unit {
    val sel = ObjCRuntime.sel("setOnMouseEntered:")
    ObjCRuntime.msgSend(null, this.ptr, sel, flag)
}

fun NSCursor.mouseEntered(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseEntered:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

fun NSCursor.mouseExited(event: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("mouseExited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, event)
}

fun NSCursor.isSetOnMouseExited(): Boolean {
    val sel = ObjCRuntime.sel("isSetOnMouseExited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSCursor.isSetOnMouseEntered(): Boolean {
    val sel = ObjCRuntime.sel("isSetOnMouseEntered")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
