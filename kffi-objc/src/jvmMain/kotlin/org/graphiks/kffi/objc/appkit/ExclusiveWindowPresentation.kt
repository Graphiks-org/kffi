@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CGShieldingWindowLevel
import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSProcessInfo
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.NSScreen
import org.graphiks.kffi.objc.NSSize
import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.NSWindowStyleMask
import java.lang.foreign.MemorySegment
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/** Detached window state captured before an exclusive presentation is applied. */
data class ExclusiveWindowPresentationSnapshot(
    val styleMask: Long,
    val frame: CGDisplayBoundsSnapshot,
    val displayId: Int?,
    val level: Long,
)

/** Detached state observed from a window after a presentation operation. */
data class ExclusiveWindowPresentationReadback(
    val styleMask: Long,
    val frame: CGDisplayBoundsSnapshot,
    val displayId: Int?,
    val level: Long,
)

/** The native presentation operation that reported a failure. */
enum class ExclusiveWindowPresentationOperation {
    Snapshot,
    ResolveScreen,
    PresentBorderless,
    PresentFrame,
    PresentShieldingLevel,
    Readback,
    RestoreStyle,
    RestoreFrame,
    RestoreLevel,
}

/** A detached native failure, including every failure observed during restoration cleanup. */
data class ExclusiveWindowPresentationFailure(
    val operation: ExclusiveWindowPresentationOperation,
    val message: String,
)

/** Result of opening a presentation lease. */
sealed interface ExclusiveWindowPresentationOpenResult {
    data class Opened(val lease: ExclusiveWindowPresentationLease) : ExclusiveWindowPresentationOpenResult

    data object UnavailablePlatform : ExclusiveWindowPresentationOpenResult

    data object WrongThread : ExclusiveWindowPresentationOpenResult

    data object DuplicateWindowLease : ExclusiveWindowPresentationOpenResult

    data object WindowGone : ExclusiveWindowPresentationOpenResult

    data class Failed(val failure: ExclusiveWindowPresentationFailure) : ExclusiveWindowPresentationOpenResult
}

/** Result of requesting that a lease occupy one CoreGraphics display. */
sealed interface ExclusiveWindowPresentationResult {
    data class Presented(val readback: ExclusiveWindowPresentationReadback) : ExclusiveWindowPresentationResult

    data class MissingTargetScreen(val displayId: Int) : ExclusiveWindowPresentationResult

    data object WindowGone : ExclusiveWindowPresentationResult

    data class TargetReadbackMismatch(
        val expectedDisplayId: Int,
        val actualDisplayId: Int?,
    ) : ExclusiveWindowPresentationResult

    data class ExternalDivergence(
        val expected: ExclusiveWindowPresentationReadback,
        val actual: ExclusiveWindowPresentationReadback,
    ) : ExclusiveWindowPresentationResult

    data class Failed(val failure: ExclusiveWindowPresentationFailure) : ExclusiveWindowPresentationResult
}

/** Result of restoring a window to the detached state captured when its lease opened. */
sealed interface ExclusiveWindowPresentationRestoreResult {
    data class Restored(val readback: ExclusiveWindowPresentationReadback) : ExclusiveWindowPresentationRestoreResult

    data class PartiallyRestored(
        val readback: ExclusiveWindowPresentationReadback?,
        val failures: List<ExclusiveWindowPresentationFailure>,
    ) : ExclusiveWindowPresentationRestoreResult

    data object WindowGone : ExclusiveWindowPresentationRestoreResult
}

/** A managed, pointer-free owner of an exclusive AppKit window presentation. */
interface ExclusiveWindowPresentationLease : AutoCloseable {
    fun present(displayId: Int): ExclusiveWindowPresentationResult

    fun readback(): ExclusiveWindowPresentationReadback

    fun restore(): ExclusiveWindowPresentationRestoreResult

    val lastRestoreResult: ExclusiveWindowPresentationRestoreResult?

    override fun close() {
        restore()
    }
}

/** Opens an exclusive window presentation lease without mutating the window. */
object ExclusiveWindowPresentationServices {
    private val registryLock = ReentrantLock()
    private val activeWindows = mutableSetOf<WindowLeaseIdentity>()

