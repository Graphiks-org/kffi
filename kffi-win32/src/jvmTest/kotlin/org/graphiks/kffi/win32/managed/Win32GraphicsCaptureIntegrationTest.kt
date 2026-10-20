package org.graphiks.kffi.win32.managed

import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.assertTrue
import kotlin.test.assertTrue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

/**
 * Real Windows Graphics Capture on a real managed window: the interop
 * CreateForWindow path, a live FrameArrived callback and a bounded staging
 * copy. Gated like the other integration suites (KFFI_WIN32_INTEGRATION=1,
 * Windows, desktop session).
 */
class Win32GraphicsCaptureIntegrationTest {
    @Test fun liveWindowFramesArriveAsCopiedValues() {
        assumeTrue(System.getProperty("os.name", "").contains("Windows", ignoreCase = true))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
        val capture = Win32GraphicsCapture.forTesting(Win32GraphicsCaptureGeneratedPort)
        assumeTrue(capture.probe(), "no Windows Graphics Capture on this host: honest absence (code 0x" + capture.probeFailureCode.toUInt().toString(16) + ")")

        val frames = java.util.concurrent.ConcurrentLinkedQueue<Win32CaptureFrameValue>()
        val first = CountDownLatch(1)
        val window = Win32ManagedWindow.open("KFFI capture probe") { _, _, _, _ -> 0L }
        try {
            capture.open(window.hwnd, window = true) { value ->
                frames.add(value)
                first.countDown()
            }
            assertTrue(first.await(15, TimeUnit.SECONDS), "no frame arrived within the bounded wait")
            val value = frames.poll()!!
            assertTrue(value.width > 0 && value.height > 0, "non-degenerate frame: ${value.width}x${value.height}")
            assertEquals(value.width * value.height * 4, value.bytes.size, "tightly packed BGRA8 copy")
        } finally {
            capture.close()
            window.close()
        }
    }
}
