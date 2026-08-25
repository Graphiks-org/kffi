package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextSelection
 * Superclass: NSObject
 * Protocols: NSSecureCoding
 */
open class NSTextSelection(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextSelection") }

    }

    open fun initWithRanges_affinity_granularity(textRanges: MemorySegment, affinity: NSTextSelectionAffinity, granularity: NSTextSelectionGranularity): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRanges:affinity:granularity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textRanges, affinity.rawValue, granularity.rawValue) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    open fun initWithRange_affinity_granularity(range: MemorySegment, affinity: NSTextSelectionAffinity, granularity: NSTextSelectionGranularity): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRange:affinity:granularity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, range, affinity.rawValue, granularity.rawValue) as MemorySegment
    }

    open fun initWithLocation_affinity(location: MemorySegment, affinity: NSTextSelectionAffinity): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLocation:affinity:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, location, affinity.rawValue) as MemorySegment
    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun textSelectionWithTextRanges(textRanges: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("textSelectionWithTextRanges:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textRanges) as MemorySegment
    }

    // @property textRanges
    /** @return NSArray<NSTextRange *> * */
    open fun textRanges(): MemorySegment {
        val sel = ObjCRuntime.sel("textRanges")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property granularity
    open fun granularity(): NSTextSelectionGranularity {
        val sel = ObjCRuntime.sel("granularity")
        return NSTextSelectionGranularity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property affinity
    open fun affinity(): NSTextSelectionAffinity {
        val sel = ObjCRuntime.sel("affinity")
        return NSTextSelectionAffinity(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property transient
    open fun isTransient(): Boolean {
        val sel = ObjCRuntime.sel("isTransient")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property anchorPositionOffset
    open fun anchorPositionOffset(): Double {
        val sel = ObjCRuntime.sel("anchorPositionOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    open fun setAnchorPositionOffset(value: Double) {
        val sel = ObjCRuntime.sel("setAnchorPositionOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property logical
    open fun isLogical(): Boolean {
        val sel = ObjCRuntime.sel("isLogical")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setLogical(value: Boolean) {
        val sel = ObjCRuntime.sel("setLogical:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property secondarySelectionLocation
    /** @return id<NSTextLocation> */
    open fun secondarySelectionLocation(): MemorySegment {
        val sel = ObjCRuntime.sel("secondarySelectionLocation")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setSecondarySelectionLocation(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSecondarySelectionLocation:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property typingAttributes
    /** @return NSDictionary<NSAttributedStringKey,id> * */
    open fun typingAttributes(): MemorySegment {
        val sel = ObjCRuntime.sel("typingAttributes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTypingAttributes(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTypingAttributes:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
