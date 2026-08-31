@file:OptIn(org.graphiks.kffi.objc.PlatformAvailability::class)

package org.graphiks.kffi.objc.appkit

import org.graphiks.kffi.objc.NSData
import org.graphiks.kffi.objc.NSDraggingInfo
import org.graphiks.kffi.objc.NSPasteboard
import org.graphiks.kffi.objc.NSURL
import org.graphiks.kffi.objc.ObjCRuntime
import org.graphiks.kffi.objc.managed.ObjCManagedRuntime
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * A dragging-info view borrowed for the dynamic extent of [NSDraggingInfo.withBorrowed].
 *
 * This wrapper has no native pointer or retain operation. It is invalidated when the scope exits,
 * including exceptional exits, so an escaped instance cannot query the callback-owned object.
 */
class BorrowedNSDraggingInfo internal constructor(
    draggingInfo: NSDraggingInfo,
    private val scope: BorrowedNativeScope,
) {
    private var draggingInfo: NSDraggingInfo? = draggingInfo

    init {
        scope.clearOnInvalidate { this.draggingInfo = null }
    }

    /** Returns a pointer-free pasteboard facade bound to this borrowed scope. */
    fun draggingPasteboard(): BorrowedNSPasteboard = scope.invoke {
        val pasteboard = checkNotNull(draggingInfo).draggingPasteboard()
        check(pasteboard != MemorySegment.NULL) { "NSDraggingInfo returned a nil draggingPasteboard" }
        BorrowedNSPasteboard(scope, NSPasteboard(pasteboard))
    }
}

/** Pointer-free access to a callback-owned pasteboard. */
class BorrowedNSPasteboard internal constructor(
    private val scope: BorrowedNativeScope,
    pasteboard: NSPasteboard,
) {
    private var pasteboard: NSPasteboard? = pasteboard

    init {
        scope.clearOnInvalidate { this.pasteboard = null }
    }

    /** Copies pasteboard data into JVM ownership without exposing an Objective-C object. */
    fun copyDataForType(dataType: String, maxBytes: Int): ByteArray? = scope.invoke {
        ObjCRuntime.autoreleasePool {
            Arena.ofConfined().use { arena ->
                val type = ObjCRuntime.newNSString(arena, dataType)
                val data = checkNotNull(pasteboard).dataForType(type)
                if (data == MemorySegment.NULL) null else NSData(data).copyToByteArray(maxBytes)
            }
        }
    }
}

/** Serializes native use with scope invalidation and gives invalidation fair queue priority. */
internal class BorrowedNativeScope {
    private val lock = ReentrantLock(true)
    private var active = true
    private val invalidationCleanups = mutableListOf<() -> Unit>()

    fun <R> invoke(block: () -> R): R = lock.withLock {
        check(active) { "Native borrow is no longer active" }
        block()
    }

    fun clearOnInvalidate(cleanup: () -> Unit) {
        lock.withLock {
            check(active) { "Native borrow is no longer active" }
            invalidationCleanups += cleanup
        }
    }

    fun invalidate() {
        lock.withLock {
            active = false
            invalidationCleanups.forEach { it() }
            invalidationCleanups.clear()
        }
    }
}

/**
 * Opens a lexical borrow of this callback-owned dragging info.
 *
 * Call this from the Objective-C callback that supplied the receiver. The borrowed wrapper is
 * invalid after [block] returns and cannot be retained through this API.
 */
fun <R> NSDraggingInfo.withBorrowed(block: (BorrowedNSDraggingInfo) -> R): R {
    val scope = BorrowedNativeScope()
    val borrowed = BorrowedNSDraggingInfo(this, scope)
    return try {
        block(borrowed)
    } finally {
        scope.invalidate()
    }
}

/**
 * Copies this native data into a detached JVM byte array after enforcing [maxBytes].
 *
 * The native length is validated before either the destination array is allocated or the bytes
 * pointer is queried.
 */
fun NSData.copyToByteArray(maxBytes: Int): ByteArray {
    require(maxBytes >= 0) { "maxBytes must be non-negative" }
    val byteCount = length()
    require(byteCount in 0..maxBytes.toLong()) {
        "NSData length $byteCount exceeds maxBytes $maxBytes"
    }
    if (byteCount == 0L) return ByteArray(0)

    val source = bytes()
    check(source != MemorySegment.NULL) { "NSData returned nil bytes for non-empty data" }
    val result = ByteArray(byteCount.toInt())
    MemorySegment.copy(
        source.reinterpret(byteCount),
        ValueLayout.JAVA_BYTE,
        0,
        result,
        0,
        result.size,
    )
    return result
}

/** One successful, explicitly balanced security-scoped URL access claim. */
class SecurityScopedUrlAccess private constructor(
    private val url: NSURL,
) : AutoCloseable {
    private val closed = AtomicBoolean()

    override fun close() {
        if (!closed.compareAndSet(false, true)) return
        try {
            url.stopAccessingSecurityScopedResource()
        } finally {
            SecurityScopedUrlNativeLifetime.release(url)
        }
    }

    companion object {
        /**
         * Retains [url] and starts security-scoped access.
         *
         * Returns `null` when the platform declines access. In that case the retain is released
         * immediately and `stopAccessingSecurityScopedResource` is not called.
         */
        fun acquire(url: NSURL): SecurityScopedUrlAccess? {
            SecurityScopedUrlNativeLifetime.retain(url)
            val started = try {
                url.startAccessingSecurityScopedResource()
            } catch (failure: Throwable) {
                try {
                    SecurityScopedUrlNativeLifetime.release(url)
                } catch (releaseFailure: Throwable) {
                    failure.addSuppressed(releaseFailure)
                }
                throw failure
            }
            if (!started) {
                SecurityScopedUrlNativeLifetime.release(url)
                return null
            }
            return SecurityScopedUrlAccess(url)
        }
    }
}

internal object SecurityScopedUrlNativeLifetime {
    private data class Override(
        val retain: (NSURL) -> Unit,
        val release: (NSURL) -> Unit,
    )

    private val override = AtomicReference<Override?>()

    fun retain(url: NSURL) {
        override.get()?.retain?.invoke(url) ?: ObjCManagedRuntime.retain(url.ptr)
    }

    fun release(url: NSURL) {
        override.get()?.release?.invoke(url) ?: ObjCManagedRuntime.release(url.ptr)
    }

    fun installOverrideForTest(
        retain: (NSURL) -> Unit,
        release: (NSURL) -> Unit,
    ): AutoCloseable {
        val installed = Override(retain, release)
        check(override.compareAndSet(null, installed)) {
            "Security-scoped URL lifetime test override is already installed"
        }
        return AutoCloseable {
            check(override.compareAndSet(installed, null)) {
                "Security-scoped URL lifetime test override changed before close"
            }
        }
    }
}
