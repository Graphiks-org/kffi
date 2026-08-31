@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLayoutGuide
 * Superclass: NSObject
 * Protocols: NSCoding, NSUserInterfaceItemIdentification
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSLayoutGuide(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLayoutGuide") } }

    }

    /** @return NSArray<NSLayoutConstraint *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun constraintsAffectingLayoutForOrientation(orientation: NSLayoutConstraintOrientation): MemorySegment {
        val sel = ObjCRuntime.sel("constraintsAffectingLayoutForOrientation:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, orientation.rawValue) as MemorySegment
    }

    // @property frame
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property owningView
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun owningView(): MemorySegment {
        val sel = ObjCRuntime.sel("owningView")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setOwningView(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setOwningView:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property identifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setIdentifier(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setIdentifier:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property leadingAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leadingAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("leadingAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property trailingAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun trailingAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("trailingAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property leftAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun leftAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("leftAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rightAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rightAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("rightAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property topAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun topAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("topAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property bottomAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bottomAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("bottomAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property widthAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun widthAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("widthAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property heightAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun heightAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("heightAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property centerXAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun centerXAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("centerXAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property centerYAnchor
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun centerYAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("centerYAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hasAmbiguousLayout
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun hasAmbiguousLayout(): Boolean {
        val sel = ObjCRuntime.sel("hasAmbiguousLayout")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutGuide.encodeWithCoder(coder: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("encodeWithCoder:")
    ObjCRuntime.msgSend(null, this.ptr, sel, coder)
}

/** Required by Objective-C protocol NSCoding. */
fun NSLayoutGuide.initWithCoder(coder: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("initWithCoder:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, coder) as MemorySegment
}
