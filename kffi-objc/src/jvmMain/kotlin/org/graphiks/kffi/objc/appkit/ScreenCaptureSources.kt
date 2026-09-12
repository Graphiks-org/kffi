package org.graphiks.kffi.objc.appkit

import java.util.concurrent.atomic.AtomicBoolean

/** Detached ScreenCaptureKit source inventory; it never retains an Objective-C object. */
data class ScreenCaptureSourceCatalog(
    val displays: List<ScreenCaptureDisplaySource>,
    val windows: List<ScreenCaptureWindowSource>,
)

/** One display reported by ScreenCaptureKit. [pixelWidth] and [pixelHeight] are native pixels. */
data class ScreenCaptureDisplaySource(
    val id: Long,
    val pixelWidth: Int,
    val pixelHeight: Int,
    val bounds: ScreenCaptureSourceBounds,
) {
    init {
        require(id >= 0) { "display id must be non-negative" }
        require(pixelWidth > 0) { "display pixelWidth must be positive" }
        require(pixelHeight > 0) { "display pixelHeight must be positive" }
    }
}

/** One window reported by ScreenCaptureKit. [owner] is absent when the framework reports none. */
data class ScreenCaptureWindowSource(
    val id: Long,
    val title: String?,
    val owner: ScreenCaptureApplication?,
    val bounds: ScreenCaptureSourceBounds,
    val layer: Long,
    val isOnScreen: Boolean,
) {
    init {
        require(id >= 0) { "window id must be non-negative" }
    }
}

/** Detached process metadata observed for a captureable window. */
data class ScreenCaptureApplication(
    val name: String?,
    val bundleIdentifier: String?,
    val processId: Int,
) {
    init {
        require(processId >= 0) { "process id must be non-negative" }
    }
}

/** Source bounds in the coordinate system reported by ScreenCaptureKit. */
data class ScreenCaptureSourceBounds(
    val x: Double,
    val y: Double,
    val width: Double,
    val height: Double,
) {
    init {
        require(x.isFinite() && y.isFinite()) { "source origin must be finite" }
        require(width.isFinite() && height.isFinite()) { "source size must be finite" }
        require(width >= 0.0 && height >= 0.0) { "source size must not be negative" }
    }
}

/** Terminal result of one explicit ScreenCaptureKit source enumeration. */
sealed interface ScreenCaptureSourceEnumerationResult {
    data class Enumerated(val catalog: ScreenCaptureSourceCatalog) : ScreenCaptureSourceEnumerationResult

    data class Failed(val cause: Throwable) : ScreenCaptureSourceEnumerationResult
}

/** Result of an explicit system Screen Recording access request. */
sealed interface ScreenCapturePermissionRequestResult {
    data object Granted : ScreenCapturePermissionRequestResult

    data object Denied : ScreenCapturePermissionRequestResult

    data class Failed(val cause: Throwable) : ScreenCapturePermissionRequestResult
}

/** Internal seam for the explicit TCC request. */
internal fun interface ScreenCaptureAccessNative {
    fun requestAccess(): Boolean
}

internal object ScreenCapturePermissionRequester {
    fun request(native: ScreenCaptureAccessNative): ScreenCapturePermissionRequestResult = try {
        if (native.requestAccess()) {
            ScreenCapturePermissionRequestResult.Granted
        } else {
            ScreenCapturePermissionRequestResult.Denied
        }
    } catch (failure: Throwable) {
        ScreenCapturePermissionRequestResult.Failed(failure)
    }
}

/**
 * Internal native seam. The returned handle cancels a pending enumeration; a native completion
 * owns its own one-shot callback resources once it has been delivered.
 */
internal interface ScreenCaptureSourceNative {
    fun enumerate(callback: (Result<ScreenCaptureSourceCatalog>) -> Unit): AutoCloseable
}

/** Serializes explicit enumeration completion against caller cancellation. */
internal object ScreenCaptureSourceEnumerator {
    fun enumerate(
        native: ScreenCaptureSourceNative,
        callback: (ScreenCaptureSourceEnumerationResult) -> Unit,
    ): AutoCloseable {
        val terminal = AtomicBoolean()
        val nativeRequest = native.enumerate { result ->
            if (!terminal.compareAndSet(false, true)) return@enumerate
            callback(
                result.fold(
                    onSuccess = ScreenCaptureSourceEnumerationResult::Enumerated,
                    onFailure = ScreenCaptureSourceEnumerationResult::Failed,
                ),
            )
        }
        return AutoCloseable {
            if (terminal.compareAndSet(false, true)) nativeRequest.close()
        }
    }
}
