@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSearchField
 * Superclass: NSTextField
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSSearchField(override val ptr: MemorySegment) : NSTextField(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSSearchField") }

    }

    // @property searchTextBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun searchTextBounds(): NSRect {
        val sel = ObjCRuntime.sel("searchTextBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property searchButtonBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun searchButtonBounds(): NSRect {
        val sel = ObjCRuntime.sel("searchButtonBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property cancelButtonBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
    open fun cancelButtonBounds(): NSRect {
        val sel = ObjCRuntime.sel("cancelButtonBounds")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property recentSearches
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun recentSearches(): MemorySegment {
        val sel = ObjCRuntime.sel("recentSearches")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRecentSearches(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRecentSearches:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property recentsAutosaveName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun recentsAutosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("recentsAutosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRecentsAutosaveName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRecentsAutosaveName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property searchMenuTemplate
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun searchMenuTemplate(): MemorySegment {
        val sel = ObjCRuntime.sel("searchMenuTemplate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setSearchMenuTemplate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSearchMenuTemplate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sendsWholeSearchString
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun sendsWholeSearchString(): Boolean {
        val sel = ObjCRuntime.sel("sendsWholeSearchString")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setSendsWholeSearchString(value: Boolean) {
        val sel = ObjCRuntime.sel("setSendsWholeSearchString:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property maximumRecents
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun maximumRecents(): Long {
        val sel = ObjCRuntime.sel("maximumRecents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setMaximumRecents(value: Long) {
        val sel = ObjCRuntime.sel("setMaximumRecents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sendsSearchStringImmediately
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun sendsSearchStringImmediately(): Boolean {
        val sel = ObjCRuntime.sel("sendsSearchStringImmediately")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setSendsSearchStringImmediately(value: Boolean) {
        val sel = ObjCRuntime.sel("setSendsSearchStringImmediately:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSSearchFieldDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    override fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    override fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSSearchField_Deprecated on NSSearchField ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSSearchField.rectForSearchTextWhenCentered(isCentered: Boolean): NSRect {
    val sel = ObjCRuntime.sel("rectForSearchTextWhenCentered:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, isCentered))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSSearchField.rectForSearchButtonWhenCentered(isCentered: Boolean): NSRect {
    val sel = ObjCRuntime.sel("rectForSearchButtonWhenCentered:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, isCentered))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1)
fun NSSearchField.rectForCancelButtonWhenCentered(isCentered: Boolean): NSRect {
    val sel = ObjCRuntime.sel("rectForCancelButtonWhenCentered:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, isCentered))
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The placeholder centering UI design is no longer available. Setting this property is no-op.")
fun NSSearchField.centersPlaceholder(): Boolean {
    val sel = ObjCRuntime.sel("centersPlaceholder")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1, deprecated = true, deprecatedMajor = 12, deprecatedMinor = 0, deprecatedSubminor = -1, message = "The placeholder centering UI design is no longer available. Setting this property is no-op.")
fun NSSearchField.setCentersPlaceholder(centersPlaceholder: Boolean): Unit {
    val sel = ObjCRuntime.sel("setCentersPlaceholder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, centersPlaceholder)
}
