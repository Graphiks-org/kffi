@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSCollectionViewUpdateItem
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 11, introducedSubminor = -1)
open class NSCollectionViewUpdateItem(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSCollectionViewUpdateItem") } }

    }

    // @property indexPathBeforeUpdate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexPathBeforeUpdate(): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathBeforeUpdate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property indexPathAfterUpdate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun indexPathAfterUpdate(): MemorySegment {
        val sel = ObjCRuntime.sel("indexPathAfterUpdate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property updateAction
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun updateAction(): NSCollectionUpdateAction {
        val sel = ObjCRuntime.sel("updateAction")
        return NSCollectionUpdateAction(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

}
