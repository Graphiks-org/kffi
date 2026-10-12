package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.IsWindow
import org.graphiks.kffi.win32.generated.PostMessageW
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Win32ControlWindowIntegrationTest {
    @Test
    fun injectedTestMessageIsDispatchedExactlyOnceThenWindowClosesIdempotently() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Windows") == true,
            "Win32 integration tests require Windows",
        )
        assumeTrue(
            System.getenv("KFFI_WIN32_INTEGRATION") == "1",
            "Set KFFI_WIN32_INTEGRATION=1 to run the Win32 integration tests",
        )

        init()
        val dispatches = CopyOnWriteArrayList<Long>()
        val window = Win32ControlWindow.open { _, message, wParam, _ ->
            assertEquals(Win32ControlWindow.TEST_MESSAGE, message)
            dispatches.add(wParam)
            0L
        }
        try {
            assertTrue(window.hwnd != 0L)
            assertEquals(
                1,
                PostMessageW(
                    MemorySegment.ofAddress(window.hwnd),
                    Win32ControlWindow.TEST_MESSAGE,
                    777L,
                    42L,
                ),
                "PostMessageW must queue the test message",
            )
            val deadline = System.currentTimeMillis() + 5_000
            while (System.currentTimeMillis() < deadline && dispatches.isEmpty()) {
                window.pollOne(50)
            }
            assertEquals(listOf(777L), dispatches, "exactly-once delivery required")
            window.close()
            window.close() // idempotent
            assertEquals(
                0,
                IsWindow(MemorySegment.ofAddress(window.hwnd)),
                "the control window must be destroyed",
            )
        } finally {
            window.close()
        }
    }
}
