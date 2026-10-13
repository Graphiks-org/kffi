@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.CreateWindowExW
import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.graphiks.kffi.win32.generated.DestroyWindow
import org.graphiks.kffi.win32.generated.GetModuleHandleW
import org.graphiks.kffi.win32.generated.IsWindow
import org.graphiks.kffi.win32.generated.PostMessageW
import org.graphiks.kffi.win32.generated.ShowWindow
import org.graphiks.kffi.win32.generated.RegisterClassExW
import org.graphiks.kffi.win32.generated.init
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * Managed top-level window (WS_OVERLAPPEDWINDOW) for real windowed sessions.
 * Opened hidden; [setVisible] shows it. `WM_CLOSE` is delivered to the
 * handler — the consumer owns the close decision. Thread-confined to the
 * creating thread. Close order: route unregistered before `DestroyWindow`,
 * so a reused address never reaches a revoked owner.
 */
public class Win32ManagedWindow private constructor(
    public val hwnd: Long,
    private val function: Win32WndProcFunction,
    private val routeRegistration: AutoCloseable,
) : AutoCloseable {
    public companion object {
        private const val CLASS_NAME: String = "KadreWin32Window"
        private const val WS_OVERLAPPEDWINDOW: Int = 0x00CF0000
        private const val SW_SHOW: Int = 5
        private const val SW_HIDE: Int = 0
        public const val WM_CLOSE: Int = 0x0010

        public fun open(title: String, handler: Win32WndProcHandler): Win32ManagedWindow {
            check(isSupported()) {
                "Win32 windows require Windows; this platform (" +
                    System.getProperty("os.name") + ") is unsupported — no native library was loaded."
            }
            init()
            // Every message is delivered to the consumer handler; unhandled
            // messages fall through to the native default behavior.
            val function = Win32ManagedFunctions.wndProc { hwnd, message, wParam, lParam ->
                handler.onMessage(hwnd, message, wParam, lParam)
            }
            try {
                val hwnd = createWindow(function, title)
                return Win32ManagedWindow(hwnd, function, hwndRouteHandle(function, hwnd))
            } catch (failure: Throwable) {
                runCatching { function.close() }
                throw failure
            }
        }

        internal fun isSupported(): Boolean =
            System.getProperty("os.name", "").startsWith("Windows", ignoreCase = true)

        internal fun hwndRouteHandle(function: Win32WndProcFunction, hwnd: Long): AutoCloseable =
            Win32WndProcBridge.registerRoute(hwnd, function.route)

        private fun createWindow(function: Win32WndProcFunction, title: String): Long {
            Arena.ofConfined().use { arena ->
                val clazz = Win32Structs.wndClassExW.allocate(arena)
                val className = wideString(arena, CLASS_NAME)
                val titleName = wideString(arena, title)
                Win32Structs.wndClassExW.setCbSize(clazz, Win32Structs.wndClassExW.byteSize.toInt())
                Win32Structs.wndClassExW.setStyle(clazz, 0)
                Win32Structs.wndClassExW.setLpfnWndProc(clazz, function.callback.rawValue)
                Win32Structs.wndClassExW.setHInstance(clazz, GetModuleHandleW(MemorySegment.NULL).address())
                Win32Structs.wndClassExW.setLpszClassName(clazz, className.address())
                RegisterClassExW(clazz)
                val creation = Win32WndProcBridge.beginCreation(function.route)
                try {
                    val window = CreateWindowExW(
                        0,
                        className,
                        titleName,
                        WS_OVERLAPPEDWINDOW,
                        0,
                        0,
                        800,
                        600,
                        MemorySegment.NULL,
                        MemorySegment.NULL,
                        MemorySegment.NULL,
                        MemorySegment.NULL,
                    )
                    val hwnd = window.address()
                    check(hwnd != 0L) { "CreateWindowExW failed for the Kadre window" }
                    return hwnd
                } finally {
                    creation.close()
                }
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

    public fun setVisible(visible: Boolean) {
        checkIsWindow()
        ShowWindow(MemorySegment.ofAddress(hwnd), if (visible) SW_SHOW else SW_HIDE)
    }

    /** Posts `WM_CLOSE` to the window: the handler owns the close decision. */
    public fun requestClose() {
        checkIsWindow()
        PostMessageW(MemorySegment.ofAddress(hwnd), WM_CLOSE, 0L, 0L)
    }

    internal fun dispatchUnhandled(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long =
        DefWindowProcW(MemorySegment.ofAddress(hwnd), message, wParam, lParam)

    override fun close() {
        closeLock.withLock {
            if (closed) return
            closed = true
        }
        // Route unregistered before the native destroy: a reused address
        // never reaches a revoked owner.
        routeRegistration.close()
        if (hwnd != 0L && IsWindow(MemorySegment.ofAddress(hwnd)) != 0) {
            DestroyWindow(MemorySegment.ofAddress(hwnd))
        }
        function.close()
    }

    private fun checkIsWindow() {
        check(!isClosed) { "the managed window is closed" }
        check(IsWindow(MemorySegment.ofAddress(hwnd)) != 0) { "the native window is destroyed" }
    }
}
