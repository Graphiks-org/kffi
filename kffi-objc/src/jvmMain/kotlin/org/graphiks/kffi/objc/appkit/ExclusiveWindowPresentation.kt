@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CGShieldingWindowLevel
import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSOperatingSystemVersion
import org.graphiks.kffi.objc.NSProcessInfo
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.NSScreen
import org.graphiks.kffi.objc.NSSize
import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.NSWindowStyleMask
import org.graphiks.kffi.objc.managed.ObjCStrongRef
import org.graphiks.kffi.objc.managed.retainStrong
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
    VerifyRestorationStyle,
    VerifyRestorationFrame,
    VerifyRestorationLevel,
    ReleaseOwner,
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

    data object Closed : ExclusiveWindowPresentationResult

    data object WrongThread : ExclusiveWindowPresentationResult

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

/** Result of observing a lease's detached window state. */
sealed interface ExclusiveWindowPresentationReadbackResult {
    data class Readback(val value: ExclusiveWindowPresentationReadback) : ExclusiveWindowPresentationReadbackResult

    data object WindowGone : ExclusiveWindowPresentationReadbackResult

    data object Closed : ExclusiveWindowPresentationReadbackResult

    data object WrongThread : ExclusiveWindowPresentationReadbackResult

    data class Failed(val failure: ExclusiveWindowPresentationFailure) : ExclusiveWindowPresentationReadbackResult
}

/** Result of restoring a window to the detached state captured when its lease opened. */
sealed interface ExclusiveWindowPresentationRestoreResult {
    data class Restored(val readback: ExclusiveWindowPresentationReadback) : ExclusiveWindowPresentationRestoreResult

    data class PartiallyRestored(
        val readback: ExclusiveWindowPresentationReadback?,
        val failures: List<ExclusiveWindowPresentationFailure>,
    ) : ExclusiveWindowPresentationRestoreResult

    data object WindowGone : ExclusiveWindowPresentationRestoreResult

    data object Closed : ExclusiveWindowPresentationRestoreResult

    data object WrongThread : ExclusiveWindowPresentationRestoreResult
}

/** Result of terminally closing an exclusive window presentation lease. */
sealed interface ExclusiveWindowPresentationCloseResult {
    data class Terminated(
        val restoration: ExclusiveWindowPresentationTerminalRestoration,
        val cleanupFailures: List<ExclusiveWindowPresentationFailure>,
    ) : ExclusiveWindowPresentationCloseResult

    data object WrongThread : ExclusiveWindowPresentationCloseResult
}

/** Restoration state captured when an exclusive presentation lease is terminally closed. */
sealed interface ExclusiveWindowPresentationTerminalRestoration {
    data object NotRequired : ExclusiveWindowPresentationTerminalRestoration

    data class Restored(
        val readback: ExclusiveWindowPresentationReadback,
    ) : ExclusiveWindowPresentationTerminalRestoration

    data class PartiallyRestored(
        val readback: ExclusiveWindowPresentationReadback?,
        val failures: List<ExclusiveWindowPresentationFailure>,
    ) : ExclusiveWindowPresentationTerminalRestoration

    data object WindowGone : ExclusiveWindowPresentationTerminalRestoration
}

/** A managed, pointer-free owner of an exclusive AppKit window presentation. */
interface ExclusiveWindowPresentationLease {
    fun present(displayId: Int): ExclusiveWindowPresentationResult

    fun readback(): ExclusiveWindowPresentationReadbackResult

    fun restore(): ExclusiveWindowPresentationRestoreResult

    val lastRestoreResult: ExclusiveWindowPresentationRestoreResult?

    val lastCloseResult: ExclusiveWindowPresentationCloseResult.Terminated?

    fun close(): ExclusiveWindowPresentationCloseResult
}

/** Opens an exclusive window presentation lease without mutating the window. */
object ExclusiveWindowPresentationServices {
    private val registryLock = ReentrantLock()
    private val activeWindows = mutableSetOf<WindowLeaseIdentity>()

