package org.graphiks.kffi.objc.appkit

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

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
) {
    init {
        require(width > 0) { "width must be positive" }
        require(height > 0) { "height must be positive" }
    }
}

/** Result of the asynchronous request to open a ScreenCaptureKit stream. */
sealed interface ScreenCaptureOpenResult {
    data class Opened(val session: ScreenCaptureStreamSession) : ScreenCaptureOpenResult

    data class Failed(val cause: Throwable) : ScreenCaptureOpenResult
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
internal open class ScreenCaptureResolvedTarget : AutoCloseable {
    override fun close() = Unit
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
