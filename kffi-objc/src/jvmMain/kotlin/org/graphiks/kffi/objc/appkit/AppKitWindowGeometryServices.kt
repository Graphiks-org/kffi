@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CFArrayGetCount
import org.graphiks.kffi.objc.CFArrayGetValueAtIndex
import org.graphiks.kffi.objc.CFDictionaryGetValue
import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.CGDisplayBoundsTyped
import org.graphiks.kffi.objc.CGError
import org.graphiks.kffi.objc.CGGetDisplaysWithPoint
import org.graphiks.kffi.objc.CGPoint
import org.graphiks.kffi.objc.CGRect
import org.graphiks.kffi.objc.CGWindowListCopyWindowInfo
import org.graphiks.kffi.objc.CGWindowListOption
import org.graphiks.kffi.objc.NSArray
import org.graphiks.kffi.objc.NSOperatingSystemVersion
import org.graphiks.kffi.objc.NSPoint
import org.graphiks.kffi.objc.NSProcessInfo
import org.graphiks.kffi.objc.NSNumber
import org.graphiks.kffi.objc.NSScreen
import org.graphiks.kffi.objc.NSThread
import org.graphiks.kffi.objc.NSWindow
import org.graphiks.kffi.objc.NSRect
import org.graphiks.kffi.objc.PlatformAvailability
import org.graphiks.kffi.objc.CGRectMakeWithDictionaryRepresentation
import org.graphiks.kffi.objc.kCGWindowBounds
import org.graphiks.kffi.objc.kCGWindowNumber
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/** Detached outer bounds from the Window Server's global CoreGraphics coordinate space. */
data class WindowOuterBoundsSnapshot(
    val x: Double,
    val y: Double,
    val width: Double,
    val height: Double,
) {
    init {
        require(x.isFinite() && y.isFinite() && width.isFinite() && height.isFinite()) {
            "window bounds must be finite"
        }
        require(width >= 0.0 && height >= 0.0) { "window bounds cannot be negative" }
    }
}

/** Result of reading an AppKit window's outer bounds from the Window Server. */
sealed interface AppKitWindowGeometryReadResult {
    data class Read(val bounds: WindowOuterBoundsSnapshot) : AppKitWindowGeometryReadResult

    data object WindowGone : AppKitWindowGeometryReadResult

    data object WrongThread : AppKitWindowGeometryReadResult

    /** The Window Server did not expose a bounds dictionary for this window. */
    data object Unavailable : AppKitWindowGeometryReadResult

    data class Failed(val message: String) : AppKitWindowGeometryReadResult
}

/** Result of moving an AppKit window from a physical CoreGraphics position. */
sealed interface AppKitWindowGeometrySetResult {
    /** The move completed and [bounds] is the post-mutation Window Server readback. */
    data class Moved(val bounds: WindowOuterBoundsSnapshot) : AppKitWindowGeometrySetResult

    /** macOS does not expose the public `NSScreen.CGDirectDisplayID` association yet. */
    data object UnavailablePlatform : AppKitWindowGeometrySetResult

    data object WindowGone : AppKitWindowGeometrySetResult

    data object WrongThread : AppKitWindowGeometrySetResult

    /** The requested position belongs to no display in the current CoreGraphics desktop. */
    data object Unmappable : AppKitWindowGeometrySetResult

    /** CoreGraphics resolved a display, but AppKit did not expose its matching screen. */
    data object MissingScreen : AppKitWindowGeometrySetResult

    /** The native mutation ran, but no effective Window Server bounds could be certified afterwards. */
    data object ReadbackUnavailable : AppKitWindowGeometrySetResult

    data class Failed(val message: String) : AppKitWindowGeometrySetResult
}

/**
 * Pointer-free AppKit outer-window geometry operations.
 *
 * The public setter accepts a physical CoreGraphics position. It resolves the target display in
 * CoreGraphics, converts only that display-local offset into AppKit screen coordinates, then
 * returns the Window Server's post-mutation bounds. Callers must never infer the effective bounds
 * from `NSWindow.frame()` and a backing scale, because that is incorrect for mixed-scale and
 * straddling windows.
 */
object AppKitWindowGeometryServices {
    fun readOuterBounds(window: NSWindow): AppKitWindowGeometryReadResult =
        readOuterBounds(window.ptr.address(), CocoaAppKitWindowGeometryNative)

