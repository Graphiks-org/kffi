package org.graphiks.kffi.objc.appkit

import java.util.concurrent.atomic.AtomicBoolean
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ScreenCapturePickerResolverTest {
    @Test
    fun closeCancelsThePickerAndSuppressesALateSelection() {
        val native = RecordingScreenCapturePickerNative()
        val results = mutableListOf<Result<ScreenCaptureResolvedTarget>>()
        val request = ScreenCapturePickerResolver.resolve(native, results::add)

        request.close()
        native.select(ScreenCaptureResolvedTarget())

        assertTrue(native.isClosed.get())
        assertEquals(emptyList(), results)
    }

    @Test
    fun forwardsOnlyTheFirstPickerOutcome() {
        val native = RecordingScreenCapturePickerNative()
        val results = mutableListOf<Result<ScreenCaptureResolvedTarget>>()
        ScreenCapturePickerResolver.resolve(native, results::add)

        val selection = ScreenCaptureResolvedTarget()
        native.select(selection)
        native.fail(IllegalStateException("duplicate picker failure"))

        assertTrue(native.isClosed.get())
        assertEquals(listOf(Result.success(selection)), results)
    }

    @Test
    fun synchronousSelectionClosesThePresentationAfterTheCallbackReturns() {
        val selection = ScreenCaptureResolvedTarget()
        val native = SynchronousScreenCapturePickerNative(selection)
        val results = mutableListOf<Result<ScreenCaptureResolvedTarget>>()

        ScreenCapturePickerResolver.resolve(native, results::add)

        assertEquals(listOf(Result.success(selection)), results)
        assertTrue(native.isClosed.get())
    }
}

private class RecordingScreenCapturePickerNative : ScreenCapturePickerNative {
    val isClosed = AtomicBoolean()
    private var callback: ((Result<ScreenCaptureResolvedTarget>) -> Unit)? = null

    override fun present(callback: (Result<ScreenCaptureResolvedTarget>) -> Unit): AutoCloseable {
        this.callback = callback
        return AutoCloseable { isClosed.set(true) }
    }

    fun select(target: ScreenCaptureResolvedTarget) {
        callback?.invoke(Result.success(target))
    }

    fun fail(cause: Throwable) {
        callback?.invoke(Result.failure(cause))
    }
}

private class SynchronousScreenCapturePickerNative(
    private val selection: ScreenCaptureResolvedTarget,
) : ScreenCapturePickerNative {
    val isClosed = AtomicBoolean()

    override fun present(callback: (Result<ScreenCaptureResolvedTarget>) -> Unit): AutoCloseable {
        callback(Result.success(selection))
        return AutoCloseable { isClosed.set(true) }
    }
}
