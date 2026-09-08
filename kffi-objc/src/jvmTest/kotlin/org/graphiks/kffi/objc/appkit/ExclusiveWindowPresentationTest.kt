package org.graphiks.kffi.objc.appkit

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ExclusiveWindowPresentationTest {
    @Test
    fun opensWithoutMutationThenPresentsAndRestoresInDocumentedOrder() {
        val fake = FakeWindowNative()
        val lease = open(fake)

        assertEquals(listOf("snapshot"), fake.calls)

        assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
        assertEquals(
            listOf("snapshot", "screen:42", "borderless", "frame:42", "shielding-level", "readback:42"),
            fake.calls,
        )

        assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())
        assertEquals(
            listOf("restore-style", "restore-frame", "restore-level", "readback:17"),
            fake.callsAfterRestore,
        )
    }

    @Test
    fun unavailablePlatformDoesNotTouchTheWindow() {
        val fake = FakeWindowNative(macOs26OrLater = false)

        val result = ExclusiveWindowPresentationServices.open(WINDOW, fake)

        assertIs<ExclusiveWindowPresentationOpenResult.UnavailablePlatform>(result)
        assertTrue(fake.calls.isEmpty())
    }

    @Test
    fun wrongThreadDoesNotTouchTheWindow() {
        val fake = FakeWindowNative(mainThread = false)

        val result = ExclusiveWindowPresentationServices.open(WINDOW, fake)

        assertIs<ExclusiveWindowPresentationOpenResult.WrongThread>(result)
        assertTrue(fake.calls.isEmpty())
    }

    @Test
    fun presentReportsMissingTargetScreenWithoutMutation() {
        val fake = FakeWindowNative(screenAvailable = false)
        val lease = open(fake)

        val result = lease.present(DISPLAY_ID)

        assertEquals(ExclusiveWindowPresentationResult.MissingTargetScreen(DISPLAY_ID), result)
        assertEquals(listOf("snapshot", "screen:42"), fake.calls)
    }

    @Test
    fun openingTheSameWindowTwiceReturnsDuplicateLease() {
        val fake = FakeWindowNative()
        val lease = open(fake)

        val duplicate = ExclusiveWindowPresentationServices.open(WINDOW, fake)

        assertEquals(ExclusiveWindowPresentationOpenResult.DuplicateWindowLease, duplicate)
        assertEquals(listOf("snapshot"), fake.calls)
        lease.restore()
    }

    @Test
    fun presentReportsReadbackMismatchWithoutRestoringAWindowItCannotCertify() {
        val fake = FakeWindowNative(forcedReadbackDisplayId = OTHER_DISPLAY_ID)
        val lease = open(fake)

        val result = lease.present(DISPLAY_ID)

        assertEquals(
            ExclusiveWindowPresentationResult.TargetReadbackMismatch(
                expectedDisplayId = DISPLAY_ID,
                actualDisplayId = OTHER_DISPLAY_ID,
            ),
            result,
        )
        assertEquals(
            listOf("snapshot", "screen:42", "borderless", "frame:42", "shielding-level", "readback:99"),
            fake.calls,
        )
    }

    @Test
    fun presentReportsExternalDivergenceWhenAnotherActorChangesTheWindow() {
        val fake = FakeWindowNative(presentationReadbackStyleMask = EXTERNAL_STYLE)
        val lease = open(fake)

        val result = lease.present(DISPLAY_ID)

        assertEquals(
            ExclusiveWindowPresentationResult.ExternalDivergence(
                expected = ExclusiveWindowPresentationReadback(
                    styleMask = BORDERLESS_STYLE,
                    frame = TARGET_FRAME,
                    displayId = DISPLAY_ID,
                    level = SHIELDING_LEVEL,
                ),
                actual =
                ExclusiveWindowPresentationReadback(
                    styleMask = EXTERNAL_STYLE,
                    frame = TARGET_FRAME,
                    displayId = DISPLAY_ID,
                    level = SHIELDING_LEVEL,
                ),
            ),
            result,
        )
        assertEquals(
            listOf("snapshot", "screen:42", "borderless", "frame:42", "shielding-level", "readback:42"),
            fake.calls,
        )
    }

    @Test
    fun windowGoneReleasesTheRegistryWithoutTryingToRestoreIt() {
        val fake = FakeWindowNative()
        val lease = open(fake)
        fake.windowExists = false

        val result = lease.restore()

        assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, result)
        assertTrue(fake.calls.contains("window-gone"))
        assertEquals(
            ExclusiveWindowPresentationOpenResult.WindowGone,
            ExclusiveWindowPresentationServices.open(WINDOW, fake),
        )
    }

    @Test
    fun windowGoneDuringRestoreStopsCleanupAndReleasesTheRegistry() {
        val fake = FakeWindowNative()
        val lease = open(fake)
        assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
        fake.calls.clear()
        fake.windowExists = false

        assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, lease.restore())
        assertEquals(ExclusiveWindowPresentationOpenResult.WindowGone, ExclusiveWindowPresentationServices.open(WINDOW, fake))
    }

    @Test
    fun partialRestoreRetriesOnlyTheComponentThatFailed() {
        val fake = FakeWindowNative()
        val lease = open(fake)
        assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
        fake.calls.clear()
        fake.failRestoreStyle = true

        val partial = lease.restore()

        assertIs<ExclusiveWindowPresentationRestoreResult.PartiallyRestored>(partial)
        assertEquals(
            listOf(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.RestoreStyle, "restore style failed"),
            ),
            partial.failures,
        )
        assertEquals(listOf("restore-style", "restore-frame", "restore-level", "readback:17"), fake.calls)
        fake.calls.clear()

        assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())
        assertEquals(listOf("restore-style", "readback:17"), fake.calls)
    }

    @Test
    fun closeIsIdempotentAndPreservesTheLastRestoreResult() {
        val fake = FakeWindowNative()
        val lease = open(fake)
        assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))

        lease.close()
        val first = lease.lastRestoreResult
        lease.close()

        assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(first)
        assertEquals(first, lease.lastRestoreResult)
    }

    @Test
    fun closeDoesNotRetryAPartialRestore() {
        val fake = FakeWindowNative()
        val lease = open(fake)
        assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
        fake.calls.clear()
        fake.failRestoreStyle = true

        lease.close()
        val afterFirstClose = fake.calls.toList()
        lease.close()

        assertEquals(afterFirstClose, fake.calls)
        assertIs<ExclusiveWindowPresentationRestoreResult.PartiallyRestored>(lease.lastRestoreResult)
        assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())
    }

    @Test
    fun fakeSmokeOnlyOpensAndReadsDetachedState() {
        val fake = FakeWindowNative()
        val opened = ExclusiveWindowPresentationServices.open(WINDOW, fake)

        val lease = assertIs<ExclusiveWindowPresentationOpenResult.Opened>(opened).lease

        assertEquals(
            ExclusiveWindowPresentationReadback(
                styleMask = INITIAL_STYLE,
                frame = INITIAL_FRAME,
                displayId = INITIAL_DISPLAY_ID,
                level = INITIAL_LEVEL,
            ),
            lease.readback(),
        )
        assertFalse(fake.calls.any { it == "borderless" || it.startsWith("frame:") || it == "shielding-level" })
        lease.restore()
    }

    @Test
    fun macOsSmokeOnlyOpensAndReadsDetachedState() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))
        assumeTrue((System.getProperty("os.version").substringBefore('.').toIntOrNull() ?: 0) >= 26)
        assumeTrue(NSThread.isMainThread(), "AppKit smoke must run on the native main thread")

        ObjCRuntime.autoreleasePool {
            val window = NSWindow(NSWindow(alloc("NSWindow")).init())
            try {
                val lease = assertIs<ExclusiveWindowPresentationOpenResult.Opened>(
                    ExclusiveWindowPresentationServices.open(window),
                ).lease

                val readback = lease.readback()

                assertTrue(readback.styleMask >= 0L)
                lease.close()
            } finally {
                window.close()
            }
        }
    }

    private fun open(fake: FakeWindowNative): ExclusiveWindowPresentationLease =
        assertIs<ExclusiveWindowPresentationOpenResult.Opened>(
            ExclusiveWindowPresentationServices.open(WINDOW, fake),
        ).lease

    private fun alloc(className: String): MemorySegment = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass(className),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment
}

