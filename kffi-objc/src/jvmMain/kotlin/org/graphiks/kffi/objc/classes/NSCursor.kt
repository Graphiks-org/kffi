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

        fun columnResizeCursorInDirections(directions: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("columnResizeCursorInDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, directions) as MemorySegment
        }

        fun rowResizeCursorInDirections(directions: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("rowResizeCursorInDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, directions) as MemorySegment
        }

        fun frameResizeCursorFromPosition_inDirections(position: MemorySegment, directions: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("frameResizeCursorFromPosition:inDirections:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, position, directions) as MemorySegment
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

    open fun initWithImage_hotSpot(newImage: MemorySegment, point: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithImage:hotSpot:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, newImage, ObjCRuntime.ObjCStructArg(point, MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"))) as MemorySegment
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
    open fun hotSpot(): MemorySegment {
        val sel = ObjCRuntime.sel("hotSpot")
        return ObjCRuntime.msgSendStret(MemoryLayout.structLayout(ValueLayout.JAVA_DOUBLE.withName("x"), ValueLayout.JAVA_DOUBLE.withName("y")).withName("CGPoint"), ptr, sel) as MemorySegment
    }

    // @property currentCursor
    open fun currentCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("currentCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property arrowCursor
    open fun arrowCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("arrowCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property crosshairCursor
    open fun crosshairCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("crosshairCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property disappearingItemCursor
    open fun disappearingItemCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("disappearingItemCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property operationNotAllowedCursor
    open fun operationNotAllowedCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("operationNotAllowedCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property dragLinkCursor
    open fun dragLinkCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("dragLinkCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property dragCopyCursor
    open fun dragCopyCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("dragCopyCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property contextualMenuCursor
    open fun contextualMenuCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("contextualMenuCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property pointingHandCursor
    open fun pointingHandCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("pointingHandCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property closedHandCursor
    open fun closedHandCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("closedHandCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property openHandCursor
    open fun openHandCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("openHandCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property IBeamCursor
    open fun IBeamCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("IBeamCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property IBeamCursorForVerticalLayout
    open fun IBeamCursorForVerticalLayout(): MemorySegment {
        val sel = ObjCRuntime.sel("IBeamCursorForVerticalLayout")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property zoomInCursor
    open fun zoomInCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("zoomInCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property zoomOutCursor
    open fun zoomOutCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("zoomOutCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property columnResizeCursor
    open fun columnResizeCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("columnResizeCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rowResizeCursor
    open fun rowResizeCursor(): MemorySegment {
        val sel = ObjCRuntime.sel("rowResizeCursor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
