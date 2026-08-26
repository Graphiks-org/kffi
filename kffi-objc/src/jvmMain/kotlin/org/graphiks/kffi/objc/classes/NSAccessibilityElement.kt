package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSAccessibilityElement
 * Superclass: NSObject
 * Protocols: NSAccessibility
 */
open class NSAccessibilityElement(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSAccessibilityElement") }

        fun accessibilityElementWithRole_frame_label_parent(role: MemorySegment, frame: NSRect, label: MemorySegment, parent: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("accessibilityElementWithRole:frame:label:parent:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, role, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), label, parent) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        fun accessibilityElementWithRole_frame_label_parent(role: MemorySegment, frame: NSRect, label: String, parent: MemorySegment): MemorySegment = accessibilityElementWithRole_frame_label_parent(role, frame, ObjCRuntime.newNSString(Arena.global(), label), parent)

    }

    open fun accessibilityAddChildElement(childElement: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("accessibilityAddChildElement:")
        ObjCRuntime.msgSend(null, ptr, sel, childElement)
    }

    // @property accessibilityFrameInParentSpace
    open fun accessibilityFrameInParentSpace(): NSRect {
        val sel = ObjCRuntime.sel("accessibilityFrameInParentSpace")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }
    open fun setAccessibilityFrameInParentSpace(value: NSRect) {
        val sel = ObjCRuntime.sel("setAccessibilityFrameInParentSpace:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
    }

}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityElement(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityElement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityElement(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityFrame(): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrame")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilityFrame(value: NSRect) {
    val sel = ObjCRuntime.sel("setAccessibilityFrame:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRect.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityFocused(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFocused")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityFocused(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFocused:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityActivationPoint(): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityActivationPoint")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilityActivationPoint(value: NSPoint) {
    val sel = ObjCRuntime.sel("setAccessibilityActivationPoint:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSPoint.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityTopLevelUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTopLevelUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityTopLevelUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTopLevelUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityURL(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityURL")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityURL(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityURL:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityValueDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityValueDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityValueDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityValueDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityVisibleChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityVisibleChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySubrole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySubrole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySubrole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySubrole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityTitle(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitle")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityTitle(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitle:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityTitleUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTitleUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityTitleUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTitleUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityNextContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityNextContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityNextContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityNextContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityOrientation(): NSAccessibilityOrientation {
    val sel = ObjCRuntime.sel("accessibilityOrientation")
    return NSAccessibilityOrientation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSAccessibilityElement.setAccessibilityOrientation(value: NSAccessibilityOrientation) {
    val sel = ObjCRuntime.sel("setAccessibilityOrientation:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityOverflowButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityOverflowButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityOverflowButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityOverflowButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityParent(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityParent")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityParent(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityParent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityPlaceholderValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPlaceholderValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityPlaceholderValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPlaceholderValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityPreviousContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityPreviousContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityPreviousContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityPreviousContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityRole(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRole")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityRole(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRole:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityRoleDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRoleDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityRoleDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRoleDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySearchButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySearchButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySearchMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySearchMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySearchMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySearchMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilitySelected(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelected")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilitySelected(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilitySelected:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySelectedChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySelectedChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityServesAsTitleForUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityServesAsTitleForUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityServesAsTitleForUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityServesAsTitleForUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityShownMenu(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityShownMenu")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityShownMenu(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityShownMenu:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMinValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMinValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMaxValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMaxValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMaxValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMaxValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityLinkedUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLinkedUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityLinkedUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLinkedUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityIdentifier(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIdentifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityIdentifier(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityHelp(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHelp")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityHelp(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHelp:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityFilename(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFilename")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityFilename(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFilename:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityExpanded(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityExpanded")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityExpanded(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityExpanded:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityEdited(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEdited")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityEdited(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEdited:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityEnabled(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityEnabled:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityChildren(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildren")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityChildren(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildren:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityChildrenInNavigationOrder(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityChildrenInNavigationOrder")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityChildrenInNavigationOrder(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityChildrenInNavigationOrder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityClearButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityClearButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityClearButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityClearButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityCancelButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCancelButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityCancelButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCancelButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityProtectedContent(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityProtectedContent")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityProtectedContent(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityProtectedContent:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityContents(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityContents")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityContents(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityContents:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityLabel(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabel")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityLabel(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityAlternateUIVisible(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityAlternateUIVisible")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityAlternateUIVisible(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityAlternateUIVisible:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySharedFocusElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedFocusElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySharedFocusElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedFocusElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityRequired(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityRequired")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityRequired(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityRequired:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityCustomRotors(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomRotors")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityCustomRotors(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomRotors:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityAttributedUserInputLabels(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedUserInputLabels")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityAttributedUserInputLabels(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAttributedUserInputLabels:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityApplicationFocusedUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityApplicationFocusedUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityApplicationFocusedUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityApplicationFocusedUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMainWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMainWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMainWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMainWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityHidden(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityHidden")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityHidden(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityHidden:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityFrontmost(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityFrontmost")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityFrontmost(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityFrontmost:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityFocusedWindow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFocusedWindow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityFocusedWindow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFocusedWindow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityWindows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWindows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityWindows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWindows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityExtrasMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityExtrasMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityExtrasMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityExtrasMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMenuBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMenuBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMenuBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMenuBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityColumnTitles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnTitles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityColumnTitles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnTitles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityOrderedByRow(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityOrderedByRow")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityOrderedByRow(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityOrderedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityHorizontalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSAccessibilityElement.setAccessibilityHorizontalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityVerticalUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSAccessibilityElement.setAccessibilityVerticalUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityHorizontalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityHorizontalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityVerticalUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityVerticalUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityHandles(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHandles")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityHandles(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHandles:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityWarningValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityWarningValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityWarningValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityWarningValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityCriticalValue(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCriticalValue")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityCriticalValue(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCriticalValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityDisclosed(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityDisclosed")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityDisclosed(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosed:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityDisclosedByRow(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedByRow")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityDisclosedByRow(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedByRow:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityDisclosedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDisclosedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityDisclosedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityDisclosureLevel(): Long {
    val sel = ObjCRuntime.sel("accessibilityDisclosureLevel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSAccessibilityElement.setAccessibilityDisclosureLevel(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityDisclosureLevel:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMarkerUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMarkerUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMarkerValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMarkerValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMarkerGroupUIElement(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerGroupUIElement")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMarkerGroupUIElement(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerGroupUIElement:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityUnits(): NSAccessibilityUnits {
    val sel = ObjCRuntime.sel("accessibilityUnits")
    return NSAccessibilityUnits(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSAccessibilityElement.setAccessibilityUnits(value: NSAccessibilityUnits) {
    val sel = ObjCRuntime.sel("setAccessibilityUnits:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityUnitDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityUnitDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityUnitDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityUnitDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityRulerMarkerType(): NSAccessibilityRulerMarkerType {
    val sel = ObjCRuntime.sel("accessibilityRulerMarkerType")
    return NSAccessibilityRulerMarkerType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSAccessibilityElement.setAccessibilityRulerMarkerType(value: NSAccessibilityRulerMarkerType) {
    val sel = ObjCRuntime.sel("setAccessibilityRulerMarkerType:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMarkerTypeDescription(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMarkerTypeDescription")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMarkerTypeDescription(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMarkerTypeDescription:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityHorizontalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHorizontalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityHorizontalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHorizontalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityVerticalScrollBar(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVerticalScrollBar")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityVerticalScrollBar(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVerticalScrollBar:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityAllowedValues(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAllowedValues")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityAllowedValues(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityAllowedValues:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityLabelUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityLabelUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityLabelUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityLabelValue(): Float {
    val sel = ObjCRuntime.sel("accessibilityLabelValue")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, this.ptr, sel) as Float
}
fun NSAccessibilityElement.setAccessibilityLabelValue(value: Float) {
    val sel = ObjCRuntime.sel("setAccessibilityLabelValue:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySplitters(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySplitters")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySplitters(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySplitters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityDecrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDecrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityDecrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDecrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityIncrementButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityIncrementButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityIncrementButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityIncrementButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityTabs(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityTabs")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityTabs(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityTabs:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityHeader(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityHeader")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityHeader(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityHeader:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityColumnCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityColumnCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSAccessibilityElement.setAccessibilityColumnCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityRowCount(): Long {
    val sel = ObjCRuntime.sel("accessibilityRowCount")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSAccessibilityElement.setAccessibilityRowCount(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityRowCount:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityIndex(): Long {
    val sel = ObjCRuntime.sel("accessibilityIndex")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSAccessibilityElement.setAccessibilityIndex(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityIndex:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityVisibleRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityVisibleRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySelectedRows(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedRows")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySelectedRows(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedRows:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityVisibleColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityVisibleColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySelectedColumns(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedColumns")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySelectedColumns(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedColumns:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilitySortDirection(): NSAccessibilitySortDirection {
    val sel = ObjCRuntime.sel("accessibilitySortDirection")
    return NSAccessibilitySortDirection(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}
fun NSAccessibilityElement.setAccessibilitySortDirection(value: NSAccessibilitySortDirection) {
    val sel = ObjCRuntime.sel("setAccessibilitySortDirection:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value.rawValue)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityRowHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRowHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityRowHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityRowHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySelectedCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySelectedCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityVisibleCells(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityVisibleCells")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityVisibleCells(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCells:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityColumnHeaderUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityColumnHeaderUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityColumnHeaderUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnHeaderUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityRowIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRowIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilityRowIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityRowIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityColumnIndexRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityColumnIndexRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilityColumnIndexRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityColumnIndexRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityInsertionPointLineNumber(): Long {
    val sel = ObjCRuntime.sel("accessibilityInsertionPointLineNumber")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSAccessibilityElement.setAccessibilityInsertionPointLineNumber(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityInsertionPointLineNumber:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilitySharedCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySharedCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilitySharedCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySharedTextUIElements(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySharedTextUIElements")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySharedTextUIElements(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySharedTextUIElements:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityVisibleCharacterRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilityVisibleCharacterRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilityVisibleCharacterRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilityVisibleCharacterRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilityNumberOfCharacters(): Long {
    val sel = ObjCRuntime.sel("accessibilityNumberOfCharacters")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long
}
fun NSAccessibilityElement.setAccessibilityNumberOfCharacters(value: Long) {
    val sel = ObjCRuntime.sel("setAccessibilityNumberOfCharacters:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySelectedText(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedText")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySelectedText(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedText:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.accessibilitySelectedTextRange(): NSRange {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRange")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel))
}
fun NSAccessibilityElement.setAccessibilitySelectedTextRange(value: NSRange) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRange:")
    ObjCRuntime.msgSend(null, this.ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSRange.layout))
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilitySelectedTextRanges(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilitySelectedTextRanges")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilitySelectedTextRanges(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilitySelectedTextRanges:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityToolbarButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityToolbarButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityToolbarButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityToolbarButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityModal(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityModal")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityModal(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityModal:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityProxy(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityProxy")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityProxy(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityProxy:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityMain(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMain")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityMain(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMain:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityFullScreenButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityFullScreenButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityFullScreenButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityFullScreenButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityGrowArea(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityGrowArea")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityGrowArea(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityGrowArea:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityDocument(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDocument")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityDocument(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDocument:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityDefaultButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityDefaultButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityDefaultButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityDefaultButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityCloseButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCloseButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityCloseButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCloseButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityZoomButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityZoomButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityZoomButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityZoomButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityMinimizeButton(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityMinimizeButton")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityMinimizeButton(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimizeButton:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 */
fun NSAccessibilityElement.isAccessibilityMinimized(): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilityMinimized")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
fun NSAccessibilityElement.setAccessibilityMinimized(value: Boolean) {
    val sel = ObjCRuntime.sel("setAccessibilityMinimized:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/**
 * Required by Objective-C protocol NSAccessibility.
 * This getter returns a borrowed (+0) Objective-C reference and does not transfer ownership.
 */
fun NSAccessibilityElement.accessibilityCustomActions(): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCustomActions")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
fun NSAccessibilityElement.setAccessibilityCustomActions(value: MemorySegment) {
    val sel = ObjCRuntime.sel("setAccessibilityCustomActions:")
    ObjCRuntime.msgSend(null, this.ptr, sel, value)
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityLayoutPointForScreenPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityLayoutPointForScreenPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityLayoutSizeForScreenSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityLayoutSizeForScreenSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityScreenPointForLayoutPoint(point: NSPoint): NSPoint {
    val sel = ObjCRuntime.sel("accessibilityScreenPointForLayoutPoint:")
    return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityScreenSizeForLayoutSize(size: NSSize): NSSize {
    val sel = ObjCRuntime.sel("accessibilityScreenSizeForLayoutSize:")
    return NSSize(ObjCRuntime.msgSendStruct(NSSize.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(size.segment, NSSize.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityCellForColumn_row(column: Long, row: Long): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityCellForColumn:row:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, column, row) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityAttributedStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityAttributedStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityRangeForLine(line: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForLine:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, line))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityStringForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityStringForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityRangeForPosition(point: NSPoint): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForPosition:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(point.segment, NSPoint.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityFrameForRange(range: NSRange): NSRect {
    val sel = ObjCRuntime.sel("accessibilityFrameForRange:")
    return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityRTFForRange(range: NSRange): MemorySegment {
    val sel = ObjCRuntime.sel("accessibilityRTFForRange:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, ObjCRuntime.ObjCStructArg(range.segment, NSRange.layout)) as MemorySegment
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityStyleRangeForIndex(index: Long): NSRange {
    val sel = ObjCRuntime.sel("accessibilityStyleRangeForIndex:")
    return NSRange(ObjCRuntime.msgSendStruct(NSRange.layout, this.ptr, sel, index))
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityLineForIndex(index: Long): Long {
    val sel = ObjCRuntime.sel("accessibilityLineForIndex:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, index) as Long
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformCancel(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformCancel")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformConfirm(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformConfirm")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformDecrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDecrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformDelete(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformDelete")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformIncrement(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformIncrement")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformPick(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPick")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformPress(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformPress")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformRaise(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformRaise")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformShowAlternateUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowAlternateUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformShowDefaultUI(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowDefaultUI")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.accessibilityPerformShowMenu(): Boolean {
    val sel = ObjCRuntime.sel("accessibilityPerformShowMenu")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSAccessibility. */
fun NSAccessibilityElement.isAccessibilitySelectorAllowed(selector: MemorySegment): Boolean {
    val sel = ObjCRuntime.sel("isAccessibilitySelectorAllowed:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel, selector) as Boolean
}
