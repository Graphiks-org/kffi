@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutBoundarySupplementaryItem
 * Superclass: NSCollectionLayoutSupplementaryItem
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSCollectionLayoutBoundarySupplementaryItem(override val ptr: MemorySegment) : NSCollectionLayoutSupplementaryItem(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutBoundarySupplementaryItem") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun boundarySupplementaryItemWithLayoutSize_elementKind_alignment(layoutSize: MemorySegment, elementKind: MemorySegment, alignment: NSRectAlignment): MemorySegment {
            val sel = ObjCRuntime.sel("boundarySupplementaryItemWithLayoutSize:elementKind:alignment:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, elementKind, alignment.rawValue) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun boundarySupplementaryItemWithLayoutSize_elementKind_alignment(layoutSize: MemorySegment, elementKind: String, alignment: NSRectAlignment): MemorySegment = boundarySupplementaryItemWithLayoutSize_elementKind_alignment(layoutSize, ObjCRuntime.newNSString(Arena.global(), elementKind), alignment)

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun boundarySupplementaryItemWithLayoutSize_elementKind_alignment_absoluteOffset(layoutSize: MemorySegment, elementKind: MemorySegment, alignment: NSRectAlignment, absoluteOffset: NSPoint): MemorySegment {
            val sel = ObjCRuntime.sel("boundarySupplementaryItemWithLayoutSize:elementKind:alignment:absoluteOffset:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, elementKind, alignment.rawValue, ObjCRuntime.ObjCStructArg(absoluteOffset.segment, NSPoint.layout)) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun boundarySupplementaryItemWithLayoutSize_elementKind_alignment_absoluteOffset(layoutSize: MemorySegment, elementKind: String, alignment: NSRectAlignment, absoluteOffset: NSPoint): MemorySegment = boundarySupplementaryItemWithLayoutSize_elementKind_alignment_absoluteOffset(layoutSize, ObjCRuntime.newNSString(Arena.global(), elementKind), alignment, absoluteOffset)

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "all", unavailable = true)
        fun new(): MemorySegment {
            val sel = ObjCRuntime.sel("new")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    override fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property extendsBoundary
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun extendsBoundary(): Boolean {
        val sel = ObjCRuntime.sel("extendsBoundary")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setExtendsBoundary(value: Boolean) {
        val sel = ObjCRuntime.sel("setExtendsBoundary:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property pinToVisibleBounds
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun pinToVisibleBounds(): Boolean {
        val sel = ObjCRuntime.sel("pinToVisibleBounds")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPinToVisibleBounds(value: Boolean) {
        val sel = ObjCRuntime.sel("setPinToVisibleBounds:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property alignment
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun alignment(): NSRectAlignment {
        val sel = ObjCRuntime.sel("alignment")
        return NSRectAlignment(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property offset
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun offset(): NSPoint {
        val sel = ObjCRuntime.sel("offset")
        return NSPoint(ObjCRuntime.msgSendStruct(NSPoint.layout, ptr, sel))
    }

}
