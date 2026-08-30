@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPanel
 * Superclass: NSWindow
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPanel(override val ptr: MemorySegment) : NSWindow(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPanel") } }

    }

    // @property floatingPanel
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFloatingPanel(): Boolean {
        val sel = ObjCRuntime.sel("isFloatingPanel")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFloatingPanel(value: Boolean) {
        val sel = ObjCRuntime.sel("setFloatingPanel:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property becomesKeyOnlyIfNeeded
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun becomesKeyOnlyIfNeeded(): Boolean {
        val sel = ObjCRuntime.sel("becomesKeyOnlyIfNeeded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setBecomesKeyOnlyIfNeeded(value: Boolean) {
        val sel = ObjCRuntime.sel("setBecomesKeyOnlyIfNeeded:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property worksWhenModal
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun worksWhenModal(): Boolean {
        val sel = ObjCRuntime.sel("worksWhenModal")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setWorksWhenModal(value: Boolean) {
        val sel = ObjCRuntime.sel("setWorksWhenModal:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
