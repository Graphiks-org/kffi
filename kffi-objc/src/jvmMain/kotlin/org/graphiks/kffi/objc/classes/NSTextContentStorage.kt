package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextContentStorage
 * Superclass: NSTextContentManager
 * Protocols: NSTextStorageObserving
 */
open class NSTextContentStorage(override val ptr: MemorySegment) : NSTextContentManager(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextContentStorage") }

    }

    open fun attributedStringForTextElement(textElement: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("attributedStringForTextElement:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textElement) as MemorySegment
    }

    open fun textElementForAttributedString(attributedString: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("textElementForAttributedString:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, attributedString) as MemorySegment
    }

    /** @return id<NSTextLocation> */
    open fun locationFromLocation_withOffset(location: MemorySegment, offset: Long): MemorySegment {
        val sel = ObjCRuntime.sel("locationFromLocation:withOffset:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, location, offset) as MemorySegment
    }

    open fun offsetFromLocation_toLocation(from: MemorySegment, to: MemorySegment): Long {
        val sel = ObjCRuntime.sel("offsetFromLocation:toLocation:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, from, to) as Long
    }

    open fun adjustedRangeFromRange_forEditingTextSelection(textRange: MemorySegment, forEditingTextSelection: Boolean): MemorySegment {
        val sel = ObjCRuntime.sel("adjustedRangeFromRange:forEditingTextSelection:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, textRange, forEditingTextSelection) as MemorySegment
    }

    // @property delegate
    /** @return id<NSTextContentStorageDelegate> */
    override fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    override fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property includesTextListMarkers
    open fun includesTextListMarkers(): Boolean {
        val sel = ObjCRuntime.sel("includesTextListMarkers")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setIncludesTextListMarkers(value: Boolean) {
        val sel = ObjCRuntime.sel("setIncludesTextListMarkers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property attributedString
    open fun attributedString(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setAttributedString(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/**
 * Required by Objective-C protocol NSTextStorageObserving.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSTextContentStorage.textStorage(): MemorySegment {
    val sel = ObjCRuntime.sel("textStorage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSTextContentStorage.setTextStorage(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setTextStorage:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSTextStorageObserving. */
fun NSTextContentStorage.processEditingForTextStorage_edited_range_changeInLength_invalidatedRange(textStorage: MemorySegment, editMask: NSTextStorageEditActions, newCharRange: NSRange, delta: Long, invalidatedCharRange: NSRange): Unit {
    val sel = ObjCRuntime.sel("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textStorage, editMask.rawValue, ObjCRuntime.ObjCStructArg(newCharRange.segment, NSRange.layout), delta, ObjCRuntime.ObjCStructArg(invalidatedCharRange.segment, NSRange.layout))
}

/** Required by Objective-C protocol NSTextStorageObserving. */
fun NSTextContentStorage.performEditingTransactionForTextStorage_usingBlock(textStorage: MemorySegment, transaction: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performEditingTransactionForTextStorage:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, textStorage, transaction)
}
