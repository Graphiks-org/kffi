@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.CGRequestScreenCaptureAccess
import org.graphiks.kffi.objc.NSError
import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.SCContentFilter
import org.graphiks.kffi.objc.SCDisplay
import org.graphiks.kffi.objc.SCRunningApplication
import org.graphiks.kffi.objc.SCShareableContent
import org.graphiks.kffi.objc.SCStream
import org.graphiks.kffi.objc.SCStreamConfiguration
import org.graphiks.kffi.objc.SCWindow
import org.graphiks.kffi.objc.managed.ObjCManagedBlock
import org.graphiks.kffi.objc.managed.ObjCManagedBlockSetter
import org.graphiks.kffi.objc.managed.ObjCManagedRuntime
import org.graphiks.kffi.objc.managed.ObjCStrongRef
import org.graphiks.kffi.objc.managed.retainStrong
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference

/**
 * Pointer-free ScreenCaptureKit entry point for macOS 13 and newer.
 *
 * [onOpened] is invoked exactly once with either a managed session or a failure. Once opened,
 * [onStopped] reports the completion of a requested stop. Frames remain callback-scoped; callers
 * must copy pixels during [onFrame] if they need to retain them.
 */
object ScreenCaptureKitCaptures {
    /** Explicitly requests the system-wide Screen Recording permission on macOS 13 and newer. */
    fun requestPermission(): ScreenCapturePermissionRequestResult {
        require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumMacOsMajor) {
            "ScreenCaptureKit capture requires macOS ${ScreenCaptureControlPlanes.minimumMacOsMajor}+"
        }
        return ScreenCapturePermissionRequester.request(::CGRequestScreenCaptureAccess)
    }

    /**
     * Explicitly enumerates currently shareable sources. Closing the returned owner suppresses a
     * late completion; this operation never starts a stream or presents a picker.
     */
    fun enumerateSources(
        callback: (ScreenCaptureSourceEnumerationResult) -> Unit,
    ): AutoCloseable {
        require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumMacOsMajor) {
            "ScreenCaptureKit source enumeration requires macOS ${ScreenCaptureControlPlanes.minimumMacOsMajor}+"
        }
        ScreenCaptureKitFramework.ensureLoaded()
        return ScreenCaptureSourceEnumerator.enumerate(AppKitScreenCaptureSourceNative, callback)
    }

    /**
     * Resolves a display, window, or macOS 14+ picker choice without starting frame production.
     *
     * The callback receives one pointer-free [ScreenCaptureReservation] that owns the resolved
     * native target. Its [ScreenCaptureReservation.start] is the only operation that can create
     * an `SCStream`; closing it before then releases the target without starting capture.
     */
    fun reserve(
        target: ScreenCaptureTarget,
        callback: (ScreenCaptureReservationResult) -> Unit,
    ): AutoCloseable {
        require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumMacOsMajor) {
            "ScreenCaptureKit capture requires macOS ${ScreenCaptureControlPlanes.minimumMacOsMajor}+"
        }
        val native = when (target) {
            ScreenCaptureTarget.HostPicker -> {
                require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumContentSharingPickerMacOsMajor) {
                    "ScreenCaptureKit host picker requires macOS ${ScreenCaptureControlPlanes.minimumContentSharingPickerMacOsMajor}+"
                }
                AppKitScreenCapturePickerNative
            }

            is ScreenCaptureTarget.Display, is ScreenCaptureTarget.Window -> AppKitScreenCaptureNative
        }
        ScreenCaptureKitFramework.ensureLoaded()
        return ScreenCaptureReservationCoordinator.reserve(native, target, callback)
    }

    fun open(
        target: ScreenCaptureTarget,
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
        onOpened: (ScreenCaptureOpenResult) -> Unit,
        onStopped: (ScreenCaptureStopResult) -> Unit,
    ): AutoCloseable {
        require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumMacOsMajor) {
            "ScreenCaptureKit capture requires macOS ${ScreenCaptureControlPlanes.minimumMacOsMajor}+"
        }
        val native = when (target) {
            ScreenCaptureTarget.HostPicker -> {
                require(MacOsVersion.current().major >= ScreenCaptureControlPlanes.minimumContentSharingPickerMacOsMajor) {
                    "ScreenCaptureKit host picker requires macOS ${ScreenCaptureControlPlanes.minimumContentSharingPickerMacOsMajor}+"
                }
                AppKitScreenCapturePickerNative
            }

            is ScreenCaptureTarget.Display, is ScreenCaptureTarget.Window -> AppKitScreenCaptureNative
        }
        ScreenCaptureKitFramework.ensureLoaded()
        return ScreenCaptureSessionCoordinator.open(
            native = native,
            target = target,
            configuration = configuration,
            onFrame = onFrame,
            onOpened = onOpened,
            onStopped = onStopped,
        )
    }
}

