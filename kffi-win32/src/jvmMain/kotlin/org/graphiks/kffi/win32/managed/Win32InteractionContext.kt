package org.graphiks.kffi.win32.managed

import java.util.concurrent.atomic.AtomicBoolean

/** Thread-owned Windows recognizer; revocation is immediate on any thread. */
public class Win32InteractionContext private constructor(
    private val port: Win32InteractionPort, private val maxPointers: Int,
    private val onOutput: (Win32InteractionOutput) -> Unit, private val onFailure: (Throwable) -> Unit,
    private val targetHwnd: Long?,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private val gate = Win32ComCallbackGate()
    private val closeRequested = AtomicBoolean()
    private val closePosted = AtomicBoolean()
    private var ready = false
    private var depth = 0
    private var callbackDepth = 0
    private var lastFrame: Int? = null
    private var failure: Win32InteractionException? = null
    internal var nativeClosed: Boolean = false
        private set
    private lateinit var installed: Win32InteractionConfiguration
    public val configuration: Win32InteractionConfiguration get() = installed

    private fun configure(): Win32InteractionConfiguration {
        port.setProperty(1, 1) // Screen pixels (Microsoft WPF InteractionMeasurementUnits.Screen).
        port.setProperty(3, 0) // Submit the admitted frame set directly; native pointer filtering is disabled.
        port.setConfiguration(0x1f, 0x3) // Translation, scaling, rotation, double tap; no inertia.
        val units = port.getProperty(1); val filter = port.getProperty(3)
        val (manipulation, tap) = port.getConfiguration()
        if (units != 1 || filter != 0 || manipulation != 0x1f || tap != 3) throw Win32InteractionException(0x80004005.toInt())
        return Win32InteractionConfiguration(true, true, true, true, true)
    }

    private fun accept(output: Win32InteractionOutput) {
        gate.call(Unit) {
            if (!ready || Thread.currentThread() !== thread) return@call
            callbackDepth++
            try {
                if (output.flags and 8 != 0) throw Win32InteractionException(0x80004005.toInt())
                onOutput(output)
            } catch (problem: Throwable) { fail(problem) }
            finally { callbackDepth--; if (depth == 0 && closeRequested.get()) postReap() else reap() }
        }
    }

    public fun process(batch: Win32PointerBatch) {
        owner(); check(ready && !closeRequested.get()) { "Interaction context is closed" }
        check(depth == 0 && callbackDepth == 0) { "Reentrant interaction processing" }
        batch.borrow(::processFrames)
    }

    private fun processFrames(source: List<Win32PointerFrame>) {
        val frames = if (targetHwnd == null) source else source.mapNotNull { frame ->
            val count = frame.pointers.count { it.target == targetHwnd }
            require(count <= maxPointers)
            if (count == 0) null else Win32PointerFrame(frame.frameId, frame.pointers.filter { it.target == targetHwnd })
        }
        frames.forEach { frame ->
            require(frame.pointers.size in 1..maxPointers)
            require(frame.pointers.all { it.id > 0 && it.type in 2..3 })
            require(frame.pointers.map { it.id }.toSet().size == frame.pointers.size)
        }
        frames.zipWithNext().forEach { (newer, older) -> require(after(newer.frameId, older.frameId)) { "Pointer history must be newest first" } }
        val fresh = frames.filter { frame -> lastFrame?.let { after(frame.frameId, it) } ?: true }
        // Split contact-set transitions, then submit each group newest-first in chronological group order.
        val groups = mutableListOf<MutableList<Win32PointerFrame>>()
        for (frame in fresh.asReversed()) {
            val ids = frame.pointers.map { it.id }.toSet()
            val group = groups.lastOrNull()
            if (group == null || group.last().pointers.map { it.id }.toSet() != ids) groups += mutableListOf(frame)
            else group += frame
        }
        depth++
        try {
            for (group in groups) {
                if (closeRequested.get()) break
                port.process(group.asReversed().map { frame -> frame.copy(pointers = frame.pointers.sortedBy { it.id }) })
                lastFrame = group.last().frameId
                failure?.let { throw it }
            }
        } catch (problem: Throwable) { fail(problem); throw requireNotNull(failure) }
        finally { depth--; reap() }
    }

    public fun reset() {
        owner(); check(ready && !closeRequested.get()); check(depth == 0 && callbackDepth == 0)
        ready = false
        try {
            // Windows history can still contain packets already submitted before reset.
            // Frame IDs belong to the input stream, not to the recognizer instance.
            port.reset(); installed = configure()
            port.setOutput(::accept, ::fail) // ResetInteractionContext clears the native output registration too.
            ready = true
        }
        catch (problem: Throwable) { fail(problem); throw requireNotNull(failure) }
    }
    public fun revoke() { gate.revoke(); closeRequested.set(true) }
    override fun close() {
        revoke()
        if (Thread.currentThread() === thread) reap()
        else postReap()
    }
    private fun postReap() {
        if (closePosted.compareAndSet(false, true)) {
            try { port.postOwner { closePosted.set(false); reap() } }
            catch (problem: Throwable) { closePosted.set(false); throw problem }
        }
    }
    private fun owner() { if (Thread.currentThread() !== thread) throw Win32InteractionException(0x8001010e.toInt()) }
    private fun reap() {
        if (Thread.currentThread() !== thread || !closeRequested.get() || nativeClosed || depth != 0 || callbackDepth != 0) return
        ready = false; nativeClosed = true; port.destroy()
    }
    private fun fail(problem: Throwable) {
        if (failure != null) return
        val sanitized = problem as? Win32InteractionException ?: Win32InteractionException(0x80004005.toInt())
        failure = sanitized
        close()
        try { onFailure(sanitized) } catch (_: Throwable) { }
    }
    public companion object {
        public fun open(maxPointers: Int, targetHwnd: Long? = null, onFailure: (Throwable) -> Unit = {},
            onOutput: (Win32InteractionOutput) -> Unit): Win32InteractionContext {
            require(maxPointers > 0)
            if (Thread.currentThread().isVirtual) throw Win32InteractionException(0x8001010e.toInt())
            require(targetHwnd == null || targetHwnd != 0L)
            return open(Win32NativeInteractionPort.open(), maxPointers, onOutput, onFailure, targetHwnd)
        }
        internal fun open(port: Win32InteractionPort, maxPointers: Int, onOutput: (Win32InteractionOutput) -> Unit,
            onFailure: (Throwable) -> Unit = {}, targetHwnd: Long? = null): Win32InteractionContext {
            require(maxPointers > 0)
            val context = Win32InteractionContext(port, maxPointers, onOutput, onFailure, targetHwnd)
            try {
                context.installed = context.configure()
                port.setOutput(context::accept, context::fail)
                context.ready = true
                return context
            } catch (problem: Throwable) { context.close(); throw problem }
        }
        private fun after(newer: Int, older: Int): Boolean = ((newer.toLong() - older.toLong()) and 0xffffffffL) in 1..0x7fffffffL
    }
}
