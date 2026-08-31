@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.CHHapticEngine
import org.graphiks.kffi.objc.GCDeviceHaptics
import org.graphiks.kffi.objc.GCHapticsLocalityDefault
import org.graphiks.kffi.objc.NSError
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** A Kotlin-owned haptic engine created for a game controller's default locality. */
class GameControllerHaptics private constructor(
    private val session: GameControllerHapticsSession,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var closed = false

    /** Starts the engine, mapping any native `NSError` to a Kotlin exception. */
    fun start(): Result<Unit> = lock.withLock {
        if (closed) return Result.failure(IllegalStateException("GameControllerHaptics is closed"))
        session.start()?.let { failure ->
            Result.failure(
                GameControllerHapticsException(
                    domain = failure.domain,
                    code = failure.code,
                    message = failure.description,
                ),
            )
        } ?: Result.success(Unit)
    }

    override fun close() {
        lock.withLock {
            if (closed) return
            closed = true
            var failure: Throwable? = null
            try {
                session.stop()
            } catch (stopFailure: Throwable) {
                failure = stopFailure
            }
            try {
                session.release()
            } catch (releaseFailure: Throwable) {
                failure?.addSuppressed(releaseFailure) ?: run { failure = releaseFailure }
            }
            failure?.let { throw it }
        }
    }

    companion object {
        /** Creates an engine for the guaranteed default haptic locality. */
        fun create(deviceHaptics: GCDeviceHaptics): Result<GameControllerHaptics> =
            create(deviceHaptics, CoreHapticsFactory)

        internal fun create(
            deviceHaptics: GCDeviceHaptics,
            factory: GameControllerHapticsFactory,
        ): Result<GameControllerHaptics> = runCatching {
            val session = factory.create(deviceHaptics)
                ?: throw GameControllerHapticsException(
                    domain = null,
                    code = null,
                    message = "The controller could not create a haptic engine",
                )
            GameControllerHaptics(session)
        }
    }
}

/** A pointer-free Kotlin failure produced by [GameControllerHaptics]. */
class GameControllerHapticsException internal constructor(
    val domain: String?,
    val code: Long?,
    message: String,
) : IllegalStateException(message)

internal data class GameControllerHapticsFailure(
    val domain: String?,
    val code: Long?,
    val description: String,
)

internal fun interface GameControllerHapticsFactory {
    fun create(deviceHaptics: GCDeviceHaptics): GameControllerHapticsSession?
}

internal interface GameControllerHapticsSession {
    /** Returns a detached Kotlin error snapshot, or null on success. */
    fun start(): GameControllerHapticsFailure?

    fun stop()

    fun release()
}

private object CoreHapticsFactory : GameControllerHapticsFactory {
    override fun create(deviceHaptics: GCDeviceHaptics): GameControllerHapticsSession? =
        ObjCRuntime.autoreleasePool {
            val engine = deviceHaptics.createEngineWithLocality(GCHapticsLocalityDefault)
            if (engine == MemorySegment.NULL) return@autoreleasePool null
            ObjCManagedRuntime.retain(engine)
            CoreHapticsSession(CHHapticEngine(engine))
        }
}

private class CoreHapticsSession(
    private val engine: CHHapticEngine,
) : GameControllerHapticsSession {
    override fun start(): GameControllerHapticsFailure? = Arena.ofConfined().use { arena ->
        val outError = arena.allocate(ValueLayout.ADDRESS)
        outError.set(ValueLayout.ADDRESS, 0L, MemorySegment.NULL)
        ObjCRuntime.autoreleasePool {
            if (engine.startAndReturnError(outError)) return@autoreleasePool null
            outError.get(ValueLayout.ADDRESS, 0L).toHapticsFailure()
        }
    }

    override fun stop() {
        engine.stopWithCompletionHandler(MemorySegment.NULL)
    }

    override fun release() {
        ObjCManagedRuntime.release(engine.ptr)
    }
}

private fun MemorySegment.toHapticsFailure(): GameControllerHapticsFailure {
    if (this == MemorySegment.NULL) {
        return GameControllerHapticsFailure(
            domain = null,
            code = null,
            description = "The haptic engine failed without an NSError",
        )
    }

    val error = NSError(this)
    val domain = runCatching { ObjCRuntime.toJavaString(error.domain()) }.getOrNull()
    val code = runCatching(error::code).getOrNull()
    val description = runCatching(error::localizedDescriptionAsString).getOrNull()
        ?: when {
            domain != null && code != null -> "CoreHaptics error: $domain ($code)"
            domain != null -> "CoreHaptics error: $domain"
            code != null -> "CoreHaptics error code: $code"
            else -> "The haptic engine failed"
        }
    return GameControllerHapticsFailure(domain, code, description)
}
