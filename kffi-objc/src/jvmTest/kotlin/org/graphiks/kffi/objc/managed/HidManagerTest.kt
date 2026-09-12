package org.graphiks.kffi.objc.managed

import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class HidManagerTest {
    @Test
    fun initialInventoryIsVisibleBeforePostOpenConnectionsAreDelivered() {
        val fixture = HidManagerFixture(
            initial = listOf(nativeDevice(1L, "Initial keyboard", HidDeviceKind.Keyboard)),
        )
        val events = mutableListOf<HidDeviceLifecycleEvent>()
        fixture.onInitialDevicesRead = {
            fixture.put(nativeDevice(2L, "Later mouse", HidDeviceKind.Mouse))
            fixture.emit(2L, connected = true)
        }

        val manager = HidManager.create(fixture, events::add)
        try {
            assertEquals(
                listOf("Initial keyboard", "Later mouse"),
                manager.devices.map { it.descriptor.name },
            )
            val connected = assertIs<HidDeviceLifecycleEvent.Connected>(events.single())
            assertEquals("Later mouse", connected.device.descriptor.name)
        } finally {
            manager.close()
            fixture.completeCancellation()
        }
    }

    @Test
    fun removalDuringInitialEnumerationDoesNotPublishAStaleDevice() {
        val fixture = HidManagerFixture(
            initial = listOf(nativeDevice(31L, "Removed keyboard", HidDeviceKind.Keyboard)),
        )
        val events = mutableListOf<HidDeviceLifecycleEvent>()
        fixture.onInitialDevicesRead = { fixture.emit(31L, connected = false) }

        val manager = HidManager.create(fixture, events::add)
        try {
            assertTrue(manager.devices.isEmpty())
            assertTrue(events.isEmpty())
        } finally {
            manager.close()
            fixture.completeCancellation()
        }
    }

    @Test
    fun removalPublishesTerminalHandleThenRemovesItFromTheInventory() {
        val fixture = HidManagerFixture()
        val events = mutableListOf<HidDeviceLifecycleEvent>()
        val manager = HidManager.create(fixture, events::add)
        try {
            fixture.put(nativeDevice(41L, "Trackpad", HidDeviceKind.Touchpad))
            fixture.emit(41L, connected = true)
            val device = manager.devices.single()

            fixture.emit(41L, connected = false)

            assertTrue(manager.devices.isEmpty())
            val removal = assertIs<HidDeviceLifecycleEvent.Disconnected>(events.last())
            assertEquals(device.id, removal.id)
        } finally {
            manager.close()
            fixture.completeCancellation()
        }
    }

    @Test
    fun reconnectAllocatesANewSessionIdentity() {
        val fixture = HidManagerFixture()
        val events = mutableListOf<HidDeviceLifecycleEvent>()
        val manager = HidManager.create(fixture, events::add)
        try {
            fixture.put(nativeDevice(51L, "Stylus", HidDeviceKind.Pen))
            fixture.emit(51L, connected = true)
            val first = manager.devices.single()

            fixture.emit(51L, connected = false)
            fixture.emit(51L, connected = true)
            val reconnected = manager.devices.single()

            assertNotEquals(first.id, reconnected.id)
        } finally {
            manager.close()
            fixture.completeCancellation()
        }
    }

    @Test
    fun closeCancelsBeforeReleaseAndWaitsForTheNativeCancelHandler() {
        val fixture = HidManagerFixture()
        val events = mutableListOf<HidDeviceLifecycleEvent>()
        val manager = HidManager.create(fixture, events::add)
        fixture.put(nativeDevice(61L, "Keyboard", HidDeviceKind.Keyboard))

        fixture.emit(61L, connected = true)
        manager.close()
        manager.close()
        fixture.emit(61L, connected = false)

        assertEquals(1, events.size)
        assertEquals(listOf("create", "cancel"), fixture.calls)
        assertFalse(manager.isQuiescent)

        fixture.completeCancellation()

        assertEquals(listOf("create", "cancel", "release"), fixture.calls)
        assertTrue(manager.isQuiescent)
    }

    @Test
    fun releaseWaitsForAnAlreadyAdmittedLifecycleHandler() {
        val fixture = HidManagerFixture()
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val executor = Executors.newSingleThreadExecutor()
        val manager = HidManager.create(fixture) {
            entered.countDown()
            assertTrue(resume.await(5, TimeUnit.SECONDS))
        }
        fixture.put(nativeDevice(71L, "Mouse", HidDeviceKind.Mouse))

        try {
            val delivery = executor.submit { fixture.emit(71L, connected = true) }
            assertTrue(entered.await(5, TimeUnit.SECONDS))

            manager.close()
            fixture.completeCancellation()

            assertFalse(manager.isQuiescent)
            assertEquals(listOf("create", "cancel"), fixture.calls)

            resume.countDown()
            delivery.get(5, TimeUnit.SECONDS)

            assertTrue(manager.isQuiescent)
            assertEquals(listOf("create", "cancel", "release"), fixture.calls)
        } finally {
            resume.countDown()
            manager.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun closingOneManagerDoesNotLeakLifecycleDeliveryIntoTheNextManager() {
        val firstFixture = HidManagerFixture()
        val firstEvents = mutableListOf<HidDeviceLifecycleEvent>()
        val first = HidManager.create(firstFixture, firstEvents::add)
        firstFixture.put(nativeDevice(81L, "First keyboard", HidDeviceKind.Keyboard))

        firstFixture.emit(81L, connected = true)
        first.close()
        firstFixture.completeCancellation()
        firstFixture.emit(81L, connected = false)

        val secondFixture = HidManagerFixture()
        val secondEvents = mutableListOf<HidDeviceLifecycleEvent>()
        val second = HidManager.create(secondFixture, secondEvents::add)
        secondFixture.put(nativeDevice(91L, "Second mouse", HidDeviceKind.Mouse))
        try {
            secondFixture.emit(91L, connected = true)
            second.close()
            secondFixture.completeCancellation()

            assertEquals(1, firstEvents.size)
            assertEquals(1, secondEvents.size)
            assertTrue(first.isQuiescent)
            assertTrue(second.isQuiescent)
            assertEquals(listOf("create", "cancel", "release"), firstFixture.calls)
            assertEquals(listOf("create", "cancel", "release"), secondFixture.calls)
        } finally {
            first.close()
            second.close()
        }
    }

    @Test
    fun gameControllerOwnedHidDevicesAreSuppressedForTheirWholeLifecycle() {
        val descriptors = mapOf(
            10L to nativeDevice(100L, "Legacy pad", HidDeviceKind.Other),
            20L to nativeDevice(200L, "System pad", HidDeviceKind.Other),
        )
        val gameControllerDevices = mutableSetOf(20L)
        val policy = HidDeviceDeliveryPolicy(
            snapshot = descriptors::get,
            isSupportedByGameController = gameControllerDevices::contains,
            nativeIdentity = { descriptors[it]?.nativeIdentity },
        )

        assertEquals(descriptors.getValue(10L), policy.connected(10L))
        assertEquals(null, policy.connected(20L))
        gameControllerDevices.clear()
        assertEquals(null, policy.disconnected(20L))
        assertEquals(100L, policy.disconnected(10L))
    }

    @Test
    fun nativeManagerOpensAndClosesWithoutDependingOnAConnectedController() {
        if (!System.getProperty("os.name").startsWith("Mac", ignoreCase = true)) return

        val manager = HidManager.create { }
        try {
            assertEquals(manager.devices.map(HidDevice::id).distinct().size, manager.devices.size)
            assertTrue(manager.devices.all { it.descriptor.name?.length ?: 0 <= 1_023 })
        } finally {
            manager.close()
            val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5)
            while (!manager.isQuiescent && System.nanoTime() < deadline) {
                Thread.sleep(10)
            }
            assertTrue(manager.isQuiescent)
        }
    }
}

private fun nativeDevice(
    nativeIdentity: Long,
    name: String,
    kind: HidDeviceKind,
): HidManagerNativeDevice = HidManagerNativeDevice(
    nativeIdentity = nativeIdentity,
    descriptor = HidDeviceDescriptor(name = name, kind = kind),
)

private class HidManagerFixture(
    private val initial: List<HidManagerNativeDevice> = emptyList(),
) : HidManagerNative {
    val calls = mutableListOf<String>()
    var onInitialDevicesRead: (() -> Unit)? = null
    private val devices = initial.associateByTo(linkedMapOf(), HidManagerNativeDevice::nativeIdentity)
    private lateinit var callbacks: HidDeviceLifecycleNativeHandles
    private lateinit var cancellationHandler: () -> Unit

    override fun create(
        callbacks: HidDeviceLifecycleNativeHandles,
        cancellationHandler: () -> Unit,
    ): HidManagerNativeSession {
        calls += "create"
        this.callbacks = callbacks
        this.cancellationHandler = cancellationHandler
        return object : HidManagerNativeSession {
            override fun initialDevices(): List<HidManagerNativeDevice> {
                onInitialDevicesRead?.invoke()
                return initial
            }

            override fun device(nativeIdentity: Long): HidManagerNativeDevice? = devices[nativeIdentity]

            override fun cancel() {
                calls += "cancel"
            }

            override fun release() {
                calls += "release"
            }
        }
    }

    fun put(device: HidManagerNativeDevice) {
        devices[device.nativeIdentity] = device
    }

    fun emit(nativeIdentity: Long, connected: Boolean) {
        val handle = if (connected) callbacks.connected else callbacks.disconnected
        val downcall = Linker.nativeLinker().downcallHandle(
            handle.callback,
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
        )
        downcall.invokeExact(nativeIdentity, handle.userdata)
    }

    fun completeCancellation() = cancellationHandler()
}
