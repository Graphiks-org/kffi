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
    fun twoLivePoolsSurviveAWakeupBurst() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            val first = it.createShmBuffer(64, 64)
            assertNotNull(first)
            val wake = org.graphiks.kffi.posix.PosixWakeup.open()
            wake.signal()
            wake.drain()
            wake.close()
            val second = it.createShmBuffer(32, 32)
            assertNotNull(second, "the pool marshal is corrupted after the wakeup syscalls")
            assertTrue(it.roundtrip())
            first.close()
            second.close()
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
            val two = it.createShmBuffer(32, 32)
            assertNotNull(two, "the second pool fails without any wakeup")
            assertTrue(it.roundtrip())
            one.close()
            two.close()
        }
    }

    @org.junit.jupiter.api.Disabled(
        "injection oracle pending: the seat capability path is proven at the wire " +
            "(virtual pointer attaches, capabilities(POINTER) arrives, the gated get_pointer goes out, " +
            "sway reports the device and keyboard focus) but sway headless never notifies pointer " +
            "focus to the client through either injection path (zwlr virtual pointer events, " +
            "swaymsg cursor move/press) — re-enable once the oracle uses a compositor that " +
            "delivers, or uinput",
    )
    @Test
    fun managedSeatDeliversCapabilitiesPointerAndKeyboardEvents() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            var seatName: Int? = null
            it.registry.addGlobalsListener(
                onGlobal = { name, interfaceName, _ ->
                    if (interfaceName == "wl_seat" && seatName == null) seatName = name
                },
            )
            assertTrue(it.roundtrip())
            assertNotNull(seatName, "the compositor advertises no wl_seat")

            val seat = it.bindSeat(seatName!!)
            assertNotNull(seat)
            seat.use { boundSeat ->
                var capabilities = 0
                val pointerEvents = ArrayList<org.graphiks.kffi.wayland.managed.WaylandPointerEvent>()
                boundSeat.addSeatListener(onCapabilities = { capabilities = it })
                boundSeat.addPointerListener { event -> pointerEvents.add(event) }
                boundSeat.addKeyboardListener { event -> }
                // map a surface first: pointer enter needs a surface under
                // the cursor, the injection would have nothing to deliver to.
                // The mapping recipe mirrors the handshake proof exactly —
                // including the intermediate roundtrips after each step.
                val surface = it.createSurface()
                val xdg = it.createXdgSurface(surface)
                val toplevel = it.createToplevel(xdg)
                client.roundtrip()
                toplevel.setTitle("kffi-seat-injection")
                client.roundtrip()
                toplevel.setAppId("org.graphiks.kffi.wayland.seat")
                client.roundtrip()
                val serials = java.util.Collections.synchronizedList(ArrayList<Int>())
                val entered = java.util.concurrent.atomic.AtomicBoolean(false)
                toplevel.addEventsListener(
                    onConfigure = { _, _, _ -> },
                    onClose = {},
                    onFailure = {},
                )
                xdg.addConfigureListener(onConfigure = { serial -> serials.add(serial) }, onFailure = {})
                surface.addEnterLeaveListener(
                    onEnter = { entered.set(true) },
                    onLeave = {},
                    onFailure = {},
                )
                surface.commit()
                assertTrue(serials.awaitFirst(client, 10_000), "surface never configured")
                val buffer = it.createShmBuffer(64, 64)
                val released = java.util.concurrent.CountDownLatch(1)
                buffer.addReleaseListener(onRelease = { released.countDown() })
                val pixels = buffer.content()
                for (index in 0 until 64 * 64) {
                    pixels.set(java.lang.foreign.ValueLayout.JAVA_INT, index.toLong() * 4, 0xFF3366AA.toInt())
                }
                xdg.ackConfigure(serials.last())
                val framed = java.util.concurrent.CountDownLatch(1)
                surface.addFrameListener(onFrame = { framed.countDown() }, onFailure = {})
                surface.attachAndCommit(buffer)
                val mapped = System.nanoTime() + 10_000_000_000L
                while (System.nanoTime() < mapped && !entered.get() && framed.count > 0L) {
                    client.roundtrip()
                    Thread.sleep(25)
                }
                assertTrue(
                    framed.count == 0L,
                    "surface never presented a frame (serials=${serials.size} caps=$capabilities " +
                        "hasError=${client.hasError()} pointerEvents=${pointerEvents.size})",
                )

                // a headless seat starts with no capability: the harness
                // attaches virtual devices, the capabilities event arrives,
                // the gated get_pointer/get_keyboard requests go out, and the
                // injected motion/button events flow back to this client
                assertTrue(client.roundtrip())

                // virtual pointer injection via the authored harness
                val pointerManager = client.bindVirtualPointerManager()
                assertNotNull(pointerManager, "sway does not expose zwlr_virtual_pointer_manager_v1")
                val virtualPointer = client.createVirtualPointer(pointerManager, boundSeat)
                assertNotNull(virtualPointer)

                val deadline = System.nanoTime() + 10_000_000_000L
                while (System.nanoTime() < deadline &&
                    capabilities and org.graphiks.kffi.wayland.managed.WaylandSeatCapabilities.POINTER == 0
                ) {
                    client.roundtrip()
                }
                assertTrue(
                    capabilities and org.graphiks.kffi.wayland.managed.WaylandSeatCapabilities.POINTER != 0,
                    "the virtual pointer never granted the pointer capability",
                )

                // compositor-side injection: swaymsg drives the seat cursor
                // (the roadmap oracle — the production mapper is never its
                // own oracle); the virtual pointer only granted the capability
                swaymsg("seat", "seat0", "cursor", "move", "320", "240")
                swaymsg("seat", "seat0", "cursor", "press", "button1")
                client.roundtrip()
                swaymsg("seat", "seat0", "cursor", "release", "button1")
                client.roundtrip()
                client.roundtrip()

                assertTrue(
                    pointerEvents.any { event -> event.kind == org.graphiks.kffi.wayland.managed.WaylandPointerEvent.Kind.Enter },
                    "no pointer enter after injection (${pointerEvents.size} events)",
                )
                assertTrue(
                    pointerEvents.any { event -> event.kind == org.graphiks.kffi.wayland.managed.WaylandPointerEvent.Kind.Button },
                    "no pointer button after injection",
                )
                assertTrue(
                    pointerEvents.any { event -> event.kind == org.graphiks.kffi.wayland.managed.WaylandPointerEvent.Kind.Frame },
                    "no pointer frame after injection",
                )
                buffer.close()
                toplevel.close()
                xdg.close()
                surface.close()
            }
        }
    }

    @Test
    fun managedOutputBindsAndDeliversStateAtDone() {
        requireCompositorEnvironment()
        val client = WaylandClient.connect()
        assertNotNull(client)
        client.use {
            // the consumer must be registered BEFORE the first dispatch: the
            // registry burst is announced once and libwayland discards events
            // for a proxy without a listener
            var outputName: Int? = null
            it.registry.addGlobalsListener(
                onGlobal = { name, interfaceName, _ ->
                    if (interfaceName == "wl_output" && outputName == null) outputName = name
                },
            )
            assertTrue(it.roundtrip())
            assertNotNull(outputName, "the compositor advertises no wl_output")
            val output = it.bindOutput(outputName!!)
            assertNotNull(output)
            output.use { out ->
                var states = 0
                var last: org.graphiks.kffi.wayland.managed.WaylandOutputState? = null
                out.addListener(
                    onState = { state ->
                        states += 1
                        last = state
                    },
                )
                // outputs deliver their full state at bind; one roundtrip
                // suffices for sway to dispatch geometry/mode/scale + done
                assertTrue(it.roundtrip())
                assertTrue(states >= 1, "no output state delivered at done")
                val state = last!!
                assertTrue(state.scale >= 1, "scale must be >= 1")
                assertTrue(state.modes.isNotEmpty(), "modes must not be empty")
                assertTrue(state.currentModeIndex >= 0, "no current mode")
                assertTrue(state.name != null, "wl_output.name requires v4")
            }
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
            // proof of mapping = the presentation frame fired; the missing
            // enter is tracked as a kffi diagnostic (see #116 discussion)
            assertTrue(
                framed.count == 0L,
                "surface did not map: serials=$configureSerials hasError=${it.hasError()} " +
                    "entered=${entered.get()} framed=${framed.count == 0L}",
            )
            buffer.close()
            toplevel.close()
            xdg.close()
            surface.close()
            it.close()
            it.close()
        }
    }

    /** Runs a swaymsg command against the compositor IPC socket. */
    private fun swaymsg(vararg command: String) {
        val runtime = System.getenv("XDG_RUNTIME_DIR") ?: return
        val socket = java.io.File(runtime).listFiles()
            ?.filter { it.name.startsWith("sway-ipc") }
            ?.maxByOrNull { it.lastModified() }
            ?: return
        val process = ProcessBuilder("swaymsg", "-s", socket.absolutePath, *command)
            .redirectErrorStream(true)
            .start()
        process.waitFor(5, java.util.concurrent.TimeUnit.SECONDS)
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