    @PlatformAvailability(platform = "macos", introducedMajor = 26, introducedMinor = 0, introducedSubminor = -1)
    fun setOuterPosition(
        window: NSWindow,
        x: Int,
        y: Int,
    ): AppKitWindowGeometrySetResult =
        setOuterPosition(window.ptr.address(), x, y, CocoaAppKitWindowGeometryNative)

    /** Internal seam for deterministic tests without exposing Objective-C pointers. */
    internal fun readOuterBounds(
        window: Long,
        native: AppKitWindowGeometryNative,
    ): AppKitWindowGeometryReadResult {
        if (window == 0L) return AppKitWindowGeometryReadResult.WindowGone
        if (!native.isMainThread()) return AppKitWindowGeometryReadResult.WrongThread
        return try {
            val windowNumber = native.windowNumber(window)
            if (windowNumber == 0L) AppKitWindowGeometryReadResult.WindowGone
            else native.readOuterBounds(windowNumber)?.let(AppKitWindowGeometryReadResult::Read)
                ?: AppKitWindowGeometryReadResult.Unavailable
        } catch (failure: Throwable) {
            AppKitWindowGeometryReadResult.Failed(failure.messageOrType())
        }
    }

    /** Internal seam for deterministic tests without exposing Objective-C pointers. */
    internal fun setOuterPosition(
        window: Long,
        x: Int,
        y: Int,
        native: AppKitWindowGeometryNative,
    ): AppKitWindowGeometrySetResult {
        if (!native.isMacOs26OrLater()) return AppKitWindowGeometrySetResult.UnavailablePlatform
        if (window == 0L) return AppKitWindowGeometrySetResult.WindowGone
        if (!native.isMainThread()) return AppKitWindowGeometrySetResult.WrongThread

        return try {
            val physicalX = x.toDouble()
            val physicalY = y.toDouble()
            val displayId = native.displayAt(physicalX, physicalY)
                ?: return AppKitWindowGeometrySetResult.Unmappable
            val screen = native.screen(displayId)
                ?: return AppKitWindowGeometrySetResult.MissingScreen
            native.setFrameTopLeft(
                window = window,
                x = screen.appKitFrame.x + (physicalX - screen.coreGraphicsBounds.x) / screen.backingScaleFactor,
                y = screen.appKitFrame.y + screen.appKitFrame.height -
                    (physicalY - screen.coreGraphicsBounds.y) / screen.backingScaleFactor,
            )
            when (val readback = readOuterBounds(window, native)) {
                is AppKitWindowGeometryReadResult.Read -> AppKitWindowGeometrySetResult.Moved(readback.bounds)
                AppKitWindowGeometryReadResult.WindowGone -> AppKitWindowGeometrySetResult.WindowGone
                AppKitWindowGeometryReadResult.WrongThread,
                AppKitWindowGeometryReadResult.Unavailable,
                -> AppKitWindowGeometrySetResult.ReadbackUnavailable
                is AppKitWindowGeometryReadResult.Failed -> AppKitWindowGeometrySetResult.Failed(readback.message)
            }
        } catch (failure: Throwable) {
            AppKitWindowGeometrySetResult.Failed(failure.messageOrType())
        }
    }
}

/** Internal borrowed AppKit/CoreGraphics boundary; all public results are detached. */
internal interface AppKitWindowGeometryNative {
    fun isMacOs26OrLater(): Boolean

    fun isMainThread(): Boolean

    fun windowNumber(window: Long): Long

    fun displayAt(x: Double, y: Double): Int?

    fun screen(displayId: Int): AppKitWindowGeometryScreen?

    fun setFrameTopLeft(window: Long, x: Double, y: Double)

    fun readOuterBounds(windowNumber: Long): WindowOuterBoundsSnapshot?
}

/** Borrowed screen values used only to transform a CoreGraphics point for AppKit. */
internal data class AppKitWindowGeometryScreen(
    val displayId: Int,
    val coreGraphicsBounds: CGDisplayBoundsSnapshot,
    val appKitFrame: CGDisplayBoundsSnapshot,
    val backingScaleFactor: Double,
) {
    init {
        require(backingScaleFactor.isFinite() && backingScaleFactor > 0.0) {
            "backingScaleFactor must be finite and positive"
        }
    }
}

