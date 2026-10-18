package org.graphiks.kffi.win32.testsupport

import org.graphiks.kffi.win32.generated.*
import org.graphiks.kffi.win32.managed.*
import java.lang.foreign.*
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference

/** Controlled native input for Windows integration tests only. Never calls a receiver with forged pointer IDs. */
public object Win32InjectedTouchHarness {
    public data class Contact(public val id: Int, public val x: Int, public val y: Int, public val flags: Int)
    public const val DOWN: Int = 0x10006
    public const val MOVE: Int = 0x20006
    public const val UP: Int = 0x40000

    public class Emitter internal constructor(private val x: Int, private val y: Int, private val maximum: Int,
        private val targetHwnd: Long, private val maxX: Int, private val maxY: Int) {
        private val active = mutableMapOf<Int, Contact>()
        private var first = true
        public fun frame(vararg contacts: Contact) {
            require(contacts.size in 1..maximum && contacts.map { it.id }.toSet().size == contacts.size)
            require(contacts.all { it.id in 0 until maximum && it.x in 0..maxX && it.y in 0..maxY })
            if (!first) Thread.sleep(16)
            first = false
            Arena.ofConfined().use { arena ->
                val buffer = arena.allocate(contacts.size * 144L, 8)
                contacts.forEachIndexed { index, contact ->
                    val p = buffer.asSlice(index * 144L, 144)
                    p.set(ValueLayout.JAVA_INT, 0, 2); p.set(ValueLayout.JAVA_INT, 4, contact.id)
                    p.set(ValueLayout.JAVA_INT, 12, contact.flags)
                    p.set(ValueLayout.JAVA_INT, 32, x + contact.x); p.set(ValueLayout.JAVA_INT, 36, y + contact.y)
                    p.set(ValueLayout.JAVA_INT, 100, 5)
                    p.set(ValueLayout.JAVA_INT, 104, x + contact.x - 2); p.set(ValueLayout.JAVA_INT, 108, y + contact.y - 2)
                    p.set(ValueLayout.JAVA_INT, 112, x + contact.x + 2); p.set(ValueLayout.JAVA_INT, 116, y + contact.y + 2)
                    p.set(ValueLayout.JAVA_INT, 140, 512)
                    if (contact.flags and 0x10000 != 0) {
                        val actual = WindowFromPoint(p.asSlice(32, 8)).address()
                        check(actual == targetHwnd) { "Touch DOWN target differs: expected=$targetHwnd actual=$actual xy=${x+contact.x},${y+contact.y} capture=${GetCapture().address()}" }
                    }
                }
                var result = InjectTouchInput(contacts.size, buffer)
                var error = if(result == 0) GetLastError() else 0
                var retry = 0
                while (result == 0 && error == 21 && retry++ < 10) {
                    Thread.sleep(1); result = InjectTouchInput(contacts.size, buffer); error = if(result == 0) GetLastError() else 0
                }
                check(result != 0) { "Native touch injection failed: $error" }
            }
            contacts.forEach { if(it.flags and 0x40000 != 0) active.remove(it.id) else active[it.id] = it }
        }
        internal fun finish() { if(active.isNotEmpty()) frame(*active.values.map { it.copy(flags=UP) }.toTypedArray()) }
    }

    public fun run(maxPointers: Int = 2, onFrame: (Win32PointerBatch) -> Unit, sequence: Emitter.() -> Unit) {
        require(maxPointers in 1..10)
        val failure = AtomicReference<Throwable?>()
        var forwardFrames = false
        val retained = AtomicLong()
        val budget = Win32PayloadBudget { bytes ->
            val total = retained.addAndGet(bytes)
            if(total > 4 * 1024 * 1024L) { retained.addAndGet(-bytes); null }
            else AutoCloseable { retained.addAndGet(-bytes) }
        }
        Win32ManagedWindow.open("native-touch-fixture") { hwnd, message, w, l ->
            if(message in 0x245..0x247) {
                try { if (forwardFrames) Win32PointerPackets.read((w and 65535).toInt(), maxPointers, 128, budget).use(onFrame) }
                catch(problem: Throwable) { failure.compareAndSet(null, problem) }
                0
            } else when (message) {
                // Selectively passing a pointer stream to DefWindowProc has undefined promotion semantics.
                0x249, 0x24a, 0x24c -> 0L
                0x24b -> 1L // PA_ACTIVATE for the first contact on an inactive test window.
                else -> DefWindowProcW(MemorySegment.ofAddress(hwnd), message, w, l)
            }
        }.use { window ->
            val hwnd = MemorySegment.ofAddress(window.hwnd)
            check(SetWindowPos(hwnd, MemorySegment.NULL, 10, 10, 800, 650, 0x14) != 0)
            window.setVisible(true); Win32WindowOperations.setTopmost(window.hwnd, true)
            prepareForeground(window.hwnd, maxPointers)
            forwardFrames = true
            drive(window.hwnd, maxPointers, sequence)
        }
        failure.get()?.let { throw it }
        check(retained.get() == 0L) { "Native touch fixture retained a frame" }
    }

