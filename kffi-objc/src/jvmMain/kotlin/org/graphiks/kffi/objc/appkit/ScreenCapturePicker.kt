@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.engine.JvmScreenCapturePickerBridge
import org.graphiks.kffi.engine.JvmScreenCapturePickerRoute
import org.graphiks.kffi.objc.NSError
import org.graphiks.kffi.objc.ObjCSubclassing
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.SCContentFilter
import org.graphiks.kffi.objc.SCContentSharingPicker
import org.graphiks.kffi.objc.managed.ObjCManagedRuntime
import org.graphiks.kffi.objc.managed.ObjCStrongRef
import org.graphiks.kffi.objc.managed.retainStrong
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Internal host-picker seam. Completion yields one resolved capture target or a terminal error. */
internal interface ScreenCapturePickerNative {
    fun present(callback: (Result<ScreenCaptureResolvedTarget>) -> Unit): AutoCloseable
}

/** Serializes host-picker completion against caller cancellation. */
internal object ScreenCapturePickerResolver {
    fun resolve(
        native: ScreenCapturePickerNative,
        callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
    ): AutoCloseable {
        val lock = ReentrantLock()
        var terminal = false
        var presentation: AutoCloseable? = null
        val complete: (Result<ScreenCaptureResolvedTarget>) -> Unit = complete@ { result ->
            val (shouldDeliver, toClose) = lock.withLock {
                if (terminal) {
                    false to null
                } else {
                    terminal = true
                    true to presentation.also { presentation = null }
                }
            }
            if (!shouldDeliver) return@complete
            try {
                callback(result)
            } finally {
                toClose?.close()
            }
        }

        val installedPresentation = native.present(complete)
        val closeAfterSynchronousCompletion = lock.withLock {
            if (terminal) {
                installedPresentation
            } else {
                presentation = installedPresentation
                null
            }
        }
        closeAfterSynchronousCompletion?.close()

        return AutoCloseable {
            val toClose = lock.withLock {
                if (terminal) {
                    null
                } else {
                    terminal = true
                    presentation.also { presentation = null }
                }
            }
            toClose?.close()
        }
    }
}

/** macOS 14 host-picker adapter; it resolves a retained picker filter before creating a stream. */
internal object AppKitScreenCapturePickerNative : ScreenCaptureNative {
    override fun resolve(
        target: ScreenCaptureTarget,
        callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
    ): AutoCloseable {
        check(target == ScreenCaptureTarget.HostPicker) {
            "ScreenCaptureKit host picker received a non-picker target"
        }
        return ScreenCapturePickerResolver.resolve(AppKitScreenCapturePickerPresentationNative, callback)
    }

    override fun open(
        target: ScreenCaptureResolvedTarget,
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
        onTerminated: (Throwable?) -> Unit,
    ): ScreenCaptureNativeStream = AppKitScreenCaptureNative.open(
        target,
        configuration,
        onFrame,
        onTerminated,
    )
}

private object AppKitScreenCapturePickerPresentationNative : ScreenCapturePickerNative {
    override fun present(callback: (Result<ScreenCaptureResolvedTarget>) -> Unit): AutoCloseable =
        AppKitScreenCapturePickerPresentation.open(callback)
}

/** Owns one registered picker observer until its first terminal picker outcome or cancellation. */
private class AppKitScreenCapturePickerPresentation private constructor(
    private val observer: AppKitScreenCapturePickerObserver,
) : AutoCloseable {
    override fun close() = observer.close()

    companion object {
        fun open(
            callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
        ): AppKitScreenCapturePickerPresentation {
            val picker = SCContentSharingPicker(
                requireNotNullObject(
                    SCContentSharingPicker.sharedPicker(),
                    "SCContentSharingPicker.sharedPicker",
                ),
            )
            val observer = AppKitScreenCapturePickerObserver.create(
                picker = picker,
                onCancelled = {
                    callback(Result.failure(ScreenCapturePickerCancelled()))
                },
                onUpdated = { filter ->
                    callback(
                        runCatching {
                            ResolvedPickerFilter(SCContentFilter(MemorySegment.ofAddress(filter)).retainStrong())
                        },
                    )
                },
                onFailed = { error ->
                    callback(
                        Result.failure(
                            if (error == 0L) {
                                ScreenCaptureKitFailure(null, null, "ScreenCaptureKit host picker failed")
                            } else {
                                NSError(MemorySegment.ofAddress(error)).toCaptureFailure()
                            },
                        ),
                    )
                },
            )
            try {
                picker.addObserver(observer.native)
                picker.present()
                return AppKitScreenCapturePickerPresentation(observer)
            } catch (failure: Throwable) {
                try {
                    observer.close()
                } catch (closeFailure: Throwable) {
                    failure.addSuppressed(closeFailure)
                }
                throw failure
            }
        }
    }
}

