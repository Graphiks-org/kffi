@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSRunningApplication
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
open class NSRunningApplication(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSRunningApplication") } }

        /** @return NSArray<NSRunningApplication *> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun runningApplicationsWithBundleIdentifier(bundleIdentifier: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("runningApplicationsWithBundleIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, bundleIdentifier) as MemorySegment
        }

        /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
        @PlatformAvailability(platform = "ios", unavailable = true)
        fun runningApplicationsWithBundleIdentifier(bundleIdentifier: String): MemorySegment = runningApplicationsWithBundleIdentifier(ObjCRuntime.newNSString(Arena.global(), bundleIdentifier))

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun runningApplicationWithProcessIdentifier(pid: Int): MemorySegment {
            val sel = ObjCRuntime.sel("runningApplicationWithProcessIdentifier:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, pid) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun terminateAutomaticallyTerminableApplications(): Unit {
            val sel = ObjCRuntime.sel("terminateAutomaticallyTerminableApplications")
            ObjCRuntime.msgSend(null, _class, sel)
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        fun currentApplication(): MemorySegment {
            val sel = ObjCRuntime.sel("currentApplication")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun hide(): Boolean {
        val sel = ObjCRuntime.sel("hide")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun unhide(): Boolean {
        val sel = ObjCRuntime.sel("unhide")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun activateFromApplication_options(application: MemorySegment, options: NSApplicationActivationOptions): Boolean {
        val sel = ObjCRuntime.sel("activateFromApplication:options:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, application, options.rawValue) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun activateWithOptions(options: NSApplicationActivationOptions): Boolean {
        val sel = ObjCRuntime.sel("activateWithOptions:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, options.rawValue) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun terminate(): Boolean {
        val sel = ObjCRuntime.sel("terminate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun forceTerminate(): Boolean {
        val sel = ObjCRuntime.sel("forceTerminate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property terminated
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isTerminated(): Boolean {
        val sel = ObjCRuntime.sel("isTerminated")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property finishedLaunching
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isFinishedLaunching(): Boolean {
        val sel = ObjCRuntime.sel("isFinishedLaunching")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property hidden
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isHidden(): Boolean {
        val sel = ObjCRuntime.sel("isHidden")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property active
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun isActive(): Boolean {
        val sel = ObjCRuntime.sel("isActive")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property ownsMenuBar
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    open fun ownsMenuBar(): Boolean {
        val sel = ObjCRuntime.sel("ownsMenuBar")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property activationPolicy
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun activationPolicy(): NSApplicationActivationPolicy {
        val sel = ObjCRuntime.sel("activationPolicy")
        return NSApplicationActivationPolicy(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property localizedName
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedName(): MemorySegment {
        val sel = ObjCRuntime.sel("localizedName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun localizedNameAsString(): String = ObjCRuntime.toJavaString(localizedName())

    // @property bundleIdentifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bundleIdentifier(): MemorySegment {
        val sel = ObjCRuntime.sel("bundleIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bundleIdentifierAsString(): String = ObjCRuntime.toJavaString(bundleIdentifier())

    // @property bundleURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun bundleURL(): MemorySegment {
        val sel = ObjCRuntime.sel("bundleURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property executableURL
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun executableURL(): MemorySegment {
        val sel = ObjCRuntime.sel("executableURL")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property processIdentifier
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun processIdentifier(): Int {
        val sel = ObjCRuntime.sel("processIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

    // @property launchDate
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun launchDate(): MemorySegment {
        val sel = ObjCRuntime.sel("launchDate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property icon
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun icon(): MemorySegment {
        val sel = ObjCRuntime.sel("icon")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property executableArchitecture
    @PlatformAvailability(platform = "ios", unavailable = true)
    open fun executableArchitecture(): Long {
        val sel = ObjCRuntime.sel("executableArchitecture")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
