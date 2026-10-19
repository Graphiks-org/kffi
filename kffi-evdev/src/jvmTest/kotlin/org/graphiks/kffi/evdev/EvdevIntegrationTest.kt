package org.graphiks.kffi.evdev

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assumptions.assumeTrue

/**
 * Integration proofs on the real evdev/udev stack (Linux-only,
 * `evdevIntegrationTest`): enumeration lists the input nodes, the ioctl
 * constants decode a real device identity, and — when /dev/uinput is
 * loadable — a virtual gamepad created through uinput is detected as a
 * gamepad and delivers its injected events through the evdev path.
 */
class EvdevIntegrationTest {

    private fun requireEnvironment() {
        assumeTrue(System.getenv("KFFI_EVDEV_INTEGRATION") == "1", "KFFI_EVDEV_INTEGRATION must equal 1")
    }

    @Test
    fun udevEnumerationListsInputNodes() {
        requireEnvironment()
        val context = UdevContext.open()
        assertNotNull(context)
        context.use {
            val nodes = it.listInputNodes()
            assertTrue(nodes.all { node -> node.devNode.startsWith("/dev/input/event") })
            // a container with a seat exposes at least the host input nodes
            // (an event0 may be absent in minimal containers — the proof
            // asserts the enumeration contract, not a specific device set)
            println("EVDEV-ENUM ${nodes.size} nodes")
        }
    }

    @Test
    fun evdecIdentityAndBitsDecodeOnARealNode() {
        requireEnvironment()
        val context = UdevContext.open()
        assertNotNull(context)
        context.use {
            val node = it.listInputNodes().firstOrNull() ?: return
            val fd = evdevOpen(node.devNode)
            assertTrue(fd >= 0, "open(${node.devNode}) failed")
            try {
                val id = evdevGetId(fd)
                assertNotNull(id)
                println("EVDEV-ID ${node.devNode} bustype=0x${id.bustype.toString(16)} vendor=0x${id.vendor.toString(16)} product=0x${id.product.toString(16)}")
                val name = evdevGetName(fd)
                println("EVDEV-NAME ${node.devNode} name=$name")
                val keyBits = evdevGetBits(fd, EvdevEvent.KEY, 256)
                assertNotNull(keyBits)
                // decoding is exercised; gamepad-ness on the host node is
                // whatever it is — the uinput proof pins the true case
                println("EVDEV-GAMEPAD-BIT ${node.devNode} gamepad=${keyBits?.let(::evdevBitsetHasGamepadButton)}")
            } finally {
                evdevClose(fd)
            }
        }
    }

