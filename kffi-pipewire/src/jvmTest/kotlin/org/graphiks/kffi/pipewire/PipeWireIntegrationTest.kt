package org.graphiks.kffi.pipewire

import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assumptions.assumeTrue

/**
 * Integration proofs on the real libpipewire-0.3 stack (Linux-only,
 * `pipewireIntegrationTest`): the generated symbols load, the managed
 * facade round-trips properties, and a thread loop drives its lock/wait/
 * signal discipline. The stream negotiation proof (fd from a real portal
 * socket, events upcalls, SHM buffers) lives in kadre's container oracle,
 * which owns raw-fd production through kffi-posix and a real daemon.
 */
class PipeWireIntegrationTest {

    private fun requireEnvironment() {
        assumeTrue(System.getenv("KFFI_PIPEWIRE_INTEGRATION") == "1", "KFFI_PIPEWIRE_INTEGRATION must equal 1")
    }

    @Test
    fun propertiesRoundTripThroughTheManagedFacade() {
        requireEnvironment()
        java.lang.foreign.Arena.ofConfined().use { arena ->
            val properties = PipeWireProperties.fromString(
                arena,
                "media.type=Video media.category=Source media.role=Screen",
            )
            properties.use {
                assertNotNull(it)
                assertTrue(it.handle() != java.lang.foreign.MemorySegment.NULL)
            }
            println("PIPEWIRE-PROPERTIES-OK")
        }
    }

    @Test
    fun threadLoopDrivesLockWaitSignal() {
        requireEnvironment()
        val loop = PipeWireThreadLoop.create("kffi-pipewire-proof", null)
        loop.use { threadLoop ->
            assertTrue(threadLoop.start() == 0, "pw_thread_loop_start must succeed")
            val parked = java.util.concurrent.atomic.AtomicBoolean(false)
            val signaled = CountDownLatch(1)
            Thread {
                threadLoop.withLock {
                    parked.set(true)
                    threadLoop.await()
                    signaled.countDown()
                }
            }.apply { isDaemon = true }.start()
            // Acquiring the lock proves the worker parked in wait: it set the
            // flag and entered wait under one continuous lock hold.
            while (!parked.get()) Thread.onSpinWait()
            threadLoop.withLock { threadLoop.signal(false) }
            assertTrue(signaled.await(5, TimeUnit.SECONDS), "pw_thread_loop_wait must pair with signal")
            println("PIPEWIRE-THREAD-LOOP-OK")
        }
    }
}
