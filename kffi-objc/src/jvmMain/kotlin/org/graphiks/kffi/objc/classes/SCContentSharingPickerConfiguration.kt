@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCContentSharingPickerConfiguration
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
open class SCContentSharingPickerConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCContentSharingPickerConfiguration") } }

    }

    // @property allowedPickerModes
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allowedPickerModes(): SCContentSharingPickerMode {
        val sel = ObjCRuntime.sel("allowedPickerModes")
        return SCContentSharingPickerMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowedPickerModes(value: SCContentSharingPickerMode) {
        val sel = ObjCRuntime.sel("setAllowedPickerModes:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property excludedWindowIDs
    /** @return NSArray<NSNumber *> * */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun excludedWindowIDs(): MemorySegment {
        val sel = ObjCRuntime.sel("excludedWindowIDs")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setExcludedWindowIDs(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setExcludedWindowIDs:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property excludedBundleIDs
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun excludedBundleIDs(): MemorySegment {
        val sel = ObjCRuntime.sel("excludedBundleIDs")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setExcludedBundleIDs(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setExcludedBundleIDs:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsChangingSelectedContent
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun allowsChangingSelectedContent(): Boolean {
        val sel = ObjCRuntime.sel("allowsChangingSelectedContent")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setAllowsChangingSelectedContent(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsChangingSelectedContent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
