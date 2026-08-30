@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSTreeNode
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
open class NSTreeNode(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSTreeNode") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun treeNodeWithRepresentedObject(modelObject: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("treeNodeWithRepresentedObject:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, modelObject) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithRepresentedObject(modelObject: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithRepresentedObject:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, modelObject) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun descendantNodeAtIndexPath(indexPath: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("descendantNodeAtIndexPath:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, indexPath) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sortWithSortDescriptors_recursively(sortDescriptors: MemorySegment, recursively: Boolean): Unit {
        val sel = ObjCRuntime.sel("sortWithSortDescriptors:recursively:")
        ObjCRuntime.msgSend(null, ptr, sel, sortDescriptors, recursively)
    }

    // @property representedObject
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun representedObject(): MemorySegment {
        val sel = ObjCRuntime.sel("representedObject")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property indexPath
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexPath(): MemorySegment {
        val sel = ObjCRuntime.sel("indexPath")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property leaf
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isLeaf(): Boolean {
        val sel = ObjCRuntime.sel("isLeaf")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property childNodes
    /** @return NSArray<NSTreeNode *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun childNodes(): MemorySegment {
        val sel = ObjCRuntime.sel("childNodes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property mutableChildNodes
    /** @return NSMutableArray<NSTreeNode *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun mutableChildNodes(): MemorySegment {
        val sel = ObjCRuntime.sel("mutableChildNodes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property parentNode
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun parentNode(): MemorySegment {
        val sel = ObjCRuntime.sel("parentNode")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