    fun open(window: NSWindow): ExclusiveWindowPresentationOpenResult =
        open(window.ptr.address(), CocoaExclusiveWindowPresentationNative)

    /** Internal seam for deterministic, pointer-free state-machine tests. */
    internal fun open(
        window: Long,
        native: ExclusiveWindowPresentationNative,
    ): ExclusiveWindowPresentationOpenResult {
        if (!native.isMacOs26OrLater()) return ExclusiveWindowPresentationOpenResult.UnavailablePlatform
        if (!native.isMainThread()) return ExclusiveWindowPresentationOpenResult.WrongThread
        if (window == 0L) return ExclusiveWindowPresentationOpenResult.WindowGone

        val identity = WindowLeaseIdentity(native, window)
        registryLock.withLock {
            if (!activeWindows.add(identity)) return ExclusiveWindowPresentationOpenResult.DuplicateWindowLease
        }
        val snapshot = try {
            native.snapshot(window)
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            release(identity)
            return ExclusiveWindowPresentationOpenResult.WindowGone
        } catch (failure: Throwable) {
            release(identity)
            return ExclusiveWindowPresentationOpenResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Snapshot, failure.messageOrType()),
            )
        }
        return ExclusiveWindowPresentationOpenResult.Opened(
            ManagedExclusiveWindowPresentationLease(native, window, snapshot, identity, ::release),
        )
    }

    private fun release(identity: WindowLeaseIdentity) {
        registryLock.withLock { activeWindows.remove(identity) }
    }
}

/** Internal borrowed AppKit boundary; every implementation result is detached before it is public. */
internal interface ExclusiveWindowPresentationNative {
    fun isMacOs26OrLater(): Boolean

    fun isMainThread(): Boolean

    fun snapshot(window: Long): ExclusiveWindowPresentationSnapshot

    fun screen(displayId: Int): ExclusiveWindowPresentationScreen?

    fun presentBorderless(window: Long)

    fun presentFrame(window: Long, screen: ExclusiveWindowPresentationScreen)

    fun presentShieldingLevel(window: Long): Long

    fun readback(window: Long): ExclusiveWindowPresentationReadback

    fun restoreStyle(window: Long, styleMask: Long)

    fun restoreFrame(window: Long, frame: CGDisplayBoundsSnapshot)

    fun restoreLevel(window: Long, level: Long)
}

/** Borrowed `NSScreen` information used only within the native boundary. */
internal data class ExclusiveWindowPresentationScreen(
    val displayId: Int,
    val frame: CGDisplayBoundsSnapshot,
)

/** Signals that the AppKit window stopped existing while a lease was active. */
internal class ExclusiveWindowPresentationWindowGoneException : IllegalStateException()

private data class WindowLeaseIdentity(
    val native: ExclusiveWindowPresentationNative,
    val window: Long,
)

