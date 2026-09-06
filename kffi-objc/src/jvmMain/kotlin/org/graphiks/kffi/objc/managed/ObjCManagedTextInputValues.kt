package org.graphiks.kffi.objc.managed

import org.graphiks.kffi.objc.NSObject
import org.graphiks.kffi.objc.ObjCRuntime
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/**
 * Owns Objective-C values returned by a managed `NSTextInputClient` callback.
 *
 * Objective-C returns from a Kotlin callback are borrowed by AppKit. The trampoline's local
 * autorelease pool ends before that caller can consume a freshly allocated attributed string, so
 * this owner keeps each result retained until [close]. A client normally creates one owner for
 * the lifetime of one native text-input receiver and drops it before releasing that receiver.
 */
class ObjCManagedTextInputValues : AutoCloseable {
    private val lock = Any()
    private val attributedStrings = linkedMapOf<String, MemorySegment>()
    private var emptyAttributes: MemorySegment? = null
    private var closed = false

    /**
     * Returns a borrowed attributed string that remains valid until this owner is closed.
     * Returns `null` after [close].
     */
    fun attributedString(text: String): NSObject? = synchronized(lock) {
        if (closed) return@synchronized null
        val value = attributedStrings.getOrPut(text) { newAttributedString(text) }
        NSObject(value)
    }

    /**
     * Returns a borrowed empty attributes array that remains valid until this owner is closed.
     * Returns `null` after [close].
     */
    fun markedTextAttributes(): NSObject? = synchronized(lock) {
        if (closed) return@synchronized null
        val value = emptyAttributes ?: newEmptyArray().also { emptyAttributes = it }
        NSObject(value)
    }

    override fun close() {
        val values = synchronized(lock) {
            if (closed) return
            closed = true
            buildList {
                addAll(attributedStrings.values)
                emptyAttributes?.let(::add)
            }.also {
                attributedStrings.clear()
                emptyAttributes = null
            }
        }
        values.forEach(ObjCManagedRuntime::release)
    }

    private fun newAttributedString(text: String): MemorySegment = Arena.ofConfined().use { arena ->
        val allocated = ObjCRuntime.msgSend(
            ValueLayout.ADDRESS,
            ObjCRuntime.getClass("NSAttributedString"),
            ObjCRuntime.sel("alloc"),
        ) as MemorySegment
        var initialized = false
        try {
            val value = ObjCRuntime.msgSend(
                ValueLayout.ADDRESS,
                allocated,
                ObjCRuntime.sel("initWithString:"),
                ObjCRuntime.newNSString(arena, text),
            ) as MemorySegment
            check(value != MemorySegment.NULL) { "NSAttributedString initWithString: returned nil" }
            initialized = true
            value
        } finally {
            if (!initialized) ObjCManagedRuntime.release(allocated)
        }
    }

    private fun newEmptyArray(): MemorySegment = ObjCRuntime.msgSend(
        ValueLayout.ADDRESS,
        ObjCRuntime.getClass("NSArray"),
        ObjCRuntime.sel("new"),
    ) as MemorySegment
}
