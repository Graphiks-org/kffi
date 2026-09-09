package org.graphiks.kffi.objc.appkit

import java.lang.foreign.MemorySegment
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AppKitScreenServicesTest {
    @Test
    fun snapshotsCopyAppKitScreenMetricsAndPrimaryAssociationWithoutRetainingNativeReferences() {
        val native = RecordingScreenNative(
            screens = listOf(0xA0L, 0xB0L),
            primary = 29,
            ids = mapOf(0xA0L to 17, 0xB0L to 29),
        )

        val snapshots = AppKitScreenServices.snapshots(native)

        assertEquals(
            listOf(
                AppKitScreenSnapshot(
                    displayId = 17,
                    isPrimary = false,
                    frame = CGDisplayBoundsSnapshot(0.0, 0.0, 1280.0, 720.0),
                    visibleFrame = CGDisplayBoundsSnapshot(0.0, 24.0, 1280.0, 672.0),
                    backingScaleFactor = 1.0,
                    localizedName = "Screen 17",
                ),
                AppKitScreenSnapshot(
                    displayId = 29,
                    isPrimary = true,
                    frame = CGDisplayBoundsSnapshot(1280.0, 0.0, 1512.0, 982.0),
                    visibleFrame = CGDisplayBoundsSnapshot(1280.0, 24.0, 1512.0, 934.0),
                    backingScaleFactor = 2.0,
                    localizedName = "Screen 29",
                ),
            ),
            snapshots,
        )
        assertFalse(AppKitScreenSnapshot::class.java.declaredFields.any { it.type == MemorySegment::class.java })
    }

    @Test
    fun snapshotsRejectDuplicateCoreGraphicsDisplayIds() {
        val native = RecordingScreenNative(
            screens = listOf(0xA0L, 0xB0L),
            primary = 17,
            ids = mapOf(0xA0L to 17, 0xB0L to 17),
        )

        assertFailsWith<IllegalStateException> { AppKitScreenServices.snapshots(native) }
    }

    @Test
    fun snapshotsMatchTheActiveCoreGraphicsDisplayInventoryOnMacOs26() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))
        assumeTrue((System.getProperty("os.version").substringBefore('.').toIntOrNull() ?: 0) >= 26)

        val screens = AppKitScreenServices.snapshots()
        val displayIds = AppKitDisplayServices.enumerate().map(CGDisplaySnapshot::id).toSet()

        assertTrue(screens.isNotEmpty())
        assertEquals(displayIds, screens.map(AppKitScreenSnapshot::displayId).toSet())
        assertTrue(screens.count(AppKitScreenSnapshot::isPrimary) == 1)
        assertTrue(screens.all { it.backingScaleFactor > 0.0 && it.frame.width > 0.0 && it.visibleFrame.width > 0.0 })
    }
}

private class RecordingScreenNative(
    private val screens: List<Long>,
    private val primary: Int,
    private val ids: Map<Long, Int>,
) : AppKitScreenNative {
    val calls = mutableListOf<String>()

    override fun screens(): List<Long> {
        calls += "screens"
        return screens
    }

    override fun primaryDisplayId(): Int {
        calls += "primary"
        return primary
    }

    override fun displayId(screen: Long): Int {
        calls += "id:$screen"
        return checkNotNull(ids[screen])
    }

    override fun frame(screen: Long): CGDisplayBoundsSnapshot {
        calls += "frame:$screen"
        return if (screen == 0xA0L) {
            CGDisplayBoundsSnapshot(0.0, 0.0, 1280.0, 720.0)
        } else {
            CGDisplayBoundsSnapshot(1280.0, 0.0, 1512.0, 982.0)
        }
    }

    override fun visibleFrame(screen: Long): CGDisplayBoundsSnapshot {
        calls += "visible:$screen"
        return if (screen == 0xA0L) {
            CGDisplayBoundsSnapshot(0.0, 24.0, 1280.0, 672.0)
        } else {
            CGDisplayBoundsSnapshot(1280.0, 24.0, 1512.0, 934.0)
        }
    }

    override fun backingScaleFactor(screen: Long): Double {
        calls += "scale:$screen"
        return if (screen == 0xA0L) 1.0 else 2.0
    }

    override fun localizedName(screen: Long): String {
        calls += "name:$screen"
        return "Screen ${checkNotNull(ids[screen])}"
    }
}
