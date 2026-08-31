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
import kotlin.test.assertTrue

class HidManagerTest {
    @Test
    fun closeCancelsBeforeReleaseAndWaitsForTheNativeCancelHandler() {
        val fixture = HidManagerFixture()
        val events = mutableListOf<HidDeviceEvent>()
        val manager = HidManager.create(fixture, HidDeviceLifecycleHandler(events::add))

        fixture.emit(registryId = 41L, connected = true)
        fixture.emit(registryId = 42L, connected = false)
        manager.close()
        manager.close()
        fixture.emit(registryId = 43L, connected = true)

        assertEquals(
            listOf(HidDeviceEvent(41L, true), HidDeviceEvent(42L, false)),
            events,
        )
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
    fun gamepadsAlreadySupportedByGameControllerAreNotDeliveredTwice() {
        val delivered = mutableListOf<Long>()
        val gameControllerDevices = mutableSetOf(20L)
        val policy = HidDeviceDeliveryPolicy(
            isGamepad = { it != 30L },
            isSupportedByGameController = gameControllerDevices::contains,
            registryId = { it * 10L },
        )

        policy.snapshot(10L, connected = true)?.let(delivered::add)
        policy.snapshot(20L, connected = true)?.let(delivered::add)
        policy.snapshot(30L, connected = true)?.let(delivered::add)
        gameControllerDevices.clear()
        policy.snapshot(20L, connected = false)?.let(delivered::add)
        policy.snapshot(10L, connected = false)?.let(delivered::add)
        policy.snapshot(20L, connected = true)?.let(delivered::add)
        policy.snapshot(20L, connected = false)?.let(delivered::add)

        assertEquals(listOf(100L, 100L, 200L, 200L), delivered)
    }
}

private class HidManagerFixture : HidManagerNative {
    val calls = mutableListOf<String>()
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
            override fun cancel() {
                calls += "cancel"
            }

            override fun release() {
                calls += "release"
            }
        }
    }

    fun emit(registryId: Long, connected: Boolean) {
        val handle = if (connected) callbacks.connected else callbacks.disconnected
        val downcall = Linker.nativeLinker().downcallHandle(
            handle.callback,
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
        )
        downcall.invokeExact(registryId, handle.userdata)
    }

    fun completeCancellation() = cancellationHandler()
}
