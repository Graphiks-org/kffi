@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CGPreflightScreenCaptureAccess

/** A detached macOS version that can be compared without retaining native state. */
data class MacOsVersion(
    val major: Int,
    val minor: Int = 0,
    val patch: Int = 0,
) : Comparable<MacOsVersion> {
    init {
        require(major >= 0) { "macOS major version must be non-negative" }
        require(minor >= 0) { "macOS minor version must be non-negative" }
        require(patch >= 0) { "macOS patch version must be non-negative" }
    }

    override fun compareTo(other: MacOsVersion): Int = compareValuesBy(
        this,
        other,
        MacOsVersion::major,
        MacOsVersion::minor,
        MacOsVersion::patch,
    )

    companion object {
        /** Reads the JVM's macOS version property into a detached value. */
        fun current(): MacOsVersion = parse(System.getProperty("os.version", "0"))

        /** Parses the `major[.minor[.patch]]` format returned by macOS. */
        fun parse(value: String): MacOsVersion {
            val components = value.split('.')
            require(components.size in 1..3 && components.all { it.isNotEmpty() && it.all(Char::isDigit) }) {
                "Unsupported macOS version: $value"
            }
            return MacOsVersion(
                major = components[0].toInt(),
                minor = components.getOrElse(1) { "0" }.toInt(),
                patch = components.getOrElse(2) { "0" }.toInt(),
            )
        }
    }
}

/**
 * Passive ScreenCaptureKit capability information.
 *
 * Reading this value never enumerates shareable content, starts a stream, captures a screenshot,
 * presents a picker, or requests Screen Recording access. The access bit comes exclusively from
 * `CGPreflightScreenCaptureAccess`, which is a non-prompting CoreGraphics query.
 */
data class ScreenCaptureCapability(
    val macOsVersion: MacOsVersion,
    val supportsMacOs13Baseline: Boolean,
    val preflightScreenCaptureAccess: Boolean,
    val supportsContentSharingPicker: Boolean,
)

/**
 * Passive source discovery model for the ScreenCaptureKit control plane.
 *
 * It intentionally has no operation that calls `SCShareableContent`, starts `SCStream`, invokes
 * `SCScreenshotManager`, presents a picker, or requests TCC Screen Recording permission.
 */
data class ScreenCaptureSources(
    val capability: ScreenCaptureCapability,
) {
    /** This model only reports capability; it never enumerates or captures sources. */
    val isPassive: Boolean = true

    companion object {
        /** Inspects the current process without prompting for Screen Recording access. */
        fun inspect(): ScreenCaptureSources = ScreenCaptureSources(ScreenCaptureControlPlanes.capability())

        internal fun inspect(
            macOsVersion: MacOsVersion,
            native: ScreenCaptureControlPlaneNative,
        ): ScreenCaptureSources = ScreenCaptureSources(ScreenCaptureControlPlanes.capability(macOsVersion, native))
    }
}

/** Passive, macOS 13+ ScreenCaptureKit control-plane checks. */
object ScreenCaptureControlPlanes {
    const val minimumMacOsMajor: Int = 13
    private const val contentSharingPickerMacOsMajor: Int = 14

    /**
     * Reads ScreenCaptureKit capability without causing a Screen Recording prompt.
     *
     * The framework is loaded only after the macOS 13 runtime guard. The picker capability is
     * strictly a macOS 14+ flag; no picker class is resolved or invoked on older systems.
     */
    fun capability(): ScreenCaptureCapability = capability(
        macOsVersion = MacOsVersion.current(),
        native = CoreGraphicsScreenCaptureControlPlaneNative,
    )

    internal fun capability(
        macOsVersion: MacOsVersion,
        native: ScreenCaptureControlPlaneNative,
    ): ScreenCaptureCapability {
        val supportsBaseline = macOsVersion.major >= minimumMacOsMajor
        if (!supportsBaseline) {
            return ScreenCaptureCapability(
                macOsVersion = macOsVersion,
                supportsMacOs13Baseline = false,
                preflightScreenCaptureAccess = false,
                supportsContentSharingPicker = false,
            )
        }

        // Loading the framework is not a TCC request. Keep it after the runtime guard and before
        // any future Objective-C class lookup in this control plane.
        native.loadScreenCaptureKit()
        return ScreenCaptureCapability(
            macOsVersion = macOsVersion,
            supportsMacOs13Baseline = true,
            preflightScreenCaptureAccess = native.preflightScreenCaptureAccess(),
            supportsContentSharingPicker = macOsVersion.major >= contentSharingPickerMacOsMajor,
        )
    }
}

internal interface ScreenCaptureControlPlaneNative {
    fun loadScreenCaptureKit()
    fun preflightScreenCaptureAccess(): Boolean
}

private object CoreGraphicsScreenCaptureControlPlaneNative : ScreenCaptureControlPlaneNative {
    override fun loadScreenCaptureKit() {
        ScreenCaptureKitFramework.ensureLoaded()
    }

    override fun preflightScreenCaptureAccess(): Boolean = CGPreflightScreenCaptureAccess()
}

private object ScreenCaptureKitFramework {
    private val loaded: Unit by lazy {
        System.load("/System/Library/Frameworks/ScreenCaptureKit.framework/ScreenCaptureKit")
    }

    fun ensureLoaded() {
        loaded
    }
}