/** Failure with detached NSError details; it never exposes an Objective-C object. */
class ScreenCaptureKitFailure internal constructor(
    val domain: String?,
    val code: Long?,
    message: String,
) : IllegalStateException(message)

internal object AppKitScreenCaptureNative : ScreenCaptureNative {
    override fun resolve(
        target: ScreenCaptureTarget,
        callback: (Result<ScreenCaptureResolvedTarget>) -> Unit,
    ): AutoCloseable = objectObjectCompletion(
        invoke = SCShareableContent::getShareableContentWithCompletionHandler,
    ) { content, error ->
        val failure = error?.let { NSError(it.ptr).toCaptureFailure() }
        when {
            failure != null -> callback(Result.failure(failure))
            content == null -> callback(Result.failure(ScreenCaptureKitFailure(null, null, "ScreenCaptureKit returned no shareable content")))
            else -> callback(runCatching { resolveTarget(target, SCShareableContent(content.ptr)) })
        }
    }

    override fun open(
        target: ScreenCaptureResolvedTarget,
        configuration: ScreenCaptureStreamConfiguration,
        onFrame: (ScreenCaptureFrameLease) -> Unit,
        onTerminated: (Throwable?) -> Unit,
    ): ScreenCaptureNativeStream {
        val resolved = target as? AppKitResolvedTarget
            ?: error("ScreenCaptureKit target was resolved by a different backend")
        val filter = createFilter(resolved)
        try {
            val streamConfiguration = createConfiguration(configuration)
            try {
                val delegate = ScreenCaptureStreamDelegate.create(onTerminated)
                try {
                    val stream = createStream(filter.value, streamConfiguration.value, delegate.native)
                    try {
                        val output = ScreenCaptureFrameOutput.attach(
                            ScreenCaptureKitFrameOutputNative(stream.value.ptr),
                            onFrame,
                        )
                        return AppKitScreenCaptureNativeStream(
                            stream,
                            filter,
                            streamConfiguration,
                            output,
                            delegate,
                        )
                    } catch (failure: Throwable) {
                        stream.close()
                        throw failure
                    }
                } catch (failure: Throwable) {
                    delegate.close()
                    throw failure
                }
            } catch (failure: Throwable) {
                streamConfiguration.close()
                throw failure
            }
        } catch (failure: Throwable) {
            filter.close()
            throw failure
        }
    }
}

/** ScreenCaptureKit source discovery; every result is copied before its completion block returns. */
private object AppKitScreenCaptureSourceNative : ScreenCaptureSourceNative {
    override fun enumerate(
        callback: (Result<ScreenCaptureSourceCatalog>) -> Unit,
    ): AutoCloseable = objectObjectCompletion(
        invoke = SCShareableContent::getShareableContentWithCompletionHandler,
    ) { content, error ->
        val failure = error?.let { NSError(it.ptr).toCaptureFailure() }
        when {
            failure != null -> callback(Result.failure(failure))
            content == null -> callback(
                Result.failure(
                    ScreenCaptureKitFailure(null, null, "ScreenCaptureKit returned no shareable content"),
                ),
            )

            else -> callback(runCatching { snapshotSources(SCShareableContent(content.ptr)) })
        }
    }
}

