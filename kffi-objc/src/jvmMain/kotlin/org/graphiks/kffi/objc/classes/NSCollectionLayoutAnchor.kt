@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutAnchor
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutAnchor(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionLayoutAnchor") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun layoutAnchorWithEdges(edges: NSDirectionalRectEdge): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAnchorWithEdges:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, edges.rawValue) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun layoutAnchorWithEdges_absoluteOffset(edges: NSDirectionalRectEdge, absoluteOffset: NSPoint): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAnchorWithEdges:absoluteOffset:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, edges.rawValue, ObjCRuntime.ObjCStructArg(absoluteOffset.segment, NSPoint.layout)) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun layoutAnchorWithEdges_fractionalOffset(edges: NSDirectionalRectEdge, fractionalOffset: NSPoint): MemorySegment {
            val sel = ObjCRuntime.sel("layoutAnchorWithEdges:fractionalOffset:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, edges.rawValue, ObjCRuntime.ObjCStructArg(fractionalOffset.segment, NSPoint.layout)) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property edges
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun edges(): NSDirectionalRectEdge {
        val sel = ObjCRuntime.sel("edges")
        return NSDirectionalRectEdge(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property offset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun offset(): NSPoint {
        val sel = ObjCRuntime.sel("offset")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

    // @property isAbsoluteOffset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isAbsoluteOffset(): Boolean {
        val sel = ObjCRuntime.sel("isAbsoluteOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property isFractionalOffset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFractionalOffset(): Boolean {
        val sel = ObjCRuntime.sel("isFractionalOffset")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutAnchor.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
