package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSOrderedCollectionChange
 * Superclass: NSObject
 */
open class NSOrderedCollectionChange(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSOrderedCollectionChange") }

        /** @return NSOrderedCollectionChange<ObjectType> * */
        fun changeWithObject_type_index(anObject: MemorySegment, type: NSCollectionChangeType, index: Long): MemorySegment {
            val sel = ObjCRuntime.sel("changeWithObject:type:index:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, anObject, type.rawValue, index) as MemorySegment
        }

        /** @return NSOrderedCollectionChange<ObjectType> * */
        fun changeWithObject_type_index_associatedIndex(anObject: MemorySegment, type: NSCollectionChangeType, index: Long, associatedIndex: Long): MemorySegment {
            val sel = ObjCRuntime.sel("changeWithObject:type:index:associatedIndex:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, anObject, type.rawValue, index, associatedIndex) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    open fun initWithObject_type_index(anObject: MemorySegment, type: NSCollectionChangeType, index: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithObject:type:index:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anObject, type.rawValue, index) as MemorySegment
    }

    open fun initWithObject_type_index_associatedIndex(anObject: MemorySegment, type: NSCollectionChangeType, index: Long, associatedIndex: Long): MemorySegment {
        val sel = ObjCRuntime.sel("initWithObject:type:index:associatedIndex:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, anObject, type.rawValue, index, associatedIndex) as MemorySegment
    }

    // @property object
    open fun `object`(): MemorySegment {
        val sel = ObjCRuntime.sel("object")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property changeType
    open fun changeType(): NSCollectionChangeType {
        val sel = ObjCRuntime.sel("changeType")
        return NSCollectionChangeType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property index
    open fun index(): Long {
        val sel = ObjCRuntime.sel("index")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property associatedIndex
    open fun associatedIndex(): Long {
        val sel = ObjCRuntime.sel("associatedIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