internal sealed class AppKitResolvedTarget : ScreenCaptureResolvedTarget() {
    abstract fun createFilter(): OwnedObjC<SCContentFilter>
}

private class ResolvedDisplay(
    private val display: ObjCStrongRef<SCDisplay>,
) : AppKitResolvedTarget() {
    override val source: ScreenCaptureReservationSource = ScreenCaptureReservationSource.Display(
        display.value.displayID().toUInt().toLong(),
    )

    override fun createFilter(): OwnedObjC<SCContentFilter> {
        val allocated = allocateObjectiveC("SCContentFilter")
        val initialized = try {
            SCContentFilter(allocated).initWithDisplay_excludingWindows(display.value.ptr, MemorySegment.NULL)
        } catch (failure: Throwable) {
            releaseObjectiveC(allocated)
            throw failure
        }
        return OwnedObjC(SCContentFilter(requireNotNullObject(initialized, "SCContentFilter display initializer")))
    }

    override fun close() = display.close()
}

private class ResolvedWindow(
    private val window: ObjCStrongRef<SCWindow>,
) : AppKitResolvedTarget() {
    override val source: ScreenCaptureReservationSource = ScreenCaptureReservationSource.Window(
        window.value.windowID().toUInt().toLong(),
        window.value.title().toNullableString(),
    )

    override fun createFilter(): OwnedObjC<SCContentFilter> {
        val allocated = allocateObjectiveC("SCContentFilter")
        val initialized = try {
            SCContentFilter(allocated).initWithDesktopIndependentWindow(window.value.ptr)
        } catch (failure: Throwable) {
            releaseObjectiveC(allocated)
            throw failure
        }
        return OwnedObjC(SCContentFilter(requireNotNullObject(initialized, "SCContentFilter window initializer")))
    }

    override fun close() = window.close()
}

private fun resolveTarget(target: ScreenCaptureTarget, content: SCShareableContent): AppKitResolvedTarget = when (target) {
    ScreenCaptureTarget.HostPicker -> error("ScreenCaptureKit host picker resolves its own source")

    is ScreenCaptureTarget.Display -> arrays(content.displays())
        .map(::SCDisplay)
        .firstOrNull { it.displayID().toUInt().toLong() == target.id }
        ?.retainStrong()
        ?.let(::ResolvedDisplay)
        ?: error("ScreenCaptureKit display ${target.id} is no longer available")

    is ScreenCaptureTarget.Window -> arrays(content.windows())
        .map(::SCWindow)
        .firstOrNull { it.windowID().toUInt().toLong() == target.id }
        ?.retainStrong()
        ?.let(::ResolvedWindow)
        ?: error("ScreenCaptureKit window ${target.id} is no longer available")
}

private fun snapshotSources(content: SCShareableContent): ScreenCaptureSourceCatalog = ScreenCaptureSourceCatalog(
    displays = arrays(content.displays()).map { pointer ->
        SCDisplay(pointer).toSource()
    },
    windows = arrays(content.windows()).map { pointer ->
        SCWindow(pointer).toSource()
    },
)

private fun SCDisplay.toSource(): ScreenCaptureDisplaySource = ScreenCaptureDisplaySource(
    id = displayID().toUInt().toLong(),
    pixelWidth = width().toPositiveInt("display pixel width"),
    pixelHeight = height().toPositiveInt("display pixel height"),
    bounds = frame().toSourceBounds(),
)

private fun SCWindow.toSource(): ScreenCaptureWindowSource = ScreenCaptureWindowSource(
    id = windowID().toUInt().toLong(),
    title = title().toNullableString(),
    owner = owningApplication().toApplicationOrNull(),
    bounds = frame().toSourceBounds(),
    layer = windowLayer(),
    isOnScreen = isOnScreen(),
)

private fun MemorySegment.toApplicationOrNull(): ScreenCaptureApplication? {
    if (this == MemorySegment.NULL) return null
    val application = SCRunningApplication(this)
    return ScreenCaptureApplication(
        name = application.applicationName().toNullableString(),
        bundleIdentifier = application.bundleIdentifier().toNullableString(),
        processId = application.processID(),
    )
}

