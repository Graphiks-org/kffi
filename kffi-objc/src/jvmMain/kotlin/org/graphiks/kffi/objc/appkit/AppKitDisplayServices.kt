@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.CFRelease
import org.graphiks.kffi.objc.CFRetain
import org.graphiks.kffi.objc.CGCaptureAllDisplays
import org.graphiks.kffi.objc.CGDisplayBoundsTyped
import org.graphiks.kffi.objc.CGDisplayCapture
import org.graphiks.kffi.objc.CGDisplayCopyDisplayMode
import org.graphiks.kffi.objc.CGDisplayModeGetPixelHeight
import org.graphiks.kffi.objc.CGDisplayModeGetPixelWidth
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
) : AutoCloseable {
    private val lock = ReentrantLock()

    val isClosed: Boolean
        get() = lock.withLock { handle == 0L }

    fun copy(): OwnedCGDisplayMode = lock.withLock {
        val current = requireOpen()
        native.retain(current)
        OwnedCGDisplayMode(native, current, pixelWidth, pixelHeight)
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
            )
        } catch (failure: Throwable) {
            native.release(mode)
            throw failure
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
    fun modePixelWidth(mode: Long): Long
    fun modePixelHeight(mode: Long): Long
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

    override fun modePixelWidth(mode: Long): Long =
        CGDisplayModeGetPixelWidth(MemorySegment.ofAddress(mode))

    override fun modePixelHeight(mode: Long): Long =
        CGDisplayModeGetPixelHeight(MemorySegment.ofAddress(mode))

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