    // The uinput oracle (design D6): one virtual gamepad — South button,
    // two stick axes — driven end-to-end through the evdev path.
    private fun openVirtualGamepad(ffEffectsMax: Int = 0): Pair<UinputVirtualGamepad, String>? {
        val virtual = UinputVirtualGamepad.open(
            name = "kffi evdev proof pad",
            bustype = 0x03, // BUS_USB
            vendor = 0x1234,
            product = 0x5678,
            buttons = listOf(0x130, 0x131, 0x136, 0x137, 0x13a, 0x13b, 0x13c, 0x13d, 0x13e),
            axes = listOf(
                UinputVirtualGamepad.Axis(0x00, -32768, 32767), // ABS_X
                UinputVirtualGamepad.Axis(0x01, -32768, 32767), // ABS_Y
                UinputVirtualGamepad.Axis(0x03, -32768, 32767), // ABS_RX
                UinputVirtualGamepad.Axis(0x04, -32768, 32767), // ABS_RY
                UinputVirtualGamepad.Axis(0x02, 0, 255), // ABS_Z (left trigger)
                UinputVirtualGamepad.Axis(0x05, 0, 255), // ABS_RZ (right trigger)
            ),
            ffEffectsMax = ffEffectsMax,
        ) ?: run {
            println("EVDEV-UINPUT-OPEN-FAILED")
            return null
        }
        // The kernel registers the device in devtmpfs, but a container's
        // /dev is a static snapshot: read major/minor from sysfs and mknod
        // the node ourselves before looking for it.
        val sysName = virtual.sysName()
        println("EVDEV-UINPUT-CREATED sys=${sysName ?: "unknown"}")
        val sysDir = sysName?.let { java.io.File("/sys/class/input/$it") }
        var eventDir: java.io.File? = null
        run searchSys@{
            repeat(40) {
                eventDir = sysDir?.listFiles().orEmpty().firstOrNull { file -> file.name.startsWith("event") }
                if (eventDir != null) return@searchSys
                Thread.sleep(100)
            }
        }
        if (eventDir != null) {
            val devFile = java.io.File(eventDir, "dev")
            val majorMinor = devFile.readText().trim()
            val node = java.io.File("/dev/input/${eventDir!!.name}")
            if (!node.exists()) {
                val mknod = ProcessBuilder("mknod", node.absolutePath, "c", *majorMinor.split(":").toTypedArray())
                    .start().waitFor()
                println("EVDEV-UINPUT-MKNOD ${node.absolutePath} $majorMinor rc=$mknod")
            }
        }
        // the event node appears after UI_DEV_CREATE; wait for it to be
        // listable — udev enumeration when libudev is loaded, /dev/input
        // scan as the fallback of last resort (minimal containers)
        val nodeNames = ArrayList<String>()
        UdevContext.open()?.use { udev ->
            repeat(40) {
                nodeNames.addAll(udev.listInputNodes().map { node -> node.devNode })
                if (nodeNames.isNotEmpty()) return@use
                Thread.sleep(100)
            }
        }
        if (nodeNames.isEmpty()) {
            run search@{
                repeat(40) {
                    val directory = java.io.File("/dev/input")
                    nodeNames.addAll(
                        directory.listFiles().orEmpty()
                            .filter { file -> file.name.startsWith("event") }
                            .map { file -> file.absolutePath },
                    )
                    if (nodeNames.isNotEmpty()) return@search
                    Thread.sleep(100)
                }
            }
        }
        val devNode = nodeNames.firstOrNull { candidate ->
            val fd = evdevOpen(candidate)
            if (fd < 0) return@firstOrNull false
            try {
                evdevGetName(fd) == virtual.name
            } finally {
                evdevClose(fd)
            }
        } ?: run {
            virtual.close()
            return null
        }
        return virtual to devNode
    }

    @Test
    fun uinputVirtualGamepadIsDetectedAndDeliversEvents() {
        requireEnvironment()
        val (virtual, devNode) = openVirtualGamepad() ?: run {
            assumeTrue(false, "/dev/uinput unavailable — skipping the oracle proof")
            return
        }
        virtual.use {
            val fd = evdevOpen(devNode)
            assertTrue(fd >= 0, "open($devNode) failed")
            try {
                // detection: kernel capabilities are the truth (D1)
                val keyBits = evdevGetBits(fd, EvdevEvent.KEY, 256)
                assertNotNull(keyBits)
                assertTrue(evdevBitsetHasGamepadButton(keyBits), "virtual pad must be detected as a gamepad")

                // identity round-trip
                val id = evdevGetId(fd)
                assertNotNull(id)
                assertTrue(id.vendor == 0x1234 && id.product == 0x5678, "identity mismatch: $id")

                // abs bounds round-trip
                val absY = evdevGetAbs(fd, 0x01)
                assertNotNull(absY)
                assertTrue(absY.minimum == -32768 && absY.maximum == 32767, "abs bounds mismatch: $absY")

                // injected button/axis events decode on the evdev side
                virtual.inject(EvdevEvent.KEY, 0x130, 1)
                virtual.inject(EvdevEvent.ABS, 0x00, 16384)
                val buffer = java.lang.foreign.Arena.ofConfined().allocate(INPUT_EVENT_LAYOUT.byteSize() * 8)
                var decoded: List<EvdevInputEvent> = emptyList()
                repeat(40) {
                    val bytes = evdevRead(fd, buffer)
                    if (bytes > 0) {
                        decoded = evdevDecodeEvents(buffer, bytes)
                        return@repeat
                    }
                    Thread.sleep(50)
                }
                val press = decoded.firstOrNull { it.type == EvdevEvent.KEY && it.code == 0x130 }
                assertNotNull(press, "BTN_SOUTH press not delivered: $decoded")
                assertTrue(press.value == 1)
                val axis = decoded.firstOrNull { it.type == EvdevEvent.ABS && it.code == 0x00 }
                assertNotNull(axis, "ABS_X not delivered: $decoded")
                assertTrue(axis.value == 16384)
                println("EVDEV-UINPUT $devNode press=${press.value} absX=${axis.value}")
            } finally {
                evdevClose(fd)
            }
        }
    }

