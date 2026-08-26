package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionLayoutGroupCustomItem
 * Superclass: NSObject
 * Protocols: NSCopying
 */
open class NSCollectionLayoutGroupCustomItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSCollectionLayoutGroupCustomItem") }

        fun customItemWithFrame(frame: NSRect): MemorySegment {
            val sel = ObjCRuntime.sel("customItemWithFrame:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout)) as MemorySegment
        }

        fun customItemWithFrame_zIndex(frame: NSRect, zIndex: Long): MemorySegment {
            val sel = ObjCRuntime.sel("customItemWithFrame:zIndex:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, ObjCRuntime.ObjCStructArg(frame.segment, NSRect.layout), zIndex) as MemorySegment
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

    // @property frame
    open fun frame(): NSRect {
        val sel = ObjCRuntime.sel("frame")
        return NSRect(ObjCRuntime.msgSendStruct(NSRect.layout, ptr, sel))
    }

    // @property zIndex
    open fun zIndex(): Long {
        val sel = ObjCRuntime.sel("zIndex")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSCollectionLayoutGroupCustomItem.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
