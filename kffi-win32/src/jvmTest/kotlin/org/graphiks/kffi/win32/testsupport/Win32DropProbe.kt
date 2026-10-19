package org.graphiks.kffi.win32.testsupport

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger
import org.graphiks.kffi.win32.generated.GetPropW
import org.graphiks.kffi.win32.generated.GlobalAlloc
import org.graphiks.kffi.win32.generated.GlobalLock
import org.graphiks.kffi.win32.generated.GlobalUnlock
import org.graphiks.kffi.win32.generated.init
import org.graphiks.kffi.win32.managed.Win32TextComAbi

/**
 * Test-side OLE drop frontier probe, packaged in the native-test-support
 * classifier only. [Win32DropProbe] retrieves the drop target a consumer
 * registered through the real OLE window property and invokes its vtable the
 * way Windows does; [Win32DropDataObject] serves genuine moveable HGLOBAL
 * media. Nothing here enters the production artifacts.
 */
public object Win32DropProbe {
    public const val IID_IDATA_OBJECT: String = "0000010e-0000-0000-c000-000000000046"

    /** Address of the drop target OLE registered for [hwnd], or 0 when none. */
    public fun registeredTarget(hwnd: Long): Long {
        init()
        Arena.ofConfined().use { arena ->
            val name = "OleDropTargetInterface"
            val wide = arena.allocate((name.length + 1L) * 2L, 2)
            name.forEachIndexed { index, character -> wide.set(ValueLayout.JAVA_CHAR, index.toLong() * 2L, character) }
            wide.set(ValueLayout.JAVA_CHAR, name.length.toLong() * 2L, '\u0000')
            return GetPropW(MemorySegment.ofAddress(hwnd), wide).address()
        }
    }

    /** Invokes DragEnter through the registered frontier; returns the written effect. */
    public fun dragEnter(target: Long, data: Win32DropDataObject, keyState: Int, x: Int, y: Int, allowedEffects: Int): Int =
        invokeWithEffect(target, 3, "pipp") { arena, effect ->
            val point = arena.allocate(8, 4)
            point.set(ValueLayout.JAVA_INT, 0, x)
            point.set(ValueLayout.JAVA_INT, 4, y)
            effect.set(ValueLayout.JAVA_INT, 0, allowedEffects)
            arrayOf(MemorySegment.ofAddress(data.address), keyState, point, effect)
        }

    /** Invokes DragOver; returns the written effect. */
    public fun dragOver(target: Long, keyState: Int, x: Int, y: Int, allowedEffects: Int): Int =
        invokeWithEffect(target, 4, "ipp") { arena, effect ->
            val point = arena.allocate(8, 4)
            point.set(ValueLayout.JAVA_INT, 0, x)
            point.set(ValueLayout.JAVA_INT, 4, y)
            effect.set(ValueLayout.JAVA_INT, 0, allowedEffects)
            arrayOf(keyState, point, effect)
        }

    /** Invokes Drop; returns the written effect. */
    public fun drop(target: Long, data: Win32DropDataObject, keyState: Int, x: Int, y: Int, allowedEffects: Int): Int =
        invokeWithEffect(target, 6, "pipp") { arena, effect ->
            val point = arena.allocate(8, 4)
            point.set(ValueLayout.JAVA_INT, 0, x)
            point.set(ValueLayout.JAVA_INT, 4, y)
            effect.set(ValueLayout.JAVA_INT, 0, allowedEffects)
            arrayOf(MemorySegment.ofAddress(data.address), keyState, point, effect)
        }

    /** QueryInterface for IID_IDropTarget through the registered frontier; 0 on success. */
    public fun queryInterfaceTarget(target: Long): Int = Arena.ofConfined().use { arena ->
        val output = arena.allocate(ValueLayout.ADDRESS)
        Win32TextComAbi.call(target, 0, "pp", Win32TextComAbi.guid(arena, "00000122-0000-0000-c000-000000000046"), output)
    }

