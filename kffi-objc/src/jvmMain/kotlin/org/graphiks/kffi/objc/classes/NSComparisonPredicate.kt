@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSComparisonPredicate
 * Superclass: NSPredicate
 */
@PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSComparisonPredicate(override val ptr: MemorySegment) : NSPredicate(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSComparisonPredicate") }

        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithLeftExpression_rightExpression_modifier_type_options(lhs: MemorySegment, rhs: MemorySegment, modifier: NSComparisonPredicateModifier, type: NSPredicateOperatorType, options: NSComparisonPredicateOptions): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithLeftExpression:rightExpression:modifier:type:options:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, lhs, rhs, modifier.rawValue, type.rawValue, options.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
        @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
        @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
        fun predicateWithLeftExpression_rightExpression_customSelector(lhs: MemorySegment, rhs: MemorySegment, selector: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("predicateWithLeftExpression:rightExpression:customSelector:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, lhs, rhs, selector) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithLeftExpression_rightExpression_modifier_type_options(lhs: MemorySegment, rhs: MemorySegment, modifier: NSComparisonPredicateModifier, type: NSPredicateOperatorType, options: NSComparisonPredicateOptions): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLeftExpression:rightExpression:modifier:type:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, lhs, rhs, modifier.rawValue, type.rawValue, options.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithLeftExpression_rightExpression_customSelector(lhs: MemorySegment, rhs: MemorySegment, selector: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithLeftExpression:rightExpression:customSelector:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, lhs, rhs, selector) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property predicateOperatorType
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun predicateOperatorType(): NSPredicateOperatorType {
        val sel = ObjCRuntime.sel("predicateOperatorType")
        return NSPredicateOperatorType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property comparisonPredicateModifier
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun comparisonPredicateModifier(): NSComparisonPredicateModifier {
        val sel = ObjCRuntime.sel("comparisonPredicateModifier")
        return NSComparisonPredicateModifier(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property leftExpression
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun leftExpression(): MemorySegment {
        val sel = ObjCRuntime.sel("leftExpression")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rightExpression
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun rightExpression(): MemorySegment {
        val sel = ObjCRuntime.sel("rightExpression")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property customSelector
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun customSelector(): MemorySegment {
        val sel = ObjCRuntime.sel("customSelector")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property options
    @PlatformAvailability(platform = "ios", introducedMajor = 3, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun options(): NSComparisonPredicateOptions {
        val sel = ObjCRuntime.sel("options")
        return NSComparisonPredicateOptions(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}
