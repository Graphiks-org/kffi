package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

/** Process-lifetime stubs retain only this library's dispatcher, never a drop receiver. */
internal object Win32DropComBridge {
    private val routes = ConcurrentHashMap<Long, Win32DropComObject>()
    private val arena = Arena.global()

    // IDropTarget, in objidl.h order, including IUnknown.
    private val signatures = listOf("pp", "", "", "pipp", "ipp", "", "pipp")

    private val table: MemorySegment by lazy {
        val vtable = arena.allocate(signatures.size * 8L, 8)
        signatures.forEachIndexed { slot, signature ->
            val descriptor = Win32TextComAbi.descriptor(signature)
            val dispatcher = MethodHandles.lookup().findStatic(
                Win32DropComBridge::class.java, "dispatch",
                MethodType.methodType(Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Array<Any>::class.java),
            )
            val target = MethodHandles.insertArguments(dispatcher, 0, slot)
                .asCollector(Array<Any>::class.java, signature.length + 1)
                .asType(descriptor.toMethodType())
            vtable.set(ValueLayout.ADDRESS, slot * 8L, Win32TextComAbi.linker.upcallStub(target, descriptor, arena))
        }
        vtable
    }

    fun register(owner: Win32DropComObject, ownerArena: Arena): MemorySegment =
        ownerArena.allocate(ValueLayout.ADDRESS).also {
            it.set(ValueLayout.ADDRESS, 0, table)
            check(routes.putIfAbsent(it.address(), owner) == null)
        }

    fun unregister(interfaceObject: MemorySegment) { routes.remove(interfaceObject.address()) }

    @JvmStatic fun dispatch(slot: Int, arguments: Array<Any>): Int {
        var owner: Win32DropComObject? = null
        return try {
            owner = routes[(arguments[0] as MemorySegment).address()] ?: return DISCONNECTED
            owner.enterNative()
            try { owner.dispatch(slot, arguments.copyOfRange(1, arguments.size)) } finally { owner.leaveNative() }
        } catch (failure: Throwable) {
            runCatching { owner?.report(failure) }
            if (failure is Win32DropException) failure.hresult else E_FAIL
        }
    }

    internal const val E_FAIL: Int = -2147467259 // 0x80004005
    internal const val DISCONNECTED: Int = 0x80010108.toInt() // RPC_E_DISCONNECTED
}

/**
 * One COM identity implementing IDropTarget for one HWND. Thread-confined to
 * the STA owner. **pdwEffect is read (allowed effects) then reset to
 * DROPEFFECT_NONE before any application code runs**, so a revoked object or a
 * failing handler never leaves a truncated effect. DragEnter retains the source
 * IDataObject before returning; Drop carries the same object and never adds a
 * second reference.
 */
