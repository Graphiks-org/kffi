@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAlert
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSAlert(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAlert") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun alertWithError(error: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("alertWithError:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, error) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addButtonWithTitle(title: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("addButtonWithTitle:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, title) as MemorySegment
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun addButtonWithTitle(title: String): MemorySegment = addButtonWithTitle(ObjCRuntime.newNSString(Arena.global(), title))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun layout(): Unit {
        val sel = ObjCRuntime.sel("layout")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun runModal(): Long {
        val sel = ObjCRuntime.sel("runModal")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
    open fun beginSheetModalForWindow_completionHandler(sheetWindow: MemorySegment, handler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("beginSheetModalForWindow:completionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, sheetWindow, handler)
    }

    // @property messageText
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun messageText(): MemorySegment {
        val sel = ObjCRuntime.sel("messageText")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMessageText(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMessageText:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun messageTextAsString(): String = ObjCRuntime.toJavaString(messageText())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMessageText(value: String) = setMessageText(ObjCRuntime.newNSString(Arena.global(), value))

    // @property informativeText
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun informativeText(): MemorySegment {
        val sel = ObjCRuntime.sel("informativeText")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInformativeText(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setInformativeText:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun informativeTextAsString(): String = ObjCRuntime.toJavaString(informativeText())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setInformativeText(value: String) = setInformativeText(ObjCRuntime.newNSString(Arena.global(), value))

    // @property icon
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun icon(): MemorySegment {
        val sel = ObjCRuntime.sel("icon")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIcon(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setIcon:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property buttons
    /** @return NSArray<NSButton *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun buttons(): MemorySegment {
        val sel = ObjCRuntime.sel("buttons")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property alertStyle
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alertStyle(): NSAlertStyle {
        val sel = ObjCRuntime.sel("alertStyle")
        return NSAlertStyle(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlertStyle(value: NSAlertStyle) {
        val sel = ObjCRuntime.sel("setAlertStyle:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property showsHelp
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun showsHelp(): Boolean {
        val sel = ObjCRuntime.sel("showsHelp")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShowsHelp(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsHelp:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property helpAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun helpAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("helpAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHelpAnchor(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setHelpAnchor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property delegate
    /** @return id<NSAlertDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property accessoryView
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun accessoryView(): MemorySegment {
        val sel = ObjCRuntime.sel("accessoryView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAccessoryView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAccessoryView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showsSuppressionButton
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun showsSuppressionButton(): Boolean {
        val sel = ObjCRuntime.sel("showsSuppressionButton")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setShowsSuppressionButton(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsSuppressionButton:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property suppressionButton
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun suppressionButton(): MemorySegment {
        val sel = ObjCRuntime.sel("suppressionButton")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property window
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun window(): MemorySegment {
        val sel = ObjCRuntime.sel("window")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

// ── Category: NSAlertDeprecated on NSAlert ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use -beginSheetModalForWindow:completionHandler: instead")
fun NSAlert.beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo(window: MemorySegment, delegate: MemorySegment, didEndSelector: MemorySegment, contextInfo: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("beginSheetModalForWindow:modalDelegate:didEndSelector:contextInfo:")
    ObjCRuntime.msgSend(null, this.ptr, sel, window, delegate, didEndSelector, contextInfo)
}

// Class method: +[NSAlert alertWithMessageText:defaultButton:alternateButton:otherButton:informativeTextWithFormat:]
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "Use -init instead")
fun NSAlert_alertWithMessageText_defaultButton_alternateButton_otherButton_informativeTextWithFormat(message: MemorySegment, defaultButton: MemorySegment, alternateButton: MemorySegment, otherButton: MemorySegment, format: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("alertWithMessageText:defaultButton:alternateButton:otherButton:informativeTextWithFormat:")
    val cls = ObjCRuntime.getClass("NSAlert")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, message, defaultButton, alternateButton, otherButton, format) as MemorySegment
}