    private inline fun invokeWithEffect(target: Long, slot: Int, signature: String, arguments: (Arena, MemorySegment) -> Array<Any>): Int {
        Arena.ofConfined().use { arena ->
            val effect = arena.allocate(4, 4)
            val call = Win32TextComAbi.call(target, slot, signature, *arguments(arena, effect))
            check(call == 0) { "DropTarget slot $slot failed: 0x${call.toUInt().toString(16)}" }
            return effect.get(ValueLayout.JAVA_INT, 0)
        }
    }
}

/** One test-owned IDataObject offering wide CF_HDROP paths and CF_UNICODETEXT over real media. */
public class Win32DropDataObject(paths: List<String>, text: String) : AutoCloseable {
    private val server = Server(
        listOf("pp", "", "", "pp", "pp", "p", "p", "ppi", "ip", "ppip", "i", "p"),
    ) { receiver, slot, args ->
        when (slot) {
            0 -> queryInterface(args[0] as MemorySegment, args[1] as MemorySegment, receiver, refs, Win32DropProbe.IID_IDATA_OBJECT)
            1 -> refs.incrementAndGet()
            2 -> refs.decrementAndGet()
            3 -> getData(args, textPayload, hdropPayload)
            5 -> {
                val requested = bounded(args[0] as MemorySegment, 32).get(ValueLayout.JAVA_SHORT, 0).toInt()
                if (requested == CF_HDROP || requested == CF_UNICODETEXT) 0 else DV_E_FORMATETC
            }
            8 -> {
                enumNext.set(0)
                Win32TextComAbi.writePointer(args[1] as MemorySegment, enum.address)
                0
            }
            else -> DV_E_FORMATETC
        }
    }

    private val refs = AtomicInteger(1)
    private val enumRefs = AtomicInteger(1)
    private val enumNext = AtomicInteger(0)
    private val hdropPayload: ByteArray = run {
        val header = ByteArray(20)
        header[0] = 20 // pFiles
        header[16] = 1 // fWide
        header + paths.joinToString("\u0000", postfix = "\u0000\u0000").toByteArray(Charsets.UTF_16LE)
    }
    private val textPayload: ByteArray = text.toByteArray(Charsets.UTF_16LE)

    private val enum = Server(listOf("pp", "", "", "ipp", "i", "", "p")) { receiver, slot, args ->
        when (slot) {
            0 -> queryInterface(args[0] as MemorySegment, args[1] as MemorySegment, receiver, enumRefs, ENUM_IID)
            1 -> enumRefs.incrementAndGet()
            2 -> enumRefs.decrementAndGet()
            3 -> {
                val fetched = bounded(args[2] as MemorySegment, 4)
                val remaining = listOf(CF_HDROP to 1, CF_UNICODETEXT to 1).drop(enumNext.getAndIncrement())
                if (remaining.isEmpty()) { fetched.set(ValueLayout.JAVA_INT, 0, 0); 1 } else {
                    val element = bounded(args[1] as MemorySegment, 32)
                    element.set(ValueLayout.JAVA_SHORT, 0, remaining.first().first.toShort())
                    element.set(ValueLayout.ADDRESS, 8, MemorySegment.NULL)
                    element.set(ValueLayout.JAVA_INT, 16, 1)
                    element.set(ValueLayout.JAVA_INT, 20, -1)
                    element.set(ValueLayout.JAVA_INT, 24, remaining.first().second)
                    fetched.set(ValueLayout.JAVA_INT, 0, 1)
                    0
                }
            }
            else -> DV_E_FORMATETC
        }
    }

    public val address: Long get() = server.address

    override fun close() {
        enum.close()
        server.close()
    }

