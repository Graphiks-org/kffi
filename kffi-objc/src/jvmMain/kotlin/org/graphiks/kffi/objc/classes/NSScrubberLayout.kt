package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberLayout
 * Superclass: NSObject
 * Protocols: NSCoding
 */
open class NSScrubberLayout(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScrubberLayout") }

        fun layoutAttributesClass(): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesClass")
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

    open fun invalidateLayout(): Unit {
        val sel = ObjCRuntime.sel("invalidateLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun prepareLayout(): Unit {
        val sel = ObjCRuntime.sel("prepareLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun layoutAttributesForItemAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesForItemAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    /** @return NSSet<__kindof NSScrubberLayoutAttributes *> * */
    open fun layoutAttributesForItemsInRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesForItemsInRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    open fun shouldInvalidateLayoutForChangeFromVisibleRect_toVisibleRect(fromVisibleRect: NSRect, toVisibleRect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("shouldInvalidateLayoutForChangeFromVisibleRect:toVisibleRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(fromVisibleRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(toVisibleRect.segment, NSRect.layout)) as Boolean
    }

    // @property layoutAttributesClass
    open fun layoutAttributesClass(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesClass")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property scrubber
    open fun scrubber(): MemorySegment {
        val sel = ObjCRuntime.sel("scrubber")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property visibleRect
    open fun visibleRect(): NSRect {
        val sel = ObjCRuntime.sel("visibleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property scrubberContentSize
    open fun scrubberContentSize(): NSSize {
        val sel = ObjCRuntime.sel("scrubberContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

    // @property shouldInvalidateLayoutForSelectionChange
    open fun shouldInvalidateLayoutForSelectionChange(): Boolean {
        val sel = ObjCRuntime.sel("shouldInvalidateLayoutForSelectionChange")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property shouldInvalidateLayoutForHighlightChange
    open fun shouldInvalidateLayoutForHighlightChange(): Boolean {
        val sel = ObjCRuntime.sel("shouldInvalidateLayoutForHighlightChange")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property automaticallyMirrorsInRightToLeftLayout
    open fun automaticallyMirrorsInRightToLeftLayout(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyMirrorsInRightToLeftLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
