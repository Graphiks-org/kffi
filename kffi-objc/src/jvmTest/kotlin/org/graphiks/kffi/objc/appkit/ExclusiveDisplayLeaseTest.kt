package org.graphiks.kffi.objc.appkit

import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

class ExclusiveDisplayLeaseTest {
    @Test
    fun openCapturesBeforeSettingAndCertifiesTheTargetBeforeReturning() {
        val native = LeaseDisplayNative()

        val opened = assertIs<ExclusiveDisplayLeaseOpenResult.Opened>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        )

        assertEquals(
            listOf("capture:$DISPLAY_ID", "setMode:$DISPLAY_ID:$TARGET_MODE", "copyMode:$DISPLAY_ID"),
            native.calls.filter { it.startsWith("capture:") || it.startsWith("setMode:") || it.startsWith("copyMode:") }
                .takeLast(3),
        )
        val readback = opened.lease.readback()
        assertEquals(
            ExclusiveDisplayTerminal.Captured(TARGET_IDENTITY),
            readback.terminal,
        )
        assertEquals(TARGET_IDENTITY, readback.modeIdentity)
        assertEquals(true, readback.captureRetained)

        val released = opened.lease.release()

        assertEquals(ExclusiveDisplayTerminal.Released(INITIAL_IDENTITY), released.terminal)
        assertTrue(released.failures.isEmpty())
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun releaseRestoresThenReleasesCaptureThenFreesReferencesAndIsIdempotent() {
        val native = LeaseDisplayNative()
        val lease = assertIs<ExclusiveDisplayLeaseOpenResult.Opened>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        ).lease
        native.calls.clear()

        val first = lease.release()
        val firstTrace = native.calls.toList()
        val second = lease.release()

        assertEquals(first, second)
        assertEquals(firstTrace, native.calls)
        assertEquals(
            listOf(
                "setMode:$DISPLAY_ID:$INITIAL_MODE",
                "releaseCapture:$DISPLAY_ID",
                "copyMode:$DISPLAY_ID",
                "modeIdentity:$INITIAL_MODE",
                "equal:$INITIAL_MODE:$INITIAL_MODE",
                "isCaptured:$DISPLAY_ID",
                "release:$INITIAL_MODE",
                "release:$TARGET_MODE",
                "release:$INITIAL_MODE",
            ),
            firstTrace,
        )
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun readbackRejectsTheSameIdentityWhenCoreFoundationEqualityDoesNotMatch() {
        val native = LeaseDisplayNative()
        val lease = assertIs<ExclusiveDisplayLeaseOpenResult.Opened>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        ).lease
        native.currentMode = IMPOSTOR_MODE
        native.calls.clear()

        val readback = lease.readback()

        assertSame(ExclusiveDisplayTerminal.Unknown, readback.terminal)
        assertNull(readback.modeIdentity)
        assertNull(readback.captureRetained)
        assertEquals(
            listOf(
                "copyMode:$DISPLAY_ID",
                "modeIdentity:$IMPOSTOR_MODE",
                "equal:$IMPOSTOR_MODE:$TARGET_MODE",
                "isCaptured:$DISPLAY_ID",
                "release:$IMPOSTOR_MODE",
            ),
            native.calls,
        )
        lease.release()
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun captureFailureIsFailedBeforeCaptureAndReleasesEveryReference() {
        val native = LeaseDisplayNative().apply {
            failNext("capture:$DISPLAY_ID", "capture denied")
        }

        val failed = assertIs<ExclusiveDisplayLeaseOpenResult.FailedBeforeCapture>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        )

