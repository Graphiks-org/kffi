@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.CFRetain
import org.graphiks.kffi.objc.CFEqual
import org.graphiks.kffi.objc.CFArrayGetCount
import org.graphiks.kffi.objc.CFArrayGetValueAtIndex
import org.graphiks.kffi.objc.CGCaptureAllDisplays
import org.graphiks.kffi.objc.CGDisplayBoundsTyped
import org.graphiks.kffi.objc.CGDisplayCapture
import org.graphiks.kffi.objc.CGDisplayCopyDisplayMode
import org.graphiks.kffi.objc.CGDisplayCopyAllDisplayModes
import org.graphiks.kffi.objc.CGDisplayModeGetIODisplayModeID
import org.graphiks.kffi.objc.CGDisplayModeGetPixelHeight
import org.graphiks.kffi.objc.CGDisplayModeGetPixelWidth
import org.graphiks.kffi.objc.CGDisplayModeGetRefreshRate
import org.graphiks.kffi.objc.CGDisplayModeGetIOFlags
import org.graphiks.kffi.objc.CGDisplayPixelsHigh
import org.graphiks.kffi.objc.CGDisplayPixelsWide
import org.graphiks.kffi.objc.CGDisplayRelease
import org.graphiks.kffi.objc.CGDisplaySetDisplayMode
import org.graphiks.kffi.objc.CGError
import org.graphiks.kffi.objc.CGGetActiveDisplayList
import org.graphiks.kffi.objc.CGReleaseAllDisplays
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Immutable display data detached from CoreGraphics storage. */
data class CGDisplaySnapshot(
    val id: Int,
    val pixelWidth: Long,
    val pixelHeight: Long,
)

/** Immutable coordinates detached from the `CGRect` returned by CoreGraphics. */
data class CGDisplayBoundsSnapshot(
    val x: Double,
    val y: Double,
    val width: Double,
    val height: Double,
)

/** Immutable mode data detached from a CoreGraphics display-mode reference. */
data class CGDisplayModeSnapshot(
    /** Stable I/O display-mode identity, normalized to a non-negative [Long]. */
    val modeIdentity: Long,
    val pixelWidth: Long,
    val pixelHeight: Long,
    /** Null when CoreGraphics reports a non-positive or non-finite refresh rate. */
    val refreshRateHz: Double?,
    /** CoreGraphics' unsigned I/O flags, copied to a non-negative [Long]. */
    val ioFlags: Long,
)

/** The state CoreGraphics could certify after an exclusive-display operation. */
sealed interface ExclusiveDisplayTerminal {
    data class Captured(val modeIdentity: Long) : ExclusiveDisplayTerminal

    data class Released(val modeIdentity: Long?) : ExclusiveDisplayTerminal

    data object Unknown : ExclusiveDisplayTerminal
}

/** Pointer-free snapshot of an exclusive display lease. */
data class ExclusiveDisplayReadback(val terminal: ExclusiveDisplayTerminal) {
    val modeIdentity: Long?
        get() = when (terminal) {
            is ExclusiveDisplayTerminal.Captured -> terminal.modeIdentity
            is ExclusiveDisplayTerminal.Released -> terminal.modeIdentity
            ExclusiveDisplayTerminal.Unknown -> null
        }

    val captureRetained: Boolean?
        get() = when (terminal) {
            is ExclusiveDisplayTerminal.Captured -> true
            is ExclusiveDisplayTerminal.Released -> false
            ExclusiveDisplayTerminal.Unknown -> null
        }
}

/** Closed set of native operations that can fail while managing an exclusive display. */
enum class ExclusiveDisplayNativeOperation {
    CopyInitialMode,
    CopyModeList,
    ResolveTargetMode,
    Capture,
    SetTargetMode,
    Readback,
    RestoreInitialMode,
    ReleaseCapture,
    ReleaseReference,
}

/** Detached native failure suitable for crossing the KFFI boundary. */
data class ExclusiveDisplayNativeFailure(
    val operation: ExclusiveDisplayNativeOperation,
    val message: String,
)

