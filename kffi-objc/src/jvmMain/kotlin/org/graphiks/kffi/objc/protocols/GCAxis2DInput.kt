@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: GCAxis2DInput
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
@PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
interface GCAxis2DInput {
    /** @return void (^)(__kindof id<GCPhysicalInputElement>  _Nonnull __strong, id<GCAxis2DInput>  _Nonnull __strong, GCPoint2) */
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun valueDidChangeHandler(): MemorySegment

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun setValueDidChangeHandler(valueDidChangeHandler: MemorySegment): Unit

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun value(): GCPoint2

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun isAnalog(): Boolean

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun canWrap(): Boolean

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun lastValueTimestamp(): Double

    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun lastValueLatency(): Double

    /** @return NSSet<id<GCPhysicalInputSource>> * */
    @PlatformAvailability(platform = "ios", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 17, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "xros", introducedMajor = 1, introducedMinor = 1, introducedSubminor = -1)
    fun sources(): MemorySegment

}
