package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutAnchor
 * Superclass: NSObject
 * Protocols: NSCopying
 */
open class NSCollectionLayoutAnchor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutAnchor") }

        fun layoutAnchorWithEdges(edges: NSDirectionalRectEdge): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAnchorWithEdges:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, edges.rawValue) as MemorySegment
        }

        fun layoutAnchorWithEdges_absoluteOffset(edges: NSDirectionalRectEdge, absoluteOffset: NSPoint): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAnchorWithEdges:absoluteOffset:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, edges.rawValue, ObjCRuntime.ObjCStructArg(absoluteOffset.segment, NSPoint.layout)) as MemorySegment
        }

        fun layoutAnchorWithEdges_fractionalOffset(edges: NSDirectionalRectEdge, fractionalOffset: NSPoint): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAnchorWithEdges:fractionalOffset:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, edges.rawValue, ObjCRuntime.ObjCStructArg(fractionalOffset.segment, NSPoint.layout)) as MemorySegment
        }

        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property edges
    open fun edges(): NSDirectionalRectEdge {
        val sel = ObjCRuntime.sel("edges")
        return NSDirectionalRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property offset
    open fun offset(): NSPoint {
        val sel = ObjCRuntime.sel("offset")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property isAbsoluteOffset
    open fun isAbsoluteOffset(): Boolean {
        val sel = ObjCRuntime.sel("isAbsoluteOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property isFractionalOffset
    open fun isFractionalOffset(): Boolean {
        val sel = ObjCRuntime.sel("isFractionalOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}
