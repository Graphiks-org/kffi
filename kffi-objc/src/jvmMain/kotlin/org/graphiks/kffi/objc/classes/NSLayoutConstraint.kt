@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSLayoutConstraint
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
open class NSLayoutConstraint(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSLayoutConstraint") } }

        /** @return NSArray<NSLayoutConstraint *> * */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        fun constraintsWithVisualFormat_options_metrics_views(format: MemorySegment, opts: NSLayoutFormatOptions, metrics: MemorySegment, views: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("constraintsWithVisualFormat:options:metrics:views:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, format, opts.rawValue, metrics, views) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        fun constraintsWithVisualFormat_options_metrics_views(format: String, opts: NSLayoutFormatOptions, metrics: MemorySegment, views: MemorySegment): MemorySegment = constraintsWithVisualFormat_options_metrics_views(ObjCRuntime.newNSString(Arena.global(), format), opts, metrics, views)

        @PlatformAvailability(platform = "ios", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        fun constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant(view1: MemorySegment, attr1: NSLayoutAttribute, relation: NSLayoutRelation, view2: MemorySegment, attr2: NSLayoutAttribute, multiplier: Double, c: Double): MemorySegment {
            val sel = ObjCRuntime.sel("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, view1, attr1.rawValue, relation.rawValue, view2, attr2.rawValue, multiplier, c) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun activateConstraints(constraints: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("activateConstraints:")
            ObjCRuntime.msgSend(null, _class, sel, constraints)
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
        fun deactivateConstraints(constraints: MemorySegment): Unit {
            val sel = ObjCRuntime.sel("deactivateConstraints:")
            ObjCRuntime.msgSend(null, _class, sel, constraints)
        }

    }

    // @property priority
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun priority(): Float {
        val sel = ObjCRuntime.sel("priority")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPriority(value: Float) {
        val sel = ObjCRuntime.sel("setPriority:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shouldBeArchived
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun shouldBeArchived(): Boolean {
        val sel = ObjCRuntime.sel("shouldBeArchived")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setShouldBeArchived(value: Boolean) {
        val sel = ObjCRuntime.sel("setShouldBeArchived:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property firstItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun firstItem(): MemorySegment {
        val sel = ObjCRuntime.sel("firstItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property secondItem
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun secondItem(): MemorySegment {
        val sel = ObjCRuntime.sel("secondItem")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property firstAttribute
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun firstAttribute(): NSLayoutAttribute {
        val sel = ObjCRuntime.sel("firstAttribute")
        return NSLayoutAttribute(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property secondAttribute
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun secondAttribute(): NSLayoutAttribute {
        val sel = ObjCRuntime.sel("secondAttribute")
        return NSLayoutAttribute(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property firstAnchor
    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun firstAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("firstAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property secondAnchor
    @PlatformAvailability(platform = "ios", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
    open fun secondAnchor(): MemorySegment {
        val sel = ObjCRuntime.sel("secondAnchor")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property relation
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun relation(): NSLayoutRelation {
        val sel = ObjCRuntime.sel("relation")
        return NSLayoutRelation(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property multiplier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun multiplier(): Double {
        val sel = ObjCRuntime.sel("multiplier")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property constant
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun constant(): Double {
        val sel = ObjCRuntime.sel("constant")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setConstant(value: Double) {
        val sel = ObjCRuntime.sel("setConstant:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property active
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun isActive(): Boolean {
        val sel = ObjCRuntime.sel("isActive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    open fun setActive(value: Boolean) {
        val sel = ObjCRuntime.sel("setActive:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

// ── Category: NSIdentifier on NSLayoutConstraint ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSLayoutConstraint.identifier(): MemorySegment {
    val sel = ObjCRuntime.sel("identifier")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
fun NSLayoutConstraint.setIdentifier(identifier: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("setIdentifier:")
    ObjCRuntime.msgSend(null, this.ptr, sel, identifier)
}

// ── Category:  on NSLayoutConstraint ─────────────────────────────────────────
