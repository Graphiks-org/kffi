@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSHelpManager
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSHelpManager(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSHelpManager") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun sharedHelpManager(): MemorySegment {
            val sel = ObjCRuntime.sel("sharedHelpManager")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun isContextHelpModeActive(): Boolean {
            val sel = ObjCRuntime.sel("isContextHelpModeActive")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun setContextHelpModeActive(contextHelpModeActive: Boolean): Unit {
            val sel = ObjCRuntime.sel("setContextHelpModeActive:")
            ObjCRuntime.msgSend(null, _class, sel, contextHelpModeActive)
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContextHelp_forObject(attrString: MemorySegment, `object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setContextHelp:forObject:")
        ObjCRuntime.msgSend(null, ptr, sel, attrString, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeContextHelpForObject(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeContextHelpForObject:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contextHelpForObject(`object`: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("contextHelpForObject:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, `object`) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showContextHelpForObject_locationHint(`object`: MemorySegment, pt: NSPoint): Boolean {
        val sel = ObjCRuntime.sel("showContextHelpForObject:locationHint:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, `object`, ObjCRuntime.ObjCStructArg(pt.segment, NSPoint.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openHelpAnchor_inBook(anchor: MemorySegment, book: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("openHelpAnchor:inBook:")
        ObjCRuntime.msgSend(null, ptr, sel, anchor, book)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun findString_inBook(query: MemorySegment, book: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("findString:inBook:")
        ObjCRuntime.msgSend(null, ptr, sel, query, book)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun findString_inBook(query: String, book: MemorySegment): Unit = findString_inBook(ObjCRuntime.newNSString(Arena.global(), query), book)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    open fun registerBooksInBundle(bundle: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("registerBooksInBundle:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, bundle) as Boolean
    }

}