/** Terminal state and every cleanup failure observed while releasing a lease. */
data class ExclusiveDisplayReleaseResult(
    val terminal: ExclusiveDisplayTerminal,
    val failures: List<ExclusiveDisplayNativeFailure>,
)

/** Persistent, pointer-free owner of one CoreGraphics display capture. */
interface ExclusiveDisplayLease : AutoCloseable {
    val displayId: Int

    fun readback(): ExclusiveDisplayReadback

    fun release(): ExclusiveDisplayReleaseResult

    override fun close() {
        release()
    }
}

/** Result of attempting to capture a display and install an exact I/O display mode. */
sealed interface ExclusiveDisplayLeaseOpenResult {
    data class Opened(val lease: ExclusiveDisplayLease) : ExclusiveDisplayLeaseOpenResult

    data class FailedBeforeCapture(
        val failure: ExclusiveDisplayNativeFailure,
    ) : ExclusiveDisplayLeaseOpenResult

    @ConsistentCopyVisibility
    data class FailedAfterCapture internal constructor(
        val terminal: ExclusiveDisplayTerminal,
        val cleanup: ExclusiveDisplayReleaseResult,
        val recovery: ExclusiveDisplayLease?,
        val failure: ExclusiveDisplayNativeFailure,
    ) : ExclusiveDisplayLeaseOpenResult {
        init {
            require(terminal == cleanup.terminal) {
                "FailedAfterCapture terminal must match cleanup terminal"
            }
            require(
                when (terminal) {
                    is ExclusiveDisplayTerminal.Released -> recovery == null
                    is ExclusiveDisplayTerminal.Captured,
                    ExclusiveDisplayTerminal.Unknown,
                    -> recovery != null
                },
            ) {
                "FailedAfterCapture recovery must exist exactly while release is unconfirmed"
            }
        }
    }
}

/**
 * A retained CoreGraphics display mode.
 *
 * Native storage stays private. [close] balances the owning CoreFoundation reference and is
 * idempotent; [copy] creates an independently closeable retained owner.
 */
class OwnedCGDisplayMode internal constructor(
    private val native: AppKitDisplayNative,
    private var handle: Long,
    val pixelWidth: Long,
    val pixelHeight: Long,
    /** Stable I/O display-mode identity, normalized to a non-negative [Long]. */
    val modeIdentity: Long,
    /** Null when CoreGraphics reports a non-positive or non-finite refresh rate. */
    val refreshRateHz: Double?,
    /** CoreGraphics' unsigned I/O flags, copied to a non-negative [Long]. */
    val ioFlags: Long,
) : AutoCloseable {
    private val lock = ReentrantLock()

    val isClosed: Boolean
        get() = lock.withLock { handle == 0L }

    fun copy(): OwnedCGDisplayMode = lock.withLock {
        val current = requireOpen()
        native.retain(current)
        OwnedCGDisplayMode(native, current, pixelWidth, pixelHeight, modeIdentity, refreshRateHz, ioFlags)
    }

    override fun close() {
        lock.withLock {
            val current = handle
            if (current == 0L) return
            native.release(current)
            handle = 0L
        }
    }

    internal fun <R> withHandle(block: (Long) -> R): R = lock.withLock {
        block(requireOpen())
    }

    private fun requireOpen(): Long {
        check(handle != 0L) { "CoreGraphics display mode is closed" }
        return handle
    }
}

/** Pointer-free CoreGraphics display operations for AppKit/JVM consumers. */
object AppKitDisplayServices {
    /** Enumerates active displays as detached pixel snapshots. */
    fun enumerate(): List<CGDisplaySnapshot> = enumerate(CoreGraphicsDisplayNative)

    internal fun enumerate(native: AppKitDisplayNative): List<CGDisplaySnapshot> =
        native.activeDisplays().map { displayId ->
            CGDisplaySnapshot(
                id = displayId,
                pixelWidth = native.pixelWidth(displayId),
                pixelHeight = native.pixelHeight(displayId),
            )
        }

    /** Copies and owns the current display mode until the returned owner is closed. */
    fun currentMode(displayId: Int): OwnedCGDisplayMode = currentMode(displayId, CoreGraphicsDisplayNative)

