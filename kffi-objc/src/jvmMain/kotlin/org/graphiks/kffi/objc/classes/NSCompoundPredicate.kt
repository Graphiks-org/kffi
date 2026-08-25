package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCompoundPredicate
 * Superclass: NSPredicate
 */
open class NSCompoundPredicate(override val ptr: MemorySegment) : NSPredicate(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCompoundPredicate") }

        fun andPredicateWithSubpredicates(subpredicates: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("andPredicateWithSubpredicates:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, subpredicates) as MemorySegment
        }

        fun orPredicateWithSubpredicates(subpredicates: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("orPredicateWithSubpredicates:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, subpredicates) as MemorySegment
        }

        fun notPredicateWithSubpredicate(predicate: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("notPredicateWithSubpredicate:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, predicate) as MemorySegment
        }

    }

    open fun initWithType_subpredicates(type: NSCompoundPredicateType, subpredicates: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithType:subpredicates:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, type.rawValue, subpredicates) as MemorySegment
    }

    open fun initWithCoder(coder: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithCoder:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, coder) as MemorySegment
    }

    // @property compoundPredicateType
    open fun compoundPredicateType(): NSCompoundPredicateType {
        val sel = ObjCRuntime.sel("compoundPredicateType")
        return NSCompoundPredicateType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property subpredicates
    open fun subpredicates(): MemorySegment {
        val sel = ObjCRuntime.sel("subpredicates")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
