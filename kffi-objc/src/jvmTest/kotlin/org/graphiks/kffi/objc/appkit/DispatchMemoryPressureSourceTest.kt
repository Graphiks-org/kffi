package org.graphiks.kffi.objc.appkit

import org.junit.jupiter.api.Assumptions.assumeTrue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DispatchMemoryPressureSourceTest {
    @Test
    fun nativeSourceResumesCancelsAndReachesQuiescenceOnMacOS() {
        assumeTrue(System.getProperty("os.name").contains("Mac", ignoreCase = true))
        val invocations = AtomicInteger()
        val source = DispatchMemoryPressureSource { invocations.incrementAndGet() }

        source.close()

        val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5)
        while (!source.isQuiescent && System.nanoTime() < deadline) {
            Thread.sleep(10)
        }
        assertTrue(source.isClosed)
        assertTrue(source.isQuiescent)
        assertEquals(0, invocations.get())
    }

    @Test
    fun sourceRequestsWarnAndCriticalAndReachesQuiescenceAfterCancel() {
        val fixture = MemoryPressureFixture()
        val events = mutableListOf<DispatchMemoryPressureEvent>()
        val source = DispatchMemoryPressureSource(fixture, events::add)

        fixture.emit(DISPATCH_MEMORYPRESSURE_WARN or DISPATCH_MEMORYPRESSURE_CRITICAL)
        source.close()
        source.close()
        fixture.emit(DISPATCH_MEMORYPRESSURE_CRITICAL)

        assertTrue(source.isClosed)
        assertFalse(source.isQuiescent)
        assertEquals(
            listOf(DispatchMemoryPressureEvent.WARN, DispatchMemoryPressureEvent.CRITICAL),
            events,
        )
        assertEquals(DISPATCH_MEMORYPRESSURE_WARN or DISPATCH_MEMORYPRESSURE_CRITICAL, fixture.mask)
        assertEquals(listOf("create", "resume", "cancel"), fixture.calls)

        fixture.completeCancellation()

        assertTrue(source.isQuiescent)
        assertEquals(listOf("create", "resume", "cancel", "release"), fixture.calls)
    }

    @Test
    fun handlerIsNeverAdmittedAfterCloseWhileAnEarlierDeliveryFinishes() {
        val fixture = MemoryPressureFixture()
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val completed = CountDownLatch(1)
        val invocations = AtomicInteger()
        val source = DispatchMemoryPressureSource(fixture) {
            invocations.incrementAndGet()
            entered.countDown()
            assertTrue(resume.await(5, TimeUnit.SECONDS))
            completed.countDown()
        }
        val executor = Executors.newSingleThreadExecutor()

        try {
            val delivery = executor.submit { fixture.emit(DISPATCH_MEMORYPRESSURE_WARN) }
            assertTrue(entered.await(5, TimeUnit.SECONDS))

            source.close()
            fixture.emit(DISPATCH_MEMORYPRESSURE_CRITICAL)
            fixture.completeCancellation()

            assertEquals(1, invocations.get())
            assertFalse(source.isQuiescent)
            resume.countDown()
            delivery.get(5, TimeUnit.SECONDS)

            assertTrue(completed.await(5, TimeUnit.SECONDS))
            assertTrue(source.isQuiescent)
            assertEquals(1, invocations.get())
        } finally {
            resume.countDown()
            source.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun handlerFailureIsContainedAndCloseStillReachesQuiescence() {
        val fixture = MemoryPressureFixture()
        val invocations = AtomicInteger()
        val source = DispatchMemoryPressureSource(fixture) {
            invocations.incrementAndGet()
            error("memory-pressure observer failed")
        }

        fixture.emit(DISPATCH_MEMORYPRESSURE_WARN)
        source.close()
        fixture.completeCancellation()

        assertEquals(1, invocations.get())
        assertTrue(source.isClosed)
        assertTrue(source.isQuiescent)
        assertEquals(listOf("create", "resume", "cancel", "release"), fixture.calls)
    }
}

private class MemoryPressureFixture : DispatchMemoryPressureNative {
    val calls = mutableListOf<String>()
    var mask: Long = 0
        private set
    private lateinit var eventHandler: (Long) -> Unit
    private lateinit var cancellationHandler: () -> Unit

    override fun create(
        mask: Long,
        eventHandler: (Long) -> Unit,
        cancellationHandler: () -> Unit,
    ): DispatchMemoryPressureNativeSource {
        calls += "create"
        this.mask = mask
        this.eventHandler = eventHandler
        this.cancellationHandler = cancellationHandler
        return object : DispatchMemoryPressureNativeSource {
            override fun resume() {
                calls += "resume"
            }

            override fun cancel() {
                calls += "cancel"
            }

            override fun release() {
                calls += "release"
            }
        }
    }

    fun emit(data: Long) = eventHandler(data)

    fun completeCancellation() = cancellationHandler()
}