    internal fun currentMode(displayId: Int, native: AppKitDisplayNative): OwnedCGDisplayMode {
        val mode = native.copyDisplayMode(displayId)
        check(mode != 0L) { "CGDisplayCopyDisplayMode returned null for display $displayId" }
        return try {
            OwnedCGDisplayMode(
                native = native,
                handle = mode,
                pixelWidth = native.modePixelWidth(mode),
                pixelHeight = native.modePixelHeight(mode),
                modeIdentity = native.modeIdentity(mode),
                refreshRateHz = native.modeRefreshRate(mode).takeIf { it.isFinite() && it > 0.0 },
                ioFlags = native.modeIoFlags(mode),
            )
        } catch (failure: Throwable) {
            native.release(mode)
            throw failure
        }
    }

    /** Returns every currently known mode as detached data and releases the CoreFoundation array. */
    fun allModes(displayId: Int): List<CGDisplayModeSnapshot> = allModes(displayId, CoreGraphicsDisplayNative)

    internal fun allModes(displayId: Int, native: AppKitDisplayNative): List<CGDisplayModeSnapshot> {
        val modes = native.copyAllDisplayModes(displayId)
        check(modes != 0L) { "CGDisplayCopyAllDisplayModes returned null for display $displayId" }
        return try {
            val count = native.modeCount(modes)
            check(count >= 0L && count <= Int.MAX_VALUE) {
                "CGDisplayCopyAllDisplayModes returned invalid count $count for display $displayId"
            }
            val identities = HashSet<Long>(count.toInt())
            List(count.toInt()) { ordinal ->
                val mode = native.modeAt(modes, ordinal.toLong())
                check(mode != 0L) { "CGDisplayCopyAllDisplayModes returned null mode $ordinal for display $displayId" }
                val modeIdentity = native.modeIdentity(mode)
                check(modeIdentity != 0L) {
                    "CGDisplayModeGetIODisplayModeID returned invalid identity for mode $ordinal on display $displayId"
                }
                check(identities.add(modeIdentity)) {
                    "CGDisplayCopyAllDisplayModes returned duplicate mode identity $modeIdentity for display $displayId"
                }
                CGDisplayModeSnapshot(
                    modeIdentity = modeIdentity,
                    pixelWidth = native.modePixelWidth(mode),
                    pixelHeight = native.modePixelHeight(mode),
                    refreshRateHz = native.modeRefreshRate(mode).takeIf { it.isFinite() && it > 0.0 },
                    ioFlags = native.modeIoFlags(mode),
                )
            }
                .sortedWith(
                    compareBy<CGDisplayModeSnapshot>(CGDisplayModeSnapshot::pixelWidth)
                        .thenBy(CGDisplayModeSnapshot::pixelHeight)
                        .thenBy { it.refreshRateHz ?: Double.NEGATIVE_INFINITY }
                        .thenBy(CGDisplayModeSnapshot::ioFlags)
                        .thenBy(CGDisplayModeSnapshot::modeIdentity),
                )
        } finally {
            native.release(modes)
        }
    }

    /** Captures [displayId] and installs the mode identified by [modeIdentity]. */
    fun openExclusiveLease(
        displayId: Int,
        modeIdentity: Long,
    ): ExclusiveDisplayLeaseOpenResult =
        openExclusiveLease(displayId, modeIdentity, CoreGraphicsDisplayNative)