    /** Drives a visible, uncovered HWND after foreground/focus readback. Its owner must keep pumping. */
    public fun drive(targetHwnd: Long, maxPointers: Int = 2, sequence: Emitter.() -> Unit) {
        driveSequence(targetHwnd, maxPointers, true, sequence)
    }

    /**
     * Explicit setup before installing test collectors/handlers. May deliver a DOWN/UP pair to
     * activate the target when Windows denies a background SetForegroundWindow request.
     */
    public fun prepareForeground(targetHwnd: Long, maxPointers: Int = 2) {
        val hwnd = MemorySegment.ofAddress(targetHwnd)
        if (GetForegroundWindow().address() == targetHwnd && GetFocus().address() == targetHwnd) return
        SetForegroundWindow(hwnd)
        if (GetForegroundWindow().address() != targetHwnd || GetFocus().address() != targetHwnd) {
            driveSequence(targetHwnd, maxPointers, false) {
                frame(Contact(0, 0, 0, DOWN)); frame(Contact(0, 0, 0, UP))
            }
            SetForegroundWindow(hwnd)
        }
        Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
            val deadline = System.nanoTime() + 3_000_000_000L
            while ((GetForegroundWindow().address() != targetHwnd || GetFocus().address() != targetHwnd) &&
                System.nanoTime() < deadline) pump.pollOne(1)
        }
        check(GetForegroundWindow().address() == targetHwnd && GetFocus().address() == targetHwnd) {
            "Native touch setup could not establish foreground/focus"
        }
    }

    private fun driveSequence(targetHwnd: Long, maxPointers: Int, requireForeground: Boolean, sequence: Emitter.() -> Unit) {
        require(maxPointers in 1..10)
        val hwnd = MemorySegment.ofAddress(targetHwnd)
        check(IsWindowVisible(hwnd) != 0) { "Native touch target is not visible" }
            Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
                val activated = !requireForeground || GetForegroundWindow().address() == targetHwnd || SetForegroundWindow(hwnd) != 0
                val focusDeadline = System.nanoTime() + 3_000_000_000L
                while (requireForeground && (GetForegroundWindow().address() != targetHwnd || GetFocus().address() != targetHwnd) &&
                    System.nanoTime() < focusDeadline) pump.pollOne(1)
                check(!requireForeground || (GetForegroundWindow().address() == targetHwnd && GetFocus().address() == targetHwnd)) {
                    "Native touch foreground prerequisite failed: requested=$activated foregroundMatches=${GetForegroundWindow().address() == targetHwnd} focusMatches=${GetFocus().address() == targetHwnd}"
                }
                Arena.ofConfined().use { arena ->
                    val point = arena.allocate(8, 4)
                    point.set(ValueLayout.JAVA_INT, 0, 80); point.set(ValueLayout.JAVA_INT, 4, 80)
                    check(ClientToScreen(hwnd, point) != 0)
                    val deadline = System.nanoTime() + 3_000_000_000L
                    while(WindowFromPoint(point).address() != targetHwnd && System.nanoTime() < deadline) pump.pollOne(1)
                    check(WindowFromPoint(point).address() == targetHwnd) { "Native touch fixture is covered" }
                    val x = point.get(ValueLayout.JAVA_INT, 0); val y = point.get(ValueLayout.JAVA_INT, 4)
                    val client = arena.allocate(16, 4)
                    check(GetClientRect(hwnd, client) != 0)
                    val maxX = minOf(600, client.get(ValueLayout.JAVA_INT, 8) - 81)
                    val maxY = minOf(400, client.get(ValueLayout.JAVA_INT, 12) - 81)
                    check(maxX >= 0 && maxY >= 0) { "Native touch test client is too small" }
                    Executors.newSingleThreadExecutor().use { worker ->
                        val task = worker.submit {
                            check(InitializeTouchInjection(maxPointers, 3) != 0)
                            val emitter = Emitter(x, y, maxPointers, targetHwnd, maxX, maxY)
                            try { emitter.sequence() } finally { emitter.finish() }
                        }
                        val stop = System.nanoTime() + 10_000_000_000L
                        while(!task.isDone && System.nanoTime() < stop) pump.pollOne(1)
                        check(task.isDone) { "Native touch sequence timed out" }
                        task.get()
                        repeat(30) { pump.pollOne(1) }
                    }
                }
            }
    }
}
