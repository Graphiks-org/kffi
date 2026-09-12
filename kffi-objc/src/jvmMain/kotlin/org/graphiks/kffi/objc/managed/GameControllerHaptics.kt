@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.CHHapticEngine
import org.graphiks.kffi.objc.CHHapticEvent
import org.graphiks.kffi.objc.CHHapticEventParameter
import org.graphiks.kffi.objc.CHHapticEventParameterIDHapticIntensity
import org.graphiks.kffi.objc.CHHapticEventTypeHapticContinuous
import org.graphiks.kffi.objc.CHHapticPattern
import org.graphiks.kffi.objc.GCDeviceHaptics
import org.graphiks.kffi.objc.GCHapticsLocalityAll
import org.graphiks.kffi.objc.GCHapticsLocalityDefault
import org.graphiks.kffi.objc.GCHapticsLocalityHandles
import org.graphiks.kffi.objc.GCHapticsLocalityLeftHandle
import org.graphiks.kffi.objc.GCHapticsLocalityLeftTrigger
import org.graphiks.kffi.objc.GCHapticsLocalityRightHandle
import org.graphiks.kffi.objc.GCHapticsLocalityRightTrigger
import org.graphiks.kffi.objc.GCHapticsLocalityTriggers
import org.graphiks.kffi.objc.NSError
import org.graphiks.kffi.objc.NSSet
import org.graphiks.kffi.objc.NSArray_arrayWithObject
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.asCHHapticPatternPlayer
import org.graphiks.kffi.objc.containsObject
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.time.Duration
import kotlin.time.DurationUnit

/** A detached locality exposed by a GameController haptics device. */
enum class GameControllerHapticLocality {
    Default,
    All,
    Handles,
    LeftHandle,
    RightHandle,
    Triggers,
    LeftTrigger,
    RightTrigger,
}

