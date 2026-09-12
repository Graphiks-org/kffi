@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.GCController
import org.graphiks.kffi.objc.GCControllerDidConnectNotification
import org.graphiks.kffi.objc.GCControllerDidDisconnectNotification
import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSNotificationCenter
import org.graphiks.kffi.objc.ObjCRuntime
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
)

/** A pointer-free controller projection owned by one [GameControllerMonitor]. */
data class GameControllerDevice(
    val id: GameControllerDeviceId,
    val descriptor: GameControllerDescriptor,
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
        val descriptor = try {
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
            device = GameControllerDevice(nextDeviceId(), descriptor),
        )
    }

    private fun connect(controller: GameControllerMonitorNativeController): GameControllerLifecycleEvent? {
        if (managedControllers.containsKey(controller.nativeIdentity)) {
            controller.close()
            return null
        }
        val device = GameControllerDevice(nextDeviceId(), controller.snapshot())
        managedControllers[controller.nativeIdentity] = ManagedController(controller, device)
        return GameControllerLifecycleEvent.Connected(device)
    }

    private fun disconnect(nativeIdentity: Long): GameControllerLifecycleEvent? {
        val removed = managedControllers.remove(nativeIdentity) ?: return null
        removed.controller.close()
        return GameControllerLifecycleEvent.Disconnected(removed.device.id)
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

    fun snapshot(): GameControllerDescriptor
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
    override val nativeIdentity: Long = strong.value.ptr.address()

    override fun snapshot(): GameControllerDescriptor = GameControllerDescriptor(
        vendorName = strong.value.vendorName().toNullableString(),
        productCategory = strong.value.productCategory().toNullableString(),
        hasPhysicalInputProfile = strong.value.physicalInputProfile() != MemorySegment.NULL,
    )

    override fun close() = strong.close()
}

private fun MemorySegment.asRetainedGameController(): RetainedGameController? {
    if (this == MemorySegment.NULL) return null
    return RetainedGameController(GCController(this).retainStrong())
}

private fun MemorySegment.toNullableString(): String? =
    takeIf { it != MemorySegment.NULL }?.let(ObjCRuntime::toJavaString)
