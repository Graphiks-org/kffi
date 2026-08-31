@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSStoryboard
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
open class NSStoryboard(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSStoryboard") } }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun storyboardWithName_bundle(name: MemorySegment, storyboardBundleOrNil: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("storyboardWithName:bundle:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, name, storyboardBundleOrNil) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
        fun mainStoryboard(): MemorySegment {
            val sel = ObjCRuntime.sel("mainStoryboard")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun instantiateInitialController(): MemorySegment {
        val sel = ObjCRuntime.sel("instantiateInitialController")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun instantiateInitialControllerWithCreator(block: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("instantiateInitialControllerWithCreator:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, block) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun instantiateControllerWithIdentifier(identifier: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("instantiateControllerWithIdentifier:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
    open fun instantiateControllerWithIdentifier_creator(identifier: MemorySegment, block: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("instantiateControllerWithIdentifier:creator:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, identifier, block) as MemorySegment
    }

}
