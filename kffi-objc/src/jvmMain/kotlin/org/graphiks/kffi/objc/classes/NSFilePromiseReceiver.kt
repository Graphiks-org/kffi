@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFilePromiseReceiver
 * Superclass: NSObject
 * Protocols: NSPasteboardReading
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
open class NSFilePromiseReceiver(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFilePromiseReceiver") }

        /** @return NSArray<NSString *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun readableDraggedTypes(): MemorySegment {
            val sel = ObjCRuntime.sel("readableDraggedTypes")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun receivePromisedFilesAtDestination_options_operationQueue_reader(destinationDir: MemorySegment, options: MemorySegment, operationQueue: MemorySegment, reader: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("receivePromisedFilesAtDestination:options:operationQueue:reader:")
        ObjCRuntime.msgSend(null, ptr, sel, destinationDir, options, operationQueue, reader)
    }

    // @property fileTypes
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileTypes(): MemorySegment {
        val sel = ObjCRuntime.sel("fileTypes")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property fileNames
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun fileNames(): MemorySegment {
        val sel = ObjCRuntime.sel("fileNames")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}

/** Required by Objective-C protocol NSPasteboardReading. */
fun NSFilePromiseReceiver_readableTypesForPasteboard(pasteboard: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("readableTypesForPasteboard:")
    val cls = ObjCRuntime.getClass("NSFilePromiseReceiver")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, cls, sel, pasteboard) as MemorySegment
}
