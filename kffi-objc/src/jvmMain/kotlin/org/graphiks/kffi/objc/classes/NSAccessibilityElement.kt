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
