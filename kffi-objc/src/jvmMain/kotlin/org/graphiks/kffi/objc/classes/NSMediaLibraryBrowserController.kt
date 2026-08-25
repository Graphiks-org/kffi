package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSMediaLibraryBrowserController
 * Superclass: NSObject
 */
open class NSMediaLibraryBrowserController(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSMediaLibraryBrowserController") }

        fun sharedMediaLibraryBrowserController(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedMediaLibraryBrowserController")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun togglePanel(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("togglePanel:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property sharedMediaLibraryBrowserController
    open fun sharedMediaLibraryBrowserController(): MemorySegment {
        val sel = ObjCRuntime.sel("sharedMediaLibraryBrowserController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property visible
    open fun isVisible(): Boolean {
        val sel = ObjCRuntime.sel("isVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    open fun setVisible(value: Boolean) {
        val sel = ObjCRuntime.sel("setVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property frame
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setFrame(value: NSRect) {
        val sel = ObjCRuntime.sel("setFrame:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

    // @property mediaLibraries
    open fun mediaLibraries(): NSMediaLibrary {
        val sel = ObjCRuntime.sel("mediaLibraries")
        return NSMediaLibrary(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    open fun setMediaLibraries(value: NSMediaLibrary) {
        val sel = ObjCRuntime.sel("setMediaLibraries:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
