package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

/** One COM identity with three interface pointers and independently revocable application work. */
internal class Win32TextComObject(
    internal val document: Win32TextDocument,
    internal val hwnd: Long,
    internal val configuration: Win32TextConfiguration,
    internal val limits: Win32TextLimits,
    private val onFailure: (Throwable) -> Unit,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private val arena = Arena.ofShared()
    private val references = AtomicInteger(1)
    private val calls = AtomicInteger()
    private val reaped = AtomicBoolean()
    private val ownerClosed = AtomicBoolean()
    private val gate = Win32ComCallbackGate()
    private val interfaces = Win32TextComBridge.register(this, arena)
    internal val address: Long get() = interfaces[0].address()
    internal var sink = 0L
    internal var sinkMask = 0
    internal var sinkEpoch = 0L
    internal var cursor: Pair<Long, Win32WindowRect>? = null
    internal var requestedScope = false
    internal var compositionView = 0L
    internal val nativeCalls: Int get() = calls.get()
    private val methods = Win32TextStoreMethods(this)
    init { document.beforeWriteUnlock = methods::syncComposition }

    fun enterNative() { calls.incrementAndGet() }
    fun leaveNative() { calls.decrementAndGet(); reap() }
    fun report(failure: Throwable) { runCatching { onFailure(failure) } }

    fun dispatch(slot: Int, args: Array<Any>, kind: Int = 0): Int = try {
        Win32TextComBridge.initializeOutputs(kind, slot, args)
        when (slot) {
            0 -> queryInterface(args[0] as MemorySegment, args[1] as MemorySegment)
            1 -> references.incrementAndGet()
            2 -> references.decrementAndGet().also { check(it >= 0); reap() }
            else -> {
                if (thread !== Thread.currentThread()) throw Win32TextException(0x8001010e.toInt())
                // Native teardown still needs these callbacks after application admission closes.
                if (kind == 0 && slot == 4) methods.dispatch(slot, args)
                else if (kind == 1 && slot == 5) methods.composition(slot, args)
                else gate.call(0x80010108.toInt()) {
                    when (kind) {
                        0 -> methods.dispatch(slot, args)
                        1 -> methods.composition(slot, args)
                        2 -> methods.inputScope(slot, args)
                        else -> 0x80004002.toInt()
                    }
                }
            }
        }
    } catch (failure: Throwable) {
        if (failure !is Win32TextException || failure.hresult == Win32TextDocument.OUT_OF_MEMORY) report(failure)
        if (failure is Win32TextException) failure.hresult else 0x80004005.toInt()
    }

    private fun queryInterface(iid: MemorySegment, output: MemorySegment): Int {
        Win32TextComAbi.requirePointer(output)
        val index = when {
            Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) || Win32TextComAbi.matches(iid, Win32TextComAbi.TEXT_STORE) -> 0
            Win32TextComAbi.matches(iid, Win32TextComAbi.COMPOSITION_SINK) -> 1
            Win32TextComAbi.matches(iid, Win32TextComAbi.INPUT_SCOPE) -> 2
            else -> return 0x80004002.toInt()
        }
        references.incrementAndGet()
        Win32TextComAbi.writePointer(output, interfaces[index].address())
        return 0
    }

    fun revoke() { gate.revoke() }

    override fun close() {
        if (thread !== Thread.currentThread()) throw Win32TextException(0x8001010e.toInt())
        if (!ownerClosed.compareAndSet(false, true)) return
        gate.revoke {
            val oldSink = sink
            val oldComposition = compositionView
            sink = 0
            sinkEpoch++
            compositionView = 0
            Win32TextComAbi.release(oldSink)
            Win32TextComAbi.release(oldComposition)
            document.close()
            references.decrementAndGet()
            reap()
        }
    }

    private fun reap() {
        if (references.get() != 0 || calls.get() != 0 || !reaped.compareAndSet(false, true)) return
        Win32TextComBridge.unregister(interfaces)
        val advised = sink
        sink = 0
        try { Win32TextComAbi.release(advised) }
        finally { arena.close() }
    }
}
