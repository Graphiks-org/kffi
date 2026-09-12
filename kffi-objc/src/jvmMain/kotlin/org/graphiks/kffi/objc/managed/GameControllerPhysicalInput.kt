package org.graphiks.kffi.objc.managed

import java.util.concurrent.atomic.AtomicBoolean

/** A detached physical control snapshot emitted by [GameControllerMonitor]. */
sealed interface GameControllerPhysicalInput {
    /** Exact GameController physical input names currently associated with this element. */
    val nativeNames: Set<String>

    data class Button(
        override val nativeNames: Set<String>,
        val value: Float,
        val pressed: Boolean,
    ) : GameControllerPhysicalInput

    data class Axis(
        override val nativeNames: Set<String>,
        val value: Float,
    ) : GameControllerPhysicalInput

    data class DirectionPad(
        override val nativeNames: Set<String>,
        val x: Float,
        val y: Float,
    ) : GameControllerPhysicalInput

    data class Other(
        override val nativeNames: Set<String>,
        val analog: Boolean,
    ) : GameControllerPhysicalInput
}

/** A pointer-free physical-input update for one monitor-local controller identity. */
data class GameControllerPhysicalInputEvent(
    val controller: GameControllerDeviceId,
    val input: GameControllerPhysicalInput,
)

/** One closeable physical-input observation owned by the native GameController bridge. */
class GameControllerPhysicalInputObservation internal constructor(
    private val native: AutoCloseable,
) : AutoCloseable {
    private val closed = AtomicBoolean()

    val isClosed: Boolean
        get() = closed.get()

    override fun close() {
        if (closed.compareAndSet(false, true)) native.close()
    }
}
