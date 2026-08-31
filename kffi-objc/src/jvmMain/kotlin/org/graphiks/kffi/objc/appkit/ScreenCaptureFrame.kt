@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.engine.JvmScreenCaptureFrameBridge
import org.graphiks.kffi.objc.CMSampleBufferGetImageBuffer
import org.graphiks.kffi.objc.CVPixelBufferGetBaseAddress
import org.graphiks.kffi.objc.CVPixelBufferGetBaseAddressOfPlane
import org.graphiks.kffi.objc.CVPixelBufferGetBytesPerRow
import org.graphiks.kffi.objc.CVPixelBufferGetBytesPerRowOfPlane
import org.graphiks.kffi.objc.CVPixelBufferGetHeight
import org.graphiks.kffi.objc.CVPixelBufferGetHeightOfPlane
import org.graphiks.kffi.objc.CVPixelBufferGetPlaneCount
import org.graphiks.kffi.objc.CVPixelBufferLockBaseAddress
import org.graphiks.kffi.objc.CVPixelBufferLockFlags
import org.graphiks.kffi.objc.CVPixelBufferUnlockBaseAddress
import org.graphiks.kffi.objc.ObjCSubclassing
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** One Kotlin-owned plane copied from a ScreenCaptureKit frame. */
data class ScreenCapturePlane(
    val bytes: ByteArray,
    val bytesPerRow: Int,
    val height: Int,
)

/**
 * A frame borrowed from a ScreenCaptureKit output callback.
 *
 * The lease is closed automatically when that callback returns. Only [copyPlanes] may be used to
 * retain frame data; it makes detached Kotlin-owned [ByteArray] copies and never exposes a native
 * sample buffer, pixel buffer, IOSurface, pointer, or [java.lang.foreign.MemorySegment].
 */
class ScreenCaptureFrameLease internal constructor(
    private var pixelBuffer: ScreenCapturePixelBuffer?,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var closed = false

    val isClosed: Boolean
        get() = lock.withLock { closed }

    /**
     * Copies every pixel-buffer plane while holding the buffer's read-only lock.
     *
     * [maxBytes] caps the sum of the padded plane sizes (`bytesPerRow * height`) before a native
     * base address is read. The returned byte arrays are detached from the frame lease.
     */
    fun copyPlanes(maxBytes: Int): List<ScreenCapturePlane> = lock.withLock {
        require(maxBytes >= 0) { "maxBytes must not be negative" }
        val activePixelBuffer = checkNotNull(pixelBuffer) { "Screen capture frame lease is closed" }
        activePixelBuffer.lockReadOnly()
        try {
            val count = activePixelBuffer.planeCount().let { if (it == 0) 1 else it }
            val descriptions = ArrayList<PlaneDescription>(count)
            var totalBytes = 0L
            repeat(count) { index ->
                val bytesPerRow = activePixelBuffer.bytesPerRow(index)
                val height = activePixelBuffer.height(index)
                require(bytesPerRow >= 0) { "Pixel buffer bytesPerRow must not be negative" }
                require(height >= 0) { "Pixel buffer height must not be negative" }
                val byteCount = Math.multiplyExact(bytesPerRow.toLong(), height.toLong())
                totalBytes = Math.addExact(totalBytes, byteCount)
                require(totalBytes <= maxBytes.toLong()) {
                    "Screen capture frame requires $totalBytes bytes, exceeding maxBytes=$maxBytes"
                }
                descriptions += PlaneDescription(index, bytesPerRow, height, byteCount.toIntExact())
            }
            descriptions.map { description ->
                ScreenCapturePlane(
                    bytes = activePixelBuffer.copyPlane(description.index, description.byteCount),
                    bytesPerRow = description.bytesPerRow,
                    height = description.height,
                )
            }
        } finally {
            activePixelBuffer.unlock()
        }
    }

    override fun close() {
        lock.withLock {
            if (closed) return
            closed = true
            pixelBuffer = null
        }
    }

    internal companion object {
        fun from(pixelBuffer: ScreenCapturePixelBuffer): ScreenCaptureFrameLease =
            ScreenCaptureFrameLease(pixelBuffer)
    }
}