/** A Kotlin-owned haptic engine created for one advertised game-controller locality. */
class GameControllerHaptics private constructor(
    private val session: GameControllerHapticsSession,
    val locality: GameControllerHapticLocality,
    supportedLocalities: Set<GameControllerHapticLocality>,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var closed = false

    /** Immutable snapshot of the localities reported before this engine was created. */
    val supportedLocalities: Set<GameControllerHapticLocality> = supportedLocalities.toSet()

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

    /**
     * Plays one continuous haptic pulse through this engine's advertised locality.
     *
     * The engine must already be started with [start]. A successful result only means that
     * Core Haptics accepted the fire-and-forget playback request.
     */
    fun playContinuous(intensity: Float, duration: Duration): Result<Unit> = lock.withLock {
        if (closed) return Result.failure(IllegalStateException("GameControllerHaptics is closed"))
        require(intensity.isFinite() && intensity in 0.0f..1.0f) {
            "Haptic intensity must be finite and within 0.0..1.0"
        }
        require(duration.isFinite() && duration.isPositive()) {
            "Haptic duration must be finite and positive"
        }
        session.playContinuous(intensity, duration)?.let { failure ->
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
        /** Creates an engine for the default locality when the controller advertises it. */
        fun create(deviceHaptics: GCDeviceHaptics): Result<GameControllerHaptics> =
            create(deviceHaptics, GameControllerHapticLocality.Default, CoreHapticsFactory)

        /**
         * Creates an engine for an explicitly advertised locality.
         *
         * This API never chooses a substitute locality: callers must select one of
         * [supportedLocalities].
         */
        fun create(
            deviceHaptics: GCDeviceHaptics,
            locality: GameControllerHapticLocality,
        ): Result<GameControllerHaptics> = create(deviceHaptics, locality, CoreHapticsFactory)

        internal fun create(
            deviceHaptics: GCDeviceHaptics,
            locality: GameControllerHapticLocality,
            factory: GameControllerHapticsFactory,
        ): Result<GameControllerHaptics> = runCatching {
            val supportedLocalities = factory.supportedLocalities(deviceHaptics).toSet()
            if (locality !in supportedLocalities) {
                throw GameControllerHapticsException(
                    domain = null,
                    code = null,
                    message = "The controller does not advertise haptic locality $locality",
                )
            }
            val session = factory.create(deviceHaptics, locality)
                ?: throw GameControllerHapticsException(
                    domain = null,
                    code = null,
                    message = "The controller could not create a haptic engine",
                )
            GameControllerHaptics(session, locality, supportedLocalities)
        }

        internal fun create(
            deviceHaptics: GCDeviceHaptics,
            factory: GameControllerHapticsFactory,
        ): Result<GameControllerHaptics> =
            create(deviceHaptics, GameControllerHapticLocality.Default, factory)
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
    fun create(
        deviceHaptics: GCDeviceHaptics,
        locality: GameControllerHapticLocality,
    ): GameControllerHapticsSession?

    fun supportedLocalities(
        deviceHaptics: GCDeviceHaptics,
    ): Set<GameControllerHapticLocality> = setOf(GameControllerHapticLocality.Default)
}

internal interface GameControllerHapticsSession {
    /** Returns a detached Kotlin error snapshot, or null on success. */
    fun start(): GameControllerHapticsFailure?

    /** Returns a detached Kotlin error snapshot, or null when Core Haptics accepted the pulse. */
    fun playContinuous(intensity: Float, duration: Duration): GameControllerHapticsFailure?

    fun stop()

    fun release()
}

private object CoreHapticsFactory : GameControllerHapticsFactory {
    override fun create(
        deviceHaptics: GCDeviceHaptics,
        locality: GameControllerHapticLocality,
    ): GameControllerHapticsSession? =
        ObjCRuntime.autoreleasePool {
            val engine = deviceHaptics.createEngineWithLocality(locality.nativeValue)
            if (engine == MemorySegment.NULL) return@autoreleasePool null
            ObjCManagedRuntime.retain(engine)
            CoreHapticsSession(CHHapticEngine(engine))
        }

    override fun supportedLocalities(
        deviceHaptics: GCDeviceHaptics,
    ): Set<GameControllerHapticLocality> = ObjCRuntime.autoreleasePool {
        val nativeLocalities = deviceHaptics.supportedLocalities()
        if (nativeLocalities == MemorySegment.NULL) return@autoreleasePool emptySet()
        GameControllerHapticLocality.entries
            .filterTo(linkedSetOf()) { locality -> NSSet(nativeLocalities).containsObject(locality.nativeValue) }
    }
}

private val GameControllerHapticLocality.nativeValue: MemorySegment
    get() = when (this) {
        GameControllerHapticLocality.Default -> GCHapticsLocalityDefault
        GameControllerHapticLocality.All -> GCHapticsLocalityAll
        GameControllerHapticLocality.Handles -> GCHapticsLocalityHandles
        GameControllerHapticLocality.LeftHandle -> GCHapticsLocalityLeftHandle
        GameControllerHapticLocality.RightHandle -> GCHapticsLocalityRightHandle
        GameControllerHapticLocality.Triggers -> GCHapticsLocalityTriggers
        GameControllerHapticLocality.LeftTrigger -> GCHapticsLocalityLeftTrigger
        GameControllerHapticLocality.RightTrigger -> GCHapticsLocalityRightTrigger
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

    override fun playContinuous(
        intensity: Float,
        duration: Duration,
    ): GameControllerHapticsFailure? = ObjCRuntime.autoreleasePool {
        Arena.ofConfined().use { arena ->
            val outError = arena.allocate(ValueLayout.ADDRESS)
            var parameter = MemorySegment.NULL
            var event = MemorySegment.NULL
            var pattern = MemorySegment.NULL
            var player = MemorySegment.NULL
            try {
                parameter = CHHapticEventParameter(allocateObjectiveCObject("CHHapticEventParameter"))
                    .initWithParameterID_value(CHHapticEventParameterIDHapticIntensity, intensity)
                if (parameter == MemorySegment.NULL) {
                    return@use hapticsFailure("Core Haptics could not create an intensity parameter")
                }

                event = CHHapticEvent(allocateObjectiveCObject("CHHapticEvent"))
                    .initWithEventType_parameters_relativeTime_duration(
                        type = CHHapticEventTypeHapticContinuous,
                        eventParams = NSArray_arrayWithObject(parameter),
                        time = 0.0,
                        duration = duration.toDouble(DurationUnit.SECONDS),
                    )
                if (event == MemorySegment.NULL) {
                    return@use hapticsFailure("Core Haptics could not create a continuous event")
                }

                clearHapticsError(outError)
                pattern = CHHapticPattern(allocateObjectiveCObject("CHHapticPattern"))
                    .initWithEvents_parameters_error(
                        events = NSArray_arrayWithObject(event),
                        parameters = MemorySegment.NULL,
                        outError = outError,
                    )
                if (pattern == MemorySegment.NULL) return@use hapticsError(outError)

                clearHapticsError(outError)
                player = engine.createPlayerWithPattern_error(pattern, outError)
                if (player == MemorySegment.NULL) return@use hapticsError(outError)

                clearHapticsError(outError)
                if (!player.asCHHapticPatternPlayer().startAtTime_error(0.0, outError)) {
                    return@use hapticsError(outError)
                }
                null
            } finally {
                releaseObjectiveCObject(player)
                releaseObjectiveCObject(pattern)
                releaseObjectiveCObject(event)
                releaseObjectiveCObject(parameter)
            }
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

private fun allocateObjectiveCObject(className: String): MemorySegment = (
    ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass(className),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment
).also { value -> check(value != MemorySegment.NULL) { "$className alloc returned nil" } }

private fun releaseObjectiveCObject(value: MemorySegment) {
    if (value != MemorySegment.NULL) ObjCManagedRuntime.release(value)
}

private fun clearHapticsError(outError: MemorySegment) {
    outError.set(ValueLayout.ADDRESS, 0L, MemorySegment.NULL)
}

private fun hapticsError(outError: MemorySegment): GameControllerHapticsFailure =
    outError.get(ValueLayout.ADDRESS, 0L).toHapticsFailure()

private fun hapticsFailure(description: String): GameControllerHapticsFailure = GameControllerHapticsFailure(
    domain = null,
    code = null,
    description = description,
)
