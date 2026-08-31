@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import java.util.concurrent.ConcurrentHashMap

/** Route for the closed `SCStreamOutput` ABI shape: `stream:didOutputSampleBuffer:ofType:`. */
@CallbackRuntimeApi
fun interface JvmScreenCaptureFrameRoute {
    fun dispatch(stream: Long, sampleBuffer: Long, outputType: Long)
}

/**
 * Parent-loader bridge for the one ScreenCaptureKit output callback shape used by KFFI.
 *
 * An Objective-C IMP may outlive an isolated consumer classloader, so routes are removed by the
 * owning frame-output adapter before its receiver is released. This bridge deliberately does not
 * expose a generic Objective-C callback factory.
 */
@CallbackRuntimeApi
object JvmScreenCaptureFrameBridge {
    private val routes = ConcurrentHashMap<Long, JvmScreenCaptureFrameRoute>()

    val streamOutput: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmScreenCaptureFrameBridge::class.java,
            dispatchMethod = "dispatchStreamOutput",
            dispatchSig = "(JJJJJ)V",
        )
    }

    fun install(receiver: Long, route: JvmScreenCaptureFrameRoute): AutoCloseable {
        require(receiver != 0L) { "ScreenCaptureKit output receiver must not be null" }
        check(routes.putIfAbsent(receiver, route) == null) {
            "A ScreenCaptureKit output route already exists for receiver $receiver"
        }
        return AutoCloseable { routes.remove(receiver, route) }
    }

    @JvmStatic
    fun dispatchStreamOutput(
        self: Long,
        @Suppress("UNUSED_PARAMETER") command: Long,
        stream: Long,
        sampleBuffer: Long,
        outputType: Long,
    ) {
        try {
            routes[self]?.dispatch(stream, sampleBuffer, outputType)
        } catch (failure: Throwable) {
            try {
                CallbackRuntime.reportUnroutedFailure(failure)
            } catch (_: Throwable) {
                // Native callback boundaries must never allow a Kotlin exception to escape.
            }
        }
    }
}