    internal fun openExclusiveLease(
        displayId: Int,
        modeIdentity: Long,
        native: AppKitDisplayNative,
    ): ExclusiveDisplayLeaseOpenResult {
        var initialMode = 0L
        var targetMode = 0L
        val initialModeIdentity: Long
        try {
            if (modeIdentity <= 0) {
                failExclusiveOperation(
                    ExclusiveDisplayNativeOperation.ResolveTargetMode,
                    "modeIdentity must be positive",
                )
            }
            initialMode = exclusiveNativeCall(ExclusiveDisplayNativeOperation.CopyInitialMode) {
                native.copyDisplayMode(displayId)
            }
            if (initialMode == 0L) {
                failExclusiveOperation(
                    ExclusiveDisplayNativeOperation.CopyInitialMode,
                    "CGDisplayCopyDisplayMode returned null for display $displayId",
                )
            }
            initialModeIdentity = exclusiveNativeCall(ExclusiveDisplayNativeOperation.CopyInitialMode) {
                native.modeIdentity(initialMode)
            }
            if (initialModeIdentity == 0L) {
                failExclusiveOperation(
                    ExclusiveDisplayNativeOperation.CopyInitialMode,
                    "Current mode has no I/O identity for display $displayId",
                )
            }

            val modes = exclusiveNativeCall(ExclusiveDisplayNativeOperation.CopyModeList) {
                native.copyAllDisplayModes(displayId)
            }
            if (modes == 0L) {
                failExclusiveOperation(
                    ExclusiveDisplayNativeOperation.CopyModeList,
                    "CGDisplayCopyAllDisplayModes returned null for display $displayId",
                )
            }
            try {
                exclusiveNativeCall(ExclusiveDisplayNativeOperation.ResolveTargetMode) {
                    val count = native.modeCount(modes)
                    check(count >= 0L && count <= Int.MAX_VALUE) {
                        "CGDisplayCopyAllDisplayModes returned invalid count $count for display $displayId"
                    }
                    val identities = HashSet<Long>(count.toInt())
                    var target = 0L
                    repeat(count.toInt()) { ordinal ->
                        val candidate = native.modeAt(modes, ordinal.toLong())
                        check(candidate != 0L) {
                            "CGDisplayCopyAllDisplayModes returned null mode $ordinal for display $displayId"
                        }
                        val candidateIdentity = native.modeIdentity(candidate)
                        check(candidateIdentity != 0L) {
                            "CGDisplayModeGetIODisplayModeID returned invalid identity for mode $ordinal on display $displayId"
                        }
                        check(identities.add(candidateIdentity)) {
                            "CGDisplayCopyAllDisplayModes returned duplicate mode identity " +
                                "$candidateIdentity for display $displayId"
                        }
                        if (candidateIdentity == modeIdentity) target = candidate
                    }
                    check(target != 0L) {
                        "Display mode identity $modeIdentity is unavailable for display $displayId"
                    }
                    native.retain(target)
                    targetMode = target
                }
            } finally {
                exclusiveNativeCall(ExclusiveDisplayNativeOperation.ReleaseReference) {
                    native.release(modes)
                }
            }

            exclusiveNativeCall(ExclusiveDisplayNativeOperation.Capture) {
                native.capture(displayId)
            }
        } catch (failure: ExclusiveDisplayOperationException) {
            releaseBeforeCapture(native, targetMode, initialMode)
            return ExclusiveDisplayLeaseOpenResult.FailedBeforeCapture(failure.failure)
        }

        val lease = CoreGraphicsExclusiveDisplayLease(
            displayId = displayId,
            initialMode = initialMode,
            initialModeIdentity = initialModeIdentity,
            targetMode = targetMode,
            targetModeIdentity = modeIdentity,
            native = native,
        )
        return try {
            exclusiveNativeCall(ExclusiveDisplayNativeOperation.SetTargetMode) {
                native.setDisplayMode(displayId, targetMode)
            }
            val terminal = lease.readback().terminal
            if (terminal != ExclusiveDisplayTerminal.Captured(modeIdentity)) {
                failExclusiveOperation(
                    ExclusiveDisplayNativeOperation.Readback,
                    "CoreGraphics did not certify target mode $modeIdentity after capture",
                )
            }
            ExclusiveDisplayLeaseOpenResult.Opened(lease)
        } catch (failure: ExclusiveDisplayOperationException) {
            val cleanup = lease.release()
            ExclusiveDisplayLeaseOpenResult.FailedAfterCapture(
                terminal = cleanup.terminal,
                cleanup = cleanup,
                recovery = lease.takeUnless { cleanup.terminal is ExclusiveDisplayTerminal.Released },
                failure = failure.failure,
            )
        }
    }

    /** Applies an open owned mode without exposing its native reference. */
    fun setMode(displayId: Int, mode: OwnedCGDisplayMode) {
        setMode(displayId, mode, CoreGraphicsDisplayNative)
    }

    internal fun setMode(displayId: Int, mode: OwnedCGDisplayMode, native: AppKitDisplayNative) {
        mode.withHandle { native.setDisplayMode(displayId, it) }
    }

