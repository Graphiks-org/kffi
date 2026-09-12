@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CMTime
import org.graphiks.kffi.objc.CMTimeFlags
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.time.Duration

/** A ScreenCaptureKit source identity with no native pointer exposed to callers. */
sealed interface ScreenCaptureTarget {
    /** Lets the system picker choose the initial capture source; available on macOS 14 and newer. */
    data object HostPicker : ScreenCaptureTarget

    data class Display(val id: Long) : ScreenCaptureTarget {
        init {
            require(id >= 0) { "display id must be non-negative" }
        }
    }

    data class Window(val id: Long) : ScreenCaptureTarget {
        init {
            require(id >= 0) { "window id must be non-negative" }
        }
    }
}

/** Output constraints supported by the initial ScreenCaptureKit streaming adapter. */
data class ScreenCaptureStreamConfiguration(
    val width: Int,
    val height: Int,
    val showsCursor: Boolean = true,
    val minimumFrameInterval: Duration? = null,
) {
    init {
        require(width > 0) { "width must be positive" }
        require(height > 0) { "height must be positive" }
        require(minimumFrameInterval == null || minimumFrameInterval.isFinite() && minimumFrameInterval.isPositive()) {
            "minimumFrameInterval must be finite and positive"
        }
    }
}

/** Converts the Kotlin duration to the exact nanosecond CoreMedia representation expected by AppKit. */
internal fun ScreenCaptureStreamConfiguration.minimumFrameIntervalAsCMTime(): CMTime? =
    minimumFrameInterval?.let { interval ->
        CMTime(
            value = interval.inWholeNanoseconds,
            timescale = NANOSECONDS_PER_SECOND,
            flags = CMTimeFlags.kCMTimeFlags_Valid,
            epoch = 0L,
        )
    }

private const val NANOSECONDS_PER_SECOND = 1_000_000_000

/** Result of the asynchronous request to open a ScreenCaptureKit stream. */
sealed interface ScreenCaptureOpenResult {
    data class Opened(val session: ScreenCaptureStreamSession) : ScreenCaptureOpenResult

    data class Failed(val cause: Throwable) : ScreenCaptureOpenResult
}

/** Detached identity of a source selected before a ScreenCaptureKit stream starts. */
sealed interface ScreenCaptureReservationSource {
    data object Unknown : ScreenCaptureReservationSource

    data class Display(val id: Long) : ScreenCaptureReservationSource {
        init {
            require(id >= 0) { "display id must be non-negative" }
        }
    }

    data class Window(val id: Long, val title: String?) : ScreenCaptureReservationSource {
        init {
            require(id >= 0) { "window id must be non-negative" }
        }
    }
}

/** Result of resolving a capture target without starting native frame production. */
sealed interface ScreenCaptureReservationResult {
    data class Reserved(val reservation: ScreenCaptureReservation) : ScreenCaptureReservationResult

    /** The host picker was explicitly dismissed before it selected a source. */
    data object Cancelled : ScreenCaptureReservationResult

    data class Failed(val cause: Throwable) : ScreenCaptureReservationResult
}

/**
 * Pointer-free ScreenCaptureKit target reservation.
 *
 * The reservation owns the native resolved target until [start] transfers that ownership to a
 * managed stream coordinator. Closing before [start] releases the resolved target without ever
 * creating a stream.
 */
interface ScreenCaptureReservation : AutoCloseable {
    val source: ScreenCaptureReservationSource

    fun start(
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
        onOpened: (ScreenCaptureOpenResult) -> Unit,
        onStopped: (ScreenCaptureStopResult) -> Unit,
    ): AutoCloseable

    override fun close()
}

/** Terminal result reported after an already opened stream has stopped. */
sealed interface ScreenCaptureStopResult {
    data object Stopped : ScreenCaptureStopResult

    data class Failed(val cause: Throwable) : ScreenCaptureStopResult
}

/** Pointer-free owner for one active ScreenCaptureKit stream. */
interface ScreenCaptureStreamSession : AutoCloseable {
    fun requestStop()

    override fun close() = requestStop()
}

/**
 * Native seam for resolving a detached source identity and owning the resulting stream.
 *
 * The runtime implementation is supplied by the AppKit adapter; this seam keeps admission and
 * teardown semantics deterministic under JVM tests.
 */
internal interface ScreenCaptureNative {
    fun resolve(
        target: ScreenCaptureTarget,
        callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
    ): AutoCloseable

    fun open(
        target: ScreenCaptureResolvedTarget,
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
    ): ScreenCaptureNativeStream
}

/** Native, still-unstarted stream retained by the coordinator until terminal teardown. */
internal interface ScreenCaptureNativeStream : AutoCloseable {
    fun start(completion: (Throwable?) -> Unit)

    fun stop(completion: (Throwable?) -> Unit)
}

