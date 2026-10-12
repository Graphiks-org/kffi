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
            val configureSerials: kotlin.collections.MutableList<Int> = java.util.Collections.synchronizedList(ArrayList<Int>())
            val entered = java.util.concurrent.atomic.AtomicBoolean(false)
            val closed = java.util.concurrent.atomic.AtomicBoolean(false)
            toplevel.addEventsListener(
                onConfigure = { _, _, states ->
                    assertTrue(states.isNotEmpty())
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
            toplevel.setTitle("kffi-managed-window")
            toplevel.setAppId("org.graphiks.kffi.test")
            // handshake: initial commit without a buffer, then wait for configure
            surface.commit()
            assertTrue(configureSerials.awaitFirst(5_000))
            val buffer = it.createShmBuffer(64, 64)
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
            val deadline = System.nanoTime() + 5_000_000_000L
            while (System.nanoTime() < deadline && !entered.get() && framed.count > 0L) {
                it.roundtrip()
                Thread.sleep(25)
            }
            assertTrue(
                entered.get() || framed.count == 0L,
                "M2DEBUG surface did not map: serials=$configureSerials hasError=${it.hasError()} entered=${entered.get()} framed=${framed.count}",
            )
            buffer.close()
            toplevel.close()
            xdg.close()
            surface.close()
            it.close()
            it.close()
        }
    }

    private fun kotlin.collections.MutableList<Int>.awaitFirst(timeoutMillis: Long): Boolean {
        val deadline = System.nanoTime() + timeoutMillis * 1_000_000L
        while (isEmpty()) {
            if (System.nanoTime() > deadline) return false
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