    fun open(window: NSWindow): ExclusiveWindowPresentationOpenResult {
        val native = CocoaExclusiveWindowPresentationNative
        if (!native.isMacOs26OrLater()) return ExclusiveWindowPresentationOpenResult.UnavailablePlatform
        if (!native.isMainThread()) return ExclusiveWindowPresentationOpenResult.WrongThread
        if (window.ptr == MemorySegment.NULL) return ExclusiveWindowPresentationOpenResult.WindowGone
        return try {
            openRetained(native, native.retainWindow(window))
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            ExclusiveWindowPresentationOpenResult.WindowGone
        } catch (failure: Throwable) {
            ExclusiveWindowPresentationOpenResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Snapshot, failure.messageOrType()),
            )
        }
    }

    /** Internal seam for deterministic, pointer-free state-machine tests. */
    internal fun open(
        window: Long,
        native: ExclusiveWindowPresentationNative,
    ): ExclusiveWindowPresentationOpenResult {
        if (!native.isMacOs26OrLater()) return ExclusiveWindowPresentationOpenResult.UnavailablePlatform
        if (!native.isMainThread()) return ExclusiveWindowPresentationOpenResult.WrongThread
        if (window == 0L) return ExclusiveWindowPresentationOpenResult.WindowGone

        val ownedWindow = try {
            native.retainWindow(window)
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            return ExclusiveWindowPresentationOpenResult.WindowGone
        } catch (failure: Throwable) {
            return ExclusiveWindowPresentationOpenResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Snapshot, failure.messageOrType()),
            )
        }
        return openRetained(native, ownedWindow)
    }

    private fun openRetained(
        native: ExclusiveWindowPresentationNative,
        ownedWindow: ExclusiveWindowPresentationWindow,
    ): ExclusiveWindowPresentationOpenResult {
        val identity = WindowLeaseIdentity(native, ownedWindow.identity)
        registryLock.withLock {
            if (!activeWindows.add(identity)) {
                ownedWindow.close()
                return ExclusiveWindowPresentationOpenResult.DuplicateWindowLease
            }
        }
        val snapshot = try {
            ownedWindow.snapshot()
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            ownedWindow.close()
            release(identity)
            return ExclusiveWindowPresentationOpenResult.WindowGone
        } catch (failure: Throwable) {
            ownedWindow.close()
            release(identity)
            return ExclusiveWindowPresentationOpenResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Snapshot, failure.messageOrType()),
            )
        }
        return ExclusiveWindowPresentationOpenResult.Opened(
            ManagedExclusiveWindowPresentationLease(native, ownedWindow, snapshot, identity, ::release),
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

    fun retainWindow(window: Long): ExclusiveWindowPresentationWindow
}

/** Strong native ownership claim used by one lease; it never reconstructs a window wrapper. */
internal interface ExclusiveWindowPresentationWindow : AutoCloseable {
    val identity: Long

    fun snapshot(): ExclusiveWindowPresentationSnapshot

    fun screen(displayId: Int): ExclusiveWindowPresentationScreen?

    fun presentBorderless()

    fun presentFrame(screen: ExclusiveWindowPresentationScreen)

    fun presentShieldingLevel(): Long

    fun readback(): ExclusiveWindowPresentationReadback

    fun restoreStyle(styleMask: Long)

    fun restoreFrame(frame: CGDisplayBoundsSnapshot)

