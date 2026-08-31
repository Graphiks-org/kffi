@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOpenPanel
 * Superclass: NSSavePanel
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSOpenPanel(override val ptr: MemorySegment) : NSSavePanel(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSOpenPanel") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun openPanel(): MemorySegment {
            val sel = ObjCRuntime.sel("openPanel")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property URLs
    /** @return NSArray<NSURL *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun URLs(): MemorySegment {
        val sel = ObjCRuntime.sel("URLs")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property resolvesAliases
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun resolvesAliases(): Boolean {
        val sel = ObjCRuntime.sel("resolvesAliases")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setResolvesAliases(value: Boolean) {
        val sel = ObjCRuntime.sel("setResolvesAliases:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canChooseDirectories
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canChooseDirectories(): Boolean {
        val sel = ObjCRuntime.sel("canChooseDirectories")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCanChooseDirectories(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanChooseDirectories:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsMultipleSelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsMultipleSelection(): Boolean {
        val sel = ObjCRuntime.sel("allowsMultipleSelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsMultipleSelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsMultipleSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canChooseFiles
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canChooseFiles(): Boolean {
        val sel = ObjCRuntime.sel("canChooseFiles")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCanChooseFiles(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanChooseFiles:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canResolveUbiquitousConflicts
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun canResolveUbiquitousConflicts(): Boolean {
        val sel = ObjCRuntime.sel("canResolveUbiquitousConflicts")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setCanResolveUbiquitousConflicts(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanResolveUbiquitousConflicts:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canDownloadUbiquitousContents
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun canDownloadUbiquitousContents(): Boolean {
        val sel = ObjCRuntime.sel("canDownloadUbiquitousContents")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setCanDownloadUbiquitousContents(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanDownloadUbiquitousContents:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property accessoryViewDisclosed
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun isAccessoryViewDisclosed(): Boolean {
        val sel = ObjCRuntime.sel("isAccessoryViewDisclosed")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
    open fun setAccessoryViewDisclosed(value: Boolean) {
        val sel = ObjCRuntime.sel("setAccessoryViewDisclosed:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: InheritedAndUnavailable on NSOpenPanel ─────────────────────────────────────────

// ── Category: NSDeprecated on NSOpenPanel ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSOpenPanel.filenames(): MemorySegment {
    val sel = ObjCRuntime.sel("filenames")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSOpenPanel.beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo(path: MemorySegment, name: MemorySegment, fileTypes: MemorySegment, docWindow: MemorySegment, delegate: MemorySegment, didEndSelector: MemorySegment, contextInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("beginSheetForDirectory:file:types:modalForWindow:modalDelegate:didEndSelector:contextInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, path, name, fileTypes, docWindow, delegate, didEndSelector, contextInfo)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSOpenPanel.beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo(path: MemorySegment, name: MemorySegment, fileTypes: MemorySegment, delegate: MemorySegment, didEndSelector: MemorySegment, contextInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("beginForDirectory:file:types:modelessDelegate:didEndSelector:contextInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, path, name, fileTypes, delegate, didEndSelector, contextInfo)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSOpenPanel.runModalForDirectory_file_types(path: MemorySegment, name: MemorySegment, fileTypes: MemorySegment): Long {
    val sel = ObjCRuntime.sel("runModalForDirectory:file:types:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, path, name, fileTypes) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 6, deprecatedSubminor = -1)
fun NSOpenPanel.runModalForTypes(fileTypes: MemorySegment): Long {
    val sel = ObjCRuntime.sel("runModalForTypes:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, fileTypes) as Long
}
