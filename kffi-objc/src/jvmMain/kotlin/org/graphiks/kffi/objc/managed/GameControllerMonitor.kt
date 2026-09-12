@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.GCController
import org.graphiks.kffi.objc.GCControllerAxisInput
import org.graphiks.kffi.objc.GCControllerButtonInput
import org.graphiks.kffi.objc.GCControllerDidConnectNotification
import org.graphiks.kffi.objc.GCControllerDidDisconnectNotification
import org.graphiks.kffi.objc.GCControllerDirectionPad
import org.graphiks.kffi.objc.GCControllerElement
import org.graphiks.kffi.objc.GCDeviceHaptics
import org.graphiks.kffi.objc.GCPhysicalInputProfile
import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSDictionary
import org.graphiks.kffi.objc.NSOperatingSystemVersion
import org.graphiks.kffi.objc.NSProcessInfo
import org.graphiks.kffi.objc.NSNotificationCenter
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.allKeysForObject
import org.graphiks.kffi.objc.allValues
import org.graphiks.kffi.objc.vendorName
import org.graphiks.kffi.objc.productCategory
import java.lang.foreign.MemorySegment
import java.util.ArrayDeque
import java.util.LinkedHashMap
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Opaque identity allocated by one [GameControllerMonitor]. */
@JvmInline
value class GameControllerDeviceId internal constructor(internal val value: Long)

/** Detached metadata observed from a GameController device. */
data class GameControllerDescriptor(
    val vendorName: String? = null,
    val productCategory: String? = null,
    val hasPhysicalInputProfile: Boolean = false,
    val profile: GameControllerProfile = GameControllerProfile.Native,
    val hapticLocalities: Set<GameControllerHapticLocality> = emptySet(),
)

/** The semantic mapping available from the controller's GameController profile. */
enum class GameControllerProfile { Standard, Native }

/** One detached GameController state captured before the monitor publishes a connection. */
data class GameControllerSnapshot(
    val descriptor: GameControllerDescriptor,
    val initialPhysicalInputs: List<GameControllerPhysicalInput>,
)

/** A pointer-free controller projection owned by one [GameControllerMonitor]. */
data class GameControllerDevice(
    val id: GameControllerDeviceId,
    val descriptor: GameControllerDescriptor,
    val initialPhysicalInputs: List<GameControllerPhysicalInput> = emptyList(),
) {
    val vendorName: String?
        get() = descriptor.vendorName
}

/** Lifecycle event emitted after [GameControllerMonitor.controllers] has been updated. */
sealed interface GameControllerLifecycleEvent {
    data class Connected(val controller: GameControllerDevice) : GameControllerLifecycleEvent
    data class Disconnected(val id: GameControllerDeviceId) : GameControllerLifecycleEvent
}

/**
 * Owns GameController connection observation and retains the native controllers it projects.
 *
 * The public surface contains only detached Kotlin values. A controller identity is valid only
 * for this monitor lifetime and is never a native pointer or a persistent device identifier.
 */
