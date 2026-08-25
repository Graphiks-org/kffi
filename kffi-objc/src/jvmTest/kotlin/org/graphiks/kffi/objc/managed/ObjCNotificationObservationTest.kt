package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.CallbackExceptionHandler
import org.graphiks.kffi.objc.NSNotificationCenter
import org.graphiks.kffi.objc.ObjCRuntime
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.util.UUID
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

class ObjCNotificationObservationTest {
    @Test
    fun matchingNameIsDeliveredThroughNSNotificationCenter() = withCenter { center, arena ->
        val name = uniqueName(arena, "matching")
        val delivered = AtomicInteger()
        val observation = center.observe(name = name) { delivered.incrementAndGet() }

        try {
            center.postNotificationName_object(name, MemorySegment.NULL)

            assertEquals(1, delivered.get())
        } finally {
            observation.close()
        }
    }

    @Test
    fun differentNameIsFilteredByNSNotificationCenter() = withCenter { center, arena ->
        val expectedName = uniqueName(arena, "expected")
        val otherName = uniqueName(arena, "other")
        val delivered = AtomicInteger()
        val observation = center.observe(name = expectedName) { delivered.incrementAndGet() }

        try {
            center.postNotificationName_object(otherName, MemorySegment.NULL)

            assertEquals(0, delivered.get())
        } finally {
            observation.close()
        }
    }

    @Test
    fun differentObjectIsFilteredByNSNotificationCenter() = withCenter { center, arena ->
        val name = uniqueName(arena, "object-filter")
        val expectedSender = uniqueName(arena, "expected-sender")
        val otherSender = uniqueName(arena, "other-sender")
        val deliveredSender = AtomicLong(-1L)
        val observation = center.observe(name = name, objectFilter = expectedSender) {
            deliveredSender.set(it.`object`().address())
        }

        try {
            center.postNotificationName_object(name, otherSender)
            assertEquals(-1L, deliveredSender.get())

            center.postNotificationName_object(name, expectedSender)
            assertEquals(expectedSender.address(), deliveredSender.get())
        } finally {
            observation.close()
        }
    }

    @Test
    fun sameNameObserversRemainIndependent() = withCenter { center, arena ->
        val name = uniqueName(arena, "independent")
        val firstDeliveries = AtomicInteger()
        val secondDeliveries = AtomicInteger()
        val first = center.observe(name = name) { firstDeliveries.incrementAndGet() }
        val second = center.observe(name = name) { secondDeliveries.incrementAndGet() }

        try {
            center.postNotificationName_object(name, MemorySegment.NULL)
            assertEquals(1, firstDeliveries.get())
            assertEquals(1, secondDeliveries.get())

            first.close()
            center.postNotificationName_object(name, MemorySegment.NULL)
            assertEquals(1, firstDeliveries.get())
            assertEquals(2, secondDeliveries.get())
        } finally {
            first.close()
            second.close()
        }
    }

    @Test
    fun callbackRunsOnThePostingThread() = withCenter { center, arena ->
        val name = uniqueName(arena, "thread")
        val callbackThreadId = AtomicLong(-1L)
        val observation = center.observe(name = name) {
            callbackThreadId.set(Thread.currentThread().threadId())
        }
        val executor = Executors.newSingleThreadExecutor()

        try {
            val postingThread = executor.submit<Long> {
                ObjCRuntime.autoreleasePool {
                    val threadId = Thread.currentThread().threadId()
                    center.postNotificationName_object(name, MemorySegment.NULL)
                    threadId
                }
            }.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)

            assertEquals(postingThread, callbackThreadId.get())
        } finally {
            observation.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun closeWhileCallbackIsHeldRejectsLaterNotifications() = withCenter { center, arena ->
        val name = uniqueName(arena, "held-close")
        val entered = CountDownLatch(1)
        val allowReturn = CountDownLatch(1)
        val delivered = AtomicInteger()
        val observation = center.observe(name = name) {
            delivered.incrementAndGet()
            entered.countDown()
            check(allowReturn.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))
        }
        val executor = Executors.newFixedThreadPool(2)

        try {
            val inFlight = executor.submit {
                ObjCRuntime.autoreleasePool {
                    center.postNotificationName_object(name, MemorySegment.NULL)
                }
            }
            assertTrue(entered.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))

            executor.submit { observation.close() }
                .get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            center.postNotificationName_object(name, MemorySegment.NULL)
            assertEquals(1, delivered.get())

            allowReturn.countDown()
            inFlight.get(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            center.postNotificationName_object(name, MemorySegment.NULL)
            assertEquals(1, delivered.get())
        } finally {
            allowReturn.countDown()
            observation.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun callbackFailureIsContainedAndReported() = withCenter { center, arena ->
        val name = uniqueName(arena, "failure")
        val expected = IllegalStateException("notification callback failed")
        val failures = ConcurrentLinkedQueue<Throwable>()
        val observation = center.observe(
            name = name,
            onError = CallbackExceptionHandler(failures::add),
        ) { throw expected }

        try {
            center.postNotificationName_object(name, MemorySegment.NULL)

            assertSame(expected, failures.single())
        } finally {
            observation.close()
        }
    }

    @Test
    fun repeatedCloseKeepsObservationDetached() = withCenter { center, arena ->
        val name = uniqueName(arena, "repeated-close")
        val delivered = AtomicInteger()
        val observation = center.observe(name = name) { delivered.incrementAndGet() }

        observation.close()
        observation.close()
        center.postNotificationName_object(name, MemorySegment.NULL)

        assertEquals(0, delivered.get())
    }

    private fun withCenter(block: (NSNotificationCenter, Arena) -> Unit) {
        requireMacOS()
        ObjCRuntime.autoreleasePool {
            Arena.ofConfined().use { arena ->
                block(NSNotificationCenter(NSNotificationCenter.defaultCenter()), arena)
            }
        }
    }

    private fun uniqueName(arena: Arena, label: String): MemorySegment = ObjCRuntime.newNSString(
        arena,
        "org.graphiks.kffi.tests.$label.${UUID.randomUUID()}",
    )

    private fun requireMacOS() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )
    }

    private companion object {
        const val TIMEOUT_SECONDS = 10L
    }
}
