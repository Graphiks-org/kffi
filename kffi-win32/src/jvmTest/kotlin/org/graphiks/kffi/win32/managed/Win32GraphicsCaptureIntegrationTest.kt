package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemorySegment
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.graphiks.kffi.win32.generated.IsWindowVisible
import org.graphiks.kffi.win32.generated.ShowWindow

/**
 * Real Windows Graphics Capture on the live desktop: the interop
 * CreateForMonitor/CreateForWindow paths, the free-threaded frame pool, and a
 * bounded staging copy — every frame lands as a scalar-only value. Gated like
 * the other integration suites (KFFI_WIN32_INTEGRATION=1, Windows, desktop).
 */
class Win32GraphicsCaptureIntegrationTest {
    @Test fun liveMonitorFramesArriveAsCopiedValues() {
        begin()
        val capture = Win32GraphicsCapture.forTesting(Win32GraphicsCaptureGeneratedPort)
        assumeTrue(capture.probe(), "no Windows Graphics Capture on this host (0x" + capture.probeFailureCode.toUInt().toString(16) + ")")
        val frames = java.util.concurrent.ConcurrentLinkedQueue<Win32CaptureFrameValue>()
        val first = CountDownLatch(1)
        val window = Win32ManagedWindow.open("KFFI capture monitor anchor") { _, _, _, _ -> 0L }
        try {
            val hmon = org.graphiks.kffi.win32.generated.MonitorFromWindow(MemorySegment.ofAddress(window.hwnd), 1)
            capture.open(hmon.address(), window = false) { value -> frames.add(value); first.countDown() }
            assertTrue(first.await(15, TimeUnit.SECONDS), "no monitor frame within the bounded wait")
            val value = frames.poll()!!
            assertTrue(value.width > 0 && value.height > 0, "non-degenerate frame")
            assertEquals(value.width * value.height * 4, value.bytes.size, "tightly packed BGRA8 copy")
        } finally {
            capture.close()
            window.close()
        }
    }

    @Test fun liveWindowFramesArriveOnceTheWindowIsVisible() {
        begin()
        val capture = Win32GraphicsCapture.forTesting(Win32GraphicsCaptureGeneratedPort)
        assumeTrue(capture.probe(), "no Windows Graphics Capture on this host (0x" + capture.probeFailureCode.toUInt().toString(16) + ")")
        val window = Win32ManagedWindow.open("KFFI capture window probe") { _, _, _, _ -> 0L }
        try {
            ShowWindow(MemorySegment.ofAddress(window.hwnd), 5) // SW_SHOW
            assumeTrue(IsWindowVisible(MemorySegment.ofAddress(window.hwnd)) != 0, "window never became visible")
            val frames = java.util.concurrent.ConcurrentLinkedQueue<Win32CaptureFrameValue>()
            val first = CountDownLatch(1)
            capture.open(window.hwnd, window = true) { value -> frames.add(value); first.countDown() }
            assertTrue(first.await(15, TimeUnit.SECONDS), "no window frame within the bounded wait")
            val value = frames.poll()!!
            assertTrue(value.width > 0 && value.height > 0, "non-degenerate frame")
            assertEquals(value.width * value.height * 4, value.bytes.size, "tightly packed BGRA8 copy")
        } finally {
            capture.close()
            window.close()
        }
    }

    private fun begin() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }
}
