@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: SCStreamDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
interface SCStreamDelegate {
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    // @optional
    fun stream_didStopWithError(stream: MemorySegment, error: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'stream:didStopWithError:' not implemented")

    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun outputVideoEffectDidStartForStream(stream: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outputVideoEffectDidStartForStream:' not implemented")

    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    // @optional
    fun outputVideoEffectDidStopForStream(stream: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'outputVideoEffectDidStopForStream:' not implemented")

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    // @optional
    fun streamDidBecomeActive(stream: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'streamDidBecomeActive:' not implemented")

    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 2, introducedSubminor = -1)
    // @optional
    fun streamDidBecomeInactive(stream: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'streamDidBecomeInactive:' not implemented")

}
