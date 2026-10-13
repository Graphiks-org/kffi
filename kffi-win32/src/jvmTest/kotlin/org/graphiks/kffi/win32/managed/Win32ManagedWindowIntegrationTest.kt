package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.graphiks.kffi.win32.generated.IsWindow
import org.graphiks.kffi.win32.generated.PeekMessageW
import org.graphiks.kffi.win32.generated.PostMessageW
import org.graphiks.kffi.win32.generated.TranslateMessage
import org.graphiks.kffi.win32.generated.DispatchMessageW
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.graphiks.kffi.win32.managed.Win32Structs
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Win32ManagedWindowIntegrationTest {
    @Test
    fun threeTopLevelWindowsOpenReceiveCloseAndDestroyIdempotently() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Windows") == true,
            "Win32 integration tests require Windows",
        )
        assumeTrue(
            System.getenv("KFFI_WIN32_INTEGRATION") == "1",
            "Set KFFI_WIN32_INTEGRATION=1 to run the Win32 integration tests",
        )

        init()
        val closes = CopyOnWriteArrayList<String>()
        // Every non-close message must reach DefWindowProcW with its ORIGINAL
        // wParam/lParam: WM_NCCREATE carries the CREATESTRUCT pointer in lParam
        // and zeroes abort window creation.
        // `second` refuses its WM_CLOSE (record + return 0, no DefWindowProcW):
        // the consumer owns the close decision, so the window stays alive.
        val first = Win32ManagedWindow.open("kadre-p2-first") { hwnd, message, wParam, lParam ->
            if (message == Win32ManagedWindow.WM_CLOSE) closes.add("close:$hwnd")
            DefWindowProc(hwnd, message, wParam, lParam)
        }
        val second = Win32ManagedWindow.open("kadre-p2-second") { hwnd, message, wParam, lParam ->
            if (message == Win32ManagedWindow.WM_CLOSE) {
                closes.add("refused:$hwnd")
                0L
            } else {
                DefWindowProc(hwnd, message, wParam, lParam)
            }
        }
        val third = Win32ManagedWindow.open("kadre-p2-third") { hwnd, message, wParam, lParam ->
            if (message == Win32ManagedWindow.WM_CLOSE) closes.add("close:$hwnd")
            DefWindowProc(hwnd, message, wParam, lParam)
        }
        try {
            assertTrue(first.hwnd != second.hwnd && second.hwnd != third.hwnd)
            assertTrue(IsWindow(MemorySegment.ofAddress(first.hwnd)) != 0)
            assertTrue(IsWindow(MemorySegment.ofAddress(second.hwnd)) != 0)
            assertTrue(IsWindow(MemorySegment.ofAddress(third.hwnd)) != 0)
            second.requestClose()
            // The test pumps its own thread queue exactly like the session
            // pump does in production: the refusing handler receives the
            // WM_CLOSE, returns 0, and the window stays alive.
            pumpUntil { closes.contains("refused:${second.hwnd}") }
            assertTrue(
                IsWindow(MemorySegment.ofAddress(second.hwnd)) != 0,
                "a refused WM_CLOSE leaves the window alive",
            )
            first.close()
            first.close() // idempotent
            assertEquals(
                0,
                IsWindow(MemorySegment.ofAddress(first.hwnd)),
                "the closed window must be destroyed",
            )
            third.close()
            assertEquals(0, IsWindow(MemorySegment.ofAddress(third.hwnd)))
        } finally {
            runCatching { second.close() }
            runCatching { third.close() }
        }
        assertTrue(closes.contains("close:") || closes.contains("refused:"), "WM_CLOSE must reach handlers")
    }

    private fun DefWindowProc(hwnd: Long, message: Int, wParam: Long, lParam: Long): Long =
        org.graphiks.kffi.win32.generated.DefWindowProcW(MemorySegment.ofAddress(hwnd), message, wParam, lParam)

    private fun pumpUntil(condition: () -> Boolean) {
        val deadline = System.currentTimeMillis() + 2_000
        Arena.ofConfined().use { arena ->
            while (System.currentTimeMillis() < deadline && !condition()) {
                val message = Win32Structs.msg.allocate(arena)
                if (PeekMessageW(message, MemorySegment.NULL, 0, 0, PM_REMOVE) != 0) {
                    TranslateMessage(message)
                    DispatchMessageW(message)
                } else {
                    Thread.sleep(10)
                }
            }
        }
    }

    private companion object {
        private const val PM_REMOVE: Int = 0x1
    }
}
