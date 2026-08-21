package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSPredicateValidating
 * Inherits protocols: NSObject
 */
interface NSPredicateValidating {
    // @optional
    fun visitPredicate_error(predicate: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitPredicate:error:' not implemented")

    // @optional
    fun visitExpression_error(expression: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitExpression:error:' not implemented")

    // @optional
    fun visitOperatorType_error(operatorType: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitOperatorType:error:' not implemented")

    // @optional
    fun visitExpressionKeyPath_scope_key_error(expression: MemorySegment, scope: MemorySegment, key: MemorySegment, error: MemorySegment): Boolean =
        throw UnsupportedOperationException("Optional ObjC method 'visitExpressionKeyPath:scope:key:error:' not implemented")

}