private class ManagedExclusiveWindowPresentationLease(
    private val native: ExclusiveWindowPresentationNative,
    private val window: Long,
    private val snapshot: ExclusiveWindowPresentationSnapshot,
    private val identity: WindowLeaseIdentity,
    private val release: (WindowLeaseIdentity) -> Unit,
) : ExclusiveWindowPresentationLease {
    private val lock = ReentrantLock()
    private var styleOutstanding = false
    private var frameOutstanding = false
    private var levelOutstanding = false
    private var closed = false
    private var closeInvoked = false
    private var restoreResult: ExclusiveWindowPresentationRestoreResult? = null

    override val lastRestoreResult: ExclusiveWindowPresentationRestoreResult?
        get() = lock.withLock { restoreResult }

    override fun present(displayId: Int): ExclusiveWindowPresentationResult = lock.withLock {
        if (closed) return ExclusiveWindowPresentationResult.WindowGone
        val screen = try {
            native.screen(displayId)
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            closeAsWindowGone()
            return ExclusiveWindowPresentationResult.WindowGone
        } catch (failure: Throwable) {
            return ExclusiveWindowPresentationResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.ResolveScreen, failure.messageOrType()),
            )
        } ?: return ExclusiveWindowPresentationResult.MissingTargetScreen(displayId)

        var presentationLevel: Long? = null
        try {
            native.presentBorderless(window)
            styleOutstanding = true
            native.presentFrame(window, screen)
            frameOutstanding = true
            presentationLevel = native.presentShieldingLevel(window)
            levelOutstanding = true
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            closeAsWindowGone()
            return ExclusiveWindowPresentationResult.WindowGone
        } catch (failure: Throwable) {
            return ExclusiveWindowPresentationResult.Failed(
                ExclusiveWindowPresentationFailure(presentationOperation(), failure.messageOrType()),
            )
        }

        val actual = try {
            native.readback(window)
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            closeAsWindowGone()
            return ExclusiveWindowPresentationResult.WindowGone
        } catch (failure: Throwable) {
            return ExclusiveWindowPresentationResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Readback, failure.messageOrType()),
            )
        }
        if (actual.displayId != displayId) {
            return ExclusiveWindowPresentationResult.TargetReadbackMismatch(displayId, actual.displayId)
        }
        val expected = ExclusiveWindowPresentationReadback(
            styleMask = NSWindowStyleMask.NSWindowStyleMaskBorderless.rawValue,
            frame = screen.frame,
            displayId = displayId,
            level = requireNotNull(presentationLevel),
        )
        return if (actual == expected) {
            ExclusiveWindowPresentationResult.Presented(actual)
        } else {
            ExclusiveWindowPresentationResult.ExternalDivergence(expected, actual)
        }
    }

    override fun readback(): ExclusiveWindowPresentationReadback = lock.withLock {
        check(!closed) { "Exclusive window presentation lease is closed" }
        native.readback(window)
    }

    override fun close() {
        lock.withLock {
            if (closeInvoked) return
            closeInvoked = true
            restore()
        }
    }

    override fun restore(): ExclusiveWindowPresentationRestoreResult = lock.withLock {
        restoreResult?.let { if (closed) return it }
        if (closed) return requireNotNull(restoreResult)

        if (!styleOutstanding && !frameOutstanding && !levelOutstanding) {
            return readbackForNoopRestore()
        }

        val failures = mutableListOf<ExclusiveWindowPresentationFailure>()
        try {
            if (styleOutstanding) restoreComponent(ExclusiveWindowPresentationOperation.RestoreStyle, failures) {
                native.restoreStyle(window, snapshot.styleMask)
                styleOutstanding = false
            }
            if (frameOutstanding) restoreComponent(ExclusiveWindowPresentationOperation.RestoreFrame, failures) {
                native.restoreFrame(window, snapshot.frame)
                frameOutstanding = false
            }
            if (levelOutstanding) restoreComponent(ExclusiveWindowPresentationOperation.RestoreLevel, failures) {
                native.restoreLevel(window, snapshot.level)
                levelOutstanding = false
            }
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            return closeAsWindowGone()
        }

        val readback = try {
            native.readback(window)
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            return closeAsWindowGone()
        } catch (failure: Throwable) {
            failures += ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Readback, failure.messageOrType())
            null
        }
        val result = if (failures.isEmpty() && !styleOutstanding && !frameOutstanding && !levelOutstanding) {
            ExclusiveWindowPresentationRestoreResult.Restored(requireNotNull(readback))
        } else {
            ExclusiveWindowPresentationRestoreResult.PartiallyRestored(readback, failures)
        }
        restoreResult = result
        if (result is ExclusiveWindowPresentationRestoreResult.Restored) closeAfterCompleteRestore()
        result
    }

    private fun readbackForNoopRestore(): ExclusiveWindowPresentationRestoreResult = try {
        val result = ExclusiveWindowPresentationRestoreResult.Restored(native.readback(window))
        restoreResult = result
        closeAfterCompleteRestore()
        result
    } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
        closeAsWindowGone()
    } catch (failure: Throwable) {
        val result = ExclusiveWindowPresentationRestoreResult.PartiallyRestored(
            readback = null,
            failures = listOf(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Readback, failure.messageOrType()),
            ),
        )
        restoreResult = result
        result
    }

    private inline fun restoreComponent(
        operation: ExclusiveWindowPresentationOperation,
        failures: MutableList<ExclusiveWindowPresentationFailure>,
        restore: () -> Unit,
    ) {
        try {
            restore()
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            throw gone
        } catch (failure: Throwable) {
            failures += ExclusiveWindowPresentationFailure(operation, failure.messageOrType())
        }
    }

    private fun presentationOperation(): ExclusiveWindowPresentationOperation = when {
        !styleOutstanding -> ExclusiveWindowPresentationOperation.PresentBorderless
        !frameOutstanding -> ExclusiveWindowPresentationOperation.PresentFrame
        !levelOutstanding -> ExclusiveWindowPresentationOperation.PresentShieldingLevel
        else -> ExclusiveWindowPresentationOperation.Readback
    }

    private fun closeAfterCompleteRestore() {
        closed = true
        release(identity)
    }

    private fun closeAsWindowGone(): ExclusiveWindowPresentationRestoreResult.WindowGone {
        val result = ExclusiveWindowPresentationRestoreResult.WindowGone
        restoreResult = result
        closed = true
        release(identity)
        return result
    }
}

