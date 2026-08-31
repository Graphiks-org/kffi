@file:OptIn(
    org.graphiks.kffi.CallbackRuntimeApi::class,
    org.graphiks.kffi.objc.PlatformAvailability::class,
)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.CallbackRuntime
import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.CFMachPortCreateRunLoopSource
import org.graphiks.kffi.objc.CFRunLoopAddSource
import org.graphiks.kffi.objc.CFRunLoopGetCurrent
import org.graphiks.kffi.objc.CFRunLoopRemoveSource
import org.graphiks.kffi.objc.CGEventMask
import org.graphiks.kffi.objc.CGEventTapCreate
import org.graphiks.kffi.objc.CGEventTapEnable
import org.graphiks.kffi.objc.CGEventTapLocation
import org.graphiks.kffi.objc.CGEventTapOptions
import org.graphiks.kffi.objc.CGEventTapPlacement
import org.graphiks.kffi.objc.CGPreflightListenEventAccess
import org.graphiks.kffi.objc.kCFRunLoopCommonModes
import org.graphiks.kffi.objc.managed.BorrowedCGEvent
import org.graphiks.kffi.objc.managed.ManagedCFunction
import org.graphiks.kffi.objc.managed.ManagedCFunctionNativeHandle
import org.graphiks.kffi.objc.managed.ManagedCFunctions
import org.graphiks.kffi.objc.managed.eventTapNativeHandle
import org.graphiks.kffi.objc.managed.onQuiescentForManagedAdapter
import java.lang.foreign.MemorySegment
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Result of checking Input Monitoring access without displaying a system prompt. */
sealed interface EventTapPermissionState {
    data object Granted : EventTapPermissionState
    data object Denied : EventTapPermissionState
}

/**
 * A session-level CoreGraphics event tap that can observe but never modify or suppress events.
 *
 * The callback-owned [BorrowedCGEvent] is valid only for the dynamic extent of [install]'s
 * handler. [close] is idempotent, immediately removes and disables the tap, and defers native
 * release until every already-admitted managed callback has returned.
 */
class CGListenOnlyEventTap private constructor(
    private val native: CGEventTapNative,
    private val tap: Long,
    private val source: Long,
    private val runLoop: Long,
    private val modes: Long,
    private val callback: ManagedCFunction,
) : AutoCloseable {
    private val lock = ReentrantLock()
    private var closed = false
    private var quiescent = false

    init {
        callback.onQuiescentForManagedAdapter(::releaseNativeResources)
    }

    val isClosed: Boolean
        get() = lock.withLock { closed }

    val isQuiescent: Boolean
        get() = lock.withLock { quiescent }

    override fun close() {
        val shouldClose = lock.withLock {
            if (closed) return
            closed = true
            true
        }
        if (!shouldClose) return

        var failure: Throwable? = null
        failure = captureFailure(failure) { native.removeSource(runLoop, source, modes) }
        failure = captureFailure(failure) { native.enableTap(tap, enabled = false) }
        failure = captureFailure(failure) { callback.close() }
        failure?.let { throw it }
    }

    private fun releaseNativeResources() {
        var failure: Throwable? = null
        failure = captureFailure(failure) { native.release(source) }
        failure = captureFailure(failure) { native.release(tap) }
        lock.withLock { quiescent = true }
        failure?.let(CallbackRuntime::reportUnroutedFailure)
    }

    companion object {
        /** Checks Input Monitoring access without requesting it or displaying a prompt. */
        fun preflight(): EventTapPermissionState = preflight(CoreGraphicsEventTapNative)

        internal fun preflight(native: CGEventTapNative): EventTapPermissionState =
            if (native.preflight()) {
                EventTapPermissionState.Granted
            } else {
                EventTapPermissionState.Denied
            }

        /** Installs a listen-only tap at the session event stream. */
        fun install(
            mask: CGEventMask,
            handler: (BorrowedCGEvent) -> Unit,
        ): CGListenOnlyEventTap = install(mask, CoreGraphicsEventTapNative, handler)

        internal fun install(
            mask: CGEventMask,
            native: CGEventTapNative,
            handler: (BorrowedCGEvent) -> Unit,
        ): CGListenOnlyEventTap = install(
            mask = mask,
            location = CGEventTapLocation.kCGSessionEventTap,
            native = native,
            handler = handler,
        )

        internal fun install(
            mask: CGEventMask,
            location: CGEventTapLocation,
            native: CGEventTapNative,
            handler: (BorrowedCGEvent) -> Unit,
        ): CGListenOnlyEventTap {
            require(
                location == CGEventTapLocation.kCGSessionEventTap ||
                    location == CGEventTapLocation.kCGAnnotatedSessionEventTap,
            ) { "Listen-only event taps support only session or annotated-session locations" }

            val callback = ManagedCFunctions.eventTap { _, event ->
                try {
                    handler(event)
                } catch (failure: Throwable) {
                    CallbackRuntime.reportUnroutedFailure(failure)
                }
                event
            }
            var tap = 0L
            var source = 0L
            var runLoop = 0L
            var modes = 0L
            var added = false
            try {
                tap = native.createTap(
                    location = location,
                    placement = CGEventTapPlacement.kCGHeadInsertEventTap,
                    options = CGEventTapOptions.kCGEventTapOptionListenOnly,
                    mask = mask,
                    callback = callback.eventTapNativeHandle(),
                )
                check(tap != 0L) { "CGEventTapCreate returned null" }

                source = native.createRunLoopSource(tap)
                check(source != 0L) { "CFMachPortCreateRunLoopSource returned null" }
                runLoop = native.currentRunLoop()
                check(runLoop != 0L) { "CFRunLoopGetCurrent returned null" }
                modes = native.commonModes()
                check(modes != 0L) { "kCFRunLoopCommonModes was null" }
                native.addSource(runLoop, source, modes)
                added = true
                native.enableTap(tap, enabled = true)

                return CGListenOnlyEventTap(native, tap, source, runLoop, modes, callback)
            } catch (failure: Throwable) {
                var cleanupFailure: Throwable? = null
                if (added) {
                    cleanupFailure = captureFailure(cleanupFailure) {
                        native.removeSource(runLoop, source, modes)
                    }
                }
                if (tap != 0L) {
                    cleanupFailure = captureFailure(cleanupFailure) {
                        native.enableTap(tap, enabled = false)
                    }
                }
                callback.onQuiescentForManagedAdapter {
                    var releaseFailure: Throwable? = null
                    if (source != 0L) {
                        releaseFailure = captureFailure(releaseFailure) { native.release(source) }
                    }
                    if (tap != 0L) {
                        releaseFailure = captureFailure(releaseFailure) { native.release(tap) }
                    }
                    if (releaseFailure != null && releaseFailure !== failure) {
                        failure.addSuppressed(releaseFailure)
                    }
                }
                cleanupFailure = captureFailure(cleanupFailure) { callback.close() }
                if (cleanupFailure != null) failure.addSuppressed(cleanupFailure)
                throw failure
            }
        }
    }
}