class GameControllerMonitor private constructor(
    private val onLifecycle: (GameControllerLifecycleEvent) -> Unit,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private val managedControllers = LinkedHashMap<Long, ManagedController>()
    private val pending = ArrayDeque<PendingLifecycle>()
    private val nextId = AtomicLong(1L)
    private lateinit var nativeSession: GameControllerMonitorNativeSession
    private var initializing = true
    private var closed = false

    /** Immutable snapshot of currently connected controllers. */
    val controllers: List<GameControllerDevice>
        get() = lock.withLock { managedControllers.values.map(ManagedController::device) }

    /**
     * Creates an explicitly localized haptic engine for one still-connected controller.
     *
     * The returned owner is independent from this monitor. Its caller is responsible for
     * closing it when the device disconnects or its own effect lease ends.
     */
    fun createHaptics(
        id: GameControllerDeviceId,
        locality: GameControllerHapticLocality,
    ): Result<GameControllerHaptics> = lock.withLock {
        if (closed) {
            return Result.failure(IllegalStateException("GameControllerMonitor is closed"))
        }
        managedControllers.values.firstOrNull { it.device.id == id }
            ?.controller
            ?.createHaptics(locality)
            ?: Result.failure(IllegalArgumentException("GameController device $id is not connected"))
    }

    /**
     * Observes detached physical-input snapshots for one still-connected controller.
     *
     * The physical-input callback was introduced by GameController on macOS 13. Earlier
     * systems, or controllers without a physical input profile, return a failure instead of
     * installing a silent no-op observer.
     */
    fun observePhysicalInput(
        id: GameControllerDeviceId,
        onInput: (GameControllerPhysicalInputEvent) -> Unit,
    ): Result<GameControllerPhysicalInputObservation> = lock.withLock {
        when {
            closed -> Result.failure(IllegalStateException("GameControllerMonitor is closed"))
            else -> {
                val controller = managedControllers.values.firstOrNull { it.device.id == id }
                    ?.controller
                    ?: return@withLock Result.failure(
                        IllegalArgumentException("GameController device $id is not connected"),
                    )
                val observation = controller.observePhysicalInput { input ->
                    emitPhysicalInput(id, input, onInput)
                }
                if (observation == null) {
                    Result.failure(
                        UnsupportedOperationException(
                            "GameController physical input observation is unavailable for this controller or macOS version",
                        ),
                    )
                } else {
                    Result.success(observation)
                }
            }
        }
    }

    override fun close() {
        val release = lock.withLock {
            if (closed) return
            closed = true
            val pendingControllers = pending.filterIsInstance<PendingLifecycle.Connected>()
                .map(PendingLifecycle.Connected::controller)
            pending.clear()
            val activeControllers = managedControllers.values.map(ManagedController::controller)
            managedControllers.clear()
            Release(nativeSession, activeControllers + pendingControllers)
        }
        var failure: Throwable? = null
        try {
            release.session.close()
        } catch (closeFailure: Throwable) {
            failure = closeFailure
        }
        release.controllers.forEach { controller ->
            try {
                controller.close()
            } catch (closeFailure: Throwable) {
                failure?.addSuppressed(closeFailure) ?: run { failure = closeFailure }
            }
        }
        failure?.let { throw it }
    }

    private fun attach(session: GameControllerMonitorNativeSession) {
        lock.withLock {
            check(!::nativeSession.isInitialized) { "GameControllerMonitor native session is already attached" }
            nativeSession = session
        }
    }

    private fun initialize() {
        val initial = nativeSession.initialControllers()
        val pendingEvents = lock.withLock {
            initial.forEach(::connectInitial)
            initializing = false
            buildList {
                while (pending.isNotEmpty()) add(pending.removeFirst())
            }
        }
        pendingEvents.forEach(::deliver)
    }

    private fun connected(controller: GameControllerMonitorNativeController) {
        val event = lock.withLock {
            if (closed) {
                controller.close()
                return
            }
            if (initializing) {
                pending += PendingLifecycle.Connected(controller)
                return
            }
            connect(controller)
        }
        event?.let(onLifecycle)
    }

    private fun disconnected(nativeIdentity: Long) {
        val event = lock.withLock {
            if (closed) return
            if (initializing) {
                pending += PendingLifecycle.Disconnected(nativeIdentity)
                return
            }
            disconnect(nativeIdentity)
        }
        event?.let(onLifecycle)
    }

    private fun deliver(pending: PendingLifecycle) {
        when (pending) {
            is PendingLifecycle.Connected -> connected(pending.controller)
            is PendingLifecycle.Disconnected -> disconnected(pending.nativeIdentity)
        }
    }

    private fun connectInitial(controller: GameControllerMonitorNativeController) {
        if (managedControllers.containsKey(controller.nativeIdentity)) {
            controller.close()
            return
        }
        val snapshot = try {
            controller.snapshot()
        } catch (failure: Throwable) {
            try {
                controller.close()
            } catch (closeFailure: Throwable) {
                failure.addSuppressed(closeFailure)
            }
            throw failure
        }
        managedControllers[controller.nativeIdentity] = ManagedController(
            controller = controller,
            device = GameControllerDevice(
                id = nextDeviceId(),
                descriptor = snapshot.descriptor,
                initialPhysicalInputs = snapshot.initialPhysicalInputs.toList(),
            ),
        )
    }

    private fun connect(controller: GameControllerMonitorNativeController): GameControllerLifecycleEvent? {
        if (managedControllers.containsKey(controller.nativeIdentity)) {
            controller.close()
            return null
        }
        val snapshot = controller.snapshot()
        val device = GameControllerDevice(
            id = nextDeviceId(),
            descriptor = snapshot.descriptor,
            initialPhysicalInputs = snapshot.initialPhysicalInputs.toList(),
        )
        managedControllers[controller.nativeIdentity] = ManagedController(controller, device)
        return GameControllerLifecycleEvent.Connected(device)
    }

    private fun disconnect(nativeIdentity: Long): GameControllerLifecycleEvent? {
        val removed = managedControllers.remove(nativeIdentity) ?: return null
        removed.controller.close()
        return GameControllerLifecycleEvent.Disconnected(removed.device.id)
    }

    private fun emitPhysicalInput(
        id: GameControllerDeviceId,
        input: GameControllerPhysicalInput,
        onInput: (GameControllerPhysicalInputEvent) -> Unit,
    ) {
        val event = lock.withLock {
            if (closed || managedControllers.values.none { it.device.id == id }) return
            GameControllerPhysicalInputEvent(id, input)
        }
        onInput(event)
    }

    private fun nextDeviceId(): GameControllerDeviceId {
        val value = nextId.getAndIncrement()
        check(value != 0L) { "GameControllerMonitor device identity space exhausted" }
        return GameControllerDeviceId(value)
    }

    private data class ManagedController(
        val controller: GameControllerMonitorNativeController,
        val device: GameControllerDevice,
    )

    private sealed interface PendingLifecycle {
        data class Connected(val controller: GameControllerMonitorNativeController) : PendingLifecycle
        data class Disconnected(val nativeIdentity: Long) : PendingLifecycle
    }

    private data class Release(
        val session: GameControllerMonitorNativeSession,
        val controllers: List<GameControllerMonitorNativeController>,
    )

    companion object {
        fun create(
            onLifecycle: (GameControllerLifecycleEvent) -> Unit,
        ): GameControllerMonitor = create(GameControllerMonitorNativeRuntime, onLifecycle)

        internal fun create(
            native: GameControllerMonitorNative,
            onLifecycle: (GameControllerLifecycleEvent) -> Unit,
        ): GameControllerMonitor {
            val monitor = GameControllerMonitor(onLifecycle)
            val session = native.open(monitor::connected, monitor::disconnected)
            try {
                monitor.attach(session)
                monitor.initialize()
                return monitor
            } catch (failure: Throwable) {
                try {
                    monitor.close()
                } catch (closeFailure: Throwable) {
                    failure.addSuppressed(closeFailure)
                }
                throw failure
            }
        }
    }
}

