package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.*

class Win32DropTest {
    // ------------------------------------------------------------------
    // Test-side COM servers: one dispatcher keyed by the receiver address,
    // built exactly like the production bridge builds its vtables.
    // ------------------------------------------------------------------

    private class TestComServer(signatures: List<String>, private val handler: (receiver: Long, slot: Int, args: Array<Any>) -> Int) : AutoCloseable {
        private val arena = Arena.ofShared() // closeable, unlike the process-lifetime global arena
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

    /** Test-owned IDataObject with canned GetData answers and reference accounting. */
    private class FakeDataObject(initialRefs: Int = 1) : AutoCloseable {
        val refs = AtomicInteger(initialRefs)
        val getDataFormats = mutableListOf<Int>()
        val queryFormats = mutableListOf<Int>()
        var answer: (requestedFormat: Int, medium: MemorySegment) -> Int = { _, _ -> DV_E_FORMATETC }
        var enumFormats: List<Triple<Int, Int, Int>> = emptyList() // (cfFormat, tymed, aspect)

        val server = TestComServer(
            listOf("pp", "", "", "pp", "pp", "p", "p", "ppi", "ip", "ppip", "i", "p"),
        ) { receiver, slot, args ->
            when (slot) {
                0 -> { // QueryInterface
                    val iid = args[0] as MemorySegment
                    val output = args[1] as MemorySegment
                    if (Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) || Win32TextComAbi.matches(iid, IID_IDATA_OBJECT)) {
                        refs.incrementAndGet()
                        Win32TextComAbi.writePointer(output, receiver)
                        0
                    } else 0x80004002.toInt()
                }
                1 -> refs.incrementAndGet()
                2 -> refs.decrementAndGet()
                3 -> { // GetData
                    val formatetc = args[0] as MemorySegment
                    val medium = args[1] as MemorySegment
                    val requested = bounded(formatetc, 32).get(ValueLayout.JAVA_SHORT, 0).toInt()
                    getDataFormats += requested
                    answer(requested, medium)
                }
                5 -> { // QueryGetData
                    val formatetc = args[0] as MemorySegment
                    val requested = bounded(formatetc, 32).get(ValueLayout.JAVA_SHORT, 0).toInt()
                    queryFormats += requested
                    if (enumFormats.any { it.first == requested }) 0 else DV_E_FORMATETC
                }
                8 -> { // EnumFormatEtc — a fresh enumeration starts at the first format
                    val output = args[1] as MemorySegment
                    enumNext.set(0)
                    Win32TextComAbi.writePointer(output, enum.address)
                    0
                }
                else -> DV_E_FORMATETC
            }
        }

        private val enumRefs = AtomicInteger(1)
        private val enumNext = AtomicInteger(0)
        private val enum = TestComServer(listOf("pp", "", "", "ipp", "i", "", "p")) { receiver, slot, args ->
            when (slot) {
                0 -> { // QueryInterface
                    val iid = args[0] as MemorySegment
                    val output = args[1] as MemorySegment
                    if (Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) || Win32TextComAbi.matches(iid, IID_IENUM_FORMAT_ETC)) {
                        enumRefs.incrementAndGet()
                        Win32TextComAbi.writePointer(output, receiver)
                        0
                    } else 0x80004002.toInt()
                }
                1 -> enumRefs.incrementAndGet()
                2 -> enumRefs.decrementAndGet()
                3 -> { // Next
                    val fetched = bounded(args[2] as MemorySegment, 4)
                    val remaining = enumFormats.drop(enumNext.getAndIncrement())
                    if (remaining.isEmpty()) {
                        fetched.set(ValueLayout.JAVA_INT, 0, 0)
                        1 // S_FALSE
                    } else {
                        val element = args[1] as MemorySegment
                        val format = remaining.first()
                        writeFormatEtc(element, format.first, format.second, format.third)
                        fetched.set(ValueLayout.JAVA_INT, 0, 1)
                        0
                    }
                }
                else -> DV_E_FORMATETC
            }
        }

        val address: Long get() = server.address

