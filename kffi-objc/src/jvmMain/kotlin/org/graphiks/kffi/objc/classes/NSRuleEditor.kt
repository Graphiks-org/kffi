@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSRuleEditor
 * Superclass: NSControl
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSRuleEditor(override val ptr: MemorySegment) : NSControl(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSRuleEditor") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadCriteria(): Unit {
        val sel = ObjCRuntime.sel("reloadCriteria")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun reloadPredicate(): Unit {
        val sel = ObjCRuntime.sel("reloadPredicate")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun predicateForRow(row: Long): MemorySegment {
        val sel = ObjCRuntime.sel("predicateForRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun subrowIndexesForRow(rowIndex: Long): MemorySegment {
        val sel = ObjCRuntime.sel("subrowIndexesForRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, rowIndex) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun criteriaForRow(row: Long): MemorySegment {
        val sel = ObjCRuntime.sel("criteriaForRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayValuesForRow(row: Long): MemorySegment {
        val sel = ObjCRuntime.sel("displayValuesForRow:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, row) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowForDisplayValue(displayValue: MemorySegment): Long {
        val sel = ObjCRuntime.sel("rowForDisplayValue:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, displayValue) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowTypeForRow(rowIndex: Long): NSRuleEditorRowType {
        val sel = ObjCRuntime.sel("rowTypeForRow:")
        return NSRuleEditorRowType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, rowIndex) as Long)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun parentRowForRow(rowIndex: Long): Long {
        val sel = ObjCRuntime.sel("parentRowForRow:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel, rowIndex) as Long
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addRow(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addRow:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertRowAtIndex_withType_asSubrowOfRow_animate(rowIndex: Long, rowType: NSRuleEditorRowType, parentRow: Long, shouldAnimate: Boolean): Unit {
        val sel = ObjCRuntime.sel("insertRowAtIndex:withType:asSubrowOfRow:animate:")
        ObjCRuntime.msgSend(null, ptr, sel, rowIndex, rowType.rawValue, parentRow, shouldAnimate)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCriteria_andDisplayValues_forRowAtIndex(criteria: MemorySegment, values: MemorySegment, rowIndex: Long): Unit {
        val sel = ObjCRuntime.sel("setCriteria:andDisplayValues:forRowAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, criteria, values, rowIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeRowAtIndex(rowIndex: Long): Unit {
        val sel = ObjCRuntime.sel("removeRowAtIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, rowIndex)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeRowsAtIndexes_includeSubrows(rowIndexes: MemorySegment, includeSubrows: Boolean): Unit {
        val sel = ObjCRuntime.sel("removeRowsAtIndexes:includeSubrows:")
        ObjCRuntime.msgSend(null, ptr, sel, rowIndexes, includeSubrows)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectRowIndexes_byExtendingSelection(indexes: MemorySegment, extend: Boolean): Unit {
        val sel = ObjCRuntime.sel("selectRowIndexes:byExtendingSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes, extend)
    }

    // @property delegate
    /** @return id<NSRuleEditorDelegate> */
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

    // @property formattingStringsFilename
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun formattingStringsFilename(): MemorySegment {
        val sel = ObjCRuntime.sel("formattingStringsFilename")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFormattingStringsFilename(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFormattingStringsFilename:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun formattingStringsFilenameAsString(): String = ObjCRuntime.toJavaString(formattingStringsFilename())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFormattingStringsFilename(value: String) = setFormattingStringsFilename(ObjCRuntime.newNSString(Arena.global(), value))

    // @property formattingDictionary
    /** @return NSDictionary<NSString *,NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun formattingDictionary(): MemorySegment {
        val sel = ObjCRuntime.sel("formattingDictionary")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFormattingDictionary(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFormattingDictionary:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property nestingMode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun nestingMode(): NSRuleEditorNestingMode {
        val sel = ObjCRuntime.sel("nestingMode")
        return NSRuleEditorNestingMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setNestingMode(value: NSRuleEditorNestingMode) {
        val sel = ObjCRuntime.sel("setNestingMode:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property rowHeight
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowHeight(): Double {
        val sel = ObjCRuntime.sel("rowHeight")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowHeight(value: Double) {
        val sel = ObjCRuntime.sel("setRowHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property editable
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isEditable(): Boolean {
        val sel = ObjCRuntime.sel("isEditable")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEditable(value: Boolean) {
        val sel = ObjCRuntime.sel("setEditable:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property canRemoveAllRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canRemoveAllRows(): Boolean {
        val sel = ObjCRuntime.sel("canRemoveAllRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCanRemoveAllRows(value: Boolean) {
        val sel = ObjCRuntime.sel("setCanRemoveAllRows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property predicate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun predicate(): MemorySegment {
        val sel = ObjCRuntime.sel("predicate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property numberOfRows
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun numberOfRows(): Long {
        val sel = ObjCRuntime.sel("numberOfRows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedRowIndexes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectedRowIndexes(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedRowIndexes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property rowClass
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowClass(): MemorySegment {
        val sel = ObjCRuntime.sel("rowClass")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowClass(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRowClass:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rowTypeKeyPath
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowTypeKeyPath(): MemorySegment {
        val sel = ObjCRuntime.sel("rowTypeKeyPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowTypeKeyPath(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setRowTypeKeyPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rowTypeKeyPathAsString(): String = ObjCRuntime.toJavaString(rowTypeKeyPath())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRowTypeKeyPath(value: String) = setRowTypeKeyPath(ObjCRuntime.newNSString(Arena.global(), value))

    // @property subrowsKeyPath
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun subrowsKeyPath(): MemorySegment {
        val sel = ObjCRuntime.sel("subrowsKeyPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSubrowsKeyPath(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSubrowsKeyPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun subrowsKeyPathAsString(): String = ObjCRuntime.toJavaString(subrowsKeyPath())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSubrowsKeyPath(value: String) = setSubrowsKeyPath(ObjCRuntime.newNSString(Arena.global(), value))

    // @property criteriaKeyPath
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun criteriaKeyPath(): MemorySegment {
        val sel = ObjCRuntime.sel("criteriaKeyPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCriteriaKeyPath(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setCriteriaKeyPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun criteriaKeyPathAsString(): String = ObjCRuntime.toJavaString(criteriaKeyPath())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCriteriaKeyPath(value: String) = setCriteriaKeyPath(ObjCRuntime.newNSString(Arena.global(), value))

    // @property displayValuesKeyPath
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayValuesKeyPath(): MemorySegment {
        val sel = ObjCRuntime.sel("displayValuesKeyPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplayValuesKeyPath(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDisplayValuesKeyPath:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun displayValuesKeyPathAsString(): String = ObjCRuntime.toJavaString(displayValuesKeyPath())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setDisplayValuesKeyPath(value: String) = setDisplayValuesKeyPath(ObjCRuntime.newNSString(Arena.global(), value))

}