internal interface GameControllerMonitorNative {
    fun open(
        onConnected: (GameControllerMonitorNativeController) -> Unit,
        onDisconnected: (Long) -> Unit,
    ): GameControllerMonitorNativeSession
}

internal interface GameControllerMonitorNativeSession : AutoCloseable {
    fun initialControllers(): List<GameControllerMonitorNativeController>
}

internal interface GameControllerMonitorNativeController : AutoCloseable {
    val nativeIdentity: Long

    fun snapshot(): GameControllerSnapshot

    fun createHaptics(locality: GameControllerHapticLocality): Result<GameControllerHaptics>

    fun observePhysicalInput(
        onInput: (GameControllerPhysicalInput) -> Unit,
    ): GameControllerPhysicalInputObservation?
}

private object GameControllerMonitorNativeRuntime : GameControllerMonitorNative {
    override fun open(
        onConnected: (GameControllerMonitorNativeController) -> Unit,
        onDisconnected: (Long) -> Unit,
    ): GameControllerMonitorNativeSession {
        val center = NSNotificationCenter(NSNotificationCenter.defaultCenter())
        val connected = center.observe(name = GCControllerDidConnectNotification) { notification ->
            notification.`object`().asRetainedGameController()?.let(onConnected)
        }
        try {
            val disconnected = center.observe(name = GCControllerDidDisconnectNotification) { notification ->
                notification.`object`().takeIf { it != MemorySegment.NULL }?.address()?.let(onDisconnected)
            }
            return NativeSession(connected, disconnected)
        } catch (failure: Throwable) {
            connected.close()
            throw failure
        }
    }
}

