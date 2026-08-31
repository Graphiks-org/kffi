@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSProcessInfo
 * Superclass: NSObject
 */
open class NSProcessInfo(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSProcessInfo") } }

        fun processInfo(): MemorySegment {
            val sel = ObjCRuntime.sel("processInfo")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystem always returns NSMACHOperatingSystem, use -operatingSystemVersion or -isOperatingSystemAtLeastVersion: instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "-operatingSystem always returns NSMACHOperatingSystem, use -operatingSystemVersion or -isOperatingSystemAtLeastVersion: instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystem always returns NSMACHOperatingSystem, use -operatingSystemVersion or -isOperatingSystemAtLeastVersion: instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystem always returns NSMACHOperatingSystem, use -operatingSystemVersion or -isOperatingSystemAtLeastVersion: instead")
    open fun operatingSystem(): Long {
        val sel = ObjCRuntime.sel("operatingSystem")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    open fun operatingSystemName(): MemorySegment {
        val sel = ObjCRuntime.sel("operatingSystemName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 8, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 10, deprecatedMinor = 10, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 9, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1, deprecated = true, deprecatedMajor = 2, deprecatedMinor = 0, deprecatedSubminor = -1, message = "-operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString instead")
    fun operatingSystemNameAsString(): String = ObjCRuntime.toJavaString(operatingSystemName())

    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun isOperatingSystemAtLeastVersion(version: NSOperatingSystemVersion): Boolean {
        val sel = ObjCRuntime.sel("isOperatingSystemAtLeastVersion:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, ObjCRuntime.ObjCStructArg(version.segment, NSOperatingSystemVersion.layout)) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun disableSuddenTermination(): Unit {
        val sel = ObjCRuntime.sel("disableSuddenTermination")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun enableSuddenTermination(): Unit {
        val sel = ObjCRuntime.sel("enableSuddenTermination")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun disableAutomaticTermination(reason: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("disableAutomaticTermination:")
        ObjCRuntime.msgSend(null, ptr, sel, reason)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    fun disableAutomaticTermination(reason: String): Unit = disableAutomaticTermination(ObjCRuntime.newNSString(Arena.global(), reason))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun enableAutomaticTermination(reason: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("enableAutomaticTermination:")
        ObjCRuntime.msgSend(null, ptr, sel, reason)
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    fun enableAutomaticTermination(reason: String): Unit = enableAutomaticTermination(ObjCRuntime.newNSString(Arena.global(), reason))

    // @property environment
    /** @return NSDictionary<NSString *,NSString *> * */
    open fun environment(): MemorySegment {
        val sel = ObjCRuntime.sel("environment")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property arguments
    /** @return NSArray<NSString *> * */
    open fun arguments(): MemorySegment {
        val sel = ObjCRuntime.sel("arguments")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    // @property hostName
    open fun hostName(): MemorySegment {
        val sel = ObjCRuntime.sel("hostName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun hostNameAsString(): String = ObjCRuntime.toJavaString(hostName())

    // @property processName
    open fun processName(): MemorySegment {
        val sel = ObjCRuntime.sel("processName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    open fun setProcessName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setProcessName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun processNameAsString(): String = ObjCRuntime.toJavaString(processName())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    open fun setProcessName(value: String) = setProcessName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property processIdentifier
    open fun processIdentifier(): Int {
        val sel = ObjCRuntime.sel("processIdentifier")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }

    // @property globallyUniqueString
    open fun globallyUniqueString(): MemorySegment {
        val sel = ObjCRuntime.sel("globallyUniqueString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun globallyUniqueStringAsString(): String = ObjCRuntime.toJavaString(globallyUniqueString())

    // @property operatingSystemVersionString
    open fun operatingSystemVersionString(): MemorySegment {
        val sel = ObjCRuntime.sel("operatingSystemVersionString")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    open fun operatingSystemVersionStringAsString(): String = ObjCRuntime.toJavaString(operatingSystemVersionString())

    // @property operatingSystemVersion
    @PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun operatingSystemVersion(): NSOperatingSystemVersion {
        val sel = ObjCRuntime.sel("operatingSystemVersion")
        return NSOperatingSystemVersion(ObjCRuntime.msgSendStruct(NSOperatingSystemVersion.layout, ptr, sel))
    }

    // @property processorCount
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun processorCount(): Long {
        val sel = ObjCRuntime.sel("processorCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property activeProcessorCount
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun activeProcessorCount(): Long {
        val sel = ObjCRuntime.sel("activeProcessorCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property physicalMemory
    @PlatformAvailability(platform = "ios", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun physicalMemory(): Long {
        val sel = ObjCRuntime.sel("physicalMemory")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

    // @property systemUptime
    @PlatformAvailability(platform = "ios", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 6, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
    @PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
    open fun systemUptime(): Double {
        val sel = ObjCRuntime.sel("systemUptime")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_DOUBLE, ptr, sel) as Double
    }

    // @property automaticTerminationSupportEnabled
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun automaticTerminationSupportEnabled(): Boolean {
        val sel = ObjCRuntime.sel("automaticTerminationSupportEnabled")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 7, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", unavailable = true)
    @PlatformAvailability(platform = "watchos", unavailable = true)
    open fun setAutomaticTerminationSupportEnabled(value: Boolean) {
        val sel = ObjCRuntime.sel("setAutomaticTerminationSupportEnabled:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }


    // ── Instance variables (direct field access not supported via Panama) ──
    // ivar: environment: MemorySegment
    // ivar: arguments: MemorySegment
    // ivar: hostName: MemorySegment
    // ivar: name: MemorySegment
    // ivar: automaticTerminationOptOutCounter: Long
}

// ── Category: NSProcessInfoActivity on NSProcessInfo ─────────────────────────────────────────

/** @return id<NSObject> */
@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.beginActivityWithOptions_reason(options: NSActivityOptions, reason: MemorySegment): MemorySegment {
    val sel = ObjCRuntime.sel("beginActivityWithOptions:reason:")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel, options.rawValue, reason) as MemorySegment
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.endActivity(activity: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("endActivity:")
    ObjCRuntime.msgSend(null, this.ptr, sel, activity)
}

@PlatformAvailability(platform = "ios", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 9, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.performActivityWithOptions_reason_usingBlock(options: NSActivityOptions, reason: MemorySegment, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performActivityWithOptions:reason:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, options.rawValue, reason, block)
}

@PlatformAvailability(platform = "ios", introducedMajor = 8, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", unavailable = true)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.performExpiringActivityWithReason_usingBlock(reason: MemorySegment, block: MemorySegment): Unit {
    val sel = ObjCRuntime.sel("performExpiringActivityWithReason:usingBlock:")
    ObjCRuntime.msgSend(null, this.ptr, sel, reason, block)
}

// ── Category: NSUserInformation on NSProcessInfo ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSProcessInfo.userName(): MemorySegment {
    val sel = ObjCRuntime.sel("userName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 12, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", unavailable = true)
@PlatformAvailability(platform = "watchos", unavailable = true)
fun NSProcessInfo.fullUserName(): MemorySegment {
    val sel = ObjCRuntime.sel("fullUserName")
    return ObjCRuntime.msgSend(ValueLayout.ADDRESS, this.ptr, sel) as MemorySegment
}

// ── Category: NSProcessInfoThermalState on NSProcessInfo ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 10, introducedSubminor = 3)
@PlatformAvailability(platform = "tvos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 4, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.thermalState(): NSProcessInfoThermalState {
    val sel = ObjCRuntime.sel("thermalState")
    return NSProcessInfoThermalState(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, this.ptr, sel) as Long)
}

// ── Category: NSProcessInfoPowerState on NSProcessInfo ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 9, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 2, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.isLowPowerModeEnabled(): Boolean {
    val sel = ObjCRuntime.sel("isLowPowerModeEnabled")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

// ── Category: NSProcessInfoPlatform on NSProcessInfo ─────────────────────────────────────────

@PlatformAvailability(platform = "ios", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 15, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 6, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.isMacCatalystApp(): Boolean {
    val sel = ObjCRuntime.sel("isMacCatalystApp")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 7, introducedMinor = 0, introducedSubminor = -1)
fun NSProcessInfo.isiOSAppOnMac(): Boolean {
    val sel = ObjCRuntime.sel("isiOSAppOnMac")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}

@PlatformAvailability(platform = "ios", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "watchos", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 26, introducedMinor = 1, introducedSubminor = -1)
fun NSProcessInfo.isiOSAppOnVision(): Boolean {
    val sel = ObjCRuntime.sel("isiOSAppOnVision")
    return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, this.ptr, sel) as Boolean
}
