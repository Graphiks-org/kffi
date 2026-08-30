@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTextCheckingController
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSTextCheckingController(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTextCheckingController") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithClient(client: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithClient:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, client) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun invalidate(): Unit {
        val sel = ObjCRuntime.sel("invalidate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun didChangeTextInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("didChangeTextInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertedTextInRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("insertedTextInRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun didChangeSelectedRange(): Unit {
        val sel = ObjCRuntime.sel("didChangeSelectedRange")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun considerTextCheckingForRange(range: NSRange): Unit {
        val sel = ObjCRuntime.sel("considerTextCheckingForRange:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout))
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkTextInRange_types_options(range: NSRange, checkingTypes: Long, options: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("checkTextInRange:types:options:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout), checkingTypes, options)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkTextInSelection(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("checkTextInSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkTextInDocument(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("checkTextInDocument:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun orderFrontSubstitutionsPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("orderFrontSubstitutionsPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun checkSpelling(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("checkSpelling:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showGuessPanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("showGuessPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun changeSpelling(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("changeSpelling:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun ignoreSpelling(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("ignoreSpelling:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateCandidates(): Unit {
        val sel = ObjCRuntime.sel("updateCandidates")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    /** @return NSArray<NSAttributedStringKey> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun validAnnotations(): MemorySegment {
        val sel = ObjCRuntime.sel("validAnnotations")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun menuAtIndex_clickedOnSelection_effectiveRange(location: Long, clickedOnSelection: Boolean, effectiveRange: NSRangePointer): MemorySegment {
        val sel = ObjCRuntime.sel("menuAtIndex:clickedOnSelection:effectiveRange:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, location, clickedOnSelection, effectiveRange.segment) as MemorySegment
    }

    // @property client
    /** @return id<NSTextCheckingClient> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun client(): MemorySegment {
        val sel = ObjCRuntime.sel("client")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property spellCheckerDocumentTag
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun spellCheckerDocumentTag(): Long {
        val sel = ObjCRuntime.sel("spellCheckerDocumentTag")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSpellCheckerDocumentTag(value: Long) {
        val sel = ObjCRuntime.sel("setSpellCheckerDocumentTag:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