private class FakeWindowNative(
    private val macOs26OrLater: Boolean = true,
    private val mainThread: Boolean = true,
    private val screenAvailable: Boolean = true,
    private val forcedReadbackDisplayId: Int? = null,
    private val presentationReadbackStyleMask: Long? = null,
) : ExclusiveWindowPresentationNative {
    val calls = mutableListOf<String>()
    val callsAfterRestore: List<String>
        get() = calls.dropWhile { it !in setOf("restore-style", "restore-frame", "restore-level") }

    var windowExists = true
    var readbackStyleMask = INITIAL_STYLE
    var readbackDisplayId = INITIAL_DISPLAY_ID
    var readbackFrame = INITIAL_FRAME
    var readbackLevel = INITIAL_LEVEL
    var failRestoreStyle = false

    override fun isMacOs26OrLater(): Boolean = macOs26OrLater

    override fun isMainThread(): Boolean = mainThread

    override fun snapshot(window: Long): ExclusiveWindowPresentationSnapshot {
        requireWindow()
        calls += "snapshot"
        return ExclusiveWindowPresentationSnapshot(
            styleMask = INITIAL_STYLE,
            frame = INITIAL_FRAME,
            displayId = INITIAL_DISPLAY_ID,
            level = INITIAL_LEVEL,
        )
    }

    override fun screen(displayId: Int): ExclusiveWindowPresentationScreen? {
        requireWindow()
        calls += "screen:$displayId"
        return TARGET_SCREEN.takeIf { screenAvailable && displayId == DISPLAY_ID }
    }

    override fun presentBorderless(window: Long) {
        requireWindow()
        calls += "borderless"
        readbackStyleMask = presentationReadbackStyleMask ?: BORDERLESS_STYLE
    }

    override fun presentFrame(window: Long, screen: ExclusiveWindowPresentationScreen) {
        requireWindow()
        calls += "frame:${screen.displayId}"
        readbackDisplayId = screen.displayId
        readbackFrame = screen.frame
    }

    override fun presentShieldingLevel(window: Long): Long {
        requireWindow()
        calls += "shielding-level"
        readbackLevel = SHIELDING_LEVEL
        return SHIELDING_LEVEL
    }

    override fun readback(window: Long): ExclusiveWindowPresentationReadback {
        requireWindow()
        val displayId = forcedReadbackDisplayId ?: readbackDisplayId
        calls += "readback:$displayId"
        return ExclusiveWindowPresentationReadback(
            styleMask = readbackStyleMask,
            frame = readbackFrame,
            displayId = displayId,
            level = readbackLevel,
        )
    }

    override fun restoreStyle(window: Long, styleMask: Long) {
        requireWindow()
        calls += "restore-style"
        if (failRestoreStyle) {
            failRestoreStyle = false
            throw IllegalStateException("restore style failed")
        }
        readbackStyleMask = styleMask
    }

    override fun restoreFrame(window: Long, frame: CGDisplayBoundsSnapshot) {
        requireWindow()
        calls += "restore-frame"
        readbackDisplayId = INITIAL_DISPLAY_ID
        readbackFrame = frame
    }

    override fun restoreLevel(window: Long, level: Long) {
        requireWindow()
        calls += "restore-level"
        readbackLevel = level
    }

    private fun requireWindow() {
        if (!windowExists) {
            calls += "window-gone"
            throw ExclusiveWindowPresentationWindowGoneException()
        }
    }
}

private const val WINDOW = 0x1234L
private const val DISPLAY_ID = 42
private const val OTHER_DISPLAY_ID = 99
private const val INITIAL_DISPLAY_ID = 17
private const val INITIAL_STYLE = 0xFFL
private const val BORDERLESS_STYLE = 0L
private const val EXTERNAL_STYLE = 0xAAL
private const val INITIAL_LEVEL = 5L
private const val SHIELDING_LEVEL = 999L
private val INITIAL_FRAME = CGDisplayBoundsSnapshot(1.0, 2.0, 3.0, 4.0)
private val TARGET_FRAME = CGDisplayBoundsSnapshot(10.0, 20.0, 30.0, 40.0)
private val TARGET_SCREEN = ExclusiveWindowPresentationScreen(DISPLAY_ID, TARGET_FRAME)
