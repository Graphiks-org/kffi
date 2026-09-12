@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCRecordingOutput
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
open class SCRecordingOutput(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCRecordingOutput") } }

    }

    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun initWithConfiguration_delegate(recordingOutputConfiguration: MemorySegment, delegate: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithConfiguration:delegate:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, recordingOutputConfiguration, delegate) as MemorySegment
    }

    // @property recordedDuration
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun recordedDuration(): CMTime {
        val sel = ObjCRuntime.sel("recordedDuration")
        return CMTime(ObjCRuntime.msgSendStruct(CMTime.layout, ptr, sel))
    }

    // @property recordedFileSize
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun recordedFileSize(): Long {
        val sel = ObjCRuntime.sel("recordedFileSize")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }

}
