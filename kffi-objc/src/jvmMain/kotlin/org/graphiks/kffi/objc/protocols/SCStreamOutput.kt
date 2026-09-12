@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: SCStreamOutput
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
interface SCStreamOutput {
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    // @optional
    fun stream_didOutputSampleBuffer_ofType(stream: MemorySegment, sampleBuffer: CMSampleBufferRef, type: SCStreamOutputType): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'stream:didOutputSampleBuffer:ofType:' not implemented")

}