private object CocoaExclusiveWindowPresentationNative : ExclusiveWindowPresentationNative {
    override fun isMacOs26OrLater(): Boolean =
        NSProcessInfo(NSProcessInfo.processInfo()).operatingSystemVersion().majorVersion >= 26L

    override fun isMainThread(): Boolean = NSThread.isMainThread()

    override fun snapshot(window: Long): ExclusiveWindowPresentationSnapshot {
        val nativeWindow = window(window)
        return ExclusiveWindowPresentationSnapshot(
            styleMask = nativeWindow.styleMask().rawValue,
            frame = nativeWindow.frame().toSnapshot(),
            displayId = displayId(nativeWindow.screen()),
            level = nativeWindow.level(),
        )
    }

    override fun screen(displayId: Int): ExclusiveWindowPresentationScreen? {
        val screens = NSArray(NSScreen.screens())
        val count = screens.count()
        check(count in 0..Int.MAX_VALUE.toLong()) { "NSScreen returned invalid screen count $count" }
        return (0 until count.toInt())
            .asSequence()
            .map { NSScreen(screens.objectAtIndex(it.toLong())) }
            .firstOrNull { it.CGDirectDisplayID() == displayId }
            ?.let { ExclusiveWindowPresentationScreen(displayId, it.frame().toSnapshot()) }
    }

    override fun presentBorderless(window: Long) {
        window(window).setStyleMask(NSWindowStyleMask(NSWindowStyleMask.NSWindowStyleMaskBorderless.rawValue))
    }

    override fun presentFrame(window: Long, screen: ExclusiveWindowPresentationScreen) {
        window(window).setFrame_display_animate(screen.frame.toRect(), true, false)
    }

    override fun presentShieldingLevel(window: Long): Long {
        val level = CGShieldingWindowLevel().toLong()
        window(window).setLevel(level)
        return level
    }

    override fun readback(window: Long): ExclusiveWindowPresentationReadback {
        val nativeWindow = window(window)
        return ExclusiveWindowPresentationReadback(
            styleMask = nativeWindow.styleMask().rawValue,
            frame = nativeWindow.frame().toSnapshot(),
            displayId = displayId(nativeWindow.screen()),
            level = nativeWindow.level(),
        )
    }

    override fun restoreStyle(window: Long, styleMask: Long) {
        window(window).setStyleMask(NSWindowStyleMask(styleMask))
    }

    override fun restoreFrame(window: Long, frame: CGDisplayBoundsSnapshot) {
        window(window).setFrame_display_animate(frame.toRect(), true, false)
    }

    override fun restoreLevel(window: Long, level: Long) {
        window(window).setLevel(level)
    }

    private fun window(address: Long): NSWindow {
        if (address == 0L) throw ExclusiveWindowPresentationWindowGoneException()
        return NSWindow(MemorySegment.ofAddress(address))
    }

    private fun displayId(screen: MemorySegment): Int? =
        screen.takeUnless { it == MemorySegment.NULL }?.let { NSScreen(it).CGDirectDisplayID() }
}

private fun CGDisplayBoundsSnapshot.toRect(): NSRect = NSRect(
    NSPoint(x, y),
    NSSize(width, height),
)

private fun NSRect.toSnapshot(): CGDisplayBoundsSnapshot = CGDisplayBoundsSnapshot(
    x = origin.x,
    y = origin.y,
    width = size.width,
    height = size.height,
)

private fun Throwable.messageOrType(): String = message ?: this::class.qualifiedName.orEmpty()