/** Internal CoreVideo seam; implementations must not retain an unlocked base address. */
internal interface ScreenCapturePixelBuffer {
    fun lockReadOnly()
    fun unlock()
    fun planeCount(): Int
    fun bytesPerRow(index: Int): Int
    fun height(index: Int): Int
    fun copyPlane(index: Int, byteCount: Int): ByteArray
}

private data class PlaneDescription(
    val index: Int,
    val bytesPerRow: Int,
    val height: Int,
    val byteCount: Int,
)

private fun Long.toIntExact(): Int {
    require(this <= Int.MAX_VALUE.toLong()) { "Frame plane is too large for a Kotlin ByteArray" }
    return toInt()
}

/** Internal ScreenCaptureKit output seam; native types remain on the implementation side. */
internal interface ScreenCaptureFrameOutputNative {
    fun attach(delivery: (ScreenCapturePixelBuffer) -> Unit)

    /** Stops future framework deliveries but keeps the route receiver alive for admitted calls. */
    fun detach()


    /** Releases the Objective-C receiver only after the managed delivery gate is quiescent. */
    fun release()
}

/** CoreVideo implementation used only while a ScreenCaptureKit callback is active. */
internal class CoreVideoScreenCapturePixelBuffer(
    private val native: MemorySegment,
) : ScreenCapturePixelBuffer {
    override fun lockReadOnly() {
        check(CVPixelBufferLockBaseAddress(native, CVPixelBufferLockFlags.kCVPixelBufferLock_ReadOnly) == 0) {
            "CVPixelBufferLockBaseAddress failed"
        }
    }

    override fun unlock() {
        check(CVPixelBufferUnlockBaseAddress(native, CVPixelBufferLockFlags(0L)) == 0) {
            "CVPixelBufferUnlockBaseAddress failed"
        }
    }

    override fun planeCount(): Int = CVPixelBufferGetPlaneCount(native).toIntExact()

    override fun bytesPerRow(index: Int): Int = when (planeCount()) {
        0 -> CVPixelBufferGetBytesPerRow(native).toIntExact()
        else -> CVPixelBufferGetBytesPerRowOfPlane(native, index.toLong()).toIntExact()
    }

    override fun height(index: Int): Int = when (planeCount()) {
        0 -> CVPixelBufferGetHeight(native).toIntExact()
        else -> CVPixelBufferGetHeightOfPlane(native, index.toLong()).toIntExact()
    }

    override fun copyPlane(index: Int, byteCount: Int): ByteArray {
        val address = when (planeCount()) {
            0 -> CVPixelBufferGetBaseAddress(native)
            else -> CVPixelBufferGetBaseAddressOfPlane(native, index.toLong())
        }
        check(address != MemorySegment.NULL) { "CVPixelBuffer has no readable base address" }
        return address.reinterpret(byteCount.toLong()).toArray(ValueLayout.JAVA_BYTE)
    }
}

/** Private ScreenCaptureKit adapter; callers never receive its SCStream or output receiver. */
internal class ScreenCaptureKitFrameOutputNative(
    private val stream: MemorySegment,
) : ScreenCaptureFrameOutputNative {
    private var receiver: ScreenCaptureOutputReceiver? = null

    init {
        require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumMacOsMajor) {
            "ScreenCaptureKit frame delivery requires macOS ${ScreenCaptureControlPlanes.minimumMacOsMajor}+"
        }
        ScreenCaptureKitFramework.ensureLoaded()
    }

    override fun attach(delivery: (ScreenCapturePixelBuffer) -> Unit) {
        check(receiver == null) { "ScreenCaptureKit output is already attached" }
        val installedReceiver = ScreenCaptureOutputReceiver.create(delivery)
        try {
            val error = java.lang.foreign.Arena.ofConfined().use { arena ->
                ObjCRuntime.msgSend(
                    ValueLayout.JAVA_BYTE,
                    stream,
                    ObjCRuntime.sel("addStreamOutput:type:sampleHandlerQueue:error:"),
                    installedReceiver.native,
                    0L,
                    MemorySegment.NULL,
                    arena.allocate(ValueLayout.ADDRESS),
                ) as Byte
            }
            check(error.toInt() != 0) { "SCStream rejected the frame output" }
            receiver = installedReceiver
        } catch (failure: Throwable) {
            installedReceiver.close()
            throw failure
        }
    }

    override fun detach() {
        val installedReceiver = receiver ?: return
        ObjCRuntime.msgSend(
            null,
            stream,
            ObjCRuntime.sel("removeStreamOutput:type:"),
            installedReceiver.native,
            0L,
        )
    }

    override fun release() {
        val installedReceiver = receiver ?: return
        receiver = null
        installedReceiver.close()
    }
}

