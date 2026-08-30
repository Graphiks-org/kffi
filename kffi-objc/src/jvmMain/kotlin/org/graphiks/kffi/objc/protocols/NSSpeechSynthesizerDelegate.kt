@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM interface for Objective-C protocol: NSSpeechSynthesizerDelegate
 * Inherits protocols: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
interface NSSpeechSynthesizerDelegate {
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    // @optional
    fun speechSynthesizer_didFinishSpeaking(sender: MemorySegment, finishedSpeaking: Boolean): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'speechSynthesizer:didFinishSpeaking:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    // @optional
    fun speechSynthesizer_willSpeakWord_ofString(sender: MemorySegment, characterRange: NSRange, string: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'speechSynthesizer:willSpeakWord:ofString:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    // @optional
    fun speechSynthesizer_willSpeakPhoneme(sender: MemorySegment, phonemeOpcode: Short): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'speechSynthesizer:willSpeakPhoneme:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun speechSynthesizer_didEncounterErrorAtIndex_ofString_message(sender: MemorySegment, characterIndex: Long, string: MemorySegment, message: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'speechSynthesizer:didEncounterErrorAtIndex:ofString:message:' not implemented")

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    // @optional
    fun speechSynthesizer_didEncounterSyncMessage(sender: MemorySegment, message: MemorySegment): Unit =
        throw UnsupportedOperationException("Optional ObjC method 'speechSynthesizer:didEncounterSyncMessage:' not implemented")

}
