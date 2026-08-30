@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCandidateListTouchBarItem
 * Superclass: NSTouchBarItem
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "maccatalyst", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = 2)
open class NSCandidateListTouchBarItem(override val ptr: MemorySegment) : NSTouchBarItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCandidateListTouchBarItem") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun updateWithInsertionPointVisibility(isVisible: Boolean): Unit {
        val sel = ObjCRuntime.sel("updateWithInsertionPointVisibility:")
        ObjCRuntime.msgSend(null, ptr, sel, isVisible)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setCandidates_forSelectedRange_inString(candidates: MemorySegment, selectedRange: NSRange, originalString: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setCandidates:forSelectedRange:inString:")
        ObjCRuntime.msgSend(null, ptr, sel, candidates, ObjCRuntime.ObjCStructArg(selectedRange.segment, NSRange.layout), originalString)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    fun setCandidates_forSelectedRange_inString(candidates: MemorySegment, selectedRange: NSRange, originalString: String): Unit = setCandidates_forSelectedRange_inString(candidates, selectedRange, ObjCRuntime.newNSString(Arena.global(), originalString))

    // @property client
    /** @return NSView<NSTextInputClient> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun client(): MemorySegment {
        val sel = ObjCRuntime.sel("client")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setClient(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setClient:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSCandidateListTouchBarItemDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property collapsed
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun isCollapsed(): Boolean {
        val sel = ObjCRuntime.sel("isCollapsed")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setCollapsed(value: Boolean) {
        val sel = ObjCRuntime.sel("setCollapsed:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsCollapsing
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun allowsCollapsing(): Boolean {
        val sel = ObjCRuntime.sel("allowsCollapsing")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setAllowsCollapsing(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsCollapsing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property candidateListVisible
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun isCandidateListVisible(): Boolean {
        val sel = ObjCRuntime.sel("isCandidateListVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property allowsTextInputContextCandidates
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsTextInputContextCandidates(): Boolean {
        val sel = ObjCRuntime.sel("allowsTextInputContextCandidates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsTextInputContextCandidates(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsTextInputContextCandidates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property attributedStringForCandidate
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun attributedStringForCandidate(): MemorySegment {
        val sel = ObjCRuntime.sel("attributedStringForCandidate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setAttributedStringForCandidate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAttributedStringForCandidate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property candidates
    /** @return NSArray<CandidateType> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun candidates(): MemorySegment {
        val sel = ObjCRuntime.sel("candidates")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property customizationLabel
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    override fun customizationLabel(): MemorySegment {
        val sel = ObjCRuntime.sel("customizationLabel")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    open fun setCustomizationLabel(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCustomizationLabel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
