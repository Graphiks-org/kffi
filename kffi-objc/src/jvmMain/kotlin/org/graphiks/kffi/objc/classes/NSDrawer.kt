@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSDrawer
 * Superclass: NSResponder
 * Protocols: NSAccessibilityElement, NSAccessibility
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 13, deprecatedSubminor = -1, message = "Drawers are deprecated; consider using NSSplitViewController")
open class NSDrawer(override val ptr: MemorySegment) : NSResponder(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSDrawer") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithContentSize_preferredEdge(contentSize: NSSize, edge: NSRectEdge): MemorySegment {
        val sel = ObjCRuntime.sel("initWithContentSize:preferredEdge:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, ObjCRuntime.ObjCStructArg(contentSize.segment, NSSize.layout), edge.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun open(): Unit {
        val sel = ObjCRuntime.sel("open")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun openOnEdge(edge: NSRectEdge): Unit {
        val sel = ObjCRuntime.sel("openOnEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, edge.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun close(): Unit {
        val sel = ObjCRuntime.sel("close")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun open(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("open:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun close(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("close:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun toggle(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("toggle:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    // @property parentWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun parentWindow(): MemorySegment {
        val sel = ObjCRuntime.sel("parentWindow")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setParentWindow(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setParentWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property contentView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentView(): MemorySegment {
        val sel = ObjCRuntime.sel("contentView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setContentView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preferredEdge
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preferredEdge(): NSRectEdge {
        val sel = ObjCRuntime.sel("preferredEdge")
        return NSRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreferredEdge(value: NSRectEdge) {
        val sel = ObjCRuntime.sel("setPreferredEdge:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property delegate
    /** @return id<NSDrawerDelegate> */
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

    // @property state
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun state(): Long {
        val sel = ObjCRuntime.sel("state")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property edge
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun edge(): NSRectEdge {
        val sel = ObjCRuntime.sel("edge")
        return NSRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property contentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun contentSize(): NSSize {
        val sel = ObjCRuntime.sel("contentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property minContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun minContentSize(): NSSize {
        val sel = ObjCRuntime.sel("minContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMinContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMinContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property maxContentSize
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun maxContentSize(): NSSize {
        val sel = ObjCRuntime.sel("maxContentSize")
        return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setMaxContentSize(value: NSSize) {
        val sel = ObjCRuntime.sel("setMaxContentSize:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSSize.layout))
    }

    // @property leadingOffset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leadingOffset(): Double {
        val sel = ObjCRuntime.sel("leadingOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setLeadingOffset(value: Double) {
        val sel = ObjCRuntime.sel("setLeadingOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property trailingOffset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trailingOffset(): Double {
        val sel = ObjCRuntime.sel("trailingOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setTrailingOffset(value: Double) {
        val sel = ObjCRuntime.sel("setTrailingOffset:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSDrawer.accessibilityFrame(): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}

/** Required by Objective-C protocol NSAccessibilityElement. */
fun NSDrawer.accessibilityParent(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityParent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityElement(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityElement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityElement(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSDrawer.setAccessibilityFrame(value: NSRect) {
    val sel = ObjCRuntime.sel("setAccessibilityFrame:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityFocused(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFocused")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityFocused(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFocused:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityActivationPoint(): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityActivationPoint")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}
fun NSDrawer.setAccessibilityActivationPoint(value: NSPoint) {
    val sel = ObjCRuntime.sel("setAccessibilityActivationPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityTopLevelUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTopLevelUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityTopLevelUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTopLevelUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityURL(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityURL(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityURL:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityValueDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValueDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityValueDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValueDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityVisibleChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityVisibleChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySubrole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySubrole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySubrole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySubrole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityTitle(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityTitleUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitleUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityTitleUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitleUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityNextContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityNextContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityNextContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityNextContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityOrientation(): NSAccessibilityOrientation {
    val sel = ObjCRuntime.sel("accessibilityOrientation")
    return NSAccessibilityOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSDrawer.setAccessibilityOrientation(value: NSAccessibilityOrientation) {
    val sel = ObjCRuntime.sel("setAccessibilityOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityOverflowButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityOverflowButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityOverflowButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityOverflowButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

fun NSDrawer.setAccessibilityParent(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityParent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityPlaceholderValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPlaceholderValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityPlaceholderValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPlaceholderValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityPreviousContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPreviousContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityPreviousContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPreviousContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityRole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityRole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityRoleDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRoleDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityRoleDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRoleDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySearchButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySearchButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySearchMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySearchMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilitySelected(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelected")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilitySelected(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilitySelected:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySelectedChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySelectedChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityServesAsTitleForUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityServesAsTitleForUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityServesAsTitleForUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityServesAsTitleForUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityShownMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityShownMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityShownMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityShownMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMinValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMinValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMaxValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMaxValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMaxValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMaxValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityLinkedUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLinkedUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityLinkedUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLinkedUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityHelp(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHelp")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityHelp(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHelp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityFilename(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFilename")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityFilename(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFilename:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityExpanded(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityExpanded")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityExpanded(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityExpanded:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityEdited(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEdited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityEdited(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEdited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityEnabled(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityChildrenInNavigationOrder(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildrenInNavigationOrder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityChildrenInNavigationOrder(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildrenInNavigationOrder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityClearButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityClearButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityClearButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityClearButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityCancelButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCancelButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityCancelButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCancelButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityProtectedContent(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityProtectedContent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityProtectedContent(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityProtectedContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityLabel(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabel")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityLabel(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityAlternateUIVisible(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityAlternateUIVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityAlternateUIVisible(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityAlternateUIVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySharedFocusElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedFocusElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySharedFocusElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedFocusElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityRequired(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityRequired")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityRequired(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityRequired:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityCustomRotors(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomRotors")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityCustomRotors(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomRotors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityAttributedUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityAttributedUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAttributedUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityApplicationFocusedUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityApplicationFocusedUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityApplicationFocusedUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityApplicationFocusedUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMainWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMainWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMainWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMainWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityHidden(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityHidden")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityHidden(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityHidden:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityFrontmost(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFrontmost")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityFrontmost(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFrontmost:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityFocusedWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFocusedWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityFocusedWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFocusedWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityWindows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityWindows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityExtrasMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityExtrasMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityExtrasMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityExtrasMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityColumnTitles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnTitles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityColumnTitles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnTitles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityOrderedByRow(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityOrderedByRow")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityOrderedByRow(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityOrderedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityHorizontalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSDrawer.setAccessibilityHorizontalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityVerticalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSDrawer.setAccessibilityVerticalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityHorizontalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityHorizontalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityVerticalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityVerticalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityHandles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHandles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityHandles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHandles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityWarningValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWarningValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityWarningValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWarningValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityCriticalValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCriticalValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityCriticalValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCriticalValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityDisclosed(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityDisclosed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityDisclosed(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityDisclosedByRow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedByRow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityDisclosedByRow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityDisclosedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityDisclosedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityDisclosureLevel(): Long {
    val sel = ObjCRuntime.sel("accessibilityDisclosureLevel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSDrawer.setAccessibilityDisclosureLevel(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosureLevel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMarkerUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMarkerUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMarkerValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMarkerValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMarkerGroupUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerGroupUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMarkerGroupUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerGroupUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSDrawer.setAccessibilityUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityRulerMarkerType(): NSAccessibilityRulerMarkerType {
    val sel = ObjCRuntime.sel("accessibilityRulerMarkerType")
    return NSAccessibilityRulerMarkerType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSDrawer.setAccessibilityRulerMarkerType(value: NSAccessibilityRulerMarkerType) {
    val sel = ObjCRuntime.sel("setAccessibilityRulerMarkerType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMarkerTypeDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerTypeDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMarkerTypeDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerTypeDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityHorizontalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityHorizontalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityVerticalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityVerticalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityAllowedValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAllowedValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityAllowedValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAllowedValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityLabelUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabelUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityLabelUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityLabelValue(): Float {
    val sel = ObjCRuntime.sel("accessibilityLabelValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun NSDrawer.setAccessibilityLabelValue(value: Float) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySplitters(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySplitters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySplitters(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySplitters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityDecrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDecrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityDecrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDecrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityIncrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIncrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityIncrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIncrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityTabs(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTabs")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityTabs(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTabs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityHeader(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHeader")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityHeader(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHeader:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityColumnCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityColumnCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSDrawer.setAccessibilityColumnCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityRowCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityRowCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSDrawer.setAccessibilityRowCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityRowCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityIndex(): Long {
    val sel = ObjCRuntime.sel("accessibilityIndex")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSDrawer.setAccessibilityIndex(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityVisibleRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityVisibleRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySelectedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySelectedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityVisibleColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityVisibleColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySelectedColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySelectedColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilitySortDirection(): NSAccessibilitySortDirection {
    val sel = ObjCRuntime.sel("accessibilitySortDirection")
    return NSAccessibilitySortDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSDrawer.setAccessibilitySortDirection(value: NSAccessibilitySortDirection) {
    val sel = ObjCRuntime.sel("setAccessibilitySortDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityRowHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRowHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityRowHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRowHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySelectedCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySelectedCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityVisibleCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityVisibleCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityColumnHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityColumnHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityRowIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRowIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSDrawer.setAccessibilityRowIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityRowIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityColumnIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityColumnIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSDrawer.setAccessibilityColumnIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityInsertionPointLineNumber(): Long {
    val sel = ObjCRuntime.sel("accessibilityInsertionPointLineNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSDrawer.setAccessibilityInsertionPointLineNumber(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityInsertionPointLineNumber:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilitySharedCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySharedCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSDrawer.setAccessibilitySharedCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySharedTextUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedTextUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySharedTextUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedTextUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityVisibleCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityVisibleCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSDrawer.setAccessibilityVisibleCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilityNumberOfCharacters(): Long {
    val sel = ObjCRuntime.sel("accessibilityNumberOfCharacters")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSDrawer.setAccessibilityNumberOfCharacters(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityNumberOfCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySelectedText(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySelectedText(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.accessibilitySelectedTextRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSDrawer.setAccessibilitySelectedTextRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilitySelectedTextRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilitySelectedTextRanges(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityToolbarButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityToolbarButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityToolbarButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityToolbarButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityModal(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityModal")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityModal(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityModal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityProxy(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityProxy")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityProxy(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityProxy:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityMain(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMain")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityMain(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMain:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityFullScreenButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFullScreenButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityFullScreenButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFullScreenButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityGrowArea(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityGrowArea")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityGrowArea(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityGrowArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityDocument(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityDocument(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityDefaultButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDefaultButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityDefaultButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDefaultButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityCloseButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCloseButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityCloseButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCloseButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityZoomButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityZoomButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityZoomButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityZoomButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityMinimizeButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinimizeButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityMinimizeButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimizeButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSDrawer.isAccessibilityMinimized(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMinimized")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSDrawer.setAccessibilityMinimized(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSDrawer.accessibilityCustomActions(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomActions")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSDrawer.setAccessibilityCustomActions(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomActions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityLayoutPointForScreenPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityLayoutPointForScreenPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityLayoutSizeForScreenSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityLayoutSizeForScreenSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityScreenPointForLayoutPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityScreenPointForLayoutPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityScreenSizeForLayoutSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityScreenSizeForLayoutSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityCellForColumn_row(column: Long, row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCellForColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column, row) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityAttributedStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityRangeForLine(line: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForLine:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, line))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityRangeForPosition(point: NSPoint): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForPosition:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityFrameForRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrameForRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityRTFForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRTFForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityStyleRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityStyleRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityLineForIndex(index: Long): Long {
    val sel = ObjCRuntime.sel("accessibilityLineForIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, index) as Long
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformCancel(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformCancel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformConfirm(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformConfirm")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformDecrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDecrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformDelete(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDelete")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformIncrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformIncrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformPick(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPick")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformPress(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPress")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformRaise(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformRaise")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformShowAlternateUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowAlternateUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformShowDefaultUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowDefaultUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.accessibilityPerformShowMenu(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowMenu")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSDrawer.isAccessibilitySelectorAllowed(selector: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelectorAllowed:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, selector) as Boolean
}