private class ScreenCaptureOutputReceiver private constructor(
    val native: MemorySegment,
    private val route: AutoCloseable,
) : AutoCloseable {
    override fun close() {
        try {
            route.close()
        } finally {
            ObjCRuntime.msgSend(null, native, ObjCRuntime.sel("release"))
        }
    }

    companion object {
        private val nativeClass: MemorySegment by lazy {
            synchronized(this) {
                val name = "KFFIScreenCaptureStreamOutput"
                ObjCRuntime.getClass(name).takeUnless { it == MemorySegment.NULL } ?: run {
                    val allocated = ObjCSubclassing.allocateClass("NSObject", name)
                    check(allocated != MemorySegment.NULL) {
                        "Objective-C runtime could not allocate ScreenCaptureKit output class"
                    }
                    check(
                        ObjCSubclassing.addMethod(
                            allocated,
                            "stream:didOutputSampleBuffer:ofType:",
                            MemorySegment.ofAddress(JvmScreenCaptureFrameBridge.streamOutput.rawValue),
                            "v@:@@q",
                        ),
                    ) { "Objective-C runtime rejected ScreenCaptureKit output method" }
                    check(ObjCSubclassing.addProtocol(allocated, "SCStreamOutput")) {
                        "ScreenCaptureKit SCStreamOutput protocol was unavailable"
                    }
                    ObjCSubclassing.registerClass(allocated)
                    allocated
                }
            }
        }

        fun create(delivery: (ScreenCapturePixelBuffer) -> Unit): ScreenCaptureOutputReceiver {
            val allocated = ObjCRuntime.msgSend(
                ValueLayout.ADDRESS,
                nativeClass,
                ObjCRuntime.sel("alloc"),
            ) as MemorySegment
            val initialized = ObjCRuntime.msgSend(
                ValueLayout.ADDRESS,
                allocated,
                ObjCRuntime.sel("init"),
            ) as MemorySegment
            try {
                val route = JvmScreenCaptureFrameBridge.install(initialized.address()) { _, sampleBuffer, _ ->
                    if (sampleBuffer == 0L) return@install
                    val pixelBuffer = CMSampleBufferGetImageBuffer(MemorySegment.ofAddress(sampleBuffer))
                    if (pixelBuffer != MemorySegment.NULL) {
                        delivery(CoreVideoScreenCapturePixelBuffer(pixelBuffer))
                    }
                }
                return ScreenCaptureOutputReceiver(initialized, route)
            } catch (failure: Throwable) {
                ObjCRuntime.msgSend(null, initialized, ObjCRuntime.sel("release"))
                throw failure
            }
        }
    }
}

/**
 * Owns a ScreenCaptureKit output callback and its callback-scoped leases.
 *
 * Native adapters call [attach] only after their specialized `SCStreamOutput` bridge is ready.
 * Closing first detaches that output, rejects new deliveries, and waits for any other admitted
 * delivery to return. A close re-entered by the active handler cannot wait for itself.
 */
