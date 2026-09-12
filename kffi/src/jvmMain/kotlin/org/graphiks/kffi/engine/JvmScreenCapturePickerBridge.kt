@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress
import java.util.concurrent.ConcurrentHashMap

/** Routes the three closed `SCContentSharingPickerObserver` callback shapes. */
@CallbackRuntimeApi
interface JvmScreenCapturePickerRoute {
    fun didCancel(picker: Long, stream: Long)

    fun didUpdate(picker: Long, filter: Long, stream: Long)

    fun didFail(error: Long)
}

/**
 * Parent-loader bridge for `SCContentSharingPickerObserver` callbacks.
 *
 * The bridge is specific to ScreenCaptureKit's picker protocol. It does not turn the managed
 * layer into an unbounded Objective-C callback factory.
 */
@CallbackRuntimeApi
object JvmScreenCapturePickerBridge {
    private val routes = ConcurrentHashMap<Long, JvmScreenCapturePickerRoute>()

    val didCancel: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmScreenCapturePickerBridge::class.java,
            dispatchMethod = "dispatchDidCancel",
            dispatchSig = "(JJJJ)V",
        )
    }

    val didUpdate: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmScreenCapturePickerBridge::class.java,
            dispatchMethod = "dispatchDidUpdate",
            dispatchSig = "(JJJJJ)V",
        )
    }

    val startDidFail: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmScreenCapturePickerBridge::class.java,
            dispatchMethod = "dispatchStartDidFail",
            dispatchSig = "(JJJ)V",
        )
    }

    fun install(receiver: Long, route: JvmScreenCapturePickerRoute): AutoCloseable {
        require(receiver != 0L) { "ScreenCaptureKit picker observer receiver must not be null" }
        check(routes.putIfAbsent(receiver, route) == null) {
            "A ScreenCaptureKit picker route already exists for receiver $receiver"
        }
        return AutoCloseable { routes.remove(receiver, route) }
    }

    @JvmStatic
    fun dispatchDidCancel(
        self: Long,
        @Suppress("UNUSED_PARAMETER") command: Long,
        picker: Long,
        stream: Long,
    ) {
        contain { routes[self]?.didCancel(picker, stream) }
    }

    @JvmStatic
    fun dispatchDidUpdate(
        self: Long,
        @Suppress("UNUSED_PARAMETER") command: Long,
        picker: Long,
        filter: Long,
        stream: Long,
    ) {
        contain { routes[self]?.didUpdate(picker, filter, stream) }
    }

    @JvmStatic
    fun dispatchStartDidFail(
        self: Long,
        @Suppress("UNUSED_PARAMETER") command: Long,
        error: Long,
    ) {
        contain { routes[self]?.didFail(error) }
    }

    private inline fun contain(block: () -> Unit) {
        try {
            block()
        } catch (failure: Throwable) {
            try {
                CallbackRuntime.reportUnroutedFailure(failure)
            } catch (_: Throwable) {
                // Native callback boundaries must never allow a Kotlin exception to escape.
            }
        }
    }
}
