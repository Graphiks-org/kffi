@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPrintPanel
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSPrintPanel(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPrintPanel") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun printPanel(): MemorySegment {
            val sel = ObjCRuntime.sel("printPanel")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun addAccessoryController(accessoryController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addAccessoryController:")
        ObjCRuntime.msgSend(null, ptr, sel, accessoryController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun removeAccessoryController(accessoryController: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeAccessoryController:")
        ObjCRuntime.msgSend(null, ptr, sel, accessoryController)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setDefaultButtonTitle(defaultButtonTitle: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("setDefaultButtonTitle:")
        ObjCRuntime.msgSend(null, ptr, sel, defaultButtonTitle)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun setDefaultButtonTitle(defaultButtonTitle: String): Unit = setDefaultButtonTitle(ObjCRuntime.newNSString(Arena.global(), defaultButtonTitle))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun defaultButtonTitle(): MemorySegment {
        val sel = ObjCRuntime.sel("defaultButtonTitle")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun defaultButtonTitleAsString(): String = ObjCRuntime.toJavaString(defaultButtonTitle())

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun beginSheetUsingPrintInfo_onWindow_completionHandler(printInfo: MemorySegment, parentWindow: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginSheetUsingPrintInfo:onWindow:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, printInfo, parentWindow, handler)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 100000, deprecatedMinor = -1, deprecatedSubminor = -1)
    open fun beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo(printInfo: MemorySegment, docWindow: MemorySegment, delegate: MemorySegment, didEndSelector: MemorySegment, contextInfo: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginSheetWithPrintInfo:modalForWindow:delegate:didEndSelector:contextInfo:")
        ObjCRuntime.msgSend(null, ptr, sel, printInfo, docWindow, delegate, didEndSelector, contextInfo)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun runModalWithPrintInfo(printInfo: MemorySegment): Long {
        val sel = ObjCRuntime.sel("runModalWithPrintInfo:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, printInfo) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runModal(): Long {
        val sel = ObjCRuntime.sel("runModal")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property accessoryControllers
    /** @return NSArray<__kindof NSViewController *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun accessoryControllers(): MemorySegment {
        val sel = ObjCRuntime.sel("accessoryControllers")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property options
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun options(): NSPrintPanelOptions {
        val sel = ObjCRuntime.sel("options")
        return NSPrintPanelOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setOptions(value: NSPrintPanelOptions) {
        val sel = ObjCRuntime.sel("setOptions:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property helpAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun helpAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("helpAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setHelpAnchor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHelpAnchor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property jobStyleHint
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun jobStyleHint(): MemorySegment {
        val sel = ObjCRuntime.sel("jobStyleHint")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setJobStyleHint(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setJobStyleHint:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property printInfo
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun printInfo(): MemorySegment {
        val sel = ObjCRuntime.sel("printInfo")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category: NSDeprecated on NSPrintPanel ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Use -addAccessoryController instead")
fun NSPrintPanel.setAccessoryView(accessoryView: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAccessoryView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, accessoryView)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1, message = "Use -accessoryControllers instead. For compatibility this returns the view of the first accessory controller, or nil")
fun NSPrintPanel.accessoryView(): MemorySegment {
    val sel = ObjCRuntime.sel("accessoryView")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSPrintPanel.updateFromPrintInfo(): Unit {
    val sel = ObjCRuntime.sel("updateFromPrintInfo")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 5, deprecatedSubminor = -1)
fun NSPrintPanel.finalWritePrintInfo(): Unit {
    val sel = ObjCRuntime.sel("finalWritePrintInfo")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}
