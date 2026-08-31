@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc

import java.lang.invoke.*
import java.lang.foreign.*
import java.lang.foreign.MemoryLayout.PathElement.*

/**
 * Kotlin/JVM wrapper for Objective-C class: GCDualSenseAdaptiveTrigger
 * Superclass: GCControllerButtonInput
 */
@PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
@PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
@PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
open class GCDualSenseAdaptiveTrigger(override val ptr: MemorySegment) : GCControllerButtonInput(ptr) {
    companion object {
        private val _class: MemorySegment by lazy { LOOKUP.let { ObjCRuntime.getClass("GCDualSenseAdaptiveTrigger") } }

    }

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun setModeSlopeFeedbackWithStartPosition_endPosition_startStrength_endStrength(startPosition: Float, endPosition: Float, startStrength: Float, endStrength: Float): Unit {
        val sel = ObjCRuntime.sel("setModeSlopeFeedbackWithStartPosition:endPosition:startStrength:endStrength:")
        ObjCRuntime.msgSend(null, ptr, sel, startPosition, endPosition, startStrength, endStrength)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun setModeFeedbackWithStartPosition_resistiveStrength(startPosition: Float, resistiveStrength: Float): Unit {
        val sel = ObjCRuntime.sel("setModeFeedbackWithStartPosition:resistiveStrength:")
        ObjCRuntime.msgSend(null, ptr, sel, startPosition, resistiveStrength)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun setModeFeedbackWithResistiveStrengths(positionalResistiveStrengths: GCDualSenseAdaptiveTriggerPositionalResistiveStrengths): Unit {
        val sel = ObjCRuntime.sel("setModeFeedbackWithResistiveStrengths:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(positionalResistiveStrengths.segment, GCDualSenseAdaptiveTriggerPositionalResistiveStrengths.layout))
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun setModeWeaponWithStartPosition_endPosition_resistiveStrength(startPosition: Float, endPosition: Float, resistiveStrength: Float): Unit {
        val sel = ObjCRuntime.sel("setModeWeaponWithStartPosition:endPosition:resistiveStrength:")
        ObjCRuntime.msgSend(null, ptr, sel, startPosition, endPosition, resistiveStrength)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun setModeVibrationWithStartPosition_amplitude_frequency(startPosition: Float, amplitude: Float, frequency: Float): Unit {
        val sel = ObjCRuntime.sel("setModeVibrationWithStartPosition:amplitude:frequency:")
        ObjCRuntime.msgSend(null, ptr, sel, startPosition, amplitude, frequency)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 12, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 15, introducedMinor = 4, introducedSubminor = -1)
    open fun setModeVibrationWithAmplitudes_frequency(positionalAmplitudes: GCDualSenseAdaptiveTriggerPositionalAmplitudes, frequency: Float): Unit {
        val sel = ObjCRuntime.sel("setModeVibrationWithAmplitudes:frequency:")
        ObjCRuntime.msgSend(null, ptr, sel, ObjCRuntime.ObjCStructArg(positionalAmplitudes.segment, GCDualSenseAdaptiveTriggerPositionalAmplitudes.layout), frequency)
    }

    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun setModeOff(): Unit {
        val sel = ObjCRuntime.sel("setModeOff")
        ObjCRuntime.msgSend(null, ptr, sel)
    }

    // @property mode
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun mode(): GCDualSenseAdaptiveTriggerMode {
        val sel = ObjCRuntime.sel("mode")
        return GCDualSenseAdaptiveTriggerMode(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property status
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun status(): GCDualSenseAdaptiveTriggerStatus {
        val sel = ObjCRuntime.sel("status")
        return GCDualSenseAdaptiveTriggerStatus(ObjCRuntime.msgSend(ValueLayout.JAVA_LONG, ptr, sel) as Long)
    }

    // @property armPosition
    @PlatformAvailability(platform = "ios", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    @PlatformAvailability(platform = "macos", introducedMajor = 11, introducedMinor = 3, introducedSubminor = -1)
    @PlatformAvailability(platform = "tvos", introducedMajor = 14, introducedMinor = 5, introducedSubminor = -1)
    open fun armPosition(): Float {
        val sel = ObjCRuntime.sel("armPosition")
        return ObjCRuntime.msgSend(ValueLayout.JAVA_FLOAT, ptr, sel) as Float
    }

}
