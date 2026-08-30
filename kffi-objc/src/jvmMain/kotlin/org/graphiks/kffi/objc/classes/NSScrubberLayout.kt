@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSScrubberLayout
 * Superclass: NSObject
 * Protocols: NSCoding
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSScrubberLayout(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSScrubberLayout") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun layoutAttributesClass(): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAttributesClass")
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
    open fun invalidateLayout(): Unit {
        val sel = ObjCRuntime.sel("invalidateLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun prepareLayout(): Unit {
        val sel = ObjCRuntime.sel("prepareLayout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun layoutAttributesForItemAtIndex(index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesForItemAtIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, index) as MemorySegment
    }

    /** @return NSSet<__kindof NSScrubberLayoutAttributes *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun layoutAttributesForItemsInRect(rect: NSRect): MemorySegment {
        val sel = ObjCRuntime.sel("layoutAttributesForItemsInRect:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout)) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldInvalidateLayoutForChangeFromVisibleRect_toVisibleRect(fromVisibleRect: NSRect, toVisibleRect: NSRect): Boolean {
        val sel = ObjCRuntime.sel("shouldInvalidateLayoutForChangeFromVisibleRect:toVisibleRect:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(fromVisibleRect.segment, NSRect.layout), ObjCRuntime.ObjCStructArg(toVisibleRect.segment, NSRect.layout)) as Boolean
    }

    // @property scrubber
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrubber(): MemorySegment {
        val sel = ObjCRuntime.sel("scrubber")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property visibleRect
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun visibleRect(): NSRect {
        val sel = ObjCRuntime.sel("visibleRect")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property scrubberContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun scrubberContentSize(): NSSize {
        val sel = ObjCRuntime.sel("scrubberContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }

    // @property shouldInvalidateLayoutForSelectionChange
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldInvalidateLayoutForSelectionChange(): Boolean {
        val sel = ObjCRuntime.sel("shouldInvalidateLayoutForSelectionChange")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property shouldInvalidateLayoutForHighlightChange
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldInvalidateLayoutForHighlightChange(): Boolean {
        val sel = ObjCRuntime.sel("shouldInvalidateLayoutForHighlightChange")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property automaticallyMirrorsInRightToLeftLayout
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun automaticallyMirrorsInRightToLeftLayout(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyMirrorsInRightToLeftLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSScrubberLayout.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}
