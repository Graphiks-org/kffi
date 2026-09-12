package org.graphiks.kffi.objc.appkit

import java.util.concurrent.atomic.AtomicBoolean
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ScreenCaptureSourceEnumeratorTest {
    @Test
    fun closeCancelsDiscoveryAndSuppressesALateCatalog() {
        val native = RecordingScreenCaptureSourceNative()
        val results = mutableListOf<ScreenCaptureSourceEnumerationResult>()
        val request = ScreenCaptureSourceEnumerator.enumerate(native, results::add)

        request.close()
        native.complete(Result.success(sampleCatalog()))

        assertTrue(native.isCancelled.get())
        assertEquals(emptyList(), results)
    }

    @Test
    fun firstCompletionPublishesTheDetachedCatalogExactlyOnce() {
        val native = RecordingScreenCaptureSourceNative()
        val results = mutableListOf<ScreenCaptureSourceEnumerationResult>()
        ScreenCaptureSourceEnumerator.enumerate(native, results::add)

        val catalog = sampleCatalog()
        native.complete(Result.success(catalog))
        native.complete(Result.failure(IllegalStateException("duplicate native completion")))

        assertEquals<List<ScreenCaptureSourceEnumerationResult>>(
            listOf(ScreenCaptureSourceEnumerationResult.Enumerated(catalog)),
            results,
        )
    }
}

private class RecordingScreenCaptureSourceNative : ScreenCaptureSourceNative {
    val isCancelled = AtomicBoolean()
    private var callback: ((Result<ScreenCaptureSourceCatalog>) -> Unit)? = null

    override fun enumerate(callback: (Result<ScreenCaptureSourceCatalog>) -> Unit): AutoCloseable {
        this.callback = callback
        return AutoCloseable { isCancelled.set(true) }
    }

    fun complete(result: Result<ScreenCaptureSourceCatalog>) {
        callback?.invoke(result)
    }
}

private fun sampleCatalog(): ScreenCaptureSourceCatalog = ScreenCaptureSourceCatalog(
    displays = listOf(
        ScreenCaptureDisplaySource(
            id = 42L,
            pixelWidth = 1920,
            pixelHeight = 1080,
            bounds = ScreenCaptureSourceBounds(0.0, 0.0, 1920.0, 1080.0),
        ),
    ),
    windows = listOf(
        ScreenCaptureWindowSource(
            id = 7L,
            title = "Terminal",
            owner = ScreenCaptureApplication("Terminal", "com.apple.Terminal", 501),
            bounds = ScreenCaptureSourceBounds(5.0, 8.0, 900.0, 600.0),
            layer = 0L,
            isOnScreen = true,
        ),
    ),
)
