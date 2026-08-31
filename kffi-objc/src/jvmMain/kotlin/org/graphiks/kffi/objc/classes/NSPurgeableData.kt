@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSPurgeableData
 * Superclass: NSMutableData
 * Protocols: NSDiscardableContent
 */
@PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
open class NSPurgeableData(override val ptr: MemorySegment) : NSMutableData(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSPurgeableData") } }

    }

}

/** Required by Objective-C protocol NSDiscardableContent. */
fun NSPurgeableData.beginContentAccess(): Boolean {
    val sel = ObjCRuntime.sel("beginContentAccess")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

/** Required by Objective-C protocol NSDiscardableContent. */
fun NSPurgeableData.endContentAccess(): Unit {
    val sel = ObjCRuntime.sel("endContentAccess")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** Required by Objective-C protocol NSDiscardableContent. */
fun NSPurgeableData.discardContentIfPossible(): Unit {
    val sel = ObjCRuntime.sel("discardContentIfPossible")
    ObjCRuntime.msgSend(null, this.ptr, sel)
}

/** Required by Objective-C protocol NSDiscardableContent. */
fun NSPurgeableData.isContentDiscarded(): Boolean {
    val sel = ObjCRuntime.sel("isContentDiscarded")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
