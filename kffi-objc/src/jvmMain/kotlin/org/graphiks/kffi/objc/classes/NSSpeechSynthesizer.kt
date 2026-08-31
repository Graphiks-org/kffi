@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: NSSpeechSynthesizer
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "ios", unavailable = true)
@PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
open class NSSpeechSynthesizer(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("NSSpeechSynthesizer") } }

        /** @return NSDictionary<NSVoiceAttributeKey,id> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
        fun attributesForVoice(voice: MemorySegment): MemorySegment {
            val sel = ObjCRuntime.sel("attributesForVoice:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, voice) as MemorySegment
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
        fun isAnyApplicationSpeaking(): Boolean {
            val sel = ObjCRuntime.sel("isAnyApplicationSpeaking")
            return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, _class, sel) as Boolean
        }

        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
        fun defaultVoice(): MemorySegment {
            val sel = ObjCRuntime.sel("defaultVoice")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

        /** @return NSArray<NSSpeechSynthesizerVoiceName> * */
        @PlatformAvailability(platform = "ios", unavailable = true)
        @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
        fun availableVoices(): MemorySegment {
            val sel = ObjCRuntime.sel("availableVoices")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel) as MemorySegment
        }

    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun initWithVoice(voice: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("initWithVoice:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, voice) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun startSpeakingString(string: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("startSpeakingString:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, string) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    fun startSpeakingString(string: String): Boolean = startSpeakingString(ObjCRuntime.newNSString(Arena.global(), string))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun startSpeakingString_toURL(string: MemorySegment, url: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("startSpeakingString:toURL:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, string, url) as Boolean
    }

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    fun startSpeakingString_toURL(string: String, url: MemorySegment): Boolean = startSpeakingString_toURL(ObjCRuntime.newNSString(Arena.global(), string), url)

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun stopSpeaking(): Unit {
        val sel = ObjCRuntime.sel("stopSpeaking")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun stopSpeakingAtBoundary(boundary: NSSpeechBoundary): Unit {
        val sel = ObjCRuntime.sel("stopSpeakingAtBoundary:")
        ObjCRuntime.msgSend(null, ptr, sel, boundary.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun pauseSpeakingAtBoundary(boundary: NSSpeechBoundary): Unit {
        val sel = ObjCRuntime.sel("pauseSpeakingAtBoundary:")
        ObjCRuntime.msgSend(null, ptr, sel, boundary.rawValue)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun continueSpeaking(): Unit {
        val sel = ObjCRuntime.sel("continueSpeaking")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun voice(): MemorySegment {
        val sel = ObjCRuntime.sel("voice")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun setVoice(voice: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setVoice:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, voice) as Boolean
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun addSpeechDictionary(speechDictionary: MemorySegment): Unit {
        val sel = ObjCRuntime.sel("addSpeechDictionary:")
        ObjCRuntime.msgSend(null, ptr, sel, speechDictionary)
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun phonemesFromText(text: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("phonemesFromText:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, text) as MemorySegment
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun phonemesFromTextAsString(text: MemorySegment): String = ObjCRuntime.toJavaString(phonemesFromText(text))

    /** Convenience overload — accepts Kotlin [String] for NSString parameters. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun phonemesFromText(text: String): MemorySegment = phonemesFromText(ObjCRuntime.newNSString(Arena.global(), text))

    /** Convenience overload — [String] parameters and [String] return type. */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    fun phonemesFromTextAsString(text: String): String = ObjCRuntime.toJavaString(phonemesFromText(ObjCRuntime.newNSString(Arena.global(), text)))

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun objectForProperty_error(property: MemorySegment, outError: MemorySegment): MemorySegment {
        val sel = ObjCRuntime.sel("objectForProperty:error:")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel, property, outError) as MemorySegment
    }

    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setObject_forProperty_error(`object`: MemorySegment, property: MemorySegment, outError: MemorySegment): Boolean {
        val sel = ObjCRuntime.sel("setObject:forProperty:error:")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel, `object`, property, outError) as Boolean
    }

    // @property speaking
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun isSpeaking(): Boolean {
        val sel = ObjCRuntime.sel("isSpeaking")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }

    // @property delegate
    /** @return id<NSSpeechSynthesizerDelegate> */
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun delegate(): MemorySegment {
        val sel = ObjCRuntime.sel("delegate")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun setDelegate(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setDelegate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property rate
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun rate(): Float {
        val sel = ObjCRuntime.sel("rate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setRate(value: Float) {
        val sel = ObjCRuntime.sel("setRate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property volume
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun volume(): Float {
        val sel = ObjCRuntime.sel("volume")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 5, introducedSubminor = -1)
    open fun setVolume(value: Float) {
        val sel = ObjCRuntime.sel("setVolume:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property usesFeedbackWindow
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun usesFeedbackWindow(): Boolean {
        val sel = ObjCRuntime.sel("usesFeedbackWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "ios", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 10, introducedMinor = 3, introducedSubminor = -1, deprecated = true, deprecatedMajor = 14, deprecatedMinor = 0, deprecatedSubminor = -1, message = "Use AVSpeechSynthesizer in AVFoundation instead")
    open fun setUsesFeedbackWindow(value: Boolean) {
        val sel = ObjCRuntime.sel("setUsesFeedbackWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

}
