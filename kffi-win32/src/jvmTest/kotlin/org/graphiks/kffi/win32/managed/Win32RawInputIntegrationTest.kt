package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference
import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.graphiks.kffi.win32.generated.GetForegroundWindow
import org.graphiks.kffi.win32.generated.PeekMessageW
import org.graphiks.kffi.win32.generated.SendInput
import org.graphiks.kffi.win32.generated.ShowWindow
import org.graphiks.kffi.win32.generated.TranslateMessage
import org.graphiks.kffi.win32.generated.DispatchMessageW
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.*

class Win32RawInputIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun realRegistrationDeliversInjectedRelativeMotionAndRefusesASecondRegistration() {
        init()
        assertFalse(Win32RawInput.hasRegistration(), "the test process must start without a raw-input registration")
        val ownerReference = AtomicReference<Win32RawInput?>(null)
        val motions = CopyOnWriteArrayList<Win32RawMotion>()
        window(ownerReference, motions).use { window ->
            val failures = CopyOnWriteArrayList<Throwable>()
            var owner: Win32RawInput? = null
            try {
                owner = Win32RawInput.register(window.hwnd, { deltaX, deltaY, device -> motions += Win32RawMotion(deltaX, deltaY, device) },
                    { failures += it })
                ownerReference.set(owner)
                assertTrue(Win32RawInput.hasRegistration())

                // Foreground-only registration: the injected motion reaches the registered
                // window only while it is the foreground window. A background process cannot
                // call SetForegroundWindow; the minimize/restore round-trip activates the
                // process's own window without the foreground lock.
                org.graphiks.kffi.win32.generated.ShowWindow(MemorySegment.ofAddress(window.hwnd), SW_MINIMIZE)
                org.graphiks.kffi.win32.generated.ShowWindow(MemorySegment.ofAddress(window.hwnd), SW_RESTORE)
                val deadlineForeground = System.nanoTime() + TimeUnit.SECONDS.toNanos(2)
                while (org.graphiks.kffi.win32.generated.GetForegroundWindow().address() != window.hwnd &&
                    System.nanoTime() < deadlineForeground
                ) {
                    Thread.sleep(50)
                }
                check(org.graphiks.kffi.win32.generated.GetForegroundWindow().address() == window.hwnd) {
                    "the test window could not become the foreground window"
                }

                // A second registration over the same process usage is refused, never stolen.
                val second = assertFailsWith<Win32RawInputException> {
                    Win32RawInput.register(window.hwnd, { _, _, _ -> }, {})
                }
                assertEquals(Win32RawInputException.ALREADY_REGISTERED, second.code)

                injectRelativeMotion(5, 3)
                val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5)
                while (motions.isEmpty() && System.nanoTime() < deadline) pumpOne()
                assertTrue(failures.isEmpty(), "no native failure expected: $failures")
                val motion = motions.singleOrNull()
                assertNotNull(motion, "one relative motion must reach the registered window, got $motions")
                // SendInput relative motion crosses the host pointer-acceleration settings, so
                // the delivered counts are the accelerated ones, not the injected literals;
                // count fidelity against a raw payload is proven by Win32RawInputTest.
                assertTrue(motion.deltaX != 0 || motion.deltaY != 0, "the motion must carry non-zero deltas: $motion")
            } finally {
                owner?.close()
                ownerReference.set(null)
            }
            assertTrue(failures.isEmpty(), "no native failure expected at teardown: $failures")
            // RIDEV_REMOVE is refused by the OS for the mouse usage (documented limit):
            // the single process-lifetime registration persists after close.
            assertTrue(Win32RawInput.hasRegistration(), "the process-lifetime registration persists after close")
        }
    }

    private fun window(
        ownerReference: AtomicReference<Win32RawInput?>,
        motions: CopyOnWriteArrayList<Win32RawMotion>,
    ) = Win32ManagedWindow.open("Raw input services") { h, m, w, l ->
        if (m == Win32RawInputFlags.WM_INPUT) ownerReference.get()?.read(l)?.let(motions::add)
        DefWindowProcW(MemorySegment.ofAddress(h), m, w, l)
    }

    private fun pumpOne(): Boolean {
        Arena.ofConfined().use { arena ->
            val message = Win32Structs.msg.allocate(arena)
            if (PeekMessageW(message, MemorySegment.NULL, 0, 0, PM_REMOVE) == 0) {
                Thread.sleep(10)
                return false
            }
            TranslateMessage(message)
            DispatchMessageW(message)
            return true
        }
    }

    private fun injectRelativeMotion(deltaX: Int, deltaY: Int) {
        Arena.ofConfined().use { arena ->
            val input = arena.allocate(INPUT_BYTE_SIZE, 8)
            input.set(ValueLayout.JAVA_INT, INPUT_TYPE_OFFSET, 0) // INPUT_MOUSE
            input.set(ValueLayout.JAVA_INT, MOUSE_DX_OFFSET, deltaX)
            input.set(ValueLayout.JAVA_INT, MOUSE_DY_OFFSET, deltaY)
            input.set(ValueLayout.JAVA_INT, MOUSE_FLAGS_OFFSET, MOUSEEVENTF_MOVE)
            check(SendInput(1, input, INPUT_BYTE_SIZE.toInt()) == 1) { "SendInput failed" }
        }
    }

    companion object {
        private const val PM_REMOVE: Int = 0x1
        private const val MOUSEEVENTF_MOVE: Int = 0x0001
        private const val SW_MINIMIZE: Int = 6
        private const val SW_RESTORE: Int = 9

        // Win64 INPUT: DWORD type; pad(4); union { MOUSEINPUT } at 8.
        // MOUSEINPUT: LONG dx; LONG dy; WORD mouseData; pad(2); DWORD dwFlags; DWORD time; pad(4); ULONG_PTR dwExtraInfo.
        private const val INPUT_BYTE_SIZE: Long = 40
        private const val INPUT_TYPE_OFFSET: Long = 0
        private const val MOUSE_DX_OFFSET: Long = 8
        private const val MOUSE_DY_OFFSET: Long = 12
        private const val MOUSE_FLAGS_OFFSET: Long = 20
    }
}
