@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.appkit

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.engine.JvmScreenCaptureStreamDelegateBridge
import org.graphiks.kffi.objc.NSError
import org.graphiks.kffi.objc.ObjCSubclassing
import org.graphiks.kffi.objc.ObjCRuntime

/**
 * Owns the optional `SCStreamDelegate` terminal callback for exactly one stream.
 *
 * The route is withdrawn before the Objective-C receiver is released. Closing from inside the
 * delegate callback defers that release until the callback returns, so an asynchronous AppKit
 * stop cannot call a released JVM receiver.
 */
internal class ScreenCaptureStreamDelegate private constructor(
    val native: MemorySegment,
    private val route: AutoCloseable,
    private val onTerminated: (Throwable?) -> Unit,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private val quiescent = lock.newCondition()
    private val callbackDepth = ThreadLocal.withInitial { 0 }
    private var closing = false
    private var released = false
    private var activeCallbacks = 0

    override fun close() {
        val waitForCallbacks = lock.withLock {
            when {
                released -> return
                closing -> {
                    if (callbackDepth.get() != 0) return
                    while (!released) quiescent.awaitUninterruptibly()
                    return
                }

                else -> {
                    closing = true
                    callbackDepth.get() == 0
                }
            }
        }
        var failure: Throwable? = null
        try {
            route.close()
        } catch (routeFailure: Throwable) {
            failure = routeFailure
        }
        if (waitForCallbacks) {
            lock.withLock {
                while (activeCallbacks != 0) quiescent.awaitUninterruptibly()
            }
            release()?.let { releaseFailure ->
                failure?.addSuppressed(releaseFailure) ?: run { failure = releaseFailure }
            }
        }
        failure?.let { throw it }
    }

    private fun terminated(error: Long) = dispatch {
        onTerminated(
            if (error == 0L) null else NSError(MemorySegment.ofAddress(error)).toCaptureFailure(),
        )
    }

    private fun dispatch(action: () -> Unit) {
        val admitted = lock.withLock {
            if (closing) {
                false
            } else {
                activeCallbacks += 1
                true
            }
        }
        if (!admitted) return
        callbackDepth.set(callbackDepth.get() + 1)
        try {
            action()
        } catch (failure: Throwable) {
            CallbackRuntime.reportUnroutedFailure(failure)
        } finally {
            callbackDepth.set(callbackDepth.get() - 1)
            val releaseAfterCallback = lock.withLock {
                activeCallbacks -= 1
                check(activeCallbacks >= 0) { "ScreenCaptureKit stream delegate callback underflow" }
                if (activeCallbacks == 0) {
                    quiescent.signalAll()
                    closing
                } else {
                    false
                }
            }
            if (releaseAfterCallback) release()?.let(CallbackRuntime::reportUnroutedFailure)
        }
    }

    private fun release(): Throwable? {
        val shouldRelease = lock.withLock {
            if (released) {
                false
            } else {
                released = true
                quiescent.signalAll()
                true
            }
        }
        if (!shouldRelease) return null
        return runCatching {
            ObjCRuntime.msgSend(null, native, ObjCRuntime.sel("release"))
        }.exceptionOrNull()
    }

    internal companion object {
        private val nativeClass: MemorySegment by lazy {
            synchronized(this) {
                val name = "KFFIScreenCaptureStreamDelegate"
                ObjCRuntime.getClass(name).takeUnless { it == MemorySegment.NULL } ?: run {
                    val allocated = ObjCSubclassing.allocateClass("NSObject", name)
                    check(allocated != MemorySegment.NULL) {
                        "Objective-C runtime could not allocate ScreenCaptureKit stream delegate class"
                    }
                    check(
                        ObjCSubclassing.addMethod(
                            allocated,
                            "stream:didStopWithError:",
                            MemorySegment.ofAddress(JvmScreenCaptureStreamDelegateBridge.streamDidStop.rawValue),
                            "v@:@@",
                        ),
                    ) { "Objective-C runtime rejected ScreenCaptureKit stream delegate method" }
                    // ScreenCaptureKit can defer registration of its Objective-C protocol metadata
                    // until a native client declares conformance. Its optional delegate contract is
                    // selector-based, so conformance is opportunistic rather than an admission gate.
                    ObjCSubclassing.addProtocol(allocated, "SCStreamDelegate")
                    ObjCSubclassing.registerClass(allocated)
                    allocated
                }
            }
        }

        fun create(onTerminated: (Throwable?) -> Unit): ScreenCaptureStreamDelegate {
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
                lateinit var delegate: ScreenCaptureStreamDelegate
                val route = JvmScreenCaptureStreamDelegateBridge.install(initialized.address()) { _, error ->
                    delegate.terminated(error)
                }
                delegate = ScreenCaptureStreamDelegate(initialized, route, onTerminated)
                return delegate
            } catch (failure: Throwable) {
                ObjCRuntime.msgSend(null, initialized, ObjCRuntime.sel("release"))
                throw failure
            }
        }
    }
}