    /** Returns a detached snapshot of the display's global bounds. */
    fun bounds(displayId: Int): CGDisplayBoundsSnapshot = bounds(displayId, CoreGraphicsDisplayNative)

    internal fun bounds(displayId: Int, native: AppKitDisplayNative): CGDisplayBoundsSnapshot =
        native.bounds(displayId)

    /** Captures one display for the lexical extent of [block], then always releases it. */
    fun <R> withCapturedDisplay(displayId: Int, block: () -> R): R =
        withCapturedDisplay(displayId, CoreGraphicsDisplayNative, block)

    internal fun <R> withCapturedDisplay(
        displayId: Int,
        native: AppKitDisplayNative,
        block: () -> R,
    ): R {
        native.capture(displayId)
        return try {
            block()
        } finally {
            native.releaseCapture(displayId)
        }
    }

    /** Captures every active display for the lexical extent of [block]. */
    fun <R> withCapturedDisplays(block: () -> R): R =
        withCapturedDisplays(CoreGraphicsDisplayNative, block)

    internal fun <R> withCapturedDisplays(native: AppKitDisplayNative, block: () -> R): R {
        native.captureAll()
        return try {
            block()
        } finally {
            native.releaseAll()
        }
    }
}

internal interface AppKitDisplayNative {
    fun activeDisplays(): IntArray
    fun pixelWidth(displayId: Int): Long
    fun pixelHeight(displayId: Int): Long
    fun bounds(displayId: Int): CGDisplayBoundsSnapshot
    fun copyDisplayMode(displayId: Int): Long
    fun copyAllDisplayModes(displayId: Int): Long
    fun modeCount(modes: Long): Long
    fun modeAt(modes: Long, index: Long): Long
    fun modePixelWidth(mode: Long): Long
    fun modePixelHeight(mode: Long): Long
    fun modeRefreshRate(mode: Long): Double
    fun modeIoFlags(mode: Long): Long
    fun modeIdentity(mode: Long): Long
    fun modesEqual(first: Long, second: Long): Boolean
    fun retain(mode: Long)
    fun release(mode: Long)
    fun setDisplayMode(displayId: Int, mode: Long)
    fun capture(displayId: Int)
    fun releaseCapture(displayId: Int)
    fun captureAll()
    fun releaseAll()
}

private object CoreGraphicsDisplayNative : AppKitDisplayNative {
    override fun activeDisplays(): IntArray = Arena.ofConfined().use { arena ->
        val count = arena.allocate(ValueLayout.JAVA_INT)
        checkSuccess("CGGetActiveDisplayList(count)") {
            CGGetActiveDisplayList(0, MemorySegment.NULL, count)
        }
        val capacity = count.get(ValueLayout.JAVA_INT, 0L)
        if (capacity == 0) return@use IntArray(0)
        check(capacity > 0) { "CGGetActiveDisplayList returned a negative display count" }

        val displays = arena.allocate(ValueLayout.JAVA_INT, capacity.toLong())
        checkSuccess("CGGetActiveDisplayList(displays)") {
            CGGetActiveDisplayList(capacity, displays, count)
        }
        val actualCount = count.get(ValueLayout.JAVA_INT, 0L)
        check(actualCount in 0..capacity) {
            "CGGetActiveDisplayList returned $actualCount displays for capacity $capacity"
        }
        IntArray(actualCount) { index ->
            displays.getAtIndex(ValueLayout.JAVA_INT, index.toLong())
        }
    }

    override fun pixelWidth(displayId: Int): Long = CGDisplayPixelsWide(displayId)

    override fun pixelHeight(displayId: Int): Long = CGDisplayPixelsHigh(displayId)

    override fun bounds(displayId: Int): CGDisplayBoundsSnapshot = Arena.ofConfined().use { arena ->
        val bounds = CGDisplayBoundsTyped(arena, displayId)
        CGDisplayBoundsSnapshot(
            x = bounds.origin.x,
            y = bounds.origin.y,
            width = bounds.size.width,
            height = bounds.size.height,
        )
    }

    override fun copyDisplayMode(displayId: Int): Long = CGDisplayCopyDisplayMode(displayId).address()

