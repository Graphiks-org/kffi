@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.objc.CGDisplayRegisterReconfigurationCallback
import org.graphiks.kffi.objc.CGDisplayRemoveReconfigurationCallback
import org.graphiks.kffi.objc.CGError
import org.graphiks.kffi.objc.managed.ManagedCFunction
import org.graphiks.kffi.objc.managed.ManagedCFunctions
import org.graphiks.kffi.objc.managed.displayReconfigurationNativeHandle
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Detached data delivered when CoreGraphics changes its display configuration. */
data class CGDisplayReconfiguration(
    val displayId: Int,
    val flags: Long,
)

/**
 * Observes CoreGraphics display reconfiguration without exposing callback or pointer storage.
 *
 * [close] is idempotent. It revokes JVM handler admission before unregistering the native
 * callback, so no event beginning after [close] can reach [handler].
 */
class CGDisplayReconfigurationObserver internal constructor(
    private val native: DisplayReconfigurationNative,
    handler: (CGDisplayReconfiguration) -> Unit,
) : AutoCloseable {
    constructor(handler: (CGDisplayReconfiguration) -> Unit) :
        this(CoreGraphicsDisplayReconfigurationNative, handler)

    private val lock = ReentrantLock()
    private var handler: ((CGDisplayReconfiguration) -> Unit)? = handler
    private var activeDeliveries = 0
    private var closed = false
    private val registration = native.register(::deliver)

    val isClosed: Boolean
        get() = lock.withLock { closed }

    override fun close() {
        val toClose = lock.withLock {
            if (closed) return
            closed = true
            handler = null
            registration
        }
        toClose.close()
    }

    private fun deliver(event: CGDisplayReconfiguration) {
        val admitted = lock.withLock {
            val current = handler ?: return
            activeDeliveries += 1
            current
        }
        try {
            admitted(event)
        } finally {
            lock.withLock { activeDeliveries -= 1 }
        }
    }
}

/** Internal seam for deterministic observer lifetime tests. */
internal interface DisplayReconfigurationNative {
    fun register(listener: (CGDisplayReconfiguration) -> Unit): AutoCloseable
}

private object CoreGraphicsDisplayReconfigurationNative : DisplayReconfigurationNative {
    override fun register(listener: (CGDisplayReconfiguration) -> Unit): AutoCloseable {
        val callback = ManagedCFunctions.displayReconfiguration { displayId, flags ->
            try {
                listener(CGDisplayReconfiguration(displayId = displayId, flags = flags.rawValue))
            } catch (failure: Throwable) {
                CallbackRuntime.reportUnroutedFailure(failure)
            }
        }
        val nativeHandle = callback.displayReconfigurationNativeHandle()
        try {
            checkSuccess("CGDisplayRegisterReconfigurationCallback") {
                CGDisplayRegisterReconfigurationCallback(nativeHandle.callback, nativeHandle.userdata)
            }
        } catch (failure: Throwable) {
            try {
                callback.close()
            } catch (closeFailure: Throwable) {
                failure.addSuppressed(closeFailure)
            }
            throw failure
        }
        return CoreGraphicsDisplayReconfigurationRegistration(callback, nativeHandle.callback, nativeHandle.userdata)
    }
}

private class CoreGraphicsDisplayReconfigurationRegistration(
    private val callback: ManagedCFunction,
    private val callbackAddress: java.lang.foreign.MemorySegment,
    private val userdata: java.lang.foreign.MemorySegment,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var closed = false

    override fun close() {
        lock.withLock {
            if (closed) return
            closed = true
        }
        var failure: Throwable? = null
        failure = captureFailure(failure) {
            checkSuccess("CGDisplayRemoveReconfigurationCallback") {
                CGDisplayRemoveReconfigurationCallback(callbackAddress, userdata)
            }
        }
        failure = captureFailure(failure) { callback.close() }
        failure?.let { throw it }
    }
}

private inline fun checkSuccess(operation: String, call: () -> CGError) {
    val result = call()
    check(result == CGError.kCGErrorSuccess) {
        "$operation failed with ${result.name} (${result.value})"
    }
}

private inline fun captureFailure(
    existing: Throwable?,
    action: () -> Unit,
): Throwable? = try {
    action()
    existing
} catch (failure: Throwable) {
    if (existing == null) failure else existing.apply { addSuppressed(failure) }
}
