package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import java.lang.foreign.*
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference

internal class Win32NativeInteractionPort private constructor(private val handle: MemorySegment) : Win32InteractionPort {
    private val token = nextToken.incrementAndGet().also { check(it > 0) }
    private var callback: ((Win32InteractionOutput) -> Unit)? = null
    private var onFailure: ((Throwable) -> Unit)? = null
    private val command = AtomicReference<(() -> Unit)?>(null)
    private lateinit var endpoint: Win32ControlWindow
    private var destroyed = false
    private var receiving = 0
    private var destroyRequested = false
    override fun setProperty(id: Int, value: Int) = checked(SetPropertyInteractionContext(handle, INTERACTION_CONTEXT_PROPERTY.fromValue(id.toLong()), value))
    override fun getProperty(id: Int): Int = Arena.ofConfined().use { arena ->
        val value = arena.allocate(4, 4); checked(GetPropertyInteractionContext(handle, INTERACTION_CONTEXT_PROPERTY.fromValue(id.toLong()), value)); value.get(ValueLayout.JAVA_INT, 0)
    }
    private fun config(arena: Arena): MemorySegment = arena.allocate(16, 4).also {
        it.set(ValueLayout.JAVA_INT, 0, 1); it.set(ValueLayout.JAVA_INT, 8, 2)
    }
    override fun setConfiguration(manipulation: Int, tap: Int) = Arena.ofConfined().use { arena ->
        val values = config(arena); values.set(ValueLayout.JAVA_INT, 4, manipulation); values.set(ValueLayout.JAVA_INT, 12, tap)
        checked(SetInteractionConfigurationInteractionContext(handle, 2, values))
    }
    override fun getConfiguration(): Pair<Int, Int> = Arena.ofConfined().use { arena ->
        val values = config(arena); checked(GetInteractionConfigurationInteractionContext(handle, 2, values))
        values.get(ValueLayout.JAVA_INT, 4) to values.get(ValueLayout.JAVA_INT, 12)
    }
    override fun setOutput(callback: (Win32InteractionOutput) -> Unit, onFailure: (Throwable) -> Unit) {
        this.callback = callback; this.onFailure = onFailure
        routes[token] = this
        checked(RegisterOutputCallbackInteractionContext(handle, trampoline, MemorySegment.ofAddress(token)))
    }
    override fun process(frames: List<Win32PointerFrame>) = Arena.ofConfined().use { arena ->
        val count = frames.first().pointers.size
        val buffer = arena.allocate(Math.multiplyExact(Math.multiplyExact(frames.size.toLong(), count.toLong()), 96L), 8)
        frames.forEachIndexed { frameIndex, frame -> frame.pointers.forEachIndexed { index, sample ->
            Win32PointerPackets.encode(buffer.asSlice((frameIndex.toLong() * count + index) * 96, 96), frame.frameId, sample)
        } }
        checked(ProcessPointerFramesInteractionContext(handle, frames.size, count, buffer))
    }
    override fun reset() = checked(ResetInteractionContext(handle))
    override fun postOwner(action: () -> Unit) {
        check(command.compareAndSet(null, action))
        if (PostMessageW(MemorySegment.ofAddress(endpoint.hwnd), Win32ControlWindow.COMMAND_MESSAGE, 0, 0) == 0) {
            val error = GetLastError(); command.set(null); throw Win32InteractionException(error)
        }
    }
    override fun destroy() {
        if (destroyed) return
        if (receiving != 0) {
            destroyRequested = true
            if (PostMessageW(MemorySegment.ofAddress(endpoint.hwnd), Win32ControlWindow.COMMAND_MESSAGE, 0, 0) == 0) throw Win32InteractionException(GetLastError())
            return
        }
        destroyed = true
        try { checked(DestroyInteractionContext(handle)) }
        finally { routes.remove(token); callback = null; onFailure = null; command.set(null); if (::endpoint.isInitialized) endpoint.close() }
    }
    private fun receive(output: MemorySegment) {
        receiving++
        try {
            val value = output.reinterpret(80)
            fun int(offset: Long) = value.get(ValueLayout.JAVA_INT, offset)
            fun float(offset: Long): Double? = value.get(ValueLayout.JAVA_FLOAT, offset).toDouble().takeIf { it.isFinite() }
            val id = int(0)
            if (id != 1 && id != 2) return
            callback?.invoke(Win32InteractionOutput(id, int(4), int(8), float(12), float(16),
                if(id == 1) float(20) else null, if(id == 1) float(24) else null,
                if(id == 1) float(28)?.takeIf { it > 0 } else null, if(id == 1) float(36) else null,
                if(id == 2) int(20).takeIf { it > 0 } else null))
        } catch (_: Throwable) { try { onFailure?.invoke(Win32InteractionException(0x80004005.toInt())) } catch (_: Throwable) { } }
        finally { receiving-- }
    }
    companion object {
        private val nextToken = AtomicLong()
        private val routes = ConcurrentHashMap<Long, Win32NativeInteractionPort>()
        private val globalArena = Arena.global()
        private val trampoline: MemorySegment = Linker.nativeLinker().upcallStub(
            MethodHandles.lookup().findStatic(Win32NativeInteractionPort::class.java, "dispatch",
                MethodType.methodType(Void.TYPE, MemorySegment::class.java, MemorySegment::class.java)),
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS), globalArena)
        @JvmStatic private fun dispatch(data: MemorySegment, output: MemorySegment) {
            try { routes[data.address()]?.receive(output) } catch (_: Throwable) { }
        }
        fun open(): Win32NativeInteractionPort {
            requireWin32Input()
            val port = Arena.ofConfined().use { arena ->
                val result = arena.allocate(ValueLayout.ADDRESS); checked(CreateInteractionContext(result))
                Win32NativeInteractionPort(result.get(ValueLayout.ADDRESS, 0))
            }
            try {
                port.endpoint = Win32ControlWindow.open { _, _, _, _ ->
                    port.command.getAndSet(null)?.invoke()
                    if (port.destroyRequested) port.destroy()
                    0
                }
                return port
            } catch (problem: Throwable) { port.destroy(); throw problem }
        }
        private fun checked(result: Int) { if (result < 0) throw Win32InteractionException(result) }
    }
}
