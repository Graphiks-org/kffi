package org.graphiks.kffi.objc.appkit

import java.util.concurrent.atomic.AtomicBoolean
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue

class ScreenCaptureSessionCoordinatorTest {
    @Test
    fun reservationReportsPickerCancellationWithoutErasingItsMeaning() {
        val native = RecordingScreenCaptureRuntime()
        val results = mutableListOf<ScreenCaptureReservationResult>()
        ScreenCaptureReservationCoordinator.reserve(
            native = native,
            target = ScreenCaptureTarget.HostPicker,
            callback = results::add,
        )

        native.completeResolutionFailure(ScreenCapturePickerCancelled())

        assertEquals(ScreenCaptureReservationResult.Cancelled, results.single())
    }

    @Test
    fun reservationKeepsTheResolvedTargetWithoutStartingCapture() {
        val native = RecordingScreenCaptureRuntime()
        val results = mutableListOf<ScreenCaptureReservationResult>()
        val target = ClosingResolvedTarget()
        ScreenCaptureReservationCoordinator.reserve(
            native = native,
            target = ScreenCaptureTarget.Display(7L),
            callback = results::add,
        )

        native.completeResolution(target)

        val reservation = assertIs<ScreenCaptureReservationResult.Reserved>(results.single()).reservation
        assertEquals(0, native.openCalls)

        reservation.close()

        assertTrue(target.isClosed)
        assertEquals(0, native.openCalls)
    }

    @Test
    fun reservationCloseReenteredDuringNativeOpenStopsTheLateStream() {
        lateinit var reservation: ScreenCaptureReservation
        val native = RecordingScreenCaptureRuntime(onOpen = { reservation.close() })
        val results = mutableListOf<ScreenCaptureReservationResult>()
        ScreenCaptureReservationCoordinator.reserve(
            native = native,
            target = ScreenCaptureTarget.Display(7L),
            callback = results::add,
        )
        native.completeResolution()
        reservation = assertIs<ScreenCaptureReservationResult.Reserved>(results.single()).reservation

        reservation.start(
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = {},
            onStopped = {},
        )

        assertEquals(1, native.openCalls)
        assertEquals(1, native.stream.stopCalls)
    }

    @Test
    fun startFailureClosesTheNativeStreamAndReportsOneOpenFailure() {
        val native = RecordingScreenCaptureRuntime()
        val results = mutableListOf<ScreenCaptureOpenResult>()
        ScreenCaptureSessionCoordinator.open(
            native = native,
            target = ScreenCaptureTarget.Display(7L),
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = results::add,
            onStopped = {},
        )

        native.completeResolution()
        native.stream.completeStart(IllegalStateException("TCC denied"))

        assertIs<ScreenCaptureOpenResult.Failed>(results.single())
        assertTrue(native.stream.isClosed)
        assertEquals(0, native.stream.stopCalls)
    }

    @Test
    fun closeWhileResolvingCancelsDiscoveryAndIgnoresALateResolution() {
        val native = RecordingScreenCaptureRuntime()
        val results = mutableListOf<ScreenCaptureOpenResult>()
        val attempt = ScreenCaptureSessionCoordinator.open(
            native = native,
            target = ScreenCaptureTarget.Window(11L),
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = results::add,
            onStopped = {},
        )

        attempt.close()
        native.completeResolution()

        assertTrue(native.discoveryClosed.get())
        assertEquals(emptyList(), results)
        assertEquals(0, native.openCalls)
    }

    @Test
    fun closeWhileResolvingClosesTheLateResolvedTarget() {
        val native = RecordingScreenCaptureRuntime()
        val attempt = ScreenCaptureSessionCoordinator.open(
            native = native,
            target = ScreenCaptureTarget.Window(11L),
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = {},
            onStopped = {},
        )
        val lateTarget = ClosingResolvedTarget()

        attempt.close()
        native.completeResolution(lateTarget)

        assertTrue(lateTarget.isClosed)
        assertEquals(0, native.openCalls)
    }