private fun org.graphiks.kffi.objc.CGRect.toSourceBounds(): ScreenCaptureSourceBounds = ScreenCaptureSourceBounds(
    x = origin.x,
    y = origin.y,
    width = size.width,
    height = size.height,
)

private fun MemorySegment.toNullableString(): String? =
    takeUnless { it == MemorySegment.NULL }?.let(ObjCRuntime::toJavaString)

private fun Long.toPositiveInt(description: String): Int {
    require(this in 1..Int.MAX_VALUE.toLong()) { "$description must fit a positive Int" }
    return toInt()
}

private fun createFilter(target: AppKitResolvedTarget): OwnedObjC<SCContentFilter> = target.createFilter()

private fun createConfiguration(configuration: ScreenCaptureStreamConfiguration): OwnedObjC<SCStreamConfiguration> {
    val allocated = allocateObjectiveC("SCStreamConfiguration")
    val initialized = try {
        ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            allocated,
            ObjCRuntime.sel("init"),
        ) as MemorySegment
    } catch (failure: Throwable) {
        releaseObjectiveC(allocated)
        throw failure
    }
    val native = SCStreamConfiguration(requireNotNullObject(initialized, "SCStreamConfiguration initializer"))
    try {
        native.setWidth(configuration.width.toLong())
        native.setHeight(configuration.height.toLong())
        native.setPixelFormat(BGRA_PIXEL_FORMAT)
        native.setShowsCursor(configuration.showsCursor)
        configuration.minimumFrameIntervalAsCMTime()?.let(native::setMinimumFrameInterval)
        return OwnedObjC(native)
    } catch (failure: Throwable) {
        releaseObjectiveC(native.ptr)
        throw failure
    }
}

private fun createStream(
    filter: SCContentFilter,
    configuration: SCStreamConfiguration,
    delegate: MemorySegment,
): OwnedObjC<SCStream> {
    val allocated = allocateObjectiveC("SCStream")
    val initialized = try {
        SCStream(allocated).initWithFilter_configuration_delegate(filter.ptr, configuration.ptr, delegate)
    } catch (failure: Throwable) {
        releaseObjectiveC(allocated)
        throw failure
    }
    return OwnedObjC(SCStream(requireNotNullObject(initialized, "SCStream initializer")))
}

private class AppKitScreenCaptureNativeStream(
    private val stream: OwnedObjC<SCStream>,
    private val filter: OwnedObjC<SCContentFilter>,
    private val configuration: OwnedObjC<SCStreamConfiguration>,
    private val output: ScreenCaptureFrameOutput,
    private val delegate: ScreenCaptureStreamDelegate,
) : ScreenCaptureNativeStream {
    private val closed = AtomicBoolean()
    private val startCompletion = AtomicReference<AutoCloseable?>(null)
    private val stopCompletion = AtomicReference<AutoCloseable?>(null)

    override fun start(completion: (Throwable?) -> Unit) {
        check(!closed.get()) { "ScreenCaptureKit stream is closed" }
        val owner = errorCompletion(stream.value::startCaptureWithCompletionHandler) { error ->
            startCompletion.getAndSet(null)?.close()
            completion(error?.toCaptureFailure())
        }
        startCompletion.getAndSet(owner)?.close()
    }

    override fun stop(completion: (Throwable?) -> Unit) {
        if (closed.get()) {
            completion(null)
            return
        }
        val owner = errorCompletion(stream.value::stopCaptureWithCompletionHandler) { error ->
            stopCompletion.getAndSet(null)?.close()
            completion(error?.toCaptureFailure())
        }
        stopCompletion.getAndSet(owner)?.close()
    }

    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        var failure: Throwable? = null
        closeCapture { output.close() }.onFailure { failure = it }
        closeCapture { startCompletion.getAndSet(null)?.close() }.onFailure { failure = append(failure, it) }
        closeCapture { stopCompletion.getAndSet(null)?.close() }.onFailure { failure = append(failure, it) }
        closeCapture { stream.close() }.onFailure { failure = append(failure, it) }
        closeCapture { delegate.close() }.onFailure { failure = append(failure, it) }
        closeCapture { configuration.close() }.onFailure { failure = append(failure, it) }
        closeCapture { filter.close() }.onFailure { failure = append(failure, it) }
        failure?.let { throw it }
    }
}