internal interface CGEventTapNative {
    fun preflight(): Boolean

    fun createTap(
        location: CGEventTapLocation,
        placement: CGEventTapPlacement,
        options: CGEventTapOptions,
        mask: CGEventMask,
        callback: ManagedCFunctionNativeHandle,
    ): Long

    fun createRunLoopSource(tap: Long): Long
    fun currentRunLoop(): Long
    fun commonModes(): Long
    fun addSource(runLoop: Long, source: Long, modes: Long)
    fun removeSource(runLoop: Long, source: Long, modes: Long)
    fun enableTap(tap: Long, enabled: Boolean)
    fun release(handle: Long)
}

private object CoreGraphicsEventTapNative : CGEventTapNative {
    override fun preflight(): Boolean = CGPreflightListenEventAccess()

    override fun createTap(
        location: CGEventTapLocation,
        placement: CGEventTapPlacement,
        options: CGEventTapOptions,
        mask: CGEventMask,
        callback: ManagedCFunctionNativeHandle,
    ): Long = CGEventTapCreate(
        location,
        placement,
        options,
        mask,
        callback.callback,
        callback.userdata,
    ).address()

    override fun createRunLoopSource(tap: Long): Long =
        CFMachPortCreateRunLoopSource(
            MemorySegment.NULL,
            MemorySegment.ofAddress(tap),
            0L,
        ).address()

    override fun currentRunLoop(): Long = CFRunLoopGetCurrent().address()

    override fun commonModes(): Long = kCFRunLoopCommonModes.address()

    override fun addSource(runLoop: Long, source: Long, modes: Long) {
        CFRunLoopAddSource(
            MemorySegment.ofAddress(runLoop),
            MemorySegment.ofAddress(source),
            MemorySegment.ofAddress(modes),
        )
    }

    override fun removeSource(runLoop: Long, source: Long, modes: Long) {
        CFRunLoopRemoveSource(
            MemorySegment.ofAddress(runLoop),
            MemorySegment.ofAddress(source),
            MemorySegment.ofAddress(modes),
        )
    }

    override fun enableTap(tap: Long, enabled: Boolean) {
        CGEventTapEnable(MemorySegment.ofAddress(tap), enabled)
    }

    override fun release(handle: Long) {
        CFRelease(MemorySegment.ofAddress(handle))
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