    fun restoreLevel(level: Long)
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
    private val window: ExclusiveWindowPresentationWindow,
    private val snapshot: ExclusiveWindowPresentationSnapshot,
    private val identity: WindowLeaseIdentity,
    private val release: (WindowLeaseIdentity) -> Unit,
) : ExclusiveWindowPresentationLease {
    private val lock = ReentrantLock()
    private var styleOutstanding = false
    private var frameOutstanding = false
    private var levelOutstanding = false
    private var closed = false
    private var restoreResult: ExclusiveWindowPresentationRestoreResult? = null
    private var closeResult: ExclusiveWindowPresentationCloseResult.Terminated? = null

    override val lastRestoreResult: ExclusiveWindowPresentationRestoreResult?
        get() = lock.withLock { restoreResult }

    override val lastCloseResult: ExclusiveWindowPresentationCloseResult.Terminated?
        get() = lock.withLock { closeResult }

    override fun present(displayId: Int): ExclusiveWindowPresentationResult = lock.withLock {
        if (!native.isMainThread()) return ExclusiveWindowPresentationResult.WrongThread
        if (closed) return ExclusiveWindowPresentationResult.Closed
        val screen = try {
            window.screen(displayId)
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            closeAsWindowGone()
            return ExclusiveWindowPresentationResult.WindowGone
        } catch (failure: Throwable) {
            return ExclusiveWindowPresentationResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.ResolveScreen, failure.messageOrType()),
            )
        } ?: return ExclusiveWindowPresentationResult.MissingTargetScreen(displayId)

        var presentationLevel: Long? = null
        var operation = ExclusiveWindowPresentationOperation.PresentBorderless
        try {
            window.presentBorderless()
            styleOutstanding = true
            operation = ExclusiveWindowPresentationOperation.PresentFrame
            window.presentFrame(screen)
            frameOutstanding = true
            operation = ExclusiveWindowPresentationOperation.PresentShieldingLevel
            presentationLevel = window.presentShieldingLevel()
            levelOutstanding = true
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            closeAsWindowGone()
            return ExclusiveWindowPresentationResult.WindowGone
        } catch (failure: Throwable) {
            return ExclusiveWindowPresentationResult.Failed(
                ExclusiveWindowPresentationFailure(operation, failure.messageOrType()),
            )
        }

        val actual = try {
            window.readback()
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

    override fun readback(): ExclusiveWindowPresentationReadbackResult = lock.withLock {
        if (!native.isMainThread()) return ExclusiveWindowPresentationReadbackResult.WrongThread
        if (closed) return ExclusiveWindowPresentationReadbackResult.Closed
        try {
            ExclusiveWindowPresentationReadbackResult.Readback(window.readback())
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            closeAsWindowGone()
            ExclusiveWindowPresentationReadbackResult.WindowGone
        } catch (failure: Throwable) {
            ExclusiveWindowPresentationReadbackResult.Failed(
                ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Readback, failure.messageOrType()),
            )
        }
    }

    override fun close(): ExclusiveWindowPresentationCloseResult = lock.withLock {
        if (!native.isMainThread()) return ExclusiveWindowPresentationCloseResult.WrongThread
        closeResult?.let { return it }
        val restoration = when (val result = restore()) {
            is ExclusiveWindowPresentationRestoreResult.Restored ->
                ExclusiveWindowPresentationTerminalRestoration.Restored(result.readback)

            is ExclusiveWindowPresentationRestoreResult.PartiallyRestored ->
                ExclusiveWindowPresentationTerminalRestoration.PartiallyRestored(result.readback, result.failures)

            ExclusiveWindowPresentationRestoreResult.WindowGone -> ExclusiveWindowPresentationTerminalRestoration.WindowGone
            ExclusiveWindowPresentationRestoreResult.Closed,
            ExclusiveWindowPresentationRestoreResult.WrongThread,
            -> ExclusiveWindowPresentationTerminalRestoration.NotRequired
        }
        ExclusiveWindowPresentationCloseResult.Terminated(restoration, emptyList()).also { closeResult = it }
    }

    override fun restore(): ExclusiveWindowPresentationRestoreResult = lock.withLock {
        if (!native.isMainThread()) return ExclusiveWindowPresentationRestoreResult.WrongThread
        if (closed) return ExclusiveWindowPresentationRestoreResult.Closed

        if (!styleOutstanding && !frameOutstanding && !levelOutstanding) {
            return readbackForNoopRestore()
        }

        val failures = mutableListOf<ExclusiveWindowPresentationFailure>()
        try {
            if (styleOutstanding) restoreComponent(ExclusiveWindowPresentationOperation.RestoreStyle, failures) {
                window.restoreStyle(snapshot.styleMask)
                styleOutstanding = false
            }
            if (frameOutstanding) restoreComponent(ExclusiveWindowPresentationOperation.RestoreFrame, failures) {
                window.restoreFrame(snapshot.frame)
                frameOutstanding = false
            }
            if (levelOutstanding) restoreComponent(ExclusiveWindowPresentationOperation.RestoreLevel, failures) {
                window.restoreLevel(snapshot.level)
                levelOutstanding = false
            }
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            return closeAsWindowGone()
        }

        val readback = try {
            window.readback()
        } catch (gone: ExclusiveWindowPresentationWindowGoneException) {
            return closeAsWindowGone()
        } catch (failure: Throwable) {
            failures += ExclusiveWindowPresentationFailure(ExclusiveWindowPresentationOperation.Readback, failure.messageOrType())
            null
        }
        verifyRestoration(readback, failures)
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
        val readback = window.readback()
        val failures = mutableListOf<ExclusiveWindowPresentationFailure>()
        verifyRestoration(readback, failures)
        val result = if (failures.isEmpty()) {
            ExclusiveWindowPresentationRestoreResult.Restored(readback)
        } else {
            ExclusiveWindowPresentationRestoreResult.PartiallyRestored(readback, failures)
        }
        restoreResult = result
        if (result is ExclusiveWindowPresentationRestoreResult.Restored) closeAfterCompleteRestore()
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

    private fun verifyRestoration(
        readback: ExclusiveWindowPresentationReadback?,
        failures: MutableList<ExclusiveWindowPresentationFailure>,
    ) {
        val observed = readback ?: return
        if (!styleOutstanding && observed.styleMask != snapshot.styleMask) {
            styleOutstanding = true
            failures += ExclusiveWindowPresentationFailure(
                ExclusiveWindowPresentationOperation.VerifyRestorationStyle,
                "restored style mask did not match the opening snapshot",
            )
        }
        if (!frameOutstanding && (observed.frame != snapshot.frame || observed.displayId != snapshot.displayId)) {
            frameOutstanding = true
            failures += ExclusiveWindowPresentationFailure(
                ExclusiveWindowPresentationOperation.VerifyRestorationFrame,
                "restored frame did not match the opening snapshot",
            )
        }
        if (!levelOutstanding && observed.level != snapshot.level) {
            levelOutstanding = true
            failures += ExclusiveWindowPresentationFailure(
                ExclusiveWindowPresentationOperation.VerifyRestorationLevel,
                "restored level did not match the opening snapshot",
            )
        }
    }

    private fun closeAfterCompleteRestore() {
        closed = true
        window.close()
        release(identity)
    }

    private fun closeAsWindowGone(): ExclusiveWindowPresentationRestoreResult.WindowGone {
        val result = ExclusiveWindowPresentationRestoreResult.WindowGone
        restoreResult = result
        closed = true
        window.close()
        release(identity)
        return result
    }
}