    @Test
    fun activeCloseStopsBeforeReleasingAndReportsTerminationOnce() {
        val native = RecordingScreenCaptureRuntime()
        val opened = mutableListOf<ScreenCaptureOpenResult>()
        val stopped = mutableListOf<ScreenCaptureStopResult>()
        ScreenCaptureSessionCoordinator.open(
            native = native,
            target = ScreenCaptureTarget.Display(7L),
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = opened::add,
            onStopped = stopped::add,
        )

        native.completeResolution()
        native.stream.completeStart(null)
        val session = assertIs<ScreenCaptureOpenResult.Opened>(opened.single()).session

        session.close()
        assertEquals(1, native.stream.stopCalls)
        assertTrue(!native.stream.isClosed)

        native.stream.completeStop(null)

        assertTrue(native.stream.isClosed)
        assertEquals(1, stopped.size)
        assertEquals(ScreenCaptureStopResult.Stopped, stopped.single())
        session.close()
        assertEquals(1, stopped.size)
    }

    @Test
    fun closeWhileStartingWaitsForStopAndDoesNotReportTheLateStartFailure() {
        val native = RecordingScreenCaptureRuntime()
        val opened = mutableListOf<ScreenCaptureOpenResult>()
        val stopped = mutableListOf<ScreenCaptureStopResult>()
        val attempt = ScreenCaptureSessionCoordinator.open(
            native = native,
            target = ScreenCaptureTarget.Display(7L),
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = opened::add,
            onStopped = stopped::add,
        )

        native.completeResolution()
        attempt.close()
        native.stream.completeStart(IllegalStateException("start lost the race with close"))

        assertEquals(emptyList(), opened)
        assertTrue(!native.stream.isClosed)

        native.stream.completeStop(null)

        assertTrue(native.stream.isClosed)
        assertEquals(emptyList(), stopped)
    }

    @Test
    fun closeDuringNativeOpenSuppressesTheResultOfTheAbandonedOpen() {
        lateinit var attempt: AutoCloseable
        val native = RecordingScreenCaptureRuntime(
            onOpen = { attempt.close() },
            openFailure = IllegalStateException("native open failed after close"),
        )
        val opened = mutableListOf<ScreenCaptureOpenResult>()
        attempt = ScreenCaptureSessionCoordinator.open(
            native = native,
            target = ScreenCaptureTarget.Display(7L),
            configuration = ScreenCaptureStreamConfiguration(640, 480),
            onFrame = {},
            onOpened = opened::add,
            onStopped = {},
        )

        native.completeResolution()

        assertEquals(emptyList(), opened)
    }
}

private class RecordingScreenCaptureRuntime(
    private val onOpen: (() -> Unit)? = null,
    private val openFailure: Throwable? = null,
) : ScreenCaptureNative {
    val discoveryClosed = AtomicBoolean()
    val stream = RecordingScreenCaptureNativeStream()
    var openCalls = 0
    private var resolution: ((Result<ScreenCaptureResolvedTarget>) -> Unit)? = null

    override fun resolve(
        target: ScreenCaptureTarget,
        callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
    ): AutoCloseable {
        resolution = callback
        return AutoCloseable { discoveryClosed.set(true) }
    }

    override fun open(
        target: ScreenCaptureResolvedTarget,
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
    ): ScreenCaptureNativeStream {
        openCalls += 1
        onOpen?.invoke()
        openFailure?.let { throw it }
        return stream
    }

    fun completeResolution(target: ScreenCaptureResolvedTarget = ScreenCaptureResolvedTarget()) {
        resolution?.invoke(Result.success(target))
    }

    fun completeResolutionFailure(failure: Throwable) {
        resolution?.invoke(Result.failure(failure))
    }
}

private class ClosingResolvedTarget : ScreenCaptureResolvedTarget() {
    var isClosed = false

    override fun close() {
        isClosed = true
    }
}

private class RecordingScreenCaptureNativeStream : ScreenCaptureNativeStream {
    private var start: ((Throwable?) -> Unit)? = null
    private var stop: ((Throwable?) -> Unit)? = null
    var stopCalls = 0
    var isClosed = false

    override fun start(completion: (Throwable?) -> Unit) {
        start = completion
    }

    override fun stop(completion: (Throwable?) -> Unit) {
        stopCalls += 1
        stop = completion
    }

    override fun close() {
        isClosed = true
    }

    fun completeStart(failure: Throwable?) {
        start?.invoke(failure)
    }

    fun completeStop(failure: Throwable?) {
        stop?.invoke(failure)
    }
}
