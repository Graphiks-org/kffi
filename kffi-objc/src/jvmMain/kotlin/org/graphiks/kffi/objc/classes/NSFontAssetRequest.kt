@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSFontAssetRequest
 * Superclass: NSObject
 * Protocols: NSProgressReporting
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 13, introducedSubminor = -1)
open class NSFontAssetRequest(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSFontAssetRequest") }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "all", unavailable = true)
    open fun init(): MemorySegment {
        val sel = ObjCRuntime.sel("init")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun initWithFontDescriptors_options(fontDescriptors: MemorySegment, options: NSFontAssetRequestOptions): MemorySegment {
        val sel = ObjCRuntime.sel("initWithFontDescriptors:options:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, fontDescriptors, options.rawValue) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun downloadFontAssetsWithCompletionHandler(completionHandler: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("downloadFontAssetsWithCompletionHandler:")
        ObjCRuntime.msgSend(null, ptr, sel, completionHandler)
    }

    // @property downloadedFontDescriptors
    /** @return NSArray<NSFontDescriptor *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun downloadedFontDescriptors(): MemorySegment {
        val sel = ObjCRuntime.sel("downloadedFontDescriptors")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property progress
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun progress(): MemorySegment {
        val sel = ObjCRuntime.sel("progress")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

}
