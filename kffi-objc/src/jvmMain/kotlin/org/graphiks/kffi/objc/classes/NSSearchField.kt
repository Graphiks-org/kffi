package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSearchField
 * Superclass: NSTextField
 */
open class NSSearchField(override val ptr: MemorySegment) : NSTextField(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSearchField") }

    }

    // @property searchTextBounds
    open fun searchTextBounds(): NSRect {
        val sel = ObjCRuntime.sel("searchTextBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property searchButtonBounds
    open fun searchButtonBounds(): NSRect {
        val sel = ObjCRuntime.sel("searchButtonBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property cancelButtonBounds
    open fun cancelButtonBounds(): NSRect {
        val sel = ObjCRuntime.sel("cancelButtonBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property recentSearches
    /** @return NSArray<NSString *> * */
    open fun recentSearches(): MemorySegment {
        val sel = ObjCRuntime.sel("recentSearches")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setRecentSearches(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRecentSearches:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property recentsAutosaveName
    open fun recentsAutosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("recentsAutosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setRecentsAutosaveName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRecentsAutosaveName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property searchMenuTemplate
    open fun searchMenuTemplate(): MemorySegment {
        val sel = ObjCRuntime.sel("searchMenuTemplate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setSearchMenuTemplate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSearchMenuTemplate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sendsWholeSearchString
    open fun sendsWholeSearchString(): Boolean {
        val sel = ObjCRuntime.sel("sendsWholeSearchString")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSendsWholeSearchString(value: Boolean) {
        val sel = ObjCRuntime.sel("setSendsWholeSearchString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumRecents
    open fun maximumRecents(): Long {
        val sel = ObjCRuntime.sel("maximumRecents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    open fun setMaximumRecents(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumRecents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sendsSearchStringImmediately
    open fun sendsSearchStringImmediately(): Boolean {
        val sel = ObjCRuntime.sel("sendsSearchStringImmediately")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setSendsSearchStringImmediately(value: Boolean) {
        val sel = ObjCRuntime.sel("setSendsSearchStringImmediately:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSSearchFieldDelegate> */
    override fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    override fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSSearchField_Deprecated on NSSearchField ─────────────────────────────────────────

fun NSSearchField.rectForSearchTextWhenCentered(isCentered: Boolean): NSRect {
    val sel = ObjCRuntime.sel("rectForSearchTextWhenCentered:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, isCentered))
}

fun NSSearchField.rectForSearchButtonWhenCentered(isCentered: Boolean): NSRect {
    val sel = ObjCRuntime.sel("rectForSearchButtonWhenCentered:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, isCentered))
}

fun NSSearchField.rectForCancelButtonWhenCentered(isCentered: Boolean): NSRect {
    val sel = ObjCRuntime.sel("rectForCancelButtonWhenCentered:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, isCentered))
}

fun NSSearchField.centersPlaceholder(): Boolean {
    val sel = ObjCRuntime.sel("centersPlaceholder")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

fun NSSearchField.setCentersPlaceholder(centersPlaceholder: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCentersPlaceholder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, centersPlaceholder)
}
