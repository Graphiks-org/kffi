@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStoryboardSegue
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSStoryboardSegue(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSStoryboardSegue") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun segueWithIdentifier_source_destination_performHandler(identifier: MemorySegment, sourceController: MemorySegment, destinationController: MemorySegment, performHandler: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("segueWithIdentifier:source:destination:performHandler:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, identifier, sourceController, destinationController, performHandler) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithIdentifier_source_destination(identifier: MemorySegment, sourceController: MemorySegment, destinationController: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithIdentifier:source:destination:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier, sourceController, destinationController) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun perform(): Unit {
        val sel = ObjCRuntime.sel("perform")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property identifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun identifier(): MemorySegment {
        val sel = ObjCRuntime.sel("identifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property sourceController
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun sourceController(): MemorySegment {
        val sel = ObjCRuntime.sel("sourceController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property destinationController
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun destinationController(): MemorySegment {
        val sel = ObjCRuntime.sel("destinationController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