private class NativeSession(
    private val connected: AutoCloseable,
    private val disconnected: AutoCloseable,
) : GameControllerMonitorNativeSession {
    override fun initialControllers(): List<GameControllerMonitorNativeController> =
        ObjCRuntime.autoreleasePool {
            val nativeControllers = NSArray(GCController.controllers())
            List(nativeControllers.count().toInt()) { index ->
                requireNotNull(nativeControllers.objectAtIndex(index.toLong()).asRetainedGameController())
            }
        }

    override fun close() {
        var failure: Throwable? = null
        try {
            connected.close()
        } catch (closeFailure: Throwable) {
            failure = closeFailure
        }
        try {
            disconnected.close()
        } catch (closeFailure: Throwable) {
            failure?.addSuppressed(closeFailure) ?: run { failure = closeFailure }
        }
        failure?.let { throw it }
    }
}

private class RetainedGameController(
    private val strong: ObjCStrongRef<GCController>,
) : GameControllerMonitorNativeController {
    private val lock = ReentrantLock()
    private var physicalInputObservation: GameControllerPhysicalInputObservation? = null

    override val nativeIdentity: Long = strong.value.ptr.address()

    override fun snapshot(): GameControllerSnapshot {
        val nativeProfile = strong.value.physicalInputProfile()
        val nativeHaptics = strong.value.haptics()
        return GameControllerSnapshot(
            descriptor = GameControllerDescriptor(
                vendorName = strong.value.vendorName().toNullableString(),
                productCategory = strong.value.productCategory().toNullableString(),
                hasPhysicalInputProfile = nativeProfile != MemorySegment.NULL,
                profile = if (strong.value.extendedGamepad() != MemorySegment.NULL) {
                    GameControllerProfile.Standard
                } else {
                    GameControllerProfile.Native
                },
                hapticLocalities = if (nativeHaptics == MemorySegment.NULL) {
                    emptySet()
                } else {
                    supportedGameControllerHapticLocalities(GCDeviceHaptics(nativeHaptics))
                },
            ),
            initialPhysicalInputs = if (nativeProfile == MemorySegment.NULL) {
                emptyList()
            } else {
                GCPhysicalInputProfile(nativeProfile).snapshotPhysicalInputs()
            },
        )
    }

    override fun createHaptics(
        locality: GameControllerHapticLocality,
    ): Result<GameControllerHaptics> = ObjCRuntime.autoreleasePool {
        val nativeHaptics = strong.value.haptics()
        if (nativeHaptics == MemorySegment.NULL) {
            Result.failure(
                GameControllerHapticsException(
                    domain = null,
                    code = null,
                    message = "The controller does not expose GameController haptics",
                ),
            )
        } else {
            GameControllerHaptics.create(GCDeviceHaptics(nativeHaptics), locality)
        }
    }

    override fun observePhysicalInput(
        onInput: (GameControllerPhysicalInput) -> Unit,
    ): GameControllerPhysicalInputObservation? = lock.withLock {
        physicalInputObservation?.takeUnless(GameControllerPhysicalInputObservation::isClosed)
            ?.let { return null }
        if (!supportsGameControllerPhysicalInputObservation()) return null
        val nativeProfile = strong.value.physicalInputProfile()
        if (nativeProfile == MemorySegment.NULL) return null
        val profile = GCPhysicalInputProfile(nativeProfile)
        GameControllerPhysicalInputObservation(
            profile.observeValueChanges { changedProfile, element ->
                onInput(changedProfile.snapshotPhysicalInput(element))
            },
        ).also { physicalInputObservation = it }
    }

    override fun close() {
        val observation = lock.withLock {
            physicalInputObservation.also { physicalInputObservation = null }
        }
        var failure: Throwable? = null
        try {
            observation?.close()
        } catch (closeFailure: Throwable) {
            failure = closeFailure
        }
        try {
            strong.close()
        } catch (closeFailure: Throwable) {
            failure?.addSuppressed(closeFailure) ?: run { failure = closeFailure }
        }
        failure?.let { throw it }
    }
}

