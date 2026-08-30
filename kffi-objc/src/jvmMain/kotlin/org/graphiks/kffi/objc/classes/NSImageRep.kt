@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImageRep
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSImageRep(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSImageRep") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun registerImageRepClass(imageRepClass: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("registerImageRepClass:")
            ObjCRuntime.msgSend(null, _class, sel, imageRepClass)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun unregisterImageRepClass(imageRepClass: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("unregisterImageRepClass:")
            ObjCRuntime.msgSend(null, _class, sel, imageRepClass)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageRepClassForType: instead")
        fun imageRepClassForFileType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForFileType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageRepClassForType: instead")
        fun imageRepClassForFileType(type: String): MemorySegment = imageRepClassForFileType(ObjCRuntime.newNSString(Arena.global(), type))

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageRepClassForType: instead")
        fun imageRepClassForPasteboardType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForPasteboardType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun imageRepClassForType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun imageRepClassForType(type: String): MemorySegment = imageRepClassForType(ObjCRuntime.newNSString(Arena.global(), type))

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepClassForData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun canInitWithData(`data`: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canInitWithData:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, `data`) as Boolean
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageUnfilteredTypes instead")
        fun imageUnfilteredFileTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredFileTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSPasteboardType> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageUnfilteredTypes instead")
        fun imageUnfilteredPasteboardTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredPasteboardTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageTypes instead")
        fun imageFileTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageFileTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSPasteboardType> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use +imageTypes instead")
        fun imagePasteboardTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imagePasteboardTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun canInitWithPasteboard(pasteboard: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canInitWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, pasteboard) as Boolean
        }

        /** @return NSArray<NSImageRep *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepsWithContentsOfFile(filename: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithContentsOfFile:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, filename) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepsWithContentsOfFile(filename: String): MemorySegment = imageRepsWithContentsOfFile(ObjCRuntime.newNSString(Arena.global(), filename))

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithContentsOfFile(filename: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithContentsOfFile:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, filename) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithContentsOfFile(filename: String): MemorySegment = imageRepWithContentsOfFile(ObjCRuntime.newNSString(Arena.global(), filename))

        /** @return NSArray<NSImageRep *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepsWithContentsOfURL(url: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithContentsOfURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithContentsOfURL(url: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithContentsOfURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url) as MemorySegment
        }

        /** @return NSArray<NSImageRep *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepsWithPasteboard(pasteboard: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pasteboard) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun imageRepWithPasteboard(pasteboard: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pasteboard) as MemorySegment
        }

        /** @return NSArray<Class> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun registeredImageRepClasses(): MemorySegment {
            val sel = ObjCRuntime.sel("registeredImageRepClasses")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun imageUnfilteredTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
        fun imageTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun draw(): Boolean {
        val sel = ObjCRuntime.sel("draw")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawAtPoint(point: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("drawAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun drawInRect(rect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("drawInRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun drawInRect_fromRect_operation_fraction_respectFlipped_hints(dstSpacePortionRect: NSRect, srcSpacePortionRect: NSRect, op: NSCompositingOperation, requestedAlpha: Double, respectContextIsFlipped: Boolean, hints: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("drawInRect:fromRect:operation:fraction:respectFlipped:hints:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(dstSpacePortionRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(srcSpacePortionRect.segment, NSRect.layout), op.rawValue, requestedAlpha, respectContextIsFlipped, hints) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun CGImageForProposedRect_context_hints(proposedDestRect: NSRectPointer, context: MemorySegment, hints: MemorySegment): CGImageRef {
        val sel = ObjCRuntime.sel("CGImageForProposedRect:context:hints:")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, proposedDestRect.segment, context, hints) as MemorySegment)
    }

    // @property size
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun size(): NSSize {
        val sel = ObjCRuntime.sel("size")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property alpha
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hasAlpha(): Boolean {
        val sel = ObjCRuntime.sel("hasAlpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlpha(value: Boolean) {
        val sel = ObjCRuntime.sel("setAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOpaque(value: Boolean) {
        val sel = ObjCRuntime.sel("setOpaque:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorSpaceName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun colorSpaceName(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpaceName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setColorSpaceName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColorSpaceName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bitsPerSample
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bitsPerSample(): Long {
        val sel = ObjCRuntime.sel("bitsPerSample")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBitsPerSample(value: Long) {
        val sel = ObjCRuntime.sel("setBitsPerSample:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pixelsWide
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pixelsWide(): Long {
        val sel = ObjCRuntime.sel("pixelsWide")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPixelsWide(value: Long) {
        val sel = ObjCRuntime.sel("setPixelsWide:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pixelsHigh
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pixelsHigh(): Long {
        val sel = ObjCRuntime.sel("pixelsHigh")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPixelsHigh(value: Long) {
        val sel = ObjCRuntime.sel("setPixelsHigh:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layoutDirection
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun layoutDirection(): NSImageLayoutDirection {
        val sel = ObjCRuntime.sel("layoutDirection")
        return NSImageLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setLayoutDirection(value: NSImageLayoutDirection) {
        val sel = ObjCRuntime.sel("setLayoutDirection:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSImageRep.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}

/** Required by Objective-C protocol NSCoding. */
fun NSImageRep.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}
