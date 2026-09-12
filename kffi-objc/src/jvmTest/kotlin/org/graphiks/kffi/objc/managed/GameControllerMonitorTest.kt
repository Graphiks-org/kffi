package org.graphiks.kffi.objc.managed

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class GameControllerMonitorTest {
    @Test
    fun monitorPublishesTheInitialSnapshotThenTracksLifecycleWithFreshIds() {
        val first = controller(nativeIdentity = 41L, name = "First")
        val fixture = GameControllerMonitorFixture(initial = listOf(first))
        val events = mutableListOf<GameControllerLifecycleEvent>()
        val monitor = GameControllerMonitor.create(fixture, events::add)

        val firstId = monitor.controllers.single().id
        assertEquals("First", monitor.controllers.single().vendorName)
        assertEquals(emptyList(), events)

        val second = controller(nativeIdentity = 52L, name = "Second")
        fixture.connect(second)
        val secondId = monitor.controllers.single { it.vendorName == "Second" }.id
        fixture.disconnect(41L)

        assertEquals(
            listOf(
                GameControllerLifecycleEvent.Connected(
                    GameControllerDevice(secondId, GameControllerDescriptor(vendorName = "Second")),
                ),
                GameControllerLifecycleEvent.Disconnected(firstId),
            ),
            events,
        )
        assertEquals(listOf(secondId), monitor.controllers.map(GameControllerDevice::id))
        assertEquals(1, first.closeCount)

        val reconnected = controller(nativeIdentity = 41L, name = "First")
        fixture.connect(reconnected)
        val reconnectedId = monitor.controllers.single { it.vendorName == "First" }.id

        assertTrue(reconnectedId != firstId)
        monitor.close()
        assertEquals(1, second.closeCount)
        assertEquals(1, reconnected.closeCount)
    }

    @Test
    fun monitorDropsDuplicateAndLateConnectionsWithoutLeakingTheirNativeOwners() {
        val initial = controller(nativeIdentity = 41L, name = "First")
        val fixture = GameControllerMonitorFixture(initial = listOf(initial))
        val events = mutableListOf<GameControllerLifecycleEvent>()
        val monitor = GameControllerMonitor.create(fixture, events::add)

        val duplicate = controller(nativeIdentity = 41L, name = "First duplicate")
        fixture.connect(duplicate)
        monitor.close()
        val late = controller(nativeIdentity = 52L, name = "Late")
        fixture.connect(late)

        assertEquals(emptyList(), events)
        assertEquals(1, duplicate.closeCount)
        assertEquals(1, initial.closeCount)
        assertEquals(1, late.closeCount)
        assertEquals(1, fixture.closeCount)
    }

    @Test
    fun monitorDoesNotPublishAnInitialControllerReplayedByAConnectionCallback() {
        val initial = controller(nativeIdentity = 41L, name = "First")
        val duplicate = controller(nativeIdentity = 41L, name = "First duplicate")
        val fixture = GameControllerMonitorFixture(initial = listOf(initial))
        fixture.duringInitialSnapshot = { fixture.connect(duplicate) }
        val events = mutableListOf<GameControllerLifecycleEvent>()

        val monitor = GameControllerMonitor.create(fixture, events::add)

        assertEquals(emptyList(), events)
        assertEquals(listOf("First"), monitor.controllers.mapNotNull(GameControllerDevice::vendorName))
        assertEquals(1, duplicate.closeCount)
        monitor.close()
    }

    @Test
    fun monitorReleasesEveryNativeOwnerWhenInitialSnapshotFails() {
        val first = controller(nativeIdentity = 41L, name = "First")
        val failing = RecordingNativeController(
            nativeIdentity = 52L,
            descriptor = GameControllerDescriptor(vendorName = "Failing"),
            snapshotFailure = IllegalStateException("snapshot failed"),
        )
        val fixture = GameControllerMonitorFixture(initial = listOf(first, failing))

        assertFailsWith<IllegalStateException> {
            GameControllerMonitor.create(fixture) { }
        }

        assertEquals(1, first.closeCount)
        assertEquals(1, failing.closeCount)
        assertEquals(1, fixture.closeCount)
    }

    @Test
    fun monitorReleasesControllersWhenClosingTheNativeSessionFails() {
        val first = controller(nativeIdentity = 41L, name = "First")
        val second = controller(nativeIdentity = 52L, name = "Second")
        val fixture = GameControllerMonitorFixture(initial = listOf(first, second))
        fixture.closeFailure = IllegalStateException("native close failed")
        val monitor = GameControllerMonitor.create(fixture) { }

        assertFailsWith<IllegalStateException> { monitor.close() }

        assertEquals(1, fixture.closeCount)
        assertEquals(1, first.closeCount)
        assertEquals(1, second.closeCount)
    }

    @Test
    fun nativeMonitorOpensAndClosesWithoutGameControllerHardware() {
        if (!System.getProperty("os.name").startsWith("Mac", ignoreCase = true)) return

        val monitor = GameControllerMonitor.create { }
        try {
            assertEquals(
                monitor.controllers.size,
                monitor.controllers.map(GameControllerDevice::id).toSet().size,
            )
        } finally {
            monitor.close()
        }
    }

    private fun controller(nativeIdentity: Long, name: String): RecordingNativeController =
        RecordingNativeController(
            nativeIdentity,
            GameControllerDescriptor(vendorName = name),
        )
}

private class GameControllerMonitorFixture(
    private val initial: List<RecordingNativeController>,
) : GameControllerMonitorNative {
    private lateinit var onConnected: (GameControllerMonitorNativeController) -> Unit
    private lateinit var onDisconnected: (Long) -> Unit
    var closeCount = 0
        private set
    var closeFailure: Throwable? = null
    var duringInitialSnapshot: (() -> Unit)? = null

    override fun open(
        onConnected: (GameControllerMonitorNativeController) -> Unit,
        onDisconnected: (Long) -> Unit,
    ): GameControllerMonitorNativeSession {
        this.onConnected = onConnected
        this.onDisconnected = onDisconnected
        return object : GameControllerMonitorNativeSession {
            override fun initialControllers(): List<GameControllerMonitorNativeController> {
                duringInitialSnapshot?.invoke()
                return initial
            }

            override fun close() {
                closeCount += 1
                closeFailure?.let { throw it }
            }
        }
    }

    fun connect(controller: RecordingNativeController) = onConnected(controller)

    fun disconnect(nativeIdentity: Long) = onDisconnected(nativeIdentity)
}

private class RecordingNativeController(
    override val nativeIdentity: Long,
    private val descriptor: GameControllerDescriptor,
    private val snapshotFailure: Throwable? = null,
) : GameControllerMonitorNativeController {
    var closeCount = 0
        private set

    override fun snapshot(): GameControllerDescriptor {
        snapshotFailure?.let { throw it }
        return descriptor
    }

    override fun close() {
        closeCount += 1
    }
}