private fun MemorySegment.asRetainedGameController(): RetainedGameController? {
    if (this == MemorySegment.NULL) return null
    return RetainedGameController(GCController(this).retainStrong())
}

private fun MemorySegment.toNullableString(): String? =
    takeIf { it != MemorySegment.NULL }?.let(ObjCRuntime::toJavaString)

private fun supportsGameControllerPhysicalInputObservation(): Boolean =
    NSProcessInfo(NSProcessInfo.processInfo()).isOperatingSystemAtLeastVersion(
        NSOperatingSystemVersion(13L, 0L, 0L),
    )

private fun GCPhysicalInputProfile.snapshotPhysicalInput(
    element: GCControllerElement,
): GameControllerPhysicalInput {
    val buttonNames = buttons().nativeNamesFor(element.ptr)
    val axisNames = axes().nativeNamesFor(element.ptr)
    val directionPadNames = dpads().nativeNamesFor(element.ptr)
    val nativeNames = (elements().nativeNamesFor(element.ptr) + buttonNames + axisNames + directionPadNames)
        .toSortedSet()
    return when {
        buttonNames.isNotEmpty() -> {
            val button = GCControllerButtonInput(element.ptr)
            GameControllerPhysicalInput.Button(nativeNames, button.value(), button.isPressed())
        }

        axisNames.isNotEmpty() -> GameControllerPhysicalInput.Axis(
            nativeNames,
            GCControllerAxisInput(element.ptr).value(),
        )

        directionPadNames.isNotEmpty() -> {
            val directionPad = GCControllerDirectionPad(element.ptr)
            GameControllerPhysicalInput.DirectionPad(
                nativeNames,
                GCControllerAxisInput(directionPad.xAxis()).value(),
                GCControllerAxisInput(directionPad.yAxis()).value(),
            )
        }

        else -> GameControllerPhysicalInput.Other(nativeNames, element.isAnalog())
    }
}

private fun GCPhysicalInputProfile.snapshotPhysicalInputs(): List<GameControllerPhysicalInput> {
    val nativeElements = elements()
    if (nativeElements == MemorySegment.NULL) return emptyList()
    return NSArray(NSDictionary(nativeElements).allValues())
        .let { values ->
            List(values.count().toInt()) { index -> values.objectAtIndex(index.toLong()) }
        }
        .filter { it != MemorySegment.NULL }
        .distinctBy(MemorySegment::address)
        .map { element -> snapshotPhysicalInput(GCControllerElement(element)) }
        .sortedBy { input -> input.nativeNames.joinToString(separator = "\u0000") }
}

private fun MemorySegment.nativeNamesFor(element: MemorySegment): Set<String> {
    if (this == MemorySegment.NULL) return emptySet()
    val keys = NSArray(NSDictionary(this).allKeysForObject(element))
    return buildSet {
        repeat(keys.count().toInt()) { index ->
            keys.objectAtIndex(index.toLong()).toNullableString()?.let(::add)
        }
    }
}