internal class ScreenCaptureFrameOutput private constructor(
    private val native: ScreenCaptureFrameOutputNative,
    handler: (ScreenCaptureFrameLease) -> Unit,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private val quiescent = lock.newCondition()
    private val handler = java.util.concurrent.atomic.AtomicReference(handler)
    private val callbackDepth = ThreadLocal.withInitial { 0 }
    private var closeState = ScreenCaptureFrameOutputCloseState.OPEN
    private var externalFinalizer = false
    private var releaseStarted = false
    private var activeDeliveries = 0

    val isClosed: Boolean
        get() = lock.withLock { closeState == ScreenCaptureFrameOutputCloseState.CLOSED }

    override fun close() {
        val finalizesExternally = lock.withLock {
            when (closeState) {
                ScreenCaptureFrameOutputCloseState.CLOSED -> return
                ScreenCaptureFrameOutputCloseState.CLOSING -> {
                    if (callbackDepth.get() != 0) return
                    while (closeState != ScreenCaptureFrameOutputCloseState.CLOSED) {
                        quiescent.awaitUninterruptibly()
                    }
                    return
                }

                ScreenCaptureFrameOutputCloseState.OPEN -> {
                    closeState = ScreenCaptureFrameOutputCloseState.CLOSING
                    (callbackDepth.get() == 0).also { externalFinalizer = it }
                }
            }
        }
        var failure: Throwable? = null
        try {
            native.detach()
        } catch (detachFailure: Throwable) {
            failure = detachFailure
        }
        if (finalizesExternally) {
            lock.withLock {
                while (activeDeliveries != 0) quiescent.awaitUninterruptibly()
            }
            finalizeTeardown()?.let { releaseFailure ->
                failure?.addSuppressed(releaseFailure) ?: run { failure = releaseFailure }
            }
        }
        failure?.let { throw it }
    }

    private fun deliver(pixelBuffer: ScreenCapturePixelBuffer) {
        val activeHandler = lock.withLock {
            if (closeState != ScreenCaptureFrameOutputCloseState.OPEN) return
            activeDeliveries += 1
            handler.get()
        } ?: return finishDelivery()
        callbackDepth.set(callbackDepth.get() + 1)
        val lease = ScreenCaptureFrameLease.from(pixelBuffer)
        try {
            activeHandler(lease)
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        } finally {
            try {
                lease.close()
            } finally {
                callbackDepth.set(callbackDepth.get() - 1)
                finishDelivery()
            }
        }
    }

    private fun finishDelivery() {
        val finalizesReentrantClose = lock.withLock {
            activeDeliveries -= 1
            check(activeDeliveries >= 0) { "Screen capture delivery admission underflow" }
            if (activeDeliveries == 0) {
                quiescent.signalAll()
                closeState == ScreenCaptureFrameOutputCloseState.CLOSING && !externalFinalizer
            } else {
                false
            }
        }
        if (finalizesReentrantClose) {
            finalizeTeardown()?.let(CallbackRuntime::reportUnroutedFailure)
        }
    }

    private fun finalizeTeardown(): Throwable? {
        val shouldRelease = lock.withLock {
            if (
                closeState != ScreenCaptureFrameOutputCloseState.CLOSING ||
                releaseStarted
            ) {
                false
            } else {
                releaseStarted = true
                true
            }
        }
        if (!shouldRelease) return null

        var failure: Throwable? = null
        try {
            native.release()
        } catch (releaseFailure: Throwable) {
            failure = releaseFailure
        } finally {
            lock.withLock {
                handler.set(null)
                closeState = ScreenCaptureFrameOutputCloseState.CLOSED
                quiescent.signalAll()
            }
        }
        return failure
    }

    internal companion object {
        fun attach(
            native: ScreenCaptureFrameOutputNative,
            handler: (ScreenCaptureFrameLease) -> Unit,
        ): ScreenCaptureFrameOutput {
            lateinit var output: ScreenCaptureFrameOutput
            output = ScreenCaptureFrameOutput(native, handler)
            try {
                native.attach(output::deliver)
                return output
            } catch (failure: Throwable) {
                try {
                    output.close()
                } catch (closeFailure: Throwable) {
                    failure.addSuppressed(closeFailure)
                }
                throw failure
            }
        }
    }
}

private enum class ScreenCaptureFrameOutputCloseState {
    OPEN,
    CLOSING,
    CLOSED,
}
