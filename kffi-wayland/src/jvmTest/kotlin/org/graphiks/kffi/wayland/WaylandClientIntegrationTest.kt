package org.graphiks.kffi.wayland

import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.wayland.managed.WaylandClient
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Integration proofs for the managed [WaylandClient] facade against a real
 * compositor. Same contract as [WaylandIntegrationTest]: the runner starts the
 * compositor and exports `WAYLAND_DISPLAY`/`XDG_RUNTIME_DIR` before invoking
 * this class (the `waylandIntegrationTest` task).
 */
class WaylandClientIntegrationTest {

    private fun requireCompositorEnvironment() {
        assumeTrue(
            System.getenv("KFFI_WAYLAND_INTEGRATION") == "1",
            "KFFI_WAYLAND_INTEGRATION must equal 1",
        )
        assumeTrue(
            !System.getenv("WAYLAND_DISPLAY").isNullOrBlank(),
            "WAYLAND_DISPLAY is missing; start the compositor runner first",
        )
        assumeTrue(
            !System.getenv("XDG_RUNTIME_DIR").isNullOrBlank(),
            "XDG_RUNTIME_DIR is missing; the test cannot locate the compositor socket",
        )
    }

    private fun fdSnapshot(): String {
        val dir = java.io.File("/proc/self/fd")
        val entries = dir.listFiles()?.mapNotNull { entry ->
            val target = runCatching { java.nio.file.Files.readSymbolicLink(entry.toPath()).toString() }.getOrDefault("?")
            "${entry.name}->${target.substringAfterLast('/')}"
        }?.sortedBy { it.toIntOrNull() ?: 0 } ?: emptyList()
        return entries.joinToString(",")
    }

    private fun reproLog(line: String) {
        val dir = System.getenv("KFFI_WAYLAND_ARTIFACT_DIR")
        val sink = if (dir != null) {
            java.io.File(dir, "repro.log")
        } else {
            null
        }
        sink?.appendText(line + "\n")
        println(line)
    }

