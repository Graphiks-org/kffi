package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger
import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.graphiks.kffi.win32.generated.GlobalAlloc
import org.graphiks.kffi.win32.generated.GlobalLock
import org.graphiks.kffi.win32.generated.GlobalUnlock
import org.graphiks.kffi.win32.generated.GetPropW
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.*

class Win32DropServicesIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun registeredTargetReceivesARealOleDragEnterOverDropAndReadsRealMedia() {
        window().use { window -> Win32DropServices.open().use { services ->
            val entered = mutableListOf<List<Any>>()
            val dropped = mutableListOf<List<Any>>()
            val failures = mutableListOf<Throwable>()
            val data = FakeNativeDataObject(paths = listOf("C:\\drop-a.txt", "C:\\drop-b.txt"), text = "dropped text")
            try {
                val target = services.register(window.hwnd, object : Win32DropTargetHandler {
                    override fun dragEnter(data: Win32DropData, x: Long, y: Long, keyState: Int, allowedEffects: Int): Int {
                        entered += listOf(data, x, y, keyState, allowedEffects)
                        return Win32DropFormats.DROPEFFECT_COPY
                    }
                    override fun dragOver(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = Win32DropFormats.DROPEFFECT_COPY
                    override fun dragLeave() {}
                    override fun drop(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int {
                        dropped += listOf(x, y, keyState, allowedEffects)
                        return Win32DropFormats.DROPEFFECT_COPY
                    }
                }, onFailure = { failures += it })
                try {
                    val registered = registeredTarget(window.hwnd)
                    assertTrue(registered != 0L, "RegisterDragDrop must expose the target through the OLE window property")

                    // QueryInterface through the OLE-registered identity: must answer S_OK
                    // with a live interface pointer (the OLE stub may return its own proxy).
                    Arena.ofConfined().use { arena ->
                        val output = arena.allocate(ValueLayout.ADDRESS)
                        assertEquals(0, Win32TextComAbi.call(registered, 0, "pp", Win32TextComAbi.guid(arena, IID_IDROP_TARGET), output))
                        assertTrue(output.get(ValueLayout.ADDRESS, 0).address() != 0L, "QI must return an interface pointer")
                    }

                    // Real DragEnter across the OLE frontier with real HGLOBAL media.
                    val dataAddress = data.address
                    Arena.ofConfined().use { arena ->
                        val point = arena.allocate(8, 4)
                        point.set(ValueLayout.JAVA_INT, 0, 123)
                        point.set(ValueLayout.JAVA_INT, 4, 456)
                        val effect = arena.allocate(4, 4)
                        effect.set(ValueLayout.JAVA_INT, 0, 7) // allowed effects from the source
                        assertEquals(0, Win32TextComAbi.call(registered, 3, "pipp", MemorySegment.ofAddress(dataAddress), 8, point, effect))
                        assertEquals(Win32DropFormats.DROPEFFECT_COPY, effect.get(ValueLayout.JAVA_INT, 0))
                    }
                    assertTrue(failures.isEmpty(), "no handler failure expected: $failures")
                    val entry = entered.single()
                    val dropData = assertIs<Win32DropData>(entry[0])
                    assertEquals(123L, entry[1]); assertEquals(456L, entry[2]); assertEquals(8, entry[3]); assertEquals(7, entry[4])
                    assertEquals(listOf("C:\\drop-a.txt", "C:\\drop-b.txt"), dropData.filePaths(8, 1024))
                    assertContentEquals("dropped text".toByteArray(Charsets.UTF_16LE), dropData.readHGlobal(Win32DropFormats.CF_UNICODETEXT, 1024))
                    assertTrue(dropData.hasFormat(Win32DropFormats.CF_HDROP))
                    assertEquals(
                        listOf(
                            Win32DropFormat(Win32DropFormats.CF_HDROP, Win32DropFormats.TYMED_HGLOBAL, Win32DropFormats.DVASPECT_CONTENT, -1),
                            Win32DropFormat(Win32DropFormats.CF_UNICODETEXT, Win32DropFormats.TYMED_HGLOBAL, Win32DropFormats.DVASPECT_CONTENT, -1),
                        ),
                        dropData.formats(8),
                    )
                    dropData.close()

                    // DragOver and Drop reuse the DragEnter admission without a second data reference.
                    val refsAfterEnter = data.refs.get()
                    Arena.ofConfined().use { arena ->
                        val point = arena.allocate(8, 4)
                        val effect = arena.allocate(4, 4)
                        effect.set(ValueLayout.JAVA_INT, 0, 7)
                        assertEquals(0, Win32TextComAbi.call(registered, 4, "ipp", 2, point, effect))
                        assertEquals(Win32DropFormats.DROPEFFECT_COPY, effect.get(ValueLayout.JAVA_INT, 0))
                        assertEquals(0, Win32TextComAbi.call(registered, 6, "pipp", MemorySegment.ofAddress(dataAddress), 0, point, effect))
                        assertEquals(Win32DropFormats.DROPEFFECT_COPY, effect.get(ValueLayout.JAVA_INT, 0))
                    }
                    assertEquals(1, dropped.size)
                    assertEquals(refsAfterEnter, data.refs.get())
                } finally {
                    target.close()
                }
                assertEquals(0L, registeredTarget(window.hwnd), "RevokeDragDrop must clear the OLE window property")
                assertTrue(failures.isEmpty(), "no handler failure expected: $failures")
            } finally {
                data.close()
            }
        } }
    }

    @Test fun reRegisteringARevokedWindowInstallsAFreshTarget() {
        window().use { window -> Win32DropServices.open().use { services ->
            val first = services.register(window.hwnd, recordingHandler(), {})
            first.close()
            assertEquals(0L, registeredTarget(window.hwnd))
            val second = services.register(window.hwnd, recordingHandler(), {})
            try { assertTrue(registeredTarget(window.hwnd) != 0L) } finally { second.close() }
            assertEquals(0L, registeredTarget(window.hwnd))
        } }
    }

    @Test fun sequentialOpenCloseRebalancesOleInitializationIncludingSFalse() {
        window().use { window ->
            repeat(3) {
                Win32DropServices.open().use { services ->
                    // The second and third OleInitialize calls observe an already-initialized
                    // STA and return S_FALSE; open and close must stay balanced across all of them.
                    val target = services.register(window.hwnd, recordingHandler(), {})
                    target.close()
                }
            }
        }
    }

    private fun recordingHandler() = object : Win32DropTargetHandler {
        override fun dragEnter(data: Win32DropData, x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = Win32DropFormats.DROPEFFECT_COPY
        override fun dragOver(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = Win32DropFormats.DROPEFFECT_COPY
        override fun dragLeave() {}
        override fun drop(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = Win32DropFormats.DROPEFFECT_COPY
    }

    private fun window() = Win32ManagedWindow.open("OLE drop services") { h, m, w, l ->
        DefWindowProcW(MemorySegment.ofAddress(h), m, w, l)
    }

    private fun registeredTarget(hwnd: Long): Long {
        init()
        Arena.ofConfined().use { arena ->
            val name = "OleDropTargetInterface"
            val wide = arena.allocate((name.length + 1L) * 2L, 2)
            name.forEachIndexed { index, character -> wide.set(ValueLayout.JAVA_CHAR, index.toLong() * 2L, character) }
            wide.set(ValueLayout.JAVA_CHAR, name.length.toLong() * 2L, '\u0000')
            return GetPropW(MemorySegment.ofAddress(hwnd), wide).address()
        }
    }

    // ----------------------------------------------------------------------
    // Test-owned IDataObject over real HGLOBAL media.
    // ----------------------------------------------------------------------

    private class FakeNativeDataObject(paths: List<String>, text: String) : AutoCloseable {
        val refs = AtomicInteger(1)
        private val formats = listOf(
            Pair(Win32DropFormats.CF_HDROP, Win32DropFormats.TYMED_HGLOBAL),
            Pair(Win32DropFormats.CF_UNICODETEXT, Win32DropFormats.TYMED_HGLOBAL),
        )
        private val hdropPayload = dropFiles(paths)
        private val textPayload = text.toByteArray(Charsets.UTF_16LE)

        private val enumRefs = AtomicInteger(1)
        private val enumNext = AtomicInteger(0)
        private val enum = TestComServer(listOf("pp", "", "", "ipp", "i", "", "p")) { receiver, slot, args ->
            when (slot) {
                0 -> queryInterface(args[0] as MemorySegment, args[1] as MemorySegment, receiver, enumRefs)
                1 -> enumRefs.incrementAndGet()
                2 -> enumRefs.decrementAndGet()
                3 -> {
                    val fetched = bounded(args[2] as MemorySegment, 4)
                    val remaining = formats.drop(enumNext.getAndIncrement())
                    if (remaining.isEmpty()) { fetched.set(ValueLayout.JAVA_INT, 0, 0); 1 } else {
                        val element = bounded(args[1] as MemorySegment, 32)
                        element.set(ValueLayout.JAVA_SHORT, 0, remaining.first().first.toShort())
                        element.set(ValueLayout.ADDRESS, 8, MemorySegment.NULL)
                        element.set(ValueLayout.JAVA_INT, 16, Win32DropFormats.DVASPECT_CONTENT)
                        element.set(ValueLayout.JAVA_INT, 20, -1)
                        element.set(ValueLayout.JAVA_INT, 24, remaining.first().second)
                        fetched.set(ValueLayout.JAVA_INT, 0, 1)
                        0
                    }
                }
                else -> DV_E_FORMATETC
            }
        }

        val server = TestComServer(
            listOf("pp", "", "", "pp", "pp", "p", "p", "ppi", "ip", "ppip", "i", "p"),
        ) { receiver, slot, args ->
            when (slot) {
                0 -> queryInterface(args[0] as MemorySegment, args[1] as MemorySegment, receiver, refs)
                1 -> refs.incrementAndGet()
                2 -> refs.decrementAndGet()
                3 -> { // GetData with a real moveable HGLOBAL medium
                    val requested = bounded(args[0] as MemorySegment, 32).get(ValueLayout.JAVA_SHORT, 0).toInt()
                    val medium = bounded(args[1] as MemorySegment, 24)
                    val payload = if (requested == Win32DropFormats.CF_HDROP) hdropPayload else if (requested == Win32DropFormats.CF_UNICODETEXT) textPayload else return@TestComServer DV_E_FORMATETC
                    val handle = GlobalAlloc(GMEM_MOVEABLE, payload.size.toLong())
                    if (handle.address() == 0L) return@TestComServer E_OUTOFMEMORY
                    val pointer = GlobalLock(handle)
                    try { MemorySegment.copy(MemorySegment.ofArray(payload), 0, pointer.reinterpret(payload.size.toLong()), 0, payload.size.toLong()) } finally { GlobalUnlock(handle) }
                    medium.set(ValueLayout.JAVA_INT, 0, Win32DropFormats.TYMED_HGLOBAL)
                    medium.set(ValueLayout.ADDRESS, 8, handle)
                    medium.set(ValueLayout.ADDRESS, 16, MemorySegment.NULL)
                    0
                }
                5 -> { // QueryGetData
                    val requested = bounded(args[0] as MemorySegment, 32).get(ValueLayout.JAVA_SHORT, 0).toInt()
                    if (formats.any { it.first == requested }) 0 else DV_E_FORMATETC
                }
                8 -> { // EnumFormatEtc
                    enumNext.set(0)
                    Win32TextComAbi.writePointer(args[1] as MemorySegment, enum.address)
                    0
                }
                else -> DV_E_FORMATETC
            }
        }

        val address: Long get() = server.address

        override fun close() {
            enum.close()
            server.close()
        }

        private fun queryInterface(iid: MemorySegment, output: MemorySegment, receiver: Long, counter: AtomicInteger): Int {
            if (Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) || Win32TextComAbi.matches(iid, IID_IDATA_OBJECT)) {
                counter.incrementAndGet()
                Win32TextComAbi.writePointer(output, receiver)
                return 0
            }
            return 0x80004002.toInt()
        }

        private fun dropFiles(paths: List<String>): ByteArray {
            val header = ByteArray(20)
            header[0] = 20 // pFiles
            header[16] = 1 // fWide
            val body = (paths.joinToString("\u0000", postfix = "\u0000\u0000")).toByteArray(Charsets.UTF_16LE)
            return header + body
        }
    }

    /** Minimal vtable server over a closeable shared arena. */
    private class TestComServer(signatures: List<String>, private val handler: (receiver: Long, slot: Int, args: Array<Any>) -> Int) : AutoCloseable {
        private val arena = Arena.ofShared()
        private val instance: MemorySegment
        val address: Long

        init {
            val table = arena.allocate(signatures.size * 8L, 8)
            signatures.forEachIndexed { slot, signature ->
                val descriptor = Win32TextComAbi.descriptor(signature)
                val dispatcher = MethodHandles.lookup().findStatic(
                    TestComServer::class.java, "dispatch",
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
            private val active = ConcurrentHashMap<Long, TestComServer>()

            @JvmStatic fun dispatch(slot: Int, arguments: Array<Any>): Int {
                val receiver = arguments[0] as MemorySegment
                val server = active[receiver.address()] ?: return 0x80010108.toInt()
                return try {
                    server.handler(receiver.address(), slot, arguments.copyOfRange(1, arguments.size))
                } catch (failure: Throwable) {
                    failure.printStackTrace()
                    E_FAIL
                }
            }
        }
    }

    companion object {
        private fun bounded(segment: MemorySegment, bytes: Long): MemorySegment =
            if (segment.byteSize() >= bytes) segment else segment.reinterpret(bytes)

        private const val GMEM_MOVEABLE: Int = 0x0002
        private const val DV_E_FORMATETC: Int = -2147221404 // 0x80040064
        private const val E_OUTOFMEMORY: Int = -2147024882 // 0x8007000E
        private const val E_FAIL: Int = -2147467259 // 0x80004005
    }
}
