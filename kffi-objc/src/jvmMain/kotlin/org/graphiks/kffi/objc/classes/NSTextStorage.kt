package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextStorage
 * Superclass: NSMutableAttributedString
 * Protocols: NSSecureCoding
 */
open class NSTextStorage(override val ptr: MemorySegment) : NSMutableAttributedString(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextStorage") }

    }

    open fun addLayoutManager(aLayoutManager: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addLayoutManager:")
        ObjCRuntime.msgSend(null, ptr, sel, aLayoutManager)
    }

    open fun removeLayoutManager(aLayoutManager: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeLayoutManager:")
        ObjCRuntime.msgSend(null, ptr, sel, aLayoutManager)
    }

    open fun edited_range_changeInLength(editedMask: NSTextStorageEditActions, editedRange: NSRange, delta: Long): Unit {
        val sel = ObjCRuntime.sel("edited:range:changeInLength:")
        ObjCRuntime.msgSend(null, ptr, sel, editedMask.rawValue, ObjCRuntime.ObjCStructArg(editedRange.segment, NSRange.layout), delta)
    }

    open fun processEditing(): Unit {
        val sel = ObjCRuntime.sel("processEditing")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    open fun invalidateAttributesInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("invalidateAttributesInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    open fun ensureAttributesAreFixedInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("ensureAttributesAreFixedInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    // @property layoutManagers
    /** @return NSArray<NSLayoutManager *> * */
    open fun layoutManagers(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutManagers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property editedMask
    open fun editedMask(): NSTextStorageEditActions {
        val sel = ObjCRuntime.sel("editedMask")
        return NSTextStorageEditActions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property editedRange
    open fun editedRange(): NSRange {
        val sel = ObjCRuntime.sel("editedRange")
        return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, ptr, sel))
    }

    // @property changeInLength
    open fun changeInLength(): Long {
        val sel = ObjCRuntime.sel("changeInLength")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property delegate
    /** @return id<NSTextStorageDelegate> */
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property fixesAttributesLazily
    open fun fixesAttributesLazily(): Boolean {
        val sel = ObjCRuntime.sel("fixesAttributesLazily")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property textStorageObserver
    /** @return id<NSTextStorageObserving> */
    open fun textStorageObserver(): MemorySegment {
        val sel = ObjCRuntime.sel("textStorageObserver")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setTextStorageObserver(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setTextStorageObserver:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/**
 * Required by Objective-C protocol NSSecureCoding.
 */
fun NSTextStorage_supportsSecureCoding(): Boolean {
    val sel = ObjCRuntime.sel("supportsSecureCoding")
    val cls = ObjCRuntime.getClass("NSTextStorage")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, cls, sel) as Boolean
}

// ── Category: Scripting on NSTextStorage ─────────────────────────────────────────

/** @return NSArray<NSTextStorage *> * */
fun NSTextStorage.attributeRuns(): MemorySegment {
    val sel = ObjCRuntime.sel("attributeRuns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextStorage.setAttributeRuns(attributeRuns: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributeRuns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributeRuns)
}

/** @return NSArray<NSTextStorage *> * */
fun NSTextStorage.paragraphs(): MemorySegment {
    val sel = ObjCRuntime.sel("paragraphs")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextStorage.setParagraphs(paragraphs: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setParagraphs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, paragraphs)
}

/** @return NSArray<NSTextStorage *> * */
fun NSTextStorage.words(): MemorySegment {
    val sel = ObjCRuntime.sel("words")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextStorage.setWords(words: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setWords:")
    ObjCRuntime.msgSend(null, this.ptr, sel, words)
}

/** @return NSArray<NSTextStorage *> * */
fun NSTextStorage.characters(): MemorySegment {
    val sel = ObjCRuntime.sel("characters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextStorage.setCharacters(characters: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, characters)
}

fun NSTextStorage.font(): MemorySegment {
    val sel = ObjCRuntime.sel("font")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextStorage.setFont(font: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setFont:")
    ObjCRuntime.msgSend(null, this.ptr, sel, font)
}

fun NSTextStorage.foregroundColor(): MemorySegment {
    val sel = ObjCRuntime.sel("foregroundColor")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

fun NSTextStorage.setForegroundColor(foregroundColor: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setForegroundColor:")
    ObjCRuntime.msgSend(null, this.ptr, sel, foregroundColor)
}
