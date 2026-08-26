package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutItem
 * Superclass: NSObject
 * Protocols: NSCopying
 */
open class NSCollectionLayoutItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutItem") }

        fun itemWithLayoutSize(layoutSize: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("itemWithLayoutSize:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize) as MemorySegment
        }

        fun itemWithLayoutSize_supplementaryItems(layoutSize: MemorySegment, supplementaryItems: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("itemWithLayoutSize:supplementaryItems:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, layoutSize, supplementaryItems) as MemorySegment
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

    // @property contentInsets
    open fun contentInsets(): NSDirectionalEdgeInsets {
        val sel = ObjCRuntime.sel("contentInsets")
        return NSDirectionalEdgeInsets(ObjCRuntime.msgSendStruct(NSDirectionalEdgeInsets.layout, ptr, sel))
    }
    open fun setContentInsets(value: NSDirectionalEdgeInsets) {
        val sel = ObjCRuntime.sel("setContentInsets:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, NSDirectionalEdgeInsets.layout))
    }

    // @property edgeSpacing
    open fun edgeSpacing(): MemorySegment {
        val sel = ObjCRuntime.sel("edgeSpacing")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setEdgeSpacing(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setEdgeSpacing:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property layoutSize
    open fun layoutSize(): MemorySegment {
        val sel = ObjCRuntime.sel("layoutSize")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property supplementaryItems
    /** @return NSArray<NSCollectionLayoutSupplementaryItem *> * */
    open fun supplementaryItems(): MemorySegment {
        val sel = ObjCRuntime.sel("supplementaryItems")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutItem.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
