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
        assertEquals(51966L, mode.modeIdentity)
        assertEquals(60.0, mode.refreshRateHz)
        assertEquals(0L, mode.ioFlags)
        assertEquals(
            listOf(
                "copyMode:17",
                "modeWide:51966",
                "modeHigh:51966",
                "modeIdentity:51966",
                "modeRefresh:51966",
                "modeIoFlags:51966",
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

    @Test
    fun allModesCopiesEveryModeThenReleasesTheNativeArray() {
        val native = RecordingDisplayNative(
            allModes = listOf(
                0x100L to (2560L to 1440L),
                0x200L to (1920L to 1080L),
            ),
            refreshRates = mapOf(0x100L to 120.0, 0x200L to 0.0),
            ioFlags = mapOf(0x100L to 9L, 0x200L to 4L),
        )

        assertEquals(
            listOf(
                CGDisplayModeSnapshot(512, 1920, 1080, null, 4),
                CGDisplayModeSnapshot(256, 2560, 1440, 120.0, 9),
            ),
            AppKitDisplayServices.allModes(17, native),
        )
        assertEquals(
            listOf(
                "copyAllModes:17",
                "count:48879",
                "modeAt:48879:0",
                "modeIdentity:256",
                "modeWide:256",
                "modeHigh:256",
                "modeRefresh:256",
                "modeIoFlags:256",
                "modeAt:48879:1",
                "modeIdentity:512",
                "modeWide:512",
                "modeHigh:512",
                "modeRefresh:512",
                "modeIoFlags:512",
                "release:48879",
            ),
            native.calls,
        )
    }

    @Test
    fun allModesOrdersDetachedSnapshotsDeterministically() {
        val native = RecordingDisplayNative(
            allModes = listOf(
                0x300L to (1920L to 1080L),
                0x100L to (2560L to 1440L),
                0x200L to (1920L to 1080L),
            ),
            refreshRates = mapOf(0x300L to 60.0, 0x100L to 120.0, 0x200L to 60.0),
            ioFlags = mapOf(0x300L to 7L, 0x100L to 1L, 0x200L to 3L),
        )

        assertEquals(
            listOf(
                CGDisplayModeSnapshot(512, 1920, 1080, 60.0, 3),
                CGDisplayModeSnapshot(768, 1920, 1080, 60.0, 7),
                CGDisplayModeSnapshot(256, 2560, 1440, 120.0, 1),
            ),
            AppKitDisplayServices.allModes(17, native),
        )
    }

    @Test
    fun allModesAcceptsAUniqueZeroIoModeIdentityAndRejectsDuplicateIdentities() {
        val zeroIdentity = RecordingDisplayNative(
            allModes = listOf(
                0x100L to (1920L to 1080L),
                0x200L to (2560L to 1440L),
            ),
            modeIdentities = mapOf(0x100L to 0, 0x200L to 91),
        )
        val duplicateIdentity = RecordingDisplayNative(
            allModes = listOf(
                0x100L to (1920L to 1080L),
                0x200L to (2560L to 1440L),
            ),
            modeIdentities = mapOf(0x100L to 91, 0x200L to 91),
        )
        val duplicateZeroIdentity = RecordingDisplayNative(
            allModes = listOf(
                0x300L to (1920L to 1080L),
                0x400L to (2560L to 1440L),
            ),
            modeIdentities = mapOf(0x300L to 0, 0x400L to 0),
        )

        val inventory = AppKitDisplayServices.allModes(17, zeroIdentity)

        assertEquals(listOf(0L, 91L), inventory.map(CGDisplayModeSnapshot::modeIdentity))
        assertTrue(inventory.all { it.modeIdentity >= 0L })
        assertFailsWith<IllegalStateException> {
            AppKitDisplayServices.allModes(17, duplicateIdentity)
        }
        assertFailsWith<IllegalStateException> {
            AppKitDisplayServices.allModes(17, duplicateZeroIdentity)
        }
        assertEquals(listOf("release:48879"), zeroIdentity.calls.filter { it.startsWith("release:") })
        assertEquals(listOf("release:48879"), duplicateIdentity.calls.filter { it.startsWith("release:") })
        assertEquals(listOf("release:48879"), duplicateZeroIdentity.calls.filter { it.startsWith("release:") })
    }

    @Test
    fun allModesKeepsIoModeIdentityWhenCoreGraphicsEnumerationOrderChanges() {
        val firstOrder = RecordingDisplayNative(
            allModes = listOf(
                0x100L to (1920L to 1080L),
                0x200L to (2560L to 1440L),
            ),
            modeIdentities = mapOf(0x100L to 41, 0x200L to -1),
        )
        val reordered = RecordingDisplayNative(
            allModes = listOf(
                0x200L to (2560L to 1440L),
                0x100L to (1920L to 1080L),
            ),
            modeIdentities = mapOf(0x100L to 41, 0x200L to -1),
        )

        assertEquals(
            listOf(41L, 4_294_967_295L),
            AppKitDisplayServices.allModes(17, firstOrder).map(CGDisplayModeSnapshot::modeIdentity),
        )
        assertEquals(
            listOf(41L, 4_294_967_295L),
            AppKitDisplayServices.allModes(17, reordered).map(CGDisplayModeSnapshot::modeIdentity),
        )
    }
}

private class RecordingDisplayNative(
    private val activeDisplays: IntArray = intArrayOf(),
    private val pixels: Map<Int, Pair<Long, Long>> = emptyMap(),
    private val modeAddress: Long = 1L,
    private val allModes: List<Pair<Long, Pair<Long, Long>>> = emptyList(),
    private val refreshRates: Map<Long, Double> = emptyMap(),
    private val ioFlags: Map<Long, Long> = emptyMap(),
    private val modeIdentities: Map<Long, Int> = emptyMap(),
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

    override fun copyAllDisplayModes(displayId: Int): Long {
        calls += "copyAllModes:$displayId"
        return 0xBEEFL
    }

    override fun modeCount(modes: Long): Long {
        calls += "count:$modes"
        return allModes.size.toLong()
    }

    override fun modeAt(modes: Long, index: Long): Long {
        calls += "modeAt:$modes:$index"
        return allModes[index.toInt()].first
    }

    override fun modePixelWidth(mode: Long): Long {
        calls += "modeWide:$mode"
        return allModes.firstOrNull { it.first == mode }?.second?.first ?: 1920
    }

    override fun modePixelHeight(mode: Long): Long {
        calls += "modeHigh:$mode"
        return allModes.firstOrNull { it.first == mode }?.second?.second ?: 1080
    }

    override fun modeRefreshRate(mode: Long): Double {
        calls += "modeRefresh:$mode"
        return refreshRates[mode] ?: 60.0
    }

    override fun modeIoFlags(mode: Long): Long {
        calls += "modeIoFlags:$mode"
        return ioFlags[mode] ?: 0L
    }

    override fun modeIdentity(mode: Long): Long {
        calls += "modeIdentity:$mode"
        return (modeIdentities[mode] ?: mode.toInt()).toLong() and 0xFFFF_FFFFL
    }

    override fun modesEqual(first: Long, second: Long): Boolean {
        calls += "equal:$first:$second"
        return first == second
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