        override fun close() {
            enum.close()
            server.close()
        }
    }

    /** Test-owned IStream: one canned payload delivered by Read. */
    private class FakeStream(private val payload: ByteArray) : AutoCloseable {
        val refs = AtomicInteger(1)
        private val position = AtomicInteger(0)
        val server = TestComServer(listOf("pp", "", "", "pip", "pip", "pii")) { receiver, slot, args ->
            when (slot) {
                0 -> {
                    val iid = args[0] as MemorySegment
                    val output = args[1] as MemorySegment
                    if (Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN)) {
                        refs.incrementAndGet()
                        Win32TextComAbi.writePointer(output, receiver)
                        0
                    } else 0x80004002.toInt()
                }
                1 -> refs.incrementAndGet()
                2 -> refs.decrementAndGet()
                3 -> { // ISequentialStream::Read
                    val requested = args[1] as Int
                    val sink = bounded(args[0] as MemorySegment, requested.toLong())
                    val read = bounded(args[2] as MemorySegment, 4)
                    val count = minOf(requested, payload.size - position.get())
                    if (count > 0) MemorySegment.copy(MemorySegment.ofArray(payload), position.get().toLong(), sink, 0, count.toLong())
                    position.addAndGet(count)
                    read.set(ValueLayout.JAVA_INT, 0, count)
                    0
                }
                else -> E_NOTIMPL
            }
        }

        val address: Long get() = server.address

        override fun close() = server.close()
    }

    /** Canned HGLOBAL content with lock/unlock/release accounting. */
    private class FakeMemoryPort(var hGlobalPayload: ByteArray = ByteArray(0)) : Win32DropNativePort, AutoCloseable {
        val unlocks = AtomicInteger()
        val releasedMediums = AtomicInteger()
        var locked = false
        private val native = Arena.ofShared() // .address() needs a native segment; heap arrays have none
        private var lockedSegment: MemorySegment? = null

        override fun globalSize(handle: Long): Long = hGlobalPayload.size.toLong()
        override fun globalLock(handle: Long): Long {
            locked = true
            lockedSegment = native.allocate(hGlobalPayload.size.toLong(), 1).also { target ->
                MemorySegment.copy(MemorySegment.ofArray(hGlobalPayload), 0, target, 0, hGlobalPayload.size.toLong())
            }
            return lockedSegment!!.address()
        }
        override fun globalUnlock(handle: Long) { unlocks.incrementAndGet(); locked = false; lockedSegment = null }
        override fun releaseMedium(medium: MemorySegment) { releasedMediums.incrementAndGet() }
        override fun close() = native.close()
    }

    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    private fun fillHGlobal(medium: MemorySegment, handle: Long, tymed: Int = TYMED_HGLOBAL) {
        val target = bounded(medium, 24)
        target.set(ValueLayout.JAVA_INT, 0, tymed)
        target.set(ValueLayout.ADDRESS, STGMEDIUM_U_OFFSET, MemorySegment.ofAddress(handle))
        target.set(ValueLayout.ADDRESS, 16, MemorySegment.NULL)
    }

    private class RecordingHandler : Win32DropTargetHandler {
        val entered = mutableListOf<List<Any>>()
        val over = mutableListOf<List<Any>>()
        var leaves = 0
        val dropped = mutableListOf<List<Any>>()
        var enterAnswer = DROPEFFECT_COPY
        var overAnswer = DROPEFFECT_COPY
        var dropAnswer = DROPEFFECT_COPY
        override fun dragEnter(data: Win32DropData, x: Long, y: Long, keyState: Int, allowedEffects: Int): Int {
            entered += listOf(data, x, y, keyState, allowedEffects)
            return enterAnswer
        }
        override fun dragOver(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int {
            over += listOf(x, y, keyState, allowedEffects)
            return overAnswer
        }
        override fun dragLeave() { leaves++ }
        override fun drop(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int {
            dropped += listOf(x, y, keyState, allowedEffects)
            return dropAnswer
        }
    }

    // ------------------------------------------------------------------
    // Win32DropData
    // ------------------------------------------------------------------

    @Test fun formatsEnumerateCopiedValuesAndRefuseTruncation() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_HDROP, TYMED_HGLOBAL, DVASPECT_CONTENT), Triple(CF_UNICODETEXT, TYMED_HGLOBAL, DVASPECT_CONTENT))
        Win32DropData(fake.address, FakeMemoryPort()).use { data ->
            assertEquals(
                listOf(Win32DropFormat(CF_HDROP, TYMED_HGLOBAL, DVASPECT_CONTENT, -1), Win32DropFormat(CF_UNICODETEXT, TYMED_HGLOBAL, DVASPECT_CONTENT, -1)),
                data.formats(8),
            )
            assertEquals(E_OUTOFMEMORY, assertFailsWith<Win32DropException> { data.formats(1) }.hresult)
        }
        assertEquals(0, fake.refs.get())
    }

    @Test fun hasFormatQueriesContentAspectWithHGlobalAndStreamTymed() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_UNICODETEXT, TYMED_HGLOBAL, DVASPECT_CONTENT))
        Win32DropData(fake.address, FakeMemoryPort()).use { data ->
            assertTrue(data.hasFormat(CF_UNICODETEXT))
            assertFalse(data.hasFormat(CF_HDROP))
        }
        assertEquals(listOf(CF_UNICODETEXT, CF_HDROP), fake.queryFormats)
    }

    @Test fun hGlobalReadCopiesBytesUnlocksAndReleasesTheMedium() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_UNICODETEXT, TYMED_HGLOBAL, DVASPECT_CONTENT))
        fake.answer = { _, medium -> fillHGlobal(medium, 0x1234); 0 }
        val port = FakeMemoryPort(hGlobalPayload = "hello".toByteArray(Charsets.UTF_16LE))
        Win32DropData(fake.address, port).use { data ->
            assertContentEquals("hello".toByteArray(Charsets.UTF_16LE), data.readHGlobal(CF_UNICODETEXT, 1024))
            assertFalse(port.locked)
        }
        assertEquals(1, port.releasedMediums.get())
        assertEquals(1, port.unlocks.get())
        assertEquals(0, fake.refs.get())
    }

    @Test fun hGlobalReadRefusesPayloadBeyondTheCallerLimitAndStillReleasesTheMedium() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_UNICODETEXT, TYMED_HGLOBAL, DVASPECT_CONTENT))
        fake.answer = { _, medium -> fillHGlobal(medium, 0x1234); 0 }
        val port = FakeMemoryPort(hGlobalPayload = ByteArray(8))
        Win32DropData(fake.address, port).use { data ->
            assertEquals(E_OUTOFMEMORY, assertFailsWith<Win32DropException> { data.readHGlobal(CF_UNICODETEXT, 4) }.hresult)
        }
        assertEquals(1, port.releasedMediums.get())
    }

    @Test fun hGlobalReadRejectsForeignMediumTymedAndReleasesTheMedium() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_UNICODETEXT, TYMED_ISTREAM, DVASPECT_CONTENT))
        fake.answer = { _, medium -> fillHGlobal(medium, 0x1234, tymed = TYMED_ISTREAM); 0 }
        val port = FakeMemoryPort()
        Win32DropData(fake.address, port).use { data ->
            assertEquals(DV_E_TYMED, assertFailsWith<Win32DropException> { data.readHGlobal(CF_UNICODETEXT, 1024) }.hresult)
        }
        assertEquals(1, port.releasedMediums.get())
    }

    @Test fun retainedStreamSurvivesMediumReleaseAndCloseRestoresTheReferences() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_UNICODETEXT, TYMED_ISTREAM, DVASPECT_CONTENT))
        val stream = FakeStream(byteArrayOf(1, 2, 3, 4))
        val port = FakeMemoryPort()
        fake.answer = { _, medium -> fillHGlobal(medium, stream.address, tymed = TYMED_ISTREAM); 0 }
        Win32DropData(fake.address, port).use { data ->
            val retained = data.retainStream(CF_UNICODETEXT)
            assertEquals(2, stream.refs.get()) // the retained reference
            val sink = ByteArray(10)
            assertEquals(4, retained.read(sink))
            assertContentEquals(byteArrayOf(1, 2, 3, 4), sink.copyOf(4))
            assertEquals(0, retained.read(ByteArray(10))) // EOF
            retained.close()
            assertEquals(1, stream.refs.get())
        }
        assertEquals(1, port.releasedMediums.get())
        assertEquals(0, fake.refs.get())
        stream.close()
    }

    @Test fun filePathsParseWideDropfilesAndRefuseLegacyAnsi() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_HDROP, TYMED_HGLOBAL, DVASPECT_CONTENT))
        fake.answer = { _, medium -> fillHGlobal(medium, 0x4321); 0 }
        val header = ByteArray(20)
        header[16] = 1 // fWide
        header[0] = 20 // pFiles offset
        val payload = header + "C:\\a.txt\u0000C:\\b.txt\u0000\u0000".toByteArray(Charsets.UTF_16LE)
        val port = FakeMemoryPort(hGlobalPayload = payload)
        Win32DropData(fake.address, port).use { data ->
            assertEquals(listOf("C:\\a.txt", "C:\\b.txt"), data.filePaths(8, 1024))
        }
    }

    @Test fun filePathsRefuseAnsiDropfilesInsteadOfGuessingACodePage() {
        val fake = FakeDataObject()
        fake.enumFormats = listOf(Triple(CF_HDROP, TYMED_HGLOBAL, DVASPECT_CONTENT))
        fake.answer = { _, medium -> fillHGlobal(medium, 0x4321); 0 }
        val payload = ByteArray(22)
        payload[16] = 0 // fWide: ANSI
        payload[0] = 20
        val port = FakeMemoryPort(hGlobalPayload = payload)
        Win32DropData(fake.address, port).use { data ->
            assertEquals(DV_E_FORMATETC, assertFailsWith<Win32DropException> { data.filePaths(8, 1024) }.hresult)
        }
    }

    @Test fun dataCloseReleasesTheRetainedDataObjectExactlyOnce() {
        val fake = FakeDataObject(initialRefs = 2)
        val data = Win32DropData(fake.address, FakeMemoryPort())
        data.close()
        data.close()
        assertEquals(1, fake.refs.get())
    }

    // ------------------------------------------------------------------
    // Win32DropComObject: the IDropTarget server
    // ------------------------------------------------------------------

    @Test fun dragEnterCopiesPointKeyStateAndAllowedEffectsAndWritesTheChosenEffect() {
        val fake = FakeDataObject()
        val handler = RecordingHandler()
        Win32DropComObject(handler, {}).use { target ->
            Arena.ofConfined().use { arena ->
                val point = arena.allocate(8, 4)
                point.set(ValueLayout.JAVA_INT, 0, -12)
                point.set(ValueLayout.JAVA_INT, 4, 48)
                val effect = arena.allocate(4, 4)
                effect.set(ValueLayout.JAVA_INT, 0, 7) // allowed effects from the source
                assertEquals(0, Win32TextComAbi.call(target.address, 3, "pipp", MemorySegment.ofAddress(fake.address), 8, point, effect))
                assertEquals(DROPEFFECT_COPY, effect.get(ValueLayout.JAVA_INT, 0))
            }
            assertEquals(1, handler.entered.size)
            val call = handler.entered.single()
            val data = assertIs<Win32DropData>(call[0])
            assertEquals(-12L, call[1]); assertEquals(48L, call[2]); assertEquals(8, call[3]); assertEquals(7, call[4])
            assertEquals(2, fake.refs.get()) // the retained data object reference
            data.close()
        }
        assertEquals(1, fake.refs.get())
    }

    @Test fun dropReusesTheDragEnterAdmissionWithoutANewDataObjectReference() {
        val fake = FakeDataObject()
        val handler = RecordingHandler()
        val enteredData = ArrayList<Win32DropData>()
        val wrapped = object : Win32DropTargetHandler by handler {
            override fun dragEnter(data: Win32DropData, x: Long, y: Long, keyState: Int, allowedEffects: Int): Int {
                enteredData += data
                return handler.dragEnter(data, x, y, keyState, allowedEffects)
            }
        }
        Win32DropComObject(wrapped, {}).use { target ->
            Arena.ofConfined().use { arena ->
                val point = arena.allocate(8, 4)
                val effect = arena.allocate(4, 4)
                effect.set(ValueLayout.JAVA_INT, 0, 7)
                Win32TextComAbi.call(target.address, 3, "pipp", MemorySegment.ofAddress(fake.address), 8, point, effect)
                val refsAfterEnter = fake.refs.get()
                Win32TextComAbi.call(target.address, 6, "pipp", MemorySegment.ofAddress(fake.address), 0, point, effect)
                assertEquals(DROPEFFECT_COPY, effect.get(ValueLayout.JAVA_INT, 0))
                assertEquals(refsAfterEnter, fake.refs.get())
            }
            assertEquals(1, handler.dropped.size)
        }
        enteredData.single().close()
        assertEquals(1, fake.refs.get())
    }

    @Test fun dragOverAndDragLeaveRouteToTheHandlerWithoutTouchingNativeData() {
        val handler = RecordingHandler()
        Win32DropComObject(handler, {}).use { target ->
            Arena.ofConfined().use { arena ->
                val point = arena.allocate(8, 4)
                point.set(ValueLayout.JAVA_INT, 0, 5)
                point.set(ValueLayout.JAVA_INT, 4, 6)
                val effect = arena.allocate(4, 4)
                effect.set(ValueLayout.JAVA_INT, 0, 7)
                assertEquals(0, Win32TextComAbi.call(target.address, 4, "ipp", 2, point, effect))
                assertEquals(DROPEFFECT_COPY, effect.get(ValueLayout.JAVA_INT, 0))
                assertEquals(0, Win32TextComAbi.call(target.address, 5, ""))
            }
            assertEquals(listOf(5, 6, 2, 7).size, handler.over.single().size)
            val call = handler.over.single()
            assertEquals(5L, call[0]); assertEquals(6L, call[1]); assertEquals(2, call[2]); assertEquals(7, call[3])
            assertEquals(1, handler.leaves)
            assertTrue(handler.entered.isEmpty() && handler.dropped.isEmpty())
        }
    }

    @Test fun queryInterfaceAnswersUnknownAndDropTargetOnly() {
        Win32DropComObject(RecordingHandler(), {}).use { target ->
            Arena.ofConfined().use { arena ->
                val iid = arena.allocate(16, 4)
                val output = arena.allocate(ValueLayout.ADDRESS)
                iid.copyFrom(Win32TextComAbi.guid(arena, Win32TextComAbi.UNKNOWN))
                assertEquals(0, Win32TextComAbi.call(target.address, 0, "pp", iid, output))
                assertEquals(target.address, output.get(ValueLayout.ADDRESS, 0).address())
                output.set(ValueLayout.ADDRESS, 0, MemorySegment.NULL)
                iid.copyFrom(Win32TextComAbi.guid(arena, IID_IDROP_TARGET))
                assertEquals(0, Win32TextComAbi.call(target.address, 0, "pp", iid, output))
                output.set(ValueLayout.ADDRESS, 0, MemorySegment.NULL)
                iid.copyFrom(Win32TextComAbi.guid(arena, IID_IDATA_OBJECT))
                assertEquals(0x80004002.toInt(), Win32TextComAbi.call(target.address, 0, "pp", iid, output))
                assertEquals(0L, output.get(ValueLayout.ADDRESS, 0).address())
            }
        }
    }

    @Test fun handlerFailureReportsAndAnswersFailureWithoutATruncatedEffect() {
        val failures = mutableListOf<Throwable>()
        val handler = object : Win32DropTargetHandler {
            override fun dragEnter(data: Win32DropData, x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = throw IllegalStateException("boom")
            override fun dragOver(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = DROPEFFECT_NONE
            override fun dragLeave() {}
            override fun drop(x: Long, y: Long, keyState: Int, allowedEffects: Int): Int = DROPEFFECT_NONE
        }
        val fake = FakeDataObject()
        Win32DropComObject(handler, onFailure = { failures += it }).use { target ->
            Arena.ofConfined().use { arena ->
                val point = arena.allocate(8, 4)
                val effect = arena.allocate(4, 4)
                effect.set(ValueLayout.JAVA_INT, 0, 7)
                assertEquals(E_FAIL, Win32TextComAbi.call(target.address, 3, "pipp", MemorySegment.ofAddress(fake.address), 8, point, effect))
                assertEquals(DROPEFFECT_NONE, effect.get(ValueLayout.JAVA_INT, 0))
            }
            assertEquals(1, failures.size)
            assertIs<IllegalStateException>(failures.single())
        }
        assertEquals(1, fake.refs.get()) // the failed enter never retained the data object
    }

    @Test fun revokedTargetAnswersDisconnectedWithNoEffect() {
        val handler = RecordingHandler()
        val target = Win32DropComObject(handler, {})
        target.revoke() // revoke without close: the interface memory must stay mapped for the late call
        Arena.ofConfined().use { arena ->
            val point = arena.allocate(8, 4)
            val effect = arena.allocate(4, 4)
            effect.set(ValueLayout.JAVA_INT, 0, 7)
            assertEquals(0x80010108.toInt(), Win32TextComAbi.call(target.address, 4, "ipp", 0, point, effect))
            assertEquals(DROPEFFECT_NONE, effect.get(ValueLayout.JAVA_INT, 0))
        }
        assertTrue(handler.over.isEmpty())
        target.close()
    }

    @Test fun closeIsIdempotentAndThreadConfined() {
        val target = Win32DropComObject(RecordingHandler(), {})
        target.close()
        target.close()
        val failure = arrayOfNulls<Throwable>(1)
        val worker = Thread { failure[0] = runCatching { target.close() }.exceptionOrNull() }
        worker.start(); worker.join(5_000)
        assertEquals(0x8001010e.toInt(), assertIs<Win32DropException>(failure[0]).hresult)
    }

    companion object {
        internal const val STGMEDIUM_U_OFFSET: Long = 8 // tagSTGMEDIUM anonymous union (hGlobal/pstm), objidl.h

        /** Upcall-delivered segments arrive zero-length: bound them before any access. */
        private fun bounded(segment: MemorySegment, bytes: Long): MemorySegment =
            if (segment.byteSize() >= bytes) segment else segment.reinterpret(bytes)

        private fun writeFormatEtc(segment: MemorySegment, cfFormat: Int, tymed: Int, aspect: Int = DVASPECT_CONTENT) {
            val target = bounded(segment, 32)
            target.set(ValueLayout.JAVA_SHORT, 0, cfFormat.toShort())
            target.set(ValueLayout.ADDRESS, 8, MemorySegment.NULL)
            target.set(ValueLayout.JAVA_INT, 16, aspect)
            target.set(ValueLayout.JAVA_INT, 20, -1) // lindex
            target.set(ValueLayout.JAVA_INT, 24, tymed)
        }

        internal const val E_FAIL: Int = -2147467259 // 0x80004005
        internal const val DVASPECT_CONTENT: Int = 1
        internal const val CF_TEXT: Int = 1
        internal const val CF_UNICODETEXT: Int = 13
        internal const val CF_HDROP: Int = 15
        internal const val TYMED_HGLOBAL: Int = 1
        internal const val TYMED_ISTREAM: Int = 4
        internal const val DROPEFFECT_NONE: Int = 0
        internal const val DROPEFFECT_COPY: Int = 1
        internal const val IID_IDATA_OBJECT = "0000010e-0000-0000-c000-000000000046"
        internal const val IID_IDROP_TARGET = "00000122-0000-0000-c000-000000000046"
        internal const val IID_IENUM_FORMAT_ETC = "00000103-0000-0000-c000-000000000046"
        internal const val DV_E_FORMATETC: Int = -2147221404 // 0x80040064
        internal const val DV_E_TYMED: Int = -2147221399 // 0x80040069
        internal const val E_OUTOFMEMORY: Int = -2147024882 // 0x8007000E
        internal const val E_NOTIMPL: Int = -2147467263 // 0x80004001
    }
}