/** Transfers exactly one explicit retain of a picker-provided filter into the stream owner. */
private class ResolvedPickerFilter(
    private var filter: ObjCStrongRef<SCContentFilter>?,
) : AppKitResolvedTarget() {
    override fun createFilter(): OwnedObjC<SCContentFilter> {
        val retained = checkNotNull(filter) { "ScreenCaptureKit picker filter is closed" }
        filter = null
        return OwnedObjC(retained.value)
    }

    override fun close() {
        filter?.close()
        filter = null
    }
}

/** Terminal cancellation is distinct from an AppKit/TCC failure for the managed session result. */
internal class ScreenCapturePickerCancelled : IllegalStateException("ScreenCaptureKit host picker was cancelled")

/**
 * Native `SCContentSharingPickerObserver` receiver with callback-safe release.
 *
 * Closing removes the observer and revokes its JVM route first. A close re-entered by a picker
 * callback defers the Objective-C `release` until that callback returns.
 */
private class AppKitScreenCapturePickerObserver private constructor(
    private val picker: SCContentSharingPicker,
    val native: MemorySegment,
    private val route: AutoCloseable,
    private val onCancelled: () -> Unit,
    private val onUpdated: (Long) -> Unit,
    private val onFailed: (Long) -> Unit,
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
            picker.removeObserver(native)
        } catch (removeFailure: Throwable) {
            failure = removeFailure
        }
        try {
            route.close()
        } catch (routeFailure: Throwable) {
            failure?.addSuppressed(routeFailure) ?: run { failure = routeFailure }
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

    private fun cancelled() = dispatch(onCancelled)

    private fun updated(filter: Long) {
        if (filter == 0L) {
            failed(0L)
        } else {
            dispatch { onUpdated(filter) }
        }
    }

    private fun failed(error: Long) = dispatch { onFailed(error) }

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
        } finally {
            callbackDepth.set(callbackDepth.get() - 1)
            val releaseAfterCallback = lock.withLock {
                activeCallbacks -= 1
                check(activeCallbacks >= 0) { "ScreenCaptureKit picker callback admission underflow" }
                if (activeCallbacks == 0) {
                    quiescent.signalAll()
                    closing
                } else {
                    false
                }
            }
            if (releaseAfterCallback) release()?.let { throw it }
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
        return runCatching { ObjCManagedRuntime.release(native) }.exceptionOrNull()
    }

    companion object {
        private val nativeClass: MemorySegment by lazy {
            synchronized(this) {
                val className = "KFFIScreenCapturePickerObserver"
                ObjCRuntime.getClass(className).takeUnless { it == MemorySegment.NULL } ?: run {
                    val allocated = ObjCSubclassing.allocateClass("NSObject", className)
                    check(allocated != MemorySegment.NULL) {
                        "Objective-C runtime could not allocate ScreenCaptureKit picker observer class"
                    }
                    check(
                        ObjCSubclassing.addMethod(
                            allocated,
                            "contentSharingPicker:didCancelForStream:",
                            MemorySegment.ofAddress(JvmScreenCapturePickerBridge.didCancel.rawValue),
                            "v@:@@",
                        ),
                    ) { "Objective-C runtime rejected ScreenCaptureKit picker cancellation method" }
                    check(
                        ObjCSubclassing.addMethod(
                            allocated,
                            "contentSharingPicker:didUpdateWithFilter:forStream:",
                            MemorySegment.ofAddress(JvmScreenCapturePickerBridge.didUpdate.rawValue),
                            "v@:@@@",
                        ),
                    ) { "Objective-C runtime rejected ScreenCaptureKit picker update method" }
                    check(
                        ObjCSubclassing.addMethod(
                            allocated,
                            "contentSharingPickerStartDidFailWithError:",
                            MemorySegment.ofAddress(JvmScreenCapturePickerBridge.startDidFail.rawValue),
                            "v@:@",
                        ),
                    ) { "Objective-C runtime rejected ScreenCaptureKit picker failure method" }
                    check(ObjCSubclassing.addProtocol(allocated, "SCContentSharingPickerObserver")) {
                        "ScreenCaptureKit SCContentSharingPickerObserver protocol was unavailable"
                    }
                    ObjCSubclassing.registerClass(allocated)
                    allocated
                }
            }
        }

        fun create(
            picker: SCContentSharingPicker,
            onCancelled: () -> Unit,
            onUpdated: (Long) -> Unit,
            onFailed: (Long) -> Unit,
        ): AppKitScreenCapturePickerObserver {
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
                lateinit var observer: AppKitScreenCapturePickerObserver
                val route = JvmScreenCapturePickerBridge.install(
                    initialized.address(),
                    object : JvmScreenCapturePickerRoute {
                        override fun didCancel(picker: Long, stream: Long) = observer.cancelled()

                        override fun didUpdate(picker: Long, filter: Long, stream: Long) = observer.updated(filter)

                        override fun didFail(error: Long) = observer.failed(error)
                    },
                )
                observer = AppKitScreenCapturePickerObserver(
                    picker = picker,
                    native = initialized,
                    route = route,
                    onCancelled = onCancelled,
                    onUpdated = onUpdated,
                    onFailed = onFailed,
                )
                return observer
            } catch (failure: Throwable) {
                ObjCManagedRuntime.release(initialized)
                throw failure
            }
        }
    }
}
