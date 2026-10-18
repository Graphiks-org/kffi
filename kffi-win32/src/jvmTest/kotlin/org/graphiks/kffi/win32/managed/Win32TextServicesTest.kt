package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.test.*

class Win32TextServicesTest {
    @Test fun acceptedCaretDoesNotFollowProvisionalNativeSelection() {
        document().use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                Arena.ofConfined().use { arena ->
                    val selection=arena.allocate(16, 4).fill(0)
                    selection.set(ValueLayout.JAVA_INT, 0, 1)
                    selection.set(ValueLayout.JAVA_INT, 4, 1)
                    val rect=arena.allocate(16, 4); val clipped=arena.allocate(4, 4)
                    owner.updateCursor(0, Win32WindowRect(10, 20, 2, 24))
                    document.requestLock(6) {
                        assertEquals(0, Win32TextComAbi.call(owner.address, 9, "ip", 1, selection))
                        assertEquals(0x80040206.toInt(), Win32TextComAbi.call(owner.address, 26, "iiipp", 1, 1, 1, rect, clipped))
                        0
                    }
                }
            }
        }
    }

    @Test fun sameLengthCompositionInvalidatesAcceptedCaretLayout() {
        document().use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                Arena.ofConfined().use { arena ->
                    val rect=arena.allocate(16, 4); val clipped=arena.allocate(4, 4)
                    owner.updateCursor(0, Win32WindowRect(10, 20, 2, 24))
                    document.requestLock(6) {
                        document.setComposition(Win32TextRange(0, 1), Win32TextRange(0, 0))
                        document.setText(0, 1, "x")
                        document.setSelection(0, 0)
                        assertEquals(0x80040206.toInt(), Win32TextComAbi.call(owner.address, 26, "iiipp", 1, 0, 0, rect, clipped))
                        0
                    }
                }
            }
        }
    }
    @Test fun aVirtualThreadCannotOwnAnOsThreadApartment() {
        val port = ApartmentPort(0)
        var caught: Throwable? = null
        val worker = Thread.ofVirtual().start {
            try { Win32ComApartment.open(port).close() }
            catch (failure: Throwable) { caught = failure }
        }
        worker.join(5_000)
        assertFalse(worker.isAlive)
        assertEquals(0x8001010e.toInt(), assertIs<Win32TextException>(caught).hresult)
        assertEquals(0, port.initialized)
    }

    @Test fun nativeVtableCopiesUtf16OnlyUnderTheDocumentLock() {
        document("a😀b").use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                Arena.ofConfined().use { arena ->
                    val text = arena.allocate(16, 2)
                    val plain = arena.allocate(4, 4)
                    val runs = arena.allocate(4, 4)
                    val next = arena.allocate(4, 4)
                    fun read() = Win32TextComAbi.call(owner.address, 10, "iipippipp", 0, -1, text, 8, plain,
                        MemorySegment.NULL, 0, runs, next)
                    assertEquals(0x80040201.toInt(), read())
                    document.requestLock(2) {
                        assertEquals(0, read())
                        assertEquals(4, plain.get(ValueLayout.JAVA_INT, 0))
                        assertEquals("a😀b", CharArray(4) { text.get(ValueLayout.JAVA_CHAR, it * 2L) }.concatToString())
                        assertEquals(4, next.get(ValueLayout.JAVA_INT, 0))
                        0
                    }
                }
            }
        }
    }

    @Test fun nativeVtableWritesOneBaseDocumentEdit() {
        val changes = mutableListOf<Win32TextChange>()
        Win32TextDocument(Win32TextSnapshot("ab", Win32TextRange(1, 1), 2), limits()) { changes += it; true }.use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                Arena.ofConfined().use { arena ->
                    val text = arena.allocate(4, 2)
                    text.set(ValueLayout.JAVA_CHAR, 0, '\uD83D')
                    text.set(ValueLayout.JAVA_CHAR, 2, '\uDE00')
                    val change = arena.allocate(12, 4)
                    document.requestLock(6) {
                        assertEquals(0, Win32TextComAbi.call(owner.address, 11, "iiipip", 0, 1, 2, text, 2, change))
                        assertEquals(listOf(1, 2, 3), (0..2).map { change.get(ValueLayout.JAVA_INT, it * 4L) })
                        0
                    }
                    assertEquals(Win32TextChange.Replace(Win32TextRange(1, 2), "😀", 2), changes.single())
                }
            }
        }
    }

    @Test fun cursorLayoutRefusesUnknownTextGeometry() {
        document().use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                Arena.ofConfined().use { arena ->
                    val rect = arena.allocate(16, 4)
                    val clipped = arena.allocate(4, 4)
                    document.requestLock(2) {
                        assertEquals(0x80040206.toInt(), Win32TextComAbi.call(owner.address, 26, "iiipp", 1, 0, 1, rect, clipped))
                        owner.updateCursor(0, Win32WindowRect(-30, 40, 2, 20))
                        assertEquals(0, Win32TextComAbi.call(owner.address, 26, "iiipp", 1, 0, 0, rect, clipped))
                        assertEquals(listOf(-30, 40, -28, 60), (0..3).map { rect.get(ValueLayout.JAVA_INT, it * 4L) })
                        assertEquals(0x80040206.toInt(), Win32TextComAbi.call(owner.address, 26, "iiipp", 1, 0, 1, rect, clipped))
                        0
                    }
                }
            }
        }
    }

    @Test fun staAdmissionBalancesBothSuccessResults() {
        for (result in listOf(0, 1)) {
            val port = ApartmentPort(result)
            val apartment = Win32ComApartment.open(port)
            apartment.close()
            apartment.close()
            assertEquals(1, port.initialized)
            assertEquals(1, port.uninitialized)
        }
        val incompatible = ApartmentPort(0x80010106.toInt())
        assertEquals(0x80010106.toInt(), assertFailsWith<Win32TextException> { Win32ComApartment.open(incompatible) }.hresult)
        assertEquals(0, incompatible.uninitialized)
    }

    @Test fun unsupportedQueryInterfaceClearsTheOutput() {
        document().use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                Arena.ofConfined().use { arena ->
                    val unknownGuid = arena.allocate(16, 4).fill(0)
                    val output = arena.allocate(ValueLayout.ADDRESS)
                    output.set(ValueLayout.ADDRESS, 0, MemorySegment.ofAddress(123))
                    assertEquals(0x80004002.toInt(), owner.dispatch(0, arrayOf(unknownGuid, output)))
                    assertEquals(0L, output.get(ValueLayout.ADDRESS, 0).address())
                }
            }
        }
    }

    @Test fun everyCallbackInitializesFailureOutputs() {
        document().use { document ->
            Win32TextComObject(document, 7, config(), limits(), {}).use { owner ->
                owner.revoke()
                Arena.ofConfined().use { arena ->
                    val fetched = arena.allocate(4, 4).fill(0x7f)
                    val selection = arena.allocate(16, 4).fill(0x7f)
                    val result = owner.dispatch(8, arrayOf(0, 1, selection, fetched))
                    assertTrue(result < 0)
                    assertEquals(0, fetched.get(ValueLayout.JAVA_INT, 0))
                    val wnd = arena.allocate(ValueLayout.ADDRESS)
                    wnd.set(ValueLayout.ADDRESS, 0, MemorySegment.ofAddress(123))
                    assertTrue(owner.dispatch(28, arrayOf(1, wnd)) < 0)
                    assertEquals(0L, wnd.get(ValueLayout.ADDRESS, 0).address())
                    val text = arena.allocate(8, 2).fill(0x7f)
                    val plainCount = arena.allocate(4, 4).fill(0x7f)
                    val runCount = arena.allocate(4, 4).fill(0x7f)
                    val next = arena.allocate(4, 4).fill(0x7f)
                    assertTrue(owner.dispatch(10, arrayOf(0, -1, text, 4, plainCount, MemorySegment.NULL, 0, runCount, next)) < 0)
                    assertEquals(0, plainCount.get(ValueLayout.JAVA_INT, 0))
                    assertEquals(0, runCount.get(ValueLayout.JAVA_INT, 0))
                    assertEquals(0, next.get(ValueLayout.JAVA_INT, 0))
                }
            }
        }
    }

    @Test fun partialContextCreationReleasesInReverseOrder() {
        val released = mutableListOf<Long>()
        assertFailsWith<IllegalStateException> {
            Win32ComResources().use { resources ->
                resources.own(1) { released += it }
                resources.own(2) { released += it }
                error("context creation failed")
            }
        }
        assertEquals(listOf(2L, 1L), released)
    }

    @Test fun revocationWaitsForAnInFlightCallback() {
        val gate = Win32ComCallbackGate()
        val entered = CountDownLatch(1)
        val release = CountDownLatch(1)
        val cleaned = CountDownLatch(1)
        val worker = Thread {
            gate.call(-1) { entered.countDown(); check(release.await(5, TimeUnit.SECONDS)); 5 }
        }
        worker.start()
        assertTrue(entered.await(5, TimeUnit.SECONDS))
        gate.revoke { cleaned.countDown() }
        assertEquals(-1, gate.call(-1) { fail("callback admitted after revoke") })
        assertEquals(1L, cleaned.count)
        release.countDown()
        worker.join(5_000)
        assertFalse(worker.isAlive)
        assertEquals(0L, cleaned.count)
    }

    private class ApartmentPort(private val result: Int) : Win32ComApartmentPort {
        var initialized = 0
        var uninitialized = 0
        override fun initializeSta(): Int { initialized++; return result }
        override fun uninitialize() { uninitialized++ }
    }

    companion object {
        private fun config() = Win32TextConfiguration(Win32TextPurpose.Text, Win32TextAction.Default,
            Win32TextCapitalization.None, true, false)
        private fun limits() = Win32TextLimits(1024, 16, 64, Win32PayloadBudget { AutoCloseable {} })
        private fun document(text: String = "ab") = Win32TextDocument(Win32TextSnapshot(text, Win32TextRange(0, 0), 0), limits()) { true }
    }
}
