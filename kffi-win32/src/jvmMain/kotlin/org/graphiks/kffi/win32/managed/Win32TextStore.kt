package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean
import org.graphiks.kffi.win32.generated.GetFocus

/** One bounded UTF-16 receiver, backed by a real TSF document/context on its HWND thread. */
public class Win32TextStore internal constructor(
    private val services: Win32TextServices,
    internal val hwnd: Long,
    initial: Win32TextSnapshot,
    private val configuration: Win32TextConfiguration,
    private val limits: Win32TextLimits,
    private val onChange: (Win32TextChange) -> Boolean,
    private val onFailure: (Throwable) -> Unit,
) : AutoCloseable {
    private val admitted = AtomicBoolean(true)
    private val closing = AtomicBoolean()
    private val resources = Win32ComResources()
    private var active = false
    private var focused = false
    private var accepted = initial
    private val document = Win32TextDocument(initial, limits, ::observe)
    private val com = Win32TextComObject(document, hwnd, configuration, limits, ::fail)
    private var documentManager = 0L
    internal var contextAddress: Long = 0
        private set
    internal val nativeAddress: Long get() = com.address
    internal val nativeCalls: Int get() = com.nativeCalls
    @Volatile internal var nativeClosed: Boolean = false
        private set
    internal val acceptsKeys: Boolean get() = admitted.get() && active && focused
    private var previousFocus = 0L
    private data class PendingObservation(val value: Win32TextChange, val lease: AutoCloseable)
    private val beforeActivation = ArrayDeque<PendingObservation>()
    private val characters = ArrayDeque<PendingCharacter>()
    private var queuedUnits = 0
    private var highSurrogate: PendingCharacter? = null
    private var processingCharacter: PendingCharacter? = null
    private var drainingCharacters = false

    internal fun openNative() = Arena.ofConfined().use { arena ->
        val output = arena.allocate(ValueLayout.ADDRESS)
        Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 5, "p", output))
        documentManager = resources.own(output.get(ValueLayout.ADDRESS, 0).address(), Win32TextComAbi::release)
        output.set(ValueLayout.ADDRESS, 0, MemorySegment.NULL)
        val cookie = arena.allocate(4, 4)
        Win32TextComAbi.check(Win32TextComAbi.call(documentManager, 3, "iippp", services.clientId, 0,
            MemorySegment.ofAddress(com.address), output, cookie))
        contextAddress = resources.own(output.get(ValueLayout.ADDRESS, 0).address(), Win32TextComAbi::release)
        Win32TextComAbi.check(Win32TextComAbi.call(documentManager, 4, "p", MemorySegment.ofAddress(contextAddress)))
        resources.defer { Win32TextComAbi.check(Win32TextComAbi.call(documentManager, 5, "i", 1)) }
    }

    public fun activate() {
        services.checkThread()
        checkAdmitted()
        if (active) return
        try { activateReceiver() }
        catch (failure: Throwable) { fail(failure); throw failure }
    }

    private fun activateReceiver() {
        Arena.ofConfined().use { arena ->
            val previous = arena.allocate(ValueLayout.ADDRESS)
            Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 9, "ppp", MemorySegment.ofAddress(hwnd),
                MemorySegment.ofAddress(documentManager), previous))
            val old = previous.get(ValueLayout.ADDRESS, 0).address()
            resources.defer {
                try { Arena.ofConfined().use { cleanup ->
                    val removed = cleanup.allocate(ValueLayout.ADDRESS)
                    Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 9, "ppp", MemorySegment.ofAddress(hwnd),
                        MemorySegment.ofAddress(old), removed))
                    Win32TextComAbi.release(removed.get(ValueLayout.ADDRESS, 0).address())
                } } finally { Win32TextComAbi.release(old) }
            }
        }
        active = true
        while (admitted.get() && beforeActivation.isNotEmpty()) {
            val observation = beforeActivation.removeFirst()
            val accepted = try { onChange(observation.value) } finally { observation.lease.close() }
            if (!accepted) { close(); throw Win32TextException(Win32TextDocument.DISCONNECTED) }
        }
        if (GetFocus().address() == hwnd) setFocused(true)
    }

    public fun setFocused(focused: Boolean) {
        services.checkThread()
        if (!admitted.get() || !active || this.focused == focused) return
        Arena.ofConfined().use { arena ->
            val output = arena.allocate(ValueLayout.ADDRESS)
            Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 7, "p", output))
            val current = output.get(ValueLayout.ADDRESS, 0).address()
            if (focused) {
                previousFocus = if (current == documentManager) 0 else current
                if (current == documentManager) Win32TextComAbi.release(current)
                try { Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 8, "p", MemorySegment.ofAddress(documentManager))) }
                catch (failure: Throwable) { Win32TextComAbi.release(previousFocus); previousFocus = 0; throw failure }
            } else {
                try { if (current == documentManager) Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 8, "p", MemorySegment.ofAddress(previousFocus))) }
                finally { Win32TextComAbi.release(current); Win32TextComAbi.release(previousFocus); previousFocus = 0 }
            }
        }
        this.focused = focused
        if (!focused) {
            characters.forEach(::finish); characters.clear()
            highSurrogate?.let(::finish); highSurrogate = null
            processingCharacter?.let(::finish)
        }
    }

    public fun apply(snapshot: Win32TextSnapshot) {
        services.checkThread()
        checkAdmitted()
        // Sink notifications may not be sent from inside ITextStoreACP::RequestLock.
        if (com.nativeCalls != 0) throw Win32TextException(Win32TextDocument.SYNCHRONOUS)
        val before = document.peek()
        val lease = retain(before.text.length.toLong() * 2)
        lease.use {
            document.apply(snapshot, drainLocks = false)
            checkAdmitted()
            accepted = snapshot
            if (!drainingCharacters) {
                notifyDocument(before, document.peek())
                notifyLayout()
                checkAdmitted()
                document.drainPendingLocks()
            }
        }
        if (!drainingCharacters) drainCharacters()
    }

    public fun updateCursor(rect: Win32WindowRect, epoch: Long) {
        services.checkThread()
        checkAdmitted()
        if (epoch != accepted.epoch || rect.width < 0 || rect.height < 0) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
        com.updateCursor(epoch, rect)
        notifyLayout()
    }

    private fun notifyLayout() {
        if (com.sink != 0L && com.sinkMask and 4 != 0) Win32TextComAbi.check(Win32TextComAbi.call(com.sink, 5, "ii", 0, 1))
    }

    private fun observe(change: Win32TextChange): Boolean {
        if (!admitted.get()) return false
        if (!active) {
            if (beforeActivation.size >= limits.maxCollectionElements) { fail(Win32TextException(Win32TextDocument.OUT_OF_MEMORY)); return false }
            val bytes = when (change) {
                is Win32TextChange.Replace -> change.text.length.toLong() * 2
                is Win32TextChange.Composition -> change.text.length.toLong() * 2
                else -> 0
            }
            val lease = limits.payloadBudget.retain(bytes)
                ?: run { fail(Win32TextException(Win32TextDocument.OUT_OF_MEMORY)); return false }
            beforeActivation.addLast(PendingObservation(change, lease))
            return true
        }
        return try { onChange(change).also { if (!it) close() } }
        catch (failure: Throwable) { fail(failure); false }
    }

    public fun handleCharacter(message: Int, wParam: Long, lParam: Long): Long? {
        if (!admitted.get() || !active) return null
        services.checkThread()
        if (message == 0x109 && wParam == 0xffffL) return 1
        if (!focused) return null
        if (message == 0x286) return 0 // IMM compatibility must not echo an already committed TSF edit.
        if (message != 0x102 && message != 0x109) return null
        try {
            val units = if (message == 0x102) {
                if (wParam !in 0L..0xffffL) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
                1
            } else {
                if (wParam !in 0L..0x10ffffL || wParam in 0xd800L..0xdfffL) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
                if (wParam >= 0x10000) 2 else 1
            }
            val count = (lParam and 0xffff).toInt()
            if (count <= 0) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
            if (units.toLong() * count > limits.maxPendingCharacters - queuedUnits) throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)
            repeat(count) {
                val lease = retain(units.toLong() * 2)
                val text = try {
                    if (message == 0x102) wParam.toInt().toChar().toString()
                    else String(Character.toChars(wParam.toInt()))
                } catch (failure: Throwable) { lease.close(); throw failure }
                characters.addLast(PendingCharacter(text, lease))
                queuedUnits += units
            }
            drainCharacters()
        } catch (failure: Throwable) { fail(failure) }
        return 0
    }

    private fun drainCharacters() {
        if (drainingCharacters || !admitted.get() || !active) return
        drainingCharacters = true
        try {
            while (admitted.get() && characters.isNotEmpty() && document.canWrite) {
                val entry = characters.removeFirst()
                processingCharacter = entry
                val before = document.peek()
                val beforeLease = retain(before.text.length.toLong() * 2)
                try {
                    val result = document.requestLock(7) { processCharacter(entry); 0 }
                    Win32TextComAbi.check(result.result)
                    Win32TextComAbi.check(result.sessionResult)
                    if (admitted.get()) {
                        notifyDocument(before, document.peek())
                        notifyLayout()
                        if (admitted.get()) document.drainPendingLocks()
                    }
                } finally {
                    beforeLease.close()
                    if (highSurrogate !== entry) finish(entry)
                    processingCharacter = null
                }
            }
        } finally { drainingCharacters = false }
    }

    private fun processCharacter(entry: PendingCharacter) {
        if (!admitted.get()) return
        val value = entry.text
        val high = highSurrogate
        val text = if (high != null) {
            if (value.length != 1 || !value[0].isLowSurrogate()) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
            highSurrogate = null
            (high.text + value).also { finish(high) }
        } else {
            if (value.length == 1 && value[0].isHighSurrogate()) { highSurrogate = entry; return }
            if (value.length == 1 && value[0].isLowSurrogate()) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
            value
        }
        val snapshot = document.read()
        if (!configuration.multiline && (text == "\r" || text == "\n")) {
            if (!observe(Win32TextChange.Submit(snapshot.epoch))) close()
        } else if (text.length != 1 || text[0] >= ' ' || configuration.multiline && (text == "\r" || text == "\n")) {
            document.setText(snapshot.selection.start, snapshot.selection.endExclusive, text)
        }
        // Editing/navigation controls stay in the physical-key lane; no guessed grapheme delete.
    }

    private fun notifyDocument(before: Win32TextSnapshot, after: Win32TextSnapshot) {
        val sink = com.sink
        if (sink == 0L) return
        if (before.text != after.text && com.sinkMask and 1 != 0) Arena.ofConfined().use { arena ->
            val change = arena.allocate(12, 4)
            change.set(ValueLayout.JAVA_INT, 0, 0)
            change.set(ValueLayout.JAVA_INT, 4, before.text.length)
            change.set(ValueLayout.JAVA_INT, 8, after.text.length)
            Win32TextComAbi.check(Win32TextComAbi.call(sink, 3, "ip", 0, change))
        }
        if (admitted.get() && com.sink == sink && before.selection != after.selection && com.sinkMask and 2 != 0)
            Win32TextComAbi.check(Win32TextComAbi.call(sink, 4, ""))
    }

    private fun retain(bytes: Long): AutoCloseable = limits.payloadBudget.retain(bytes)
        ?: throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)

    private class PendingCharacter(val text: String, val lease: AutoCloseable) { var finished = false }
    private fun finish(entry: PendingCharacter) {
        if (entry.finished) return
        entry.finished = true
        queuedUnits -= entry.text.length
        entry.lease.close()
    }
    public fun revoke() { admitted.set(false); com.revoke() }

    override fun close() {
        if (!closing.compareAndSet(false, true)) return
        admitted.set(false)
        com.revoke()
        services.closeStore(this)
    }

    internal fun closeNative() {
        services.checkThread()
        if (nativeClosed) return
        admitted.set(false)
        com.revoke()
        try {
            if (focused) {
                // Revoke has already shut the application gate; native focus cleanup remains valid.
                Arena.ofConfined().use { arena ->
                    val current = arena.allocate(ValueLayout.ADDRESS)
                    Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 7, "p", current))
                    val focus = current.get(ValueLayout.ADDRESS, 0).address()
                    try { if (focus == documentManager) Win32TextComAbi.check(Win32TextComAbi.call(services.managerAddress, 8, "p", MemorySegment.ofAddress(previousFocus))) }
                    finally { Win32TextComAbi.release(focus) }
                }
            }
        } finally {
            Win32TextComAbi.release(previousFocus); previousFocus = 0
            accepted = Win32TextSnapshot("", Win32TextRange(0, 0), accepted.epoch)
            beforeActivation.forEach { it.lease.close() }; beforeActivation.clear()
            characters.forEach(::finish); characters.clear()
            highSurrogate?.let(::finish); highSurrogate = null
            processingCharacter?.let(::finish); processingCharacter = null
            try { resources.close() }
            finally { com.close(); nativeClosed = true; active = false; focused = false }
        }
    }

    internal fun fail(failure: Throwable) { close(); report(failure) }
    internal fun report(failure: Throwable) { runCatching { onFailure(failure) } }
    internal fun checkAdmitted() { if (!admitted.get()) throw Win32TextException(Win32TextDocument.DISCONNECTED) }
}
