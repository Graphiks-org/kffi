@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSRuleEditorDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
interface NSRuleEditorDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    fun ruleEditor_numberOfChildrenForCriterion_withRowType(editor: MemorySegment, criterion: MemorySegment, rowType: NSRuleEditorRowType): Long

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun ruleEditor_child_forCriterion_withRowType(editor: MemorySegment, index: Long, criterion: MemorySegment, rowType: NSRuleEditorRowType): MemorySegment

    @PlatformAvailability(platform = "ios", unavailable = true)
    fun ruleEditor_displayValueForCriterion_inRow(editor: MemorySegment, criterion: MemorySegment, row: Long): MemorySegment

    /** @return NSDictionary<NSRuleEditorPredicatePartKey,id> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun ruleEditor_predicatePartsForCriterion_withDisplayValue_inRow(editor: MemorySegment, criterion: MemorySegment, value: MemorySegment, row: Long): MemorySegment =
        throw UnsupportedOperationException("Optional ObjC method 'ruleEditor:predicatePartsForCriterion:withDisplayValue:inRow:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    // @optional
    fun ruleEditorRowsDidChange(notification: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'ruleEditorRowsDidChange:' not implemented")

}