/** Opaque resolved source token; only the AppKit native implementation may attach native state. */
internal open class ScreenCaptureResolvedTarget(
    open val source: ScreenCaptureReservationSource = ScreenCaptureReservationSource.Unknown,
) : AutoCloseable {
    override fun close() = Unit
}

/** Resolves a target once and transfers its native ownership to a later explicit start. */
internal object ScreenCaptureReservationCoordinator {
    fun reserve(
        native: ScreenCaptureNative,
        target: ScreenCaptureTarget,
        callback: (ScreenCaptureReservationResult) -> Unit,
    ): AutoCloseable = ReservationAttempt(native, target, callback)
}

private class ReservationAttempt(
    private val native: ScreenCaptureNative,
    target: ScreenCaptureTarget,
    private val callback: (ScreenCaptureReservationResult) -> Unit,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var closed = false
    private var completed = false
    private var resolver: AutoCloseable? = null

    init {
        val installedResolver = native.resolve(target, ::resolved)
        val closeImmediately = lock.withLock {
            if (closed || completed) installedResolver else {
                resolver = installedResolver
                null
            }
        }
        closeImmediately?.close()
    }

    override fun close() {
        val owner = lock.withLock {
            if (closed) return
            closed = true
            resolver.also { resolver = null }
        }
        owner?.close()
    }

    private fun resolved(result: Result<ScreenCaptureResolvedTarget>) {
        val resolved = result.getOrElse { failure ->
            deliverFailure(failure)
            return
        }
        val accepted = lock.withLock {
            if (closed || completed) {
                false
            } else {
                completed = true
                resolver = null
                true
            }
        }
        if (!accepted) {
            resolved.close()
            return
        }
        callback(ScreenCaptureReservationResult.Reserved(ManagedReservation(native, resolved)))
    }

    private fun deliverFailure(failure: Throwable) {
        val accepted = lock.withLock {
            if (closed || completed) {
                false
            } else {
                completed = true
                resolver = null
                true
            }
        }
        if (accepted) {
            callback(
                if (failure is ScreenCapturePickerCancelled) {
                    ScreenCaptureReservationResult.Cancelled
                } else {
                    ScreenCaptureReservationResult.Failed(failure)
                },
            )
        }
    }
}

private class ManagedReservation(
    private val native: ScreenCaptureNative,
    resolved: ScreenCaptureResolvedTarget,
) : ScreenCaptureReservation {
    private val lock = ReentrantLock()
    private var resolved: ScreenCaptureResolvedTarget? = resolved
    private var stream: AutoCloseable? = null
    private var closed = false
    private var starting = false

    override val source: ScreenCaptureReservationSource = resolved.source

    override fun start(
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
        onOpened: (ScreenCaptureOpenResult) -> Unit,
        onStopped: (ScreenCaptureStopResult) -> Unit,
    ): AutoCloseable {
        val target = lock.withLock {
            check(!closed) { "ScreenCaptureKit reservation is closed" }
            check(!starting && stream == null) { "ScreenCaptureKit reservation has already started" }
            starting = true
            checkNotNull(resolved).also { resolved = null }
        }
        val opened = ScreenCaptureSessionCoordinator.open(
            native = ResolvedTargetNative(native, target),
            target = ScreenCaptureTarget.HostPicker,
            configuration = configuration,
            onFrame = onFrame,
            onOpened = onOpened,
            onStopped = onStopped,
        )
        val closeImmediately = lock.withLock {
            starting = false
            if (closed) {
                opened
            } else {
                stream = opened
                null
            }
        }
        closeImmediately?.close()
        return opened
    }

    override fun close() {
        val owner = lock.withLock {
            if (closed) return
            closed = true
            val reservedTarget = resolved
            resolved = null
            stream ?: reservedTarget
        }
        owner?.close()
    }
}

/** One-shot resolver used to transfer a previously resolved target into the existing coordinator. */
private class ResolvedTargetNative(
    private val delegate: ScreenCaptureNative,
    private var resolved: ScreenCaptureResolvedTarget?,
) : ScreenCaptureNative {
    override fun resolve(
        target: ScreenCaptureTarget,
        callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
    ): AutoCloseable {
        val value = checkNotNull(resolved) { "ScreenCaptureKit resolved target was consumed twice" }
        resolved = null
        callback(Result.success(value))
        return AutoCloseable { }
    }

    override fun open(
        target: ScreenCaptureResolvedTarget,
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
    ): ScreenCaptureNativeStream = delegate.open(target, configuration, onFrame)
}

/**
 * Serializes source resolution, asynchronous stream start, and stop-before-release semantics.
 *
 * It deliberately exposes no native object. Closing during discovery cancels only the discovery
 * request; closing after a native stream exists waits for that stream's stop completion before
 * releasing it. Framework callbacks arriving after cancellation are ignored.
 */
