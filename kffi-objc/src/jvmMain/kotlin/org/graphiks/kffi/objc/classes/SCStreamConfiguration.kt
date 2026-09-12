@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: SCStreamConfiguration
 * Superclass: NSObject
 */
@PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
open class SCStreamConfiguration(override val ptr: MemorySegment) : NSObject(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("SCStreamConfiguration") } }

        @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
        fun streamConfigurationWithPreset(preset: SCStreamConfigurationPreset): MemorySegment {
            val sel = ObjCRuntime.sel("streamConfigurationWithPreset:")
            return ObjCRuntime.msgSend(ValueLayout.ADDRESS, _class, sel, preset.rawValue) as MemorySegment
        }

    }

    // @property width
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun width(): Long {
        val sel = ObjCRuntime.sel("width")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setWidth(value: Long) {
        val sel = ObjCRuntime.sel("setWidth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property height
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun height(): Long {
        val sel = ObjCRuntime.sel("height")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setHeight(value: Long) {
        val sel = ObjCRuntime.sel("setHeight:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property minimumFrameInterval
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun minimumFrameInterval(): CMTime {
        val sel = ObjCRuntime.sel("minimumFrameInterval")
        return CMTime(ObjCRuntime.msgSendStruct(CMTime.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setMinimumFrameInterval(value: CMTime) {
        val sel = ObjCRuntime.sel("setMinimumFrameInterval:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CMTime.layout))
    }

    // @property pixelFormat
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun pixelFormat(): Int {
        val sel = ObjCRuntime.sel("pixelFormat")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_INT, ptr, sel) as Int
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setPixelFormat(value: Int) {
        val sel = ObjCRuntime.sel("setPixelFormat:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property scalesToFit
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun scalesToFit(): Boolean {
        val sel = ObjCRuntime.sel("scalesToFit")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setScalesToFit(value: Boolean) {
        val sel = ObjCRuntime.sel("setScalesToFit:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property preservesAspectRatio
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun preservesAspectRatio(): Boolean {
        val sel = ObjCRuntime.sel("preservesAspectRatio")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setPreservesAspectRatio(value: Boolean) {
        val sel = ObjCRuntime.sel("setPreservesAspectRatio:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property streamName
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun streamName(): MemorySegment {
        val sel = ObjCRuntime.sel("streamName")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setStreamName(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setStreamName:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun streamNameAsString(): String = ObjCRuntime.toJavaString(streamName())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setStreamName(value: String) = setStreamName(ObjCRuntime.newNSString(Arena.global(), value))

    // @property showsCursor
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun showsCursor(): Boolean {
        val sel = ObjCRuntime.sel("showsCursor")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setShowsCursor(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowsCursor:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property showMouseClicks
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun showMouseClicks(): Boolean {
        val sel = ObjCRuntime.sel("showMouseClicks")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setShowMouseClicks(value: Boolean) {
        val sel = ObjCRuntime.sel("setShowMouseClicks:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property backgroundColor
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun backgroundColor(): CGColorRef {
        val sel = ObjCRuntime.sel("backgroundColor")
        return CGColorRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setBackgroundColor(value: CGColorRef) {
        val sel = ObjCRuntime.sel("setBackgroundColor:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property sourceRect
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun sourceRect(): CGRect {
        val sel = ObjCRuntime.sel("sourceRect")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setSourceRect(value: CGRect) {
        val sel = ObjCRuntime.sel("setSourceRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property destinationRect
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun destinationRect(): CGRect {
        val sel = ObjCRuntime.sel("destinationRect")
        return CGRect(ObjCRuntime.msgSendStruct(CGRect.layout, ptr, sel))
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setDestinationRect(value: CGRect) {
        val sel = ObjCRuntime.sel("setDestinationRect:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(value.segment, CGRect.layout))
    }

    // @property queueDepth
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun queueDepth(): Long {
        val sel = ObjCRuntime.sel("queueDepth")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setQueueDepth(value: Long) {
        val sel = ObjCRuntime.sel("setQueueDepth:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property colorMatrix
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun colorMatrix(): CFStringRef {
        val sel = ObjCRuntime.sel("colorMatrix")
        return CFStringRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setColorMatrix(value: CFStringRef) {
        val sel = ObjCRuntime.sel("setColorMatrix:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property colorSpaceName
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun colorSpaceName(): CFStringRef {
        val sel = ObjCRuntime.sel("colorSpaceName")
        return CFStringRef(ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment)
    }
    @PlatformAvailability(platform = "maccatalyst", introducedMajor = 18, introducedMinor = 2, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    open fun setColorSpaceName(value: CFStringRef) {
        val sel = ObjCRuntime.sel("setColorSpaceName:")
        ObjCRuntime.msgSend(null, ptr, sel, value.segment)
    }

    // @property capturesAudio
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun capturesAudio(): Boolean {
        val sel = ObjCRuntime.sel("capturesAudio")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setCapturesAudio(value: Boolean) {
        val sel = ObjCRuntime.sel("setCapturesAudio:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property sampleRate
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun sampleRate(): Long {
        val sel = ObjCRuntime.sel("sampleRate")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setSampleRate(value: Long) {
        val sel = ObjCRuntime.sel("setSampleRate:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property channelCount
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun channelCount(): Long {
        val sel = ObjCRuntime.sel("channelCount")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setChannelCount(value: Long) {
        val sel = ObjCRuntime.sel("setChannelCount:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property excludesCurrentProcessAudio
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun excludesCurrentProcessAudio(): Boolean {
        val sel = ObjCRuntime.sel("excludesCurrentProcessAudio")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 13, introducedMinor = 0, introducedSubminor = -1)
    open fun setExcludesCurrentProcessAudio(value: Boolean) {
        val sel = ObjCRuntime.sel("setExcludesCurrentProcessAudio:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property ignoreShadowsDisplay
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun ignoreShadowsDisplay(): Boolean {
        val sel = ObjCRuntime.sel("ignoreShadowsDisplay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setIgnoreShadowsDisplay(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoreShadowsDisplay:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property ignoreShadowsSingleWindow
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun ignoreShadowsSingleWindow(): Boolean {
        val sel = ObjCRuntime.sel("ignoreShadowsSingleWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setIgnoreShadowsSingleWindow(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoreShadowsSingleWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property captureResolution
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun captureResolution(): SCCaptureResolutionType {
        val sel = ObjCRuntime.sel("captureResolution")
        return SCCaptureResolutionType(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setCaptureResolution(value: SCCaptureResolutionType) {
        val sel = ObjCRuntime.sel("setCaptureResolution:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property capturesShadowsOnly
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun capturesShadowsOnly(): Boolean {
        val sel = ObjCRuntime.sel("capturesShadowsOnly")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setCapturesShadowsOnly(value: Boolean) {
        val sel = ObjCRuntime.sel("setCapturesShadowsOnly:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property shouldBeOpaque
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun shouldBeOpaque(): Boolean {
        val sel = ObjCRuntime.sel("shouldBeOpaque")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setShouldBeOpaque(value: Boolean) {
        val sel = ObjCRuntime.sel("setShouldBeOpaque:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property ignoreGlobalClipDisplay
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun ignoreGlobalClipDisplay(): Boolean {
        val sel = ObjCRuntime.sel("ignoreGlobalClipDisplay")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setIgnoreGlobalClipDisplay(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoreGlobalClipDisplay:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property ignoreGlobalClipSingleWindow
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun ignoreGlobalClipSingleWindow(): Boolean {
        val sel = ObjCRuntime.sel("ignoreGlobalClipSingleWindow")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setIgnoreGlobalClipSingleWindow(value: Boolean) {
        val sel = ObjCRuntime.sel("setIgnoreGlobalClipSingleWindow:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property presenterOverlayPrivacyAlertSetting
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun presenterOverlayPrivacyAlertSetting(): SCPresenterOverlayAlertSetting {
        val sel = ObjCRuntime.sel("presenterOverlayPrivacyAlertSetting")
        return SCPresenterOverlayAlertSetting(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 0, introducedSubminor = -1)
    open fun setPresenterOverlayPrivacyAlertSetting(value: SCPresenterOverlayAlertSetting) {
        val sel = ObjCRuntime.sel("setPresenterOverlayPrivacyAlertSetting:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

    // @property includeChildWindows
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 2, introducedSubminor = -1)
    open fun includeChildWindows(): Boolean {
        val sel = ObjCRuntime.sel("includeChildWindows")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 14, introducedMinor = 2, introducedSubminor = -1)
    open fun setIncludeChildWindows(value: Boolean) {
        val sel = ObjCRuntime.sel("setIncludeChildWindows:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property captureMicrophone
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun captureMicrophone(): Boolean {
        val sel = ObjCRuntime.sel("captureMicrophone")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_BOOLEAN, ptr, sel) as Boolean
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setCaptureMicrophone(value: Boolean) {
        val sel = ObjCRuntime.sel("setCaptureMicrophone:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    // @property microphoneCaptureDeviceID
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun microphoneCaptureDeviceID(): MemorySegment {
        val sel = ObjCRuntime.sel("microphoneCaptureDeviceID")
        return ObjCRuntime.msgSend(ValueLayout.ADDRESS, ptr, sel) as MemorySegment
    }
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setMicrophoneCaptureDeviceID(value: MemorySegment) {
        val sel = ObjCRuntime.sel("setMicrophoneCaptureDeviceID:")
        ObjCRuntime.msgSend(null, ptr, sel, value)
    }

    /** Convenience overload — returns Kotlin [String] by converting the NSString via UTF8String. */
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun microphoneCaptureDeviceIDAsString(): String = ObjCRuntime.toJavaString(microphoneCaptureDeviceID())

    /** Convenience overload — accepts Kotlin [String] for the NSString property. */
    @PlatformAvailability(platform = "maccatalyst", unavailable = true)
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setMicrophoneCaptureDeviceID(value: String) = setMicrophoneCaptureDeviceID(ObjCRuntime.newNSString(Arena.global(), value))

    // @property captureDynamicRange
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun captureDynamicRange(): SCCaptureDynamicRange {
        val sel = ObjCRuntime.sel("captureDynamicRange")
        return SCCaptureDynamicRange(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }
    @PlatformAvailability(platform = "macos", introducedMajor = 15, introducedMinor = 0, introducedSubminor = -1)
    open fun setCaptureDynamicRange(value: SCCaptureDynamicRange) {
        val sel = ObjCRuntime.sel("setCaptureDynamicRange:")
        ObjCRuntime.msgSend(null, ptr, sel, value.rawValue)
    }

}
