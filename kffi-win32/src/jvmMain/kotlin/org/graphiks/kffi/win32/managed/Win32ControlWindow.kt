package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.CreateWindowExW
import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.graphiks.kffi.win32.generated.DestroyWindow
import org.graphiks.kffi.win32.generated.DispatchMessageW
import org.graphiks.kffi.win32.generated.GetModuleHandleW
import org.graphiks.kffi.win32.generated.IsWindow
import org.graphiks.kffi.win32.generated.PeekMessageW
import org.graphiks.kffi.win32.generated.RegisterClassExW
import org.graphiks.kffi.win32.generated.TranslateMessage
import org.graphiks.kffi.win32.generated.init
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * Never-shown control window (WS_POPUP, no ShowWindow) proving the native
 * frontier. Never a public Kadre window. Thread-confined: open, pollOne and
 * close must run on the creating thread.
 */
public class Win32ControlWindow private constructor(
    public val hwnd: Long,
    private val function: Win32WndProcFunction,
) : AutoCloseable {
    public companion object {
        public const val TEST_MESSAGE: Int = 0x8001 // WM_APP + 1
        private const val CLASS_NAME: String = "KadreWin32ControlWindow"
        private const val WS_POPUP: Int = -0x80000000 // 0x80000000, cf. the existing integration test
        private const val PM_REMOVE: Int = 0x1

        public fun isSupported(): Boolean =
            System.getProperty("os.name", "").startsWith("Windows", ignoreCase = true)

        public fun open(handler: Win32WndProcHandler): Win32ControlWindow {
            check(isSupported()) {
                "Win32 control windows require Windows; this platform (" +
                    System.getProperty("os.name") + ") is unsupported — no native library was loaded."
            }
            init()
            val function = Win32ManagedFunctions.wndProc { hwnd, message, wParam, lParam ->
                if (message == TEST_MESSAGE) handler.onMessage(hwnd, message, wParam, lParam)
                else DefWindowProcW(MemorySegment.ofAddress(hwnd), message, wParam, lParam)
            }
            try {
                val hwnd = createControlWindow(function)
                return Win32ControlWindow(hwnd, function)
            } catch (failure: Throwable) {
                runCatching { function.close() }
                throw failure
            }
        }

        private fun createControlWindow(function: Win32WndProcFunction): Long {
            Arena.ofConfined().use { arena ->
                val clazz = Win32Structs.wndClassExW.allocate(arena)
                val name = wideString(arena, CLASS_NAME)
                Win32Structs.wndClassExW.setCbSize(clazz, Win32Structs.wndClassExW.byteSize.toInt())
                Win32Structs.wndClassExW.setStyle(clazz, 0)
                Win32Structs.wndClassExW.setLpfnWndProc(clazz, function.callback.rawValue)
                Win32Structs.wndClassExW.setHInstance(clazz, GetModuleHandleW(MemorySegment.NULL).address())
                Win32Structs.wndClassExW.setLpszClassName(clazz, name.address())
                // ERROR_CLASS_ALREADY_EXISTS (1410) is tolerated: the class is reused.
                RegisterClassExW(clazz)
                val window = CreateWindowExW(
                    0,
                    name,
                    name,
                    WS_POPUP, // never shown: no ShowWindow call
                    0,
                    0,
                    0,
                    0,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                    MemorySegment.NULL,
                )
                val hwnd = window.address()
                check(hwnd != 0L) { "CreateWindowExW failed for the Kadre control window" }
                return hwnd
            }
        }

        private fun wideString(arena: Arena, value: String): MemorySegment {
            val result = arena.allocate(
                (value.length + 1L) * ValueLayout.JAVA_CHAR.byteSize(),
                ValueLayout.JAVA_CHAR.byteAlignment(),
            )
            value.forEachIndexed { index, character ->
                result.set(ValueLayout.JAVA_CHAR, index.toLong() * ValueLayout.JAVA_CHAR.byteSize(), character)
            }
            result.set(ValueLayout.JAVA_CHAR, value.length.toLong() * ValueLayout.JAVA_CHAR.byteSize(), '\u0000')
            return result
        }
    }

    private val closeLock = ReentrantLock()

    @Volatile
    private var closed = false

    public val isClosed: Boolean
        get() = closeLock.withLock { closed }

    /**
     * Drains at most one available message (PeekMessageW PM_REMOVE), sleeping
     * once for [timeoutMillis] when the queue is empty. True when a message
     * was dispatched.
     */
    public fun pollOne(timeoutMillis: Long): Boolean {
        Arena.ofConfined().use { arena ->
            val message = Win32Structs.msg.allocate(arena)
            if (PeekMessageW(message, MemorySegment.NULL, 0, 0, PM_REMOVE) == 0) {
                if (timeoutMillis > 0) Thread.sleep(timeoutMillis)
                if (PeekMessageW(message, MemorySegment.NULL, 0, 0, PM_REMOVE) == 0) return false
            }
            TranslateMessage(message)
            DispatchMessageW(message)
            return true
        }
    }

    override fun close() {
        closeLock.withLock {
            if (closed) return
            closed = true
        }
        if (hwnd != 0L && IsWindow(MemorySegment.ofAddress(hwnd)) != 0) {
            DestroyWindow(MemorySegment.ofAddress(hwnd))
        }
        // The registration owns revocation + quiescence: no native support is
        // released before in-flight deliveries have returned.
        function.close()
    }
}