private fun errorCompletion(
    invoke: (MemorySegment) -> Unit,
    callback: (NSError?) -> Unit,
): AutoCloseable {
    val owner = AtomicReference<ObjCManagedBlock<Unit>?>(null)
    val delivered = AtomicBoolean()
    val block = ObjCManagedBlock.voidError(ObjCManagedBlockSetter { }) { error ->
        if (!delivered.compareAndSet(false, true)) return@voidError
        try {
            callback(error)
        } finally {
            owner.getAndSet(null)?.close()
        }
    }
    owner.set(block)
    try {
        invoke(block.nativeBlock)
    } catch (failure: Throwable) {
        owner.getAndSet(null)?.close()
        throw failure
    }
    return AutoCloseable { owner.getAndSet(null)?.close() }
}

private fun objectObjectCompletion(
    invoke: (MemorySegment) -> Unit,
    callback: (NSObject?, NSObject?) -> Unit,
): AutoCloseable {
    val owner = AtomicReference<ObjCManagedBlock<Unit>?>(null)
    val delivered = AtomicBoolean()
    val block = ObjCManagedBlock.voidObjectObject(ObjCManagedBlockSetter { }) { first, second ->
        if (!delivered.compareAndSet(false, true)) return@voidObjectObject
        try {
            callback(first, second)
        } finally {
            owner.getAndSet(null)?.close()
        }
    }
    owner.set(block)
    try {
        invoke(block.nativeBlock)
    } catch (failure: Throwable) {
        owner.getAndSet(null)?.close()
        throw failure
    }
    return AutoCloseable { owner.getAndSet(null)?.close() }
}

internal class OwnedObjC<T : NSObject>(
    val value: T,
) : AutoCloseable {
    private val closed = AtomicBoolean()

    override fun close() {
        if (closed.compareAndSet(false, true)) releaseObjectiveC(value.ptr)
    }
}

private fun arrays(pointer: MemorySegment): List<MemorySegment> {
    if (pointer == MemorySegment.NULL) return emptyList()
    val array = NSArray(pointer)
    return List(array.count().toInt()) { index -> array.objectAtIndex(index.toLong()) }
}

private fun allocateObjectiveC(className: String): MemorySegment = (
    ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass(className),
        ObjCRuntime.sel("alloc"),
    ) as MemorySegment
).also { pointer -> check(pointer != MemorySegment.NULL) { "$className alloc returned nil" } }

private fun releaseObjectiveC(pointer: MemorySegment) {
    if (pointer != MemorySegment.NULL) ObjCManagedRuntime.release(pointer)
}

internal fun requireNotNullObject(pointer: MemorySegment, operation: String): MemorySegment {
    check(pointer != MemorySegment.NULL) { "$operation returned nil" }
    return pointer
}

internal fun NSError.toCaptureFailure(): ScreenCaptureKitFailure {
    val domain = runCatching { ObjCRuntime.toJavaString(domain()) }.getOrNull()
    val code = runCatching(::code).getOrNull()
    val message = runCatching(::localizedDescriptionAsString).getOrNull()
        ?: when {
            domain != null && code != null -> "ScreenCaptureKit failed: $domain ($code)"
            domain != null -> "ScreenCaptureKit failed: $domain"
            else -> "ScreenCaptureKit failed"
        }
    return ScreenCaptureKitFailure(domain, code, message)
}

private fun closeCapture(action: () -> Unit): Result<Unit> = runCatching(action)

private fun append(primary: Throwable?, next: Throwable): Throwable = primary?.also { it.addSuppressed(next) } ?: next

private const val BGRA_PIXEL_FORMAT: Int = 0x42475241