    private fun getData(args: Array<Any>, textPayload: ByteArray, hdropPayload: ByteArray): Int {
        val requested = bounded(args[0] as MemorySegment, 32).get(ValueLayout.JAVA_SHORT, 0).toInt()
        val medium = bounded(args[1] as MemorySegment, 24)
        val payload = when (requested) {
            CF_HDROP -> hdropPayload
            CF_UNICODETEXT -> textPayload
            else -> return DV_E_FORMATETC
        }
        val handle = GlobalAlloc(GMEM_MOVEABLE, payload.size.toLong())
        if (handle.address() == 0L) return E_OUTOFMEMORY
        val pointer = GlobalLock(handle)
        try { MemorySegment.copy(MemorySegment.ofArray(payload), 0, pointer.reinterpret(payload.size.toLong()), 0, payload.size.toLong()) } finally { GlobalUnlock(handle) }
        medium.set(ValueLayout.JAVA_INT, 0, 1) // TYMED_HGLOBAL
        medium.set(ValueLayout.ADDRESS, 8, handle)
        medium.set(ValueLayout.ADDRESS, 16, MemorySegment.NULL)
        return 0
    }

    private fun queryInterface(iid: MemorySegment, output: MemorySegment, receiver: Long, counter: AtomicInteger, self: String): Int {
        if (Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) || Win32TextComAbi.matches(iid, self)) {
            counter.incrementAndGet()
            Win32TextComAbi.writePointer(output, receiver)
            return 0
        }
        return 0x80004002.toInt()
    }

    private companion object {
        private fun bounded(segment: MemorySegment, bytes: Long): MemorySegment =
            if (segment.byteSize() >= bytes) segment else segment.reinterpret(bytes)

        private const val CF_HDROP: Int = 15
        private const val CF_UNICODETEXT: Int = 13
        private const val ENUM_IID: String = "00000103-0000-0000-c000-000000000046"
        private const val DV_E_FORMATETC: Int = -2147221404 // 0x80040064
        private const val E_OUTOFMEMORY: Int = -2147024882 // 0x8007000E
        private const val GMEM_MOVEABLE: Int = 0x0002
    }
}

/** Minimal vtable server over a closeable shared arena; shared by the drop probes. */
private class Server(signatures: List<String>, private val handler: (receiver: Long, slot: Int, args: Array<Any>) -> Int) : AutoCloseable {
    private val arena = Arena.ofShared()
    private val instance: MemorySegment
    val address: Long

    init {
        val table = arena.allocate(signatures.size * 8L, 8)
        signatures.forEachIndexed { slot, signature ->
            val descriptor = Win32TextComAbi.descriptor(signature)
            val dispatcher = MethodHandles.lookup().findStatic(
                Server::class.java, "dispatch",
                MethodType.methodType(Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Array<Any>::class.java),
            )
            val target = MethodHandles.insertArguments(dispatcher, 0, slot)
                .asCollector(Array<Any>::class.java, signature.length + 1)
                .asType(descriptor.toMethodType())
            table.set(ValueLayout.ADDRESS, slot * 8L, Win32TextComAbi.linker.upcallStub(target, descriptor, arena))
        }
        instance = arena.allocate(ValueLayout.ADDRESS)
        instance.set(ValueLayout.ADDRESS, 0, table)
        address = instance.address()
        active[address] = this
    }

    override fun close() {
        active.remove(address)
        arena.close()
    }

    companion object {
        private val active = ConcurrentHashMap<Long, Server>()

        @JvmStatic fun dispatch(slot: Int, arguments: Array<Any>): Int {
            val receiver = arguments[0] as MemorySegment
            val server = active[receiver.address()] ?: return DISCONNECTED
            return try {
                server.handler(receiver.address(), slot, arguments.copyOfRange(1, arguments.size))
            } catch (failure: Throwable) {
                failure.printStackTrace()
                E_FAIL
            }
        }

        private const val DISCONNECTED: Int = 0x80010108.toInt()
        private const val E_FAIL: Int = -2147467259 // 0x80004005
    }
}
