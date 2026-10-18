package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap

/** Process-lifetime stubs retain only this library's dispatcher, never a text receiver. */
internal object Win32TextComBridge {
    private data class Route(val owner: Win32TextComObject, val kind: Int)
    private val routes = ConcurrentHashMap<Long, Route>()
    private val arena = Arena.global()
    private val signatures = listOf(
        // ITextStoreACP, in TextStor.h order, including IUnknown.
        listOf("pp", "", "", "ppi", "p", "ip", "p", "iiipp", "iipp", "ip", "iipippipp",
            "iiipip", "iip", "ippp", "ppp", "iiipp", "ipippp", "ipppp", "iip", "iipi", "iipi",
            "iiipippp", "ipp", "p", "p", "ipip", "iiipp", "ip", "ip"),
        listOf("pp", "", "", "pp", "pp", "p"), // ITfContextOwnerCompositionSink
        listOf("pp", "", "", "pp", "pp", "p", "p", "p"), // ITfInputScope
    )
    private val tables: List<MemorySegment> by lazy {
        signatures.mapIndexed { kind, methods ->
            val table = arena.allocate(methods.size * 8L, 8)
            methods.forEachIndexed { slot, signature ->
                val descriptor = Win32TextComAbi.descriptor(signature)
                val dispatcher = MethodHandles.lookup().findStatic(Win32TextComBridge::class.java, "dispatch",
                    MethodType.methodType(Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Array<Any>::class.java))
                val target = MethodHandles.insertArguments(dispatcher, 0, (kind shl 8) or slot)
                    .asCollector(Array<Any>::class.java, signature.length + 1).asType(descriptor.toMethodType())
                table.set(ValueLayout.ADDRESS, slot * 8L, Win32TextComAbi.linker.upcallStub(target, descriptor, arena))
            }
            table
        }
    }

    fun register(owner: Win32TextComObject, ownerArena: Arena): List<MemorySegment> = tables.mapIndexed { kind, table ->
        ownerArena.allocate(ValueLayout.ADDRESS).also {
            it.set(ValueLayout.ADDRESS, 0, table)
            check(routes.putIfAbsent(it.address(), Route(owner, kind)) == null)
        }
    }

    fun unregister(addresses: List<MemorySegment>) { addresses.forEach { routes.remove(it.address()) } }

    @JvmStatic fun dispatch(encoded: Int, arguments: Array<Any>): Int {
        var route: Route? = null
        return try {
            val address = (arguments[0] as MemorySegment).address()
            route = routes[address] ?: return 0x80010108.toInt()
            route.owner.enterNative()
            try { route.owner.dispatch(encoded and 255, arguments.copyOfRange(1, arguments.size), route.kind) }
            finally { route.owner.leaveNative() }
        } catch (failure: Throwable) {
            runCatching { route?.owner?.report(failure) }
            if (failure is Win32TextException) failure.hresult else 0x80004005.toInt()
        }
    }

    fun initializeOutputs(kind: Int, slot: Int, args: Array<Any>) {
        fun pointer(index: Int) = args[index] as MemorySegment
        fun integer(index: Int) = Win32TextComAbi.writeInt(pointer(index), 0)
        fun address(index: Int) = Win32TextComAbi.writePointer(pointer(index), 0)
        fun clear(index: Int, bytes: Long) { val p = pointer(index); if (p.address() != 0L) p.reinterpret(bytes).fill(0) }
        if (slot == 0) { address(1); return }
        if (kind == 1) { if (slot == 3) integer(1); return }
        if (kind == 2) {
            if (slot in 3..4) { address(0); integer(1) } else if (slot in 5..7) address(0)
            return
        }
        when (slot) {
            5 -> Win32TextComAbi.writeInt(pointer(1), 0x80004005.toInt())
            6 -> clear(0, 8)
            7 -> { integer(3); integer(4) }
            8 -> { integer(3); if ((args[1] as Int) > 0) clear(2, 16) }
            10 -> { integer(4); integer(7); integer(8) }
            11 -> clear(5, 12)
            12 -> address(2)
            13 -> address(3)
            14 -> integer(2)
            15 -> clear(4, 12)
            16 -> { integer(3); integer(4); clear(5, 12) }
            17 -> { integer(2); integer(3); clear(4, 12) }
            21 -> { integer(5); integer(6); integer(7) }
            22 -> integer(2)
            23, 24 -> integer(0)
            25 -> integer(3)
            26 -> { clear(3, 16); integer(4) }
            27 -> clear(1, 16)
            28 -> address(1)
        }
    }
}
