package org.graphiks.kffi.objc.appkit

import java.io.File
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.TimeUnit
import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

class ExclusiveWindowPresentationTest {
    @Test
    fun opensWithoutMutationThenPresentsAndRestoresInDocumentedOrder() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
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
        val fake = FakeWindowNative(initialMainThread = false)

        val result = ExclusiveWindowPresentationServices.open(WINDOW, fake)

        assertIs<ExclusiveWindowPresentationOpenResult.WrongThread>(result)
        assertTrue(fake.calls.isEmpty())
    }

    @Test
    fun presentReportsMissingTargetScreenWithoutMutation() {
        val fake = FakeWindowNative(screenAvailable = false)
        withLease(fake) { lease ->
            val result = lease.present(DISPLAY_ID)

            assertEquals(ExclusiveWindowPresentationResult.MissingTargetScreen(DISPLAY_ID), result)
            assertEquals(listOf("snapshot", "screen:42"), fake.calls)
        }
    }

    @Test
    fun openingTheSameWindowTwiceReturnsDuplicateLease() {
        val fake = FakeWindowNative()
        withLease(fake) {
            val duplicate = ExclusiveWindowPresentationServices.open(WINDOW, fake)

            assertEquals(ExclusiveWindowPresentationOpenResult.DuplicateWindowLease, duplicate)
            assertEquals(listOf("snapshot", "owner-close"), fake.calls)
        }
    }

    @Test
    fun presentReportsReadbackMismatchWithoutRestoringAWindowItCannotCertify() {
        val fake = FakeWindowNative(forcedReadbackDisplayId = OTHER_DISPLAY_ID)
        withLease(fake) { lease ->
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
    }

    @Test
    fun presentReportsExternalDivergenceWhenAnotherActorChangesTheWindow() {
        val fake = FakeWindowNative(presentationReadbackStyleMask = EXTERNAL_STYLE)
        withLease(fake) { lease ->
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
    }

    @Test
    fun closeRestoresEachPresentationMutationThatThrowsAfterApplyingNativeState() {
        listOf(
            ExclusiveWindowPresentationOperation.PresentBorderless,
            ExclusiveWindowPresentationOperation.PresentFrame,
            ExclusiveWindowPresentationOperation.PresentShieldingLevel,
        ).forEach { operation ->
            val fake = FakeWindowNative(throwAfterPresentationMutation = operation)
            withLease(fake) { lease ->
                val failure = assertIs<ExclusiveWindowPresentationResult.Failed>(lease.present(DISPLAY_ID))
                assertEquals(operation, failure.failure.operation)

                val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

                assertEquals(
                    ExclusiveWindowPresentationTerminalRestoration.Restored(INITIAL_READBACK),
                    close.restoration,
                )
                assertEquals(INITIAL_STYLE, fake.readbackStyleMask)
                assertEquals(INITIAL_FRAME, fake.readbackFrame)
                assertEquals(INITIAL_DISPLAY_ID, fake.readbackDisplayId)
                assertEquals(INITIAL_LEVEL, fake.readbackLevel)
                assertEquals(0, fake.ownedWindowCount)
                assertEquals(1, fake.releaseCount)
            }
        }
    }

    @Test
    fun windowGoneReleasesTheRegistryWithoutTryingToRestoreIt() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            fake.windowExists = false

            val result = lease.restore()

            assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, result)
            assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, lease.lastRestoreResult)
            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.lastCloseResult)
            assertEquals(ExclusiveWindowPresentationTerminalRestoration.WindowGone, close.restoration)
            assertTrue(fake.calls.contains("window-gone"))
            assertEquals(
                ExclusiveWindowPresentationOpenResult.WindowGone,
                ExclusiveWindowPresentationServices.open(WINDOW, fake),
            )
        }
    }

    @Test
    fun windowGoneDuringRestoreStopsCleanupAndReleasesTheRegistry() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.calls.clear()
            fake.windowExists = false

            assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, lease.restore())
            assertEquals(
                ExclusiveWindowPresentationOpenResult.WindowGone,
                ExclusiveWindowPresentationServices.open(WINDOW, fake),
            )
        }
    }

    @Test
    fun windowGoneDuringPresentTerminalizesAndCachesCleanup() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            fake.calls.clear()
            fake.windowExists = false

            assertEquals(ExclusiveWindowPresentationResult.WindowGone, lease.present(DISPLAY_ID))
            assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, lease.lastRestoreResult)
            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.lastCloseResult)
            assertEquals(ExclusiveWindowPresentationTerminalRestoration.WindowGone, close.restoration)
            assertTrue(close.cleanupFailures.isEmpty())
            assertEquals(0, fake.ownedWindowCount)
            assertEquals(1, fake.releaseCount)

            val terminalCalls = fake.calls.toList()
            fake.mainThread = false
            assertSame(close, lease.close())
            assertEquals(ExclusiveWindowPresentationResult.Closed, lease.present(DISPLAY_ID))
            assertEquals(ExclusiveWindowPresentationReadbackResult.Closed, lease.readback())
            assertEquals(ExclusiveWindowPresentationRestoreResult.Closed, lease.restore())
            assertEquals(terminalCalls, fake.calls)
        }
    }

    @Test
    fun windowGoneDuringReadbackTerminalizesAndCachesCleanup() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            fake.calls.clear()
            fake.windowExists = false

            assertEquals(ExclusiveWindowPresentationReadbackResult.WindowGone, lease.readback())
            assertEquals(ExclusiveWindowPresentationRestoreResult.WindowGone, lease.lastRestoreResult)
            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.lastCloseResult)
            assertEquals(ExclusiveWindowPresentationTerminalRestoration.WindowGone, close.restoration)
            assertTrue(close.cleanupFailures.isEmpty())
            assertEquals(0, fake.ownedWindowCount)
            assertEquals(1, fake.releaseCount)
        }
    }

    @Test
    fun partialRestoreRetriesOnlyTheComponentThatFailed() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.calls.clear()
            fake.failRestoreStyle = true

            val partial = lease.restore()

            assertIs<ExclusiveWindowPresentationRestoreResult.PartiallyRestored>(partial)
            assertEquals(
                listOf(
                    ExclusiveWindowPresentationFailure(
                        ExclusiveWindowPresentationOperation.RestoreStyle,
                        "restore style failed",
                    ),
                ),
                partial.failures,
            )
            assertEquals(listOf("restore-style", "restore-frame", "restore-level", "readback:17"), fake.calls)
            fake.calls.clear()

            assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())
            assertEquals(listOf("restore-style", "readback:17"), fake.calls)
        }
    }

    @Test
    fun closeIsIdempotentAndPreservesTheLastRestoreResult() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))

            val firstClose = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())
            val firstRestore = lease.lastRestoreResult
            val secondClose = lease.close()

            assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(firstRestore)
            assertEquals(firstRestore, lease.lastRestoreResult)
            assertSame(firstClose, secondClose)
            assertSame(firstClose, lease.lastCloseResult)
        }
    }

    @Test
    fun reentrantCloseDuringOwnerReleaseReportsClosingThenCachesTheTerminalResult() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            val reentrantResults = mutableListOf<ExclusiveWindowPresentationCloseResult>()
            fake.onOwnerClose = { reentrantResults += lease.close() }

            val terminal = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertEquals(
                listOf<ExclusiveWindowPresentationCloseResult>(ExclusiveWindowPresentationCloseResult.Closing),
                reentrantResults,
            )
            assertTrue(terminal.cleanupFailures.isEmpty())
            assertSame(terminal, lease.close())
            assertSame(terminal, lease.lastCloseResult)
        }
    }

    @Test
    fun terminalCloseRestoresThenReleasesOwnerBeforeRemovingRegistryGuard() {
        val fake = FakeWindowNative(probeRegistryDuringOwnerClose = true)
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.calls.clear()

            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertEquals(
                listOf(
                    "restore-style",
                    "restore-frame",
                    "restore-level",
                    "readback:17",
                    "owner-close",
                    "registry-active",
                ),
                fake.calls,
            )
            assertEquals(ExclusiveWindowPresentationOpenResult.DuplicateWindowLease, fake.ownerCloseRegistryProbe)
            assertTrue(close.cleanupFailures.isEmpty())

            fake.calls.clear()
            withLease(fake) {}
            assertEquals(listOf("snapshot", "owner-close", "registry-active"), fake.calls)
        }
    }

    @Test
    fun ownerCloseFailureIsTypedAndDoesNotKeepTheRegistryGuard() {
        val fake = FakeWindowNative(failOwnerClose = true)
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.calls.clear()

            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertEquals(
                listOf(
                    ExclusiveWindowPresentationFailure(
                        ExclusiveWindowPresentationOperation.ReleaseOwner,
                        "owner close failed",
                    ),
                ),
                close.cleanupFailures,
            )
            assertEquals(
                listOf("restore-style", "restore-frame", "restore-level", "readback:17", "owner-close"),
                fake.calls,
            )
            assertSame(close, lease.close())

            fake.calls.clear()
            withLease(fake) {}
            assertEquals(listOf("snapshot", "owner-close"), fake.calls)
        }
    }

    @Test
    fun closeTerminalizesAPartialRestoreAndReleasesItsOwnership() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.calls.clear()
            fake.failRestoreStyle = true

            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertIs<ExclusiveWindowPresentationTerminalRestoration.PartiallyRestored>(close.restoration)
            assertEquals(0, fake.ownedWindowCount)
            assertEquals(1, fake.releaseCount)
            withLease(fake) {}
        }
    }

    @Test
    fun closePreservesAPartialRestoreWithoutReadback() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.failReadback = true

            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            val restoration = assertIs<ExclusiveWindowPresentationTerminalRestoration.PartiallyRestored>(close.restoration)
            assertNull(restoration.readback)
            assertEquals(
                listOf(
                    ExclusiveWindowPresentationFailure(
                        ExclusiveWindowPresentationOperation.Readback,
                        "readback failed",
                    ),
                ),
                restoration.failures,
            )
            assertEquals(0, fake.ownedWindowCount)
            assertEquals(1, fake.releaseCount)
        }
    }

    @Test
    fun fakeSmokeOnlyOpensAndReadsDetachedState() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertEquals(
                INITIAL_READBACK,
                assertIs<ExclusiveWindowPresentationReadbackResult.Readback>(lease.readback()).value,
            )
            assertFalse(fake.calls.any { it == "borderless" || it.startsWith("frame:") || it == "shielding-level" })
        }
    }

    @Test
    fun macOsSmokeOnlyOpensAndReadsDetachedState() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))
        val process = ProcessBuilder(
            File(System.getProperty("java.home"), "bin/java").path,
            "-XstartOnFirstThread",
            "--enable-native-access=ALL-UNNAMED",
            "-cp",
            System.getProperty("java.class.path"),
            ExclusiveWindowPresentationSmokeProbe::class.java.name,
        ).redirectErrorStream(true).start()
        assertTrue(process.waitFor(30, TimeUnit.SECONDS), "exclusive window presentation smoke timed out")
        assertEquals(0, process.exitValue(), process.inputStream.bufferedReader().readText())
    }

    @Test
    fun everyLeaseOperationRejectsWrongThreadWithoutTouchingAppKit() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            fake.calls.clear()
            fake.mainThread = false

            assertEquals(ExclusiveWindowPresentationResult.WrongThread, lease.present(DISPLAY_ID))
            assertEquals(ExclusiveWindowPresentationReadbackResult.WrongThread, lease.readback())
            assertEquals(ExclusiveWindowPresentationRestoreResult.WrongThread, lease.restore())
            assertEquals(ExclusiveWindowPresentationCloseResult.WrongThread, lease.close())
            assertNull(lease.lastCloseResult)
            assertTrue(fake.calls.isEmpty())
        }
    }

    @Test
    fun closeOfAnUntouchedLeaseExposesItsTerminalResult() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            val terminated = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertIs<ExclusiveWindowPresentationTerminalRestoration.NotRequired>(terminated.restoration)
            assertEquals(terminated, lease.lastCloseResult)
            assertFalse(fake.calls.any { it.startsWith("readback:") || it.startsWith("restore-") })
            assertEquals(0, fake.ownedWindowCount)
            assertEquals(1, fake.releaseCount)
        }
    }

    @Test
    fun successfulRestoreRetainsTheNativeWindowUntilTerminalClose() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertEquals(1, fake.ownedWindowCount)
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            val restored = assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())

            assertEquals(1, fake.ownedWindowCount)
            assertEquals(0, fake.releaseCount)

            fake.calls.clear()
            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertEquals(ExclusiveWindowPresentationTerminalRestoration.Restored(restored.readback), close.restoration)
            assertEquals(listOf("owner-close"), fake.calls)
            assertEquals(0, fake.ownedWindowCount)
            assertEquals(1, fake.releaseCount)
        }
    }

    @Test
    fun finalReadbackMismatchKeepsOnlyTheDivergentComponentOutstanding() {
        val fake = FakeWindowNative(keepRestoredFrame = true)
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            fake.calls.clear()

            val partial = assertIs<ExclusiveWindowPresentationRestoreResult.PartiallyRestored>(lease.restore())

            assertEquals(
                listOf(
                    ExclusiveWindowPresentationFailure(
                        ExclusiveWindowPresentationOperation.VerifyRestorationFrame,
                        "restored frame did not match the opening snapshot",
                    ),
                ),
                partial.failures,
            )
            assertEquals(listOf("restore-style", "restore-frame", "restore-level", "readback:42"), fake.calls)
            fake.calls.clear()

            assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())
            assertEquals(listOf("restore-frame", "readback:17"), fake.calls)
        }
    }

    @Test
    fun secondRestoreDetectsExternalDivergenceAfterVerifiedRestoration() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            assertIs<ExclusiveWindowPresentationResult.Presented>(lease.present(DISPLAY_ID))
            assertIs<ExclusiveWindowPresentationRestoreResult.Restored>(lease.restore())
            fake.readbackStyleMask = EXTERNAL_STYLE
            fake.calls.clear()

            val divergent = assertIs<ExclusiveWindowPresentationRestoreResult.PartiallyRestored>(lease.restore())

            assertEquals(
                listOf(
                    ExclusiveWindowPresentationFailure(
                        ExclusiveWindowPresentationOperation.VerifyRestorationStyle,
                        "restored style mask did not match the opening snapshot",
                    ),
                ),
                divergent.failures,
            )
            assertEquals(listOf("readback:17"), fake.calls)
            fake.calls.clear()

            val close = assertIs<ExclusiveWindowPresentationCloseResult.Terminated>(lease.close())

            assertEquals(ExclusiveWindowPresentationTerminalRestoration.Restored(INITIAL_READBACK), close.restoration)
            assertEquals(listOf("restore-style", "readback:17", "owner-close"), fake.calls)
        }
    }

    @Test
    fun readbackReportsWindowGoneFailureAndClosedWithoutLeakingNativeExceptions() {
        val fake = FakeWindowNative()
        withLease(fake) { lease ->
            fake.windowExists = false

            assertEquals(ExclusiveWindowPresentationReadbackResult.WindowGone, lease.readback())
            assertEquals(ExclusiveWindowPresentationReadbackResult.Closed, lease.readback())
        }

        val failing = FakeWindowNative().also { it.failReadback = true }
        withLease(failing) { failingLease ->
            assertEquals(
                ExclusiveWindowPresentationReadbackResult.Failed(
                    ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Readback, "readback failed"),
                ),
                failingLease.readback(),
            )
        }
    }

    private fun open(fake: FakeWindowNative): ExclusiveWindowPresentationLease =
        assertIs<ExclusiveWindowPresentationOpenResult.Opened>(
            ExclusiveWindowPresentationServices.open(WINDOW, fake),
        ).lease

    private inline fun <T> withLease(
        fake: FakeWindowNative,
        block: (ExclusiveWindowPresentationLease) -> T,
    ): T {
        val lease = open(fake)
        return try {
            block(lease)
        } finally {
            fake.mainThread = true
            lease.close()
        }
    }

    private fun alloc(className: String): MemorySegment = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass(className),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment
}

