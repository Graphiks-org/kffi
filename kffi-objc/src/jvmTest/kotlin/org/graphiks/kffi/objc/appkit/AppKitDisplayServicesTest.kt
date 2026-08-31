package org.graphiks.kffi.objc.appkit

import java.lang.foreign.MemorySegment
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AppKitDisplayServicesTest {
    @Test
    fun enumerateReadsAtLeastOneActiveDisplayOnMacOS() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))

        val snapshots = AppKitDisplayServices.enumerate()

        assertTrue(snapshots.isNotEmpty())
        assertTrue(snapshots.all { it.pixelWidth > 0 && it.pixelHeight > 0 })
        val first = snapshots.first()
        val bounds = AppKitDisplayServices.bounds(first.id)
        assertTrue(bounds.width > 0 && bounds.height > 0)
        AppKitDisplayServices.currentMode(first.id).use { mode ->
            assertTrue(mode.pixelWidth > 0 && mode.pixelHeight > 0)
        }
    }

    @Test
    fun enumerateReturnsDetachedImmutablePixelSnapshots() {
        val native = RecordingDisplayNative(
            activeDisplays = intArrayOf(17, 29),
            pixels = mapOf(17 to (2560L to 1440L), 29 to (3840L to 2160L)),
        )

        val snapshots = AppKitDisplayServices.enumerate(native)

        assertEquals(
            listOf(
                CGDisplaySnapshot(17, 2560, 1440),
                CGDisplaySnapshot(29, 3840, 2160),
            ),
            snapshots,
        )
        assertEquals(listOf("active", "wide:17", "high:17", "wide:29", "high:29"), native.calls)
        assertFalse(
            CGDisplaySnapshot::class.java.declaredFields.any { it.type == MemorySegment::class.java },
        )
    }

    @Test
    fun copiedDisplayModeBalancesRetainAndReleaseAndCannotBeUsedAfterClose() {
        val native = RecordingDisplayNative(modeAddress = 0xCAFE)
        val mode = AppKitDisplayServices.currentMode(17, native)

        val retained = mode.copy()
        AppKitDisplayServices.setMode(29, retained, native)
        retained.close()
        retained.close()
        mode.close()

        assertEquals(1920, mode.pixelWidth)
        assertEquals(1080, mode.pixelHeight)
        assertEquals(
            listOf(
                "copyMode:17",
                "modeWide:51966",
                "modeHigh:51966",
                "retain:51966",
                "setMode:29:51966",
                "release:51966",
                "release:51966",
            ),
            native.calls,
        )
        assertFailsWith<IllegalStateException> {
            AppKitDisplayServices.setMode(29, retained, native)
        }
    }

    @Test
    fun captureIsReleasedOnExceptionalExit() {
        val native = RecordingDisplayNative()

        assertFailsWith<IllegalArgumentException> {
            AppKitDisplayServices.withCapturedDisplay(41, native) {
                throw IllegalArgumentException("stop")
            }
        }
        assertFailsWith<IllegalStateException> {
            AppKitDisplayServices.withCapturedDisplays(native) {
                throw IllegalStateException("stop all")
            }
        }

        assertEquals(
            listOf("capture:41", "releaseCapture:41", "captureAll", "releaseAll"),
            native.calls,
        )
    }

    @Test
    fun boundsAreDetachedFromTheNativeStruct() {
        val native = RecordingDisplayNative(bounds = CGDisplayBoundsSnapshot(10.0, 20.0, 800.0, 600.0))

        assertEquals(
            CGDisplayBoundsSnapshot(10.0, 20.0, 800.0, 600.0),
            AppKitDisplayServices.bounds(17, native),
        )
        assertEquals(listOf("bounds:17"), native.calls)
    }
}

private class RecordingDisplayNative(
    private val activeDisplays: IntArray = intArrayOf(),
    private val pixels: Map<Int, Pair<Long, Long>> = emptyMap(),
    private val modeAddress: Long = 1L,
    private val bounds: CGDisplayBoundsSnapshot = CGDisplayBoundsSnapshot(0.0, 0.0, 1.0, 1.0),
) : AppKitDisplayNative {
    val calls = mutableListOf<String>()

    override fun activeDisplays(): IntArray {
        calls += "active"
        return activeDisplays.copyOf()
    }

    override fun pixelWidth(displayId: Int): Long {
        calls += "wide:$displayId"
        return requireNotNull(pixels[displayId]).first
    }

    override fun pixelHeight(displayId: Int): Long {
        calls += "high:$displayId"
        return requireNotNull(pixels[displayId]).second
    }

    override fun bounds(displayId: Int): CGDisplayBoundsSnapshot {
        calls += "bounds:$displayId"
        return bounds
    }

    override fun copyDisplayMode(displayId: Int): Long {
        calls += "copyMode:$displayId"
        return modeAddress
    }

    override fun modePixelWidth(mode: Long): Long {
        calls += "modeWide:$mode"
        return 1920
    }

    override fun modePixelHeight(mode: Long): Long {
        calls += "modeHigh:$mode"
        return 1080
    }

    override fun retain(mode: Long) {
        calls += "retain:$mode"
    }

    override fun release(mode: Long) {
        calls += "release:$mode"
    }

    override fun setDisplayMode(displayId: Int, mode: Long) {
        calls += "setMode:$displayId:$mode"
    }

    override fun capture(displayId: Int) {
        calls += "capture:$displayId"
    }

    override fun releaseCapture(displayId: Int) {
        calls += "releaseCapture:$displayId"
    }

    override fun captureAll() {
        calls += "captureAll"
    }

    override fun releaseAll() {
        calls += "releaseAll"
    }
}
