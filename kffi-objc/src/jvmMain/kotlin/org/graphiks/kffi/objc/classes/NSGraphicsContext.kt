@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSGraphicsContext
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSGraphicsContext(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSGraphicsContext") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun graphicsContextWithAttributes(attributes: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("graphicsContextWithAttributes:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, attributes) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun graphicsContextWithBitmapImageRep(bitmapRep: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("graphicsContextWithBitmapImageRep:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, bitmapRep) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun graphicsContextWithCGContext_flipped(graphicsPort: CGContextRef, initialFlippedState: Boolean): MemorySegment {
            val sel = ObjCRuntime.sel("graphicsContextWithCGContext:flipped:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, graphicsPort.segment, initialFlippedState) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentContextDrawingToScreen(): Boolean {
            val sel = ObjCRuntime.sel("currentContextDrawingToScreen")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun saveGraphicsState(): Unit {
            val sel = ObjCRuntime.sel("saveGraphicsState")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun restoreGraphicsState(): Unit {
            val sel = ObjCRuntime.sel("restoreGraphicsState")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentContext(): MemorySegment {
            val sel = ObjCRuntime.sel("currentContext")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setCurrentContext(currentContext: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("setCurrentContext:")
            ObjCRuntime.msgSend(null, _class, sel, currentContext)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun saveGraphicsState(): Unit {
        val sel = ObjCRuntime.sel("saveGraphicsState")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun restoreGraphicsState(): Unit {
        val sel = ObjCRuntime.sel("restoreGraphicsState")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun flushGraphics(): Unit {
        val sel = ObjCRuntime.sel("flushGraphics")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property attributes
    /** @return NSDictionary<NSGraphicsContextAttributeKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun attributes(): MemorySegment {
        val sel = ObjCRuntime.sel("attributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property drawingToScreen
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isDrawingToScreen(): Boolean {
        val sel = ObjCRuntime.sel("isDrawingToScreen")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property CGContext
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun CGContext(): CGContextRef {
        val sel = ObjCRuntime.sel("CGContext")
        return CGContextRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }

    // @property flipped
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFlipped(): Boolean {
        val sel = ObjCRuntime.sel("isFlipped")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

// ── Category: NSGraphicsContext_RenderingOptions on NSGraphicsContext ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.shouldAntialias(): Boolean {
    val sel = ObjCRuntime.sel("shouldAntialias")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.setShouldAntialias(shouldAntialias: Boolean): Unit {
    val sel = ObjCRuntime.sel("setShouldAntialias:")
    ObjCRuntime.msgSend(null, this.ptr, sel, shouldAntialias)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.imageInterpolation(): NSImageInterpolation {
    val sel = ObjCRuntime.sel("imageInterpolation")
    return NSImageInterpolation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.setImageInterpolation(imageInterpolation: NSImageInterpolation): Unit {
    val sel = ObjCRuntime.sel("setImageInterpolation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, imageInterpolation.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.patternPhase(): NSPoint {
    val sel = ObjCRuntime.sel("patternPhase")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.setPatternPhase(patternPhase: NSPoint): Unit {
    val sel = ObjCRuntime.sel("setPatternPhase:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(patternPhase.segment, NSPoint.layout))
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.compositingOperation(): NSCompositingOperation {
    val sel = ObjCRuntime.sel("compositingOperation")
    return NSCompositingOperation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.setCompositingOperation(compositingOperation: NSCompositingOperation): Unit {
    val sel = ObjCRuntime.sel("setCompositingOperation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, compositingOperation.rawValue)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSGraphicsContext.colorRenderingIntent(): NSColorRenderingIntent {
    val sel = ObjCRuntime.sel("colorRenderingIntent")
    return NSColorRenderingIntent(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
fun NSGraphicsContext.setColorRenderingIntent(colorRenderingIntent: NSColorRenderingIntent): Unit {
    val sel = ObjCRuntime.sel("setColorRenderingIntent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, colorRenderingIntent.rawValue)
}

// ── Category: NSQuartzCoreAdditions on NSGraphicsContext ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
fun NSGraphicsContext.CIContext(): MemorySegment {
    val sel = ObjCRuntime.sel("CIContext")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSGraphicsContextDeprecated on NSGraphicsContext ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSGraphicsContext.focusStack(): MemorySegment {
    val sel = ObjCRuntime.sel("focusStack")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSGraphicsContext.setFocusStack(stack: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setFocusStack:")
    ObjCRuntime.msgSend(null, this.ptr, sel, stack)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
fun NSGraphicsContext.graphicsPort(): MemorySegment {
    val sel = ObjCRuntime.sel("graphicsPort")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// Class method: +[NSGraphicsContext setGraphicsState:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "This method has no effect")
fun NSGraphicsContext_setGraphicsState(gState: Long): Unit {
    val sel = ObjCRuntime.sel("setGraphicsState:")
    val cls = ObjCRuntime.getClass("NSGraphicsContext")
    ObjCRuntime.msgSend(null, cls, sel, gState)
}

// Class method: +[NSGraphicsContext graphicsContextWithGraphicsPort:flipped:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1)
fun NSGraphicsContext_graphicsContextWithGraphicsPort_flipped(graphicsPort: MemorySegment, initialFlippedState: Boolean): MemorySegment {
    val sel = ObjCRuntime.sel("graphicsContextWithGraphicsPort:flipped:")
    val cls = ObjCRuntime.getClass("NSGraphicsContext")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, graphicsPort, initialFlippedState) as MemorySegment
}

// Class method: +[NSGraphicsContext graphicsContextWithWindow:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Add instances of NSView to display content in a window")
fun NSGraphicsContext_graphicsContextWithWindow(window: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("graphicsContextWithWindow:")
    val cls = ObjCRuntime.getClass("NSGraphicsContext")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, window) as MemorySegment
}
