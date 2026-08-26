package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSImageRep
 * Superclass: NSObject
 * Protocols: NSCopying, NSCoding
 */
open class NSImageRep(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSImageRep") }

        fun registerImageRepClass(imageRepClass: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("registerImageRepClass:")
            ObjCRuntime.msgSend(null, _class, sel, imageRepClass)
        }

        fun unregisterImageRepClass(imageRepClass: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("unregisterImageRepClass:")
            ObjCRuntime.msgSend(null, _class, sel, imageRepClass)
        }

        fun imageRepClassForFileType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForFileType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun imageRepClassForFileType(type: String): MemorySegment = imageRepClassForFileType(ObjCRuntime.newNSString(Arena.global(), type))

        fun imageRepClassForPasteboardType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForPasteboardType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        fun imageRepClassForType(type: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForType:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, type) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun imageRepClassForType(type: String): MemorySegment = imageRepClassForType(ObjCRuntime.newNSString(Arena.global(), type))

        fun imageRepClassForData(`data`: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepClassForData:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, `data`) as MemorySegment
        }

        fun canInitWithData(`data`: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canInitWithData:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, `data`) as Boolean
        }

        /** @return NSArray<NSString *> * */
        fun imageUnfilteredFileTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredFileTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSPasteboardType> * */
        fun imageUnfilteredPasteboardTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredPasteboardTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        fun imageFileTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageFileTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSPasteboardType> * */
        fun imagePasteboardTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imagePasteboardTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        fun canInitWithPasteboard(pasteboard: MemorySegment): Boolean {
            val sel = ObjCRuntime.sel("canInitWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel, pasteboard) as Boolean
        }

        /** @return NSArray<NSImageRep *> * */
        fun imageRepsWithContentsOfFile(filename: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithContentsOfFile:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, filename) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun imageRepsWithContentsOfFile(filename: String): MemorySegment = imageRepsWithContentsOfFile(ObjCRuntime.newNSString(Arena.global(), filename))

        fun imageRepWithContentsOfFile(filename: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithContentsOfFile:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, filename) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun imageRepWithContentsOfFile(filename: String): MemorySegment = imageRepWithContentsOfFile(ObjCRuntime.newNSString(Arena.global(), filename))

        /** @return NSArray<NSImageRep *> * */
        fun imageRepsWithContentsOfURL(url: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithContentsOfURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url) as MemorySegment
        }

        fun imageRepWithContentsOfURL(url: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithContentsOfURL:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, url) as MemorySegment
        }

        /** @return NSArray<NSImageRep *> * */
        fun imageRepsWithPasteboard(pasteboard: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepsWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pasteboard) as MemorySegment
        }

        fun imageRepWithPasteboard(pasteboard: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("imageRepWithPasteboard:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pasteboard) as MemorySegment
        }

        /** @return NSArray<Class> * */
        fun registeredImageRepClasses(): MemorySegment {
            val sel = ObjCRuntime.sel("registeredImageRepClasses")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        fun imageUnfilteredTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageUnfilteredTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSString *> * */
        fun imageTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("imageTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun draw(): Boolean {
        val sel = ObjCRuntime.sel("draw")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    open fun drawAtPoint(point: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("drawAtPoint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)) as Boolean
    }

    open fun drawInRect(rect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("drawInRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as Boolean
    }

    open fun drawInRect_fromRect_operation_fraction_respectFlipped_hints(dstSpacePortionRect: NSRect, srcSpacePortionRect: NSRect, op: NSCompositingOperation, requestedAlpha: Double, respectContextIsFlipped: Boolean, hints: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("drawInRect:fromRect:operation:fraction:respectFlipped:hints:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(dstSpacePortionRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(srcSpacePortionRect.segment, NSRect.layout), op.rawValue, requestedAlpha, respectContextIsFlipped, hints) as Boolean
    }

    open fun CGImageForProposedRect_context_hints(proposedDestRect: NSRectPointer, context: MemorySegment, hints: MemorySegment): CGImageRef {
        val sel = ObjCRuntime.sel("CGImageForProposedRect:context:hints:")
        return CGImageRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, proposedDestRect.segment, context, hints) as MemorySegment)
    }

    // @property size
    open fun size(): NSSize {
        val sel = ObjCRuntime.sel("size")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    open fun setSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property alpha
    open fun hasAlpha(): Boolean {
        val sel = ObjCRuntime.sel("hasAlpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setAlpha(value: Boolean) {
        val sel = ObjCRuntime.sel("setAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property opaque
    open fun isOpaque(): Boolean {
        val sel = ObjCRuntime.sel("isOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setOpaque(value: Boolean) {
        val sel = ObjCRuntime.sel("setOpaque:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorSpaceName
    open fun colorSpaceName(): MemorySegment {
        val sel = ObjCRuntime.sel("colorSpaceName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setColorSpaceName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setColorSpaceName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property bitsPerSample
    open fun bitsPerSample(): Long {
        val sel = ObjCRuntime.sel("bitsPerSample")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setBitsPerSample(value: Long) {
        val sel = ObjCRuntime.sel("setBitsPerSample:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pixelsWide
    open fun pixelsWide(): Long {
        val sel = ObjCRuntime.sel("pixelsWide")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setPixelsWide(value: Long) {
        val sel = ObjCRuntime.sel("setPixelsWide:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pixelsHigh
    open fun pixelsHigh(): Long {
        val sel = ObjCRuntime.sel("pixelsHigh")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setPixelsHigh(value: Long) {
        val sel = ObjCRuntime.sel("setPixelsHigh:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layoutDirection
    open fun layoutDirection(): NSImageLayoutDirection {
        val sel = ObjCRuntime.sel("layoutDirection")
        return NSImageLayoutDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
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