internal class Win32DropComObject(
    private val handler: Win32DropTargetHandler,
    private val onFailure: (Throwable) -> Unit,
) : AutoCloseable {
    private val thread = Thread.currentThread()
    private val arena = Arena.ofShared()
    private val references = AtomicInteger(1)
    private val calls = AtomicInteger()
    private val reaped = AtomicBoolean()
    private val ownerClosed = AtomicBoolean()
    private val gate = Win32ComCallbackGate()
    private val interfaceObject = Win32DropComBridge.register(this, arena)

    internal val address: Long get() = interfaceObject.address()

    fun enterNative() { calls.incrementAndGet() }
    fun leaveNative() { calls.decrementAndGet(); reap() }
    fun report(failure: Throwable) { runCatching { onFailure(failure) } }

    fun dispatch(slot: Int, args: Array<Any>): Int = try {
        when (slot) {
            0 -> queryInterface(args[0] as MemorySegment, args[1] as MemorySegment)
            1 -> references.incrementAndGet()
            2 -> references.decrementAndGet().also { check(it >= 0); reap() }
            else -> {
                if (thread !== Thread.currentThread()) throw Win32DropException(WRONG_THREAD)
                val allowed = initializeEffect(slot, args)
                gate.call(DISCONNECTED) {
                    when (slot) {
                        3 -> dragEnter(args, allowed)
                        4 -> dragOver(args, allowed)
                        5 -> { handler.dragLeave(); 0 }
                        6 -> drop(args, allowed)
                        else -> 0x80004002.toInt()
                    }
                }
            }
        }
    } catch (failure: Throwable) {
        report(failure)
        if (failure is Win32DropException) failure.hresult else E_FAIL
    }

    private fun queryInterface(iid: MemorySegment, output: MemorySegment): Int {
        Win32TextComAbi.requirePointer(output)
        if (!Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) && !Win32TextComAbi.matches(iid, IID_IDROP_TARGET)) {
            return 0x80004002.toInt()
        }
        references.incrementAndGet()
        Win32TextComAbi.writePointer(output, address)
        return 0
    }

    /** Reads the allowed-effects IN value, then writes DROPEFFECT_NONE as the defined failure output. */
    private fun initializeEffect(slot: Int, args: Array<Any>): Int {
        val slotIndex = when (slot) { 3 -> 3; 4 -> 2; 6 -> 3; else -> return 0 }
        val effect = args[slotIndex] as MemorySegment
        Win32TextComAbi.requirePointer(effect)
        // Upcall-delivered segments arrive zero-length: bound them before any access.
        val allowed = effect.reinterpret(4).get(ValueLayout.JAVA_INT, 0)
        Win32TextComAbi.writeInt(effect, DROPEFFECT_NONE)
        return allowed
    }

    private fun dragEnter(args: Array<Any>, allowed: Int): Int {
        val source = (args[0] as MemorySegment).address()
        if (source == 0L) throw Win32DropException(E_POINTER)
        Win32TextComAbi.addRef(source)
        val data = Win32DropData(source)
        try {
            val chosen = handler.dragEnter(data, pointX(args[2]), pointY(args[2]), args[1] as Int, allowed)
            writeEffect(args[3], chosen)
            return 0
        } catch (failure: Throwable) {
            data.close()
            throw failure
        }
    }

    private fun dragOver(args: Array<Any>, allowed: Int): Int {
        val chosen = handler.dragOver(pointX(args[1]), pointY(args[1]), args[0] as Int, allowed)
        writeEffect(args[2], chosen)
        return 0
    }

    private fun drop(args: Array<Any>, allowed: Int): Int {
        val chosen = handler.drop(pointX(args[2]), pointY(args[2]), args[1] as Int, allowed)
        writeEffect(args[3], chosen)
        return 0
    }

    private fun pointX(arg: Any): Long = (arg as MemorySegment).reinterpret(8).get(ValueLayout.JAVA_INT, 0).toLong()
    private fun pointY(arg: Any): Long = (arg as MemorySegment).reinterpret(8).get(ValueLayout.JAVA_INT, 4).toLong()

    private fun writeEffect(arg: Any, chosen: Int) {
        Win32TextComAbi.writeInt(arg as MemorySegment, chosen)
    }

    fun revoke() { gate.revoke() }

    override fun close() {
        if (thread !== Thread.currentThread()) throw Win32DropException(WRONG_THREAD)
        if (!ownerClosed.compareAndSet(false, true)) return
        gate.revoke {
            references.decrementAndGet()
            reap()
        }
    }

    private fun reap() {
        if (references.get() != 0 || calls.get() != 0 || !reaped.compareAndSet(false, true)) return
        Win32DropComBridge.unregister(interfaceObject)
        arena.close()
    }

    internal companion object {
        internal const val WRONG_THREAD: Int = 0x8001010e.toInt() // RPC_E_WRONG_THREAD
        internal const val DISCONNECTED: Int = 0x80010108.toInt() // RPC_E_DISCONNECTED
        internal const val E_FAIL: Int = -2147467259 // 0x80004005
        internal const val E_POINTER: Int = -2147467261 // 0x80004003
        internal const val DROPEFFECT_NONE: Int = Win32DropFormats.DROPEFFECT_NONE
    }
}