    override fun copyAllDisplayModes(displayId: Int): Long =
        CGDisplayCopyAllDisplayModes(displayId, MemorySegment.NULL).address()

    override fun modeCount(modes: Long): Long = CFArrayGetCount(MemorySegment.ofAddress(modes))

    override fun modeAt(modes: Long, index: Long): Long =
        CFArrayGetValueAtIndex(MemorySegment.ofAddress(modes), index).address()

    override fun modePixelWidth(mode: Long): Long =
        CGDisplayModeGetPixelWidth(MemorySegment.ofAddress(mode))

    override fun modePixelHeight(mode: Long): Long =
        CGDisplayModeGetPixelHeight(MemorySegment.ofAddress(mode))

    override fun modeRefreshRate(mode: Long): Double =
        CGDisplayModeGetRefreshRate(MemorySegment.ofAddress(mode))

    override fun modeIoFlags(mode: Long): Long =
        CGDisplayModeGetIOFlags(MemorySegment.ofAddress(mode)).toLong() and UINT32_MASK

    override fun modeIdentity(mode: Long): Long =
        CGDisplayModeGetIODisplayModeID(MemorySegment.ofAddress(mode)).toLong() and UINT32_MASK

    override fun modesEqual(first: Long, second: Long): Boolean =
        CFEqual(MemorySegment.ofAddress(first), MemorySegment.ofAddress(second)).toInt() != 0

    override fun retain(mode: Long) {
        CFRetain(MemorySegment.ofAddress(mode))
    }

    override fun release(mode: Long) {
        CFRelease(MemorySegment.ofAddress(mode))
    }

    override fun setDisplayMode(displayId: Int, mode: Long) {
        checkSuccess("CGDisplaySetDisplayMode") {
            CGDisplaySetDisplayMode(displayId, MemorySegment.ofAddress(mode), MemorySegment.NULL)
        }
    }

    override fun capture(displayId: Int) {
        checkSuccess("CGDisplayCapture") { CGDisplayCapture(displayId) }
    }

    override fun releaseCapture(displayId: Int) {
        checkSuccess("CGDisplayRelease") { CGDisplayRelease(displayId) }
    }

    override fun captureAll() {
        checkSuccess("CGCaptureAllDisplays") { CGCaptureAllDisplays() }
    }

    override fun releaseAll() {
        checkSuccess("CGReleaseAllDisplays") { CGReleaseAllDisplays() }
    }

    private inline fun checkSuccess(operation: String, call: () -> CGError) {
        val result = call()
        check(result == CGError.kCGErrorSuccess) {
            "$operation failed with ${result.name} (${result.value})"
        }
    }
}