private object CocoaAppKitWindowGeometryNative : AppKitWindowGeometryNative {
    override fun isMacOs26OrLater(): Boolean =
        NSProcessInfo(NSProcessInfo.processInfo()).isOperatingSystemAtLeastVersion(
            NSOperatingSystemVersion(26L, 0L, 0L),
        )

    override fun isMainThread(): Boolean = NSThread.isMainThread()

    override fun windowNumber(window: Long): Long = NSWindow(MemorySegment.ofAddress(window)).windowNumber()

    override fun displayAt(x: Double, y: Double): Int? = Arena.ofConfined().use { arena ->
        val display = arena.allocate(ValueLayout.JAVA_INT)
        val count = arena.allocate(ValueLayout.JAVA_INT)
        check(
            CGGetDisplaysWithPoint(CGPoint(x, y), 1, display, count) == CGError.kCGErrorSuccess,
        ) { "CGGetDisplaysWithPoint failed" }
        when (count.get(ValueLayout.JAVA_INT, 0L)) {
            0 -> null
            1 -> display.get(ValueLayout.JAVA_INT, 0L)
            else -> error("CGGetDisplaysWithPoint returned more than one display")
        }
    }

    override fun screen(displayId: Int): AppKitWindowGeometryScreen? = Arena.ofConfined().use { arena ->
        val bounds = CGDisplayBoundsTyped(arena, displayId).toSnapshot()
        val screens = NSArray(NSScreen.screens())
        val count = screens.count()
        check(count in 0..Int.MAX_VALUE.toLong()) { "NSScreen returned invalid screen count $count" }
        (0 until count.toInt())
            .asSequence()
            .map { NSScreen(screens.objectAtIndex(it.toLong())) }
            .firstOrNull { it.CGDirectDisplayID() == displayId }
            ?.let { screen ->
                AppKitWindowGeometryScreen(
                    displayId = displayId,
                    coreGraphicsBounds = bounds,
                    appKitFrame = screen.frame().toSnapshot(),
                    backingScaleFactor = screen.backingScaleFactor(),
                )
            }
    }

    override fun setFrameTopLeft(window: Long, x: Double, y: Double) {
        NSWindow(MemorySegment.ofAddress(window)).setFrameTopLeftPoint(NSPoint(x, y))
    }

    override fun readOuterBounds(windowNumber: Long): WindowOuterBoundsSnapshot? {
        val info = CGWindowListCopyWindowInfo(
            CGWindowListOption.kCGWindowListOptionOnScreenAboveWindow +
                CGWindowListOption.kCGWindowListOptionIncludingWindow,
            windowNumber.toInt(),
        )
        if (info == MemorySegment.NULL) return null
        return try {
            (0 until CFArrayGetCount(info)).asSequence()
                .map { CFArrayGetValueAtIndex(info, it) }
                .firstOrNull { dictionary ->
                    val number = CFDictionaryGetValue(dictionary, kCGWindowNumber)
                    number != MemorySegment.NULL && NSNumber(number).intValue() == windowNumber.toInt()
                }
                ?.let { dictionary ->
                    val bounds = CFDictionaryGetValue(dictionary, kCGWindowBounds)
                    if (bounds == MemorySegment.NULL) return@let null
                    Arena.ofConfined().use { arena ->
                        val rect = CGRect.allocate(arena)
                        if (!CGRectMakeWithDictionaryRepresentation(bounds, rect.segment)) null
                        else rect.toWindowOuterBoundsSnapshot()
                    }
                }
        } finally {
            CFRelease(info)
        }
    }
}

private fun NSRect.toSnapshot(): CGDisplayBoundsSnapshot = CGDisplayBoundsSnapshot(
    x = origin.x,
    y = origin.y,
    width = size.width,
    height = size.height,
)

private fun CGRect.toWindowOuterBoundsSnapshot(): WindowOuterBoundsSnapshot = WindowOuterBoundsSnapshot(
    x = origin.x,
    y = origin.y,
    width = size.width,
    height = size.height,
)

private fun Throwable.messageOrType(): String = message ?: this::class.qualifiedName.orEmpty()
