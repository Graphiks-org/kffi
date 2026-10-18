package org.graphiks.kffi.win32.managed

/** STA-confined text state. Native locks never outlive the supplied grant callback. */
internal class Win32TextDocument(
    initial: Win32TextSnapshot,
    private val limits: Win32TextLimits,
    private val onChange: (Win32TextChange) -> Boolean,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private var accepted = initial
    private var viewText = initial.text
    private var viewSelection = initial.selection
    private var viewLayout = Any()
    private var acceptedLayout = viewLayout
    private var acceptedLease: AutoCloseable? = null
    private var viewLease: AutoCloseable? = null
    private var changeLease: AutoCloseable? = null
    private var composition: Composition? = null
    private var lock = 0
    private var dirty = false
    private var endedComposition = false
    private var awaitingCommit = false
    private var notifying = false
    private var draining = false
    private var closed = false
    private var pending: LockRequest? = null
    var beforeWriteUnlock: (() -> Unit)? = null

    init {
        try {
            acceptedLease = retain(initial.text.length)
            viewLease = retain(initial.text.length)
        } catch (failure: Throwable) {
            acceptedLease?.close()
            throw failure
        }
    }

    fun read(): Win32TextSnapshot {
        checkOpen()
        if (lock == 0) fail(NO_LOCK)
        return Win32TextSnapshot(viewText, viewSelection, accepted.epoch)
    }

    /** Internal application-side view; COM readers still use [read] under a document lock. */
    fun peek(): Win32TextSnapshot { checkOpen(); return Win32TextSnapshot(viewText, viewSelection, accepted.epoch) }
    fun bindCursor(epoch: Long, rect: Win32WindowRect): Win32TextCaret {
        checkOpen()
        if (epoch != accepted.epoch) fail(INVALID_ARGUMENT)
        return Win32TextCaret(epoch, accepted.selection.endExclusive, acceptedLayout, rect)
    }
    fun hasLayout(caret: Win32TextCaret): Boolean {
        checkOpen()
        return caret.epoch == accepted.epoch && caret.layout === viewLayout
    }
    val canWrite: Boolean get() { checkOpen(); return lock == 0 && !notifying && !awaitingCommit && pending == null }
    fun drainPendingLocks() { checkOpen(); drain() }

    fun requestLock(flags: Int, grant: (Int) -> Int): Win32TextLockResult {
        checkOpen()
        val access = flags and READWRITE
        if (flags and 7.inv() != 0 || access != READ && access != READWRITE) fail(INVALID_ARGUMENT)
        if (lock != 0 || notifying || access == READWRITE && awaitingCommit) {
            if (flags and SYNC != 0) return Win32TextLockResult(0, SYNCHRONOUS)
            val old = pending
            if (old == null || access == READWRITE) pending = LockRequest(access, grant)
            return Win32TextLockResult(0, ASYNC)
        }
        val result = grantNow(access, grant)
        drain()
        return Win32TextLockResult(0, result)
    }

    fun setText(start: Int, endExclusive: Int, text: String) {
        checkWrite()
        checkRange(start, endExclusive, viewText.length)
        val size = viewText.length.toLong() - (endExclusive - start) + text.length
        if (size > limits.maxCodeUnits) fail(OUT_OF_MEMORY)
        val lease = retain(size.toInt())
        val next = try { viewText.replaceRange(start, endExclusive, text) }
        catch (failure: Throwable) { lease.close(); throw failure }
        val delta = text.length - (endExclusive - start)
        composition = composition?.let { current ->
            val range = current.nativeRange
            val nextRange = when {
                endExclusive <= range.start -> Win32TextRange(range.start + delta, range.endExclusive + delta)
                start >= range.start && endExclusive <= range.endExclusive -> Win32TextRange(range.start, range.endExclusive + delta)
                start >= range.endExclusive -> range
                else -> { lease.close(); fail(INVALID_ARGUMENT) }
            }
            current.copy(nativeRange = nextRange)
        }
        viewLease?.close()
        viewLease = lease
        viewText = next
        viewSelection = Win32TextRange(start + text.length, start + text.length)
        viewLayout = Any()
        dirty = true
    }

    fun setSelection(start: Int, endExclusive: Int) {
        checkWrite()
        checkRange(start, endExclusive, viewText.length)
        viewSelection = Win32TextRange(start, endExclusive)
        viewLayout = Any()
        dirty = true
    }

    /** [range] is in the provisional native view; [selection] is relative to preedit text. */
    fun setComposition(range: Win32TextRange?, selection: Win32TextRange?) {
        checkWrite()
        if ((range == null) != (selection == null)) fail(INVALID_ARGUMENT)
        if (range == null) {
            endedComposition = composition != null
            composition = null
        } else {
            checkRange(range.start, range.endExclusive, viewText.length)
            if (checkNotNull(selection).endExclusive > range.endExclusive - range.start) fail(INVALID_ARGUMENT)
            val base = composition?.baseRange ?: difference()?.range ?: range
            checkRange(base.start, base.endExclusive, accepted.text.length)
            composition = Composition(base, range, selection)
        }
        viewLayout = Any()
        dirty = true
    }

    fun apply(snapshot: Win32TextSnapshot, drainLocks: Boolean = true) {
        checkOpen()
        if (lock != 0 || snapshot.epoch < accepted.epoch) fail(INVALID_ARGUMENT)
        if (snapshot.epoch == accepted.epoch) {
            if (snapshot != accepted) fail(INVALID_ARGUMENT)
            return
        }
        val current = composition
        val rebased = current?.let {
            val preedit = viewText.substring(it.nativeRange.start, it.nativeRange.endExclusive)
            if (accepted.text.replaceRange(it.baseRange.start, it.baseRange.endExclusive, preedit) != snapshot.text) fail(INVALID_ARGUMENT)
            val range = Win32TextRange(it.baseRange.start, it.baseRange.start + preedit.length)
            it.copy(baseRange = range, nativeRange = range)
        }
        val nextAccepted = retain(snapshot.text.length)
        val nextView = try { retain(snapshot.text.length) }
        catch (failure: Throwable) { nextAccepted.close(); throw failure }
        acceptedLease?.close()
        viewLease?.close()
        changeLease?.close()
        acceptedLease = nextAccepted
        viewLease = nextView
        changeLease = null
        accepted = snapshot
        viewText = snapshot.text
        viewSelection = snapshot.selection
        viewLayout = Any()
        acceptedLayout = viewLayout
        composition = rebased
        awaitingCommit = false
        if (drainLocks && !notifying) drain()
    }

    private fun grantNow(access: Int, grant: (Int) -> Int): Int {
        lock = access
        dirty = false
        endedComposition = false
        val result = try { grant(access).also { if (!closed && access == READWRITE) beforeWriteUnlock?.invoke() } }
        catch (failure: Throwable) { close(); throw failure }
        finally { lock = 0 }
        if (!closed && dirty) flush()
        return result
    }

    private fun flush() {
        val current = composition
        var lease: AutoCloseable? = null
        val change = try {
            if (current != null) {
                val range = current.nativeRange
                lease = retain(range.endExclusive - range.start)
                Win32TextChange.Composition(current.baseRange, viewText.substring(range.start, range.endExclusive), current.selection, accepted.epoch)
            } else {
                val difference = difference()
                when {
                    difference != null -> {
                        lease = retain(difference.end - difference.start)
                        Win32TextChange.Replace(difference.range, viewText.substring(difference.start, difference.end), accepted.epoch)
                    }
                    endedComposition -> Win32TextChange.Composition(null, "", null, accepted.epoch)
                    viewSelection != accepted.selection -> Win32TextChange.Selection(viewSelection, accepted.epoch)
                    else -> return
                }
            }
        } catch (failure: Throwable) { lease?.close(); close(); throw failure }
        changeLease?.close()
        changeLease = lease
        if (change is Win32TextChange.Replace || change is Win32TextChange.Selection) awaitingCommit = true
        notifying = true
        try { if (!onChange(change)) close() }
        catch (failure: Throwable) { close(); throw failure }
        finally { notifying = false }
    }

    /** Minimal base replacement, widened at both edges to preserve UTF-16 pairs. */
    private fun difference(): Difference? {
        val base = accepted.text
        if (base == viewText) return null
        var start = 0
        while (start < base.length && start < viewText.length && base[start] == viewText[start]) start++
        if (splitsPair(base, start) || splitsPair(viewText, start)) start--
        var baseEnd = base.length
        var viewEnd = viewText.length
        while (baseEnd > start && viewEnd > start && base[baseEnd - 1] == viewText[viewEnd - 1]) { baseEnd--; viewEnd-- }
        if (splitsPair(base, baseEnd) || splitsPair(viewText, viewEnd)) { baseEnd++; viewEnd++ }
        return Difference(Win32TextRange(start, baseEnd), start, viewEnd)
    }

    private fun drain() {
        if (draining || notifying) return
        draining = true
        try {
            var granted = 0
            while (!closed) {
                val next = pending ?: break
                if (next.access == READWRITE && awaitingCommit) break
                if (++granted > limits.maxCollectionElements) { close(); fail(OUT_OF_MEMORY) }
                pending = null
                grantNow(next.access, next.grant)
            }
        } finally { draining = false }
    }

    private fun retain(codeUnits: Int): AutoCloseable {
        if (codeUnits < 0 || codeUnits > limits.maxCodeUnits) fail(OUT_OF_MEMORY)
        return limits.payloadBudget.retain(codeUnits.toLong() * 2) ?: fail(OUT_OF_MEMORY)
    }

    private fun checkOpen() {
        if (Thread.currentThread() !== thread) fail(WRONG_THREAD)
        if (closed) fail(DISCONNECTED)
    }

    private fun checkWrite() { checkOpen(); if (lock != READWRITE) fail(NO_LOCK) }
    private fun checkRange(start: Int, end: Int, length: Int) { if (start < 0 || end < start || end > length) fail(INVALID_ARGUMENT) }

    override fun close() {
        if (Thread.currentThread() !== thread) fail(WRONG_THREAD)
        if (closed) return
        closed = true
        pending = null
        composition = null
        accepted = Win32TextSnapshot("", Win32TextRange(0, 0), accepted.epoch)
        viewText = ""
        acceptedLease?.close(); acceptedLease = null
        viewLease?.close(); viewLease = null
        changeLease?.close(); changeLease = null
    }

    private data class Composition(val baseRange: Win32TextRange, val nativeRange: Win32TextRange, val selection: Win32TextRange)
    private data class Difference(val range: Win32TextRange, val start: Int, val end: Int)
    private data class LockRequest(val access: Int, val grant: (Int) -> Int)

    companion object {
        const val READ = 2
        const val READWRITE = 6
        const val SYNC = 1
        const val ASYNC = 0x40300
        val NO_LOCK = 0x80040201.toInt()
        val SYNCHRONOUS = 0x80040208.toInt()
        val OUT_OF_MEMORY = 0x8007000e.toInt()
        val INVALID_ARGUMENT = 0x80070057.toInt()
        val WRONG_THREAD = 0x8001010e.toInt()
        val DISCONNECTED = 0x80010108.toInt()
        private fun splitsPair(text: String, at: Int): Boolean = at > 0 && at < text.length && text[at - 1].isHighSurrogate() && text[at].isLowSurrogate()
        private fun fail(hresult: Int): Nothing = throw Win32TextException(hresult)
    }
}

internal data class Win32TextCaret(val epoch: Long, val acp: Int, val layout: Any, val rect: Win32WindowRect)