        assertEquals(ExclusiveDisplayNativeOperation.Capture, failed.failure.operation)
        assertFalse(native.captureRetained)
        assertFalse(native.calls.any { it.startsWith("releaseCapture:") })
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun unavailableTargetFailsBeforeCaptureWithoutLeakingReferences() {
        val native = LeaseDisplayNative()

        val failed = assertIs<ExclusiveDisplayLeaseOpenResult.FailedBeforeCapture>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, 0x999L, native),
        )

        assertEquals(ExclusiveDisplayNativeOperation.ResolveTargetMode, failed.failure.operation)
        assertFalse(native.captureRetained)
        assertFalse(native.calls.any { it.startsWith("capture:") })
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun modeArrayReleaseFailureAfterTargetRetainStillReleasesOwnedModes() {
        val native = LeaseDisplayNative().apply {
            failNext("release:$MODE_ARRAY", "array release failed")
        }

        val failed = assertIs<ExclusiveDisplayLeaseOpenResult.FailedBeforeCapture>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        )

        assertEquals(ExclusiveDisplayNativeOperation.ReleaseReference, failed.failure.operation)
        assertFalse(native.captureRetained)
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun failureAfterCaptureWithConfirmedReleaseHasNoRecovery() {
        val native = LeaseDisplayNative().apply {
            failNext("setMode:$DISPLAY_ID:$TARGET_MODE", "target rejected")
        }

        val failed = assertIs<ExclusiveDisplayLeaseOpenResult.FailedAfterCapture>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        )

        assertEquals(ExclusiveDisplayNativeOperation.SetTargetMode, failed.failure.operation)
        assertEquals(ExclusiveDisplayTerminal.Released(INITIAL_IDENTITY), failed.terminal)
        assertEquals(failed.terminal, failed.cleanup.terminal)
        assertNull(failed.recovery)
        assertFalse(native.captureRetained)
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun capturedFailureReturnsTheOnlyRecoveryOwnerAndReleaseCanRetry() {
        val native = LeaseDisplayNative().apply {
            failNext("setMode:$DISPLAY_ID:$TARGET_MODE", "target rejected")
            failNext("releaseCapture:$DISPLAY_ID", "release busy")
        }

        val failed = assertIs<ExclusiveDisplayLeaseOpenResult.FailedAfterCapture>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        )

        val captured = assertIs<ExclusiveDisplayTerminal.Captured>(failed.terminal)
        assertEquals(INITIAL_IDENTITY, captured.modeIdentity)
        val recovery = assertNotNull(failed.recovery)
        assertEquals(0, native.ownedReferenceCount)

        val retried = recovery.release()

        assertEquals(ExclusiveDisplayTerminal.Released(null), retried.terminal)
        assertFalse(native.captureRetained)
        assertEquals(2, native.calls.count { it == "releaseCapture:$DISPLAY_ID" })
    }

    @Test
    fun unknownFailureNeverInventsReadbackAndKeepsRecovery() {
        val native = LeaseDisplayNative().apply {
            failNext("setMode:$DISPLAY_ID:$TARGET_MODE", "target rejected")
            failNext("releaseCapture:$DISPLAY_ID", "release uncertain")
            failNext("isCaptured:$DISPLAY_ID", "capture readback unavailable")
        }

        val failed = assertIs<ExclusiveDisplayLeaseOpenResult.FailedAfterCapture>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        )

        assertSame(ExclusiveDisplayTerminal.Unknown, failed.terminal)
        assertSame(ExclusiveDisplayTerminal.Unknown, failed.cleanup.terminal)
        assertNotNull(failed.recovery)
        assertFalse(failed.terminal is ExclusiveDisplayTerminal.Released)
        assertFalse(failed.terminal is ExclusiveDisplayTerminal.Captured)
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun releaseAggregatesEveryCleanupFailureWithoutShortCircuiting() {
        val native = LeaseDisplayNative()
        val lease = assertIs<ExclusiveDisplayLeaseOpenResult.Opened>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        ).lease
        native.calls.clear()
        native.failNext("setMode:$DISPLAY_ID:$INITIAL_MODE", "restore failed")
        native.failNext("releaseCapture:$DISPLAY_ID", "release failed")
        native.failNext("isCaptured:$DISPLAY_ID", "readback failed")
        native.failNext("release:$TARGET_MODE", "readback ref failed")
        native.failNext("release:$TARGET_MODE", "target ref failed")
        native.failNext("release:$INITIAL_MODE", "initial ref failed")

        val result = lease.release()

        assertSame(ExclusiveDisplayTerminal.Unknown, result.terminal)
        assertEquals(
            listOf(
                ExclusiveDisplayNativeOperation.RestoreInitialMode,
                ExclusiveDisplayNativeOperation.ReleaseCapture,
                ExclusiveDisplayNativeOperation.Readback,
                ExclusiveDisplayNativeOperation.ReleaseReference,
                ExclusiveDisplayNativeOperation.ReleaseReference,
                ExclusiveDisplayNativeOperation.ReleaseReference,
            ),
            result.failures.map(ExclusiveDisplayNativeFailure::operation),
        )
        assertEquals(
            listOf(
                "setMode:$DISPLAY_ID:$INITIAL_MODE",
                "releaseCapture:$DISPLAY_ID",
                "copyMode:$DISPLAY_ID",
                "modeIdentity:$TARGET_MODE",
                "equal:$TARGET_MODE:$TARGET_MODE",
                "isCaptured:$DISPLAY_ID",
                "release:$TARGET_MODE",
                "release:$TARGET_MODE",
                "release:$INITIAL_MODE",
            ),
            native.calls,
        )
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun readbackFailureIsUnknownInsteadOfAFalseMode() {
        val native = LeaseDisplayNative()
        val lease = assertIs<ExclusiveDisplayLeaseOpenResult.Opened>(
            AppKitDisplayServices.openExclusiveLease(DISPLAY_ID, TARGET_IDENTITY, native),
        ).lease
        native.failNext("copyMode:$DISPLAY_ID", "mode unavailable")

        assertSame(ExclusiveDisplayTerminal.Unknown, lease.readback().terminal)

        lease.release()
        assertEquals(0, native.ownedReferenceCount)
    }

    @Test
    fun publicLeaseResultsDoNotExposeForeignMemorySegments() {
        val pointerFreeTypes = listOf(
            ExclusiveDisplayTerminal::class.java,
            ExclusiveDisplayReadback::class.java,
            ExclusiveDisplayNativeFailure::class.java,
            ExclusiveDisplayReleaseResult::class.java,
            ExclusiveDisplayLease::class.java,
            ExclusiveDisplayLeaseOpenResult::class.java,
        )

        assertFalse(
            pointerFreeTypes.flatMap { it.declaredFields.asList() }
                .any { MemorySegment::class.java.isAssignableFrom(it.type) },
        )
    }
}