private object CocoaExclusiveWindowPresentationNative : ExclusiveWindowPresentationNative {
    override fun isMacOs26OrLater(): Boolean =
        NSProcessInfo(NSProcessInfo.processInfo()).isOperatingSystemAtLeastVersion(
            NSOperatingSystemVersion(26L, 0L, 0L),
        )

    override fun isMainThread(): Boolean = NSThread.isMainThread()

    fun retainWindow(window: NSWindow): ExclusiveWindowPresentationWindow =
        CocoaExclusiveWindowPresentationWindow(window.retainStrong())

    override fun retainWindow(window: Long): ExclusiveWindowPresentationWindow {
        if (window == 0L) throw ExclusiveWindowPresentationWindowGoneException()
        return retainWindow(NSWindow(MemorySegment.ofAddress(window)))
    }
}

private class CocoaExclusiveWindowPresentationWindow(
    private val ownership: ObjCStrongRef<NSWindow>,
) : ExclusiveWindowPresentationWindow {
    private val window: NSWindow
        get() = ownership.value

    override val identity: Long
        get() = window.ptr.address()

    override fun snapshot(): ExclusiveWindowPresentationSnapshot = ExclusiveWindowPresentationSnapshot(
        styleMask = window.styleMask().rawValue,
        frame = window.frame().toSnapshot(),
        displayId = displayId(window.screen()),
        level = window.level(),
    )

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

    override fun presentBorderless() {
        window.setStyleMask(NSWindowStyleMask(NSWindowStyleMask.NSWindowStyleMaskBorderless.rawValue))
    }

    override fun presentFrame(screen: ExclusiveWindowPresentationScreen) {
        window.setFrame_display_animate(screen.frame.toRect(), true, false)
    }

    override fun presentShieldingLevel(): Long {
        val level = CGShieldingWindowLevel().toLong()
        window.setLevel(level)
        return level
    }

    override fun readback(): ExclusiveWindowPresentationReadback = ExclusiveWindowPresentationReadback(
        styleMask = window.styleMask().rawValue,
        frame = window.frame().toSnapshot(),
        displayId = displayId(window.screen()),
        level = window.level(),
    )

    override fun restoreStyle(styleMask: Long) {
        window.setStyleMask(NSWindowStyleMask(styleMask))
    }

    override fun restoreFrame(frame: CGDisplayBoundsSnapshot) {
        window.setFrame_display_animate(frame.toRect(), true, false)
    }

    override fun restoreLevel(level: Long) {
        window.setLevel(level)
    }

    override fun close() {
        ownership.close()
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