object ExclusiveWindowPresentationSmokeProbe {
    @JvmStatic
    fun main(args: Array<String>) {
        ObjCRuntime.autoreleasePool {
            check(NSThread.isMainThread()) { "exclusive presentation smoke requires the native main thread" }
            val window = NSWindow(NSWindow(alloc("NSWindow")).init())
            try {
                when (val opened = ExclusiveWindowPresentationServices.open(window)) {
                    ExclusiveWindowPresentationOpenResult.UnavailablePlatform -> Unit
                    is ExclusiveWindowPresentationOpenResult.Opened -> {
                        check(opened.lease.readback() is ExclusiveWindowPresentationReadbackResult.Readback)
                        check(opened.lease.close() is ExclusiveWindowPresentationCloseResult.Terminated)
                    }
                    else -> error("unexpected exclusive presentation smoke result: $opened")
                }
            } finally {
                window.close()
            }
        }
    }

    private fun alloc(className: String): MemorySegment = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass(className),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment
}

private class FakeWindowNative(
    private val macOs26OrLater: Boolean = true,
    initialMainThread: Boolean = true,
    private val screenAvailable: Boolean = true,
    private val forcedReadbackDisplayId: Int? = null,
    private val presentationReadbackStyleMask: Long? = null,
    private val keepRestoredFrame: Boolean = false,
    private val throwAfterPresentationMutation: ExclusiveWindowPresentationOperation? = null,
    private val failOwnerClose: Boolean = false,
    private val probeRegistryDuringOwnerClose: Boolean = false,
) : ExclusiveWindowPresentationNative {
    val calls = mutableListOf<String>()
    val callsAfterRestore: List<String>
        get() = calls.dropWhile { it !in setOf("restore-style", "restore-frame", "restore-level") }

    var mainThread = initialMainThread
    var windowExists = true
    var readbackStyleMask = INITIAL_STYLE
    var readbackDisplayId = INITIAL_DISPLAY_ID
    var readbackFrame = INITIAL_FRAME
    var readbackLevel = INITIAL_LEVEL
    var failRestoreStyle = false
    var failReadback = false
    var ownedWindowCount = 0
    var releaseCount = 0
    var suppressNextRestoreFrame = keepRestoredFrame
    var ownerCloseRegistryProbe: ExclusiveWindowPresentationOpenResult? = null
    var onOwnerClose: (() -> Unit)? = null
    private var ownerCloseFailed = false
    private var probingRegistry = false

    override fun isMacOs26OrLater(): Boolean = macOs26OrLater

    override fun isMainThread(): Boolean = mainThread

    override fun retainWindow(window: Long): ExclusiveWindowPresentationWindow {
        requireWindow()
        ownedWindowCount += 1
        return FakeWindow(window, probeOwner = probingRegistry)
    }

    private fun snapshot(): ExclusiveWindowPresentationSnapshot {
        requireWindow()
        calls += "snapshot"
        return ExclusiveWindowPresentationSnapshot(
            styleMask = INITIAL_STYLE,
            frame = INITIAL_FRAME,
            displayId = INITIAL_DISPLAY_ID,
            level = INITIAL_LEVEL,
        )
    }

    private fun screen(displayId: Int): ExclusiveWindowPresentationScreen? {
        requireWindow()
        calls += "screen:$displayId"
        return TARGET_SCREEN.takeIf { screenAvailable && displayId == DISPLAY_ID }
    }

    private fun presentBorderless() {
        requireWindow()
        calls += "borderless"
        readbackStyleMask = presentationReadbackStyleMask ?: BORDERLESS_STYLE
        if (throwAfterPresentationMutation == ExclusiveWindowPresentationOperation.PresentBorderless) {
            throw IllegalStateException("borderless presentation failed after mutation")
        }
    }

    private fun presentFrame(screen: ExclusiveWindowPresentationScreen) {
        requireWindow()
        calls += "frame:${screen.displayId}"
        readbackDisplayId = screen.displayId
        readbackFrame = screen.frame
        if (throwAfterPresentationMutation == ExclusiveWindowPresentationOperation.PresentFrame) {
            throw IllegalStateException("frame presentation failed after mutation")
        }
    }

    private fun presentShieldingLevel(): Long {
        requireWindow()
        calls += "shielding-level"
        readbackLevel = SHIELDING_LEVEL
        if (throwAfterPresentationMutation == ExclusiveWindowPresentationOperation.PresentShieldingLevel) {
            throw IllegalStateException("shielding level presentation failed after mutation")
        }
        return SHIELDING_LEVEL
    }

    private fun readback(): ExclusiveWindowPresentationReadback {
        requireWindow()
        if (failReadback) throw IllegalStateException("readback failed")
        val displayId = forcedReadbackDisplayId ?: readbackDisplayId
        calls += "readback:$displayId"
        return ExclusiveWindowPresentationReadback(
            styleMask = readbackStyleMask,
            frame = readbackFrame,
            displayId = displayId,
            level = readbackLevel,
        )
    }

    private fun restoreStyle(styleMask: Long) {
        requireWindow()
        calls += "restore-style"
        if (failRestoreStyle) {
            failRestoreStyle = false
            throw IllegalStateException("restore style failed")
        }
        readbackStyleMask = styleMask
    }

    private fun restoreFrame(frame: CGDisplayBoundsSnapshot) {
        requireWindow()
        calls += "restore-frame"
        if (suppressNextRestoreFrame) {
            suppressNextRestoreFrame = false
        } else {
            readbackDisplayId = INITIAL_DISPLAY_ID
            readbackFrame = frame
        }
    }

    private fun restoreLevel(level: Long) {
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

    private inner class FakeWindow(
        override val identity: Long,
        private val probeOwner: Boolean,
    ) : ExclusiveWindowPresentationWindow {
        override fun snapshot(): ExclusiveWindowPresentationSnapshot = this@FakeWindowNative.snapshot()

        override fun screen(displayId: Int): ExclusiveWindowPresentationScreen? = this@FakeWindowNative.screen(displayId)

        override fun presentBorderless() = this@FakeWindowNative.presentBorderless()

        override fun presentFrame(screen: ExclusiveWindowPresentationScreen) = this@FakeWindowNative.presentFrame(screen)

        override fun presentShieldingLevel(): Long = this@FakeWindowNative.presentShieldingLevel()

        override fun readback(): ExclusiveWindowPresentationReadback = this@FakeWindowNative.readback()

        override fun restoreStyle(styleMask: Long) = this@FakeWindowNative.restoreStyle(styleMask)

        override fun restoreFrame(frame: CGDisplayBoundsSnapshot) = this@FakeWindowNative.restoreFrame(frame)

        override fun restoreLevel(level: Long) = this@FakeWindowNative.restoreLevel(level)

        override fun close() {
            if (probeOwner) {
                ownedWindowCount -= 1
                return
            }
            calls += "owner-close"
            if (probeRegistryDuringOwnerClose) {
                probingRegistry = true
                try {
                    ownerCloseRegistryProbe = ExclusiveWindowPresentationServices.open(WINDOW, this@FakeWindowNative)
                } finally {
                    probingRegistry = false
                }
                calls += "registry-active"
            }
            onOwnerClose?.invoke()
            if (failOwnerClose && !ownerCloseFailed) {
                ownerCloseFailed = true
                throw IllegalStateException("owner close failed")
            }
            ownedWindowCount -= 1
            releaseCount += 1
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
private val INITIAL_READBACK = ExclusiveWindowPresentationReadback(
    styleMask = INITIAL_STYLE,
    frame = INITIAL_FRAME,
    displayId = INITIAL_DISPLAY_ID,
    level = INITIAL_LEVEL,
)
