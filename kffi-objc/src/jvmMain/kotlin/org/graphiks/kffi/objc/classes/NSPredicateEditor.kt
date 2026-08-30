@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPredicateEditor
 * Superclass: NSRuleEditor
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSPredicateEditor(override val ptr: MemorySegment) : NSRuleEditor(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSPredicateEditor") }

    }

    // @property rowTemplates
    /** @return NSArray<NSPredicateEditorRowTemplate *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowTemplates(): MemorySegment {
        val sel = ObjCRuntime.sel("rowTemplates")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowTemplates(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRowTemplates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
