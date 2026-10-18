package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.Executors
import kotlin.test.*

class Win32PointerPacketsIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun focusedWindowStillAcknowledgesANativeTouchReadinessProbe() {
        var downs = 0; var ups = 0
        Win32ManagedWindow.open("touch-ready-receipt") { hwnd, message, w, l ->
            when (message) {
                0x246 -> { downs++; 0L }
                0x247 -> { ups++; 0L }
                0x245, 0x249, 0x24a, 0x24c -> 0L
                0x24b -> 1L
                else -> DefWindowProcW(MemorySegment.ofAddress(hwnd), message, w, l)
            }
        }.use { window ->
            val hwnd = MemorySegment.ofAddress(window.hwnd)
            assertTrue(SetWindowPos(hwnd, MemorySegment.NULL, 10, 10, 800, 650, 0x14) != 0)
            window.setVisible(true); Win32WindowOperations.setTopmost(window.hwnd, true)
            org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.prepareForeground(window.hwnd)
            assertEquals(window.hwnd, GetForegroundWindow().address())
            assertEquals(window.hwnd, GetFocus().address())
            downs=0; ups=0
            org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.prepareForeground(window.hwnd)
            assertTrue(downs > 0 && ups > 0, "Focused HWND had no input readiness receipt: down=$downs up=$ups")
        }
    }

    @Test fun injectedDriveDeliversTheFinalReleaseBehindPostedMessages() {
        val sequenceDone = java.util.concurrent.CountDownLatch(1)
        var released = false
        var backlog = 0
        var blocked = false
        Win32ManagedWindow.open("touch-delivery-backlog") { hwnd, message, w, l ->
            when (message) {
                0x8003 -> {
                    blocked = true
                    check(sequenceDone.await(3, java.util.concurrent.TimeUnit.SECONDS))
                    Thread.sleep(50) // Hold UI until the injector has returned and its backlog is queued.
                    0L
                }
                0x8004 -> { backlog++; 0L }
                0x247 -> { released = true; 0L }
                0x245, 0x246, 0x249, 0x24a, 0x24c -> 0L
                0x24b -> 1L
                else -> DefWindowProcW(MemorySegment.ofAddress(hwnd), message, w, l)
            }
        }.use { window ->
            val hwnd = MemorySegment.ofAddress(window.hwnd)
            assertTrue(SetWindowPos(hwnd, MemorySegment.NULL, 10, 10, 800, 650, 0x14) != 0)
            window.setVisible(true); Win32WindowOperations.setTopmost(window.hwnd, true)
            org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.prepareForeground(window.hwnd)
            released = false
            assertTrue(PostMessageW(hwnd, 0x8003, 0, 0) != 0)
            org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.drive(window.hwnd) {
                try {
                    frame(org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.Contact(0, 100, 100, 0x10006))
                    frame(org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness.Contact(0, 100, 100, 0x40000))
                    repeat(1_000) { check(PostMessageW(hwnd, 0x8004, 0, 0) != 0) }
                } finally { sequenceDone.countDown() }
            }
            val releasedAtReturn = released
            val backlogAtReturn = backlog
            // Cleanup must not change the receipt captured when drive returned.
            Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
                val deadline = System.nanoTime() + 3_000_000_000L
                while (pump.pollOne(0) && System.nanoTime() < deadline) { }
            }
            assertTrue(blocked)
            assertTrue(releasedAtReturn, "drive returned before native UP: dispatched=$backlogAtReturn/1000")
            assertEquals(1_000, backlogAtReturn)
        }
    }

    @Test fun injectedTouchFramesAreReadInsideTheirRealWindowCallback() {
        var failure: Throwable? = null
        val seen = mutableListOf<Pair<Int, Win32PointerFrame>>()
        val messages = mutableListOf<Int>()
        val ids = mutableSetOf<Int>()
        var retained = 0L
        val budget = Win32PayloadBudget { bytes -> retained += bytes; AutoCloseable { retained -= bytes } }
        Win32ManagedWindow.open("pointer-native") { hwnd, message, w, l ->
            if (messages.size < 100) messages += message
            if (message in 0x245..0x247) {
                try {
                    val id = (w and 0xffff).toInt(); ids += id
                    Win32PointerPackets.read(id, 8, 128, budget).use { batch ->
                        seen += message to batch.frames.first()
                    }
                } catch (problem: Throwable) { failure = problem }
                0
            } else when (message) {
                0x249, 0x24a, 0x24c -> 0L
                0x24b -> 1L
                else -> DefWindowProcW(MemorySegment.ofAddress(hwnd), message, w, l)
            }
        }.use { window ->
            val hwnd = MemorySegment.ofAddress(window.hwnd)
            // The injection must hit this HWND even when the test process cannot steal foreground focus.
            assertTrue(SetWindowPos(hwnd, MemorySegment.ofAddress(-1), 50, 50, 500, 400, 0x10) != 0)
            window.setVisible(true)
            Win32WindowOperations.setTopmost(window.hwnd, true)
            SetForegroundWindow(hwnd)
            Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
                repeat(30) { pump.pollOne(1) }
                Executors.newSingleThreadExecutor().use { injection ->
                Arena.ofShared().use { arena ->
                    val point = arena.allocate(8, 4)
                    point.set(ValueLayout.JAVA_INT, 0, 100); point.set(ValueLayout.JAVA_INT, 4, 100)
                    assertTrue(ClientToScreen(hwnd, point) != 0)
                    val x = point.get(ValueLayout.JAVA_INT, 0); val y = point.get(ValueLayout.JAVA_INT, 4)
                    val rect = arena.allocate(16, 4)
                    assertTrue(GetWindowRect(hwnd, rect) != 0)
                    val targetDeadline = System.nanoTime() + 3_000_000_000L
                    while (WindowFromPoint(point).address() != window.hwnd && System.nanoTime() < targetDeadline) pump.pollOne(5)
                    assertEquals(window.hwnd, WindowFromPoint(point).address(), "Native hit target xy=$x,$y rect=${rect.toArray(ValueLayout.JAVA_INT).toList()} style=${GetWindowLongPtrW(hwnd, -16)} ex=${GetWindowLongPtrW(hwnd, -20)} hit=${SendMessageW(hwnd, 0x84, 0, (x.toLong() and 65535) or ((y.toLong() and 65535) shl 16))}")
                    assertTrue(injection.submit<Int> { InitializeTouchInjection(2, 3) }.get() != 0, "InitializeTouchInjection")
                    val contacts = arena.allocate(288, 8)
                    fun inject(flags: Int, dx: Int) {
                        contacts.fill(0)
                        repeat(2) { index ->
                            val p = contacts.asSlice(index * 144L, 144)
                            p.set(ValueLayout.JAVA_INT, 0, 2); p.set(ValueLayout.JAVA_INT, 4, index)
                            p.set(ValueLayout.JAVA_INT, 12, flags)
                            val px = x + index * 70 + dx
                            p.set(ValueLayout.JAVA_INT, 32, px); p.set(ValueLayout.JAVA_INT, 36, y)
                            p.set(ValueLayout.JAVA_INT, 100, 5)
                            p.set(ValueLayout.JAVA_INT, 104, px - 2); p.set(ValueLayout.JAVA_INT, 108, y - 2)
                            p.set(ValueLayout.JAVA_INT, 112, px + 2); p.set(ValueLayout.JAVA_INT, 116, y + 2)
                            p.set(ValueLayout.JAVA_INT, 140, 512 + index * 512)
                        }
                        val result = InjectTouchInput(2, contacts)
                        val error = if (result == 0) GetLastError() else 0
                        check(result != 0) { "InjectTouchInput flags=$flags error=$error" }
                    }
                    fun await(message: Int) {
                        val deadline = System.nanoTime() + 5_000_000_000L
                        while (seen.none { it.first == message } && failure == null && System.nanoTime() < deadline) pump.pollOne(1)
                        failure?.let { throw it }
                        assertTrue(seen.any { it.first == message }, "No native pointer message $message; seen ${seen.map { it.first }} all=$messages foreground=${GetForegroundWindow().address()} target=${window.hwnd} visible=${IsWindowVisible(hwnd)}")
                    }
                    // Keep the injected stream alive independently of first-use FFM/JIT work in the UI callback.
                    val sequence = injection.submit {
                        inject(0x10006, 0)
                        try { repeat(8) { Thread.sleep(16); inject(0x20006, 15) } }
                        finally { Thread.sleep(16); inject(0x40000, 15) }
                    }
                    val deadline = System.nanoTime() + 5_000_000_000L
                    while (!sequence.isDone && System.nanoTime() < deadline) pump.pollOne(1)
                    assertTrue(sequence.isDone, "Injection worker timed out")
                    sequence.get()
                    await(0x246); await(0x245); await(0x247)
                    assertEquals(2, seen.first().second.pointers.size)
                    assertEquals(setOf(x, x + 70), seen.first().second.pointers.map { it.position.x }.toSet())
                    assertEquals(setOf(0.5, 1.0), seen.first().second.pointers.map { it.pressure }.toSet())
                    // Drain every pointer of the final frame before leaving the originating message lifetime.
                    repeat(20) { pump.pollOne(1) }
                    failure?.let { throw it }
                    assertEquals(2, ids.size)
                    assertEquals(0L, retained)
                    // The copied values are stable after later messages. Windows may still cache the final
                    // native packet; its lifetime must never be inferred from a successful later query.
                    assertEquals(setOf(x, x + 70), seen.first().second.pointers.map { it.position.x }.toSet())
                }
                }
            }
        }
        assertEquals(0L, retained)
    }

    @Test fun nativePenLayoutKeepsEachSamplesOwnMasks() = Arena.ofConfined().use { arena ->
        val data = arena.allocate(240, 8)
        repeat(2) { index ->
            val p = data.asSlice(index * 120L, 120)
            p.set(ValueLayout.JAVA_INT, 0, 3); p.set(ValueLayout.JAVA_INT, 4, 7)
            p.set(ValueLayout.JAVA_INT, 96, 4); p.set(ValueLayout.JAVA_INT, 100, if (index == 0) 15 else 0)
            p.set(ValueLayout.JAVA_INT, 104, 1024); p.set(ValueLayout.JAVA_INT, 108, 180)
            p.set(ValueLayout.JAVA_INT, 112, -90); p.set(ValueLayout.JAVA_INT, 116, 90)
        }
        val current = Win32PointerPackets.decode(data.asSlice(0, 120), 3)
        val historical = Win32PointerPackets.decode(data.asSlice(120, 120), 3)
        assertTrue(current.eraser); assertEquals(Math.PI, current.twistRadians)
        assertEquals(-90.0, current.tiltX); assertEquals(90.0, current.tiltY)
        assertNull(historical.pressure); assertNull(historical.twistRadians)
    }
}
