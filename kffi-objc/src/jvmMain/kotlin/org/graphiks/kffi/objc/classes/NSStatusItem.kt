@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStatusItem
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSStatusItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSStatusItem") } }

    }

    // @property statusBar
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun statusBar(): MemorySegment {
        val sel = ObjCRuntime.sel("statusBar")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property length
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun length(): Double {
        val sel = ObjCRuntime.sel("length")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLength(value: Double) {
        val sel = ObjCRuntime.sel("setLength:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property menu
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun menu(): MemorySegment {
        val sel = ObjCRuntime.sel("menu")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMenu(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMenu:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property button
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun button(): MemorySegment {
        val sel = ObjCRuntime.sel("button")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property behavior
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun behavior(): NSStatusItemBehavior {
        val sel = ObjCRuntime.sel("behavior")
        return NSStatusItemBehavior(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setBehavior(value: NSStatusItemBehavior) {
        val sel = ObjCRuntime.sel("setBehavior:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property visible
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun isVisible(): Boolean {
        val sel = ObjCRuntime.sel("isVisible")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setVisible(value: Boolean) {
        val sel = ObjCRuntime.sel("setVisible:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property autosaveName
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun autosaveName(): MemorySegment {
        val sel = ObjCRuntime.sel("autosaveName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun setAutosaveName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAutosaveName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSStatusItemDeprecated on NSStatusItem ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button's -sendActionOn: instead")
fun NSStatusItem.sendActionOn(mask: NSEventMask): Long {
    val sel = ObjCRuntime.sel("sendActionOn:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, mask.rawValue) as Long
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the standard button instead which handles highlight drawing, making this method obsolete")
fun NSStatusItem.drawStatusBarBackgroundInRect_withHighlight(rect: NSRect, highlight: Boolean): Unit {
    val sel = ObjCRuntime.sel("drawStatusBarBackgroundInRect:withHighlight:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(rect.segment, NSRect.layout), highlight)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the menu property instead")
fun NSStatusItem.popUpStatusItemMenu(menu: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("popUpStatusItemMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, menu)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.action instead")
fun NSStatusItem.action(): MemorySegment {
    val sel = ObjCRuntime.sel("action")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.action instead")
fun NSStatusItem.setAction(action: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, action)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.doubleAction instead")
fun NSStatusItem.doubleAction(): MemorySegment {
    val sel = ObjCRuntime.sel("doubleAction")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.doubleAction instead")
fun NSStatusItem.setDoubleAction(doubleAction: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setDoubleAction:")
    ObjCRuntime.msgSend(null, this.ptr, sel, doubleAction)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.target instead")
fun NSStatusItem.target(): MemorySegment {
    val sel = ObjCRuntime.sel("target")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.target instead")
fun NSStatusItem.setTarget(target: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTarget:")
    ObjCRuntime.msgSend(null, this.ptr, sel, target)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.title instead")
fun NSStatusItem.title(): MemorySegment {
    val sel = ObjCRuntime.sel("title")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.title instead")
fun NSStatusItem.setTitle(title: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, title)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.attributedTitle instead")
fun NSStatusItem.attributedTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("attributedTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.attributedTitle instead")
fun NSStatusItem.setAttributedTitle(attributedTitle: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAttributedTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, attributedTitle)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.image instead")
fun NSStatusItem.image(): MemorySegment {
    val sel = ObjCRuntime.sel("image")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.image instead")
fun NSStatusItem.setImage(image: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setImage:")
    ObjCRuntime.msgSend(null, this.ptr, sel, image)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.alternateImage instead")
fun NSStatusItem.alternateImage(): MemorySegment {
    val sel = ObjCRuntime.sel("alternateImage")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.alternateImage instead")
fun NSStatusItem.setAlternateImage(alternateImage: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setAlternateImage:")
    ObjCRuntime.msgSend(null, this.ptr, sel, alternateImage)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.enabled instead")
fun NSStatusItem.isEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.enabled instead")
fun NSStatusItem.setEnabled(enabled: Boolean): Unit {
    val sel = ObjCRuntime.sel("setEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, enabled)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.cell.highlightsBy instead")
fun NSStatusItem.highlightMode(): Boolean {
    val sel = ObjCRuntime.sel("highlightMode")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.cell.highlightsBy instead")
fun NSStatusItem.setHighlightMode(highlightMode: Boolean): Unit {
    val sel = ObjCRuntime.sel("setHighlightMode:")
    ObjCRuntime.msgSend(null, this.ptr, sel, highlightMode)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.toolTip instead")
fun NSStatusItem.toolTip(): MemorySegment {
    val sel = ObjCRuntime.sel("toolTip")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the receiver's button.toolTip instead")
fun NSStatusItem.setToolTip(toolTip: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setToolTip:")
    ObjCRuntime.msgSend(null, this.ptr, sel, toolTip)
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the standard button property instead")
fun NSStatusItem.view(): MemorySegment {
    val sel = ObjCRuntime.sel("view")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 14, deprecatedSubminor = -1, message = "Use the standard button property instead")
fun NSStatusItem.setView(view: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setView:")
    ObjCRuntime.msgSend(null, this.ptr, sel, view)
}
