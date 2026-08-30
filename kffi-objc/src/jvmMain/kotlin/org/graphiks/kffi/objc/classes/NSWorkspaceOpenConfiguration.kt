@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSWorkspaceOpenConfiguration
 * Superclass: NSObject
 * Protocols: NSCopying
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
open class NSWorkspaceOpenConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { ObjCRuntime.getClass("NSWorkspaceOpenConfiguration") }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun configuration(): MemorySegment {
            val sel = ObjCRuntime.sel("configuration")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    // @property promptsUserIfNeeded
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun promptsUserIfNeeded(): Boolean {
        val sel = ObjCRuntime.sel("promptsUserIfNeeded")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setPromptsUserIfNeeded(value: Boolean) {
        val sel = ObjCRuntime.sel("setPromptsUserIfNeeded:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property addsToRecentItems
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun addsToRecentItems(): Boolean {
        val sel = ObjCRuntime.sel("addsToRecentItems")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAddsToRecentItems(value: Boolean) {
        val sel = ObjCRuntime.sel("setAddsToRecentItems:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property activates
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun activates(): Boolean {
        val sel = ObjCRuntime.sel("activates")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setActivates(value: Boolean) {
        val sel = ObjCRuntime.sel("setActivates:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hides
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hides(): Boolean {
        val sel = ObjCRuntime.sel("hides")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHides(value: Boolean) {
        val sel = ObjCRuntime.sel("setHides:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property hidesOthers
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hidesOthers(): Boolean {
        val sel = ObjCRuntime.sel("hidesOthers")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setHidesOthers(value: Boolean) {
        val sel = ObjCRuntime.sel("setHidesOthers:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property forPrinting
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isForPrinting(): Boolean {
        val sel = ObjCRuntime.sel("isForPrinting")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setForPrinting(value: Boolean) {
        val sel = ObjCRuntime.sel("setForPrinting:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property createsNewApplicationInstance
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun createsNewApplicationInstance(): Boolean {
        val sel = ObjCRuntime.sel("createsNewApplicationInstance")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setCreatesNewApplicationInstance(value: Boolean) {
        val sel = ObjCRuntime.sel("setCreatesNewApplicationInstance:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property allowsRunningApplicationSubstitution
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun allowsRunningApplicationSubstitution(): Boolean {
        val sel = ObjCRuntime.sel("allowsRunningApplicationSubstitution")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAllowsRunningApplicationSubstitution(value: Boolean) {
        val sel = ObjCRuntime.sel("setAllowsRunningApplicationSubstitution:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property arguments
    /** @return NSArray<NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun arguments(): MemorySegment {
        val sel = ObjCRuntime.sel("arguments")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setArguments(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setArguments:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property environment
    /** @return NSDictionary<NSString *,NSString *> * */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun environment(): MemorySegment {
        val sel = ObjCRuntime.sel("environment")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setEnvironment(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setEnvironment:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property appleEvent
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun appleEvent(): MemorySegment {
        val sel = ObjCRuntime.sel("appleEvent")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setAppleEvent(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setAppleEvent:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property architecture
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun architecture(): Int {
        val sel = ObjCRuntime.sel("architecture")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setArchitecture(value: Int) {
        val sel = ObjCRuntime.sel("setArchitecture:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property requiresUniversalLinks
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun requiresUniversalLinks(): Boolean {
        val sel = ObjCRuntime.sel("requiresUniversalLinks")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun setRequiresUniversalLinks(value: Boolean) {
        val sel = ObjCRuntime.sel("setRequiresUniversalLinks:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}

/** Required by Objective-C protocol NSCopying. */
fun NSWorkspaceOpenConfiguration.copyWithZone(zone: NSZonePointer): MemorySegment {
    val sel = ObjCRuntime.sel("copyWithZone:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, zone.segment) as MemorySegment
}