private class LeaseDisplayNative : AppKitDisplayNative {
    val calls = mutableListOf<String>()
    private val ownedReferences = mutableMapOf<Long, Int>()
    private val failures = mutableMapOf<String, ArrayDeque<String>>()
    var currentMode: Long = INITIAL_MODE
    private var captured = false

    val ownedReferenceCount: Int
        get() = ownedReferences.values.sum()

    val captureRetained: Boolean
        get() = captured

    fun failNext(call: String, message: String) {
        failures.getOrPut(call, ::ArrayDeque).addLast(message)
    }

    override fun activeDisplays(): IntArray = intArrayOf(DISPLAY_ID)

    override fun pixelWidth(displayId: Int): Long = 1920

    override fun pixelHeight(displayId: Int): Long = 1080

    override fun bounds(displayId: Int): CGDisplayBoundsSnapshot =
        CGDisplayBoundsSnapshot(0.0, 0.0, 1920.0, 1080.0)

    override fun copyDisplayMode(displayId: Int): Long {
        calls += "copyMode:$displayId"
        fail("copyMode:$displayId")
        own(currentMode)
        return currentMode
    }

    override fun copyAllDisplayModes(displayId: Int): Long {
        calls += "copyAllModes:$displayId"
        own(MODE_ARRAY)
        return MODE_ARRAY
    }

    override fun modeCount(modes: Long): Long {
        calls += "count:$modes"
        return 2
    }

    override fun modeAt(modes: Long, index: Long): Long {
        calls += "modeAt:$modes:$index"
        return if (index == 0L) INITIAL_MODE else TARGET_MODE
    }

    override fun modePixelWidth(mode: Long): Long = 1920

    override fun modePixelHeight(mode: Long): Long = 1080

    override fun modeRefreshRate(mode: Long): Double = 60.0

    override fun modeIoFlags(mode: Long): Long = 0

    override fun modeIdentity(mode: Long): Long {
        calls += "modeIdentity:$mode"
        return when (mode) {
            INITIAL_MODE -> INITIAL_IDENTITY
            TARGET_MODE, IMPOSTOR_MODE -> TARGET_IDENTITY
            else -> 0
        }
    }

    override fun modesEqual(first: Long, second: Long): Boolean {
        calls += "equal:$first:$second"
        return first == second
    }

    override fun isCaptured(displayId: Int): Boolean {
        calls += "isCaptured:$displayId"
        fail("isCaptured:$displayId")
        return captured
    }

    override fun retain(mode: Long) {
        calls += "retain:$mode"
        own(mode)
    }

    override fun release(mode: Long) {
        calls += "release:$mode"
        val count = requireNotNull(ownedReferences[mode]) { "releasing unowned reference $mode" }
        if (count == 1) ownedReferences.remove(mode) else ownedReferences[mode] = count - 1
        fail("release:$mode")
    }

    override fun setDisplayMode(displayId: Int, mode: Long) {
        calls += "setMode:$displayId:$mode"
        fail("setMode:$displayId:$mode")
        currentMode = mode
    }

    override fun capture(displayId: Int) {
        calls += "capture:$displayId"
        fail("capture:$displayId")
        captured = true
    }

    override fun releaseCapture(displayId: Int) {
        calls += "releaseCapture:$displayId"
        fail("releaseCapture:$displayId")
        captured = false
    }

    override fun captureAll() = Unit

    override fun releaseAll() = Unit

    private fun own(handle: Long) {
        ownedReferences[handle] = ownedReferences.getOrDefault(handle, 0) + 1
    }

    private fun fail(call: String) {
        val queue = failures[call] ?: return
        val message = queue.removeFirst()
        if (queue.isEmpty()) failures.remove(call)
        throw IllegalStateException(message)
    }
}

private const val DISPLAY_ID = 17
private const val INITIAL_MODE = 0x100L
private const val TARGET_MODE = 0x200L
private const val IMPOSTOR_MODE = 0x300L
private const val MODE_ARRAY = 0xA11L
private const val INITIAL_IDENTITY = 0x111L
private const val TARGET_IDENTITY = 0x222L