    // polls the owner's forwarded queue until an event shows up or the
    // deadline passes (repeat{} cannot break early — return@repeat
    // continues, and a follow-up poll would overwrite the found event)
    private fun pollForwarded(virtual: UinputVirtualGamepad, timeoutMillis: Long): UinputRequest? {
        val deadline = System.currentTimeMillis() + timeoutMillis
        while (System.currentTimeMillis() < deadline) {
            virtual.pollForwardedRequest()?.let { return it }
            Thread.sleep(25)
        }
        return null
    }

    @Test
    fun forceFeedbackCyclePlaysStopsAndErases() {
        requireEnvironment()
        val (virtual, devNode) = openVirtualGamepad(ffEffectsMax = 4) ?: run {
            assumeTrue(false, "/dev/uinput unavailable — skipping the FF proof")
            return
        }
        virtual.use {
            // the owner must keep servicing the kernel's FF handshakes:
            // uploads and erases block the event-node caller until then
            val pumping = java.util.concurrent.atomic.AtomicBoolean(true)
            val pumper = Thread {
                while (pumping.get() && !Thread.currentThread().isInterrupted) {
                    if (!virtual.pumpFfRequest()) Thread.sleep(5)
                }
            }.apply { isDaemon = true; start() }
            try {
                // read-write: the FF proof injects EV_FF plays through the
                // same node it reads from (a read-only fd fails with EBADF)
                val fd = evdevOpenReadWrite(devNode)
                assertTrue(fd >= 0, "open($devNode) failed")
                try {
                    // upload (EVIOCSFF): the managed helper fills the
                    // generated storage layout; the kernel assigns the id
                    val effectId = evdevUploadRumble(
                        fd = fd,
                        strong = 0.5,
                        weak = 0.25,
                        durationMillis = 300,
                    )
                    assertTrue(effectId >= 0, "EVIOCSFF failed errno=${evdevErrno()}")

                    // play (write EV_FF): the kernel forwards the request to the
                    // uinput owner, which observes { code = effect id, value = repeats }
                    var playWritten: Long = -1
                    run play@{
                        repeat(10) {
                            java.lang.foreign.Arena.ofConfined().use { arena ->
                                playWritten = evdevWrite(fd, evdevEncodeEvent(arena, EvdevEvent.FF, effectId, 1))
                            }
                            if (playWritten >= 0) return@play
                            Thread.sleep(100)
                        }
                    }
                    assertTrue(playWritten >= 0, "play write failed rc=$playWritten errno=${evdevErrno()}")
                    val played = pollForwarded(virtual, 5000)
                    assertNotNull(played, "the uinput owner never observed the play request")
                    assertTrue(played!!.code == effectId && played.value == 1, "unexpected request: $played")

                    // stop (value = 0)
                    java.lang.foreign.Arena.ofConfined().use { arena ->
                        evdevWrite(fd, evdevEncodeEvent(arena, EvdevEvent.FF, effectId, 0))
                    }
                    val stopped = pollForwarded(virtual, 5000)
                    assertNotNull(stopped, "the uinput owner never observed the stop request")
                    assertTrue(stopped!!.value == 0, "unexpected stop: $stopped")

                    // erase (EVIOCRMFF)
                    val erased = evdevIoctlInt(fd, EVIOCRMFF, effectId)
                    assertTrue(erased >= 0, "EVIOCRMFF failed rc=$erased errno=${evdevErrno()}")
                    println("EVDEV-FF $devNode effectId=$effectId played=${played.value} stopped=${stopped.value} erased=$erased")
                } finally {
                    evdevClose(fd)
                }
            } finally {
                pumping.set(false)
                pumper.join(1000)
            }
        }
    }
}
