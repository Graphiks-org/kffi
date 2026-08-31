package org.graphiks.kffi.objc.appkit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assumptions.assumeTrue

class ScreenCaptureControlPlaneTest {
    @Test
    fun macOsVersionParsesAndOrdersDetachedVersionValues() {
        assertEquals(MacOsVersion(13, 6, 4), MacOsVersion.parse("13.6.4"))
        assertTrue(MacOsVersion(14, 0) > MacOsVersion(13, 99))
        assertTrue(MacOsVersion.parse("15") > MacOsVersion(14, 9, 9))
    }

    @Test
    fun capabilitiesBelowMacOs13DoNotLoadScreenCaptureKitOrPreflightAccess() {
        val native = RecordingScreenCaptureNative(preflightAccess = true)

        val capability = ScreenCaptureControlPlanes.capability(MacOsVersion(12, 7), native)

        assertFalse(capability.supportsMacOs13Baseline)
        assertFalse(capability.preflightScreenCaptureAccess)
        assertFalse(capability.supportsContentSharingPicker)
        assertEquals(emptyList(), native.calls)
    }

    @Test
    fun capabilitiesAtMacOs13LoadOnlyThePassiveControlPlane() {
        val native = RecordingScreenCaptureNative(preflightAccess = false)

        val capability = ScreenCaptureControlPlanes.capability(MacOsVersion(13, 6), native)

        assertTrue(capability.supportsMacOs13Baseline)
        assertFalse(capability.preflightScreenCaptureAccess)
        assertFalse(capability.supportsContentSharingPicker)
        assertEquals(listOf("load", "preflight"), native.calls)
    }

    @Test
    fun pickerCapabilityIsRuntimeGatedAtMacOs14() {
        val native = RecordingScreenCaptureNative(preflightAccess = true)

        val capability = ScreenCaptureControlPlanes.capability(MacOsVersion(14, 0), native)

        assertTrue(capability.supportsMacOs13Baseline)
        assertTrue(capability.preflightScreenCaptureAccess)
        assertTrue(capability.supportsContentSharingPicker)
        assertEquals(listOf("load", "preflight"), native.calls)
    }

    @Test
    fun sourcesModelOnlyReportsCapabilitiesAndNeverEnumeratesOrCaptures() {
        val native = RecordingScreenCaptureNative(preflightAccess = true)

        val sources = ScreenCaptureSources.inspect(MacOsVersion(13, 0), native)

        assertTrue(sources.isPassive)
        assertTrue(sources.capability.supportsMacOs13Baseline)
        assertEquals(listOf("load", "preflight"), native.calls)
    }

    @Test
    fun runtimeCapabilityInspectionUsesOnlyTheNonPromptingPreflightQuery() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))

        val capability = ScreenCaptureControlPlanes.capability()

        assertEquals(MacOsVersion.current(), capability.macOsVersion)
        assertEquals(
            capability.macOsVersion.major >= ScreenCaptureControlPlanes.minimumMacOsMajor,
            capability.supportsMacOs13Baseline,
        )
    }
}

private class RecordingScreenCaptureNative(
    private val preflightAccess: Boolean,
) : ScreenCaptureControlPlaneNative {
    val calls = mutableListOf<String>()

    override fun loadScreenCaptureKit() {
        calls += "load"
    }

    override fun preflightScreenCaptureAccess(): Boolean {
        calls += "preflight"
        return preflightAccess
    }
}
