@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.engine

import java.util.concurrent.ConcurrentHashMap
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.CallbackRuntimeApi
import org.graphiks.kffi.NativeAddress

/** Route for the closed `SCStreamDelegate` ABI shape: `stream:didStopWithError:`. */
@CallbackRuntimeApi
public fun interface JvmScreenCaptureStreamDelegateRoute {
    public fun dispatch(stream: Long, error: Long)
}

/**
 * Parent-loader bridge for the terminal ScreenCaptureKit stream callback.
 *
 * The route is revoked before its Objective-C receiver is released, so a stream that outlives an
 * isolated consumer classloader cannot retain or invoke that classloader.
 */
@CallbackRuntimeApi
public object JvmScreenCaptureStreamDelegateBridge {
    private val routes: ConcurrentHashMap<Long, JvmScreenCaptureStreamDelegateRoute> = ConcurrentHashMap()

    public val streamDidStop: NativeAddress by lazy {
        JvmUpcallEngine.allocateTrampoline(
            dispatcherClass = JvmScreenCaptureStreamDelegateBridge::class.java,
            dispatchMethod = "dispatchStreamDidStop",
            dispatchSig = "(JJJJ)V",
        )
    }

    public fun install(receiver: Long, route: JvmScreenCaptureStreamDelegateRoute): AutoCloseable {
        require(receiver != 0L) { "ScreenCaptureKit stream delegate receiver must not be null" }
        check(routes.putIfAbsent(receiver, route) == null) {
            "A ScreenCaptureKit stream delegate route already exists for receiver $receiver"
        }
        return AutoCloseable { routes.remove(receiver, route) }
    }

    @JvmStatic
    public fun dispatchStreamDidStop(
        self: Long,
        @Suppress("UNUSED_PARAMETER") command: Long,
        stream: Long,
        error: Long,
    ) {
        try {
            routes[self]?.dispatch(stream, error)
        } catch (failure: Throwable) {
            try {
                CallbackRuntime.reportUnroutedFailure(failure)
            } catch (_: Throwable) {
                // Native callback boundaries must never allow a Kotlin exception to escape.
            }
        }
    }
}
