package org.graphiks.kffi.objc.appkit

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class ScreenCaptureFrameLeaseTest {
    @Test
    fun copiesPlanarFramesAsDetachedBytesAndUnlocks() {
        val native = RecordingPixelBuffer(
            planes = listOf(byteArrayOf(1, 2, 3, 4), byteArrayOf(5, 6)),
            bytesPerRows = listOf(2, 2),
            heights = listOf(2, 1),
        )
        val lease = ScreenCaptureFrameLease.from(native)

        val copies = lease.copyPlanes(maxBytes = 6)

        assertEquals(2, copies.size)
        assertContentEquals(byteArrayOf(1, 2, 3, 4), copies[0].bytes)
        assertContentEquals(byteArrayOf(5, 6), copies[1].bytes)
        assertEquals(2, copies[0].bytesPerRow)
        assertEquals(2, copies[0].height)
        assertEquals(listOf("lock", "copy:0", "copy:1", "unlock"), native.calls)
        native.planes[0][0] = 99
        assertContentEquals(byteArrayOf(1, 2, 3, 4), copies[0].bytes)
    }

    @Test
    fun rejectsTotalPaddingSizeBeforeReadingAnyPlaneAndStillUnlocks() {
        val native = RecordingPixelBuffer(
            planes = listOf(byteArrayOf(1, 2, 3, 4), byteArrayOf(5, 6, 7, 8)),
            bytesPerRows = listOf(4, 4),
            heights = listOf(1, 1),
        )
        val lease = ScreenCaptureFrameLease.from(native)

        assertFailsWith<IllegalArgumentException> { lease.copyPlanes(maxBytes = 7) }

        assertEquals(listOf("lock", "unlock"), native.calls)
        assertEquals(0, native.copyCalls)
    }

    @Test
    fun copiesNonPlanarFrameThroughTheSingleBaseAddress() {
        val native = RecordingPixelBuffer(
            planes = listOf(byteArrayOf(9, 8, 7, 6, 5, 4)),
            bytesPerRows = listOf(3),
            heights = listOf(2),
            planar = false,
        )

        val copies = ScreenCaptureFrameLease.from(native).copyPlanes(maxBytes = 6)

        assertEquals(1, copies.size)
        assertContentEquals(byteArrayOf(9, 8, 7, 6, 5, 4), copies.single().bytes)
        assertEquals(listOf("lock", "copy:0", "unlock"), native.calls)
    }

    @Test
    fun unlocksWhenCopyFails() {
        val native = RecordingPixelBuffer(
            planes = listOf(byteArrayOf(1, 2)),
            bytesPerRows = listOf(2),
            heights = listOf(1),
            copyFailure = IllegalStateException("copy failed"),
        )

        assertFailsWith<IllegalStateException> {
            ScreenCaptureFrameLease.from(native).copyPlanes(maxBytes = 2)
        }

        assertEquals(listOf("lock", "copy:0", "unlock"), native.calls)
    }

    @Test
    fun closeIsIdempotentAndRejectsUseAfterClose() {
        val lease = ScreenCaptureFrameLease.from(
            RecordingPixelBuffer(listOf(byteArrayOf(1)), listOf(1), listOf(1)),
        )

        lease.close()
        lease.close()

        assertTrue(lease.isClosed)
        assertFailsWith<IllegalStateException> { lease.copyPlanes(maxBytes = 1) }
    }

    @Test
    fun aSecondDeliveryGetsANewLeaseAfterTheFirstLeaseHasClosed() {
        val native = RecordingFrameOutputNative()
        val received = mutableListOf<ScreenCaptureFrameLease>()
        val output = ScreenCaptureFrameOutput.attach(native, received::add)

        try {
            native.emit(RecordingPixelBuffer(listOf(byteArrayOf(1)), listOf(1), listOf(1)))
            native.emit(RecordingPixelBuffer(listOf(byteArrayOf(2)), listOf(1), listOf(1)))

            assertEquals(2, received.size)
            assertTrue(received[0].isClosed)
            assertTrue(received[1].isClosed)
            assertFailsWith<IllegalStateException> { received[0].copyPlanes(maxBytes = 1) }
            assertFailsWith<IllegalStateException> { received[1].copyPlanes(maxBytes = 1) }
        } finally {
            output.close()
        }
    }

    @Test
    fun deliveryClosesTheLeaseAfterTheHandlerAndContainsHandlerFailures() {
        val native = RecordingFrameOutputNative()
        lateinit var escaped: ScreenCaptureFrameLease
        val output = ScreenCaptureFrameOutput.attach(native) { lease ->
            escaped = lease
            assertContentEquals(byteArrayOf(7), lease.copyPlanes(maxBytes = 1).single().bytes)
            throw IllegalStateException("observer failed")
        }

        native.emit(RecordingPixelBuffer(listOf(byteArrayOf(7)), listOf(1), listOf(1)))

        assertTrue(escaped.isClosed)
        assertFailsWith<IllegalStateException> { escaped.copyPlanes(maxBytes = 1) }
        output.close()
        output.close()
        assertEquals(listOf("attach", "detach", "release"), native.calls)
    }

    @Test
    fun closeDetachesThenWaitsForAnAlreadyAdmittedDelivery() {
        val native = RecordingFrameOutputNative()
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val output = ScreenCaptureFrameOutput.attach(native) {
            entered.countDown()
            resume.await(5, TimeUnit.SECONDS)
        }
        val executor = Executors.newFixedThreadPool(3)

        try {
            val delivery = executor.submit {
                native.emit(RecordingPixelBuffer(listOf(byteArrayOf(1)), listOf(1), listOf(1)))
            }
            assertTrue(entered.await(5, TimeUnit.SECONDS))
            val close = executor.submit { output.close() }

            assertFailsWith<java.util.concurrent.TimeoutException> {
                close.get(250, TimeUnit.MILLISECONDS)
            }
            assertEquals(listOf("attach", "detach"), native.calls)
            resume.countDown()
            delivery.get(5, TimeUnit.SECONDS)
            close.get(5, TimeUnit.SECONDS)
            assertEquals(listOf("attach", "detach", "release"), native.calls)
        } finally {
            resume.countDown()
            output.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun concurrentExternalCloseWaitsForTheSameQuiescentRelease() {
        val native = RecordingFrameOutputNative()
        val entered = CountDownLatch(1)
        val resume = CountDownLatch(1)
        val output = ScreenCaptureFrameOutput.attach(native) {
            entered.countDown()
            resume.await(5, TimeUnit.SECONDS)
        }
        val executor = Executors.newFixedThreadPool(3)

        try {
            val delivery = executor.submit {
                native.emit(RecordingPixelBuffer(listOf(byteArrayOf(1)), listOf(1), listOf(1)))
            }
            assertTrue(entered.await(5, TimeUnit.SECONDS))
            val firstClose = executor.submit { output.close() }
            assertTrue(native.detached.await(5, TimeUnit.SECONDS))
            val secondClose = executor.submit { output.close() }

            assertFailsWith<java.util.concurrent.TimeoutException> {
                secondClose.get(250, TimeUnit.MILLISECONDS)
            }
            assertEquals(listOf("attach", "detach"), native.calls)

            resume.countDown()
            delivery.get(5, TimeUnit.SECONDS)
            firstClose.get(5, TimeUnit.SECONDS)
            secondClose.get(5, TimeUnit.SECONDS)
            assertEquals(listOf("attach", "detach", "release"), native.calls)
        } finally {
            resume.countDown()
            output.close()
            executor.shutdownNow()
        }
    }

    @Test
    fun reentrantCloseDefersReceiverReleaseUntilTheHandlerReturns() {
        val native = RecordingFrameOutputNative()
        lateinit var output: ScreenCaptureFrameOutput
        output = ScreenCaptureFrameOutput.attach(native) {
            output.close()
            assertEquals(listOf("attach", "detach"), native.calls)
        }

        native.emit(RecordingPixelBuffer(listOf(byteArrayOf(1)), listOf(1), listOf(1)))

        assertTrue(output.isClosed)
        assertEquals(listOf("attach", "detach", "release"), native.calls)
    }
}

private class RecordingPixelBuffer(
    val planes: List<ByteArray>,
    private val bytesPerRows: List<Int>,
    private val heights: List<Int>,
    private val planar: Boolean = true,
    private val copyFailure: Throwable? = null,
) : ScreenCapturePixelBuffer {
    val calls = mutableListOf<String>()
    var copyCalls = 0

    override fun lockReadOnly() {
        calls += "lock"
    }

    override fun unlock() {
        calls += "unlock"
    }

    override fun planeCount(): Int = if (planar) planes.size else 0

    override fun bytesPerRow(index: Int): Int = bytesPerRows[index]

    override fun height(index: Int): Int = heights[index]

    override fun copyPlane(index: Int, byteCount: Int): ByteArray {
        calls += "copy:$index"
        copyCalls += 1
        copyFailure?.let { throw it }
        return planes[index].copyOf(byteCount)
    }
}

private class RecordingFrameOutputNative : ScreenCaptureFrameOutputNative {
    val calls = mutableListOf<String>()
    val detached = CountDownLatch(1)
    private var delivery: ((ScreenCapturePixelBuffer) -> Unit)? = null

    override fun attach(delivery: (ScreenCapturePixelBuffer) -> Unit) {
        calls += "attach"
        this.delivery = delivery
    }

    override fun detach() {
        calls += "detach"
        detached.countDown()
        delivery = null
    }

    override fun release() {
        calls += "release"
    }

    fun emit(pixelBuffer: ScreenCapturePixelBuffer) {
        delivery?.invoke(pixelBuffer)
    }
}
