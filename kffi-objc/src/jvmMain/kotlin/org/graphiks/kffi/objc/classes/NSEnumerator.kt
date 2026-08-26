package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSEnumerator
 * Superclass: NSObject
 * Protocols: NSFastEnumeration
 */
open class NSEnumerator(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSEnumerator") }

    }

    open fun nextObject(): MemorySegment {
        val sel = ObjCRuntime.sel("nextObject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSFastEnumeration. */
fun NSEnumerator.countByEnumeratingWithState_objects_count(state: NSFastEnumerationStatePointer, buffer: MemorySegment, len: Long): Long {
    val sel = ObjCRuntime.sel("countByEnumeratingWithState:objects:count:")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel, state.segment, buffer, len) as Long
}

// ── Category: NSExtendedEnumerator on NSEnumerator ─────────────────────────────────────────

/** @return NSArray<ObjectType> * */
fun NSEnumerator.allObjects(): MemorySegment {
    val sel = ObjCRuntime.sel("allObjects")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}