private class CoreGraphicsExclusiveDisplayLease(
    override val displayId: Int,
    private var initialMode: Long,
    private val initialModeIdentity: Long,
    private var targetMode: Long,
    private val targetModeIdentity: Long,
    private val native: AppKitDisplayNative,
) : ExclusiveDisplayLease {
    private val lock = ReentrantLock()
    private var released: ExclusiveDisplayReleaseResult? = null
    private var restorePending = true
    private var capturePending = true

    override fun readback(): ExclusiveDisplayReadback = lock.withLock {
        released?.let { return ExclusiveDisplayReadback(it.terminal) }
        ExclusiveDisplayReadback(readTerminal(mutableListOf()))
    }

    override fun release(): ExclusiveDisplayReleaseResult = lock.withLock {
        released?.let { return it }
        val failures = mutableListOf<ExclusiveDisplayNativeFailure>()
        if (restorePending && initialMode != 0L) {
            val restoreSucceeded = captureFailure(
                failures,
                ExclusiveDisplayNativeOperation.RestoreInitialMode,
            ) {
                native.setDisplayMode(displayId, initialMode)
            }
            if (restoreSucceeded) restorePending = false
        }
        if (capturePending) {
            val releaseSucceeded = captureFailure(
                failures,
                ExclusiveDisplayNativeOperation.ReleaseCapture,
            ) {
                native.releaseCapture(displayId)
            }
            if (releaseSucceeded) capturePending = false
        }
        val terminal = readTerminal(failures)
        if (terminal is ExclusiveDisplayTerminal.Released) {
            releaseReferences(failures)
        }
        ExclusiveDisplayReleaseResult(terminal, failures.toList()).also { result ->
            if (terminal is ExclusiveDisplayTerminal.Released) released = result
        }
    }

    private fun readTerminal(
        failures: MutableList<ExclusiveDisplayNativeFailure>,
    ): ExclusiveDisplayTerminal {
        var currentMode = 0L
        var certifiedIdentity: Long? = null
        try {
            currentMode = native.copyDisplayMode(displayId)
            if (currentMode == 0L) {
                failures += nativeFailure(
                    ExclusiveDisplayNativeOperation.Readback,
                    "CGDisplayCopyDisplayMode returned null for display $displayId",
                )
            } else {
                val currentIdentity = native.modeIdentity(currentMode)
                certifiedIdentity = when {
                    initialMode != 0L &&
                        currentIdentity == initialModeIdentity &&
                        native.modesEqual(currentMode, initialMode) -> currentIdentity

                    targetMode != 0L &&
                        currentIdentity == targetModeIdentity &&
                        native.modesEqual(currentMode, targetMode) -> currentIdentity

                    else -> null
                }
            }
        } catch (failure: Throwable) {
            failures += nativeFailure(ExclusiveDisplayNativeOperation.Readback, failure)
        }

        if (currentMode != 0L) {
            captureFailure(failures, ExclusiveDisplayNativeOperation.ReleaseReference) {
                native.release(currentMode)
            }
        }

        return when {
            certifiedIdentity == null -> ExclusiveDisplayTerminal.Unknown
            capturePending ->
                ExclusiveDisplayTerminal.Captured(certifiedIdentity)
            else -> ExclusiveDisplayTerminal.Released(certifiedIdentity)
        }
    }

    private fun releaseReferences(failures: MutableList<ExclusiveDisplayNativeFailure>) {
        val target = targetMode
        targetMode = 0L
        if (target != 0L) {
            captureFailure(failures, ExclusiveDisplayNativeOperation.ReleaseReference) {
                native.release(target)
            }
        }
        val initial = initialMode
        initialMode = 0L
        if (initial != 0L) {
            captureFailure(failures, ExclusiveDisplayNativeOperation.ReleaseReference) {
                native.release(initial)
            }
        }
    }
}

private class ExclusiveDisplayOperationException(
    val failure: ExclusiveDisplayNativeFailure,
) : RuntimeException(failure.message)

private inline fun <R> exclusiveNativeCall(
    operation: ExclusiveDisplayNativeOperation,
    block: () -> R,
): R = try {
    block()
} catch (failure: ExclusiveDisplayOperationException) {
    throw failure
} catch (failure: Throwable) {
    throw ExclusiveDisplayOperationException(nativeFailure(operation, failure))
}

private fun failExclusiveOperation(
    operation: ExclusiveDisplayNativeOperation,
    message: String,
): Nothing = throw ExclusiveDisplayOperationException(nativeFailure(operation, message))

private fun nativeFailure(
    operation: ExclusiveDisplayNativeOperation,
    failure: Throwable,
): ExclusiveDisplayNativeFailure = nativeFailure(
    operation,
    failure.message ?: failure::class.java.simpleName,
)

private fun nativeFailure(
    operation: ExclusiveDisplayNativeOperation,
    message: String,
): ExclusiveDisplayNativeFailure = ExclusiveDisplayNativeFailure(operation, message)

private inline fun captureFailure(
    failures: MutableList<ExclusiveDisplayNativeFailure>,
    operation: ExclusiveDisplayNativeOperation,
    block: () -> Unit,
): Boolean = try {
    block()
    true
} catch (failure: Throwable) {
    failures += nativeFailure(operation, failure)
    false
}

private fun releaseBeforeCapture(
    native: AppKitDisplayNative,
    targetMode: Long,
    initialMode: Long,
) {
    if (targetMode != 0L) runCatching { native.release(targetMode) }
    if (initialMode != 0L) runCatching { native.release(initialMode) }
}

private const val UINT32_MASK = 0xFFFF_FFFFL