internal class ScreenCaptureSessionCoordinator private constructor(
    private val native: ScreenCaptureNative,
    private val target: ScreenCaptureTarget,
    private val configuration: ScreenCaptureStreamConfiguration,
    private val onFrame: (ScreenCaptureFrameLease) -> Unit,
    private val onOpened: (ScreenCaptureOpenResult) -> Unit,
    private val onStopped: (ScreenCaptureStopResult) -> Unit,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var state = State.RESOLVING
    private var resolver: AutoCloseable? = null
    private var stream: ScreenCaptureNativeStream? = null
    private var opened = false
    private var stopRequested = false

    init {
        val installedResolver = native.resolve(target, ::resolved)
        val closeResolver = lock.withLock {
            if (state == State.RESOLVING) {
                resolver = installedResolver
                null
            } else {
                installedResolver
            }
        }
        closeResolver?.close()
    }

    override fun close() = requestStop()

    fun requestStop() {
        val action = lock.withLock {
            when (state) {
                State.RESOLVING -> {
                    state = State.TERMINATED
                    resolver.also { resolver = null }
                }

                State.STARTING, State.ACTIVE -> {
                    if (stopRequested) return
                    stopRequested = true
                    state = State.STOPPING
                    stream
                }

                State.STOPPING, State.TERMINATED -> return
            }
        }
        when (action) {
            is ScreenCaptureNativeStream -> stop(action)
            else -> action?.close()
        }
    }

    private fun resolved(result: Result<ScreenCaptureResolvedTarget>) {
        val resolvedTarget = result.getOrElse { failure ->
            failBeforeOpen(failure)
            return
        }
        val shouldOpen = lock.withLock {
            if (state != State.RESOLVING) {
                false
            } else {
                resolver = null
                state = State.STARTING
                true
            }
        }
        if (!shouldOpen) {
            resolvedTarget.close()
            return
        }

        val created = try {
            native.open(resolvedTarget, configuration, onFrame)
        } catch (failure: Throwable) {
            resolvedTarget.close()
            failBeforeOpen(failure)
            return
        }
        resolvedTarget.close()
        val closeCreated = lock.withLock {
            if (state == State.STARTING) {
                stream = created
                null
            } else {
                created
            }
        }
        if (closeCreated != null) {
            closeCreated.close()
            return
        }
        try {
            created.start { failure -> started(created, failure) }
        } catch (failure: Throwable) {
            started(created, failure)
        }
    }

    private fun started(candidate: ScreenCaptureNativeStream, failure: Throwable?) {
        val result = lock.withLock {
            if (stream !== candidate || state == State.TERMINATED) return
            if (failure != null && state == State.STARTING) {
                state = State.TERMINATED
                stream = null
                ScreenCaptureOpenResult.Failed(failure)
            } else if (state == State.STARTING) {
                state = State.ACTIVE
                opened = true
                ScreenCaptureOpenResult.Opened(ManagedSession(this))
            } else {
                null
            }
        }
        if (result is ScreenCaptureOpenResult.Failed) {
            candidate.close()
        }
        result?.let(onOpened)
    }

    private fun stop(candidate: ScreenCaptureNativeStream) {
        try {
            candidate.stop { failure -> stopped(candidate, failure) }
        } catch (failure: Throwable) {
            stopped(candidate, failure)
        }
    }

    private fun stopped(candidate: ScreenCaptureNativeStream, failure: Throwable?) {
        val notify = lock.withLock {
            if (stream !== candidate || state == State.TERMINATED) return
            state = State.TERMINATED
            stream = null
            opened.also { opened = false }
        }
        candidate.close()
        if (notify) {
            onStopped(if (failure == null) ScreenCaptureStopResult.Stopped else ScreenCaptureStopResult.Failed(failure))
        }
    }

    private fun failBeforeOpen(failure: Throwable) {
        val shouldNotify = lock.withLock {
            when (state) {
                State.RESOLVING, State.STARTING -> {
                    state = State.TERMINATED
                    resolver = null
                    true
                }

                State.STOPPING -> {
                    state = State.TERMINATED
                    resolver = null
                    false
                }

                State.ACTIVE, State.TERMINATED -> false
            }
        }
        if (shouldNotify) onOpened(ScreenCaptureOpenResult.Failed(failure))
    }

    private class ManagedSession(
        private val owner: ScreenCaptureSessionCoordinator,
    ) : ScreenCaptureStreamSession {
        override fun requestStop() = owner.requestStop()
    }

    private enum class State { RESOLVING, STARTING, ACTIVE, STOPPING, TERMINATED }

    internal companion object {
        fun open(
            native: ScreenCaptureNative,
            target: ScreenCaptureTarget,
            configuration: ScreenCaptureStreamConfiguration,
            onFrame: (ScreenCaptureFrameLease) -> Unit,
            onOpened: (ScreenCaptureOpenResult) -> Unit,
            onStopped: (ScreenCaptureStopResult) -> Unit,
        ): ScreenCaptureSessionCoordinator = ScreenCaptureSessionCoordinator(
            native,
            target,
            configuration,
            onFrame,
            onOpened,
            onStopped,
        )
    }
}
