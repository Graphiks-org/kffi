package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewLayoutAttributes
 * Superclass: NSObject
 * Protocols: NSCopying
 */
open class NSCollectionViewLayoutAttributes(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionViewLayoutAttributes") }

        fun layoutAttributesForItemWithIndexPath(indexPath: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesForItemWithIndexPath:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, indexPath) as MemorySegment
        }

        fun layoutAttributesForInterItemGapBeforeIndexPath(indexPath: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesForInterItemGapBeforeIndexPath:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, indexPath) as MemorySegment
        }

        fun layoutAttributesForSupplementaryViewOfKind_withIndexPath(elementKind: MemorySegment, indexPath: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesForSupplementaryViewOfKind:withIndexPath:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, elementKind, indexPath) as MemorySegment
        }

        fun layoutAttributesForDecorationViewOfKind_withIndexPath(decorationViewKind: MemorySegment, indexPath: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesForDecorationViewOfKind:withIndexPath:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, decorationViewKind, indexPath) as MemorySegment
        }

    }

    // @property frame
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setFrame(value: NSRect) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
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
    open fun alpha(): Double {
        val sel = ObjCRuntime.sel("alpha")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setAlpha(value: Double) {
        val sel = ObjCRuntime.sel("setAlpha:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property zIndex
    open fun zIndex(): Long {
        val sel = ObjCRuntime.sel("zIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setZIndex(value: Long) {
        val sel = ObjCRuntime.sel("setZIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidden
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setHidden(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidden:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property indexPath
    open fun indexPath(): MemorySegment {
        val sel = ObjCRuntime.sel("indexPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setIndexPath(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setIndexPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property representedElementCategory
    open fun representedElementCategory(): NSCollectionElementCategory {
        val sel = ObjCRuntime.sel("representedElementCategory")
        return NSCollectionElementCategory(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property representedElementKind
    open fun representedElementKind(): MemorySegment {
        val sel = ObjCRuntime.sel("representedElementKind")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun representedElementKindAsString(): String = ObjCRuntime.toJavaString(representedElementKind())

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionViewLayoutAttributes.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
