@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPredicateValidating
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
interface NSPredicateValidating {
    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    // @optional
    fun visitPredicate_error(predicate: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitPredicate:error:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    // @optional
    fun visitExpression_error(expression: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitExpression:error:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    // @optional
    fun visitOperatorType_error(operatorType: NSPredicateOperatorType, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitOperatorType:error:' not implemented")

    @PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 4, introducedSubminor = -1)
    // @optional
    fun visitExpressionKeyPath_scope_key_error(expression: MemorySegment, scope: MemorySegment, key: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitExpressionKeyPath:scope:key:error:' not implemented")

}