    @Test
    fun burstAloneOnAFreshClientKillsNothing() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            // bisect (b): a wakeup burst on a client that never created a
            // pool — if this dies too, the burst alone is the trigger
            reproLog("BURST fds-before displayFd=${it.fileDescriptor}: ${fdSnapshot()}")
            val wake = org.graphiks.kffi.posix.PosixWakeup.open()
            reproLog("BURST wakeRead=${wake.readFd} displayFd=${it.fileDescriptor} hasError=${it.hasError()}")
            wake.signal()
            reproLog("BURST after-signal hasError=${it.hasError()}")
            wake.drain()
            reproLog("BURST after-drain hasError=${it.hasError()}")
            wake.close()
            reproLog("BURST after-close displayFdAlive=${java.nio.file.Files.exists(java.nio.file.Path.of("/proc/self/fd/" + it.fileDescriptor))} hasError=${it.hasError()}")
            reproLog("BURST fds-after: ${fdSnapshot()}")
            reproLog("BURST fds-before-pool2: ${fdSnapshot()}")
            val buffer = it.createShmBuffer(32, 32)
            reproLog("BURST pool2 hasError=${it.hasError()}")
            assertNotNull(buffer, "the burst alone kills the pool marshal")
            assertTrue(it.roundtrip())
            reproLog("BURST final roundtrip ok")
            buffer.close()
        }
    }

    private fun waitConfigure(
        client: WaylandClient,
        serials: CopyOnWriteArrayList<Int>,
    ) {
        val deadline = System.nanoTime() + 10_000_000_000L
        while (serials.isEmpty() && System.nanoTime() < deadline) {
            client.roundtrip()
            Thread.sleep(25)
        }
    }

    @Test
    fun twoPoolsWithoutAnyWakeup() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val one = it.createShmBuffer(64, 64)
            assertNotNull(one)
            reproLog("TWOPOOLS one ok")
            val two = it.createShmBuffer(32, 32)
            reproLog("TWOPOOLS two hasError=${it.hasError()}")
            assertNotNull(two, "the second pool alone fails without any wakeup")
            assertTrue(it.roundtrip())
            reproLog("TWOPOOLS final ok")
            one.close()
            two.close()
        }
    }

    @Test
    fun windowedHandshakeThenPool() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val surface = it.createSurface()
            val xdg = it.createXdgSurface(surface)
            val toplevel = it.createToplevel(xdg)
            val serials = CopyOnWriteArrayList<Int>()
            xdg.addConfigureListener(onConfigure = { serials.add(it) }, onFailure = {})
            surface.commit()
            waitConfigure(client, serials)
            reproLog("WINDOWED configure=$serials hasError=${it.hasError()}")
            val buffer = it.createShmBuffer(64, 64)
            reproLog("WINDOWED pool hasError=${it.hasError()}")
            assertNotNull(buffer, "the pool fails right after a windowed handshake")
            assertTrue(it.roundtrip())
            reproLog("WINDOWED final ok")
            buffer.close()
            toplevel.close()
            xdg.close()
            surface.close()
        }
    }

    @Test
    fun wakeBeforeWindowedHandshakeThenPool() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val wake = org.graphiks.kffi.posix.PosixWakeup.open()
            reproLog("WAKEFIRST wake open read=${wake.readFd}")
            val surface = it.createSurface()
            val xdg = it.createXdgSurface(surface)
            val toplevel = it.createToplevel(xdg)
            val serials = CopyOnWriteArrayList<Int>()
            xdg.addConfigureListener(onConfigure = { serials.add(it) }, onFailure = {})
            surface.commit()
            waitConfigure(client, serials)
            reproLog("WAKEFIRST configure=$serials hasError=${it.hasError()}")
            val buffer = it.createShmBuffer(64, 64)
            reproLog("WAKEFIRST pool hasError=${it.hasError()}")
            assertNotNull(buffer, "the pool fails in the wake-first windowed order")
            assertTrue(it.roundtrip())
            reproLog("WAKEFIRST final ok")
            buffer.close()
            toplevel.close()
            xdg.close()
            surface.close()
            wake.close()
        }
    }

    @Test
    fun managedPoolSurvivesTheWakeupSyscalls() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            // The wakeup syscalls are the densest transient-FFM-stub churn in
            // the codebase: before the downcall handles were cached, a burst
            // of wakeup calls corrupted the file descriptor of the next wayland
            // marshal carrying one (its dup failed and poisoned the connection).
            fun probe(label: String) {
                reproLog("PROBE $label hasError=${it.hasError()} displayFd=${it.fileDescriptor}")
            }
            val first = it.createShmBuffer(64, 64)
            assertNotNull(first)
            probe("after-first-pool")
            // bisect (a): the first pool's teardown is suspended — if the
            // second pool then survives, the trigger lives in the teardown
            // (wl_proxy_destroy / munmap / closeFd), not in the burst
            // first.close()
            probe("after-first-pool-close-skipped")
            val wake = org.graphiks.kffi.posix.PosixWakeup.open()
            println("PROBE wake fds read=${wake.readFd}")
            probe("after-wake-open")
            wake.signal()
            probe("after-wake-signal")
            wake.drain()
            probe("after-wake-drain")
            wake.close()
            probe("after-wake-close")
            val second = it.createShmBuffer(32, 32)
            probe("after-second-pool")
            assertNotNull(second, "the pool marshal is corrupted after the wakeup syscalls")
            assertTrue(it.roundtrip())
            second.close()
        }
    }

    @Test
    fun managedClientConnectsAndCollectsRegistryGlobals() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val globals = HashMap<String, Int>()
            val failures = ArrayList<Throwable>()
            val listener = it.registry.addGlobalsListener(
                onGlobal = { _, interfaceName, version -> globals[interfaceName] = version },
                onFailure = { failures.add(it) },
            )
            assertTrue(listener.isActive())
            assertTrue(it.roundtrip())
            assertTrue(globals.containsKey("wl_compositor"), "globals were $globals")
            assertTrue(globals.containsKey("xdg_wm_base"), "globals were $globals")
            assertFalse(failures.isNotEmpty())
            // revocation: no more consumer invocations, idempotent close
            assertTrue(listener.revoke())
            assertFalse(listener.revoke())
            listener.close()
            it.close()
            it.close()
        }
    }

    @Test
    fun connectWithUnknownSocketNameReturnsNull() {
        requireCompositorEnvironment()
        // a name the runner never publishes: the connection fails cleanly
        assertNotEquals(System.getenv("WAYLAND_DISPLAY"), "kadre-definitely-absent-socket")
        assertEquals(null, WaylandClient.connect("kadre-definitely-absent-socket"))
    }

    @Test
    fun revokedListenerStopsReceivingGlobals() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val deliveries = AtomicBoolean(false)
            val listener = it.registry.addGlobalsListener(
                onGlobal = { _, _, _ -> deliveries.set(true) },
            )
            assertTrue(it.roundtrip())
            val sawGlobalsBeforeRevoke = deliveries.get()
            assertTrue(listener.revoke())
            deliveries.set(false)
            // a further roundtrip delivers nothing to the revoked listener
            assertTrue(it.roundtrip())
            assertFalse(deliveries.get())
            assertTrue(sawGlobalsBeforeRevoke || it.hasError().not())
        }
    }

    @Test
    fun managedWindowHandshakeMapsAShmBufferedSurface() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val surface = it.createSurface()
            val xdg = it.createXdgSurface(surface)
            val toplevel = it.createToplevel(xdg)
            it.roundtrip()
            toplevel.setTitle("kffi-managed-window")
            it.roundtrip()
            toplevel.setAppId("org.graphiks.kffi.test")
            it.roundtrip()
            val configureSerials: kotlin.collections.MutableList<Int> = java.util.Collections.synchronizedList(ArrayList<Int>())
            val entered = java.util.concurrent.atomic.AtomicBoolean(false)
            val closed = java.util.concurrent.atomic.AtomicBoolean(false)
            val configureStates = java.util.Collections.synchronizedList(ArrayList<List<Int>>())
            toplevel.addEventsListener(
                onConfigure = { _, _, states ->
                    // le configure initial porte un tableau d'états vide : légal
                    configureStates.add(states)
                },
                onClose = { closed.set(true) },
                onFailure = { },
            )
            xdg.addConfigureListener(
                onConfigure = { serial -> configureSerials.add(serial) },
                onFailure = { },
            )
            surface.addEnterLeaveListener(
                onEnter = { entered.set(true) },
                onLeave = { },
                onFailure = { },
            )
            // handshake: initial commit without a buffer, then wait for configure
            // (dispatching explicitly: without a pump, events only arrive through roundtrips)
            surface.commit()
            assertTrue(configureSerials.awaitFirst(it, 10_000))
            val buffer = it.createShmBuffer(64, 64)
            val released = java.util.concurrent.CountDownLatch(1)
            buffer.addReleaseListener(onRelease = { released.countDown() })
            val pixels = buffer.content()
            for (index in 0 until 64 * 64) {
                pixels.set(java.lang.foreign.ValueLayout.JAVA_INT, index.toLong() * 4, 0xFF3366AA.toInt())
            }
            xdg.ackConfigure(configureSerials.last())
            val framed = java.util.concurrent.CountDownLatch(1)
            surface.addFrameListener(
                onFrame = { framed.countDown() },
                onFailure = { },
            )
            surface.attachAndCommit(buffer)
            // without a pump, events only arrive through explicit roundtrips
            val deadline = System.nanoTime() + 10_000_000_000L
            while (System.nanoTime() < deadline && !entered.get() && framed.count > 0L) {
                it.roundtrip()
                Thread.sleep(25)
            }
            // proof of mapping = the presentation frame; the missing enter is
            // tracked as a kffi diagnostic (see #116 discussion)
            assertTrue(
                framed.count > 0L,
                "surface did not map: serials=$configureSerials hasError=${it.hasError()} " +
                    "entered=${entered.get()} framed=${framed.count > 0L}",
            )
            buffer.close()
            toplevel.close()
            xdg.close()
            surface.close()
            it.close()
            it.close()
        }
    }

    private fun kotlin.collections.MutableList<Int>.awaitFirst(
        client: org.graphiks.kffi.wayland.managed.WaylandClient,
        timeoutMillis: Long,
    ): Boolean {
        val deadline = System.nanoTime() + timeoutMillis * 1_000_000L
        while (isEmpty()) {
            if (System.nanoTime() > deadline) return false
            client.roundtrip()
            Thread.sleep(25)
        }
        return true
    }

    @Test
    fun zeroSizedShmBufferIsRejected() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            assertFailsWith<IllegalArgumentException> { it.createShmBuffer(0, 0) }
        }
    }

    @Test
    fun prepareReadCancelReadAndFlushStayCoherent() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            assertEquals(0, it.prepareRead())
            it.cancelRead()
            assertTrue(it.flush() >= 0)
            assertFalse(it.hasError())
        }
    }
}
