@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSArrayController
 * Superclass: NSObjectController
 */
@PlatformAvailability(platform = "ios", unavailable = true)
open class NSArrayController(override val ptr: MemorySegment) : NSObjectController(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSArrayController") } }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun rearrangeObjects(): Unit {
        val sel = ObjCRuntime.sel("rearrangeObjects")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun didChangeArrangementCriteria(): Unit {
        val sel = ObjCRuntime.sel("didChangeArrangementCriteria")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun arrangeObjects(objects: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("arrangeObjects:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, objects) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionIndexes(indexes: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setSelectionIndexes:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, indexes) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectionIndex(index: Long): Boolean {
        val sel = ObjCRuntime.sel("setSelectionIndex:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, index) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addSelectionIndexes(indexes: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("addSelectionIndexes:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, indexes) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeSelectionIndexes(indexes: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("removeSelectionIndexes:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, indexes) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectedObjects(objects: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setSelectedObjects:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, objects) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addSelectedObjects(objects: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("addSelectedObjects:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, objects) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeSelectedObjects(objects: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("removeSelectedObjects:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, objects) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun add(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("add:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun remove(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("remove:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insert(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insert:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectNext(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectNext:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectPrevious(sender: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("selectPrevious:")
        ObjCRuntime.msgSend(null, ptr, sel, sender)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun addObject(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addObject:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addObjects(objects: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addObjects:")
        ObjCRuntime.msgSend(null, ptr, sel, objects)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertObject_atArrangedObjectIndex(`object`: MemorySegment, index: Long): Unit {
        val sel = ObjCRuntime.sel("insertObject:atArrangedObjectIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun insertObjects_atArrangedObjectIndexes(objects: MemorySegment, indexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("insertObjects:atArrangedObjectIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, objects, indexes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeObjectAtArrangedObjectIndex(index: Long): Unit {
        val sel = ObjCRuntime.sel("removeObjectAtArrangedObjectIndex:")
        ObjCRuntime.msgSend(null, ptr, sel, index)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeObjectsAtArrangedObjectIndexes(indexes: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeObjectsAtArrangedObjectIndexes:")
        ObjCRuntime.msgSend(null, ptr, sel, indexes)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun removeObject(`object`: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeObject:")
        ObjCRuntime.msgSend(null, ptr, sel, `object`)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun removeObjects(objects: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("removeObjects:")
        ObjCRuntime.msgSend(null, ptr, sel, objects)
    }

    // @property automaticallyRearrangesObjects
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun automaticallyRearrangesObjects(): Boolean {
        val sel = ObjCRuntime.sel("automaticallyRearrangesObjects")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setAutomaticallyRearrangesObjects(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticallyRearrangesObjects:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property automaticRearrangementKeyPaths
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun automaticRearrangementKeyPaths(): MemorySegment {
        val sel = ObjCRuntime.sel("automaticRearrangementKeyPaths")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property sortDescriptors
    /** @return NSArray<NSSortDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sortDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("sortDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSortDescriptors(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setSortDescriptors:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property filterPredicate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun filterPredicate(): MemorySegment {
        val sel = ObjCRuntime.sel("filterPredicate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setFilterPredicate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setFilterPredicate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property clearsFilterPredicateOnInsertion
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun clearsFilterPredicateOnInsertion(): Boolean {
        val sel = ObjCRuntime.sel("clearsFilterPredicateOnInsertion")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setClearsFilterPredicateOnInsertion(value: Boolean) {
        val sel = ObjCRuntime.sel("setClearsFilterPredicateOnInsertion:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property arrangedObjects
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun arrangedObjects(): MemorySegment {
        val sel = ObjCRuntime.sel("arrangedObjects")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property avoidsEmptySelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun avoidsEmptySelection(): Boolean {
        val sel = ObjCRuntime.sel("avoidsEmptySelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAvoidsEmptySelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setAvoidsEmptySelection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preservesSelection
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun preservesSelection(): Boolean {
        val sel = ObjCRuntime.sel("preservesSelection")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPreservesSelection(value: Boolean) {
        val sel = ObjCRuntime.sel("setPreservesSelection:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectsInsertedObjects
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectsInsertedObjects(): Boolean {
        val sel = ObjCRuntime.sel("selectsInsertedObjects")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setSelectsInsertedObjects(value: Boolean) {
        val sel = ObjCRuntime.sel("setSelectsInsertedObjects:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alwaysUsesMultipleValuesMarker
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alwaysUsesMultipleValuesMarker(): Boolean {
        val sel = ObjCRuntime.sel("alwaysUsesMultipleValuesMarker")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAlwaysUsesMultipleValuesMarker(value: Boolean) {
        val sel = ObjCRuntime.sel("setAlwaysUsesMultipleValuesMarker:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property selectionIndexes
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionIndexes(): MemorySegment {
        val sel = ObjCRuntime.sel("selectionIndexes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property selectionIndex
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun selectionIndex(): Long {
        val sel = ObjCRuntime.sel("selectionIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property selectedObjects
    @PlatformAvailability(platform = "ios", unavailable = true)
    override fun selectedObjects(): MemorySegment {
        val sel = ObjCRuntime.sel("selectedObjects")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property canInsert
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canInsert(): Boolean {
        val sel = ObjCRuntime.sel("canInsert")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canSelectNext
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canSelectNext(): Boolean {
        val sel = ObjCRuntime.sel("canSelectNext")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property canSelectPrevious
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun canSelectPrevious(): Boolean {
        val sel = ObjCRuntime.sel("canSelectPrevious")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
